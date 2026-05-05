package org.spongycastle.crypto.engines;

import androidx.core.view.ViewCompat;
import androidx.webkit.Profile;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.common.base.Ascii;
import java.util.Hashtable;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithSBox;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public class GOST28147Engine implements BlockCipher {
    protected static final int BLOCK_SIZE = 8;
    private boolean forEncryption;
    private static byte[] Sbox_Default = {4, 10, 9, 2, Ascii.CR, 8, 0, Ascii.SO, 6, Ascii.VT, 1, Ascii.FF, 7, Ascii.SI, 5, 3, Ascii.SO, Ascii.VT, 4, Ascii.FF, 6, Ascii.CR, Ascii.SI, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, Ascii.CR, 10, 3, 4, 2, Ascii.SO, Ascii.SI, Ascii.FF, 7, 6, 0, 9, Ascii.VT, 7, Ascii.CR, 10, 1, 0, 8, 9, Ascii.SI, Ascii.SO, 4, 6, Ascii.FF, Ascii.VT, 2, 5, 3, 6, Ascii.FF, 7, 1, 5, Ascii.SI, Ascii.CR, 8, 4, 10, 9, Ascii.SO, 0, 3, Ascii.VT, 2, 4, Ascii.VT, 10, 0, 7, 2, 1, Ascii.CR, 3, 6, 8, 5, 9, Ascii.FF, Ascii.SI, Ascii.SO, Ascii.CR, Ascii.VT, 4, 1, 3, Ascii.SI, 5, 9, 0, 10, Ascii.SO, 7, 6, 8, 2, Ascii.FF, 1, Ascii.SI, Ascii.CR, 0, 5, 7, 10, 4, 9, 2, 3, Ascii.SO, 6, Ascii.VT, 8, Ascii.FF};
    private static byte[] ESbox_Test = {4, 2, Ascii.SI, 5, 9, 1, 0, 8, Ascii.SO, 3, Ascii.VT, Ascii.FF, Ascii.CR, 7, 10, 6, Ascii.FF, 9, Ascii.SI, Ascii.SO, 8, 1, 3, 10, 2, 7, 4, Ascii.CR, 6, 0, Ascii.VT, 5, Ascii.CR, 8, Ascii.SO, Ascii.FF, 7, 3, 9, 10, 1, 5, 2, 4, 6, Ascii.SI, 0, Ascii.VT, Ascii.SO, 9, Ascii.VT, 2, 5, Ascii.SI, 7, 1, 0, Ascii.CR, Ascii.FF, 6, 10, 4, 3, 8, 3, Ascii.SO, 5, 9, 6, 8, 0, Ascii.CR, 10, Ascii.VT, 7, Ascii.FF, 2, 1, Ascii.SI, 4, 8, Ascii.SI, 6, Ascii.VT, 1, 9, Ascii.FF, 5, Ascii.CR, 3, 7, 10, 0, Ascii.SO, 2, 4, 9, Ascii.VT, Ascii.FF, 0, 3, 6, 7, 5, 4, 8, Ascii.SO, Ascii.SI, 1, 10, 2, Ascii.CR, Ascii.FF, 6, 5, 2, Ascii.VT, 0, 9, Ascii.CR, 3, Ascii.SO, 7, 10, Ascii.SI, 4, 1, 8};
    private static byte[] ESbox_A = {9, 6, 3, 2, 8, Ascii.VT, 1, 7, 10, 4, Ascii.SO, Ascii.SI, Ascii.FF, 0, Ascii.CR, 5, 3, 7, Ascii.SO, 9, 8, 10, Ascii.SI, 0, 5, 2, 6, Ascii.FF, Ascii.VT, 4, Ascii.CR, 1, Ascii.SO, 4, 6, 2, Ascii.VT, 3, Ascii.CR, 8, Ascii.FF, Ascii.SI, 5, 10, 0, 7, 1, 9, Ascii.SO, 7, 10, Ascii.FF, Ascii.CR, 1, 3, 9, 0, 2, Ascii.VT, 4, Ascii.SI, 8, 5, 6, Ascii.VT, 5, 1, 9, 8, Ascii.CR, Ascii.SI, 0, Ascii.SO, 4, 2, 3, Ascii.FF, 7, 10, 6, 3, 10, Ascii.CR, Ascii.FF, 1, 2, 0, Ascii.VT, 7, 5, 9, 4, 8, Ascii.SI, Ascii.SO, 6, 1, Ascii.CR, 2, 9, 7, 10, 6, 0, 8, Ascii.FF, 4, 5, Ascii.SI, 3, Ascii.VT, Ascii.SO, Ascii.VT, 10, Ascii.SI, 5, 0, Ascii.FF, Ascii.SO, 8, 6, 2, 3, 9, 1, 7, Ascii.CR, 4};
    private static byte[] ESbox_B = {8, 4, Ascii.VT, 1, 3, 5, 0, 9, 2, Ascii.SO, 10, Ascii.FF, Ascii.CR, 6, 7, Ascii.SI, 0, 1, 2, 10, 4, Ascii.CR, 5, Ascii.FF, 9, 7, 3, Ascii.SI, Ascii.VT, 8, 6, Ascii.SO, Ascii.SO, Ascii.FF, 0, 10, 9, 2, Ascii.CR, Ascii.VT, 7, 5, 8, Ascii.SI, 3, 6, 1, 4, 7, 5, 0, Ascii.CR, Ascii.VT, 6, 1, 2, 3, 10, Ascii.FF, Ascii.SI, 4, Ascii.SO, 9, 8, 2, 7, Ascii.FF, Ascii.SI, 9, 5, 10, Ascii.VT, 1, 4, 0, Ascii.CR, 6, 8, Ascii.SO, 3, 8, 3, 2, 6, 4, Ascii.CR, Ascii.SO, Ascii.VT, Ascii.FF, 1, 7, Ascii.SI, 10, 0, 9, 5, 5, 2, 10, Ascii.VT, 9, 1, Ascii.FF, 3, 7, 4, Ascii.CR, 0, 6, Ascii.SI, 8, Ascii.SO, 0, 4, Ascii.VT, Ascii.SO, 8, 3, 7, 1, 10, 2, 9, 6, Ascii.SI, Ascii.CR, 5, Ascii.FF};
    private static byte[] ESbox_C = {1, Ascii.VT, Ascii.FF, 2, 9, Ascii.CR, 0, Ascii.SI, 4, 5, 8, Ascii.SO, 10, 7, 6, 3, 0, 1, 7, Ascii.CR, Ascii.VT, 4, 5, 2, 8, Ascii.SO, Ascii.SI, Ascii.FF, 9, 10, 6, 3, 8, 2, 5, 0, 4, 9, Ascii.SI, 10, 3, 7, Ascii.FF, Ascii.CR, 6, Ascii.SO, 1, Ascii.VT, 3, 6, 0, 1, 5, Ascii.CR, 10, 8, Ascii.VT, 2, 9, 7, Ascii.SO, Ascii.SI, Ascii.FF, 4, 8, Ascii.CR, Ascii.VT, 0, 4, 5, 1, 2, 9, 3, Ascii.FF, Ascii.SO, 6, Ascii.SI, 10, 7, Ascii.FF, 9, Ascii.VT, 1, 8, Ascii.SO, 2, 4, 7, 3, 6, 5, 10, 0, Ascii.SI, Ascii.CR, 10, 9, 6, 8, Ascii.CR, Ascii.SO, 2, 0, Ascii.SI, 3, 5, Ascii.VT, 4, 1, Ascii.FF, 7, 7, 4, 0, 5, 10, 2, Ascii.SI, Ascii.SO, Ascii.FF, 6, 1, Ascii.VT, Ascii.CR, 9, 3, 8};
    private static byte[] ESbox_D = {Ascii.SI, Ascii.FF, 2, 10, 6, 4, 5, 0, 7, 9, Ascii.SO, Ascii.CR, 1, Ascii.VT, 8, 3, Ascii.VT, 6, 3, 4, Ascii.FF, Ascii.SI, Ascii.SO, 2, 7, Ascii.CR, 8, 0, 5, 10, 9, 1, 1, Ascii.FF, Ascii.VT, 0, Ascii.SI, Ascii.SO, 6, 5, 10, Ascii.CR, 4, 8, 9, 3, 7, 2, 1, 5, Ascii.SO, Ascii.FF, 10, 7, 0, Ascii.CR, 6, 2, Ascii.VT, 4, 9, 3, Ascii.SI, 8, 0, Ascii.FF, 8, 9, Ascii.CR, 2, 10, Ascii.VT, 7, 3, 6, 5, 4, Ascii.SO, Ascii.SI, 1, 8, 0, Ascii.SI, 3, 2, 5, Ascii.SO, Ascii.VT, 1, 10, 4, 7, Ascii.FF, 9, Ascii.CR, 6, 3, 0, 6, Ascii.SI, 1, Ascii.SO, 9, 2, Ascii.CR, 8, Ascii.FF, 4, Ascii.VT, 10, 5, 7, 1, 10, 6, 8, Ascii.SI, Ascii.VT, 0, 4, Ascii.FF, 3, 5, 9, 7, Ascii.CR, 2, Ascii.SO};
    private static byte[] DSbox_Test = {4, 10, 9, 2, Ascii.CR, 8, 0, Ascii.SO, 6, Ascii.VT, 1, Ascii.FF, 7, Ascii.SI, 5, 3, Ascii.SO, Ascii.VT, 4, Ascii.FF, 6, Ascii.CR, Ascii.SI, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, Ascii.CR, 10, 3, 4, 2, Ascii.SO, Ascii.SI, Ascii.FF, 7, 6, 0, 9, Ascii.VT, 7, Ascii.CR, 10, 1, 0, 8, 9, Ascii.SI, Ascii.SO, 4, 6, Ascii.FF, Ascii.VT, 2, 5, 3, 6, Ascii.FF, 7, 1, 5, Ascii.SI, Ascii.CR, 8, 4, 10, 9, Ascii.SO, 0, 3, Ascii.VT, 2, 4, Ascii.VT, 10, 0, 7, 2, 1, Ascii.CR, 3, 6, 8, 5, 9, Ascii.FF, Ascii.SI, Ascii.SO, Ascii.CR, Ascii.VT, 4, 1, 3, Ascii.SI, 5, 9, 0, 10, Ascii.SO, 7, 6, 8, 2, Ascii.FF, 1, Ascii.SI, Ascii.CR, 0, 5, 7, 10, 4, 9, 2, 3, Ascii.SO, 6, Ascii.VT, 8, Ascii.FF};
    private static byte[] DSbox_A = {10, 4, 5, 6, 8, 1, 3, 7, Ascii.CR, Ascii.FF, Ascii.SO, 0, 9, 2, Ascii.VT, Ascii.SI, 5, Ascii.SI, 4, 0, 2, Ascii.CR, Ascii.VT, 9, 1, 7, 6, 3, Ascii.FF, Ascii.SO, 10, 8, 7, Ascii.SI, Ascii.FF, Ascii.SO, 9, 4, 1, 0, 3, Ascii.VT, 5, 2, 6, 10, 8, Ascii.CR, 4, 10, 7, Ascii.FF, 0, Ascii.SI, 2, 8, Ascii.SO, 1, 6, 5, Ascii.CR, Ascii.VT, 9, 3, 7, 6, 4, Ascii.VT, 9, Ascii.FF, 2, 10, 1, 8, 0, Ascii.SO, Ascii.SI, Ascii.CR, 3, 5, 7, 6, 2, 4, Ascii.CR, 9, Ascii.SI, 0, 10, 1, 5, Ascii.VT, 8, Ascii.SO, Ascii.FF, 3, Ascii.CR, Ascii.SO, 4, 1, 7, 0, 5, 10, 3, Ascii.FF, 8, Ascii.SI, 6, 2, 9, Ascii.VT, 1, 3, 10, 9, 5, Ascii.VT, 4, Ascii.SI, 8, 6, 7, Ascii.SO, Ascii.CR, 0, 2, Ascii.FF};
    private static Hashtable sBoxes = new Hashtable();
    private int[] workingKey = null;
    private byte[] S = Sbox_Default;

    static {
        addSBox(Profile.DEFAULT_PROFILE_NAME, Sbox_Default);
        addSBox("E-TEST", ESbox_Test);
        addSBox("E-A", ESbox_A);
        addSBox("E-B", ESbox_B);
        addSBox("E-C", ESbox_C);
        addSBox("E-D", ESbox_D);
        addSBox("D-TEST", DSbox_Test);
        addSBox("D-A", DSbox_A);
    }

    private void GOST28147Func(int[] iArr, byte[] bArr, int i2, byte[] bArr2, int i3) {
        int iBytesToint = bytesToint(bArr, i2);
        int iBytesToint2 = bytesToint(bArr, i2 + 4);
        int i4 = 7;
        if (this.forEncryption) {
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = 0;
                while (i6 < 8) {
                    int iGOST28147_mainStep = iBytesToint2 ^ GOST28147_mainStep(iBytesToint, iArr[i6]);
                    i6++;
                    int i7 = iBytesToint;
                    iBytesToint = iGOST28147_mainStep;
                    iBytesToint2 = i7;
                }
            }
            while (i4 > 0) {
                int iGOST28147_mainStep2 = iBytesToint2 ^ GOST28147_mainStep(iBytesToint, iArr[i4]);
                i4--;
                iBytesToint2 = iBytesToint;
                iBytesToint = iGOST28147_mainStep2;
            }
        } else {
            int i8 = 0;
            while (i8 < 8) {
                int iGOST28147_mainStep3 = iBytesToint2 ^ GOST28147_mainStep(iBytesToint, iArr[i8]);
                i8++;
                int i9 = iBytesToint;
                iBytesToint = iGOST28147_mainStep3;
                iBytesToint2 = i9;
            }
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = 7;
                while (i11 >= 0 && (i10 != 2 || i11 != 0)) {
                    int iGOST28147_mainStep4 = iBytesToint2 ^ GOST28147_mainStep(iBytesToint, iArr[i11]);
                    i11--;
                    iBytesToint2 = iBytesToint;
                    iBytesToint = iGOST28147_mainStep4;
                }
            }
        }
        int iGOST28147_mainStep5 = GOST28147_mainStep(iBytesToint, iArr[0]) ^ iBytesToint2;
        intTobytes(iBytesToint, bArr2, i3);
        intTobytes(iGOST28147_mainStep5, bArr2, i3 + 4);
    }

    private int GOST28147_mainStep(int i2, int i3) {
        int i4 = i3 + i2;
        byte[] bArr = this.S;
        int i5 = i4 >> 4;
        int i6 = bArr[15 & i4] + (bArr[((i5 + 15) - (i5 | 15)) + 16] << 4) + (bArr[((-1) - (((-1) - (i4 >> 8)) | ((-1) - 15))) + 32] << 8) + (bArr[((i4 >> 12) & 15) + 48] << Ascii.FF) + (bArr[((i4 >> 16) & 15) + 64] << 16) + (bArr[((-1) - (((-1) - (i4 >> 20)) | ((-1) - 15))) + 80] << Ascii.DC4);
        int i7 = i4 >> 24;
        int i8 = i6 + (bArr[((i7 + 15) - (i7 | 15)) + 96] << Ascii.CAN) + (bArr[((-1) - (((-1) - (i4 >> 28)) | ((-1) - 15))) + PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION] << Ascii.FS);
        return (-1) - (((-1) - (i8 << 11)) & ((-1) - (i8 >>> 21)));
    }

    private static void addSBox(String str, byte[] bArr) {
        sBoxes.put(Strings.toUpperCase(str), bArr);
    }

    private int bytesToint(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] << Ascii.CAN) & ViewCompat.MEASURED_STATE_MASK) + ((-1) - (((-1) - (bArr[i2 + 2] << 16)) | ((-1) - 16711680))) + ((bArr[i2 + 1] << 8) & 65280) + (bArr[i2] & 255);
    }

    private int[] generateWorkingKey(boolean z2, byte[] bArr) {
        this.forEncryption = z2;
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
        }
        int[] iArr = new int[8];
        for (int i2 = 0; i2 != 8; i2++) {
            iArr[i2] = bytesToint(bArr, i2 * 4);
        }
        return iArr;
    }

    public static byte[] getSBox(String str) {
        byte[] bArr = (byte[]) sBoxes.get(Strings.toUpperCase(str));
        if (bArr != null) {
            return Arrays.clone(bArr);
        }
        throw new IllegalArgumentException("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"D-Test\", \"D-A\".");
    }

    private void intTobytes(int i2, byte[] bArr, int i3) {
        bArr[i3 + 3] = (byte) (i2 >>> 24);
        bArr[i3 + 2] = (byte) (i2 >>> 16);
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3] = (byte) i2;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "GOST28147";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithSBox)) {
            if (cipherParameters instanceof KeyParameter) {
                this.workingKey = generateWorkingKey(z2, ((KeyParameter) cipherParameters).getKey());
                return;
            } else {
                if (cipherParameters != null) {
                    throw new IllegalArgumentException("invalid parameter passed to GOST28147 init - " + cipherParameters.getClass().getName());
                }
                return;
            }
        }
        ParametersWithSBox parametersWithSBox = (ParametersWithSBox) cipherParameters;
        byte[] sBox = parametersWithSBox.getSBox();
        if (sBox.length != Sbox_Default.length) {
            throw new IllegalArgumentException("invalid S-box passed to GOST28147 init");
        }
        this.S = Arrays.clone(sBox);
        if (parametersWithSBox.getParameters() != null) {
            this.workingKey = generateWorkingKey(z2, ((KeyParameter) parametersWithSBox.getParameters()).getKey());
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i2, byte[] bArr2, int i3) {
        int[] iArr = this.workingKey;
        if (iArr == null) {
            throw new IllegalStateException("GOST28147 engine not initialised");
        }
        if (i2 + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i3 + 8 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        GOST28147Func(iArr, bArr, i2, bArr2, i3);
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}
