package com.incode.recogkitandroid;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes7.dex */
public class Face {
    private static int CameraConstants = 1;
    private static int getAvailableCameraInternals = 0;
    public PointF leftEye;
    public PointF leftMouthCorner;
    public PointF noseTip;
    public float pitch;
    public Rect rect;
    public PointF rightEye;
    public PointF rightMouthCorner;
    public float roll;
    public float yaw;

    public class Rect {
        public float height;
        public float width;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public float f3644x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public float f3645y;

        Rect(float f2, float f3, float f4, float f5) {
            this.f3644x = f2;
            this.f3645y = f3;
            this.width = f4;
            this.height = f5;
        }
    }

    public Face(float f2, float f3, float f4, float f5, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, PointF pointF5, float f6, float f7, float f8) {
        this.rect = new Rect(f2, f3, f4, f5);
        this.rightEye = pointF;
        this.leftEye = pointF2;
        this.noseTip = pointF3;
        this.rightMouthCorner = pointF4;
        this.leftMouthCorner = pointF5;
        this.pitch = f6;
        this.yaw = f7;
        this.roll = f8;
    }

    public String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("rect: ").append(this.rect.width).append(" x ").append(this.rect.height).append(" from (").append(this.rect.f3644x).append(" x ").append(this.rect.f3645y).append(")rightEye: ").append(this.rightEye).append(" leftEye: ").append(this.leftEye).append(" noseTip: ").append(this.noseTip).append(" rightMouthCorner: ").append(this.rightMouthCorner).append(" leftMouthCorner: ").append(this.leftMouthCorner).append(" pitch: ").append(this.pitch).append(" yaw: ").append(this.yaw).append(" roll: ").append(this.roll).toString();
        int i3 = CameraConstants + 41;
        getAvailableCameraInternals = i3 % 128;
        int i4 = i3 % 2;
        return string;
    }
}
