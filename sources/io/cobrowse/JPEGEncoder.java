package io.cobrowse;

import android.graphics.Bitmap;
import io.cobrowse.Encoder;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes3.dex */
final class JPEGEncoder extends Encoder {
    static final String MIME_TYPE = "image/jpeg";
    private Frame previousFrame;
    private final BitmapScaleConverter scaleConverter;

    JPEGEncoder(Encoder.Delegate delegate) {
        super(delegate);
        this.scaleConverter = new BitmapScaleConverter();
    }

    @Override // io.cobrowse.Encoder
    public void encode(Frame frame) {
        if (frame.isDirty() || !frame.sameSizeAs(this.previousFrame)) {
            this.previousFrame = frame;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.scaleConverter.downscale(frame.getBitmap(), frame.getScale()).compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
            this.delegate.onEncodedFrameData(this, byteArrayOutputStream.toByteArray());
        }
    }

    @Override // io.cobrowse.Encoder
    public int maximumFramesInFlight() {
        return 3;
    }

    @Override // io.cobrowse.Encoder
    public String mimeType() {
        return "image/jpeg";
    }

    @Override // io.cobrowse.Encoder
    public void reset() {
        this.previousFrame = null;
    }
}
