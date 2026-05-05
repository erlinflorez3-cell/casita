package yg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class JB implements Enumeration {
    public Iterator<String> Kd;
    public HashSet<String> Xd;

    public JB() throws IOException {
        JX(new File(Wg.vd("6x{yf3xk{v@\u007fl|\u0001", (short) (C1607wl.Xd() ^ (C1607wl.Xd() ^ (32566127 ^ 1874130388))))));
    }

    public JB(String str) {
        eK(str);
    }

    public void JX(File file) throws IOException {
        if (file == null) {
            throw new FileNotFoundException();
        }
        this.Xd = new HashSet<>();
        FileReader fileReader = new FileReader(file);
        try {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        fileReader.close();
                        this.Kd = this.Xd.iterator();
                        return;
                    }
                    XK(line);
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                fileReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.util.Enumeration
    /* JADX INFO: renamed from: UX, reason: merged with bridge method [inline-methods] */
    public String nextElement() {
        return this.Kd.next();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void XK(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.JB.XK(java.lang.String):void");
    }

    public void eK(String str) {
        this.Xd = new HashSet<>();
        for (String str2 : str.split(Qg.kd("Yn:Vg", (short) (C1499aX.Xd() ^ (11224661 ^ (-11235831))), (short) (C1499aX.Xd() ^ (C1633zX.Xd() ^ (1166609208 ^ 836270839)))))) {
            XK(str2);
        }
        this.Kd = this.Xd.iterator();
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.Kd.hasNext();
    }
}
