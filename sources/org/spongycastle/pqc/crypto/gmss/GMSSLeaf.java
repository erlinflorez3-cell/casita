package org.spongycastle.pqc.crypto.gmss;

import com.dynatrace.android.agent.Global;
import org.spongycastle.crypto.Digest;
import org.spongycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes2.dex */
public class GMSSLeaf {
    private byte[] concHashs;
    private GMSSRandom gmssRandom;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f28104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f28105j;
    private int keysize;
    private byte[] leaf;
    private int mdsize;
    private Digest messDigestOTS;
    byte[] privateKeyOTS;
    private byte[] seed;
    private int steps;
    private int two_power_w;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f28106w;

    GMSSLeaf(Digest digest, int i2, int i3) {
        this.f28106w = i2;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(this.messDigestOTS);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        double d2 = i2;
        int iCeil = (int) Math.ceil(((double) (digestSize << 3)) / d2);
        int iCeil2 = iCeil + ((int) Math.ceil(((double) getLog((iCeil << i2) + 1)) / d2));
        this.keysize = iCeil2;
        int i4 = 1 << i2;
        this.two_power_w = i4;
        this.steps = (int) Math.ceil(((double) ((((i4 - 1) * iCeil2) + 1) + iCeil2)) / ((double) i3));
        int i5 = this.mdsize;
        this.seed = new byte[i5];
        this.leaf = new byte[i5];
        this.privateKeyOTS = new byte[i5];
        this.concHashs = new byte[i5 * this.keysize];
    }

    public GMSSLeaf(Digest digest, int i2, int i3, byte[] bArr) {
        this.f28106w = i2;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(this.messDigestOTS);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        double d2 = i2;
        int iCeil = (int) Math.ceil(((double) (digestSize << 3)) / d2);
        int iCeil2 = iCeil + ((int) Math.ceil(((double) getLog((iCeil << i2) + 1)) / d2));
        this.keysize = iCeil2;
        int i4 = 1 << i2;
        this.two_power_w = i4;
        this.steps = (int) Math.ceil(((double) ((((i4 - 1) * iCeil2) + 1) + iCeil2)) / ((double) i3));
        int i5 = this.mdsize;
        this.seed = new byte[i5];
        this.leaf = new byte[i5];
        this.privateKeyOTS = new byte[i5];
        this.concHashs = new byte[i5 * this.keysize];
        initLeafCalc(bArr);
    }

    public GMSSLeaf(Digest digest, byte[][] bArr, int[] iArr) {
        this.f28104i = iArr[0];
        this.f28105j = iArr[1];
        this.steps = iArr[2];
        this.f28106w = iArr[3];
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(this.messDigestOTS);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        int iCeil = (int) Math.ceil(((double) (digestSize << 3)) / ((double) this.f28106w));
        this.keysize = iCeil + ((int) Math.ceil(((double) getLog((iCeil << this.f28106w) + 1)) / ((double) this.f28106w)));
        this.two_power_w = 1 << this.f28106w;
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.concHashs = bArr[2];
        this.leaf = bArr[3];
    }

    private GMSSLeaf(GMSSLeaf gMSSLeaf) {
        this.messDigestOTS = gMSSLeaf.messDigestOTS;
        this.mdsize = gMSSLeaf.mdsize;
        this.keysize = gMSSLeaf.keysize;
        this.gmssRandom = gMSSLeaf.gmssRandom;
        this.leaf = Arrays.clone(gMSSLeaf.leaf);
        this.concHashs = Arrays.clone(gMSSLeaf.concHashs);
        this.f28104i = gMSSLeaf.f28104i;
        this.f28105j = gMSSLeaf.f28105j;
        this.two_power_w = gMSSLeaf.two_power_w;
        this.f28106w = gMSSLeaf.f28106w;
        this.steps = gMSSLeaf.steps;
        this.seed = Arrays.clone(gMSSLeaf.seed);
        this.privateKeyOTS = Arrays.clone(gMSSLeaf.privateKeyOTS);
    }

    private int getLog(int i2) {
        int i3 = 1;
        int i4 = 2;
        while (i4 < i2) {
            i4 <<= 1;
            i3++;
        }
        return i3;
    }

    private void updateLeafCalc() {
        byte[] bArr = new byte[this.messDigestOTS.getDigestSize()];
        for (int i2 = 0; i2 < this.steps + 10000; i2++) {
            int i3 = this.f28104i;
            if (i3 == this.keysize && this.f28105j == this.two_power_w - 1) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.concHashs;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.leaf = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                return;
            }
            if (i3 == 0 || this.f28105j == this.two_power_w - 1) {
                this.f28104i = i3 + 1;
                this.f28105j = 0;
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else {
                Digest digest2 = this.messDigestOTS;
                byte[] bArr4 = this.privateKeyOTS;
                digest2.update(bArr4, 0, bArr4.length);
                this.privateKeyOTS = bArr;
                this.messDigestOTS.doFinal(bArr, 0);
                int i4 = this.f28105j + 1;
                this.f28105j = i4;
                if (i4 == this.two_power_w - 1) {
                    byte[] bArr5 = this.privateKeyOTS;
                    byte[] bArr6 = this.concHashs;
                    int i5 = this.mdsize;
                    System.arraycopy(bArr5, 0, bArr6, (this.f28104i - 1) * i5, i5);
                }
            }
        }
        throw new IllegalStateException("unable to updateLeaf in steps: " + this.steps + Global.BLANK + this.f28104i + Global.BLANK + this.f28105j);
    }

    public byte[] getLeaf() {
        return Arrays.clone(this.leaf);
    }

    public byte[][] getStatByte() {
        int i2 = this.mdsize;
        byte[][] bArr = {new byte[i2], new byte[i2], new byte[this.keysize * i2], new byte[i2]};
        bArr[0] = this.privateKeyOTS;
        bArr[1] = this.seed;
        bArr[2] = this.concHashs;
        bArr[3] = this.leaf;
        return bArr;
    }

    public int[] getStatInt() {
        return new int[]{this.f28104i, this.f28105j, this.steps, this.f28106w};
    }

    void initLeafCalc(byte[] bArr) {
        this.f28104i = 0;
        this.f28105j = 0;
        byte[] bArr2 = new byte[this.mdsize];
        System.arraycopy(bArr, 0, bArr2, 0, this.seed.length);
        this.seed = this.gmssRandom.nextSeed(bArr2);
    }

    GMSSLeaf nextLeaf() {
        GMSSLeaf gMSSLeaf = new GMSSLeaf(this);
        gMSSLeaf.updateLeafCalc();
        return gMSSLeaf;
    }

    public String toString() {
        String str = "";
        for (int i2 = 0; i2 < 4; i2++) {
            str = str + getStatInt()[i2] + Global.BLANK;
        }
        String str2 = str + Global.BLANK + this.mdsize + Global.BLANK + this.keysize + Global.BLANK + this.two_power_w + Global.BLANK;
        byte[][] statByte = getStatByte();
        for (int i3 = 0; i3 < 4; i3++) {
            str2 = statByte[i3] != null ? str2 + new String(Hex.encode(statByte[i3])) + Global.BLANK : str2 + "null ";
        }
        return str2;
    }
}
