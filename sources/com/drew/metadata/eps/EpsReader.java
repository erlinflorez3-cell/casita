package com.drew.metadata.eps;

import com.drew.imaging.tiff.TiffProcessingException;
import com.drew.imaging.tiff.TiffReader;
import com.drew.lang.ByteArrayReader;
import com.drew.lang.Charsets;
import com.drew.lang.RandomAccessStreamReader;
import com.drew.lang.SequentialByteArrayReader;
import com.drew.lang.SequentialReader;
import com.drew.lang.StreamReader;
import com.drew.metadata.Metadata;
import com.drew.metadata.icc.IccReader;
import com.drew.metadata.photoshop.PhotoshopReader;
import com.drew.metadata.photoshop.PhotoshopTiffHandler;
import com.drew.metadata.xmp.XmpReader;
import com.dynatrace.android.agent.Global;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public class EpsReader {
    private int _previousTag;

    private void addToDirectory(EpsDirectory epsDirectory, String str, String str2) throws IOException {
        Integer num = EpsDirectory._tagIntegerMap.get(str);
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 8) {
            extractImageData(epsDirectory, str2);
        } else if (iIntValue == 36) {
            epsDirectory.setString(this._previousTag, epsDirectory.getString(this._previousTag) + Global.BLANK + str2);
        } else if (!EpsDirectory._tagNameMap.containsKey(num) || epsDirectory.containsTag(num.intValue())) {
            this._previousTag = 0;
        } else {
            epsDirectory.setString(num.intValue(), str2);
            this._previousTag = num.intValue();
        }
        this._previousTag = num.intValue();
    }

    private static byte[] decodeHexCommentBlock(SequentialReader sequentialReader) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z2 = false;
        char c2 = 0;
        byte b2 = 0;
        int i2 = 0;
        while (!z2) {
            b2 = sequentialReader.getByte();
            char c3 = 1;
            if (c2 != 0) {
                if (c2 != 1) {
                    c3 = 3;
                    if (c2 == 2) {
                        int iTryHexToInt = tryHexToInt(b2);
                        if (iTryHexToInt != -1) {
                            i2 = iTryHexToInt * 16;
                            c2 = c3;
                        } else {
                            if (b2 != 13 && b2 != 10) {
                                return null;
                            }
                            c2 = 0;
                        }
                    } else if (c2 == 3) {
                        int iTryHexToInt2 = tryHexToInt(b2);
                        if (iTryHexToInt2 == -1) {
                            return null;
                        }
                        byteArrayOutputStream.write(iTryHexToInt2 + i2);
                        c2 = 2;
                    } else {
                        continue;
                    }
                } else if (b2 != 32) {
                    z2 = true;
                } else {
                    c2 = 2;
                }
            } else if (b2 != 10 && b2 != 13 && b2 != 32) {
                if (b2 != 37) {
                    return null;
                }
                c2 = c3;
            }
        }
        while (b2 != 10) {
            b2 = sequentialReader.getByte();
        }
        return byteArrayOutputStream.toByteArray();
    }

    private void extract(EpsDirectory epsDirectory, Metadata metadata, SequentialReader sequentialReader) throws IOException {
        String strTrim;
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.setLength(0);
            while (true) {
                char c2 = (char) sequentialReader.getByte();
                if (c2 == '\r' || c2 == '\n') {
                    break;
                } else {
                    sb.append(c2);
                }
            }
            if (sb.length() != 0 && sb.charAt(0) != '%') {
                return;
            }
            int iIndexOf = sb.indexOf(Global.COLON);
            if (iIndexOf != -1) {
                strTrim = sb.substring(0, iIndexOf).trim();
                addToDirectory(epsDirectory, strTrim, sb.substring(iIndexOf + 1).trim());
            } else {
                strTrim = sb.toString().trim();
            }
            if (strTrim.equals("%BeginPhotoshop")) {
                extractPhotoshopData(metadata, sequentialReader);
            } else if (strTrim.equals("%%BeginICCProfile")) {
                extractIccData(metadata, sequentialReader);
            } else if (strTrim.equals("%begin_xml_packet")) {
                extractXmpData(metadata, sequentialReader);
            }
        }
    }

    private static void extractIccData(Metadata metadata, SequentialReader sequentialReader) throws IOException {
        byte[] bArrDecodeHexCommentBlock = decodeHexCommentBlock(sequentialReader);
        if (bArrDecodeHexCommentBlock != null) {
            new IccReader().extract(new ByteArrayReader(bArrDecodeHexCommentBlock), metadata);
        }
    }

    private static void extractImageData(EpsDirectory epsDirectory, String str) throws IOException {
        epsDirectory.setString(8, str.trim());
        String[] strArrSplit = str.split(Global.BLANK);
        int i2 = 0;
        int i3 = Integer.parseInt(strArrSplit[0]);
        int i4 = Integer.parseInt(strArrSplit[1]);
        int i5 = Integer.parseInt(strArrSplit[3]);
        if (!epsDirectory.containsTag(28)) {
            epsDirectory.setInt(28, i3);
        }
        if (!epsDirectory.containsTag(29)) {
            epsDirectory.setInt(29, i4);
        }
        if (!epsDirectory.containsTag(30)) {
            epsDirectory.setInt(30, i5);
        }
        if (epsDirectory.containsTag(31)) {
            return;
        }
        if (i5 == 1) {
            i2 = 1;
        } else if (i5 == 2 || i5 == 3 || i5 == 4) {
            i2 = 3;
        }
        if (i2 != 0) {
            epsDirectory.setInt(31, i2 * i3 * i4);
        }
    }

    private static void extractPhotoshopData(Metadata metadata, SequentialReader sequentialReader) throws IOException {
        byte[] bArrDecodeHexCommentBlock = decodeHexCommentBlock(sequentialReader);
        if (bArrDecodeHexCommentBlock != null) {
            new PhotoshopReader().extract(new SequentialByteArrayReader(bArrDecodeHexCommentBlock), bArrDecodeHexCommentBlock.length, metadata);
        }
    }

    private static void extractXmpData(Metadata metadata, SequentialReader sequentialReader) throws IOException {
        new XmpReader().extract(new String(readUntil(sequentialReader, "<?xpacket end=\"w\"?>".getBytes()), Charsets.UTF_8), metadata);
    }

    private static byte[] readUntil(SequentialReader sequentialReader, byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        int i2 = 0;
        while (i2 != length) {
            byte b2 = sequentialReader.getByte();
            i2 = b2 == bArr[i2] ? i2 + 1 : 0;
            byteArrayOutputStream.write(b2);
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static int tryHexToInt(byte b2) {
        if (b2 >= 48 && b2 <= 57) {
            return b2 - 48;
        }
        if (b2 >= 65 && b2 <= 70) {
            return b2 + MessagePack.Code.EXT32;
        }
        if (b2 < 97 || b2 > 102) {
            return -1;
        }
        return b2 - 87;
    }

    public void extract(InputStream inputStream, Metadata metadata) throws Throwable {
        RandomAccessStreamReader randomAccessStreamReader = new RandomAccessStreamReader(inputStream);
        EpsDirectory epsDirectory = new EpsDirectory();
        metadata.addDirectory(epsDirectory);
        int int32 = randomAccessStreamReader.getInt32(0);
        if (int32 != -976170042) {
            if (int32 != 622940243) {
                epsDirectory.addError("File type not supported.");
                return;
            } else {
                inputStream.reset();
                extract(epsDirectory, metadata, new StreamReader(inputStream));
                return;
            }
        }
        randomAccessStreamReader.setMotorolaByteOrder(false);
        int int322 = randomAccessStreamReader.getInt32(4);
        int int323 = randomAccessStreamReader.getInt32(8);
        int int324 = randomAccessStreamReader.getInt32(12);
        int int325 = randomAccessStreamReader.getInt32(16);
        int int326 = randomAccessStreamReader.getInt32(20);
        int int327 = randomAccessStreamReader.getInt32(24);
        if (int327 != 0) {
            epsDirectory.setInt(32, int327);
            epsDirectory.setInt(33, int326);
            try {
                new TiffReader().processTiff(new ByteArrayReader(randomAccessStreamReader.getBytes(int326, int327)), new PhotoshopTiffHandler(metadata, null), 0);
            } catch (TiffProcessingException e2) {
                epsDirectory.addError("Unable to process TIFF data: " + e2.getMessage());
            }
        } else if (int325 != 0) {
            epsDirectory.setInt(34, int325);
            epsDirectory.setInt(35, int324);
        }
        extract(epsDirectory, metadata, new SequentialByteArrayReader(randomAccessStreamReader.getBytes(int322, int323)));
    }
}
