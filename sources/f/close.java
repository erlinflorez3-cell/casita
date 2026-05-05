package f;

import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import okio.Buffer;
import okio.GzipSource;

/* JADX INFO: loaded from: classes5.dex */
public final class close extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final close f18490a = new close();

    public close() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws IOException {
        Buffer buffer = new Buffer();
        buffer.writeAll(new GzipSource((Buffer) obj));
        return buffer;
    }
}
