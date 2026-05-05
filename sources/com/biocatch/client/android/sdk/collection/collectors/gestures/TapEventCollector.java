package com.biocatch.client.android.sdk.collection.collectors.gestures;

import android.view.MotionEvent;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector;
import com.biocatch.android.commonsdk.collection.collectors.gestures.GestureLocation;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.core.masking.CoordinatesMaskingService;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000fq{<$q$yCAV\"}8\tWNmhvJh\u0017K\u000f\f\u0017\u0001j:I]ތe\u0012%2JoE4SڎSʠ\u0011zF\u000702P8(\u00041\u001aXIP\u0012\u000bGY\u000e*0nsJV\u001bQ\u001d\u001a@\u000bN$\u000f$tg|=Ղp]H7k\u0011wWf'\u000eF-Q\u001b]l';\u000f(2sFEN-%\u0002\u0019Mf$E\u0011Y\n=3~m;{[\u0002`NX.\u001eK\u007f&լ_ę*`\u001dSf\u001757 uY]&(&\t2a\u0013Ǡ\u0010Ν+LF/ u\u0016\u001e\u0004\u0001\u0001YXP0e\u0019Ș|ˋ:\u0017-Į\u0004=G,~Q\u0010MO#\u000e\u07bd\u0007ڟ\"'\u0019p'nb\"1!)X\u0010Q_V\u0017׃Jݳ\u000eYEЧT|p\u0004B\u0004^JV߿} 2\u0017-ڛ٬=>"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[I\nY\u000b\u001e\u0005bP\u0002xK>\u001f\u0006;S\u000f\u0011", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[I\nY\u000b\u001e\u0005bP\fxC7&]", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[>|J6l\u0016YJ3UHE.\b5I\u000f\u0011", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "B`_\u0012i,Gbx\u0007~m;|\u0016", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[>|J6l\u0016YJ3NL;.\u0017,VW", "1n^?W0GO(~\tF(\u000b\u000f3n\u0002\u0016{M\u0012\u001b\u0015G", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_6IQAo= ^FkC\u0014b0Wr6GZ6(jXvF\u0016\u007fZ\u001b_/\u000b\u0005/", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAz\u0016w=R?rBs{fkAP`0Xt#VJQuZYv=\u001d!$\nW*\u001a\u000f]@m|C=h\u00066P\t;f\u0010\u0010 \u0017~hzI]\u0010E\t\u001f\u0003OrjFgn\nTAS,\u000eS\bj|m:C3sy\u001d*wP;_bQ\u001bz\u001cvkqE\u0015\n6'\bidERyY;>%)S\u0004\u0002\u001b@Wztr7\u00114s>`\u0013Qk!@(V\u001f6i@+/2K\u0013M3_\u0004rB\u0017j\ra\u0015\u001ff31n)V", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "=mC.c", "", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "AsP?g", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class TapEventCollector extends ContinuousCollector<TapEventModel> implements ITapEventListener {
    private final CoordinatesMaskingService coordinatesMaskingService;
    private final ITapEventEmitter tapEventEmitter;
    private final Utils utils;

    public TapEventCollector(Utils utils, ITapEventEmitter tapEventEmitter, CoordinatesMaskingService coordinatesMaskingService) {
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(tapEventEmitter, "tapEventEmitter");
        Intrinsics.checkNotNullParameter(coordinatesMaskingService, "coordinatesMaskingService");
        this.utils = utils;
        this.tapEventEmitter = tapEventEmitter;
        this.coordinatesMaskingService = coordinatesMaskingService;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.TapEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isTapEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "tapEvents";
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.gestures.ITapEventListener
    public void onTap(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            long currentEventId = getCurrentEventId();
            long jCurrentTimeMillis = this.utils.currentTimeMillis();
            GestureLocation gestureLocationMaskGesture = this.coordinatesMaskingService.maskGesture(new GestureLocation(event.getRawX(), event.getRawY()));
            addToQueue(new TapEventModel(getContextIDCache().get(), currentEventId, jCurrentTimeMillis, gestureLocationMaskGesture.getX(), gestureLocationMaskGesture.getY()));
        } catch (Throwable th) {
            Log.Companion.getLogger().error("error collecting tap event", th);
        }
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        if (isStarted()) {
            Log.Companion.getLogger().error("Tap events collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Tap events collector is already started. Aborting the start operation.");
        }
        this.tapEventEmitter.setEventListener(this);
        setStarted(true);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        this.tapEventEmitter.removeEventListener(this);
        setStarted(false);
    }
}
