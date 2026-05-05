package com.bumptech.glide.request.target;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class NotificationTarget extends CustomTarget<Bitmap> {
    private final Context context;
    private final Notification notification;
    private final int notificationId;
    private final String notificationTag;
    private final RemoteViews remoteViews;
    private final int viewId;

    public NotificationTarget(Context context, int i2, int i3, int i4, RemoteViews remoteViews, Notification notification, int i5, String str) {
        super(i2, i3);
        this.context = (Context) Preconditions.checkNotNull(context, "Context must not be null!");
        this.notification = (Notification) Preconditions.checkNotNull(notification, "Notification object can not be null!");
        this.remoteViews = (RemoteViews) Preconditions.checkNotNull(remoteViews, "RemoteViews object can not be null!");
        this.viewId = i4;
        this.notificationId = i5;
        this.notificationTag = str;
    }

    public NotificationTarget(Context context, int i2, RemoteViews remoteViews, Notification notification, int i3) {
        this(context, i2, remoteViews, notification, i3, null);
    }

    public NotificationTarget(Context context, int i2, RemoteViews remoteViews, Notification notification, int i3, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i2, remoteViews, notification, i3, str);
    }

    private void setBitmap(Bitmap bitmap) throws Throwable {
        this.remoteViews.setImageViewBitmap(this.viewId, bitmap);
        update();
    }

    private void update() throws Throwable {
        Context context = this.context;
        short sXd = (short) (C1607wl.Xd() ^ 13790);
        short sXd2 = (short) (C1607wl.Xd() ^ 5684);
        int[] iArr = new int["\u0018\u0018\u001c\u0010\f\u000e\u0007\u0004\u0016\n\u000f\r".length()];
        QB qb = new QB("\u0018\u0018\u001c\u0010\f\u000e\u0007\u0004\u0016\n\u000f\r");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Object[] objArr = {new String(iArr, 0, i2)};
        Method method = Class.forName(hg.Vd("LXMZVOI\u0012FQOTDLQ\n\u001eIGL<NI", (short) (OY.Xd() ^ 15965), (short) (OY.Xd() ^ 4821))).getMethod(C1561oA.yd("\u000e\u000b\u001dz\u001c\u0015\u0019\t\fp\u0006\u0012\u0011\u0003\u007f\u0001", (short) (OY.Xd() ^ 11445)), Class.forName(C1561oA.ud("PFZD\u0010MAME\u000b/OLBF>", (short) (ZN.Xd() ^ 30066))));
        try {
            method.setAccessible(true);
            ((NotificationManager) Preconditions.checkNotNull((NotificationManager) method.invoke(context, objArr))).notify(this.notificationTag, this.notificationId, this.notification);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(Drawable drawable) throws Throwable {
        setBitmap(null);
    }

    public void onResourceReady(Bitmap bitmap, Transition<? super Bitmap> transition) throws Throwable {
        setBitmap(bitmap);
    }

    @Override // com.bumptech.glide.request.target.Target
    public /* bridge */ /* synthetic */ void onResourceReady(Object obj, Transition transition) throws Throwable {
        onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
    }
}
