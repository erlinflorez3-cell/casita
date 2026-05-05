package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.facebook.common.util.UriUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
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
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class ResourceDrawableDecoder implements ResourceDecoder<Uri, Drawable> {
    private static final String ANDROID_PACKAGE_NAME = "android";
    private static final int ID_PATH_SEGMENTS = 1;
    private static final int MISSING_RESOURCE_ID = 0;
    private static final int NAME_PATH_SEGMENT_INDEX = 1;
    private static final int NAME_URI_PATH_SEGMENTS = 2;
    private static final int RESOURCE_ID_SEGMENT_INDEX = 0;
    private static final int TYPE_PATH_SEGMENT_INDEX = 0;
    private final Context context;

    public ResourceDrawableDecoder(Context context) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.Kd("hvm|zuq<r\u007f\u007f\u0007x\u0003\nDZ\b\b\u000f\u0001\u0015\u0012", (short) (OY.Xd() ^ 10773)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1607wl.Xd() ^ 20440);
        short sXd2 = (short) (C1607wl.Xd() ^ 12908);
        int[] iArr = new int[",4G.]ww~\t\u001187MV/ut\u0015\n42".length()];
        QB qb = new QB(",4G.]ww~\t\u001187MV/ut\u0015\n42");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            this.context = (Context) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private Context findContextForPackage(Uri uri, String str) throws Throwable {
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Xd("y\b~\u000e\f\u0007\u0003M\u0004\u0011\u0011\u0018\n\u0014\u001bUk\u0019\u0019 \u0012&#", (short) (Od.Xd() ^ (-22325)))).getMethod(Wg.vd("c`nIYZaV[X@R]T", (short) (C1633zX.Xd() ^ (-23973))), new Class[0]);
        try {
            method.setAccessible(true);
            if (str.equals((String) method.invoke(context, objArr))) {
                return this.context;
            }
            try {
                Context context2 = this.context;
                Class<?> cls = Class.forName(Qg.kd("GSHUQJD\rALJO?GL\u0005\u0019DBG7ID", (short) (C1633zX.Xd() ^ (-31252)), (short) (C1633zX.Xd() ^ (-24423))));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(hg.Vd("g]q['dXd\\\"FfcY]U", (short) (FB.Xd() ^ 27911), (short) (FB.Xd() ^ 7894)));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {str, 0};
                Method method2 = cls.getMethod(C1561oA.ud("o}oj|lVfgncheBmkp`rm", (short) (FB.Xd() ^ 24098)), clsArr);
                try {
                    method2.setAccessible(true);
                    return (Context) method2.invoke(context2, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (PackageManager.NameNotFoundException e3) {
                Context context3 = this.context;
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1561oA.yd("/=4C940z9FFM7AH\u0003\u0001..5\u001f30", (short) (Od.Xd() ^ (-30527)))).getMethod(C1561oA.Yd("\u000e\r\u001dy\f\u000f\u0018\u000f\u0016\u0015~\u0013 \u0019", (short) (Od.Xd() ^ (-25651))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    if (str.contains((String) method3.invoke(context3, objArr3))) {
                        return this.context;
                    }
                    throw new IllegalArgumentException(Xg.qd("Vr{\u007fyy6\f\b9\n}\u0011~\b\u000e@\u0005\u0012\u0012\u0019\u000b\u001f\u001cH\u0019\u001dK\"\u001c!\u0015\u0014!\u001a\"\u001e0\u001c\u001cX\u000f-%\\$.2.#7c+59\u0002h", (short) (Od.Xd() ^ (-3966)), (short) (Od.Xd() ^ (-28914))) + uri, e3);
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    private int findResourceIdFromResourceIdUri(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e2) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e2);
        }
    }

    private int findResourceIdFromTypeAndNameResourceUri(Context context, Uri uri) throws Throwable {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("SB\u001e>#\u000f?l(6\u0019f)(2a8\\-9\u000e%f", (short) (C1499aX.Xd() ^ (-9084)), (short) (C1499aX.Xd() ^ (-8630)))).getMethod(ZO.xd("TT6MW-;e+;T\\", (short) (FB.Xd() ^ 24504), (short) (FB.Xd() ^ 26744)), new Class[0]);
        try {
            method.setAccessible(true);
            int identifier = ((Resources) method.invoke(context, objArr)).getIdentifier(str2, str, authority);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, C1626yg.Ud("4`\u00134j\u000em", (short) (C1607wl.Xd() ^ 14683), (short) (C1607wl.Xd() ^ 28900)));
            }
            if (identifier != 0) {
                return identifier;
            }
            throw new IllegalArgumentException(Ig.wd("Q\u0017\u000fs\u0014=\\\"U2v YI\u0001y\u000f/ca\u0007P\u0001?\u0011\u0010m\u000b\u001eS?I", (short) (C1607wl.Xd() ^ 5286)) + uri);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private int findResourceIdFromUri(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return findResourceIdFromTypeAndNameResourceUri(context, uri);
        }
        if (pathSegments.size() == 1) {
            return findResourceIdFromResourceIdUri(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public Resource<Drawable> decode(Uri uri, int i2, int i3, Options options) throws Throwable {
        Context contextFindContextForPackage = findContextForPackage(uri, uri.getAuthority());
        return NonOwnedDrawableResource.newInstance(DrawableDecoderCompat.getDrawable(this.context, contextFindContextForPackage, findResourceIdFromUri(contextFindContextForPackage, uri)));
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(Uri uri, Options options) {
        return uri.getScheme().equals(UriUtil.QUALIFIED_RESOURCE_SCHEME);
    }
}
