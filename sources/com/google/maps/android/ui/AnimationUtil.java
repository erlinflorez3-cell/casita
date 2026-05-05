package com.google.maps.android.ui;

import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes7.dex */
public class AnimationUtil {

    interface LatLngInterpolator {

        public static class Linear implements LatLngInterpolator {
            @Override // com.google.maps.android.ui.AnimationUtil.LatLngInterpolator
            public LatLng interpolate(float f2, LatLng latLng, LatLng latLng2) {
                double d2 = f2;
                double d3 = ((latLng2.latitude - latLng.latitude) * d2) + latLng.latitude;
                double dSignum = latLng2.longitude - latLng.longitude;
                if (Math.abs(dSignum) > 180.0d) {
                    dSignum -= Math.signum(dSignum) * 360.0d;
                }
                return new LatLng(d3, (dSignum * d2) + latLng.longitude);
            }
        }

        LatLng interpolate(float f2, LatLng latLng, LatLng latLng2);
    }

    public static void animateMarkerTo(final Marker marker, final LatLng latLng) throws Throwable {
        final LatLngInterpolator.Linear linear = new LatLngInterpolator.Linear();
        final LatLng position = marker.getPosition();
        final Handler handler = new Handler();
        final long jUptimeMillis = SystemClock.uptimeMillis();
        final AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        Object[] objArr = {new Runnable() { // from class: com.google.maps.android.ui.AnimationUtil.1
            long elapsed;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            float f3536t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            float f3537v;

            @Override // java.lang.Runnable
            public void run() throws Throwable {
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                this.elapsed = jUptimeMillis2;
                float f2 = jUptimeMillis2 / 2000.0f;
                this.f3536t = f2;
                float interpolation = accelerateDecelerateInterpolator.getInterpolation(f2);
                this.f3537v = interpolation;
                marker.setPosition(linear.interpolate(interpolation, position, latLng));
                if (this.f3536t < 1.0f) {
                    Handler handler2 = handler;
                    short sXd = (short) (C1633zX.Xd() ^ (-9510));
                    int[] iArr = new int["9E:GC<6~?B{\u0015-9.5-9".length()];
                    QB qb = new QB("9E:GC<6~?B{\u0015-9.5-9");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                        i2++;
                    }
                    Object[] objArr2 = {this, 16L};
                    Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Wg.Zd("\\B#\u000b\u0017\u001f\u0003.3\u00061", (short) (Od.Xd() ^ (-26578)), (short) (Od.Xd() ^ (-7913))), Class.forName(C1561oA.Kd("SKaM\u001bZP^X EicdXZe_", (short) (ZN.Xd() ^ 8065))), Long.TYPE);
                    try {
                        method.setAccessible(true);
                        method.invoke(handler2, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
        }};
        Method method = Class.forName(C1561oA.Xd("\u0004\u0012\t\u0018\u0016\u0011\rW\u001a\u001fZu\u0010\u001e\u0015\u001e\u0018&", (short) (C1633zX.Xd() ^ (-2173)))).getMethod(Qg.kd("\" ##", (short) (ZN.Xd() ^ 17634), (short) (ZN.Xd() ^ 29678)), Class.forName(Wg.vd("^VlX&e[iS\u001b@d^_SUPJ", (short) (C1499aX.Xd() ^ (-9493)))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
