package com.facetec.sdk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import com.facetec.sdk.FaceTecVocalGuidanceCustomization;
import com.facetec.sdk.bg;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.QB;
import yg.Qg;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
class ao extends LinearLayout {
    private TextView B;
    private Animation C;
    private View Code;
    private boolean D;
    private Animator F;
    private ak I;
    private Animator L;
    private int S;
    private ac V;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f2902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AnimatorListenerAdapter f2903c;

    /* JADX INFO: renamed from: com.facetec.sdk.ao$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] V;

        static {
            int[] iArr = new int[ak.values().length];
            V = iArr;
            try {
                iArr[ak.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                V[ak.FRAME_YOUR_FACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                V[ak.WEARING_SUNGLASSES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                V[ak.BAD_POSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                V[ak.TOO_BRIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                V[ak.TOO_DARK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                V[ak.MAKING_FACE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                V[ak.EYES_LOOKING_AWAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                V[ak.HOLD_STEADY_3.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                V[ak.HOLD_STEADY_2.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                V[ak.HOLD_STEADY_1.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                V[ak.MOVE_CLOSER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                V[ak.MOVE_AWAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public ao(Context context) {
        super(context);
        this.V = ac.FACE_NOT_FOUND;
        this.I = ak.FRAME_YOUR_FACE;
        this.S = 0;
        this.D = false;
        this.f2903c = new AnimatorListenerAdapter() { // from class: com.facetec.sdk.ao.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                bb.B(ao.this.B, ao.this.S);
                if (ao.this.C != null) {
                    ao.this.C.cancel();
                    ao.this.C = null;
                    ao.this.B.setScaleX(1.0f);
                    ao.this.B.setScaleY(1.0f);
                }
                ao.this.L.start();
            }
        };
    }

    public ao(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V = ac.FACE_NOT_FOUND;
        this.I = ak.FRAME_YOUR_FACE;
        this.S = 0;
        this.D = false;
        this.f2903c = new AnimatorListenerAdapter() { // from class: com.facetec.sdk.ao.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                bb.B(ao.this.B, ao.this.S);
                if (ao.this.C != null) {
                    ao.this.C.cancel();
                    ao.this.C = null;
                    ao.this.B.setScaleX(1.0f);
                    ao.this.B.setScaleY(1.0f);
                }
                ao.this.L.start();
            }
        };
    }

    public ao(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.V = ac.FACE_NOT_FOUND;
        this.I = ak.FRAME_YOUR_FACE;
        this.S = 0;
        this.D = false;
        this.f2903c = new AnimatorListenerAdapter() { // from class: com.facetec.sdk.ao.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                bb.B(ao.this.B, ao.this.S);
                if (ao.this.C != null) {
                    ao.this.C.cancel();
                    ao.this.C = null;
                    ao.this.B.setScaleX(1.0f);
                    ao.this.B.setScaleY(1.0f);
                }
                ao.this.L.start();
            }
        };
    }

    static /* synthetic */ boolean F(ao aoVar) {
        aoVar.D = false;
        return false;
    }

    private void I(int i2) {
        if (this.D || i2 == this.S) {
            return;
        }
        this.S = i2;
        this.D = false;
        bb.B(this.B, i2);
    }

    private void Z(int i2) {
        if (this.D || i2 == this.S) {
            return;
        }
        this.S = i2;
        this.D = true;
        this.F.start();
        postDelayed(new Runnable() { // from class: com.facetec.sdk.ao.5
            @Override // java.lang.Runnable
            public final void run() {
                ao.F(ao.this);
            }
        }, 800L);
    }

    public final void B(ak akVar) {
        if (akVar == this.I || this.D) {
            return;
        }
        this.I = akVar;
        if (akVar == ak.FRAME_YOUR_FACE) {
            I(R.string.FaceTec_presession_frame_your_face);
            return;
        }
        if (akVar == ak.WEARING_SUNGLASSES) {
            I(R.string.FaceTec_presession_remove_dark_glasses);
            return;
        }
        if (akVar == ak.BAD_POSE) {
            I(R.string.FaceTec_presession_position_face_straight_in_oval);
            return;
        }
        if (akVar == ak.TOO_BRIGHT) {
            I(R.string.FaceTec_presession_conditions_too_bright);
            return;
        }
        if (akVar == ak.TOO_DARK) {
            I(R.string.FaceTec_presession_brighten_your_environment);
            return;
        }
        if (akVar == ak.MAKING_FACE) {
            I(R.string.FaceTec_presession_neutral_expression);
            return;
        }
        if (akVar == ak.EYES_LOOKING_AWAY) {
            I(R.string.FaceTec_presession_eyes_straight_ahead);
            return;
        }
        if (akVar == ak.HOLD_STEADY_3) {
            I(R.string.FaceTec_presession_hold_steady_3);
            return;
        }
        if (akVar == ak.HOLD_STEADY_2) {
            I(R.string.FaceTec_presession_hold_steady_2);
            return;
        }
        if (akVar == ak.HOLD_STEADY_1) {
            I(R.string.FaceTec_presession_hold_steady_1);
        } else if (akVar == ak.MOVE_CLOSER) {
            I(R.string.FaceTec_feedback_move_phone_closer);
        } else if (akVar == ak.MOVE_AWAY) {
            I(R.string.FaceTec_feedback_move_phone_away);
        }
    }

