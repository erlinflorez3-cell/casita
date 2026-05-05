package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
final class zzgi extends com.google.android.gms.internal.measurement.zzck {
    private final /* synthetic */ zzgf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgi(zzgf zzgfVar, Context context, String str) {
        super(context, str, null, 1);
        this.zza = zzgfVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e2) {
            throw e2;
        } catch (SQLiteException unused) {
            this.zza.zzj().zzg().zza(Jg.Wd("Cr\u0012B'Xz[\u001a9`Bx(Ek`/\u001e\u0003?X\u0003i&C(Vz/[<eH&\u0013Js^\u0006)Y<\u001d\bA!\u0004\u0001Ov.J2o\f; \u0002s(", (short) (C1580rY.Xd() ^ (-1876)), (short) (C1580rY.Xd() ^ (-16418))));
            Context contextZza = this.zza.zza();
            String strXd = ZO.xd("XR=\b_\u007fZD?\u0007vuYKur!uQ|yr\u0001tg=a^+\u0011.", (short) (C1499aX.Xd() ^ (-28532)), (short) (C1499aX.Xd() ^ (-2252)));
            short sXd = (short) (FB.Xd() ^ 23019);
            short sXd2 = (short) (FB.Xd() ^ 7697);
            int[] iArr = new int["T,1YHgJ\u0002\u0016/\tc\u001b%\b_q\u001d\u00185b\u001b\u0001".length()];
            QB qb = new QB("T,1YHgJ\u0002\u0016/\tc\u001b%\b_q\u001d\u00185b\u001b\u0001");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = {strXd};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(EO.Od("\u0014D\u0002yv>\u0007\u0001&|pu1JR", (short) (Od.Xd() ^ (-4957))), Class.forName(Ig.wd("r5Zkfg>\u001agDe+ulo\r", (short) (C1580rY.Xd() ^ (-10774)))));
            try {
                method.setAccessible(true);
                if (!((File) method.invoke(contextZza, objArr)).delete()) {
                    this.zza.zzj().zzg().zza(C1561oA.Qd("\"<CE=;uICr66<4B2k.9;:<69)'a-/\"\u001f)[\u001f\u001cX\u001e \"\u001a", (short) (C1580rY.Xd() ^ (-5091))), strXd);
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException e3) {
                    this.zza.zzj().zzg().zza(C1593ug.zd("w\u0014\u001d!\u001b\u001bW-)Z+-#-_-1&%1e+)=+--@3|o\u0016H8BIIvOBFG{?WOATU\u0003PTIHT\t]_[_OVU", (short) (C1633zX.Xd() ^ (-11326)), (short) (C1633zX.Xd() ^ (-27215))), e3);
                    return null;
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzaw.zza(this.zza.zzj(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        zzaw.zza(this.zza.zzj(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}
