package com.biocatch.android.commonsdk.di;

import com.biocatch.android.commonsdk.collection.DataQueueFactory;
import com.biocatch.android.commonsdk.collection.DataQueueRepository;
import com.biocatch.android.commonsdk.collection.DataQueueService;
import com.biocatch.android.commonsdk.collection.focusManager.FocusManagerImpl;
import com.biocatch.android.commonsdk.collection.focusManager.IFocusManager;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.core.consent.ConsentRepository;
import com.biocatch.android.commonsdk.core.context.ContextIDCacheImpl;
import com.biocatch.android.commonsdk.core.context.IContextIDCache;
import com.biocatch.android.commonsdk.core.masking.CoordinatesMaskingService;
import com.biocatch.android.commonsdk.core.masking.TextMaskingService;
import com.biocatch.android.commonsdk.wrappers.JsonFactory;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001̓4Ikxe\u0012\u00153JoU3UoC:htL\u0005(2(9\u007fڎ\u0017ɝZH>u;Fƚ\u0010\u0012>@9@`!e\u0005H\u0015LRh\u0007,q\u007fNdM3q\u000351\u0019\u0002B|>&DES\u001b^l';}(2sFEN-%\u0002\u0010Mf$E\u0011Y\n=3\u0004m;sO\u0002sNX.%[?\u0018\u0013k\u0010>\\3d' w=]dcV\u001e*\bz*\u0010j\u0006dͽ)ρ2-\"ǑX Ax\u000bYPR\u0012^p\u0005)c\rА1ő7+Aӕ7coA1TG}\u0015\rL*/pwſV\u05f8d\u0015#ƘHc?YXCXP\u001aYkv2r9̦,˙4G\b\u07fcL#<!==k;3!\u001a\rvF>ϻ\u0007¾lSqɭ\u0019R0z.=:\u000b\u001cZrq3m'ӼZ¯\u0015M$\u0381W\u0010\u0016!8b\b>1%>]}j@җOύ\u000e%7ω\bk|{&]I`C5\u007ft>c)Λ\u0016͖@b\r֚7Ta\u001erb8$BH\u0019#&}\u001b\u008b\u000eƱ6?yʉ٢0O"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#|$\u0001K 6UMDO=#\u0015fpC\u0014G4Y}|", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#|$\u0001K 6UMDO=#\u0015fpC\u00149", "u(E", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "1n]@X5M@\u0019\n\u0005l0\f\u0013<y", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_,WLIk=-^FkB\u0015c5]c'RV\\0k\\\u007fQi", "1n^?W0GO(~\tF(\u000b\u000f3n\u0002\u0016{M\u0012\u001b\u0015G", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_6IQAo= ^FkC\u0014b0Wr6GZ6(jXvF\u0016\u007fZ\u001b_/\u000b\u0005/", "2`c.D<>c\u0019_v\\;\u0007\u0016C", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<NW#E[X9p(", "2`c.D<>c\u0019kzi6\u000b\r>o\r<", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<Nc'RV\\0k\\\u007fQi", "2`c.D<>c\u0019lzk=\u0001\u0007/", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<Nd'T]R*\\(", "8r^;9(<b#\f\u000f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0010-3x!.ZQ\u0005PB(\u001eI]7\u0016m9bL", "BdgA@(LY\u001d\b|L,\n\u001a3c\u007f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_6IQAo= ^WaL\u0016K(\\|+PN<,icv;\u0014g", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", ">q^C\\+>1#\b{b.\r\u0016+t\u00042\u0005-\u0001\"!Us\u001dF\u00049", ">q^C\\+>1#\b\t^5\fu/p\n6\u007fO\u000b$+", ">q^C\\+>1#\b\n^?\fl\u000eC{&~@", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_,WLJkG-^L?C\u0010r,a\u0006\u000b&*J*_RH", ">q^C\\+>1#\t\b]0\u0006\u0005>e\u000e\u0010wN\u0007\u001b I]\u000eI\b)3Y", ">q^C\\+>2\u0015\u000evJ<|\u0019/S\u007f5\rD~\u0017", ">q^C\\+>4#|\u000bl\u0014x\u0012+g\u007f5", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001f\u001ffqGn_5Jx'T\u00162\rfP\u0003K{\u000ec\nP+\u001aZ", ">q^C\\+>B\u0019\u0012\nF(\u000b\u000f3n\u0002\u0016{M\u0012\u001b\u0015G", ">q^C\\+>C(\u0003\u0002l", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class CommonInjectorImpl implements CommonInjector {
    private final Lazy<DataQueueFactory> dataQueueFactory = LazyKt.lazy(new Function0<DataQueueFactory>() { // from class: com.biocatch.android.commonsdk.di.CommonInjectorImpl$dataQueueFactory$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final DataQueueFactory invoke() {
            return new DataQueueFactory();
        }
    });
    private final Lazy<DataQueueRepository> dataQueueRepository = LazyKt.lazy(new Function0<DataQueueRepository>() { // from class: com.biocatch.android.commonsdk.di.CommonInjectorImpl$dataQueueRepository$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final DataQueueRepository invoke() {
            return new DataQueueRepository();
        }
    });
    private final Lazy<DataQueueService> dataQueueService = LazyKt.lazy(new Function0<DataQueueService>() { // from class: com.biocatch.android.commonsdk.di.CommonInjectorImpl$dataQueueService$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final DataQueueService invoke() {
            return new DataQueueService((DataQueueFactory) this.this$0.dataQueueFactory.getValue(), (DataQueueRepository) this.this$0.dataQueueRepository.getValue());
        }
    });
    private final Lazy<JsonFactory> jsonFactory = LazyKt.lazy(new Function0<JsonFactory>() { // from class: com.biocatch.android.commonsdk.di.CommonInjectorImpl$jsonFactory$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final JsonFactory invoke() {
            return new JsonFactory();
        }
    });
    private final Lazy<ConfigurationRepository> configurationRepository = LazyKt.lazy(new Function0<ConfigurationRepository>() { // from class: com.biocatch.android.commonsdk.di.CommonInjectorImpl$configurationRepository$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ConfigurationRepository invoke() {
            return new ConfigurationRepository((JsonFactory) this.this$0.jsonFactory.getValue());
        }
    });
    private final Lazy<CoordinatesMaskingService> coordinatesMaskingService = LazyKt.lazy(new Function0<CoordinatesMaskingService>() { // from class: com.biocatch.android.commonsdk.di.CommonInjectorImpl$coordinatesMaskingService$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CoordinatesMaskingService invoke() {
            return new CoordinatesMaskingService((ConfigurationRepository) this.this$0.configurationRepository.getValue());
        }
    });
    private final Lazy<Utils> utils = LazyKt.lazy(new Function0<Utils>() { // from class: com.biocatch.android.commonsdk.di.CommonInjectorImpl$utils$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Utils invoke() {
            return new Utils();
        }
    });
    private final Lazy<TextMaskingService> textMaskingService = LazyKt.lazy(new Function0<TextMaskingService>() { // from class: com.biocatch.android.commonsdk.di.CommonInjectorImpl$textMaskingService$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TextMaskingService invoke() {
            return new TextMaskingService((ConfigurationRepository) this.this$0.configurationRepository.getValue(), (Utils) this.this$0.utils.getValue());
        }
    });
    private Lazy<ConsentRepository> consentRepository = LazyKt.lazy(new Function0<ConsentRepository>() { // from class: com.biocatch.android.commonsdk.di.CommonInjectorImpl$consentRepository$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ConsentRepository invoke() {
            return new ConsentRepository();
        }
    });

    @Override // com.biocatch.android.commonsdk.di.CommonInjector
    public ConfigurationRepository provideConfigurationRepository() {
        return this.configurationRepository.getValue();
    }

    @Override // com.biocatch.android.commonsdk.di.CommonInjector
    public ConsentRepository provideConsentRepository() {
        return this.consentRepository.getValue();
    }

    @Override // com.biocatch.android.commonsdk.di.CommonInjector
    public IContextIDCache provideContextIDCache() {
        return ContextIDCacheImpl.INSTANCE;
    }

    @Override // com.biocatch.android.commonsdk.di.CommonInjector
    public CoordinatesMaskingService provideCoordinatesMaskingService() {
        return this.coordinatesMaskingService.getValue();
    }

    @Override // com.biocatch.android.commonsdk.di.CommonInjector
    public DataQueueService provideDataQueueService() {
        return this.dataQueueService.getValue();
    }

    @Override // com.biocatch.android.commonsdk.di.CommonInjector
    public IFocusManager provideFocusManager() {
        return FocusManagerImpl.INSTANCE;
    }

    @Override // com.biocatch.android.commonsdk.di.CommonInjector
    public TextMaskingService provideTextMaskingService() {
        return this.textMaskingService.getValue();
    }

    @Override // com.biocatch.android.commonsdk.di.CommonInjector
    public Utils provideUtils() {
        return this.utils.getValue();
    }
}
