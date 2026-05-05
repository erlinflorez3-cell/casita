package com.drew.imaging.quicktime;

import com.drew.lang.StreamReader;
import com.drew.metadata.mov.QuickTimeContext;
import com.drew.metadata.mov.atoms.Atom;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class QuickTimeReader {
    private QuickTimeReader() {
    }

    public static void extract(InputStream inputStream, QuickTimeHandler<?> quickTimeHandler) {
        StreamReader streamReader = new StreamReader(inputStream);
        streamReader.setMotorolaByteOrder(true);
        processAtoms(streamReader, -1L, quickTimeHandler, new QuickTimeContext());
    }

    private static void processAtoms(StreamReader streamReader, long j2, QuickTimeHandler<?> quickTimeHandler, QuickTimeContext quickTimeContext) {
        while (true) {
            if (j2 != -1) {
                try {
                    if (streamReader.getPosition() >= j2) {
                        return;
                    }
                } catch (IOException e2) {
                    quickTimeHandler.addError(e2.getMessage());
                    return;
                }
            }
            Atom atom = new Atom(streamReader);
            if (atom.size > 2147483647L) {
                quickTimeHandler.addError("Atom size too large.");
                return;
            }
            if (atom.size < 8) {
                quickTimeHandler.addError("Atom size too small.");
                return;
            }
            if (quickTimeHandler.shouldAcceptContainer(atom)) {
                processAtoms(streamReader, (atom.size + streamReader.getPosition()) - 8, quickTimeHandler.processContainer(atom, quickTimeContext), quickTimeContext);
            } else if (quickTimeHandler.shouldAcceptAtom(atom)) {
                quickTimeHandler = quickTimeHandler.processAtom(atom, streamReader.getBytes(((int) atom.size) - 8), quickTimeContext);
            } else if (atom.size > 8) {
                streamReader.skip(atom.size - 8);
            } else if (atom.size == -1) {
                return;
            }
        }
    }
}
