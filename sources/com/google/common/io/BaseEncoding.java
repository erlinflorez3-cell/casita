package com.google.common.io;

import com.google.common.base.Ascii;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
public abstract class BaseEncoding {
    private static final BaseEncoding BASE64 = new Base64Encoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final BaseEncoding BASE64_URL = new Base64Encoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final BaseEncoding BASE32 = new StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final BaseEncoding BASE32_HEX = new StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final BaseEncoding BASE16 = new Base16Encoding("base16()", "0123456789ABCDEF");

    /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$1 */
    class AnonymousClass1 extends ByteSink {
        final /* synthetic */ CharSink val$encodedSink;

        AnonymousClass1(final CharSink val$encodedSink) {
            val$encodedSink = val$encodedSink;
        }

        @Override // com.google.common.io.ByteSink
        public OutputStream openStream() throws IOException {
            return BaseEncoding.this.encodingStream(val$encodedSink.openStream());
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$2 */
    class AnonymousClass2 extends ByteSource {
        final /* synthetic */ CharSource val$encodedSource;

        AnonymousClass2(final CharSource val$encodedSource) {
            val$encodedSource = val$encodedSource;
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
            return BaseEncoding.this.decodingStream(val$encodedSource.openStream());
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$3 */
    class AnonymousClass3 extends Reader {
        final /* synthetic */ Reader val$delegate;
        final /* synthetic */ String val$toIgnore;

        AnonymousClass3(final Reader val$delegate, final String val$toIgnore) {
            val$delegate = val$delegate;
            val$toIgnore = val$toIgnore;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            val$delegate.close();
        }

        @Override // java.io.Reader
        public int read() throws IOException {
            int i2;
            do {
                i2 = val$delegate.read();
                if (i2 == -1) {
                    break;
                }
            } while (val$toIgnore.indexOf((char) i2) >= 0);
            return i2;
        }

        @Override // java.io.Reader
        public int read(char[] cbuf, int off, int len) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$4 */
    class AnonymousClass4 implements Appendable {
        int charsUntilSeparator;
        final /* synthetic */ int val$afterEveryChars;
        final /* synthetic */ Appendable val$delegate;
        final /* synthetic */ String val$separator;

        AnonymousClass4(final int val$afterEveryChars, final Appendable val$delegate, final String val$separator) {
            this.val$afterEveryChars = val$afterEveryChars;
            this.val$delegate = val$delegate;
            this.val$separator = val$separator;
            this.charsUntilSeparator = val$afterEveryChars;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c2) throws IOException {
            if (this.charsUntilSeparator == 0) {
                this.val$delegate.append(this.val$separator);
                this.charsUntilSeparator = this.val$afterEveryChars;
            }
            this.val$delegate.append(c2);
            this.charsUntilSeparator--;
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@CheckForNull CharSequence chars) {
            throw new UnsupportedOperationException();
        }

        @Override // java.lang.Appendable
        public Appendable append(@CheckForNull CharSequence chars, int off, int len) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$5 */
    class AnonymousClass5 extends Writer {
        final /* synthetic */ Writer val$delegate;
        final /* synthetic */ Appendable val$separatingAppendable;

        AnonymousClass5(final Appendable val$separatingAppendable, final Writer val$delegate) {
            val$separatingAppendable = val$separatingAppendable;
            val$delegate = val$delegate;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            val$delegate.close();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            val$delegate.flush();
        }

        @Override // java.io.Writer
        public void write(int c2) throws IOException {
            val$separatingAppendable.append((char) c2);
        }

        @Override // java.io.Writer
        public void write(char[] chars, int off, int len) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    private static final class Alphabet {
        final int bitsPerChar;
        final int bytesPerChunk;
        private final char[] chars;
        final int charsPerChunk;
        private final byte[] decodabet;
        private final boolean ignoreCase;
        final int mask;
        private final String name;
        private final boolean[] validPadding;

        Alphabet(String name, char[] chars) {
            this(name, chars, decodabetFor(chars), false);
        }

        private Alphabet(String name, char[] chars, byte[] decodabet, boolean ignoreCase) {
            this.name = (String) Preconditions.checkNotNull(name);
            this.chars = (char[]) Preconditions.checkNotNull(chars);
            try {
                int iLog2 = IntMath.log2(chars.length, RoundingMode.UNNECESSARY);
                this.bitsPerChar = iLog2;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iLog2);
                int i2 = 1 << (3 - iNumberOfTrailingZeros);
                this.charsPerChunk = i2;
                this.bytesPerChunk = iLog2 >> iNumberOfTrailingZeros;
                this.mask = chars.length - 1;
                this.decodabet = decodabet;
                boolean[] zArr = new boolean[i2];
                for (int i3 = 0; i3 < this.bytesPerChunk; i3++) {
                    zArr[IntMath.divide(i3 * 8, this.bitsPerChar, RoundingMode.CEILING)] = true;
                }
                this.validPadding = zArr;
                this.ignoreCase = ignoreCase;
            } catch (ArithmeticException e2) {
                throw new IllegalArgumentException("Illegal alphabet length " + chars.length, e2);
            }
        }

        private static byte[] decodabetFor(char[] chars) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i2 = 0; i2 < chars.length; i2++) {
                char c2 = chars[i2];
                boolean z2 = true;
                Preconditions.checkArgument(c2 < 128, "Non-ASCII character: %s", c2);
                if (bArr[c2] != -1) {
                    z2 = false;
                }
                Preconditions.checkArgument(z2, "Duplicate character: %s", c2);
                bArr[c2] = (byte) i2;
            }
            return bArr;
        }

        private boolean hasLowerCase() {
            for (char c2 : this.chars) {
                if (Ascii.isLowerCase(c2)) {
                    return true;
                }
            }
            return false;
        }

        private boolean hasUpperCase() {
            for (char c2 : this.chars) {
                if (Ascii.isUpperCase(c2)) {
                    return true;
                }
            }
            return false;
        }

        boolean canDecode(char ch) {
            return ch <= 127 && this.decodabet[ch] != -1;
        }

        int decode(char ch) throws DecodingException {
            if (ch > 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(ch));
            }
            byte b2 = this.decodabet[ch];
            if (b2 != -1) {
                return b2;
            }
            if (ch <= ' ' || ch == 127) {
                throw new DecodingException("Unrecognized character: 0x" + Integer.toHexString(ch));
            }
            throw new DecodingException("Unrecognized character: " + ch);
        }

        char encode(int bits) {
            return this.chars[bits];
        }

        public boolean equals(@CheckForNull Object other) {
            if (!(other instanceof Alphabet)) {
                return false;
            }
            Alphabet alphabet = (Alphabet) other;
            return this.ignoreCase == alphabet.ignoreCase && Arrays.equals(this.chars, alphabet.chars);
        }

        public int hashCode() {
            return Arrays.hashCode(this.chars) + (this.ignoreCase ? 1231 : 1237);
        }

        Alphabet ignoreCase() {
            if (this.ignoreCase) {
                return this;
            }
            byte[] bArr = this.decodabet;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            int i2 = 65;
            while (true) {
                if (i2 > 90) {
                    return new Alphabet(this.name + ".ignoreCase()", this.chars, bArrCopyOf, true);
                }
                int i3 = (-1) - (((-1) - i2) & ((-1) - 32));
                byte[] bArr2 = this.decodabet;
                byte b2 = bArr2[i2];
                byte b3 = bArr2[i3];
                if (b2 == -1) {
                    bArrCopyOf[i2] = b3;
                } else {
                    Preconditions.checkState(b3 == -1, "Can't ignoreCase() since '%s' and '%s' encode different values", (char) i2, (char) i3);
                    bArrCopyOf[i3] = b2;
                }
                i2++;
            }
        }

        boolean isValidPaddingStartPosition(int index) {
            return this.validPadding[index % this.charsPerChunk];
        }

        Alphabet lowerCase() {
            if (!hasUpperCase()) {
                return this;
            }
            Preconditions.checkState(!hasLowerCase(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.chars.length];
            int i2 = 0;
            while (true) {
                char[] cArr2 = this.chars;
                if (i2 >= cArr2.length) {
                    break;
                }
                cArr[i2] = Ascii.toLowerCase(cArr2[i2]);
                i2++;
            }
            Alphabet alphabet = new Alphabet(this.name + ".lowerCase()", cArr);
            return this.ignoreCase ? alphabet.ignoreCase() : alphabet;
        }

        public boolean matches(char c2) {
            byte[] bArr = this.decodabet;
            return c2 < bArr.length && bArr[c2] != -1;
        }

        public String toString() {
            return this.name;
        }

        Alphabet upperCase() {
            if (!hasLowerCase()) {
                return this;
            }
            Preconditions.checkState(!hasUpperCase(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.chars.length];
            int i2 = 0;
            while (true) {
                char[] cArr2 = this.chars;
                if (i2 >= cArr2.length) {
                    break;
                }
                cArr[i2] = Ascii.toUpperCase(cArr2[i2]);
                i2++;
            }
            Alphabet alphabet = new Alphabet(this.name + ".upperCase()", cArr);
            return this.ignoreCase ? alphabet.ignoreCase() : alphabet;
        }
    }

    static final class Base16Encoding extends StandardBaseEncoding {
        final char[] encoding;

        private Base16Encoding(Alphabet alphabet) {
            super(alphabet, null);
            this.encoding = new char[512];
            Preconditions.checkArgument(alphabet.chars.length == 16);
            for (int i2 = 0; i2 < 256; i2++) {
                this.encoding[i2] = alphabet.encode(i2 >>> 4);
                this.encoding[(-1) - (((-1) - i2) & ((-1) - 256))] = alphabet.encode((i2 + 15) - (15 | i2));
            }
        }

        Base16Encoding(String name, String alphabetChars) {
            this(new Alphabet(name, alphabetChars.toCharArray()));
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        int decodeTo(byte[] target, CharSequence chars) throws DecodingException {
            Preconditions.checkNotNull(target);
            if (chars.length() % 2 == 1) {
                throw new DecodingException("Invalid input length " + chars.length());
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < chars.length()) {
                target[i3] = (byte) ((-1) - (((-1) - (this.alphabet.decode(chars.charAt(i2)) << 4)) & ((-1) - this.alphabet.decode(chars.charAt(i2 + 1)))));
                i2 += 2;
                i3++;
            }
            return i3;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        void encodeTo(Appendable target, byte[] bytes, int off, int len) throws IOException {
            Preconditions.checkNotNull(target);
            Preconditions.checkPositionIndexes(off, off + len, bytes.length);
            for (int i2 = 0; i2 < len; i2++) {
                int i3 = bytes[off + i2] & 255;
                target.append(this.encoding[i3]);
                target.append(this.encoding[(-1) - (((-1) - i3) & ((-1) - 256))]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        BaseEncoding newInstance(Alphabet alphabet, @CheckForNull Character paddingChar) {
            return new Base16Encoding(alphabet);
        }
    }

    static final class Base64Encoding extends StandardBaseEncoding {
        private Base64Encoding(Alphabet alphabet, @CheckForNull Character paddingChar) {
            super(alphabet, paddingChar);
            Preconditions.checkArgument(alphabet.chars.length == 64);
        }

        Base64Encoding(String name, String alphabetChars, @CheckForNull Character paddingChar) {
            this(new Alphabet(name, alphabetChars.toCharArray()), paddingChar);
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        int decodeTo(byte[] target, CharSequence chars) throws DecodingException {
            Preconditions.checkNotNull(target);
            CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(chars);
            if (!this.alphabet.isValidPaddingStartPosition(charSequenceTrimTrailingPadding.length())) {
                throw new DecodingException("Invalid input length " + charSequenceTrimTrailingPadding.length());
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < charSequenceTrimTrailingPadding.length()) {
                int i4 = i2 + 2;
                int iDecode = (-1) - (((-1) - (this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i2)) << 18)) & ((-1) - (this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i2 + 1)) << 12)));
                int i5 = i3 + 1;
                target[i3] = (byte) (iDecode >>> 16);
                if (i4 < charSequenceTrimTrailingPadding.length()) {
                    int i6 = i2 + 3;
                    int iDecode2 = this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i4)) << 6;
                    int i7 = (iDecode + iDecode2) - (iDecode & iDecode2);
                    int i8 = i3 + 2;
                    target[i5] = (byte) ((i7 >>> 8) & 255);
                    if (i6 < charSequenceTrimTrailingPadding.length()) {
                        i2 += 4;
                        i3 += 3;
                        target[i8] = (byte) ((-1) - (((-1) - (i7 | this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i6)))) | ((-1) - 255)));
                    } else {
                        i3 = i8;
                        i2 = i6;
                    }
                } else {
                    i3 = i5;
                    i2 = i4;
                }
            }
            return i3;
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        void encodeTo(Appendable target, byte[] bytes, int off, int len) throws IOException {
            Preconditions.checkNotNull(target);
            int i2 = off + len;
            Preconditions.checkPositionIndexes(off, i2, bytes.length);
            while (len >= 3) {
                int i3 = off + 2;
                int i4 = ((bytes[off + 1] & 255) << 8) | (((-1) - (((-1) - bytes[off]) | ((-1) - 255))) << 16);
                off += 3;
                int i5 = bytes[i3] & 255;
                int i6 = (i4 + i5) - (i4 & i5);
                target.append(this.alphabet.encode(i6 >>> 18));
                target.append(this.alphabet.encode((-1) - (((-1) - (i6 >>> 12)) | ((-1) - 63))));
                int i7 = i6 >>> 6;
                target.append(this.alphabet.encode((i7 + 63) - (i7 | 63)));
                target.append(this.alphabet.encode(i6 & 63));
                len -= 3;
            }
            if (off < i2) {
                encodeChunkTo(target, bytes, off, i2 - off);
            }
        }

        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        BaseEncoding newInstance(Alphabet alphabet, @CheckForNull Character paddingChar) {
            return new Base64Encoding(alphabet, paddingChar);
        }
    }

    public static final class DecodingException extends IOException {
        DecodingException(String message) {
            super(message);
        }

        DecodingException(Throwable cause) {
            super(cause);
        }
    }

    static final class SeparatedBaseEncoding extends BaseEncoding {
        private final int afterEveryChars;
        private final BaseEncoding delegate;
        private final String separator;

        SeparatedBaseEncoding(BaseEncoding delegate, String separator, int afterEveryChars) {
            this.delegate = (BaseEncoding) Preconditions.checkNotNull(delegate);
            this.separator = (String) Preconditions.checkNotNull(separator);
            this.afterEveryChars = afterEveryChars;
            Preconditions.checkArgument(afterEveryChars > 0, "Cannot add a separator after every %s chars", afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(CharSequence chars) {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < chars.length(); i2++) {
                char cCharAt = chars.charAt(i2);
                if (this.separator.indexOf(cCharAt) < 0) {
                    sb.append(cCharAt);
                }
            }
            return this.delegate.canDecode(sb);
        }

        @Override // com.google.common.io.BaseEncoding
        int decodeTo(byte[] target, CharSequence chars) throws DecodingException {
            StringBuilder sb = new StringBuilder(chars.length());
            for (int i2 = 0; i2 < chars.length(); i2++) {
                char cCharAt = chars.charAt(i2);
                if (this.separator.indexOf(cCharAt) < 0) {
                    sb.append(cCharAt);
                }
            }
            return this.delegate.decodeTo(target, sb);
        }

        @Override // com.google.common.io.BaseEncoding
        public InputStream decodingStream(Reader reader) {
            return this.delegate.decodingStream(ignoringReader(reader, this.separator));
        }

        @Override // com.google.common.io.BaseEncoding
        void encodeTo(Appendable target, byte[] bytes, int off, int len) throws IOException {
            this.delegate.encodeTo(separatingAppendable(target, this.separator, this.afterEveryChars), bytes, off, len);
        }

        @Override // com.google.common.io.BaseEncoding
        public OutputStream encodingStream(Writer output) {
            return this.delegate.encodingStream(separatingWriter(output, this.separator, this.afterEveryChars));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding ignoreCase() {
            return this.delegate.ignoreCase().withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding lowerCase() {
            return this.delegate.lowerCase().withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        int maxDecodedSize(int chars) {
            return this.delegate.maxDecodedSize(chars);
        }

        @Override // com.google.common.io.BaseEncoding
        int maxEncodedSize(int bytes) {
            int iMaxEncodedSize = this.delegate.maxEncodedSize(bytes);
            return iMaxEncodedSize + (this.separator.length() * IntMath.divide(Math.max(0, iMaxEncodedSize - 1), this.afterEveryChars, RoundingMode.FLOOR));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding omitPadding() {
            return this.delegate.omitPadding().withSeparator(this.separator, this.afterEveryChars);
        }

        public String toString() {
            return this.delegate + ".withSeparator(\"" + this.separator + "\", " + this.afterEveryChars + ")";
        }

        @Override // com.google.common.io.BaseEncoding
        CharSequence trimTrailingPadding(CharSequence chars) {
            return this.delegate.trimTrailingPadding(chars);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding upperCase() {
            return this.delegate.upperCase().withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withPadChar(char padChar) {
            return this.delegate.withPadChar(padChar).withSeparator(this.separator, this.afterEveryChars);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withSeparator(String separator, int afterEveryChars) {
            throw new UnsupportedOperationException("Already have a separator");
        }
    }

    static class StandardBaseEncoding extends BaseEncoding {
        final Alphabet alphabet;

        @CheckForNull
        @LazyInit
        private volatile BaseEncoding ignoreCase;

        @CheckForNull
        @LazyInit
        private volatile BaseEncoding lowerCase;

        @CheckForNull
        final Character paddingChar;

        @CheckForNull
        @LazyInit
        private volatile BaseEncoding upperCase;

        /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$StandardBaseEncoding$1 */
        class AnonymousClass1 extends OutputStream {
            final /* synthetic */ Writer val$out;
            int bitBuffer = 0;
            int bitBufferLength = 0;
            int writtenChars = 0;

            AnonymousClass1(final Writer val$out) {
                val$out = val$out;
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (this.bitBufferLength > 0) {
                    val$out.write(StandardBaseEncoding.this.alphabet.encode((this.bitBuffer << (StandardBaseEncoding.this.alphabet.bitsPerChar - this.bitBufferLength)) & StandardBaseEncoding.this.alphabet.mask));
                    this.writtenChars++;
                    if (StandardBaseEncoding.this.paddingChar != null) {
                        while (this.writtenChars % StandardBaseEncoding.this.alphabet.charsPerChunk != 0) {
                            val$out.write(StandardBaseEncoding.this.paddingChar.charValue());
                            this.writtenChars++;
                        }
                    }
                }
                val$out.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                val$out.flush();
            }

            @Override // java.io.OutputStream
            public void write(int b2) throws IOException {
                int i2 = this.bitBuffer << 8;
                int i3 = (b2 + 255) - (b2 | 255);
                this.bitBuffer = (i3 + i2) - (i3 & i2);
                this.bitBufferLength += 8;
                while (this.bitBufferLength >= StandardBaseEncoding.this.alphabet.bitsPerChar) {
                    val$out.write(StandardBaseEncoding.this.alphabet.encode((this.bitBuffer >> (this.bitBufferLength - StandardBaseEncoding.this.alphabet.bitsPerChar)) & StandardBaseEncoding.this.alphabet.mask));
                    this.writtenChars++;
                    this.bitBufferLength -= StandardBaseEncoding.this.alphabet.bitsPerChar;
                }
            }
        }

        /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$StandardBaseEncoding$2 */
        class AnonymousClass2 extends InputStream {
            final /* synthetic */ Reader val$reader;
            int bitBuffer = 0;
            int bitBufferLength = 0;
            int readChars = 0;
            boolean hitPadding = false;

            AnonymousClass2(final Reader val$reader) {
                val$reader = val$reader;
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                val$reader.close();
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                while (true) {
                    int i2 = val$reader.read();
                    if (i2 != -1) {
                        this.readChars++;
                        char c2 = (char) i2;
                        if (StandardBaseEncoding.this.paddingChar != null && StandardBaseEncoding.this.paddingChar.charValue() == c2) {
                            if (!this.hitPadding && (this.readChars == 1 || !StandardBaseEncoding.this.alphabet.isValidPaddingStartPosition(this.readChars - 1))) {
                                break;
                            }
                            this.hitPadding = true;
                        } else {
                            if (this.hitPadding) {
                                throw new DecodingException("Expected padding character but found '" + c2 + "' at index " + this.readChars);
                            }
                            int i3 = this.bitBuffer << StandardBaseEncoding.this.alphabet.bitsPerChar;
                            this.bitBuffer = i3;
                            this.bitBuffer = (-1) - (((-1) - StandardBaseEncoding.this.alphabet.decode(c2)) & ((-1) - i3));
                            int i4 = this.bitBufferLength + StandardBaseEncoding.this.alphabet.bitsPerChar;
                            this.bitBufferLength = i4;
                            if (i4 >= 8) {
                                int i5 = i4 - 8;
                                this.bitBufferLength = i5;
                                return (-1) - (((-1) - (this.bitBuffer >> i5)) | ((-1) - 255));
                            }
                        }
                    } else {
                        if (this.hitPadding || StandardBaseEncoding.this.alphabet.isValidPaddingStartPosition(this.readChars)) {
                            return -1;
                        }
                        throw new DecodingException("Invalid input length " + this.readChars);
                    }
                }
                throw new DecodingException("Padding cannot start at index " + this.readChars);
            }

            @Override // java.io.InputStream
            public int read(byte[] buf, int off, int len) throws IOException {
                int i2 = len + off;
                Preconditions.checkPositionIndexes(off, i2, buf.length);
                int i3 = off;
                while (i3 < i2) {
                    int i4 = read();
                    if (i4 == -1) {
                        int i5 = i3 - off;
                        if (i5 == 0) {
                            return -1;
                        }
                        return i5;
                    }
                    buf[i3] = (byte) i4;
                    i3++;
                }
                return i3 - off;
            }
        }

        StandardBaseEncoding(Alphabet alphabet, @CheckForNull Character paddingChar) {
            this.alphabet = (Alphabet) Preconditions.checkNotNull(alphabet);
            Preconditions.checkArgument(paddingChar == null || !alphabet.matches(paddingChar.charValue()), "Padding character %s was already in alphabet", paddingChar);
            this.paddingChar = paddingChar;
        }

        StandardBaseEncoding(String name, String alphabetChars, @CheckForNull Character paddingChar) {
            this(new Alphabet(name, alphabetChars.toCharArray()), paddingChar);
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(CharSequence chars) {
            Preconditions.checkNotNull(chars);
            CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(chars);
            if (!this.alphabet.isValidPaddingStartPosition(charSequenceTrimTrailingPadding.length())) {
                return false;
            }
            for (int i2 = 0; i2 < charSequenceTrimTrailingPadding.length(); i2++) {
                if (!this.alphabet.canDecode(charSequenceTrimTrailingPadding.charAt(i2))) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.BaseEncoding
        int decodeTo(byte[] target, CharSequence chars) throws DecodingException {
            Preconditions.checkNotNull(target);
            CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(chars);
            if (!this.alphabet.isValidPaddingStartPosition(charSequenceTrimTrailingPadding.length())) {
                throw new DecodingException("Invalid input length " + charSequenceTrimTrailingPadding.length());
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < charSequenceTrimTrailingPadding.length()) {
                long j2 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < this.alphabet.charsPerChunk; i5++) {
                    j2 <<= this.alphabet.bitsPerChar;
                    if (i2 + i5 < charSequenceTrimTrailingPadding.length()) {
                        int i6 = i4 + 1;
                        long jDecode = this.alphabet.decode(charSequenceTrimTrailingPadding.charAt(i4 + i2));
                        j2 = (j2 + jDecode) - (j2 & jDecode);
                        i4 = i6;
                    }
                }
                int i7 = (this.alphabet.bytesPerChunk * 8) - (i4 * this.alphabet.bitsPerChar);
                int i8 = (this.alphabet.bytesPerChunk - 1) * 8;
                while (i8 >= i7) {
                    long j3 = j2 >>> i8;
                    target[i3] = (byte) ((j3 + 255) - (j3 | 255));
                    i8 -= 8;
                    i3++;
                }
                i2 += this.alphabet.charsPerChunk;
            }
            return i3;
        }

        @Override // com.google.common.io.BaseEncoding
        public InputStream decodingStream(Reader reader) {
            Preconditions.checkNotNull(reader);
            return new InputStream() { // from class: com.google.common.io.BaseEncoding.StandardBaseEncoding.2
                final /* synthetic */ Reader val$reader;
                int bitBuffer = 0;
                int bitBufferLength = 0;
                int readChars = 0;
                boolean hitPadding = false;

                AnonymousClass2(Reader reader2) {
                    val$reader = reader2;
                }

                @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    val$reader.close();
                }

                @Override // java.io.InputStream
                public int read() throws IOException {
                    while (true) {
                        int i2 = val$reader.read();
                        if (i2 != -1) {
                            this.readChars++;
                            char c2 = (char) i2;
                            if (StandardBaseEncoding.this.paddingChar != null && StandardBaseEncoding.this.paddingChar.charValue() == c2) {
                                if (!this.hitPadding && (this.readChars == 1 || !StandardBaseEncoding.this.alphabet.isValidPaddingStartPosition(this.readChars - 1))) {
                                    break;
                                }
                                this.hitPadding = true;
                            } else {
                                if (this.hitPadding) {
                                    throw new DecodingException("Expected padding character but found '" + c2 + "' at index " + this.readChars);
                                }
                                int i3 = this.bitBuffer << StandardBaseEncoding.this.alphabet.bitsPerChar;
                                this.bitBuffer = i3;
                                this.bitBuffer = (-1) - (((-1) - StandardBaseEncoding.this.alphabet.decode(c2)) & ((-1) - i3));
                                int i4 = this.bitBufferLength + StandardBaseEncoding.this.alphabet.bitsPerChar;
                                this.bitBufferLength = i4;
                                if (i4 >= 8) {
                                    int i5 = i4 - 8;
                                    this.bitBufferLength = i5;
                                    return (-1) - (((-1) - (this.bitBuffer >> i5)) | ((-1) - 255));
                                }
                            }
                        } else {
                            if (this.hitPadding || StandardBaseEncoding.this.alphabet.isValidPaddingStartPosition(this.readChars)) {
                                return -1;
                            }
                            throw new DecodingException("Invalid input length " + this.readChars);
                        }
                    }
                    throw new DecodingException("Padding cannot start at index " + this.readChars);
                }

                @Override // java.io.InputStream
                public int read(byte[] buf, int off, int len) throws IOException {
                    int i2 = len + off;
                    Preconditions.checkPositionIndexes(off, i2, buf.length);
                    int i3 = off;
                    while (i3 < i2) {
                        int i4 = read();
                        if (i4 == -1) {
                            int i5 = i3 - off;
                            if (i5 == 0) {
                                return -1;
                            }
                            return i5;
                        }
                        buf[i3] = (byte) i4;
                        i3++;
                    }
                    return i3 - off;
                }
            };
        }

        void encodeChunkTo(Appendable target, byte[] bytes, int off, int len) throws IOException {
            Preconditions.checkNotNull(target);
            Preconditions.checkPositionIndexes(off, off + len, bytes.length);
            int i2 = 0;
            Preconditions.checkArgument(len <= this.alphabet.bytesPerChunk);
            long j2 = 0;
            for (int i3 = 0; i3 < len; i3++) {
                j2 = ((-1) - (((-1) - j2) & ((-1) - ((long) (bytes[off + i3] & 255))))) << 8;
            }
            int i4 = ((len + 1) * 8) - this.alphabet.bitsPerChar;
            while (i2 < len * 8) {
                int i5 = (int) (j2 >>> (i4 - i2));
                int i6 = this.alphabet.mask;
                target.append(this.alphabet.encode((i5 + i6) - (i5 | i6)));
                i2 += this.alphabet.bitsPerChar;
            }
            if (this.paddingChar != null) {
                while (i2 < this.alphabet.bytesPerChunk * 8) {
                    target.append(this.paddingChar.charValue());
                    i2 += this.alphabet.bitsPerChar;
                }
            }
        }

        @Override // com.google.common.io.BaseEncoding
        void encodeTo(Appendable target, byte[] bytes, int off, int len) throws IOException {
            Preconditions.checkNotNull(target);
            Preconditions.checkPositionIndexes(off, off + len, bytes.length);
            int i2 = 0;
            while (i2 < len) {
                encodeChunkTo(target, bytes, off + i2, Math.min(this.alphabet.bytesPerChunk, len - i2));
                i2 += this.alphabet.bytesPerChunk;
            }
        }

        @Override // com.google.common.io.BaseEncoding
        public OutputStream encodingStream(Writer out) {
            Preconditions.checkNotNull(out);
            return new OutputStream() { // from class: com.google.common.io.BaseEncoding.StandardBaseEncoding.1
                final /* synthetic */ Writer val$out;
                int bitBuffer = 0;
                int bitBufferLength = 0;
                int writtenChars = 0;

                AnonymousClass1(Writer out2) {
                    val$out = out2;
                }

                @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    if (this.bitBufferLength > 0) {
                        val$out.write(StandardBaseEncoding.this.alphabet.encode((this.bitBuffer << (StandardBaseEncoding.this.alphabet.bitsPerChar - this.bitBufferLength)) & StandardBaseEncoding.this.alphabet.mask));
                        this.writtenChars++;
                        if (StandardBaseEncoding.this.paddingChar != null) {
                            while (this.writtenChars % StandardBaseEncoding.this.alphabet.charsPerChunk != 0) {
                                val$out.write(StandardBaseEncoding.this.paddingChar.charValue());
                                this.writtenChars++;
                            }
                        }
                    }
                    val$out.close();
                }

                @Override // java.io.OutputStream, java.io.Flushable
                public void flush() throws IOException {
                    val$out.flush();
                }

                @Override // java.io.OutputStream
                public void write(int b2) throws IOException {
                    int i2 = this.bitBuffer << 8;
                    int i3 = (b2 + 255) - (b2 | 255);
                    this.bitBuffer = (i3 + i2) - (i3 & i2);
                    this.bitBufferLength += 8;
                    while (this.bitBufferLength >= StandardBaseEncoding.this.alphabet.bitsPerChar) {
                        val$out.write(StandardBaseEncoding.this.alphabet.encode((this.bitBuffer >> (this.bitBufferLength - StandardBaseEncoding.this.alphabet.bitsPerChar)) & StandardBaseEncoding.this.alphabet.mask));
                        this.writtenChars++;
                        this.bitBufferLength -= StandardBaseEncoding.this.alphabet.bitsPerChar;
                    }
                }
            };
        }

        public boolean equals(@CheckForNull Object other) {
            if (!(other instanceof StandardBaseEncoding)) {
                return false;
            }
            StandardBaseEncoding standardBaseEncoding = (StandardBaseEncoding) other;
            return this.alphabet.equals(standardBaseEncoding.alphabet) && Objects.equals(this.paddingChar, standardBaseEncoding.paddingChar);
        }

        public int hashCode() {
            return this.alphabet.hashCode() ^ Objects.hashCode(this.paddingChar);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding ignoreCase() {
            BaseEncoding baseEncodingNewInstance = this.ignoreCase;
            if (baseEncodingNewInstance == null) {
                Alphabet alphabetIgnoreCase = this.alphabet.ignoreCase();
                baseEncodingNewInstance = alphabetIgnoreCase == this.alphabet ? this : newInstance(alphabetIgnoreCase, this.paddingChar);
                this.ignoreCase = baseEncodingNewInstance;
            }
            return baseEncodingNewInstance;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding lowerCase() {
            BaseEncoding baseEncodingNewInstance = this.lowerCase;
            if (baseEncodingNewInstance == null) {
                Alphabet alphabetLowerCase = this.alphabet.lowerCase();
                baseEncodingNewInstance = alphabetLowerCase == this.alphabet ? this : newInstance(alphabetLowerCase, this.paddingChar);
                this.lowerCase = baseEncodingNewInstance;
            }
            return baseEncodingNewInstance;
        }

        @Override // com.google.common.io.BaseEncoding
        int maxDecodedSize(int chars) {
            return (int) (((((long) this.alphabet.bitsPerChar) * ((long) chars)) + 7) / 8);
        }

        @Override // com.google.common.io.BaseEncoding
        int maxEncodedSize(int bytes) {
            return this.alphabet.charsPerChunk * IntMath.divide(bytes, this.alphabet.bytesPerChunk, RoundingMode.CEILING);
        }

        BaseEncoding newInstance(Alphabet alphabet, @CheckForNull Character paddingChar) {
            return new StandardBaseEncoding(alphabet, paddingChar);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding omitPadding() {
            return this.paddingChar == null ? this : newInstance(this.alphabet, null);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.alphabet);
            if (8 % this.alphabet.bitsPerChar != 0) {
                if (this.paddingChar == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('").append(this.paddingChar).append("')");
                }
            }
            return sb.toString();
        }

        @Override // com.google.common.io.BaseEncoding
        CharSequence trimTrailingPadding(CharSequence chars) {
            Preconditions.checkNotNull(chars);
            Character ch = this.paddingChar;
            if (ch == null) {
                return chars;
            }
            char cCharValue = ch.charValue();
            int length = chars.length() - 1;
            while (length >= 0 && chars.charAt(length) == cCharValue) {
                length--;
            }
            return chars.subSequence(0, length + 1);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding upperCase() {
            BaseEncoding baseEncodingNewInstance = this.upperCase;
            if (baseEncodingNewInstance == null) {
                Alphabet alphabetUpperCase = this.alphabet.upperCase();
                baseEncodingNewInstance = alphabetUpperCase == this.alphabet ? this : newInstance(alphabetUpperCase, this.paddingChar);
                this.upperCase = baseEncodingNewInstance;
            }
            return baseEncodingNewInstance;
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withPadChar(char padChar) {
            Character ch;
            return (8 % this.alphabet.bitsPerChar == 0 || ((ch = this.paddingChar) != null && ch.charValue() == padChar)) ? this : newInstance(this.alphabet, Character.valueOf(padChar));
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding withSeparator(String separator, int afterEveryChars) {
            for (int i2 = 0; i2 < separator.length(); i2++) {
                Preconditions.checkArgument(!this.alphabet.matches(separator.charAt(i2)), "Separator (%s) cannot contain alphabet characters", separator);
            }
            Character ch = this.paddingChar;
            if (ch != null) {
                Preconditions.checkArgument(separator.indexOf(ch.charValue()) < 0, "Separator (%s) cannot contain padding character", separator);
            }
            return new SeparatedBaseEncoding(this, separator, afterEveryChars);
        }
    }

    BaseEncoding() {
    }

    public static BaseEncoding base16() {
        return BASE16;
    }

    public static BaseEncoding base32() {
        return BASE32;
    }

    public static BaseEncoding base32Hex() {
        return BASE32_HEX;
    }

    public static BaseEncoding base64() {
        return BASE64;
    }

    public static BaseEncoding base64Url() {
        return BASE64_URL;
    }

    private static byte[] extract(byte[] result, int length) {
        if (length == result.length) {
            return result;
        }
        byte[] bArr = new byte[length];
        System.arraycopy(result, 0, bArr, 0, length);
        return bArr;
    }

    static Reader ignoringReader(Reader delegate, String toIgnore) {
        Preconditions.checkNotNull(delegate);
        Preconditions.checkNotNull(toIgnore);
        return new Reader() { // from class: com.google.common.io.BaseEncoding.3
            final /* synthetic */ Reader val$delegate;
            final /* synthetic */ String val$toIgnore;

            AnonymousClass3(Reader delegate2, String toIgnore2) {
                val$delegate = delegate2;
                val$toIgnore = toIgnore2;
            }

            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                val$delegate.close();
            }

            @Override // java.io.Reader
            public int read() throws IOException {
                int i2;
                do {
                    i2 = val$delegate.read();
                    if (i2 == -1) {
                        break;
                    }
                } while (val$toIgnore.indexOf((char) i2) >= 0);
                return i2;
            }

            @Override // java.io.Reader
            public int read(char[] cbuf, int off, int len) throws IOException {
                throw new UnsupportedOperationException();
            }
        };
    }

    static Appendable separatingAppendable(Appendable delegate, String separator, int afterEveryChars) {
        Preconditions.checkNotNull(delegate);
        Preconditions.checkNotNull(separator);
        Preconditions.checkArgument(afterEveryChars > 0);
        return new Appendable(afterEveryChars, delegate, separator) { // from class: com.google.common.io.BaseEncoding.4
            int charsUntilSeparator;
            final /* synthetic */ int val$afterEveryChars;
            final /* synthetic */ Appendable val$delegate;
            final /* synthetic */ String val$separator;

            AnonymousClass4(int afterEveryChars2, Appendable delegate2, String separator2) {
                this.val$afterEveryChars = afterEveryChars2;
                this.val$delegate = delegate2;
                this.val$separator = separator2;
                this.charsUntilSeparator = afterEveryChars2;
            }

            @Override // java.lang.Appendable
            public Appendable append(char c2) throws IOException {
                if (this.charsUntilSeparator == 0) {
                    this.val$delegate.append(this.val$separator);
                    this.charsUntilSeparator = this.val$afterEveryChars;
                }
                this.val$delegate.append(c2);
                this.charsUntilSeparator--;
                return this;
            }

            @Override // java.lang.Appendable
            public Appendable append(@CheckForNull CharSequence chars) {
                throw new UnsupportedOperationException();
            }

            @Override // java.lang.Appendable
            public Appendable append(@CheckForNull CharSequence chars, int off, int len) {
                throw new UnsupportedOperationException();
            }
        };
    }

    static Writer separatingWriter(Writer delegate, String separator, int afterEveryChars) {
        return new Writer() { // from class: com.google.common.io.BaseEncoding.5
            final /* synthetic */ Writer val$delegate;
            final /* synthetic */ Appendable val$separatingAppendable;

            AnonymousClass5(final Appendable val$separatingAppendable, Writer delegate2) {
                val$separatingAppendable = val$separatingAppendable;
                val$delegate = delegate2;
            }

            @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                val$delegate.close();
            }

            @Override // java.io.Writer, java.io.Flushable
            public void flush() throws IOException {
                val$delegate.flush();
            }

            @Override // java.io.Writer
            public void write(int c2) throws IOException {
                val$separatingAppendable.append((char) c2);
            }

            @Override // java.io.Writer
            public void write(char[] chars, int off, int len) throws IOException {
                throw new UnsupportedOperationException();
            }
        };
    }

    public abstract boolean canDecode(CharSequence chars);

    public final byte[] decode(CharSequence chars) {
        try {
            return decodeChecked(chars);
        } catch (DecodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    final byte[] decodeChecked(CharSequence chars) throws DecodingException {
        CharSequence charSequenceTrimTrailingPadding = trimTrailingPadding(chars);
        byte[] bArr = new byte[maxDecodedSize(charSequenceTrimTrailingPadding.length())];
        return extract(bArr, decodeTo(bArr, charSequenceTrimTrailingPadding));
    }

    abstract int decodeTo(byte[] target, CharSequence chars) throws DecodingException;

    public final ByteSource decodingSource(CharSource encodedSource) {
        Preconditions.checkNotNull(encodedSource);
        return new ByteSource() { // from class: com.google.common.io.BaseEncoding.2
            final /* synthetic */ CharSource val$encodedSource;

            AnonymousClass2(CharSource encodedSource2) {
                val$encodedSource = encodedSource2;
            }

            @Override // com.google.common.io.ByteSource
            public InputStream openStream() throws IOException {
                return BaseEncoding.this.decodingStream(val$encodedSource.openStream());
            }
        };
    }

    public abstract InputStream decodingStream(Reader reader);

    public String encode(byte[] bytes) {
        return encode(bytes, 0, bytes.length);
    }

    public final String encode(byte[] bytes, int off, int len) {
        Preconditions.checkPositionIndexes(off, off + len, bytes.length);
        StringBuilder sb = new StringBuilder(maxEncodedSize(len));
        try {
            encodeTo(sb, bytes, off, len);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    abstract void encodeTo(Appendable target, byte[] bytes, int off, int len) throws IOException;

    public final ByteSink encodingSink(CharSink encodedSink) {
        Preconditions.checkNotNull(encodedSink);
        return new ByteSink() { // from class: com.google.common.io.BaseEncoding.1
            final /* synthetic */ CharSink val$encodedSink;

            AnonymousClass1(CharSink encodedSink2) {
                val$encodedSink = encodedSink2;
            }

            @Override // com.google.common.io.ByteSink
            public OutputStream openStream() throws IOException {
                return BaseEncoding.this.encodingStream(val$encodedSink.openStream());
            }
        };
    }

    public abstract OutputStream encodingStream(Writer writer);

    public abstract BaseEncoding ignoreCase();

    public abstract BaseEncoding lowerCase();

    abstract int maxDecodedSize(int chars);

    abstract int maxEncodedSize(int bytes);

    public abstract BaseEncoding omitPadding();

    CharSequence trimTrailingPadding(CharSequence chars) {
        return (CharSequence) Preconditions.checkNotNull(chars);
    }

    public abstract BaseEncoding upperCase();

    public abstract BaseEncoding withPadChar(char padChar);

    public abstract BaseEncoding withSeparator(String separator, int n2);
}
