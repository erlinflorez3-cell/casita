package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.braze.enums.inappmessage.CropType;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0LeV3Zݷ2\u000f\u0002{<$a'yCIg\"}(\u000bWN}gvJ`\u000eK\u000f\u0014\u001f\u0001j2K]xs\u0012\u0017˰JoM9UoC9htD\u0005(2(C\u0002\u0005\u0017\u001a2H\u0016v\u0001XaÈB0nojR;ME1\"\fL!\u0019 rf|8Xrk=G%\u0019hpRϮc0\u000bRUbbD%v\u00108[DES-%\u0002\"7Vi_\u001b? ^5l5ICI\"x~f\u000e7-+}1\u000ev4z\u001dQ\u000f+m=\u0018yYu&(&\u001f,\u0011J*&\u0006Ui^1(\u000e \u000ea\u00169e\t^\u0010\u0007Z\u007f)\u0006f\u001b3\u0006K+g\"-e*a'wO{31N'\u000f\u00199[\u0003\u0015\u0011\u0019)\u007f\u0010Q_XpAVz\"Ykt4tp/B\u0004^NFCD\u001f<E=7\n]S%y1`D\u0016}Kt1cw\u0003`@P\u0013F=8:$\\Zc3\u001e\u0017h!:\u001ff4T5\"8\u0017.\u0010\u0010<O?Vb twpe]8,\u0006όC֍rk\u0016ã\nvA=ic>j)Ο ͖@n\r֚~DY\u0016hgH$8Tx\u001dH\u0018R^$\u0013`N\" B:I\u0019\u000b$\u0007Ct՚mҴ\rebӐ(\u0001ZD2\u0015:<\u0003\u001c\u0019P\u000b\u0005FΦ\u0005ͅ0\thõECWJ'<u$nK\u000b;W\u0011\u0002\u0019_gza#́\"\u0091Y\u0002(چ*;WJK/ê\u0003]"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004@I!95CIy0 \u0015Li5\tc\u001dRv9\u001d", "\u001a`]1e6BRb\u0011~].|\u0018xI\b$}@q\u001b\u0017YE", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWMz%GgG\u0004\u001bvq9X+;yB\u001a\u0017hEA\u0003e,?z'Y\"", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/sc?f", "\u001a`]1e6BRb\u000f\nb3Fd>t\r,xP\u0010\u0017\u0005G~c", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001}%2T\r\u0017zC+\u0019eqH\u0007Q,]Lj8", "/r_2V;+O(\u0003\u0005", "", "1kX=C(MV", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wO\u0004l", "5dc\u0010_0I>\u0015\u000e}", "u(;.a+K]\u001d}D`9x\u00142i}6E+|&\u001a\u001d", "Adc\u0010_0I>\u0015\u000e}", "uKP;W9HW\u0018H|k(\b\f3c\u000eqf<\u0010\u001al\u000b`", "\nrTA \u0006\u0017", "", "7m0=c\u0019:R\u001d\u0003", "5dc\u0016a\bI^\u0006zyb0", "u(J\u0013", "@dRAY", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010wl", "5dc\u001fX*MT", "u(;.a+K]\u001d}D`9x\u00142i}6E-\u0001\u0015&(E", "Adc\u001fX*MT", "uKP;W9HW\u0018H|k(\b\f3c\u000eqh@~&w\u001d3~", "Adc!b\u000f:Z\u001aivk,\u0006\u0018\u0012e\u0004*~O", "", "5dc X;-]{z\u0002_\u0017x\u0016/n\u000f\u000b{D\u0003\u001a&\u0006k\u0017E\u000141h\u0002*@{", "u(E", "1kX=6(Gd\u0015\rih\u0017x\u00182", "1`]CT:", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "EhSA[\u0017Q", "", "6dX4[;)f", "=m3?T>", "", "=m<2T:N`\u0019", "EhSA[\u0014>O'\u000f\b^\u001a\b\t-", "6dX4[;&S\u0015\r\u000bk,j\u0014/c", "Adc\u000ef7>Q(kvm0\u0007", "Adc\u0010b9GS&\rgZ+\u0001\r\u001ax", "Bn_\u0019X-M", "Bn_\u001f\\.Ab", "0ncAb4%S\u001a\u000e", "0ncAb4+W\u001b\u0002\n", "Adc\u0010b9GS&\rgZ+\u0001\u0019=P\u0013", "1na;X9L@\u0015}~n:", "Adc\u0016a\bI^\u0001~\tl(~\t\u0013m{*{\u001e\u000e!\"6\u0004\u0019<", "1q^=G@IS", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u0013f\b+&\u0002!.#", "Adc!b\u000f:Z\u001aazb.\u007f\u0018", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class InAppMessageImageView extends ImageView implements IInAppMessageImageView {
    private float aspectRatio;
    private Path clipPath;
    private float[] inAppRadii;
    private RectF rectf;
    private boolean setToHalfParentHeight;

    public InAppMessageImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.clipPath = new Path();
        this.rectf = new RectF();
        this.aspectRatio = -1.0f;
        setAdjustViewBounds(true);
    }

    private static /* synthetic */ void getSetToHalfParentHeight$annotations() {
    }

    public final boolean clipCanvasToPath(Canvas canvas, int i2, int i3) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.inAppRadii == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageImageView.clipCanvasToPath.2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "In-app message radii is uninitialized, not clipping path.";
                }
            }, 7, (Object) null);
            return false;
        }
        try {
            this.clipPath.reset();
            this.rectf.set(0.0f, 0.0f, i2, i3);
            this.clipPath.addRoundRect(this.rectf, getInAppRadii(), Path.Direction.CW);
            canvas.clipPath(this.clipPath);
            return true;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageImageView.clipCanvasToPath.3
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Encountered exception while trying to clip in-app message image";
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final Path getClipPath() {
        return this.clipPath;
    }

    public final float[] getInAppRadii() {
        float[] fArr = this.inAppRadii;
        if (fArr != null) {
            return fArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("inAppRadii");
        return null;
    }

    public final RectF getRectf() {
        return this.rectf;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        clipCanvasToPath(canvas, getWidth(), getHeight());
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.aspectRatio != -1.0f && getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            int measuredWidth = getMeasuredWidth();
            setMeasuredDimension(measuredWidth, Math.min(getMeasuredHeight(), (int) (measuredWidth / this.aspectRatio)) + 1);
        } else {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.setToHalfParentHeight) {
            Object parent = getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
            setMeasuredDimension(getMeasuredWidth(), (int) (((double) ((View) parent).getHeight()) * 0.5d));
        }
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setAspectRatio(float f2) {
        this.aspectRatio = f2;
        requestLayout();
    }

    public final void setClipPath(Path path) {
        Intrinsics.checkNotNullParameter(path, "<set-?>");
        this.clipPath = path;
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setCornersRadiiPx(float f2, float f3, float f4, float f5) {
        this.inAppRadii = new float[]{f2, f2, f3, f3, f4, f4, f5, f5};
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setCornersRadiusPx(float f2) {
        setCornersRadiiPx(f2, f2, f2, f2);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setInAppMessageImageCropType(CropType cropType) {
        if (cropType == CropType.FIT_CENTER) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (cropType == CropType.CENTER_CROP) {
            setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    public final void setRectf(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<set-?>");
        this.rectf = rectF;
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setToHalfParentHeight(boolean z2) {
        this.setToHalfParentHeight = z2;
        requestLayout();
    }
}
