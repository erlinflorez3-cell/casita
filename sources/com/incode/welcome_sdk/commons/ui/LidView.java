package com.incode.welcome_sdk.commons.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final class LidView extends AppCompatImageView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(LidView.class, "centerX", "getCenterX()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(LidView.class, "centerY", "getCenterY()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(LidView.class, "finalRadius", "getFinalRadius()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(LidView.class, "currentRadius", "getCurrentRadius()F", 0))};
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5836a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5837b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5838c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5839d = 1;
    private final ReadWriteProperty centerX$delegate;
    private final ReadWriteProperty centerY$delegate;
    private final ReadWriteProperty currentRadius$delegate;
    private Property<View, Float> currentRadiusProperty;
    private final ReadWriteProperty finalRadius$delegate;
    private final Paint paintClear;

    public static final /* synthetic */ float access$getCurrentRadius(LidView lidView) {
        int i2 = 2 % 2;
        int i3 = f5836a + 3;
        f5838c = i3 % 128;
        if (i3 % 2 == 0) {
            lidView.getCurrentRadius();
            throw null;
        }
        float currentRadius = lidView.getCurrentRadius();
        int i4 = f5836a + 89;
        f5838c = i4 % 128;
        int i5 = i4 % 2;
        return currentRadius;
    }

    public static final /* synthetic */ void access$setCurrentRadius(LidView lidView, float f2) {
        int i2 = 2 % 2;
        int i3 = f5836a + 31;
        f5838c = i3 % 128;
        int i4 = i3 % 2;
        lidView.setCurrentRadius(f2);
        int i5 = f5836a + 11;
        f5838c = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
    }

    public /* synthetic */ LidView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LidView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.centerX$delegate = Delegates.INSTANCE.notNull();
        this.centerY$delegate = Delegates.INSTANCE.notNull();
        this.finalRadius$delegate = Delegates.INSTANCE.notNull();
        this.currentRadius$delegate = Delegates.INSTANCE.notNull();
        Paint paint = new Paint(1);
        this.paintClear = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.currentRadiusProperty = new FloatProperty<View>() { // from class: com.incode.welcome_sdk.commons.ui.LidView.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f5840a = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f5841e = 0;

            {
                super("currentRadius");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.util.FloatProperty, android.util.Property
            public final /* synthetic */ Float get(Object obj) {
                int i3 = 2 % 2;
                int i4 = f5841e + 115;
                f5840a = i4 % 128;
                int i5 = i4 % 2;
                Float fE = e((View) obj);
                int i6 = f5841e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f5840a = i6 % 128;
                int i7 = i6 % 2;
                return fE;
            }

            @Override // android.util.FloatProperty, android.util.Property
            public final /* synthetic */ Float get(Object obj) {
                int i3 = 2 % 2;
                int i4 = f5841e + 67;
                f5840a = i4 % 128;
                View view = (View) obj;
                if (i4 % 2 == 0) {
                    e(view);
                    throw null;
                }
                Float fE = e(view);
                int i5 = f5841e + 89;
                f5840a = i5 % 128;
                int i6 = i5 % 2;
                return fE;
            }

            @Override // android.util.FloatProperty
            public final /* bridge */ /* synthetic */ void setValue(View view, float f2) {
                int i3 = 2 % 2;
                int i4 = f5841e + 39;
                f5840a = i4 % 128;
                int i5 = i4 % 2;
                setValue2(view, f2);
                int i6 = f5840a + 9;
                f5841e = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 59 / 0;
                }
            }

            /* JADX INFO: renamed from: setValue, reason: avoid collision after fix types in other method */
            public final void setValue2(View view, float f2) {
                int i3 = 2 % 2;
                int i4 = f5841e + 47;
                f5840a = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(view, "");
                    LidView.access$setCurrentRadius(LidView.this, f2);
                    LidView.this.invalidate();
                } else {
                    Intrinsics.checkNotNullParameter(view, "");
                    LidView.access$setCurrentRadius(LidView.this, f2);
                    LidView.this.invalidate();
                    throw null;
                }
            }

            private Float e(View view) {
                int i3 = 2 % 2;
                int i4 = f5840a + 27;
                f5841e = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(view, "");
                Float fValueOf = Float.valueOf(LidView.access$getCurrentRadius(LidView.this));
                int i6 = f5841e + 3;
                f5840a = i6 % 128;
                if (i6 % 2 != 0) {
                    return fValueOf;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
    }

    static {
        int i2 = f5839d + 33;
        f5837b = i2 % 128;
        int i3 = i2 % 2;
    }

    private final float getCenterX() {
        int i2 = 2 % 2;
        int i3 = f5838c + 49;
        f5836a = i3 % 128;
        return ((Number) this.centerX$delegate.getValue(this, i3 % 2 != 0 ? $$delegatedProperties[1] : $$delegatedProperties[0])).floatValue();
    }

    private final void setCenterX(float f2) {
        ReadWriteProperty readWriteProperty;
        KProperty<?> kProperty;
        int i2 = 2 % 2;
        int i3 = f5836a + 11;
        f5838c = i3 % 128;
        if (i3 % 2 == 0) {
            readWriteProperty = this.centerX$delegate;
            kProperty = $$delegatedProperties[0];
        } else {
            readWriteProperty = this.centerX$delegate;
            kProperty = $$delegatedProperties[0];
        }
        readWriteProperty.setValue(this, kProperty, Float.valueOf(f2));
    }

    private final float getCenterY() {
        int i2 = 2 % 2;
        int i3 = f5836a + 111;
        f5838c = i3 % 128;
        int i4 = i3 % 2;
        float fFloatValue = ((Number) this.centerY$delegate.getValue(this, $$delegatedProperties[1])).floatValue();
        int i5 = f5836a + 15;
        f5838c = i5 % 128;
        int i6 = i5 % 2;
        return fFloatValue;
    }

    private final void setCenterY(float f2) {
        int i2 = 2 % 2;
        int i3 = f5838c + 93;
        f5836a = i3 % 128;
        int i4 = i3 % 2;
        this.centerY$delegate.setValue(this, $$delegatedProperties[1], Float.valueOf(f2));
        int i5 = f5838c + 123;
        f5836a = i5 % 128;
        int i6 = i5 % 2;
    }

    private final float getFinalRadius() {
        int i2 = 2 % 2;
        int i3 = f5836a + 47;
        f5838c = i3 % 128;
        int i4 = i3 % 2;
        float fFloatValue = ((Number) this.finalRadius$delegate.getValue(this, $$delegatedProperties[2])).floatValue();
        int i5 = f5838c + 93;
        f5836a = i5 % 128;
        int i6 = i5 % 2;
        return fFloatValue;
    }

    private final void setFinalRadius(float f2) {
        int i2 = 2 % 2;
        int i3 = f5836a + 57;
        f5838c = i3 % 128;
        if (i3 % 2 == 0) {
            this.finalRadius$delegate.setValue(this, $$delegatedProperties[4], Float.valueOf(f2));
        } else {
            this.finalRadius$delegate.setValue(this, $$delegatedProperties[2], Float.valueOf(f2));
        }
    }

    private final float getCurrentRadius() {
        int i2 = 2 % 2;
        int i3 = f5838c + 19;
        f5836a = i3 % 128;
        int i4 = i3 % 2;
        float fFloatValue = ((Number) this.currentRadius$delegate.getValue(this, $$delegatedProperties[3])).floatValue();
        int i5 = f5836a + 79;
        f5838c = i5 % 128;
        int i6 = i5 % 2;
        return fFloatValue;
    }

    private final void setCurrentRadius(float f2) {
        int i2 = 2 % 2;
        int i3 = f5838c + 121;
        f5836a = i3 % 128;
        int i4 = i3 % 2;
        this.currentRadius$delegate.setValue(this, $$delegatedProperties[3], Float.valueOf(f2));
        int i5 = f5836a + 95;
        f5838c = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i2, int i3) {
        float measuredWidth;
        int i4 = 2 % 2;
        int i5 = f5838c + 43;
        f5836a = i5 % 128;
        if (i5 % 2 != 0) {
            super.onMeasure(i2, i3);
            setCenterX(getMeasuredWidth() + 2.0f);
            setCenterY(getMeasuredHeight() % 1.0f);
            measuredWidth = getMeasuredWidth() % 2.0f;
        } else {
            super.onMeasure(i2, i3);
            setCenterX(getMeasuredWidth() / 2.0f);
            setCenterY(getMeasuredHeight() / 2.0f);
            measuredWidth = getMeasuredWidth() / 2.0f;
        }
        setFinalRadius(measuredWidth);
        setCurrentRadius(getFinalRadius());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        r1 = android.animation.ObjectAnimator.ofFloat(r7, (android.util.Property<com.incode.welcome_sdk.commons.ui.LidView, java.lang.Float>) r7.currentRadiusProperty, r7.getCurrentRadius(), 0.0f);
        r1.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        r1.start();
        r1 = com.incode.welcome_sdk.commons.ui.LidView.f5836a + 113;
        com.incode.welcome_sdk.commons.ui.LidView.f5838c = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        if ((r1 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r8 != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        r1 = android.animation.ObjectAnimator.ofFloat(r7, (android.util.Property<com.incode.welcome_sdk.commons.ui.LidView, java.lang.Float>) r7.currentRadiusProperty, r7.getCurrentRadius(), r7.getFinalRadius());
        r1.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        r1.start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r8 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void setLidOpen$lambda$2(com.incode.welcome_sdk.commons.ui.LidView r7, boolean r8) {
        /*
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.commons.ui.LidView.f5838c
            int r1 = r0 + 121
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.LidView.f5836a = r0
            int r1 = r1 % r5
            r6 = 1
            java.lang.String r0 = ""
            r4 = 0
            if (r1 == 0) goto L3c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r7.setVisibility(r4)
            if (r8 == 0) goto L45
        L1a:
            android.util.Property<android.view.View, java.lang.Float> r3 = r7.currentRadiusProperty
            float r2 = r7.getCurrentRadius()
            float r1 = r7.getFinalRadius()
            float[] r0 = new float[r5]
            r0[r4] = r2
            r0[r6] = r1
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r7, r3, r0)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            android.animation.TimeInterpolator r0 = (android.animation.TimeInterpolator) r0
            r1.setInterpolator(r0)
            r1.start()
            return
        L3c:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r7.setVisibility(r4)
            if (r8 == 0) goto L45
            goto L1a
        L45:
            android.util.Property<android.view.View, java.lang.Float> r2 = r7.currentRadiusProperty
            float r0 = r7.getCurrentRadius()
            float[] r1 = new float[r5]
            r1[r4] = r0
            r0 = 0
            r1[r6] = r0
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r7, r2, r1)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            android.animation.TimeInterpolator r0 = (android.animation.TimeInterpolator) r0
            r1.setInterpolator(r0)
            r1.start()
            int r0 = com.incode.welcome_sdk.commons.ui.LidView.f5836a
            int r1 = r0 + 113
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.ui.LidView.f5838c = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L6f
            return
        L6f:
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.LidView.setLidOpen$lambda$2(com.incode.welcome_sdk.commons.ui.LidView, boolean):void");
    }

    public final void setLidOpen(final boolean z2) {
        int i2 = 2 % 2;
        int i3 = f5836a + 83;
        f5838c = i3 % 128;
        int i4 = i3 % 2;
        post(new Runnable() { // from class: com.incode.welcome_sdk.commons.ui.LidView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                LidView.setLidOpen$lambda$2(this.f$0, z2);
            }
        });
        int i5 = f5838c + 115;
        f5836a = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        int i2 = 2 % 2;
        int i3 = f5838c + 9;
        f5836a = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        canvas.drawCircle(getCenterX(), getCenterY(), getCurrentRadius(), this.paintClear);
        int i5 = f5836a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f5838c = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LidView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LidView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
