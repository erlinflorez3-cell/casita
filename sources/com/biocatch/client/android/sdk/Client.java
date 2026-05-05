package com.biocatch.client.android.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.biocatch.android.commonsdk.collection.collectors.Collector;
import com.biocatch.android.commonsdk.contract.exceptions.InvalidOperationException;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.logging.LogcatClient;
import com.biocatch.android.commonsdk.logging.ServerLogClient;
import com.biocatch.client.android.sdk.collection.DataHarvester;
import com.biocatch.client.android.sdk.contract.BCConsentStatus;
import com.biocatch.client.android.sdk.contract.BCConsentType;
import com.biocatch.client.android.sdk.contract.BCProtocolType;
import com.biocatch.client.android.sdk.contract.ExtendedOptions;
import com.biocatch.client.android.sdk.contract.LogClientEx;
import com.biocatch.client.android.sdk.contract.LogLevel;
import com.biocatch.client.android.sdk.contract.events.IEventListener;
import com.biocatch.client.android.sdk.contract.exceptions.IncompleteGroupException;
import com.biocatch.client.android.sdk.contract.exceptions.InvalidCustomerIDException;
import com.biocatch.client.android.sdk.contract.exceptions.InvalidCustomerSessionIDException;
import com.biocatch.client.android.sdk.contract.exceptions.InvalidServerURLFormatException;
import com.biocatch.client.android.sdk.contract.exceptions.InvalidStateException;
import com.biocatch.client.android.sdk.contract.exceptions.InvalidThreadException;
import com.biocatch.client.android.sdk.contract.exceptions.LibraryAlreadyStartedException;
import com.biocatch.client.android.sdk.contract.exceptions.LibraryAlreadyStoppedException;
import com.biocatch.client.android.sdk.contract.exceptions.LibraryNotInitializedException;
import com.biocatch.client.android.sdk.contract.exceptions.OperationFailedException;
import com.biocatch.client.android.sdk.contract.externalCollectors.group.ExternalCollectorsGroupService;
import com.biocatch.client.android.sdk.core.SystemBootstrapper;
import com.biocatch.client.android.sdk.core.brand.BrandService;
import com.biocatch.client.android.sdk.core.context.ContextService;
import com.biocatch.client.android.sdk.core.exceptions.SDKException;
import com.biocatch.client.android.sdk.core.lifecycle.State;
import com.biocatch.client.android.sdk.core.lifecycle.StateService;
import com.biocatch.client.android.sdk.core.masking.CoordinatesMaskingConfigurationUpdater;
import com.biocatch.client.android.sdk.core.session.CsidService;
import com.biocatch.client.android.sdk.core.session.SessionService;
import com.biocatch.client.android.sdk.di.SdkInjectorKt;
import com.biocatch.client.android.sdk.techicalServices.MainThreadVerifier;
import com.biocatch.client.android.sdk.techicalServices.URLBuilder;
import com.biocatch.client.android.sdk.techicalServices.URLFields;
import com.biocatch.client.android.sdk.techicalServices.URLFieldsExtractor;
import com.biocatch.client.android.sdk.techicalServices.events.ClientEventService;
import com.biocatch.client.android.sdk.techicalServices.mappers.ExtendedOptionsMapper;
import com.biocatch.client.android.sdk.techicalServices.mappers.LogLevelMapper;
import com.biocatch.client.android.sdk.techicalServices.mappers.StateMapper;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
@Metadata(bv = {}, d1 = {"Яĵ\u0014D57\u001eq\u007fR܀kt\nA\u000e0!.Jչ*,(w\u000f߿r9FDm߉6Ri*\u0017ӆ\u00044:[,ڎK;k\u001a\u0006̝\u0011OdgoñRZ\u0019L\u0017إ\u001ex\u0001,Qǁ\u0001](\u000f:ԏw?AYw=?a|6\u001b :Ĳ@y\u001b\u0001\"*N\u0011~zYK\u0014۵8@\u0007:Z҈U\u0005(\u0012\u000ē(\u00014\\oN<Vt]P/+ɅqBd'g0\u0003M\u0015Fj'\u0015vg\u001f3@ES\u001d%i\u0003\u000fRaB\u000b?\b=\rؒ/'AI{Ɏ>X\u0016\u0014\u001d+U\u000ecö<ؘ#\u001f\u0011\fU*\bb\u0019\u0011\u0011߭{z\n\r\u0005\u0010\u001c)?H\\QJj\u00163Kt!y\t\\\u0010\u0006Z\u007f)\u0006f\u001b3(K+g1/Wod1Ne K\rf'\u000f\u00199[\u00032)\u0019)\u007f\u0010Q_u\tIVz\"Yk\u00124tp'B\u0004^mH3\n>F\u0017S[$E1O\u0004\u0002vh\u0018z\u0013\u0010\u0001S\u0018h\u0011L0\u001f.7X-<^R\u0016\u001dk~d!8\u001f\u007f4T5\"8\u0017.\u0010\u0010<O;Xn]\u001d\u0002j{\u0002:)=\u001cOY\u001d\u0002>[G\u0015K5\u007f\u001b@gXv\"wTb3\u0012-G\u001c<h\u0011@\"`l\u001b\u0014\u00066\\N:)bC\u007fRL,_P\r\u001bV66DW{7u\u000bl\u001e7l3R<\u001a*\u0003D\u0019Rro\u001e$A\u0002:1x\"[e\u00029'`m\"\u0017J-'\u0015<\f\u007fu}|KZ#.u\u00043P\u001c(li1S\u0012=\u0015Y6\u0010e]L!\u001f\u0002S b\u0013~\u0010\u000ei%v:\u0016\u001f\t,\u000f\u000fzSbQ:v\r\tS\u000er>\u0012c\\yuy\u0005\u000fi{ar1olRF3\u001d\u001fL\\1u00M/Y&K,( 5\u0015o\u001d\u0002u>{r\u000fT6\u0014D\\g$(zQ\fkk>W\u0015\u0017@8#\u001b?\u000bZx: B7X=;NAr4n:c\n]\u0014-\ft\u0011~\u001bs:A\u0014FP<%Bsq\"DbQk)M\u0002/\u001eqY%#J=S;\u007f?9*\u001ckk\u001f]pUH\u0006\"<|A\fn\u0013=!$b.\u0013ލ\rͲXi\u000e؋K\fTb'\u0017`FJĬbոXxdƇ\u0019\u0011nJx!X\u0007U۳5\u038b|59܊>Rb6{2/[s͂\u001d˥S~nއ{PbB3(\u0007\u000baԸ_ƀM\u0002>ߤ\u00185{v\b\ff$S܋Dɓ\u001f9YΙ0\u0003>k#U\u0013\\;ɽ\u0014؉VN*ĖO\u0007\u000b\u001dT\n=\u001bo\u06dd~ƚf-TϕHCQ+\u0019\u0017r;]ќ\tސJ\u001b5ݢ\u00069K\\\u0003\u0014U\u0010.ĚG֞\f (ٴT\u0006/qo\u0010|\t\f1pZޭ\u001af\u001a\u000b\u0019g.\u001c~V\u0003\f\".6P&ב5ě\u0017^aŕH0NBCl4^\u0002-ǰ\u000eg\u0005etr\u0019!7=d\u0019\u0007-~=_\u07b3Oܻ\u0017Xbϐa_.y)\u007fB7|̂Bʭf)\u0018˖ʓl?"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G}>q\u00167\\\u0019", "", "u(E", "0qP;W\u001a>`*\u0003x^", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wJP7t3gqu]B\u0006Q,[\b+EL$", "1kX2a;\u001ed\u0019\b\nL,\n\u001a3c\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G/7k\u00192K?BY4+&l_9\u0015-,_v0VZ\u0018\ncVrF#qk\u000eW:z\u0005fR(lD\r", "1n]AX?MA\u0019\f\fb*|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wKMDz41$2?C\u0010r,a\u0006\u0015GY_0ZRH", "1n^?W0GO(~\tF(\u000b\u000f3n\u0002\u0006\u0006I\u0002\u001b\u0019W|\nKz/>I\t\u001f3|\u0016;", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wU?Iq8'\u00172?C\u0011p+R\u007f#VL\\\u0014X`xA\u001d\u00148\u0018W,\u0011\u0007iN }HA(w7H}Jh\u000ea", "1rX1F,Kd\u001d|z", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w[CIy8(\u001e2?G\u000bb\u001aN\u00048KJN\u0002", "2`c.;(Kd\u0019\r\n^9", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=gsdp5i_9_v5VL[\u0002", "3wc2e5:Zv\t\u0002e,z\u00189r\u000e\n\tJ\u0011\"\u0005G|\u001f@t%", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<?!\u001cj\u0019\u0018\u000b \u0014YN-jK\u0015)\u000f3I\u007fJr\u000e\u001aw\u001b?z{0V\u001dX}\u0013u\u0017", "7r36f7Ha\u0019}", "", ":nV0T;\u001cZ\u001d~\u0004m", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\"u6\u001c\u0011w?@\u000bc5]L", "AdaCX9%]\u001b\\\u0002b,\u0006\u0018", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r)kA/\u0015uHC\tA3Rv0V\"", "Adb@\\6G7w", "", "5dc X:LW#\b^=", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adb@\\6GA\u0019\f\fb*|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w[CIy8(\u001e2O9\u0015q0X\u007f\u0015GY_0ZRH", "AsPAX", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\"-\u0011wa\u000f", "5dc g(MS", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k 7\\P7iCg\u0003w]H\u00079", "AsPAX\u001a>`*\u0003x^", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wTG<k22\u0013oa\u0003tr(]v\u0015GY_0ZRH", "AxbAX4\u001b]#\u000e\tm9x\u0014:e\r", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w;WIz4&qrkH\u0015r9J\u00022GY$", "/cS\u0012i,Gb\u007f\u0003\tm,\u0006\t<", "", "3uT;g\u0013Ba(~\u0004^9", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ54/\u0015qpGPG\f_v0V3R:kR{=!g", "1gP;Z,\u001c]\"\u000ezq;", "1n]AX?M<\u0015\u0007z", "2hb=b:>", "4kd@[", ">`d@X", "@d\\<i,\u001ed\u0019\b\nE0\u000b\u0018/n\u007f5", "@dbB`,", "Adc\u000fe(GR", "0qP;W\u0015:[\u0019", "Adc\u0010b6KR\u001d\bvm,\u000bp+s\u0006,\u0005B", "7r4;T)ES\u0018", "Adc\u0010h:M]!~\bL,\u000b\u00173o\t\fZ", "1tbAb4>`\u0007~\tl0\u0007\u0012\u0013D", "AsP?g", "Et_ X9OS&", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "3wc2a+>R\u0003\n\nb6\u0006\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u00141$hj8\u0007b\u0016Y\u0006+QU\\\u0002", "Et_ X9OS&ngE", "1ta?X5M/\u0017\u000e~o0\f\u001d", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "1hS", ":nV X9OS&_~q,{x<l", "3wc2e5:Zv\t\u0002e,z\u00189r\u000e", "", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VU3\\P\u0002G!g", "AsP?g\u0015>e\u0007~\tl0\u0007\u0012", "1rX1", "As^=", "CoS.g,\u001c]\"\rzg;j\u0018+t\u00106", "1n]@X5MB-\nz", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u0011{rrjG\u0007l;=\u000b2G\"", "1n]@X5MA(z\nn:", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u0011{rrjG\u0007l;<\u0006#V\\\\\u0002", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Dda6Y@,g'\u000ezf\u0010\u000br:e\r$\u000bD\u000b \u0013N", "\u0011n\\=T5B]\"", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class Client {
    public static final Companion Companion = new Companion(null);
    private final BrandService brandService;
    private final ContextService contextService;
    private final CoordinatesMaskingConfigurationUpdater coordinatesMaskingConfigurationUpdater;
    private final CsidService csidService;
    private final DataHarvester dataHarvester;
    private final ExternalCollectorsGroupService externalCollectorsGroupService;
    private boolean isDisposed;
    private LogcatClient logcatClient;
    private final SessionService sessionService;
    private final StateService stateService;
    private SystemBootstrapper systemBootstrapper;
    private ClientEventService clientEventService = new ClientEventService();
    private ServerLogClient serverLogClient = new ServerLogClient();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#4\u0012\u0006\u0007nʑA0ZeP.XS2\u000f\u0002{<$a%w٘<kڼ.\"7N\u000flmnН^\u000bQ\u000fN\"\u0007oDI\u0004~\u000e\u0016\u001d9Zom;\u0016{KBxtd\u000bP60B\u0012\u0005/%rT\u001e\u0003\u0013Cy\u0012B4NzRR;XM\u001e \u0013V /$-v\\7`l\f<egɨmFf)e3\u000bQϞJb"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G}>q\u00167\\\u0002\u0019u<)\u0011qeC\u00109", "", "u(E", "Dda@\\6G", "", "5dc#X9LW#\b", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0019b.%S*~\u0002", "", ":nV\u0019X=>Z", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u001b(\u0017OaJ\u0007j\u0002", "AtQ@V9BP\u0019e\u0005`\n\u0004\r/n\u000f", ":nV\u0010_0>\\(^\u000e", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ5\u001b(\u0017Fh=\u0007l;.\n|", "CmbBU:<`\u001d{zE6~f6i\u007f1\u000b", "Dda6Y@&O\u001d\bia9|\u0005.", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getVersion() throws InvalidThreadException {
            verifyMainThread();
            return BuildConfig.VERSION_NAME;
        }

        public final void setLogLevel(LogLevel logLevel) throws InvalidThreadException {
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            verifyMainThread();
            try {
                Log.Companion.getLogger().setLevel(LogLevelMapper.INSTANCE.map(logLevel));
            } catch (Exception e2) {
                Log.Companion.getLogger().error("Failed setting the log level.", e2);
                throw new OperationFailedException("Failed setting the log level. See logs for additional info", null, 2, null);
            }
        }

        public final void subscribeLogClient(LogClientEx logClientEx) throws InvalidThreadException, OperationFailedException {
            Intrinsics.checkNotNullParameter(logClientEx, "logClientEx");
            verifyMainThread();
            try {
                Log.Companion.subscribeLogClient(logClientEx);
            } catch (Exception e2) {
                Log.Companion.getLogger().error("Failed subscribing log client", e2);
                throw new OperationFailedException("Failed subscribing log client", null, 2, null);
            }
        }

        public final void unsubscribeLogClient(LogClientEx logClientEx) throws InvalidThreadException, OperationFailedException {
            Intrinsics.checkNotNullParameter(logClientEx, "logClientEx");
            verifyMainThread();
            try {
                Log.Companion.unsubscribeLogClient(logClientEx);
            } catch (Exception e2) {
                Log.Companion.getLogger().error("Failed unsubscribing log client", e2);
                throw new OperationFailedException("Failed unsubscribing log client", null, 2, null);
            }
        }

        public final void verifyMainThread() throws InvalidThreadException {
            try {
                MainThreadVerifier.verify();
            } catch (com.biocatch.client.android.sdk.core.exceptions.InvalidThreadException e2) {
                throw new InvalidThreadException(e2.getMessage(), null, 2, null);
            }
        }
    }

    public Client() {
        LogcatClient logcatClient = new LogcatClient();
        this.logcatClient = logcatClient;
        Log.Companion.subscribeLogClient(this.serverLogClient, logcatClient);
        SystemBootstrapper systemBootstrapper = new SystemBootstrapper(this.clientEventService, this.serverLogClient);
        this.systemBootstrapper = systemBootstrapper;
        this.stateService = systemBootstrapper.getStateService();
        this.sessionService = this.systemBootstrapper.getSessionService();
        this.csidService = this.systemBootstrapper.getCsidService();
        this.contextService = this.systemBootstrapper.getContextService();
        this.dataHarvester = this.systemBootstrapper.getDataHarvester();
        this.coordinatesMaskingConfigurationUpdater = this.systemBootstrapper.getCoordinatesMaskingConfigurationUpdater();
        this.brandService = this.systemBootstrapper.getBrandService();
        this.externalCollectorsGroupService = this.systemBootstrapper.getGroupService();
    }

    private final void dispose() {
        this.systemBootstrapper.stop();
        this.clientEventService.clear();
        this.isDisposed = true;
    }

    public static /* synthetic */ void start$default(Client client, String str, Application application, ExtendedOptions extendedOptions, int i2, Object obj) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidThreadException, InvalidServerURLFormatException, OperationFailedException, LibraryAlreadyStartedException {
        if ((i2 & 4) != 0) {
            extendedOptions = new ExtendedOptions();
        }
        client.start(str, application, extendedOptions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void start$default(Client client, String str, String str2, String str3, Application application, String str4, List list, ExtendedOptions extendedOptions, Activity activity, int i2, Object obj) throws LibraryAlreadyStoppedException, InvalidThreadException, InvalidServerURLFormatException, IncompleteGroupException, OperationFailedException, LibraryAlreadyStartedException {
        if ((i2 + 32) - (i2 | 32) != 0) {
            list = CollectionsKt.emptyList();
        }
        client.start(str, str2, str3, application, str4, list, extendedOptions, activity);
    }

    public static /* synthetic */ void startNewSession$default(Client client, String str, int i2, Object obj) throws LibraryNotInitializedException, InvalidCustomerSessionIDException, InvalidThreadException, OperationFailedException {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = null;
        }
        client.startNewSession(str);
    }

    private final void verifySystemIsOperational() throws LibraryNotInitializedException, InvalidStateException {
        if (this.stateService.getState() == State.STOPPED) {
            throw new LibraryNotInitializedException("Library is not initialized. Call the start method", null, 2, null);
        }
        if (this.stateService.getState() == State.FAULTED) {
            throw new InvalidStateException("Library is in a faulted state", null, 2, null);
        }
    }

    public final void addEventListener(IEventListener eventListener) throws InvalidThreadException, SDKException, OperationFailedException {
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Companion.verifyMainThread();
        try {
            this.clientEventService.subscribe(eventListener);
        } catch (Exception e2) {
            Log.Companion.getLogger().error("Failed adding an event listener.", e2);
            throw new OperationFailedException("Failed adding an event listener. See logs for additional info", null, 2, null);
        }
    }

    public final void changeContext(String contextName) throws LibraryNotInitializedException, InvalidThreadException, SDKException, OperationFailedException {
        Intrinsics.checkNotNullParameter(contextName, "contextName");
        Companion.verifyMainThread();
        verifySystemIsOperational();
        try {
            this.contextService.changeContext(contextName);
        } catch (Exception e2) {
            Log.Companion.getLogger().error("Failed changing context to " + contextName + '.', e2);
            throw new OperationFailedException("Failed changing context to " + contextName + ". See logs for additional info", null, 2, null);
        }
    }

    public final void flush() throws LibraryNotInitializedException, InvalidThreadException, SDKException, OperationFailedException {
        Companion.verifyMainThread();
        verifySystemIsOperational();
        try {
            this.dataHarvester.triggerHarvest();
            Log.Companion.getLogger().info("Flushed collected data");
        } catch (Exception e2) {
            Log.Companion.getLogger().error("Failed flushing collected data.", e2);
            throw new OperationFailedException("Failed flushing collected data. See logs for additional info", null, 2, null);
        }
    }

    public final String getSessionID() throws LibraryNotInitializedException, InvalidThreadException, SDKException {
        Companion.verifyMainThread();
        return this.sessionService.getSessionID();
    }

    public final com.biocatch.client.android.sdk.contract.State getState() throws LibraryNotInitializedException, InvalidThreadException, OperationFailedException {
        Companion.verifyMainThread();
        try {
            return StateMapper.INSTANCE.map(this.stateService.getState());
        } catch (Exception e2) {
            Log.Companion.getLogger().error("Failed getting current state.", e2);
            throw new OperationFailedException("Failed getting current state. See logs for additional info", null, 2, null);
        }
    }

    public final void pause() throws LibraryNotInitializedException, InvalidStateException, InvalidThreadException, OperationFailedException {
        Companion.verifyMainThread();
        verifySystemIsOperational();
        if (this.stateService.getState() == State.PAUSED) {
            return;
        }
        if (this.stateService.getState() != State.STARTED) {
            throw new InvalidStateException("Unable to pause since we are not in a started state", null, 2, null);
        }
        try {
            this.stateService.pause();
            Log.Companion.getLogger().info("Paused the SDK");
        } catch (Exception e2) {
            Log.Companion.getLogger().error("Failed pausing the SDK.", e2);
            throw new OperationFailedException("Failed pausing the SDK. See logs for additional info", null, 2, null);
        }
    }

    public final void removeEventListener(IEventListener eventListener) throws InvalidThreadException, SDKException, OperationFailedException {
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Companion.verifyMainThread();
        try {
            this.clientEventService.unsubscribe(eventListener);
        } catch (Exception e2) {
            Log.Companion.getLogger().error("Failed removing an event listener.", e2);
            throw new OperationFailedException("Failed removing an event listener. See logs for additional info", null, 2, null);
        }
    }

    public final void resume() throws LibraryNotInitializedException, InvalidStateException, InvalidThreadException, OperationFailedException {
        Companion.verifyMainThread();
        verifySystemIsOperational();
        if (this.stateService.getState() == State.STARTED) {
            return;
        }
        if (this.stateService.getState() != State.PAUSED) {
            throw new InvalidStateException("Unable to resume since we are not in a paused state", null, 2, null);
        }
        try {
            this.stateService.resume();
            Log.Companion.getLogger().info("Resumed the SDK");
        } catch (Exception e2) {
            Log.Companion.getLogger().error("Failed resuming the SDK.", e2);
            throw new OperationFailedException("Failed resuming the SDK. See logs for additional info", null, 2, null);
        }
    }

    public final void setBrand(String brandName) throws LibraryNotInitializedException, InvalidThreadException, SDKException, OperationFailedException {
        Intrinsics.checkNotNullParameter(brandName, "brandName");
        Companion.verifyMainThread();
        verifySystemIsOperational();
        try {
            this.brandService.setBrand(brandName);
        } catch (Exception e2) {
            Log.Companion.getLogger().error("Failed setting brand to " + brandName + '.', e2);
            throw new OperationFailedException("Failed setting brand to " + brandName + ". See logs for additional info", null, 2, null);
        }
    }

    public final void setCoordinatesMasking(boolean z2) throws LibraryNotInitializedException, InvalidThreadException, SDKException, OperationFailedException {
        Companion.verifyMainThread();
        if (this.stateService.getState() != State.STARTED) {
            return;
        }
        verifySystemIsOperational();
        try {
            this.coordinatesMaskingConfigurationUpdater.updateConfig(z2);
        } catch (Exception e2) {
            Log.Companion.getLogger().error("Failed to start coordinates masking.", e2);
            throw new OperationFailedException("Failed to start coordinates masking. See logs for additional info", null, 2, null);
        }
    }

    public final void setCustomerSessionID(String customerSessionID) throws LibraryNotInitializedException, InvalidCustomerSessionIDException, InvalidThreadException, SDKException, OperationFailedException {
        Intrinsics.checkNotNullParameter(customerSessionID, "customerSessionID");
        Companion.verifyMainThread();
        verifySystemIsOperational();
        if (customerSessionID.length() == 0) {
            throw new InvalidCustomerSessionIDException("Customer session ID cannot be empty", null, 2, null);
        }
        try {
            this.csidService.set(customerSessionID);
        } catch (Exception e2) {
            Log.Companion.getLogger().error("Failed updating the customer session ID.", e2);
            throw new OperationFailedException("Failed updating the customer session ID. See logs for additional info", null, 2, null);
        }
    }

    @Deprecated(message = "\u0010K\u0010=\u0001xT`k\u0007,\u007f`'1Q]`\u000e+Di\u001aV6]wvZ4&k(^iO\\rm=\u0006 Ly\u0017dP91^\b\r5\u0010\u0004_K<'IZw@\u0016w\u001e}80T\u0014\u0001\u001d/\r\u0010P\u001fC\u000e\u000176Dgt<Wi")
    @InterfaceC1492Gx
    public final void start(String wupServer, Application application, ExtendedOptions extendedOptions) throws InvalidOperationException, InvalidStateException, LibraryAlreadyStoppedException, InvalidThreadException, InvalidServerURLFormatException, OperationFailedException, LibraryAlreadyStartedException {
        Intrinsics.checkNotNullParameter(wupServer, "wupServer");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(extendedOptions, "extendedOptions");
        BioCatchClient.start$default(BioCatchClient.INSTANCE, wupServer, application, null, extendedOptions, null, 16, null);
    }

    public final void start(String wupServerURL, Application application, String str, ExtendedOptions extendedOptions, Activity activity) throws com.biocatch.client.android.sdk.core.exceptions.InvalidThreadException, InvalidStateException, LibraryAlreadyStoppedException, InvalidServerURLFormatException, OperationFailedException, LibraryAlreadyStartedException {
        Intrinsics.checkNotNullParameter(wupServerURL, "wupServerURL");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(extendedOptions, "extendedOptions");
        try {
            URLFields uRLFieldsExtract = URLFieldsExtractor.INSTANCE.extract(wupServerURL);
            start$default(this, uRLFieldsExtract.getServerURL(), null, uRLFieldsExtract.getCid(), application, str, null, extendedOptions, activity, 32, null);
        } catch (Exception e2) {
            Log.Companion.getLogger().error("Unable to start the SDK. the Wup Server URL has an invalid structure", e2);
            throw new InvalidServerURLFormatException("Invalid Server URL structure. " + e2.getMessage(), null, 2, null);
        }
    }

    public final void start(String wupServerURL, String cid, Application application, String str, ExtendedOptions extendedOptions, Activity activity) throws LibraryAlreadyStoppedException, InvalidThreadException, InvalidServerURLFormatException, IncompleteGroupException, OperationFailedException, LibraryAlreadyStartedException {
        Intrinsics.checkNotNullParameter(wupServerURL, "wupServerURL");
        Intrinsics.checkNotNullParameter(cid, "cid");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(extendedOptions, "extendedOptions");
        start$default(this, wupServerURL, null, cid, application, str, null, extendedOptions, activity, 32, null);
    }

    public final void start(String wupServerURL, String str, String cid, Application application, String str2, List<? extends Collector> externalCollectors, ExtendedOptions extendedOptions, Activity activity) throws LibraryAlreadyStoppedException, InvalidThreadException, InvalidServerURLFormatException, IncompleteGroupException, OperationFailedException, LibraryAlreadyStartedException {
        Intrinsics.checkNotNullParameter(wupServerURL, "wupServerURL");
        Intrinsics.checkNotNullParameter(cid, "cid");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(externalCollectors, "externalCollectors");
        Intrinsics.checkNotNullParameter(extendedOptions, "extendedOptions");
        Companion.verifyMainThread();
        Log.Companion companion = Log.Companion;
        companion.getLogger().info("Starting the SDK");
        if (this.isDisposed) {
            throw new LibraryAlreadyStoppedException("Client library was stopped and cannot be reused", null, 2, null);
        }
        if (this.stateService.getState() != State.STOPPED) {
            companion.getLogger().error("Unable to start the SDK. Its already started");
            throw new LibraryAlreadyStartedException("Client library is already started", null, 2, null);
        }
        if (cid.length() == 0) {
            companion.getLogger().error("Unable to start the SDK. Customer Identifier is empty.");
            throw new InvalidCustomerIDException("Invalid customer identifier. Field must contain a non empty value", null, 2, null);
        }
        try {
            URLBuilder uRLBuilder = URLBuilder.INSTANCE;
            BCProtocolType protocolType = extendedOptions.getProtocolType();
            Intrinsics.checkNotNullExpressionValue(protocolType, "extendedOptions.protocolType");
            String strBuild = uRLBuilder.build(wupServerURL, protocolType, cid);
            List<String> invalidGroupList = this.externalCollectorsGroupService.getInvalidGroupList(externalCollectors);
            if (!invalidGroupList.isEmpty()) {
                companion.getLogger().error("Unable to start the SDK. Required external collectors are missing in: " + invalidGroupList + " groups");
                throw new IncompleteGroupException("Incomplete groups - In Groups: " + invalidGroupList + " external collectors are missing", null, 2, null);
            }
            try {
                this.systemBootstrapper.start(strBuild, str, cid, str2, externalCollectors, ExtendedOptionsMapper.INSTANCE.map(extendedOptions), application, activity);
            } catch (Exception e2) {
                Log.Companion.getLogger().critical("Failed starting the SDK.", e2);
                dispose();
                throw new OperationFailedException("Failed starting the SDK. See logs for additional info", e2);
            }
        } catch (Exception e3) {
            Log.Companion.getLogger().error("Unable to start the SDK. the Wup Server URL has an invalid structure", e3);
            throw new InvalidServerURLFormatException("Invalid Server URL structure. " + e3.getMessage(), null, 2, null);
        }
    }

    public final void startNewSession() throws LibraryNotInitializedException, InvalidCustomerSessionIDException, InvalidThreadException, OperationFailedException {
        startNewSession$default(this, null, 1, null);
    }

    public final void startNewSession(String str) throws LibraryNotInitializedException, InvalidCustomerSessionIDException, InvalidThreadException, OperationFailedException {
        Companion.verifyMainThread();
        verifySystemIsOperational();
        Log.Companion.getLogger().info("Starting a new session");
        try {
            this.sessionService.startNewSession(str);
        } catch (Exception e2) {
            Log.Companion.getLogger().error("Failed resetting the session.", e2);
            throw new OperationFailedException("Failed starting a new session. See logs for additional info", null, 2, null);
        }
    }

    public final void stop() throws LibraryNotInitializedException, InvalidThreadException, OperationFailedException {
        Companion.verifyMainThread();
        if (this.stateService.getState() == State.STOPPED) {
            return;
        }
        try {
            dispose();
            Log.Companion.getLogger().info("SDK is stopped");
        } catch (Exception e2) {
            Log.Companion.getLogger().critical("Failed stopping the SDK.", e2);
            throw new OperationFailedException("Failed stopping the SDK. See logs for additional info", null, 2, null);
        }
    }

    public final void updateConsentStatus(BCConsentType consentType, BCConsentStatus consentStatus, Context context) {
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        Intrinsics.checkNotNullParameter(consentStatus, "consentStatus");
        Intrinsics.checkNotNullParameter(context, "context");
        SdkInjectorKt.getSdkInjector().provideConsentRepository().updateConsentStatus(context, consentType.getType(), consentStatus.getStatus());
    }
}
