package o.k;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.dynatrace.android.callback.Callback;
import fr.antelop.sdk.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.ea.k;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.Od;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends Fragment {

    /* JADX INFO: renamed from: a */
    private static int f26319a = 0;

    /* JADX INFO: renamed from: e */
    private static int f26320e = 1;

    /* JADX INFO: renamed from: b */
    private View f26321b;

    /* JADX INFO: renamed from: c */
    private final b f26322c;

    /* JADX INFO: renamed from: d */
    private final a f26323d;

    /* JADX INFO: renamed from: o.k.e$5 */
    final class AnonymousClass5 extends k {

        /* JADX INFO: renamed from: b */
        private static int f26324b = 1;

        /* JADX INFO: renamed from: e */
        private static int f26325e = 0;

        AnonymousClass5() {
        }

        @Override // o.ea.k
        public final void c(Context context) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f26324b;
            int i4 = (i3 ^ 13) + (((-1) - (((-1) - i3) | ((-1) - 13))) << 1);
            f26325e = i4 % 128;
            int i5 = i4 % 2;
            Context contextRequireContext = e.this.requireContext();
            int i6 = R.string.antelopConsentPromptOverlayWarningMessage;
            Class<?> cls = Class.forName(C1593ug.zd("\u0019'\u001e-+&\"l#007)3:t\u000b88?1EB", (short) (C1499aX.Xd() ^ (-3290)), (short) (C1499aX.Xd() ^ (-21567))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i6)};
            Method method = cls.getMethod(C1561oA.od("WTb@`]SWO", (short) (Od.Xd() ^ (-538))), clsArr);
            try {
                method.setAccessible(true);
                Toast.makeText(context, (String) method.invoke(contextRequireContext, objArr), 1).show();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    protected interface a {
        void b();

        void d();
    }

    public e(b bVar, a aVar) {
        this.f26322c = bVar;
        this.f26323d = aVar;
    }

    private /* synthetic */ void a(View view) {
        int i2 = 2 % 2;
        int i3 = f26320e;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 3))) << 1) - (i3 ^ 3);
        f26319a = i4 % 128;
        int i5 = i4 % 2;
        this.f26323d.b();
        int i6 = f26319a;
        int i7 = (i6 ^ 27) + (((i6 + 27) - (i6 | 27)) << 1);
        f26320e = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private /* synthetic */ void c(View view) {
        int i2 = 2 % 2;
        int i3 = f26319a;
        int i4 = (((i3 + 73) - (73 & i3)) << 1) - (i3 ^ 73);
        f26320e = i4 % 128;
        int i5 = i4 % 2;
        this.f26323d.d();
        int i6 = f26319a;
        int i7 = ((i6 + 115) - (115 | i6)) + ((-1) - (((-1) - i6) & ((-1) - 115)));
        f26320e = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: instrumented$0$onCreateView$-Landroid-view-LayoutInflater-Landroid-view-ViewGroup-Landroid-os-Bundle--Landroid-view-View- */
    public static /* synthetic */ void m10647xd0e31f79(e eVar, View view) {
        Callback.onClick_enter(view);
        try {
            eVar.a(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$1$onCreateView$-Landroid-view-LayoutInflater-Landroid-view-ViewGroup-Landroid-os-Bundle--Landroid-view-View- */
    public static /* synthetic */ void m10648x961510d8(e eVar, View view) {
        Callback.onClick_enter(view);
        try {
            eVar.c(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x004c A[PHI: r0
  0x004c: PHI (r0v59 o.l.c) = (r0v9 o.l.c), (r0v66 o.l.c) binds: [B:44:0x00fb, B:37:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r16, android.view.ViewGroup r17, android.os.Bundle r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.k.e.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
