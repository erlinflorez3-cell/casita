package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new zzk();
    private static final String zza = "MapStyleOptions";
    private final String zzb;

    public MapStyleOptions(String str) {
        Preconditions.checkNotNull(str, "json must not be null");
        this.zzb = str;
    }

    public static MapStyleOptions loadRawResourceStyle(Context context, int i2) throws Throwable {
        short sXd = (short) (FB.Xd() ^ 22616);
        short sXd2 = (short) (FB.Xd() ^ 12723);
        int[] iArr = new int["}\f\u0003\u0012\u0010\u000b\u0007Q\b\u0015\u0015\u001c\u000e\u0018\u001fYo\u001d\u001d$\u0016*'".length()];
        QB qb = new QB("}\f\u0003\u0012\u0010\u000b\u0007Q\b\u0015\u0015\u001c\u000e\u0018\u001fYo\u001d\u001d$\u0016*'");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i3)).getMethod(Jg.Wd("Et3/e2\u001d2a\u00122_", (short) (C1607wl.Xd() ^ 237), (short) (C1607wl.Xd() ^ 16742)), new Class[0]);
        try {
            method.setAccessible(true);
            try {
                return new MapStyleOptions(new String(IOUtils.readInputStreamFully(((Resources) method.invoke(context, objArr)).openRawResource(i2)), ZO.xd("\u0014mI\u0018\u0014", (short) (OY.Xd() ^ 28550), (short) (OY.Xd() ^ 32201))));
            } catch (IOException e2) {
                String string = e2.toString();
                short sXd3 = (short) (Od.Xd() ^ (-31884));
                short sXd4 = (short) (Od.Xd() ^ (-29036));
                int[] iArr2 = new int["'s\u0003k\u0019j:\bV3\u0011L\u007f\u0017TOc\u0014\u001aa\f0Gd".length()];
                QB qb2 = new QB("'s\u0003k\u0019j:\bV3\u0011L\u007f\u0017TOc\u0014\u001aa\f0Gd");
                int i4 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i4] = xuXd2.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i4 * sXd4))) + xuXd2.CK(iKK2));
                    i4++;
                }
                throw new Resources.NotFoundException(new String(iArr2, 0, i4) + i2 + Ig.wd("\u000e(", (short) (OY.Xd() ^ 6363)) + string);
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        String str = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
