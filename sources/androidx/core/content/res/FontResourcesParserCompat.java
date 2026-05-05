package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Xml;
import androidx.core.R;
import androidx.core.provider.FontRequest;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import yg.C1561oA;
import yg.C1633zX;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public class FontResourcesParserCompat {
    private static final int DEFAULT_TIMEOUT_MILLIS = 500;
    public static final int FETCH_STRATEGY_ASYNC = 1;
    public static final int FETCH_STRATEGY_BLOCKING = 0;
    public static final int INFINITE_TIMEOUT_VALUE = -1;
    private static final int ITALIC = 1;
    private static final int NORMAL_WEIGHT = 400;

    public interface FamilyResourceEntry {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    public static final class ProviderResourceEntry implements FamilyResourceEntry {
        private final FontRequest mFallbackRequest;
        private final FontRequest mRequest;
        private final int mStrategy;
        private final String mSystemFontFamilyName;
        private final int mTimeoutMs;

        public ProviderResourceEntry(FontRequest fontRequest, FontRequest fontRequest2, int i2, int i3, String str) {
            this.mRequest = fontRequest;
            this.mFallbackRequest = fontRequest2;
            this.mStrategy = i2;
            this.mTimeoutMs = i3;
            this.mSystemFontFamilyName = str;
        }

        public ProviderResourceEntry(FontRequest fontRequest, int i2, int i3) {
            this(fontRequest, null, i2, i3, null);
        }

        public FontRequest getRequest() {
            return this.mRequest;
        }

        public FontRequest getFallbackRequest() {
            return this.mFallbackRequest;
        }

        public int getFetchStrategy() {
            return this.mStrategy;
        }

        public int getTimeout() {
            return this.mTimeoutMs;
        }

        public String getSystemFontFamilyName() {
            return this.mSystemFontFamilyName;
        }
    }

    public static final class FontFileResourceEntry {
        private final String mFileName;
        private final boolean mItalic;
        private final int mResourceId;
        private final int mTtcIndex;
        private final String mVariationSettings;
        private final int mWeight;

        public FontFileResourceEntry(String str, int i2, boolean z2, String str2, int i3, int i4) {
            this.mFileName = str;
            this.mWeight = i2;
            this.mItalic = z2;
            this.mVariationSettings = str2;
            this.mTtcIndex = i3;
            this.mResourceId = i4;
        }

        public String getFileName() {
            return this.mFileName;
        }

        public int getWeight() {
            return this.mWeight;
        }

        public boolean isItalic() {
            return this.mItalic;
        }

        public String getVariationSettings() {
            return this.mVariationSettings;
        }

        public int getTtcIndex() {
            return this.mTtcIndex;
        }

        public int getResourceId() {
            return this.mResourceId;
        }
    }

    public static final class FontFamilyFilesResourceEntry implements FamilyResourceEntry {
        private final FontFileResourceEntry[] mEntries;

        public FontFamilyFilesResourceEntry(FontFileResourceEntry[] fontFileResourceEntryArr) {
            this.mEntries = fontFileResourceEntryArr;
        }

        public FontFileResourceEntry[] getEntries() {
            return this.mEntries;
        }
    }

    public static FamilyResourceEntry parse(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return readFamilies(xmlPullParser, resources);
    }

    private static FamilyResourceEntry readFamilies(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return readFamily(xmlPullParser, resources);
        }
        skip(xmlPullParser);
        return null;
    }

    private static FamilyResourceEntry readFamily(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.FontFamily);
        String string = typedArrayObtainAttributes.getString(R.styleable.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(R.styleable.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(R.styleable.FontFamily_fontProviderQuery);
        String string4 = typedArrayObtainAttributes.getString(R.styleable.FontFamily_fontProviderFallbackQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(R.styleable.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(R.styleable.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(R.styleable.FontFamily_fontProviderFetchTimeout, 500);
        String string5 = typedArrayObtainAttributes.getString(R.styleable.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                skip(xmlPullParser);
            }
            List<List<byte[]>> certs = readCerts(resources, resourceId);
            return new ProviderResourceEntry(new FontRequest(string, string2, string3, certs), string4 != null ? new FontRequest(string, string2, string4, certs) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(readFont(xmlPullParser, resources));
                } else {
                    skip(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new FontFamilyFilesResourceEntry((FontFileResourceEntry[]) arrayList.toArray(new FontFileResourceEntry[0]));
    }

    private static int getType(TypedArray typedArray, int i2) {
        return Api21Impl.getType(typedArray, i2);
    }

    public static List<List<byte[]>> readCerts(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (getType(typedArrayObtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(toByteArrayList(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(toByteArrayList(resources.getStringArray(i2)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static List<byte[]> toByteArrayList(String[] strArr) throws Throwable {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            short sXd = (short) (ZN.Xd() ^ 29086);
            short sXd2 = (short) (ZN.Xd() ^ 7013);
            int[] iArr = new int["4@5B>71y@>24t\b&7(wt".length()];
            QB qb = new QB("4@5B>71y@>24t\b&7(wt");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[2];
            short sXd3 = (short) (C1633zX.Xd() ^ (-2147));
            short sXd4 = (short) (C1633zX.Xd() ^ (-29746));
            int[] iArr2 = new int["\u0015\u000b\u001f\tT\u0012\u0006\u0012\nOs\u0014\u0011\u0007\u000b\u0003".length()];
            QB qb2 = new QB("\u0015\u000b\u001f\tT\u0012\u0006\u0012\nOs\u0014\u0011\u0007\u000b\u0003");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {str, 0};
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.ud("\u000e\u000e\u000b\u0016\n\n", (short) (ZN.Xd() ^ 31292)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                arrayList.add((byte[]) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return arrayList;
    }

    private static FontFileResourceEntry readFont(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.FontFamilyFont);
        if (typedArrayObtainAttributes.hasValue(R.styleable.FontFamilyFont_fontWeight)) {
            i2 = R.styleable.FontFamilyFont_fontWeight;
        } else {
            i2 = R.styleable.FontFamilyFont_android_fontWeight;
        }
        int i7 = typedArrayObtainAttributes.getInt(i2, 400);
        if (typedArrayObtainAttributes.hasValue(R.styleable.FontFamilyFont_fontStyle)) {
            i3 = R.styleable.FontFamilyFont_fontStyle;
        } else {
            i3 = R.styleable.FontFamilyFont_android_fontStyle;
        }
        boolean z2 = 1 == typedArrayObtainAttributes.getInt(i3, 0);
        if (typedArrayObtainAttributes.hasValue(R.styleable.FontFamilyFont_ttcIndex)) {
            i4 = R.styleable.FontFamilyFont_ttcIndex;
        } else {
            i4 = R.styleable.FontFamilyFont_android_ttcIndex;
        }
        if (typedArrayObtainAttributes.hasValue(R.styleable.FontFamilyFont_fontVariationSettings)) {
            i5 = R.styleable.FontFamilyFont_fontVariationSettings;
        } else {
            i5 = R.styleable.FontFamilyFont_android_fontVariationSettings;
        }
        String string = typedArrayObtainAttributes.getString(i5);
        int i8 = typedArrayObtainAttributes.getInt(i4, 0);
        if (typedArrayObtainAttributes.hasValue(R.styleable.FontFamilyFont_font)) {
            i6 = R.styleable.FontFamilyFont_font;
        } else {
            i6 = R.styleable.FontFamilyFont_android_font;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i6, 0);
        String string2 = typedArrayObtainAttributes.getString(i6);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            skip(xmlPullParser);
        }
        return new FontFileResourceEntry(string2, i7, z2, string, i8, resourceId);
    }

    private static void skip(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    private FontResourcesParserCompat() {
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static int getType(TypedArray typedArray, int i2) {
            return typedArray.getType(i2);
        }
    }
}
