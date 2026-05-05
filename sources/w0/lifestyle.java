package w0;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class lifestyle extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lifestyle f28392a = new lifestyle();

    public lifestyle() {
        super(1);
    }

    public static String a(Map.Entry entry) throws UnsupportedEncodingException {
        String str = (String) entry.getKey();
        String str2 = (String) entry.getValue();
        return URLEncoder.encode(str, "UTF-8") + "=" + URLEncoder.encode(str2, "UTF-8");
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a((Map.Entry) obj);
    }
}
