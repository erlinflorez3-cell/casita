package com.upokecenter.cbor;

import com.upokecenter.numbers.EInteger;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
class StringRefs {
    private final ArrayList<ArrayList<CBORObject>> stack;

    public StringRefs() {
        ArrayList<ArrayList<CBORObject>> arrayList = new ArrayList<>();
        this.stack = arrayList;
        arrayList.add(new ArrayList<>());
    }

    public void AddStringIfNeeded(CBORObject cBORObject, int i2) {
        ArrayList<ArrayList<CBORObject>> arrayList = this.stack;
        boolean z2 = true;
        ArrayList<CBORObject> arrayList2 = arrayList.get(arrayList.size() - 1);
        if (arrayList2.size() >= 24 ? arrayList2.size() >= 256 ? arrayList2.size() >= 65536 ? i2 < 7 : i2 < 5 : i2 < 4 : i2 < 3) {
            z2 = false;
        }
        if (z2) {
            arrayList2.add(cBORObject);
        }
    }

    public CBORObject GetString(long j2) {
        if (j2 < 0) {
            throw new CBORException("Unexpected index");
        }
        if (j2 > 2147483647L) {
            throw new CBORException("Index " + j2 + " is bigger than supported ");
        }
        int i2 = (int) j2;
        ArrayList<CBORObject> arrayList = this.stack.get(r1.size() - 1);
        if (i2 >= arrayList.size()) {
            throw new CBORException("Index " + i2 + " is not valid");
        }
        CBORObject cBORObject = arrayList.get(i2);
        return cBORObject.getType() == CBORType.ByteString ? CBORObject.FromObject(cBORObject.GetByteString()) : cBORObject;
    }

    public CBORObject GetString(EInteger eInteger) {
        if (eInteger.signum() < 0) {
            throw new CBORException("Unexpected index");
        }
        if (!eInteger.CanFitInInt32()) {
            throw new CBORException("Index " + eInteger + " is bigger than supported ");
        }
        int iToInt32Checked = eInteger.ToInt32Checked();
        ArrayList<CBORObject> arrayList = this.stack.get(r1.size() - 1);
        if (iToInt32Checked >= arrayList.size()) {
            throw new CBORException("Index " + iToInt32Checked + " is not valid");
        }
        CBORObject cBORObject = arrayList.get(iToInt32Checked);
        return cBORObject.getType() == CBORType.ByteString ? CBORObject.FromObject(cBORObject.GetByteString()) : cBORObject;
    }

    public void Pop() {
        this.stack.remove(r1.size() - 1);
    }

    public void Push() {
        this.stack.add(new ArrayList<>());
    }
}
