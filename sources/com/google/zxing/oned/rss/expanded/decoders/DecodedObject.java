package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes7.dex */
abstract class DecodedObject {
    private final int newPosition;

    DecodedObject(int i2) {
        this.newPosition = i2;
    }

    final int getNewPosition() {
        return this.newPosition;
    }
}
