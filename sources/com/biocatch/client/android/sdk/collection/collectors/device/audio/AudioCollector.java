package com.biocatch.client.android.sdk.collection.collectors.device.audio;

import android.app.Application;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import com.biocatch.android.commonsdk.collection.CollectorID;
import com.biocatch.android.commonsdk.collection.ConfigKeys;
import com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector;
import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
@Metadata(bv = {}, d1 = {"Яp\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fs{:$c$\bCC٥\"}8\tWNmhvJp\u000bK\u000f\f\u0017\u0001j:U]xc\u0013\u00172PvG3SoE9nt>\u0005&4*8\b#\t\u001a0H\u0018v\tIS\f\u00180HpH[\u0015M\u000b\u001d\u0018ßTĨ1$li^6vl\f9oH\u0013mPO?_^~]\u0011TW?\r%e./N<M\u0015SY\u0013\r`bW\u0005Upk\rص+'9R<]Ds\u0018\u0014CG\u0016\r&x4y\u001dQ\u000f(m+\u0018qYn&(&\u0017,\u0011J#&\u0006UNtAbr\u0016.Kz\u0003UPP0sp!Aa~%3\"K+g0\u0017Uo^1Ne K\u000ef)\u000f\u00149[\u0003#'\u0015cZ\u0006wIQnd\u000fNR_K\u0016\u001cp\u0011\u001bp\u0004xM\u000eX\u0014\u0011\\3k7$?1K\u0004\u0002v`.\u000bMfv~\u0002Rv\\h\u0003fC8\u0013$Zro[ߛRԜ\\,\u0019۳lf\u0015\n \u0013NiN˪#ٚ\u0014TWŖ\u0002lSk\u00184\u007fxEi\u0007k<h\u0010ӫ5̳Ui\u0018Рjx\u001aQJuUjtVk\f\tq~φtʮn\u0016\u007fӻ\\P\u0012)@VB,BDI\u001br\u0014v\u001ctՖMҴ\rabh\u001e\u0019%?2\b\u0002$#\u000fWˉhʼsg\u0001̢|\u000bn)ECg4G.,ȫtط\u0001#\u000fѨD\fUjdGzpl߲Wދ$\u0016\"ߙ׀3i"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011KN=`Pr\u0007\u0010\"Y\u0012Xth\u0015XE.LN>&\b*X\fH>", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005p%VW;`[\u0003G$ 8\u0018U2\r\u0003hK1D", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011KN=`Pr\u0007\u0010\"Y\u0012Xth\u0015XE.VN6\u001f\u000f\u0002", "/o_9\\*:b\u001d\t\u0004", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u001d", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", ";B^;Y0@c&z\nb6\u0006u/p\n6\u007fO\u000b$+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "Bh\\2e", "\u001aiPCTuNb\u001d\u0006DM0\u0005\t<;", "uKP;W9HW\u0018Hvi7Fd:p\u0007,y<\u0010\u001b!PEt:\u0001-~V\u0002*5i%,P\r7t3+\u001fl`\u0003\u0005m4V\u00010UKTuZ\\\u007f=]\u0002i\u0012U9bkWK,8A;)\u0006(X\u007f>2|\u0015\u0015\u001b?no\fT\u001aO\u0002\u001f~O(n\u0010Wi\u0003HEGr7`\u001bc'e\u0004\u0018.\u001dr\u001d\u001dx]*\u0019\u007f]\u001a_R\u0005quK(\u0005E8\u0014T`BVk\u001fL\u0004+&\u0015j{\u001a2eJne", "/tS6b\u0014:\\\u0015\u0001zk", "\u001a`]1e6BRb\u0007z]0xR\u000bu~,\u0006(| \u0013Io\u001b\u0012", "1n[9X*M]&bY", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001foh9\u0005r6[Z\u0006\u001d", "5dc\u0010b3ES\u0017\u000e\u0005k\u0010[", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^Fk@\u000ec*]\u00014++$", "1n]3\\.$S-", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}{\u001fqb=\tI,b\u0005|", "5dc\u0010b5?W\u001bdzr", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^FkB\bg.4v;U\"", "4qX2a+Eg\u0002z\u0003^", "", "5dc\u0013e0>\\\u0018\u0006\u000fG(\u0005\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "7mc2e=:Z", "", "\u001aiPCTuEO\"\u0001DE6\u0006\u000b\u0005", "1`]0X3-W!~\b", "", "1n[9X*M/)}~h\u000bx\u0018+", "1n]3\\.N`\u0019", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "5dc\u0010b5GS\u0017\u000ez]\u000b|\u001a3c\u007f6", "", "5dc\u0011X=BQ\u0019m\u000fi,e\u00057e", "2de6V,-g$~", "", "5dc X3>Q(~y=,\u000e\r-e", "5dc c,:Y\u0019\fea6\u0006\t\u001dt{7{", "", "5dc#T3BR\u0015\u000ez]\u0010\u0006\u0018/r\u0011$\u0003", "AbW2W<ESv\t\u0002e,z\u0018\u000bu~,\u0006", "AsP?g", "As^=", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class AudioCollector extends ContinuousCollector<AudioModel> {
    private final AudioManager audioManager;
    private final CollectorID collectorID;
    private final ConfigKeys configKey;
    private final String friendlyName;
    private Long interval;
    private ConfigurationRepository mConfigurationRepository;
    private Timer timer;
    private final Utils utils;

    public AudioCollector(Application application, Utils utils, ConfigurationRepository mConfigurationRepository, Timer timer) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(utils, "utils");
        Intrinsics.checkNotNullParameter(mConfigurationRepository, "mConfigurationRepository");
        this.utils = utils;
        this.mConfigurationRepository = mConfigurationRepository;
        this.timer = timer;
        Object systemService = application.getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService;
        this.collectorID = CollectorID.AudioInfo;
        this.friendlyName = "audioInfo";
        this.configKey = ConfigKeys.enableAudioInfoFeature;
    }

    private final void cancelTimer() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        this.timer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void collectAudioData() {
        addToQueue(new AudioModel(getContextIDCache().get(), getCurrentEventId(), this.utils.currentTimeMillis(), getSpeakerPhoneState(), getSelectedDevice(), getConnectedDevices(), this.audioManager.isMicrophoneMute(), this.audioManager.isMusicActive(), this.audioManager.getRingerMode()));
    }

    private final List<String> getConnectedDevices() {
        if (!this.utils.isVersionGreaterOrEqualTo(23)) {
            return CollectionsKt.emptyList();
        }
        AudioDeviceInfo[] audioDeviceInfo = this.audioManager.getDevices(3);
        Intrinsics.checkNotNullExpressionValue(audioDeviceInfo, "audioDeviceInfo");
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo2 : audioDeviceInfo) {
            DeviceTypes[] deviceTypesArrValues = DeviceTypes.values();
            ArrayList arrayList2 = new ArrayList(deviceTypesArrValues.length);
            for (DeviceTypes deviceTypes : deviceTypesArrValues) {
                arrayList2.add(Integer.valueOf(deviceTypes.getType()));
            }
            if (arrayList2.contains(Integer.valueOf(audioDeviceInfo2.getType()))) {
                arrayList.add(audioDeviceInfo2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(getDeviceTypeName(((AudioDeviceInfo) it.next()).getType()));
        }
        return arrayList3;
    }

    private final String getDeviceTypeName(int i2) {
        DeviceTypes deviceTypes;
        String strName;
        DeviceTypes[] deviceTypesArrValues = DeviceTypes.values();
        int length = deviceTypesArrValues.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                deviceTypes = null;
                break;
            }
            deviceTypes = deviceTypesArrValues[i3];
            if (deviceTypes.getType() == i2) {
                break;
            }
            i3++;
        }
        return (deviceTypes == null || (strName = deviceTypes.name()) == null) ? "UNKNOWN" : strName;
    }

    private final String getSelectedDevice() {
        AudioDeviceInfo communicationDevice;
        return (!this.utils.isVersionGreaterOrEqualTo(31) || (communicationDevice = this.audioManager.getCommunicationDevice()) == null) ? "UNKNOWN" : getDeviceTypeName(communicationDevice.getType());
    }

    private final boolean getSpeakerPhoneState() {
        if (!this.utils.isVersionGreaterOrEqualTo(31)) {
            return this.audioManager.isSpeakerphoneOn();
        }
        AudioDeviceInfo communicationDevice = this.audioManager.getCommunicationDevice();
        return communicationDevice != null && communicationDevice.getType() == 2;
    }

    private final long getValidatedInterval() {
        long j2 = this.mConfigurationRepository.getLong(ConfigurationFields.audioInfoCollectingInterval);
        if (j2 >= 10000) {
            return j2;
        }
        Log.Companion.getLogger().info("Invalid interval value: " + j2 + ". Setting default value, 10000");
        return 10000L;
    }

    private final void scheduleCollectAudio() {
        if (this.timer == null) {
            this.timer = new Timer();
        }
        TimerTask timerTask = new TimerTask() { // from class: com.biocatch.client.android.sdk.collection.collectors.device.audio.AudioCollector$scheduleCollectAudio$task$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                this.this$0.collectAudioData();
            }
        };
        Long lValueOf = Long.valueOf(getValidatedInterval());
        this.interval = lValueOf;
        Timer timer = this.timer;
        if (timer != null) {
            Intrinsics.checkNotNull(lValueOf);
            timer.schedule(timerTask, 0L, lValueOf.longValue());
        }
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public void configure(ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        super.configure(configurationRepository);
        Long l2 = this.interval;
        long j2 = configurationRepository.getLong(ConfigurationFields.audioInfoCollectingInterval);
        if (l2 != null && l2.longValue() == j2) {
            return;
        }
        cancelTimer();
        scheduleCollectAudio();
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public CollectorID getCollectorID() {
        return this.collectorID;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector, com.biocatch.android.commonsdk.collection.collectors.Collector
    public ConfigKeys getConfigKey() {
        return this.configKey;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.Collector
    public String getFriendlyName() {
        return this.friendlyName;
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void start() {
        if (isStarted()) {
            Log.Companion.getLogger().error("Audio collector is already started. Aborting the start operation.");
            throw new InvalidOperationException("Audio collector is already started. Aborting the start operation.");
        }
        scheduleCollectAudio();
        setStarted(true);
    }

    @Override // com.biocatch.android.commonsdk.collection.collectors.ContinuousCollector
    public void stop() {
        cancelTimer();
        setStarted(false);
    }
}
