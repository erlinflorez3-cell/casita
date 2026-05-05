package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.material.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
public class ShapeAppearanceModel {
    public static final CornerSize PILL = new RelativeCornerSize(0.5f);
    EdgeTreatment bottomEdge;
    CornerTreatment bottomLeftCorner;
    CornerSize bottomLeftCornerSize;
    CornerTreatment bottomRightCorner;
    CornerSize bottomRightCornerSize;
    EdgeTreatment leftEdge;
    EdgeTreatment rightEdge;
    EdgeTreatment topEdge;
    CornerTreatment topLeftCorner;
    CornerSize topLeftCornerSize;
    CornerTreatment topRightCorner;
    CornerSize topRightCornerSize;

    public static final class Builder {
        private EdgeTreatment bottomEdge;
        private CornerTreatment bottomLeftCorner;
        private CornerSize bottomLeftCornerSize;
        private CornerTreatment bottomRightCorner;
        private CornerSize bottomRightCornerSize;
        private EdgeTreatment leftEdge;
        private EdgeTreatment rightEdge;
        private EdgeTreatment topEdge;
        private CornerTreatment topLeftCorner;
        private CornerSize topLeftCornerSize;
        private CornerTreatment topRightCorner;
        private CornerSize topRightCornerSize;

        public Builder() {
            this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        }

        public Builder(ShapeAppearanceModel shapeAppearanceModel) {
            this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
            this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
            this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
            this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
            this.topLeftCorner = shapeAppearanceModel.topLeftCorner;
            this.topRightCorner = shapeAppearanceModel.topRightCorner;
            this.bottomRightCorner = shapeAppearanceModel.bottomRightCorner;
            this.bottomLeftCorner = shapeAppearanceModel.bottomLeftCorner;
            this.topLeftCornerSize = shapeAppearanceModel.topLeftCornerSize;
            this.topRightCornerSize = shapeAppearanceModel.topRightCornerSize;
            this.bottomRightCornerSize = shapeAppearanceModel.bottomRightCornerSize;
            this.bottomLeftCornerSize = shapeAppearanceModel.bottomLeftCornerSize;
            this.topEdge = shapeAppearanceModel.topEdge;
            this.rightEdge = shapeAppearanceModel.rightEdge;
            this.bottomEdge = shapeAppearanceModel.bottomEdge;
            this.leftEdge = shapeAppearanceModel.leftEdge;
        }

        private static float compatCornerTreatmentSize(CornerTreatment cornerTreatment) {
            if (cornerTreatment instanceof RoundedCornerTreatment) {
                return ((RoundedCornerTreatment) cornerTreatment).radius;
            }
            if (cornerTreatment instanceof CutCornerTreatment) {
                return ((CutCornerTreatment) cornerTreatment).size;
            }
            return -1.0f;
        }

        public ShapeAppearanceModel build() {
            return new ShapeAppearanceModel(this);
        }

        public Builder setAllCornerSizes(float f2) {
            return setTopLeftCornerSize(f2).setTopRightCornerSize(f2).setBottomRightCornerSize(f2).setBottomLeftCornerSize(f2);
        }

        public Builder setAllCornerSizes(CornerSize cornerSize) {
            return setTopLeftCornerSize(cornerSize).setTopRightCornerSize(cornerSize).setBottomRightCornerSize(cornerSize).setBottomLeftCornerSize(cornerSize);
        }

        public Builder setAllCorners(int i2, float f2) {
            return setAllCorners(MaterialShapeUtils.createCornerTreatment(i2)).setAllCornerSizes(f2);
        }

        public Builder setAllCorners(CornerTreatment cornerTreatment) {
            return setTopLeftCorner(cornerTreatment).setTopRightCorner(cornerTreatment).setBottomRightCorner(cornerTreatment).setBottomLeftCorner(cornerTreatment);
        }

        public Builder setAllEdges(EdgeTreatment edgeTreatment) {
            return setLeftEdge(edgeTreatment).setTopEdge(edgeTreatment).setRightEdge(edgeTreatment).setBottomEdge(edgeTreatment);
        }

        public Builder setBottomEdge(EdgeTreatment edgeTreatment) {
            this.bottomEdge = edgeTreatment;
            return this;
        }

        public Builder setBottomLeftCorner(int i2, float f2) {
            return setBottomLeftCorner(MaterialShapeUtils.createCornerTreatment(i2)).setBottomLeftCornerSize(f2);
        }

