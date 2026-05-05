package com.incode.welcome_sdk.ui.camera.id_validation.base;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.exceptions.IncodeGenericError;
import com.incode.welcome_sdk.commons.extensions.ContextExtensionsKt;
import com.incode.welcome_sdk.commons.ui.FlashingBorderView;
import com.incode.welcome_sdk.commons.ui.VignetteView;
import com.incode.welcome_sdk.commons.utils.BitmapUtils;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.FaceProcessingUtils;
import com.incode.welcome_sdk.commons.utils.LayoutUtils;
import com.incode.welcome_sdk.commons.utils.ad;
import com.incode.welcome_sdk.commons.utils.f;
import com.incode.welcome_sdk.commons.utils.t;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.local.db.c.a.aa;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.results.DocumentValidationResult;
import com.incode.welcome_sdk.results.IdScanResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.camera.CameraActivity;
import com.incode.welcome_sdk.ui.camera.CameraPreview;
import com.incode.welcome_sdk.ui.camera.id_validation.ValidationActivity;
import com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseValidationActivity extends CameraActivity implements BaseValidationContract.View {
    private static int G = 0;
    private static int I = 1;
    private int A;
    private int B;
    private ImageView C;
    private ImageView D;
    private Button E;
    private boolean F;
    private ImageView H;

    /* JADX INFO: renamed from: j */
    private CompositeDisposable f11734j;

    /* JADX INFO: renamed from: k */
    @Inject
    public BaseValidationPresenter f11735k;

    /* JADX INFO: renamed from: l */
    private int f11736l;

    /* JADX INFO: renamed from: n */
    private float f11738n;

    /* JADX INFO: renamed from: o */
    private float f11739o;

    /* JADX INFO: renamed from: p */
    private int f11740p;

    /* JADX INFO: renamed from: q */
    private Rect f11741q;

    /* JADX INFO: renamed from: r */
    private Rect f11742r;

    /* JADX INFO: renamed from: s */
    private FlashingBorderView f11743s;

    /* JADX INFO: renamed from: t */
    private VignetteView f11744t;

    /* JADX INFO: renamed from: u */
    private int f11745u;

    /* JADX INFO: renamed from: v */
    private View f11746v;

    /* JADX INFO: renamed from: w */
    private int f11747w;

    /* JADX INFO: renamed from: x */
    private TextView f11748x;

    /* JADX INFO: renamed from: y */
    private int f11749y;

    /* JADX INFO: renamed from: z */
    private int f11750z;

    /* JADX INFO: renamed from: h */
    private PublishSubject<Object> f11732h = PublishSubject.create();

    /* JADX INFO: renamed from: i */
    private IdOrientation f11733i = IdOrientation.f11819d;

    /* JADX INFO: renamed from: m */
    private float f11737m = 0.07f;

    public static /* synthetic */ Object e(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8;
        int i9 = ~i6;
        int i10 = ~i4;
        int i11 = ~(i9 | i10);
        int i12 = ~i5;
        int i13 = i11 | (~(i12 | i4));
        int i14 = (~(i4 | i9)) | (~(i10 | i12));
        int i15 = ~(i6 | i5);
        int i16 = i14 | i15;
        int i17 = i15 | i13;
        int i18 = i6 + i5 + i3 + ((-1585779005) * i7) + (640148872 * i2);
        int i19 = i18 * i18;
        int i20 = (i6 * 308833806) + 153878528 + (308833806 * i5) + ((-448846874) * i13) + ((-224423437) * i16) + (224423437 * i17) + (84410368 * i3) + (1159200768 * i7) + ((-734003200) * i2) + (2089549824 * i19);
        int i21 = (i6 * (-1291220770)) + 263398195 + (i5 * (-1291220770)) + (i13 * (-1802)) + (i16 * (-901)) + (i17 * 901) + (i3 * (-1291221671)) + (i7 * (-1079815989)) + (i2 * 669414472) + (i19 * 145489920);
        int i22 = i20 + (i21 * i21 * (-1699479552));
        int i23 = 0;
        if (i22 == 1) {
            BaseValidationActivity baseValidationActivity = (BaseValidationActivity) objArr[0];
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            int i24 = 2 % 2;
            VignetteView vignetteView = baseValidationActivity.f11744t;
            if (vignetteView != null) {
                if (!zBooleanValue) {
                    i8 = 8;
                } else {
                    int i25 = G + 41;
                    I = i25 % 128;
                    int i26 = i25 % 2;
                    i8 = 0;
                }
                vignetteView.setVisibility(i8);
                int i27 = G + 19;
                I = i27 % 128;
                if (i27 % 2 == 0) {
                    int i28 = 3 % 4;
                }
            }
            ImageView imageView = baseValidationActivity.C;
            if (imageView == null) {
                return null;
            }
            if (zBooleanValue) {
                int i29 = G + 87;
                I = i29 % 128;
                int i30 = i29 % 2;
            } else {
                i23 = 8;
            }
            imageView.setVisibility(i23);
            return null;
        }
        if (i22 == 2) {
            BaseValidationActivity baseValidationActivity2 = (BaseValidationActivity) objArr[0];
            int i31 = 2 % 2;
            VignetteView vignetteView2 = baseValidationActivity2.f11744t;
            if (vignetteView2 != null) {
                int i32 = G + 69;
                I = i32 % 128;
                int i33 = i32 % 2;
                vignetteView2.setVisibility(0);
            }
            FlashingBorderView flashingBorderView = baseValidationActivity2.f11743s;
            if (flashingBorderView != null) {
                flashingBorderView.setVisibility(0);
            }
            int i34 = G + 47;
            I = i34 % 128;
            int i35 = i34 % 2;
            return null;
        }
        BaseValidationActivity baseValidationActivity3 = (BaseValidationActivity) objArr[0];
        int i36 = 2 % 2;
        if (baseValidationActivity3.H == null) {
            return null;
        }
        int i37 = AnonymousClass3.f11752b[baseValidationActivity3.getDocumentType().ordinal()];
        if (i37 == 1 || i37 == 2) {
            baseValidationActivity3.H.setImageResource(R.drawable.onboard_sdk_document_scan_overlay);
            int i38 = I + 31;
            G = i38 % 128;
            int i39 = i38 % 2;
        }
        baseValidationActivity3.H.setVisibility(0);
        int i40 = G + 93;
        I = i40 % 128;
        int i41 = i40 % 2;
        return null;
    }

    public static void startDocumentValidation(Context context, Class<? extends BaseValidationActivity> cls, DocumentType documentType, Uri uri) {
        int i2 = 2 % 2;
        int i3 = I + 65;
        int i4 = i3 % 128;
        G = i4;
        int i5 = i3 % 2;
        if (cls == null) {
            int i6 = i4 + 91;
            int i7 = i6 % 128;
            I = i7;
            int i8 = i6 % 2;
            cls = ValidationActivity.class;
            int i9 = i7 + 55;
            G = i9 % 128;
            int i10 = i9 % 2;
        }
        Intent intent = new Intent(context, cls);
        intent.putExtra("extraIdValidationPhase", ValidationPhase.SCAN_DOCUMENT);
        intent.putExtra("extraDocumentType", documentType);
        if (uri != null) {
            int i11 = I + 9;
            G = i11 % 128;
            if (i11 % 2 != 0) {
                intent.putExtra("extraDocumentUri", uri);
                int i12 = 81 / 0;
            } else {
                intent.putExtra("extraDocumentUri", uri);
            }
        }
        ContextExtensionsKt.startActivityChained(context, intent);
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.View
    public Activity getActivity() {
        int i2 = 2 % 2;
        int i3 = G + 31;
        I = i3 % 128;
        if (i3 % 2 != 0) {
            return this;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraContract.View
    public int getCameraFacing() {
        int i2 = 2 % 2;
        int i3 = G + 17;
        int i4 = i3 % 128;
        I = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 47;
        G = i6 % 128;
        int i7 = i6 % 2;
        return 0;
    }

    public /* synthetic */ void b(Object obj) throws Exception {
        int i2 = 2 % 2;
        int i3 = G + 125;
        I = i3 % 128;
        int i4 = i3 % 2;
        this.f11735k.takePicture();
        if (i4 == 0) {
            int i5 = 87 / 0;
        }
    }

    public static /* synthetic */ void c(Throwable th) throws Exception {
        int i2 = 2 % 2;
        int i3 = I + 51;
        G = i3 % 128;
        if (i3 % 2 != 0) {
            Timber.e(th, "Take picture failed", new Object[1]);
        } else {
            Timber.e(th, "Take picture failed", new Object[0]);
        }
        int i4 = I + 97;
        G = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        DaggerBaseValidationComponent.builder().incodeWelcomeRepositoryComponent(IncodeWelcome.getInstance().getIncodeWelcomeRepositoryComponent()).baseValidationPresenterModule(new BaseValidationPresenterModule(this)).build().inject(this);
        super.safeOnCreate(bundle, this.f11735k);
        setStreamAudioEnabled(getIntent().getBooleanExtra("extraStreamAudioEnabled", false));
        this.f11735k.initIdValidationPhase(BaseValidationPresenter.getIdValidationPhaseFromIntent(getIntent()));
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.f11734j = compositeDisposable;
        compositeDisposable.add(this.f11732h.throttleFirst(2L, TimeUnit.SECONDS).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.b(obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BaseValidationActivity.c((Throwable) obj);
            }
        }));
        if (t.e(getIntent()) != null) {
            int i3 = G + 103;
            I = i3 % 128;
            if (i3 % 2 == 0) {
                disableCamera();
                int i4 = 48 / 0;
            } else {
                disableCamera();
            }
        }
        e();
        int i5 = G + 21;
        I = i5 % 128;
        int i6 = i5 % 2;
    }

    private void e() {
        int i2 = 2 % 2;
        int i3 = I + 103;
        G = i3 % 128;
        int i4 = i3 % 2;
        this.f11744t = (VignetteView) findViewById(R.id.vignette);
        this.f11743s = (FlashingBorderView) findViewById(R.id.vignetteFlashingBorder);
        this.f11746v = findViewById(R.id.containerTitleAndCloseButton);
        this.f11748x = (TextView) findViewById(R.id.tvIdScanTitle);
        this.D = (ImageView) findViewById(R.id.ivPassportOverlay);
        this.C = (ImageView) findViewById(R.id.ivIdFrontOverlay);
        this.H = (ImageView) findViewById(R.id.ivDocumentOverlay);
        this.E = (Button) findViewById(R.id.btnShutter);
        this.A = ContextCompat.getColor(this, R.color.onboard_sdk_white);
        this.B = ContextCompat.getColor(this, R.color.onboard_sdk_colorPrimary);
        this.f11750z = ContextCompat.getColor(this, R.color.onboard_sdk_state_success);
        this.f11745u = ContextCompat.getColor(this, android.R.color.transparent);
        this.f11749y = getResources().getDimensionPixelSize(R.dimen.onboard_sdk_photo_preview_frame_thickness);
        this.f11747w = getResources().getDimensionPixelSize(R.dimen.onboard_sdk_rounded_rectangle_outer_radius);
        int i5 = I + 5;
        G = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public void initializeUiViews() {
        int i2 = 2 % 2;
        int i3 = G + 95;
        I = i3 % 128;
        if (i3 % 2 != 0) {
            b(getValidationPhase());
            updateUiViewsBasedOnScreenDimensionsAndRotation(this.f11733i);
            int i4 = I + 5;
            G = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 21 / 0;
                return;
            }
            return;
        }
        b(getValidationPhase());
        updateUiViewsBasedOnScreenDimensionsAndRotation(this.f11733i);
        throw null;
    }

    public /* synthetic */ void g() {
        int i2 = 2 % 2;
        int i3 = I + 75;
        G = i3 % 128;
        int i4 = i3 % 2;
        int screenDensity = (int) (getScreenDensity() * 14.0f);
        LayoutUtils.addPaddingToMatchWidth(this.f11746v, this.f11741q.width());
        this.f11746v.setY((this.f11741q.top - this.f11746v.getHeight()) - screenDensity);
        int i5 = I + 17;
        G = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateUiViewsBasedOnScreenDimensionsAndRotation(com.incode.welcome_sdk.ui.camera.id_validation.base.IdOrientation r13) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.updateUiViewsBasedOnScreenDimensionsAndRotation(com.incode.welcome_sdk.ui.camera.id_validation.base.IdOrientation):void");
    }

    private void c(ImageView imageView, IdOrientation idOrientation) {
        int i2;
        int i3 = 2 % 2;
        int i4 = I + 85;
        G = i4 % 128;
        int i5 = i4 % 2;
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) imageView.getLayoutParams();
        if (idOrientation == IdOrientation.f11819d) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = this.f11741q.left;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f11741q.top;
            ((ViewGroup.LayoutParams) layoutParams).width = this.f11741q.width();
            ((ViewGroup.LayoutParams) layoutParams).height = this.f11741q.height();
            imageView.setRotation(0.0f);
            i2 = G + 77;
            I = i2 % 128;
        } else {
            int iWidth = (this.f11741q.width() - this.f11741q.height()) / 2;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = this.f11741q.left + iWidth;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.f11741q.top - iWidth;
            ((ViewGroup.LayoutParams) layoutParams).width = this.f11741q.height();
            ((ViewGroup.LayoutParams) layoutParams).height = this.f11741q.width();
            imageView.setRotation(90.0f);
            i2 = I + 15;
            G = i2 % 128;
        }
        int i6 = i2 % 2;
        imageView.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0019  */
    @Override // com.incode.welcome_sdk.ui.camera.CameraActivity, com.incode.welcome_sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.I
            int r1 = r0 + 39
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.G = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L2b
            super.onResume()
            boolean r1 = r3.F
            r0 = 77
            int r0 = r0 / 0
            if (r1 == 0) goto L1c
        L19:
            r3.initializeUiViews()
        L1c:
            r0 = 1
            r3.F = r0
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.I
            int r1 = r0 + 123
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.G = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L33
            return
        L2b:
            super.onResume()
            boolean r0 = r3.F
            if (r0 == 0) goto L1c
            goto L19
        L33:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.onResume():void");
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraActivity, com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onCameraPermissionGranted() {
        int i2 = 2 % 2;
        int i3 = G + 97;
        I = i3 % 128;
        if (i3 % 2 == 0) {
            super.onCameraPermissionGranted();
            initValidation();
            int i4 = 1 / 0;
        } else {
            super.onCameraPermissionGranted();
            initValidation();
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraActivity, com.incode.welcome_sdk.ui.BaseActivity
    public void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = G + 79;
        I = i3 % 128;
        int i4 = i3 % 2;
        this.f11734j.clear();
        super.safeOnDestroy();
        int i5 = I + 103;
        G = i5 % 128;
        int i6 = i5 % 2;
    }

    public void initValidation() {
        Event event;
        int i2 = 2 % 2;
        this.f11735k.init(getIntent());
        int i3 = AnonymousClass3.f11753c[getValidationPhase().ordinal()];
        Object obj = null;
        if (i3 != 1 && i3 != 2) {
            event = i3 != 3 ? null : Event.START_DOCUMENT_VALIDATION;
        } else if (getIdCategory() == IdCategory.FIRST) {
            int i4 = I + 35;
            G = i4 % 128;
            int i5 = i4 % 2;
            event = Event.START_ID_CAPTURE;
        } else {
            event = Event.START_SECOND_ID_CAPTURE;
        }
        if (event != null) {
            HashMap map = new HashMap();
            map.put(EventValues.SCREEN_NAME.getValue(), getScreenName().name());
            EventUtils.sendEvent(getRepo(), event, getModule(), (HashMap<String, Object>) map);
        }
        initializeUiViews();
        int i6 = G + 57;
        I = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0020, code lost:
    
        if (r1 != 3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0022, code lost:
    
        r5.f11739o = 0.6279f;
        r5.f11737m = 0.07f;
        r1 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.G + 51;
        com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.I = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        if (r0 != 3) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0040, code lost:
    
        r5.f11739o = 0.75f;
        r5.f11737m = 0.07f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase r6) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.G
            int r1 = r0 + 81
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.I = r0
            int r1 = r1 % r4
            r3 = 1032805417(0x3d8f5c29, float:0.07)
            r2 = 3
            if (r1 != 0) goto L33
            int[] r1 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.AnonymousClass3.f11753c
            int r0 = r6.ordinal()
            r1 = r1[r0]
            r0 = 50
            int r0 = r0 / 0
            if (r1 == r4) goto L47
            if (r1 == r2) goto L40
        L22:
            r0 = 1059110414(0x3f20be0e, float:0.6279)
            r5.f11739o = r0
            r5.f11737m = r3
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.G
            int r1 = r0 + 51
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.I = r0
            int r1 = r1 % r4
            return
        L33:
            int[] r1 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.AnonymousClass3.f11753c
            int r0 = r6.ordinal()
            r0 = r1[r0]
            if (r0 == r4) goto L47
            if (r0 == r2) goto L40
            goto L22
        L40:
            r0 = 1061158912(0x3f400000, float:0.75)
            r5.f11739o = r0
            r5.f11737m = r3
            return
        L47:
            r0 = 1060387160(0x3f343958, float:0.704)
            r5.f11739o = r0
            r0 = 1026456918(0x3d2e7d56, float:0.0426)
            r5.f11737m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.b(com.incode.welcome_sdk.ui.camera.id_validation.base.ValidationPhase):void");
    }

    public /* synthetic */ void c(int i2, int i3, int i4, int i5) {
        int i6 = 2 % 2;
        if (i2 * i5 < i3 * i4) {
            int i7 = G + 17;
            int i8 = i7 % 128;
            I = i8;
            int i9 = i7 % 2;
            float f2 = i5 / i3;
            this.f11738n = f2;
            this.f11736l = (int) ((i4 - (i2 * f2)) / 2.0f);
            int i10 = i8 + 45;
            G = i10 % 128;
            int i11 = i10 % 2;
        } else {
            float f3 = i4 / i2;
            this.f11738n = f3;
            this.f11740p = (int) ((i5 - (i3 * f3)) / 2.0f);
        }
        this.f11742r = ad.b(this.f11741q, this.f11738n);
        FlashingBorderView flashingBorderView = this.f11743s;
        if (flashingBorderView != null) {
            flashingBorderView.layout(0, 0, i2, i3);
            this.f11743s.setColor(this.A);
        }
        VignetteView vignetteView = this.f11744t;
        if (vignetteView != null) {
            vignetteView.layout(0, 0, i2, i3);
        }
        int i12 = I + 39;
        G = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraActivity, com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onCameraSourceCreated() {
        int i2 = 2 % 2;
        super.onCameraSourceCreated();
        int i3 = AnonymousClass3.f11753c[getValidationPhase().ordinal()];
        Event event = null;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 4) {
                    if (getIdCategory() != IdCategory.FIRST) {
                        event = Event.CAMERA_BACK_SECOND_ID;
                    } else {
                        int i4 = I + 103;
                        G = i4 % 128;
                        int i5 = i4 % 2;
                        event = Event.CAMERA_BACK_ID;
                    }
                }
            } else if (getIdCategory() == IdCategory.FIRST) {
                event = Event.CAMERA_PASSPORT;
            } else {
                event = Event.CAMERA_SECOND_PASSPORT;
            }
        } else if (getIdCategory() != IdCategory.FIRST) {
            event = Event.CAMERA_FRONT_SECOND_ID;
        } else {
            int i6 = I + 105;
            G = i6 % 128;
            if (i6 % 2 == 0) {
                event = Event.CAMERA_FRONT_ID;
            } else {
                Event event2 = Event.CAMERA_FRONT_ID;
                throw null;
            }
        }
        if (event != null) {
            int i7 = I + 1;
            G = i7 % 128;
            if (i7 % 2 != 0) {
                EventUtils.sendCameraOpenedEvent(getRepo(), event, getModule(), getScreenName(), ((CameraActivity) this).f11176b);
                int i8 = 3 / 0;
            } else {
                EventUtils.sendCameraOpenedEvent(getRepo(), event, getModule(), getScreenName(), ((CameraActivity) this).f11176b);
            }
        }
        ((CameraActivity) this).f11178d.addOnLayoutCameraPreviewListener(new CameraPreview.OnLayoutCameraPreviewListener() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity$$ExternalSyntheticLambda4
            @Override // com.incode.welcome_sdk.ui.camera.CameraPreview.OnLayoutCameraPreviewListener
            public final void layoutCameraPreview(int i9, int i10, int i11, int i12) {
                this.f$0.c(i9, i10, i11, i12);
            }
        });
        this.f11735k.setIdCaptureStarted();
    }

    public void startValidation() {
        int i2 = 2 % 2;
        int i3 = G + 39;
        I = i3 % 128;
        int i4 = i3 % 2;
        if (!isIdAutoCaptureEnabled()) {
            int i5 = G + 71;
            I = i5 % 128;
            if (i5 % 2 != 0) {
                if (!isPictureProvidedExternally()) {
                    this.f11735k.autoShutterTimerElapsed();
                }
            } else {
                isPictureProvidedExternally();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        this.f11735k.startValidation();
    }

    public void stopValidation() {
        int i2 = 2 % 2;
        int i3 = I + 91;
        G = i3 % 128;
        int i4 = i3 % 2;
        this.f11735k.stopAutoShutterTimer();
        this.f11735k.stopValidation();
        int i5 = G + 55;
        I = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void showCaptureHint() {
        int i2 = 2 % 2;
        int i3 = I + 107;
        G = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.View
    public void userSelectedManualCapture() {
        int i2 = 2 % 2;
        int i3 = I + 105;
        G = i3 % 128;
        int i4 = i3 % 2;
        this.f11735k.userSelectedManualCapture();
        int i5 = G + 63;
        I = i5 % 128;
        int i6 = i5 % 2;
    }

    public void enteredManualCaptureMode() {
        int i2 = 2 % 2;
        int i3 = G + 55;
        I = i3 % 128;
        int i4 = i3 % 2;
    }

    public boolean isIdAutoCaptureEnabled() {
        int i2 = 2 % 2;
        int i3 = I + 65;
        G = i3 % 128;
        if (i3 % 2 != 0) {
            this.f11735k.isIdAutoCaptureEnabled();
            throw null;
        }
        boolean zIsIdAutoCaptureEnabled = this.f11735k.isIdAutoCaptureEnabled();
        int i4 = I + 25;
        G = i4 % 128;
        int i5 = i4 % 2;
        return zIsIdAutoCaptureEnabled;
    }

    public void setValidationPhase(ValidationPhase validationPhase) {
        int i2 = 2 % 2;
        int i3 = I + 63;
        G = i3 % 128;
        int i4 = i3 % 2;
        this.f11735k.setIdValidationPhase(validationPhase);
        int i5 = G + 101;
        I = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
    }

    public ValidationPhase getValidationPhase() {
        int i2 = 2 % 2;
        int i3 = G + 115;
        I = i3 % 128;
        int i4 = i3 % 2;
        BaseValidationPresenter baseValidationPresenter = this.f11735k;
        if (i4 != 0) {
            return baseValidationPresenter.getValidationPhase();
        }
        baseValidationPresenter.getValidationPhase();
        throw null;
    }

    public IdCategory getIdCategory() {
        int i2 = 2 % 2;
        int i3 = I + 49;
        G = i3 % 128;
        int i4 = i3 % 2;
        BaseValidationPresenter baseValidationPresenter = this.f11735k;
        if (i4 == 0) {
            return baseValidationPresenter.getIdCategory();
        }
        baseValidationPresenter.getIdCategory();
        throw null;
    }

    public IdScan.IdType getDetectedIdType() {
        IdScan.IdType detectedIdType;
        int i2 = 2 % 2;
        int i3 = G + 79;
        I = i3 % 128;
        if (i3 % 2 == 0) {
            detectedIdType = this.f11735k.getDetectedIdType();
            int i4 = 63 / 0;
        } else {
            detectedIdType = this.f11735k.getDetectedIdType();
        }
        int i5 = I + 63;
        G = i5 % 128;
        if (i5 % 2 == 0) {
            return detectedIdType;
        }
        throw null;
    }

    public IdScan.AutocaptureUXMode getAutocaptureUXMode() {
        int i2 = 2 % 2;
        int i3 = I + 55;
        G = i3 % 128;
        int i4 = i3 % 2;
        IdScan.AutocaptureUXMode autocaptureUXMode = this.f11735k.getAutocaptureUXMode();
        int i5 = I + 117;
        G = i5 % 128;
        int i6 = i5 % 2;
        return autocaptureUXMode;
    }

    public DocumentType getDocumentType() {
        int i2 = 2 % 2;
        int i3 = G + 71;
        I = i3 % 128;
        int i4 = i3 % 2;
        BaseValidationPresenter baseValidationPresenter = this.f11735k;
        if (i4 != 0) {
            return baseValidationPresenter.getDocumentType();
        }
        baseValidationPresenter.getDocumentType();
        throw null;
    }

    private Boolean a() {
        int i2 = 2 % 2;
        int i3 = G + 123;
        I = i3 % 128;
        if (i3 % 2 == 0) {
            Boolean.valueOf(this.f11735k.showIdOverlay());
            throw null;
        }
        Boolean boolValueOf = Boolean.valueOf(this.f11735k.showIdOverlay());
        int i4 = G + 13;
        I = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public void onValidationStateChanged(ValidationState validationState) {
        int i2 = 2 % 2;
        int i3 = AnonymousClass3.f11754d[validationState.ordinal()];
        if (i3 == 1) {
            setTitleTextAndVisibility(R.string.onboard_sdk_validation_show_front);
        } else if (i3 == 2) {
            setTitleTextAndVisibility(R.string.onboard_sdk_validation_show_back);
        }
        switch (AnonymousClass3.f11754d[validationState.ordinal()]) {
            case 1:
                int iA = aa.AnonymousClass3.a();
                int iA2 = aa.AnonymousClass3.a();
                int iA3 = aa.AnonymousClass3.a();
                e(aa.AnonymousClass3.a(), iA2, iA, new Object[]{this}, 2016310834, -2016310832, iA3);
                if (a().booleanValue()) {
                    int i4 = I + 23;
                    G = i4 % 128;
                    int i5 = i4 % 2;
                    int iA4 = aa.AnonymousClass3.a();
                    int iA5 = aa.AnonymousClass3.a();
                    int iA6 = aa.AnonymousClass3.a();
                    e(aa.AnonymousClass3.a(), iA5, iA4, new Object[]{this, true}, 1093103209, -1093103208, iA6);
                }
                a(false);
                startValidation();
                return;
            case 2:
                int iA7 = aa.AnonymousClass3.a();
                int iA8 = aa.AnonymousClass3.a();
                int iA9 = aa.AnonymousClass3.a();
                e(aa.AnonymousClass3.a(), iA8, iA7, new Object[]{this}, 2016310834, -2016310832, iA9);
                a(false);
                int iA10 = aa.AnonymousClass3.a();
                int iA11 = aa.AnonymousClass3.a();
                int iA12 = aa.AnonymousClass3.a();
                e(aa.AnonymousClass3.a(), iA11, iA10, new Object[]{this, false}, 1093103209, -1093103208, iA12);
                startValidation();
                return;
            case 3:
            case 4:
            case 5:
            case 6:
                setShutterButtonVisible(false);
                FlashingBorderView flashingBorderView = this.f11743s;
                if (flashingBorderView == null) {
                    return;
                }
                int i6 = I + 101;
                G = i6 % 128;
                if (i6 % 2 == 0) {
                    flashingBorderView.setColor(this.A);
                    return;
                } else {
                    flashingBorderView.setColor(this.A);
                    throw null;
                }
            case 7:
                setTitleVisible(false);
                int iA13 = aa.AnonymousClass3.a();
                int iA14 = aa.AnonymousClass3.a();
                int iA15 = aa.AnonymousClass3.a();
                e(aa.AnonymousClass3.a(), iA14, iA13, new Object[]{this}, 1569325802, -1569325802, iA15);
                setShutterButtonVisible(true);
                return;
            case 8:
                int iA16 = aa.AnonymousClass3.a();
                int iA17 = aa.AnonymousClass3.a();
                int iA18 = aa.AnonymousClass3.a();
                e(aa.AnonymousClass3.a(), iA17, iA16, new Object[]{this}, 2016310834, -2016310832, iA18);
                setTitleVisible(false);
                a(true);
                int iA19 = aa.AnonymousClass3.a();
                int iA20 = aa.AnonymousClass3.a();
                int iA21 = aa.AnonymousClass3.a();
                e(aa.AnonymousClass3.a(), iA20, iA19, new Object[]{this, false}, 1093103209, -1093103208, iA21);
                startValidation();
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0021 A[PHI: r1
  0x0021: PHI (r1v6 android.widget.Button) = (r1v1 android.widget.Button), (r1v7 android.widget.Button) binds: [B:28:0x0041, B:21:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0044 A[PHI: r1
  0x0044: PHI (r1v2 android.widget.Button) = (r1v1 android.widget.Button), (r1v7 android.widget.Button) binds: [B:28:0x0041, B:21:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setShutterButtonVisible(boolean r6) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.G
            int r3 = r0 + 15
            int r0 = r3 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.I = r0
            int r3 = r3 % r4
            r2 = 0
            java.lang.String r1 = "setShutterButtonVisible called, isVisible: %s"
            if (r3 != 0) goto L34
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            timber.log.Timber.d(r1, r0)
            android.widget.Button r1 = r5.E
            if (r6 == 0) goto L44
        L21:
            r0 = r2
        L22:
            r1.setVisibility(r0)
            int r0 = com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.G
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.I = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L33
            r0 = 59
            int r0 = r0 / r2
        L33:
            return
        L34:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            timber.log.Timber.d(r1, r0)
            android.widget.Button r1 = r5.E
            if (r6 == 0) goto L44
            goto L21
        L44:
            r0 = 8
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity.setShutterButtonVisible(boolean):void");
    }

    protected void setTitleVisible(boolean z2) {
        int i2;
        int i3 = 2 % 2;
        int i4 = G;
        int i5 = i4 + 35;
        I = i5 % 128;
        if (i5 % 2 != 0) {
            if (z2) {
                int i6 = i4 + 55;
                I = i6 % 128;
                i2 = i6 % 2 == 0 ? 1 : 0;
                int i7 = i4 + 95;
                I = i7 % 128;
                int i8 = i7 % 2;
            } else {
                i2 = 4;
            }
            TextView textView = this.f11748x;
            if (textView != null) {
                textView.setVisibility(i2);
                return;
            }
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected void setTitleTextAndVisibility(int i2) {
        boolean z2;
        int i3 = 2 % 2;
        if (this.f11748x == null) {
            return;
        }
        String string = getString(i2);
        this.f11748x.setText(string);
        if (string.isEmpty()) {
            int i4 = I + 65;
            G = i4 % 128;
            int i5 = i4 % 2;
            z2 = false;
        } else {
            int i6 = G + 45;
            int i7 = i6 % 128;
            I = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 73;
            G = i9 % 128;
            int i10 = i9 % 2;
            z2 = true;
        }
        setTitleVisible(z2);
    }

    private void a(boolean z2) {
        int i2;
        int i3 = 2 % 2;
        FlashingBorderView flashingBorderView = this.f11743s;
        if (flashingBorderView != null) {
            flashingBorderView.setDrawPassportLine(z2, this.f11733i);
        }
        VignetteView vignetteView = this.f11744t;
        if (vignetteView != null) {
            if (!z2) {
                int i4 = I + 19;
                G = i4 % 128;
                int i5 = i4 % 2;
                i2 = 8;
            } else {
                int i6 = G + 7;
                I = i6 % 128;
                i2 = i6 % 2 == 0 ? 1 : 0;
            }
            vignetteView.setVisibility(i2);
        }
        ImageView imageView = this.D;
        if (imageView != null) {
            imageView.setVisibility(z2 ^ true ? 8 : 0);
        }
        int i7 = G + 117;
        I = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity$3 */
    static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a */
        private static int f11751a = 1;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f11752b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f11753c;

        /* JADX INFO: renamed from: d */
        static final /* synthetic */ int[] f11754d;

        /* JADX INFO: renamed from: e */
        private static int f11755e = 0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            f11752b = iArr;
            try {
                iArr[DocumentType.ADDRESS_STATEMENT.ordinal()] = 1;
                int i2 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11752b[DocumentType.PAYMENT_PROOF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ValidationState.values().length];
            f11754d = iArr2;
            try {
                iArr2[ValidationState.f11842b.ordinal()] = 1;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11754d[ValidationState.f11863w.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11754d[ValidationState.f11844d.ordinal()] = 3;
                int i4 = f11755e + 113;
                f11751a = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11754d[ValidationState.B.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f11754d[ValidationState.N.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f11754d[ValidationState.R.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f11754d[ValidationState.L.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f11754d[ValidationState.Q.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[ValidationPhase.values().length];
            f11753c = iArr3;
            try {
                iArr3[ValidationPhase.SCAN_ID_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f11753c[ValidationPhase.SCAN_PASSPORT.ordinal()] = 2;
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f11753c[ValidationPhase.SCAN_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f11753c[ValidationPhase.SCAN_ID_BACK.ordinal()] = 4;
                int i8 = f11755e + 71;
                f11751a = i8 % 128;
                int i9 = i8 % 2;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.View
    public void onShutterButtonPressed() {
        int i2 = 2 % 2;
        this.f11732h.onNext(new Object());
        int i3 = I + 33;
        G = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraActivity, com.incode.welcome_sdk.ui.camera.CameraContract.View
    public void onPreviewRawFrame(byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = G + 19;
        I = i3 % 128;
        int i4 = i3 % 2;
        if (isIdAutoCaptureEnabled()) {
            int i5 = I + 59;
            G = i5 % 128;
            if (i5 % 2 == 0) {
                super.onPreviewRawFrame(bArr);
                return;
            }
            super.onPreviewRawFrame(bArr);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public Rect getTriggerRectAbsolute() {
        int i2 = 2 % 2;
        int i3 = I;
        int i4 = i3 + 65;
        G = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            throw null;
        }
        Rect rect = this.f11741q;
        int i5 = i3 + 121;
        G = i5 % 128;
        if (i5 % 2 == 0) {
            return rect;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.View
    public Bitmap getCroppedBitmap(Bitmap bitmap, int i2) {
        int i3 = 2 % 2;
        Rect rect = new Rect(this.f11741q);
        int i4 = this.f11749y;
        rect.inset(i4, i4);
        float fC = f.c(bitmap.getWidth(), bitmap.getHeight(), getCameraPreview().getWidth(), getCameraPreview().getHeight());
        Rect rectB = ad.b(rect, fC);
        int i5 = -i2;
        rectB.inset(i5, i5);
        rectB.intersect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Bitmap bitmapCropToRect = BitmapUtils.cropToRect(bitmap, rectB, (int) ((bitmap.getWidth() - (getCameraPreview().getWidth() * fC)) / 2.0f), (int) ((bitmap.getHeight() - (getCameraPreview().getHeight() * fC)) / 2.0f));
        int i6 = G + 1;
        I = i6 % 128;
        int i7 = i6 % 2;
        return bitmapCropToRect;
    }

    public void setUploadProgress(int i2) {
        int i3 = 2 % 2;
        int i4 = I + 79;
        G = i4 % 128;
        if (i4 % 2 != 0) {
            Timber.v("uploadProgress: %s", Integer.valueOf(i2));
        } else {
            Timber.v("uploadProgress: %s", Integer.valueOf(i2));
        }
    }

    public void onUploadStarted(ValidationPhase validationPhase) {
        int i2 = 2 % 2;
        int i3 = I + 3;
        G = i3 % 128;
        if (i3 % 2 != 0) {
            Timber.v("onUploadStarted called", new Object[0]);
        } else {
            Timber.v("onUploadStarted called", new Object[0]);
        }
    }

    protected boolean isPictureProvidedExternally() {
        int i2 = 2 % 2;
        int i3 = G + 83;
        I = i3 % 128;
        int i4 = i3 % 2;
        boolean zIsPictureProvidedExternally = this.f11735k.isPictureProvidedExternally();
        int i5 = I + 91;
        G = i5 % 128;
        int i6 = i5 % 2;
        return zIsPictureProvidedExternally;
    }

    public /* synthetic */ void b(DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        if (getValidationPhase() != null) {
            b();
            int i4 = G + 39;
            I = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 77 / 0;
                return;
            }
            return;
        }
        int i6 = G + 83;
        I = i6 % 128;
        int i7 = i6 % 2;
        Object obj = null;
        e(-2, (Exception) null);
        e(ResultCode.USER_CANCELLED, (Exception) null);
        int i8 = I + 15;
        G = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public void onBackButtonPressed() {
        int i2 = 2 % 2;
        if (isChained()) {
            int i3 = I + 59;
            G = i3 % 128;
            int i4 = i3 % 2;
            finish();
            return;
        }
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                this.f$0.b(dialogInterface, i5);
            }
        });
        int i5 = I + 67;
        G = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private void b() {
        int i2 = 2 % 2;
        int i3 = G + 57;
        I = i3 % 128;
        int i4 = i3 % 2;
        int i5 = AnonymousClass3.f11753c[getValidationPhase().ordinal()];
        if (i5 != 1 && i5 != 2) {
            if (i5 == 3) {
                e(ResultCode.USER_CANCELLED, (Exception) null);
                return;
            } else if (i5 != 4) {
                return;
            }
        }
        e(-2, (Exception) null);
        int i6 = G + 19;
        I = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.camera.CameraActivity
    public void handlePermissionDenied(Exception exc) {
        int i2 = 2 % 2;
        int i3 = G + 83;
        I = i3 % 128;
        int i4 = i3 % 2;
        int i5 = AnonymousClass3.f11753c[getValidationPhase().ordinal()];
        if (i5 != 1 && i5 != 2) {
            if (i5 == 3) {
                e(ResultCode.ERROR, exc);
                int i6 = I + 99;
                G = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 % 3;
                    return;
                }
                return;
            }
            if (i5 != 4) {
                return;
            }
        }
        e(12, exc);
    }

    private void e(int i2, Exception exc) {
        int i3 = 2 % 2;
        IdScanResult idScanResult = new IdScanResult();
        idScanResult.scanStatus = i2;
        if (exc != null) {
            idScanResult.error = exc;
        }
        if (getValidationPhase() == ValidationPhase.SCAN_ID_BACK) {
            getRepo().persistIdBackResult(idScanResult);
        } else {
            getRepo().persistIdFrontResult(idScanResult);
            int i4 = I + 111;
            G = i4 % 128;
            int i5 = i4 % 2;
        }
        this.f11735k.publishResult(idScanResult);
        int i6 = G + 29;
        I = i6 % 128;
        int i7 = i6 % 2;
    }

    private void e(ResultCode resultCode, Exception exc) {
        int i2 = 2 % 2;
        this.f11735k.publishResultOnModuleBus(new DocumentValidationResult(resultCode, exc));
        if (DocumentType.ADDRESS_STATEMENT.equals(getDocumentType())) {
            int i3 = G + 91;
            I = i3 % 128;
            int i4 = i3 % 2;
            IncodeWelcome.getInstance().getOcrDataBus().onNext(IncodeWelcome.OCRData.createEmpty());
            int i5 = I + 63;
            G = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.View
    public void onDocumentValidationCompleted(DocumentValidationResult documentValidationResult) {
        int i2 = 2 % 2;
        int i3 = I + 125;
        G = i3 % 128;
        int i4 = i3 % 2;
        if (documentValidationResult == null) {
            Timber.w("onDocumentValidationCompleted called with null", new Object[0]);
            documentValidationResult = new DocumentValidationResult(ResultCode.ERROR, new IncodeGenericError("onDocumentValidationCompleted called with null"));
            int i5 = G + 17;
            I = i5 % 128;
            int i6 = i5 % 2;
        }
        Timber.d("onDocumentValidationCompleted called, success: %s", documentValidationResult.resultCode);
        this.f11735k.publishResultOnModuleBus(documentValidationResult);
    }

    public void uploadSavedScan() {
        int i2 = 2 % 2;
        int i3 = G + 111;
        I = i3 % 128;
        if (i3 % 2 == 0) {
            this.f11735k.uploadSavedScan();
            int i4 = 19 / 0;
        } else {
            this.f11735k.uploadSavedScan();
        }
    }

    public void proceedCaptureOnlyIdScanResult() {
        int i2 = 2 % 2;
        int i3 = G + 111;
        I = i3 % 128;
        int i4 = i3 % 2;
        this.f11735k.proceedCaptureOnlyIdScanResult();
        int i5 = I + 99;
        G = i5 % 128;
        int i6 = i5 % 2;
    }

    public void proceedDelayedScanResult() {
        int i2 = 2 % 2;
        int i3 = I + 67;
        G = i3 % 128;
        int i4 = i3 % 2;
        this.f11735k.proceedDelayedScanResult();
        int i5 = I + 79;
        G = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity, com.incode.welcome_sdk.ui.BaseView
    public void closeScreen() {
        int i2 = 2 % 2;
        int i3 = G + 5;
        I = i3 % 128;
        int i4 = i3 % 2;
        finish();
        int i5 = G + 65;
        I = i5 % 128;
        int i6 = i5 % 2;
    }

    public void showAutocaptureUI(long j2) {
        int i2 = 2 % 2;
        int i3 = G + 87;
        int i4 = i3 % 128;
        I = i4;
        int i5 = i3 % 2;
        FlashingBorderView flashingBorderView = this.f11743s;
        if (flashingBorderView != null) {
            int i6 = i4 + 23;
            G = i6 % 128;
            int i7 = i6 % 2;
            flashingBorderView.setColorAndFreeze(this.B);
        }
        int i8 = I + 79;
        G = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 93 / 0;
        }
    }

    public void hideAutocaptureUI() {
        int i2 = 2 % 2;
        int i3 = G + 19;
        int i4 = i3 % 128;
        I = i4;
        if (i3 % 2 != 0) {
            FlashingBorderView flashingBorderView = this.f11743s;
            if (flashingBorderView != null) {
                int i5 = i4 + 105;
                G = i5 % 128;
                int i6 = i5 % 2;
                flashingBorderView.setColorAndUnfreeze(this.f11750z);
                return;
            }
            return;
        }
        throw null;
    }

    public void onImageTaken(Bitmap bitmap) {
        int i2 = 2 % 2;
        int i3 = G + 109;
        I = i3 % 128;
        int i4 = i3 % 2;
    }

    public void onDetectionResult(FaceProcessingUtils.FaceProcessingState faceProcessingState) {
        int i2 = 2 % 2;
        int i3 = G + 115;
        I = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 58 / 0;
        }
    }

    public /* synthetic */ void b(IdOrientation idOrientation) {
        int i2 = 2 % 2;
        int i3 = I + 99;
        G = i3 % 128;
        int i4 = i3 % 2;
        updateUiViewsBasedOnScreenDimensionsAndRotation(idOrientation);
        int i5 = G + 81;
        I = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.View
    public void onIdOrientationChanged(final IdOrientation idOrientation) {
        int i2 = 2 % 2;
        int i3 = G + 123;
        I = i3 % 128;
        if (i3 % 2 != 0) {
            runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(idOrientation);
                }
            });
            return;
        }
        runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationActivity$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.b(idOrientation);
            }
        });
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.camera.id_validation.base.BaseValidationContract.View
    public boolean isVoiceOverActive() {
        int i2 = 2 % 2;
        int i3 = G + 65;
        I = i3 % 128;
        if (i3 % 2 != 0) {
            return isAccessibilityTalkBackActive();
        }
        isAccessibilityTalkBackActive();
        throw null;
    }

    public void skipCurrentValidationPhase() {
        int i2 = 2 % 2;
        int i3 = I + 31;
        G = i3 % 128;
        int i4 = i3 % 2;
        this.f11735k.skipCurrentPhase();
        int i5 = G + 13;
        I = i5 % 128;
        int i6 = i5 % 2;
    }

    private void d() {
        int iA = aa.AnonymousClass3.a();
        int iA2 = aa.AnonymousClass3.a();
        int iA3 = aa.AnonymousClass3.a();
        e(aa.AnonymousClass3.a(), iA2, iA, new Object[]{this}, 1569325802, -1569325802, iA3);
    }

    private void d(boolean z2) {
        Object[] objArr = {this, Boolean.valueOf(z2)};
        int iA = aa.AnonymousClass3.a();
        e(aa.AnonymousClass3.a(), aa.AnonymousClass3.a(), iA, objArr, 1093103209, -1093103208, aa.AnonymousClass3.a());
    }

    private void c() {
        int iA = aa.AnonymousClass3.a();
        int iA2 = aa.AnonymousClass3.a();
        int iA3 = aa.AnonymousClass3.a();
        e(aa.AnonymousClass3.a(), iA2, iA, new Object[]{this}, 2016310834, -2016310832, iA3);
    }
}
