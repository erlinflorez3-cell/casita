package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.PlacementScopeMarker;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
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
/* JADX INFO: compiled from: GraphicsLayerScope.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4E\u0007\"B\u0012\u007f\u0007lpA0RnP.XX2\u000f\u0002{<$a'yCQU\"}(\u001fWN}gvJ`\u000eK\u000f\u001c\u0016\u0001j2L]xs\u0012\u00172HvE\u0019cڎm9\u000fs\u0007\u001b.2:8(\u0006Wʄ6Н\u0014\u0001\u0013EQ\u000e 3`r@V\u001bRUB \fV /%\rk\\<`l\fAewA>\u0019Ď3ܸ/ŧת\fEù+\u0017\u000fc$3N@U\u0017+]\u0011\u0012#qM\u000fWqk\u0006?Ҏ3ȅM}o8^\r\"\u0018KQ\u0013k\u0001+-#_o$'Y_\u001a0'˒4Þ~\f\u001d>\n\u001f\u00149`03-t\u001c.5z\baV!*lY\u0018z\u0010NG)\u000eJC9I~\b6ym%Ѱ\b͕\f̔ƹ\u007fmĲ_^&b\u001b4b\u0012q3W[Kd\u001f0g\\\u0006\u0006\u0007a0H46U\u001dG}'-ECm0wwwȔ\u000eҩHq\u000f\u0007f\ta\u000brJFD|9\b@\u00170rD\u0013\u0006BÓ`г0\u001be\u001eZ,\f\u000b3\"b\u001eJ&u&\\v\u0001i\u0019N4ܪ1çjAqpq6e<~5;zq\u00152h\u0005>W<\u0011\u0006/ڏNΐ\u0010dt*(]Vm0y\u0002p\\\u0011cHM\u001f44Z2oÉ!Ƞ\u0007(ZC\u00037m]\t\u0012\u0005\u0004A)S\u007f2%!\u0001~]G\u05f8s֑M6\u0015b(^OTU\u001b,\b0m\u0005\u00131:\u0017s.H>֝Sƥp \u000eW\u0002T$\u001dYS5r!\u0014O?@8EEz*<˟Yɟ+\u0005\u0015{\u0015svg\b\np+:\u001c;b]\u0011/\"%\u001c)w^܄\u0002ّ`¿ܢFbӝ\u000f_VKxAgE\u001f`\u000bD7\u001eS\b &\u000btECU$LLR\u0004kˬiˉnЃՙa\u000e֑xo\u001c.iV}kq_8|FT*\u001bLd<l1\u0006\u001fܚ\u0004\u06ddAކϢ\f2ȈEn\tX>\u0012\u00198\u001eh\rq\u001b{'qHY\b}b/6ͯ\u007fʸ\u0002\u001evE+X[V\bos\u0014j\u0010\u001b%\u0018T\u00141\u001d\u0013rݢ,ݫ[l!2\f>&9a=hPJ\u000eՐ3,ч\b\u001aKWoє,)~N_\u00156:DyZ\u0005\rֳ|)ǈL\u0006"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<4?OkA\f\u0013rl9\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "/k_5T", "", "5dc\u000e_7AO", "u(5", "Adc\u000e_7AO", "uE\u0018#", "/lQ6X5MA\u001czyh>Z\u00136o\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "5dc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006MHa\u0016\u0019isAf", "u(9", "Adc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006MHi\u0011\u001a;\u0015CR", "uI\u0018#", "1`\\2e(\u001dW'\u000evg*|", "5dc\u0010T4>`\u0015]~l;x\u0012-e", "Adc\u0010T4>`\u0015]~l;x\u0012-e", "1kX=", "", "5dc\u0010_0I\u0012\u0015\b\u0004h;x\u00183o\t6", "u(E", "5dc\u0010_0I", "u(I", "Adc\u0010_0I", "uY\u0018#", "1n\\=b:Bb\u001d\b|L;\n\u0005>e\u0002<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0006+A{\u001a=QL=YC+\u0011wa;\u001b9", "5dc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^^0|n,d\t", "u(8", "Adc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^\u0013&LwAT\u0005", "uH\u0018#", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzKo", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u0007\u001f7zu/NC9z\n", "@d]1X9\u001eT\u001a~xm", "5dc\u001fX5=S&^{_,z\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#j @l\u0016;-D<k2-j", "Adc\u001fX5=S&^{_,z\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~F})6m#\u000eND;iCsXY", "@nc.g0H\\\f", "5dc\u001fb;:b\u001d\t\u0004Q", "Adc\u001fb;:b\u001d\t\u0004Q", "@nc.g0H\\\r", "5dc\u001fb;:b\u001d\t\u0004R", "Adc\u001fb;:b\u001d\t\u0004R", "@nc.g0H\\\u000e", "5dc\u001fb;:b\u001d\t\u0004S", "Adc\u001fb;:b\u001d\t\u0004S", "AbP9X\u001f", "5dc V(ES\f", "Adc V(ES\f", "AbP9X ", "5dc V(ES\r", "Adc V(ES\r", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "5dc [(=]+^\u0002^=x\u00183o\t", "Adc [(=]+^\u0002^=x\u00183o\t", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "5dc [(IS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#k#3x\u0016\u0004", "Adc [(IS", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~G\u0001\u001cBmkq>", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc \\A>\u001b\u0002aBc)i\u0007", "Ao^AF/:R#\u0011Xh3\u0007\u0016", "5dc c6MA\u001czyh>Z\u00136o\roF?R\u0011|L_", "Adc c6MA\u001czyh>Z\u00136o\roN:Sb\u001eNK", "BqP;f-H`!h\bb.\u0001\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n$fy)En ;U-Ho6\"\u001e>", "5dc!e(Ga\u001a\t\bf\u0016\n\r1i\toiUe\u0017bC[", "Adc!e(Ga\u001a\t\bf\u0016\n\r1i\tou:`*\u000b%[", "BqP;f3:b\u001d\t\u0004Q", "5dc!e(Ga z\nb6\u0006{", "Adc!e(Ga z\nb6\u0006{", "BqP;f3:b\u001d\t\u0004R", "5dc!e(Ga z\nb6\u0006|", "Adc!e(Ga z\nb6\u0006|", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@PlacementScopeMarker
public interface GraphicsLayerScope extends Density {
    float getAlpha();

    float getCameraDistance();

    boolean getClip();

    default RenderEffect getRenderEffect() {
        return null;
    }

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    Shape getShape();

    /* JADX INFO: renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    long mo4367getTransformOriginSzJe1aQ();

    float getTranslationX();

    float getTranslationY();

    void setAlpha(float f2);

    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    default void mo4368setAmbientShadowColor8_81llA(long j2) {
    }

    void setCameraDistance(float f2);

    void setClip(boolean z2);

    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    default void mo4369setCompositingStrategyaDBOjCE(int i2) {
    }

    default void setRenderEffect(RenderEffect renderEffect) {
    }

    void setRotationX(float f2);

    void setRotationY(float f2);

    void setRotationZ(float f2);

    void setScaleX(float f2);

    void setScaleY(float f2);

    void setShadowElevation(float f2);

    void setShape(Shape shape);

    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    default void mo4370setSpotShadowColor8_81llA(long j2) {
    }

    /* JADX INFO: renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    void mo4371setTransformOrigin__ExYCQ(long j2);

    void setTranslationX(float f2);

    void setTranslationY(float f2);

    /* JADX INFO: compiled from: GraphicsLayerScope.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static /* synthetic */ void getClip$annotations() {
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4376roundToPxR2X_6o(GraphicsLayerScope graphicsLayerScope, long j2) {
            return GraphicsLayerScope.super.mo703roundToPxR2X_6o(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4377roundToPx0680j_4(GraphicsLayerScope graphicsLayerScope, float f2) {
            return GraphicsLayerScope.super.mo704roundToPx0680j_4(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4381toDpGaN1DYA(GraphicsLayerScope graphicsLayerScope, long j2) {
            return GraphicsLayerScope.super.mo705toDpGaN1DYA(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4382toDpu2uoSUM(GraphicsLayerScope graphicsLayerScope, float f2) {
            return GraphicsLayerScope.super.mo706toDpu2uoSUM(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4383toDpu2uoSUM(GraphicsLayerScope graphicsLayerScope, int i2) {
            return GraphicsLayerScope.super.mo707toDpu2uoSUM(i2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4384toDpSizekrfVVM(GraphicsLayerScope graphicsLayerScope, long j2) {
            return GraphicsLayerScope.super.mo708toDpSizekrfVVM(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4385toPxR2X_6o(GraphicsLayerScope graphicsLayerScope, long j2) {
            return GraphicsLayerScope.super.mo709toPxR2X_6o(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4386toPx0680j_4(GraphicsLayerScope graphicsLayerScope, float f2) {
            return GraphicsLayerScope.super.mo710toPx0680j_4(f2);
        }

        @Deprecated
        public static Rect toRect(GraphicsLayerScope graphicsLayerScope, DpRect dpRect) {
            return GraphicsLayerScope.super.toRect(dpRect);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4387toSizeXkaWNTQ(GraphicsLayerScope graphicsLayerScope, long j2) {
            return GraphicsLayerScope.super.mo711toSizeXkaWNTQ(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4388toSp0xMU5do(GraphicsLayerScope graphicsLayerScope, float f2) {
            return GraphicsLayerScope.super.mo712toSp0xMU5do(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4389toSpkPz2Gy4(GraphicsLayerScope graphicsLayerScope, float f2) {
            return GraphicsLayerScope.super.mo713toSpkPz2Gy4(f2);
        }

        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4390toSpkPz2Gy4(GraphicsLayerScope graphicsLayerScope, int i2) {
            return GraphicsLayerScope.super.mo714toSpkPz2Gy4(i2);
        }

        @Deprecated
        /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
        public static long m4372getAmbientShadowColor0d7_KjU(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo4363getAmbientShadowColor0d7_KjU();
        }

        @Deprecated
        /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
        public static void m4378setAmbientShadowColor8_81llA(GraphicsLayerScope graphicsLayerScope, long j2) {
            GraphicsLayerScope.super.mo4368setAmbientShadowColor8_81llA(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
        public static long m4375getSpotShadowColor0d7_KjU(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo4366getSpotShadowColor0d7_KjU();
        }

        @Deprecated
        /* JADX INFO: renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
        public static void m4380setSpotShadowColor8_81llA(GraphicsLayerScope graphicsLayerScope, long j2) {
            GraphicsLayerScope.super.mo4370setSpotShadowColor8_81llA(j2);
        }

        @Deprecated
        public static RenderEffect getRenderEffect(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.getRenderEffect();
        }

        @Deprecated
        public static void setRenderEffect(GraphicsLayerScope graphicsLayerScope, RenderEffect renderEffect) {
            GraphicsLayerScope.super.setRenderEffect(renderEffect);
        }

        @Deprecated
        /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
        public static int m4373getCompositingStrategyNrFUSI(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo4364getCompositingStrategyNrFUSI();
        }

        @Deprecated
        /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
        public static void m4379setCompositingStrategyaDBOjCE(GraphicsLayerScope graphicsLayerScope, int i2) {
            GraphicsLayerScope.super.mo4369setCompositingStrategyaDBOjCE(i2);
        }

        @Deprecated
        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m4374getSizeNHjbRc(GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo4365getSizeNHjbRc();
        }
    }

    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    default long mo4363getAmbientShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    default long mo4366getSpotShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    default int mo4364getCompositingStrategyNrFUSI() {
        return CompositingStrategy.Companion.m4267getAutoNrFUSI();
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo4365getSizeNHjbRc() {
        return Size.Companion.m4014getUnspecifiedNHjbRc();
    }
}
