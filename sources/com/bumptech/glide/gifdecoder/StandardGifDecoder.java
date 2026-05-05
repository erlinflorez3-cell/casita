package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class StandardGifDecoder implements GifDecoder {
    private static final int BYTES_PER_INTEGER = 4;
    private static final int COLOR_TRANSPARENT_BLACK = 0;
    private static final int INITIAL_FRAME_POINTER = -1;
    private static final int MASK_INT_LOWEST_BYTE = 255;
    private static final int MAX_STACK_SIZE = 4096;
    private static final int NULL_CODE = -1;
    private static final String TAG = "StandardGifDecoder";
    private int[] act;
    private Bitmap.Config bitmapConfig;
    private final GifDecoder.BitmapProvider bitmapProvider;
    private byte[] block;
    private int downsampledHeight;
    private int downsampledWidth;
    private int framePointer;
    private GifHeader header;
    private Boolean isFirstFrameTransparent;
    private byte[] mainPixels;
    private int[] mainScratch;
    private GifHeaderParser parser;
    private final int[] pct;
    private byte[] pixelStack;
    private short[] prefix;
    private Bitmap previousImage;
    private ByteBuffer rawData;
    private int sampleSize;
    private boolean savePrevious;
    private int status;
    private byte[] suffix;

    public StandardGifDecoder(GifDecoder.BitmapProvider bitmapProvider) {
        this.pct = new int[256];
        this.bitmapConfig = Bitmap.Config.ARGB_8888;
        this.bitmapProvider = bitmapProvider;
        this.header = new GifHeader();
    }

    public StandardGifDecoder(GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer) {
        this(bitmapProvider, gifHeader, byteBuffer, 1);
    }

    public StandardGifDecoder(GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer, int i2) {
        this(bitmapProvider);
        setData(gifHeader, byteBuffer, i2);
    }

    private int averageColorsNear(int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = i2; i10 < this.sampleSize + i2; i10++) {
            byte[] bArr = this.mainPixels;
            if (i10 >= bArr.length || i10 >= i3) {
                break;
            }
            int i11 = this.act[bArr[i10] & 255];
            if (i11 != 0) {
                i5 += (-1) - (((-1) - (i11 >> 24)) | ((-1) - 255));
                i6 += (i11 >> 16) & 255;
                i7 += (-1) - (((-1) - (i11 >> 8)) | ((-1) - 255));
                i8 += i11 & 255;
                i9++;
            }
        }
        int i12 = i2 + i4;
        for (int i13 = i12; i13 < this.sampleSize + i12; i13++) {
            byte[] bArr2 = this.mainPixels;
            if (i13 >= bArr2.length || i13 >= i3) {
                break;
            }
            byte b2 = bArr2[i13];
            int i14 = this.act[(b2 + 255) - (b2 | 255)];
            if (i14 != 0) {
                int i15 = i14 >> 24;
                i5 += (i15 + 255) - (i15 | 255);
                i6 += (i14 >> 16) & 255;
                i7 += (-1) - (((-1) - (i14 >> 8)) | ((-1) - 255));
                i8 += (i14 + 255) - (i14 | 255);
                i9++;
            }
        }
        if (i9 == 0) {
            return 0;
        }
        int i16 = (-1) - (((-1) - ((i5 / i9) << 24)) & ((-1) - ((i6 / i9) << 16)));
        int i17 = (i7 / i9) << 8;
        return ((i16 + i17) - (i16 & i17)) | (i8 / i9);
    }

    private void copyCopyIntoScratchRobust(GifFrame gifFrame) {
        int i2;
        int[] iArr = this.mainScratch;
        int i3 = gifFrame.ih / this.sampleSize;
        int i4 = gifFrame.iy / this.sampleSize;
        int i5 = gifFrame.iw / this.sampleSize;
        int i6 = gifFrame.ix;
        int i7 = this.sampleSize;
        int i8 = i6 / i7;
        int i9 = 1;
        boolean z2 = this.framePointer == 0;
        int i10 = this.downsampledWidth;
        int i11 = this.downsampledHeight;
        byte[] bArr = this.mainPixels;
        int[] iArr2 = this.act;
        Boolean bool = this.isFirstFrameTransparent;
        int i12 = 8;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i3) {
            if (gifFrame.interlace) {
                if (i14 >= i3) {
                    i9++;
                    if (i9 == 2) {
                        i14 = 4;
                    } else if (i9 == 3) {
                        i12 = 4;
                        i14 = 2;
                    } else if (i9 == 4) {
                        i14 = 1;
                        i12 = 2;
                    }
                }
                i2 = i14 + i12;
            } else {
                i2 = i14;
                i14 = i13;
            }
            int i15 = i14 + i4;
            boolean z3 = i7 == 1;
            if (i15 < i11) {
                int i16 = i15 * i10;
                int i17 = i16 + i8;
                int i18 = i17 + i5;
                int i19 = i16 + i10;
                if (i19 < i18) {
                    i18 = i19;
                }
                int i20 = i13 * i7 * gifFrame.iw;
                if (z3) {
                    while (i17 < i18) {
                        int i21 = iArr2[(-1) - (((-1) - bArr[i20]) | ((-1) - 255))];
                        if (i21 != 0) {
                            iArr[i17] = i21;
                        } else if (z2 && bool == null) {
                            bool = true;
                        }
                        i20 += i7;
                        i17++;
                    }
                } else {
                    int i22 = ((i18 - i17) * i7) + i20;
                    while (i17 < i18) {
                        int iAverageColorsNear = averageColorsNear(i20, i22, gifFrame.iw);
                        if (iAverageColorsNear != 0) {
                            iArr[i17] = iAverageColorsNear;
                        } else if (z2 && bool == null) {
                            bool = true;
                        }
                        i20 += i7;
                        i17++;
                    }
                }
            }
            i13++;
            i14 = i2;
        }
        if (this.isFirstFrameTransparent == null) {
            this.isFirstFrameTransparent = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    private void copyIntoScratchFast(GifFrame gifFrame) {
        int[] iArr = this.mainScratch;
        int i2 = gifFrame.ih;
        int i3 = gifFrame.iy;
        int i4 = gifFrame.iw;
        int i5 = gifFrame.ix;
        boolean z2 = this.framePointer == 0;
        int i6 = this.downsampledWidth;
        byte[] bArr = this.mainPixels;
        int[] iArr2 = this.act;
        byte b2 = -1;
        for (int i7 = 0; i7 < i2; i7++) {
            int i8 = (i7 + i3) * i6;
            int i9 = i8 + i5;
            int i10 = i9 + i4;
            int i11 = i8 + i6;
            if (i11 < i10) {
                i10 = i11;
            }
            int i12 = gifFrame.iw * i7;
            while (i9 < i10) {
                byte b3 = bArr[i12];
                int i13 = (-1) - (((-1) - b3) | ((-1) - 255));
                if (i13 != b2) {
                    int i14 = iArr2[i13];
                    if (i14 != 0) {
                        iArr[i9] = i14;
                    } else {
                        b2 = b3;
                    }
                }
                i12++;
                i9++;
            }
        }
        Boolean bool = this.isFirstFrameTransparent;
        this.isFirstFrameTransparent = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.isFirstFrameTransparent == null && z2 && b2 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13, types: [short] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    private void decodeBitmapData(GifFrame gifFrame) {
        short s2;
        StandardGifDecoder standardGifDecoder = this;
        if (gifFrame != null) {
            standardGifDecoder.rawData.position(gifFrame.bufferFrameStart);
        }
        int i2 = gifFrame == null ? standardGifDecoder.header.width * standardGifDecoder.header.height : gifFrame.ih * gifFrame.iw;
        byte[] bArr = standardGifDecoder.mainPixels;
        if (bArr == null || bArr.length < i2) {
            standardGifDecoder.mainPixels = standardGifDecoder.bitmapProvider.obtainByteArray(i2);
        }
        byte[] bArr2 = standardGifDecoder.mainPixels;
        if (standardGifDecoder.prefix == null) {
            standardGifDecoder.prefix = new short[4096];
        }
        short[] sArr = standardGifDecoder.prefix;
        if (standardGifDecoder.suffix == null) {
            standardGifDecoder.suffix = new byte[4096];
        }
        byte[] bArr3 = standardGifDecoder.suffix;
        if (standardGifDecoder.pixelStack == null) {
            standardGifDecoder.pixelStack = new byte[4097];
        }
        byte[] bArr4 = standardGifDecoder.pixelStack;
        int i3 = readByte();
        int i4 = 1 << i3;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = i3 + 1;
        int i8 = (1 << i7) - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            sArr[i10] = 0;
            bArr3[i10] = (byte) i10;
        }
        byte[] bArr5 = standardGifDecoder.block;
        int i11 = -1;
        int i12 = i7;
        int i13 = i6;
        int i14 = i8;
        int block = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (true) {
            if (i9 >= i2) {
                break;
            }
            if (block == 0) {
                block = readBlock();
                if (block <= 0) {
                    standardGifDecoder.status = 3;
                    break;
                }
                i15 = 0;
            }
            byte b2 = bArr5[i15];
            i17 += ((b2 + 255) - (b2 | 255)) << i16;
            i16 += 8;
            i15++;
            block--;
            while (true) {
                if (i16 < i12) {
                    standardGifDecoder = this;
                    break;
                }
                int i21 = (-1) - (((-1) - i17) | ((-1) - i14));
                i17 >>= i12;
                i16 -= i12;
                if (i21 == i4) {
                    i14 = i8;
                    i12 = i7;
                    i13 = i6;
                    i6 = i13;
                    i11 = -1;
                } else {
                    if (i21 == i5) {
                        standardGifDecoder = this;
                        break;
                    }
                    if (i11 == -1) {
                        bArr2[i18] = bArr3[i21];
                        i18++;
                        i9++;
                        i11 = i21;
                        i19 = i11;
                    } else {
                        if (i21 >= i13) {
                            bArr4[i20] = (byte) i19;
                            i20++;
                            s2 = i11;
                        } else {
                            s2 = i21;
                        }
                        while (s2 >= i4) {
                            bArr4[i20] = bArr3[s2];
                            i20++;
                            s2 = sArr[s2];
                        }
                        byte b3 = bArr3[s2];
                        i19 = (b3 + 255) - (b3 | 255);
                        byte b4 = (byte) i19;
                        bArr2[i18] = b4;
                        while (true) {
                            i18++;
                            i9++;
                            if (i20 <= 0) {
                                break;
                            }
                            i20--;
                            bArr2[i18] = bArr4[i20];
                        }
                        if (i13 < 4096) {
                            sArr[i13] = (short) i11;
                            bArr3[i13] = b4;
                            i13++;
                            if ((-1) - (((-1) - i13) | ((-1) - i14)) == 0 && i13 < 4096) {
                                i12++;
                                i14 += i13;
                            }
                        }
                        i11 = i21;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i18, i2, (byte) 0);
    }

    private GifHeaderParser getHeaderParser() {
        if (this.parser == null) {
            this.parser = new GifHeaderParser();
        }
        return this.parser;
    }

    private Bitmap getNextBitmap() {
        Boolean bool = this.isFirstFrameTransparent;
        Bitmap bitmapObtain = this.bitmapProvider.obtain(this.downsampledWidth, this.downsampledHeight, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.bitmapConfig);
        bitmapObtain.setHasAlpha(true);
        return bitmapObtain;
    }

    private int readBlock() {
        int i2 = readByte();
        if (i2 <= 0) {
            return i2;
        }
        ByteBuffer byteBuffer = this.rawData;
        byteBuffer.get(this.block, 0, Math.min(i2, byteBuffer.remaining()));
        return i2;
    }

    private int readByte() {
        return (-1) - (((-1) - this.rawData.get()) | ((-1) - 255));
    }

    private Bitmap setPixels(GifFrame gifFrame, GifFrame gifFrame2) {
        Bitmap bitmap;
        int[] iArr = this.mainScratch;
        int i2 = 0;
        if (gifFrame2 == null) {
            Bitmap bitmap2 = this.previousImage;
            if (bitmap2 != null) {
                this.bitmapProvider.release(bitmap2);
            }
            this.previousImage = null;
            Arrays.fill(iArr, 0);
        }
        if (gifFrame2 != null && gifFrame2.dispose == 3 && this.previousImage == null) {
            Arrays.fill(iArr, 0);
        }
        if (gifFrame2 != null && gifFrame2.dispose > 0) {
            if (gifFrame2.dispose == 2) {
                if (!gifFrame.transparency) {
                    int i3 = this.header.bgColor;
                    if (gifFrame.lct == null || this.header.bgIndex != gifFrame.transIndex) {
                        i2 = i3;
                    }
                }
                int i4 = gifFrame2.ih / this.sampleSize;
                int i5 = gifFrame2.iy / this.sampleSize;
                int i6 = gifFrame2.iw / this.sampleSize;
                int i7 = gifFrame2.ix / this.sampleSize;
                int i8 = this.downsampledWidth;
                int i9 = (i5 * i8) + i7;
                int i10 = (i4 * i8) + i9;
                while (i9 < i10) {
                    int i11 = i9 + i6;
                    for (int i12 = i9; i12 < i11; i12++) {
                        iArr[i12] = i2;
                    }
                    i9 += this.downsampledWidth;
                }
            } else if (gifFrame2.dispose == 3 && (bitmap = this.previousImage) != null) {
                int i13 = this.downsampledWidth;
                bitmap.getPixels(iArr, 0, i13, 0, 0, i13, this.downsampledHeight);
            }
        }
        decodeBitmapData(gifFrame);
        if (gifFrame.interlace || this.sampleSize != 1) {
            copyCopyIntoScratchRobust(gifFrame);
        } else {
            copyIntoScratchFast(gifFrame);
        }
        if (this.savePrevious && (gifFrame.dispose == 0 || gifFrame.dispose == 1)) {
            if (this.previousImage == null) {
                this.previousImage = getNextBitmap();
            }
            Bitmap bitmap3 = this.previousImage;
            int i14 = this.downsampledWidth;
            bitmap3.setPixels(iArr, 0, i14, 0, 0, i14, this.downsampledHeight);
        }
        Bitmap nextBitmap = getNextBitmap();
        int i15 = this.downsampledWidth;
        nextBitmap.setPixels(iArr, 0, i15, 0, 0, i15, this.downsampledHeight);
        return nextBitmap;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void advance() {
        this.framePointer = (this.framePointer + 1) % this.header.frameCount;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void clear() {
        this.header = null;
        byte[] bArr = this.mainPixels;
        if (bArr != null) {
            this.bitmapProvider.release(bArr);
        }
        int[] iArr = this.mainScratch;
        if (iArr != null) {
            this.bitmapProvider.release(iArr);
        }
        Bitmap bitmap = this.previousImage;
        if (bitmap != null) {
            this.bitmapProvider.release(bitmap);
        }
        this.previousImage = null;
        this.rawData = null;
        this.isFirstFrameTransparent = null;
        byte[] bArr2 = this.block;
        if (bArr2 != null) {
            this.bitmapProvider.release(bArr2);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getByteSize() {
        return this.rawData.limit() + this.mainPixels.length + (this.mainScratch.length * 4);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getCurrentFrameIndex() {
        return this.framePointer;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public ByteBuffer getData() {
        return this.rawData;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getDelay(int i2) {
        if (i2 < 0 || i2 >= this.header.frameCount) {
            return -1;
        }
        return this.header.frames.get(i2).delay;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getFrameCount() {
        return this.header.frameCount;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getHeight() {
        return this.header.height;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @Deprecated
    public int getLoopCount() {
        if (this.header.loopCount == -1) {
            return 1;
        }
        return this.header.loopCount;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNetscapeLoopCount() {
        return this.header.loopCount;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNextDelay() {
        int i2;
        if (this.header.frameCount <= 0 || (i2 = this.framePointer) < 0) {
            return 0;
        }
        return getDelay(i2);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized Bitmap getNextFrame() {
        if (this.header.frameCount <= 0 || this.framePointer < 0) {
            if (Log.isLoggable(TAG, 3)) {
                String str = "Unable to decode frame, frameCount=" + this.header.frameCount + ", framePointer=" + this.framePointer;
            }
            this.status = 1;
        }
        int i2 = this.status;
        if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable(TAG, 3)) {
                String str2 = "Unable to decode frame, status=" + this.status;
            }
            return null;
        }
        this.status = 0;
        if (this.block == null) {
            this.block = this.bitmapProvider.obtainByteArray(255);
        }
        GifFrame gifFrame = this.header.frames.get(this.framePointer);
        int i3 = this.framePointer - 1;
        GifFrame gifFrame2 = i3 >= 0 ? this.header.frames.get(i3) : null;
        int[] iArr = gifFrame.lct != null ? gifFrame.lct : this.header.gct;
        this.act = iArr;
        if (iArr == null) {
            if (Log.isLoggable(TAG, 3)) {
                String str3 = "No valid color table found for frame #" + this.framePointer;
            }
            this.status = 1;
            return null;
        }
        if (gifFrame.transparency) {
            int[] iArr2 = this.act;
            System.arraycopy(iArr2, 0, this.pct, 0, iArr2.length);
            int[] iArr3 = this.pct;
            this.act = iArr3;
            iArr3[gifFrame.transIndex] = 0;
            if (gifFrame.dispose == 2 && this.framePointer == 0) {
                this.isFirstFrameTransparent = true;
            }
        }
        return setPixels(gifFrame, gifFrame2);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getStatus() {
        return this.status;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getTotalIterationCount() {
        if (this.header.loopCount == -1) {
            return 1;
        }
        if (this.header.loopCount == 0) {
            return 0;
        }
        return this.header.loopCount + 1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getWidth() {
        return this.header.width;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int read(InputStream inputStream, int i2) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2 > 0 ? i2 + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int i3 = inputStream.read(bArr, 0, 16384);
                    if (i3 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i3);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException e2) {
                String str = TAG;
            }
        } else {
            this.status = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e3) {
                String str2 = TAG;
            }
        }
        return this.status;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized int read(byte[] bArr) {
        GifHeader header = getHeaderParser().setData(bArr).parseHeader();
        this.header = header;
        if (bArr != null) {
            setData(header, bArr);
        }
        return this.status;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void resetFrameIndex() {
        this.framePointer = -1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(GifHeader gifHeader, ByteBuffer byteBuffer) {
        setData(gifHeader, byteBuffer, 1);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(GifHeader gifHeader, ByteBuffer byteBuffer, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i2);
        }
        int iHighestOneBit = Integer.highestOneBit(i2);
        this.status = 0;
        this.header = gifHeader;
        this.framePointer = -1;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.rawData = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.rawData.order(ByteOrder.LITTLE_ENDIAN);
        this.savePrevious = false;
        Iterator<GifFrame> it = gifHeader.frames.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().dispose == 3) {
                this.savePrevious = true;
                break;
            }
        }
        this.sampleSize = iHighestOneBit;
        this.downsampledWidth = gifHeader.width / iHighestOneBit;
        this.downsampledHeight = gifHeader.height / iHighestOneBit;
        this.mainPixels = this.bitmapProvider.obtainByteArray(gifHeader.width * gifHeader.height);
        this.mainScratch = this.bitmapProvider.obtainIntArray(this.downsampledWidth * this.downsampledHeight);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(GifHeader gifHeader, byte[] bArr) {
        setData(gifHeader, ByteBuffer.wrap(bArr));
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void setDefaultBitmapConfig(Bitmap.Config config) {
        if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
            throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
        }
        this.bitmapConfig = config;
    }
}
