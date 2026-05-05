package com.dynatrace.android.agent.mixed;

import android.content.Context;
import com.dynatrace.agent.di.SecondGenServiceLocator;
import com.dynatrace.agent.di.SelfMonitoringComponent;
import com.dynatrace.agent.di.SessionInformationProvider;
import com.dynatrace.agent.metrics.SecondGenMetricsProvider;
import com.dynatrace.android.agent.metrics.AppVersionTracker;
import com.dynatrace.android.agent.metrics.BatteryTracker;
import com.dynatrace.android.agent.util.SdkVersionProviderImpl;
import com.dynatrace.android.internal.api.SelfMonitoring;

/* JADX INFO: loaded from: classes3.dex */
public class SecondGenServiceLocatorImpl implements SecondGenServiceLocator {
    private final Context context;

    public SecondGenServiceLocatorImpl(Context context) {
        this.context = context;
    }

    @Override // com.dynatrace.agent.di.SecondGenServiceLocator
    public SecondGenMetricsProvider locateMetricsProvider() {
        return new SecondGenMetricsProviderImpl(new AppVersionTracker(this.context, new SdkVersionProviderImpl()), BatteryTracker.generateBatteryTracker(this.context));
    }

    @Override // com.dynatrace.agent.di.SecondGenServiceLocator
    public SelfMonitoringComponent locateSelfMonitoring() {
        return new SelfMonitoringComponent() { // from class: com.dynatrace.android.agent.mixed.SecondGenServiceLocatorImpl$$ExternalSyntheticLambda0
            @Override // com.dynatrace.agent.di.SelfMonitoringComponent
            public final void reportLogEvent(String str, String str2) {
                SelfMonitoring.reportLogEvent(str, str2);
            }
        };
    }

    @Override // com.dynatrace.agent.di.SecondGenServiceLocator
    public SessionInformationProvider locateSessionInformationProvider() {
        return new SessionInformationProviderImpl();
    }
}
