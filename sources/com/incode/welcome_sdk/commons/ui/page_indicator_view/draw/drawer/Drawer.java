package com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.Value;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.data.Indicator;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type.BasicDrawer;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type.ColorDrawer;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type.DropDrawer;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type.FillDrawer;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type.ScaleDownDrawer;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type.ScaleDrawer;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type.SlideDrawer;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type.SwapDrawer;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type.ThinWormDrawer;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.draw.drawer.type.WormDrawer;
import com.incode.welcome_sdk.e.a;

/* JADX INFO: loaded from: classes5.dex */
public class Drawer {

    /* JADX INFO: renamed from: m */
    private static int f6211m = 0;

    /* JADX INFO: renamed from: n */
    private static int f6212n = 1;

    /* JADX INFO: renamed from: a */
    private BasicDrawer f6213a;

    /* JADX INFO: renamed from: b */
    private WormDrawer f6214b;

    /* JADX INFO: renamed from: c */
    private ColorDrawer f6215c;

    /* JADX INFO: renamed from: d */
    private ScaleDrawer f6216d;

    /* JADX INFO: renamed from: e */
    private SlideDrawer f6217e;

    /* JADX INFO: renamed from: f */
    private DropDrawer f6218f;

    /* JADX INFO: renamed from: g */
    private SwapDrawer f6219g;

    /* JADX INFO: renamed from: h */
    private ScaleDownDrawer f6220h;

    /* JADX INFO: renamed from: i */
    private ThinWormDrawer f6221i;

    /* JADX INFO: renamed from: j */
    private FillDrawer f6222j;

    /* JADX INFO: renamed from: k */
    private int f6223k;

    /* JADX INFO: renamed from: l */
    private int f6224l;

    /* JADX INFO: renamed from: o */
    private int f6225o;

    public static /* synthetic */ Object e(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i3;
        int i9 = ~(i8 | i4);
        int i10 = ~(i8 | i5);
        int i11 = i9 | i10;
        int i12 = ~i4;
        int i13 = (~((~i5) | i8 | i4)) | (~(i8 | i12 | i5));
        int i14 = i10 | (~(i12 | i3));
        int i15 = i3 + i4 + i6 + ((-1696018712) * i2) + (2108813197 * i7);
        int i16 = i15 * i15;
        int i17 = ((212195308 * i3) - 2121662464) + (1221732374 * i4) + (1009537066 * i11) + (i13 * (-504768533)) + ((-504768533) * i14) + (716963840 * i6) + (39845888 * i2) + (227278848 * i7) + ((-1705377792) * i16);
        int i18 = ((i3 * 362004572) - 1408384217) + (i4 * 362004174) + (i11 * (-398)) + (i13 * 199) + (i14 * 199) + (i6 * 362004373) + (i2 * (-1290304248)) + (i7 * 155295761) + (i16 * (-60686336));
        if (i17 + (i18 * i18 * (-1680474112)) == 1) {
            return d(objArr);
        }
        Drawer drawer = (Drawer) objArr[0];
        Canvas canvas = (Canvas) objArr[1];
        Value value = (Value) objArr[2];
        int i19 = 2 % 2;
        int i20 = f6212n;
        int i21 = i20 + 1;
        f6211m = i21 % 128;
        int i22 = i21 % 2;
        ScaleDrawer scaleDrawer = drawer.f6216d;
        if (scaleDrawer != null) {
            int i23 = i20 + 3;
            f6211m = i23 % 128;
            int i24 = i23 % 2;
            scaleDrawer.c(canvas, value, drawer.f6223k, drawer.f6225o, drawer.f6224l);
            int i25 = f6211m + 95;
            f6212n = i25 % 128;
            int i26 = i25 % 2;
        }
        return null;
    }

