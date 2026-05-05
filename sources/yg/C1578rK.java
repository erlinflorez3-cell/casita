package yg;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.cert.X509Certificate;
import java.util.List;

/* JADX INFO: renamed from: yg.rK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1578rK {
    public static List<X509Certificate[]> Xd(RandomAccessFile randomAccessFile) throws C1539jX, IOException, SecurityException {
        C1605wK c1605wKYd;
        try {
            c1605wKYd = Ig.yd(randomAccessFile, Od.Xd() ^ (914702107 ^ (-2127838322)));
        } catch (C1539jX e2) {
            c1605wKYd = Ig.yd(randomAccessFile, 78757911 ^ 1975011085);
        }
        return Jg.ud(c1605wKYd);
    }
}
