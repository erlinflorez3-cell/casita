package org.msgpack.value.impl;

import java.io.IOException;
import java.time.Instant;
import java.util.Arrays;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.value.ExtensionValue;
import org.msgpack.value.ImmutableArrayValue;
import org.msgpack.value.ImmutableBinaryValue;
import org.msgpack.value.ImmutableBooleanValue;
import org.msgpack.value.ImmutableExtensionValue;
import org.msgpack.value.ImmutableFloatValue;
import org.msgpack.value.ImmutableIntegerValue;
import org.msgpack.value.ImmutableMapValue;
import org.msgpack.value.ImmutableNilValue;
import org.msgpack.value.ImmutableNumberValue;
import org.msgpack.value.ImmutableRawValue;
import org.msgpack.value.ImmutableStringValue;
import org.msgpack.value.ImmutableTimestampValue;
import org.msgpack.value.TimestampValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueType;

/* JADX INFO: loaded from: classes2.dex */
public class ImmutableTimestampValueImpl extends AbstractImmutableValue implements ImmutableExtensionValue, ImmutableTimestampValue {
    private byte[] data;
    private final Instant instant;

    public ImmutableTimestampValueImpl(Instant instant) {
        this.instant = instant;
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.ImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ ImmutableArrayValue asArrayValue() {
        return super.asArrayValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.ImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ ImmutableBinaryValue asBinaryValue() {
        return super.asBinaryValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.ImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ ImmutableBooleanValue asBooleanValue() {
        return super.asBooleanValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.Value
    public ImmutableExtensionValue asExtensionValue() {
        return this;
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.ImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ ImmutableFloatValue asFloatValue() {
        return super.asFloatValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.ImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ ImmutableIntegerValue asIntegerValue() {
        return super.asIntegerValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.ImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ ImmutableMapValue asMapValue() {
        return super.asMapValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.ImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ ImmutableNilValue asNilValue() {
        return super.asNilValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ ImmutableNumberValue asNumberValue() {
        return super.asNumberValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.ImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ ImmutableRawValue asRawValue() {
        return super.asRawValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.ImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ ImmutableStringValue asStringValue() {
        return super.asStringValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.Value
    public ImmutableTimestampValue asTimestampValue() {
        return this;
    }

    @Override // org.msgpack.value.Value
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        if (!value.isExtensionValue()) {
            return false;
        }
        ExtensionValue extensionValueAsExtensionValue = value.asExtensionValue();
        return extensionValueAsExtensionValue instanceof TimestampValue ? this.instant.equals(((TimestampValue) extensionValueAsExtensionValue).toInstant()) : -1 == extensionValueAsExtensionValue.getType() && Arrays.equals(getData(), extensionValueAsExtensionValue.getData());
    }

    @Override // org.msgpack.value.ExtensionValue
    public byte[] getData() {
        byte[] bArr;
        if (this.data == null) {
            long epochSecond = getEpochSecond();
            int nano = getNano();
            if ((epochSecond >>> 34) == 0) {
                long j2 = (-1) - (((-1) - ((long) (nano << 34))) & ((-1) - epochSecond));
                if (((-4294967296L) + j2) - ((-4294967296L) | j2) == 0) {
                    bArr = new byte[4];
                    MessageBuffer.wrap(bArr).putInt(0, (int) epochSecond);
                } else {
                    bArr = new byte[8];
                    MessageBuffer.wrap(bArr).putLong(0, j2);
                }
            } else {
                bArr = new byte[12];
                MessageBuffer messageBufferWrap = MessageBuffer.wrap(bArr);
                messageBufferWrap.putInt(0, nano);
                messageBufferWrap.putLong(4, epochSecond);
            }
            this.data = bArr;
        }
        return this.data;
    }

    @Override // org.msgpack.value.TimestampValue
    public long getEpochSecond() {
        return this.instant.getEpochSecond();
    }

    @Override // org.msgpack.value.TimestampValue
    public int getNano() {
        return this.instant.getNano();
    }

    @Override // org.msgpack.value.ExtensionValue
    public byte getType() {
        return (byte) -1;
    }

    @Override // org.msgpack.value.Value
    public ValueType getValueType() {
        return ValueType.EXTENSION;
    }

    public int hashCode() {
        return this.instant.hashCode();
    }

    @Override // org.msgpack.value.Value
    public ImmutableTimestampValue immutableValue() {
        return this;
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ boolean isArrayValue() {
        return super.isArrayValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ boolean isBinaryValue() {
        return super.isBinaryValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ boolean isBooleanValue() {
        return super.isBooleanValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ boolean isExtensionValue() {
        return super.isExtensionValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ boolean isFloatValue() {
        return super.isFloatValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ boolean isIntegerValue() {
        return super.isIntegerValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ boolean isMapValue() {
        return super.isMapValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ boolean isNilValue() {
        return super.isNilValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ boolean isNumberValue() {
        return super.isNumberValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ boolean isRawValue() {
        return super.isRawValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.Value
    public /* bridge */ /* synthetic */ boolean isStringValue() {
        return super.isStringValue();
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.Value
    public boolean isTimestampValue() {
        return true;
    }

    @Override // org.msgpack.value.TimestampValue
    public long toEpochMillis() {
        return this.instant.toEpochMilli();
    }

    @Override // org.msgpack.value.TimestampValue
    public Instant toInstant() {
        return this.instant;
    }

    @Override // org.msgpack.value.Value
    public String toJson() {
        return "\"" + toInstant().toString() + "\"";
    }

    public String toString() {
        return toInstant().toString();
    }

    @Override // org.msgpack.value.Value
    public void writeTo(MessagePacker messagePacker) throws IOException {
        messagePacker.packTimestamp(this.instant);
    }
}
