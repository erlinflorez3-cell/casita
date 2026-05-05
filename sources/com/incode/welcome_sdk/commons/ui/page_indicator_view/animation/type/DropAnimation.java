package com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.controller.ValueController;
import com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.data.type.DropAnimationValue;
import com.incode.welcome_sdk.data.remote.b;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class DropAnimation extends BaseAnimation<AnimatorSet> {

    /* JADX INFO: renamed from: j */
    private static int f6084j = 0;

    /* JADX INFO: renamed from: k */
    private static int f6085k = 1;

    /* JADX INFO: renamed from: c */
    private int f6086c;

    /* JADX INFO: renamed from: e */
    private int f6087e;

    /* JADX INFO: renamed from: f */
    private DropAnimationValue f6088f;

    /* JADX INFO: renamed from: g */
    private int f6089g;

    /* JADX INFO: renamed from: h */
    private int f6090h;

    /* JADX INFO: renamed from: i */
    private int f6091i;

    public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, int i6, Object[] objArr, int i7) {
        int i8 = ~i4;
        int i9 = ~(i8 | i3);
        int i10 = ~i3;
        int i11 = i9 | (~(i10 | i4 | i2));
        int i12 = ~(i8 | i10);
        int i13 = (~i2) | i10;
        int i14 = i12 | (~i13);
        int i15 = ~(i13 | i4);
        int i16 = i4 + i3 + i6 + ((-1261570137) * i5) + (2040842291 * i7);
        int i17 = i16 * i16;
        int i18 = ((i4 * (-750812765)) - 1471086592) + ((-750812765) * i3) + (1493335646 * i11) + ((-1308296004) * i14) + ((-1493335646) * i15) + (742522880 * i6) + ((-1928462336) * i5) + (1629880320 * i7) + (2096168960 * i17);
        int i19 = ((i4 * 1408203179) - 1033136887) + (i3 * 1408203179) + (i11 * (-338)) + (i14 * (-676)) + (i15 * ExifDirectoryBase.TAG_EXTRA_SAMPLES) + (i6 * 1408202841) + (i5 * (-1046847217)) + (i7 * (-121732677)) + (i17 * 1741225984);
        return i18 + ((i19 * i19) * 838795264) != 1 ? b(objArr) : a(objArr);
    }

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.BaseAnimation
    public final /* synthetic */ BaseAnimation a(long j2) {
        int i2 = 2 % 2;
        int i3 = f6084j + 115;
        f6085k = i3 % 128;
        if (i3 % 2 == 0) {
            d(j2);
            throw null;
        }
        DropAnimation dropAnimationD = d(j2);
        int i4 = f6084j + 49;
        f6085k = i4 % 128;
        int i5 = i4 % 2;
        return dropAnimationD;
    }

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.BaseAnimation
    public final /* synthetic */ BaseAnimation b(float f2) {
        int i2 = 2 % 2;
        int i3 = f6085k + 87;
        f6084j = i3 % 128;
        if (i3 % 2 == 0) {
            return a(f2);
        }
        a(f2);
        throw null;
    }

    @Override // com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.BaseAnimation
    public final /* synthetic */ Animator d() {
        int i2 = 2 % 2;
        int i3 = f6085k + 49;
        f6084j = i3 % 128;
        int i4 = i3 % 2;
        AnimatorSet animatorSetE = e();
        int i5 = f6084j + 91;
        f6085k = i5 % 128;
        int i6 = i5 % 2;
        return animatorSetE;
    }

    enum d {
        Width,
        Height,
        Radius;


        /* JADX INFO: renamed from: d */
        private static int f6098d = 0;

        /* JADX INFO: renamed from: f */
        private static int f6100f = 0;

        /* JADX INFO: renamed from: h */
        private static int f6101h = 1;

        /* JADX INFO: renamed from: i */
        private static int f6102i = 1;

        static {
            int i2 = f6101h + 11;
            f6100f = i2 % 128;
            int i3 = i2 % 2;
        }

        public static d valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f6098d + 13;
            f6102i = i3 % 128;
            int i4 = i3 % 2;
            d dVar = (d) Enum.valueOf(d.class, str);
            int i5 = f6102i + 123;
            f6098d = i5 % 128;
            if (i5 % 2 == 0) {
                return dVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            int i2 = 2 % 2;
            int i3 = f6102i + 97;
            f6098d = i3 % 128;
            int i4 = i3 % 2;
            d[] dVarArr = (d[]) values().clone();
            int i5 = f6102i + 121;
            f6098d = i5 % 128;
            int i6 = i5 % 2;
            return dVarArr;
        }
    }

    public DropAnimation(ValueController.UpdateListener updateListener) {
        super(updateListener);
        this.f6088f = new DropAnimationValue();
    }

    private static AnimatorSet e() {
        int i2 = 2 % 2;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        int i3 = f6085k + 103;
        f6084j = i3 % 128;
        int i4 = i3 % 2;
        return animatorSet;
    }

    private DropAnimation a(float f2) {
        int i2 = 2 % 2;
        int i3 = f6084j + 101;
        f6085k = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            if (this.f6076a != 0) {
                long j2 = (long) (f2 * this.f6077b);
                Iterator<Animator> it = ((AnimatorSet) this.f6076a).getChildAnimations().iterator();
                loop0: while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        ValueAnimator valueAnimator = (ValueAnimator) it.next();
                        long duration = valueAnimator.getDuration();
                        long j3 = z2 ? j2 - duration : j2;
                        if (j3 >= 0) {
                            if (j3 >= duration) {
                                int i4 = f6084j + 113;
                                f6085k = i4 % 128;
                                if (i4 % 2 == 0) {
                                    obj.hashCode();
                                    throw null;
                                }
                                j3 = duration;
                            }
                            if (valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                                int i5 = f6085k + 7;
                                f6084j = i5 % 128;
                                int i6 = i5 % 2;
                                valueAnimator.setCurrentPlayTime(j3);
                            }
                            if ((!z2) && duration >= this.f6077b) {
                                int i7 = f6085k + 31;
                                f6084j = i7 % 128;
                                if (i7 % 2 != 0) {
                                    break;
                                }
                                z2 = true;
                            }
                        }
                    }
                }
            }
            return this;
        }
        T t2 = this.f6076a;
        throw null;
    }

    public final DropAnimation d(long j2) {
        int i2 = 2 % 2;
        int i3 = f6084j + 43;
        f6085k = i3 % 128;
        if (i3 % 2 != 0) {
            super.a(j2);
            return this;
        }
        super.a(j2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.DropAnimation d(int r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.DropAnimation.d(int, int, int, int, int):com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.DropAnimation");
    }

    public /* synthetic */ void b(d dVar, ValueAnimator valueAnimator) {
        int i2 = 2 % 2;
        int i3 = f6085k + 125;
        f6084j = i3 % 128;
        if (i3 % 2 == 0) {
            int iC = b.d.e.c();
            int iC2 = b.d.e.c();
            d(iC, 489869839, -489869838, b.d.e.c(), iC2, new Object[]{this, valueAnimator, dVar}, b.d.e.c());
            return;
        }
        int iC3 = b.d.e.c();
        int iC4 = b.d.e.c();
        d(iC3, 489869839, -489869838, b.d.e.c(), iC4, new Object[]{this, valueAnimator, dVar}, b.d.e.c());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ValueAnimator d(int i2, int i3, long j2, final d dVar) {
        int i4 = 2 % 2;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i3);
        valueAnimatorOfInt.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfInt.setDuration(j2);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.DropAnimation$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.b(dVar, valueAnimator);
            }
        });
        int i5 = f6084j + 17;
        f6085k = i5 % 128;
        if (i5 % 2 != 0) {
            return valueAnimatorOfInt;
        }
        throw null;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.commons.ui.page_indicator_view.animation.type.DropAnimation$5 */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f6092a;

        /* JADX INFO: renamed from: c */
        private static int f6093c = 0;

        /* JADX INFO: renamed from: e */
        private static int f6094e = 1;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            f6092a = iArr;
            try {
                iArr[d.Width.ordinal()] = 1;
                int i2 = f6093c + 29;
                f6094e = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6092a[d.Height.ordinal()] = 2;
                int i4 = f6094e + 43;
                f6093c = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6092a[d.Radius.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        DropAnimation dropAnimation = (DropAnimation) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        d dVar = (d) objArr[2];
        int i2 = 2 % 2;
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i3 = AnonymousClass5.f6092a[dVar.ordinal()];
        if (i3 == 1) {
            dropAnimation.f6088f.setWidth(iIntValue);
        } else if (i3 == 2) {
            dropAnimation.f6088f.setHeight(iIntValue);
        } else if (i3 == 3) {
            dropAnimation.f6088f.setRadius(iIntValue);
        }
        if (dropAnimation.f6078d != null) {
            int i4 = f6084j + 115;
            f6085k = i4 % 128;
            if (i4 % 2 == 0) {
                dropAnimation.f6078d.a(dropAnimation.f6088f);
                int i5 = 4 / 0;
            } else {
                dropAnimation.f6078d.a(dropAnimation.f6088f);
            }
        }
        int i6 = f6085k + 83;
        f6084j = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        DropAnimation dropAnimation = (DropAnimation) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int iIntValue3 = ((Number) objArr[3]).intValue();
        int iIntValue4 = ((Number) objArr[4]).intValue();
        int iIntValue5 = ((Number) objArr[5]).intValue();
        int i2 = 2 % 2;
        if (dropAnimation.f6086c != iIntValue) {
            int i3 = f6085k + 75;
            f6084j = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 45 / 0;
            }
            return true;
        }
        if (dropAnimation.f6087e != iIntValue2) {
            int i5 = f6085k + 3;
            f6084j = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (dropAnimation.f6091i != iIntValue3 || dropAnimation.f6090h != iIntValue4) {
            return true;
        }
        if (dropAnimation.f6089g == iIntValue5) {
            return false;
        }
        int i7 = f6084j + 95;
        f6085k = i7 % 128;
        return i7 % 2 != 0;
    }

    private boolean b(int i2, int i3, int i4, int i5, int i6) {
        Object[] objArr = {this, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        return ((Boolean) d(b.d.e.c(), -903789189, 903789189, b.d.e.c(), b.d.e.c(), objArr, b.d.e.c())).booleanValue();
    }

    private void a(ValueAnimator valueAnimator, d dVar) {
        int iC = b.d.e.c();
        int iC2 = b.d.e.c();
        d(iC, 489869839, -489869838, b.d.e.c(), iC2, new Object[]{this, valueAnimator, dVar}, b.d.e.c());
    }
}
