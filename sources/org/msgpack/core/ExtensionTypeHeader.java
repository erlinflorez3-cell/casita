package org.msgpack.core;

import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes2.dex */
public class ExtensionTypeHeader {
    private final int length;
    private final byte type;

    public ExtensionTypeHeader(byte b2, int i2) {
        Preconditions.checkArgument(i2 >= 0, "length must be >= 0");
        this.type = b2;
        this.length = i2;
    }

    public static byte checkedCastToByte(int i2) {
        Preconditions.checkArgument(-128 <= i2 && i2 <= 127, "Extension type code must be within the range of byte");
        return (byte) i2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ExtensionTypeHeader)) {
            return false;
        }
        ExtensionTypeHeader extensionTypeHeader = (ExtensionTypeHeader) obj;
        return this.type == extensionTypeHeader.type && this.length == extensionTypeHeader.length;
    }

    public int getLength() {
        return this.length;
    }

    public byte getType() {
        return this.type;
    }

    public int hashCode() {
        return ((this.type + Ascii.US) * 31) + this.length;
    }

    public boolean isTimestampType() {
        return this.type == -1;
    }

    public String toString() {
        return String.format("ExtensionTypeHeader(type:%d, length:%,d)", Byte.valueOf(this.type), Integer.valueOf(this.length));
    }
}
