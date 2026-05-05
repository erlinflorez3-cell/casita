package a1;

import android.util.JsonWriter;
import com.cleafy.mobile.detection.agent.configuration.CleafyConfigConstants;
import com.cleafy.mobile.detection.agent.configuration.CleafyDetectorsConfiguration;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class apparatus implements z0.pair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final apparatus f88a = new apparatus();

    @Override // z0.pair
    public final void a(Object obj, JsonWriter jsonWriter) throws IOException {
        CleafyDetectorsConfiguration cleafyDetectorsConfiguration = (CleafyDetectorsConfiguration) obj;
        jsonWriter.beginObject();
        jsonWriter.name(CleafyConfigConstants.HTTP_DETECTOR_ENABLED);
        jsonWriter.value(cleafyDetectorsConfiguration.f2801a);
        jsonWriter.name(CleafyConfigConstants.CERTIFICATE_DETECTOR_ENABLED);
        jsonWriter.value(cleafyDetectorsConfiguration.f2802b);
        jsonWriter.name(CleafyConfigConstants.CERTIFICATE_DETECTOR_ENDPOINT);
        jsonWriter.value(cleafyDetectorsConfiguration.f2803c);
        jsonWriter.name(CleafyConfigConstants.MONITORED_APP_ENABLED);
        jsonWriter.value(cleafyDetectorsConfiguration.f2804d);
        jsonWriter.name(CleafyConfigConstants.ACTIVITY_DETECTOR_ENABLED);
        jsonWriter.value(cleafyDetectorsConfiguration.f2805e);
        jsonWriter.name(CleafyConfigConstants.ADVANCED_CERTIFICATE_DETECTOR_ENABLED);
        jsonWriter.value(cleafyDetectorsConfiguration.f2806f);
        jsonWriter.name(CleafyConfigConstants.ROOT_DETECTOR_ENABLED);
        jsonWriter.value(cleafyDetectorsConfiguration.f2807g);
        jsonWriter.name(CleafyConfigConstants.TASK_INJECTION_ENABLED);
        jsonWriter.value(cleafyDetectorsConfiguration.f2808h);
        jsonWriter.name(CleafyConfigConstants.MOCK_LOCATION_ENABLED);
        jsonWriter.value(cleafyDetectorsConfiguration.f2809i);
        jsonWriter.name(CleafyConfigConstants.ADVANCED_MOCK_LOCATION_ENABLED);
        jsonWriter.value(cleafyDetectorsConfiguration.f2810j);
        jsonWriter.name(CleafyConfigConstants.ON_CALL_DETECTOR_ENABLED);
        jsonWriter.value(cleafyDetectorsConfiguration.f2811k);
        jsonWriter.name(CleafyConfigConstants.HUMAN_DETECTOR_ENABLED);
        jsonWriter.value(cleafyDetectorsConfiguration.f2812l);
        jsonWriter.name(CleafyConfigConstants.NFC_DETECTOR_ENABLED);
        jsonWriter.value(cleafyDetectorsConfiguration.f2813m);
        jsonWriter.name(CleafyConfigConstants.GPS_DETECTOR_ENABLED);
        jsonWriter.value(cleafyDetectorsConfiguration.f2814n);
        jsonWriter.name(CleafyConfigConstants.EXTENDED_OVERLAY_DETECTOR_ENABLED);
        jsonWriter.value(cleafyDetectorsConfiguration.f2815o);
        jsonWriter.endObject();
    }
}
