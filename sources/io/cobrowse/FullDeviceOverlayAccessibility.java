package io.cobrowse;

import android.accessibilityservice.AccessibilityService;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.core.util.Consumer;
import com.braze.models.FeatureFlag;
import com.npmdavi.davinotification.Constant;
import io.cobrowse.CobrowseAccessibilityService;
import io.sentry.protocol.SentryThread;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.Wg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
class FullDeviceOverlayAccessibility extends BroadcastReceiver implements CobrowseAccessibilityService.AccessibilityInjector {
    private static final String ACTION_DRAWING = "drawing";
    private static final String ACTION_LASER = "laser";
    private static final String ACTION_SESSION_STATE = "session_state";
    private static final String FULL_DEVICE_OVERLAY_INTENT = "io.cobrowse.FULL_DEVICE_OVERLAY";
    private final Map<String, Consumer<Bundle>> broadcastSenders = new AnonymousClass1();
    private boolean isOverlayAllowed;
    private AccessibilityAnnotationOverlay overlay;
    private final AccessibilityService service;
    private Drawing toBeDrawn;

    /* JADX INFO: renamed from: io.cobrowse.FullDeviceOverlayAccessibility$1, reason: invalid class name */
    class AnonymousClass1 extends HashMap<String, Consumer<Bundle>> {
        AnonymousClass1() {
            put(FullDeviceOverlayAccessibility.ACTION_SESSION_STATE, new Consumer() { // from class: io.cobrowse.FullDeviceOverlayAccessibility$1$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.f$0.m8822lambda$new$0$iocobrowseFullDeviceOverlayAccessibility$1((Bundle) obj);
                }
            });
            put(FullDeviceOverlayAccessibility.ACTION_LASER, new Consumer() { // from class: io.cobrowse.FullDeviceOverlayAccessibility$1$$ExternalSyntheticLambda1
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.f$0.m8823lambda$new$1$iocobrowseFullDeviceOverlayAccessibility$1((Bundle) obj);
                }
            });
            put(FullDeviceOverlayAccessibility.ACTION_DRAWING, new Consumer() { // from class: io.cobrowse.FullDeviceOverlayAccessibility$1$$ExternalSyntheticLambda2
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.f$0.m8824lambda$new$2$iocobrowseFullDeviceOverlayAccessibility$1((Bundle) obj);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$new$0$io-cobrowse-FullDeviceOverlayAccessibility$1, reason: not valid java name */
        /* synthetic */ void m8822lambda$new$0$iocobrowseFullDeviceOverlayAccessibility$1(Bundle bundle) {
            FullDeviceOverlayAccessibility.this.handleSessionState(bundle);
        }

        /* JADX INFO: renamed from: lambda$new$1$io-cobrowse-FullDeviceOverlayAccessibility$1, reason: not valid java name */
        /* synthetic */ void m8823lambda$new$1$iocobrowseFullDeviceOverlayAccessibility$1(Bundle bundle) {
            FullDeviceOverlayAccessibility.this.laser(bundle);
        }

        /* JADX INFO: renamed from: lambda$new$2$io-cobrowse-FullDeviceOverlayAccessibility$1, reason: not valid java name */
        /* synthetic */ void m8824lambda$new$2$iocobrowseFullDeviceOverlayAccessibility$1(Bundle bundle) {
            FullDeviceOverlayAccessibility.this.drawing(bundle);
        }
    }

    FullDeviceOverlayAccessibility(AccessibilityService accessibilityService) throws Throwable {
        this.service = accessibilityService;
        CompatibilityUtils.registerBroadcastReceiver(accessibilityService, this, new IntentFilter(FULL_DEVICE_OVERLAY_INTENT));
    }

    private void destroyOverlay() {
        AccessibilityAnnotationOverlay accessibilityAnnotationOverlay = this.overlay;
        if (accessibilityAnnotationOverlay != null) {
            accessibilityAnnotationOverlay.hide();
            this.overlay = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void drawing(Bundle bundle) {
        try {
            final Drawing drawing = new Drawing(new HashMap<String, Object>(bundle.getString("display"), bundle.getByteArray(FeatureFlag.PROPERTIES_TYPE_IMAGE), bundle.getString(SentryThread.JsonKeys.STATE), bundle.getFloat("x"), bundle.getFloat("y"), bundle.getFloat("width"), bundle.getFloat("height")) { // from class: io.cobrowse.FullDeviceOverlayAccessibility.3
                final /* synthetic */ String val$display;
                final /* synthetic */ float val$height;
                final /* synthetic */ byte[] val$image;
                final /* synthetic */ String val$state;
                final /* synthetic */ float val$width;
                final /* synthetic */ float val$x;
                final /* synthetic */ float val$y;

                {
                    this.val$display = str;
                    this.val$image = bArr;
                    this.val$state = str;
                    this.val$x = f;
                    this.val$y = f;
                    this.val$width = f;
                    this.val$height = f;
                    put("display", str);
                    if (bArr != null) {
                        put(FeatureFlag.PROPERTIES_TYPE_IMAGE, bArr);
                    }
                    put(SentryThread.JsonKeys.STATE, str);
                    put("x", Float.valueOf(f));
                    put("y", Float.valueOf(f));
                    put("width", Float.valueOf(f));
                    put("height", Float.valueOf(f));
                }
            });
            if (!this.isOverlayAllowed) {
                this.toBeDrawn = drawing;
                return;
            }
            if (drawing.isEmpty()) {
                destroyOverlay();
                return;
            }
            prepareOverlay();
            AccessibilityAnnotationOverlay accessibilityAnnotationOverlay = this.overlay;
            if (accessibilityAnnotationOverlay == null) {
                return;
            }
            accessibilityAnnotationOverlay.post(new Runnable() { // from class: io.cobrowse.FullDeviceOverlayAccessibility$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8819lambda$drawing$2$iocobrowseFullDeviceOverlayAccessibility(drawing);
                }
            });
        } catch (SerializationError e2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSessionState(Bundle bundle) {
        String string = bundle.getString(SentryThread.JsonKeys.STATE);
        boolean z2 = bundle.getBoolean("full_device");
        if (!"active".equals(string) || !z2) {
            if ("ended".equals(string) || !z2) {
                destroyOverlay();
                this.isOverlayAllowed = false;
                return;
            }
            return;
        }
        this.isOverlayAllowed = true;
        Drawing drawing = this.toBeDrawn;
        if (drawing == null || drawing.isEmpty()) {
            return;
        }
        prepareOverlay();
    }

    static void inject(Application application, Drawing drawing) {
        Intent intent = new Intent(FULL_DEVICE_OVERLAY_INTENT);
        intent.setPackage(application.getPackageName());
        Bundle bundle = new Bundle();
        bundle.putString(Constant.NOTIFICATION_DETAILS_ACTION, ACTION_DRAWING);
        bundle.putString("display", drawing.display);
        if (drawing.imageData != null) {
            bundle.putByteArray(FeatureFlag.PROPERTIES_TYPE_IMAGE, drawing.imageData);
        }
        if (drawing.position != null) {
            bundle.putFloat("x", drawing.position.x);
            bundle.putFloat("y", drawing.position.y);
        }
        bundle.putFloat("width", drawing.width);
        bundle.putFloat("height", drawing.height);
        intent.putExtras(bundle);
        application.sendBroadcast(intent);
    }

    static void inject(Application application, Laser laser) {
        Intent intent = new Intent(FULL_DEVICE_OVERLAY_INTENT);
        intent.setPackage(application.getPackageName());
        Bundle bundle = new Bundle();
        bundle.putString(Constant.NOTIFICATION_DETAILS_ACTION, ACTION_LASER);
        bundle.putString("display", laser.display);
        bundle.putString(SentryThread.JsonKeys.STATE, laser.state);
        if (laser.position != null) {
            bundle.putFloat("x", laser.position.x);
            bundle.putFloat("y", laser.position.y);
        }
        intent.putExtras(bundle);
        application.sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void laser(Bundle bundle) {
        if (this.isOverlayAllowed) {
            try {
                final Laser laser = new Laser(new HashMap<String, Object>(bundle.getString("display"), bundle.getString(SentryThread.JsonKeys.STATE), bundle.getFloat("x"), bundle.getFloat("y")) { // from class: io.cobrowse.FullDeviceOverlayAccessibility.2
                    final /* synthetic */ String val$display;
                    final /* synthetic */ String val$state;
                    final /* synthetic */ float val$x;
                    final /* synthetic */ float val$y;

                    {
                        this.val$display = str;
                        this.val$state = str;
                        this.val$x = f;
                        this.val$y = f;
                        put("display", str);
                        put(SentryThread.JsonKeys.STATE, str);
                        put("x", Float.valueOf(f));
                        put("y", Float.valueOf(f));
                    }
                });
                prepareOverlay();
                AccessibilityAnnotationOverlay accessibilityAnnotationOverlay = this.overlay;
                if (accessibilityAnnotationOverlay == null) {
                    return;
                }
                accessibilityAnnotationOverlay.post(new Runnable() { // from class: io.cobrowse.FullDeviceOverlayAccessibility$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m8820lambda$laser$1$iocobrowseFullDeviceOverlayAccessibility(laser);
                    }
                });
            } catch (SerializationError e2) {
            }
        }
    }

    static void notifySessionStateChanged(Application application, Session session) {
        Intent intent = new Intent(FULL_DEVICE_OVERLAY_INTENT);
        intent.setPackage(application.getPackageName());
        Bundle bundle = new Bundle();
        bundle.putString(Constant.NOTIFICATION_DETAILS_ACTION, ACTION_SESSION_STATE);
        bundle.putString(SentryThread.JsonKeys.STATE, session.state());
        bundle.putBoolean("full_device", session.fullDevice().booleanValue());
        intent.putExtras(bundle);
        application.sendBroadcast(intent);
    }

    private void prepareOverlay() {
        if (this.overlay != null) {
            return;
        }
        AccessibilityAnnotationOverlay accessibilityAnnotationOverlay = new AccessibilityAnnotationOverlay(this.service.getApplicationContext(), (WindowManager) this.service.getSystemService("window"));
        this.overlay = accessibilityAnnotationOverlay;
        accessibilityAnnotationOverlay.show();
        final Drawing drawing = this.toBeDrawn;
        this.toBeDrawn = null;
        if (drawing != null) {
            this.overlay.post(new Runnable() { // from class: io.cobrowse.FullDeviceOverlayAccessibility$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8821xd1d2285(drawing);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$drawing$2$io-cobrowse-FullDeviceOverlayAccessibility, reason: not valid java name */
    /* synthetic */ void m8819lambda$drawing$2$iocobrowseFullDeviceOverlayAccessibility(Drawing drawing) {
        AccessibilityAnnotationOverlay accessibilityAnnotationOverlay = this.overlay;
        if (accessibilityAnnotationOverlay == null) {
            return;
        }
        accessibilityAnnotationOverlay.updateDrawing(drawing);
    }

    /* JADX INFO: renamed from: lambda$laser$1$io-cobrowse-FullDeviceOverlayAccessibility, reason: not valid java name */
    /* synthetic */ void m8820lambda$laser$1$iocobrowseFullDeviceOverlayAccessibility(Laser laser) {
        AccessibilityAnnotationOverlay accessibilityAnnotationOverlay = this.overlay;
        if (accessibilityAnnotationOverlay == null) {
            return;
        }
        accessibilityAnnotationOverlay.updateLaser(laser);
        if (this.overlay.isEmpty()) {
            destroyOverlay();
        }
    }

    /* JADX INFO: renamed from: lambda$prepareOverlay$0$io-cobrowse-FullDeviceOverlayAccessibility, reason: not valid java name */
    /* synthetic */ void m8821xd1d2285(Drawing drawing) {
        this.overlay.updateDrawing(drawing);
    }

    @Override // io.cobrowse.CobrowseAccessibilityService.AccessibilityInjector
    public void onDestroy() {
        this.service.unregisterReceiver(this);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Jg.Wd("mn\u00011M=YjnL", (short) (FB.Xd() ^ 7926), (short) (FB.Xd() ^ 21268));
        try {
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("YaNC\u001e%;\nH]]4Af\u001a\u000b`I,~sD ", (short) (C1580rY.Xd() ^ (-14465)), (short) (C1580rY.Xd() ^ (-16447)))).getMethod(C1626yg.Ud("\u0010X`R\"Xn7%72[G>", (short) (ZN.Xd() ^ 11318), (short) (ZN.Xd() ^ 29440)), new Class[0]);
            try {
                method.setAccessible(true);
                if (((String) method.invoke(context, objArr)) != null) {
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(Ig.wd("F&,WBwD\u0004b \u001bEk|`=&B\u00073mJb", (short) (C1607wl.Xd() ^ 926))).getMethod(EO.Od("-|]\u0019Z\n\u001ec5F-^:,", (short) (C1580rY.Xd() ^ (-13268))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        if (((String) method2.invoke(context, objArr2)).equals(intent.getPackage())) {
                            Bundle extras = intent.getExtras();
                            if (extras == null) {
                                C1561oA.Qd("\u000b\u001d\u001a\u001b\u001e*\u0018\u0016P\u0011N\u0010\u001f\u001b\f\u000e\f\t\u001a\u001aD\u001b\f\u0016\t\u000f\u0014\u0012<\u0001\u0013\u000e\u000bx\n", (short) (OY.Xd() ^ 2218));
                                return;
                            }
                            String string = extras.getString(C1593ug.zd("vy\f\u0002\t\t", (short) (C1499aX.Xd() ^ (-16047)), (short) (C1499aX.Xd() ^ (-7870))));
                            if (string == null) {
                                C1561oA.od("\f\u001e\u001b\u001c\u001f+\u0019\u0017Q\u0012O\u0011 \u001c\r\u000f\r\n\u001b\u001bE\u001c\r\u0017\n\u0010\u0015\u0013=}~\u000f\u0003\b\u0006", (short) (OY.Xd() ^ 24632));
                                return;
                            }
                            Consumer<Bundle> consumer = this.broadcastSenders.get(string);
                            if (consumer == null) {
                                String.format(C1561oA.Kd("i}|\u007f\u0005\u0013\u0003\u0003?\u0002A\u0005\u0016\u0014\u0007\u000b\u000b\n\u001d\u001fK$\u0017#\u0018P'!\u001f#%.&X\u001b\u001e0&--_e5", (short) (OY.Xd() ^ 15244)), string);
                            } else {
                                consumer.accept(extras);
                            }
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Throwable th) {
            String str = Wg.Zd("jY\u0011g\u0012`a@\u0019}BlF\u0003$W\u00136\u0015)K+s\b2B<u\u007fM'TV\u001dY.b\bs\u000f5Z\u0005<\u0006Kp\u0017#c.+", (short) (Od.Xd() ^ (-16942)), (short) (Od.Xd() ^ (-18473))) + th;
        }
    }
}
