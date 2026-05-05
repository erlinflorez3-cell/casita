package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.dynatrace.android.agent.Global;
import com.google.firebase.sessions.settings.RemoteSettings;
import cz.msebera.android.httpclient.protocol.HTTP;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
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
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class IconCompat extends CustomVersionedParcelable {
    private static final float ADAPTIVE_ICON_INSET_FACTOR = 0.25f;
    private static final int AMBIENT_SHADOW_ALPHA = 30;
    private static final float BLUR_FACTOR = 0.010416667f;
    static final PorterDuff.Mode DEFAULT_TINT_MODE = PorterDuff.Mode.SRC_IN;
    private static final float DEFAULT_VIEW_PORT_SCALE = 0.6666667f;
    static final String EXTRA_INT1 = "int1";
    static final String EXTRA_INT2 = "int2";
    static final String EXTRA_OBJ = "obj";
    static final String EXTRA_STRING1 = "string1";
    static final String EXTRA_TINT_LIST = "tint_list";
    static final String EXTRA_TINT_MODE = "tint_mode";
    static final String EXTRA_TYPE = "type";
    private static final float ICON_DIAMETER_FACTOR = 0.9166667f;
    private static final int KEY_SHADOW_ALPHA = 61;
    private static final float KEY_SHADOW_OFFSET_FACTOR = 0.020833334f;
    private static final String TAG = "IconCompat";
    public static final int TYPE_ADAPTIVE_BITMAP = 5;
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_DATA = 3;
    public static final int TYPE_RESOURCE = 2;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_URI = 4;
    public static final int TYPE_URI_ADAPTIVE_BITMAP = 6;
    public byte[] mData;
    public int mInt1;
    public int mInt2;
    Object mObj1;
    public Parcelable mParcelable;
    public String mString1;
    public ColorStateList mTintList;
    PorterDuff.Mode mTintMode;
    public String mTintModeStr;
    public int mType;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IconType {
    }

    public static IconCompat createWithResource(Context context, int i2) throws Throwable {
        ObjectsCompat.requireNonNull(context);
        Class<?> cls = Class.forName(EO.Od("Y\u0017?h5\rgp\u0002\u001d\u001aB\u0003\u0016$z5\u007f6\u0018D\u000f-", (short) (C1633zX.Xd() ^ (-32102))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-10138));
        int[] iArr = new int["\u0002~\ri{\t\u0004\t\u0005tu\u0003".length()];
        QB qb = new QB("\u0002~\ri{\t\u0004\t\u0005tu\u0003");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            short sXd2 = (short) (C1607wl.Xd() ^ 3347);
            short sXd3 = (short) (C1607wl.Xd() ^ 31321);
            int[] iArr2 = new int["@NETRMI\u0014JWW^PZa\u001c2__fXli".length()];
            QB qb2 = new QB("@NETRMI\u0014JWW^PZa\u001c2__fXli");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i4)) - sXd3);
                i4++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr2, 0, i4)).getMethod(C1561oA.od("a^lGWX_TYV>P[R", (short) (OY.Xd() ^ 17932)), new Class[0]);
            try {
                method2.setAccessible(true);
                return createWithResource(resources, (String) method2.invoke(context, objArr2), i2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static IconCompat createWithResource(Resources resources, String str, int i2) {
        ObjectsCompat.requireNonNull(str);
        if (i2 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.mInt1 = i2;
        if (resources != null) {
            try {
                iconCompat.mObj1 = resources.getResourceName(i2);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.mObj1 = str;
        }
        iconCompat.mString1 = str;
        return iconCompat;
    }

    public static IconCompat createWithBitmap(Bitmap bitmap) {
        ObjectsCompat.requireNonNull(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.mObj1 = bitmap;
        return iconCompat;
    }

    public static IconCompat createWithAdaptiveBitmap(Bitmap bitmap) {
        ObjectsCompat.requireNonNull(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.mObj1 = bitmap;
        return iconCompat;
    }

    public static IconCompat createWithData(byte[] bArr, int i2, int i3) {
        ObjectsCompat.requireNonNull(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.mObj1 = bArr;
        iconCompat.mInt1 = i2;
        iconCompat.mInt2 = i3;
        return iconCompat;
    }

    public static IconCompat createWithContentUri(String str) {
        ObjectsCompat.requireNonNull(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.mObj1 = str;
        return iconCompat;
    }

    public static IconCompat createWithContentUri(Uri uri) {
        ObjectsCompat.requireNonNull(uri);
        return createWithContentUri(uri.toString());
    }

    public static IconCompat createWithAdaptiveBitmapContentUri(String str) {
        ObjectsCompat.requireNonNull(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.mObj1 = str;
        return iconCompat;
    }

    public static IconCompat createWithAdaptiveBitmapContentUri(Uri uri) {
        ObjectsCompat.requireNonNull(uri);
        return createWithAdaptiveBitmapContentUri(uri.toString());
    }

    public IconCompat() {
        this.mType = -1;
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.mTintMode = DEFAULT_TINT_MODE;
        this.mTintModeStr = null;
    }

    IconCompat(int i2) {
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.mTintMode = DEFAULT_TINT_MODE;
        this.mTintModeStr = null;
        this.mType = i2;
    }

    public int getType() {
        int i2 = this.mType;
        return i2 == -1 ? Api23Impl.getType(this.mObj1) : i2;
    }

    public String getResPackage() {
        int i2 = this.mType;
        if (i2 == -1) {
            return Api23Impl.getResPackage(this.mObj1);
        }
        if (i2 != 2) {
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        String str = this.mString1;
        if (str == null || TextUtils.isEmpty(str)) {
            return ((String) this.mObj1).split(Global.COLON, -1)[0];
        }
        return this.mString1;
    }

    public int getResId() {
        int i2 = this.mType;
        if (i2 == -1) {
            return Api23Impl.getResId(this.mObj1);
        }
        if (i2 != 2) {
            throw new IllegalStateException("called getResId() on " + this);
        }
        return this.mInt1;
    }

    public Bitmap getBitmap() {
        int i2 = this.mType;
        if (i2 == -1) {
            Object obj = this.mObj1;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i2 == 1) {
            return (Bitmap) this.mObj1;
        }
        if (i2 == 5) {
            return createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public Uri getUri() {
        int i2 = this.mType;
        if (i2 == -1) {
            return Api23Impl.getUri(this.mObj1);
        }
        if (i2 != 4 && i2 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.mObj1);
    }

    public IconCompat setTint(int i2) {
        return setTintList(ColorStateList.valueOf(i2));
    }

    public IconCompat setTintList(ColorStateList colorStateList) {
        this.mTintList = colorStateList;
        return this;
    }

    public IconCompat setTintMode(PorterDuff.Mode mode) {
        this.mTintMode = mode;
        return this;
    }

    @Deprecated
    public Icon toIcon() {
        return toIcon(null);
    }

    public Icon toIcon(Context context) {
        return Api23Impl.toIcon(this, context);
    }

    public void checkResource(Context context) {
        Object obj;
        if (this.mType != 2 || (obj = this.mObj1) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(Global.COLON)) {
            String str2 = str.split(Global.COLON, -1)[1];
            String str3 = str2.split(RemoteSettings.FORWARD_SLASH_STRING, -1)[0];
            String str4 = str2.split(RemoteSettings.FORWARD_SLASH_STRING, -1)[1];
            String str5 = str.split(Global.COLON, -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                return;
            }
            String resPackage = getResPackage();
            int identifier = getResources(context, resPackage).getIdentifier(str4, str3, str5);
            if (this.mInt1 != identifier) {
                String str6 = "Id has changed for " + resPackage + Global.BLANK + str;
                this.mInt1 = identifier;
            }
        }
    }

    public Drawable loadDrawable(Context context) {
        checkResource(context);
        return Api23Impl.loadDrawable(toIcon(context), context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Drawable loadDrawableInner(Context context) throws Throwable {
        switch (this.mType) {
            case 1:
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.yd("\u001c*!0&!\u001dg&33:$.5om\u001b\u001b\"\f \u001d", (short) (FB.Xd() ^ 15783))).getMethod(C1561oA.Yd("\n\t\u0019w\f\u001b\u0018\u001f\u001d\u000f\u0012!", (short) (FB.Xd() ^ 3114)), new Class[0]);
                try {
                    method.setAccessible(true);
                    return new BitmapDrawable((Resources) method.invoke(context, objArr), (Bitmap) this.mObj1);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            case 2:
                String resPackage = getResPackage();
                if (TextUtils.isEmpty(resPackage)) {
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(Wg.Zd("m{q\"\u00193.\u0012IUnt\u0006\t1j\u0018FGeX\f\u007f", (short) (FB.Xd() ^ 20099), (short) (FB.Xd() ^ 9108))).getMethod(C1561oA.Xd("\u0017\u0016&\u0003\u0015\u0018!\u0018\u001f\u001e\b\u001c)\"", (short) (C1499aX.Xd() ^ (-15074))), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        resPackage = (String) method2.invoke(context, objArr2);
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                Resources resources = getResources(context, resPackage);
                try {
                    int i2 = this.mInt1;
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(Wg.vd("8D9FB;5}2=;@08=u*USXHZU", (short) (C1499aX.Xd() ^ (-19268)))).getMethod(Qg.kd("hesReah_", (short) (FB.Xd() ^ 4248), (short) (FB.Xd() ^ 2541)), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        return ResourcesCompat.getDrawable(resources, i2, (Resources.Theme) method3.invoke(context, objArr3));
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } catch (RuntimeException e5) {
                    String.format(hg.Vd("\":,,5-f:4c/1\"$^0\"/*/+\u001b\u001cUd,Wah(N\u0014\u001f\u001b\u0018I\u0019\u0013\u000ebI\u0017", (short) (FB.Xd() ^ 2697), (short) (FB.Xd() ^ 26536)), Integer.valueOf(this.mInt1), this.mObj1);
                    C1561oA.ud(".GRP$OLN>P", (short) (ZN.Xd() ^ 25104));
                    break;
                }
                break;
            case 3:
                Object[] objArr4 = new Object[0];
                Method method4 = Class.forName(C1561oA.od("YeZgc\\V\u001fS^\\aQY^\u0017+VTYI[V", (short) (ZN.Xd() ^ 23496))).getMethod(C1561oA.Kd("yx\tg{\u000b\b\u000f\r~\u0002\u0011", (short) (C1499aX.Xd() ^ (-27746))), new Class[0]);
                try {
                    method4.setAccessible(true);
                    return new BitmapDrawable((Resources) method4.invoke(context, objArr4), BitmapFactory.decodeByteArray((byte[]) this.mObj1, this.mInt1, this.mInt2));
                } catch (InvocationTargetException e6) {
                    throw e6.getCause();
                }
            case 4:
                InputStream uriInputStream = getUriInputStream(context);
                if (uriInputStream != null) {
                    Object[] objArr5 = new Object[0];
                    Method method5 = Class.forName(C1561oA.Qd("lxmzvoi2fqotdlq*>igl\\ni", (short) (ZN.Xd() ^ 14642))).getMethod(C1593ug.zd(")(8\u0017+:7><.1@", (short) (C1633zX.Xd() ^ (-22248)), (short) (C1633zX.Xd() ^ (-16229))), new Class[0]);
                    try {
                        method5.setAccessible(true);
                        return new BitmapDrawable((Resources) method5.invoke(context, objArr5), BitmapFactory.decodeStream(uriInputStream));
                    } catch (InvocationTargetException e7) {
                        throw e7.getCause();
                    }
                }
                return null;
            case 5:
                Object[] objArr6 = new Object[0];
                Method method6 = Class.forName(Ig.wd("Y\u0017?d1\u0007Uvu\r\n6<OQp9o\u0016d\u001fY3", (short) (FB.Xd() ^ 32487))).getMethod(EO.Od(")ON\u0013_:Xp, \u001e\f", (short) (C1499aX.Xd() ^ (-7096))), new Class[0]);
                try {
                    method6.setAccessible(true);
                    return new BitmapDrawable((Resources) method6.invoke(context, objArr6), createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, false));
                } catch (InvocationTargetException e8) {
                    throw e8.getCause();
                }
            case 6:
                InputStream uriInputStream2 = getUriInputStream(context);
                if (uriInputStream2 != null) {
                    short sXd = (short) (C1499aX.Xd() ^ (-26646));
                    short sXd2 = (short) (C1499aX.Xd() ^ (-1083));
                    int[] iArr = new int["\u0006JUpQ(c=AJdO#:`\u0011\"\u001ad#0/6".length()];
                    QB qb = new QB("\u0006JUpQ(c=AJdO#:`\u0011\"\u001ad#0/6");
                    int i3 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd2) + sXd)));
                        i3++;
                    }
                    Object[] objArr7 = new Object[0];
                    Method method7 = Class.forName(new String(iArr, 0, i3)).getMethod(C1626yg.Ud("EU\u0004r\u0007z_F-~G\t", (short) (C1607wl.Xd() ^ 31850), (short) (C1607wl.Xd() ^ 11130)), new Class[0]);
                    try {
                        method7.setAccessible(true);
                        return Api26Impl.createAdaptiveIconDrawable(null, new BitmapDrawable((Resources) method7.invoke(context, objArr7), BitmapFactory.decodeStream(uriInputStream2)));
                    } catch (InvocationTargetException e9) {
                        throw e9.getCause();
                    }
                }
                return null;
            default:
                return null;
        }
    }

    public InputStream getUriInputStream(Context context) throws Throwable {
        Uri uri = getUri();
        String scheme = uri.getScheme();
        short sXd = (short) (C1580rY.Xd() ^ (-31042));
        int[] iArr = new int["\u001f,,3%/6".length()];
        QB qb = new QB("\u001f,,3%/6");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        boolean zEquals = new String(iArr, 0, i2).equals(scheme);
        short sXd2 = (short) (FB.Xd() ^ 9020);
        int[] iArr2 = new int["!<II\u001fLKOAU".length()];
        QB qb2 = new QB("!<II\u001fLKOAU");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        new String(iArr2, 0, i3);
        if (zEquals || Qg.kd("[]_W", (short) (C1580rY.Xd() ^ (-10158)), (short) (C1580rY.Xd() ^ (-1265))).equals(scheme)) {
            try {
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.ud("NZO\\XQK\u0014HSQVFNS\f KIN>PK", (short) (FB.Xd() ^ 24647))).getMethod(C1561oA.yd(">;M\u001bJHQA=B#5FAAJLX", (short) (C1499aX.Xd() ^ (-20859))), new Class[0]);
                try {
                    method.setAccessible(true);
                    return ((ContentResolver) method.invoke(context, objArr)).openInputStream(uri);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Exception e3) {
                String str = C1561oA.Yd("c}qs~x4\n\u00067\u0005\t{\u007f<\u0007\f\u0001\b\u0007B\n\u0017\u0015\u0014G}{seL", (short) (OY.Xd() ^ 23661)) + uri;
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.mObj1));
        } catch (FileNotFoundException e4) {
            String str2 = hg.Vd("{\u0014\u0006\u0006\u000f\u0007@\u0014\u000e=\t\u000b{}8\u0001\u0004v{x2w\u0003~{-|l~qB'", (short) (C1607wl.Xd() ^ 29250), (short) (C1607wl.Xd() ^ 17281)) + uri;
            return null;
        }
    }

    static Resources getResources(Context context, String str) throws Throwable {
        if (C1561oA.Kd("\u0007\u0015\f\u001b\u0019\u0014\u0010", (short) (C1607wl.Xd() ^ 12756)).equals(str)) {
            return Resources.getSystem();
        }
        Class<?> cls = Class.forName(Wg.Zd("\u0011PWr\u0001(4\tO\t\u0019,.f}DjCSdf'4", (short) (ZN.Xd() ^ 32318), (short) (ZN.Xd() ^ 19340)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-14264));
        int[] iArr = new int[".-=\u001a,/8/65\u001e3A5<;I".length()];
        QB qb = new QB(".-=\u001a,/8/65\u001e3A5<;I");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            try {
                Class<?> cls2 = Class.forName(Wg.vd("n|s\u0003\u0001{wBx\u0006\u0006\r~\t\u0010Jmk-PbenelkTiwkrq ", (short) (Od.Xd() ^ (-10950))));
                Class<?>[] clsArr2 = new Class[2];
                clsArr2[0] = Class.forName(Qg.kd("TJ^H\u0014QEQI\u000f3SPFJB", (short) (C1607wl.Xd() ^ 31083), (short) (C1607wl.Xd() ^ 145)));
                clsArr2[1] = Integer.TYPE;
                Object[] objArr2 = {str, 8192};
                short sXd2 = (short) (C1499aX.Xd() ^ (-12287));
                short sXd3 = (short) (C1499aX.Xd() ^ (-4509));
                int[] iArr2 = new int["ift@nmhd]Zl`ec=aX`".length()];
                QB qb2 = new QB("ift@nmhd]Zl`ec=aX`");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2) + sXd3);
                    i3++;
                }
                Method method2 = cls2.getMethod(new String(iArr2, 0, i3), clsArr2);
                try {
                    method2.setAccessible(true);
                    ApplicationInfo applicationInfo = (ApplicationInfo) method2.invoke(packageManager, objArr2);
                    if (applicationInfo == null) {
                        return null;
                    }
                    Class<?> cls3 = Class.forName(C1561oA.ud(".:/<81+s(316&.3k-)h\n\u001a\u001b\"\u0017\u001c\u0019\u007f\u0013\u001f\u0011\u0016\u0013\u001f", (short) (Od.Xd() ^ (-1907))));
                    Class<?>[] clsArr3 = new Class[1];
                    clsArr3[0] = Class.forName(C1561oA.yd("2>7D<53{<GIN:BK\u00041-p\u0003-,+',)?342\u00104W_", (short) (ZN.Xd() ^ 9061)));
                    Object[] objArr3 = {applicationInfo};
                    Method method3 = cls3.getMethod(C1561oA.Yd("\u001a\u0019)\b\u001c+(/-\u001f\"1\u0005/3\u0003341/*)=3::", (short) (Od.Xd() ^ (-26655))), clsArr3);
                    try {
                        method3.setAccessible(true);
                        return (Resources) method3.invoke(packageManager, objArr3);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (PackageManager.NameNotFoundException e4) {
                String.format(Xg.qd("JdXZe_\u001bpl\u001eeiof#tpmD-|*q{\u007f.xs\u0001\u0001", (short) (C1499aX.Xd() ^ (-14228)), (short) (C1499aX.Xd() ^ (-22106))), str);
                Jg.Wd("hhJKu cX/8", (short) (C1580rY.Xd() ^ (-4364)), (short) (C1580rY.Xd() ^ (-18398)));
                return null;
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    public void addToShortcutIntent(Intent intent, Drawable drawable, Context context) throws Throwable {
        Bitmap bitmapCopy;
        checkResource(context);
        int i2 = this.mType;
        if (i2 == 1) {
            bitmapCopy = (Bitmap) this.mObj1;
            if (drawable != null) {
                bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            }
        } else if (i2 == 2) {
            try {
                String resPackage = getResPackage();
                Class<?> cls = Class.forName(Jg.Wd("8D?NJ?C\u0002NYelTp\u007f6*UYV@NS", (short) (C1607wl.Xd() ^ 9905), (short) (C1607wl.Xd() ^ 25464)));
                Class<?>[] clsArr = new Class[2];
                short sXd = (short) (ZN.Xd() ^ 15451);
                short sXd2 = (short) (ZN.Xd() ^ 5610);
                int[] iArr = new int["\u001bQegz\u0003jbL8%;z\u00190\u0012".length()];
                QB qb = new QB("\u001bQegz\u0003jbL8%;z\u00190\u0012");
                int i3 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd2) + sXd)));
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i3));
                clsArr[1] = Integer.TYPE;
                Object[] objArr = {resPackage, 0};
                Method method = cls.getMethod(C1626yg.Ud("\u0011\t\u001dQ!?\u00126X\u0007\u0019rv8Fj1\u0010c+", (short) (ZN.Xd() ^ 27892), (short) (ZN.Xd() ^ 542)), clsArr);
                try {
                    method.setAccessible(true);
                    Context context2 = (Context) method.invoke(context, objArr);
                    if (drawable == null) {
                        intent.putExtra(Ig.wd(",sUBd1^\u000e~%+<v\u0001d;y\u00025\n\u001c\u0007,-5\u0002\fmx]\u001b6Xr3eu\u001e\u00193*p$", (short) (C1607wl.Xd() ^ 7136)), Intent.ShortcutIconResource.fromContext(context2, this.mInt1));
                        return;
                    }
                    Drawable drawable2 = ContextCompat.getDrawable(context2, this.mInt1);
                    if (drawable2.getIntrinsicWidth() <= 0 || drawable2.getIntrinsicHeight() <= 0) {
                        String strOd = EO.Od(">od?^\u0017DZ", (short) (C1499aX.Xd() ^ (-401)));
                        Class<?> cls2 = Class.forName(C1561oA.Qd("VbWd`YS\u001cP[Y^NV[\u0014(SQVFXS", (short) (C1580rY.Xd() ^ (-8669))));
                        Class<?>[] clsArr2 = new Class[1];
                        short sXd3 = (short) (C1580rY.Xd() ^ (-9587));
                        short sXd4 = (short) (C1580rY.Xd() ^ (-19624));
                        int[] iArr2 = new int["&\u001e4 m-#1+r\u0019;:282".length()];
                        QB qb2 = new QB("&\u001e4 m-#1+r\u0019;:282");
                        int i4 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i4] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd3 + i4)) - sXd4);
                            i4++;
                        }
                        clsArr2[0] = Class.forName(new String(iArr2, 0, i4));
                        Object[] objArr2 = {strOd};
                        Method method2 = cls2.getMethod(C1561oA.od("=:H&KDD4; 1=@2+,", (short) (OY.Xd() ^ 4079)), clsArr2);
                        try {
                            method2.setAccessible(true);
                            int launcherLargeIconSize = ((ActivityManager) method2.invoke(context2, objArr2)).getLauncherLargeIconSize();
                            bitmapCopy = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } else {
                        bitmapCopy = Bitmap.createBitmap(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    }
                    drawable2.setBounds(0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
                    drawable2.draw(new Canvas(bitmapCopy));
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (PackageManager.NameNotFoundException e4) {
                short sXd5 = (short) (OY.Xd() ^ 10338);
                int[] iArr3 = new int["Zy\bA\u0010<\u0004\b\u000e\u0005A\u0013\u0005\b\u0011\b\u000f\u000eI".length()];
                QB qb3 = new QB("Zy\bA\u0010<\u0004\b\u000e\u0005A\u0013\u0005\b\u0011\b\u000f\u000eI");
                int i5 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd5 + sXd5) + i5));
                    i5++;
                }
                throw new IllegalArgumentException(new String(iArr3, 0, i5) + this.mObj1, e4);
            }
        } else if (i2 == 5) {
            bitmapCopy = createLegacyIconFromAdaptiveIcon((Bitmap) this.mObj1, true);
        } else {
            throw new IllegalArgumentException(Xg.qd("y\u0015\"\"T*0(\u001eY)+1]2512269++g/9=k6<C5?FrG=EIL<OOO", (short) (FB.Xd() ^ 32423), (short) (FB.Xd() ^ 21176)));
        }
        if (drawable != null) {
            int width = bitmapCopy.getWidth();
            int height = bitmapCopy.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmapCopy));
        }
        intent.putExtra(Wg.Zd("kV,\u0004_7!EN/\u0017qZ:F[]4\u0010Jx\u0019|]/\u000f]]:O<\u0011\fd", (short) (ZN.Xd() ^ 25030), (short) (ZN.Xd() ^ 22755)), bitmapCopy);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        switch (this.mType) {
            case -1:
                bundle.putParcelable(EXTRA_OBJ, (Parcelable) this.mObj1);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable(EXTRA_OBJ, (Bitmap) this.mObj1);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString(EXTRA_OBJ, (String) this.mObj1);
                break;
            case 3:
                bundle.putByteArray(EXTRA_OBJ, (byte[]) this.mObj1);
                break;
        }
        bundle.putInt("type", this.mType);
        bundle.putInt(EXTRA_INT1, this.mInt1);
        bundle.putInt(EXTRA_INT2, this.mInt2);
        bundle.putString(EXTRA_STRING1, this.mString1);
        ColorStateList colorStateList = this.mTintList;
        if (colorStateList != null) {
            bundle.putParcelable(EXTRA_TINT_LIST, colorStateList);
        }
        PorterDuff.Mode mode = this.mTintMode;
        if (mode != DEFAULT_TINT_MODE) {
            bundle.putString(EXTRA_TINT_MODE, mode.name());
        }
        return bundle;
    }

    public String toString() {
        if (this.mType == -1) {
            return String.valueOf(this.mObj1);
        }
        StringBuilder sbAppend = new StringBuilder("Icon(typ=").append(typeToString(this.mType));
        switch (this.mType) {
            case 1:
            case 5:
                sbAppend.append(" size=").append(((Bitmap) this.mObj1).getWidth()).append("x").append(((Bitmap) this.mObj1).getHeight());
                break;
            case 2:
                sbAppend.append(" pkg=").append(this.mString1).append(" id=").append(String.format("0x%08x", Integer.valueOf(getResId())));
                break;
            case 3:
                sbAppend.append(" len=").append(this.mInt1);
                if (this.mInt2 != 0) {
                    sbAppend.append(" off=").append(this.mInt2);
                }
                break;
            case 4:
            case 6:
                sbAppend.append(" uri=").append(this.mObj1);
                break;
        }
        if (this.mTintList != null) {
            sbAppend.append(" tint=");
            sbAppend.append(this.mTintList);
        }
        if (this.mTintMode != DEFAULT_TINT_MODE) {
            sbAppend.append(" mode=").append(this.mTintMode);
        }
        sbAppend.append(")");
        return sbAppend.toString();
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPreParceling(boolean z2) {
        this.mTintModeStr = this.mTintMode.name();
        switch (this.mType) {
            case -1:
                if (z2) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.mParcelable = (Parcelable) this.mObj1;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z2) {
                    Bitmap bitmap = (Bitmap) this.mObj1;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.mData = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.mParcelable = (Parcelable) this.mObj1;
                return;
            case 2:
                this.mData = ((String) this.mObj1).getBytes(Charset.forName(HTTP.UTF_16));
                return;
            case 3:
                this.mData = (byte[]) this.mObj1;
                return;
            case 4:
            case 6:
                this.mData = this.mObj1.toString().getBytes(Charset.forName(HTTP.UTF_16));
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
        this.mTintMode = PorterDuff.Mode.valueOf(this.mTintModeStr);
        switch (this.mType) {
            case -1:
                Parcelable parcelable = this.mParcelable;
                if (parcelable != null) {
                    this.mObj1 = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.mParcelable;
                if (parcelable2 != null) {
                    this.mObj1 = parcelable2;
                    return;
                }
                byte[] bArr = this.mData;
                this.mObj1 = bArr;
                this.mType = 3;
                this.mInt1 = 0;
                this.mInt2 = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.mData, Charset.forName(HTTP.UTF_16));
                this.mObj1 = str;
                if (this.mType != 2 || this.mString1 != null) {
                    return;
                }
                this.mString1 = str.split(Global.COLON, -1)[0];
                return;
            case 3:
                this.mObj1 = this.mData;
                return;
        }
    }

    private static String typeToString(int i2) {
        switch (i2) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public static IconCompat createFromBundle(Bundle bundle) {
        int i2 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i2);
        iconCompat.mInt1 = bundle.getInt(EXTRA_INT1);
        iconCompat.mInt2 = bundle.getInt(EXTRA_INT2);
        iconCompat.mString1 = bundle.getString(EXTRA_STRING1);
        if (bundle.containsKey(EXTRA_TINT_LIST)) {
            iconCompat.mTintList = (ColorStateList) bundle.getParcelable(EXTRA_TINT_LIST);
        }
        if (bundle.containsKey(EXTRA_TINT_MODE)) {
            iconCompat.mTintMode = PorterDuff.Mode.valueOf(bundle.getString(EXTRA_TINT_MODE));
        }
        switch (i2) {
            case -1:
            case 1:
            case 5:
                iconCompat.mObj1 = bundle.getParcelable(EXTRA_OBJ);
                return iconCompat;
            case 0:
            default:
                String str = "Unknown type " + i2;
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.mObj1 = bundle.getString(EXTRA_OBJ);
                return iconCompat;
            case 3:
                iconCompat.mObj1 = bundle.getByteArray(EXTRA_OBJ);
                return iconCompat;
        }
    }

    public static IconCompat createFromIcon(Context context, Icon icon) {
        Preconditions.checkNotNull(icon);
        return Api23Impl.createFromIcon(context, icon);
    }

    public static IconCompat createFromIcon(Icon icon) {
        return Api23Impl.createFromIconInner(icon);
    }

    public static IconCompat createFromIconOrNullIfZeroResId(Icon icon) {
        if (Api23Impl.getType(icon) == 2 && Api23Impl.getResId(icon) == 0) {
            return null;
        }
        return Api23Impl.createFromIconInner(icon);
    }

    static Bitmap createLegacyIconFromAdaptiveIcon(Bitmap bitmap, boolean z2) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f2 = iMin;
        float f3 = 0.5f * f2;
        float f4 = ICON_DIAMETER_FACTOR * f3;
        if (z2) {
            float f5 = BLUR_FACTOR * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * KEY_SHADOW_OFFSET_FACTOR, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static String getResPackage(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int getType(Object obj) {
            return ((Icon) obj).getType();
        }

        static int getResId(Object obj) {
            return ((Icon) obj).getResId();
        }

        static Uri getUri(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static Drawable createAdaptiveIconDrawable(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon createWithAdaptiveBitmap(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static Icon createWithAdaptiveBitmapContentUri(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static IconCompat createFromIcon(Context context, Icon icon) {
            int type = getType(icon);
            if (type == 2) {
                String resPackage = getResPackage(icon);
                try {
                    return IconCompat.createWithResource(IconCompat.getResources(context, resPackage), resPackage, getResId(icon));
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            }
            if (type == 4) {
                return IconCompat.createWithContentUri(getUri(icon));
            }
            if (type == 6) {
                return IconCompat.createWithAdaptiveBitmapContentUri(getUri(icon));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.mObj1 = icon;
            return iconCompat;
        }

        static int getType(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.getType(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e2) {
                String str = "Unable to get icon type " + obj;
                return -1;
            } catch (NoSuchMethodException e3) {
                String str2 = "Unable to get icon type " + obj;
                return -1;
            } catch (InvocationTargetException e4) {
                String str3 = "Unable to get icon type " + obj;
                return -1;
            }
        }

        static String getResPackage(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.getResPackage(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e2) {
                return null;
            } catch (NoSuchMethodException e3) {
                return null;
            } catch (InvocationTargetException e4) {
                return null;
            }
        }

        static IconCompat createFromIconInner(Object obj) {
            Preconditions.checkNotNull(obj);
            int type = getType(obj);
            if (type == 2) {
                return IconCompat.createWithResource(null, getResPackage(obj), getResId(obj));
            }
            if (type == 4) {
                return IconCompat.createWithContentUri(getUri(obj));
            }
            if (type == 6) {
                return IconCompat.createWithAdaptiveBitmapContentUri(getUri(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.mObj1 = obj;
            return iconCompat;
        }

        static int getResId(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.getResId(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e2) {
                return 0;
            } catch (NoSuchMethodException e3) {
                return 0;
            } catch (InvocationTargetException e4) {
                return 0;
            }
        }

        static Uri getUri(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.getUri(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e2) {
                return null;
            } catch (NoSuchMethodException e3) {
                return null;
            } catch (InvocationTargetException e4) {
                return null;
            }
        }

        static Icon toIcon(IconCompat iconCompat, Context context) throws Throwable {
            Icon iconCreateWithAdaptiveBitmap;
            switch (iconCompat.mType) {
                case -1:
                    return (Icon) iconCompat.mObj1;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithAdaptiveBitmap = Icon.createWithBitmap((Bitmap) iconCompat.mObj1);
                    break;
                case 2:
                    iconCreateWithAdaptiveBitmap = Icon.createWithResource(iconCompat.getResPackage(), iconCompat.mInt1);
                    break;
                case 3:
                    iconCreateWithAdaptiveBitmap = Icon.createWithData((byte[]) iconCompat.mObj1, iconCompat.mInt1, iconCompat.mInt2);
                    break;
                case 4:
                    iconCreateWithAdaptiveBitmap = Icon.createWithContentUri((String) iconCompat.mObj1);
                    break;
                case 5:
                    iconCreateWithAdaptiveBitmap = Api26Impl.createWithAdaptiveBitmap((Bitmap) iconCompat.mObj1);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithAdaptiveBitmap = Api30Impl.createWithAdaptiveBitmapContentUri(iconCompat.getUri());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.getUri());
                        }
                        InputStream uriInputStream = iconCompat.getUriInputStream(context);
                        if (uriInputStream == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.getUri());
                        }
                        iconCreateWithAdaptiveBitmap = Api26Impl.createWithAdaptiveBitmap(BitmapFactory.decodeStream(uriInputStream));
                    }
                    break;
            }
            if (iconCompat.mTintList != null) {
                iconCreateWithAdaptiveBitmap.setTintList(iconCompat.mTintList);
            }
            if (iconCompat.mTintMode != IconCompat.DEFAULT_TINT_MODE) {
                iconCreateWithAdaptiveBitmap.setTintMode(iconCompat.mTintMode);
            }
            return iconCreateWithAdaptiveBitmap;
        }

        static Drawable loadDrawable(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }
    }
}
