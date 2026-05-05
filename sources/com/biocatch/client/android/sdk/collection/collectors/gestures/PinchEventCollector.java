package com.biocatch.client.android.sdk.collection.collectors.gestures;

import android.view.ScaleGestureDetector;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN.ZS@\u000fs{:%c$\bCCU ~*\t]ZogtKb\u000bQ\u0018\u000eǝ\u0001jBI]xc\u0012\u00172PoG3SpCʠvҚf\u000b0428(\u0005/\u0019ZH>w;V[\u0010 2XphU\u001dQ\u0013\u001e*\u0006l%Ә\"\\uT~VzpR/Q\u0017\u001aF\\<w0+cSZ\u001d5\u001b\u000ey\u001eYTg9#:k\u00035h\"SKM\u007fU\u001dhU@[M\u0002lNX.*[?\u0018\u0013k\r>\\3j' o1]~cP<A>\u000fL\u001fJ\u000b&\u0006UPd\u0002pǨ\nԧ7x\u000bUFY\u0010h\u0013\u0012\tlN\u0017S\fi\u007f\u0010ӬhЂe?1P=\t\u0013\u001bn/\u000fr9[\u0003\u00137ڀ\u001dƻ{Q9҅\u0011OV]\"Yk}:E9̺,˙4K\u00181\u0002\"<)uCi;;!\u001a\u0005\u001fֶiЛ\t`pׅ\u05c8Vd"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[E\u0012W)\u0010djA-}\"A&\u000f,G\u0011EuV", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[E\u0012W)\u0010djA-},A\u001e\b3\u001f", "\u001a`]1e6BRb\u0010~^>Fv-a\u0007(]@\u000f&'Tol<\u0006%3h\b-uW\u001f\u001cK?Bk\u0016\u001e#wqF\u0007J0\\\u0006'PL[\u0002", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "1n^?W0GO(~\tF(\u000b\u000f3n\u0002\u0016{M\u0012\u001b\u0015G", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_6IQAo= ^FkC\u0014b0Wr6GZ6(jXvF\u0016\u007fZ\u001b_/\u000b\u0005/", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAz\u0016w=R?rBs{fkAP`0Xt#VJQuX[qJ\u001e\u0016YWL5\u0015\rcJ2mJ\u0001\u001d\u00129IKCd\u000f\u0012\u001a\u001774NL`\u001dF}\u001eqP)v.Um\u007fKJGP*q\u001dc\u001b\\\u0010}\u0015", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "=mB0T3>", "", "2dc2V;H`", "\u001a`]1e6BRb\u0010~^>Fv-a\u0007(]@\u000f&'Tol<\u0006%3h\b-\r", "=mB0T3>0\u0019\u0001~g", "=mB0T3>3\"}", "", "AsP?g", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class PinchEventCollector extends ContinuousCollector<PinchEventModel> implements ScaleGestureDetector.OnScaleGestureListener {
    private final CoordinatesMaskingService coordinatesMaskingService;
    private final Utils utils;

    public PinchEventCollector(Utils utils, CoordinatesMaskingService coordinatesMaskingService) {
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(coordinatesMaskingService, "coordinatesMaskingService");
        this.utils = utils;
        this.coordinatesMaskingService = coordinatesMaskingService;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.PinchEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isPinchEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "pinchEvents";
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        try {
            float focusX = detector.getFocusX();
            float focusY = detector.getFocusY();
            float scaleFactor = detector.getScaleFactor();
            long currentEventId = getCurrentEventId();
            GestureLocation gestureLocationMaskGesture = this.coordinatesMaskingService.maskGesture(new GestureLocation(focusX, focusY));
            addToQueue(new PinchEventModel(getContextIDCache().get(), currentEventId, this.utils.currentTimeMillis(), gestureLocationMaskGesture.getX(), gestureLocationMaskGesture.getY(), scaleFactor));
        } catch (Throwable th) {
            Log.Companion.getLogger().error("error collecting pinch events", th);
        }
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        if (isStarted()) {
            Log.Companion.getLogger().error("Pinch events collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Pinch events collector is already started. Aborting the start operation.");
        }
        setStarted(true);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        setStarted(false);
    }
}
