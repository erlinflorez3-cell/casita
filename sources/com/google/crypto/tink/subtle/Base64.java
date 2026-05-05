package com.google.crypto.tink.subtle;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes7.dex */
public final class Base64 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    static abstract class Coder {
        public int op;
        public byte[] output;

        Coder() {
        }

        public abstract int maxOutputSize(int len);

        public abstract boolean process(byte[] input, int offset, int len, boolean finish);
    }

    static class Decoder extends Coder {
        private static final int[] DECODE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] DECODE_WEBSAFE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet;
        private int state;
        private int value;

        public Decoder(int flags, byte[] output) {
            this.output = output;
            this.alphabet = (-1) - (((-1) - flags) | ((-1) - 8)) == 0 ? DECODE : DECODE_WEBSAFE;
            this.state = 0;
            this.value = 0;
        }

        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public int maxOutputSize(int len) {
            return ((len * 3) / 4) + 10;
        }

        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public boolean process(byte[] input, int offset, int len, boolean finish) {
            int i2 = offset;
            int i3 = this.state;
            if (i3 == 6) {
                return false;
            }
            int i4 = len + i2;
            int i5 = this.value;
            byte[] bArr = this.output;
            int[] iArr = this.alphabet;
            int i6 = 0;
            while (i2 < i4) {
                if (i3 == 0) {
                    while (true) {
                        int i7 = i2 + 4;
                        if (i7 > i4) {
                            break;
                        }
                        int i8 = iArr[input[i2] & 255] << 18;
                        int i9 = iArr[(-1) - (((-1) - input[i2 + 1]) | ((-1) - 255))] << 12;
                        int i10 = (-1) - (((-1) - ((i8 + i9) - (i8 & i9))) & ((-1) - (iArr[(-1) - (((-1) - input[i2 + 2]) | ((-1) - 255))] << 6)));
                        byte b2 = input[i2 + 3];
                        i5 = (-1) - (((-1) - i10) & ((-1) - iArr[(b2 + 255) - (b2 | 255)]));
                        if (i5 < 0) {
                            break;
                        }
                        bArr[i6 + 2] = (byte) i5;
                        bArr[i6 + 1] = (byte) (i5 >> 8);
                        bArr[i6] = (byte) (i5 >> 16);
                        i6 += 3;
                        i2 = i7;
                    }
                    if (i2 >= i4) {
                        break;
                    }
                }
                int i11 = i2 + 1;
                int i12 = iArr[input[i2] & 255];
                if (i3 != 0) {
                    if (i3 == 1) {
                        if (i12 < 0) {
                            if (i12 != -1) {
                                this.state = 6;
                                return false;
                            }
                        }
                        int i13 = i5 << 6;
                        i12 = (i12 + i13) - (i12 & i13);
                    } else if (i3 == 2) {
                        if (i12 < 0) {
                            if (i12 == -2) {
                                bArr[i6] = (byte) (i5 >> 4);
                                i6++;
                                i3 = 4;
                            } else if (i12 != -1) {
                                this.state = 6;
                                return false;
                            }
                        }
                        int i132 = i5 << 6;
                        i12 = (i12 + i132) - (i12 & i132);
                    } else if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5 && i12 != -1) {
                                this.state = 6;
                                return false;
                            }
                        } else if (i12 == -2) {
                            i3++;
                        } else if (i12 != -1) {
                            this.state = 6;
                            return false;
                        }
                    } else if (i12 >= 0) {
                        int i14 = i5 << 6;
                        i5 = (i12 + i14) - (i12 & i14);
                        bArr[i6 + 2] = (byte) i5;
                        bArr[i6 + 1] = (byte) (i5 >> 8);
                        bArr[i6] = (byte) (i5 >> 16);
                        i6 += 3;
                        i3 = 0;
                    } else if (i12 == -2) {
                        bArr[i6 + 1] = (byte) (i5 >> 2);
                        bArr[i6] = (byte) (i5 >> 10);
                        i6 += 2;
                        i3 = 5;
                    } else if (i12 != -1) {
                        this.state = 6;
                        return false;
                    }
                    i3++;
                    i5 = i12;
                } else if (i12 >= 0) {
                    i3++;
                    i5 = i12;
                } else if (i12 != -1) {
                    this.state = 6;
                    return false;
                }
                i2 = i11;
            }
            if (!finish) {
                this.state = i3;
                this.value = i5;
                this.op = i6;
                return true;
            }
            if (i3 == 1) {
                this.state = 6;
                return false;
            }
            if (i3 == 2) {
                bArr[i6] = (byte) (i5 >> 4);
                i6++;
            } else if (i3 == 3) {
                int i15 = i6 + 1;
                bArr[i6] = (byte) (i5 >> 10);
                i6 += 2;
                bArr[i15] = (byte) (i5 >> 2);
            } else if (i3 == 4) {
                this.state = 6;
                return false;
            }
            this.state = i3;
            this.op = i6;
            return true;
        }
    }

    static class Encoder extends Coder {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final byte[] ENCODE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        private static final byte[] ENCODE_WEBSAFE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        public static final int LINE_GROUPS = 19;
        private final byte[] alphabet;
        private int count;
        public final boolean doCr;
        public final boolean doNewline;
        public final boolean doPadding;
        private final byte[] tail;
        int tailLen;

        public Encoder(int flags, byte[] output) {
            this.output = output;
            this.doPadding = (flags + 1) - (1 | flags) == 0;
            boolean z2 = (2 & flags) == 0;
            this.doNewline = z2;
            this.doCr = (flags + 4) - (4 | flags) != 0;
            this.alphabet = (-1) - (((-1) - flags) | ((-1) - 8)) == 0 ? ENCODE : ENCODE_WEBSAFE;
            this.tail = new byte[2];
            this.tailLen = 0;
            this.count = z2 ? 19 : -1;
        }

        @Override // com.google.crypto.tink.subtle.Base64.Coder
        public int maxOutputSize(int len) {
            return ((len * 8) / 5) + 10;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:5:0x0017  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0138 A[SYNTHETIC] */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // com.google.crypto.tink.subtle.Base64.Coder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean process(byte[] r19, int r20, int r21, boolean r22) {
            /*
                Method dump skipped, instruction units count: 585
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.subtle.Base64.Encoder.process(byte[], int, int, boolean):boolean");
        }
    }

    private Base64() {
    }

    public static byte[] decode(String input) {
        return decode(input, 2);
    }

    public static byte[] decode(String str, int flags) {
        return decode(str.getBytes(UTF_8), flags);
    }

    public static byte[] decode(byte[] input, int flags) {
        return decode(input, 0, input.length, flags);
    }

    public static byte[] decode(byte[] input, int offset, int len, int flags) {
        Decoder decoder = new Decoder(flags, new byte[(len * 3) / 4]);
        if (!decoder.process(input, offset, len, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        if (decoder.op == decoder.output.length) {
            return decoder.output;
        }
        byte[] bArr = new byte[decoder.op];
        System.arraycopy(decoder.output, 0, bArr, 0, decoder.op);
        return bArr;
    }

    public static String encode(final byte[] input) {
        return encodeToString(input, 2);
    }

    public static byte[] encode(byte[] input, int flags) {
        return encode(input, 0, input.length, flags);
    }

    public static byte[] encode(byte[] input, int offset, int len, int flags) {
        Encoder encoder = new Encoder(flags, null);
        int i2 = (len / 3) * 4;
        if (!encoder.doPadding) {
            int i3 = len % 3;
            if (i3 == 1) {
                i2 += 2;
            } else if (i3 == 2) {
                i2 += 3;
            }
        } else if (len % 3 > 0) {
            i2 += 4;
        }
        if (encoder.doNewline && len > 0) {
            i2 += (((len - 1) / 57) + 1) * (encoder.doCr ? 2 : 1);
        }
        encoder.output = new byte[i2];
        encoder.process(input, offset, len, true);
        return encoder.output;
    }

    public static String encodeToString(byte[] input, int flags) {
        try {
            return new String(encode(input, flags), "US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public static String encodeToString(byte[] input, int offset, int len, int flags) {
        try {
            return new String(encode(input, offset, len, flags), "US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public static byte[] urlSafeDecode(String input) {
        return decode(input, 11);
    }

    public static String urlSafeEncode(final byte[] input) {
        return encodeToString(input, 11);
    }
}
