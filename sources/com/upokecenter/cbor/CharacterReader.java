package com.upokecenter.cbor;

import java.io.IOException;
import java.io.InputStream;
import okio.Utf8;

/* JADX INFO: loaded from: classes5.dex */
final class CharacterReader implements ICharacterInput {
    private final boolean dontSkipUtf8Bom;
    private final boolean errorThrow;
    private final int mode;
    private int offset;
    private ICharacterInput reader;
    private final String str;
    private final int strLength;
    private final IByteReader stream;

    private interface IByteReader {
        int read();
    }

    private static final class SavedState {
        private int[] saved;
        private int savedLength;

        private SavedState() {
        }

        private void Ensure(int i2) {
            int[] iArr = this.saved;
            if (iArr == null) {
                iArr = new int[this.savedLength + i2];
            }
            this.saved = iArr;
            int i3 = this.savedLength;
            if (i3 + i2 < iArr.length) {
                int[] iArr2 = new int[i2 + i3 + 4];
                System.arraycopy(iArr, 0, iArr2, 0, i3);
                this.saved = iArr2;
            }
        }

        public void AddOne(int i2) {
            Ensure(1);
            int[] iArr = this.saved;
            int i3 = this.savedLength;
            this.savedLength = i3 + 1;
            iArr[i3] = i2;
        }

        public void AddThree(int i2, int i3, int i4) {
            Ensure(3);
            int[] iArr = this.saved;
            int i5 = this.savedLength;
            iArr[i5 + 2] = i2;
            iArr[i5 + 1] = i3;
            iArr[i5] = i4;
            this.savedLength = i5 + 3;
        }

        public void AddTwo(int i2, int i3) {
            Ensure(2);
            int[] iArr = this.saved;
            int i4 = this.savedLength;
            iArr[i4 + 1] = i2;
            iArr[i4] = i3;
            this.savedLength = i4 + 2;
        }

        public int Read(IByteReader iByteReader) {
            int i2 = this.savedLength;
            if (i2 <= 0) {
                return iByteReader.read();
            }
            int[] iArr = this.saved;
            int i3 = i2 - 1;
            this.savedLength = i3;
            return iArr[i3];
        }
    }

    private static final class Utf16Reader implements ICharacterInput {
        private final boolean bigEndian;
        private final boolean errorThrow;
        private final SavedState state = new SavedState();
        private final IByteReader stream;

        public Utf16Reader(IByteReader iByteReader, boolean z2, boolean z3) {
            this.stream = iByteReader;
            this.bigEndian = z2;
            this.errorThrow = z3;
        }

        @Override // com.upokecenter.cbor.ICharacterInput
        public int Read(int[] iArr, int i2, int i3) {
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int iReadChar = ReadChar();
                if (iReadChar < 0) {
                    return i4;
                }
                iArr[i2 + i5] = iReadChar;
                i4++;
            }
            return i4;
        }

