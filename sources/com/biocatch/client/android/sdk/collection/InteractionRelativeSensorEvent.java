package com.biocatch.client.android.sdk.collection;

import android.os.Handler;
import android.view.MotionEvent;
import com.biocatch.android.commonsdk.backend.CollectionItem;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.DataQueue;
import com.biocatch.android.commonsdk.configuration.ConfigurationDefaultValue;
import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.client.android.sdk.collection.collectors.sensors.InteractionSensorSettings;
import com.biocatch.client.android.sdk.events.EventsSubscriber;
import com.biocatch.client.android.sdk.events.IEventHandler;
import com.biocatch.client.android.sdk.events.interactionEvents.InteractionEvent;
import com.biocatch.client.android.sdk.events.interactionEvents.TouchEvent;
import kotlin.Metadata;
import kotlin.Unit;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
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
@Metadata(bv = {}, d1 = {"Я\u0001\u001d<K!&˛\bDZc|\u0004W\u00068\u000bDB\u0007\"B\u0012\u007fјnjO0L͜P.hS2şs{J$cҕyCQU\"Ԃ*\teNo˧vJp\u000bKƤ\u000e\u0016\u000fj4I[xe\u0012\u001d˰JģG3coE9fu>\u0005.;*\u0600\u0002\u0005\u000f 2Ϻ\u0018v\tOS\f\u0018;HpHR\u0015M\u000b\u001b\u001a\u0006T \t\u001ebiV6^le:5$\t\bX÷Oe6ŧ[\fnTU\r'aL,p=E\u00175S1\n\u0001]\u007f>OuK\t\u0001'U0Ywe<p\u007fB\u001c;S\u001be\u000b&\u000b\u000ead\u001a1CO\u0012V`\u00126\u0004\u0013{;I\u0014\u0012\u00145`.[)v\f\u001cC\rr\u0002Qг\u0006^P\u0012CmDB=\u007faWi\u001ft~y;GN\u007f\n\u0013;6#/\u001bQ_b=x\u0015I\u0005>ey_Nn`N8\u0006mq\u0012#z\u0002X\u0007v\\H5\nDF\u0017Sc\"9k1y6`D\u0016#5fv\u0006\u0002T^?P$\\7r\u000f\u001a\u0011\\d3\u0018\u0017h!2\u001f\u00054T5*N'ph\u0006O9%>b&řkҷQ]\u0012ɘ\u007fvEn\u0007k<m\u0010ӻ5̳Ug(cX\u000e\"W\rn\u0013f~B\u0002\u001b1٥*ϒ6HrݘH\bRR$\u0013`DHʌ6Ϝ5\u0019dé\u0019\u000f,[Y|7y1ӓ\u001cњX3,Ѱ:0\u0003$\u0019P\u000b\rF\u03a2\u0005ͅ0|hõ}M_E1&\u00043?ؗ~ɠ\u000b~{Ò\u0018yZddn,t\u0004\u001avګ\u001c\u07fcU3U\u0015\u0015\u001e7RR9ST\u000be\u007fVh\u0600|܃}\u000fCÜ~\u007f\u0016\f\t,\u000f\u0007!֧`Ђ&\u0003fа;\nj\"\b\u0005f|M\bb0,NW\u0019\u001bYjj\u000f٭\u0007ȷ\")\u0019q($CP\u00149+>\u0010\u0016E\u0014\u0010{@ܕ0ԃf\u0013>vk-:\u0004f{p{u2iR ʵ\u000bй&$t×ݒL#"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=gxqp9\u0014_*]z1P9N3XavN\u0014\u007fZ\u0017\\5\u001adjA-}\u001a", "\"L^1X3", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003hjG\u0011p\f_v0V3R:kR{=!nV\u001cN\u0001", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u001fKE\u001e\u001ewD5\u0010b3N\u0004|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r?tC\u001e\"d_H\u000bm5.\b'P[\\u@[\u0002=!\u000eX\u001dR5\u0016djA-}\u001a", "6hbAb9R0)\u007f{^9", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}|\u0011w]%\u0017c<NL", "Ad]@b9,S&\u0010~\\,", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003hjG\u0011p\u001aN\u00048KJN\u0002", "Ad]@b9 O(~`^,\b\t<", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0003hjG\u0011p\u000eJ\u0006'-LN7\\_H", "Ad]@b9-V&~v]\u000fx\u0012.l\u007f5", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "3uT;g:,c\u0016\rxk0y\t<", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r\u001b|4'$vOI\u0004q*[z$GY$", "Ad]@b9\u001c] \u0006z\\;\u0007\u0016\u001de\u000f7\u007fI\u0003%", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011ZN5j\\\u007fK]uc\u001dN8\t\u0003hE.w27(\u00166Vo;w\u0010\u0010\u001f\u0010C@", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAt\u001d.KR?u=gsdp5rs,^v|.JX4&OvG\u0012\u000ei\fQt\u000b\f]A-}\u000e3(\u00079S\u0006:2\u000f\u000b\u001cW3twIV\u000eV}\u001f~\u000b\u0017hOgi\u00075ARs.b\f5\u0004ZDBm\u0011u#\u0019d_,\rEQ\u0018vR\u0003v1C\"yE.Bl%TDu\u001f:~.&Ky\u0007\u0016<a>\u0019t6\u0012>7\u0018`\u0014KM\u0018>ix\"\u0002C=0%CF\u0017>\u0015m\u00046!\nq\u001eh\b\u001b8\u001c/#m/`L\u0019\u0005Y&Y8+[\n6_\u0010BH9\u00131N\u0007Ld\b\u0014\u000fP\"wrI\r\u000bc\u0005!~\u001a\t]\u001b\u000bLc\u001c&,\u0012LW\u00122(f;M\u001c\u001824\u0015zfM\u0019o\u0012\u001elQ<[ho-E\u0007Z)23TK\u0005@Sl\u001e\u0014A\u0005\b~*IP@\u0004>\\\")GW4q^2TeZ&\u0019pGe\u001b60\u000f\\Dm(\u0006&\u001bG\fr\u0004\u001c]<G\u0006=J\u0013h,CjK\u0003Kd_\u001eu[\u00158n~#P%W>Yn\u001b{\u0002:|\u001d%\u001a&~U)t\t/u\u001b\u0010\u0013q+\u0005^q", "0tU3X9%]\u0017\u0005", "", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "7r<<g0H\\t\f\u0005n5{w9u}+", "", ">nbAG6NQ\u001clvf7\u0004\t=R\u007f0wD\n\u001b I", "", "Ad]@b9\u001f`\u001d~\u0004]3\u0011q+m\u007f", "", "5dc X5L]&_\bb,\u0006\b6yh$\u0004@", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Ad]@b9)`\u0019|~l0\u0007\u0012", "5dc X5L]&i\b^*\u0001\u00173o\t", "u(8", "Adc X5L]&i\b^*\u0001\u00173o\t", "uH\u0018#", "Ad]@b9-g$~", "5dc X5L]&m\u000fi,", "Ad]@b9-g$~hm9\u0001\u00121", "5dc X5L]&m\u000fi,j\u0018<i\t*", "Bnd0[\u0010G>&\t|k,\u000b\u0017", "/cS!b\tNT\u001a~\b", "", "1n[9X*MW#\b^m,\u0005", "1n]3\\.N`\u0019", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "6`]1_,", "3uT;g", "=mC2k;\u001cV\u0015\b|^", "=mC<h*A", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "AsP?g", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public abstract class InteractionRelativeSensorEvent<TModel extends CollectionItem> extends SensorEventListenerBase implements IEventHandler<InteractionEvent> {
    private final Object bufferLock;
    private final EventsSubscriber eventsSubscriber;
    private final DataQueue historyBuffer;
    private boolean isMotionAroundTouch;
    private int postTouchSamplesRemaining;
    private final InteractionSensorSettings sensorCollectorSettings;
    private final SensorGateKeeper sensorGateKeeper;
    private int sensorPrecision;
    private boolean touchInProgress;

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InteractionEvent.InteractionType.values().length];
            iArr[InteractionEvent.InteractionType.TextChangeEvent.ordinal()] = 1;
            iArr[InteractionEvent.InteractionType.TouchEvent.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractionRelativeSensorEvent(DataQueue historyBuffer, SensorService sensorService, SensorGateKeeper sensorGateKeeper, Handler sensorThreadHandler, Utils utils, EventsSubscriber eventsSubscriber, InteractionSensorSettings sensorCollectorSettings) {
        super(sensorService, sensorThreadHandler, sensorCollectorSettings, utils);
        Intrinsics.checkNotNullParameter(historyBuffer, "historyBuffer");
        Intrinsics.checkNotNullParameter(sensorService, "sensorService");
        Intrinsics.checkNotNullParameter(sensorGateKeeper, "sensorGateKeeper");
        Intrinsics.checkNotNullParameter(sensorThreadHandler, "sensorThreadHandler");
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(eventsSubscriber, "eventsSubscriber");
        Intrinsics.checkNotNullParameter(sensorCollectorSettings, "sensorCollectorSettings");
        this.historyBuffer = historyBuffer;
        this.sensorGateKeeper = sensorGateKeeper;
        this.eventsSubscriber = eventsSubscriber;
        this.sensorCollectorSettings = sensorCollectorSettings;
        this.isMotionAroundTouch = sensorCollectorSettings.isMotionAroundTouch();
        this.bufferLock = new Object();
        this.sensorPrecision = sensorCollectorSettings.getSensorPrecision();
    }

    private final void onTextChange() {
        if (this.isMotionAroundTouch) {
            synchronized (this.bufferLock) {
                if (!this.historyBuffer.isEmpty()) {
                    addToQueue(this.historyBuffer.toCollection());
                    this.historyBuffer.clear();
                }
                Unit unit = Unit.INSTANCE;
            }
            this.postTouchSamplesRemaining = this.historyBuffer.getMaxSize();
        }
    }

    private final synchronized void onTouch(MotionEvent motionEvent) {
        Object obj;
        if (this.isMotionAroundTouch) {
            Intrinsics.checkNotNull(motionEvent);
            if (motionEvent.getAction() == 0) {
                obj = this.bufferLock;
                synchronized (obj) {
                    if (!this.historyBuffer.isEmpty()) {
                        addToQueue(this.historyBuffer.toCollection());
                        this.historyBuffer.clear();
                    }
                    this.touchInProgress = true;
                    Unit unit = Unit.INSTANCE;
                }
            } else if (motionEvent.getAction() == 1) {
                obj = this.bufferLock;
                synchronized (obj) {
                    this.postTouchSamplesRemaining = this.historyBuffer.getMaxSize();
                    this.touchInProgress = false;
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[Catch: all -> 0x002d, TryCatch #0 {, blocks: (B:4:0x0008, B:6:0x000c, B:8:0x0010, B:10:0x0018, B:13:0x0026, B:12:0x0020), top: B:19:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void addToBuffer(com.biocatch.android.commonsdk.backend.CollectionItem r4) {
        /*
            r3 = this;
            java.lang.String r0 = "collectionItem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Object r2 = r3.bufferLock
            monitor-enter(r2)
            boolean r0 = r3.isMotionAroundTouch     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L20
            boolean r0 = r3.touchInProgress     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L20
            int r1 = r3.postTouchSamplesRemaining     // Catch: java.lang.Throwable -> L2d
            int r0 = r1 + (-1)
            r3.postTouchSamplesRemaining = r0     // Catch: java.lang.Throwable -> L2d
            if (r1 > 0) goto L20
            com.biocatch.client.android.sdk.collection.SensorGateKeeper r0 = r3.sensorGateKeeper     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L26
        L20:
            r3.addToQueue(r4)     // Catch: java.lang.Throwable -> L2d
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2d
            goto L2b
        L26:
            com.biocatch.android.commonsdk.collection.DataQueue r0 = r3.historyBuffer     // Catch: java.lang.Throwable -> L2d
            r0.enqueue(r4)     // Catch: java.lang.Throwable -> L2d
        L2b:
            monitor-exit(r2)
            return
        L2d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.biocatch.client.android.sdk.collection.InteractionRelativeSensorEvent.addToBuffer(com.biocatch.android.commonsdk.backend.CollectionItem):void");
    }

    @Override // com.biocatch.client.android.sdk.collection.SensorEventListenerBase, com.biocatch.android.commonsdk.collection.collectors.Collector
    public synchronized void configure(ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        super.configure(configurationRepository);
        boolean zIsMotionAroundTouch = this.sensorCollectorSettings.isMotionAroundTouch();
        this.isMotionAroundTouch = zIsMotionAroundTouch;
        if (zIsMotionAroundTouch) {
            this.historyBuffer.setMaxSize((int) ((((long) 1000000) * configurationRepository.getLong(ConfigurationFields.motionPaddingAroundTouchMSec, ConfigurationDefaultValue.MotionPaddingAroundTouchMSec)) / getSamplePeriod()));
        }
        this.sensorPrecision = this.sensorCollectorSettings.getSensorPrecision();
    }

    @Override // com.biocatch.client.android.sdk.collection.SensorEventListenerBase, com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public abstract ConfigKeys getConfigKey();

    @Override // com.biocatch.client.android.sdk.collection.SensorEventListenerBase
    protected abstract String getSensorFriendlyName();

    protected final int getSensorPrecision() {
        return this.sensorPrecision;
    }

    @Override // com.biocatch.client.android.sdk.collection.SensorEventListenerBase
    protected abstract int getSensorType();

    @Override // com.biocatch.client.android.sdk.collection.SensorEventListenerBase
    protected abstract String getSensorTypeString();

    @Override // com.biocatch.client.android.sdk.events.IEventHandler
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void handle(InteractionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i2 = WhenMappings.$EnumSwitchMapping$0[event.getEventType().ordinal()];
        if (i2 == 1) {
            onTextChange();
        } else {
            if (i2 != 2) {
                return;
            }
            onTouch(((TouchEvent) event).getEvent());
        }
    }

    protected final void setSensorPrecision(int i2) {
        this.sensorPrecision = i2;
    }

    @Override // com.biocatch.client.android.sdk.collection.SensorEventListenerBase, com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        if (super.isSensorSupported()) {
            super.start();
            this.eventsSubscriber.subscribe(this);
        }
    }

    @Override // com.biocatch.client.android.sdk.collection.SensorEventListenerBase, com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        super.stop();
        this.eventsSubscriber.unsubscribe(this);
    }
}
