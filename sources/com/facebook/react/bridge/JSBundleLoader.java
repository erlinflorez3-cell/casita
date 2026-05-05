package com.facebook.react.bridge;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.react.common.DebugServerException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import yg.C1626yg;
import yg.OY;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public abstract class JSBundleLoader {
    public static JSBundleLoader createAssetLoader(final Context context, final String str, final boolean z2) {
        return new JSBundleLoader() { // from class: com.facebook.react.bridge.JSBundleLoader.1
            @Override // com.facebook.react.bridge.JSBundleLoader
            public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) throws Throwable {
                Context context2 = context;
                Object[] objArr = new Object[0];
                Method method = Class.forName(ZO.xd("0ZZ\tNXc=L\u0012Pag\u001cX~>A\u007f\u000b$/=", (short) (OY.Xd() ^ 19105), (short) (OY.Xd() ^ 4063))).getMethod(C1626yg.Ud("\u0007?t\u0017xg(7/", (short) (ZN.Xd() ^ 4900), (short) (ZN.Xd() ^ 2140)), new Class[0]);
                try {
                    method.setAccessible(true);
                    jSBundleLoaderDelegate.loadScriptFromAssets((AssetManager) method.invoke(context2, objArr), str, z2);
                    return str;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        };
    }

    public static JSBundleLoader createCachedBundleFromNetworkLoader(final String str, final String str2) {
        return new JSBundleLoader() { // from class: com.facebook.react.bridge.JSBundleLoader.3
            @Override // com.facebook.react.bridge.JSBundleLoader
            public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
                try {
                    jSBundleLoaderDelegate.loadScriptFromFile(str2, str, false);
                    return str;
                } catch (Exception e2) {
                    throw DebugServerException.makeGeneric(str, Objects.toString(e2.getMessage(), ""), e2);
                }
            }
        };
    }

    public static JSBundleLoader createCachedSplitBundleFromNetworkLoader(final String str, final String str2) {
        return new JSBundleLoader() { // from class: com.facebook.react.bridge.JSBundleLoader.4
            @Override // com.facebook.react.bridge.JSBundleLoader
            public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
                try {
                    jSBundleLoaderDelegate.loadSplitBundleFromFile(str2, str);
                    return str;
                } catch (Exception e2) {
                    throw DebugServerException.makeGeneric(str, Objects.toString(e2.getMessage(), ""), e2);
                }
            }
        };
    }

    public static JSBundleLoader createFileLoader(String str) {
        return createFileLoader(str, str, false);
    }

    public static JSBundleLoader createFileLoader(final String str, final String str2, final boolean z2) {
        return new JSBundleLoader() { // from class: com.facebook.react.bridge.JSBundleLoader.2
            @Override // com.facebook.react.bridge.JSBundleLoader
            public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
                jSBundleLoaderDelegate.loadScriptFromFile(str, str2, z2);
                return str;
            }
        };
    }

    public static JSBundleLoader createRemoteDebuggerBundleLoader(final String str, final String str2) {
        return new JSBundleLoader() { // from class: com.facebook.react.bridge.JSBundleLoader.5
            @Override // com.facebook.react.bridge.JSBundleLoader
            public String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate) {
                jSBundleLoaderDelegate.setSourceURLs(str2, str);
                return str2;
            }
        };
    }

    public abstract String loadScript(JSBundleLoaderDelegate jSBundleLoaderDelegate);
}
