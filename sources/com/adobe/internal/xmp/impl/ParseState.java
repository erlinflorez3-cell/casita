package com.adobe.internal.xmp.impl;

import com.adobe.internal.xmp.XMPException;

/* JADX INFO: loaded from: classes4.dex */
class ParseState {
    private int pos = 0;
    private String str;

    public ParseState(String str) {
        this.str = str;
    }

    public char ch() {
        if (this.pos < this.str.length()) {
            return this.str.charAt(this.pos);
        }
        return (char) 0;
    }

    public char ch(int i2) {
        if (i2 < this.str.length()) {
            return this.str.charAt(i2);
        }
        return (char) 0;
    }

    public int gatherInt(String str, int i2) throws XMPException {
        char cCh = ch(this.pos);
        int i3 = 0;
        boolean z2 = false;
        while ('0' <= cCh && cCh <= '9') {
            i3 = (i3 * 10) + (cCh - '0');
            z2 = true;
            int i4 = this.pos + 1;
            this.pos = i4;
            cCh = ch(i4);
        }
        if (!z2) {
            throw new XMPException(str, 5);
        }
        if (i3 > i2) {
            return i2;
        }
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public boolean hasNext() {
        return this.pos < this.str.length();
    }

    public int length() {
        return this.str.length();
    }

    public int pos() {
        return this.pos;
    }

    public void skip() {
        this.pos++;
    }
}
