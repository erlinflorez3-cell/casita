package com.incode.welcome_sdk.commons.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.incode.welcome_sdk.R;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;

/* JADX INFO: loaded from: classes5.dex */
public final class WaveformAnimationView extends View {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f5906g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f5907i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f5908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f5909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CompositeDisposable f5910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<RectF> f5911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f5912e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaveformAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        Paint paint = new Paint();
        this.f5909b = paint;
        this.f5908a = getResources().getDimension(R.dimen.onboard_sdk_video_selfie_waveform_height);
        this.f5912e = getResources().getDimension(R.dimen.onboard_sdk_video_selfie_waveform_width);
        this.f5911d = new ArrayList();
        this.f5910c = new CompositeDisposable();
        paint.setColor(ContextCompat.getColor(context, R.color.onboard_sdk_Waveform));
        paint.setStyle(Paint.Style.FILL);
    }

    public static final /* synthetic */ void d(WaveformAnimationView waveformAnimationView, float f2) {
        int i2 = 2 % 2;
        int i3 = f5907i + 105;
        f5906g = i3 % 128;
        int i4 = i3 % 2;
        waveformAnimationView.c(f2);
        int i5 = f5906g + 31;
        f5907i = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class d extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5913a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5914e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f5913a + 79;
            f5914e = i3 % 128;
            int i4 = i3 % 2;
            e();
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 0 / 0;
            }
            return unit;
        }

        private void e() {
            int i2 = 2 % 2;
            int i3 = f5913a + 33;
            f5914e = i3 % 128;
            int i4 = i3 % 2;
            WaveformAnimationView.d(WaveformAnimationView.this, Random.Default.nextFloat());
            WaveformAnimationView.this.invalidate();
            int i5 = f5913a + 57;
            f5914e = i5 % 128;
            int i6 = i5 % 2;
        }

        d() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f5906g + 81;
        f5907i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f5906g + 99;
        f5907i = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void b() {
        int i2 = 2 % 2;
        this.f5910c.clear();
        CompositeDisposable compositeDisposable = this.f5910c;
        Observable<Long> observableObserveOn = Observable.interval(170L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread());
        final d dVar = new d();
        compositeDisposable.add(observableObserveOn.subscribe(new Consumer() { // from class: com.incode.welcome_sdk.commons.ui.WaveformAnimationView$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WaveformAnimationView.a(dVar, obj);
            }
        }));
        int i3 = f5906g + 45;
        f5907i = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void c() {
        int i2 = 2 % 2;
        int i3 = f5906g + 9;
        f5907i = i3 % 128;
        int i4 = i3 % 2;
        this.f5910c.clear();
        if (i4 == 0) {
            throw null;
        }
    }

    private final void c(float f2) {
        int i2;
        int i3 = 2 % 2;
        int i4 = f5907i + 15;
        f5906g = i4 % 128;
        if (i4 % 2 != 0) {
            this.f5911d.clear();
            i2 = 1;
        } else {
            this.f5911d.clear();
            i2 = 0;
        }
        while (i2 < 5) {
            float fNextInt = Random.Default.nextInt(40, 100);
            float f3 = (this.f5912e / 4.0f) + (i2 * 17.0f);
            float f4 = (this.f5908a - (fNextInt + f2)) / 2.0f;
            this.f5911d.add(new RectF(f3, f4, 7.0f + f3, fNextInt + f4));
            i2++;
            int i5 = f5907i + 71;
            f5906g = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i2 = 2 % 2;
        int i3 = f5907i + 29;
        f5906g = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        Iterator<T> it = this.f5911d.iterator();
        while (it.hasNext()) {
            int i5 = f5907i + 5;
            f5906g = i5 % 128;
            int i6 = i5 % 2;
            canvas.drawRoundRect((RectF) it.next(), 14.0f, 14.0f, this.f5909b);
        }
        int i7 = f5907i + 101;
        f5906g = i7 % 128;
        int i8 = i7 % 2;
    }
}
