package com.statsig.androidsdk;

import com.statsig.androidsdk.InitializeResponse;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4\u0012}\bnjG<LeN/ZS8-s{:(c$\u007fJCU ~*\teNo˧vJp\u000bK\u000f\f\u0016\u0001jBI]ތe\u0012%2JģG3coEʠhtL\u0005(݅*8\u0010\u0005\tɝ2H\u001e\u0019\u0003CQ\r\u001a0VpBR#M\r\u001a\u0018\u0006D~\u0017Ȧ\rg|5\u0011\u0004k:G#1jrR5aH|{\u0010\rýe͒uѭӿ/@E9]ba\b\u001fR\n@3C\u007fC\u001dhU.[M\u0002_NX.\u001bE3U\rk{>^\u001bP\u000f\u0013W9UcYZ&0\b|\f\rj\u000b$\u0005UStǍXɊ\u0007Ԅ\u07baxraL\u0019+lO\u0018z\u00107G)\u000e9C9Im\u0002oA\u0019\\A\u0014\r\u001d 3\u0001\u001d(qS<k[ø\u0013ʦPĸҨD=V\\R{K|\u001cvr\u0004:\u0004^J.:,\u001b<'==k;3!\u001a\u0005vO\u0018z\u0013q\u0001S\u0018d\u000fdj\u0004$JB\u000f\u001c\\Td3n~_\u001f³Oݬ\u001b\u0381Θ\u0002\b!4%mJ6=\u0012dN\u0017\u007f\u001bQk\u0010=/\u0015>\nry%o9\rKeWq)yT\r\u0013mN\u0013\tf\u0001ZS:u\r,0N`j>\u0015,H\\*+2m\u0011L<21'|-J\u0019\u001dpb-\rm|\u0001\u0010-wc4\u0011\u000e<\u0001\u0019\u0003`\\\u001fvwzY,+gPRqWC?>W8gb\u0004iȻ=ϗ~øѨPGZ\u0014^8c$8\u001e*=a1S\u0012=)W[21SR\u000be\u007fTB+\t\u0014\u0012\u000fi\u0001^k\u0016\u0005\t,\u000f\u0006zUZ\u00170\"vrQ\u001a\u0015\u000e\u007faT\u0005_kd\rk>wy\u0019XjY~!ā\u001f -\u0001u9Ņ9Y"}, d2 = {"\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7B}/Iw#4#", "", "/cS\u0013T0ES\u0018e\u0005`\u0019|\u0015?e\u000e7", "", "@d`BX:M", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7C~!>q\u001f.:CG{4,$>", "uKR<`uLb\u0015\u000e\tb.F\u00058d\r2\u007f?\u000f\u0016\u001d\u0011]\u001d8\u000639[g!8t\u001a7M0;wD\u001e#w7 \rm;Uz0\u0011JX9fb\u0002A\u001d\u0012hW,5\u0016\u0014]J4jS;)\u0011\u0002\rh@d\u0012\b_\u00151sr\f@\rLy\u0013\u0005\u0017", "/oX\u001db:M:#\u0001\t", "/oX", "", "0nSFF;KW\"\u0001", "3uT;g:\u001c])\b\n", "4`[9U(<Y\t\f\u0002l", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3S(mN<M#\u0016aW5/\u001b\u0014/(*xS>#\u0011uG\fHr\u0011\u001b\u001a\u00175x: `\u0019V}\u001e\u0006=8lPb5=.FAs&.\u0013[&^\u0004$!\u0019q\u0017*>", "/oX\u001fX;Kgyz~e,{o9g\u000e", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011\u007f\u001d@}n\u001c]\f/\rT\u001c8\\J?t}\u001c\u001fukI\u0016g5N\u0005p%VW;`[\u00039#\u0016d\u0017$ns\nUR 8K3(\nu3~@h~\u001bk", "4h[AX9/O \u0003yE6~\u0017", "/k[", "1ta?X5MB\u001d\u0007z", "", "5dc T=>R\u007f\t|l", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "7mXA\\(EW.~", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 $m$9WLIk\n", "CrT?", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7I\f DC", "Ah]0X\u001bB[\u0019", ";dc.W(MO", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`5~\nK\u0005)7A}/3l\u0012=I\u0019", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "1n]AX?M", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`%y\u0017Kv8DH\u0012+7C", "2hP4a6Lb\u001d|\t", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`&s\n>\u007f/Ch\u0002\u001eEC", "6`b5H:>R", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`*k\u001c?R,7c\u000b$Fp\u001e\u0004", ">qTC\\6Naw~\bb=|\b\u0010i\u007f/zN", "", "4t[96/>Q\u001f\r\u000bf", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}b>\u000b\u001f`U~\nK\u0005)7#y)6z 2LQ:q}\f$dpG\u000be\u001c\\v4\u001d3S(mN<D\u0010\u001b\\W55\u0016\u0007/(\"xL\u0001-\u0017(X\u0010?jJ\b\u001f\rBttAd\u000fMC\u0003\u0005=8vJ[GyV=D^9`aF#fIA(\u001d\u0005b\u0019r]8\u001a\u000bW\u001ar`CEqT#\u000bG(GmIDOzU\u0012[%)SE\u0006!.g\u0003/vv\u007f=)Cn\tJu\u0017D(V\u001f5kA:5%P\u001e?!JsvFWv.]\u0017\u001cf7z\u0015ndpR\u0013\u0006k\u0016a~@c|9[\u0010LXs\u00135\u001ce@e\u0002^\u0017\u0016 |sMEdP\n\u0019}N&^\u001f\u0002\t0z\u0018<\u0019\u0019`\u0011r7cFP\u001b^O=\b\rU\r%\u007fL\u001773nf-V)2\n\r\u0013(/T>@@R|\u0014\u001f6Vq\u0005'\u0003pF\u0003\u007f\u0011/2GiGfi/\u001911,\"v<%/)@\u0006\\ID\"^,\u0011\u000f\n2\u0004\u0011f@\u0002k0FIh1\u0012", ">n[996K1\u001cz\u0004`,\u000b", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", "\u001ab^:\":MO(\r~`ux\u0012.r\n,zN\u007f\u001d`+x\u0012Kz!<]\u0013 $m$9WLIkr\f%f_9\u0015q-^}\u000bPP]0XYvR\u0014~Z\u001cY5\u0016\u0013Y\u0017", "CoS.g,\"\\(~\bo(\u0004p=", "/mS?b0=\u001b'}\u0001X9|\u0010/a\u000e("}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public interface StatsigNetwork {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object apiPostLogs$default(StatsigNetwork statsigNetwork, String str, String str2, String str3, List list, Continuation continuation, int i2, Object obj) {
            String str4 = str3;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apiPostLogs");
            }
            if ((i2 + 4) - (4 | i2) != 0) {
                str4 = null;
            }
            return statsigNetwork.apiPostLogs(str, str2, str4, (-1) - (((-1) - i2) | ((-1) - 8)) == 0 ? list : null, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object apiRetryFailedLogs$default(StatsigNetwork statsigNetwork, String str, List list, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: apiRetryFailedLogs");
            }
            if ((i2 & 2) != 0) {
                list = null;
            }
            return statsigNetwork.apiRetryFailedLogs(str, list, continuation);
        }

        public static /* synthetic */ Object initialize$default(StatsigNetwork statsigNetwork, String str, StatsigUser statsigUser, Long l2, StatsigMetadata statsigMetadata, CoroutineScope coroutineScope, ContextType contextType, Diagnostics diagnostics, HashAlgorithm hashAlgorithm, Map map, String str2, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initialize");
            }
            if ((i2 + 64) - (i2 | 64) != 0) {
                diagnostics = null;
            }
            return statsigNetwork.initialize(str, statsigUser, l2, statsigMetadata, coroutineScope, contextType, diagnostics, hashAlgorithm, map, str2, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow pollForChanges$default(StatsigNetwork statsigNetwork, String str, StatsigUser statsigUser, StatsigMetadata statsigMetadata, long j2, List list, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pollForChanges");
            }
            if ((8 & i2) != 0) {
                j2 = StatsigLoggerKt.FLUSH_TIMER_MS;
            }
            if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
                list = null;
            }
            return statsigNetwork.pollForChanges(str, statsigUser, statsigMetadata, j2, list);
        }
    }

    Object addFailedLogRequest(StatsigOfflineRequest statsigOfflineRequest, Continuation<? super Unit> continuation);

    Object apiPostLogs(String str, String str2, String str3, List<String> list, Continuation<? super Unit> continuation);

    Object apiRetryFailedLogs(String str, List<String> list, Continuation<? super Unit> continuation);

    List<StatsigOfflineRequest> filterValidLogs(List<StatsigOfflineRequest> list, long j2);

    Object getSavedLogs(Continuation<? super List<StatsigOfflineRequest>> continuation);

    Object initialize(String str, StatsigUser statsigUser, Long l2, StatsigMetadata statsigMetadata, CoroutineScope coroutineScope, ContextType contextType, Diagnostics diagnostics, HashAlgorithm hashAlgorithm, Map<String, String> map, String str2, Continuation<? super InitializeResponse> continuation);

    Flow<InitializeResponse.SuccessfulInitializeResponse> pollForChanges(String str, StatsigUser statsigUser, StatsigMetadata statsigMetadata, long j2, List<String> list);
}
