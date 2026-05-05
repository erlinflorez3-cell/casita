package androidx.compose.ui.graphics.colorspace;

import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: TransferParameters.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\n8\u000b4X\u0007\":\u001b\u007f\u0007ljA0RkP\u008cZS8\u001bsڔ:Ša:ڎs;\u0004\u0019>a\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019-YY\u0007`*\u000f`C\u007fCAQ\b=ga\u0005:\u0013%J\"fz\u0015\u0007 *V\u0016\u000fzqL\u001c\u00186@~Aj\r{\u0006ܨ\u0016\u0006L(I%jxf6vm$Ǆ0k\nwTf'\u000e1Cָ\u000e\u000f[5 \u000faL,\u0007́6],a\u0017\u001fR\n@Iԑr\u0006\fv<?+wt\u001eͳYH\u001b#Ag\r\fslٟ\u0006\u001ag\u001a>CO\u0012L\u0017˲)@H\n%T\u0004<ͺWN4-(f \u000eau#YFP\u0010`Z\u007f)bf\u001d+\u007fA.Q\u001b\u0015R\u0012A\u001fNE\u007f\u001d\rL$1t'[b\u0013x\u0015IU(W7QNC`N8Zms\npp\tB\u0004^HFÂzY?%>O[g=Qq\u0010c\\i\r\u0004\u000fg\u001a\u05f6S\u0011G0\u000b.7X&R˅C-\fynlXZ0\u0014ʓSW\r\u0016\u00158\\&=Ƽ)\u0016Vи\u0001kpVk\u0014u>t:qn\u001a\u000fĆ=d;̐ie\u0016l`\u0001dNJf\u001dX\u0015Cΐ\u0010`d̥:4Nv\u001e\u0002LS\\\u0011+2mrʬ829ǉt\u0017N\u0010,L\u0012\f\u0017erh>\u007fՁ7*\u000bǭ<v\u000f\u000f^fA~u\u007fa,+aĘ1GYځ1([1v>M2\u0015~\f\u007fuh֙KRtֵ\u000eW\u00020$$\u0081UO"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005ZA\u001a\u001evb9\u0014N([r/G[N9j(", "", "5`\\:T", "", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "uC3\u00117\u000b\u001d2\\o", "5dc\u000e", "u(3", "5dc\u000f", "5dc\u0010", "5dc\u0011", "5dc\u0012", "5dc\u0013", "5dc\u0014T4FO", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n\\=b5>\\(O", "1n\\=b5>\\(P", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TransferParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f108f;
    private final double gamma;

    public static /* synthetic */ TransferParameters copy$default(TransferParameters transferParameters, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            d2 = transferParameters.gamma;
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            d3 = transferParameters.f103a;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            d4 = transferParameters.f104b;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            d5 = transferParameters.f105c;
        }
        if ((i2 & 16) != 0) {
            d6 = transferParameters.f106d;
        }
        if ((i2 + 32) - (i2 | 32) != 0) {
            d7 = transferParameters.f107e;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 64)) != 0) {
            d8 = transferParameters.f108f;
        }
        return transferParameters.copy(d2, d3, d4, d5, d6, d7, d8);
    }

    public final double component1() {
        return this.gamma;
    }

    public final double component2() {
        return this.f103a;
    }

    public final double component3() {
        return this.f104b;
    }

    public final double component4() {
        return this.f105c;
    }

    public final double component5() {
        return this.f106d;
    }

    public final double component6() {
        return this.f107e;
    }

    public final double component7() {
        return this.f108f;
    }

    public final TransferParameters copy(double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return new TransferParameters(d2, d3, d4, d5, d6, d7, d8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransferParameters)) {
            return false;
        }
        TransferParameters transferParameters = (TransferParameters) obj;
        return Double.compare(this.gamma, transferParameters.gamma) == 0 && Double.compare(this.f103a, transferParameters.f103a) == 0 && Double.compare(this.f104b, transferParameters.f104b) == 0 && Double.compare(this.f105c, transferParameters.f105c) == 0 && Double.compare(this.f106d, transferParameters.f106d) == 0 && Double.compare(this.f107e, transferParameters.f107e) == 0 && Double.compare(this.f108f, transferParameters.f108f) == 0;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.gamma) * 31) + Double.hashCode(this.f103a)) * 31) + Double.hashCode(this.f104b)) * 31) + Double.hashCode(this.f105c)) * 31) + Double.hashCode(this.f106d)) * 31) + Double.hashCode(this.f107e)) * 31) + Double.hashCode(this.f108f);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.gamma + ", a=" + this.f103a + ", b=" + this.f104b + ", c=" + this.f105c + ", d=" + this.f106d + ", e=" + this.f107e + ", f=" + this.f108f + ')';
    }

    public TransferParameters(double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        this.gamma = d2;
        this.f103a = d3;
        this.f104b = d4;
        this.f105c = d5;
        this.f106d = d6;
        this.f107e = d7;
        this.f108f = d8;
        if (Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d8) || Double.isNaN(d2)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d6 < 0.0d || d6 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d6);
        }
        if (d6 == 0.0d && (d3 == 0.0d || d2 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d6 >= 1.0d && d5 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d3 == 0.0d || d2 == 0.0d) && d5 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d5 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d3 < 0.0d || d2 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public /* synthetic */ TransferParameters(double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(d2, d3, d4, d5, d6, (i2 & 32) != 0 ? 0.0d : d7, (-1) - (((-1) - i2) | ((-1) - 64)) == 0 ? d8 : 0.0d);
    }

    public final double getGamma() {
        return this.gamma;
    }

    public final double getA() {
        return this.f103a;
    }

    public final double getB() {
        return this.f104b;
    }

    public final double getC() {
        return this.f105c;
    }

    public final double getD() {
        return this.f106d;
    }

    public final double getE() {
        return this.f107e;
    }

    public final double getF() {
        return this.f108f;
    }
}
