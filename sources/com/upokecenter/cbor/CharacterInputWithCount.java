package com.upokecenter.cbor;

/* JADX INFO: loaded from: classes5.dex */
class CharacterInputWithCount implements ICharacterInput {
    private final ICharacterInput ci;
    private int offset;

    public CharacterInputWithCount(ICharacterInput iCharacterInput) {
        this.ci = iCharacterInput;
    }

    private String NewErrorString(String str) {
        return str + " (offset " + GetOffset() + ")";
    }

    public int GetOffset() {
        return this.offset;
    }

    public void RaiseError(Exception exc) {
        if (exc.getCause() != null) {
            throw new CBORException(NewErrorString(exc.getMessage()), exc.getCause());
        }
        throw new CBORException(NewErrorString(exc.getMessage()), exc);
    }

    public void RaiseError(String str) {
        throw new CBORException(NewErrorString(str));
    }

    @Override // com.upokecenter.cbor.ICharacterInput
    public int Read(int[] iArr, int i2, int i3) {
        if (iArr == null) {
            throw new NullPointerException("chars");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("index(" + i2 + ") is less than 0");
        }
        if (i2 > iArr.length) {
            throw new IllegalArgumentException("index(" + i2 + ") is more than " + iArr.length);
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("length(" + i3 + ") is less than 0");
        }
        if (i3 > iArr.length) {
            throw new IllegalArgumentException("length(" + i3 + ") is more than " + iArr.length);
        }
        if (iArr.length - i2 < i3) {
            throw new IllegalArgumentException("chars's length minus " + i2 + "(" + (iArr.length - i2) + ") is less than " + i3);
        }
        int iRead = this.ci.Read(iArr, i2, i3);
        if (iRead > 0) {
            this.offset += iRead;
        }
        return iRead;
    }

    @Override // com.upokecenter.cbor.ICharacterInput
    public int ReadChar() {
        int iReadChar;
        try {
            iReadChar = this.ci.ReadChar();
        } catch (IllegalStateException e2) {
            RaiseError(e2);
            iReadChar = -1;
        }
        if (iReadChar >= 0) {
            this.offset++;
        }
        return iReadChar;
    }
}
