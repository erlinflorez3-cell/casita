package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\fNP\rӬD\u0014\u000e\u0006\u0015i\u0010ӇPͿL.ZݷJ\"y{L$\n#\u001aCiVPB̀\rSfimpX]ŸG\u0013"}, d2 = {"-rTAg0GU'", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0012U?=k%\u001e\u0013wkF\\", "!dcA\\5@a", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCvW@t/>gG\u00045w\u001f<\f2Mu#(\u001eh7", "5dc X;MW\"\u0001\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\u0006z#?b\fi\u001bk 7[\u0002*}>\r\u001fqa\u000fJJ(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011N[N yG;\u001d\u0016uZ\u00029w\u000b\u0019_q=frBG\u0010E\t\u001f\u0003\u0017", ";`c2e0:Z`\u0003xh5\u000bP-o\r(uM\u0001\u001e\u0017C}\u000e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SettingsKt {
    private static ImageVector _settings = null;

    public static final ImageVector getSettings(Icons.TwoTone twoTone) {
        ImageVector imageVector = _settings;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Settings", Dp.m6638constructorimpl(24.0f), Dp.m6638constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4204getBlack0d7_KjU(), null);
        int iM4531getButtKaPHkGw = StrokeCap.Companion.m4531getButtKaPHkGw();
        int iM4541getBevelLxFBmk8 = StrokeJoin.Companion.m4541getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.28f, 8.6f);
        pathBuilder.lineToRelative(-0.7f, -1.21f);
        pathBuilder.lineToRelative(-1.27f, 0.51f);
        pathBuilder.lineToRelative(-1.06f, 0.43f);
        pathBuilder.lineToRelative(-0.91f, -0.7f);
        pathBuilder.curveToRelative(-0.39f, -0.3f, -0.8f, -0.54f, -1.23f, -0.71f);
        pathBuilder.lineToRelative(-1.06f, -0.43f);
        pathBuilder.lineToRelative(-0.16f, -1.13f);
        pathBuilder.lineTo(12.7f, 4.0f);
        pathBuilder.horizontalLineToRelative(-1.4f);
        pathBuilder.lineToRelative(-0.19f, 1.35f);
        pathBuilder.lineToRelative(-0.16f, 1.13f);
        pathBuilder.lineToRelative(-1.06f, 0.44f);
        pathBuilder.curveToRelative(-0.41f, 0.17f, -0.82f, 0.41f, -1.25f, 0.73f);
        pathBuilder.lineToRelative(-0.9f, 0.68f);
        pathBuilder.lineToRelative(-1.05f, -0.42f);
        pathBuilder.lineToRelative(-1.27f, -0.52f);
        pathBuilder.lineToRelative(-0.7f, 1.21f);
        pathBuilder.lineToRelative(1.08f, 0.84f);
        pathBuilder.lineToRelative(0.89f, 0.7f);
        pathBuilder.lineToRelative(-0.14f, 1.13f);
        pathBuilder.curveToRelative(-0.03f, 0.3f, -0.05f, 0.53f, -0.05f, 0.73f);
        pathBuilder.reflectiveCurveToRelative(0.02f, 0.43f, 0.05f, 0.73f);
        pathBuilder.lineToRelative(0.14f, 1.13f);
        pathBuilder.lineToRelative(-0.89f, 0.7f);
        pathBuilder.lineToRelative(-1.08f, 0.84f);
        pathBuilder.lineToRelative(0.7f, 1.21f);
        pathBuilder.lineToRelative(1.27f, -0.51f);
        pathBuilder.lineToRelative(1.06f, -0.43f);
        pathBuilder.lineToRelative(0.91f, 0.7f);
        pathBuilder.curveToRelative(0.39f, 0.3f, 0.8f, 0.54f, 1.23f, 0.71f);
        pathBuilder.lineToRelative(1.06f, 0.43f);
        pathBuilder.lineToRelative(0.16f, 1.13f);
        pathBuilder.lineToRelative(0.19f, 1.36f);
        pathBuilder.horizontalLineToRelative(1.39f);
        pathBuilder.lineToRelative(0.19f, -1.35f);
        pathBuilder.lineToRelative(0.16f, -1.13f);
        pathBuilder.lineToRelative(1.06f, -0.43f);
        pathBuilder.curveToRelative(0.41f, -0.17f, 0.82f, -0.41f, 1.25f, -0.73f);
        pathBuilder.lineToRelative(0.9f, -0.68f);
        pathBuilder.lineToRelative(1.04f, 0.42f);
        pathBuilder.lineToRelative(1.27f, 0.51f);
        pathBuilder.lineToRelative(0.7f, -1.21f);
        pathBuilder.lineToRelative(-1.08f, -0.84f);
        pathBuilder.lineToRelative(-0.89f, -0.7f);
        pathBuilder.lineToRelative(0.14f, -1.13f);
        pathBuilder.curveToRelative(0.04f, -0.31f, 0.05f, -0.52f, 0.05f, -0.73f);
        pathBuilder.curveToRelative(0.0f, -0.21f, -0.02f, -0.43f, -0.05f, -0.73f);
        pathBuilder.lineToRelative(-0.14f, -1.13f);
        pathBuilder.lineToRelative(0.89f, -0.7f);
        pathBuilder.lineToRelative(1.1f, -0.84f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 16.0f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f);
        pathBuilder.close();
        ImageVector.Builder.m4869addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM4531getButtKaPHkGw, iM4541getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(Color.Companion.m4204getBlack0d7_KjU(), null);
        int iM4531getButtKaPHkGw2 = StrokeCap.Companion.m4531getButtKaPHkGw();
        int iM4541getBevelLxFBmk82 = StrokeJoin.Companion.m4541getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.43f, 12.98f);
        pathBuilder2.curveToRelative(0.04f, -0.32f, 0.07f, -0.64f, 0.07f, -0.98f);
        pathBuilder2.curveToRelative(0.0f, -0.34f, -0.03f, -0.66f, -0.07f, -0.98f);
        pathBuilder2.lineToRelative(2.11f, -1.65f);
        pathBuilder2.curveToRelative(0.19f, -0.15f, 0.24f, -0.42f, 0.12f, -0.64f);
        pathBuilder2.lineToRelative(-2.0f, -3.46f);
        pathBuilder2.curveToRelative(-0.09f, -0.16f, -0.26f, -0.25f, -0.44f, -0.25f);
        pathBuilder2.curveToRelative(-0.06f, 0.0f, -0.12f, 0.01f, -0.17f, 0.03f);
        pathBuilder2.lineToRelative(-2.49f, 1.0f);
        pathBuilder2.curveToRelative(-0.52f, -0.4f, -1.08f, -0.73f, -1.69f, -0.98f);
        pathBuilder2.lineToRelative(-0.38f, -2.65f);
        pathBuilder2.curveTo(14.46f, 2.18f, 14.25f, 2.0f, 14.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(-4.0f);
        pathBuilder2.curveToRelative(-0.25f, 0.0f, -0.46f, 0.18f, -0.49f, 0.42f);
        pathBuilder2.lineToRelative(-0.38f, 2.65f);
        pathBuilder2.curveToRelative(-0.61f, 0.25f, -1.17f, 0.59f, -1.69f, 0.98f);
        pathBuilder2.lineToRelative(-2.49f, -1.0f);
        pathBuilder2.curveToRelative(-0.06f, -0.02f, -0.12f, -0.03f, -0.18f, -0.03f);
        pathBuilder2.curveToRelative(-0.17f, 0.0f, -0.34f, 0.09f, -0.43f, 0.25f);
        pathBuilder2.lineToRelative(-2.0f, 3.46f);
        pathBuilder2.curveToRelative(-0.13f, 0.22f, -0.07f, 0.49f, 0.12f, 0.64f);
        pathBuilder2.lineToRelative(2.11f, 1.65f);
        pathBuilder2.curveToRelative(-0.04f, 0.32f, -0.07f, 0.65f, -0.07f, 0.98f);
        pathBuilder2.reflectiveCurveToRelative(0.03f, 0.66f, 0.07f, 0.98f);
        pathBuilder2.lineToRelative(-2.11f, 1.65f);
        pathBuilder2.curveToRelative(-0.19f, 0.15f, -0.24f, 0.42f, -0.12f, 0.64f);
        pathBuilder2.lineToRelative(2.0f, 3.46f);
        pathBuilder2.curveToRelative(0.09f, 0.16f, 0.26f, 0.25f, 0.44f, 0.25f);
        pathBuilder2.curveToRelative(0.06f, 0.0f, 0.12f, -0.01f, 0.17f, -0.03f);
        pathBuilder2.lineToRelative(2.49f, -1.0f);
        pathBuilder2.curveToRelative(0.52f, 0.4f, 1.08f, 0.73f, 1.69f, 0.98f);
        pathBuilder2.lineToRelative(0.38f, 2.65f);
        pathBuilder2.curveToRelative(0.03f, 0.24f, 0.24f, 0.42f, 0.49f, 0.42f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.curveToRelative(0.25f, 0.0f, 0.46f, -0.18f, 0.49f, -0.42f);
        pathBuilder2.lineToRelative(0.38f, -2.65f);
        pathBuilder2.curveToRelative(0.61f, -0.25f, 1.17f, -0.59f, 1.69f, -0.98f);
        pathBuilder2.lineToRelative(2.49f, 1.0f);
        pathBuilder2.curveToRelative(0.06f, 0.02f, 0.12f, 0.03f, 0.18f, 0.03f);
        pathBuilder2.curveToRelative(0.17f, 0.0f, 0.34f, -0.09f, 0.43f, -0.25f);
        pathBuilder2.lineToRelative(2.0f, -3.46f);
        pathBuilder2.curveToRelative(0.12f, -0.22f, 0.07f, -0.49f, -0.12f, -0.64f);
        pathBuilder2.lineToRelative(-2.11f, -1.65f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.45f, 11.27f);
        pathBuilder2.curveToRelative(0.04f, 0.31f, 0.05f, 0.52f, 0.05f, 0.73f);
        pathBuilder2.curveToRelative(0.0f, 0.21f, -0.02f, 0.43f, -0.05f, 0.73f);
        pathBuilder2.lineToRelative(-0.14f, 1.13f);
        pathBuilder2.lineToRelative(0.89f, 0.7f);
        pathBuilder2.lineToRelative(1.08f, 0.84f);
        pathBuilder2.lineToRelative(-0.7f, 1.21f);
        pathBuilder2.lineToRelative(-1.27f, -0.51f);
        pathBuilder2.lineToRelative(-1.04f, -0.42f);
        pathBuilder2.lineToRelative(-0.9f, 0.68f);
        pathBuilder2.curveToRelative(-0.43f, 0.32f, -0.84f, 0.56f, -1.25f, 0.73f);
        pathBuilder2.lineToRelative(-1.06f, 0.43f);
        pathBuilder2.lineToRelative(-0.16f, 1.13f);
        pathBuilder2.lineToRelative(-0.2f, 1.35f);
        pathBuilder2.horizontalLineToRelative(-1.4f);
        pathBuilder2.lineToRelative(-0.19f, -1.35f);
        pathBuilder2.lineToRelative(-0.16f, -1.13f);
        pathBuilder2.lineToRelative(-1.06f, -0.43f);
        pathBuilder2.curveToRelative(-0.43f, -0.18f, -0.83f, -0.41f, -1.23f, -0.71f);
        pathBuilder2.lineToRelative(-0.91f, -0.7f);
        pathBuilder2.lineToRelative(-1.06f, 0.43f);
        pathBuilder2.lineToRelative(-1.27f, 0.51f);
        pathBuilder2.lineToRelative(-0.7f, -1.21f);
        pathBuilder2.lineToRelative(1.08f, -0.84f);
        pathBuilder2.lineToRelative(0.89f, -0.7f);
        pathBuilder2.lineToRelative(-0.14f, -1.13f);
        pathBuilder2.curveToRelative(-0.03f, -0.31f, -0.05f, -0.54f, -0.05f, -0.74f);
        pathBuilder2.reflectiveCurveToRelative(0.02f, -0.43f, 0.05f, -0.73f);
        pathBuilder2.lineToRelative(0.14f, -1.13f);
        pathBuilder2.lineToRelative(-0.89f, -0.7f);
        pathBuilder2.lineToRelative(-1.08f, -0.84f);
        pathBuilder2.lineToRelative(0.7f, -1.21f);
        pathBuilder2.lineToRelative(1.27f, 0.51f);
        pathBuilder2.lineToRelative(1.04f, 0.42f);
        pathBuilder2.lineToRelative(0.9f, -0.68f);
        pathBuilder2.curveToRelative(0.43f, -0.32f, 0.84f, -0.56f, 1.25f, -0.73f);
        pathBuilder2.lineToRelative(1.06f, -0.43f);
        pathBuilder2.lineToRelative(0.16f, -1.13f);
        pathBuilder2.lineToRelative(0.2f, -1.35f);
        pathBuilder2.horizontalLineToRelative(1.39f);
        pathBuilder2.lineToRelative(0.19f, 1.35f);
        pathBuilder2.lineToRelative(0.16f, 1.13f);
        pathBuilder2.lineToRelative(1.06f, 0.43f);
        pathBuilder2.curveToRelative(0.43f, 0.18f, 0.83f, 0.41f, 1.23f, 0.71f);
        pathBuilder2.lineToRelative(0.91f, 0.7f);
        pathBuilder2.lineToRelative(1.06f, -0.43f);
        pathBuilder2.lineToRelative(1.27f, -0.51f);
        pathBuilder2.lineToRelative(0.7f, 1.21f);
        pathBuilder2.lineToRelative(-1.07f, 0.85f);
        pathBuilder2.lineToRelative(-0.89f, 0.7f);
        pathBuilder2.lineToRelative(0.14f, 1.13f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 8.0f);
        pathBuilder2.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder2.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder2.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 14.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m4869addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM4531getButtKaPHkGw2, iM4541getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settings = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
