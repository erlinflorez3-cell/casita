package o.ea;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f23581d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f23582e = 1;

    public static <T> T c(Task<T> task) {
        int i2 = 2 % 2;
        int i3 = f23581d;
        int i4 = ((i3 + 41) - (41 | i3)) + ((i3 + 41) - (i3 & 41));
        f23582e = i4 % 128;
        int i5 = i4 % 2;
        try {
            T t2 = (T) Tasks.await(task);
            int i6 = f23581d + 99;
            f23582e = i6 % 128;
            int i7 = i6 % 2;
            return t2;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}
