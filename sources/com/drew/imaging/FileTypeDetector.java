package com.drew.imaging;

import com.drew.imaging.mp3.MpegAudioTypeChecker;
import com.drew.imaging.quicktime.QuickTimeTypeChecker;
import com.drew.imaging.riff.RiffTypeChecker;
import com.drew.lang.ByteTrie;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public class FileTypeDetector {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int _bytesNeeded;
    private static final TypeChecker[] _fixedCheckers;
    private static final ByteTrie<FileType> _root;

    static {
        TypeChecker[] typeCheckerArr = {new QuickTimeTypeChecker(), new RiffTypeChecker(), new MpegAudioTypeChecker()};
        _fixedCheckers = typeCheckerArr;
        ByteTrie<FileType> byteTrie = new ByteTrie<>();
        _root = byteTrie;
        byteTrie.setDefaultValue(FileType.Unknown);
        byteTrie.addPath(FileType.Jpeg, new byte[]{-1, MessagePack.Code.FIXEXT16});
        byteTrie.addPath(FileType.Tiff, "II".getBytes(), new byte[]{42, 0});
        byteTrie.addPath(FileType.Tiff, "MM".getBytes(), new byte[]{0, 42});
        byteTrie.addPath(FileType.Psd, "8BPS".getBytes());
        byteTrie.addPath(FileType.Png, new byte[]{-119, 80, 78, 71, Ascii.CR, 10, Ascii.SUB, 10, 0, 0, 0, Ascii.CR, 73, 72, 68, 82});
        byteTrie.addPath(FileType.Bmp, "BM".getBytes());
        byteTrie.addPath(FileType.Bmp, "BA".getBytes());
        byteTrie.addPath(FileType.Bmp, "CI".getBytes());
        byteTrie.addPath(FileType.Bmp, "CP".getBytes());
        byteTrie.addPath(FileType.Bmp, "IC".getBytes());
        byteTrie.addPath(FileType.Bmp, "PT".getBytes());
        byteTrie.addPath(FileType.Gif, "GIF87a".getBytes());
        byteTrie.addPath(FileType.Gif, "GIF89a".getBytes());
        byteTrie.addPath(FileType.Ico, new byte[]{0, 0, 1, 0});
        byteTrie.addPath(FileType.Pcx, new byte[]{10, 0, 1});
        byteTrie.addPath(FileType.Pcx, new byte[]{10, 2, 1});
        byteTrie.addPath(FileType.Pcx, new byte[]{10, 3, 1});
        byteTrie.addPath(FileType.Pcx, new byte[]{10, 5, 1});
        byteTrie.addPath(FileType.Arw, "II".getBytes(), new byte[]{42, 0, 8, 0});
        byteTrie.addPath(FileType.Crw, "II".getBytes(), new byte[]{Ascii.SUB, 0, 0, 0}, "HEAPCCDR".getBytes());
        byteTrie.addPath(FileType.Cr2, "II".getBytes(), new byte[]{42, 0, 16, 0, 0, 0, 67, 82});
        byteTrie.addPath(FileType.Orf, "IIRO".getBytes(), new byte[]{8, 0});
        byteTrie.addPath(FileType.Orf, "MMOR".getBytes(), new byte[]{0, 0});
        byteTrie.addPath(FileType.Orf, "IIRS".getBytes(), new byte[]{8, 0});
        byteTrie.addPath(FileType.Raf, "FUJIFILMCCD-RAW".getBytes());
        byteTrie.addPath(FileType.Rw2, "II".getBytes(), new byte[]{85, 0});
        byteTrie.addPath(FileType.Eps, "%!PS".getBytes());
        byteTrie.addPath(FileType.Eps, new byte[]{MessagePack.Code.BIN16, MessagePack.Code.INT8, MessagePack.Code.INT64, MessagePack.Code.BIN32});
        byteTrie.addPath(FileType.Aac, new byte[]{-1, -15});
        byteTrie.addPath(FileType.Aac, new byte[]{-1, -7});
        byteTrie.addPath(FileType.Asf, new byte[]{48, 38, -78, 117, -114, 102, MessagePack.Code.UINT64, 17, -90, MessagePack.Code.STR8, 0, -86, 0, 98, MessagePack.Code.UINT32, 108});
        byteTrie.addPath(FileType.Cfbf, new byte[]{MessagePack.Code.INT8, MessagePack.Code.UINT64, 17, MessagePack.Code.NEGFIXINT_PREFIX, -95, -79, Ascii.SUB, -31, 0});
        byteTrie.addPath(FileType.Flv, new byte[]{70, 76, 86});
        byteTrie.addPath(FileType.Indd, new byte[]{6, 6, -19, -11, MessagePack.Code.FIXEXT16, Ascii.GS, 70, -27, -67, 49, -17, -25, -2, 116, -73, Ascii.GS});
        byteTrie.addPath(FileType.Mxf, new byte[]{6, Ascii.SO, 43, 52, 2, 5, 1, 1, Ascii.CR, 1, 2, 1, 1, 2});
        byteTrie.addPath(FileType.Qxp, new byte[]{0, 0, 73, 73, 88, 80, 82, 51});
        byteTrie.addPath(FileType.Qxp, new byte[]{0, 0, 77, 77, 88, 80, 82, 51});
        byteTrie.addPath(FileType.Ram, new byte[]{114, 116, 115, 112, 58, 47, 47});
        byteTrie.addPath(FileType.Rtf, new byte[]{123, 92, 114, 116, 102, 49});
        byteTrie.addPath(FileType.Sit, new byte[]{83, 73, 84, 33, 0});
        byteTrie.addPath(FileType.Sit, new byte[]{83, 116, 117, 102, 102, 73, 116, 32, 40, 99, 41, 49, 57, 57, 55, 45});
        byteTrie.addPath(FileType.Sitx, new byte[]{83, 116, 117, 102, 102, 73, 116, 33});
        byteTrie.addPath(FileType.Swf, "CWS".getBytes());
        byteTrie.addPath(FileType.Swf, "FWS".getBytes());
        byteTrie.addPath(FileType.Swf, "ZWS".getBytes());
        byteTrie.addPath(FileType.Vob, new byte[]{0, 0, 1, -70});
        byteTrie.addPath(FileType.Zip, "PK".getBytes());
        int maxDepth = byteTrie.getMaxDepth();
        for (TypeChecker typeChecker : typeCheckerArr) {
            if (typeChecker.getByteCount() > maxDepth) {
                maxDepth = typeChecker.getByteCount();
            }
        }
        _bytesNeeded = maxDepth;
    }

    private FileTypeDetector() throws Exception {
        throw new Exception("Not intended for instantiation");
    }

    public static FileType detectFileType(InputStream inputStream) throws IOException {
        if (!inputStream.markSupported()) {
            throw new IOException("Stream must support mark/reset");
        }
        int i2 = _bytesNeeded;
        inputStream.mark(i2);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i2 != 0) {
            int i4 = inputStream.read(bArr, i3, i2);
            if (i4 == -1) {
                break;
            }
            i2 -= i4;
            i3 += i4;
        }
        inputStream.reset();
        FileType fileTypeFind = _root.find(bArr, 0, i3);
        if (fileTypeFind == FileType.Unknown) {
            for (TypeChecker typeChecker : _fixedCheckers) {
                fileTypeFind = typeChecker.checkType(bArr);
                if (fileTypeFind != FileType.Unknown) {
                    return fileTypeFind;
                }
            }
        }
        return fileTypeFind;
    }
}
