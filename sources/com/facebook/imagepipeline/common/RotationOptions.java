package com.facebook.imagepipeline.common;

import com.facebook.common.util.HashCodeUtil;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r+4\u0012}\u000fnjG<LeN1hݷH\u001f\u001c{b#\u0014%\u0002TM\u0016/\u0004\"\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019/֒Yxk\u0016W6PwW3{r\u0006Jn}N\u0005N5R>\b\u000f\u0019\u001c@G>uAŦKT\u0018>K\t:\u0001\u000e\u0014\u0019b\u0016\u0014J8\u0001L_0TDU\u0005]h=i\u00172F\\6w0+P]Rb)%v\u0010!\u0002«9߱\u0019%[ΈWaiD\u001b? >;-Ҋ+/au]<f\u0007d!9O%]!'3ӧSԃ\u0010'3ՒӓOc"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z =IR?u=\b weC\u0010q\u0002", "", "@nc.g0H\\", "", "2dU2e\u001cGb\u001d\u0006g^5{\t<e~", "", "uHIuI", "4na0X+\u001a\\\u001b\u0006z", "5dc\u0013b9<S\u0018Z\u0004`3|", "u(8", "1`]\u0011X->`\t\b\nb3i\t8d\u007f5{?", "3pd._:", "=sW2e", "6`b566=S", "@nc.g0H\\x\bv[3|\b", "BnBAe0GU", "", "CrT\u0016`(@S\u0001~\nZ+x\u0018+", "\u0011n\\=T5B]\"", " nc.g0H\\", " nc.g0H\\t\b|e,", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class RotationOptions {
    private static final int DISABLE_ROTATION = -2;
    public static final int NO_ROTATION = 0;
    public static final int ROTATE_180 = 180;
    public static final int ROTATE_270 = 270;
    public static final int ROTATE_90 = 90;
    private static final int USE_EXIF_ROTATION_ANGLE = -1;
    private final boolean deferUntilRendered;
    private final int rotation;
    public static final Companion Companion = new Companion(null);
    private static final RotationOptions ROTATION_OPTIONS_AUTO_ROTATE = new RotationOptions(-1, false);
    private static final RotationOptions ROTATION_OPTIONS_DISABLE_ROTATION = new RotationOptions(-2, false);
    private static final RotationOptions ROTATION_OPTIONS_ROTATE_AT_RENDER_TIME = new RotationOptions(-1, true);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005%4\u0012\u000e\u0007nj?7JͣIDɟ\u0004*=j<9*[ҸuCIUb\u00040\u0015gN\u0016o5O#\u0011Q\u001c\u001e\u0016'rrN\u001e~k '2pw\u00068\u0016}KHxtd\rP60H\u0012\u0005/\u001cpM`\u0003\tDc\f@2\u0017\u0084\rň\u0011M\r܅b\u0012L#\u0019\u001e\u000bi%ȫ\u001bǰa:7݊SuPR?_^~$μ\u0019ù+\r~ѭn7N<M\u0015SUYޞ%ÜC\u0003Gм\u000e\u0011v-?+wu.̳+ÿ\u0018\u00153˽]i\u0001-t\u0005\u007fhbʯ-յgKXʫx\u0004\t\u0005%<2\u0016\\άJͶ1\u001anڜ^?\u0003|k@~\n5ې\u0002ѐe6\u001fӛP?9D3f\u007fc\u0012ύ!Ѽ\u007f\u0005\u0015̔ũ\u0005\u007f"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z =IR?u=\b weC\u0010qj,\u0001/RHW0f[H", "", "u(E", "\u0012HB\u000e5\u0013\u001eM\u0006hi:\u001b`r\u0018", "", "\u001cNN\u001fB\u001b\u001aB|hc", " NC\u000eG\f8\u001fkI", " NC\u000eG\f8 jI", " NC\u000eG\f8'c", " NC\u000eG\u0010(<\u0013heM\u0010fq\u001d_[\u0018j*z\u0004\u00016K|\u001c", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z =IR?u=\b weC\u0010q\u0002", " NC\u000eG\u0010(<\u0013heM\u0010fq\u001d_^\fi\u001c]}vA\\w+R\u0014\u0019Cf", " NC\u000eG\u0010(<\u0013heM\u0010fq\u001d_l\u0012j\u001cov\u0011#^\b)V\u000e\u00149j\u001a&Q}\u000e", "#R4,8\u001f\"4\u0013kdM\bkl\u0019Ny\u0004d\"gv", "/tc<E6MO(~", "/tc<E6MO(~Vm\u0019|\u0012.e\r\u0017\u007fH\u0001", "2hb.U3>@#\u000evm0\u0007\u0012", "4na0X\u0019Hb\u0015\u000e~h5", "/mV9X", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final RotationOptions autoRotate() {
            return RotationOptions.ROTATION_OPTIONS_AUTO_ROTATE;
        }

        @JvmStatic
        public final RotationOptions autoRotateAtRenderTime() {
            return RotationOptions.ROTATION_OPTIONS_ROTATE_AT_RENDER_TIME;
        }

        @JvmStatic
        public final RotationOptions disableRotation() {
            return RotationOptions.ROTATION_OPTIONS_DISABLE_ROTATION;
        }

        @JvmStatic
        public final RotationOptions forceRotation(int i2) {
            return new RotationOptions(i2, false, null);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĴA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z =IR?u=\b weC\u0010qj;\u00016C[R6e(", "", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    private @interface Rotation {
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d<K!&i\u000e]LшzĸA\u001cֶ;.p}bܥ\u0082{\u0007"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z =IR?u=\b weC\u0010qj;\u00016C[R6e.{?\u001b\u00120", "", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface RotationAngle {
    }

    private RotationOptions(int i2, boolean z2) {
        this.rotation = i2;
        this.deferUntilRendered = z2;
    }

    public /* synthetic */ RotationOptions(int i2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, z2);
    }

    @JvmStatic
    public static final RotationOptions autoRotate() {
        return Companion.autoRotate();
    }

    @JvmStatic
    public static final RotationOptions autoRotateAtRenderTime() {
        return Companion.autoRotateAtRenderTime();
    }

    @JvmStatic
    public static final RotationOptions disableRotation() {
        return Companion.disableRotation();
    }

    @JvmStatic
    public static final RotationOptions forceRotation(int i2) {
        return Companion.forceRotation(i2);
    }

    public final boolean canDeferUntilRendered() {
        return this.deferUntilRendered;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RotationOptions)) {
            return false;
        }
        RotationOptions rotationOptions = (RotationOptions) obj;
        return this.rotation == rotationOptions.rotation && this.deferUntilRendered == rotationOptions.deferUntilRendered;
    }

    public final int getForcedAngle() {
        if (useImageMetadata()) {
            throw new IllegalStateException("Rotation is set to use EXIF".toString());
        }
        return this.rotation;
    }

    public int hashCode() {
        return HashCodeUtil.hashCode(Integer.valueOf(this.rotation), Boolean.valueOf(this.deferUntilRendered));
    }

    public final boolean rotationEnabled() {
        return this.rotation != -2;
    }

    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.rotation), Boolean.valueOf(this.deferUntilRendered)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    public final boolean useImageMetadata() {
        return this.rotation == -1;
    }
}
