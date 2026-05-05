package com.incode.recogkitandroid;

import androidx.core.view.ViewCompat;
import com.google.common.base.Ascii;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public class getConfig extends FilterInputStream {
    private static final short CameraConstants = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private byte[] IncodeCamera;
    private byte[] ProcessCameraProviderExtensionsKt;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private byte[] f3655e1;
    private int getAnalysisEvents;
    private int getAvailableCameraInternals;
    private int getCameraState;
    private int getConfig;
    private int getContext;
    private final int getExposureCompensationState;
    private int getFrameAnalyzerWrapper;
    private final int getImagePreview;
    private int getPreviewView;
    private int setConfig;
    private int setExposureCompensationState;
    private int startRecording;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public getConfig(InputStream inputStream, int[] iArr, int i2, byte[] bArr, int i3, int i4) throws IOException {
        this(inputStream, iArr, i2, bArr, i3, i4, 100, 100);
    }

    public getConfig(InputStream inputStream, int[] iArr, int i2, byte[] bArr, int i3, int i4, int i5, int i6) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.getContext = Integer.MAX_VALUE;
        this.startRecording = 1;
        this.ProcessCameraProviderExtensionsKt = new byte[8];
        this.IncodeCamera = new byte[8];
        this.f3655e1 = new byte[8];
        this.getAvailableCameraInternals = 8;
        this.getConfig = 8;
        this.setConfig = Math.min(Math.max(i3, 5), 16);
        this.getPreviewView = i4;
        if (i4 == 3) {
            System.arraycopy(bArr, 0, this.IncodeCamera, 0, 8);
        }
        long j2 = (((long) iArr[1]) & 4294967295L) | ((((long) iArr[0]) & 4294967295L) << 32);
        if (i2 == 0) {
            this.getFrameAnalyzerWrapper = (int) j2;
            long j3 = j2 >> 3;
            short s2 = CameraConstants;
            this.setExposureCompensationState = (int) ((((long) s2) * j3) >> 32);
            this.getAnalysisEvents = (int) (j2 >> 32);
            this.getCameraState = (int) (j3 + ((long) s2));
        } else {
            int i7 = (int) j2;
            this.getFrameAnalyzerWrapper = i7;
            this.setExposureCompensationState = i7 * i2;
            this.getAnalysisEvents = i2 ^ i7;
            this.getCameraState = (int) (j2 >> 32);
        }
        this.getImagePreview = i5;
        this.getExposureCompensationState = i6;
    }

    public getConfig(InputStream inputStream, int[] iArr, getPreviewView getpreviewview, int i2) throws IOException {
        this(inputStream, iArr, getpreviewview.CameraConstants, getpreviewview.ProcessCameraProviderExtensionsKt, i2, 3, 100, 100);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        ProcessCameraProviderExtensionsKt();
        int i2 = this.getAvailableCameraInternals;
        if (i2 >= this.getConfig) {
            return -1;
        }
        byte[] bArr = this.ProcessCameraProviderExtensionsKt;
        this.getAvailableCameraInternals = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = i2 + i3;
        for (int i5 = i2; i5 < i4; i5++) {
            ProcessCameraProviderExtensionsKt();
            int i6 = this.getAvailableCameraInternals;
            if (i6 >= this.getConfig) {
                if (i5 == i2) {
                    return -1;
                }
                return i3 - (i4 - i5);
            }
            byte[] bArr2 = this.ProcessCameraProviderExtensionsKt;
            this.getAvailableCameraInternals = i6 + 1;
            bArr[i5] = bArr2[i6];
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long j3 = 0;
        while (j3 < j2 && read() != -1) {
            j3++;
        }
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        ProcessCameraProviderExtensionsKt();
        return this.getConfig - this.getAvailableCameraInternals;
    }

    private void getAvailableCameraInternals() {
        if (this.getPreviewView == 3) {
            byte[] bArr = this.ProcessCameraProviderExtensionsKt;
            System.arraycopy(bArr, 0, this.f3655e1, 0, bArr.length);
        }
        byte[] bArr2 = this.ProcessCameraProviderExtensionsKt;
        int i2 = ((bArr2[0] << Ascii.CAN) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i3 = ((-16777216) & (bArr2[4] << Ascii.CAN)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i4 = 0;
        while (true) {
            int i5 = this.setConfig;
            if (i4 >= i5) {
                break;
            }
            short s2 = CameraConstants;
            i3 -= ((((i5 - i4) * s2) + i2) ^ ((i2 << 4) + this.getAnalysisEvents)) ^ ((i2 >>> 5) + this.getCameraState);
            i2 -= (((i3 << 4) + this.getFrameAnalyzerWrapper) ^ ((s2 * (i5 - i4)) + i3)) ^ ((i3 >>> 5) + this.setExposureCompensationState);
            i4++;
        }
        byte[] bArr3 = this.ProcessCameraProviderExtensionsKt;
        bArr3[0] = (byte) (i2 >> 24);
        bArr3[1] = (byte) (i2 >> 16);
        bArr3[2] = (byte) (i2 >> 8);
        bArr3[3] = (byte) i2;
        bArr3[4] = (byte) (i3 >> 24);
        bArr3[5] = (byte) (i3 >> 16);
        bArr3[6] = (byte) (i3 >> 8);
        bArr3[7] = (byte) i3;
        if (this.getPreviewView == 3) {
            for (int i6 = 0; i6 < 8; i6++) {
                byte[] bArr4 = this.ProcessCameraProviderExtensionsKt;
                bArr4[i6] = (byte) (bArr4[i6] ^ this.IncodeCamera[i6]);
            }
            byte[] bArr5 = this.f3655e1;
            System.arraycopy(bArr5, 0, this.IncodeCamera, 0, bArr5.length);
        }
    }

    private int ProcessCameraProviderExtensionsKt() throws IOException {
        if (this.getContext == Integer.MAX_VALUE) {
            this.getContext = ((FilterInputStream) this).in.read();
        }
        if (this.getAvailableCameraInternals == 8) {
            byte[] bArr = this.ProcessCameraProviderExtensionsKt;
            int i2 = this.getContext;
            bArr[0] = (byte) i2;
            if (i2 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i3 = 1;
            do {
                int i4 = ((FilterInputStream) this).in.read(this.ProcessCameraProviderExtensionsKt, i3, 8 - i3);
                if (i4 <= 0) {
                    break;
                }
                i3 += i4;
            } while (i3 < 8);
            if (i3 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i5 = this.getImagePreview;
            if (i5 == this.getExposureCompensationState) {
                getAvailableCameraInternals();
            } else {
                if (this.startRecording <= i5) {
                    getAvailableCameraInternals();
                }
                int i6 = this.startRecording;
                if (i6 < this.getExposureCompensationState) {
                    this.startRecording = i6 + 1;
                } else {
                    this.startRecording = 1;
                }
            }
            int i7 = ((FilterInputStream) this).in.read();
            this.getContext = i7;
            this.getAvailableCameraInternals = 0;
            this.getConfig = i7 < 0 ? 8 - (this.ProcessCameraProviderExtensionsKt[7] & 255) : 8;
        }
        return this.getConfig;
    }
}
