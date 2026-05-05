package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdy;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzjm;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class AppMeasurementSdk {
    private final zzdy zza;

    public static final class ConditionalUserProperty {
        public static final String ACTIVE = "active";
        public static final String CREATION_TIMESTAMP = "creation_timestamp";
        public static final String EXPIRED_EVENT_NAME = "expired_event_name";
        public static final String EXPIRED_EVENT_PARAMS = "expired_event_params";
        public static final String NAME = "name";
        public static final String ORIGIN = "origin";
        public static final String TIMED_OUT_EVENT_NAME = "timed_out_event_name";
        public static final String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";
        public static final String TIME_TO_LIVE = "time_to_live";
        public static final String TRIGGERED_EVENT_NAME = "triggered_event_name";
        public static final String TRIGGERED_EVENT_PARAMS = "triggered_event_params";
        public static final String TRIGGERED_TIMESTAMP = "triggered_timestamp";
        public static final String TRIGGER_EVENT_NAME = "trigger_event_name";
        public static final String TRIGGER_TIMEOUT = "trigger_timeout";
        public static final String VALUE = "value";

        private ConditionalUserProperty() {
        }
    }

    public interface EventInterceptor extends zzjm {
        @Override // com.google.android.gms.measurement.internal.zzjm
        void interceptEvent(String str, String str2, Bundle bundle, long j2);
    }

    public interface OnEventListener extends zzjl {
        @Override // com.google.android.gms.measurement.internal.zzjl
        void onEvent(String str, String str2, Bundle bundle, long j2);
    }

    public AppMeasurementSdk(zzdy zzdyVar) {
        this.zza = zzdyVar;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return zzdy.zza(context).zzb();
    }

    public static AppMeasurementSdk getInstance(Context context, String str, String str2, String str3, Bundle bundle) {
        return zzdy.zza(context, str, str2, str3, bundle).zzb();
    }

    public void beginAdUnitExposure(String str) {
        this.zza.zzb(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.zza.zza(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.zza.zzc(str);
    }

    public long generateEventId() {
        return this.zza.zza();
    }

    public String getAppIdOrigin() {
        return this.zza.zzd();
    }

    public String getAppInstanceId() {
        return this.zza.zzf();
    }

    public List<Bundle> getConditionalUserProperties(String str, String str2) {
        return this.zza.zza(str, str2);
    }

    public String getCurrentScreenClass() {
        return this.zza.zzg();
    }

    public String getCurrentScreenName() {
        return this.zza.zzh();
    }

    public String getGmpAppId() {
        return this.zza.zzi();
    }

    public int getMaxUserProperties(String str) {
        return this.zza.zza(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z2) {
        return this.zza.zza(str, str2, z2);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        this.zza.zzb(str, str2, bundle);
    }

    public void logEventNoInterceptor(String str, String str2, Bundle bundle, long j2) {
        this.zza.zza(str, str2, bundle, j2);
    }

    public void performAction(Bundle bundle) {
        this.zza.zza(bundle, false);
    }

    public Bundle performActionWithResponse(Bundle bundle) {
        return this.zza.zza(bundle, true);
    }

    public void registerOnMeasurementEventListener(OnEventListener onEventListener) {
        this.zza.zza(onEventListener);
    }

    public void setConditionalUserProperty(Bundle bundle) {
        this.zza.zza(bundle);
    }

    public void setConsent(Bundle bundle) {
        this.zza.zzb(bundle);
    }

    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.zza.zza(activity, str, str2);
    }

    public void setEventInterceptor(EventInterceptor eventInterceptor) {
        this.zza.zza(eventInterceptor);
    }

    public void setMeasurementEnabled(Boolean bool) {
        this.zza.zza(bool);
    }

    public void setMeasurementEnabled(boolean z2) {
        this.zza.zza(Boolean.valueOf(z2));
    }

    public void setUserProperty(String str, String str2, Object obj) {
        this.zza.zza(str, str2, obj, true);
    }

    public void unregisterOnMeasurementEventListener(OnEventListener onEventListener) {
        this.zza.zzb(onEventListener);
    }

    public final void zza(boolean z2) {
        this.zza.zza(z2);
    }
}
