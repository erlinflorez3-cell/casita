package com.biocatch.client.android.sdk.di;

import com.biocatch.android.commonsdk.collection.DataQueueService;
import com.biocatch.android.commonsdk.collection.focusManager.IFocusManager;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.core.consent.ConsentRepository;
import com.biocatch.android.commonsdk.core.context.IContextIDCache;
import com.biocatch.android.commonsdk.core.masking.CoordinatesMaskingService;
import com.biocatch.android.commonsdk.core.masking.TextMaskingService;
import com.biocatch.android.commonsdk.di.CommonInjector;
import com.biocatch.client.android.sdk.collection.collectors.elements.ReactNativeWorkaroundService;
import com.biocatch.client.android.sdk.core.hash.HashService;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<řc$\bCC٥\"}8\tWȞog\u0005JbŏK\u000f\u001c\u0016\u0001j2L]xs\u0012\u0017˰JoU3UڎSʠ\u0011td\u0004`5ŕ<y\u0013\u0001b1V\u0016\u000fzqRR܌/\twHZ%M3#Xö=h\b,f\u007fNdS3Ү9w*\u0011uZNUlvžLUMb5%v\u0010-q¿6}\u001c3c\u001b\u0007\u0001l\u0006Ÿ>:H\u0013z?'YL:Ɏ͏\\\u007f\u001a(sZ\u001bq\u000b&\u000b\n\u0018ӠВ++Ux\u0014W\u001c>\u0010z*$\u0003Ǡ\rN.VFE\u001a\u0015!TޮsCeNQ\u001adR\u0002\u000bad\u001aS\u0002\nڂ;ӸjQiݢi`E\u007f\u001d\u0013.%\u0011nO`\u0003\u00107ڀ\u001dƻ{Q9҅͞Ab"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001f;7\u0004-S'Dp4\u001c$rn\u000f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#|$\u0001K 6UMDO=#\u0015fpC\u00149", "u(E", "6`b5F,Kd\u001d|z", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wP?In}\u0001\u0011vd'\u0007p=Rt'\u001d", "@dP0g\u0015:b\u001d\u0010zP6\n\u000f+r\n8\u0005?n\u0017$Xs\f<", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[G\u000eJ)\u001cmUP(\u007fD))\u00152E\u000fEx\n\u000b\u0004\u000eB{t@Ve", ">q^C\\+>1#\b{b.\r\u0016+t\u00042\u0005-\u0001\"!Us\u001dF\u00049", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", ">q^C\\+>1#\b\t^5\fu/p\n6\u007fO\u000b$+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_,WLIk=-^FkB\u0015c5]c'RV\\0k\\\u007fQi", ">q^C\\+>1#\b\n^?\fl\u000eC{&~@", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_,WLJkG-^L?C\u0010r,a\u0006\u000b&*J*_RH", ">q^C\\+>1#\t\b]0\u0006\u0005>e\u000e\u0010wN\u0007\u001b I]\u000eI\b)3Y", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_6IQAo= ^FkC\u0014b0Wr6GZ6(jXvF\u0016\u007fZ\u001b_/\u000b\u0005/", ">q^C\\+>2\u0015\u000evJ<|\u0019/S\u007f5\rD~\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<Nd'T]R*\\(", ">q^C\\+>4#|\u000bl\u0014x\u0012+g\u007f5", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001f\u001ffqGn_5Jx'T\u00162\rfP\u0003K{\u000ec\nP+\u001aZ", ">q^C\\+>6\u0015\r}L,\n\u001a3c\u007f", ">q^C\\+>6\u0015\r}L,\n\u001a3c\u007ff\n?\u0007\u0011dA=\b\u0007px\u0003*w-7t\u0016*[C", ">q^C\\+>@\u0019zxm\u0015x\u00183v\u007f\u001a\u0006M\u0007\u0013$Q\u007f\u0017;d%Bj\u0002\u001e7", ">q^C\\+>@\u0019zxm\u0015x\u00183v\u007f\u001a\u0006M\u0007\u0013$Q\u007f\u0017;d%Bj\u0002\u001e7,$-S=\te\u0002\u0018_b5\u0007W]9N}'CZN", ">q^C\\+>B\u0019\u0012\nF(\u000b\u000f3n\u0002\u0016{M\u0012\u001b\u0015G", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_6IQAo= ^WaL\u0016K(\\|+PN<,icv;\u0014g", ">q^C\\+>C(\u0003\u0002l", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class SdkInjector implements CommonInjector {
    private final /* synthetic */ CommonInjector $$delegate_0 = com.biocatch.android.commonsdk.di.SdkInjectorKt.getCommonInjector();
    private final Lazy<HashService> hashService = LazyKt.lazy(new Function0<HashService>() { // from class: com.biocatch.client.android.sdk.di.SdkInjector$hashService$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final HashService invoke() {
            return new HashService();
        }
    });
    private final Lazy<ReactNativeWorkaroundService> reactNativeWorkaroundService = LazyKt.lazy(new Function0<ReactNativeWorkaroundService>() { // from class: com.biocatch.client.android.sdk.di.SdkInjector$reactNativeWorkaroundService$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ReactNativeWorkaroundService invoke() {
            return new ReactNativeWorkaroundService();
        }
    });

    @Override // com.biocatch.android.commonsdk.di.CommonInjector
    public ConfigurationRepository provideConfigurationRepository() {
        return this.$$delegate_0.provideConfigurationRepository();
    }

    @Override // com.biocatch.android.commonsdk.di.CommonInjector
    public ConsentRepository provideConsentRepository() {
        return this.$$delegate_0.provideConsentRepository();
    }

    @Override // com.biocatch.android.commonsdk.di.CommonInjector
    public IContextIDCache provideContextIDCache() {
        return this.$$delegate_0.provideContextIDCache();
    }

    @Override // com.biocatch.android.commonsdk.di.CommonInjector
    public CoordinatesMaskingService provideCoordinatesMaskingService() {
        return this.$$delegate_0.provideCoordinatesMaskingService();
    }

    @Override // com.biocatch.android.commonsdk.di.CommonInjector
    public DataQueueService provideDataQueueService() {
        return this.$$delegate_0.provideDataQueueService();
    }

    @Override // com.biocatch.android.commonsdk.di.CommonInjector
    public IFocusManager provideFocusManager() {
        return this.$$delegate_0.provideFocusManager();
    }

    public final HashService provideHashService$sdk_3_3_0_936_release() {
        return this.hashService.getValue();
    }

    public final ReactNativeWorkaroundService provideReactNativeWorkaroundService$sdk_3_3_0_936_release() {
        return this.reactNativeWorkaroundService.getValue();
    }

    @Override // com.biocatch.android.commonsdk.di.CommonInjector
    public TextMaskingService provideTextMaskingService() {
        return this.$$delegate_0.provideTextMaskingService();
    }

    @Override // com.biocatch.android.commonsdk.di.CommonInjector
    public Utils provideUtils() {
        return this.$$delegate_0.provideUtils();
    }
}