        public Builder setBottomLeftCorner(int i2, CornerSize cornerSize) {
            return setBottomLeftCorner(MaterialShapeUtils.createCornerTreatment(i2)).setBottomLeftCornerSize(cornerSize);
        }

        public Builder setBottomLeftCorner(CornerTreatment cornerTreatment) {
            this.bottomLeftCorner = cornerTreatment;
            float fCompatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (fCompatCornerTreatmentSize != -1.0f) {
                setBottomLeftCornerSize(fCompatCornerTreatmentSize);
            }
            return this;
        }

        public Builder setBottomLeftCornerSize(float f2) {
            this.bottomLeftCornerSize = new AbsoluteCornerSize(f2);
            return this;
        }

        public Builder setBottomLeftCornerSize(CornerSize cornerSize) {
            this.bottomLeftCornerSize = cornerSize;
            return this;
        }

        public Builder setBottomRightCorner(int i2, float f2) {
            return setBottomRightCorner(MaterialShapeUtils.createCornerTreatment(i2)).setBottomRightCornerSize(f2);
        }

        public Builder setBottomRightCorner(int i2, CornerSize cornerSize) {
            return setBottomRightCorner(MaterialShapeUtils.createCornerTreatment(i2)).setBottomRightCornerSize(cornerSize);
        }

        public Builder setBottomRightCorner(CornerTreatment cornerTreatment) {
            this.bottomRightCorner = cornerTreatment;
            float fCompatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (fCompatCornerTreatmentSize != -1.0f) {
                setBottomRightCornerSize(fCompatCornerTreatmentSize);
            }
            return this;
        }

        public Builder setBottomRightCornerSize(float f2) {
            this.bottomRightCornerSize = new AbsoluteCornerSize(f2);
            return this;
        }

        public Builder setBottomRightCornerSize(CornerSize cornerSize) {
            this.bottomRightCornerSize = cornerSize;
            return this;
        }

        public Builder setLeftEdge(EdgeTreatment edgeTreatment) {
            this.leftEdge = edgeTreatment;
            return this;
        }

        public Builder setRightEdge(EdgeTreatment edgeTreatment) {
            this.rightEdge = edgeTreatment;
            return this;
        }

        public Builder setTopEdge(EdgeTreatment edgeTreatment) {
            this.topEdge = edgeTreatment;
            return this;
        }

        public Builder setTopLeftCorner(int i2, float f2) {
            return setTopLeftCorner(MaterialShapeUtils.createCornerTreatment(i2)).setTopLeftCornerSize(f2);
        }

        public Builder setTopLeftCorner(int i2, CornerSize cornerSize) {
            return setTopLeftCorner(MaterialShapeUtils.createCornerTreatment(i2)).setTopLeftCornerSize(cornerSize);
        }

        public Builder setTopLeftCorner(CornerTreatment cornerTreatment) {
            this.topLeftCorner = cornerTreatment;
            float fCompatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (fCompatCornerTreatmentSize != -1.0f) {
                setTopLeftCornerSize(fCompatCornerTreatmentSize);
            }
            return this;
        }

        public Builder setTopLeftCornerSize(float f2) {
            this.topLeftCornerSize = new AbsoluteCornerSize(f2);
            return this;
        }

        public Builder setTopLeftCornerSize(CornerSize cornerSize) {
            this.topLeftCornerSize = cornerSize;
            return this;
        }

        public Builder setTopRightCorner(int i2, float f2) {
            return setTopRightCorner(MaterialShapeUtils.createCornerTreatment(i2)).setTopRightCornerSize(f2);
        }

        public Builder setTopRightCorner(int i2, CornerSize cornerSize) {
            return setTopRightCorner(MaterialShapeUtils.createCornerTreatment(i2)).setTopRightCornerSize(cornerSize);
        }

        public Builder setTopRightCorner(CornerTreatment cornerTreatment) {
            this.topRightCorner = cornerTreatment;
            float fCompatCornerTreatmentSize = compatCornerTreatmentSize(cornerTreatment);
            if (fCompatCornerTreatmentSize != -1.0f) {
                setTopRightCornerSize(fCompatCornerTreatmentSize);
            }
            return this;
        }

        public Builder setTopRightCornerSize(float f2) {
            this.topRightCornerSize = new AbsoluteCornerSize(f2);
            return this;
        }

