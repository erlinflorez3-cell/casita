package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: ImageBitmap.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4E\u0007\":\u001b\u007f\u0007lnA0RqP.XU0ŧ*\u0012éBlTqq:\u000e\u0019\u000fb\u0018UȞwk|Jr\u000bq\u0010و\u001azp.WXAu \u0015JB\u001eFcS}EQb\u000b53\u001fxƉ9ѩ\t\u0003 3V\u001a?\tQV$\u0012^A7ńQҫQ\u0007 \u001e\u0014Ah\u000e,i\u007fNdV3qƠ3%\txP^wn>|e\rtUܮ\u0011|iӜCB=9#*َ\u0002\u0007ҡ_Q"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FI>'\u0016lc\u000f", "", "D`[BX", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "5dc#T3NS", "u(8", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class ImageBitmapConfig {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Argb8888 = m4392constructorimpl(0);
    private static final int Alpha8 = m4392constructorimpl(1);
    private static final int Rgb565 = m4392constructorimpl(2);
    private static final int F16 = m4392constructorimpl(3);
    private static final int Gpu = m4392constructorimpl(4);

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImageBitmapConfig m4391boximpl(int i2) {
        return new ImageBitmapConfig(i2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m4392constructorimpl(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4393equalsimpl(int i2, Object obj) {
        return (obj instanceof ImageBitmapConfig) && i2 == ((ImageBitmapConfig) obj).m4397unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4394equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4395hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    public boolean equals(Object obj) {
        return m4393equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m4395hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4397unboximpl() {
        return this.value;
    }

    /* JADX INFO: compiled from: ImageBitmap.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005,2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0\u001al\u0007c*\u000f`DƜ>\u074c߲n<˃d|>\u0005.7::\u007f\f\u000f\u001ez_\u001e~\u0013Cy\u000eݮ/ϋú9QҫQ\r\"\u0012\u0014C8\u0003$euR\u0007_zgR/Q\u0005\u07bcA÷ф^/ƊQ\u0015NT5\u0012\u000fc$6N;\u0006,3_\u001b\u0007\u0001]У\u0002ӊҵ<\u0004ص+/3I\u0002\\NZ\u0006!#/̀\rfz)bԆm\u000f\u000b/+U\u0003\u05c8T\u001c"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FI>'\u0016lcwdm4Yr0KVW\u0002", "", "u(E", "\u000fk_5T~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FI>'\u0016lc\u000f", "5dc\u000e_7AOkFtl\u001d\u000b\u00171Q", "u(8", "\u0017", "\u000fqV/+~\u0011&", "5dc\u000ee.;&kQM&&\u000by=s\u0002\u0014", "\u00140%", "5dc\u0013$|\u0006M'o\tl.h", "\u0015od", "5dc\u0014c<\u0006M'o\tl.h", " fQ\u0002){", "5dc\u001fZ)\u000e$hFtl\u001d\u000b\u00171Q", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: getArgb8888-_sVssgQ, reason: not valid java name */
        public final int m4399getArgb8888_sVssgQ() {
            return ImageBitmapConfig.Argb8888;
        }

        /* JADX INFO: renamed from: getAlpha8-_sVssgQ, reason: not valid java name */
        public final int m4398getAlpha8_sVssgQ() {
            return ImageBitmapConfig.Alpha8;
        }

        /* JADX INFO: renamed from: getRgb565-_sVssgQ, reason: not valid java name */
        public final int m4402getRgb565_sVssgQ() {
            return ImageBitmapConfig.Rgb565;
        }

        /* JADX INFO: renamed from: getF16-_sVssgQ, reason: not valid java name */
        public final int m4400getF16_sVssgQ() {
            return ImageBitmapConfig.F16;
        }

        /* JADX INFO: renamed from: getGpu-_sVssgQ, reason: not valid java name */
        public final int m4401getGpu_sVssgQ() {
            return ImageBitmapConfig.Gpu;
        }
    }

    private /* synthetic */ ImageBitmapConfig(int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    public String toString() {
        return m4396toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4396toStringimpl(int i2) {
        return m4394equalsimpl0(i2, Argb8888) ? "Argb8888" : m4394equalsimpl0(i2, Alpha8) ? "Alpha8" : m4394equalsimpl0(i2, Rgb565) ? "Rgb565" : m4394equalsimpl0(i2, F16) ? "F16" : m4394equalsimpl0(i2, Gpu) ? "Gpu" : "Unknown";
    }
}
