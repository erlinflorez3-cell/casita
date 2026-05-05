package androidx.compose.ui.platform;

import android.os.Parcel;
import androidx.compose.ui.geometry.Offset;
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
import androidx.compose.ui.unit.TextUnitType;
import com.google.common.base.Ascii;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import yg.C1580rY;
import yg.InterfaceC1492Gx;
import yg.Qg;
import yg.Wg;

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
@Metadata(bv = {}, d1 = {"Я\u0001\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0012\u007fјnjO0LeN/ZS@\u000fsڔ<$q$yّCU0}*\tUOog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4կ]xs\u0012\u00172HpG3coEʠhtL\u0005(݅*8\u0010\u0005\t\u001a0H\u0018v\tFSÈ\u001a0NuBĥ\u0015M\u0013 \u001aßF \u000f*dɡV6^le:5%\t݃X÷W_^{\u000e\u0010ТX'\u001bv*49CO5C)\u0004\u0007\u0015Ws?1Eҵ<ݛص+)1P\u0002_~d\u000e\u0017-+}\u0011\u000ev4e\u001dQ\u000f\u0016o7]fcP<,(~\n\u0018T\u0004<\u0012o^<02f6\u0012cx\u0001`XP0l݆~Эˋ:\u0019+\u000fA;\u00021tTy;GRg\u007f\u0013\u001e6#/\u0001ƈZ٪\u05f8d\u0017!g\u0006ay]N@`N8]mq\u0012\u0005z\u0002X\u0019x]\u000e2\u0014\u0011\\\u001bU;iO;!\u001a\u0019ӿCϙЛ\tbnkwk\u0011L0q.7X\r<^R~\u001dk~o!8\u001fP4T5\u00028\u0017.x\u0010<OBXd]k\u0002j{a:)=\u0005OY\u001d\u000b\u0085Vުӷ77W\u0004\u001ei\u001b\u0003\"BTb3\\\u0017Fa-r\\VDzTx\u0013\u0010{rR<\u0017@b\n\u001cbPy%j\u0018`\u0003LFq\u0001\u0017\u0005rh>%\u001d?2\u0006\u0002$#\r1Tj\u0018\bg'qt\u0013n%EA\u007f9I*cK\u00014+Mʍ}͞õKiRrZt^yc(8\u0016Ha\u001a3K@'~W6R9SM\u000be\u007fOh\u0600\u0007܃}\u000fCÜ֮g\rrs2߮\u0007xNݠ\u001bP"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0015b{*6mx.TN;x\n", "", "u(E", ">`a0X3", "\u001a`]1e6BRb\t\t(\u0017x\u0016-e\u0007}", "3mR<W,", "", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "3mR<W,\u0006&\u0013QFe3X", "uI\u0018#", "AgP1b>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001fA\u007fk", "AoP;F;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9{Gr.#h\u0012'7C", "4n]AF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[%BTC\u0011", "3mR<W,\u0006\\.{b:\t\u000b", "uH\u0018#", "4n]AF@Gb\u001c~\tb:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F[*7\\F;y8,j", "3mR<W,\u0006$$L\fC\u0013p", "4n]AJ,BU\u001c\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F_\u00162OFJA", "0`b2_0GS\u0007\u0002~_;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#Z\u001cEm\u001d2VC)n8\u001f$>", "3mR<W,\u0006\"w\u0006t;*\u0003", "uE\u0018#", "BdgA7,<]&z\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|t.KMHgC\"\u001fq7", "BdgA:,H[\u0019\u000e\bb*k\u0016+n\u000e)\u0006M\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#l J|w.WK;zA\"\u0013Wn5\u0010q-X\u0004/\u001d", "BdgAH5Bb", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "3mR<W,\u0006\u001b\u0006KmX|\u0007", "0xc2", "", "4k^.g", "", "7mc", "", "Asa6a.", "", "CK^;Z", "\u001aj^A_0G\u001d\te\u0005g.R", "3mR<W,\u0006D~sln\u0013h", "3mR<W,=A(\f~g.", "@db2g", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class EncodeHelper {
    public static final int $stable = 8;
    private Parcel parcel = Parcel.obtain();

    public final void reset() {
        this.parcel.recycle();
        this.parcel = Parcel.obtain();
    }

    public final String encodedString() throws Throwable {
        Object[] objArr = {this.parcel.marshall(), 0};
        Method declaredMethod = Class.forName(Wg.vd("dpervoi2pnbd-@^oX(%", (short) (C1580rY.Xd() ^ (-10267)))).getDeclaredMethod(Qg.kd("U]Q\\PP>X;[XNRJ", (short) (C1580rY.Xd() ^ (-1692)), (short) (C1580rY.Xd() ^ (-755))), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void encode(SpanStyle spanStyle) {
        if (!Color.m4179equalsimpl0(spanStyle.m6073getColor0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m5874encode8_81llA(spanStyle.m6073getColor0d7_KjU());
        }
        if (!TextUnit.m6828equalsimpl0(spanStyle.m6074getFontSizeXSAIIZE(), TextUnit.Companion.m6842getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m5871encodeR2X_6o(spanStyle.m6074getFontSizeXSAIIZE());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle fontStyleM6075getFontStyle4Lr2A7w = spanStyle.m6075getFontStyle4Lr2A7w();
        if (fontStyleM6075getFontStyle4Lr2A7w != null) {
            int iM6236unboximpl = fontStyleM6075getFontStyle4Lr2A7w.m6236unboximpl();
            encode((byte) 4);
            m5876encodenzbMABs(iM6236unboximpl);
        }
        FontSynthesis fontSynthesisM6076getFontSynthesisZQGJjVo = spanStyle.m6076getFontSynthesisZQGJjVo();
        if (fontSynthesisM6076getFontSynthesisZQGJjVo != null) {
            int iM6249unboximpl = fontSynthesisM6076getFontSynthesisZQGJjVo.m6249unboximpl();
            encode((byte) 5);
            m5873encode6p3vJLY(iM6249unboximpl);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m6828equalsimpl0(spanStyle.m6077getLetterSpacingXSAIIZE(), TextUnit.Companion.m6842getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m5871encodeR2X_6o(spanStyle.m6077getLetterSpacingXSAIIZE());
        }
        BaselineShift baselineShiftM6072getBaselineShift5SSeXJ0 = spanStyle.m6072getBaselineShift5SSeXJ0();
        if (baselineShiftM6072getBaselineShift5SSeXJ0 != null) {
            float fM6417unboximpl = baselineShiftM6072getBaselineShift5SSeXJ0.m6417unboximpl();
            encode((byte) 8);
            m5872encode4Dl_Bck(fM6417unboximpl);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m4179equalsimpl0(spanStyle.m6071getBackground0d7_KjU(), Color.Companion.m4214getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m5874encode8_81llA(spanStyle.m6071getBackground0d7_KjU());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode(Ascii.VT);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode(Ascii.FF);
            encode(shadow);
        }
    }

    /* JADX INFO: renamed from: encode-8_81llA, reason: not valid java name */
    public final void m5874encode8_81llA(long j2) {
        m5875encodeVKZWuLQ(j2);
    }

    /* JADX INFO: renamed from: encode--R2X_6o, reason: not valid java name */
    public final void m5871encodeR2X_6o(long j2) {
        long jM6830getTypeUIouoOA = TextUnit.m6830getTypeUIouoOA(j2);
        byte b2 = 0;
        if (!TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA, TextUnitType.Companion.m6865getUnspecifiedUIouoOA())) {
            if (TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA, TextUnitType.Companion.m6864getSpUIouoOA())) {
                b2 = 1;
            } else if (TextUnitType.m6859equalsimpl0(jM6830getTypeUIouoOA, TextUnitType.Companion.m6863getEmUIouoOA())) {
                b2 = 2;
            }
        }
        encode(b2);
        if (TextUnitType.m6859equalsimpl0(TextUnit.m6830getTypeUIouoOA(j2), TextUnitType.Companion.m6865getUnspecifiedUIouoOA())) {
            return;
        }
        encode(TextUnit.m6831getValueimpl(j2));
    }

    public final void encode(FontWeight fontWeight) {
        encode(fontWeight.getWeight());
    }

    /* JADX INFO: renamed from: encode-nzbMABs, reason: not valid java name */
    public final void m5876encodenzbMABs(int i2) {
        byte b2 = 0;
        if (!FontStyle.m6233equalsimpl0(i2, FontStyle.Companion.m6240getNormal_LCdwA()) && FontStyle.m6233equalsimpl0(i2, FontStyle.Companion.m6239getItalic_LCdwA())) {
            b2 = 1;
        }
        encode(b2);
    }

    /* JADX INFO: renamed from: encode-6p3vJLY, reason: not valid java name */
    public final void m5873encode6p3vJLY(int i2) {
        byte b2 = 0;
        if (!FontSynthesis.m6244equalsimpl0(i2, FontSynthesis.Companion.m6251getNoneGVVA2EU())) {
            if (FontSynthesis.m6244equalsimpl0(i2, FontSynthesis.Companion.m6250getAllGVVA2EU())) {
                b2 = 1;
            } else if (FontSynthesis.m6244equalsimpl0(i2, FontSynthesis.Companion.m6253getWeightGVVA2EU())) {
                b2 = 2;
            } else if (FontSynthesis.m6244equalsimpl0(i2, FontSynthesis.Companion.m6252getStyleGVVA2EU())) {
                b2 = 3;
            }
        }
        encode(b2);
    }

    /* JADX INFO: renamed from: encode-4Dl_Bck, reason: not valid java name */
    public final void m5872encode4Dl_Bck(float f2) {
        encode(f2);
    }

    public final void encode(TextGeometricTransform textGeometricTransform) {
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(TextDecoration textDecoration) {
        encode(textDecoration.getMask());
    }

    public final void encode(Shadow shadow) {
        m5874encode8_81llA(shadow.m4503getColor0d7_KjU());
        encode(Offset.m3937getXimpl(shadow.m4504getOffsetF1C5BW0()));
        encode(Offset.m3938getYimpl(shadow.m4504getOffsetF1C5BW0()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte b2) {
        this.parcel.writeByte(b2);
    }

    public final void encode(int i2) {
        this.parcel.writeInt(i2);
    }

    public final void encode(float f2) {
        this.parcel.writeFloat(f2);
    }

    /* JADX INFO: renamed from: encode-VKZWuLQ, reason: not valid java name */
    public final void m5875encodeVKZWuLQ(long j2) {
        this.parcel.writeLong(j2);
    }

    public final void encode(String str) {
        this.parcel.writeString(str);
    }
}
