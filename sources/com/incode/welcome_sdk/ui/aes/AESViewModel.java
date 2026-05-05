package com.incode.welcome_sdk.ui.aes;

import android.net.Uri;
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.biocatch.client.android.sdk.core.Constants;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.data.local.k;
import com.incode.welcome_sdk.data.remote.beans.ae;
import com.incode.welcome_sdk.data.remote.beans.ag;
import com.incode.welcome_sdk.data.remote.beans.bm;
import com.incode.welcome_sdk.results.AESResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseViewModel;
import com.incode.welcome_sdk.ui.aes.AESScreenState;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class AESViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f10945c = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f10946f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f10947g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f10948h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f10949j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OkHttpClient f10950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StateFlow<AESUiState> f10951b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Function1<? super AESResult, Unit> f10952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MutableStateFlow<AESUiState> f10953e;

    public static /* synthetic */ Object e(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        int i8 = ~i5;
        int i9 = ~i6;
        int i10 = ~i3;
        int i11 = (~(i9 | i10)) | i8;
        int i12 = ~(i6 | i5);
        int i13 = i3 | i12;
        int i14 = (~(i3 | i5)) | (~(i8 | i9 | i10)) | i12 | (~(i6 | i3));
        int i15 = i6 + i5 + i4 + (1272450877 * i7) + ((-51365948) * i2);
        int i16 = i15 * i15;
        int i17 = ((-261444822) * i6) + 922746880 + ((-1437248296) * i5) + ((-1175803474) * i11) + (i13 * 587901737) + (587901737 * i14) + ((-849346560) * i4) + ((-1881145344) * i7) + ((-578813952) * i2) + ((-124846080) * i16);
        int i18 = (i6 * 1187242746) + 1002376400 + (i5 * 1187242392) + (i11 * (-354)) + (i13 * 177) + (i14 * 177) + (i4 * 1187242569) + (i7 * (-1484311963)) + (i2 * 1141305060) + (i16 * 516358144);
        return i17 + ((i18 * i18) * (-861863936)) != 1 ? a(objArr) : c(objArr);
    }

    public AESViewModel() {
        MutableStateFlow<AESUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(AESUiState.f10925b.getInitial());
        this.f10953e = MutableStateFlow;
        this.f10951b = MutableStateFlow;
        this.f10950a = new OkHttpClient();
    }

    public static final /* synthetic */ int access$getLastSignedDocumentIndex(AESViewModel aESViewModel) {
        int i2 = 2 % 2;
        int i3 = f10947g + 1;
        f10949j = i3 % 128;
        int i4 = i3 % 2;
        int iA = aESViewModel.a();
        int i5 = f10947g + 29;
        f10949j = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 76 / 0;
        }
        return iA;
    }

    public static final /* synthetic */ OkHttpClient access$getOkHttpClient$p(AESViewModel aESViewModel) {
        int i2 = 2 % 2;
        int i3 = f10947g + 121;
        f10949j = i3 % 128;
        int i4 = i3 % 2;
        OkHttpClient okHttpClient = aESViewModel.f10950a;
        if (i4 == 0) {
            int i5 = 85 / 0;
        }
        return okHttpClient;
    }

    public static final /* synthetic */ void access$getSignedDocuments(AESViewModel aESViewModel) {
        int i2 = 2 % 2;
        int i3 = f10947g + 91;
        f10949j = i3 % 128;
        int i4 = i3 % 2;
        aESViewModel.e();
        if (i4 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$getUploadUrl(AESViewModel aESViewModel) {
        int i2 = 2 % 2;
        int i3 = f10949j + 121;
        f10947g = i3 % 128;
        int i4 = i3 % 2;
        aESViewModel.c();
        int i5 = f10947g + 9;
        f10949j = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ MutableStateFlow access$get_uiState$p(AESViewModel aESViewModel) {
        int i2 = 2 % 2;
        int i3 = f10947g + 65;
        int i4 = i3 % 128;
        f10949j = i4;
        int i5 = i3 % 2;
        MutableStateFlow<AESUiState> mutableStateFlow = aESViewModel.f10953e;
        int i6 = i4 + 5;
        f10947g = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 72 / 0;
        }
        return mutableStateFlow;
    }

    public static final /* synthetic */ Object access$handleResponseData(AESViewModel aESViewModel, Object obj, Continuation continuation) {
        int i2 = 2 % 2;
        int i3 = f10947g + 1;
        f10949j = i3 % 128;
        int i4 = i3 % 2;
        Object objB = aESViewModel.b(obj, (Continuation<? super Unit>) continuation);
        int i5 = f10949j + 1;
        f10947g = i5 % 128;
        if (i5 % 2 == 0) {
            return objB;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object access$invokeWithDelay(AESViewModel aESViewModel, Function1 function1, AESResult aESResult, Continuation continuation) {
        int i2 = 2 % 2;
        int i3 = f10947g + 57;
        f10949j = i3 % 128;
        if (i3 % 2 == 0) {
            aESViewModel.a((Function1<? super AESResult, Unit>) function1, aESResult, (Continuation<? super Unit>) continuation);
            throw null;
        }
        Object objA = aESViewModel.a((Function1<? super AESResult, Unit>) function1, aESResult, (Continuation<? super Unit>) continuation);
        int i4 = f10947g + 17;
        f10949j = i4 % 128;
        int i5 = i4 % 2;
        return objA;
    }

    public static final /* synthetic */ void access$signDocuments(AESViewModel aESViewModel, List list, int i2, bm bmVar) {
        int i3 = 2 % 2;
        int i4 = f10949j + 27;
        f10947g = i4 % 128;
        int i5 = i4 % 2;
        aESViewModel.b(list, i2, bmVar);
        int i6 = f10949j + 99;
        f10947g = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 78 / 0;
        }
    }

    public static final /* synthetic */ void access$startDownloadingDocuments(AESViewModel aESViewModel) {
        int i2 = 2 % 2;
        int i3 = f10947g + 75;
        f10949j = i3 % 128;
        if (i3 % 2 != 0) {
            int iD = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
            int iD2 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
            int iD3 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
            e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d(), iD, iD2, 50638389, -50638389, iD3, new Object[]{aESViewModel});
            return;
        }
        int iD4 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
        int iD5 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
        int iD6 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
        e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d(), iD4, iD5, 50638389, -50638389, iD6, new Object[]{aESViewModel});
        throw null;
    }

    public static final /* synthetic */ void access$updateScreenState(AESViewModel aESViewModel, AESScreenState aESScreenState) {
        int i2 = 2 % 2;
        int i3 = f10947g + 87;
        f10949j = i3 % 128;
        int i4 = i3 % 2;
        aESViewModel.b(aESScreenState);
        int i5 = f10949j + 37;
        f10947g = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final StateFlow<AESUiState> getUiState() {
        int i2 = 2 % 2;
        int i3 = f10949j + 27;
        int i4 = i3 % 128;
        f10947g = i4;
        int i5 = i3 % 2;
        StateFlow<AESUiState> stateFlow = this.f10951b;
        int i6 = i4 + 85;
        f10949j = i6 % 128;
        if (i6 % 2 != 0) {
            return stateFlow;
        }
        throw null;
    }

    public final Function1<AESResult, Unit> getOnResult() {
        int i2 = 2 % 2;
        int i3 = f10949j;
        int i4 = i3 + 81;
        f10947g = i4 % 128;
        int i5 = i4 % 2;
        Function1 function1 = this.f10952d;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i6 = i3 + 3;
        f10947g = i6 % 128;
        int i7 = i6 % 2;
        return function1;
    }

    public final void setOnResult(Function1<? super AESResult, Unit> function1) {
        int i2 = 2 % 2;
        int i3 = f10949j + 95;
        f10947g = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.f10952d = function1;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            this.f10952d = function1;
            throw null;
        }
    }

    public static final class Companion {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10954b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10955c = 1;

        private Companion() {
        }

        public final AESViewModel get(ViewModelStoreOwner viewModelStoreOwner) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(viewModelStoreOwner, "");
            AESViewModel aESViewModel = (AESViewModel) new ViewModelProvider(viewModelStoreOwner).get(AESViewModel.class);
            int i3 = f10954b + 111;
            f10955c = i3 % 128;
            int i4 = i3 % 2;
            return aESViewModel;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void onViewCreated(boolean z2, boolean z3, Function1<? super AESResult, Unit> function1) throws Throwable {
        AESUiState value;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        MutableStateFlow<AESUiState> mutableStateFlow = this.f10953e;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, AESUiState.copy$default(value, null, null, false, false, false, z2, z3, null, null, null, 927, null)));
        setOnResult(function1);
        com.incode.welcome_sdk.data.remote.e.d dVar = com.incode.welcome_sdk.data.remote.e.d.f10134b;
        com.incode.welcome_sdk.data.remote.e.b bVarA = com.incode.welcome_sdk.data.remote.e.d.a();
        com.incode.welcome_sdk.data.remote.b bVar = com.incode.welcome_sdk.data.remote.b.f8977c;
        com.incode.welcome_sdk.data.remote.b.e(bVarA);
        Object obj = null;
        if (z2) {
            int i3 = f10947g + 61;
            f10949j = i3 % 128;
            int i4 = i3 % 2;
            b(AESScreenState.UploadDocument.f10915e);
            int i5 = f10949j + 97;
            f10947g = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int iD = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
        int iD2 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
        int iD3 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
        e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d(), iD, iD2, 50638389, -50638389, iD3, new Object[]{this});
        int i6 = f10949j + 65;
        f10947g = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        AESViewModel aESViewModel = (AESViewModel) objArr[0];
        int i2 = 2 % 2;
        int i3 = f10949j + 117;
        f10947g = i3 % 128;
        if (i3 % 2 != 0) {
            aESViewModel.b(AESScreenState.FetchingUnsignedDocuments.f10880b);
            aESViewModel.d();
            int i4 = 57 / 0;
            return null;
        }
        aESViewModel.b(AESScreenState.FetchingUnsignedDocuments.f10880b);
        aESViewModel.d();
        return null;
    }

    public final void onTermsAndConditionsIsChecked(boolean z2) {
        AESUiState value;
        int i2 = 2 % 2;
        int i3 = f10947g;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f10949j = i4 % 128;
        int i5 = i4 % 2;
        MutableStateFlow<AESUiState> mutableStateFlow = this.f10953e;
        int i6 = i3 + 67;
        f10949j = i6 % 128;
        int i7 = i6 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, AESUiState.copy$default(value, null, null, z2, false, false, false, false, null, null, null, 1019, null)));
    }

    public final void onSignGenerateCertificateIsChecked(boolean z2) {
        AESUiState value;
        int i2 = 2 % 2;
        int i3 = f10949j;
        int i4 = i3 + 83;
        f10947g = i4 % 128;
        int i5 = i4 % 2;
        MutableStateFlow<AESUiState> mutableStateFlow = this.f10953e;
        int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f10947g = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 3 / 3;
        }
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, AESUiState.copy$default(value, null, null, false, z2, false, false, false, null, null, null, 1015, null)));
    }

    public final void onSignLegalBindingIsChecked(boolean z2) {
        MutableStateFlow<AESUiState> mutableStateFlow;
        AESUiState value;
        int i2 = 2 % 2;
        int i3 = f10949j + 47;
        f10947g = i3 % 128;
        if (i3 % 2 != 0) {
            mutableStateFlow = this.f10953e;
            int i4 = 78 / 0;
        } else {
            mutableStateFlow = this.f10953e;
        }
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, AESUiState.copy$default(value, null, null, false, false, z2, false, false, null, null, null, 1007, null)));
        int i5 = f10947g + 107;
        f10949j = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10994a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10995d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10997c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f10995d + 21;
            f10994a = i3 % 128;
            int i4 = i3 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AESViewModel.access$updateScreenState(AESViewModel.this, AESScreenState.SigningDocument.f10903e);
            AESViewModel aESViewModel = AESViewModel.this;
            AESViewModel.a(aESViewModel, aESViewModel.getUiState().getValue().getPdfDocuments(), AESViewModel.access$getLastSignedDocumentIndex(AESViewModel.this));
            Unit unit = Unit.INSTANCE;
            int i5 = f10994a + 25;
            f10995d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 0 / 0;
            }
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f10995d + 69;
            f10994a = i3 % 128;
            int i4 = i3 % 2;
            Object objA = a(coroutineScope, continuation);
            int i5 = f10995d + 83;
            f10994a = i5 % 128;
            int i6 = i5 % 2;
            return objA;
        }

        private Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f10995d + 111;
            f10994a = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i4 == 0) {
                int i5 = 30 / 0;
            }
            int i6 = f10995d + 65;
            f10994a = i6 % 128;
            int i7 = i6 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            i iVar = AESViewModel.this.new i(continuation);
            int i3 = f10995d + 121;
            f10994a = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 35 / 0;
            }
            return iVar;
        }

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }
    }

    public final void onContinueButtonClicked() {
        int i2 = 2 % 2;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new i(null), 3, null);
        int i3 = f10949j + 81;
        f10947g = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onContinueAndFinishButtonClicked() {
        int i2 = 2 % 2;
        getOnResult().invoke(new AESResult(ResultCode.SUCCESS, true, false, 4, null));
        int i3 = f10949j + 61;
        f10947g = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onPDFSelected(Uri uri) {
        AESUiState value;
        int i2 = 2 % 2;
        int i3 = f10947g + 103;
        f10949j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(uri, "");
        MutableStateFlow<AESUiState> mutableStateFlow = this.f10953e;
        int i5 = f10947g + 115;
        f10949j = i5 % 128;
        int i6 = i5 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, AESUiState.copy$default(value, null, null, false, false, false, false, false, uri, null, null, 895, null)));
    }

    public final void onRemovePDFClicked() {
        AESUiState value;
        Uri uri;
        int i2 = 2 % 2;
        int i3 = f10947g + 111;
        f10949j = i3 % 128;
        if (i3 % 2 != 0) {
            MutableStateFlow<AESUiState> mutableStateFlow = this.f10953e;
            do {
                value = mutableStateFlow.getValue();
                uri = Uri.EMPTY;
                Intrinsics.checkNotNullExpressionValue(uri, "");
            } while (!mutableStateFlow.compareAndSet(value, AESUiState.copy$default(value, null, null, false, false, false, false, false, uri, null, null, 895, null)));
            int i4 = f10949j + 91;
            f10947g = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10990b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10991e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10992a;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f10990b + 29;
            f10991e = i3 % 128;
            int i4 = i3 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            AESViewModel.access$updateScreenState(AESViewModel.this, AESScreenState.GeneratingUploadLink.f10886a);
            AESViewModel.access$getUploadUrl(AESViewModel.this);
            Unit unit = Unit.INSTANCE;
            int i5 = f10991e + 89;
            f10990b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f10991e + 117;
            f10990b = i3 % 128;
            int i4 = i3 % 2;
            Object objB = b(coroutineScope, continuation);
            int i5 = f10991e + 7;
            f10990b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 92 / 0;
            }
            return objB;
        }

        private Object b(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f10991e + 105;
            f10990b = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f10991e + 45;
            f10990b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 72 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            h hVar = AESViewModel.this.new h(continuation);
            int i3 = f10991e + 69;
            f10990b = i3 % 128;
            int i4 = i3 % 2;
            return hVar;
        }

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }
    }

    public final void onAESUploadContinueBtnClicked() {
        int i2 = 2 % 2;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new h(null), 2, null);
        int i3 = f10947g + 121;
        f10949j = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 8 / 0;
        }
    }

    public final void onUploadRequestBodyBuilt(RequestBody requestBody) {
        MutableStateFlow<AESUiState> mutableStateFlow;
        AESUiState value;
        int i2 = 2 % 2;
        int i3 = f10949j + 19;
        f10947g = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(requestBody, "");
            mutableStateFlow = this.f10953e;
            int i4 = 65 / 0;
        } else {
            Intrinsics.checkNotNullParameter(requestBody, "");
            mutableStateFlow = this.f10953e;
        }
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, AESUiState.copy$default(value, null, null, false, false, false, false, false, null, null, requestBody, FrameMetricsAggregator.EVERY_DURATION, null)));
        int i5 = f10949j + 5;
        f10947g = i5 % 128;
        int i6 = i5 % 2;
        d(this.f10951b.getValue().getPresignedUploadUrl(), requestBody);
    }

    public final void retryLastNetworkCall() {
        AESScreenState.NoInternetConnection noInternetConnection;
        RequestBody requestBody;
        int i2 = 2 % 2;
        AESScreenState aesScreenState = this.f10953e.getValue().getAesScreenState();
        Object obj = null;
        if (aesScreenState instanceof AESScreenState.NoInternetConnection) {
            int i3 = f10947g + 121;
            f10949j = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            noInternetConnection = (AESScreenState.NoInternetConnection) aesScreenState;
        } else {
            noInternetConnection = null;
        }
        if (noInternetConnection == null) {
            int i4 = f10947g + 97;
            f10949j = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        LastAPICallState lastAPICall = noInternetConnection.getLastAPICall();
        if (Intrinsics.areEqual(lastAPICall, AESScreenState.FetchingUnsignedDocuments.f10880b)) {
            b(AESScreenState.FetchingUnsignedDocuments.f10880b);
            d();
            return;
        }
        if (Intrinsics.areEqual(lastAPICall, AESScreenState.SigningDocument.f10903e)) {
            b(AESScreenState.SigningDocument.f10903e);
            a(this, this.f10951b.getValue().getPdfDocuments(), a());
            return;
        }
        if (!Intrinsics.areEqual(lastAPICall, AESScreenState.GeneratingUploadLink.f10886a)) {
            if ((!Intrinsics.areEqual(lastAPICall, AESScreenState.UploadingDocument.f10916a)) || (requestBody = this.f10951b.getValue().getRequestBody()) == null) {
                return;
            }
            b(AESScreenState.UploadingDocument.f10916a);
            d(this.f10951b.getValue().getPresignedUploadUrl(), requestBody);
            return;
        }
        int i6 = f10947g + 11;
        f10949j = i6 % 128;
        if (i6 % 2 != 0) {
            b(AESScreenState.GeneratingUploadLink.f10886a);
            c();
        } else {
            b(AESScreenState.GeneratingUploadLink.f10886a);
            c();
            obj.hashCode();
            throw null;
        }
    }

    static final class o extends Lambda implements Function1<bm, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f11030a = new o();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f11031b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11032c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f11033d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f11034e = 0;

        private static void b(bm bmVar) {
            int i2 = 2 % 2;
            int i3 = f11034e + 105;
            f11031b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(bmVar, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(bmVar, "");
            int i4 = f11031b + 125;
            f11034e = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(bm bmVar) {
            int i2 = 2 % 2;
            int i3 = f11034e + 23;
            f11031b = i3 % 128;
            int i4 = i3 % 2;
            b(bmVar);
            Unit unit = Unit.INSTANCE;
            int i5 = f11031b + 1;
            f11034e = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i2 = f11033d + 23;
            f11032c = i2 % 128;
            int i3 = i2 % 2;
        }

        o() {
            super(1);
        }
    }

    private static /* synthetic */ void b(AESViewModel aESViewModel, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = f10949j + 59;
        f10947g = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {aESViewModel, o.f11030a, function1};
        e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d(), com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d(), com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d(), 1876838396, -1876838395, com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d(), objArr);
        int i5 = f10949j + 111;
        f10947g = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f11003b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f11004c = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f11005g = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f11006i = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Function1<bm, Unit> f11007a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f11008d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Function1<Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends T>>>, Object> f11009e;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ AESViewModel f11010h;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.incode.welcome_sdk.ui.aes.AESViewModel$l for r5v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r3 = 2
                int r0 = r3 % r3
                int r0 = com.incode.welcome_sdk.ui.aes.AESViewModel.l.f11006i
                int r1 = r0 + 53
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.aes.AESViewModel.l.f11005g = r0
                int r1 = r1 % r3
                r2 = 1
                if (r1 != 0) goto L2e
                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f11008d
                r0 = 78
                int r0 = r0 / 0
                if (r1 == 0) goto L3b
                if (r1 == r2) goto L49
                if (r1 != r3) goto L70
            L1f:
                kotlin.ResultKt.throwOnFailure(r6)
                int r0 = com.incode.welcome_sdk.ui.aes.AESViewModel.l.f11006i
                int r1 = r0 + 103
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.aes.AESViewModel.l.f11005g = r0
                int r1 = r1 % r3
            L2b:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L2e:
                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r5.f11008d
                if (r0 == 0) goto L3b
                if (r0 == r2) goto L49
                if (r0 != r3) goto L70
                goto L1f
            L3b:
                kotlin.ResultKt.throwOnFailure(r6)
                kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends T>>>, java.lang.Object> r0 = r5.f11009e
                r5.f11008d = r2
                java.lang.Object r6 = r0.invoke(r5)
                if (r6 != r4) goto L4c
                return r4
            L49:
                kotlin.ResultKt.throwOnFailure(r6)
            L4c:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.incode.welcome_sdk.ui.aes.AESViewModel$l$3 r2 = new com.incode.welcome_sdk.ui.aes.AESViewModel$l$3
                kotlin.jvm.functions.Function1<com.incode.welcome_sdk.data.remote.beans.bm, kotlin.Unit> r1 = r5.f11007a
                com.incode.welcome_sdk.ui.aes.AESViewModel r0 = r5.f11010h
                r2.<init>()
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                r0 = r5
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r5.f11008d = r3
                java.lang.Object r0 = r6.collect(r2, r0)
                if (r0 != r4) goto L2b
                int r0 = com.incode.welcome_sdk.ui.aes.AESViewModel.l.f11006i
                int r1 = r0 + 81
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.aes.AESViewModel.l.f11005g = r0
                int r1 = r1 % r3
                if (r1 == 0) goto L78
                return r4
            L70:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L78:
                r0 = 0
                r0.hashCode()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.aes.AESViewModel.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static int c() {
            int i2 = f11004c;
            int i3 = i2 % 5563669;
            f11004c = i2 + 1;
            if (i3 != 0) {
                return f11003b;
            }
            int iNextInt = new Random().nextInt();
            f11003b = iNextInt;
            return iNextInt;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f11005g + 103;
            f11006i = i3 % 128;
            int i4 = i3 % 2;
            Object objD = d(coroutineScope, continuation);
            if (i4 != 0) {
                int i5 = 19 / 0;
            }
            return objD;
        }

        private Object d(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f11005g + 117;
            f11006i = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f11006i + 125;
            f11005g = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            l lVar = new l(this.f11009e, this.f11007a, this.f11010h, continuation);
            int i3 = f11005g + 9;
            f11006i = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 91 / 0;
            }
            return lVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(Function1<? super Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends T>>>, ? extends Object> function1, Function1<? super bm, Unit> function12, AESViewModel aESViewModel, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f11009e = function1;
            this.f11007a = function12;
            this.f11010h = aESViewModel;
        }
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        AESViewModel aESViewModel = (AESViewModel) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        int i2 = 2 % 2;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(aESViewModel), Dispatchers.getIO(), null, new l((Function1) objArr[2], function1, aESViewModel, null), 2, null);
        int i3 = f10949j + 25;
        f10947g = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 21 / 0;
        }
        return null;
    }

    static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10956b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10957d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10959c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f10956b + 85;
            f10957d = i3 % 128;
            int i4 = i3 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.f10959c;
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                if (((AESUiState) AESViewModel.access$get_uiState$p(AESViewModel.this).getValue()).getDownloadDocument()) {
                    AESViewModel.access$updateScreenState(AESViewModel.this, AESScreenState.FetchingSignedDocuments.f10876e);
                    AESViewModel.access$getSignedDocuments(AESViewModel.this);
                } else {
                    AESViewModel aESViewModel = AESViewModel.this;
                    this.f10959c = 1;
                    if (AESViewModel.access$invokeWithDelay(aESViewModel, aESViewModel.getOnResult(), new AESResult(ResultCode.SUCCESS, true, false, 4, null), this) == coroutine_suspended) {
                        int i6 = f10957d + 5;
                        f10956b = i6 % 128;
                        if (i6 % 2 != 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f10956b + 65;
            f10957d = i3 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i3 % 2 != 0) {
                d(coroutineScope2, continuation2);
                throw null;
            }
            Object objD = d(coroutineScope2, continuation2);
            int i4 = f10956b + 97;
            f10957d = i4 % 128;
            int i5 = i4 % 2;
            return objD;
        }

        private Object d(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f10957d + 45;
            f10956b = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i4 == 0) {
                int i5 = 67 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            a aVar = AESViewModel.this.new a(continuation);
            int i3 = f10956b + 33;
            f10957d = i3 % 128;
            int i4 = i3 % 2;
            return aVar;
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <T> java.lang.Object b(T r24, kotlin.coroutines.Continuation<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.aes.AESViewModel.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static final class d extends SuspendLambda implements Function1<Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ae>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10966a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10967e = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10968c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f10966a + 55;
            f10967e = i3 % 128;
            Object obj2 = null;
            if (i3 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f10968c;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                com.incode.welcome_sdk.data.remote.b bVar = com.incode.welcome_sdk.data.remote.b.f8977c;
                k kVar = k.f8613e;
                String strE = k.e();
                this.f10968c = 1;
                obj = com.incode.welcome_sdk.data.remote.b.c(strE);
                if (obj == coroutine_suspended) {
                    int i5 = f10966a + 15;
                    f10967e = i5 % 128;
                    if (i5 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i6 = f10966a + 17;
                f10967e = i6 % 128;
                int i7 = i6 % 2;
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ae>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f10966a + 41;
            f10967e = i3 % 128;
            Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ae>>> continuation2 = continuation;
            if (i3 % 2 == 0) {
                c(continuation2);
                throw null;
            }
            Object objC = c(continuation2);
            int i4 = f10966a + 59;
            f10967e = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 40 / 0;
            }
            return objC;
        }

        private Object c(Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<ae>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f10967e + 99;
            f10966a = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((d) create(continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f10966a + 27;
            f10967e = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i2 = 2 % 2;
            d dVar = new d(continuation);
            int i3 = f10966a + 107;
            f10967e = i3 % 128;
            int i4 = i3 % 2;
            return dVar;
        }

        d(Continuation<? super d> continuation) {
            super(1, continuation);
        }
    }

    private final void d() {
        int i2 = 2 % 2;
        b(this, (Function1) new d(null));
        int i3 = f10947g + 27;
        f10949j = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private final int a() {
        int i2 = 2 % 2;
        List<DocumentState> pdfDocuments = this.f10953e.getValue().getPdfDocuments();
        int i3 = 0;
        if ((pdfDocuments instanceof Collection) && pdfDocuments.isEmpty()) {
            int i4 = f10947g + 101;
            f10949j = i4 % 128;
            return i4 % 2 == 0 ? 1 : 0;
        }
        Iterator<T> it = pdfDocuments.iterator();
        while (it.hasNext()) {
            int i5 = f10949j + 53;
            f10947g = i5 % 128;
            int i6 = i5 % 2;
            if (((DocumentState) it.next()).getSigned()) {
                int i7 = f10947g + 33;
                f10949j = i7 % 128;
                int i8 = i7 % 2;
                i3++;
                if (i3 < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        int i9 = f10947g + 117;
        f10949j = i9 % 128;
        int i10 = i9 % 2;
        return i3;
    }

    static /* synthetic */ void a(AESViewModel aESViewModel, List list, int i2) {
        int i3 = 2 % 2;
        int i4 = f10949j + 111;
        f10947g = i4 % 128;
        int i5 = i4 % 2;
        aESViewModel.b(list, i2, null);
        if (i5 != 0) {
            int i6 = 78 / 0;
        }
    }

    static final class g extends Lambda implements Function1<bm, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10980b = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f10981j = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f10982a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ List<DocumentState> f10984d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ DocumentState f10985e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(bm bmVar) {
            int i2 = 2 % 2;
            int i3 = f10980b + 33;
            f10981j = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            c(bmVar);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                throw null;
            }
            int i5 = f10980b + 1;
            f10981j = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.aes.AESViewModel$g$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f10986d = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f10987e = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ AESViewModel f10988b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f10989c;

            /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
            
                if (r0 == 1) goto L7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
            
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
            
                if (r1 == 1) goto L7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
            
                kotlin.ResultKt.throwOnFailure(r14);
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    r6 = 2
                    int r0 = r6 % r6
                    int r0 = com.incode.welcome_sdk.ui.aes.AESViewModel.g.AnonymousClass5.f10986d
                    int r1 = r0 + 95
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.aes.AESViewModel.g.AnonymousClass5.f10987e = r0
                    int r1 = r1 % r6
                    r5 = 49
                    r4 = 1
                    if (r1 != 0) goto L23
                    java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r13.f10989c
                    int r0 = r5 / 0
                    if (r1 == 0) goto L2e
                    if (r1 != r4) goto L5d
                L1d:
                    kotlin.ResultKt.throwOnFailure(r14)
                L20:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L23:
                    java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r0 = r13.f10989c
                    if (r0 == 0) goto L2e
                    if (r0 != r4) goto L5d
                    goto L1d
                L2e:
                    kotlin.ResultKt.throwOnFailure(r14)
                    com.incode.welcome_sdk.ui.aes.AESViewModel r2 = r13.f10988b
                    kotlin.jvm.functions.Function1 r1 = r2.getOnResult()
                    com.incode.welcome_sdk.results.AESResult r7 = new com.incode.welcome_sdk.results.AESResult
                    com.incode.welcome_sdk.results.ResultCode r8 = com.incode.welcome_sdk.results.ResultCode.ERROR
                    r11 = 4
                    r12 = 0
                    r9 = 0
                    r10 = 0
                    r7.<init>(r8, r9, r10, r11, r12)
                    r0 = r13
                    kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                    r13.f10989c = r4
                    java.lang.Object r0 = com.incode.welcome_sdk.ui.aes.AESViewModel.access$invokeWithDelay(r2, r1, r7, r0)
                    if (r0 != r3) goto L20
                    int r2 = com.incode.welcome_sdk.ui.aes.AESViewModel.g.AnonymousClass5.f10987e
                    int r1 = r2 + 47
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.aes.AESViewModel.g.AnonymousClass5.f10986d = r0
                    int r1 = r1 % r6
                    int r2 = r2 + r5
                    int r0 = r2 % 128
                    com.incode.welcome_sdk.ui.aes.AESViewModel.g.AnonymousClass5.f10986d = r0
                    int r2 = r2 % r6
                    return r3
                L5d:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.aes.AESViewModel.g.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f10986d + 7;
                f10987e = i3 % 128;
                int i4 = i3 % 2;
                Object objD = d(coroutineScope, continuation);
                int i5 = f10986d + 41;
                f10987e = i5 % 128;
                if (i5 % 2 != 0) {
                    return objD;
                }
                throw null;
            }

            private Object d(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f10987e + 55;
                f10986d = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i5 = f10986d + 123;
                f10987e = i5 % 128;
                if (i5 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.f10988b, continuation);
                int i3 = f10986d + 73;
                f10987e = i3 % 128;
                int i4 = i3 % 2;
                return anonymousClass5;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(AESViewModel aESViewModel, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.f10988b = aESViewModel;
            }
        }

        private void c(bm bmVar) {
            Object value;
            AESUiState aESUiState;
            List mutableList;
            int i2 = 2 % 2;
            int i3 = f10981j + 85;
            f10980b = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(bmVar, "");
                bmVar.b();
                throw null;
            }
            Intrinsics.checkNotNullParameter(bmVar, "");
            if (!bmVar.b()) {
                AESViewModel.access$updateScreenState(AESViewModel.this, AESScreenState.SigningFailed.f10906c);
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(AESViewModel.this), Dispatchers.getIO(), null, new AnonymousClass5(AESViewModel.this, null), 2, null);
                return;
            }
            MutableStateFlow mutableStateFlowAccess$get_uiState$p = AESViewModel.access$get_uiState$p(AESViewModel.this);
            int i4 = this.f10982a;
            DocumentState documentState = this.f10985e;
            do {
                value = mutableStateFlowAccess$get_uiState$p.getValue();
                aESUiState = (AESUiState) value;
                mutableList = CollectionsKt.toMutableList((Collection) aESUiState.getPdfDocuments());
                mutableList.set(i4, DocumentState.copy$default(documentState, null, true, 1, null));
            } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, AESUiState.copy$default(aESUiState, null, mutableList, false, false, false, false, false, null, null, null, 1021, null)));
            int i5 = f10981j + 113;
            f10980b = i5 % 128;
            int i6 = i5 % 2;
            AESViewModel.access$signDocuments(AESViewModel.this, this.f10984d, this.f10982a + 1, bmVar);
            int i7 = f10980b + 51;
            f10981j = i7 % 128;
            int i8 = i7 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(List<DocumentState> list, int i2, DocumentState documentState) {
            super(1);
            this.f10984d = list;
            this.f10982a = i2;
            this.f10985e = documentState;
        }
    }

    static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10998c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10999d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ bm f11000a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f11002e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f10998c + 33;
            f10999d = i3 % 128;
            int i4 = i3 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.f11002e;
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f11002e = 1;
                if (AESViewModel.access$handleResponseData(AESViewModel.this, this.f11000a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i6 = f10999d + 73;
            f10998c = i6 % 128;
            if (i6 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f10998c + 13;
            f10999d = i3 % 128;
            int i4 = i3 % 2;
            Object objA = a(coroutineScope, continuation);
            if (i4 == 0) {
                int i5 = 13 / 0;
            }
            int i6 = f10998c + 33;
            f10999d = i6 % 128;
            if (i6 % 2 != 0) {
                return objA;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f10998c + 15;
            f10999d = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            j jVar = (j) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                jVar.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = jVar.invokeSuspend(unit);
            int i5 = f10998c + 25;
            f10999d = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            j jVar = AESViewModel.this.new j(this.f11000a, continuation);
            int i3 = f10998c + 71;
            f10999d = i3 % 128;
            if (i3 % 2 != 0) {
                return jVar;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(bm bmVar, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f11000a = bmVar;
        }
    }

    private final void b(List<DocumentState> list, int i2, bm bmVar) {
        int i3 = 2 % 2;
        int i4 = f10949j + 79;
        f10947g = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            if (i2 < list.size()) {
                DocumentState documentState = list.get(i2);
                e(documentState.getDocument().e(), new g(list, i2, documentState));
                int i5 = f10947g + 3;
                f10949j = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 67 / 0;
                    return;
                }
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new j(bmVar, null), 2, null);
            return;
        }
        list.size();
        obj.hashCode();
        throw null;
    }

    static final class f extends SuspendLambda implements Function1<Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends bm>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10976a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10977c = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ String f10978b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f10979e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            int i2 = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f10979e;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("documentRef", this.f10978b);
                jSONObject.putOpt("userConsented", Boxing.boxBoolean(true));
                RequestBody.Companion companion = RequestBody.Companion;
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                RequestBody requestBodyCreate = companion.create(string, MediaType.Companion.get(Constants.WUP_CONTENT_TYPE));
                com.incode.welcome_sdk.data.remote.b bVar = com.incode.welcome_sdk.data.remote.b.f8977c;
                k kVar = k.f8613e;
                String strE = k.e();
                this.f10979e = 1;
                obj = com.incode.welcome_sdk.data.remote.b.d(new Object[]{strE, requestBodyCreate}, IncodeWelcome.bm.e(), IncodeWelcome.bm.e(), IncodeWelcome.bm.e(), 1963422871, -1963422870, IncodeWelcome.bm.e());
                if (obj == coroutine_suspended) {
                    int i4 = f10977c + 105;
                    f10976a = i4 % 128;
                    int i5 = i4 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i6 = f10976a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f10977c = i6 % 128;
                int i7 = i6 % 2;
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends bm>>> continuation) throws JSONException {
            int i2 = 2 % 2;
            int i3 = f10976a + 111;
            f10977c = i3 % 128;
            int i4 = i3 % 2;
            Object objA = a(continuation);
            if (i4 != 0) {
                int i5 = 40 / 0;
            }
            int i6 = f10976a + 37;
            f10977c = i6 % 128;
            if (i6 % 2 == 0) {
                return objA;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private Object a(Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<bm>>> continuation) throws JSONException {
            int i2 = 2 % 2;
            int i3 = f10976a + 87;
            f10977c = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((f) create(continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f10976a + 43;
            f10977c = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i2 = 2 % 2;
            f fVar = new f(this.f10978b, continuation);
            int i3 = f10976a + 17;
            f10977c = i3 % 128;
            int i4 = i3 % 2;
            return fVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Continuation<? super f> continuation) {
            super(1, continuation);
            this.f10978b = str;
        }
    }

    private final void e(String str, Function1<? super bm, Unit> function1) {
        int i2 = 2 % 2;
        Object[] objArr = {this, function1, new f(str, null)};
        e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d(), com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d(), com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d(), 1876838396, -1876838395, com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d(), objArr);
        int i3 = f10947g + 23;
        f10949j = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class c extends SuspendLambda implements Function1<Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ae>>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10963d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10964e = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10965c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f10964e + 73;
            f10963d = i3 % 128;
            if (i3 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f10965c;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                com.incode.welcome_sdk.data.remote.b bVar = com.incode.welcome_sdk.data.remote.b.f8977c;
                k kVar = k.f8613e;
                String strE = k.e();
                this.f10965c = 1;
                obj = com.incode.welcome_sdk.data.remote.b.d(strE);
                if (obj == coroutine_suspended) {
                    int i5 = f10964e + 3;
                    f10963d = i5 % 128;
                    int i6 = i5 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            int i7 = f10963d + 49;
            f10964e = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 23 / 0;
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ae>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f10963d + 103;
            f10964e = i3 % 128;
            int i4 = i3 % 2;
            Object objD = d(continuation);
            int i5 = f10964e + 73;
            f10963d = i5 % 128;
            int i6 = i5 % 2;
            return objD;
        }

        private Object d(Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<ae>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f10964e + 71;
            f10963d = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f10964e + 41;
            f10963d = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i2 = 2 % 2;
            c cVar = new c(continuation);
            int i3 = f10964e + 35;
            f10963d = i3 % 128;
            int i4 = i3 % 2;
            return cVar;
        }

        c(Continuation<? super c> continuation) {
            super(1, continuation);
        }
    }

    private final void e() {
        int i2 = 2 % 2;
        b(this, (Function1) new c(null));
        int i3 = f10947g + 17;
        f10949j = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 12 / 0;
        }
    }

    static final class b extends SuspendLambda implements Function1<Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ag>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10960a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10961d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10962b;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f10960a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f10961d = i3 % 128;
            int i4 = i3 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.f10962b;
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                com.incode.welcome_sdk.data.remote.b bVar = com.incode.welcome_sdk.data.remote.b.f8977c;
                k kVar = k.f8613e;
                String strE = k.e();
                this.f10962b = 1;
                obj = com.incode.welcome_sdk.data.remote.b.a(strE);
                if (obj == coroutine_suspended) {
                    int i6 = f10960a + 29;
                    f10961d = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 82 / 0;
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i8 = f10960a + 117;
                f10961d = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 5 / 4;
                }
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ag>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f10961d + 47;
            f10960a = i3 % 128;
            int i4 = i3 % 2;
            Object objB = b(continuation);
            int i5 = f10960a + 19;
            f10961d = i5 % 128;
            if (i5 % 2 == 0) {
                return objB;
            }
            throw null;
        }

        private Object b(Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<ag>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f10961d + 1;
            f10960a = i3 % 128;
            int i4 = i3 % 2;
            b bVar = (b) create(continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return bVar.invokeSuspend(unit);
            }
            bVar.invokeSuspend(unit);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i2 = 2 % 2;
            b bVar = new b(continuation);
            int i3 = f10960a + 41;
            f10961d = i3 % 128;
            int i4 = i3 % 2;
            return bVar;
        }

        b(Continuation<? super b> continuation) {
            super(1, continuation);
        }
    }

    private final void c() {
        int i2 = 2 % 2;
        b(this, (Function1) new b(null));
        int i3 = f10949j + 25;
        f10947g = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f11020f = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f11021i = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f11022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f11023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f11024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Object f11025d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f11026e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ String f11027g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ RequestBody f11028h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ AESViewModel f11029j;

        /* JADX WARN: Removed duplicated region for block: B:50:0x00b9 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:52:? A[LOOP:0: B:7:0x0026->B:52:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00fb -> B:6:0x001d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 315
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.aes.AESViewModel.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f11021i + 79;
            f11020f = i3 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i3 % 2 != 0) {
                return e(coroutineScope2, continuation2);
            }
            e(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private Object e(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f11021i + 19;
            f11020f = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i4 == 0) {
                int i5 = 55 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            n nVar = new n(this.f11027g, this.f11028h, this.f11029j, continuation);
            nVar.f11023b = obj;
            n nVar2 = nVar;
            int i3 = f11021i + 11;
            f11020f = i3 % 128;
            int i4 = i3 % 2;
            return nVar2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, RequestBody requestBody, AESViewModel aESViewModel, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f11027g = str;
            this.f11028h = requestBody;
            this.f11029j = aESViewModel;
        }
    }

    private final void d(String str, RequestBody requestBody) {
        int i2 = 2 % 2;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new n(str, requestBody, this, null), 2, null);
        int i3 = f10949j + 73;
        f10947g = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private final void b(AESScreenState aESScreenState) {
        AESUiState value;
        int i2 = 2 % 2;
        int i3 = f10947g + 103;
        int i4 = i3 % 128;
        f10949j = i4;
        if (i3 % 2 != 0) {
            MutableStateFlow<AESUiState> mutableStateFlow = this.f10953e;
            int i5 = i4 + 29;
            f10947g = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 / 2;
            }
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, AESUiState.copy$default(value, aESScreenState, null, false, false, false, false, false, null, null, null, PhotoshopDirectory.TAG_QUICK_MASK_INFORMATION, null)));
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object a(kotlin.jvm.functions.Function1<? super com.incode.welcome_sdk.results.AESResult, kotlin.Unit> r7, com.incode.welcome_sdk.results.AESResult r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            boolean r0 = r9 instanceof com.incode.welcome_sdk.ui.aes.AESViewModel.e
            if (r0 == 0) goto L58
            int r0 = com.incode.welcome_sdk.ui.aes.AESViewModel.f10949j
            int r1 = r0 + 45
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.aes.AESViewModel.f10947g = r0
            int r1 = r1 % r5
            r4 = r9
            com.incode.welcome_sdk.ui.aes.AESViewModel$e r4 = (com.incode.welcome_sdk.ui.aes.AESViewModel.e) r4
            int r0 = r4.f10975e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L58
            int r0 = r4.f10975e
            int r0 = r0 - r1
            r4.f10975e = r0
        L1f:
            java.lang.Object r3 = r4.f10972b
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f10975e
            r0 = 1
            if (r1 == 0) goto L3d
            if (r1 != r0) goto L5e
            java.lang.Object r8 = r4.f10971a
            com.incode.welcome_sdk.results.AESResult r8 = (com.incode.welcome_sdk.results.AESResult) r8
            java.lang.Object r7 = r4.f10974d
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            kotlin.ResultKt.throwOnFailure(r3)
        L37:
            r7.invoke(r8)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L3d:
            kotlin.ResultKt.throwOnFailure(r3)
            r4.f10974d = r7
            r4.f10971a = r8
            r4.f10975e = r0
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r4)
            if (r0 != r2) goto L37
            int r0 = com.incode.welcome_sdk.ui.aes.AESViewModel.f10949j
            int r1 = r0 + 67
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.aes.AESViewModel.f10947g = r0
            int r1 = r1 % r5
            return r2
        L58:
            com.incode.welcome_sdk.ui.aes.AESViewModel$e r4 = new com.incode.welcome_sdk.ui.aes.AESViewModel$e
            r4.<init>(r9)
            goto L1f
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.aes.AESViewModel.a(kotlin.jvm.functions.Function1, com.incode.welcome_sdk.results.AESResult, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f10969i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f10970j = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f10971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f10972b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f10974d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10975e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f10970j + 87;
            f10969i = i3 % 128;
            int i4 = i3 % 2;
            this.f10972b = obj;
            this.f10975e |= Integer.MIN_VALUE;
            Object objAccess$invokeWithDelay = AESViewModel.access$invokeWithDelay(AESViewModel.this, null, null, this);
            int i5 = f10970j + 103;
            f10969i = i5 % 128;
            if (i5 % 2 != 0) {
                return objAccess$invokeWithDelay;
            }
            throw null;
        }

        e(Continuation<? super e> continuation) {
            super(continuation);
        }
    }

    static {
        int i2 = f10948h + 11;
        f10946f = i2 % 128;
        int i3 = i2 % 2;
    }

    private final <T> void a(Function1<? super bm, Unit> function1, Function1<? super Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends T>>>, ? extends Object> function12) {
        int iD = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
        int iD2 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
        int iD3 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
        e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d(), iD, iD2, 1876838396, -1876838395, iD3, new Object[]{this, function1, function12});
    }

    private final void b() {
        int iD = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
        int iD2 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
        int iD3 = com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d();
        e(com.incode.welcome_sdk.data.local.model.delayed_onboarding.i.d(), iD, iD2, 50638389, -50638389, iD3, new Object[]{this});
    }
}
