package com.google.firebase.installations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;
import yg.C1633zX;
import yg.Jg;
import yg.Od;
import yg.Xg;

/* JADX INFO: loaded from: classes7.dex */
public class RandomFidGenerator {
    private static final int FID_LENGTH = 22;
    private static final byte FID_4BIT_PREFIX = Byte.parseByte("01110000", 2);
    private static final byte REMOVE_PREFIX_MASK = Byte.parseByte("00001111", 2);

    private static String encodeFidBase64UrlSafe(byte[] bArr) throws Throwable {
        Object[] objArr = {bArr, 11};
        Method declaredMethod = Class.forName(Xg.qd("R`Wfd_[&nndh+@`sf87", (short) (C1633zX.Xd() ^ (-26128)), (short) (C1633zX.Xd() ^ (-1082)))).getDeclaredMethod(Jg.Wd("'\tT\u007fDd", (short) (Od.Xd() ^ (-14904)), (short) (Od.Xd() ^ (-25297))), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            return new String((byte[]) declaredMethod.invoke(null, objArr), Charset.defaultCharset()).substring(0, 22);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static byte[] getBytesFromUUID(UUID uuid, byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        return byteBufferWrap.array();
    }

    public String createRandomFid() {
        byte[] bytesFromUUID = getBytesFromUUID(UUID.randomUUID(), new byte[17]);
        byte b2 = bytesFromUUID[0];
        bytesFromUUID[16] = b2;
        byte b3 = REMOVE_PREFIX_MASK;
        bytesFromUUID[0] = (byte) (((b2 + b3) - (b2 | b3)) | FID_4BIT_PREFIX);
        return encodeFidBase64UrlSafe(bytesFromUUID);
    }
}
