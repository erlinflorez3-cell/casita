package com.dynatrace.android.agent.mixed;

import android.os.SystemClock;
import com.dynatrace.agent.common.time.TimeProvider;
import com.dynatrace.android.agent.DeviceStartTimeProvider;
import com.dynatrace.android.agent.TimeLineProvider;

/* JADX INFO: loaded from: classes3.dex */
public class TimeProviderFactory {

    private static class SystemTimeProvider implements TimeProvider {
        private final DeviceStartTimeProvider deviceStartTimeProvider;

        private SystemTimeProvider(DeviceStartTimeProvider deviceStartTimeProvider) {
            this.deviceStartTimeProvider = deviceStartTimeProvider;
        }

        @Override // com.dynatrace.agent.common.time.TimeProvider
        public long millisSinceEpoch() {
            return this.deviceStartTimeProvider.getDeviceStartTimeMillis() + SystemClock.elapsedRealtime();
        }

        @Override // com.dynatrace.agent.common.time.TimeProvider
        public long nanosSinceEpoch() {
            return this.deviceStartTimeProvider.getDeviceStartTimeNanos() + SystemClock.elapsedRealtimeNanos();
        }
    }

    public TimeProvider createTimelineProvider() {
        return new SystemTimeProvider(TimeLineProvider.DEVICE_START_TIME_PROVIDER);
    }
}
