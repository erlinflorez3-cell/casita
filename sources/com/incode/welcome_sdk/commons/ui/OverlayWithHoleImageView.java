package com.incode.welcome_sdk.commons.ui;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.res.ResourcesCompat;
import com.drew.metadata.mp4.media.Mp4VideoDirectory;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ui.dynamic_forms.view.FormsSelectInputScreenKt;

/* JADX INFO: loaded from: classes5.dex */
public class OverlayWithHoleImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f5843p = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static int f5844t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RectF f5845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f5846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f5847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f5848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f5849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Paint f5851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f5852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f5853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f5854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Paint f5855k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f5856l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f5857m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private RectF f5858n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Mode f5859o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f5860s;

    public static /* synthetic */ Object d(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        float f2;
        int i8 = ~i2;
        int i9 = ~(i8 | i6);
        int i10 = ~(i2 | i6);
        int i11 = i8 | (~i6);
        int i12 = i10 | (~(i11 | i3));
        int i13 = (~i3) | i11;
        int i14 = i2 + i6 + i7 + (770105990 * i4) + ((-157043368) * i5);
        int i15 = i14 * i14;
        int i16 = ((315592168 * i2) - 1432092672) + ((-1000312294) * i6) + ((-1315904462) * i9) + ((-657952231) * i12) + (657952231 * i13) + ((-342360064) * i7) + ((-2121269248) * i4) + (1950351360 * i5) + ((-66846720) * i15);
        int i17 = (i2 * 105828664) + 1394048361 + (i6 * 105827886) + (i9 * (-778)) + (i12 * (-389)) + (i13 * 389) + (i7 * 105828275) + (i4 * (-227623502)) + (i5 * 619312264) + (i15 * 1925971968);
        if (i16 + (i17 * i17 * 261881856) == 1) {
            return b(objArr);
        }
        OverlayWithHoleImageView overlayWithHoleImageView = (OverlayWithHoleImageView) objArr[0];
        Canvas canvas = (Canvas) objArr[1];
        int i18 = 2 % 2;
        int i19 = f5843p + 61;
        f5844t = i19 % 128;
        int i20 = i19 % 2;
        if (overlayWithHoleImageView.f5848d != null) {
            float f3 = overlayWithHoleImageView.f5849e / 2.0f;
            canvas.drawRoundRect(new RectF(overlayWithHoleImageView.f5845a.centerX() - f3, (overlayWithHoleImageView.f5845a.centerY() - f3) - overlayWithHoleImageView.f5857m, overlayWithHoleImageView.f5845a.centerX() + f3, (overlayWithHoleImageView.f5845a.centerY() + f3) - overlayWithHoleImageView.f5857m), f3, f3, overlayWithHoleImageView.f5855k);
        } else {
            int width = overlayWithHoleImageView.getWidth();
            int height = overlayWithHoleImageView.getHeight();
            if (!(!overlayWithHoleImageView.f5854j)) {
                f2 = width * overlayWithHoleImageView.f5849e;
            } else {
                f2 = overlayWithHoleImageView.f5849e;
                int i21 = f5844t + 39;
                f5843p = i21 % 128;
                int i22 = i21 % 2;
            }
            float f4 = f2 / 2.0f;
            float f5 = (width - f2) / 2.0f;
            float f6 = (height - f2) / 2.0f;
            canvas.drawRoundRect(new RectF(f5, f6, f5 + f2, f2 + f6), f4, f4, overlayWithHoleImageView.f5855k);
        }
        return null;
    }

    public enum Mode {
        CIRCLE,
        CIRCLE_TRIANGLE,
        ROUNDED_RECT,
        FULLSCREEN;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f5873f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f5874g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f5875h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f5876i = 1;

        public static Mode valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f5876i + 79;
            f5874g = i3 % 128;
            int i4 = i3 % 2;
            Mode mode = (Mode) Enum.valueOf(Mode.class, str);
            int i5 = f5874g + 41;
            f5876i = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 75 / 0;
            }
            return mode;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Mode[] valuesCustom() {
            int i2 = 2 % 2;
            int i3 = f5874g + 7;
            f5876i = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            Mode[] modeArr = (Mode[]) values().clone();
            int i4 = f5876i + 5;
            f5874g = i4 % 128;
            if (i4 % 2 == 0) {
                return modeArr;
            }
            throw null;
        }

        static {
            int i2 = f5875h + 13;
            f5873f = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
    }

    public OverlayWithHoleImageView(Context context) {
        super(context);
        this.f5859o = Mode.CIRCLE;
        this.f5857m = 0.0f;
        d(context, (AttributeSet) null);
    }

    public OverlayWithHoleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5859o = Mode.CIRCLE;
        this.f5857m = 0.0f;
        d(context, attributeSet);
    }

    public OverlayWithHoleImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f5859o = Mode.CIRCLE;
        this.f5857m = 0.0f;
        d(context, attributeSet);
    }

    private void d(Context context, AttributeSet attributeSet) {
        int i2 = 2 % 2;
        this.f5854j = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.onboard_sdk_OverlayWithHoleImageView);
            TypedValue typedValue = new TypedValue();
            if (typedArrayObtainStyledAttributes.getValue(R.styleable.onboard_sdk_OverlayWithHoleImageView_onboard_sdk_circleDiameter, typedValue)) {
                if (typedValue.type == 5) {
                    this.f5847c = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
                } else if (typedValue.type == 6) {
                    int i3 = f5843p + 11;
                    f5844t = i3 % 128;
                    if (i3 % 2 != 0) {
                        this.f5847c = typedValue.getFraction(1.0f, 1.0f);
                        this.f5854j = false;
                    } else {
                        this.f5847c = typedValue.getFraction(1.0f, 1.0f);
                        this.f5854j = true;
                    }
                } else if (typedValue.type == 4) {
                    int i4 = f5843p + 85;
                    f5844t = i4 % 128;
                    int i5 = i4 % 2;
                    this.f5847c = typedValue.getFloat();
                    this.f5854j = true;
                }
            }
            this.f5846b = typedArrayObtainStyledAttributes.getResourceId(R.styleable.onboard_sdk_OverlayWithHoleImageView_onboard_sdk_circleReference, 0);
            this.f5853i = typedArrayObtainStyledAttributes.getColor(R.styleable.onboard_sdk_OverlayWithHoleImageView_onboard_sdk_backgroundColor, ResourcesCompat.getColor(context.getResources(), R.color.onboard_sdk_white_alpha50, null));
            this.f5859o = Mode.valuesCustom()[typedArrayObtainStyledAttributes.getInt(R.styleable.onboard_sdk_OverlayWithHoleImageView_onboard_sdk_mode, 0)];
        } else {
            this.f5853i = ResourcesCompat.getColor(context.getResources(), R.color.onboard_sdk_white_alpha50, null);
            this.f5859o = Mode.CIRCLE;
        }
        int i6 = this.f5853i;
        if (i6 != 0) {
            int i7 = f5844t + 39;
            f5843p = i7 % 128;
            int i8 = i7 % 2;
            this.f5850f = i6;
            this.f5852h = true;
        }
        this.f5858n = new RectF();
        Paint paint = new Paint(1);
        this.f5851g = paint;
        paint.setColor(this.f5853i);
        this.f5851g.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f5855k = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        int i9 = f5844t + 125;
        f5843p = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 7 / 0;
        }
    }

    public void setMode(Mode mode) {
        int i2 = 2 % 2;
        int i3 = f5843p + 75;
        f5844t = i3 % 128;
        int i4 = i3 % 2;
        this.f5859o = mode;
        invalidate();
        int i5 = f5843p + 7;
        f5844t = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setMarginBottom(float f2) {
        int i2 = 2 % 2;
        int i3 = f5844t + 67;
        f5843p = i3 % 128;
        int i4 = i3 % 2;
        this.f5857m = f2;
        invalidate();
        int i5 = f5844t + 13;
        f5843p = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void d() {
        int i2 = 2 % 2;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this, "currentCircleDiameter", new FloatEvaluator(), Float.valueOf(this.f5847c), Integer.valueOf(Math.max(getWidth(), getHeight()) * 2));
        objectAnimatorOfObject.setDuration(300L);
        objectAnimatorOfObject.setInterpolator(new AccelerateInterpolator());
        objectAnimatorOfObject.start();
        int i3 = f5843p + 7;
        f5844t = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void c() {
        int i2 = 2 % 2;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this, "currentCircleDiameter", new FloatEvaluator(), Integer.valueOf(Math.max(getWidth(), getHeight()) * 2), Float.valueOf(this.f5847c));
        objectAnimatorOfObject.setDuration(300L);
        objectAnimatorOfObject.setInterpolator(new AccelerateInterpolator());
        objectAnimatorOfObject.start();
        int i3 = f5843p + 67;
        f5844t = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        OverlayWithHoleImageView overlayWithHoleImageView = (OverlayWithHoleImageView) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i2 = 2 % 2;
        int i3 = f5844t + 125;
        f5843p = i3 % 128;
        int i4 = i3 % 2;
        overlayWithHoleImageView.f5853i = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        overlayWithHoleImageView.invalidate();
        int i5 = f5843p + 73;
        f5844t = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 38 / 0;
        }
        return null;
    }

    public final void e(int i2, final Runnable runnable) {
        int i3 = 2 % 2;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f5851g, "color", new ArgbEvaluator(), Integer.valueOf(this.f5853i), Integer.valueOf(i2));
        objectAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.incode.welcome_sdk.commons.ui.OverlayWithHoleImageView$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.e(valueAnimator);
            }
        });
        objectAnimatorOfObject.addListener(new Animator.AnimatorListener() { // from class: com.incode.welcome_sdk.commons.ui.OverlayWithHoleImageView.4

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f5864c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f5865e = 0;

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                int i4 = 2 % 2;
                int i5 = f5864c + 77;
                f5865e = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i4 = 2 % 2;
                int i5 = f5865e;
                int i6 = i5 + 31;
                f5864c = i6 % 128;
                int i7 = i6 % 2;
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    int i8 = i5 + 111;
                    f5864c = i8 % 128;
                    if (i8 % 2 != 0) {
                        runnable2.run();
                    } else {
                        runnable2.run();
                        throw null;
                    }
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                int i4 = 2 % 2;
                int i5 = f5864c + 63;
                f5865e = i5 % 128;
                int i6 = i5 % 2;
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
                int i7 = f5864c + 5;
                f5865e = i7 % 128;
                int i8 = i7 % 2;
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
                int i4 = 2 % 2;
                int i5 = f5864c + 63;
                f5865e = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 20 / 0;
                }
            }
        });
        objectAnimatorOfObject.setDuration(600L);
        objectAnimatorOfObject.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfObject.start();
        int i4 = f5844t + 67;
        f5843p = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void a() {
        int i2 = 2 % 2;
        int i3 = f5844t + 5;
        int i4 = i3 % 128;
        f5843p = i4;
        if (i3 % 2 == 0) {
            int i5 = 7 / 0;
            if (!this.f5852h) {
                return;
            }
        } else if (!this.f5852h) {
            return;
        }
        int i6 = i4 + 53;
        f5844t = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = this.f5850f;
            this.f5853i = i7;
            this.f5851g.setColor(i7);
            invalidate();
            return;
        }
        int i8 = this.f5850f;
        this.f5853i = i8;
        this.f5851g.setColor(i8);
        invalidate();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setCircleRadius(float f2) {
        int i2 = 2 % 2;
        int i3 = f5843p + 27;
        f5844t = i3 % 128;
        setCircleDiameter(i3 % 2 != 0 ? f2 % 0.0f : f2 * 2.0f);
    }

    public void setCircleDiameter(float f2) {
        int i2 = 2 % 2;
        int i3 = f5844t + 103;
        f5843p = i3 % 128;
        int i4 = i3 % 2;
        this.f5847c = f2;
        this.f5849e = f2;
        this.f5854j = false;
        invalidate();
        int i5 = f5844t + 65;
        f5843p = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setRoundedRect(Rect rect, int i2) {
        int i3 = 2 % 2;
        int i4 = f5843p + 61;
        f5844t = i4 % 128;
        int i5 = i4 % 2;
        setRoundedRect(rect, i2, 0);
        int i6 = f5844t + 3;
        f5843p = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setRoundedRect(Rect rect, int i2, int i3) {
        int i4 = 2 % 2;
        this.f5858n = new RectF(rect.left + i3, (rect.top + i3) - this.f5857m, rect.right - i3, (rect.bottom - i3) - this.f5857m);
        this.f5856l = i2;
        this.f5860s = i3;
        postInvalidate();
        int i5 = f5844t + 31;
        f5843p = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        int i2 = 2 % 2;
        int i3 = f5843p + 31;
        f5844t = i3 % 128;
        int i4 = i3 % 2;
        super.onAttachedToWindow();
        b();
        int i5 = f5843p + 101;
        f5844t = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = 2 % 2;
        Rect rect = new Rect();
        this.f5848d.getGlobalVisibleRect(rect);
        rect.offset(-getLeft(), -getTop());
        this.f5845a = new RectF(rect);
        setCircleDiameter(this.f5848d.getWidth());
        int i11 = f5843p + 123;
        f5844t = i11 % 128;
        int i12 = i11 % 2;
    }

    private void b() {
        int i2 = 2 % 2;
        int i3 = f5843p + 3;
        f5844t = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this.f5846b != 0) {
            View viewFindViewById = ((View) getParent()).findViewById(this.f5846b);
            this.f5848d = viewFindViewById;
            viewFindViewById.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.incode.welcome_sdk.commons.ui.OverlayWithHoleImageView$$ExternalSyntheticLambda0
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    this.f$0.c(view, i4, i5, i6, i7, i8, i9, i10, i11);
                }
            });
            int i4 = f5844t + 91;
            f5843p = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.ui.OverlayWithHoleImageView$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f5861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5862d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5863e = 1;

        static {
            int[] iArr = new int[Mode.valuesCustom().length];
            f5861c = iArr;
            try {
                iArr[Mode.ROUNDED_RECT.ordinal()] = 1;
                int i2 = f5863e + 15;
                f5862d = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5861c[Mode.CIRCLE_TRIANGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5861c[Mode.FULLSCREEN.ordinal()] = 3;
                int i5 = f5862d + 81;
                f5863e = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5861c[Mode.CIRCLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int i2 = 2 % 2;
        super.onDraw(canvas);
        canvas.drawPaint(this.f5851g);
        int i3 = AnonymousClass2.f5861c[this.f5859o.ordinal()];
        if (i3 == 1) {
            RectF rectF = this.f5858n;
            int i4 = this.f5856l;
            canvas.drawRoundRect(rectF, i4, i4, this.f5855k);
            return;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                d(1295945606, FormsSelectInputScreenKt.c.C0250c.e(), new Object[]{this, canvas}, FormsSelectInputScreenKt.c.C0250c.e(), FormsSelectInputScreenKt.c.C0250c.e(), -1295945606, FormsSelectInputScreenKt.c.C0250c.e());
                int i5 = f5844t + 27;
                f5843p = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            return;
        }
        d(1295945606, FormsSelectInputScreenKt.c.C0250c.e(), new Object[]{this, canvas}, FormsSelectInputScreenKt.c.C0250c.e(), FormsSelectInputScreenKt.c.C0250c.e(), -1295945606, FormsSelectInputScreenKt.c.C0250c.e());
        d(canvas, this.f5855k);
        int i7 = f5844t + 115;
        f5843p = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public void setCurrentCircleDiameter(float f2) {
        int i2 = 2 % 2;
        int i3 = f5844t + 121;
        f5843p = i3 % 128;
        int i4 = i3 % 2;
        this.f5849e = f2;
        invalidate();
        int i5 = f5844t + 53;
        f5843p = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 81 / 0;
        }
    }

    private void d(Canvas canvas, Paint paint) {
        int i2 = 2 % 2;
        int i3 = Mp4VideoDirectory.TAG_COMPRESSION_TYPE / 2;
        int width = getWidth();
        int height = getHeight();
        float f2 = this.f5847c;
        float f3 = (width / 2.0f) + (f2 / 3.0f);
        float f4 = (height - (f2 * 2.0f)) / 2.0f;
        Path path = new Path();
        float f5 = f4 - 70.0f;
        path.moveTo(f3, f5);
        float f6 = f4 + 105.0f;
        path.lineTo(f3 - 105.0f, f6);
        path.lineTo(105.0f + f3, f6);
        path.lineTo(f3, f5);
        path.close();
        canvas.save();
        canvas.rotate(20.0f, f3, f4);
        canvas.drawPath(path, paint);
        canvas.restore();
        int i4 = f5844t + 113;
        f5843p = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
    }

    public void setShouldUseSoftwareRendering(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f5844t;
        int i4 = i3 + 117;
        f5843p = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (!z2) {
            setLayerType(2, null);
            return;
        }
        int i5 = i3 + 99;
        f5843p = i5 % 128;
        int i6 = i5 % 2;
        setLayerType(1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(ValueAnimator valueAnimator) {
        d(-975336276, FormsSelectInputScreenKt.c.C0250c.e(), new Object[]{this, valueAnimator}, FormsSelectInputScreenKt.c.C0250c.e(), FormsSelectInputScreenKt.c.C0250c.e(), 975336277, FormsSelectInputScreenKt.c.C0250c.e());
    }

    private void c(Canvas canvas) {
        d(1295945606, FormsSelectInputScreenKt.c.C0250c.e(), new Object[]{this, canvas}, FormsSelectInputScreenKt.c.C0250c.e(), FormsSelectInputScreenKt.c.C0250c.e(), -1295945606, FormsSelectInputScreenKt.c.C0250c.e());
    }
}
