package t0;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Map;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class superior {
    public static final ByteArrayInputStream a(HttpURLConnection httpURLConnection, InputStream inputStream, v.civilian civilianVar) throws IOException {
        try {
            byte[] bytes = ByteStreamsKt.readBytes(inputStream);
            CloseableKt.closeFinally(inputStream, null);
            String str = bytes != null ? new String(bytes, Charsets.UTF_8) : null;
            civilianVar.getClass();
            BuildersKt__Builders_commonKt.launch$default(civilianVar.f28341e, null, null, new v.pair(civilianVar, new f.apparatus(httpURLConnection, str), null), 3, null);
            if (bytes != null) {
                return new ByteArrayInputStream(bytes);
            }
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(inputStream, th);
                throw th2;
            }
        }
    }

    public static final void a(HttpURLConnection httpURLConnection, v.civilian civilianVar) {
        try {
            for (Map.Entry entry : civilianVar.a().f19694f.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str2.length() > 0) {
                    httpURLConnection.setRequestProperty(str, str2);
                }
            }
        } catch (IllegalStateException unused) {
        }
    }
}
