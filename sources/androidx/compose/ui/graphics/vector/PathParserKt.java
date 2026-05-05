package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.vector.PathNode;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.List;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: PathParser.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d̉=!,{\bDJd|\u0004O\u00068é6B\u0015\"4ߚ\u007f\u0007tnA0JqP.`\\2\u000fq{<$iByCQU\"}(\ng%ui\u0007J\t\u000es\u0013\u0014\u001a\u0011jZN\u0006|k\u0018'2pvo7[wU9\u000f{f\t.;:8(\f1\u001e8R(v)J{\u0010 ;XphY=Q\u0013&*\u0006l'1\"jtf6vs\u000e>=1\u001bipUWc>\fe\rt[m\r\u000f8,;X7c\u0018UW\u0011\u000bj[m\bouK\u0016\u0001'U2yweHp\u007fB\u001c[S\u001bp\u000b&\u000b\f\u0002d\u001a;CO\u0012R\u0001\u00126\u0001\u0013{;C4\u0012\u00141`.[!\u0017\f\u001c@\rr\u0002G\u0001\u0006lW\u0018z\u0010LG)\u000eJC9I|\u0018aS1\\O\u0014\u0005;#K\u0007~#kT<zC4\u0005}W1_[UH|\u000fqH{ \tb01,0u\u0007uɈ\u0017N)3ڛs9Q BȶJזk|\r\u009b\u0001UoRVA̷r3"}, d2 = {"\u0013l_Al\bK`\u0015\u0013", "", "5dc\u0012`7Mgt\f\bZ@", "u(J\u0013", "/qR!b\t>h\u001d~\b", "", ">", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "1w", "", "1x", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "30g", "30h", "BgTAT", "AsP?g", "AvT2c", "2qPD49<", "F/", "G/", "F0", "G0", "7r<<e,-V\u0015\b]Z3}", "", "7r?<f0MW*~Vk*", "Bn?.g/", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0019IR>T>\u001d\u0015>", "B`a4X;", "BnA.W0:\\'", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PathParserKt {
    private static final float[] EmptyArray = new float[0];

    private static final double toRadians(double d2) {
        return (d2 / ((double) 180)) * 3.141592653589793d;
    }

    public static final float[] getEmptyArray() {
        return EmptyArray;
    }

    public static /* synthetic */ Path toPath$default(List list, Path path, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            path = AndroidPath_androidKt.Path();
        }
        return toPath(list, path);
    }

    public static final Path toPath(List<? extends PathNode> list, Path path) {
        float f2;
        float f3;
        float dy;
        float dy2;
        float f4;
        float f5;
        float f6;
        int iMo4069getFillTypeRgk1Os = path.mo4069getFillTypeRgk1Os();
        path.rewind();
        path.mo4071setFillTypeoQ8Xj4U(iMo4069getFillTypeRgk1Os);
        int i2 = 0;
        PathNode pathNode = list.isEmpty() ? PathNode.Close.INSTANCE : list.get(0);
        int size = list.size();
        float f7 = 0.0f;
        float arcStartDx = 0.0f;
        float arcStartY = 0.0f;
        float arcStartX = 0.0f;
        float y2 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        while (i2 < size) {
            PathNode pathNode2 = list.get(i2);
            if (pathNode2 instanceof PathNode.Close) {
                path.close();
                arcStartDx = f8;
                arcStartX = arcStartDx;
                arcStartY = f9;
                y2 = arcStartY;
            } else {
                if (pathNode2 instanceof PathNode.RelativeMoveTo) {
                    PathNode.RelativeMoveTo relativeMoveTo = (PathNode.RelativeMoveTo) pathNode2;
                    arcStartX += relativeMoveTo.getDx();
                    y2 += relativeMoveTo.getDy();
                    path.relativeMoveTo(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                    f8 = arcStartX;
                } else if (pathNode2 instanceof PathNode.MoveTo) {
                    PathNode.MoveTo moveTo = (PathNode.MoveTo) pathNode2;
                    arcStartX = moveTo.getX();
                    y2 = moveTo.getY();
                    path.moveTo(moveTo.getX(), moveTo.getY());
                    f8 = arcStartX;
                } else {
                    if (pathNode2 instanceof PathNode.RelativeLineTo) {
                        PathNode.RelativeLineTo relativeLineTo = (PathNode.RelativeLineTo) pathNode2;
                        path.relativeLineTo(relativeLineTo.getDx(), relativeLineTo.getDy());
                        arcStartX += relativeLineTo.getDx();
                        dy2 = relativeLineTo.getDy();
                    } else if (pathNode2 instanceof PathNode.LineTo) {
                        PathNode.LineTo lineTo = (PathNode.LineTo) pathNode2;
                        path.lineTo(lineTo.getX(), lineTo.getY());
                        arcStartX = lineTo.getX();
                        y2 = lineTo.getY();
                    } else if (pathNode2 instanceof PathNode.RelativeHorizontalTo) {
                        PathNode.RelativeHorizontalTo relativeHorizontalTo = (PathNode.RelativeHorizontalTo) pathNode2;
                        path.relativeLineTo(relativeHorizontalTo.getDx(), f7);
                        arcStartX += relativeHorizontalTo.getDx();
                    } else if (pathNode2 instanceof PathNode.HorizontalTo) {
                        PathNode.HorizontalTo horizontalTo = (PathNode.HorizontalTo) pathNode2;
                        path.lineTo(horizontalTo.getX(), y2);
                        arcStartX = horizontalTo.getX();
                    } else if (pathNode2 instanceof PathNode.RelativeVerticalTo) {
                        PathNode.RelativeVerticalTo relativeVerticalTo = (PathNode.RelativeVerticalTo) pathNode2;
                        path.relativeLineTo(f7, relativeVerticalTo.getDy());
                        dy2 = relativeVerticalTo.getDy();
                    } else if (pathNode2 instanceof PathNode.VerticalTo) {
                        PathNode.VerticalTo verticalTo = (PathNode.VerticalTo) pathNode2;
                        path.lineTo(arcStartX, verticalTo.getY());
                        y2 = verticalTo.getY();
                    } else {
                        if (pathNode2 instanceof PathNode.RelativeCurveTo) {
                            PathNode.RelativeCurveTo relativeCurveTo = (PathNode.RelativeCurveTo) pathNode2;
                            path.relativeCubicTo(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                            arcStartDx = relativeCurveTo.getDx2() + arcStartX;
                            arcStartY = relativeCurveTo.getDy2() + y2;
                            arcStartX += relativeCurveTo.getDx3();
                            dy = relativeCurveTo.getDy3();
                        } else if (pathNode2 instanceof PathNode.CurveTo) {
                            PathNode.CurveTo curveTo = (PathNode.CurveTo) pathNode2;
                            path.cubicTo(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                            arcStartDx = curveTo.getX2();
                            arcStartY = curveTo.getY2();
                            arcStartX = curveTo.getX3();
                            y2 = curveTo.getY3();
                        } else if (pathNode2 instanceof PathNode.RelativeReflectiveCurveTo) {
                            if (pathNode.isCurve()) {
                                f5 = arcStartX - arcStartDx;
                                f6 = y2 - arcStartY;
                            } else {
                                f5 = f7;
                                f6 = f5;
                            }
                            PathNode.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (PathNode.RelativeReflectiveCurveTo) pathNode2;
                            path.relativeCubicTo(f5, f6, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                            arcStartDx = relativeReflectiveCurveTo.getDx1() + arcStartX;
                            arcStartY = relativeReflectiveCurveTo.getDy1() + y2;
                            arcStartX += relativeReflectiveCurveTo.getDx2();
                            dy = relativeReflectiveCurveTo.getDy2();
                        } else if (pathNode2 instanceof PathNode.ReflectiveCurveTo) {
                            if (pathNode.isCurve()) {
                                float f10 = 2;
                                arcStartX = (arcStartX * f10) - arcStartDx;
                                f4 = (f10 * y2) - arcStartY;
                            } else {
                                f4 = y2;
                            }
                            PathNode.ReflectiveCurveTo reflectiveCurveTo = (PathNode.ReflectiveCurveTo) pathNode2;
                            path.cubicTo(arcStartX, f4, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                            arcStartDx = reflectiveCurveTo.getX1();
                            arcStartY = reflectiveCurveTo.getY1();
                            arcStartX = reflectiveCurveTo.getX2();
                            y2 = reflectiveCurveTo.getY2();
                        } else if (pathNode2 instanceof PathNode.RelativeQuadTo) {
                            PathNode.RelativeQuadTo relativeQuadTo = (PathNode.RelativeQuadTo) pathNode2;
                            path.relativeQuadraticTo(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                            arcStartDx = relativeQuadTo.getDx1() + arcStartX;
                            arcStartY = relativeQuadTo.getDy1() + y2;
                            arcStartX += relativeQuadTo.getDx2();
                            dy2 = relativeQuadTo.getDy2();
                        } else if (pathNode2 instanceof PathNode.QuadTo) {
                            PathNode.QuadTo quadTo = (PathNode.QuadTo) pathNode2;
                            path.quadraticTo(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                            arcStartDx = quadTo.getX1();
                            arcStartY = quadTo.getY1();
                            arcStartX = quadTo.getX2();
                            y2 = quadTo.getY2();
                        } else if (pathNode2 instanceof PathNode.RelativeReflectiveQuadTo) {
                            if (pathNode.isQuad()) {
                                f2 = arcStartX - arcStartDx;
                                f3 = y2 - arcStartY;
                            } else {
                                f2 = f7;
                                f3 = f2;
                            }
                            PathNode.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (PathNode.RelativeReflectiveQuadTo) pathNode2;
                            path.relativeQuadraticTo(f2, f3, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                            arcStartDx = f2 + arcStartX;
                            arcStartY = f3 + y2;
                            arcStartX += relativeReflectiveQuadTo.getDx();
                            dy = relativeReflectiveQuadTo.getDy();
                        } else if (pathNode2 instanceof PathNode.ReflectiveQuadTo) {
                            if (pathNode.isQuad()) {
                                float f11 = 2;
                                arcStartX = (arcStartX * f11) - arcStartDx;
                                y2 = (f11 * y2) - arcStartY;
                            }
                            PathNode.ReflectiveQuadTo reflectiveQuadTo = (PathNode.ReflectiveQuadTo) pathNode2;
                            path.quadraticTo(arcStartX, y2, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                            float x2 = reflectiveQuadTo.getX();
                            arcStartY = y2;
                            y2 = reflectiveQuadTo.getY();
                            arcStartDx = arcStartX;
                            arcStartX = x2;
                        } else if (pathNode2 instanceof PathNode.RelativeArcTo) {
                            PathNode.RelativeArcTo relativeArcTo = (PathNode.RelativeArcTo) pathNode2;
                            arcStartDx = relativeArcTo.getArcStartDx() + arcStartX;
                            arcStartY = relativeArcTo.getArcStartDy() + y2;
                            f7 = 0.0f;
                            drawArc(path, arcStartX, y2, arcStartDx, arcStartY, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.isMoreThanHalf(), relativeArcTo.isPositiveArc());
                            y2 = arcStartY;
                            arcStartX = arcStartDx;
                        } else if (pathNode2 instanceof PathNode.ArcTo) {
                            PathNode.ArcTo arcTo = (PathNode.ArcTo) pathNode2;
                            drawArc(path, arcStartX, y2, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.isMoreThanHalf(), arcTo.isPositiveArc());
                            arcStartX = arcTo.getArcStartX();
                            arcStartY = arcTo.getArcStartY();
                            y2 = arcStartY;
                            arcStartDx = arcStartX;
                        }
                        y2 += dy;
                    }
                    y2 += dy2;
                }
                f9 = y2;
            }
            i2++;
            pathNode = pathNode2;
        }
        return path;
    }

    private static final void drawArc(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, boolean z2, boolean z3) {
        double d9;
        double d10;
        double d11 = (d8 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dCos) + (d3 * dSin)) / d6;
        double d13 = (((-d2) * dSin) + (d3 * dCos)) / d7;
        double d14 = ((d4 * dCos) + (d5 * dSin)) / d6;
        double d15 = (((-d4) * dSin) + (d5 * dCos)) / d7;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = 2;
        double d19 = (d12 + d14) / d18;
        double d20 = (d13 + d15) / d18;
        double d21 = (d16 * d16) + (d17 * d17);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            drawArc(path, d2, d3, d4, d5, d6 * dSqrt, d7 * dSqrt, d8, z2, z3);
            return;
        }
        double dSqrt2 = Math.sqrt(d22);
        double d23 = d16 * dSqrt2;
        double d24 = dSqrt2 * d17;
        if (z2 == z3) {
            d9 = d19 - d24;
            d10 = d20 + d23;
        } else {
            d9 = d19 + d24;
            d10 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d13 - d10, d12 - d9);
        double dAtan22 = Math.atan2(d15 - d10, d14 - d9) - dAtan2;
        if (z3 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d25 = d9 * d6;
        double d26 = d10 * d7;
        arcToBezier(path, (d25 * dCos) - (d26 * dSin), (d25 * dSin) + (d26 * dCos), d6, d7, d2, d3, d11, dAtan2, dAtan22);
    }

    private static final void arcToBezier(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        double d11 = d7;
        double d12 = d6;
        double d13 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d10 * d13) / 3.141592653589793d));
        double dCos = Math.cos(d8);
        double dSin = Math.sin(d8);
        double dCos2 = Math.cos(d9);
        double dSin2 = Math.sin(d9);
        double d14 = -d4;
        double d15 = d14 * dCos;
        double d16 = d5 * dSin;
        double d17 = (d15 * dSin2) - (d16 * dCos2);
        double d18 = d14 * dSin;
        double d19 = d5 * dCos;
        double d20 = (dSin2 * d18) + (dCos2 * d19);
        double d21 = d10 / ((double) iCeil);
        int i2 = 0;
        while (i2 < iCeil) {
            double d22 = d9 + d21;
            double dSin3 = Math.sin(d22);
            double dCos3 = Math.cos(d22);
            double d23 = (d2 + ((d4 * dCos) * dCos3)) - (d16 * dSin3);
            double d24 = d3 + (d4 * dSin * dCos3) + (d19 * dSin3);
            double d25 = (d15 * dSin3) - (d16 * dCos3);
            double d26 = (dSin3 * d18) + (dCos3 * d19);
            double d27 = d22 - d9;
            double dTan = Math.tan(d27 / ((double) 2));
            double dSin4 = (Math.sin(d27) * (Math.sqrt(d13 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
            path.cubicTo((float) (d12 + (d17 * dSin4)), (float) (d11 + (d20 * dSin4)), (float) (d23 - (dSin4 * d25)), (float) (d24 - (dSin4 * d26)), (float) d23, (float) d24);
            i2++;
            d12 = d23;
            d9 = d22;
            d20 = d26;
            d17 = d25;
            d11 = d24;
        }
    }
}
