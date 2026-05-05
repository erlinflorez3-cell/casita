package com.drew.metadata.exif;

import com.drew.imaging.jpeg.JpegMetadataReader;
import com.drew.imaging.jpeg.JpegProcessingException;
import com.drew.imaging.tiff.TiffProcessingException;
import com.drew.imaging.tiff.TiffReader;
import com.drew.lang.BufferBoundsException;
import com.drew.lang.ByteArrayReader;
import com.drew.lang.Charsets;
import com.drew.lang.RandomAccessReader;
import com.drew.lang.SequentialByteArrayReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.StringValue;
import com.drew.metadata.apple.AppleRunTimeReader;
import com.drew.metadata.exif.makernotes.AppleMakernoteDirectory;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.drew.metadata.exif.makernotes.CasioType1MakernoteDirectory;
import com.drew.metadata.exif.makernotes.CasioType2MakernoteDirectory;
import com.drew.metadata.exif.makernotes.FujifilmMakernoteDirectory;
import com.drew.metadata.exif.makernotes.KodakMakernoteDirectory;
import com.drew.metadata.exif.makernotes.KyoceraMakernoteDirectory;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import com.drew.metadata.exif.makernotes.LeicaType5MakernoteDirectory;
import com.drew.metadata.exif.makernotes.NikonType1MakernoteDirectory;
import com.drew.metadata.exif.makernotes.NikonType2MakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusCameraSettingsMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusEquipmentMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusFocusInfoMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusImageProcessingMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusRawDevelopment2MakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusRawDevelopmentMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusRawInfoMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.exif.makernotes.PentaxMakernoteDirectory;
import com.drew.metadata.exif.makernotes.ReconyxHyperFire2MakernoteDirectory;
import com.drew.metadata.exif.makernotes.ReconyxHyperFireMakernoteDirectory;
import com.drew.metadata.exif.makernotes.ReconyxUltraFireMakernoteDirectory;
import com.drew.metadata.exif.makernotes.RicohMakernoteDirectory;
import com.drew.metadata.exif.makernotes.SamsungType2MakernoteDirectory;
import com.drew.metadata.exif.makernotes.SanyoMakernoteDirectory;
import com.drew.metadata.exif.makernotes.SigmaMakernoteDirectory;
import com.drew.metadata.exif.makernotes.SonyType1MakernoteDirectory;
import com.drew.metadata.exif.makernotes.SonyType6MakernoteDirectory;
import com.drew.metadata.icc.IccReader;
import com.drew.metadata.iptc.IptcReader;
import com.drew.metadata.photoshop.PhotoshopReader;
import com.drew.metadata.tiff.DirectoryTiffHandler;
import com.drew.metadata.xmp.XmpReader;
import com.dynatrace.android.agent.Global;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class ExifTiffHandler extends DirectoryTiffHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public ExifTiffHandler(Metadata metadata, Directory directory) {
        super(metadata, directory);
    }

    private static String getReaderString(RandomAccessReader randomAccessReader, int i2, int i3) throws IOException {
        try {
            return randomAccessReader.getString(i2, i3, Charsets.UTF_8);
        } catch (BufferBoundsException unused) {
            return "";
        }
    }

    private static boolean handlePrintIM(Directory directory, int i2) {
        if (i2 == 50341) {
            return true;
        }
        if (i2 == 3584) {
            return (directory instanceof CasioType2MakernoteDirectory) || (directory instanceof KyoceraMakernoteDirectory) || (directory instanceof NikonType2MakernoteDirectory) || (directory instanceof OlympusMakernoteDirectory) || (directory instanceof PanasonicMakernoteDirectory) || (directory instanceof PentaxMakernoteDirectory) || (directory instanceof RicohMakernoteDirectory) || (directory instanceof SanyoMakernoteDirectory) || (directory instanceof SonyType1MakernoteDirectory);
        }
        return false;
    }

    private static void processBinary(Directory directory, int i2, RandomAccessReader randomAccessReader, int i3, Boolean bool, int i4) throws IOException {
        int i5 = 0;
        while (i5 < i3) {
            if (directory.hasTagName(i5)) {
                if (i5 >= i3 - 1 || !directory.hasTagName(i5 + 1)) {
                    if (bool.booleanValue()) {
                        short[] sArr = new short[i4];
                        for (int i6 = 0; i6 < i4; i6++) {
                            sArr[i6] = randomAccessReader.getInt16(((i5 + i6) * 2) + i2);
                        }
                        directory.setObjectArray(i5, sArr);
                    } else {
                        int[] iArr = new int[i4];
                        for (int i7 = 0; i7 < i4; i7++) {
                            iArr[i7] = randomAccessReader.getUInt16(((i5 + i7) * 2) + i2);
                        }
                        directory.setObjectArray(i5, iArr);
                    }
                    i5 += i4 - 1;
                } else if (bool.booleanValue()) {
                    directory.setObject(i5, Short.valueOf(randomAccessReader.getInt16((i5 * 2) + i2)));
                } else {
                    directory.setObject(i5, Integer.valueOf(randomAccessReader.getUInt16((i5 * 2) + i2)));
                }
            }
            i5++;
        }
    }

    private static void processKodakMakernote(KodakMakernoteDirectory kodakMakernoteDirectory, int i2, RandomAccessReader randomAccessReader) {
        try {
            kodakMakernoteDirectory.setStringValue(0, randomAccessReader.getStringValue(i2 + 8, 8, Charsets.UTF_8));
            kodakMakernoteDirectory.setInt(9, randomAccessReader.getUInt8(i2 + 17));
            kodakMakernoteDirectory.setInt(10, randomAccessReader.getUInt8(i2 + 18));
            kodakMakernoteDirectory.setInt(12, randomAccessReader.getUInt16(i2 + 20));
            kodakMakernoteDirectory.setInt(14, randomAccessReader.getUInt16(i2 + 22));
            kodakMakernoteDirectory.setInt(16, randomAccessReader.getUInt16(i2 + 24));
            kodakMakernoteDirectory.setByteArray(18, randomAccessReader.getBytes(i2 + 26, 2));
            kodakMakernoteDirectory.setByteArray(20, randomAccessReader.getBytes(i2 + 28, 4));
            kodakMakernoteDirectory.setInt(24, randomAccessReader.getUInt16(i2 + 32));
            kodakMakernoteDirectory.setInt(27, randomAccessReader.getUInt8(i2 + 35));
            kodakMakernoteDirectory.setInt(28, randomAccessReader.getUInt8(i2 + 36));
            kodakMakernoteDirectory.setInt(29, randomAccessReader.getUInt8(i2 + 37));
            kodakMakernoteDirectory.setInt(30, randomAccessReader.getUInt16(i2 + 38));
            kodakMakernoteDirectory.setLong(32, randomAccessReader.getUInt32(i2 + 40));
            kodakMakernoteDirectory.setInt(36, randomAccessReader.getInt16(i2 + 44));
            kodakMakernoteDirectory.setInt(56, randomAccessReader.getUInt8(i2 + 64));
            kodakMakernoteDirectory.setInt(64, randomAccessReader.getUInt8(i2 + 72));
            kodakMakernoteDirectory.setInt(92, randomAccessReader.getUInt8(i2 + 100));
            kodakMakernoteDirectory.setInt(93, randomAccessReader.getUInt8(i2 + 101));
            kodakMakernoteDirectory.setInt(94, randomAccessReader.getUInt16(i2 + 102));
            kodakMakernoteDirectory.setInt(96, randomAccessReader.getUInt16(i2 + 104));
            kodakMakernoteDirectory.setInt(98, randomAccessReader.getUInt16(i2 + 106));
            kodakMakernoteDirectory.setInt(100, randomAccessReader.getUInt16(i2 + 108));
            kodakMakernoteDirectory.setInt(102, randomAccessReader.getUInt16(i2 + 110));
            kodakMakernoteDirectory.setInt(104, randomAccessReader.getUInt16(i2 + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
            kodakMakernoteDirectory.setInt(107, randomAccessReader.getInt8(i2 + 115));
        } catch (IOException e2) {
            kodakMakernoteDirectory.addError("Error processing Kodak makernote data: " + e2.getMessage());
        }
    }

    private boolean processMakernote(int i2, Set<Integer> set, int i3, RandomAccessReader randomAccessReader) throws Throwable {
        Directory firstDirectoryOfType = this._metadata.getFirstDirectoryOfType(ExifIFD0Directory.class);
        String string = firstDirectoryOfType == null ? null : firstDirectoryOfType.getString(271);
        String readerString = getReaderString(randomAccessReader, i2, 2);
        String readerString2 = getReaderString(randomAccessReader, i2, 3);
        String readerString3 = getReaderString(randomAccessReader, i2, 4);
        String readerString4 = getReaderString(randomAccessReader, i2, 5);
        String readerString5 = getReaderString(randomAccessReader, i2, 6);
        String readerString6 = getReaderString(randomAccessReader, i2, 7);
        String readerString7 = getReaderString(randomAccessReader, i2, 8);
        String readerString8 = getReaderString(randomAccessReader, i2, 9);
        String readerString9 = getReaderString(randomAccessReader, i2, 10);
        String readerString10 = getReaderString(randomAccessReader, i2, 12);
        boolean zIsMotorolaByteOrder = randomAccessReader.isMotorolaByteOrder();
        if ("OLYMP\u0000".equals(readerString5) || "EPSON".equals(readerString4) || "AGFA".equals(readerString3)) {
            pushDirectory(OlympusMakernoteDirectory.class);
            TiffReader.processIfd(this, randomAccessReader, set, i2 + 8, i3);
        } else if ("OLYMPUS\u0000II".equals(readerString9)) {
            pushDirectory(OlympusMakernoteDirectory.class);
            TiffReader.processIfd(this, randomAccessReader, set, i2 + 12, i2);
        } else if (string != null && string.toUpperCase().startsWith("MINOLTA")) {
            pushDirectory(OlympusMakernoteDirectory.class);
            TiffReader.processIfd(this, randomAccessReader, set, i2, i3);
        } else if (string == null || !string.trim().toUpperCase().startsWith("NIKON")) {
            if ("SONY CAM".equals(readerString7) || "SONY DSC".equals(readerString7)) {
                pushDirectory(SonyType1MakernoteDirectory.class);
                TiffReader.processIfd(this, randomAccessReader, set, i2 + 12, i3);
            } else if (string != null && string.startsWith("SONY") && !Arrays.equals(randomAccessReader.getBytes(i2, 2), new byte[]{1, 0})) {
                pushDirectory(SonyType1MakernoteDirectory.class);
                TiffReader.processIfd(this, randomAccessReader, set, i2, i3);
            } else if ("SEMC MS\u0000\u0000\u0000\u0000\u0000".equals(readerString10)) {
                randomAccessReader.setMotorolaByteOrder(true);
                pushDirectory(SonyType6MakernoteDirectory.class);
                TiffReader.processIfd(this, randomAccessReader, set, i2 + 20, i3);
            } else if ("SIGMA\u0000\u0000\u0000".equals(readerString7) || "FOVEON\u0000\u0000".equals(readerString7)) {
                pushDirectory(SigmaMakernoteDirectory.class);
                TiffReader.processIfd(this, randomAccessReader, set, i2 + 10, i3);
            } else if ("KDK".equals(readerString2)) {
                randomAccessReader.setMotorolaByteOrder(readerString6.equals("KDK INFO"));
                KodakMakernoteDirectory kodakMakernoteDirectory = new KodakMakernoteDirectory();
                this._metadata.addDirectory(kodakMakernoteDirectory);
                processKodakMakernote(kodakMakernoteDirectory, i2, randomAccessReader);
            } else if ("Canon".equalsIgnoreCase(string)) {
                pushDirectory(CanonMakernoteDirectory.class);
                TiffReader.processIfd(this, randomAccessReader, set, i2, i3);
            } else if (string == null || !string.toUpperCase().startsWith("CASIO")) {
                if ("FUJIFILM".equals(readerString7) || "Fujifilm".equalsIgnoreCase(string)) {
                    randomAccessReader.setMotorolaByteOrder(false);
                    int int32 = randomAccessReader.getInt32(i2 + 8) + i2;
                    pushDirectory(FujifilmMakernoteDirectory.class);
                    TiffReader.processIfd(this, randomAccessReader, set, int32, i2);
                } else if ("KYOCERA".equals(readerString6)) {
                    pushDirectory(KyoceraMakernoteDirectory.class);
                    TiffReader.processIfd(this, randomAccessReader, set, i2 + 22, i3);
                } else if ("LEICA".equals(readerString4)) {
                    randomAccessReader.setMotorolaByteOrder(false);
                    if ("LEICA\u0000\u0001\u0000".equals(readerString7) || "LEICA\u0000\u0004\u0000".equals(readerString7) || "LEICA\u0000\u0005\u0000".equals(readerString7) || "LEICA\u0000\u0006\u0000".equals(readerString7) || "LEICA\u0000\u0007\u0000".equals(readerString7)) {
                        pushDirectory(LeicaType5MakernoteDirectory.class);
                        TiffReader.processIfd(this, randomAccessReader, set, i2 + 8, i2);
                    } else if ("Leica Camera AG".equals(string)) {
                        pushDirectory(LeicaMakernoteDirectory.class);
                        TiffReader.processIfd(this, randomAccessReader, set, i2 + 8, i3);
                    } else {
                        if (!"LEICA".equals(string)) {
                            return false;
                        }
                        pushDirectory(PanasonicMakernoteDirectory.class);
                        TiffReader.processIfd(this, randomAccessReader, set, i2 + 8, i3);
                    }
                } else if ("Panasonic\u0000\u0000\u0000".equals(readerString10)) {
                    pushDirectory(PanasonicMakernoteDirectory.class);
                    TiffReader.processIfd(this, randomAccessReader, set, i2 + 12, i3);
                } else if ("AOC\u0000".equals(readerString3)) {
                    pushDirectory(CasioType2MakernoteDirectory.class);
                    TiffReader.processIfd(this, randomAccessReader, set, i2 + 6, i2);
                } else if (string != null && (string.toUpperCase().startsWith("PENTAX") || string.toUpperCase().startsWith("ASAHI"))) {
                    pushDirectory(PentaxMakernoteDirectory.class);
                    TiffReader.processIfd(this, randomAccessReader, set, i2, i2);
                } else if ("SANYO\u0000\u0001\u0000".equals(readerString7)) {
                    pushDirectory(SanyoMakernoteDirectory.class);
                    TiffReader.processIfd(this, randomAccessReader, set, i2 + 8, i2);
                } else if (string == null || !string.toLowerCase().startsWith("ricoh")) {
                    if (readerString9.equals("Apple iOS\u0000")) {
                        boolean zIsMotorolaByteOrder2 = randomAccessReader.isMotorolaByteOrder();
                        randomAccessReader.setMotorolaByteOrder(true);
                        pushDirectory(AppleMakernoteDirectory.class);
                        TiffReader.processIfd(this, randomAccessReader, set, i2 + 14, i2);
                        randomAccessReader.setMotorolaByteOrder(zIsMotorolaByteOrder2);
                    } else if (randomAccessReader.getUInt16(i2) == 61697) {
                        ReconyxHyperFireMakernoteDirectory reconyxHyperFireMakernoteDirectory = new ReconyxHyperFireMakernoteDirectory();
                        this._metadata.addDirectory(reconyxHyperFireMakernoteDirectory);
                        processReconyxHyperFireMakernote(reconyxHyperFireMakernoteDirectory, i2, randomAccessReader);
                    } else if (readerString8.equalsIgnoreCase("RECONYXUF")) {
                        ReconyxUltraFireMakernoteDirectory reconyxUltraFireMakernoteDirectory = new ReconyxUltraFireMakernoteDirectory();
                        this._metadata.addDirectory(reconyxUltraFireMakernoteDirectory);
                        processReconyxUltraFireMakernote(reconyxUltraFireMakernoteDirectory, i2, randomAccessReader);
                    } else if (readerString8.equalsIgnoreCase("RECONYXH2")) {
                        ReconyxHyperFire2MakernoteDirectory reconyxHyperFire2MakernoteDirectory = new ReconyxHyperFire2MakernoteDirectory();
                        this._metadata.addDirectory(reconyxHyperFire2MakernoteDirectory);
                        processReconyxHyperFire2Makernote(reconyxHyperFire2MakernoteDirectory, i2, randomAccessReader);
                    } else {
                        if (!"SAMSUNG".equalsIgnoreCase(string)) {
                            return false;
                        }
                        pushDirectory(SamsungType2MakernoteDirectory.class);
                        TiffReader.processIfd(this, randomAccessReader, set, i2, i3);
                    }
                } else {
                    if (readerString.equals("Rv") || readerString2.equals("Rev")) {
                        return false;
                    }
                    if (readerString4.equalsIgnoreCase("Ricoh")) {
                        randomAccessReader.setMotorolaByteOrder(true);
                        pushDirectory(RicohMakernoteDirectory.class);
                        TiffReader.processIfd(this, randomAccessReader, set, i2 + 8, i2);
                    }
                }
            } else if ("QVC\u0000\u0000\u0000".equals(readerString5)) {
                pushDirectory(CasioType2MakernoteDirectory.class);
                TiffReader.processIfd(this, randomAccessReader, set, i2 + 6, i3);
            } else {
                pushDirectory(CasioType1MakernoteDirectory.class);
                TiffReader.processIfd(this, randomAccessReader, set, i2, i3);
            }
        } else if ("Nikon".equals(readerString4)) {
            short uInt8 = randomAccessReader.getUInt8(i2 + 6);
            if (uInt8 == 1) {
                pushDirectory(NikonType1MakernoteDirectory.class);
                TiffReader.processIfd(this, randomAccessReader, set, i2 + 8, i3);
            } else if (uInt8 != 2) {
                this._currentDirectory.addError("Unsupported Nikon makernote data ignored.");
            } else {
                pushDirectory(NikonType2MakernoteDirectory.class);
                TiffReader.processIfd(this, randomAccessReader, set, i2 + 18, i2 + 10);
            }
        } else {
            pushDirectory(NikonType2MakernoteDirectory.class);
            TiffReader.processIfd(this, randomAccessReader, set, i2, i3);
        }
        randomAccessReader.setMotorolaByteOrder(zIsMotorolaByteOrder);
        return true;
    }

    private static void processPrintIM(PrintIMDirectory printIMDirectory, int i2, RandomAccessReader randomAccessReader, int i3) throws IOException {
        Boolean boolValueOf;
        if (i3 == 0) {
            printIMDirectory.addError("Empty PrintIM data");
            return;
        }
        if (i3 <= 15) {
            printIMDirectory.addError("Bad PrintIM data");
            return;
        }
        String string = randomAccessReader.getString(i2, 12, Charsets.UTF_8);
        if (!string.startsWith("PrintIM")) {
            printIMDirectory.addError("Invalid PrintIM header");
            return;
        }
        int i4 = i2 + 14;
        int uInt16 = randomAccessReader.getUInt16(i4);
        if (i3 < (uInt16 * 6) + 16) {
            boolValueOf = Boolean.valueOf(randomAccessReader.isMotorolaByteOrder());
            randomAccessReader.setMotorolaByteOrder(!randomAccessReader.isMotorolaByteOrder());
            uInt16 = randomAccessReader.getUInt16(i4);
            if (i3 < (uInt16 * 6) + 16) {
                printIMDirectory.addError("Bad PrintIM size");
                return;
            }
        } else {
            boolValueOf = null;
        }
        if (string.length() >= 12) {
            printIMDirectory.setObject(0, string.substring(8, 12));
        }
        for (int i5 = 0; i5 < uInt16; i5++) {
            int i6 = i2 + 16 + (i5 * 6);
            printIMDirectory.setObject(randomAccessReader.getUInt16(i6), Long.valueOf(randomAccessReader.getUInt32(i6 + 2)));
        }
        if (boolValueOf != null) {
            randomAccessReader.setMotorolaByteOrder(boolValueOf.booleanValue());
        }
    }

    private static void processReconyxHyperFire2Makernote(ReconyxHyperFire2MakernoteDirectory reconyxHyperFire2MakernoteDirectory, int i2, RandomAccessReader randomAccessReader) throws IOException {
        Integer numValueOf;
        int uInt16 = randomAccessReader.getUInt16(i2 + 42);
        int uInt162 = randomAccessReader.getUInt16(i2 + 44);
        int uInt163 = randomAccessReader.getUInt16(i2 + 6);
        String str = String.format("%04X", Integer.valueOf(randomAccessReader.getUInt16(i2 + 48))) + String.format("%04X", Integer.valueOf(randomAccessReader.getUInt16(i2 + 50)));
        try {
            numValueOf = Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            reconyxHyperFire2MakernoteDirectory.setString(42, String.format("%d.%d.%d.%s", Integer.valueOf(uInt16), Integer.valueOf(uInt162), Integer.valueOf(uInt163), numValueOf));
        } else {
            reconyxHyperFire2MakernoteDirectory.setString(42, String.format("%d.%d.%d", Integer.valueOf(uInt16), Integer.valueOf(uInt162), Integer.valueOf(uInt163)));
            reconyxHyperFire2MakernoteDirectory.addError("Error processing Reconyx HyperFire 2 makernote data: build '" + str + "' is not in the expected format and will be omitted from Firmware Version.");
        }
        reconyxHyperFire2MakernoteDirectory.setIntArray(54, new int[]{randomAccessReader.getUInt16(i2 + 54), randomAccessReader.getUInt16(i2 + 56)});
        reconyxHyperFire2MakernoteDirectory.setInt(58, (randomAccessReader.getUInt16(i2 + 58) << 16) + randomAccessReader.getUInt16(i2 + 60));
        int uInt164 = randomAccessReader.getUInt16(i2 + 62);
        int uInt165 = randomAccessReader.getUInt16(i2 + 64);
        int uInt166 = randomAccessReader.getUInt16(i2 + 66);
        int uInt167 = randomAccessReader.getUInt16(i2 + 68);
        int uInt168 = randomAccessReader.getUInt16(i2 + 70);
        int uInt169 = randomAccessReader.getUInt16(i2 + 72);
        if (uInt164 < 0 || uInt164 >= 60 || uInt165 < 0 || uInt165 >= 60 || uInt166 < 0 || uInt166 >= 24 || uInt167 < 1 || uInt167 >= 13 || uInt168 < 1 || uInt168 >= 32 || uInt169 < 1 || uInt169 > 9999) {
            reconyxHyperFire2MakernoteDirectory.addError("Error processing Reconyx HyperFire 2 makernote data: Date/Time Original " + uInt169 + Global.HYPHEN + uInt167 + Global.HYPHEN + uInt168 + Global.BLANK + uInt166 + Global.COLON + uInt165 + Global.COLON + uInt164 + " is not a valid date/time.");
        } else {
            reconyxHyperFire2MakernoteDirectory.setString(62, String.format("%4d:%2d:%2d %2d:%2d:%2d", Integer.valueOf(uInt169), Integer.valueOf(uInt167), Integer.valueOf(uInt168), Integer.valueOf(uInt166), Integer.valueOf(uInt165), Integer.valueOf(uInt164)));
        }
        reconyxHyperFire2MakernoteDirectory.setInt(76, randomAccessReader.getUInt16(i2 + 76));
        reconyxHyperFire2MakernoteDirectory.setInt(78, randomAccessReader.getInt16(i2 + 78));
        reconyxHyperFire2MakernoteDirectory.setInt(80, randomAccessReader.getInt16(i2 + 80));
        reconyxHyperFire2MakernoteDirectory.setInt(82, randomAccessReader.getUInt16(i2 + 82));
        reconyxHyperFire2MakernoteDirectory.setInt(84, randomAccessReader.getUInt16(i2 + 84));
        int i3 = i2 + 86;
        reconyxHyperFire2MakernoteDirectory.setInt(86, randomAccessReader.getUInt16(i3));
        reconyxHyperFire2MakernoteDirectory.setInt(88, randomAccessReader.getUInt16(i2 + 88));
        reconyxHyperFire2MakernoteDirectory.setInt(90, randomAccessReader.getByte(i2 + 90));
        reconyxHyperFire2MakernoteDirectory.setInt(92, randomAccessReader.getUInt16(i2 + 92));
        reconyxHyperFire2MakernoteDirectory.setInt(94, randomAccessReader.getUInt16(i2 + 94));
        reconyxHyperFire2MakernoteDirectory.setInt(96, randomAccessReader.getUInt16(i2 + 96));
        reconyxHyperFire2MakernoteDirectory.setDouble(98, ((double) randomAccessReader.getUInt16(i2 + 98)) / 1000.0d);
        reconyxHyperFire2MakernoteDirectory.setDouble(100, ((double) randomAccessReader.getUInt16(i2 + 100)) / 1000.0d);
        reconyxHyperFire2MakernoteDirectory.setString(86, randomAccessReader.getNullTerminatedString(i3, 44, Charsets.UTF_8));
        reconyxHyperFire2MakernoteDirectory.setStringValue(126, new StringValue(randomAccessReader.getBytes(i2 + 126, 28), Charsets.UTF_16LE));
    }

    private static void processReconyxHyperFireMakernote(ReconyxHyperFireMakernoteDirectory reconyxHyperFireMakernoteDirectory, int i2, RandomAccessReader randomAccessReader) throws IOException {
        Integer numValueOf;
        reconyxHyperFireMakernoteDirectory.setObject(0, Integer.valueOf(randomAccessReader.getUInt16(i2)));
        int uInt16 = randomAccessReader.getUInt16(i2 + 2);
        int uInt162 = randomAccessReader.getUInt16(i2 + 4);
        int uInt163 = randomAccessReader.getUInt16(i2 + 6);
        String str = String.format("%04X", Integer.valueOf(randomAccessReader.getUInt16(i2 + 8))) + String.format("%04X", Integer.valueOf(randomAccessReader.getUInt16(i2 + 10)));
        try {
            numValueOf = Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            reconyxHyperFireMakernoteDirectory.setString(2, String.format("%d.%d.%d.%s", Integer.valueOf(uInt16), Integer.valueOf(uInt162), Integer.valueOf(uInt163), numValueOf));
        } else {
            reconyxHyperFireMakernoteDirectory.setString(2, String.format("%d.%d.%d", Integer.valueOf(uInt16), Integer.valueOf(uInt162), Integer.valueOf(uInt163)));
            reconyxHyperFireMakernoteDirectory.addError("Error processing Reconyx HyperFire makernote data: build '" + str + "' is not in the expected format and will be omitted from Firmware Version.");
        }
        reconyxHyperFireMakernoteDirectory.setString(12, String.valueOf((char) randomAccessReader.getUInt16(i2 + 12)));
        reconyxHyperFireMakernoteDirectory.setIntArray(14, new int[]{randomAccessReader.getUInt16(i2 + 14), randomAccessReader.getUInt16(i2 + 16)});
        reconyxHyperFireMakernoteDirectory.setInt(18, (randomAccessReader.getUInt16(i2 + 18) << 16) + randomAccessReader.getUInt16(i2 + 20));
        int uInt164 = randomAccessReader.getUInt16(i2 + 22);
        int uInt165 = randomAccessReader.getUInt16(i2 + 24);
        int uInt166 = randomAccessReader.getUInt16(i2 + 26);
        int uInt167 = randomAccessReader.getUInt16(i2 + 28);
        int uInt168 = randomAccessReader.getUInt16(i2 + 30);
        int uInt169 = randomAccessReader.getUInt16(i2 + 32);
        if (uInt164 < 0 || uInt164 >= 60 || uInt165 < 0 || uInt165 >= 60 || uInt166 < 0 || uInt166 >= 24 || uInt167 < 1 || uInt167 >= 13 || uInt168 < 1 || uInt168 >= 32 || uInt169 < 1 || uInt169 > 9999) {
            reconyxHyperFireMakernoteDirectory.addError("Error processing Reconyx HyperFire makernote data: Date/Time Original " + uInt169 + Global.HYPHEN + uInt167 + Global.HYPHEN + uInt168 + Global.BLANK + uInt166 + Global.COLON + uInt165 + Global.COLON + uInt164 + " is not a valid date/time.");
        } else {
            reconyxHyperFireMakernoteDirectory.setString(22, String.format("%4d:%2d:%2d %2d:%2d:%2d", Integer.valueOf(uInt169), Integer.valueOf(uInt167), Integer.valueOf(uInt168), Integer.valueOf(uInt166), Integer.valueOf(uInt165), Integer.valueOf(uInt164)));
        }
        reconyxHyperFireMakernoteDirectory.setInt(36, randomAccessReader.getUInt16(i2 + 36));
        reconyxHyperFireMakernoteDirectory.setInt(38, randomAccessReader.getInt16(i2 + 38));
        reconyxHyperFireMakernoteDirectory.setInt(40, randomAccessReader.getInt16(i2 + 40));
        reconyxHyperFireMakernoteDirectory.setStringValue(42, new StringValue(randomAccessReader.getBytes(i2 + 42, 28), Charsets.UTF_16LE));
        reconyxHyperFireMakernoteDirectory.setInt(72, randomAccessReader.getUInt16(i2 + 72));
        reconyxHyperFireMakernoteDirectory.setInt(74, randomAccessReader.getUInt16(i2 + 74));
        reconyxHyperFireMakernoteDirectory.setInt(76, randomAccessReader.getUInt16(i2 + 76));
        reconyxHyperFireMakernoteDirectory.setInt(78, randomAccessReader.getUInt16(i2 + 78));
        reconyxHyperFireMakernoteDirectory.setInt(80, randomAccessReader.getUInt16(i2 + 80));
        reconyxHyperFireMakernoteDirectory.setInt(82, randomAccessReader.getUInt16(i2 + 82));
        reconyxHyperFireMakernoteDirectory.setDouble(84, ((double) randomAccessReader.getUInt16(i2 + 84)) / 1000.0d);
        reconyxHyperFireMakernoteDirectory.setString(86, randomAccessReader.getNullTerminatedString(i2 + 86, 44, Charsets.UTF_8));
    }

    private static void processReconyxUltraFireMakernote(ReconyxUltraFireMakernoteDirectory reconyxUltraFireMakernoteDirectory, int i2, RandomAccessReader randomAccessReader) throws IOException {
        reconyxUltraFireMakernoteDirectory.setString(0, randomAccessReader.getString(i2, 9, Charsets.UTF_8));
        reconyxUltraFireMakernoteDirectory.setString(52, randomAccessReader.getString(i2 + 52, 1, Charsets.UTF_8));
        reconyxUltraFireMakernoteDirectory.setIntArray(53, new int[]{randomAccessReader.getByte(i2 + 53), randomAccessReader.getByte(i2 + 54)});
        randomAccessReader.getByte(i2 + 59);
        randomAccessReader.getByte(i2 + 60);
        randomAccessReader.getByte(i2 + 61);
        randomAccessReader.getByte(i2 + 62);
        randomAccessReader.getByte(i2 + 63);
        reconyxUltraFireMakernoteDirectory.setInt(67, randomAccessReader.getByte(i2 + 67));
        reconyxUltraFireMakernoteDirectory.setInt(72, randomAccessReader.getByte(i2 + 72));
        reconyxUltraFireMakernoteDirectory.setStringValue(75, new StringValue(randomAccessReader.getBytes(i2 + 75, 14), Charsets.UTF_8));
        reconyxUltraFireMakernoteDirectory.setString(80, randomAccessReader.getNullTerminatedString(i2 + 80, 20, Charsets.UTF_8));
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public boolean customProcessTag(int i2, Set<Integer> set, int i3, RandomAccessReader randomAccessReader, int i4, int i5) throws Throwable {
        if (i4 == 0) {
            if (this._currentDirectory.containsTag(i4)) {
                return false;
            }
            if (i5 == 0) {
                return true;
            }
        }
        if (i4 == 37500 && (this._currentDirectory instanceof ExifSubIFDDirectory)) {
            return processMakernote(i2, set, i3, randomAccessReader);
        }
        if (i4 == 33723 && (this._currentDirectory instanceof ExifIFD0Directory)) {
            if (randomAccessReader.getInt8(i2) != 28) {
                return false;
            }
            new IptcReader().extract(new SequentialByteArrayReader(randomAccessReader.getBytes(i2, i5)), this._metadata, r0.length, this._currentDirectory);
            return true;
        }
        if (i4 == 34675) {
            new IccReader().extract(new ByteArrayReader(randomAccessReader.getBytes(i2, i5)), this._metadata, this._currentDirectory);
            return true;
        }
        if (i4 == 34377 && (this._currentDirectory instanceof ExifIFD0Directory)) {
            new PhotoshopReader().extract(new SequentialByteArrayReader(randomAccessReader.getBytes(i2, i5)), i5, this._metadata, this._currentDirectory);
            return true;
        }
        if (i4 == 700 && ((this._currentDirectory instanceof ExifIFD0Directory) || (this._currentDirectory instanceof ExifSubIFDDirectory))) {
            new XmpReader().extract(randomAccessReader.getNullTerminatedBytes(i2, i5), this._metadata, this._currentDirectory);
            return true;
        }
        if (i4 == 3 && (this._currentDirectory instanceof AppleMakernoteDirectory)) {
            new AppleRunTimeReader().extract(randomAccessReader.getBytes(i2, i5), this._metadata, this._currentDirectory);
            return true;
        }
        if (handlePrintIM(this._currentDirectory, i4)) {
            PrintIMDirectory printIMDirectory = new PrintIMDirectory();
            printIMDirectory.setParent(this._currentDirectory);
            this._metadata.addDirectory(printIMDirectory);
            processPrintIM(printIMDirectory, i2, randomAccessReader, i5);
            return true;
        }
        if (this._currentDirectory instanceof OlympusMakernoteDirectory) {
            if (i4 == 8208) {
                pushDirectory(OlympusEquipmentMakernoteDirectory.class);
                TiffReader.processIfd(this, randomAccessReader, set, i2, i3);
                return true;
            }
            if (i4 == 8224) {
                pushDirectory(OlympusCameraSettingsMakernoteDirectory.class);
                TiffReader.processIfd(this, randomAccessReader, set, i2, i3);
                return true;
            }
            if (i4 == 8256) {
                pushDirectory(OlympusImageProcessingMakernoteDirectory.class);
                TiffReader.processIfd(this, randomAccessReader, set, i2, i3);
                return true;
            }
            if (i4 == 8272) {
                pushDirectory(OlympusFocusInfoMakernoteDirectory.class);
                TiffReader.processIfd(this, randomAccessReader, set, i2, i3);
                return true;
            }
            if (i4 == 12288) {
                pushDirectory(OlympusRawInfoMakernoteDirectory.class);
                TiffReader.processIfd(this, randomAccessReader, set, i2, i3);
                return true;
            }
            if (i4 == 16384) {
                pushDirectory(OlympusMakernoteDirectory.class);
                TiffReader.processIfd(this, randomAccessReader, set, i2, i3);
                return true;
            }
            if (i4 == 8240) {
                pushDirectory(OlympusRawDevelopmentMakernoteDirectory.class);
                TiffReader.processIfd(this, randomAccessReader, set, i2, i3);
                return true;
            }
            if (i4 == 8241) {
                pushDirectory(OlympusRawDevelopment2MakernoteDirectory.class);
                TiffReader.processIfd(this, randomAccessReader, set, i2, i3);
                return true;
            }
        }
        if (this._currentDirectory instanceof PanasonicRawIFD0Directory) {
            if (i4 == 19) {
                PanasonicRawWbInfoDirectory panasonicRawWbInfoDirectory = new PanasonicRawWbInfoDirectory();
                panasonicRawWbInfoDirectory.setParent(this._currentDirectory);
                this._metadata.addDirectory(panasonicRawWbInfoDirectory);
                processBinary(panasonicRawWbInfoDirectory, i2, randomAccessReader, i5, false, 2);
                return true;
            }
            if (i4 == 39) {
                PanasonicRawWbInfo2Directory panasonicRawWbInfo2Directory = new PanasonicRawWbInfo2Directory();
                panasonicRawWbInfo2Directory.setParent(this._currentDirectory);
                this._metadata.addDirectory(panasonicRawWbInfo2Directory);
                processBinary(panasonicRawWbInfo2Directory, i2, randomAccessReader, i5, false, 3);
                return true;
            }
            if (i4 == 281) {
                PanasonicRawDistortionDirectory panasonicRawDistortionDirectory = new PanasonicRawDistortionDirectory();
                panasonicRawDistortionDirectory.setParent(this._currentDirectory);
                this._metadata.addDirectory(panasonicRawDistortionDirectory);
                processBinary(panasonicRawDistortionDirectory, i2, randomAccessReader, i5, true, 1);
                return true;
            }
        }
        if (i4 == 46 && (this._currentDirectory instanceof PanasonicRawIFD0Directory)) {
            try {
                for (Directory directory : JpegMetadataReader.readMetadata(new ByteArrayInputStream(randomAccessReader.getBytes(i2, i5))).getDirectories()) {
                    directory.setParent(this._currentDirectory);
                    this._metadata.addDirectory(directory);
                }
                return true;
            } catch (JpegProcessingException e2) {
                this._currentDirectory.addError("Error processing JpgFromRaw: " + e2.getMessage());
            } catch (IOException e3) {
                this._currentDirectory.addError("Error reading JpgFromRaw: " + e3.getMessage());
            }
        }
        return false;
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public boolean hasFollowerIfd() {
        if (!(this._currentDirectory instanceof ExifIFD0Directory) && !(this._currentDirectory instanceof ExifImageDirectory)) {
            return this._currentDirectory instanceof ExifThumbnailDirectory;
        }
        if (this._currentDirectory.containsTag(ExifDirectoryBase.TAG_PAGE_NUMBER)) {
            pushDirectory(ExifImageDirectory.class);
        } else {
            pushDirectory(ExifThumbnailDirectory.class);
        }
        return true;
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public void setTiffMarker(int i2) throws TiffProcessingException {
        if (i2 != 42) {
            if (i2 == 85) {
                pushDirectory(PanasonicRawIFD0Directory.class);
                return;
            } else if (i2 != 20306 && i2 != 21330) {
                throw new TiffProcessingException(String.format("Unexpected TIFF marker: 0x%X", Integer.valueOf(i2)));
            }
        }
        pushDirectory(ExifIFD0Directory.class);
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public Long tryCustomProcessFormat(int i2, int i3, long j2) {
        return i3 == 13 ? Long.valueOf(j2 * 4) : i3 == 0 ? 0L : null;
    }

    @Override // com.drew.imaging.tiff.TiffHandler
    public boolean tryEnterSubIfd(int i2) {
        if (i2 == 330) {
            pushDirectory(ExifSubIFDDirectory.class);
            return true;
        }
        if ((this._currentDirectory instanceof ExifIFD0Directory) || (this._currentDirectory instanceof PanasonicRawIFD0Directory)) {
            if (i2 == 34665) {
                pushDirectory(ExifSubIFDDirectory.class);
                return true;
            }
            if (i2 == 34853) {
                pushDirectory(GpsDirectory.class);
                return true;
            }
        }
        if ((this._currentDirectory instanceof ExifSubIFDDirectory) && i2 == 40965) {
            pushDirectory(ExifInteropDirectory.class);
            return true;
        }
        if (!(this._currentDirectory instanceof OlympusMakernoteDirectory)) {
            return false;
        }
        if (i2 == 8208) {
            pushDirectory(OlympusEquipmentMakernoteDirectory.class);
            return true;
        }
        if (i2 == 8224) {
            pushDirectory(OlympusCameraSettingsMakernoteDirectory.class);
            return true;
        }
        if (i2 == 8256) {
            pushDirectory(OlympusImageProcessingMakernoteDirectory.class);
            return true;
        }
        if (i2 == 8272) {
            pushDirectory(OlympusFocusInfoMakernoteDirectory.class);
            return true;
        }
        if (i2 == 12288) {
            pushDirectory(OlympusRawInfoMakernoteDirectory.class);
            return true;
        }
        if (i2 == 16384) {
            pushDirectory(OlympusMakernoteDirectory.class);
            return true;
        }
        if (i2 == 8240) {
            pushDirectory(OlympusRawDevelopmentMakernoteDirectory.class);
            return true;
        }
        if (i2 != 8241) {
            return false;
        }
        pushDirectory(OlympusRawDevelopment2MakernoteDirectory.class);
        return true;
    }
}
