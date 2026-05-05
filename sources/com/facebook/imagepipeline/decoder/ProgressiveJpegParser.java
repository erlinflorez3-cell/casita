package com.facebook.imagepipeline.decoder;

import com.facebook.common.internal.Closeables;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Throwables;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.PooledByteArrayBufferedInputStream;
import com.facebook.common.util.StreamUtil;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class ProgressiveJpegParser {
    private static final int BUFFER_SIZE = 16384;
    private static final int NOT_A_JPEG = 6;
    private static final int READ_FIRST_JPEG_BYTE = 0;
    private static final int READ_MARKER_FIRST_BYTE_OR_ENTROPY_DATA = 2;
    private static final int READ_MARKER_SECOND_BYTE = 3;
    private static final int READ_SECOND_JPEG_BYTE = 1;
    private static final int READ_SIZE_FIRST_BYTE = 4;
    private static final int READ_SIZE_SECOND_BYTE = 5;
    private final ByteArrayPool mByteArrayPool;
    private boolean mEndMarkerRead;
    private int mBytesParsed = 0;
    private int mLastByteRead = 0;
    private int mNextFullScanNumber = 0;
    private int mBestScanEndOffset = 0;
    private int mBestScanNumber = 0;
    private int mParserState = 0;

    public ProgressiveJpegParser(ByteArrayPool byteArrayPool) {
        this.mByteArrayPool = (ByteArrayPool) Preconditions.checkNotNull(byteArrayPool);
    }

    private boolean doParseMoreData(InputStream inputStream) throws Throwable {
        int i2;
        int i3 = this.mBestScanNumber;
        while (this.mParserState != 6 && (i2 = inputStream.read()) != -1) {
            try {
                int i4 = this.mBytesParsed;
                this.mBytesParsed = i4 + 1;
                if (this.mEndMarkerRead) {
                    this.mParserState = 6;
                    this.mEndMarkerRead = false;
                    return false;
                }
                int i5 = this.mParserState;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                if (i5 == 4) {
                                    this.mParserState = 5;
                                } else if (i5 != 5) {
                                    Preconditions.checkState(false);
                                } else {
                                    int i6 = ((this.mLastByteRead << 8) + i2) - 2;
                                    StreamUtil.skip(inputStream, i6);
                                    this.mBytesParsed += i6;
                                    this.mParserState = 2;
                                }
                            } else if (i2 == 255) {
                                this.mParserState = 3;
                            } else if (i2 == 0) {
                                this.mParserState = 2;
                            } else if (i2 == 217) {
                                this.mEndMarkerRead = true;
                                newScanOrImageEndFound(i4 - 1);
                                this.mParserState = 2;
                            } else {
                                if (i2 == 218) {
                                    newScanOrImageEndFound(i4 - 1);
                                }
                                if (doesMarkerStartSegment(i2)) {
                                    this.mParserState = 4;
                                } else {
                                    this.mParserState = 2;
                                }
                            }
                        } else if (i2 == 255) {
                            this.mParserState = 3;
                        }
                    } else if (i2 == 216) {
                        this.mParserState = 2;
                    } else {
                        this.mParserState = 6;
                    }
                } else if (i2 == 255) {
                    this.mParserState = 1;
                } else {
                    this.mParserState = 6;
                }
                this.mLastByteRead = i2;
            } catch (IOException e2) {
                Throwables.propagate(e2);
            }
            return (this.mParserState == 6 || this.mBestScanNumber == i3) ? false : true;
        }
        if (this.mParserState == 6) {
            return false;
        }
    }

    private static boolean doesMarkerStartSegment(int i2) {
        if (i2 == 1) {
            return false;
        }
        return ((i2 >= 208 && i2 <= 215) || i2 == 217 || i2 == 216) ? false : true;
    }

    private void newScanOrImageEndFound(int i2) {
        int i3 = this.mNextFullScanNumber;
        if (i3 > 0) {
            this.mBestScanEndOffset = i2;
        }
        this.mNextFullScanNumber = i3 + 1;
        this.mBestScanNumber = i3;
    }

    public int getBestScanEndOffset() {
        return this.mBestScanEndOffset;
    }

    public int getBestScanNumber() {
        return this.mBestScanNumber;
    }

    public boolean isEndMarkerRead() {
        return this.mEndMarkerRead;
    }

    public boolean isJpeg() {
        return this.mBytesParsed > 1 && this.mParserState != 6;
    }

    public boolean parseMoreData(EncodedImage encodedImage) {
        if (this.mParserState == 6 || encodedImage.getSize() <= this.mBytesParsed) {
            return false;
        }
        PooledByteArrayBufferedInputStream pooledByteArrayBufferedInputStream = new PooledByteArrayBufferedInputStream(encodedImage.getInputStreamOrThrow(), this.mByteArrayPool.get(16384), this.mByteArrayPool);
        try {
            StreamUtil.skip(pooledByteArrayBufferedInputStream, this.mBytesParsed);
            return doParseMoreData(pooledByteArrayBufferedInputStream);
        } catch (IOException e2) {
            Throwables.propagate(e2);
            return false;
        } finally {
            Closeables.closeQuietly(pooledByteArrayBufferedInputStream);
        }
    }
}