    final void Code() {
        Handler handler = this.f2902b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f2902b = null;
        }
    }

    public final void Code(ac acVar) {
        if (acVar == this.V || this.D) {
            return;
        }
        this.V = acVar;
        if (acVar == ac.HOLD_STEADY) {
            Z(R.string.FaceTec_feedback_hold_steady);
            return;
        }
        if (acVar == ac.MOVE_FACE_CLOSER) {
            Z(R.string.FaceTec_feedback_move_phone_closer);
            return;
        }
        if (acVar == ac.MOVE_FACE_FURTHER_AWAY) {
            Z(R.string.FaceTec_feedback_move_phone_away);
            return;
        }
        if (acVar == ac.FACE_CENTERED_TOO_FAR_TOP) {
            Z(R.string.FaceTec_feedback_center_face);
            return;
        }
        if (acVar == ac.FACE_CENTERED_TOO_FAR_BOTTOM) {
            Z(R.string.FaceTec_feedback_center_face);
            return;
        }
        if (acVar == ac.FACE_CENTERED_TOO_FAR_LEFT) {
            Z(R.string.FaceTec_feedback_center_face);
            return;
        }
        if (acVar == ac.FACE_CENTERED_TOO_FAR_RIGHT) {
            Z(R.string.FaceTec_feedback_center_face);
            return;
        }
        if (acVar == ac.MOVE_FACE_AWAY_A_LITTLE) {
            Z(R.string.FaceTec_feedback_move_phone_away);
            return;
        }
        if (acVar == ac.FACE_ROTATED_TOO_FAR_LEFT) {
            Z(R.string.FaceTec_feedback_face_not_upright);
            return;
        }
        if (acVar == ac.FACE_ROTATED_TOO_FAR_RIGHT) {
            Z(R.string.FaceTec_feedback_face_not_upright);
            return;
        }
        if (acVar == ac.FACE_NOT_FOUND) {
            Z(R.string.FaceTec_feedback_face_not_found);
            return;
        }
        if (acVar == ac.MOVE_PHONE_TO_EYE_LEVEL) {
            Z(R.string.FaceTec_feedback_move_phone_to_eye_level);
        } else if (acVar == ac.FACE_NOT_LOOKING_STRAIGHT_AHEAD) {
            Z(R.string.FaceTec_feedback_face_not_looking_straight_ahead);
        } else if (acVar == ac.USE_EVEN_LIGHTING) {
            Z(R.string.FaceTec_feedback_use_even_lighting);
        }
    }

    public final void V() throws Throwable {
        if (this.S == R.string.FaceTec_feedback_move_phone_closer) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.15f, 1.0f, 1.15f, 1, 0.5f, 1, 0.5f);
            this.C = scaleAnimation;
            scaleAnimation.setDuration(800L);
            this.C.setRepeatMode(2);
            this.C.setRepeatCount(-1);
            this.B.startAnimation(this.C);
            if (FaceTecSDK.V.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.FULL_VOCAL_GUIDANCE || FaceTecSDK.V.vocalGuidanceCustomization.mode == FaceTecVocalGuidanceCustomization.VocalGuidanceMode.NO_VOCAL_GUIDANCE) {
                return;
            }
            Handler handler = new Handler();
            this.f2902b = handler;
            Runnable runnable = new Runnable() { // from class: com.facetec.sdk.ao.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (bg.V || ao.this.S != R.string.FaceTec_feedback_move_phone_closer) {
                        return;
                    }
                    bg.B(ao.this.getContext(), bg.V.FACE_CAPTURE_MOVE_CLOSER_DELAYED);
                }
            };
            short sXd = (short) (C1580rY.Xd() ^ (-25467));
            int[] iArr = new int["\r\u0019\u000e\u001b\u001f\u0018\u0012Z\u0013\u0016Oh\t\u0015\n\u0011\u0001\r".length()];
            QB qb = new QB("\r\u0019\u000e\u001b\u001f\u0018\u0012Z\u0013\u0016Oh\t\u0015\n\u0011\u0001\r");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = {runnable, 1000L};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(yg.hg.Vd("\u0006\u0004\u0007\u0007Uu{o\u0007qo", (short) (FB.Xd() ^ 11112), (short) (FB.Xd() ^ 30304)), Class.forName(Qg.kd("cYmW#`T`X\u001eAc[ZLLUM", (short) (C1607wl.Xd() ^ 16033), (short) (C1607wl.Xd() ^ 24169))), Long.TYPE);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    final void Z(al alVar, ak akVar) {
        setVisibility(4);
        TextView textView = (TextView) findViewById(R.id.zoomFeedbackText);
        this.B = textView;
        TextViewCompat.setAutoSizeTextTypeWithDefaults(textView, 1);
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(this.B, 5, 50, 1, 2);
        if (alVar != al.READY_TO_START_ZOOM_SESSION) {
            switch (AnonymousClass3.V[akVar.ordinal()]) {
                case 1:
                    bb.B(this.B, R.string.FaceTec_presession_frame_your_face);
                    this.I = ak.FRAME_YOUR_FACE;
                    break;
                case 2:
                    bb.B(this.B, R.string.FaceTec_presession_frame_your_face);
                    this.I = ak.FRAME_YOUR_FACE;
                    break;
                case 3:
                    bb.B(this.B, R.string.FaceTec_presession_remove_dark_glasses);
                    this.I = ak.WEARING_SUNGLASSES;
                    break;
                case 4:
                    bb.B(this.B, R.string.FaceTec_presession_position_face_straight_in_oval);
                    this.I = ak.BAD_POSE;
                    break;
                case 5:
                    bb.B(this.B, R.string.FaceTec_presession_conditions_too_bright);
                    this.I = ak.TOO_BRIGHT;
                    break;
                case 6:
                    bb.B(this.B, R.string.FaceTec_presession_brighten_your_environment);
                    this.I = ak.TOO_DARK;
                    break;
                case 7:
                    bb.B(this.B, R.string.FaceTec_presession_neutral_expression);
                    this.I = ak.MAKING_FACE;
                    break;
                case 8:
                    bb.B(this.B, R.string.FaceTec_presession_eyes_straight_ahead);
                    this.I = ak.EYES_LOOKING_AWAY;
                    break;
                case 9:
                    bb.B(this.B, R.string.FaceTec_presession_hold_steady_3);
                    this.I = ak.HOLD_STEADY_3;
                    break;
                case 10:
                    bb.B(this.B, R.string.FaceTec_presession_hold_steady_2);
                    this.I = ak.HOLD_STEADY_1;
                    break;
                case 11:
                    bb.B(this.B, R.string.FaceTec_presession_hold_steady_1);
                    this.I = ak.HOLD_STEADY_1;
                    break;
                case 12:
                    bb.B(this.B, R.string.FaceTec_feedback_move_phone_closer);
                    this.I = ak.MOVE_CLOSER;
                    break;
                case 13:
                    bb.B(this.B, R.string.FaceTec_feedback_move_phone_away);
                    this.I = ak.MOVE_AWAY;
                    break;
            }
        } else {
            bb.B(this.B, R.string.FaceTec_feedback_hold_steady);
            this.V = ac.HOLD_STEADY;
        }
        this.B.setTypeface(FaceTecSDK.V.L.textFont);
        ba.B(this.B);
        GradientDrawable gradientDrawableH = ba.h(getContext());
        View viewFindViewById = findViewById(R.id.zoomFeedbackContainer);
        this.Code = viewFindViewById;
        viewFindViewById.setBackground(gradientDrawableH);
        int i2 = ba.D;
        setPadding(i2, i2, i2, (int) (((double) i2) * 1.5d));
        this.Code.setElevation(ce.V(FaceTecSDK.V.L.elevation));
        this.Code.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        this.Code.setClipToOutline(false);
        this.Code.requestLayout();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.B, (Property<TextView, Float>) View.ALPHA, 0.0f);
        this.F = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(400L);
        this.F.addListener(this.f2903c);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.B, (Property<TextView, Float>) View.ALPHA, 1.0f);
        this.L = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(400L);
        float fV = ce.V(ba.S().height) * ba.V();
        float fV2 = ce.V(ba.S().width) * ba.V();
        this.B.getLayoutParams().height = (int) fV;
        this.B.getLayoutParams().width = (int) fV2;
        int iRound = Math.round(ce.V(10) * ba.V() * ba.Code());
        this.B.setPadding(iRound, Math.round(iRound * 1.1f), iRound, iRound);
        this.B.requestLayout();
    }
}
