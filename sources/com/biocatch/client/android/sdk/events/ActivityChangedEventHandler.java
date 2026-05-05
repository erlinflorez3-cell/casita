package com.biocatch.client.android.sdk.events;

import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.collection.collectors.elements.ElementsService;
import com.biocatch.client.android.sdk.core.context.ContextService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.XS2\u000fy\u0005<$a$yCIU\"}(\tUȞ}˧\u001fPj\rS\u000f4\u0016'ilde|k\u0013'2pqO7[rU9\u000fxF\t.7:8(\u000bв\u001e*V\u0017?\tQV$\u0012^L!>`\u001ae\u0005H\u0012LSp\r,_\u007fNdLCҚ<ǥ'\u0003qĩ\u001f3m1\u0015M;H+\u070e\u000fțe\u001e3¨\bA#*k\u00035X2έ\u0005ӭu=\rؒw99Q\fWda6TkۃQոav>^\u000bYn\u0016˕/]"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u0017iC\"&lpMdf(Wx'F,_,eaU9\u001d\u0011a\u000e[\u0001", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u001fKE\u001e\u001ewD5\u0010b3N\u0004|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u0017iC\"&lpMdf(Wx'F,_,eaH", "1n]AX?MA\u0019\f\fb*|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAz\u0016wKMDz41$2?C\u0010r,a\u0006\u0015GY_0ZRH", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "3kT:X5Ma\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[:\u0015N3\r\u000ehO\u0012nQH#\u0006,\u001f", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w#.\u0017AEtC\u001e(w+\u0017\u0011l;N\n65L[=`Pr\u0013z\u0010d\u0016\u0018(\u0011\u000fW=3lG\u0001\u001b\u0011+V\f?gJ\n \u0016=tyPU\u0016\u0011w\u001f~B-jVf[\tKKN,\bn\u0015`!^JG #u#$UP9\u0014\nW |_\u000e=NE#\u0003\u0002!BwYBTmX\u0006r.#K\u0005\u0007[.as8~1\u0003}85jNIq\u001fE^v$0fJp$@C\u001a?Ir\u007fyLWh&a\u0010\u000ekD?bElcP\u000f\u0010l%I5np\u00055R[\u0002:", "7r0Bg6\u001c]\"\u000ezq;\\\u0012+b\u0007(z", "", "u(I", "6`]1_,", "", "3uT;g", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ActivityChangedEventHandler implements IEventHandler<ActivityChangedEvent> {
    private final ConfigurationRepository configurationRepository;
    private final ContextService contextService;
    private final ElementsService elementsService;

    public ActivityChangedEventHandler(ContextService contextService, ConfigurationRepository configurationRepository, ElementsService elementsService) {
        Intrinsics.checkNotNullParameter(contextService, "contextService");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(elementsService, "elementsService");
        this.contextService = contextService;
        this.configurationRepository = configurationRepository;
        this.elementsService = elementsService;
    }

    private final boolean isAutoContextEnabled() {
        return this.configurationRepository.getBoolean(ConfigurationFields.enableAutoContext);
    }

    @Override // com.biocatch.client.android.sdk.events.IEventHandler
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void handle(ActivityChangedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Log.Companion.getLogger().debug("Activity has changed");
        if (isAutoContextEnabled()) {
            this.contextService.changeContext("cd_auto");
        }
        try {
            this.elementsService.processActivity(event.getActivity());
        } catch (Throwable th) {
            Log.Companion.getLogger().error("An error occurred while proccessing activity elements.", th);
        }
    }
}
