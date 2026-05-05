package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: ContentDrawScope.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0012\u001d<K!&i\u0016DLш|\u0004O\u00068é4'\u0015Ӭ\\\u0012&\u0006/pG0\\ev/\u0019w\u05ec\u000eӆڗ4(c&wbiTۥ\u0002$ߜSO"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "2qPD66Gb\u0019\b\n", "", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface ContentDrawScope extends DrawScope {
    void drawContent();

    /* JADX INFO: compiled from: ContentDrawScope.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: drawImage-AZ2fEMs */
        public static void m4680drawImageAZ2fEMs(ContentDrawScope contentDrawScope, ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3) {
            ContentDrawScope.super.mo4636drawImageAZ2fEMs(imageBitmap, j2, j3, j4, j5, f2, drawStyle, colorFilter, i2, i3);
        }

        @Deprecated
        /* JADX INFO: renamed from: getCenter-F1C5BW0 */
        public static long m4681getCenterF1C5BW0(ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo4733getCenterF1C5BW0();
        }

        @Deprecated
        /* JADX INFO: renamed from: getSize-NH-jbRc */
        public static long m4682getSizeNHjbRc(ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo4734getSizeNHjbRc();
        }

        @Deprecated
        /* JADX INFO: renamed from: record-JVtK1S4 */
        public static void m4683recordJVtK1S4(ContentDrawScope contentDrawScope, GraphicsLayer graphicsLayer, long j2, Function1<? super DrawScope, Unit> function1) {
            ContentDrawScope.super.mo4735recordJVtK1S4(graphicsLayer, j2, function1);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public static int m4684roundToPxR2X_6o(ContentDrawScope contentDrawScope, long j2) {
            return ContentDrawScope.super.mo703roundToPxR2X_6o(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public static int m4685roundToPx0680j_4(ContentDrawScope contentDrawScope, float f2) {
            return ContentDrawScope.super.mo704roundToPx0680j_4(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public static float m4686toDpGaN1DYA(ContentDrawScope contentDrawScope, long j2) {
            return ContentDrawScope.super.mo705toDpGaN1DYA(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public static float m4687toDpu2uoSUM(ContentDrawScope contentDrawScope, float f2) {
            return ContentDrawScope.super.mo706toDpu2uoSUM(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public static float m4688toDpu2uoSUM(ContentDrawScope contentDrawScope, int i2) {
            return ContentDrawScope.super.mo707toDpu2uoSUM(i2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public static long m4689toDpSizekrfVVM(ContentDrawScope contentDrawScope, long j2) {
            return ContentDrawScope.super.mo708toDpSizekrfVVM(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public static float m4690toPxR2X_6o(ContentDrawScope contentDrawScope, long j2) {
            return ContentDrawScope.super.mo709toPxR2X_6o(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public static float m4691toPx0680j_4(ContentDrawScope contentDrawScope, float f2) {
            return ContentDrawScope.super.mo710toPx0680j_4(f2);
        }

        @Deprecated
        public static Rect toRect(ContentDrawScope contentDrawScope, DpRect dpRect) {
            return ContentDrawScope.super.toRect(dpRect);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public static long m4692toSizeXkaWNTQ(ContentDrawScope contentDrawScope, long j2) {
            return ContentDrawScope.super.mo711toSizeXkaWNTQ(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public static long m4693toSp0xMU5do(ContentDrawScope contentDrawScope, float f2) {
            return ContentDrawScope.super.mo712toSp0xMU5do(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public static long m4694toSpkPz2Gy4(ContentDrawScope contentDrawScope, float f2) {
            return ContentDrawScope.super.mo713toSpkPz2Gy4(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public static long m4695toSpkPz2Gy4(ContentDrawScope contentDrawScope, int i2) {
            return ContentDrawScope.super.mo714toSpkPz2Gy4(i2);
        }
    }
}
