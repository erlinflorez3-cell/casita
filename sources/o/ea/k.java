package o.ea;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f23558a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f23559b = 1;

    public abstract void c(Context context);

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i2 = 2 % 2;
        int i3 = f23559b;
        int i4 = (((-1) - (((-1) - i3) & ((-1) - 73))) << 1) - (i3 ^ 73);
        f23558a = i4 % 128;
        int i5 = i4 % 2;
        if ((motionEvent.getFlags() & 1) == 0) {
            int i6 = f23558a + 15;
            f23559b = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = f23559b + 89;
        f23558a = i8 % 128;
        int i9 = i8 % 2;
        if (motionEvent.getAction() == 1) {
            int i10 = f23559b;
            int i11 = ((-1) - (((-1) - i10) | ((-1) - 41))) + (i10 | 41);
            f23558a = i11 % 128;
            int i12 = i11 % 2;
            c(view.getContext());
            int i13 = f23559b;
            int i14 = (i13 & 35) + ((i13 + 35) - (i13 & 35));
            f23558a = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 3 / 4;
            }
        }
        int i16 = f23558a;
        int i17 = (i16 ^ 95) + ((i16 & 95) << 1);
        f23559b = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 74 / 0;
        }
        return true;
    }
}
