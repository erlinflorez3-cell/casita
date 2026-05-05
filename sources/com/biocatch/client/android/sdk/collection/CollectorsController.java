package com.biocatch.client.android.sdk.collection;

import com.biocatch.android.commonsdk.collection.CollectionMode;
import com.biocatch.android.commonsdk.collection.CollectorRepository;
import com.biocatch.android.commonsdk.collection.CollectorService;
import com.biocatch.android.commonsdk.collection.collectors.Collector;
import com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.consent.ConsentRepository;
import com.biocatch.client.android.sdk.core.ApplicationCache;
import com.biocatch.client.android.sdk.core.lifecycle.State;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWNmgvJh\u0014KƤ\u000e\u0016\u000fj4կ]xk\u0012\u00172HoG3[{EʠhtD\u000b(݅*8\u0010\u0005\t\u001a0M\u0016͌\u0011ŏ{\f@/\u0001,JV\u001bM\u001d\u001a@\u0007N$\u000f tg|9Xpk>G#1nRR5eH|{\u0014VX5\u0015\u000faL4P;C\u001f=S1\u0012b_M\u000fWqk\u0012ص+'9W<eDg\u0018\u0014C;\u007f\u0011k\u0004>\\3c'\fo/]vcP<<@\u0017\n\"T\u0004<\u001aWL<C2f6%cx\u0001kXP0wr\u0004\t{N\u0017S\u001b{/G7~Q\u0010OaRE\u0019\u001d\rL$Ir/yl\u000e\u000f\u0016cX\u0006pIQnQ\u0011R\u0018yUm2q+\b8%HG.CB\u0011~#3As9Q,BȸJזkv\r\u009b9_wV`@Pslն,Á\u0010ZLߟUw^Vp,?Pr΄\tą\f\u0013(οHH/%(N}i@җOύ\u000e%7ω\be|s&Wgg\n̓SӒ\u0014aZΘdKJn\u001dX\u0015O*ۑ\\څ,\":ʋ;\u001c\u0006\u0002\\N:\u001a\tŰsʬ8,9ǉË\u0019j"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=grrh@\u0007a;X\u00045%VW;i\\yD\u0014\u001f0", "", "1n[9X*M]&lzk=\u0001\u0007/", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[d'T]R*\\(", "1n[9X*M]&kzi6\u000b\r>o\r<", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[c'RV\\0k\\\u007fQi", "1n[9X*MW#\bXh5\f\u00169l\\2wM\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=grrh@\u0007a;R\u00010%VW;i\\y\u001a\u001e\u000eg\r$", "2`c.;(Kd\u0019\r\n^9", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=gsdp5i_9_v5VL[\u0002", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "/o_9\\*:b\u001d\t\u0004<(z\f/", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016w)NFr8\u001c\u0011weC\u0010A(Ly'\u001d", "1n]@X5M@\u0019\n\u0005l0\f\u0013<y", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_,WLIk=-^FkB\u0015c5]c'RV\\0k\\\u007fQi", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAt\u001d.KR?u=grrh@\u0007a;X\u0004\u0015GY_0ZRH$\u0012\u001cbWK/\u0017\u0003UP\"q\u000e3(\u00079S\u0006:2~\u0016\u001e\u0016?s~A\\YE\u0004\u001c|A'wJchC%KLi*b\u001bi*I:E.\"u(%ud\u0004py]\u0019<O}qeC(x;m<t_FN~\u001f8}&,U\u007fv[@Wztr7\u000b;*4s\tUpa\u001ch\u007f\u001c,ZP+0?\u001a\u001dHZp\u007fs\u001b\u0018d,`]t`?9bbimF\u000b\u0016[\u001a%3hc\u0001@aO:Rn\"1J}\fix\u001bR\u0005.tlIA*X\u000b#:#\u001en\re~s)\u001c<%=fdO(i?\u0017\u0010\rr6\b\u000bWF^lQ\u000fzUvZ!m.>\u0001\u001bR/2Q\u0006t\\Lp\u0014\u0018D\u000e\u0007\u000e!}r\fW@\u001c&)?iE^o3\u0015p@\"$qF .7>\u0016('lh\u007fp\u0012\u0002\u0018fx$[A\u0002\u007f:EIs1\u0006_T\u0004IdV\u000fu[\u00145*r O[=\u0011Uy\u0015\u0004\u0002'\b\u0017&5\u0004qE\"gp\u0016d\u0016\u0014Sl!9\u0019|gL\u0019\u0017\u000fwGU$\u0002Zx\u0003\u001a*Nr\u001eZ\u007f/\r8XUvh1\u0012\u0007b\u0006;g\u0001WmC\t!*P~\u0006\u0013Z\u0015#T%h*O;]", "7r?2a+B\\\u001b\\\u0005g:|\u0012>", "", "1n[9X*M]&", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VU3\\P\u0002G!g", "=m2<a-BU)\fvm0\u0007\u0012\u0016o{'{?", "", "=m2<a:>\\(l\nZ;\r\u0017\rh{1}@\u007f", "1n]@X5MB-\nz", "", "1n]@X5MA(z\nn:", "", "AcZ g(MS", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wTG<k22\u0013oa\u0003tr(]v|", "=mB1^\u0017:c'~y", "=mB1^\u0019>a)\u0007z]", "=mB1^\u001aMO&\u000e~g.", "=mB1^\u001aM]$\nz]", "=mB2f:B]\"l\nZ9\f\t.", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class CollectorsController {
    private final ApplicationCache applicationCache;
    private final CollectionControlBoard collectionControlBoard;
    private final CollectorRepository collectorRepository;
    private final CollectorService collectorService;
    private final ConfigurationRepository configurationRepository;
    private final ConsentRepository consentRepository;
    private final DataHarvester dataHarvester;

    public CollectorsController(CollectorService collectorService, CollectorRepository collectorRepository, CollectionControlBoard collectionControlBoard, DataHarvester dataHarvester, ConfigurationRepository configurationRepository, ApplicationCache applicationCache, ConsentRepository consentRepository) {
        Intrinsics.checkNotNullParameter(collectorService, "collectorService");
        Intrinsics.checkNotNullParameter(collectorRepository, "collectorRepository");
        Intrinsics.checkNotNullParameter(collectionControlBoard, "collectionControlBoard");
        Intrinsics.checkNotNullParameter(dataHarvester, "dataHarvester");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(applicationCache, "applicationCache");
        Intrinsics.checkNotNullParameter(consentRepository, "consentRepository");
        this.collectorService = collectorService;
        this.collectorRepository = collectorRepository;
        this.collectionControlBoard = collectionControlBoard;
        this.dataHarvester = dataHarvester;
        this.configurationRepository = configurationRepository;
        this.applicationCache = applicationCache;
        this.consentRepository = consentRepository;
    }

    private final boolean isPendingConsent(Collector collector) throws Throwable {
        String requiredConsent = this.collectorService.getRequiredConsent(collector);
        return (requiredConsent == null || this.consentRepository.getConsentStatus(this.applicationCache.get(), requiredConsent) == 1) ? false : true;
    }

    private final void stop() {
        for (Collector collector : this.collectorRepository.getAll()) {
            if (collector instanceof ContinuousCollector) {
                this.collectorService.stopCollector((ContinuousCollector) collector);
            }
        }
        this.dataHarvester.stop();
    }

    public final void onConfigurationLoaded() {
        ArrayList<Collector> arrayList = new ArrayList();
        for (Collector collector : this.collectorRepository.getAll()) {
            if (this.collectorService.isCollectorEnabled(collector)) {
                collector.configure(this.configurationRepository);
            } else {
                if (collector instanceof ContinuousCollector) {
                    this.collectorService.stopCollector((ContinuousCollector) collector);
                }
                arrayList.add(collector);
            }
        }
        for (Collector collector2 : arrayList) {
            this.collectionControlBoard.unregister(collector2.getCollectorID());
            this.collectorRepository.remove(collector2);
        }
    }

    public final void onConsentStatusChanged(String consentType, int i2, State sdkState) {
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        Intrinsics.checkNotNullParameter(sdkState, "sdkState");
        if (sdkState == State.STARTING || sdkState == State.STARTED) {
            for (Collector collector : this.collectorRepository.getAll()) {
                if (Intrinsics.areEqual(collector.getCollectorID().getConsent(), consentType) && i2 == 1 && this.collectorService.isCollectorEnabled(collector)) {
                    if ((collector instanceof ContinuousCollector) && (collector.getCollectorID().getCollectionMode() == CollectionMode.Continuous || sdkState == State.STARTED)) {
                        this.collectorService.startCollector((ContinuousCollector) collector);
                    }
                    if (sdkState == State.STARTED) {
                        this.collectionControlBoard.markPending(collector.getCollectorID());
                    }
                }
            }
        }
    }

    public final void onSdkPaused() {
        stop();
    }

    public final CollectorService onSdkResumed() throws Throwable {
        CollectorService collectorService = this.collectorService;
        for (Collector collector : this.collectorRepository.getAll()) {
            if ((collector instanceof ContinuousCollector) && collectorService.isCollectorEnabled(collector) && !isPendingConsent(collector)) {
                collectorService.startCollector((ContinuousCollector) collector);
            }
        }
        this.dataHarvester.start();
        return collectorService;
    }

    public final CollectorService onSdkStarting() {
        CollectorService collectorService = this.collectorService;
        for (Collector collector : this.collectorRepository.getAll()) {
            if ((collector instanceof ContinuousCollector) && collectorService.isCollectorEnabled(collector) && !isPendingConsent(collector) && collector.getCollectorID().getCollectionMode() == CollectionMode.Continuous) {
                collectorService.startCollector((ContinuousCollector) collector);
            }
        }
        return collectorService;
    }

    public final void onSdkStopped() {
        stop();
    }

    public final CollectorService onSessionStarted() {
        CollectorService collectorService = this.collectorService;
        for (Collector collector : this.collectorRepository.getAll()) {
            if (collectorService.isCollectorEnabled(collector) && !isPendingConsent(collector)) {
                if (collector instanceof ContinuousCollector) {
                    collectorService.startCollector((ContinuousCollector) collector);
                }
                this.collectionControlBoard.markPending(collector.getCollectorID());
            }
        }
        this.dataHarvester.start();
        return collectorService;
    }
}
