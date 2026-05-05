package com.facebook.react.views.text.frescosupport;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.facebook.common.logging.FLog;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.internal.ReactTextInlineImageShadowNode;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
class FrescoBasedReactTextInlineImageShadowNode extends ReactTextInlineImageShadowNode {
    private final Object mCallerContext;
    private final AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    private ReadableMap mHeaders;
    private String mResizeMode;
    private Uri mUri;
    private float mWidth = Float.NaN;
    private float mHeight = Float.NaN;
    private int mTintColor = 0;

    public FrescoBasedReactTextInlineImageShadowNode(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mCallerContext = obj;
    }

    private static Uri getResourceDrawableUri(Context context, String str) throws Throwable {
        if (str == null || str.isEmpty()) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        String strVd = Wg.vd("!", (short) (ZN.Xd() ^ 29701));
        short sXd = (short) (C1607wl.Xd() ^ 27154);
        short sXd2 = (short) (C1607wl.Xd() ^ 32136);
        int[] iArr = new int["R".length()];
        QB qb = new QB("R");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        String strReplace = lowerCase.replace(strVd, new String(iArr, 0, i2));
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("\u001c(\u001d*&\u001f\u0019a\u0016!\u001f$\u0014\u001c!Ym\u0019\u0017\u001c\f\u001e\u0019", (short) (OY.Xd() ^ 3514), (short) (OY.Xd() ^ 14447))).getMethod(C1561oA.ud("tq\u007f\\n{v{wghu", (short) (ZN.Xd() ^ 22612)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            String strYd = C1561oA.yd("\u000b\u001a\u0006\u001d\u0004\u0006\r\u0007", (short) (FB.Xd() ^ 25405));
            short sXd3 = (short) (FB.Xd() ^ 11285);
            int[] iArr2 = new int["iwn}{vr=s\u0001\u0001\by\u0004\u000bE[\t\t\u0010\u0002\u0016\u0013".length()];
            QB qb2 = new QB("iwn}{vr=s\u0001\u0001\by\u0004\u000bE[\t\t\u0010\u0002\u0016\u0013");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd3 + sXd3) + sXd3) + i3));
                i3++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr2, 0, i3)).getMethod(Xg.qd(">=M*<?H?FE/CPI", (short) (ZN.Xd() ^ 24395), (short) (ZN.Xd() ^ 16214)), new Class[0]);
            try {
                method2.setAccessible(true);
                return new Uri.Builder().scheme(Jg.Wd("`\"`", (short) (C1633zX.Xd() ^ (-21173)), (short) (C1633zX.Xd() ^ (-15071)))).path(String.valueOf(resources.getIdentifier(strReplace, strYd, (String) method2.invoke(context, objArr2)))).build();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.facebook.react.views.text.internal.ReactTextInlineImageShadowNode
    public TextInlineImageSpan buildInlineImageSpan() {
        return new FrescoBasedReactTextInlineImageSpan(getThemedContext().getResources(), (int) Math.ceil(this.mHeight), (int) Math.ceil(this.mWidth), this.mTintColor, getUri(), getHeaders(), getDraweeControllerBuilder(), getCallerContext(), this.mResizeMode);
    }

    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public AbstractDraweeControllerBuilder getDraweeControllerBuilder() {
        return this.mDraweeControllerBuilder;
    }

    public ReadableMap getHeaders() {
        return this.mHeaders;
    }

    public Uri getUri() {
        return this.mUri;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtual() {
        return true;
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\tT`}\u0001:!")
    public void setHeaders(ReadableMap readableMap) {
        this.mHeaders = readableMap;
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    public void setHeight(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.mHeight = (float) dynamic.asDouble();
        } else {
            FLog.w(ReactConstants.TAG, "Inline images must not have percentage based height");
            this.mHeight = Float.NaN;
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tr\u0003\u0016-z\bZ;")
    public void setResizeMode(String str) {
        this.mResizeMode = str;
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0014ab")
    public void setSource(ReadableArray readableArray) throws Throwable {
        Uri resourceDrawableUri = null;
        String string = (readableArray == null || readableArray.size() == 0) ? null : readableArray.getMap(0).getString("uri");
        if (string != null) {
            try {
                Uri uri = Uri.parse(string);
                if (uri.getScheme() != null) {
                    resourceDrawableUri = uri;
                }
            } catch (Exception unused) {
            }
            if (resourceDrawableUri == null) {
                resourceDrawableUri = getResourceDrawableUri(getThemedContext(), string);
            }
        }
        if (resourceDrawableUri != this.mUri) {
            markUpdated();
        }
        this.mUri = resourceDrawableUri;
    }

    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", name = "\u0015Xm\u000e^7\u001a\bh")
    public void setTintColor(int i2) {
        this.mTintColor = i2;
    }

    @Override // com.facebook.react.uimanager.LayoutShadowNode
    public void setWidth(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.mWidth = (float) dynamic.asDouble();
        } else {
            FLog.w(ReactConstants.TAG, "Inline images must not have percentage based width");
            this.mWidth = Float.NaN;
        }
    }
}
