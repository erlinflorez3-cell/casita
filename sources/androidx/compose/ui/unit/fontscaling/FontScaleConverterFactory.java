package androidx.compose.ui.unit.fontscaling;

import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.unit.InlineClassHelperKt;
import kotlin.Metadata;
import kotlin.Unit;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: compiled from: FontScaleConverterFactory.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001d6Ȑ\u0007\":!\u007f\u0007ljA0RjP.XS2\u000f\u0002{<$q$yCAa\"}0\u000fWNmhvJh\u0014KƤ\u000e\u0016\u0007j4I[zcݐ\u000fHԏ ?aL0B?`ҽ:\u0005.2jV\b\u0016\u0019\u001aXS@z\tUc\f@;ptHe%M3%B\nL4\u0019\u001e\u000bn\u00156\u0011|kOG%\u0019hpYWc>\u0013e\rt[m\u0012?r,BX9K\u0014S^3\u000b`sW\u0003mx\u0004ݞho59b\fWdr0\u0018#Ag\r\fyl\\M_n'?+}j{T\u001cD\u0010z*'\u0003\u0004V\u00145eF-H\u00058\u0012A\u000b\u000bSnWHc\u000b\u0016\t\u0001N\u0017S c/G3~Q\u0010BIRE\u001d\u001d\rL.Gni\u007fb0x\u0015It([?tXCXP\u001aYkx2z\u0013\u00068\u001cHG.6,\u0015<8=7\nDi!<\u000eVE\u007fv3b?\u05c8kʐL@*ÂfM8\f$bTh\u0015mfS\u0007+?Qr΄\tą\f\u0015(\\\u0006Aq1\u001eTgh\u0018q$έ\\ɻ3f?ժ?w\u001c_Q^a<(ҲbуVv\u001c̳\r\u000b\u0013a~Hc\u000ej\\V-`R!\u00146\u007f\u001b\u0090\u0018Ʊ6QyʉD.7%j\u0015`\u0005$OO\u000b)a`w\u001e\u000fՇ7H"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9\u000fF\u007f4CWy';v\u0018w.MDz\"\u001c\u0011oa\u0017\u0011l=N\u00046GY/(Za|J(g", "", "u(E", "\u0011n\\:b5\u001f]\"\u000ehbA|\u0017", "", "\u001an^8h7-O\u0016\u0006zl\u001e\n\r>ef2yF", "", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "\u001bh] V(ESy\t\bG6\u0006o3n\u007f$\t", "", "!bP9X\u0012>g\u0001\u000f\u0002m0\b\u00103e\r", "AK^<^<IB\u0015{\u0002^:", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nn\"\u0013T}\u000e\u0018\u000421m[*?x\u0012=#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9\u000fF\u007f4CWy';v\u0018w.MDz\"\u001c\u0011oa\u0017\u0011l=N\u00046GY$", "5dc ?6HY)\niZ)\u0004\t=${1\u0005J\u0010\u0013&Ky\u0017J", "5dc ?6HY)\niZ)\u0004\t=", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`\u0005Rk\u001bJv\u0001Bfy4\u0015w\u001e9IR\u0011", "Adc ?6HY)\niZ)\u0004\t=", "uKP;W9HW\u0018\u0012D\\6\u0004\u0010/c\u000f,\u0006IJ\u0005\"C|\u001c<R2BU\u0012}Au!*\\\u0019~\\", "1qT.g,\"\\(~\bi6\u0004\u0005>e~\u0017w=\b\u0017sG~ <v.", "AsP?g", "3mS", "7mc2e7HZ\u0015\u000e~h5g\u00133n\u000f", "4na V(ES", "4n]AF*:Z\u0019", "5dc", "AbP9X\u0012>g", "5dc\u0018X@", "", "5dc V(ESy\f\u0005f\u0012|\u001d", "9dh", "7r=<a\u0013B\\\u0019z\b?6\u0006\u0018\u001dc{/\u007fI\u0003r\u0015Vs\u001f<", "", ">tc", "", "4n]AF*:Z\u0019\\\u0005g=|\u0016>e\r", ">tc\u0016a;H", "B`Q9X", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FontScaleConverterFactory {
    public static final int $stable;
    private static final float[] CommonFontSizes;
    public static final FontScaleConverterFactory INSTANCE;
    private static final Object[] LookupTablesWriteLock;
    private static final float MinScaleForNonLinear = 1.03f;
    private static final float ScaleKeyMultiplier = 100.0f;
    private static volatile SparseArrayCompat<FontScaleConverter> sLookupTables = null;

    private final int getKey(float f2) {
        return (int) (f2 * ScaleKeyMultiplier);
    }

    public static /* synthetic */ void getSLookupTables$annotations() {
    }

    private final float getScaleFromKey(int i2) {
        return i2 / ScaleKeyMultiplier;
    }

    public final boolean isNonLinearFontScalingActive(float f2) {
        return f2 >= MinScaleForNonLinear;
    }

    private FontScaleConverterFactory() {
    }

    static {
        FontScaleConverterFactory fontScaleConverterFactory = new FontScaleConverterFactory();
        INSTANCE = fontScaleConverterFactory;
        CommonFontSizes = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier};
        sLookupTables = new SparseArrayCompat<>(0, 1, null);
        Object[] objArr = new Object[0];
        LookupTablesWriteLock = objArr;
        synchronized (objArr) {
            fontScaleConverterFactory.putInto(sLookupTables, 1.15f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, ScaleKeyMultiplier}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.3f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, ScaleKeyMultiplier}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.5f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, ScaleKeyMultiplier}));
            fontScaleConverterFactory.putInto(sLookupTables, 1.8f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, ScaleKeyMultiplier}));
            fontScaleConverterFactory.putInto(sLookupTables, 2.0f, new FontScaleConverterTable(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, ScaleKeyMultiplier}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, ScaleKeyMultiplier}));
            Unit unit = Unit.INSTANCE;
        }
        if ((fontScaleConverterFactory.getScaleFromKey(sLookupTables.keyAt(0)) - 0.01f > MinScaleForNonLinear ? 1 : 0) == 0) {
            InlineClassHelperKt.throwIllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
        $stable = 8;
    }

    public final SparseArrayCompat<FontScaleConverter> getSLookupTables() {
        return sLookupTables;
    }

    public final void setSLookupTables(SparseArrayCompat<FontScaleConverter> sparseArrayCompat) {
        sLookupTables = sparseArrayCompat;
    }

    public final FontScaleConverter forScale(float f2) {
        FontScaleConverter fontScaleConverterValueAt;
        if (!isNonLinearFontScalingActive(f2)) {
            return null;
        }
        FontScaleConverter fontScaleConverter = INSTANCE.get(f2);
        if (fontScaleConverter != null) {
            return fontScaleConverter;
        }
        int iIndexOfKey = sLookupTables.indexOfKey(getKey(f2));
        if (iIndexOfKey >= 0) {
            return sLookupTables.valueAt(iIndexOfKey);
        }
        int i2 = -(iIndexOfKey + 1);
        int i3 = i2 - 1;
        float scaleFromKey = 1.0f;
        if (i2 >= sLookupTables.size()) {
            FontScaleConverterTable fontScaleConverterTable = new FontScaleConverterTable(new float[]{1.0f}, new float[]{f2});
            put(f2, fontScaleConverterTable);
            return fontScaleConverterTable;
        }
        if (i3 < 0) {
            float[] fArr = CommonFontSizes;
            fontScaleConverterValueAt = new FontScaleConverterTable(fArr, fArr);
        } else {
            scaleFromKey = getScaleFromKey(sLookupTables.keyAt(i3));
            fontScaleConverterValueAt = sLookupTables.valueAt(i3);
        }
        FontScaleConverter fontScaleConverterCreateInterpolatedTableBetween = createInterpolatedTableBetween(fontScaleConverterValueAt, sLookupTables.valueAt(i2), MathUtils.INSTANCE.constrainedMap(0.0f, 1.0f, scaleFromKey, getScaleFromKey(sLookupTables.keyAt(i2)), f2));
        put(f2, fontScaleConverterCreateInterpolatedTableBetween);
        return fontScaleConverterCreateInterpolatedTableBetween;
    }

    private final FontScaleConverter createInterpolatedTableBetween(FontScaleConverter fontScaleConverter, FontScaleConverter fontScaleConverter2, float f2) {
        float[] fArr = CommonFontSizes;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            float f3 = CommonFontSizes[i2];
            fArr2[i2] = MathUtils.INSTANCE.lerp(fontScaleConverter.convertSpToDp(f3), fontScaleConverter2.convertSpToDp(f3), f2);
        }
        return new FontScaleConverterTable(CommonFontSizes, fArr2);
    }

    private final void put(float f2, FontScaleConverter fontScaleConverter) {
        synchronized (LookupTablesWriteLock) {
            FontScaleConverterFactory fontScaleConverterFactory = INSTANCE;
            SparseArrayCompat<FontScaleConverter> sparseArrayCompatM371clone = sLookupTables.m371clone();
            fontScaleConverterFactory.putInto(sparseArrayCompatM371clone, f2, fontScaleConverter);
            sLookupTables = sparseArrayCompatM371clone;
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void putInto(SparseArrayCompat<FontScaleConverter> sparseArrayCompat, float f2, FontScaleConverter fontScaleConverter) {
        sparseArrayCompat.put(getKey(f2), fontScaleConverter);
    }

    private final FontScaleConverter get(float f2) {
        return sLookupTables.get(getKey(f2));
    }
}
