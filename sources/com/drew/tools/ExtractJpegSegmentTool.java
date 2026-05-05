package com.drew.tools;

import com.drew.imaging.jpeg.JpegSegmentData;
import com.drew.imaging.jpeg.JpegSegmentReader;
import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.Iterables;
import com.dynatrace.android.agent.Global;
import java.io.File;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ExtractJpegSegmentTool {
    public static void main(String[] strArr) throws Throwable {
        if (strArr.length < 1) {
            printUsage();
            System.exit(1);
        }
        String str = strArr[0];
        if (!new File(str).exists()) {
            System.err.println("File does not exist");
            printUsage();
            System.exit(1);
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 1; i2 < strArr.length; i2++) {
            JpegSegmentType jpegSegmentTypeValueOf = JpegSegmentType.valueOf(strArr[i2].toUpperCase());
            if (!jpegSegmentTypeValueOf.canContainMetadata) {
                System.err.printf("WARNING: Segment type %s cannot contain metadata so it may not be necessary to extract it%n", jpegSegmentTypeValueOf);
            }
            hashSet.add(jpegSegmentTypeValueOf);
        }
        if (hashSet.size() == 0) {
            hashSet.addAll(JpegSegmentType.canContainMetadataTypes);
        }
        System.out.println("Reading: " + str);
        saveSegmentFiles(str, JpegSegmentReader.readSegments(new File(str), hashSet));
    }

    private static void printUsage() {
        System.out.println("USAGE:\n");
        System.out.println("\tjava com.drew.tools.ExtractJpegSegmentTool <filename> [<segment> ...]\n");
        System.out.print("Where <segment> is zero or more of:");
        for (JpegSegmentType jpegSegmentType : (JpegSegmentType[]) JpegSegmentType.class.getEnumConstants()) {
            if (jpegSegmentType.canContainMetadata) {
                System.out.print(Global.BLANK + jpegSegmentType.toString());
            }
        }
        System.out.println();
    }

    public static void saveSegmentFiles(String str, JpegSegmentData jpegSegmentData) throws Throwable {
        for (JpegSegmentType jpegSegmentType : jpegSegmentData.getSegmentTypes()) {
            List list = Iterables.toList(jpegSegmentData.getSegments(jpegSegmentType));
            if (list.size() != 0) {
                if (list.size() > 1) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        String str2 = String.format("%s.%s.%d", str, jpegSegmentType.toString().toLowerCase(), Integer.valueOf(i2));
                        System.out.println("Writing: " + str2);
                        FileUtil.saveBytes(new File(str2), (byte[]) list.get(i2));
                    }
                } else {
                    String str3 = String.format("%s.%s", str, jpegSegmentType.toString().toLowerCase());
                    System.out.println("Writing: " + str3);
                    FileUtil.saveBytes(new File(str3), (byte[]) list.get(0));
                }
            }
        }
    }
}
