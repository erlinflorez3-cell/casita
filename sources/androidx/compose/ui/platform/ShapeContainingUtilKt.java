package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
/* JADX INFO: compiled from: ShapeContainingUtil.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d̉=!,r\bӵLc\u000b\u0004Iي8\u000b<G\u0007\"2\u0012\u007f\u0007|jA0JhP.hS2şs{J$c$wECU0}*\tUQog\u0005Jbŏ[E\u0014ǝ\u0011jZH\u0006|k\u0012'2ppo7[qU9\u000fwf\t.6:8(\b1\"0H\u001e{\u0013Ea\u000b@6px@R\u001bT\u001d\u001c(\u0005l&GȦt\u001a\\>`l\f9_'\u0011rZNUe`\u0001[\u000f^TU\u0010'e,/X7c\u0018UY\u0011\fj]U\u0002mwm\u000bv.?-_r\u0006<\u001f\u007f,39Y%]!%\r\t_k$'Y[\u0014O^\u0010@w)~=@\u0012\u0012\u001e'v1s\u001a~:\u001c@\rr\u0002?\u0001\u0006lB\u0018z\u0010DG)\u000e5C9Ii\u0002eI\u001df7*\b=$1\u0010\u0007#qS<fE!b\bi3g?kN\u0015\nqu{\u0015\tb0)44U\u0002G{?1G)E_Q#On2LRy\u000f\u0005\u000f{\u0004m`\\X\"\u001d\u0019g.\u0017!rD\u0013\b2PղW\u008cҭQ\u001eZ\u001d\f\u001f+*j\u0010T!S\u000fvO\u0017\u00031Mέ\n*7i=\u058c\u000b\u001a\rČ=x"}, d2 = {"7r8;B<MZ\u001d\bz", "", "=tc9\\5>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001fi\r';v\u0016\u0004", "F", "", "G", "Bl_!b<<V\u0004\t~g;g\u0005>h", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "Bl_\u001cc\u0017:b\u001c", "7r8;C(MV", ">`c5", "7r8;E,<b\u0015\b|e,", "@dRA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "7r8;E6N\\\u0018~yK,z\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001fi\r';v\u0016l:MKt3\u001e\u0014>", "Bnd0[\u0017HW\"\u000eeZ;\u007f", "=o?.g/", "7rF6g/B\\x\u0006\u0002b7\u000b\t", "1na;X9+O\u0018\u0003\u000bl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u0013c\u000b)7z\u0003*LGKy\n", "1d]AX91", "1d]AX92", "7rF6g/B\\x\u0006\u0002b7\u000b\tvV_s\u0010S\u0007\u0015", "uE5\u00179\r\u0002H", "1na;X9L4\u001d\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"c\u000e)6Z\u0016,\\\u0019", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ShapeContainingUtilKt {
    public static /* synthetic */ boolean isInOutline$default(Outline outline, float f2, float f3, Path path, Path path2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            path = null;
        }
        if ((i2 & 16) != 0) {
            path2 = null;
        }
        return isInOutline(outline, f2, f3, path, path2);
    }

    public static final boolean isInOutline(Outline outline, float f2, float f3, Path path, Path path2) {
        if (outline instanceof Outline.Rectangle) {
            return isInRectangle(((Outline.Rectangle) outline).getRect(), f2, f3);
        }
        if (outline instanceof Outline.Rounded) {
            return isInRoundedRect((Outline.Rounded) outline, f2, f3, path, path2);
        }
        if (outline instanceof Outline.Generic) {
            return isInPath(((Outline.Generic) outline).getPath(), f2, f3, path, path2);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean isInRectangle(Rect rect, float f2, float f3) {
        return rect.getLeft() <= f2 && f2 < rect.getRight() && rect.getTop() <= f3 && f3 < rect.getBottom();
    }

    private static final boolean isInRoundedRect(Outline.Rounded rounded, float f2, float f3, Path path, Path path2) {
        RoundRect roundRect = rounded.getRoundRect();
        if (f2 >= roundRect.getLeft() && f2 < roundRect.getRight() && f3 >= roundRect.getTop() && f3 < roundRect.getBottom()) {
            if (!cornersFit(roundRect)) {
                Path Path = path2 == null ? AndroidPath_androidKt.Path() : path2;
                Path.addRoundRect$default(Path, roundRect, null, 2, null);
                return isInPath(Path, f2, f3, path, path2);
            }
            float fM3912getXimpl = CornerRadius.m3912getXimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
            float fM3913getYimpl = CornerRadius.m3913getYimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) + roundRect.getTop();
            float right = roundRect.getRight() - CornerRadius.m3912getXimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs());
            float fM3913getYimpl2 = CornerRadius.m3913getYimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()) + roundRect.getTop();
            float right2 = roundRect.getRight() - CornerRadius.m3912getXimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs());
            float bottom = roundRect.getBottom() - CornerRadius.m3913getYimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs());
            float bottom2 = roundRect.getBottom() - CornerRadius.m3913getYimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs());
            float fM3912getXimpl2 = CornerRadius.m3912getXimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs()) + roundRect.getLeft();
            if (f2 < fM3912getXimpl && f3 < fM3913getYimpl) {
                return m5907isWithinEllipseVE1yxkc(f2, f3, roundRect.m3987getTopLeftCornerRadiuskKHJgLs(), fM3912getXimpl, fM3913getYimpl);
            }
            if (f2 < fM3912getXimpl2 && f3 > bottom2) {
                return m5907isWithinEllipseVE1yxkc(f2, f3, roundRect.m3985getBottomLeftCornerRadiuskKHJgLs(), fM3912getXimpl2, bottom2);
            }
            if (f2 > right && f3 < fM3913getYimpl2) {
                return m5907isWithinEllipseVE1yxkc(f2, f3, roundRect.m3988getTopRightCornerRadiuskKHJgLs(), right, fM3913getYimpl2);
            }
            if (f2 <= right2 || f3 <= bottom) {
                return true;
            }
            return m5907isWithinEllipseVE1yxkc(f2, f3, roundRect.m3986getBottomRightCornerRadiuskKHJgLs(), right2, bottom);
        }
        return false;
    }

    private static final boolean cornersFit(RoundRect roundRect) {
        return CornerRadius.m3912getXimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) + CornerRadius.m3912getXimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()) <= roundRect.getWidth() && CornerRadius.m3912getXimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs()) + CornerRadius.m3912getXimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs()) <= roundRect.getWidth() && CornerRadius.m3913getYimpl(roundRect.m3987getTopLeftCornerRadiuskKHJgLs()) + CornerRadius.m3913getYimpl(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs()) <= roundRect.getHeight() && CornerRadius.m3913getYimpl(roundRect.m3988getTopRightCornerRadiuskKHJgLs()) + CornerRadius.m3913getYimpl(roundRect.m3986getBottomRightCornerRadiuskKHJgLs()) <= roundRect.getHeight();
    }

    /* JADX INFO: renamed from: isWithinEllipse-VE1yxkc, reason: not valid java name */
    private static final boolean m5907isWithinEllipseVE1yxkc(float f2, float f3, long j2, float f4, float f5) {
        float f6 = f2 - f4;
        float f7 = f3 - f5;
        float fM3912getXimpl = CornerRadius.m3912getXimpl(j2);
        float fM3913getYimpl = CornerRadius.m3913getYimpl(j2);
        return ((f6 * f6) / (fM3912getXimpl * fM3912getXimpl)) + ((f7 * f7) / (fM3913getYimpl * fM3913getYimpl)) <= 1.0f;
    }

    private static final boolean isInPath(Path path, float f2, float f3, Path path2, Path path3) {
        Rect rect = new Rect(f2 - 0.005f, f3 - 0.005f, f2 + 0.005f, f3 + 0.005f);
        if (path2 == null) {
            path2 = AndroidPath_androidKt.Path();
        }
        Path.addRect$default(path2, rect, null, 2, null);
        if (path3 == null) {
            path3 = AndroidPath_androidKt.Path();
        }
        path3.mo4070opN5in7k0(path, path2, PathOperation.Companion.m4471getIntersectb3I0S0c());
        boolean zIsEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !zIsEmpty;
    }
}
