package o.dx;

import android.content.Context;
import o.dv.c;
import o.dy.d;
import o.dz.c;

/* JADX INFO: loaded from: classes6.dex */
public interface b<Type extends o.dy.d, Source extends o.dv.c, Decoder extends o.dz.c<ObjRes>, ObjRes> {
    Decoder a();

    String c();

    Source d();

    default ObjRes e(Context context) throws Throwable {
        int i2 = 2 % 2;
        try {
            return (ObjRes) e.e().a(context, this);
        } catch (a e2) {
            if (!o.ea.f.a()) {
                return null;
            }
            o.ea.f.e("IRemoteResource", "getData - Unable to get data", e2);
            return null;
        }
    }

    Type e();
}
