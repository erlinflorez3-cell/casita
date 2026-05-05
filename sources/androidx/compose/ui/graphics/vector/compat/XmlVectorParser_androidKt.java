package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathParser;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import com.facebook.react.uimanager.ViewProps;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: XmlVectorParser.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я^\u001d̉=!,o\bDJh|\u0004O\u00128\u000b4C\u0007\"B\u0012\u007f\u0007lmA0ZeP.XS2\u000f\u0002{<řc$\bCC٥\"}8\tWN}gvϺb\u000bY\u000f\u000eǝ\u0001jBI]ތe\u0012%2JģG3[xE9vt>ӌ(208\u0002\u0005\u0007\u001fBj\u001e\u0001\u0013Cy\u0017B4N|RR;L5 \u0018\u0006L-\u0019\u001e\u000br\u00156֘kҗƠ3%\twP]?\u0002>\re\rteW\u0011\u0005m6+n6e\u001b+S\u0011\u0014j[m\u0014\u0006qޮ\u0004ؒҊ+-O\u0006eEp\u0010\"(CQ#\\!:\r\t_u$'Ye*Kh66\u000f\u0013{;T,\u000e4@x2;4~\b<N%|a\\h\btA.\u001826E@079W3f\u007f\u0001\u0002ϊfA\n%%\u001eQ\"\u0017!\nvT֫-Kb\u001bi1\u007fdeH|#\nA{\u001e\tb0E4:U\u001cG\u0002'-EB\b[g>Qo\u0010f\\g%$\u0011la\u000fjHn:5ݫOd\u00172rD\u0013\u0004\u0014P\u0003q\\\u0015[6l\u0007,#C$j\u0016T!S/~[nixiu\u0010;.\u0015T*n\u001a)\b=lXMQ\u0012(\u0012V\u0005;W<\u0011\u0004\u001f٨Z\u0004\u001a\u0003t(PVpj>\u0011,H\\&+2m\rL>:M1b+G1;\u0013A+$\u0010^v.\u0017TaC3m2\u001a!\u0001~t7ב\u007f)WU\u0015`PQiQc2VY0\u0003L|Q\"/}\u000ec\u007fR]K\u001b3FU*;F\u001eGoG=A./-@'EEz\u000b,ʸe\u001c5%\u0015y=]\u0011.\u0016*1ѱLlx\u07bagTE!Mܨ5ן\fd\bט\u0002R\tG{T9Z\u0015ηEè]<V˻\u001d\u0011-\u001f=\u0001\u001e!Sމ\u007fϡ+\u001d\u001eߐ4;#cui\u001e-Pʯa֑xe\fϺ\u0004\"}ei]`:\u000fՁ,˽B\",З#NVn\u0010\bp\b\u000bق\u0006ȈEdxމXY\u00194\u0016f5+cߡ)ݍ>\u0013wϘT:m0\fC,\u001b5ƼwݱQSoƚ\u000eWj\u0013b\u000f8\u0012RυA݁ =(݈wn\u00179\u001esF=\u0018ݨ5ƀ@\t,҉ɹ<\r\u0013FZɍ\">yĽJ\u000b"}, d2 = {"\u0014H;\u0019R\u001b2>xxlB\u0015[l\u0018G", "", "\u001aH=\u00126\b)MuniM", "\u001aH=\u00126\b)M\u0006hjG\u000b", "\u001aH=\u00126\b)M\u0007jj:\u0019\\", "\u001aH=\u0012=\u0016\"<\u0013[ZO\fc", "\u001aH=\u0012=\u0016\"<\u0013f^M\fi", "\u001aH=\u0012=\u0016\"<\u0013kdN\u0015[", "!G0\u001d8&\u001c:|itI\bkk", "", "!G0\u001d8& @\u0003ne", "!G0\u001d8&)/\ba", "5dc g9HY\u0019e~g,Z\u0005:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=ms*X\u0019", "7c", "2dU#T3NS", "5dc g9HY\u0019e~g,Z\u0005:-]\u0016o$\u0001\u0007\u001d", "uH8u<", "5dc g9HY\u0019e~g,a\u00133n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=mz8QL\u0011", "5dc g9HY\u0019e~g,a\u00133nG.bOe\u0011(#", "=ac.\\5\u001b`)\r}?9\u0007\u0011\ro\b3\u0003@\u0014t!Ny\u001b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "1n\\=_,Q1#\u0006\u0005k", "\u001a`]1e6BR,Hxh9|R-o\t7{I\u0010`$G}W\u001a\u0001-@`}3\u0015w\u001d8Z!Es?\u001a$>", "1qT.g,/S\u0017\u000e\u0005k\u0010\u0005\u00051e\\8\u007fG\u007f\u0017$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0012U?=k%\u001e\u0013wkFE@<R}&GY$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_,WKFgCgpq`F\u0011g+?v%VV[\u0017X_\u0001=!g", "@db", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\nm\u0017%Q\u007f\u001b:v3\u000b", "BgT:X", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\nm\u0017%Q\u007f\u001b:v3sH\u0001 ?mk", "/sc?f", "\u001a`]1e6BRb\u000f\nb3Fd>t\r,xP\u0010\u0017\u0005G~c", "7r0A85=", "", "\u001ana4\"?FZ$\u000f\u0002eu\u000eTxX\b/fP\b\u001e\u0002C|\u001c<\u0004z", ">`a@X\nEW$ivm/", "", "0tX9W,K", ">`a@X\nN`&~\u0004m\u001d|\u0007>o\r\u0011\u0006?\u0001", "<dbAX+ `#\u000f\u0006l", ">`a@X\u000eK])\n", ">`a@X\u0017:b\u001c", "AdT8G6,b\u0015\f\nM(~", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class XmlVectorParser_androidKt {
    private static final int FILL_TYPE_WINDING = 0;
    private static final int LINECAP_BUTT = 0;
    private static final int LINECAP_ROUND = 1;
    private static final int LINECAP_SQUARE = 2;
    private static final int LINEJOIN_BEVEL = 2;
    private static final int LINEJOIN_MITER = 0;
    private static final int LINEJOIN_ROUND = 1;
    private static final String SHAPE_CLIP_PATH = "clip-path";
    private static final String SHAPE_GROUP = "group";
    private static final String SHAPE_PATH = "path";

    /* JADX INFO: renamed from: getStrokeLineCap-CSYIeUk$default, reason: not valid java name */
    static /* synthetic */ int m4903getStrokeLineCapCSYIeUk$default(int i2, int i3, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = StrokeCap.Companion.m4531getButtKaPHkGw();
        }
        return m4902getStrokeLineCapCSYIeUk(i2, i3);
    }

    /* JADX INFO: renamed from: getStrokeLineCap-CSYIeUk, reason: not valid java name */
    private static final int m4902getStrokeLineCapCSYIeUk(int i2, int i3) {
        if (i2 == 0) {
            return StrokeCap.Companion.m4531getButtKaPHkGw();
        }
        if (i2 == 1) {
            return StrokeCap.Companion.m4532getRoundKaPHkGw();
        }
        if (i2 != 2) {
            return i3;
        }
        return StrokeCap.Companion.m4533getSquareKaPHkGw();
    }

    /* JADX INFO: renamed from: getStrokeLineJoin-kLtJ_vA$default, reason: not valid java name */
    static /* synthetic */ int m4905getStrokeLineJoinkLtJ_vA$default(int i2, int i3, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i3 = StrokeJoin.Companion.m4542getMiterLxFBmk8();
        }
        return m4904getStrokeLineJoinkLtJ_vA(i2, i3);
    }

    /* JADX INFO: renamed from: getStrokeLineJoin-kLtJ_vA, reason: not valid java name */
    private static final int m4904getStrokeLineJoinkLtJ_vA(int i2, int i3) {
        if (i2 == 0) {
            return StrokeJoin.Companion.m4542getMiterLxFBmk8();
        }
        if (i2 == 1) {
            return StrokeJoin.Companion.m4543getRoundLxFBmk8();
        }
        if (i2 != 2) {
            return i3;
        }
        return StrokeJoin.Companion.m4541getBevelLxFBmk8();
    }

    public static final boolean isAtEnd(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 1) {
            return xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3;
        }
        return true;
    }

    public static /* synthetic */ int parseCurrentVectorNode$default(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            theme = null;
        }
        return parseCurrentVectorNode(androidVectorParser, resources, attributeSet, theme, builder, i2);
    }

    public static final int parseCurrentVectorNode(AndroidVectorParser androidVectorParser, Resources resources, AttributeSet attributeSet, Resources.Theme theme, ImageVector.Builder builder, int i2) throws XmlPullParserException {
        int eventType = androidVectorParser.getXmlParser().getEventType();
        if (eventType == 2) {
            String name = androidVectorParser.getXmlParser().getName();
            if (name == null) {
                return i2;
            }
            int iHashCode = name.hashCode();
            if (iHashCode == -1649314686) {
                if (!name.equals(SHAPE_CLIP_PATH)) {
                    return i2;
                }
                parseClipPath(androidVectorParser, resources, theme, attributeSet, builder);
                return i2 + 1;
            }
            if (iHashCode == 3433509) {
                if (name.equals("path")) {
                    parsePath(androidVectorParser, resources, theme, attributeSet, builder);
                    return i2;
                }
                return i2;
            }
            if (iHashCode != 98629247 || !name.equals(SHAPE_GROUP)) {
                return i2;
            }
            parseGroup(androidVectorParser, resources, theme, attributeSet, builder);
            return i2;
        }
        if (eventType != 3 || !Intrinsics.areEqual(SHAPE_GROUP, androidVectorParser.getXmlParser().getName())) {
            return i2;
        }
        int i3 = i2 + 1;
        for (int i4 = 0; i4 < i3; i4++) {
            builder.clearGroup();
        }
        return 0;
    }

    public static final XmlPullParser seekToStartTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static final ImageVector.Builder createVectorImageBuilder(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet) throws XmlPullParserException {
        long jM4214getUnspecified0d7_KjU;
        int iM4118getSrcIn0nO6VwU;
        ColorStateList namedColorStateList;
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY());
        boolean namedBoolean = androidVectorParser.getNamedBoolean(typedArrayObtainAttributes, "autoMirrored", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED(), false);
        float namedFloat = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "viewportWidth", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "viewportHeight", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT(), 0.0f);
        if (namedFloat <= 0.0f) {
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (namedFloat2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float dimension = androidVectorParser.getDimension(typedArrayObtainAttributes, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_WIDTH(), 0.0f);
        float dimension2 = androidVectorParser.getDimension(typedArrayObtainAttributes, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_HEIGHT(), 0.0f);
        if (typedArrayObtainAttributes.hasValue(AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) {
            TypedValue typedValue = new TypedValue();
            typedArrayObtainAttributes.getValue(AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_TINT(), typedValue);
            if (typedValue.type != 2 && (namedColorStateList = androidVectorParser.getNamedColorStateList(typedArrayObtainAttributes, theme, "tint", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) != null) {
                jM4214getUnspecified0d7_KjU = ColorKt.Color(namedColorStateList.getDefaultColor());
            } else {
                jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
            }
        } else {
            jM4214getUnspecified0d7_KjU = Color.Companion.m4214getUnspecified0d7_KjU();
        }
        int i2 = androidVectorParser.getInt(typedArrayObtainAttributes, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE(), -1);
        if (i2 == -1) {
            iM4118getSrcIn0nO6VwU = BlendMode.Companion.m4118getSrcIn0nO6VwU();
        } else if (i2 == 3) {
            iM4118getSrcIn0nO6VwU = BlendMode.Companion.m4120getSrcOver0nO6VwU();
        } else if (i2 == 5) {
            iM4118getSrcIn0nO6VwU = BlendMode.Companion.m4118getSrcIn0nO6VwU();
        } else if (i2 == 9) {
            iM4118getSrcIn0nO6VwU = BlendMode.Companion.m4117getSrcAtop0nO6VwU();
        } else {
            switch (i2) {
                case 14:
                    iM4118getSrcIn0nO6VwU = BlendMode.Companion.m4109getModulate0nO6VwU();
                    break;
                case 15:
                    iM4118getSrcIn0nO6VwU = BlendMode.Companion.m4114getScreen0nO6VwU();
                    break;
                case 16:
                    iM4118getSrcIn0nO6VwU = BlendMode.Companion.m4112getPlus0nO6VwU();
                    break;
                default:
                    iM4118getSrcIn0nO6VwU = BlendMode.Companion.m4118getSrcIn0nO6VwU();
                    break;
            }
        }
        float fM6638constructorimpl = Dp.m6638constructorimpl(dimension / resources.getDisplayMetrics().density);
        float fM6638constructorimpl2 = Dp.m6638constructorimpl(dimension2 / resources.getDisplayMetrics().density);
        typedArrayObtainAttributes.recycle();
        return new ImageVector.Builder(null, fM6638constructorimpl, fM6638constructorimpl2, namedFloat, namedFloat2, jM4214getUnspecified0d7_KjU, iM4118getSrcIn0nO6VwU, namedBoolean, 1, null);
    }

    public static final void parsePath(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) throws IllegalArgumentException {
        ArrayList arrayListPathStringToNodes$default;
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH());
        if (!TypedArrayUtils.hasAttribute(androidVectorParser.getXmlParser(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String string = androidVectorParser.getString(typedArrayObtainAttributes, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME());
        if (string == null) {
            string = "";
        }
        String string2 = androidVectorParser.getString(typedArrayObtainAttributes, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA());
        if (string2 == null) {
            arrayListPathStringToNodes$default = VectorKt.getEmptyPath();
        } else {
            arrayListPathStringToNodes$default = PathParser.pathStringToNodes$default(androidVectorParser.pathParser, string2, null, 2, null);
        }
        ComplexColorCompat namedComplexColor = androidVectorParser.getNamedComplexColor(typedArrayObtainAttributes, theme, "fillColor", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR(), 0);
        float namedFloat = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "fillAlpha", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA(), 1.0f);
        int iM4902getStrokeLineCapCSYIeUk = m4902getStrokeLineCapCSYIeUk(androidVectorParser.getNamedInt(typedArrayObtainAttributes, "strokeLineCap", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP(), -1), StrokeCap.Companion.m4531getButtKaPHkGw());
        int iM4904getStrokeLineJoinkLtJ_vA = m4904getStrokeLineJoinkLtJ_vA(androidVectorParser.getNamedInt(typedArrayObtainAttributes, "strokeLineJoin", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN(), -1), StrokeJoin.Companion.m4541getBevelLxFBmk8());
        float namedFloat2 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeMiterLimit", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT(), 1.0f);
        ComplexColorCompat namedComplexColor2 = androidVectorParser.getNamedComplexColor(typedArrayObtainAttributes, theme, "strokeColor", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(), 0);
        float namedFloat3 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeAlpha", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "strokeWidth", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(), 1.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathEnd", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(), 1.0f);
        float namedFloat6 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathOffset", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(), 0.0f);
        float namedFloat7 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "trimPathStart", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(), 0.0f);
        int namedInt = androidVectorParser.getNamedInt(typedArrayObtainAttributes, "fillType", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(), FILL_TYPE_WINDING);
        typedArrayObtainAttributes.recycle();
        Brush brushObtainBrushFromComplexColor = obtainBrushFromComplexColor(namedComplexColor);
        Brush brushObtainBrushFromComplexColor2 = obtainBrushFromComplexColor(namedComplexColor2);
        PathFillType.Companion companion = PathFillType.Companion;
        builder.m4870addPathoIyEayM(arrayListPathStringToNodes$default, namedInt == 0 ? companion.m4461getNonZeroRgk1Os() : companion.m4460getEvenOddRgk1Os(), string, brushObtainBrushFromComplexColor, namedFloat, brushObtainBrushFromComplexColor2, namedFloat3, namedFloat4, iM4902getStrokeLineCapCSYIeUk, iM4904getStrokeLineJoinkLtJ_vA, namedFloat2, namedFloat7, namedFloat5, namedFloat6);
    }

    private static final Brush obtainBrushFromComplexColor(ComplexColorCompat complexColorCompat) {
        if (!complexColorCompat.willDraw()) {
            return null;
        }
        Shader shader = complexColorCompat.getShader();
        return shader != null ? BrushKt.ShaderBrush(shader) : new SolidColor(ColorKt.Color(complexColorCompat.getColor()), null);
    }

    public static final void parseClipPath(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH());
        String string = androidVectorParser.getString(typedArrayObtainAttributes, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME());
        if (string == null) {
            string = "";
        }
        String string2 = androidVectorParser.getString(typedArrayObtainAttributes, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA());
        ArrayList emptyPath = string2 == null ? VectorKt.getEmptyPath() : PathParser.pathStringToNodes$default(androidVectorParser.pathParser, string2, null, 2, null);
        typedArrayObtainAttributes.recycle();
        ImageVector.Builder.addGroup$default(builder, string, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, emptyPath, 254, null);
    }

    public static final void parseGroup(AndroidVectorParser androidVectorParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ImageVector.Builder builder) {
        TypedArray typedArrayObtainAttributes = androidVectorParser.obtainAttributes(resources, theme, attributeSet, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP());
        float namedFloat = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "rotation", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION(), 0.0f);
        float f2 = androidVectorParser.getFloat(typedArrayObtainAttributes, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X(), 0.0f);
        float f3 = androidVectorParser.getFloat(typedArrayObtainAttributes, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y(), 0.0f);
        float namedFloat2 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "scaleX", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X(), 1.0f);
        float namedFloat3 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, "scaleY", AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y(), 1.0f);
        float namedFloat4 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, ViewProps.TRANSLATE_X, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X(), 0.0f);
        float namedFloat5 = androidVectorParser.getNamedFloat(typedArrayObtainAttributes, ViewProps.TRANSLATE_Y, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y(), 0.0f);
        String string = androidVectorParser.getString(typedArrayObtainAttributes, AndroidVectorResources.INSTANCE.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME());
        if (string == null) {
            string = "";
        }
        typedArrayObtainAttributes.recycle();
        builder.addGroup(string, namedFloat, f2, f3, namedFloat2, namedFloat3, namedFloat4, namedFloat5, VectorKt.getEmptyPath());
    }
}
