package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.UnpackingSoSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public final class ExoSoSource extends UnpackingSoSource {

    private final class ExoUnpacker extends UnpackingSoSource.Unpacker {
        private final FileDso[] mDsos;
        final /* synthetic */ ExoSoSource this$0;

        ExoUnpacker(ExoSoSource exoSoSource, UnpackingSoSource unpackingSoSource) throws Throwable {
            BufferedReader bufferedReader;
            String strWd = Ig.wd("\u001f.:", (short) (C1499aX.Xd() ^ (-4369)));
            this.this$0 = exoSoSource;
            Context context = exoSoSource.mContext;
            short sXd = (short) (C1633zX.Xd() ^ (-22105));
            int[] iArr = new int["\f\fVNB<\"U(6;$4+:\u001b\u001e\u0013R_\u000fU\f\u0006*P8".length()];
            QB qb = new QB("\f\fVNB<\"U(6;$4+:\u001b\u001e\u0013R_\u000fU\f\u0006*P8");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            StringBuilder sb = new StringBuilder(new String(iArr, 0, i2));
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Qd("$0%2.'!i\u001e)',\u001c$)au!\u001f$\u0014&!", (short) (ZN.Xd() ^ 22635))).getMethod(C1593ug.zd("\u0014\u0013#\u007f\u0012\u0015\u001e\u0015\u001c\u001b\u0005\u0019&\u001f", (short) (ZN.Xd() ^ 23433), (short) (ZN.Xd() ^ 5116)), new Class[0]);
            try {
                method.setAccessible(true);
                File file = new File(sb.append((String) method.invoke(context, objArr)).append(C1561oA.od("\nH:L@L:\u0001?;3C}", (short) (Od.Xd() ^ (-8725)))).toString());
                ArrayList arrayList = new ArrayList();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                String[] supportedAbis = SysUtil.getSupportedAbis();
                int length = supportedAbis.length;
                int i3 = 0;
                int i4 = 0;
                while (i4 < length) {
                    String str = supportedAbis[i4];
                    File file2 = new File(file, str);
                    if (file2.isDirectory()) {
                        linkedHashSet.add(str);
                        File file3 = new File(file2, C1561oA.Kd("81A/31E3\u0001HMJ", (short) (OY.Xd() ^ 6760)));
                        if (file3.isFile()) {
                            FileReader fileReader = new FileReader(file3);
                            try {
                                bufferedReader = new BufferedReader(fileReader);
                            } catch (Throwable th) {
                                try {
                                    fileReader.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                            while (true) {
                                try {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        bufferedReader.close();
                                        fileReader.close();
                                        break;
                                    }
                                    if (line.length() != 0) {
                                        int iIndexOf = line.indexOf(32);
                                        if (iIndexOf == -1) {
                                            throw new RuntimeException(Wg.Zd("SwlLC4$P\bme\u00065u_\b:6 \nmh\u0016zuZ\n@+3\u0003vh#\u0005D\u001fS", (short) (C1580rY.Xd() ^ (-10760)), (short) (C1580rY.Xd() ^ (-19876))) + line + C1561oA.Xd(">", (short) (Od.Xd() ^ (-32159))));
                                        }
                                        String str2 = line.substring(i3, iIndexOf) + strWd;
                                        int size = arrayList.size();
                                        while (true) {
                                            if (i3 >= size) {
                                                String strSubstring = line.substring(iIndexOf + 1);
                                                arrayList.add(new FileDso(str2, strSubstring.substring(strSubstring.indexOf(45), strSubstring.indexOf(strWd)), new File(file2, strSubstring)));
                                                break;
                                            } else if (((FileDso) arrayList.get(i3)).name.equals(str2)) {
                                                break;
                                            } else {
                                                i3++;
                                            }
                                        }
                                        i3 = 0;
                                    }
                                } finally {
                                }
                                fileReader.close();
                                throw th;
                            }
                        }
                        continue;
                    }
                    i4++;
                    i3 = 0;
                }
                unpackingSoSource.setSoSourceAbis((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
                this.mDsos = (FileDso[]) arrayList.toArray(new FileDso[arrayList.size()]);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        @Override // com.facebook.soloader.UnpackingSoSource.Unpacker
        public UnpackingSoSource.Dso[] getDsos() throws IOException {
            return this.mDsos;
        }

        @Override // com.facebook.soloader.UnpackingSoSource.Unpacker
        public void unpack(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (FileDso fileDso : this.mDsos) {
                FileInputStream fileInputStream = new FileInputStream(fileDso.backingFile);
                try {
                    UnpackingSoSource.InputDso inputDso = new UnpackingSoSource.InputDso(fileDso, fileInputStream);
                    try {
                        extractDso(inputDso, bArr, file);
                        inputDso.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            }
        }
    }

    private static final class FileDso extends UnpackingSoSource.Dso {
        final File backingFile;

        FileDso(String str, String str2, File file) {
            super(str, str2);
            this.backingFile = file;
        }
    }

    public ExoSoSource(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.UnpackingSoSource
    protected MessageDigest getHashingAlgorithm() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-1");
    }

    @Override // com.facebook.soloader.DirectorySoSource, com.facebook.soloader.SoSource
    public String getName() {
        return "ExoSoSource";
    }

    @Override // com.facebook.soloader.UnpackingSoSource
    protected UnpackingSoSource.Unpacker makeUnpacker() throws IOException {
        return new ExoUnpacker(this, this);
    }
}
