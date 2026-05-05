package com.drew.imaging.riff;

import com.drew.imaging.FileType;
import com.drew.imaging.TypeChecker;
import com.drew.metadata.avi.AviDirectory;
import com.drew.metadata.wav.WavDirectory;
import com.drew.metadata.webp.WebpDirectory;

/* JADX INFO: loaded from: classes3.dex */
public class RiffTypeChecker implements TypeChecker {
    @Override // com.drew.imaging.TypeChecker
    public FileType checkType(byte[] bArr) {
        if (!new String(bArr, 0, 4).equals("RIFF")) {
            return FileType.Unknown;
        }
        String str = new String(bArr, 8, 4);
        return str.equals(WavDirectory.FORMAT) ? FileType.Wav : str.equals(AviDirectory.FORMAT) ? FileType.Avi : str.equals(WebpDirectory.FORMAT) ? FileType.WebP : FileType.Riff;
    }

    @Override // com.drew.imaging.TypeChecker
    public int getByteCount() {
        return 12;
    }
}
