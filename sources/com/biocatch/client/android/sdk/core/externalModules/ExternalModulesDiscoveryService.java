package com.biocatch.client.android.sdk.core.externalModules;

import android.app.Activity;
import android.app.Application;
import com.biocatch.android.commonsdk.CommonSDK;
import com.biocatch.android.commonsdk.IBCFeature;
import com.biocatch.android.commonsdk.backend.CollectionItem;
import com.biocatch.android.commonsdk.collection.CollectorService;
import com.biocatch.android.commonsdk.collection.DataQueueService;
import com.biocatch.android.commonsdk.collection.focusManager.IFocusManager;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.context.IContextIDCache;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.web.GroupNameToCollectorIDMapper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
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
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWNmgvJp\u000bKƤ\u000e\u0016\u0007\u000e4Ikxe܈\u00172PoG\u074cUoS9htD#(288\u0002ڎ\t\u001a@H\u0018v\u0001CS\f <Hp@T\u0015M\u001b\u001a\u001aßDĨ\u0017Ȧ\rg|5\t(m>=#\u001bipO7c>~e\rtW7\u0011\u0005e6+n<E\u00193Y\u001b\u0007\u0001bO\u0007MyU\u0005\u001707/W}o6\u0007\u000b$\u00199[%]!3ػ\tQn\u001aoQ]wcP<=(~\n#T\u0004<\u001dWR<>2l\u0018\u0010Ct!lnh2dP\u001a\u0013cL\u0016S\u001by+\u0002?tmy;Gcg\u007f\u0013#6#/\u0006Qeb+x\u001b+V\bQ_onUxT\u0018sUo\u001ao\u0011\u001dr\u001e>f\u00185\f\u0013>\u0017SP\nQS+y\u001f`Jwx\u0015`\u0017q\u0018j\u000f@j\u0005$WB\t:oth\u0013\rhT\u0007JAQ*v\u001f}66f\\HH/+(N}o@җOύ\u000e%7ω\be|o&Wgc\n̓SӒ\u0014aZΘdKJn\u001dX\u0015O*ۑ\\څ,\":ʋ;\u001c\u0006{\\N:\u0014\tŰsʬ8,9ǉ-!V\u00126Bo\r_ݣfӳ\u0014~\\՜t\u000fw,\r\t/Y3ʜqς|I4ʉ1.;Ki5G1,ȫjط\u0001#\u000fѨD\u001cUxdW\\r&ye{&\u0017HLa1M\u0013=}WDXΒGʆveY˧b3\t~\u0012\u000fik\u0005ԙ\nϡt,hʄߣSx"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wMVJkA'\u0011oIC\u0006s3N\u0005p'_],i[nD{\u001cY\u001eU+\u001bc]O\"xU7,\u001c\u001aI\u000fLl~\fk", "", "2`c.D<>c\u0019lzk=\u0001\u0007/", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<Nd'T]R*\\(", "5q^Bc\u0015:[\u0019m\u0005<6\u0004\u0010/c\u000f2\t$_~\u0013Rz\u000eI", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_\u0010ZMKv\u001d\u001a\u001dhPCdm3Uv%VV[\u0010;:nH\u001f\u0012gc", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "1n[9X*M]&lzk=\u0001\u0007/", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[d'T]R*\\(", "3wc2e5:Z\u0001\tyn3|x>i\u00076", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wMVJkA'\u0011oIC\u0006s3N\u0005p'_],i[nD{\u001cY\u001eU+|\u0014]H2D", "4nRBf\u0014:\\\u0015\u0001zk", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001f\u001ffqGn_5Jx'T\u00162\rfP\u0003K{\u000ec\nP+\u001aZ", "1n]AX?M7w\\v\\/|", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_,WLJkG-^L?C\u0010r,a\u0006\u000b&*J*_RH", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAt\u001d.KR?u=gsdp5rs,^v\u0015GY_0ZRH$\u0012\u001cbWK/\u0017\u0003UP\"q\u000e5&\f,R\u0011\u0005d\n\u000b#\u00189i:PU\u0016\u0011\f\u0015r\u000b\u000buPijbCIEQ4B\u0016f$\\8I.!Uw\u0003d[9\n\t)wp\\\u00021dK#x43<p%BNnbFx&hI\u0006\u007f\u001a<a\u0003*zv\u0002>37h\u0007[t\u0014Mb\u0003\u001eu:K0':>#LGryvGzh*k\u0016\u0012q?>-;LaR\u0017PZ\u001be3]n~:\u001c\u0002GH|\u001f+EH@e\u0002\u001d\u0013\u00102lk\u0013A%[\b\u001anS&i\u001aL`p\u001f#.\u0014Lc\u001cV*lHQ\u0011\t>\u001f\n\u0006a\r\u0012tR\u000eiZp^!m+:x\u001aXj/T;\u0004\\GnY$3\u0007T|'\u0001i\fyI\"%2FU?Jj.\u001bnS0bGK+\u001f::}Y(x]\b.\u0015m\u001dl\u0004#3%6\f;\u000bFn,:_Z\u0003?$N\u0019+Z\u001f3_>\u0014Lc{?S|\r\u0006M)\u0003\u001a#,$\u0005K)pd0p\n\u001c\u0018W\u00198\u0017\u0003X[_1sxFX(eW8\u0001\u0012\"S>{J\u000b1\r7RRt\u001bB\u0006\u0001\u001e\u0002;WD\u0004g9D\u001f+I\u001a\u0010\u0011^\u0006%\u000f\u0019e#yAjX8pQ5\u001b>:\u001d WJ\u0015K/}_3Asn\u0003*(z", "3wc2e5:Z\u0001\tyn3|g+t{\u000bwI\u007f\u001e\u0017T", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wMVJkA'\u0011oIC\u0006s3N\u0005p'_],i[nD{\u001cY\u001eU+k\u0001h=\u0007jM6&\b9\u001f", "4nd;W\u0014HR)\u0006zl", "", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "7mXA\\(EW.~bh+\r\u0010/s", "", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wMVJkA'\u0011oIC\u0006s3N\u0005p'_],i[nD{\u001cY\u001eU+p\u000eZKy", "1ta?X5M/\u0017\u000e~o0\f\u001d", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", ":nP145=7\"\u0003\nb(\u0004\rDeg2zP\b\u0017%", "3wc2e5:Z\u0001\tyn3|\u0017", "", ":nP1@6=c ~\t", "=m=2j\u0014>a'z|^", "5q^Bc\u0015:[\u0019", "1n[9X*MW#\b^m,\u0005", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ExternalModulesDiscoveryService {
    private final CollectorService collectorService;
    private final ConfigurationRepository configurationRepository;
    private final IContextIDCache contextIDCache;
    private final DataQueueService dataQueueService;
    private ExternalModuleDataHandler externalModuleDataHandler;
    private final ExternalModuleUtils externalModuleUtils;
    private final IFocusManager focusManager;
    private final Map<Class<?>, Object> foundModules;
    private final GroupNameToCollectorIDMapper groupNameToCollectorIDMapper;

    public ExternalModulesDiscoveryService(DataQueueService dataQueueService, GroupNameToCollectorIDMapper groupNameToCollectorIDMapper, ConfigurationRepository configurationRepository, CollectorService collectorService, ExternalModuleUtils externalModuleUtils, IFocusManager focusManager, IContextIDCache contextIDCache) {
        Intrinsics.checkNotNullParameter(dataQueueService, "dataQueueService");
        Intrinsics.checkNotNullParameter(groupNameToCollectorIDMapper, "groupNameToCollectorIDMapper");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(collectorService, "collectorService");
        Intrinsics.checkNotNullParameter(externalModuleUtils, "externalModuleUtils");
        Intrinsics.checkNotNullParameter(focusManager, "focusManager");
        Intrinsics.checkNotNullParameter(contextIDCache, "contextIDCache");
        this.dataQueueService = dataQueueService;
        this.groupNameToCollectorIDMapper = groupNameToCollectorIDMapper;
        this.configurationRepository = configurationRepository;
        this.collectorService = collectorService;
        this.externalModuleUtils = externalModuleUtils;
        this.focusManager = focusManager;
        this.contextIDCache = contextIDCache;
        this.foundModules = new LinkedHashMap();
        this.externalModuleDataHandler = new ExternalModuleDataHandler(dataQueueService, groupNameToCollectorIDMapper);
    }

    private final void initializeModules(Application application, List<ExternalModuleInfo> list, Activity activity) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        for (ExternalModuleInfo externalModuleInfo : list) {
            if (this.foundModules.containsKey(externalModuleInfo.getModuleClass())) {
                Log.Companion.getLogger().debug("Module " + externalModuleInfo.getModuleClass() + " already initialized, skipping... ");
            } else {
                IBCFeature iBCFeatureTryCreateIBCFeatureInstance = this.externalModuleUtils.tryCreateIBCFeatureInstance(externalModuleInfo);
                if (iBCFeatureTryCreateIBCFeatureInstance != null) {
                    ExternalModuleUtils externalModuleUtils = this.externalModuleUtils;
                    String commonVersion = iBCFeatureTryCreateIBCFeatureInstance.getCommonVersion();
                    CommonSDK.Companion companion = CommonSDK.Companion;
                    if (externalModuleUtils.isVersionCompatible(commonVersion, companion.getVersion())) {
                        this.foundModules.put(iBCFeatureTryCreateIBCFeatureInstance.getClass(), iBCFeatureTryCreateIBCFeatureInstance);
                        List<Class<? extends IBCFeature>> listDependencies = iBCFeatureTryCreateIBCFeatureInstance.dependencies();
                        if (!listDependencies.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<T> it = listDependencies.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new ExternalModuleInfo((Class) it.next()));
                            }
                            Log.Companion.getLogger().debug("Found dependencies for " + externalModuleInfo.getModuleClass() + ". Initializing them first ");
                            initializeModules(application, arrayList, activity);
                        }
                        iBCFeatureTryCreateIBCFeatureInstance.onCreateModule(application, activity, this.configurationRepository, this.dataQueueService, this.collectorService, this.focusManager, this.contextIDCache, new Function2<String, CollectionItem, Unit>() { // from class: com.biocatch.client.android.sdk.core.externalModules.ExternalModulesDiscoveryService$initializeModules$1$2
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(String str, CollectionItem collectionItem) {
                                invoke2(str, collectionItem);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(String groupName, CollectionItem collectionItem) {
                                Intrinsics.checkNotNullParameter(groupName, "groupName");
                                Intrinsics.checkNotNullParameter(collectionItem, "collectionItem");
                                this.this$0.onNewMessage(groupName, collectionItem);
                            }
                        });
                    } else {
                        Log.Companion.getLogger().info("The version of common module for the external module: " + iBCFeatureTryCreateIBCFeatureInstance.getCommonVersion() + " is different than the version of common module of the sdk: " + companion.getVersion() + ". Cannot load External Module");
                    }
                }
            }
        }
    }

    private final List<ExternalModuleInfo> loadModules(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            try {
                ExternalModuleInfo externalModuleInfoCastToIBCFeature = this.externalModuleUtils.castToIBCFeature((String) it.next());
                if (externalModuleInfoCastToIBCFeature != null) {
                    arrayList.add(externalModuleInfoCastToIBCFeature);
                }
            } catch (Exception unused) {
                Log.Companion.getLogger().info("Couldn't load external module");
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNewMessage(String str, CollectionItem collectionItem) {
        Log.Companion.getLogger().debug("Collection Item from external module: " + collectionItem.toJSONArray() + ", for group: " + str);
        this.externalModuleDataHandler.handleExternalModuleMessage(str, collectionItem);
    }

    public final void loadAndInitializeModules(Application application, List<String> externalModules, Activity activity) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(externalModules, "externalModules");
        this.foundModules.clear();
        initializeModules(application, loadModules(externalModules), activity);
    }
}