        public Builder setTopRightCornerSize(CornerSize cornerSize) {
            this.topRightCornerSize = cornerSize;
            return this;
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    public interface CornerSizeUnaryOperator {
        CornerSize apply(CornerSize cornerSize);
    }

    public ShapeAppearanceModel() {
        this.topLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomRightCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.bottomLeftCorner = MaterialShapeUtils.createDefaultCornerTreatment();
        this.topLeftCornerSize = new AbsoluteCornerSize(0.0f);
        this.topRightCornerSize = new AbsoluteCornerSize(0.0f);
        this.bottomRightCornerSize = new AbsoluteCornerSize(0.0f);
        this.bottomLeftCornerSize = new AbsoluteCornerSize(0.0f);
        this.topEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.rightEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.bottomEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
        this.leftEdge = MaterialShapeUtils.createDefaultEdgeTreatment();
    }

    private ShapeAppearanceModel(Builder builder) {
        this.topLeftCorner = builder.topLeftCorner;
        this.topRightCorner = builder.topRightCorner;
        this.bottomRightCorner = builder.bottomRightCorner;
        this.bottomLeftCorner = builder.bottomLeftCorner;
        this.topLeftCornerSize = builder.topLeftCornerSize;
        this.topRightCornerSize = builder.topRightCornerSize;
        this.bottomRightCornerSize = builder.bottomRightCornerSize;
        this.bottomLeftCornerSize = builder.bottomLeftCornerSize;
        this.topEdge = builder.topEdge;
        this.rightEdge = builder.rightEdge;
        this.bottomEdge = builder.bottomEdge;
        this.leftEdge = builder.leftEdge;
    }

    /* synthetic */ ShapeAppearanceModel(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Context context, int i2, int i3) {
        return builder(context, i2, i3, 0);
    }

    private static Builder builder(Context context, int i2, int i3, int i4) {
        return builder(context, i2, i3, new AbsoluteCornerSize(i4));
    }

    private static Builder builder(Context context, int i2, int i3, CornerSize cornerSize) throws Throwable {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i3 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i3);
        }
        int[] iArr = R.styleable.ShapeAppearance;
        short sXd = (short) (C1607wl.Xd() ^ 24353);
        short sXd2 = (short) (C1607wl.Xd() ^ 26638);
        int[] iArr2 = new int["5\u001b<Zzj3)JF\u001e\u0011\tE\u0005:a7u`\u0016#\u001a".length()];
        QB qb = new QB("5\u001b<Zzj3)JF\u001e\u0011\tE\u0005:a7u`\u0016#\u001a");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i4] = xuXd.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i4 * sXd2))) + xuXd.CK(iKK));
            i4++;
        }
        Object[] objArr = {iArr};
        Method method = Class.forName(new String(iArr2, 0, i4)).getMethod(Ig.wd("MiiMDs:B\u007f\u0019\n1>mw\u00163<\u0006;d=", (short) (OY.Xd() ^ 10005)), int[].class);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(contextThemeWrapper, objArr);
            try {
                int i5 = typedArray.getInt(R.styleable.ShapeAppearance_cornerFamily, 0);
                int i6 = typedArray.getInt(R.styleable.ShapeAppearance_cornerFamilyTopLeft, i5);
                int i7 = typedArray.getInt(R.styleable.ShapeAppearance_cornerFamilyTopRight, i5);
                int i8 = typedArray.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomRight, i5);
                int i9 = typedArray.getInt(R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i5);
                CornerSize cornerSize2 = getCornerSize(typedArray, R.styleable.ShapeAppearance_cornerSize, cornerSize);
                CornerSize cornerSize3 = getCornerSize(typedArray, R.styleable.ShapeAppearance_cornerSizeTopLeft, cornerSize2);
                CornerSize cornerSize4 = getCornerSize(typedArray, R.styleable.ShapeAppearance_cornerSizeTopRight, cornerSize2);
                return new Builder().setTopLeftCorner(i6, cornerSize3).setTopRightCorner(i7, cornerSize4).setBottomRightCorner(i8, getCornerSize(typedArray, R.styleable.ShapeAppearance_cornerSizeBottomRight, cornerSize2)).setBottomLeftCorner(i9, getCornerSize(typedArray, R.styleable.ShapeAppearance_cornerSizeBottomLeft, cornerSize2));
            } finally {
                typedArray.recycle();
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static Builder builder(Context context, AttributeSet attributeSet, int i2, int i3) {
        return builder(context, attributeSet, i2, i3, 0);
    }

    public static Builder builder(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        return builder(context, attributeSet, i2, i3, new AbsoluteCornerSize(i4));
    }

    public static Builder builder(Context context, AttributeSet attributeSet, int i2, int i3, CornerSize cornerSize) throws Throwable {
        int[] iArr = R.styleable.MaterialShape;
        Class<?> cls = Class.forName(EO.Od("Q&od<r\b{kZY;Zo\fe?S-\u0019D&>", (short) (OY.Xd() ^ 26177)));
        Class<?>[] clsArr = {Class.forName(C1561oA.Qd("\u001b'\u001c)%\u001e\u0018`'%\u0019\u001b[m \u001f\u001c\u0012\n\u001c\u001a\nv\b\u0016", (short) (ZN.Xd() ^ 7509))), int[].class, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {attributeSet, iArr, Integer.valueOf(i2), Integer.valueOf(i3)};
        short sXd = (short) (OY.Xd() ^ 19790);
        short sXd2 = (short) (OY.Xd() ^ 11281);
        int[] iArr2 = new int["eYlZciOqwkeeCwxwoi}}o~".length()];
        QB qb = new QB("eYlZciOqwkeeCwxwoi}}o~");
        int i4 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i4] = xuXd.fK((xuXd.CK(iKK) - (sXd + i4)) - sXd2);
            i4++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            int resourceId = typedArray.getResourceId(R.styleable.MaterialShape_shapeAppearance, 0);
            int resourceId2 = typedArray.getResourceId(R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
            typedArray.recycle();
            return builder(context, resourceId, resourceId2, cornerSize);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static CornerSize getCornerSize(TypedArray typedArray, int i2, CornerSize cornerSize) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        return typedValuePeekValue == null ? cornerSize : typedValuePeekValue.type == 5 ? new AbsoluteCornerSize(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : typedValuePeekValue.type == 6 ? new RelativeCornerSize(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cornerSize;
    }

    public EdgeTreatment getBottomEdge() {
        return this.bottomEdge;
    }

    public CornerTreatment getBottomLeftCorner() {
        return this.bottomLeftCorner;
    }

    public CornerSize getBottomLeftCornerSize() {
        return this.bottomLeftCornerSize;
    }

    public CornerTreatment getBottomRightCorner() {
        return this.bottomRightCorner;
    }

    public CornerSize getBottomRightCornerSize() {
        return this.bottomRightCornerSize;
    }

    public EdgeTreatment getLeftEdge() {
        return this.leftEdge;
    }

    public EdgeTreatment getRightEdge() {
        return this.rightEdge;
    }

    public EdgeTreatment getTopEdge() {
        return this.topEdge;
    }

    public CornerTreatment getTopLeftCorner() {
        return this.topLeftCorner;
    }

    public CornerSize getTopLeftCornerSize() {
        return this.topLeftCornerSize;
    }

    public CornerTreatment getTopRightCorner() {
        return this.topRightCorner;
    }

    public CornerSize getTopRightCornerSize() {
        return this.topRightCornerSize;
    }

    public boolean isRoundRect(RectF rectF) {
        boolean z2 = this.leftEdge.getClass().equals(EdgeTreatment.class) && this.rightEdge.getClass().equals(EdgeTreatment.class) && this.topEdge.getClass().equals(EdgeTreatment.class) && this.bottomEdge.getClass().equals(EdgeTreatment.class);
        float cornerSize = this.topLeftCornerSize.getCornerSize(rectF);
        return z2 && ((this.topRightCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.topRightCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.bottomLeftCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.bottomLeftCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.bottomRightCornerSize.getCornerSize(rectF) > cornerSize ? 1 : (this.bottomRightCornerSize.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0) && ((this.topRightCorner instanceof RoundedCornerTreatment) && (this.topLeftCorner instanceof RoundedCornerTreatment) && (this.bottomRightCorner instanceof RoundedCornerTreatment) && (this.bottomLeftCorner instanceof RoundedCornerTreatment));
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public ShapeAppearanceModel withCornerSize(float f2) {
        return toBuilder().setAllCornerSizes(f2).build();
    }

    public ShapeAppearanceModel withCornerSize(CornerSize cornerSize) {
        return toBuilder().setAllCornerSizes(cornerSize).build();
    }

    public ShapeAppearanceModel withTransformedCornerSizes(CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        return toBuilder().setTopLeftCornerSize(cornerSizeUnaryOperator.apply(getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeUnaryOperator.apply(getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeUnaryOperator.apply(getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeUnaryOperator.apply(getBottomRightCornerSize())).build();
    }
}
