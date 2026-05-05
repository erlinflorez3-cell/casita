package com.google.maps.android.geometry;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class Point {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final double f3534x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final double f3535y;

    public Point(double d2, double d3) {
        this.f3534x = d2;
        this.f3535y = d3;
    }

    public String toString() {
        return "Point{x=" + this.f3534x + ", y=" + this.f3535y + AbstractJsonLexerKt.END_OBJ;
    }
}
