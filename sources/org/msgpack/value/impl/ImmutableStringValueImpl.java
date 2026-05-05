package org.msgpack.value.impl;

import java.io.IOException;
import java.util.Arrays;
import org.msgpack.core.MessagePacker;
import org.msgpack.value.ImmutableStringValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueType;

/* JADX INFO: loaded from: classes2.dex */
public class ImmutableStringValueImpl extends AbstractImmutableRawValue implements ImmutableStringValue {
    public ImmutableStringValueImpl(String str) {
        super(str);
    }

    public ImmutableStringValueImpl(byte[] bArr) {
        super(bArr);
    }

    @Override // org.msgpack.value.impl.AbstractImmutableValue, org.msgpack.value.Value
    public ImmutableStringValue asStringValue() {
        return this;
    }

    @Override // org.msgpack.value.Value
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        if (value.isStringValue()) {
            return value instanceof ImmutableStringValueImpl ? Arrays.equals(this.data, ((ImmutableStringValueImpl) value).data) : Arrays.equals(this.data, value.asStringValue().asByteArray());
        }
        return false;
    }

    @Override // org.msgpack.value.Value
    public ValueType getValueType() {
        return ValueType.STRING;
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    @Override // org.msgpack.value.Value
    public ImmutableStringValue immutableValue() {
        return this;
    }

    @Override // org.msgpack.value.Value
    public void writeTo(MessagePacker messagePacker) throws IOException {
        messagePacker.packRawStringHeader(this.data.length);
        messagePacker.writePayload(this.data);
    }
}
