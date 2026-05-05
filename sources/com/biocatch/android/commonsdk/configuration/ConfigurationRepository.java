package com.biocatch.android.commonsdk.configuration;

import com.biocatch.android.commonsdk.exceptions.ConfigurationException;
import com.biocatch.android.commonsdk.wrappers.JsonFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
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
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u001e\u007f\u0007lkA0ZeP\u008cZS@\u000fs{:$c$\u007fCC٥\"}0\u0012WNmivJh\u000fKƤ\u000e\u0016\u0007p4կ]xk0\u0017˰JoM:UoC>vҚf\u0005N1bC\n\t\u000f\u001aBH>wټGK\u001a\u0014xF~Fj\r{\u0012`\u0012NJ.\u000f6\\\u0016]fLzmR/Q\u00072N\\8w0+\\=Jb7%v\u0010\"sTEF-%\u0002\u00127ViO\u001b? A5l59CI\"f~d\u000e'-+}!\u000ev4l\u001dQ\u000f\u0010o?]vcP<<(~\n\u001dT\u0004<\nWL<?2f6\"{\u0001\u0001hXP0tr\u0004\tqN\u0017S\u0004{?G0~Q\u0010QIRE\f\u001d\rL'1r/ml\u000e\u000f+cd\u0006hIUP=NO8qmq\u0012\u0001z\u0002X\bxS\u000eH\u0014\u0011\\1U;iI;!\u001a\u0006\u0011Xu\u0010\u001d`\u0017m\u001aVVP:nD;Z\r\u001al\\d3\u0006\u0019bfG)O2S5|8\u0017.l\u0010<O)XZ]\u0005\u0002j{a:)=vOY\u001doVkGzK5\u007fg@e`\u0007,?jf5\\tTk\f\t`p.@e\u0003\u0010&\ttR\u001a1J?  |C?8t\u0015v\u0010NFO\r!_\tl@\u0003bS<\u0003\u00183;ծ\u0001\u0019s~\u000f\u007fxw9-d0=YQc\u001dVY0\tL|Q\u001dEͥ\u007f\u0010\u0001ZfdlD\u0003\u0006\u007f.&29\u007f3m\u0019\u001d\u001fA4\u0018,sP9ϓQ\u0016-5\u001a\u0015y=H\u00192u\u0018\u0003pZd\u001bR]t/&\u0007^x$6|Fןa\u0017\nUfl\u000b\nB\u007f7è]@f:\u0003\n-$u\r}\"\u00155[D}ݷ\u0018߳\u0018/\u001d˕.u}5\u0012b=.KЄ\u0010Нg\u0016w̥\"i@DPI\b\t\u0015а&к\u0007BP۳H\u0014P\u0014L\raR\u0018Яrެ<M\u0013ɀ̷j("}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "", "4`RAb9R", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0010-3x!.ZQ\u0005PB(\u001eI]7\u0016m9bL", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G2Di!9MPI5\u0019,\u001fqB5\u0005r6[\u000b|\u000b=", "1n]3\\.N`\u0015\u000e~h5\u000bd=S\u000f5\u007fI\u0003", "", "5dc\u0010b5?W\u001b\u000f\bZ;\u0001\u00138s[6iO\u000e\u001b I", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "<`c6i,\u001c]\"\u007f~`<\n\u0005>i\n1\n", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "@dP1?6<Y", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u001e!Eu\u001c\u0006]/3_S", "EqXAX\u0013HQ\u001f", "/o_2a+\u001dS\u001az\u000be;m\u00056u\u007f6", "", "1n]AT0Ga~~\u000f", "", "9dh", "5dc\u000fb6ES\u0015\b", "4`[9U(<Y", "5dc\u0011b<;Z\u0019", "", "5dc\u0016a;", "", "5dc\u0019\\:M", "", "5dc\u0019b5@", "", "5dc\u001cU1>Q(", "5dc g9B\\\u001b", ";da4X\u001eBb\u001cgvm0\u000e\t\ro\t)\u007fB\u0011$\u0013Vs\u0018E\u0005", "1n]3\\.", "Adc", "D`[BX", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ConfigurationRepository {
    private final JsonFactory factory;
    private JSONObject nativeConfigurations;
    private final Lock readLock;
    private final Lock writeLock;

    public ConfigurationRepository(JsonFactory factory) throws JSONException {
        Intrinsics.checkNotNullParameter(factory, "factory");
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        Lock lock = reentrantReadWriteLock.readLock();
        Intrinsics.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
        this.readLock = lock;
        Lock lockWriteLock = reentrantReadWriteLock.writeLock();
        Intrinsics.checkNotNullExpressionValue(lockWriteLock, "readWriteLock.writeLock()");
        this.writeLock = lockWriteLock;
        this.factory = factory;
        this.nativeConfigurations = factory.createJson();
        appendDefaultValues();
    }

    private final void appendDefaultValues() throws JSONException {
        this.nativeConfigurations.put(ConfigurationFields.isEnabled, true);
        this.nativeConfigurations.put(ConfigurationFields.wupResponseTimeout, 5000);
        this.nativeConfigurations.put(ConfigurationFields.defaultWupRate, 5000L);
        JSONObject jSONObject = this.nativeConfigurations;
        ConfigurationDefaultValue configurationDefaultValue = ConfigurationDefaultValue.INSTANCE;
        jSONObject.put(ConfigurationFields.logLevel, configurationDefaultValue.getLogLevel());
        this.nativeConfigurations.put(ConfigurationFields.collectorDataBufferSize, 10000);
        this.nativeConfigurations.put(ConfigurationFields.logBufferSize, 10000);
        this.nativeConfigurations.put(ConfigurationFields.maxSlavePingRetryCount, 10);
        this.nativeConfigurations.put(ConfigurationFields.shouldOverrideLocalLogLevel, configurationDefaultValue.getShouldOverrideLocalLogLevel());
        this.nativeConfigurations.put(ConfigurationFields.wupCommunicationBufferCapacity, 1000);
        this.nativeConfigurations.put(ConfigurationFields.logCommunicationBufferCapacity, 1000);
        this.nativeConfigurations.put(ConfigurationFields.webViewCommunicationReconnectInterval, 1000);
        this.nativeConfigurations.put(ConfigurationFields.slaveKeepAliveInterval, 1000);
        this.nativeConfigurations.put(ConfigurationFields.elementTagValueMaxLength, 128);
        this.nativeConfigurations.put(ConfigurationFields.enableHybridSolution, false);
        this.nativeConfigurations.put(ConfigurationFields.enableDisplayFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.enableMemoryFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.isElements, true);
        this.nativeConfigurations.put(ConfigurationFields.isContextChange, true);
        this.nativeConfigurations.put(ConfigurationFields.enableDeviceApplicationsCollection, true);
        this.nativeConfigurations.put(ConfigurationFields.deviceAppBackgroundDelayMillis, 100L);
        this.nativeConfigurations.put(ConfigurationFields.isKeyEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.isApplicationEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.enableMuidFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.enableRequestIDFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.enableCoresFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.isBatteryStatusEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.enableVersionFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.isPinchEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.isPanEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.isLongPressEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.isDeviceOrientationEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.isSignificantMotionEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.enableKeyboardsFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.enableEmulatorDetectorFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.enableSimDataFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.enableMultiSimDataFeature, false);
        this.nativeConfigurations.put(ConfigurationFields.enableOSVersionFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.enablePlatformFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.enableApplicationVersion, true);
        this.nativeConfigurations.put(ConfigurationFields.isBluetooth, true);
        this.nativeConfigurations.put(ConfigurationFields.isCallInfo, false);
        this.nativeConfigurations.put(ConfigurationFields.enableApplicationNameFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.isWifiHistory, true);
        this.nativeConfigurations.put(ConfigurationFields.isAccessibilityEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.enableMainLanguageFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.enableSourceFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.enableMACAddressFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.enableLocalIPAddressFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.enableLanguagesFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.enableTimeZoneFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.isElementsEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.isClipboardEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.isWifiInfoEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.isTapEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.isFlingEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.enableMouseEventsFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.isTouchEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.isLightEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.isProximityEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.isLocationEvents, false);
        this.nativeConfigurations.put(ConfigurationFields.isOrientationEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.isAccelerometerEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.isGyroEvents, true);
        this.nativeConfigurations.put(ConfigurationFields.enableAndroidIDFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.isSensorList, true);
        this.nativeConfigurations.put(ConfigurationFields.enableAutoContext, false);
        this.nativeConfigurations.put(ConfigurationFields.enableAutoElementId, false);
        this.nativeConfigurations.put(ConfigurationFields.isElementsHierarchy, false);
        this.nativeConfigurations.put(ConfigurationFields.enableDeviceHardwareFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.enableDeviceFingerprintFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.enableDeviceManufacturerFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.enableDeviceModelFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.enableDeviceProductFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.enableNetworkInterfacesFeature, true);
        this.nativeConfigurations.put(ConfigurationFields.enableGlobalTouchCollectionMode, true);
        this.nativeConfigurations.put(ConfigurationFields.enableCoordinatesMasking, false);
        this.nativeConfigurations.put(ConfigurationFields.motionPaddingAroundTouchMSec, ConfigurationDefaultValue.MotionPaddingAroundTouchMSec);
        this.nativeConfigurations.put(ConfigurationFields.motionPaddingOnSessionStartMSec, 20000L);
        this.nativeConfigurations.put(ConfigurationFields.isMotionAroundTouch, true);
        this.nativeConfigurations.put(ConfigurationFields.isMotionOnSessionStart, true);
        this.nativeConfigurations.put(ConfigurationFields.sensorsDecimalPrecisionPoints, 4);
        this.nativeConfigurations.put(ConfigurationFields.dataHarvesterInterval, 5000L);
        this.nativeConfigurations.put(ConfigurationFields.accelerometerEventsSamplePeriod, 16);
        this.nativeConfigurations.put(ConfigurationFields.gyroEventsSamplePeriod, 16);
        this.nativeConfigurations.put(ConfigurationFields.orientationEventsSamplePeriod, 16);
        this.nativeConfigurations.put(ConfigurationFields.lightEventsSamplePeriod, 300);
        this.nativeConfigurations.put(ConfigurationFields.proximityEventsSamplePeriod, 0);
        this.nativeConfigurations.put(ConfigurationFields.gyroEventsSensorRegistrationDelay, 0);
        this.nativeConfigurations.put(ConfigurationFields.accelerometerEventsSensorRegistrationDelay, 0);
        this.nativeConfigurations.put(ConfigurationFields.orientationEventsSensorRegistrationDelay, 0);
        this.nativeConfigurations.put(ConfigurationFields.lightEventsSensorRegistrationDelay, 0);
        this.nativeConfigurations.put(ConfigurationFields.proximityEventsSensorRegistrationDelay, 0);
        this.nativeConfigurations.put(ConfigurationFields.accelerometerEventsThreshold, 0.0d);
        this.nativeConfigurations.put(ConfigurationFields.gyroEventsThreshold, 0.0d);
        this.nativeConfigurations.put(ConfigurationFields.locationRefreshTime, 5000L);
        this.nativeConfigurations.put(ConfigurationFields.locationRefreshDistance, 1000);
        this.nativeConfigurations.put(ConfigurationFields.locationEventsTimeoutMsec, 10000L);
        this.nativeConfigurations.put(ConfigurationFields.locationEventsRequestDelaySec, 5L);
        this.nativeConfigurations.put(ConfigurationFields.logMessageDispatchRateMsec, 5000);
        this.nativeConfigurations.put(ConfigurationFields.enableImeiCollection, false);
        this.nativeConfigurations.put(ConfigurationFields.enableLatestAccessPointsCollection, false);
        this.nativeConfigurations.put(ConfigurationFields.touchSizePrecision, 3);
        this.nativeConfigurations.put(ConfigurationFields.keyEventsMaskSpecialChars, false);
        this.nativeConfigurations.put(ConfigurationFields.enableDisplaysCollection, true);
        this.nativeConfigurations.put(ConfigurationFields.bluetoothNameTruncationLength, 2);
        this.nativeConfigurations.put(ConfigurationFields.displaysNameTruncationLength, 2);
        this.nativeConfigurations.put(ConfigurationFields.ssidTruncationLength, 2);
        this.nativeConfigurations.put(ConfigurationFields.wupMessageNumToRetry, 5);
        this.nativeConfigurations.put(ConfigurationFields.wupMessageRetryInterval, 1000);
        this.nativeConfigurations.put(ConfigurationFields.wupIncrementalGrowthBetweenFailures, 3500);
        this.nativeConfigurations.put(ConfigurationFields.wupMaxIntervalBetweenFailures, 16000);
        this.nativeConfigurations.put(ConfigurationFields.maxWupMessagesToFlush, 3);
        this.nativeConfigurations.put(ConfigurationFields.logMessageNumToRetry, 5);
        this.nativeConfigurations.put(ConfigurationFields.logMessageRetryInterval, 1000);
        this.nativeConfigurations.put(ConfigurationFields.logIncrementalGrowthBetweenFailures, 3500);
        this.nativeConfigurations.put(ConfigurationFields.logMaxIntervalBetweenFailures, 16000);
        this.nativeConfigurations.put(ConfigurationFields.maxLogMessagesToFlush, 3);
        this.nativeConfigurations.put(ConfigurationFields.restrictedViewGroupList, new ArrayList());
        this.nativeConfigurations.put(ConfigurationFields.enableElementValuesMasking, false);
        this.nativeConfigurations.put(ConfigurationFields.elementValuesMaskingList, new ArrayList());
        this.nativeConfigurations.put(ConfigurationFields.elementValuesDisableMaskingList, new ArrayList());
        this.nativeConfigurations.put(ConfigurationFields.enableJailbreakCollection, true);
        this.nativeConfigurations.put(ConfigurationFields.enableImsiCollection, false);
        this.nativeConfigurations.put(ConfigurationFields.enableWupMessagesHashing, false);
        this.nativeConfigurations.put(ConfigurationFields.enableAudioInfoFeature, false);
        this.nativeConfigurations.put(ConfigurationFields.audioInfoCollectingInterval, 10000L);
        this.nativeConfigurations.put(ConfigurationFields.isVoip, false);
    }

    public final boolean containsKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.readLock.lock();
        try {
            return this.nativeConfigurations.has(key);
        } finally {
            this.readLock.unlock();
        }
    }

    public final boolean getBoolean(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.readLock.lock();
        try {
            return this.nativeConfigurations.optBoolean(key);
        } finally {
            this.readLock.unlock();
        }
    }

    public final boolean getBoolean(String key, boolean z2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.readLock.lock();
        try {
            return this.nativeConfigurations.optBoolean(key, z2);
        } finally {
            this.readLock.unlock();
        }
    }

    public final String getConfigurationsAsString() {
        String string = this.nativeConfigurations.toString();
        Intrinsics.checkNotNullExpressionValue(string, "this.nativeConfigurations.toString()");
        return string;
    }

    public final double getDouble(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.readLock.lock();
        try {
            return this.nativeConfigurations.optDouble(key);
        } finally {
            this.readLock.unlock();
        }
    }

    public final double getDouble(String key, double d2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.readLock.lock();
        try {
            return this.nativeConfigurations.optDouble(key, d2);
        } finally {
            this.readLock.unlock();
        }
    }

    public final int getInt(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.readLock.lock();
        try {
            return this.nativeConfigurations.optInt(key);
        } finally {
            this.readLock.unlock();
        }
    }

    public final int getInt(String key, int i2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.readLock.lock();
        try {
            return this.nativeConfigurations.optInt(key, i2);
        } finally {
            this.readLock.unlock();
        }
    }

    public final List<?> getList(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object object = getObject(key);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.collections.List<*>");
        return (List) object;
    }

    public final long getLong(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.readLock.lock();
        try {
            return this.nativeConfigurations.optLong(key);
        } finally {
            this.readLock.unlock();
        }
    }

    public final long getLong(String key, long j2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.readLock.lock();
        try {
            return this.nativeConfigurations.optLong(key, j2);
        } finally {
            this.readLock.unlock();
        }
    }

    public final Object getObject(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.readLock.lock();
        try {
            return this.nativeConfigurations.opt(key);
        } finally {
            this.readLock.unlock();
        }
    }

    public final String getString(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.readLock.lock();
        try {
            String strOptString = this.nativeConfigurations.optString(key);
            Intrinsics.checkNotNullExpressionValue(strOptString, "{\n            nativeConf….optString(key)\n        }");
            return strOptString;
        } finally {
            this.readLock.unlock();
        }
    }

    public final String getString(String key, String fallback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        this.readLock.lock();
        try {
            String strOptString = this.nativeConfigurations.optString(key, fallback);
            Intrinsics.checkNotNullExpressionValue(strOptString, "{\n            nativeConf…(key, fallback)\n        }");
            return strOptString;
        } finally {
            this.readLock.unlock();
        }
    }

    public final void mergeWithNativeConfigurations(String config) throws ConfigurationException {
        Intrinsics.checkNotNullParameter(config, "config");
        this.writeLock.lock();
        try {
            try {
                JSONObject jSONObjectAppendFlattened = this.factory.appendFlattened(this.nativeConfigurations, config);
                this.writeLock.unlock();
                this.nativeConfigurations = jSONObjectAppendFlattened;
            } catch (JSONException e2) {
                throw new ConfigurationException("Failed to append configurations" + e2);
            }
        } catch (Throwable th) {
            this.writeLock.unlock();
            throw th;
        }
    }

    public final void set(String key, int i2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.readLock.lock();
        try {
            this.nativeConfigurations.put(key, i2);
        } finally {
            this.readLock.unlock();
        }
    }

    public final void set(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.readLock.lock();
        try {
            this.nativeConfigurations.put(key, str);
        } finally {
            this.readLock.unlock();
        }
    }

    public final void set(String key, List<?> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.readLock.lock();
        try {
            this.nativeConfigurations.put(key, value);
        } finally {
            this.readLock.unlock();
        }
    }

    public final void set(String key, boolean z2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.readLock.lock();
        try {
            this.nativeConfigurations.put(key, z2);
        } finally {
            this.readLock.unlock();
        }
    }
}
