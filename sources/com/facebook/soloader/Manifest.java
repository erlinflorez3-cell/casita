package com.facebook.soloader;

import com.facebook.soloader.MinElf;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class Manifest {
    public final String arch;
    public final List<String> libs;

    Manifest(String str, List<String> list) {
        this.arch = str;
        this.libs = Collections.unmodifiableList(list);
    }

    public static Manifest read(DataInputStream dataInputStream) throws IOException {
        String arch = readArch(dataInputStream);
        int i2 = dataInputStream.readShort() & 65535;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(readLib(dataInputStream));
        }
        return new Manifest(arch, arrayList);
    }

    public static Manifest read(InputStream inputStream) throws IOException {
        return read(new DataInputStream(inputStream));
    }

    private static String readArch(DataInputStream dataInputStream) throws IOException {
        byte b2 = dataInputStream.readByte();
        if (b2 == 1) {
            return MinElf.ISA.AARCH64;
        }
        if (b2 == 2) {
            return MinElf.ISA.ARM;
        }
        if (b2 == 3) {
            return MinElf.ISA.X86_64;
        }
        if (b2 == 4) {
            return MinElf.ISA.X86;
        }
        throw new RuntimeException("Unrecognized arch id: " + ((int) b2));
    }

    private static String readLib(DataInputStream dataInputStream) throws IOException {
        byte[] bArr = new byte[(-1) - (((-1) - dataInputStream.readShort()) | ((-1) - 65535))];
        dataInputStream.readFully(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }
}
