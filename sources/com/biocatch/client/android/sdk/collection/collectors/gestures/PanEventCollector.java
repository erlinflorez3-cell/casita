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
import com.biocatch.client.android.sdk.wrappers.MotionEventFactory;
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
@Metadata(bv = {}, d1 = {"Яl\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$c$wCCU0}*\tUOog\u0005Jb\u000bI\u0010\u000e\u0016\u000fj4կ]xk\u0016\u00172HoG3[{E9fu>\u0005.;*8\u007f\u0005\t\u001a8H\u0018v\u0001CS\f 5Hp@T\u0013˟\u001b܅B\fN\"\u0011\u001e\u000bg|5xl\f;oF\u0013mPP?_^\u007f]\u0011TX?\r%f./N=M\u0015SZ\u0013\u000b`cW\u0003mzݘ\th51sW\u0002sNX.1E/]+urTpKQ)25Jgcyp>,\u0006\u0019\u0014\rj\u0018>\n5iF-Hz8\u0012A\u0017\u000bSns2bP$\u0013ad:k\u0014{1G@~Q\u0010[_b\u007f\u0002\u001336#/\u000fgo% n 3T&]g&\u0017חJݳ\u000e]Uo\n}p\u0010z\u0016>V\u0018/*!dk{ڲ]ޠ'%\u0004\u0004NUu\tUlv[\u0002RvIxÅ\u0018֖.\t\u0014ɮ\u0015r\u0013~hVn+?ar΄\u0013ą\f\u0013(οHH/:(N}~@җYύ\u000e%7ω\be|\u0003&Wgt\n̓]Ӓ\u0014aZΘdQJz\u001dX\u0015[\n`1ٹ*ϒ6L\u0003\u0012}\u0016Ri\\\u001f@C\n\u001cb1\bǌ^ČL\u0003&Փ\u0012\t\u0017erh>\u0006+՟&ғm$|էQ\\jr\bg'L\u0003ʌbĘ1AYځԐ*|"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[E\nW\u000b\u001e\u0005bP\u0002xK>\u001f\u0006;S\u000f\u0011", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[E\nW\u000b\u001e\u0005bP\fxC7&]", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[>xJ4l\u0016YJ3UHE.\b5I\u000f\u0011", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", ";nc6b5\u001ed\u0019\b\n?(z\u00189r\u0014", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5\u001c($lkBft,W\u0006\bCJ]6ifH", ">`]\u0012i,Gbx\u0007~m;|\u0016", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011NN:kb\u007f=\"[>xJ4l\u0016YJ3NL;.\u0017,VW", "1n^?W0GO(~\tF(\u000b\u000f3n\u0002\u0016{M\u0012\u001b\u0015G", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_6IQAo= ^FkC\u0014b0Wr6GZ6(jXvF\u0016\u007fZ\u001b_/\u000b\u0005/", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAz\u0016w=R?rBs{fkAP`0Xt#VJQuZYv=\u001d!$\nW*\u001a\u000f]@m|C=h\u001a9E\rFh\u000e\u001a_u?ytL_oXy\u001e\u0005\"%fUcl\u000e\u001d(Cl2.\tc'Z6I\"\u0017;\u0017\"lP7\u0019EO\u001aq_\u0004kf\u0011'y>m<wbMEmd@~0hI\u0006~\u00192V\u00045\u0002;M6*Ds\u0015Xg&\bBc\u00115<R'/E\u001c\u001bCZruy\u0014tf)iQ\u000bf?/\u0015tcf\u0012\u000b\u0010\\$e9`)~AZ\u000eHR}\u0014-\u0010|Lhy^\u0011\u00032siREd2\u000b$}C&h\r\u0012\u0003t\u007f\u0018<\u001cAb\u0011V*lHQ\u0011\t>{|", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "1ta?X5M5\u0019\r\nn9|v>a\r7", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "2w", "", "2x", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "7r=2j\u0017:\\", "", "2nf;8=>\\(", "=m?.a", "", "BqX4Z,K3*~\u0004m", "2hbAT5<S\f", "", "2hbAT5<S\r", "AsP?g", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class PanEventCollector extends ContinuousCollector<PanEventModel> implements IPanEventListener {
    private final CoordinatesMaskingService coordinatesMaskingService;
    private MotionEvent currentGestureStart;
    private double dx;
    private double dy;
    private final MotionEventFactory motionEventFactory;
    private final IPanEventEmitter panEventEmitter;
    private final Utils utils;

    public PanEventCollector(Utils utils, MotionEventFactory motionEventFactory, IPanEventEmitter panEventEmitter, CoordinatesMaskingService coordinatesMaskingService) {
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(motionEventFactory, "motionEventFactory");
        Intrinsics.checkNotNullParameter(panEventEmitter, "panEventEmitter");
        Intrinsics.checkNotNullParameter(coordinatesMaskingService, "coordinatesMaskingService");
        this.utils = utils;
        this.motionEventFactory = motionEventFactory;
        this.panEventEmitter = panEventEmitter;
        this.coordinatesMaskingService = coordinatesMaskingService;
    }

    private final boolean isNewPan(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.currentGestureStart;
        Intrinsics.checkNotNull(motionEvent2);
        if (motionEvent2.getEventTime() == motionEvent.getEventTime()) {
            MotionEvent motionEvent3 = this.currentGestureStart;
            Intrinsics.checkNotNull(motionEvent3);
            if (motionEvent3.getX() == motionEvent.getX()) {
                MotionEvent motionEvent4 = this.currentGestureStart;
                Intrinsics.checkNotNull(motionEvent4);
                if (motionEvent4.getY() == motionEvent.getY()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return CollectorID.PanEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return ConfigKeys.isPanEvents;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return "panEvents";
    }

    @Override // com.biocatch.client.android.sdk.collection.collectors.gestures.IPanEventListener
    public void onPan(MotionEvent downEvent, MotionEvent triggerEvent, float f2, float f3) {
        double d2;
        Intrinsics.checkNotNullParameter(downEvent, "downEvent");
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        try {
            if (this.currentGestureStart == null || isNewPan(downEvent)) {
                this.currentGestureStart = this.motionEventFactory.create(downEvent);
                this.dx = -f2;
                d2 = -f3;
            } else {
                this.dx -= (double) f2;
                d2 = this.dy - ((double) f3);
            }
            this.dy = d2;
            GestureLocation gestureLocationMaskGesture = this.coordinatesMaskingService.maskGesture(new GestureLocation(triggerEvent.getRawX(), triggerEvent.getRawY()));
            addToQueue(new PanEventModel(getContextIDCache().get(), getCurrentEventId(), this.utils.currentTimeMillis(), gestureLocationMaskGesture.getX(), gestureLocationMaskGesture.getY(), this.dx, this.dy));
        } catch (Throwable th) {
            Log.Companion.getLogger().error("error collecting pan event", th);
        }
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        if (isStarted()) {
            Log.Companion.getLogger().error("Pan events collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Pan events collector is already started. Aborting the start operation.");
        }
        this.panEventEmitter.setEventListener(this);
        setStarted(true);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        this.panEventEmitter.removeEventListener(this);
        setStarted(false);
    }
}
