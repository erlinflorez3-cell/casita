package com.drew.imaging.quicktime;

import com.drew.imaging.FileType;
import com.drew.imaging.TypeChecker;
import com.drew.metadata.heif.HeifContainerTypes;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class QuickTimeTypeChecker implements TypeChecker {
    private static final HashMap<String, FileType> _ftypMap;

    static {
        HashMap<String, FileType> map = new HashMap<>();
        _ftypMap = map;
        map.put("moov", FileType.QuickTime);
        map.put("wide", FileType.QuickTime);
        map.put(HeifContainerTypes.BOX_MEDIA_DATA, FileType.QuickTime);
        map.put("free", FileType.QuickTime);
        map.put("qt  ", FileType.QuickTime);
        map.put("3g2a", FileType.QuickTime);
        map.put("3gp5", FileType.Mp4);
        map.put("avc1", FileType.Mp4);
        map.put("iso2", FileType.Mp4);
        map.put("isom", FileType.Mp4);
        map.put("M4A ", FileType.Mp4);
        map.put("M4B ", FileType.Mp4);
        map.put("M4P ", FileType.Mp4);
        map.put("M4V ", FileType.Mp4);
        map.put("M4VH", FileType.Mp4);
        map.put("M4VP", FileType.Mp4);
        map.put("mmp4", FileType.Mp4);
        map.put("mp41", FileType.Mp4);
        map.put("mp42", FileType.Mp4);
        map.put("mp71", FileType.Mp4);
        map.put("MSNV", FileType.Mp4);
        map.put("NDAS", FileType.Mp4);
        map.put("NDSC", FileType.Mp4);
        map.put("NDSH", FileType.Mp4);
        map.put("NDSM", FileType.Mp4);
        map.put("NDSP", FileType.Mp4);
        map.put("NDSS", FileType.Mp4);
        map.put("NDXC", FileType.Mp4);
        map.put("NDXH", FileType.Mp4);
        map.put("NDXM", FileType.Mp4);
        map.put("NDXP", FileType.Mp4);
        map.put("NDXS", FileType.Mp4);
        map.put("nvr1", FileType.Mp4);
        map.put("mif1", FileType.Heif);
        map.put("msf1", FileType.Heif);
        map.put("heic", FileType.Heif);
        map.put("heix", FileType.Heif);
        map.put("hevc", FileType.Heif);
        map.put("hevx", FileType.Heif);
        map.put("crx ", FileType.Crx);
    }

    @Override // com.drew.imaging.TypeChecker
    public FileType checkType(byte[] bArr) {
        if (bArr[4] != 102 || bArr[5] != 116 || bArr[6] != 121 || bArr[7] != 112) {
            return FileType.Unknown;
        }
        FileType fileType = _ftypMap.get(new String(bArr, 8, 4));
        return fileType != null ? fileType : FileType.QuickTime;
    }

    @Override // com.drew.imaging.TypeChecker
    public int getByteCount() {
        return 12;
    }
}
