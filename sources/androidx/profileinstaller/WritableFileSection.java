package androidx.profileinstaller;

/* JADX INFO: loaded from: classes4.dex */
class WritableFileSection {
    final byte[] mContents;
    final int mExpectedInflateSize;
    final boolean mNeedsCompression;
    final FileSectionType mType;

    WritableFileSection(FileSectionType fileSectionType, int i2, byte[] bArr, boolean z2) {
        this.mType = fileSectionType;
        this.mExpectedInflateSize = i2;
        this.mContents = bArr;
        this.mNeedsCompression = z2;
    }
}
