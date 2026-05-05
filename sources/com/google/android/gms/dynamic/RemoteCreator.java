package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public abstract class RemoteCreator<T> {
    private final String zza;
    private Object zzb;

    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(String str) {
            super(str);
        }

        public RemoteCreatorException(String str, Throwable th) {
            super(str, th);
        }
    }

    protected RemoteCreator(String str) {
        this.zza = str;
    }

    protected abstract T getRemoteCreator(IBinder iBinder);

    protected final T getRemoteCreatorInstance(Context context) throws Throwable {
        if (this.zzb == null) {
            Preconditions.checkNotNull(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null) {
                throw new RemoteCreatorException(hg.Vd("$OTJA{IIMw>;IsE7>?C3l/:8=-?:r", (short) (Od.Xd() ^ (-7682)), (short) (Od.Xd() ^ (-25565))));
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Kd("\u0014\"\u0019(&!\u001dg\u001e++2$.5o\u000633:,@=", (short) (C1633zX.Xd() ^ (-15341)))).getMethod(Wg.Zd("F\u001d\u0001(&sj?`X#\u000b`F", (short) (Od.Xd() ^ (-6030)), (short) (Od.Xd() ^ (-10092))), new Class[0]);
            try {
                method.setAccessible(true);
                try {
                    this.zzb = getRemoteCreator((IBinder) ((ClassLoader) method.invoke(remoteContext, objArr)).loadClass(this.zza).newInstance());
                } catch (ClassNotFoundException e2) {
                    throw new RemoteCreatorException(Qg.kd("x$)\u001f\u0016P\u001e\u001e\"L\u0018\u001a\u000b\rG\n\u0018\n\u0005\u0017\u0011\u0013?\u0002\n}\u000f\u000eG", (short) (Od.Xd() ^ (-26597)), (short) (Od.Xd() ^ (-16878))), e2);
                } catch (IllegalAccessException e3) {
                    throw new RemoteCreatorException(C1561oA.Xd("(U\\TM\nY[a\u000ePSTWfg\u0015Yi]Znjn+", (short) (Od.Xd() ^ (-16827))), e3);
                } catch (InstantiationException e4) {
                    throw new RemoteCreatorException(Wg.vd(";foeX\u0013ddd\u000f[___O[|pk}i#iwe`vpn)", (short) (C1499aX.Xd() ^ (-3362))), e4);
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
        return (T) this.zzb;
    }
}
