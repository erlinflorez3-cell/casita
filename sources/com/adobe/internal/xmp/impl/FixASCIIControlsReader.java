package com.adobe.internal.xmp.impl;

import cz.msebera.android.httpclient.message.TokenParser;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;

/* JADX INFO: loaded from: classes4.dex */
public class FixASCIIControlsReader extends PushbackReader {
    private static final int BUFFER_SIZE = 8;
    private static final int STATE_AMP = 1;
    private static final int STATE_DIG1 = 4;
    private static final int STATE_ERROR = 5;
    private static final int STATE_HASH = 2;
    private static final int STATE_HEX = 3;
    private static final int STATE_START = 0;
    private int control;
    private int digits;
    private int state;

    public FixASCIIControlsReader(Reader reader) {
        super(reader, 8);
        this.state = 0;
        this.control = 0;
        this.digits = 0;
    }

    private char processChar(char c2) {
        int i2;
        int i3 = this.state;
        if (i3 == 0) {
            if (c2 == '&') {
                this.state = 1;
            }
            return c2;
        }
        if (i3 == 1) {
            if (c2 == '#') {
                this.state = 2;
            } else {
                this.state = 5;
            }
            return c2;
        }
        if (i3 == 2) {
            if (c2 == 'x') {
                this.control = 0;
                this.digits = 0;
                this.state = 3;
            } else if ('0' > c2 || c2 > '9') {
                this.state = 5;
            } else {
                this.control = Character.digit(c2, 10);
                this.digits = 1;
                this.state = 4;
            }
            return c2;
        }
        if (i3 == 3) {
            if (('0' <= c2 && c2 <= '9') || (('a' <= c2 && c2 <= 'f') || ('A' <= c2 && c2 <= 'F'))) {
                this.control = (this.control * 16) + Character.digit(c2, 16);
                int i4 = this.digits + 1;
                this.digits = i4;
                if (i4 <= 4) {
                    this.state = 3;
                } else {
                    this.state = 5;
                }
            } else if (c2 == ';' && Utils.isControlChar((char) this.control)) {
                this.state = 0;
                i2 = this.control;
            } else {
                this.state = 5;
            }
            return c2;
        }
        if (i3 != 4) {
            if (i3 != 5) {
                return c2;
            }
            this.state = 0;
            return c2;
        }
        if ('0' <= c2 && c2 <= '9') {
            this.control = (this.control * 10) + Character.digit(c2, 10);
            int i5 = this.digits + 1;
            this.digits = i5;
            if (i5 <= 5) {
                this.state = 4;
            } else {
                this.state = 5;
            }
        } else if (c2 == ';' && Utils.isControlChar((char) this.control)) {
            this.state = 0;
            i2 = this.control;
        } else {
            this.state = 5;
        }
        return c2;
        return (char) i2;
    }

    @Override // java.io.PushbackReader, java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i2, int i3) throws IOException {
        boolean z2;
        char[] cArr2 = new char[8];
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            z2 = true;
            while (z2 && i4 < i3) {
                z2 = super.read(cArr2, i5, 1) == 1;
                if (z2) {
                    char cProcessChar = processChar(cArr2[i5]);
                    int i6 = this.state;
                    if (i6 == 0) {
                        if (Utils.isControlChar(cProcessChar)) {
                            cProcessChar = TokenParser.SP;
                        }
                        cArr[i2] = cProcessChar;
                        i4++;
                        i2++;
                    } else if (i6 == 5) {
                        unread(cArr2, 0, i5 + 1);
                    } else {
                        i5++;
                    }
                    i5 = 0;
                } else if (i5 > 0) {
                    break;
                }
            }
            unread(cArr2, 0, i5);
            this.state = 5;
            i5 = 0;
        }
        if (i4 > 0 || z2) {
            return i4;
        }
        return -1;
    }
}
