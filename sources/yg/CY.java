package yg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class CY implements Enumeration, AutoCloseable {
    private final BufferedReader Yd;
    private final String ud;
    private String Xd = null;
    private boolean Kd = true;

    public CY(String str) throws IOException {
        File file = new File(C1561oA.ud("R\u0013\u0014\u0010\u0003M\u0011\u0002\b\u0001H\f\u0005w\u0006\b", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207798534)))));
        if (!file.exists() || !file.canRead()) {
            throw new IOException();
        }
        this.ud = str;
        this.Yd = new BufferedReader(new FileReader(file));
    }

    public CY(String str, String str2) {
        this.ud = str2;
        this.Yd = new BufferedReader(new StringReader(str));
    }

    private String Kd() throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String strXd = Xd();
            if (strXd == null) {
                this.Kd = false;
                return null;
            }
            if (od(strXd)) {
                if (strXd.contains(this.ud)) {
                    StringBuilder sbAppend = sb.append(strXd);
                    String strYd = C1561oA.Yd("\u007f", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207801401))));
                    sbAppend.append(strYd);
                    while (true) {
                        String strXd2 = Xd();
                        if (strXd2 == null) {
                            this.Kd = false;
                            break;
                        }
                        if (od(strXd2)) {
                            this.Xd = strXd2;
                            break;
                        }
                        if (ud(strXd2)) {
                            sb.append(strXd2).append(strYd);
                        }
                    }
                    return sb.toString();
                }
                Yd();
            }
        }
    }

    private boolean Qd(String str, int i2, int i3) {
        while (true) {
            boolean z2 = true;
            if (i2 >= i3) {
                return true;
            }
            char cCharAt = str.charAt(i2);
            if ((cCharAt < (1661649923 ^ 1661649971) || cCharAt > (C1607wl.Xd() ^ 1849955299)) && ((cCharAt < ((1529875920 ^ 211726752) ^ 1471069201) || cCharAt > ((2074851812 ^ 911956780) ^ 1307632302)) && (cCharAt < (C1580rY.Xd() ^ (-831067232)) || cCharAt > (FB.Xd() ^ 1609527157)))) {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            i2++;
        }
    }

    private String Xd() throws IOException {
        if (this.Xd == null) {
            return this.Yd.readLine();
        }
        String str = this.Xd;
        this.Xd = null;
        return str;
    }

    private void Yd() throws IOException {
        String strXd;
        do {
            strXd = Xd();
            if (strXd == null) {
                this.Kd = false;
                return;
            }
        } while (!od(strXd));
        this.Xd = strXd;
    }

    private boolean od(String str) {
        int iIndexOf = str.indexOf(ZN.Xd() ^ 864698077);
        return iIndexOf > 0 && iIndexOf < (C1499aX.Xd() ^ (-1134257931)) && iIndexOf < str.length() - 1 && Qd(str, 0, iIndexOf);
    }

    private boolean ud(String str) {
        char cCharAt;
        if (str.length() >= (830238531 ^ 830238535) && (cCharAt = str.charAt(0)) >= ((823412639 ^ 280559779) ^ 565004157) && cCharAt <= (966740242 ^ 966740296)) {
            return str.contains(C1561oA.yd("\u0002", (short) (C1607wl.Xd() ^ ((1482821099 ^ 349173156) ^ 1286453147))));
        }
        return false;
    }

    @Override // java.lang.AutoCloseable
    public void close() throws IOException {
        this.Kd = false;
        if (this.Yd != null) {
            this.Yd.close();
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.Kd;
    }

    @Override // java.util.Enumeration
    /* JADX INFO: renamed from: nX, reason: merged with bridge method [inline-methods] */
    public C1601vo nextElement() {
        if (!hasMoreElements()) {
            throw new NoSuchElementException();
        }
        String strKd = "";
        try {
            strKd = Kd();
            if (strKd == null) {
                throw new NoSuchElementException();
            }
        } catch (IOException e2) {
        }
        return new C1601vo(strKd);
    }
}
