package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: Xyz.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r(4\u0012}\u0007njG9LeN.ZS8\u0014s{:$c$\u007fUCU \u0001*\t]UogtPb\u000bY\u000f\u000e\u0016~o2կkތ\u000e\u0012=1\u0003\u0003O7[oU9\u000fuF\t.4:8(\bв\u001e*V\u0014?\nQS$\u0012^I!>`\u0017e\u0005H\u001bL̇&I,jrf6vx\u000e>=0\u001bipZmsx\u000b[\u001b^TU\u0016'e,:X7c\u0018kgK\u0015`kW\u0003mzm\tv6?+wv\u001eJ!#\"&CO;o#*j\u0018i`:0[Sq_h\u000eV\u0001+\u007f\u001bQ\u001c\u000e40\u000f<ǉ\u001ef\u000e${\u0003\u0001jXP0jr\u0004\tnN\u0017S\fy?\u0002>tiy;GWg\u007f\u0013 6#/wQ_b\"x\u0015I](U?fX=vWPgǀq\u0004v{Je\u0012J_\u007f]\u0017A2%/O[g,Qo\u0010d\\g%\u000e\u0011la\u0007jHn+\u001f\u001aEH!\f\tM\u0015\tyolXZ\u0010\u0014*Ϻ\u0006âު\u0012\u001fϢ{>'E\u001eo zwoe]8+e;\u000eցp«\u0012[Q`9:_j߇a[~\u0014E[j\b^ڊ^\u0002\u000bɀ`J"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005^H3j", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuOD\u0003a,$", "<`\\2", "", "7c", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "7rF6W, O!\u000f\n", "", "u(I", "1kP:c", "", "F", "4q^:K@S", "", "D", "5dc\u001aT?/O \u000fz", "1n\\=b5>\\(", "5dc\u001a\\5/O \u000fz", "BnGF", "", "D/", "D0", "D1", "BnGF\u0017<BM\u001b\fvi/\u0001\u0007=_\r(\u0003@|%\u0017", "BnGFm", "BnI", "BnIph08U&z\u0006a0z\u0017)r\u007f/{<\u000f\u0017", "Fxi.G6\u001c] \t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "G", "H", RemoteSettings.FORWARD_SLASH_STRING, "1n[<e\u001aIO\u0017~", "Fxi.G6\u001c] \t\b&\u0011\u0004q3L\u000e*:P\u0005\u0011\u0019Tk\u0019?z#CS\u000b >m\u0012<M", "uE5\u00139\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001k 5WPIv0\u001c\u00152?C\u000em9<\u0002#EL$oA", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Xyz extends ColorSpace {
    private final float clamp(float f2) {
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            return 2.0f;
        }
        return f2;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i2) {
        return 2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i2) {
        return -2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f2, float f3, float f4) {
        if (f4 < -2.0f) {
            f4 = -2.0f;
        }
        if (f4 > 2.0f) {
            return 2.0f;
        }
        return f4;
    }

    public Xyz(String str, int i2) {
        super(str, ColorModel.Companion.m4593getXyzxdoWZVw(), i2, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        float f2 = fArr[0];
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        fArr[0] = f2;
        float f3 = fArr[1];
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        if (f3 > 2.0f) {
            f3 = 2.0f;
        }
        fArr[1] = f3;
        float f4 = fArr[2];
        float f5 = f4 >= -2.0f ? f4 : -2.0f;
        fArr[2] = f5 <= 2.0f ? f5 : 2.0f;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo4595xyzaToColorJlNiLsg$ui_graphics_release(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        if (f3 > 2.0f) {
            f3 = 2.0f;
        }
        if (f4 < -2.0f) {
            f4 = -2.0f;
        }
        return ColorKt.Color(f2, f3, f4 <= 2.0f ? f4 : 2.0f, f5, colorSpace);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        float f2 = fArr[0];
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        fArr[0] = f2;
        float f3 = fArr[1];
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        if (f3 > 2.0f) {
            f3 = 2.0f;
        }
        fArr[1] = f3;
        float f4 = fArr[2];
        float f5 = f4 >= -2.0f ? f4 : -2.0f;
        fArr[2] = f5 <= 2.0f ? f5 : 2.0f;
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f2, float f3, float f4) {
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        if (f3 < -2.0f) {
            f3 = -2.0f;
        }
        float f5 = f3 <= 2.0f ? f3 : 2.0f;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f2)) << 32;
        long jFloatToRawIntBits2 = (-1) - (((-1) - ((long) Float.floatToRawIntBits(f5))) | ((-1) - 4294967295L));
        return (jFloatToRawIntBits + jFloatToRawIntBits2) - (jFloatToRawIntBits & jFloatToRawIntBits2);
    }
}
