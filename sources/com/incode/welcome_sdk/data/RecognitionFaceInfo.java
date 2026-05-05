package com.incode.welcome_sdk.data;

import android.graphics.Bitmap;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;

/* JADX INFO: loaded from: classes5.dex */
public class RecognitionFaceInfo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f7543b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7544d = 1;
    float cmx;
    float cmy;
    transient Bitmap faceBitmap;
    boolean isBlocked;
    float lex;
    float ley;
    float predictionConfidence;
    long predictionExecutionTime;
    String predictionTemplateId;
    float rex;
    float rey;
    String template;
    String templateId;

    public RecognitionFaceInfo(Bitmap bitmap, String str, float f2, float f3, float f4, float f5, float f6, float f7) {
        this(bitmap, str, f2, f3, f4, f5, f6, f7, false);
    }

    public RecognitionFaceInfo(Bitmap bitmap, String str, float f2, float f3, float f4, float f5, float f6, float f7, boolean z2) {
        this.predictionConfidence = -1.0f;
        this.rex = 0.0f;
        this.rey = 0.0f;
        this.lex = 0.0f;
        this.ley = 0.0f;
        this.cmx = 0.0f;
        this.cmy = 0.0f;
        this.faceBitmap = bitmap;
        setTemplate(str);
        this.rex = f2;
        this.rey = f3;
        this.lex = f4;
        this.ley = f5;
        this.cmx = f6;
        this.cmy = f7;
        this.isBlocked = z2;
    }

    public RecognitionFaceInfo() {
        this.predictionConfidence = -1.0f;
        this.rex = 0.0f;
        this.rey = 0.0f;
        this.lex = 0.0f;
        this.ley = 0.0f;
        this.cmx = 0.0f;
        this.cmy = 0.0f;
    }

    public RecognitionFaceInfo(RecognitionFaceInfo recognitionFaceInfo) {
        this.predictionConfidence = -1.0f;
        this.rex = 0.0f;
        this.rey = 0.0f;
        this.lex = 0.0f;
        this.ley = 0.0f;
        this.cmx = 0.0f;
        this.cmy = 0.0f;
        this.faceBitmap = recognitionFaceInfo.getFaceBitmap();
        this.template = recognitionFaceInfo.getTemplate();
        this.rex = recognitionFaceInfo.getRex();
        this.rey = recognitionFaceInfo.getRey();
        this.lex = recognitionFaceInfo.getLex();
        this.ley = recognitionFaceInfo.getLey();
        this.cmx = recognitionFaceInfo.getCmx();
        this.cmy = recognitionFaceInfo.getCmy();
        this.predictionConfidence = recognitionFaceInfo.getPredictionConfidence();
        this.predictionExecutionTime = recognitionFaceInfo.getPredictionExecutionTime();
        this.predictionTemplateId = recognitionFaceInfo.getPredictionTemplateId();
    }

    public float getPredictionConfidence() {
        float f2;
        int i2 = 2 % 2;
        int i3 = f7544d + 67;
        int i4 = i3 % 128;
        f7543b = i4;
        if (i3 % 2 != 0) {
            f2 = this.predictionConfidence;
            int i5 = 66 / 0;
        } else {
            f2 = this.predictionConfidence;
        }
        int i6 = i4 + 37;
        f7544d = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public void setPredictionConfidence(float f2) {
        int i2 = 2 % 2;
        int i3 = f7544d + 91;
        int i4 = i3 % 128;
        f7543b = i4;
        int i5 = i3 % 2;
        this.predictionConfidence = f2;
        int i6 = i4 + 85;
        f7544d = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public long getPredictionExecutionTime() {
        int i2 = 2 % 2;
        int i3 = f7544d;
        int i4 = i3 + 69;
        f7543b = i4 % 128;
        int i5 = i4 % 2;
        long j2 = this.predictionExecutionTime;
        int i6 = i3 + 11;
        f7543b = i6 % 128;
        int i7 = i6 % 2;
        return j2;
    }

    public void setPredictionExecutionTime(long j2) {
        int i2 = 2 % 2;
        int i3 = f7544d;
        int i4 = i3 + 73;
        f7543b = i4 % 128;
        int i5 = i4 % 2;
        this.predictionExecutionTime = j2;
        int i6 = i3 + 19;
        f7543b = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 26 / 0;
        }
    }

    public float getRex() {
        int i2 = 2 % 2;
        int i3 = f7544d + 65;
        int i4 = i3 % 128;
        f7543b = i4;
        int i5 = i3 % 2;
        float f2 = this.rex;
        int i6 = i4 + 123;
        f7544d = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public void setRex(float f2) {
        int i2 = 2 % 2;
        int i3 = f7544d + 41;
        int i4 = i3 % 128;
        f7543b = i4;
        int i5 = i3 % 2;
        this.rex = f2;
        int i6 = i4 + 1;
        f7544d = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public float getRey() {
        int i2 = 2 % 2;
        int i3 = f7543b + 115;
        int i4 = i3 % 128;
        f7544d = i4;
        int i5 = i3 % 2;
        float f2 = this.rey;
        int i6 = i4 + 25;
        f7543b = i6 % 128;
        if (i6 % 2 == 0) {
            return f2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setRey(float f2) {
        int i2 = 2 % 2;
        int i3 = f7543b + 49;
        f7544d = i3 % 128;
        if (i3 % 2 != 0) {
            this.rey = f2;
            return;
        }
        this.rey = f2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public float getLex() {
        int i2 = 2 % 2;
        int i3 = f7543b + 97;
        f7544d = i3 % 128;
        if (i3 % 2 != 0) {
            return this.lex;
        }
        throw null;
    }

    public void setLex(float f2) {
        int i2 = 2 % 2;
        int i3 = f7543b;
        int i4 = i3 + 71;
        f7544d = i4 % 128;
        if (i4 % 2 != 0) {
            this.lex = f2;
            int i5 = i3 + 91;
            f7544d = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        this.lex = f2;
        throw null;
    }

    public float getLey() {
        int i2 = 2 % 2;
        int i3 = f7543b + 107;
        int i4 = i3 % 128;
        f7544d = i4;
        int i5 = i3 % 2;
        float f2 = this.ley;
        int i6 = i4 + 65;
        f7543b = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public void setLey(float f2) {
        int i2 = 2 % 2;
        int i3 = f7544d + 45;
        int i4 = i3 % 128;
        f7543b = i4;
        int i5 = i3 % 2;
        this.ley = f2;
        int i6 = i4 + 59;
        f7544d = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public float getCmx() {
        int i2 = 2 % 2;
        int i3 = f7543b + 107;
        f7544d = i3 % 128;
        int i4 = i3 % 2;
        float f2 = this.cmx;
        if (i4 == 0) {
            int i5 = 93 / 0;
        }
        return f2;
    }

    public void setCmx(float f2) {
        int i2 = 2 % 2;
        int i3 = f7544d + 85;
        f7543b = i3 % 128;
        if (i3 % 2 == 0) {
            this.cmx = f2;
            return;
        }
        this.cmx = f2;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public float getCmy() {
        float f2;
        int i2 = 2 % 2;
        int i3 = f7544d + 67;
        int i4 = i3 % 128;
        f7543b = i4;
        if (i3 % 2 != 0) {
            f2 = this.cmy;
            int i5 = 3 / 0;
        } else {
            f2 = this.cmy;
        }
        int i6 = i4 + 91;
        f7544d = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    public void setCmy(float f2) {
        int i2 = 2 % 2;
        int i3 = f7544d + 51;
        int i4 = i3 % 128;
        f7543b = i4;
        int i5 = i3 % 2;
        this.cmy = f2;
        int i6 = i4 + 25;
        f7544d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 71 / 0;
        }
    }

    public Bitmap getFaceBitmap() {
        int i2 = 2 % 2;
        int i3 = f7543b;
        int i4 = i3 + 59;
        f7544d = i4 % 128;
        int i5 = i4 % 2;
        Bitmap bitmap = this.faceBitmap;
        int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f7544d = i6 % 128;
        int i7 = i6 % 2;
        return bitmap;
    }

    public void setFaceBitmap(Bitmap bitmap) {
        int i2 = 2 % 2;
        int i3 = f7543b;
        int i4 = i3 + 5;
        f7544d = i4 % 128;
        int i5 = i4 % 2;
        this.faceBitmap = bitmap;
        int i6 = i3 + 29;
        f7544d = i6 % 128;
        int i7 = i6 % 2;
    }

    public String getTemplate() {
        int i2 = 2 % 2;
        int i3 = f7544d;
        int i4 = i3 + 71;
        f7543b = i4 % 128;
        int i5 = i4 % 2;
        String str = this.template;
        int i6 = i3 + 33;
        f7543b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public void setTemplate(String str) {
        int i2 = 2 % 2;
        int i3 = f7544d + 115;
        f7543b = i3 % 128;
        if (i3 % 2 != 0) {
            this.template = str;
            int i4 = 34 / 0;
        } else {
            this.template = str;
        }
    }

    public String getPredictionTemplateId() {
        int i2 = 2 % 2;
        int i3 = f7544d + 7;
        int i4 = i3 % 128;
        f7543b = i4;
        int i5 = i3 % 2;
        String str = this.predictionTemplateId;
        int i6 = i4 + 5;
        f7544d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 8 / 0;
        }
        return str;
    }

    public void setPredictionTemplateId(String str) {
        int i2 = 2 % 2;
        int i3 = f7543b;
        int i4 = i3 + 115;
        f7544d = i4 % 128;
        int i5 = i4 % 2;
        this.predictionTemplateId = str;
        int i6 = i3 + 57;
        f7544d = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getTemplateId() {
        int i2 = 2 % 2;
        int i3 = f7543b;
        int i4 = i3 + 71;
        f7544d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.templateId;
        int i6 = i3 + 101;
        f7544d = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public void setTemplateId(String str) {
        int i2 = 2 % 2;
        int i3 = f7543b + 75;
        f7544d = i3 % 128;
        if (i3 % 2 != 0) {
            this.templateId = str;
            return;
        }
        this.templateId = str;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean isBlocked() {
        int i2 = 2 % 2;
        int i3 = f7544d;
        int i4 = i3 + 95;
        f7543b = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.isBlocked;
        int i6 = i3 + 99;
        f7543b = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setBlocked(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f7543b + 67;
        f7544d = i3 % 128;
        if (i3 % 2 != 0) {
            this.isBlocked = z2;
        } else {
            this.isBlocked = z2;
            throw null;
        }
    }

    public String toString() {
        int i2 = 2 % 2;
        String string = new StringBuilder("FaceInfo{faceBitmap=").append(this.faceBitmap).append(", templateId='").append(this.templateId).append("', template='").append(this.template).append("', predictionConfidence=").append(this.predictionConfidence).append(", predictionExecutionTime=").append(this.predictionExecutionTime).append(", rex=").append(this.rex).append(", rey=").append(this.rey).append(", lex=").append(this.lex).append(", ley=").append(this.ley).append(", cmx=").append(this.cmx).append(", cmy=").append(this.cmy).append(", predictionTemplateId='").append(this.predictionTemplateId).append("'}").toString();
        int i3 = f7543b + 85;
        f7544d = i3 % 128;
        if (i3 % 2 != 0) {
            return string;
        }
        throw null;
    }
}
