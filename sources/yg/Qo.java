package yg;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Qo implements Enumeration {
    public Iterator<String> Kd;
    public ArrayList<String> Xd;

    public Qo() throws IllegalStateException, IllegalArgumentException {
        short sXd = (short) (C1633zX.Xd() ^ ((1289687844 ^ 331136994) ^ (-1600372243)));
        int[] iArr = new int["\u0015\u0015\\ \u001c\u000e!W\n\u0016\u000b\u0018\u0014\r\u0007O\u0019\u0010\u000e\u0011\u0002\u007fHq\t\u0007\nzxU\u0005z574".length()];
        QB qb = new QB("\u0015\u0015\\ \u001c\u000e!W\n\u0016\u000b\u0018\u0014\r\u0007O\u0019\u0010\u000e\u0011\u0002\u007fHq\t\u0007\nzxU\u0005z574");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        NK(new String(iArr, 0, i2));
    }

    public Qo(String str) throws IllegalStateException, IllegalArgumentException {
        NK(str);
    }

    public void NK(String str) throws IllegalStateException, IllegalArgumentException {
        Field declaredField;
        this.Xd = new ArrayList<>();
        try {
            Class<?> cls = Class.forName(str);
            try {
                declaredField = cls.getDeclaredField(Qg.kd("N\"HGB;9!8F9?3\u0011.87,*+29", (short) (C1499aX.Xd() ^ ((1287372422 ^ 1857332827) ^ (-571432717))), (short) (C1499aX.Xd() ^ (351890177 ^ (-351878256)))));
            } catch (NoSuchFieldException e2) {
                try {
                    declaredField = cls.getDeclaredField(hg.Vd("$*)$\u001d\u001b\u0003\u001a(\u001b!\u0015r\u0010\u001a\u0019\u000e\f\r\u0014\u001b", (short) (C1607wl.Xd() ^ (868695629 ^ 868695152)), (short) (C1607wl.Xd() ^ ((40963429 ^ 1964371071) ^ 2003085133))));
                } catch (NoSuchFieldException e3) {
                    throw new IllegalArgumentException();
                }
            }
            declaredField.setAccessible(true);
            Iterator it = ((Map) declaredField.get(declaredField)).keySet().iterator();
            while (it.hasNext()) {
                this.Xd.add(((Member) it.next()).getDeclaringClass().getCanonicalName());
            }
        } catch (ClassNotFoundException e4) {
        } catch (Exception e5) {
            throw new IllegalStateException(e5.getMessage());
        }
        this.Kd = this.Xd.iterator();
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.Kd.hasNext();
    }

    @Override // java.util.Enumeration
    /* JADX INFO: renamed from: lK, reason: merged with bridge method [inline-methods] */
    public String nextElement() {
        return this.Kd.next();
    }
}
