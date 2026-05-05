package com.valid.vssh_android_core.model;

import android.graphics.Bitmap;
import com.valid.vssh_android_core.basecore.BaseModel;

/* JADX INFO: loaded from: classes5.dex */
public class UploadImageModel extends BaseModel {
    public Bitmap image;
    public String publicKey;
    public Integer segmentLength;

    public class NullPointerException extends RuntimeException {
    }

    public Bitmap getImage() {
        return this.image;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public Integer getSegmentLength() {
        return this.segmentLength;
    }

    public void setImage(Bitmap bitmap) {
        try {
            this.image = bitmap;
        } catch (NullPointerException unused) {
        }
    }

    public void setPublicKey(String str) {
        try {
            this.publicKey = str;
        } catch (NullPointerException unused) {
        }
    }

    public void setSegmentLength(Integer num) {
        try {
            this.segmentLength = num;
        } catch (NullPointerException unused) {
        }
    }
}
