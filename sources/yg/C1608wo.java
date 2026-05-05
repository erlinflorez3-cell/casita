package yg;

import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yg.wo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1608wo implements Enumeration {
    public List<String> Kd;
    public Iterator<String> Xd;

    public C1608wo(String str) {
        this.Kd = new ArrayList();
        File file = new File(str);
        if (file.exists()) {
            Xd(file, false);
        }
        this.Xd = this.Kd.iterator();
    }

    public C1608wo(String str, boolean z2) {
        this.Kd = new ArrayList();
        File file = new File(str);
        if (file.exists()) {
            Xd(file, z2);
        }
        this.Xd = this.Kd.iterator();
    }

    public C1608wo(List<String> list) {
        this.Kd = new ArrayList();
        this.Kd = list;
        this.Xd = list.iterator();
    }

    private void Xd(File file, boolean z2) {
        this.Kd.add(file.getAbsolutePath());
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (!file2.isDirectory()) {
                this.Kd.add(file2.getAbsolutePath());
            } else if (z2) {
                Xd(file2, true);
            }
        }
    }

    @Override // java.util.Enumeration
    /* JADX INFO: renamed from: VY, reason: merged with bridge method [inline-methods] */
    public String nextElement() {
        return this.Xd.next();
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.Xd.hasNext();
    }
}
