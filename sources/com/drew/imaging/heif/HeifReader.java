package com.drew.imaging.heif;

import com.drew.lang.SequentialReader;
import com.drew.lang.StreamReader;
import com.drew.metadata.heif.HeifDirectory;
import com.drew.metadata.heif.boxes.Box;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class HeifReader {
    private static final Set<String> ACCEPTABLE_PRE_META_BOX_TYPES = new HashSet(Arrays.asList("ftyp", "meta"));

    private HeifHandler<?> processBox(SequentialReader sequentialReader, Box box, HeifHandler<?> heifHandler) throws IOException {
        if (heifHandler.shouldAcceptContainer(box)) {
            heifHandler.processContainer(box, sequentialReader);
            return processBoxes(sequentialReader, (box.size + sequentialReader.getPosition()) - 8, heifHandler);
        }
        if (heifHandler.shouldAcceptBox(box)) {
            return heifHandler.processBox(box, sequentialReader.getBytes(((int) box.size) - 8));
        }
        if (box.size <= 1) {
            return heifHandler;
        }
        sequentialReader.skip(box.size - 8);
        return heifHandler;
    }

    private HeifHandler<?> processBoxes(SequentialReader sequentialReader, long j2, HeifHandler<?> heifHandler) {
        while (true) {
            if (j2 != -1) {
                try {
                    if (sequentialReader.getPosition() >= j2) {
                        break;
                    }
                } catch (IOException unused) {
                }
            }
            heifHandler = processBox(sequentialReader, new Box(sequentialReader), heifHandler);
        }
        return heifHandler;
    }

    private void processTopLevelBoxes(InputStream inputStream, SequentialReader sequentialReader, long j2, HeifHandler<?> heifHandler, boolean z2) throws IOException {
        HeifDirectory heifDirectory;
        boolean z3 = false;
        boolean z4 = false;
        while (true) {
            if (j2 != -1) {
                try {
                    if (sequentialReader.getPosition() >= j2) {
                        break;
                    }
                } catch (IOException unused) {
                }
            }
            Box box = new Box(sequentialReader);
            if (!z3 && !ACCEPTABLE_PRE_META_BOX_TYPES.contains(box.type)) {
                z4 = true;
            }
            if ("meta".equalsIgnoreCase(box.type)) {
                z3 = true;
            }
            heifHandler = processBox(sequentialReader, box, heifHandler);
        }
        if (z4 && z2) {
            inputStream.reset();
            processBoxes(new StreamReader(inputStream), -1L, heifHandler);
        } else {
            if (!z4 || (heifDirectory = (HeifDirectory) heifHandler.metadata.getFirstDirectoryOfType(HeifDirectory.class)) == null) {
                return;
            }
            heifDirectory.addError("Unable to extract Exif data because inputStream was not resettable and 'meta' was not first box");
        }
    }

    public void extract(InputStream inputStream, HeifHandler<?> heifHandler) {
        boolean z2;
        try {
            if (inputStream.markSupported()) {
                inputStream.mark(inputStream.available() + 1);
                z2 = true;
            } else {
                z2 = false;
            }
            StreamReader streamReader = new StreamReader(inputStream);
            streamReader.setMotorolaByteOrder(true);
            processTopLevelBoxes(inputStream, streamReader, -1L, heifHandler, z2);
        } catch (IOException unused) {
        }
    }
}
