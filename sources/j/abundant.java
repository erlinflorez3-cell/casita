package j;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableKt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes6.dex */
public final class abundant extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Application f19784a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abundant(Application application) {
        super(1);
        this.f19784a = application;
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: a */
    public final String invoke(ApplicationInfo applicationInfo) {
        try {
            Application application = this.f19784a;
            short sXd = (short) (OY.Xd() ^ 9145);
            int[] iArr = new int["htivrke.bmkp`hm&:echXje".length()];
            QB qb = new QB("htivrke.bmkp`hm&:echXje");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1593ug.zd("wv\u0007cux\u0002x\u007f~g|\u000b~\u0006\u0005\u0013", (short) (C1580rY.Xd() ^ (-24792)), (short) (C1580rY.Xd() ^ (-2947))), new Class[0]);
            try {
                method.setAccessible(true);
                PackageManager packageManager = (PackageManager) method.invoke(application, objArr);
                String str = applicationInfo.packageName;
                Class<?> cls = Class.forName(C1561oA.od("q}r\u007f{tn7kvtyiqv/pl,M]^eZ_\\CVbTYVb", (short) (ZN.Xd() ^ 4456)));
                Class<?>[] clsArr = new Class[1];
                clsArr[0] = Class.forName(C1561oA.Kd("\u000f\u0007\u001d\tV\u0016\f\u001a\u0014[\u0002$#\u001b!\u001b", (short) (OY.Xd() ^ 26663)));
                Object[] objArr2 = {str};
                Method method2 = cls.getMethod(Wg.Zd("\u000fE+Ef-w\u0013F\u0010Hb\u0004e\b\u0007\u0001\u0015K!M`Fk\f?", (short) (C1499aX.Xd() ^ (-3474)), (short) (C1499aX.Xd() ^ (-9171))), clsArr);
                try {
                    method2.setAccessible(true);
                    Bitmap bitmap$default = null;
                    Drawable drawable = ResourcesCompat.getDrawable((Resources) method2.invoke(packageManager, objArr2), applicationInfo.icon, null);
                    if (drawable instanceof BitmapDrawable) {
                        bitmap$default = ((BitmapDrawable) drawable).getBitmap();
                    } else if (drawable != null) {
                        bitmap$default = DrawableKt.toBitmap$default(drawable, 100, 100, null, 4, null);
                    }
                    if (bitmap$default == null) {
                        return "";
                    }
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap$default.getByteCount());
                    bitmap$default.copyPixelsToBuffer(byteBufferAllocate);
                    byteBufferAllocate.rewind();
                    MessageDigest messageDigest = MessageDigest.getInstance(C1561oA.Xd("[QK8=", (short) (ZN.Xd() ^ 29080)));
                    int iLimit = byteBufferAllocate.limit();
                    for (int i3 = 0; i3 < iLimit; i3++) {
                        messageDigest.update(byteBufferAllocate.get());
                    }
                    return ArraysKt.joinToString$default(messageDigest.digest(), (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) i1.gregarious.f19716a, 30, (Object) null);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (Throwable th) {
            String str2 = Wg.vd("|*1)\u001a%^-Q\u0018,) \u0010\u0013%I\f\u001c\u001dE\u0010\u000b\u0018\u0010Bvl^L?eLMKO\u0010v", (short) (C1580rY.Xd() ^ (-9598))) + th.getMessage();
            return "";
        }
    }
}
