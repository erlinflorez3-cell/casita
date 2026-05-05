package a1;

import android.util.JsonWriter;
import com.cleafy.mobile.detection.agent.configuration.CleafyConfigConstants;
import com.cleafy.mobile.detection.agent.configuration.CleafyConfiguration;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class tongue implements z0.pair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tongue f92a = new tongue();

    @Override // z0.pair
    public final void a(Object obj, JsonWriter jsonWriter) throws IOException {
        CleafyConfiguration cleafyConfiguration = (CleafyConfiguration) obj;
        jsonWriter.beginObject();
        jsonWriter.name(CleafyConfigConstants.API_ENDPOINT);
        jsonWriter.value(cleafyConfiguration.f2789a);
        jsonWriter.name(CleafyConfigConstants.APPLICATION_HOSTNAME);
        jsonWriter.value(cleafyConfiguration.f2790b);
        jsonWriter.name(CleafyConfigConstants.INTEGRATION_TOKEN);
        jsonWriter.value(cleafyConfiguration.f2791c);
        jsonWriter.name("is_default_enabled");
        jsonWriter.value(cleafyConfiguration.f2792d);
        jsonWriter.name(CleafyConfigConstants.AUTOMATIC_UPDATE_ANALYSIS);
        jsonWriter.value(cleafyConfiguration.f2793e.name());
        jsonWriter.name("emulator_debug_analysis");
        jsonWriter.value(cleafyConfiguration.f2794f.name());
        jsonWriter.name(CleafyConfigConstants.PACKAGE_ANALYSIS_ENABLED);
        jsonWriter.value(cleafyConfiguration.f2795g);
        jsonWriter.name(CleafyConfigConstants.EXTENDED_PACKAGE_INFORMATION);
        jsonWriter.value(cleafyConfiguration.f2796h);
        jsonWriter.name("sensitive_identifier_collection_enabled");
        jsonWriter.value(cleafyConfiguration.f2797i);
        jsonWriter.name(CleafyConfigConstants.HASH_SENSITIVE_IDENTIFIERS);
        jsonWriter.value(cleafyConfiguration.f2798j);
        jsonWriter.name(CleafyConfigConstants.ALLOW_UNTRUSTED_CERTIFICATES);
        jsonWriter.value(cleafyConfiguration.f2799k);
        jsonWriter.name("detectors_configuration");
        apparatus.f88a.a(cleafyConfiguration.f2800l, jsonWriter);
        jsonWriter.endObject();
    }
}
