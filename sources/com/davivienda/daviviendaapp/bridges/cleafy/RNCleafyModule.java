package com.davivienda.daviviendaapp.bridges.cleafy;

import android.app.Application;
import android.content.Context;
import com.cleafy.mobile.detection.agent.AgentDiagnostics;
import com.cleafy.mobile.detection.agent.AgentDiagnosticsListener;
import com.cleafy.mobile.detection.agent.AgentDiagnosticsProvider;
import com.cleafy.mobile.detection.agent.Cleafy;
import com.cleafy.mobile.detection.agent.ProbeTrace;
import com.cleafy.mobile.detection.agent.configuration.CleafyConfiguration;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.reactlibrary.react.http.HttpMethod;
import com.reactlibrary.react.http.ReactHttpClient;
import com.reactlibrary.react.utils.CleafyConfigurationParser;
import com.reactlibrary.react.utils.StringUtilityKt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjG0L͜P.`_2şs{J$c$wCCU(\u0004*ޛWN}gvJ`\u000bK\u000f\u001c\u0016\u0001j2bkތ\u000e\u0012=1\u0003zO7[oU9\u000fuȥ\t @$\u00010\u0013\u00062*v\u0016'\u0001QR$\u0014F?\u001fB\u0003\u0013[\u000e2\u0014\u001c=N\u000bNbuYNJ\u0003\\h9S\u0007wNf'\u000e=-S\u001bTl)#u\u0010-qE\u007fq#5k\u00035X\fC\u0011F\n=3pW+9Z\fWdj0\u001a#4g\u000fsqTf5Wn\u0017?-ebyZ>,\u0006\u0007\u0014\rj\u0011>\f5VF/0e6\u001dyt;\nNc\u001a^p\u0006+gD\u001e=\u0002I*g#\u0017WoD1PMz3\u0017N)\u000fy9]j\r\u000f\u001fKX\u0006]IQnJxT\u0018gUo\u001ao\u0011\u0011p\txW\u000eC\u0014\u0011\\\u001dU=iG;#\u0002\u0001vS.{Mpvh\u0002RvFRt$EB\u000b\"YrsKp\u0019dfB)MJZ7\u0004\u0016!8^\u000e;O4VS\u0018nw\u0002e]8-uz\u007fi|\u0004&Wgdc;_q(chuBN\u0003gMht[k\f\tbX(@V\u0003\u0012\u000ezr]R\u0018zu\u007f6L,_\u001f\r\u001bV\n6DW{7g\u000bn\u001e\bl5:\u0002\u0018.%\u000f\u000f[tr\u0006f'S\\\u0001n.EA\u007fBI,c0\u00016\u0013\"5\u000e:\u0005\u0010\u0002ZbdlD{\u0006\u0002.22;g.k\u001d?\u00057@\u001a/[K!t\u0018RZ7\t\u001a\u0012\u000fin^m\u0016x\t.vix^\u001b\u001cj-l\u0011;\b\u0013\u0006*gT\u0002_ej\n\nFyx\u0011bTPN{3)N+\u000fz:~K,q1M\u001a\u0006 G\u0015\u0010j\u001au<\bz\u0011<s\u0014\u0013rh^,ppu2i>y]\rE:$\u001b\u000brLx\t B7<=9VJ|rl7{\u0015_\u0004t\u0012D\u000f\u0007U\nDCs\f@F_X\u0001s\u0004\"l[''L\u0002v4r\u0014\u0013\u0019j'\n9\u0002at #U\"lV\u0011\u0011`\f\u0002!NCQa3F9*B7T\n!B\u0003s6\u0014\t\f^_=$bH\u0002In\u0010jw\u000be\u000f\n){nBB\u0001-\u0015c$\u0007<I\u0007\u0004E\u00037\u00148\u000f\\5\u000b1i}\t\u0017+9Ol;1'\u0007\u000b;IkOa\u0002d\u0011w/{y\b\u000eN\u0017+,\t\u001dcI_3wv^d;[r\\|x(e\u0001]h.G\u0015\u000b1T\n=\u0011IU\u0001\u0014z/bM&?s \u000f%\\+\u001d\u000b+r\r u CRUI\u0019\u001aW\u0002eyS\u007f\u001e\u001fN/4z/jo\u0010|\t\f*\u0001\u001b:0p)!\u0013~&44X\u001d\u000b\fD\u0007dW29\u0010!v[\u0002vOOm05 Pt\u0001x8i\u001di|\u007f#\u0005|0\u0005\u0002\u001f3^+!)c-Ag!?Yc.\u0004)\u007fB\u001bV%D\u0016z+&N\u0012w7p\u0018e\u001bWGkXgY0\u0001-D\u001fJ\u0002\u0012-l(C?-ש@Ŝ\r\\t܀ŉ\u0012\f"}, d2 = {"\u001ab^:\"+:d\u001d\u0010~^5{\u0005xd{9\u007fQ\u0005\u0017 Fk\nG\u0002n2f\u0002\u001f9m$wKJ;g52^UJ\u0017\u000ec(O\u000b\u000fQK^3\\(", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3h[*@|\u0016A\\ 7y4\u0003\u0011y]!\u0011b<Uv|", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n}$\u001bFq\u000e\u0006c%1W\r{Bx\u001d2K?Jo>'rrjH\u0007v;$:\u0018", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "2d[2g,", "", "Cq[", "", ">`a.`:", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "6dP1X9L", "Bh\\2b<M", "", ">q^:\\:>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW'\u0004/=]\f \r", "2nA2d<>a(", ";dc5b+", "\u001ab^:\"9>O\u0017\u000e\u0002b)\n\u0005<yI5{<~&`J~\u001dG@\bDh\t\b7|\u00198L\u0019", "5dc", "5dc\u000ec7EW\u0017z\nb6\u0006k9s\u000f1wH\u0001", "5dc\u000fe6Pa\u0019\f^]", "5dc\u0011\\(@\\#\r\nb*\u000b", "5dc\u001bT4>", "5dc\u001dT9>\\(by", "5dc X:LW#\b^]", "6dP1", "7mXAJ0MVv\t\u0004_0~\u0019<a\u000f,\u0006I", ";`_\u0010b5?W\u001b\u000f\bZ;\u0001\u00138", "7me._0=O(~h^:\u000b\r9n", ">`c0[", ">da3b9F@\u0019\u000b\u000b^:\f", ">nbA", ">tc", "@dV6f;>`w\u0003v`5\u0007\u0017>i}6bD\u000f&\u0017Po\u001b", "Adc\u000ec7\u001dS*\u0003x^\u0010{", "/o_\u0011X=BQ\u0019by", "Adc\u000ec7,S'\r~h5`\b", "/o_ X:LW#\b^]", "Adc\u0019b*:b\u001d\t\u0004", ":nR.g0H\\", "Adc\"f,K7\u0018", "CrT?<+", "CoS.g,\u001a\\\u0015\u0006\u000fl0\u000b", "@dY2V;0W(\u0002^g=x\u00103do5\u0003", "/o_,e,ES\u0015\rz"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RNCleafyModule extends ReactContextBaseJavaModule {
    private final Application application;

    /* JADX INFO: renamed from: com.davivienda.daviviendaapp.bridges.cleafy.RNCleafyModule$doRequest$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ReadableMap $headers;
        final /* synthetic */ HttpMethod $method;
        final /* synthetic */ ReadableMap $params;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ int $timeout;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, HttpMethod httpMethod, ReadableMap readableMap, ReadableMap readableMap2, int i2, Promise promise, Continuation<? super AnonymousClass1> continuation) {
            super(Od.Xd() ^ (558282343 ^ 1723540016), continuation);
            this.$url = str;
            this.$method = httpMethod;
            this.$params = readableMap;
            this.$headers = readableMap2;
            this.$timeout = i2;
            this.$promise = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$url, this.$method, this.$params, this.$headers, this.$timeout, this.$promise, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            Class<?> cls = Class.forName(C1561oA.ud("Zeb\"WSgYeWRZOK\u0017LH\\NZLGOD@?ML\t<KA;=:G\u00015=504Fy\u001d\u0018\f4,'+=\u00101%5+#` *\f\u001e),\u001b((Vb", (short) (OY.Xd() ^ ((560339717 ^ 1579709963) ^ 2135825522))));
            Class<?>[] clsArr = new Class[617075807 ^ 617075805];
            clsArr[0] = Class.forName(C1561oA.yd(";>B959Bv+68497+/%2k\u007f+-)., $\u001a\u0007\u0016!!\u0015", (short) (FB.Xd() ^ (ZN.Xd() ^ 864712252))));
            clsArr[1] = Class.forName(C1561oA.Yd("~\u0004\n\u0003\u0001\u0007G}\u000b\u000f\r\u0014\u0014\n\u0010\b\u0017Rh\u0016\u0016\u001d\u0013\u0019!\u000e\"\u0018\u001f\u001f", (short) (FB.Xd() ^ (C1499aX.Xd() ^ (1555189110 ^ (-522809170))))));
            Object[] objArr = new Object[C1607wl.Xd() ^ (1890382682 ^ 518578306)];
            objArr[0] = coroutineScope;
            objArr[1] = continuation;
            Method method = cls.getMethod(Xg.qd("\u0003\t\u0012\f\t\u0004", (short) (ZN.Xd() ^ (Od.Xd() ^ 1207824832)), (short) (ZN.Xd() ^ (1891895099 ^ 1891921821))), clsArr);
            try {
                method.setAccessible(true);
                return method.invoke(this, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            Class<?> cls = Class.forName(Jg.Wd("\bv_#\u0005b#91)P<\u001d=\u0013,t\rl|\u001bYm\u0005loJOwOj$HN7HPh|\u0019}e$[j\f,8\\YI?>CEy{w_#\u0019~\u001d\u000e=0IK&\u0016", (short) (OY.Xd() ^ (Od.Xd() ^ (1674822871 ^ 606998649))), (short) (OY.Xd() ^ (C1633zX.Xd() ^ (-1951490743)))));
            Class<?>[] clsArr = new Class[FB.Xd() ^ (1292260019 ^ 317275522)];
            clsArr[0] = Class.forName(ZO.xd("_zY\u001d\\^to;{BC#^lc", (short) (C1580rY.Xd() ^ ((1716923980 ^ 1706574987) ^ (-65948759))), (short) (C1580rY.Xd() ^ ((1536346223 ^ 889400120) ^ (-1855035843)))));
            clsArr[1] = Class.forName(C1626yg.Ud("\fl\u00031H\r\"\"pk\u000e\u0006\u001b\u0013\u0017\"\u000f\t:Ds\u0017-\u001a$Z]\u000e9g", (short) (FB.Xd() ^ (OY.Xd() ^ (1019313449 ^ 954884622))), (short) (FB.Xd() ^ (ZN.Xd() ^ (1009081717 ^ 263153451)))));
            Object[] objArr = new Object[1373244800 ^ 1373244802];
            objArr[0] = coroutineScope;
            objArr[1] = continuation;
            Method method = cls.getMethod(Ig.wd("7\u0010R0a\u0006", (short) (OY.Xd() ^ ((891018701 ^ 21719063) ^ 877709905))), clsArr);
            try {
                method.setAccessible(true);
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) ((Continuation) method.invoke(this, objArr));
                Object[] objArr2 = {Unit.INSTANCE};
                Method method2 = Class.forName(EO.Od("K((\fBdaD\u0005'yl1 l\nKV\u0012Z\u0010dWQ\u0011\u0001r+V]U3}gg,QfhsoM\u0007)@4|V}\u001erJ\u000exDe^u~5da!?{G\fA\u0017(", (short) (OY.Xd() ^ ((661685313 ^ 1190973562) ^ 1636582536)))).getMethod(C1593ug.zd("\u0005\u000b\u0014\u000e\u000b\u0006t\u0018\u0017\u0015\u000b\u0015\f", (short) (C1607wl.Xd() ^ ((2057646780 ^ 1044563496) ^ 1156029882)), (short) (C1607wl.Xd() ^ (1420949494 ^ 1420933336))), Class.forName(C1561oA.Qd("xn\u0003l8uium3Selfcs", (short) (C1607wl.Xd() ^ (1245197999 ^ 1245197012)))));
                try {
                    method2.setAccessible(true);
                    return method2.invoke(anonymousClass1, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (new ReactHttpClient(this.$url, this.$method, this.$params, this.$headers, this.$timeout, this.$promise).execute(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException(C1561oA.od("\u001f\u001c&%W+%TZ%\u0017$%\u001c\u0013SK\r\u000f\u000f\u0017\u0019\u000bDJ\f\u0010\u0017\u000f\n\u0003C;\u0012\u0003\r\u007f6x\u0004\u0006\u0002\u0007\u0005x|r", (short) (FB.Xd() ^ (398016773 ^ 398031045))));
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.davivienda.daviviendaapp.bridges.cleafy.RNCleafyModule$getDiagnostics$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C11031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Promise $promise;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11031(Promise promise, Continuation<? super C11031> continuation) {
            super((338630144 ^ 450222624) ^ 251317282, continuation);
            this.$promise = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C11031(this.$promise, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            Class<?> cls = Class.forName(C1561oA.Kd("\u001f,+l$\"8,:.+5,*w/-C7E96@756FG\u0006;LD@DCR\u000eDNHEK_\u0015:7-WQNTh=`Vh`Z\u001a^]m>d]dlnsukfw)7", (short) (C1607wl.Xd() ^ (568337297 ^ 568338405))));
            Class<?>[] clsArr = new Class[376573093 ^ 376573095];
            clsArr[0] = Class.forName(Wg.Zd("l[O+\u0017\u0006~\u0017;1#\u0004x\\D1\u0013\u000741G0 \u000ewRE(\u0005vq^A", (short) (ZN.Xd() ^ (FB.Xd() ^ (2117978849 ^ 567458334))), (short) (ZN.Xd() ^ (C1607wl.Xd() ^ (707432185 ^ 1148103769)))));
            clsArr[1] = Class.forName(C1561oA.Xd("hmsljp1gtxv}}syq\u0001<R\u007f\u007f\u0007|\u0003\u000bw\f\u0002\t\t", (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (1489716983 ^ (-458235042))))));
            Object[] objArr = new Object[(1420480814 ^ 376032562) ^ 1120082974];
            objArr[0] = coroutineScope;
            objArr[1] = continuation;
            Method method = cls.getMethod(Wg.vd("\u0019\u001d( \u001f\u0018", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ 831093299))), clsArr);
            try {
                method.setAccessible(true);
                return method.invoke(this, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            Class<?> cls = Class.forName(Qg.kd("4?<{1-A3?1,4)%p&\"6(4&!)\u001e\u001a\u0019'&b\u0016%\u001b\u0015\u0017\u0014!Z\u000f\u0017\u000f\n\u000e Svqe\u000e\u0006\u0001\u0005\u0017i\u000b~\u000f\u0005|:|y\bVzqv||\u007f\u007fsl{+7", (short) (FB.Xd() ^ (FB.Xd() ^ 1609528726)), (short) (FB.Xd() ^ (C1499aX.Xd() ^ (-1134242987)))));
            Class<?>[] clsArr = new Class[386161356 ^ 386161358];
            short sXd = (short) (Od.Xd() ^ (C1633zX.Xd() ^ (823842262 ^ 1162579754)));
            short sXd2 = (short) (Od.Xd() ^ (515943910 ^ (-515937388)));
            int[] iArr = new int["\u0010\u0006\u001a\u0004O\r\u0001\r\u0005Jj|\u0004}z\u000b".length()];
            QB qb = new QB("\u0010\u0006\u001a\u0004O\r\u0001\r\u0005Jj|\u0004}z\u000b");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            clsArr[1] = Class.forName(C1561oA.ud("hkofbf%YdfbgeY]S`\u001a.YW\\PTZEWKPN", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (-1609515683)))));
            Object[] objArr = new Object[C1580rY.Xd() ^ (-831067165)];
            objArr[0] = coroutineScope;
            objArr[1] = continuation;
            short sXd3 = (short) (Od.Xd() ^ ((612125459 ^ 518937288) ^ (-982657109)));
            int[] iArr2 = new int[".<2-;+".length()];
            QB qb2 = new QB(".<2-;+");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 ^ i3));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                C11031 c11031 = (C11031) ((Continuation) method.invoke(this, objArr));
                Object[] objArr2 = {Unit.INSTANCE};
                Method method2 = Class.forName(C1561oA.Yd("\u0002\u000f\u000eO\u0007\u0005\u001b\u000f\u001d\u0011\u000e\u0018\u000f\rZ\u0012\u0010&\u001a(\u001c\u0019#\u001a\u0018\u0019)*h\u001e/'#'&5p'1+(.Bw\u001d\u001a\u0010:417K C9KC=|A@P!G@GOQVXNIZ\f\u001a", (short) (C1633zX.Xd() ^ ((228241075 ^ 22145316) ^ (-214651399))))).getMethod(Jg.Wd("\u001d&.{gXb|gL@]C", (short) (C1633zX.Xd() ^ ((1945276997 ^ 899046734) ^ (-1181023800))), (short) (C1633zX.Xd() ^ (1263225030 ^ (-1263231486)))), Class.forName(Xg.qd("\u000f\u0007\u001d\tV\u0016\f\u001a\u0014[}\u0012\u001b\u0017\u0016(", (short) (C1499aX.Xd() ^ (1381086452 ^ (-1381087855))), (short) (C1499aX.Xd() ^ ((517755777 ^ 185473898) ^ (-366084517))))));
                try {
                    method2.setAccessible(true);
                    return method2.invoke(c11031, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException(Qg.kd("XU_^\u0011d^\u000e\u0014^P]^UL\r\u0005FHHPRD}\u0004EIPHC<|tK<F9o2=?;@>26,", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (911772549 ^ (-1773650789)))), (short) (C1580rY.Xd() ^ ((752367407 ^ 1613112059) ^ (-1291726864)))));
            }
            ResultKt.throwOnFailure(obj);
            try {
                AgentDiagnostics diagnostics = Cleafy.getDiagnostics();
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString(ZO.xd("\u001aUB&v0.j", (short) (ZN.Xd() ^ (1976150145 ^ 1976159246)), (short) (ZN.Xd() ^ (302929111 ^ 302918619))), diagnostics.getDeviceId());
                WritableNativeArray writableNativeArray = new WritableNativeArray();
                for (ProbeTrace probeTrace : diagnostics.getProbeTraces()) {
                    WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                    writableNativeMap2.putString(C1626yg.Ud("\f\u001c@\u0005?sy", (short) (ZN.Xd() ^ ((1889743106 ^ 1395023499) ^ 595928581)), (short) (ZN.Xd() ^ ((128580173 ^ 1021318868) ^ 994681637))), probeTrace.getEventId());
                    writableNativeMap2.putString(Ig.wd("\fCr\u0001\r?L\u0003I", (short) (OY.Xd() ^ ((1529273653 ^ 2091948759) ^ 664153050))), probeTrace.getProbeType());
                    writableNativeMap2.putString(EO.Od("HpnM\\\u00170=~", (short) (C1499aX.Xd() ^ ((332775466 ^ 1817422143) ^ (-2139494817)))), probeTrace.getSessionId());
                    writableNativeMap2.putInt(C1561oA.Qd("//\u001b--*x$\u0018\u0018", (short) (C1499aX.Xd() ^ ((1920651374 ^ 1823457141) ^ (-517298709)))), probeTrace.getStatusCode());
                    short sXd = (short) (C1633zX.Xd() ^ ((1794701159 ^ 1870986864) ^ (-92038744)));
                    short sXd2 = (short) (C1633zX.Xd() ^ ((512095162 ^ 184015881) ^ (-343029109)));
                    int[] iArr = new int["rhmfuwerv".length()];
                    QB qb = new QB("rhmfuwerv");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
                        i2++;
                    }
                    writableNativeMap2.putString(new String(iArr, 0, i2), String.valueOf(probeTrace.getTimestamp()));
                    writableNativeArray.pushMap(writableNativeMap2);
                }
                short sXd3 = (short) (OY.Xd() ^ (251665446 ^ 251677295));
                int[] iArr2 = new int["12. \"\u0010-\u001b\u001c\u001d*".length()];
                QB qb2 = new QB("12. \"\u0010-\u001b\u001c\u001d*");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                writableNativeMap.putArray(new String(iArr2, 0, i3), writableNativeArray);
                WritableNativeArray writableNativeArray2 = new WritableNativeArray();
                Iterator it = diagnostics.getErrors().iterator();
                while (it.hasNext()) {
                    writableNativeArray2.pushString((String) it.next());
                }
                writableNativeMap.putArray(C1561oA.Kd("\u0010\u001e\u001f\u001d!#", (short) (C1633zX.Xd() ^ ((1998530999 ^ 1894858182) ^ (-133053370)))), writableNativeArray2);
                writableNativeMap.putInt(Wg.Zd(" \u001cK\u000eA\u0012S\ti\u001fD)W\rQ\u0002u!u4o2i2\u0003F", (short) (OY.Xd() ^ ((1904842416 ^ 583126313) ^ 1397243527)), (short) (OY.Xd() ^ ((27181135 ^ 1542006517) ^ 1517806000))), diagnostics.getSuccessfulProbeSubmissions());
                writableNativeMap.putInt(C1561oA.Xd("kgptnn[~|ptc\u0007t\u0001}\t\n\u0001\b\b\u000e", (short) (C1607wl.Xd() ^ (529609824 ^ 529598462))), diagnostics.getFailedProbeSubmissions());
                writableNativeMap.putString(Wg.vd("g]lnBokd\\[fdXl^eYAYNPdRBLQFU[IRV", (short) (OY.Xd() ^ (747517649 ^ 747512316))), String.valueOf(diagnostics.getLastConfigurationUpdateTimestamp()));
                Promise promise = this.$promise;
                if (promise != null) {
                    promise.resolve(writableNativeMap);
                }
            } catch (Exception e2) {
                Promise promise2 = this.$promise;
                if (promise2 != null) {
                    promise2.reject(e2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.davivienda.daviviendaapp.bridges.cleafy.RNCleafyModule$initWithConfiguration$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C11041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CleafyConfiguration $config;
        final /* synthetic */ Promise $promise;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11041(CleafyConfiguration cleafyConfiguration, Promise promise, Continuation<? super C11041> continuation) {
            super(1830805643 ^ 1830805641, continuation);
            this.$config = cleafyConfiguration;
            this.$promise = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RNCleafyModule.this.new C11041(this.$config, this.$promise, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            Class<?> cls = Class.forName(hg.Vd("R]Z\u001aOK_Q]OJRGC\u000fD@TFRD?G<87ED\u00014C9352?x-5-(,>q\u0015\u0010\u0004,$\u001f#5\b)\u001d-#\u001bX\u001d!\u001b%\u0007\u0018\"\u0015n\u001a\u0018\u000f\u0011\u000e\u001b\u0017\u0005\u0017\u000b\u0010\u000eBN", (short) (Od.Xd() ^ (C1633zX.Xd() ^ (327043367 ^ 1731152481))), (short) (Od.Xd() ^ (FB.Xd() ^ (-1609513275)))));
            Class<?>[] clsArr = new Class[ZN.Xd() ^ 864698098];
            clsArr[0] = Class.forName(C1561oA.ud("ORVMIMV\u000b?JLHMK?C9F\u007f\u0014?A=B@48.\u001b*55)", (short) (FB.Xd() ^ (1491422848 ^ 1491413304))));
            clsArr[1] = Class.forName(C1561oA.yd("\u000f\u0012\u0016\r\t\rK\u007f\u000b\r\t\u000e\f\u007f\u0004y\u0007@T\u007f}\u0003vz\u0001k}qvt", (short) (Od.Xd() ^ (1262102410 ^ (-1262095808)))));
            Object[] objArr = new Object[1940156379 ^ 1940156377];
            objArr[0] = coroutineScope;
            objArr[1] = continuation;
            Method method = cls.getMethod(C1561oA.Yd("U[d^[V", (short) (ZN.Xd() ^ (1788670813 ^ 1788664838))), clsArr);
            try {
                method.setAccessible(true);
                return method.invoke(this, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            Class<?> cls = Class.forName(Xg.qd("\r\u001a\u0019Z\u0012\u0010&\u001a(\u001c\u0019#\u001a\u0018e\u001d\u001b1%3'$.%#$45s):2.21@{2<639M\u0003(%\u001bE?<BV+NDVNH\bNTP\\@S_T0]]VZYhfVj`gg\u001e,", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (1709381825 ^ (-973881012)))), (short) (C1633zX.Xd() ^ (189664053 ^ (-189689962)))));
            Class<?>[] clsArr = new Class[606992918 ^ 606992916];
            clsArr[0] = Class.forName(Jg.Wd("$0/g\u001efA\u0018z\u001fJG\u0015y\u0002\u0001", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (278218918 ^ (-1690587831)))), (short) (FB.Xd() ^ (Od.Xd() ^ 1207805121))));
            clsArr[1] = Class.forName(ZO.xd("X~>JfJ\bjcE|3_^sU}w^?3 \rV;Oh\u0018NF", (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (-831067395))), (short) (ZN.Xd() ^ (FB.Xd() ^ 1609504553))));
            Object[] objArr = new Object[C1633zX.Xd() ^ (-1951491127)];
            objArr[0] = coroutineScope;
            objArr[1] = continuation;
            Method method = cls.getMethod(C1626yg.Ud("\u00045\u0018w\u0016f", (short) (C1607wl.Xd() ^ (1192144837 ^ 1192137986)), (short) (C1607wl.Xd() ^ (874486698 ^ 874504799))), clsArr);
            try {
                method.setAccessible(true);
                C11041 c11041 = (C11041) ((Continuation) method.invoke(this, objArr));
                Object[] objArr2 = {Unit.INSTANCE};
                Method method2 = Class.forName(Ig.wd("L+\u0005\u001f3k\u001f?yZ>#js\"0\t\u0006NEu3\u0018\bb0\\\u0007r5ap\u001c5\u0012j9\u0013~\u0006\u00063~!4\u001cZ4_s\tv\u001e\u0019Vsh\bZ*+\rJ7q\u0005ADNI:\ti&\u0005fM'\u0015n*m", (short) (C1633zX.Xd() ^ ((250402336 ^ 182537983) ^ (-68025742))))).getMethod(C1561oA.Qd("15<4/(\u001563/#+ ", (short) (OY.Xd() ^ ((438897015 ^ 1658407364) ^ 2029017158))), Class.forName(EO.Od("\"iN\u00142\u001d8oG\u001c9pC>F{", (short) (C1607wl.Xd() ^ (1970352379 ^ 1970362381)))));
                try {
                    method2.setAccessible(true);
                    return method2.invoke(c11041, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException(C1561oA.od("{x\u0003\u00024\b\u000217\u0002s\u0001\u0002xo0(ikksug!'hlskf_ \u0018n_i\\\u0013U`b^caUYO", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ 1849961293))));
            }
            ResultKt.throwOnFailure(obj);
            try {
                Cleafy.initWithConfiguration(RNCleafyModule.this.application, this.$config);
                Promise promise = this.$promise;
                if (promise != null) {
                    promise.resolve(C1593ug.zd("3ZYcj\u0017agcoe^jhzff$", (short) (ZN.Xd() ^ ((316327301 ^ 245697815) ^ 478123787)), (short) (ZN.Xd() ^ ((605157788 ^ 254613133) ^ 725411508))));
                }
            } catch (Exception e2) {
                Promise promise2 = this.$promise;
                if (promise2 != null) {
                    promise2.reject(e2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.davivienda.daviviendaapp.bridges.cleafy.RNCleafyModule$updateAnalysis$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C11051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Promise $promise;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11051(Promise promise, Continuation<? super C11051> continuation) {
            super(C1607wl.Xd() ^ 1849955288, continuation);
            this.$promise = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C11051(this.$promise, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            Class<?> cls = Class.forName(C1561oA.Kd("N[Z\u001cSQg[i]Zd[Y'^\\rftheofdeuv5j{sosr\u0002=s}wtz\u000fDif\\\u0007\u0001}\u0004\u0018l\u0010\u0006\u0018\u0010\nI\u001c\u0018\r\u000b\u001f\u0011m\u001c\u0010\u001c*%\u001c'Xf", (short) (FB.Xd() ^ (1424000845 ^ 1424011777))));
            Class<?>[] clsArr = new Class[(794994670 ^ 1332645651) ^ 1611409663];
            clsArr[0] = Class.forName(Wg.Zd("ze:k+<$ \u001d\"pH\u0014j^-gP\u0018dV$=\rR\u000far$}IQ\f", (short) (C1499aX.Xd() ^ ((1765426644 ^ 2033692687) ^ (-269320579))), (short) (C1499aX.Xd() ^ (1706259519 ^ (-1706250370)))));
            clsArr[1] = Class.forName(C1561oA.Xd("ejpigm.dquszzpvn}9O||\u0004y\u007f\bt\t~\u0006\u0006", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831076181)))));
            Object[] objArr = new Object[C1633zX.Xd() ^ (-1951491127)];
            objArr[0] = coroutineScope;
            objArr[1] = continuation;
            short sXd = (short) (C1633zX.Xd() ^ (1128816053 ^ (-1128812985)));
            int[] iArr = new int["^dic\\W".length()];
            QB qb = new QB("^dic\\W");
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
                return method.invoke(this, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            short sXd = (short) (FB.Xd() ^ (186218660 ^ 186212817));
            short sXd2 = (short) (FB.Xd() ^ ((254168417 ^ 71934236) ^ 191887134));
            int[] iArr = new int["itq1fbvhtfai^Z&[Wk]i[V^SON\\[\u0018KZPJLIV\u0010DLD?CU\t,'\u001bC;6:L\u001f@4D:2o@:-);+\u00062$.:3(1`l".length()];
            QB qb = new QB("itq1fbvhtfai^Z&[Wk]i[V^SON\\[\u0018KZPJLIV\u0010DLD?CU\t,'\u001bC;6:L\u001f@4D:2o@:-);+\u00062$.:3(1`l");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[(254768919 ^ 40712154) ^ 222445775];
            clsArr[0] = Class.forName(hg.Vd("g]q['dXd\\\"BT[URb", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (1122169303 ^ (-1187643292)))), (short) (C1633zX.Xd() ^ (Od.Xd() ^ (1921553048 ^ (-896881990))))));
            clsArr[1] = Class.forName(C1561oA.ud("FIMD@D\u00037BD@EC7;1>w\f75:.28#5).,", (short) (Od.Xd() ^ (OY.Xd() ^ (-69929746)))));
            Object[] objArr = new Object[Od.Xd() ^ (1448822302 ^ 296145481)];
            objArr[0] = coroutineScope;
            objArr[1] = continuation;
            Method method = cls.getMethod(C1561oA.yd("*:.+7)", (short) (ZN.Xd() ^ (Od.Xd() ^ 1207825961))), clsArr);
            try {
                method.setAccessible(true);
                C11051 c11051 = (C11051) ((Continuation) method.invoke(this, objArr));
                Unit unit = Unit.INSTANCE;
                short sXd3 = (short) (C1607wl.Xd() ^ ((684500856 ^ 356561617) ^ 1032615040));
                int[] iArr2 = new int["s\u0001\u007fAxv\r\u0001\u000f\u0003\u007f\n\u0001~L\u0004\u0002\u0018\f\u001a\u000e\u000b\u0015\f\n\u000b\u001b\u001cZ\u0010!\u0019\u0015\u0019\u0018'b\u0019#\u001d\u001a 4i\u000f\f\u0002,&#)=\u00125+=5/nA=20D6\u0013A5AOJAL}\f".length()];
                QB qb2 = new QB("s\u0001\u007fAxv\r\u0001\u000f\u0003\u007f\n\u0001~L\u0004\u0002\u0018\f\u001a\u000e\u000b\u0015\f\n\u000b\u001b\u001cZ\u0010!\u0019\u0015\u0019\u0018'b\u0019#\u001d\u001a 4i\u000f\f\u0002,&#)=\u00125+=5/nA=20D6\u0013A5AOJAL}\f");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd3 + sXd3) + sXd3) + i3));
                    i3++;
                }
                Object[] objArr2 = {unit};
                Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(Jg.Wd("#\u0006\r$~i7X\u0015@6\u001dq", (short) (ZN.Xd() ^ ((351231769 ^ 690162172) ^ 1036803141)), (short) (ZN.Xd() ^ (1178585314 ^ 1178581734))), Class.forName(Xg.qd("wo\u0006q?~t\u0003|Dfz\u0004\u007f~\u0011", (short) (Od.Xd() ^ ((343497993 ^ 1788939162) ^ (-2128113818))), (short) (Od.Xd() ^ (386314318 ^ (-386319001))))));
                try {
                    method2.setAccessible(true);
                    return method2.invoke(c11051, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException(C1626yg.Ud("m|\b\u000ba\b)\\T~&1\u0015<2\u0017Q\u0004C?jkuG\u007f\u00127M{<zqb%jN\u000b\b\u0007\u000e:\td:n8_", (short) (FB.Xd() ^ (1416084823 ^ 1416086824)), (short) (FB.Xd() ^ ((184435931 ^ 797069765) ^ 628889184))));
            }
            ResultKt.throwOnFailure(obj);
            try {
                Cleafy.updateDetection();
                Promise promise = this.$promise;
                if (promise != null) {
                    promise.resolve(ZO.xd("d$9ci8,n\u0003]^V0V\u001fB8\u007f25dl\"M1", (short) (C1499aX.Xd() ^ ((1092099154 ^ 2129233167) ^ (-1072804130))), (short) (C1499aX.Xd() ^ ((1929206324 ^ 1392926981) ^ (-570107392)))));
                }
            } catch (Exception e2) {
                Promise promise2 = this.$promise;
                if (promise2 != null) {
                    promise2.reject(e2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$s58v5Uc4kq9hunxuG9SA49SH-sw, reason: not valid java name */
    public static /* synthetic */ void m7087$r8$lambda$s58v5Uc4kq9hunxuG9SA49SHsw(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, AgentDiagnosticsProvider agentDiagnosticsProvider, String str) throws Throwable {
        Class<?> cls = Class.forName(Ig.wd("4o wNv0J\u0011_YHsjc\u007f ?i\u001f;~ug.*\u001bji\u0010\u0004`3\u00103\u0007W/3<:U\u0015i^dB=Bd(m3$m\u0001w\u0011", (short) (FB.Xd() ^ (792910778 ^ 792890709))));
        Class<?>[] clsArr = new Class[440147080 ^ 440147083];
        short sXd = (short) (OY.Xd() ^ ((581415287 ^ 515017942) ^ 1008036888));
        int[] iArr = new int["Y\u0016F\"*\u0003d&~\u001b\u00197I\u0018\u0013,S\u0003s\u000fLx,\u001fC\u0002]<\u0007\u001b^\u0006ssV\u0018dNWriK f%\")\u007fK5?\u001e+t\u001a\u0004<Pk\u000b\u0007\u000b8%w5SYfk\u007f\u0001G\u0018=kt$".length()];
        QB qb = new QB("Y\u0016F\"*\u0003d&~\u001b\u00197I\u0018\u0013,S\u0003s\u000fLx,\u001fC\u0002]<\u0007\u001b^\u0006ssV\u0018dNWriK f%\")\u007fK5?\u001e+t\u001a\u0004<Pk\u000b\u0007\u000b8%w5SYfk\u007f\u0001G\u0018=kt$");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Class.forName(C1561oA.Qd("Wb_\u001fS[SNRd\u0018VWIOQI\u0011FFTDAQEJH\u00079>;CH\u0001\u001385=B\u00115,177::.'6\u00123/5'!!-", (short) (Od.Xd() ^ ((1734800498 ^ 1969839376) ^ (-303029017)))));
        clsArr[209693222 ^ 209693220] = Class.forName(C1593ug.zd("me{g5tjxr:`\u0003\u0002y\u007fy", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69950532))), (short) (C1633zX.Xd() ^ ((1551950491 ^ 1658911249) ^ (-1046488561)))));
        Object[] objArr = new Object[C1580rY.Xd() ^ (952588200 ^ (-156124086))];
        objArr[0] = rCTDeviceEventEmitter;
        objArr[1] = agentDiagnosticsProvider;
        objArr[Od.Xd() ^ 1207800919] = str;
        Method declaredMethod = cls.getDeclaredMethod(C1561oA.od("\u0017\t\n\u000b\u0014\u0014\u0004\u0010`\u0005{\u0001\u0007\u0007\n\n}v\u0006]y\u0003\u0003rzp|-thsghd&7", (short) (C1580rY.Xd() ^ (2005458202 ^ (-2005465604)))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNCleafyModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Intrinsics.checkNotNullParameter(reactApplicationContext, C1561oA.Kd("\u0001tqt\u0007V\u0004\u0004\u000b|\u0011\u000e", (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831091424)))));
        Context applicationContext = reactApplicationContext.getApplicationContext();
        int iXd = Od.Xd() ^ (-1207813906);
        Intrinsics.checkNotNull(applicationContext, Wg.Zd("}q8fiX#[+Z/G\u0015cL_\rkX\u000f\u0012\\}W$\u000e[L$\u0007\u0012o\u0014\n\u00100uB~ECKovp3q|E\u0004Ds~\",V|]28", (short) (C1499aX.Xd() ^ (617973097 ^ (-617991013))), (short) (C1499aX.Xd() ^ iXd)));
        this.application = (Application) applicationContext;
    }

    private final void doRequest(String str, HttpMethod httpMethod, ReadableMap readableMap, ReadableMap readableMap2, int i2, Promise promise) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass1(str, httpMethod, readableMap, readableMap2, i2, promise, null), 3, null);
    }

    private static final void registerDiagnosticsListener$lambda$6(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, AgentDiagnosticsProvider agentDiagnosticsProvider, String str) {
        short sXd = (short) (ZN.Xd() ^ ((2084809280 ^ 64893466) ^ 2141056716));
        int[] iArr = new int["4Zhjjvknut\"sewgtm}o},=L".length()];
        QB qb = new QB("4Zhjjvknut\"sewgtm}o},=L");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(agentDiagnosticsProvider, new String(iArr, 0, i2));
        String strVd = Wg.vd("/=:8@", (short) (C1499aX.Xd() ^ (FB.Xd() ^ (-1609514094))));
        Intrinsics.checkNotNullParameter(str, strVd);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(strVd, str);
        Unit unit = Unit.INSTANCE;
        short sXd2 = (short) (C1633zX.Xd() ^ (OY.Xd() ^ (70128435 ^ (-330449))));
        short sXd3 = (short) (C1633zX.Xd() ^ ((218717467 ^ 1256755813) ^ (-1205987731)));
        int[] iArr2 = new int["v\u001f\u0018q\u0017\u0014\u001c!p\u001d\u001c\u0018\u001a".length()];
        QB qb2 = new QB("v\u001f\u0018q\u0017\u0014\u001c!p\u001d\u001c\u0018\u001a");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
            i3++;
        }
        rCTDeviceEventEmitter.emit(new String(iArr2, 0, i3), writableMapCreateMap);
    }

    private final void rejectWithInvalidUrl(Promise promise) {
        int iXd = C1607wl.Xd() ^ (1179501797 ^ 671716257);
        promise.reject(new IllegalArgumentException(hg.Vd("*NU?IE?y.*#v", (short) (C1607wl.Xd() ^ (392922816 ^ 392928783)), (short) (C1607wl.Xd() ^ iXd))));
    }

    @ReactMethod
    public final void delete(String str, ReadableMap readableMap, ReadableMap readableMap2, int i2, Promise promise) throws Throwable {
        if (str == null) {
            if (promise != null) {
                Object[] objArr = {promise};
                Method declaredMethod = Class.forName(Ig.wd("\u001bYIif?pzU00Uw|O\"Uv 3b\r&\u001aOa\rS%\u00060Ch\u007fC\u001eh@P53\u0007J\u0013CM)&jU9\u0007lEbjY\u001a", (short) (Od.Xd() ^ (Od.Xd() ^ (1002419354 ^ (-2084721811)))))).getDeclaredMethod(C1561oA.Qd("|nrliy[lviImt^hd^Njc", (short) (C1607wl.Xd() ^ (ZN.Xd() ^ (23148850 ^ 854269451)))), Class.forName(EO.Od("2lZ\u0002[\u000b'c\u0007\u0017\u001bn[(-\u0006DiMW}OZcwb%\u00181_u\u001a6", (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ 1951488897)))));
                try {
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this, objArr);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return;
        }
        HttpMethod httpMethod = HttpMethod.DELETE;
        Class<?> cls = Class.forName(C1561oA.ud("Zeb\"WSgYeWRZOK\u0017LH\\NZLGOD@?ML\t<KA;=:G\u00015=504Fy\u001d\u0018\f4,'+=\u00101%5+#", (short) (OY.Xd() ^ ((1482507140 ^ 82388881) ^ 1555316255))));
        Class<?>[] clsArr = new Class[OY.Xd() ^ (1051798856 ^ 983180710)];
        clsArr[0] = Class.forName(C1561oA.yd("%\u001b/\u0019d\"\u0016\"\u001a_\u0004$!\u0017\u001b\u0013", (short) (Od.Xd() ^ ((1285152284 ^ 258281560) ^ (-1140652306)))));
        short sXd = (short) (FB.Xd() ^ (C1607wl.Xd() ^ (266318571 ^ 1637611988)));
        int[] iArr = new int["7DC\u0005J>;>PIGARBT\\\u0012WKHK]\u0018S`a^\u001d8efcAZj_g]".length()];
        QB qb = new QB("7DC\u0005J>;>PIGARBT\\\u0012WKHK]\u0018S`a^\u001d8efcAZj_g]");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
            i3++;
        }
        clsArr[1] = Class.forName(new String(iArr, 0, i3));
        int i4 = (1541695916 ^ 2121468109) ^ 630677859;
        short sXd2 = (short) (Od.Xd() ^ ((1158853394 ^ 1042147330) ^ (-2064612627)));
        short sXd3 = (short) (Od.Xd() ^ (1818457112 ^ (-1818437787)));
        int[] iArr2 = new int["\u0011\u001e\u001d^\u0018\u0014\u0017\u001a\u0018&'$g-!\u001e!3m#4,(,+t\u001a.+/-/:4\u001d2B".length()];
        QB qb2 = new QB("\u0011\u001e\u001d^\u0018\u0014\u0017\u001a\u0018&'$g-!\u001e!3m#4,(,+t\u001a.+/-/:4\u001d2B");
        int i5 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i5] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i5)) + sXd3);
            i5++;
        }
        clsArr[i4] = Class.forName(new String(iArr2, 0, i5));
        clsArr[FB.Xd() ^ 1609527088] = Class.forName(Jg.Wd("\u007fr\u001b~cQ~)I?Sz_\r+Y\u0007|^&^@^\u000e?r?s\u001aq\u001a=rTn._", (short) (Od.Xd() ^ (Od.Xd() ^ (-1207813466))), (short) (Od.Xd() ^ (1028719646 ^ (-1028740973)))));
        clsArr[C1580rY.Xd() ^ (959758979 ^ (-146658970))] = Integer.TYPE;
        clsArr[1647526253 ^ 1647526248] = Class.forName(ZO.xd("d.\u001b_%\u0013$zI[\u0001\u00033f\u0001oUw)#Tb+,W>\\\u0003\u0014\u001e ,c", (short) (FB.Xd() ^ (1606227133 ^ 1606239501)), (short) (FB.Xd() ^ (Od.Xd() ^ 1207800931))));
        Object[] objArr2 = new Object[(969839945 ^ 828157611) ^ 143801316];
        objArr2[0] = str;
        objArr2[1] = httpMethod;
        objArr2[(592035797 ^ 1487390290) ^ 2079226245] = readableMap;
        objArr2[Od.Xd() ^ (745378853 ^ 1804599411)] = readableMap2;
        objArr2[(2099819025 ^ 1018855888) ^ 1100100549] = Integer.valueOf(i2);
        objArr2[ZN.Xd() ^ (1286206778 ^ 2133052367)] = promise;
        short sXd4 = (short) (C1499aX.Xd() ^ (FB.Xd() ^ (761891046 ^ (-1921438966))));
        short sXd5 = (short) (C1499aX.Xd() ^ ((1639555466 ^ 1104284795) ^ (-543947883)));
        int[] iArr3 = new int["+x\rS1x_\f\\".length()];
        QB qb3 = new QB("+x\rS1x_\f\\");
        int i6 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i6] = xuXd3.fK((C1561oA.Xd[i6 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + (i6 * sXd5))) + xuXd3.CK(iKK3));
            i6++;
        }
        Method declaredMethod2 = cls.getDeclaredMethod(new String(iArr3, 0, i6), clsArr);
        try {
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(this, objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @ReactMethod
    public final void get(String str, ReadableMap readableMap, ReadableMap readableMap2, int i2, Promise promise) throws Throwable {
        if (str == null) {
            if (promise != null) {
                Object[] objArr = {promise};
                Method declaredMethod = Class.forName(hg.Vd("%0-l\"\u001e2$0\"\u001d%\u001a\u0016a\u0017\u0013'\u0019%\u0017\u0012\u001a\u000f\u000b\n\u0018\u0017S\u0007\u0016\f\u0006\b\u0005\u0012K\u007f\b\u007fz~\u0011DgbV~vqu\bZ{o\u007fum", (short) (FB.Xd() ^ (C1499aX.Xd() ^ (1697134618 ^ (-649269357)))), (short) (FB.Xd() ^ (C1633zX.Xd() ^ (602951568 ^ (-1470178678)))))).getDeclaredMethod(C1561oA.yd("l`b^asSff[9_lX`^n`zu", (short) (FB.Xd() ^ (Od.Xd() ^ 1207823532))), Class.forName(C1561oA.ud("\u007f\u000b\bG~xyzv\u0003\u0002|>\u0002sno\u007f8kzpjli1Rsolgpa", (short) (C1633zX.Xd() ^ (1001222375 ^ (-1001219540))))));
                try {
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this, objArr);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return;
        }
        HttpMethod httpMethod = HttpMethod.GET;
        Class<?> cls = Class.forName(C1593ug.zd("+87x0.D8F:7A86\u0004;9OCQEBLCABRS\u0012GXPLPO^\u001aPZTQWk!FC9c]Z`tIlbtlf", (short) (OY.Xd() ^ (C1607wl.Xd() ^ (2090115942 ^ 315676493))), (short) (OY.Xd() ^ (763065375 ^ 763045856))));
        Class<?>[] clsArr = new Class[(767949085 ^ 1159664947) ^ 1759177768];
        clsArr[0] = Class.forName(C1561oA.od(",\"6 k)\u001d)!f\u000b+(\u001e\"\u001a", (short) (OY.Xd() ^ ((1925321439 ^ 1905570334) ^ 56015967))));
        clsArr[1] = Class.forName(C1561oA.Kd("Uba#h\\Y\\nge_p`rz0uifi{6q~\u007f|;V\u0004\u0005\u0002_x\t}\u0006{", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ 1951486494))));
        int i3 = (1667243109 ^ 1911926302) ^ 311800441;
        short sXd = (short) (ZN.Xd() ^ ((1434778129 ^ 469690808) ^ 1316645201));
        short sXd2 = (short) (ZN.Xd() ^ (1047568687 ^ 1047581385));
        int[] iArr = new int["R?\n\u001b0i<\u000bH2\u0001Mlq1\f>,6'&]%\t3Z_\u001f\fK\u0007x/\tM\u0010\u0010".length()];
        QB qb = new QB("R?\n\u001b0i<\u000bH2\u0001Mlq1\f>,6'&]%\t3Z_\u001f\fK\u0007x/\tM\u0010\u0010");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i4] = xuXd.fK(((i4 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i4++;
        }
        clsArr[i3] = Class.forName(new String(iArr, 0, i4));
        clsArr[FB.Xd() ^ (1064227111 ^ 1619115543)] = Class.forName(C1561oA.Xd("\u000e\u001b\u001a[\u0015\u0011\u0014\u0017\u0015#$!d*\u001e\u001b\u001e0j 1)%)(q\u0017+(,*,71\u001a/?", (short) (ZN.Xd() ^ ((1045008422 ^ 1932765052) ^ 1299848108))));
        clsArr[1967046118 ^ 1967046114] = Integer.TYPE;
        clsArr[573319464 ^ 573319469] = Class.forName(Wg.vd("\b\u0013\u0014S\u0007\u0001\u0006\u0007~\u000b\u000e\tF\n\u007fzw\bDw\u0003xvxq9^\u007fwts|*", (short) (ZN.Xd() ^ (ZN.Xd() ^ 864697442))));
        Object[] objArr2 = new Object[C1607wl.Xd() ^ (73709452 ^ 1780524112)];
        objArr2[0] = str;
        objArr2[1] = httpMethod;
        objArr2[(368536528 ^ 1919691514) ^ 1738228008] = readableMap;
        objArr2[836546972 ^ 836546975] = readableMap2;
        objArr2[(329275388 ^ 1919878163) ^ 1640977387] = Integer.valueOf(i2);
        objArr2[(1742177612 ^ 468386420) ^ 2084341565] = promise;
        Method declaredMethod2 = cls.getDeclaredMethod(Qg.kd("IS5GRUDQQ", (short) (Od.Xd() ^ (C1580rY.Xd() ^ 831080287)), (short) (Od.Xd() ^ (OY.Xd() ^ (-69937647)))), clsArr);
        try {
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(this, objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @ReactMethod
    public final void getApplicationHostname(Promise promise) {
        if (promise != null) {
            promise.resolve(Cleafy.getApplicationHostname());
        }
    }

    @ReactMethod
    public final void getBrowserId(Promise promise) {
        if (promise != null) {
            promise.resolve(Cleafy.getBrowserId());
        }
    }

    @ReactMethod
    public final void getDiagnostics(Promise promise) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C11031(promise, null), 1303636855 ^ 1303636852, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C1561oA.Yd("\u0012\u000f\u0005/)&,@", (short) (C1499aX.Xd() ^ (231756407 ^ (-231758303))));
    }

    @ReactMethod
    public final void getParentId(Promise promise) {
        if (promise != null) {
            promise.resolve(Cleafy.getParentId());
        }
    }

    @ReactMethod
    public final void getSessionId(Promise promise) {
        if (promise != null) {
            promise.resolve(Cleafy.getSessionId());
        }
    }

    @ReactMethod
    public final void head(String str, ReadableMap readableMap, ReadableMap readableMap2, int i2, Promise promise) throws Throwable {
        if (str == null) {
            if (promise != null) {
                Class<?> cls = Class.forName(C1593ug.zd("\u0018%$e\u001d\u001b1%3'$.%#p(&<0>2/90./?@~4E=9=<K\u0007=GA>DX\u000e30&PJGMa6YOaYS", (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ 1951475878)), (short) (C1633zX.Xd() ^ (1608974586 ^ (-1609000695)))));
                Class<?>[] clsArr = new Class[1];
                short sXd = (short) (OY.Xd() ^ (2108153930 ^ 2108142356));
                int[] iArr = new int["\u0006\u0011\u000eM\u0005~\u007f\u0001|\t\b\u0003D\bytu\u0006>q\u0001vpro7Xyurmvg".length()];
                QB qb = new QB("\u0006\u0011\u000eM\u0005~\u007f\u0001|\t\b\u0003D\bytu\u0006>q\u0001vpro7Xyurmvg");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(sXd + sXd + i3 + xuXd.CK(iKK));
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i3));
                Object[] objArr = {promise};
                Method declaredMethod = cls.getDeclaredMethod(C1561oA.Kd("\u0016\n\u0010\f\u000b\u001d\u0001\u0014 \u0015v\u001d&\u0012\u001e\u001c\u0018\n(#", (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951476756))), clsArr);
                try {
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this, objArr);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return;
        }
        HttpMethod httpMethod = HttpMethod.HEAD;
        Class<?> cls2 = Class.forName(Xg.qd("\n\u0017\u0016W\u000f\r#\u0017%\u0019\u0016 \u0017\u0015b\u001a\u0018.\"0$!+\" !12p&7/+/.=x/9306J\u007f%\"\u0018B<9?S(KASKE", (short) (FB.Xd() ^ (244606208 ^ 244598901)), (short) (FB.Xd() ^ ((1090362663 ^ 1924554494) ^ 843829699))));
        Class<?>[] clsArr2 = new Class[Od.Xd() ^ 1207800915];
        clsArr2[0] = Class.forName(Jg.Wd("hP2.G\u0017xV\\s&8\u0003\u000b\\f", (short) (ZN.Xd() ^ (C1607wl.Xd() ^ (985050268 ^ 1425180248))), (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (1358057397 ^ (-614681251))))));
        clsArr2[1] = Class.forName(ZO.xd("\u0019\th~>/F(]\t.c\u0014Z/ oO<n\u0010\"\"rcE\u0015HG ,G;WYQH3", (short) (FB.Xd() ^ (1732828358 ^ 1732819543)), (short) (FB.Xd() ^ (FB.Xd() ^ 1609530170))));
        clsArr2[C1633zX.Xd() ^ (-1951491127)] = Class.forName(C1626yg.Ud("$\u0003][PufXeqZ7\u000f4u\u0016\u0003\u0001\u001a\u0005\u0004SA\u000f\t\u0001cy|v\u0005|b\u001f9W9", (short) (Od.Xd() ^ (C1607wl.Xd() ^ (-1849965861))), (short) (Od.Xd() ^ (C1633zX.Xd() ^ (124449031 ^ 1933296895)))));
        int i4 = 676411956 ^ 676411959;
        short sXd2 = (short) (C1499aX.Xd() ^ ((1319202954 ^ 1902543748) ^ (-1070051012)));
        int[] iArr2 = new int["8kg\fLr\u001dF\u0001mwI=\u007f#x&9:r@~_f2rtW\u001d\u000erM7\u0012\u0016b\u0016".length()];
        QB qb2 = new QB("8kg\fLr\u001dF\u0001mwI=\u007f#x&9:r@~_f2rtW\u001d\u000erM7\u0012\u0016b\u0016");
        int i5 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i5 % C1561oA.Xd.length] ^ (sXd2 + i5)));
            i5++;
        }
        clsArr2[i4] = Class.forName(new String(iArr2, 0, i5));
        clsArr2[(134747375 ^ 924817531) ^ 1058507920] = Integer.TYPE;
        int i6 = (905102213 ^ 1493996421) ^ 1828605957;
        short sXd3 = (short) (Od.Xd() ^ (C1633zX.Xd() ^ (1374583238 ^ 633302301)));
        int[] iArr3 = new int["k(\u00184\u001cdv(PMK)\u001bYtN\u0006%\u0006&q\u0010\u001d\u001c5.q]h\u00184]w".length()];
        QB qb3 = new QB("k(\u00184\u001cdv(PMK)\u001bYtN\u0006%\u0006&q\u0010\u001d\u001c5.q]h\u00184]w");
        int i7 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i7] = xuXd3.fK((C1561oA.Xd[i7 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + i7)) + xuXd3.CK(iKK3));
            i7++;
        }
        clsArr2[i6] = Class.forName(new String(iArr3, 0, i7));
        Object[] objArr2 = new Object[C1499aX.Xd() ^ (-1134257942)];
        objArr2[0] = str;
        objArr2[1] = httpMethod;
        objArr2[(2018764656 ^ 1801330028) ^ 319683102] = readableMap;
        objArr2[C1580rY.Xd() ^ (321268828 ^ (-581908546))] = readableMap2;
        objArr2[(1073748123 ^ 390128686) ^ 1463876785] = Integer.valueOf(i2);
        objArr2[1380071407 ^ 1380071402] = promise;
        Method declaredMethod2 = cls2.getDeclaredMethod(C1561oA.Qd("kuWitwfss", (short) (FB.Xd() ^ (C1607wl.Xd() ^ 1849962472))), clsArr2);
        try {
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(this, objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @ReactMethod
    public final void initWithConfiguration(ReadableMap readableMap, Promise promise) {
        if (readableMap == null) {
            if (promise != null) {
                promise.reject(new IllegalArgumentException(Wg.Zd("(\t\u007fig\\\u000e@V\u007fg\u001e\u001a$B\u0001{9!\u001f\u0014\u0019I79-&\\\u0006", (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (210005890 ^ (-1057905552)))), (short) (C1580rY.Xd() ^ ((2019568964 ^ 2047840039) ^ (-40873672))))));
                return;
            }
            return;
        }
        HashMap<String, Object> hashMap = readableMap.toHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(hashMap.size()));
        Iterator<T> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(StringUtilityKt.camelToSnakeCase((String) entry.getKey()), entry.getValue());
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C11041(CleafyConfigurationParser.INSTANCE.parseFromMap(linkedHashMap), promise, null), C1633zX.Xd() ^ (1498139940 ^ (-756721940)), null);
    }

    @ReactMethod
    public final void invalidateSession(Promise promise) {
        Cleafy.invalidateSession();
        if (promise != null) {
            promise.resolve(C1561oA.Xd("~\u0012!\"\u0019  R\u001d#,\u0018$\"\u001e\u001c0\"\"_", (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (1627730846 ^ (-255949307))))));
        }
    }

    @ReactMethod
    public final void patch(String str, ReadableMap readableMap, ReadableMap readableMap2, int i2, Promise promise) throws Throwable {
        if (str == null) {
            if (promise != null) {
                Class<?> cls = Class.forName(Jg.Wd("=\u0002v\u0012A\u0015%nsA4(vj\u0012@\u0016F\u0010\u0018cVI\u0016\fflG}\t\u0015bV$x\u007f\u0015@$\u0016hhR\u007f\u0010bRTD;7#piIS!\u0015", (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (-1134263668))), (short) (ZN.Xd() ^ (Od.Xd() ^ (1382454170 ^ 362511712)))));
                Class<?>[] clsArr = new Class[1];
                short sXd = (short) (C1499aX.Xd() ^ (810459736 ^ (-810473310)));
                short sXd2 = (short) (C1499aX.Xd() ^ (1185452959 ^ (-1185463968)));
                int[] iArr = new int["\u001e*\u0014[Oq\rdou\\>;;!S\u0011+\u0016a6G\u001d\rg-\by\bkD\u0011\u0016".length()];
                QB qb = new QB("\u001e*\u0014[Oq\rdou\\>;;!S\u0011+\u0016a6G\u001d\rg-\by\bkD\u0011\u0016");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd2) + sXd)));
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i3));
                Object[] objArr = {promise};
                Method declaredMethod = cls.getDeclaredMethod(C1626yg.Ud("kI5%:z\u000fu\u0010M)\t=uii\u001d#,\u0007", (short) (C1633zX.Xd() ^ (432221312 ^ (-432219358))), (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609501539)))), clsArr);
                try {
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this, objArr);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return;
        }
        HttpMethod httpMethod = HttpMethod.PATCH;
        short sXd3 = (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (1478958335 ^ (-1806515169))));
        int[] iArr2 = new int["gro/lh|n\u0003towtp<qu\n{\b\u0002|\u0005y}|\u000b\nN\u0002\u0011\u0007\t\u000b\b\u0015V\u000b\u0013\u000b\u000e\u0012$W\u0003}q\u001a\u001a\u0015\u0019+\u0006'\u001b+)!".length()];
        QB qb2 = new QB("gro/lh|n\u0003towtp<qu\n{\b\u0002|\u0005y}|\u000b\nN\u0002\u0011\u0007\t\u000b\b\u0015V\u000b\u0013\u000b\u000e\u0012$W\u0003}q\u001a\u001a\u0015\u0019+\u0006'\u001b+)!");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK((sXd3 ^ i4) + xuXd2.CK(iKK2));
            i4++;
        }
        Class<?> cls2 = Class.forName(new String(iArr2, 0, i4));
        Class<?>[] clsArr2 = new Class[789137001 ^ 789137007];
        clsArr2[0] = Class.forName(Qg.kd("\u0001v\u000bt@}q}u;_\u007f|rvn", (short) (OY.Xd() ^ ((1881200743 ^ 492991401) ^ 1833088254)), (short) (OY.Xd() ^ (OY.Xd() ^ (780875523 ^ 715158810)))));
        int iXd = C1499aX.Xd() ^ (825868901 ^ 1923277194);
        int iXd2 = C1580rY.Xd() ^ 831070689;
        short sXd4 = (short) (Od.Xd() ^ iXd);
        short sXd5 = (short) (Od.Xd() ^ iXd2);
        int[] iArr3 = new int["\u001b&#b&\u0018\u0013\u0014$\u001b\u0017\u000f\u001e\f\u001c\"U\u0019\u000b\u0006\u0007\u0017O\t\u0014\u0013\u000eJc\u000f\u000e\td{\n|\u0003v".length()];
        QB qb3 = new QB("\u001b&#b&\u0018\u0013\u0014$\u001b\u0017\u000f\u001e\f\u001c\"U\u0019\u000b\u0006\u0007\u0017O\t\u0014\u0013\u000eJc\u000f\u000e\td{\n|\u0003v");
        int i5 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i5] = xuXd3.fK(sXd4 + i5 + xuXd3.CK(iKK3) + sXd5);
            i5++;
        }
        clsArr2[1] = Class.forName(new String(iArr3, 0, i5));
        clsArr2[(993698315 ^ 1854682899) ^ 1438029082] = Class.forName(C1561oA.ud("q|y9pjklhtsn0se`aq*]lb\\^[#FXSUQQZR9LZ", (short) (FB.Xd() ^ (FB.Xd() ^ 1609511437))));
        int iXd3 = FB.Xd() ^ (1025231477 ^ 1660200261);
        short sXd6 = (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (-1134246296)));
        int[] iArr4 = new int["]je'\\XWZTb_\\\u001caQNM_\u0016KXPHLG\u00112F?C=?\u0007\u0001ez\u0007".length()];
        QB qb4 = new QB("]je'\\XWZTb_\\\u001caQNM_\u0016KXPHLG\u00112F?C=?\u0007\u0001ez\u0007");
        int i6 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i6] = xuXd4.fK(xuXd4.CK(iKK4) - (sXd6 ^ i6));
            i6++;
        }
        clsArr2[iXd3] = Class.forName(new String(iArr4, 0, i6));
        clsArr2[FB.Xd() ^ (400102783 ^ 1211529800)] = Integer.TYPE;
        int iXd4 = C1607wl.Xd() ^ 1849955295;
        short sXd7 = (short) (ZN.Xd() ^ (C1607wl.Xd() ^ (518854838 ^ 1890135491)));
        int[] iArr5 = new int["\u0014! a\u001b\u0017\u001a\u001d\u001b)*'j0$!$6p&7/+/.w\u001b><;8C6".length()];
        QB qb5 = new QB("\u0014! a\u001b\u0017\u001a\u001d\u001b)*'j0$!$6p&7/+/.w\u001b><;8C6");
        int i7 = 0;
        while (qb5.YK()) {
            int iKK5 = qb5.KK();
            Xu xuXd5 = Xu.Xd(iKK5);
            iArr5[i7] = xuXd5.fK(xuXd5.CK(iKK5) - (((sXd7 + sXd7) + sXd7) + i7));
            i7++;
        }
        clsArr2[iXd4] = Class.forName(new String(iArr5, 0, i7));
        Object[] objArr2 = new Object[C1607wl.Xd() ^ 1849955292];
        objArr2[0] = str;
        objArr2[1] = httpMethod;
        objArr2[C1633zX.Xd() ^ (-1951491127)] = readableMap;
        objArr2[Od.Xd() ^ 1207800918] = readableMap2;
        objArr2[926692551 ^ 926692547] = Integer.valueOf(i2);
        objArr2[OY.Xd() ^ (259107797 ^ 190489400)] = promise;
        int iXd5 = C1499aX.Xd() ^ (1767069930 ^ (-717756551));
        short sXd8 = (short) (OY.Xd() ^ ((210173573 ^ 630050824) ^ 688592553));
        short sXd9 = (short) (OY.Xd() ^ iXd5);
        int[] iArr6 = new int["\u001c(\f -2#24".length()];
        QB qb6 = new QB("\u001c(\f -2#24");
        int i8 = 0;
        while (qb6.YK()) {
            int iKK6 = qb6.KK();
            Xu xuXd6 = Xu.Xd(iKK6);
            iArr6[i8] = xuXd6.fK((xuXd6.CK(iKK6) - (sXd8 + i8)) + sXd9);
            i8++;
        }
        Method declaredMethod2 = cls2.getDeclaredMethod(new String(iArr6, 0, i8), clsArr2);
        try {
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(this, objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @ReactMethod
    public final void performRequest(String str, String str2, ReadableMap readableMap, ReadableMap readableMap2, int i2, Promise promise) throws Throwable {
        HttpMethod httpMethod;
        short sXd = (short) (C1580rY.Xd() ^ (C1580rY.Xd() ^ 831089401));
        int[] iArr = new int["FrZ".length()];
        QB qb = new QB("FrZ");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd + i3)));
            i3++;
        }
        Intrinsics.checkNotNullParameter(str, new String(iArr, 0, i3));
        short sXd2 = (short) (C1499aX.Xd() ^ (OY.Xd() ^ (-69950801)));
        int[] iArr2 = new int["K\u0014fAYr".length()];
        QB qb2 = new QB("K\u0014fAYr");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd2 + sXd2) + i4)) + xuXd2.CK(iKK2));
            i4++;
        }
        Intrinsics.checkNotNullParameter(str2, new String(iArr2, 0, i4));
        HttpMethod[] httpMethodArrValues = HttpMethod.values();
        int length = httpMethodArrValues.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                httpMethod = null;
                break;
            }
            httpMethod = httpMethodArrValues[i5];
            if (Intrinsics.areEqual(httpMethod.getRawValue(), str2)) {
                break;
            } else {
                i5++;
            }
        }
        if (httpMethod == null) {
            if (promise != null) {
                int iXd = Od.Xd() ^ (-1207810649);
                promise.reject(new IllegalArgumentException(Qg.kd("\u000f3:$.*$^+\"0#)\u001d", (short) (C1580rY.Xd() ^ ((2019618940 ^ 1629906511) ^ (-424070153))), (short) (C1580rY.Xd() ^ iXd))));
                return;
            }
            return;
        }
        Class<?> cls = Class.forName(C1561oA.Qd("\u0013\u001e\u001bZ\u0010\f \u0012\u001e\u0010\u000b\u0013\b\u0004O\u0005\u0001\u0015\u0007\u0013\u0005\u007f\b|xw\u0006\u0005At\u0004ysur\u007f9mumhl~2UPDld_cuHi]mc[", (short) (C1607wl.Xd() ^ (ZN.Xd() ^ 864706691))));
        Class<?>[] clsArr = new Class[FB.Xd() ^ 1609527093];
        clsArr[0] = Class.forName(C1593ug.zd("^VlX&e[ic+Qsrjpj", (short) (C1499aX.Xd() ^ (177887241 ^ (-177896267))), (short) (C1499aX.Xd() ^ (1763425078 ^ (-1763429066)))));
        clsArr[1] = Class.forName(C1561oA.od("Wb_\u001fbTOP`WSKZHX^\u0012UGBCS\fEPOJ\u0007 KJE!8F9?3", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (-69935095)))));
        int iXd2 = ZN.Xd() ^ 864698098;
        short sXd3 = (short) (FB.Xd() ^ (OY.Xd() ^ (93914839 ^ 28456129)));
        int[] iArr3 = new int["Wdc%^Z]`^lmj.sgdgy4izrnrq;`tqusu\u0001zcx\t".length()];
        QB qb3 = new QB("Wdc%^Z]`^lmj.sgdgy4izrnrq;`tqusu\u0001zcx\t");
        int i6 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i6] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd3 + sXd3) + i6));
            i6++;
        }
        clsArr[iXd2] = Class.forName(new String(iArr3, 0, i6));
        clsArr[OY.Xd() ^ 69929195] = Class.forName(Wg.Zd("%5s|q57\u0002;\u0011QRUb\u0016V\u0019rle6um9w\ti\u0005A\rF\u0010Z\u0018@\u001dl", (short) (Od.Xd() ^ (OY.Xd() ^ (468282601 ^ (-532832629)))), (short) (Od.Xd() ^ (Od.Xd() ^ (-1207819522)))));
        clsArr[818713375 ^ 818713371] = Integer.TYPE;
        clsArr[Od.Xd() ^ (1541859062 ^ 471560870)] = Class.forName(C1561oA.Xd("%21r,(+.,:;8{A525G\u00027H@<@?\t,OMLITG", (short) (ZN.Xd() ^ ((1207003363 ^ 388854871) ^ 1356627008))));
        Object[] objArr = new Object[FB.Xd() ^ (1399642584 ^ 209958637)];
        objArr[0] = str;
        objArr[1] = httpMethod;
        objArr[537971992 ^ 537971994] = readableMap;
        objArr[(132928282 ^ 590728006) ^ 618240095] = readableMap2;
        objArr[1850255869 ^ 1850255865] = Integer.valueOf(i2);
        objArr[FB.Xd() ^ 1609527094] = promise;
        Method declaredMethod = cls.getDeclaredMethod(Wg.vd(">H.@ORERV", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (2054295259 ^ 1274762776)))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @ReactMethod
    public final void post(String str, ReadableMap readableMap, ReadableMap readableMap2, int i2, Promise promise) throws Throwable {
        if (str == null) {
            if (promise != null) {
                Object[] objArr = {promise};
                Method declaredMethod = Class.forName(C1626yg.Ud("D\n\fL\r>eH\u000f\t\u0018\u0006zk>\tY\\y_6U\u000ebf,l\u0014\u0005\u001fu3LB\u001b\u007f8Tm\f\u0003s\u007f?\u0005\u001fV\u0018m8@3dwNhLL", (short) (Od.Xd() ^ (2038163461 ^ (-2038161211))), (short) (Od.Xd() ^ (OY.Xd() ^ (866551364 ^ (-932020685)))))).getDeclaredMethod(EO.Od("\u0017B+\u007f\u0007]f\u0002`\"\u001b(_>G,LY T", (short) (Od.Xd() ^ (OY.Xd() ^ (1840780591 ^ (-1771258735))))), Class.forName(Ig.wd("0\u0007\u0013\u0004S\u0019~Q'D>dw:%C\f\u000f!}Fu^aLx}N=\u000emX&", (short) (C1580rY.Xd() ^ (C1607wl.Xd() ^ (-1849956426))))));
                try {
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this, objArr);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return;
        }
        HttpMethod httpMethod = HttpMethod.POST;
        Class<?> cls = Class.forName(hg.Vd("8C@\u007f51E7C508-)t*&:,8*%-\"\u001e\u001d+*f\u001a)\u001f\u0019\u001b\u0018%^\u0013\u001b\u0013\u000e\u0012$Wzui\u0012\n\u0005\t\u001bm\u000f\u0003\u0013\t\u0001", (short) (C1607wl.Xd() ^ (2048931943 ^ 2048917836)), (short) (C1607wl.Xd() ^ ((1093581257 ^ 868073260) ^ 1922238740))));
        Class<?>[] clsArr = new Class[C1633zX.Xd() ^ (-1951491123)];
        clsArr[0] = Class.forName(C1561oA.ud(":0D.y7+7/t\u001996,0(", (short) (C1607wl.Xd() ^ ((1298708781 ^ 150723776) ^ 1167262845))));
        clsArr[1] = Class.forName(C1561oA.yd("7BC\u0003J<;<@77/B0DJq5+&+;w10/.j\b361\u0001\u0018*\u001d'\u001b", (short) (ZN.Xd() ^ (1306664340 ^ 1306668637))));
        clsArr[ZN.Xd() ^ (972356855 ^ 176079365)] = Class.forName(C1561oA.Yd("'43t.*-0.<=:}C747I\u00049JB>BA\u000b0DAECEPJ3HX", (short) (Od.Xd() ^ ((2078137657 ^ 2072922311) ^ (-5485571)))));
        clsArr[2053354937 ^ 2053354938] = Class.forName(Xg.qd("bon0iehkiwxu9~ror\u0005?t\u0006}y}|Fk\u007f|\u0001~\u0001\f\u0006n\u0004\u0014", (short) (C1580rY.Xd() ^ (1637338094 ^ (-1637351342))), (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (1536378757 ^ (-1746497014))))));
        clsArr[Od.Xd() ^ 1207800913] = Integer.TYPE;
        clsArr[OY.Xd() ^ (114489196 ^ 49938305)] = Class.forName(Jg.Wd("|\u0013ZeW\u001b't,\u0003OUQ^\u001bo\u001b6:H\u0007GL*Qb\\I0wP$B", (short) (OY.Xd() ^ (Od.Xd() ^ (1460637637 ^ 284311561))), (short) (OY.Xd() ^ (ZN.Xd() ^ (495620411 ^ 771795511)))));
        Object[] objArr2 = new Object[C1607wl.Xd() ^ (1144632179 ^ 712876207)];
        objArr2[0] = str;
        objArr2[1] = httpMethod;
        objArr2[Od.Xd() ^ 1207800919] = readableMap;
        objArr2[(1121123730 ^ 971986218) ^ 2067638459] = readableMap2;
        objArr2[Od.Xd() ^ 1207800913] = Integer.valueOf(i2);
        objArr2[(461454079 ^ 1123631338) ^ 1501067792] = promise;
        Method declaredMethod2 = cls.getDeclaredMethod(ZO.xd("VPb\u0015CRS\u0004\u0018", (short) (ZN.Xd() ^ (199037172 ^ 199039501)), (short) (ZN.Xd() ^ (1902981446 ^ 1902971776))), clsArr);
        try {
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(this, objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @ReactMethod
    public final void put(String str, ReadableMap readableMap, ReadableMap readableMap2, int i2, Promise promise) throws Throwable {
        if (str == null) {
            if (promise != null) {
                int iXd = C1580rY.Xd() ^ (-831065873);
                int iXd2 = ZN.Xd() ^ (970128379 ^ 173580660);
                short sXd = (short) (OY.Xd() ^ iXd);
                short sXd2 = (short) (OY.Xd() ^ iXd2);
                int[] iArr = new int["GRO\u000fD@TFRD?G<8\u000495I;G94<1-,:9u)8.(*'4m\"*\"\u001d!3f\n\u0005x!\u0019\u0014\u0018*|\u001e\u0012\"\u0018\u0010".length()];
                QB qb = new QB("GRO\u000fD@TFRD?G<8\u000495I;G94<1-,:9u)8.(*'4m\"*\"\u001d!3f\n\u0005x!\u0019\u0014\u0018*|\u001e\u0012\"\u0018\u0010");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(((sXd + i3) + xuXd.CK(iKK)) - sXd2);
                    i3++;
                }
                Object[] objArr = {promise};
                Method declaredMethod = Class.forName(new String(iArr, 0, i3)).getDeclaredMethod(C1561oA.ud("oae_\\lN_i\\<`gQ[WQA]V", (short) (Od.Xd() ^ (OY.Xd() ^ (1828760449 ^ (-1764480261))))), Class.forName(hg.Vd("1<9x0*+,(43.o3% !1i\u001d,\"\u001c\u001e\u001bb\u0004%!\u001e\u0019\"\u0013", (short) (C1580rY.Xd() ^ (OY.Xd() ^ (1525715591 ^ (-1591459781)))), (short) (C1580rY.Xd() ^ ((1917070553 ^ 513764080) ^ (-1826313662))))));
                try {
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this, objArr);
                    return;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            return;
        }
        HttpMethod httpMethod = HttpMethod.PUT;
        Class<?> cls = Class.forName(C1561oA.Qd("JUR\u0012GCWIUGBJ?;\u0007<8L>J<7?40/=<x,;1+-*7p%-% $6i\r\b{$\u001c\u0017\u001b-\u007f!\u0015%\u001b\u0013", (short) (C1633zX.Xd() ^ (1790496783 ^ (-1790483890)))));
        Class<?>[] clsArr = new Class[533464464 ^ 533464470];
        clsArr[0] = Class.forName(C1593ug.zd("0(>*w7-;5|#ED<B<", (short) (OY.Xd() ^ (551542017 ^ 551544878)), (short) (OY.Xd() ^ (180126210 ^ 180136619))));
        clsArr[1] = Class.forName(C1561oA.od("~\n\u0007F\n{vw\b~zr\u0002o\u007f\u00069|nijz3lwvq.GrqlH_m`fZ", (short) (OY.Xd() ^ (1510069041 ^ 1510057953))));
        clsArr[(228050979 ^ 1311977721) ^ 1134885080] = Class.forName(C1561oA.Kd("MZY\u001bTPSVTbc`$i]Z]o*_phdhg1VjgkikvpYn~", (short) (OY.Xd() ^ (24288800 ^ 24289065))));
        clsArr[C1580rY.Xd() ^ (455118879 ^ (-715752451))] = Class.forName(Wg.Zd("\u0012#\u0017[yXoS4G;<d\u0019\u0012\u0002Y\u007f\u001d#G44+~WqHiR#F42\u0010g\u001d", (short) (C1580rY.Xd() ^ ((1881488523 ^ 637268589) ^ (-1440675344))), (short) (C1580rY.Xd() ^ (718746099 ^ (-718766024)))));
        clsArr[315955640 ^ 315955644] = Integer.TYPE;
        clsArr[ZN.Xd() ^ (313898024 ^ 557812445)] = Class.forName(C1561oA.Xd("\u0002\u000f\u000eO\t\u0005\b\u000b\t\u0017\u0018\u0015X\u001e\u0012\u000f\u0012$^\u0014%\u001d\u0019\u001d\u001ce\t,*)&1$", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (-69958189)))));
        Object[] objArr2 = new Object[1202181424 ^ 1202181430];
        objArr2[0] = str;
        objArr2[1] = httpMethod;
        objArr2[1640856421 ^ 1640856423] = readableMap;
        objArr2[Od.Xd() ^ (1403368700 ^ 341319850)] = readableMap2;
        objArr2[FB.Xd() ^ (41790452 ^ 1569899715)] = Integer.valueOf(i2);
        objArr2[1453447906 ^ 1453447911] = promise;
        Method declaredMethod2 = cls.getDeclaredMethod(Wg.vd("x\u0003hz\u0002\u0005w\u0005\u0011", (short) (C1580rY.Xd() ^ (ZN.Xd() ^ (1813048404 ^ (-1603978833))))), clsArr);
        try {
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(this, objArr2);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @ReactMethod
    public final void registerDiagnosticsListener(Promise promise) {
        final DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        Cleafy.registerDiagnosticsListener(new AgentDiagnosticsListener() { // from class: com.davivienda.daviviendaapp.bridges.cleafy.RNCleafyModule$$ExternalSyntheticLambda0
            @Override // com.cleafy.mobile.detection.agent.AgentDiagnosticsListener
            public final void onDiagnosticsWithErrorAvailable(AgentDiagnosticsProvider agentDiagnosticsProvider, String str) throws Throwable {
                RNCleafyModule.m7087$r8$lambda$s58v5Uc4kq9hunxuG9SA49SHsw(rCTDeviceEventEmitter, agentDiagnosticsProvider, str);
            }
        });
        if (promise != null) {
            promise.resolve(null);
        }
    }

    @ReactMethod
    public final void setAppDeviceId(String str, Promise promise) {
        if (str == null) {
            if (promise != null) {
                promise.reject(new IllegalArgumentException(C1561oA.Yd("5[dP\\ZV\u0013Uef\u0017\\^pd_b\u001eHD", (short) (ZN.Xd() ^ ((1775082307 ^ 597529827) ^ 1246779942)))));
                return;
            }
            return;
        }
        Cleafy.setAppDeviceId(str);
        if (promise != null) {
            promise.resolve(C1561oA.yd("m\u0006\u0015>\u0005\u0015\u0012B{}\f\u007f~\u00029csP!\u0014(U", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134234029))));
        }
    }

    @ReactMethod
    public final void setAppSessionId(String str, Promise promise) {
        if (str != null) {
            Cleafy.setAppSessionId(str);
            if (promise != null) {
                int iXd = C1607wl.Xd() ^ 1849961501;
                promise.resolve(Xg.qd("Iat\u001e`pq\"vixypww*TP-\u0002t\u00052", (short) (OY.Xd() ^ (854597701 ^ 854594610)), (short) (OY.Xd() ^ iXd)));
                return;
            }
            return;
        }
        if (promise != null) {
            short sXd = (short) (ZN.Xd() ^ (C1633zX.Xd() ^ (927143409 ^ (-1125277474))));
            short sXd2 = (short) (ZN.Xd() ^ (901919261 ^ 901922415));
            int[] iArr = new int["}Jr\u0005@d\u007f#s+J\"%~-T\u001bHg@Y|".length()];
            QB qb = new QB("}Jr\u0005@d\u007f#s+J\"%~-T\u001bHg@Y|");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            promise.reject(new IllegalArgumentException(new String(iArr, 0, i2)));
        }
    }

    @ReactMethod
    public final void setLocation(String str, Promise promise) {
        if (str == null) {
            if (promise != null) {
                promise.reject(new IllegalArgumentException(C1626yg.Ud("ONh]{\u0011M1\u0015\u0003>Fo?n^", (short) (FB.Xd() ^ (C1633zX.Xd() ^ (-1951474605))), (short) (FB.Xd() ^ ((1159025178 ^ 440915116) ^ 1599256082)))));
                return;
            }
            return;
        }
        Cleafy.setLocation(str);
        if (promise != null) {
            short sXd = (short) (OY.Xd() ^ ((1494374040 ^ 1764928730) ^ 807449797));
            short sXd2 = (short) (OY.Xd() ^ (277288845 ^ 277311293));
            int[] iArr = new int["Im+\u0007c@\\$^\u001cbU\t".length()];
            QB qb = new QB("Im+\u0007c@\\$^\u001cbU\t");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            promise.resolve(new String(iArr, 0, i2));
        }
    }

    @ReactMethod
    public final void setUserId(String str, Promise promise) {
        if (str == null) {
            if (promise != null) {
                promise.reject(new IllegalArgumentException(EO.Od("dBz\u007f\u0015F\u001fMI\u0006{%|.\u001b", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ (288469246 ^ 1700838882))))));
                return;
            }
            return;
        }
        Cleafy.setUserId(str);
        if (promise != null) {
            promise.resolve(Ig.wd("&mm\u0003W02WMK@affm;", (short) (Od.Xd() ^ ((1628818928 ^ 1722586861) ^ (-129589251)))));
        }
    }

    @ReactMethod
    public final void updateAnalysis(Promise promise) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C11051(promise, null), 942756996 ^ 942756999, null);
    }
}
