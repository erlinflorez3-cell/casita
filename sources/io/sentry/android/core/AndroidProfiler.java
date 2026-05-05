package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.CpuCollectionData;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.ISentryExecutorService;
import io.sentry.MemoryCollectionData;
import io.sentry.PerformanceCollectionData;
import io.sentry.SentryLevel;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.profilemeasurements.ProfileMeasurement;
import io.sentry.profilemeasurements.ProfileMeasurementValue;
import io.sentry.util.Objects;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class AndroidProfiler {
    private static final int BUFFER_SIZE_BYTES = 3000000;
    private static final int PROFILING_TIMEOUT_MILLIS = 30000;
    private final BuildInfoProvider buildInfoProvider;
    private final ISentryExecutorService executorService;
    private final SentryFrameMetricsCollector frameMetricsCollector;
    private String frameMetricsCollectorId;
    private final int intervalUs;
    private final ILogger logger;
    private final File traceFilesDir;
    private long profileStartNanos = 0;
    private Future<?> scheduledFinish = null;
    private File traceFile = null;
    private final ArrayDeque<ProfileMeasurementValue> screenFrameRateMeasurements = new ArrayDeque<>();
    private final ArrayDeque<ProfileMeasurementValue> slowFrameRenderMeasurements = new ArrayDeque<>();
    private final ArrayDeque<ProfileMeasurementValue> frozenFrameRenderMeasurements = new ArrayDeque<>();
    private final Map<String, ProfileMeasurement> measurementsMap = new HashMap();
    private boolean isRunning = false;

    public static class ProfileEndData {
        public final boolean didTimeout;
        public final long endCpuMillis;
        public final long endNanos;
        public final Map<String, ProfileMeasurement> measurementsMap;
        public final File traceFile;

        public ProfileEndData(long j2, long j3, boolean z2, File file, Map<String, ProfileMeasurement> map) {
            this.endNanos = j2;
            this.traceFile = file;
            this.endCpuMillis = j3;
            this.measurementsMap = map;
            this.didTimeout = z2;
        }
    }

    public static class ProfileStartData {
        public final long startCpuMillis;
        public final long startNanos;
        public final Date startTimestamp;

        public ProfileStartData(long j2, long j3, Date date) {
            this.startNanos = j2;
            this.startCpuMillis = j3;
            this.startTimestamp = date;
        }
    }

    public AndroidProfiler(String str, int i2, SentryFrameMetricsCollector sentryFrameMetricsCollector, ISentryExecutorService iSentryExecutorService, ILogger iLogger, BuildInfoProvider buildInfoProvider) {
        this.traceFilesDir = new File((String) Objects.requireNonNull(str, "TracesFilesDirPath is required"));
        this.intervalUs = i2;
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "Logger is required");
        this.executorService = (ISentryExecutorService) Objects.requireNonNull(iSentryExecutorService, "ExecutorService is required.");
        this.frameMetricsCollector = (SentryFrameMetricsCollector) Objects.requireNonNull(sentryFrameMetricsCollector, "SentryFrameMetricsCollector is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "The BuildInfoProvider is required.");
    }

    private void putPerformanceCollectionDataInMeasurements(List<PerformanceCollectionData> list) {
        if (this.buildInfoProvider.getSdkInfoVersion() < 21) {
            return;
        }
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.profileStartNanos) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                for (PerformanceCollectionData performanceCollectionData : list) {
                    CpuCollectionData cpuData = performanceCollectionData.getCpuData();
                    MemoryCollectionData memoryData = performanceCollectionData.getMemoryData();
                    if (cpuData != null) {
                        arrayDeque3.add(new ProfileMeasurementValue(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(cpuData.getTimestampMillis()) + jElapsedRealtimeNanos), Double.valueOf(cpuData.getCpuUsagePercentage())));
                    }
                    if (memoryData != null && memoryData.getUsedHeapMemory() > -1) {
                        arrayDeque.add(new ProfileMeasurementValue(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(memoryData.getTimestampMillis()) + jElapsedRealtimeNanos), Long.valueOf(memoryData.getUsedHeapMemory())));
                    }
                    if (memoryData != null && memoryData.getUsedNativeMemory() > -1) {
                        arrayDeque2.add(new ProfileMeasurementValue(Long.valueOf(TimeUnit.MILLISECONDS.toNanos(memoryData.getTimestampMillis()) + jElapsedRealtimeNanos), Long.valueOf(memoryData.getUsedNativeMemory())));
                    }
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.measurementsMap.put(ProfileMeasurement.ID_CPU_USAGE, new ProfileMeasurement(ProfileMeasurement.UNIT_PERCENT, arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.measurementsMap.put(ProfileMeasurement.ID_MEMORY_FOOTPRINT, new ProfileMeasurement(ProfileMeasurement.UNIT_BYTES, arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.measurementsMap.put(ProfileMeasurement.ID_MEMORY_NATIVE_FOOTPRINT, new ProfileMeasurement(ProfileMeasurement.UNIT_BYTES, arrayDeque2));
        }
    }

    public synchronized void close() {
        Future<?> future = this.scheduledFinish;
        if (future != null) {
            future.cancel(true);
            this.scheduledFinish = null;
        }
        if (this.isRunning) {
            endAndCollect(true, null);
        }
    }

    public synchronized ProfileEndData endAndCollect(boolean z2, List<PerformanceCollectionData> list) {
        if (!this.isRunning) {
            this.logger.log(SentryLevel.WARNING, "Profiler not running", new Object[0]);
            return null;
        }
        if (this.buildInfoProvider.getSdkInfoVersion() < 21) {
            return null;
        }
        try {
            Debug.stopMethodTracing();
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        this.isRunning = false;
        this.frameMetricsCollector.stopCollection(this.frameMetricsCollectorId);
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (this.traceFile == null) {
            this.logger.log(SentryLevel.ERROR, "Trace file does not exists", new Object[0]);
            return null;
        }
        if (!this.slowFrameRenderMeasurements.isEmpty()) {
            this.measurementsMap.put(ProfileMeasurement.ID_SLOW_FRAME_RENDERS, new ProfileMeasurement(ProfileMeasurement.UNIT_NANOSECONDS, this.slowFrameRenderMeasurements));
        }
        if (!this.frozenFrameRenderMeasurements.isEmpty()) {
            this.measurementsMap.put(ProfileMeasurement.ID_FROZEN_FRAME_RENDERS, new ProfileMeasurement(ProfileMeasurement.UNIT_NANOSECONDS, this.frozenFrameRenderMeasurements));
        }
        if (!this.screenFrameRateMeasurements.isEmpty()) {
            this.measurementsMap.put(ProfileMeasurement.ID_SCREEN_FRAME_RATES, new ProfileMeasurement(ProfileMeasurement.UNIT_HZ, this.screenFrameRateMeasurements));
        }
        putPerformanceCollectionDataInMeasurements(list);
        Future<?> future = this.scheduledFinish;
        if (future != null) {
            future.cancel(true);
            this.scheduledFinish = null;
        }
        return new ProfileEndData(jElapsedRealtimeNanos, elapsedCpuTime, z2, this.traceFile, this.measurementsMap);
    }

    /* JADX INFO: renamed from: lambda$start$0$io-sentry-android-core-AndroidProfiler, reason: not valid java name */
    /* synthetic */ void m8901lambda$start$0$iosentryandroidcoreAndroidProfiler() {
        endAndCollect(true, null);
    }

    public synchronized ProfileStartData start() {
        if (this.intervalUs == 0) {
            this.logger.log(SentryLevel.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(this.intervalUs));
            return null;
        }
        if (this.isRunning) {
            this.logger.log(SentryLevel.WARNING, "Profiling has already started...", new Object[0]);
            return null;
        }
        if (this.buildInfoProvider.getSdkInfoVersion() < 21) {
            return null;
        }
        this.traceFile = new File(this.traceFilesDir, UUID.randomUUID() + ".trace");
        this.measurementsMap.clear();
        this.screenFrameRateMeasurements.clear();
        this.slowFrameRenderMeasurements.clear();
        this.frozenFrameRenderMeasurements.clear();
        this.frameMetricsCollectorId = this.frameMetricsCollector.startCollection(new SentryFrameMetricsCollector.FrameMetricsCollectorListener() { // from class: io.sentry.android.core.AndroidProfiler.1
            float lastRefreshRate = 0.0f;

            @Override // io.sentry.android.core.internal.util.SentryFrameMetricsCollector.FrameMetricsCollectorListener
            public void onFrameMetricCollected(long j2, long j3, long j4, long j5, boolean z2, boolean z3, float f2) {
                long jNanoTime = ((j3 - System.nanoTime()) + SystemClock.elapsedRealtimeNanos()) - AndroidProfiler.this.profileStartNanos;
                if (jNanoTime < 0) {
                    return;
                }
                if (z3) {
                    AndroidProfiler.this.frozenFrameRenderMeasurements.addLast(new ProfileMeasurementValue(Long.valueOf(jNanoTime), Long.valueOf(j4)));
                } else if (z2) {
                    AndroidProfiler.this.slowFrameRenderMeasurements.addLast(new ProfileMeasurementValue(Long.valueOf(jNanoTime), Long.valueOf(j4)));
                }
                if (f2 != this.lastRefreshRate) {
                    this.lastRefreshRate = f2;
                    AndroidProfiler.this.screenFrameRateMeasurements.addLast(new ProfileMeasurementValue(Long.valueOf(jNanoTime), Float.valueOf(f2)));
                }
            }
        });
        try {
            this.scheduledFinish = this.executorService.schedule(new Runnable() { // from class: io.sentry.android.core.AndroidProfiler$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8901lambda$start$0$iosentryandroidcoreAndroidProfiler();
                }
            }, 30000L);
        } catch (RejectedExecutionException e2) {
            this.logger.log(SentryLevel.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e2);
        }
        this.profileStartNanos = SystemClock.elapsedRealtimeNanos();
        Date currentDateTime = DateUtils.getCurrentDateTime();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        try {
            Debug.startMethodTracingSampling(this.traceFile.getPath(), BUFFER_SIZE_BYTES, this.intervalUs);
            this.isRunning = true;
            return new ProfileStartData(this.profileStartNanos, elapsedCpuTime, currentDateTime);
        } catch (Throwable th) {
            endAndCollect(false, null);
            this.logger.log(SentryLevel.ERROR, "Unable to start a profile: ", th);
            this.isRunning = false;
            return null;
        }
    }
}
