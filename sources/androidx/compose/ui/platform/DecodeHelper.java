package androidx.compose.ui.platform;

import android.os.Parcel;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.CollectionsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.Wg;
import yg.ZN;

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
/* JADX INFO: compiled from: AndroidClipboardManager.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я~\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\"B\u0012\u007fјnjG6L͜P.hS2\u000fq|<$i'yّCU0}*\tUOog|ObŏK\u000f\u001c\u0016\u0001j2J]xs\u0012\u00172HoG3coE9ft>\u000562*\u0600\u0002\u0005\u0017\u001a2H\u0016v\u0003Ca\f\u001aؓHpPR\u0015˟\r\u001a(\u0006F \u0007\u001edgd6Plc:5݊\u0019݃rNU^p\b]\u0011TT?\r%bӿ/@E7]+a\b\u001fR\nEI?:P\u0013o?'YQ:WΥWÜѥ\u0014*̠\u0011_x/j\u000f\u001af\u001a2CO\u0012W\u0017\u000ep\t\t\t%<2\u001cϳ&Ξό,\u0019Ǵ\f\u00109\u0004\u0001c\tV\u0010oZ\u007f)s|\u0017m\u0011A>Q\u001b\u0015eƞ:ϊل6z˿\u0011 )\u0016|7$e\u001cw-\u001b\u0003\u0010ϼ0҅ή<Gݳ\u000e[C\u0007\u0012\u0007+\u00068\u001eHG.JD\u0017<3=7\n?i!4\bVa\u007fv3~/S2VV_:nDWr\u0011\u001a{\\f\u001bj~U\u001f,YS*v\u001f}66f\\@B/I(N}\u000e0j\u0016n\u0018KGfe\u0001̝jލŜ8]ۋ9Si8ob?'Mez\u0005\u0007\u0011\tS݇Y٢Ξ!1ʮn\u0012}'R^\\\u001f@B\n\u001cb0\bǌ^ČL\u0003&Փˉ|\u0012gZn/\u0007W9ʖ\u001f\u0018#ڸ\r-"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0014Y{*6mx.TN;x\n", "", "Asa6a.", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", ">`a0X3", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007}", "2`c.4=:W zwe,", "", "2dR<W,\u001bO'~\u0002b5|v2i\u00017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#Z\u001cEm\u001d2VC)n8\u001f$>", "2dR<W,\u001bO'~\u0002b5|v2i\u00017CTT\u0017\u00013d\u001c", "u(5", "2dR<W,\u001bg(~", "", "2dR<W,\u001c] \t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "2dR<W,\u001c] \t\b&v{Z)K\u0005\u0018", "u(9", "2dR<W,\u001fZ#z\n", "", "2dR<W,\u001f]\"\u000ehm@\u0004\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "2dR<W,\u001f]\"\u000ehm@\u0004\tv_G\u000fY?\u0013r", "u(8", "2dR<W,\u001f]\"\u000ehr5\f\f/s\u00046", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[*7\\F;y8,j", "2dR<W,\u001f]\"\u000ehr5\f\f/s\u00046C\"q\br\u0014O}", "2dR<W,\u001f]\"\u000el^0~\f>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "2dR<W,\"\\(", "2dR<W,,V\u0015}\u0005p", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001fA\u007fk", "2dR<W,,^\u0015\bhm@\u0004\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9{Gr.#h\u0012'7C", "2dR<W,,b&\u0003\u0004`", "2dR<W,-S,\u000eY^*\u0007\u0016+t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t.KMHgC\"\u001fq7", "2dR<W,-S,\u000e\\^6\u0005\t>r\u0004&jM| %Hy\u001bD", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|w.WK;zA\"\u0013Wn5\u0010q-X\u0004/\u001d", "2dR<W,-S,\u000ejg0\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "2dR<W,-S,\u000ejg0\fP\"S[\f_5`", "2dR<W,.:#\b|", "\u001aj^A_0G\u001d\te\u0005g.R", "2dR<W,.:#\b|&:Dy\u0015Ne\u0018", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DecodeHelper {
    public static final int $stable = 8;
    private final Parcel parcel;

    public DecodeHelper(String str) throws Throwable {
        Parcel parcelObtain = Parcel.obtain();
        this.parcel = parcelObtain;
        Object[] objArr = {str, 0};
        Method declaredMethod = Class.forName(C1561oA.Kd("Q_Vec^Z%mmcg*?_re76", (short) (ZN.Xd() ^ 3686))).getDeclaredMethod(C1561oA.Xd(" \"!.$&", (short) (C1633zX.Xd() ^ (-3928))), Class.forName(Wg.Zd("f\t'\u001dr\\^vxj\u0019EPr\u0001\u0005", (short) (C1499aX.Xd() ^ (-23583)), (short) (C1499aX.Xd() ^ (-1856)))), Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final SpanStyle decodeSpanStyle() {
        MutableSpanStyle mutableSpanStyle = new MutableSpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte bDecodeByte = decodeByte();
            if (bDecodeByte != 1) {
                if (bDecodeByte != 2) {
                    if (bDecodeByte != 3) {
                        if (bDecodeByte != 4) {
                            if (bDecodeByte != 5) {
                                if (bDecodeByte != 6) {
                                    if (bDecodeByte != 7) {
                                        if (bDecodeByte != 8) {
                                            if (bDecodeByte != 9) {
                                                if (bDecodeByte != 10) {
                                                    if (bDecodeByte != 11) {
                                                        if (bDecodeByte == 12) {
                                                            if (dataAvailable() < 20) {
                                                                break;
                                                            }
                                                            mutableSpanStyle.setShadow(decodeShadow());
                                                        } else {
                                                            continue;
                                                        }
                                                    } else {
                                                        if (dataAvailable() < 4) {
                                                            break;
                                                        }
                                                        mutableSpanStyle.setTextDecoration(decodeTextDecoration());
                                                    }
                                                } else {
                                                    if (dataAvailable() < 8) {
                                                        break;
                                                    }
                                                    mutableSpanStyle.m5890setBackground8_81llA(m5860decodeColor0d7_KjU());
                                                }
                                            } else {
                                                if (dataAvailable() < 8) {
                                                    break;
                                                }
                                                mutableSpanStyle.setTextGeometricTransform(decodeTextGeometricTransform());
                                            }
                                        } else {
                                            if (dataAvailable() < 4) {
                                                break;
                                            }
                                            mutableSpanStyle.m5891setBaselineShift_isdbwI(BaselineShift.m6411boximpl(m5858decodeBaselineShifty9eOQZs()));
                                        }
                                    } else {
                                        if (dataAvailable() < 5) {
                                            break;
                                        }
                                        mutableSpanStyle.m5896setLetterSpacingR2X_6o(m5863decodeTextUnitXSAIIZE());
                                    }
                                } else {
                                    mutableSpanStyle.setFontFeatureSettings(decodeString());
                                }
                            } else {
                                if (dataAvailable() < 1) {
                                    break;
                                }
                                mutableSpanStyle.m5895setFontSynthesistDdu0R4(FontSynthesis.m6241boximpl(m5862decodeFontSynthesisGVVA2EU()));
                            }
                        } else {
                            if (dataAvailable() < 1) {
                                break;
                            }
                            mutableSpanStyle.m5894setFontStylemLjRB2g(FontStyle.m6230boximpl(m5861decodeFontStyle_LCdwA()));
                        }
                    } else {
                        if (dataAvailable() < 4) {
                            break;
                        }
                        mutableSpanStyle.setFontWeight(decodeFontWeight());
                    }
                } else {
                    if (dataAvailable() < 5) {
                        break;
                    }
                    mutableSpanStyle.m5893setFontSizeR2X_6o(m5863decodeTextUnitXSAIIZE());
                }
            } else {
                if (dataAvailable() < 8) {
                    break;
                }
                mutableSpanStyle.m5892setColor8_81llA(m5860decodeColor0d7_KjU());
            }
        }
        return mutableSpanStyle.toSpanStyle();
    }

    /* JADX INFO: renamed from: decodeColor-0d7_KjU, reason: not valid java name */
    public final long m5860decodeColor0d7_KjU() {
        return Color.m4174constructorimpl(m5859decodeULongsVKNKU());
    }

    /* JADX INFO: renamed from: decodeTextUnit-XSAIIZE, reason: not valid java name */
    public final long m5863decodeTextUnitXSAIIZE() {
        long jM6865getUnspecifiedUIouoOA;
        byte bDecodeByte = decodeByte();
        if (bDecodeByte == 1) {
            jM6865getUnspecifiedUIouoOA = TextUnitType.Companion.m6864getSpUIouoOA();
        } else if (bDecodeByte == 2) {
            jM6865getUnspecifiedUIouoOA = TextUnitType.Companion.m6863getEmUIouoOA();
        } else {
            jM6865getUnspecifiedUIouoOA = TextUnitType.Companion.m6865getUnspecifiedUIouoOA();
        }
        if (TextUnitType.m6859equalsimpl0(jM6865getUnspecifiedUIouoOA, TextUnitType.Companion.m6865getUnspecifiedUIouoOA())) {
            return TextUnit.Companion.m6842getUnspecifiedXSAIIZE();
        }
        return TextUnitKt.m6843TextUnitanM5pPY(decodeFloat(), jM6865getUnspecifiedUIouoOA);
    }

    public final FontWeight decodeFontWeight() {
        return new FontWeight(decodeInt());
    }

    /* JADX INFO: renamed from: decodeFontStyle-_-LCdwA, reason: not valid java name */
    public final int m5861decodeFontStyle_LCdwA() {
        byte bDecodeByte = decodeByte();
        if (bDecodeByte == 0) {
            return FontStyle.Companion.m6240getNormal_LCdwA();
        }
        if (bDecodeByte == 1) {
            return FontStyle.Companion.m6239getItalic_LCdwA();
        }
        return FontStyle.Companion.m6240getNormal_LCdwA();
    }

    /* JADX INFO: renamed from: decodeFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m5862decodeFontSynthesisGVVA2EU() {
        byte bDecodeByte = decodeByte();
        if (bDecodeByte == 0) {
            return FontSynthesis.Companion.m6251getNoneGVVA2EU();
        }
        if (bDecodeByte == 1) {
            return FontSynthesis.Companion.m6250getAllGVVA2EU();
        }
        if (bDecodeByte == 3) {
            return FontSynthesis.Companion.m6252getStyleGVVA2EU();
        }
        if (bDecodeByte == 2) {
            return FontSynthesis.Companion.m6253getWeightGVVA2EU();
        }
        return FontSynthesis.Companion.m6251getNoneGVVA2EU();
    }

    /* JADX INFO: renamed from: decodeBaselineShift-y9eOQZs, reason: not valid java name */
    private final float m5858decodeBaselineShifty9eOQZs() {
        return BaselineShift.m6412constructorimpl(decodeFloat());
    }

    private final TextGeometricTransform decodeTextGeometricTransform() {
        return new TextGeometricTransform(decodeFloat(), decodeFloat());
    }

    private final TextDecoration decodeTextDecoration() {
        int iDecodeInt = decodeInt();
        boolean z2 = (TextDecoration.Companion.getLineThrough().getMask() & iDecodeInt) != 0;
        boolean z3 = (-1) - (((-1) - iDecodeInt) | ((-1) - TextDecoration.Companion.getUnderline().getMask())) != 0;
        if (z2 && z3) {
            return TextDecoration.Companion.combine(CollectionsKt.listOf((Object[]) new TextDecoration[]{TextDecoration.Companion.getLineThrough(), TextDecoration.Companion.getUnderline()}));
        }
        if (z2) {
            return TextDecoration.Companion.getLineThrough();
        }
        if (z3) {
            return TextDecoration.Companion.getUnderline();
        }
        return TextDecoration.Companion.getNone();
    }

    private final Shadow decodeShadow() {
        return new Shadow(m5860decodeColor0d7_KjU(), OffsetKt.Offset(decodeFloat(), decodeFloat()), decodeFloat(), null);
    }

    private final byte decodeByte() {
        return this.parcel.readByte();
    }

    private final int decodeInt() {
        return this.parcel.readInt();
    }

    /* JADX INFO: renamed from: decodeULong-s-VKNKU, reason: not valid java name */
    private final long m5859decodeULongsVKNKU() {
        return ULong.m9154constructorimpl(this.parcel.readLong());
    }

    private final float decodeFloat() {
        return this.parcel.readFloat();
    }

    private final String decodeString() {
        return this.parcel.readString();
    }

    private final int dataAvailable() {
        return this.parcel.dataAvail();
    }
}
