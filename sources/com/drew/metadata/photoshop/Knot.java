package com.drew.metadata.photoshop;

/* JADX INFO: loaded from: classes3.dex */
public class Knot {
    private final double[] _points = new double[6];
    private final String _type;

    public Knot(String str) {
        this._type = str;
    }

    public double getPoint(int i2) {
        return this._points[i2];
    }

    public String getType() {
        return this._type;
    }

    public void setPoint(int i2, double d2) {
        this._points[i2] = d2;
    }
}
