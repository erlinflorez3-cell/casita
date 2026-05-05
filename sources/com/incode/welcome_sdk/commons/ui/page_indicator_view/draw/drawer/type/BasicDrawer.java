package com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type;

import android.graphics.Paint;
import android.os.Process;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator;

/* JADX INFO: loaded from: classes5.dex */
public class BasicDrawer extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f6226a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f6227c = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f6228i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f6229j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f6230b;

    public BasicDrawer(Paint paint, Indicator indicator) {
        super(paint, indicator);
        Paint paint2 = new Paint();
        this.f6230b = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f6230b.setAntiAlias(true);
        this.f6230b.setStrokeWidth(indicator.j());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.graphics.Canvas r19, int r20, boolean r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type.BasicDrawer.b(android.graphics.Canvas, int, boolean, int, int):void");
    }

    public static int d() {
        int i2 = f6227c;
        int i3 = i2 % 7426051;
        f6227c = i2 + 1;
        if (i3 != 0) {
            return f6226a;
        }
        int iMyTid = Process.myTid();
        f6226a = iMyTid;
        return iMyTid;
    }
}
