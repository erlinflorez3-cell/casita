package com.dynatrace.android.agent;

import android.os.SystemClock;
import com.dynatrace.android.agent.model.AppStartMeasurement;
import com.dynatrace.android.agent.model.AppStartMeasurementType;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d̉=!,u\bDJc|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u0006\u0007nʑQ4Ri`.\u0001XJ\u001byڔL$\n#Hٔ\u000eڈ\u001e}*ޛoZug\u0007J\t\n\u001aƧXȀ|j4կu\u000bk\u0013'8RqO3{rk;7ҝ8ӯ$2*\u0600ѯ\t\u0007"}, d2 = {"\u000fO?,F\u001b\u001a@\bxbH\u000blo\u000f", "", "\u0013L8!R\b)>\u0013li:\u0019k", "0tU3X9", "\u001aiPCTuNb\u001d\u0006DJ<|\u0019/;", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0013Io\u0017K@-?X}'\u0001I!9;R7xC\u0006\u0015doI\u0014c4N\u007f6\u001d", "AdcBc\bI^\u0007\u000evk;c\r=t\u007f1{M", "", "2x].g9:Q\u0019x\b^(z\u0018vn{7\u007fQ\u0001^\"N\u007f\u0010@\u007f\u001fBY\u0005 3{\u0016"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class DynatraceAppStartModuleKt {
    private static final String APP_START_MODULE = "DynatraceAppStartModule";
    private static final String EMIT_APP_START = "dynatraceAppStartMeasurements";
    private static final Queue<AppStartMeasurement> buffer = new ConcurrentLinkedQueue();

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReactMarkerConstants.values().length];
            try {
                iArr[ReactMarkerConstants.RELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReactMarkerConstants.CONTENT_APPEARED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReactMarkerConstants.DOWNLOAD_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReactMarkerConstants.DOWNLOAD_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReactMarkerConstants.RUN_JS_BUNDLE_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReactMarkerConstants.RUN_JS_BUNDLE_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void setupAppStartListener() {
        final long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        ReactMarker.addListener(new ReactMarker.MarkerListener() { // from class: com.dynatrace.android.agent.DynatraceAppStartModuleKt$$ExternalSyntheticLambda0
            @Override // com.facebook.react.bridge.ReactMarker.MarkerListener
            public final void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i2) {
                DynatraceAppStartModuleKt.setupAppStartListener$lambda$0(jCurrentTimeMillis, reactMarkerConstants, str, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAppStartListener$lambda$0(long j2, ReactMarkerConstants reactMarkerConstants, String str, int i2) {
        switch (reactMarkerConstants == null ? -1 : WhenMappings.$EnumSwitchMapping$0[reactMarkerConstants.ordinal()]) {
            case 1:
                Queue<AppStartMeasurement> queue = buffer;
                queue.clear();
                queue.add(new AppStartMeasurement(AppStartMeasurementType.RELOAD.getValue(), j2 + SystemClock.elapsedRealtime()));
                break;
            case 2:
                buffer.add(new AppStartMeasurement(AppStartMeasurementType.CONTENT_APPEARED.getValue(), j2 + SystemClock.elapsedRealtime()));
                break;
            case 3:
                buffer.add(new AppStartMeasurement(AppStartMeasurementType.DOWNLOAD_END.getValue(), j2 + SystemClock.elapsedRealtime()));
                break;
            case 4:
                buffer.add(new AppStartMeasurement(AppStartMeasurementType.DOWNLOAD_START.getValue(), j2 + SystemClock.elapsedRealtime()));
                break;
            case 5:
                buffer.add(new AppStartMeasurement(AppStartMeasurementType.RUN_JS_BUNDLE_END.getValue(), j2 + SystemClock.elapsedRealtime()));
                break;
            case 6:
                buffer.add(new AppStartMeasurement(AppStartMeasurementType.RUN_JS_BUNDLE_START.getValue(), j2 + SystemClock.elapsedRealtime()));
                break;
        }
    }
}
