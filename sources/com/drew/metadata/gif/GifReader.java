package com.drew.metadata.gif;

import com.drew.lang.ByteArrayReader;
import com.drew.lang.Charsets;
import com.drew.lang.SequentialReader;
import com.drew.metadata.Directory;
import com.drew.metadata.ErrorDirectory;
import com.drew.metadata.Metadata;
import com.drew.metadata.MetadataException;
import com.drew.metadata.StringValue;
import com.drew.metadata.gif.GifControlDirectory;
import com.drew.metadata.icc.IccReader;
import com.drew.metadata.xmp.XmpReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class GifReader {
    private static final String GIF_87A_VERSION_IDENTIFIER = "87a";
    private static final String GIF_89A_VERSION_IDENTIFIER = "89a";

    private static byte[] gatherBytes(SequentialReader sequentialReader) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[257];
        while (true) {
            byte b2 = sequentialReader.getByte();
            if (b2 == 0) {
                return byteArrayOutputStream.toByteArray();
            }
            int i2 = (-1) - (((-1) - b2) | ((-1) - 255));
            bArr[0] = b2;
            sequentialReader.getBytes(bArr, 1, i2);
            byteArrayOutputStream.write(bArr, 0, i2 + 1);
        }
    }

    private static byte[] gatherBytes(SequentialReader sequentialReader, int i2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (i2 > 0) {
            byteArrayOutputStream.write(sequentialReader.getBytes(i2), 0, i2);
            byte b2 = sequentialReader.getByte();
            i2 = (b2 + 255) - (b2 | 255);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static void readApplicationExtensionBlock(SequentialReader sequentialReader, int i2, Metadata metadata) throws IOException {
        if (i2 != 11) {
            metadata.addDirectory(new ErrorDirectory(String.format("Invalid GIF application extension block size. Expected 11, got %d.", Integer.valueOf(i2))));
            return;
        }
        String string = sequentialReader.getString(i2, Charsets.UTF_8);
        if (string.equals("XMP DataXMP")) {
            byte[] bArrGatherBytes = gatherBytes(sequentialReader);
            if (bArrGatherBytes.length - 257 > 0) {
                new XmpReader().extract(bArrGatherBytes, 0, bArrGatherBytes.length - 257, metadata, null);
                return;
            }
            return;
        }
        if (string.equals("ICCRGBG1012")) {
            byte[] bArrGatherBytes2 = gatherBytes(sequentialReader, sequentialReader.getByte() & 255);
            if (bArrGatherBytes2.length != 0) {
                new IccReader().extract(new ByteArrayReader(bArrGatherBytes2), metadata);
                return;
            }
            return;
        }
        if (!string.equals("NETSCAPE2.0")) {
            skipBlocks(sequentialReader);
            return;
        }
        sequentialReader.skip(2L);
        int uInt16 = sequentialReader.getUInt16();
        sequentialReader.skip(1L);
        GifAnimationDirectory gifAnimationDirectory = new GifAnimationDirectory();
        gifAnimationDirectory.setInt(1, uInt16);
        metadata.addDirectory(gifAnimationDirectory);
    }

    private static GifCommentDirectory readCommentBlock(SequentialReader sequentialReader, int i2) throws IOException {
        return new GifCommentDirectory(new StringValue(gatherBytes(sequentialReader, i2), Charsets.ASCII));
    }

    private static GifControlDirectory readControlBlock(SequentialReader sequentialReader) throws IOException {
        GifControlDirectory gifControlDirectory = new GifControlDirectory();
        short uInt8 = sequentialReader.getUInt8();
        gifControlDirectory.setObject(2, GifControlDirectory.DisposalMethod.typeOf((-1) - (((-1) - (uInt8 >> 2)) | ((-1) - 7))));
        gifControlDirectory.setBoolean(3, (((uInt8 + 2) - (2 | uInt8)) >> 1) == 1);
        gifControlDirectory.setBoolean(4, (uInt8 + 1) - (uInt8 | 1) == 1);
        gifControlDirectory.setInt(1, sequentialReader.getUInt16());
        gifControlDirectory.setInt(5, sequentialReader.getUInt8());
        sequentialReader.skip(1L);
        return gifControlDirectory;
    }

    private static void readGifExtensionBlock(SequentialReader sequentialReader, Metadata metadata) throws IOException {
        byte int8 = sequentialReader.getInt8();
        short uInt8 = sequentialReader.getUInt8();
        long position = sequentialReader.getPosition();
        if (int8 == -7) {
            metadata.addDirectory(readControlBlock(sequentialReader));
        } else if (int8 == 1) {
            Directory plainTextBlock = readPlainTextBlock(sequentialReader, uInt8);
            if (plainTextBlock != null) {
                metadata.addDirectory(plainTextBlock);
            }
        } else if (int8 == -2) {
            metadata.addDirectory(readCommentBlock(sequentialReader, uInt8));
        } else if (int8 != -1) {
            metadata.addDirectory(new ErrorDirectory(String.format("Unsupported GIF extension block with type 0x%02X.", Byte.valueOf(int8))));
        } else {
            readApplicationExtensionBlock(sequentialReader, uInt8, metadata);
        }
        long position2 = (position + ((long) uInt8)) - sequentialReader.getPosition();
        if (position2 > 0) {
            sequentialReader.skip(position2);
        }
    }

    private static GifHeaderDirectory readGifHeader(SequentialReader sequentialReader) throws IOException {
        GifHeaderDirectory gifHeaderDirectory = new GifHeaderDirectory();
        if (!sequentialReader.getString(3).equals("GIF")) {
            gifHeaderDirectory.addError("Invalid GIF file signature");
            return gifHeaderDirectory;
        }
        String string = sequentialReader.getString(3);
        if (!string.equals(GIF_87A_VERSION_IDENTIFIER) && !string.equals(GIF_89A_VERSION_IDENTIFIER)) {
            gifHeaderDirectory.addError("Unexpected GIF version");
            return gifHeaderDirectory;
        }
        gifHeaderDirectory.setString(1, string);
        gifHeaderDirectory.setInt(2, sequentialReader.getUInt16());
        gifHeaderDirectory.setInt(3, sequentialReader.getUInt16());
        short uInt8 = sequentialReader.getUInt8();
        int i2 = 1 << ((7 & uInt8) + 1);
        int i3 = ((uInt8 & 112) >> 4) + 1;
        boolean z2 = (uInt8 >> 7) != 0;
        gifHeaderDirectory.setInt(4, i2);
        if (string.equals(GIF_89A_VERSION_IDENTIFIER)) {
            gifHeaderDirectory.setBoolean(5, (-1) - (((-1) - uInt8) | ((-1) - 8)) != 0);
        }
        gifHeaderDirectory.setInt(6, i3);
        gifHeaderDirectory.setBoolean(7, z2);
        gifHeaderDirectory.setInt(8, sequentialReader.getUInt8());
        short uInt82 = sequentialReader.getUInt8();
        if (uInt82 != 0) {
            gifHeaderDirectory.setFloat(9, (float) ((((double) uInt82) + 15.0d) / 64.0d));
        }
        return gifHeaderDirectory;
    }

    private static GifImageDirectory readImageBlock(SequentialReader sequentialReader) throws IOException {
        GifImageDirectory gifImageDirectory = new GifImageDirectory();
        gifImageDirectory.setInt(1, sequentialReader.getUInt16());
        gifImageDirectory.setInt(2, sequentialReader.getUInt16());
        gifImageDirectory.setInt(3, sequentialReader.getUInt16());
        gifImageDirectory.setInt(4, sequentialReader.getUInt16());
        byte b2 = sequentialReader.getByte();
        boolean z2 = (b2 >> 7) != 0;
        boolean z3 = (64 & b2) != 0;
        gifImageDirectory.setBoolean(5, z2);
        gifImageDirectory.setBoolean(6, z3);
        if (z2) {
            gifImageDirectory.setBoolean(7, (32 & b2) != 0);
            gifImageDirectory.setInt(8, ((b2 + 7) - (b2 | 7)) + 1);
            sequentialReader.skip((2 << r2) * 3);
        }
        sequentialReader.getByte();
        return gifImageDirectory;
    }

    private static Directory readPlainTextBlock(SequentialReader sequentialReader, int i2) throws IOException {
        if (i2 != 12) {
            return new ErrorDirectory(String.format("Invalid GIF plain text block size. Expected 12, got %d.", Integer.valueOf(i2)));
        }
        sequentialReader.skip(12L);
        skipBlocks(sequentialReader);
        return null;
    }

    private static void skipBlocks(SequentialReader sequentialReader) throws IOException {
        while (true) {
            short uInt8 = sequentialReader.getUInt8();
            if (uInt8 == 0) {
                return;
            } else {
                sequentialReader.skip(uInt8);
            }
        }
    }

    public void extract(SequentialReader sequentialReader, Metadata metadata) {
        byte int8;
        sequentialReader.setMotorolaByteOrder(false);
        try {
            GifHeaderDirectory gifHeader = readGifHeader(sequentialReader);
            metadata.addDirectory(gifHeader);
            if (gifHeader.hasErrors()) {
                return;
            }
            Integer integer = null;
            try {
                try {
                    if (gifHeader.getBoolean(7)) {
                        integer = gifHeader.getInteger(4);
                    }
                } catch (MetadataException unused) {
                    metadata.addDirectory(new ErrorDirectory("GIF did not had hasGlobalColorTable bit."));
                }
                if (integer != null) {
                    sequentialReader.skip(integer.intValue() * 3);
                }
                while (true) {
                    try {
                        int8 = sequentialReader.getInt8();
                        if (int8 == 33) {
                            readGifExtensionBlock(sequentialReader, metadata);
                        } else {
                            if (int8 != 44) {
                                break;
                            }
                            metadata.addDirectory(readImageBlock(sequentialReader));
                            skipBlocks(sequentialReader);
                        }
                    } catch (IOException unused2) {
                        return;
                    }
                }
                if (int8 != 59) {
                    metadata.addDirectory(new ErrorDirectory("Unknown gif block marker found."));
                }
            } catch (IOException unused3) {
                metadata.addDirectory(new ErrorDirectory("IOException processing GIF data"));
            }
        } catch (IOException unused4) {
            metadata.addDirectory(new ErrorDirectory("IOException processing GIF data"));
        }
    }
}
