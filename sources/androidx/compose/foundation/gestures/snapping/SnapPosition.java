package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
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
/* JADX INFO: compiled from: SnapPosition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4J\u0005\bBߚ(\u0007\u0015iq1LnRv\ta*'k*5T_2s[;\u0004\u001b.&\u0017Rfg\u0016oz^\u0019G'\u0006Dy\u001b0WZ\u0011]@\u0010bF}EKM\u001e>id\u0003=\u001d `#~\u001e܇\u007fɝݕH\u0014~|Ij:\u0011ؼD{ĮV\f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+'\u0010_79\u00015K[R6e(", "", ">nb6g0H\\", "", ":`h<h;,W.~", "7sT:F0SS", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", "7sT:<5=S,", "7sT:66N\\(", "\u0011d]AX9", "\u0013mS", "!sP?g", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface SnapPosition {
    int position(int i2, int i3, int i4, int i5, int i6, int i7);

    /* JADX INFO: compiled from: SnapPosition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116B\u0005'4\u0012\u0006\u0013nʑ?ԌD{߉^R\u0002)Op\u00024ż_$\u007fC\u0004\f(~:\t}P\u0018k|Mr\u000bq\u00116\u001a\u0007nDI\u0004z\u000e\u0016\u001d7Zom5}sK?xtd\u0007P60?\u0012\u0005/\u001cZL\u001e~\u0013Cy\u000eXD\tvH[%M3$X\u001a̭$\f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+'\u0010_79\u00015K[R6e\u0011P=\u001d!Z\u001b$", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+'\u0010_79\u00015K[R6e(", "u(E", ">nb6g0H\\", "", ":`h<h;,W.~", "7sT:F0SS", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", "7sT:<5=S,", "7sT:66N\\(", "BnBAe0GU", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Center implements SnapPosition {
        public static final int $stable = 0;
        public static final Center INSTANCE = new Center();

        private Center() {
        }

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public int position(int i2, int i3, int i4, int i5, int i6, int i7) {
            return (((i2 - i4) - i5) / 2) - (i3 / 2);
        }

        public String toString() {
            return "Center";
        }
    }

    /* JADX INFO: compiled from: SnapPosition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116B\u0005'4\u0012\u0006\u0013nʑ?ԌD{߉^R\u0002)Op\u00024ż_$\u007fC\u0004\f(~:\t}P\u0018k|Mr\u000bq\u00116\u001a\u0007nDI\u0004z\u000e\u0016\u001d7Zom5}sK?xtd\u0007P60?\u0012\u0005/\u001cZL\u001e~\u0013Cy\u000eXD\tvH[%M3$X\u001a̭$\f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+'\u0010_79\u00015K[R6e\u0011`L\u0010\u001fic", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+'\u0010_79\u00015K[R6e(", "u(E", ">nb6g0H\\", "", ":`h<h;,W.~", "7sT:F0SS", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", "7sT:<5=S,", "7sT:66N\\(", "BnBAe0GU", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Start implements SnapPosition {
        public static final int $stable = 0;
        public static final Start INSTANCE = new Start();

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public int position(int i2, int i3, int i4, int i5, int i6, int i7) {
            return 0;
        }

        private Start() {
        }

        public String toString() {
            return "Start";
        }
    }

    /* JADX INFO: compiled from: SnapPosition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00116B\u0005'4\u0012\u0006\u0013nʑ?ԌD{߉^R\u0002)Op\u00024ż_$\u007fC\u0004\f(~:\t}P\u0018k|Mr\u000bq\u00116\u001a\u0007nDI\u0004z\u000e\u0016\u001d7Zom5}sK?xtd\u0007P60?\u0012\u0005/\u001cZL\u001e~\u0013Cy\u000eXD\tvH[%M3$X\u001a̭$\f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+'\u0010_79\u00015K[R6e\u0011RF\u0013g", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+'\u0010_79\u00015K[R6e(", "u(E", ">nb6g0H\\", "", ":`h<h;,W.~", "7sT:F0SS", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", "7sT:<5=S,", "7sT:66N\\(", "BnBAe0GU", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class End implements SnapPosition {
        public static final int $stable = 0;
        public static final End INSTANCE = new End();

        @Override // androidx.compose.foundation.gestures.snapping.SnapPosition
        public int position(int i2, int i3, int i4, int i5, int i6, int i7) {
            return ((i2 - i4) - i5) - i3;
        }

        private End() {
        }

        public String toString() {
            return "End";
        }
    }
}
