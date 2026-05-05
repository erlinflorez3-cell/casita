package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.graphics.TypefaceCompatUtil;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import o.o.c$$ExternalSyntheticBackport0;
import yg.C1561oA;
import yg.C1607wl;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class FontsContractCompat {

    @Deprecated
    public static final String PARCEL_FONT_RESULTS = "font_results";

    @Deprecated
    static final int RESULT_CODE_PROVIDER_NOT_FOUND = -1;

    @Deprecated
    static final int RESULT_CODE_WRONG_CERTIFICATES = -2;

    public static final class Columns implements BaseColumns {
        public static final String FILE_ID = "file_id";
        public static final String ITALIC = "font_italic";
        public static final String RESULT_CODE = "result_code";
        public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
        public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
        public static final int RESULT_CODE_MALFORMED_QUERY = 3;
        public static final int RESULT_CODE_OK = 0;
        public static final String TTC_INDEX = "font_ttc_index";
        public static final String VARIATION_SETTINGS = "font_variation_settings";
        public static final String WEIGHT = "font_weight";
    }

    public static class FontRequestCallback {
        public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
        public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
        public static final int FAIL_REASON_MALFORMED_QUERY = 3;
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
        public static final int FAIL_REASON_SECURITY_VIOLATION = -4;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;

        @Deprecated
        public static final int RESULT_OK = 0;
        static final int RESULT_SUCCESS = 0;

        @Retention(RetentionPolicy.SOURCE)
        public @interface FontRequestFailReason {
        }

        public void onTypefaceRequestFailed(int i2) {
        }

        public void onTypefaceRetrieved(Typeface typeface) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TypefaceStyle {
    }

    private FontsContractCompat() {
    }

    public static Typeface buildTypeface(Context context, CancellationSignal cancellationSignal, FontInfo[] fontInfoArr) {
        return TypefaceCompat.createFromFontInfo(context, cancellationSignal, fontInfoArr, 0);
    }

    public static FontFamilyResult fetchFonts(Context context, CancellationSignal cancellationSignal, FontRequest fontRequest) throws PackageManager.NameNotFoundException {
        return FontProvider.getFontFamilyResult(context, c$$ExternalSyntheticBackport0.m(new Object[]{fontRequest}), cancellationSignal);
    }

    @Deprecated
    public static void requestFont(Context context, FontRequest fontRequest, FontRequestCallback fontRequestCallback, Handler handler) throws Throwable {
        CallbackWrapper callbackWrapper = new CallbackWrapper(fontRequestCallback);
        Executor executorCreateHandlerExecutor = RequestExecutor.createHandlerExecutor(handler);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.yd("\u001e*#00)'o\u0018#%*\u001e&/g\u0010;=B6HG", (short) (OY.Xd() ^ 16833))).getMethod(C1561oA.Yd("DCS!QROMHG[QXX.[[bThe", (short) (OY.Xd() ^ 28432)), new Class[0]);
        try {
            method.setAccessible(true);
            FontRequestWorker.requestFontAsync((Context) method.invoke(context, objArr), c$$ExternalSyntheticBackport0.m(new Object[]{fontRequest}), 0, executorCreateHandlerExecutor, callbackWrapper);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void requestFont(Context context, FontRequest fontRequest, int i2, Executor executor, Executor executor2, FontRequestCallback fontRequestCallback) throws Throwable {
        CallbackWrapper callbackWrapper = new CallbackWrapper(fontRequestCallback, executor2);
        Object[] objArr = new Object[0];
        Method method = Class.forName(hg.Vd("XdYfb[U\u001eR][`PX]\u0016*USXHZU", (short) (Od.Xd() ^ (-199)), (short) (Od.Xd() ^ (-2517)))).getMethod(C1561oA.ud("ro}Iwvqmfcuinl@kin^pk", (short) (C1607wl.Xd() ^ 16535)), new Class[0]);
        try {
            method.setAccessible(true);
            FontRequestWorker.requestFontAsync((Context) method.invoke(context, objArr), c$$ExternalSyntheticBackport0.m(new Object[]{fontRequest}), i2, executor, callbackWrapper);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static void requestFontWithFallbackChain(Context context, List<FontRequest> list, int i2, Executor executor, Executor executor2, FontRequestCallback fontRequestCallback) throws Throwable {
        CallbackWrapper callbackWrapper = new CallbackWrapper(fontRequestCallback, executor2);
        short sXd = (short) (OY.Xd() ^ 24113);
        short sXd2 = (short) (OY.Xd() ^ 32713);
        int[] iArr = new int["Xf]ljea,boovhry4Jww~p\u0005\u0002".length()];
        QB qb = new QB("Xf]ljea,boovhry4Jww~p\u0005\u0002");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i3)).getMethod(Jg.Wd("A^xV\u0015#0LWc\u0006\f\u001d;$[k\u0003\u007f$?", (short) (C1607wl.Xd() ^ 20293), (short) (C1607wl.Xd() ^ 13498)), new Class[0]);
        try {
            method.setAccessible(true);
            FontRequestWorker.requestFontAsync((Context) method.invoke(context, objArr), list, i2, executor, callbackWrapper);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static Typeface requestFont(Context context, List<FontRequest> list, int i2, boolean z2, int i3, Handler handler, FontRequestCallback fontRequestCallback) {
        CallbackWrapper callbackWrapper = new CallbackWrapper(fontRequestCallback, RequestExecutor.createHandlerExecutor(handler));
        if (z2) {
            if (list.size() > 1) {
                throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
            }
            return FontRequestWorker.requestFontSync(context, list.get(0), callbackWrapper, i2, i3);
        }
        return FontRequestWorker.requestFontAsync(context, list, i2, null, callbackWrapper);
    }

    public static Typeface requestFont(Context context, FontRequest fontRequest, int i2, boolean z2, int i3, Handler handler, FontRequestCallback fontRequestCallback) {
        return requestFont(context, (List<FontRequest>) c$$ExternalSyntheticBackport0.m(new Object[]{fontRequest}), i2, z2, i3, handler, fontRequestCallback);
    }

    public static void resetTypefaceCache() {
        FontRequestWorker.resetTypefaceCache();
    }

    public static class FontInfo {
        private final boolean mItalic;
        private final int mResultCode;
        private final int mTtcIndex;
        private final Uri mUri;
        private final int mWeight;

        @Deprecated
        public FontInfo(Uri uri, int i2, int i3, boolean z2, int i4) {
            this.mUri = (Uri) Preconditions.checkNotNull(uri);
            this.mTtcIndex = i2;
            this.mWeight = i3;
            this.mItalic = z2;
            this.mResultCode = i4;
        }

        static FontInfo create(Uri uri, int i2, int i3, boolean z2, int i4) {
            return new FontInfo(uri, i2, i3, z2, i4);
        }

        public Uri getUri() {
            return this.mUri;
        }

        public int getTtcIndex() {
            return this.mTtcIndex;
        }

        public int getWeight() {
            return this.mWeight;
        }

        public boolean isItalic() {
            return this.mItalic;
        }

        public int getResultCode() {
            return this.mResultCode;
        }
    }

    public static class FontFamilyResult {
        public static final int STATUS_OK = 0;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
        public static final int STATUS_WRONG_CERTIFICATES = 1;
        private final List<FontInfo[]> mFonts;
        private final int mStatusCode;

        @Deprecated
        public FontFamilyResult(int i2, FontInfo[] fontInfoArr) {
            this.mStatusCode = i2;
            this.mFonts = Collections.singletonList(fontInfoArr);
        }

        FontFamilyResult(int i2, List<FontInfo[]> list) {
            this.mStatusCode = i2;
            this.mFonts = list;
        }

        public int getStatusCode() {
            return this.mStatusCode;
        }

        public FontInfo[] getFonts() {
            return this.mFonts.get(0);
        }

        boolean hasFallback() {
            return this.mFonts.size() > 1;
        }

        public List<FontInfo[]> getFontsWithFallbacks() {
            return this.mFonts;
        }

        static FontFamilyResult create(int i2, FontInfo[] fontInfoArr) {
            return new FontFamilyResult(i2, fontInfoArr);
        }

        static FontFamilyResult create(int i2, List<FontInfo[]> list) {
            return new FontFamilyResult(i2, list);
        }
    }

    @Deprecated
    public static Typeface getFontSync(Context context, FontRequest fontRequest, ResourcesCompat.FontCallback fontCallback, Handler handler, boolean z2, int i2, int i3) throws Throwable {
        TypefaceCompat.ResourcesCallbackAdapter resourcesCallbackAdapter = new TypefaceCompat.ResourcesCallbackAdapter(fontCallback);
        return requestFont(context, (List<FontRequest>) c$$ExternalSyntheticBackport0.m(new Object[]{fontRequest}), i3, z2, i2, ResourcesCompat.FontCallback.getHandler(handler), resourcesCallbackAdapter);
    }

    @Deprecated
    public static void resetCache() {
        FontRequestWorker.resetTypefaceCache();
    }

    @Deprecated
    public static Map<Uri, ByteBuffer> prepareFontData(Context context, FontInfo[] fontInfoArr, CancellationSignal cancellationSignal) {
        return TypefaceCompatUtil.readFontInfoIntoByteBuffer(context, fontInfoArr, cancellationSignal);
    }

    @Deprecated
    public static ProviderInfo getProvider(PackageManager packageManager, FontRequest fontRequest, Resources resources) throws PackageManager.NameNotFoundException {
        return FontProvider.getProvider(packageManager, fontRequest, resources);
    }
}
