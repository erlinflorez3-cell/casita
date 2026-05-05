package bo.app;

import com.braze.support.BrazeLogger;
import com.dynatrace.android.agent.Global;
import cz.msebera.android.httpclient.message.TokenParser;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class pr {

    /* JADX INFO: renamed from: o */
    public static final Pattern f1530o = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: p */
    public static final String f1531p = BrazeLogger.getBrazeLogTag((Class<?>) pr.class);

    /* JADX INFO: renamed from: q */
    public static final lr f1532q = new lr();

    /* JADX INFO: renamed from: a */
    public final File f1533a;

    /* JADX INFO: renamed from: b */
    public final File f1534b;

    /* JADX INFO: renamed from: c */
    public final File f1535c;

    /* JADX INFO: renamed from: d */
    public final File f1536d;

    /* JADX INFO: renamed from: i */
    public BufferedWriter f1541i;

    /* JADX INFO: renamed from: k */
    public int f1543k;

    /* JADX INFO: renamed from: h */
    public long f1540h = 0;

    /* JADX INFO: renamed from: j */
    public final LinkedHashMap f1542j = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: l */
    public long f1544l = 0;

    /* JADX INFO: renamed from: m */
    public final ThreadPoolExecutor f1545m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: n */
    public final kr f1546n = new kr(this);

    /* JADX INFO: renamed from: e */
    public final int f1537e = 1;

    /* JADX INFO: renamed from: g */
    public final int f1539g = 1;

    /* JADX INFO: renamed from: f */
    public final long f1538f = 52428800;

    public pr(File file) {
        this.f1533a = file;
        this.f1534b = new File(file, "journal");
        this.f1535c = new File(file, "journal.tmp");
        this.f1536d = new File(file, "journal.bkp");
    }

    public static pr a(File file) throws IOException {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file3)) {
                throw new IOException();
            }
        }
        pr prVar = new pr(file);
        if (prVar.f1534b.exists()) {
            try {
                prVar.c();
                prVar.b();
                return prVar;
            } catch (IOException e2) {
                BrazeLogger.w(f1531p, "DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                synchronized (prVar) {
                    if (prVar.f1541i != null) {
                        Iterator it = new ArrayList(prVar.f1542j.values()).iterator();
                        while (it.hasNext()) {
                            nr nrVar = ((vu) it.next()).f2069d;
                            if (nrVar != null) {
                                a(nrVar.f1394d, nrVar, false);
                            }
                        }
                        while (prVar.f1540h > prVar.f1538f) {
                            prVar.d((String) ((Map.Entry) prVar.f1542j.entrySet().iterator().next()).getKey());
                        }
                        prVar.f1541i.close();
                        prVar.f1541i = null;
                    }
                    di0.a(prVar.f1533a);
                }
            }
        }
        file.mkdirs();
        pr prVar2 = new pr(file);
        prVar2.d();
        return prVar2;
    }

    public static void a(pr prVar, nr nrVar, boolean z2) {
        synchronized (prVar) {
            vu vuVar = nrVar.f1391a;
            if (vuVar.f2069d != nrVar) {
                throw new IllegalStateException();
            }
            if (z2 && !vuVar.f2068c) {
                for (int i2 = 0; i2 < prVar.f1539g; i2++) {
                    if (!nrVar.f1392b[i2]) {
                        a(nrVar.f1394d, nrVar, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                    if (!vuVar.a(i2).exists()) {
                        a(nrVar.f1394d, nrVar, false);
                        return;
                    }
                }
            }
            for (int i3 = 0; i3 < prVar.f1539g; i3++) {
                File fileA = vuVar.a(i3);
                if (!z2) {
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException();
                    }
                } else if (fileA.exists()) {
                    File file = new File(vuVar.f2071f, vuVar.f2066a + "." + i3);
                    fileA.renameTo(file);
                    long j2 = vuVar.f2067b[i3];
                    long length = file.length();
                    vuVar.f2067b[i3] = length;
                    prVar.f1540h = (prVar.f1540h - j2) + length;
                }
            }
            prVar.f1543k++;
            vuVar.f2069d = null;
            boolean z3 = vuVar.f2068c;
            int i4 = ((z3 ? 1 : 0) + (z2 ? 1 : 0)) - ((z3 ? 1 : 0) & (z2 ? 1 : 0));
            boolean z4 = true;
            if (i4 != 1) {
                z4 = false;
            }
            if (z4) {
                vuVar.f2068c = true;
                BufferedWriter bufferedWriter = prVar.f1541i;
                StringBuilder sbAppend = new StringBuilder("CLEAN ").append(vuVar.f2066a);
                StringBuilder sb = new StringBuilder();
                for (long j3 : vuVar.f2067b) {
                    sb.append(TokenParser.SP).append(j3);
                }
                bufferedWriter.write(sbAppend.append(sb.toString()).append('\n').toString());
                if (z2) {
                    prVar.f1544l++;
                    vuVar.getClass();
                }
            } else {
                prVar.f1542j.remove(vuVar.f2066a);
                prVar.f1541i.write("REMOVE " + vuVar.f2066a + '\n');
            }
            prVar.f1541i.flush();
            if (prVar.f1540h > prVar.f1538f || prVar.a()) {
                prVar.f1545m.submit(prVar.f1546n);
            }
        }
    }

    public final nr a(String str) {
        synchronized (this) {
            if (this.f1541i == null) {
                throw new IllegalStateException("cache is closed");
            }
            if (!f1530o.matcher(str).matches()) {
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            vu vuVar = (vu) this.f1542j.get(str);
            if (vuVar == null) {
                vuVar = new vu(str, this.f1539g, this.f1533a);
                this.f1542j.put(str, vuVar);
            } else if (vuVar.f2069d != null) {
                return null;
            }
            nr nrVar = new nr(this, vuVar);
            vuVar.f2069d = nrVar;
            this.f1541i.write("DIRTY " + str + '\n');
            this.f1541i.flush();
            return nrVar;
        }
    }

    public final boolean a() {
        int i2 = this.f1543k;
        return i2 >= 2000 && i2 >= this.f1542j.size();
    }

    public final synchronized or b(String str) {
        InputStream inputStream;
        if (this.f1541i == null) {
            throw new IllegalStateException("cache is closed");
        }
        if (!f1530o.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
        vu vuVar = (vu) this.f1542j.get(str);
        if (vuVar == null) {
            return null;
        }
        if (!vuVar.f2068c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f1539g];
        for (int i2 = 0; i2 < this.f1539g; i2++) {
            try {
                inputStreamArr[i2] = new FileInputStream(new File(vuVar.f2071f, vuVar.f2066a + "." + i2));
            } catch (FileNotFoundException unused) {
                for (int i3 = 0; i3 < this.f1539g && (inputStream = inputStreamArr[i3]) != null; i3++) {
                    Charset charset = di0.f496a;
                    try {
                        inputStream.close();
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                    }
                }
                return null;
            }
        }
        this.f1543k++;
        this.f1541i.append((CharSequence) ("READ " + str + '\n'));
        if (a()) {
            this.f1545m.submit(this.f1546n);
        }
        return new or(inputStreamArr);
    }

    public final void b() throws IOException {
        File file = this.f1535c;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.f1542j.values().iterator();
        while (it.hasNext()) {
            vu vuVar = (vu) it.next();
            int i2 = 0;
            if (vuVar.f2069d == null) {
                while (i2 < this.f1539g) {
                    this.f1540h += vuVar.f2067b[i2];
                    i2++;
                }
            } else {
                vuVar.f2069d = null;
                while (i2 < this.f1539g) {
                    File file2 = new File(vuVar.f2071f, vuVar.f2066a + "." + i2);
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    File fileA = vuVar.a(i2);
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException();
                    }
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void c() {
        wc0 wc0Var = new wc0(new FileInputStream(this.f1534b), di0.f496a);
        try {
            String strA = wc0Var.a();
            String strA2 = wc0Var.a();
            String strA3 = wc0Var.a();
            String strA4 = wc0Var.a();
            String strA5 = wc0Var.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f1537e).equals(strA3) || !Integer.toString(this.f1539g).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + "]");
            }
            int i2 = 0;
            while (true) {
                try {
                    c(wc0Var.a());
                    i2++;
                } catch (EOFException unused) {
                    this.f1543k = i2 - this.f1542j.size();
                    if (wc0Var.f2134e == -1) {
                        d();
                    } else {
                        this.f1541i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f1534b, true), di0.f496a));
                    }
                    try {
                        wc0Var.close();
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                wc0Var.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void c(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i2 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i2);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i2);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f1542j.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i2, iIndexOf2);
        }
        vu vuVar = (vu) this.f1542j.get(strSubstring);
        if (vuVar == null) {
            vuVar = new vu(strSubstring, this.f1539g, this.f1533a);
            this.f1542j.put(strSubstring, vuVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                vuVar.f2069d = new nr(this, vuVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(Global.BLANK);
        vuVar.f2068c = true;
        vuVar.f2069d = null;
        if (strArrSplit.length != vuVar.f2070e) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
            try {
                vuVar.f2067b[i3] = Long.parseLong(strArrSplit[i3]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void d() {
        BufferedWriter bufferedWriter = this.f1541i;
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f1535c), di0.f496a));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f1537e));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f1539g));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (vu vuVar : this.f1542j.values()) {
                if (vuVar.f2069d != null) {
                    bufferedWriter2.write("DIRTY " + vuVar.f2066a + '\n');
                } else {
                    StringBuilder sbAppend = new StringBuilder().append("CLEAN ").append(vuVar.f2066a);
                    StringBuilder sb = new StringBuilder();
                    for (long j2 : vuVar.f2067b) {
                        sb.append(TokenParser.SP).append(j2);
                    }
                    bufferedWriter2.write(sbAppend.append(sb.toString()).append('\n').toString());
                }
            }
            bufferedWriter2.close();
            if (this.f1534b.exists()) {
                File file = this.f1534b;
                File file2 = this.f1536d;
                if (file2.exists() && !file2.delete()) {
                    throw new IOException();
                }
                if (!file.renameTo(file2)) {
                    throw new IOException();
                }
            }
            if (!this.f1535c.renameTo(this.f1534b)) {
                throw new IOException();
            }
            this.f1536d.delete();
            this.f1541i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f1534b, true), di0.f496a));
        } finally {
        }
    }

    public final synchronized void d(String str) {
        if (this.f1541i == null) {
            throw new IllegalStateException("cache is closed");
        }
        if (!f1530o.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
        vu vuVar = (vu) this.f1542j.get(str);
        if (vuVar != null && vuVar.f2069d == null) {
            for (int i2 = 0; i2 < this.f1539g; i2++) {
                File file = new File(vuVar.f2071f, vuVar.f2066a + "." + i2);
                if (file.exists() && !file.delete()) {
                    throw new IOException("failed to delete " + file);
                }
                long j2 = this.f1540h;
                long[] jArr = vuVar.f2067b;
                this.f1540h = j2 - jArr[i2];
                jArr[i2] = 0;
            }
            this.f1543k++;
            this.f1541i.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f1542j.remove(str);
            if (a()) {
                this.f1545m.submit(this.f1546n);
            }
        }
    }
}
