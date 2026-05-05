package com.upokecenter.cbor;

import com.upokecenter.numbers.EInteger;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
class SharedRefs {
    private final List<CBORObject> sharedObjects = new ArrayList();

    public void AddObject(CBORObject cBORObject) {
        this.sharedObjects.add(cBORObject);
    }

    public CBORObject GetObject(long j2) {
        if (j2 < 0) {
            throw new CBORException("Unexpected index");
        }
        if (j2 > 2147483647L) {
            throw new CBORException("Index " + j2 + " is bigger than supported ");
        }
        int i2 = (int) j2;
        if (i2 < this.sharedObjects.size()) {
            return this.sharedObjects.get(i2);
        }
        throw new CBORException("Index " + i2 + " is not valid");
    }

    public CBORObject GetObject(EInteger eInteger) {
        if (eInteger.signum() < 0) {
            throw new CBORException("Unexpected index");
        }
        if (!eInteger.CanFitInInt32()) {
            throw new CBORException("Index " + eInteger + " is bigger than supported ");
        }
        int iToInt32Checked = eInteger.ToInt32Checked();
        if (iToInt32Checked < this.sharedObjects.size()) {
            return this.sharedObjects.get(iToInt32Checked);
        }
        throw new CBORException("Index " + iToInt32Checked + " is not valid");
    }
}
