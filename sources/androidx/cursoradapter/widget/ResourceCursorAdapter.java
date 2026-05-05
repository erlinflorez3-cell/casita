package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ResourceCursorAdapter extends CursorAdapter {
    private int mDropDownLayout;
    private LayoutInflater mInflater;
    private int mLayout;

    @Deprecated
    public ResourceCursorAdapter(Context context, int i2, Cursor cursor) throws Throwable {
        super(context, cursor);
        this.mDropDownLayout = i2;
        this.mLayout = i2;
        Object[] objArr = {ZO.xd(":uD #su?\u000bh]m^T\\", (short) (ZN.Xd() ^ 15670), (short) (ZN.Xd() ^ 1420))};
        Method method = Class.forName(C1626yg.Ud("\u00163\u0005Ll8jm&Su@|\u0016lzuI)S8eg", (short) (C1607wl.Xd() ^ 24868), (short) (C1607wl.Xd() ^ 16287))).getMethod(EO.Od("*OR\u0017wOjdHo\u0002j>=-\u000f", (short) (C1633zX.Xd() ^ (-19126))), Class.forName(Ig.wd("q:adijC\u0019f=`(rkl\f", (short) (C1580rY.Xd() ^ (-10646)))));
        try {
            method.setAccessible(true);
            this.mInflater = (LayoutInflater) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Deprecated
    public ResourceCursorAdapter(Context context, int i2, Cursor cursor, boolean z2) throws Throwable {
        super(context, cursor, z2);
        this.mDropDownLayout = i2;
        this.mLayout = i2;
        short sXd = (short) (FB.Xd() ^ 11643);
        short sXd2 = (short) (FB.Xd() ^ 20044);
        int[] iArr = new int["\u001fbBm/s\u0016e&C\u0011;\n@\u0005".length()];
        QB qb = new QB("\u001fbBm/s\u0016e&C\u0011;\n@\u0005");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i3++;
        }
        Object[] objArr = {new String(iArr, 0, i3)};
        Method method = Class.forName(C1561oA.Xd("FTKZXSO\u001aP]]dV`g\"8eel^ro", (short) (C1633zX.Xd() ^ (-3898)))).getMethod(Qg.kd("nkyW|uuelQbnqc\\]", (short) (FB.Xd() ^ 6975), (short) (FB.Xd() ^ 7589)), Class.forName(Wg.vd("WMeO\u0017TLXL\u0012:ZSIQI", (short) (ZN.Xd() ^ 5810))));
        try {
            method.setAccessible(true);
            this.mInflater = (LayoutInflater) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public ResourceCursorAdapter(Context context, int i2, Cursor cursor, int i3) throws Throwable {
        super(context, cursor, i3);
        this.mDropDownLayout = i2;
        this.mLayout = i2;
        Object[] objArr = {C1561oA.Qd("G;RGLJ4=A8=1C3?", (short) (C1499aX.Xd() ^ (-23674)))};
        Method method = Class.forName(C1593ug.zd("w\u0006|\f\n\u0005\u0001K\u0002\u000f\u000f\u0016\b\u0012\u0019Si\u0017\u0017\u001e\u0010$!", (short) (OY.Xd() ^ 27629), (short) (OY.Xd() ^ 17116))).getMethod(C1561oA.Kd("[ZjJqln`iPcqvjeh", (short) (C1499aX.Xd() ^ (-26088))), Class.forName(C1561oA.od(";1E/z8,80u\u001a:7-1)", (short) (C1607wl.Xd() ^ 32034))));
        try {
            method.setAccessible(true);
            this.mInflater = (LayoutInflater) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.mInflater.inflate(this.mLayout, viewGroup, false);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.mInflater.inflate(this.mDropDownLayout, viewGroup, false);
    }

    public void setViewResource(int i2) {
        this.mLayout = i2;
    }

    public void setDropDownViewResource(int i2) {
        this.mDropDownLayout = i2;
    }
}
