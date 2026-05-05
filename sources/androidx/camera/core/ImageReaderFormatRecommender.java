package androidx.camera.core;

/* JADX INFO: loaded from: classes.dex */
final class ImageReaderFormatRecommender {
    private ImageReaderFormatRecommender() {
    }

    static FormatCombo chooseCombo() {
        return FormatCombo.create(256, 35);
    }

    static abstract class FormatCombo {
        abstract int imageAnalysisFormat();

        abstract int imageCaptureFormat();

        FormatCombo() {
        }

        static FormatCombo create(int i2, int i3) {
            return new AutoValue_ImageReaderFormatRecommender_FormatCombo(i2, i3);
        }
    }
}
