package a1;

import android.content.pm.ResolveInfo;
import android.util.JsonWriter;
import com.braze.models.inappmessage.InAppMessageBase;
import io.sentry.protocol.SentryThread;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class civilian implements z0.pair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final civilian f89a = new civilian();

    @Override // z0.pair
    public final void a(Object obj, JsonWriter jsonWriter) throws IOException {
        ResolveInfo resolveInfo = (ResolveInfo) obj;
        jsonWriter.beginObject();
        jsonWriter.name(InAppMessageBase.ICON);
        jsonWriter.value(Integer.valueOf(resolveInfo.icon));
        jsonWriter.name("isDefault");
        jsonWriter.value(resolveInfo.isDefault);
        jsonWriter.name("isInstantAppAvailable");
        jsonWriter.value(resolveInfo.isInstantAppAvailable);
        jsonWriter.name("labelRes");
        jsonWriter.value(Integer.valueOf(resolveInfo.labelRes));
        jsonWriter.name("match");
        jsonWriter.value(Integer.valueOf(resolveInfo.match));
        jsonWriter.name("preferredOrder");
        jsonWriter.value(Integer.valueOf(resolveInfo.preferredOrder));
        jsonWriter.name(SentryThread.JsonKeys.PRIORITY);
        jsonWriter.value(Integer.valueOf(resolveInfo.priority));
        jsonWriter.name("specificIndex");
        jsonWriter.value(Integer.valueOf(resolveInfo.specificIndex));
        jsonWriter.endObject();
    }
}