        @Override // com.upokecenter.cbor.ICharacterInput
        public int ReadChar() {
            int iRead = this.state.Read(this.stream);
            if (iRead < 0) {
                return -1;
            }
            int iRead2 = this.state.Read(this.stream);
            if (iRead2 < 0) {
                this.state.AddOne(-1);
                if (this.errorThrow) {
                    throw new IllegalStateException("Invalid UTF-16");
                }
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            int i2 = this.bigEndian ? (iRead << 8) | iRead2 : iRead | (iRead2 << 8);
            int i3 = i2 & 64512;
            if (i3 != 55296) {
                if (i3 != 56320) {
                    return i2;
                }
                if (this.errorThrow) {
                    throw new IllegalStateException("Invalid UTF-16");
                }
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            int iRead3 = this.state.Read(this.stream);
            int iRead4 = this.state.Read(this.stream);
            if (iRead3 < 0 || iRead4 < 0) {
                this.state.AddOne(-1);
                if (this.errorThrow) {
                    throw new IllegalStateException("Invalid UTF-16");
                }
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            int i4 = this.bigEndian ? (iRead3 << 8) | iRead4 : (iRead4 << 8) | iRead3;
            if ((-1) - (((-1) - 64512) | ((-1) - i4)) == 56320) {
                return (((-1) - (((-1) - i2) | ((-1) - 1023))) << 10) + 65536 + ((i4 + 1023) - (i4 | 1023));
            }
            Unget(iRead3, iRead4);
            if (this.errorThrow) {
                throw new IllegalStateException("Invalid UTF-16");
            }
            return Utf8.REPLACEMENT_CODE_POINT;
        }

        public void Unget(int i2, int i3) {
            this.state.AddTwo(i2, i3);
        }
    }

    private static final class Utf32Reader implements ICharacterInput {
        private final boolean bigEndian;
        private final boolean errorThrow;
        private final SavedState state = new SavedState();
        private final IByteReader stream;

        public Utf32Reader(IByteReader iByteReader, boolean z2, boolean z3) {
            this.stream = iByteReader;
            this.bigEndian = z2;
            this.errorThrow = z3;
        }

        @Override // com.upokecenter.cbor.ICharacterInput
        public int Read(int[] iArr, int i2, int i3) {
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int iReadChar = ReadChar();
                if (iReadChar < 0) {
                    return i4;
                }
                iArr[i2 + i5] = iReadChar;
                i4++;
            }
            return i4;
        }

        @Override // com.upokecenter.cbor.ICharacterInput
        public int ReadChar() {
            int i2;
            int iRead = this.state.Read(this.stream);
            if (iRead < 0) {
                return -1;
            }
            int iRead2 = this.state.Read(this.stream);
            int iRead3 = this.state.Read(this.stream);
            int iRead4 = this.state.Read(this.stream);
            if (iRead2 < 0 || iRead3 < 0 || iRead4 < 0) {
                this.state.AddOne(-1);
                if (this.errorThrow) {
                    throw new IllegalStateException("Invalid UTF-32");
                }
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            if (this.bigEndian) {
                int i3 = iRead << 24;
                int i4 = iRead2 << 16;
                i2 = (-1) - (((-1) - ((-1) - (((-1) - ((i3 + i4) - (i3 & i4))) & ((-1) - (iRead3 << 8))))) & ((-1) - iRead4));
            } else {
                int i5 = (-1) - (((-1) - (iRead4 << 24)) & ((-1) - (iRead3 << 16)));
                int i6 = iRead2 << 8;
                int i7 = (i5 + i6) - (i5 & i6);
                i2 = (iRead + i7) - (iRead & i7);
            }
            if (i2 >= 0 && i2 < 1114112 && (16775168 & i2) != 55296) {
                return i2;
            }
            if (this.errorThrow) {
                throw new IllegalStateException("Invalid UTF-32");
            }
            return Utf8.REPLACEMENT_CODE_POINT;
        }
    }

    private static final class Utf8Reader implements ICharacterInput {
        private final boolean errorThrow;
        private int lastChar = -1;
        private final SavedState state = new SavedState();
        private final IByteReader stream;

        public Utf8Reader(IByteReader iByteReader, boolean z2) {
            this.stream = iByteReader;
            this.errorThrow = z2;
        }

        @Override // com.upokecenter.cbor.ICharacterInput
        public int Read(int[] iArr, int i2, int i3) {
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int iReadChar = ReadChar();
                if (iReadChar < 0) {
                    return i4;
                }
                iArr[i2 + i5] = iReadChar;
                i4++;
            }
            return i4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
        
            r11.state.AddOne(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
        
            if (r11.errorThrow != false) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
        
            return okio.Utf8.REPLACEMENT_CODE_POINT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00a0, code lost:
        
            throw new java.lang.IllegalStateException("Invalid UTF-8");
         */
        @Override // com.upokecenter.cbor.ICharacterInput
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int ReadChar() {
            /*
                r11 = this;
                r2 = 0
                r3 = r2
                r1 = r3
                r4 = r1
                r10 = r4
            L5:
                int r6 = r11.lastChar
                r7 = -1
                if (r6 == r7) goto L8a
                r11.lastChar = r7
            Lc:
                java.lang.String r5 = "Invalid UTF-8"
                r9 = 65533(0xfffd, float:9.1831E-41)
                if (r6 >= 0) goto L1a
                if (r2 == 0) goto L9a
                boolean r0 = r11.errorThrow
                if (r0 != 0) goto L94
                return r9
            L1a:
                r8 = 191(0xbf, float:2.68E-43)
                r7 = 128(0x80, float:1.8E-43)
                if (r2 != 0) goto L29
                r0 = 127(0x7f, float:1.78E-43)
                int r1 = r6 + r0
                r0 = r0 | r6
                int r1 = r1 - r0
                if (r1 != r6) goto L44
                return r6
            L29:
                if (r6 < r3) goto L2d
                if (r6 <= r1) goto L37
            L2d:
                com.upokecenter.cbor.CharacterReader$SavedState r0 = r11.state
                r0.AddOne(r6)
                boolean r0 = r11.errorThrow
                if (r0 != 0) goto L9b
                return r9
            L37:
                int r4 = r4 + 1
                int r1 = r6 + (-128)
                int r0 = r2 - r4
                int r0 = r0 * 6
                int r1 = r1 << r0
                int r10 = r10 + r1
                if (r4 == r2) goto Lac
                goto L51
            L44:
                r0 = 194(0xc2, float:2.72E-43)
                if (r6 < r0) goto L54
                r0 = 223(0xdf, float:3.12E-43)
                if (r6 > r0) goto L54
                int r0 = r6 + (-192)
                int r10 = r0 << 6
                r2 = 1
            L51:
                r1 = r8
                r3 = r7
                goto L5
            L54:
                r1 = 224(0xe0, float:3.14E-43)
                if (r6 < r1) goto L70
                r0 = 239(0xef, float:3.35E-43)
                if (r6 > r0) goto L70
                if (r6 != r1) goto L6e
                r3 = 160(0xa0, float:2.24E-43)
            L60:
                r0 = 237(0xed, float:3.32E-43)
                if (r6 != r0) goto L6c
                r1 = 159(0x9f, float:2.23E-43)
            L66:
                int r0 = r6 + (-224)
                int r10 = r0 << 12
                r2 = 2
                goto L5
            L6c:
                r1 = r8
                goto L66
            L6e:
                r3 = r7
                goto L60
            L70:
                r1 = 240(0xf0, float:3.36E-43)
                if (r6 < r1) goto La1
                r0 = 244(0xf4, float:3.42E-43)
                if (r6 > r0) goto La1
                if (r6 != r1) goto L88
                r3 = 144(0x90, float:2.02E-43)
            L7c:
                if (r6 != r0) goto L86
                r1 = 143(0x8f, float:2.0E-43)
            L80:
                int r0 = r6 + (-240)
                int r10 = r0 << 18
                r2 = 3
                goto L5
            L86:
                r1 = r8
                goto L80
            L88:
                r3 = r7
                goto L7c
            L8a:
                com.upokecenter.cbor.CharacterReader$SavedState r5 = r11.state
                com.upokecenter.cbor.CharacterReader$IByteReader r0 = r11.stream
                int r6 = r5.Read(r0)
                goto Lc
            L94:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r5)
                throw r0
            L9a:
                return r7
            L9b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r5)
                throw r0
            La1:
                boolean r0 = r11.errorThrow
                if (r0 != 0) goto La6
                return r9
            La6:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r5)
                throw r0
            Lac:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CharacterReader.Utf8Reader.ReadChar():int");
        }

        public void Unget(int i2) {
            this.state.AddOne(i2);
        }

        public void UngetThree(int i2, int i3, int i4) {
            this.state.AddThree(i2, i3, i4);
        }
    }

    private static final class WrappedStream implements IByteReader {
        private final InputStream stream;

        public WrappedStream(InputStream inputStream) {
            this.stream = inputStream;
        }

        @Override // com.upokecenter.cbor.CharacterReader.IByteReader
        public int read() {
            try {
                return this.stream.read();
            } catch (IOException e2) {
                throw new IllegalStateException(e2.getMessage(), e2);
            }
        }
    }

    public CharacterReader(InputStream inputStream) {
        this(inputStream, 0, false);
    }

    public CharacterReader(InputStream inputStream, int i2) {
        this(inputStream, i2, false, false);
    }

    public CharacterReader(InputStream inputStream, int i2, boolean z2) {
        this(inputStream, i2, z2, false);
    }

    public CharacterReader(InputStream inputStream, int i2, boolean z2, boolean z3) {
        if (inputStream == null) {
            throw new NullPointerException("stream");
        }
        this.stream = new WrappedStream(inputStream);
        this.mode = i2;
        this.errorThrow = z2;
        this.dontSkipUtf8Bom = z3;
        this.str = "";
        this.strLength = -1;
    }

    public CharacterReader(String str) {
        this(str, false, false);
    }

    public CharacterReader(String str, int i2, int i3) {
        this(str, i2, i3, false, false);
    }

    public CharacterReader(String str, int i2, int i3, boolean z2, boolean z3) {
        if (str == null) {
            throw new NullPointerException("str");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("offset(" + i2 + ") is less than 0");
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("offset(" + i2 + ") is more than " + str.length());
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("length(" + i3 + ") is less than 0");
        }
        if (i3 > str.length()) {
            throw new IllegalArgumentException("length(" + i3 + ") is more than " + str.length());
        }
        if (str.length() - i2 < i3) {
            throw new IllegalArgumentException("str's length minus " + i2 + "(" + (str.length() - i2) + ") is less than " + i3);
        }
        this.strLength = i3;
        this.offset = (z2 && i3 > 0 && str.charAt(i2) == 65279) ? i2 + 1 : 0;
        this.str = str;
        this.errorThrow = z3;
        this.mode = -1;
        this.dontSkipUtf8Bom = false;
        this.stream = null;
    }

    public CharacterReader(String str, boolean z2) {
        this(str, z2, false);
    }

    public CharacterReader(String str, boolean z2, boolean z3) {
        if (str == null) {
            throw new NullPointerException("str");
        }
        int length = str.length();
        this.strLength = length;
        this.offset = (z2 && length > 0 && str.charAt(0) == 65279) ? 1 : 0;
        this.str = str;
        this.errorThrow = z3;
        this.mode = -1;
        this.dontSkipUtf8Bom = false;
        this.stream = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int DetectUnicodeEncoding() {
        /*
            r5 = this;
            int r2 = r5.mode
            com.upokecenter.cbor.CharacterReader$IByteReader r0 = r5.stream
            int r4 = r0.read()
            r1 = -1
            if (r4 >= 0) goto Lc
            return r1
        Lc:
            r3 = 65279(0xfeff, float:9.1475E-41)
            if (r2 == 0) goto L48
            r0 = 1
            if (r2 == r0) goto L41
            r0 = 2
            if (r2 == r0) goto L3a
            r0 = 3
            if (r2 == r0) goto L41
            r0 = 4
            if (r2 == r0) goto L3a
        L1d:
            com.upokecenter.cbor.CharacterReader$Utf8Reader r2 = new com.upokecenter.cbor.CharacterReader$Utf8Reader
            com.upokecenter.cbor.CharacterReader$IByteReader r1 = r5.stream
            boolean r0 = r5.errorThrow
            r2.<init>(r1, r0)
            r5.reader = r2
            r2.Unget(r4)
            int r1 = r2.ReadChar()
            boolean r0 = r5.dontSkipUtf8Bom
            if (r0 != 0) goto L39
            if (r1 != r3) goto L39
            int r1 = r2.ReadChar()
        L39:
            return r1
        L3a:
            int r0 = r5.DetectUtf8Or16Or32(r4)
            if (r0 < r1) goto L1d
            return r0
        L41:
            int r0 = r5.DetectUtf8OrUtf16(r4)
            if (r0 < r1) goto L1d
            return r0
        L48:
            com.upokecenter.cbor.CharacterReader$Utf8Reader r2 = new com.upokecenter.cbor.CharacterReader$Utf8Reader
            com.upokecenter.cbor.CharacterReader$IByteReader r1 = r5.stream
            boolean r0 = r5.errorThrow
            r2.<init>(r1, r0)
            r5.reader = r2
            r2.Unget(r4)
            int r1 = r2.ReadChar()
            if (r1 != r3) goto L64
            boolean r0 = r5.dontSkipUtf8Bom
            if (r0 != 0) goto L64
            int r1 = r2.ReadChar()
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CharacterReader.DetectUnicodeEncoding():int");
    }

    private int DetectUtf8Or16Or32(int i2) {
        if (i2 == 255 || i2 == 254) {
            int i3 = this.stream.read();
            boolean z2 = i2 == 254;
            if (i3 != (z2 ? 255 : 254)) {
                if (this.errorThrow) {
                    throw new IllegalStateException("Invalid Unicode stream");
                }
                Utf8Reader utf8Reader = new Utf8Reader(this.stream, this.errorThrow);
                utf8Reader.Unget(i3);
                this.reader = utf8Reader;
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            int i4 = this.stream.read();
            int i5 = this.stream.read();
            if (!z2 && i4 == 0 && i5 == 0) {
                Utf32Reader utf32Reader = new Utf32Reader(this.stream, false, this.errorThrow);
                this.reader = utf32Reader;
                return utf32Reader.ReadChar();
            }
            Utf16Reader utf16Reader = new Utf16Reader(this.stream, z2, this.errorThrow);
            utf16Reader.Unget(i4, i5);
            this.reader = utf16Reader;
            return utf16Reader.ReadChar();
        }
        if (i2 == 0 && this.mode == 4) {
            int i6 = this.stream.read();
            int i7 = this.stream.read();
            int i8 = this.stream.read();
            if (i6 == 0 && ((i7 == 254 && i8 == 255) || (i7 == 0 && i8 >= 1 && i8 <= 127))) {
                Utf32Reader utf32Reader2 = new Utf32Reader(this.stream, true, this.errorThrow);
                this.reader = utf32Reader2;
                return i7 == 0 ? i8 : utf32Reader2.ReadChar();
            }
            Utf8Reader utf8Reader2 = new Utf8Reader(this.stream, this.errorThrow);
            utf8Reader2.UngetThree(i6, i7, i8);
            this.reader = utf8Reader2;
            return i2;
        }
        if (this.mode != 2) {
            return -2;
        }
        if (i2 >= 1 && i2 <= 127) {
            int i9 = this.stream.read();
            if (i9 != 0) {
                Utf8Reader utf8Reader3 = new Utf8Reader(this.stream, this.errorThrow);
                utf8Reader3.Unget(i9);
                this.reader = utf8Reader3;
                return i2;
            }
            int i10 = this.stream.read();
            int i11 = this.stream.read();
            if (i10 == 0 && i11 == 0) {
                this.reader = new Utf32Reader(this.stream, false, this.errorThrow);
                return i2;
            }
            Utf16Reader utf16Reader2 = new Utf16Reader(this.stream, false, this.errorThrow);
            utf16Reader2.Unget(i10, i11);
            this.reader = utf16Reader2;
            return i2;
        }
        if (i2 != 0) {
            return -2;
        }
        int i12 = this.stream.read();
        if (i12 >= 1 && i12 <= 127) {
            this.reader = new Utf16Reader(this.stream, true, this.errorThrow);
            return i12;
        }
        if (i12 != 0) {
            Utf8Reader utf8Reader4 = new Utf8Reader(this.stream, this.errorThrow);
            utf8Reader4.Unget(i12);
            this.reader = utf8Reader4;
            return i2;
        }
        int i13 = this.stream.read();
        int i14 = this.stream.read();
        if (i13 == 0 && i14 >= 1 && i14 <= 127) {
            this.reader = new Utf32Reader(this.stream, true, this.errorThrow);
            return i14;
        }
        if (i13 == 254 && i14 == 255) {
            Utf32Reader utf32Reader3 = new Utf32Reader(this.stream, true, this.errorThrow);
            this.reader = utf32Reader3;
            return utf32Reader3.ReadChar();
        }
        Utf8Reader utf8Reader5 = new Utf8Reader(this.stream, this.errorThrow);
        utf8Reader5.UngetThree(i12, i13, i14);
        this.reader = utf8Reader5;
        return i2;
    }

    private int DetectUtf8OrUtf16(int i2) {
        int i3 = this.mode;
        if (i2 == 255 || i2 == 254) {
            int i4 = this.stream.read();
            boolean z2 = i2 == 254;
            if (i4 == (z2 ? 255 : 254)) {
                Utf16Reader utf16Reader = new Utf16Reader(this.stream, z2, this.errorThrow);
                this.reader = utf16Reader;
                return utf16Reader.ReadChar();
            }
            if (this.errorThrow) {
                throw new IllegalStateException("Invalid Unicode stream");
            }
            Utf8Reader utf8Reader = new Utf8Reader(this.stream, this.errorThrow);
            utf8Reader.Unget(i4);
            this.reader = utf8Reader;
            return Utf8.REPLACEMENT_CODE_POINT;
        }
        if (i3 != 1) {
            return -2;
        }
        if (i2 >= 1 && i2 <= 127) {
            int i5 = this.stream.read();
            if (i5 == 0) {
                this.reader = new Utf16Reader(this.stream, false, this.errorThrow);
            } else {
                Utf8Reader utf8Reader2 = new Utf8Reader(this.stream, this.errorThrow);
                utf8Reader2.Unget(i5);
                this.reader = utf8Reader2;
            }
            return i2;
        }
        if (i2 != 0) {
            return -2;
        }
        int i6 = this.stream.read();
        if (i6 >= 1 && i6 <= 127) {
            this.reader = new Utf16Reader(this.stream, true, this.errorThrow);
            return i6;
        }
        Utf8Reader utf8Reader3 = new Utf8Reader(this.stream, this.errorThrow);
        utf8Reader3.Unget(i6);
        this.reader = utf8Reader3;
        return i2;
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
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int iReadChar = ReadChar();
            if (iReadChar < 0) {
                return i4;
            }
            iArr[i2 + i5] = iReadChar;
            i4++;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    @Override // com.upokecenter.cbor.ICharacterInput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int ReadChar() {
        /*
            r5 = this;
            com.upokecenter.cbor.ICharacterInput r0 = r5.reader
            if (r0 == 0) goto L9
            int r0 = r0.ReadChar()
            return r0
        L9:
            com.upokecenter.cbor.CharacterReader$IByteReader r0 = r5.stream
            if (r0 == 0) goto L12
            int r0 = r5.DetectUnicodeEncoding()
            return r0
        L12:
            int r1 = r5.offset
            int r0 = r5.strLength
            if (r1 >= r0) goto L91
            java.lang.String r0 = r5.str
            char r2 = r0.charAt(r1)
        L1e:
            r0 = 64512(0xfc00, float:9.04E-41)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r0 != r3) goto L80
            int r4 = r5.offset
            int r1 = r4 + 1
            int r0 = r5.strLength
            if (r1 >= r0) goto L80
            java.lang.String r1 = r5.str
            int r0 = r4 + 1
            char r1 = r1.charAt(r0)
            r0 = 56320(0xdc00, float:7.8921E-41)
            if (r1 < r0) goto L80
            java.lang.String r1 = r5.str
            int r0 = r5.offset
            int r0 = r0 + 1
            char r1 = r1.charAt(r0)
            r0 = 57343(0xdfff, float:8.0355E-41)
            if (r1 > r0) goto L80
            r0 = 1023(0x3ff, float:1.434E-42)
            int r1 = (-1) - r2
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            int r2 = r0 << 10
            r0 = 65536(0x10000, float:9.1835E-41)
            int r2 = r2 + r0
            java.lang.String r1 = r5.str
            int r0 = r5.offset
            int r0 = r0 + 1
            char r1 = r1.charAt(r0)
            r0 = 1023(0x3ff, float:1.434E-42)
            int r1 = (-1) - r1
            int r0 = (-1) - r0
            r1 = r1 | r0
            int r0 = (-1) - r1
            int r2 = r2 + r0
            int r0 = r5.offset
            int r0 = r0 + 1
            r5.offset = r0
        L79:
            int r0 = r5.offset
            int r0 = r0 + 1
            r5.offset = r0
            return r2
        L80:
            r1 = 63488(0xf800, float:8.8966E-41)
            int r0 = r1 + r2
            r1 = r1 | r2
            int r0 = r0 - r1
            if (r0 != r3) goto L79
            boolean r0 = r5.errorThrow
            if (r0 != 0) goto L93
            r2 = 65533(0xfffd, float:9.1831E-41)
            goto L79
        L91:
            r2 = -1
            goto L1e
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unpaired surrogate code point"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.upokecenter.cbor.CharacterReader.ReadChar():int");
    }
}
