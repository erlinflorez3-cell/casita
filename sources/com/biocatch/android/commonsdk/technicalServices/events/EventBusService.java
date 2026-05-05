package com.biocatch.android.commonsdk.technicalServices.events;

import com.biocatch.android.commonsdk.events.IEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0012\u007fјnjO0LeN.ZS8şs{:$qҕ\"CiTZ\t2\r]N\u007fg\u001dKҼ\u000fC\u001d\b^\u0007x/aU'aB\u0013@G\b?aS6Q\u0002n\u0003=\u001d `&h}\u0013\t2*v\u0019=\u000f\fY\u001a\u001cH@\u001f>\u0003\u0011[\r2\u00124Gf\u0015nhuNNH\u001b^\u0011ǅ%ɨmBVϋۨ4\b"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\u0010<crF#nj\u001c<+\u001a\u0016]?$D", "3uT;g\tNa", "\u001ana4\".KS\u0019\b\bh)\u0007\u0018xe\u0011(\u0005O}'%\u0011O\u001f<\u007f4\u0012i\fu", "uK^?Zu@`\u0019~\u0004k6y\u0013>/\u007f9{I\u0010\u0014'U9mMv.D6\u000e.\r1\u0007", ">tQ9\\:A", "", "3uT;g", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#}17v%<\u0017'\u001b|4'$>", "AtQ@V9BP\u0019", "AtQ@V9BP\u0019\f", "", "CmbBU:<`\u001d{z", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class EventBusService implements IEventBusService {
    private final EventBus eventBus;

    public EventBusService(EventBus eventBus) {
        Intrinsics.checkNotNullParameter(eventBus, "eventBus");
        this.eventBus = eventBus;
    }

    @Override // com.biocatch.android.commonsdk.technicalServices.events.IEventBusService
    public void publish(IEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.eventBus.post(event);
    }

    @Override // com.biocatch.android.commonsdk.technicalServices.events.IEventBusService
    public void subscribe(Object subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        if (this.eventBus.isRegistered(subscriber)) {
            return;
        }
        this.eventBus.register(subscriber);
    }

    @Override // com.biocatch.android.commonsdk.technicalServices.events.IEventBusService
    public void unsubscribe(Object subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        if (this.eventBus.isRegistered(subscriber)) {
            this.eventBus.unregister(subscriber);
        }
    }
}
