package o.ed;

import android.graphics.Color;
import android.view.View;
import o.by.e;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char[] f23687b = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f23688f = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f23689i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static char f23690j = 0;

    static {
        b();
        Color.blue(0);
        View.resolveSizeAndState(0, 0, 0);
        int i2 = f23689i + 121;
        f23688f = i2 % 128;
        int i3 = i2 % 2;
    }

    static void b() {
        f23687b = new char[]{64580, 64582, 64576, 64587, 64592, 64605, 64588, 64625, 64599, 64630, 64586, 64620, 64609, 64597, 64614, 64593};
        f23690j = (char) 51643;
    }
}
