package com.drew.metadata.apple;

import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.exif.makernotes.AppleRunTimeMakernoteDirectory;
import com.drew.metadata.plist.BplistReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class AppleRunTimeReader {
    private static void processAppleRunTime(AppleRunTimeMakernoteDirectory appleRunTimeMakernoteDirectory, byte[] bArr) throws IOException {
        BplistReader.PropertyListResults propertyListResults = BplistReader.parse(bArr);
        Set<Map.Entry<Byte, Byte>> entrySet = propertyListResults.getEntrySet();
        if (entrySet != null) {
            HashMap map = new HashMap(entrySet.size());
            for (Map.Entry<Byte, Byte> entry : entrySet) {
                map.put((String) propertyListResults.getObjects().get(entry.getKey().byteValue()), propertyListResults.getObjects().get(entry.getValue().byteValue()));
            }
            byte bByteValue = ((Byte) map.get("flags")).byteValue();
            if ((bByteValue & 1) == 1) {
                appleRunTimeMakernoteDirectory.setInt(1, bByteValue);
                appleRunTimeMakernoteDirectory.setInt(2, ((Byte) map.get("epoch")).byteValue());
                appleRunTimeMakernoteDirectory.setLong(3, ((Long) map.get("timescale")).longValue());
                appleRunTimeMakernoteDirectory.setLong(4, ((Long) map.get("value")).longValue());
            }
        }
    }

    public void extract(byte[] bArr, Metadata metadata, Directory directory) {
        directory.setByteArray(3, bArr);
        if (!BplistReader.isValid(bArr)) {
            directory.addError("Input array is not a bplist");
            return;
        }
        AppleRunTimeMakernoteDirectory appleRunTimeMakernoteDirectory = new AppleRunTimeMakernoteDirectory();
        appleRunTimeMakernoteDirectory.setParent(directory);
        try {
            processAppleRunTime(appleRunTimeMakernoteDirectory, bArr);
            if (appleRunTimeMakernoteDirectory.getTagCount() > 0) {
                metadata.addDirectory(appleRunTimeMakernoteDirectory);
            }
        } catch (IOException e2) {
            directory.addError("Error processing TAG_RUN_TIME: " + e2.getMessage());
        }
    }
}