    public Drawer(Indicator indicator) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f6213a = new BasicDrawer(paint, indicator);
        this.f6215c = new ColorDrawer(paint, indicator);
        this.f6216d = new ScaleDrawer(paint, indicator);
        this.f6214b = new WormDrawer(paint, indicator);
        this.f6217e = new SlideDrawer(paint, indicator);
        this.f6222j = new FillDrawer(paint, indicator);
        this.f6221i = new ThinWormDrawer(paint, indicator);
        this.f6218f = new DropDrawer(paint, indicator);
        this.f6219g = new SwapDrawer(paint, indicator);
        this.f6220h = new ScaleDownDrawer(paint, indicator);
    }

    public void setup(int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = f6211m + 17;
        int i7 = i6 % 128;
        f6212n = i7;
        int i8 = i6 % 2;
        this.f6223k = i2;
        this.f6225o = i3;
        this.f6224l = i4;
        int i9 = i7 + 83;
        f6211m = i9 % 128;
        int i10 = i9 % 2;
    }

    public final void d(Canvas canvas, boolean z2) {
        int i2 = 2 % 2;
        if (this.f6215c != null) {
            int i3 = f6212n + 87;
            f6211m = i3 % 128;
            if (i3 % 2 != 0) {
                this.f6213a.b(canvas, this.f6223k, z2, this.f6225o, this.f6224l);
                throw null;
            }
            this.f6213a.b(canvas, this.f6223k, z2, this.f6225o, this.f6224l);
            int i4 = f6211m + 49;
            f6212n = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void c(Canvas canvas, Value value) {
        int i2 = 2 % 2;
        int i3 = f6212n;
        int i4 = i3 + 107;
        f6211m = i4 % 128;
        int i5 = i4 % 2;
        ColorDrawer colorDrawer = this.f6215c;
        if (colorDrawer != null) {
            int i6 = i3 + 17;
            f6211m = i6 % 128;
            if (i6 % 2 != 0) {
                colorDrawer.a(canvas, value, this.f6223k, this.f6225o, this.f6224l);
                throw null;
            }
            colorDrawer.a(canvas, value, this.f6223k, this.f6225o, this.f6224l);
        }
        int i7 = f6212n + 125;
        f6211m = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void d(Canvas canvas, Value value) {
        int i2 = 2 % 2;
        int i3 = f6212n + 91;
        f6211m = i3 % 128;
        int i4 = i3 % 2;
        WormDrawer wormDrawer = this.f6214b;
        if (wormDrawer != null) {
            wormDrawer.a(canvas, value, this.f6225o, this.f6224l);
        }
        int i5 = f6211m + 83;
        f6212n = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
    }

    public final void e(Canvas canvas, Value value) {
        int i2 = 2 % 2;
        int i3 = f6212n;
        int i4 = i3 + 3;
        f6211m = i4 % 128;
        int i5 = i4 % 2;
        SlideDrawer slideDrawer = this.f6217e;
        if (slideDrawer != null) {
            int i6 = i3 + 25;
            f6211m = i6 % 128;
            if (i6 % 2 != 0) {
                slideDrawer.e(canvas, value, this.f6225o, this.f6224l);
                throw null;
            }
            slideDrawer.e(canvas, value, this.f6225o, this.f6224l);
        }
        int i7 = f6211m + 71;
        f6212n = i7 % 128;
        int i8 = i7 % 2;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        Drawer drawer = (Drawer) objArr[0];
        Canvas canvas = (Canvas) objArr[1];
        Value value = (Value) objArr[2];
        int i2 = 2 % 2;
        int i3 = f6211m + 101;
        int i4 = i3 % 128;
        f6212n = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            FillDrawer fillDrawer = drawer.f6222j;
            obj.hashCode();
            throw null;
        }
        FillDrawer fillDrawer2 = drawer.f6222j;
        if (fillDrawer2 != null) {
            int i5 = i4 + 79;
            f6211m = i5 % 128;
            if (i5 % 2 != 0) {
                fillDrawer2.c(canvas, value, drawer.f6223k, drawer.f6225o, drawer.f6224l);
                obj.hashCode();
                throw null;
            }
            fillDrawer2.c(canvas, value, drawer.f6223k, drawer.f6225o, drawer.f6224l);
        }
        return null;
    }

    public final void f(Canvas canvas, Value value) {
        int i2 = 2 % 2;
        int i3 = f6211m;
        int i4 = i3 + 75;
        f6212n = i4 % 128;
        int i5 = i4 % 2;
        ThinWormDrawer thinWormDrawer = this.f6221i;
        if (thinWormDrawer != null) {
            int i6 = i3 + 57;
            f6212n = i6 % 128;
            int i7 = i6 % 2;
            thinWormDrawer.a(canvas, value, this.f6225o, this.f6224l);
            int i8 = f6211m + 77;
            f6212n = i8 % 128;
            int i9 = i8 % 2;
        }
        int i10 = f6211m + 41;
        f6212n = i10 % 128;
        int i11 = i10 % 2;
    }

    public final void i(Canvas canvas, Value value) {
        int i2 = 2 % 2;
        int i3 = f6211m + 107;
        f6212n = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 92 / 0;
            if (this.f6218f == null) {
                return;
            }
        } else if (this.f6218f == null) {
            return;
        }
        this.f6218f.b(canvas, value, this.f6225o, this.f6224l);
        int i5 = f6211m + 83;
        f6212n = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void j(Canvas canvas, Value value) {
        int i2 = 2 % 2;
        int i3 = f6211m + 51;
        f6212n = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        SwapDrawer swapDrawer = this.f6219g;
        if (swapDrawer != null) {
            swapDrawer.e(canvas, value, this.f6223k, this.f6225o, this.f6224l);
            int i4 = f6211m + 111;
            f6212n = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void h(Canvas canvas, Value value) {
        int i2 = 2 % 2;
        int i3 = f6211m + 111;
        f6212n = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 42 / 0;
            if (this.f6220h == null) {
                return;
            }
        } else if (this.f6220h == null) {
            return;
        }
        this.f6220h.e(canvas, value, this.f6223k, this.f6225o, this.f6224l);
        int i5 = f6212n + 75;
        f6211m = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void b(Canvas canvas, Value value) {
        e(new Object[]{this, canvas, value}, a.b.h.b(), 1908751712, -1908751711, a.b.h.b(), a.b.h.b(), a.b.h.b());
    }

    public final void a(Canvas canvas, Value value) {
        e(new Object[]{this, canvas, value}, a.b.h.b(), -2005120674, 2005120674, a.b.h.b(), a.b.h.b(), a.b.h.b());
    }
}
