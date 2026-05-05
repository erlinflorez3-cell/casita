package org.msgpack.core.buffer;

import com.dynatrace.android.agent.Global;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import org.msgpack.core.Preconditions;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public class MessageBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int ARRAY_BYTE_BASE_OFFSET;
    private static final String BIGENDIAN_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferBE";
    private static final String DEFAULT_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBuffer";
    private static final String UNIVERSAL_MESSAGE_BUFFER = "org.msgpack.core.buffer.MessageBufferU";
    static final boolean isUniversalBuffer;
    static final int javaVersion;
    private static final Constructor<?> mbArrConstructor;
    private static final Constructor<?> mbBBConstructor;
    static final Unsafe unsafe;
    protected final long address;
    protected final Object base;
    protected final ByteBuffer reference;
    protected final int size;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.core.buffer.MessageBuffer.<clinit>():void");
    }

    protected MessageBuffer(Object obj, long j2, int i2) {
        this.base = obj;
        this.address = j2;
        this.size = i2;
        this.reference = null;
    }

    MessageBuffer(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            if (!byteBuffer.hasArray()) {
                throw new IllegalArgumentException("Only the array-backed ByteBuffer or DirectBuffer is supported");
            }
            this.base = byteBuffer.array();
            this.address = ARRAY_BYTE_BASE_OFFSET + byteBuffer.arrayOffset() + byteBuffer.position();
            this.size = byteBuffer.remaining();
            this.reference = null;
            return;
        }
        if (isUniversalBuffer) {
            this.base = null;
            this.address = 0L;
            this.size = byteBuffer.remaining();
            this.reference = null;
            return;
        }
        this.base = null;
        this.address = DirectBufferAccess.getAddress(byteBuffer) + ((long) byteBuffer.position());
        this.size = byteBuffer.remaining();
        this.reference = byteBuffer;
    }

    MessageBuffer(byte[] bArr, int i2, int i3) {
        this.base = bArr;
        this.address = ARRAY_BYTE_BASE_OFFSET + i2;
        this.size = i3;
        this.reference = null;
    }

    public static MessageBuffer allocate(int i2) {
        if (i2 >= 0) {
            return wrap(new byte[i2]);
        }
        throw new IllegalArgumentException("size must not be negative");
    }

    private static int getJavaVersion() {
        String property = System.getProperty("java.specification.version", "");
        int iIndexOf = property.indexOf(46);
        if (iIndexOf == -1) {
            try {
                return Integer.parseInt(property);
            } catch (NumberFormatException e2) {
                e2.printStackTrace(System.err);
                return 6;
            }
        }
        try {
            int i2 = Integer.parseInt(property.substring(0, iIndexOf));
            return i2 > 1 ? i2 : Integer.parseInt(property.substring(iIndexOf + 1));
        } catch (NumberFormatException e3) {
            e3.printStackTrace(System.err);
            return 6;
        }
    }

    private static MessageBuffer newInstance(Constructor<?> constructor, Object... objArr) {
        try {
            return (MessageBuffer) constructor.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException(e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            if (e4.getCause() instanceof Error) {
                throw ((Error) e4.getCause());
            }
            throw new IllegalStateException(e4.getCause());
        }
    }

    private static MessageBuffer newMessageBuffer(ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer);
        Constructor<?> constructor = mbBBConstructor;
        return constructor != null ? newInstance(constructor, byteBuffer) : new MessageBuffer(byteBuffer);
    }

    private static MessageBuffer newMessageBuffer(byte[] bArr, int i2, int i3) {
        Preconditions.checkNotNull(bArr);
        Constructor<?> constructor = mbArrConstructor;
        return constructor != null ? newInstance(constructor, bArr, Integer.valueOf(i2), Integer.valueOf(i3)) : new MessageBuffer(bArr, i2, i3);
    }

    public static void releaseBuffer(MessageBuffer messageBuffer) {
        if (isUniversalBuffer || messageBuffer.hasArray()) {
            return;
        }
        if (DirectBufferAccess.isDirectByteBufferInstance(messageBuffer.reference)) {
            DirectBufferAccess.clean(messageBuffer.reference);
        } else {
            unsafe.freeMemory(messageBuffer.address);
        }
    }

    public static MessageBuffer wrap(ByteBuffer byteBuffer) {
        return newMessageBuffer(byteBuffer);
    }

    public static MessageBuffer wrap(byte[] bArr) {
        return newMessageBuffer(bArr, 0, bArr.length);
    }

    public static MessageBuffer wrap(byte[] bArr, int i2, int i3) {
        return newMessageBuffer(bArr, i2, i3);
    }

    public byte[] array() {
        return (byte[]) this.base;
    }

    public int arrayOffset() {
        return ((int) this.address) - ARRAY_BYTE_BASE_OFFSET;
    }

    public void copyTo(int i2, MessageBuffer messageBuffer, int i3, int i4) {
        unsafe.copyMemory(this.base, this.address + ((long) i2), messageBuffer.base, ((long) i3) + messageBuffer.address, i4);
    }

    public boolean getBoolean(int i2) {
        return unsafe.getBoolean(this.base, this.address + ((long) i2));
    }

    public byte getByte(int i2) {
        return unsafe.getByte(this.base, this.address + ((long) i2));
    }

    public void getBytes(int i2, int i3, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < i3) {
            throw new BufferOverflowException();
        }
        byteBuffer.put(sliceAsByteBuffer(i2, i3));
    }

    public void getBytes(int i2, byte[] bArr, int i3, int i4) {
        unsafe.copyMemory(this.base, this.address + ((long) i2), bArr, ARRAY_BYTE_BASE_OFFSET + i3, i4);
    }

    public double getDouble(int i2) {
        return Double.longBitsToDouble(getLong(i2));
    }

    public float getFloat(int i2) {
        return Float.intBitsToFloat(getInt(i2));
    }

    public int getInt(int i2) {
        return Integer.reverseBytes(unsafe.getInt(this.base, this.address + ((long) i2)));
    }

    public long getLong(int i2) {
        return Long.reverseBytes(unsafe.getLong(this.base, this.address + ((long) i2)));
    }

    public short getShort(int i2) {
        return Short.reverseBytes(unsafe.getShort(this.base, this.address + ((long) i2)));
    }

    public boolean hasArray() {
        return this.base != null;
    }

    public void putBoolean(int i2, boolean z2) {
        unsafe.putBoolean(this.base, this.address + ((long) i2), z2);
    }

    public void putByte(int i2, byte b2) {
        unsafe.putByte(this.base, this.address + ((long) i2), b2);
    }

    public void putByteBuffer(int i2, ByteBuffer byteBuffer, int i3) {
        if (byteBuffer.isDirect()) {
            unsafe.copyMemory((Object) null, DirectBufferAccess.getAddress(byteBuffer) + ((long) byteBuffer.position()), this.base, this.address + ((long) i2), i3);
            byteBuffer.position(byteBuffer.position() + i3);
            return;
        }
        if (byteBuffer.hasArray()) {
            unsafe.copyMemory(byteBuffer.array(), ARRAY_BYTE_BASE_OFFSET + byteBuffer.position(), this.base, this.address + ((long) i2), i3);
            byteBuffer.position(byteBuffer.position() + i3);
        } else {
            if (hasArray()) {
                byteBuffer.get((byte[]) this.base, i2, i3);
                return;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                unsafe.putByte(this.base, this.address + ((long) i2), byteBuffer.get());
            }
        }
    }

    public void putBytes(int i2, byte[] bArr, int i3, int i4) {
        unsafe.copyMemory(bArr, ARRAY_BYTE_BASE_OFFSET + i3, this.base, this.address + ((long) i2), i4);
    }

    public void putDouble(int i2, double d2) {
        putLong(i2, Double.doubleToRawLongBits(d2));
    }

    public void putFloat(int i2, float f2) {
        putInt(i2, Float.floatToRawIntBits(f2));
    }

    public void putInt(int i2, int i3) {
        unsafe.putInt(this.base, this.address + ((long) i2), Integer.reverseBytes(i3));
    }

    public void putLong(int i2, long j2) {
        unsafe.putLong(this.base, ((long) i2) + this.address, Long.reverseBytes(j2));
    }

    public void putMessageBuffer(int i2, MessageBuffer messageBuffer, int i3, int i4) {
        unsafe.copyMemory(messageBuffer.base, messageBuffer.address + ((long) i3), this.base, ((long) i2) + this.address, i4);
    }

    public void putShort(int i2, short s2) {
        unsafe.putShort(this.base, this.address + ((long) i2), Short.reverseBytes(s2));
    }

    public int size() {
        return this.size;
    }

    public MessageBuffer slice(int i2, int i3) {
        if (i2 == 0 && i3 == size()) {
            return this;
        }
        Preconditions.checkArgument(i2 + i3 <= size());
        return new MessageBuffer(this.base, this.address + ((long) i2), i3);
    }

    public ByteBuffer sliceAsByteBuffer() {
        return sliceAsByteBuffer(0, size());
    }

    public ByteBuffer sliceAsByteBuffer(int i2, int i3) {
        return hasArray() ? ByteBuffer.wrap((byte[]) this.base, (int) ((this.address - ((long) ARRAY_BYTE_BASE_OFFSET)) + ((long) i2)), i3) : DirectBufferAccess.newByteBuffer(this.address, i2, i3, this.reference);
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        unsafe.copyMemory(this.base, this.address, bArr, ARRAY_BYTE_BASE_OFFSET, size());
        return bArr;
    }

    public String toHexString(int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = i2; i4 < i3; i4++) {
            if (i4 != i2) {
                sb.append(Global.BLANK);
            }
            sb.append(String.format("%02x", Byte.valueOf(getByte(i4))));
        }
        return sb.toString();
    }
}
