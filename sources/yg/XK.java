package yg;

import java.io.File;
import java.util.Enumeration;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public class XK implements Enumeration {
    public StringTokenizer Xd;

    public XK() throws IllegalArgumentException {
        LK(System.getProperty(C1561oA.ud("8.B,w,4(98q3#5(", (short) (C1499aX.Xd() ^ (1597989826 ^ (-1597982921))))));
    }

    public XK(String str) throws IllegalArgumentException {
        LK(str);
    }

    public void LK(String str) throws IllegalArgumentException {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.Xd = new StringTokenizer(str, File.pathSeparator);
    }

    @Override // java.util.Enumeration
    /* JADX INFO: renamed from: cK, reason: merged with bridge method [inline-methods] */
    public String nextElement() {
        return this.Xd.nextToken();
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.Xd.hasMoreElements();
    }
}
