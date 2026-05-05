package com.incode.welcome_sdk.ui.qes;

import android.net.Uri;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.biocatch.client.android.sdk.core.Constants;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.dynatrace.android.callback.OkCallback;
import com.incode.welcome_sdk.data.remote.beans.ae;
import com.incode.welcome_sdk.data.remote.beans.ag;
import com.incode.welcome_sdk.data.remote.beans.bm;
import com.incode.welcome_sdk.data.remote.beans.s;
import com.incode.welcome_sdk.results.QESResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseViewModel;
import com.incode.welcome_sdk.ui.qes.QESScreenState;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class QESViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Companion f17145d = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f17146f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f17147h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f17148i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f17149j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OkHttpClient f17150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StateFlow<QESUiState> f17151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MutableStateFlow<QESUiState> f17152c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Function1<? super QESResult, Unit> f17153e;

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object c(int r7, int r8, java.lang.Object[] r9, int r10, int r11, int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.qes.QESViewModel.c(int, int, java.lang.Object[], int, int, int, int):java.lang.Object");
    }

    public QESViewModel() {
        MutableStateFlow<QESUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(QESUiState.f17125c.getInitial());
        this.f17152c = MutableStateFlow;
        this.f17151b = MutableStateFlow;
        this.f17150a = new OkHttpClient();
    }

    public static final /* synthetic */ int access$getLastSignedDocumentIndex(QESViewModel qESViewModel) {
        int i2 = 2 % 2;
        int i3 = f17148i + 69;
        f17147h = i3 % 128;
        if (i3 % 2 == 0) {
            int iE = s.g.e();
            int iE2 = s.g.e();
            return ((Integer) c(-1880763330, s.g.e(), new Object[]{qESViewModel}, iE, 1880763331, iE2, s.g.e())).intValue();
        }
        int iE3 = s.g.e();
        int iE4 = s.g.e();
        ((Integer) c(-1880763330, s.g.e(), new Object[]{qESViewModel}, iE3, 1880763331, iE4, s.g.e())).intValue();
        throw null;
    }

    public static final /* synthetic */ OkHttpClient access$getOkHttpClient$p(QESViewModel qESViewModel) {
        int i2 = 2 % 2;
        int i3 = f17148i;
        int i4 = i3 + 77;
        f17147h = i4 % 128;
        int i5 = i4 % 2;
        OkHttpClient okHttpClient = qESViewModel.f17150a;
        if (i5 != 0) {
            int i6 = 23 / 0;
        }
        int i7 = i3 + 81;
        f17147h = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 69 / 0;
        }
        return okHttpClient;
    }

    public static final /* synthetic */ void access$getSignedDocuments(QESViewModel qESViewModel) {
        int i2 = 2 % 2;
        int i3 = f17147h + 49;
        f17148i = i3 % 128;
        int i4 = i3 % 2;
        qESViewModel.e();
        int i5 = f17147h + 7;
        f17148i = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$getUploadUrl(QESViewModel qESViewModel) {
        int i2 = 2 % 2;
        int i3 = f17148i + 13;
        f17147h = i3 % 128;
        int i4 = i3 % 2;
        qESViewModel.c();
        if (i4 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ MutableStateFlow access$get_uiState$p(QESViewModel qESViewModel) {
        int i2 = 2 % 2;
        int i3 = f17147h + 95;
        int i4 = i3 % 128;
        f17148i = i4;
        int i5 = i3 % 2;
        MutableStateFlow<QESUiState> mutableStateFlow = qESViewModel.f17152c;
        int i6 = i4 + 59;
        f17147h = i6 % 128;
        if (i6 % 2 == 0) {
            return mutableStateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object access$handleResponseData(QESViewModel qESViewModel, Object obj, Continuation continuation) {
        int i2 = 2 % 2;
        int i3 = f17147h + 93;
        f17148i = i3 % 128;
        int i4 = i3 % 2;
        Object objC = c(-218769597, s.g.e(), new Object[]{qESViewModel, obj, continuation}, s.g.e(), 218769597, s.g.e(), s.g.e());
        int i5 = f17148i + 19;
        f17147h = i5 % 128;
        int i6 = i5 % 2;
        return objC;
    }

    public static final /* synthetic */ Object access$invokeWithDelay(QESViewModel qESViewModel, Function1 function1, QESResult qESResult, Continuation continuation) {
        int i2 = 2 % 2;
        int i3 = f17148i + 13;
        f17147h = i3 % 128;
        int i4 = i3 % 2;
        Object objE = qESViewModel.e((Function1<? super QESResult, Unit>) function1, qESResult, (Continuation<? super Unit>) continuation);
        int i5 = f17147h + 93;
        f17148i = i5 % 128;
        if (i5 % 2 != 0) {
            return objE;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$signDocuments(QESViewModel qESViewModel, List list, int i2, bm bmVar) {
        int i3 = 2 % 2;
        int i4 = f17147h + 105;
        f17148i = i4 % 128;
        int i5 = i4 % 2;
        qESViewModel.e((List<DocumentState>) list, i2, bmVar);
        if (i5 == 0) {
            throw null;
        }
        int i6 = f17148i + 75;
        f17147h = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$startDownloadingDocuments(QESViewModel qESViewModel) {
        int i2 = 2 % 2;
        int i3 = f17147h + 89;
        f17148i = i3 % 128;
        int i4 = i3 % 2;
        qESViewModel.d();
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$updateScreenState(QESViewModel qESViewModel, QESScreenState qESScreenState) {
        int i2 = 2 % 2;
        int i3 = f17147h + 19;
        f17148i = i3 % 128;
        int i4 = i3 % 2;
        qESViewModel.b(qESScreenState);
        int i5 = f17147h + 29;
        f17148i = i5 % 128;
        int i6 = i5 % 2;
    }

    public final StateFlow<QESUiState> getUiState() {
        int i2 = 2 % 2;
        int i3 = f17147h + 19;
        int i4 = i3 % 128;
        f17148i = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        StateFlow<QESUiState> stateFlow = this.f17151b;
        int i5 = i4 + 61;
        f17147h = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final Function1<QESResult, Unit> getOnResult() {
        int i2 = 2 % 2;
        int i3 = f17148i + 121;
        int i4 = i3 % 128;
        f17147h = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        Function1 function1 = this.f17153e;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i4 + 33;
        f17148i = i5 % 128;
        if (i5 % 2 != 0) {
            return function1;
        }
        obj.hashCode();
        throw null;
    }

    public final void setOnResult(Function1<? super QESResult, Unit> function1) {
        int i2 = 2 % 2;
        int i3 = f17148i + 103;
        f17147h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        this.f17153e = function1;
        int i5 = f17148i + 13;
        f17147h = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17154b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17155d = 0;

        private Companion() {
        }

        public final QESViewModel get(ViewModelStoreOwner viewModelStoreOwner) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(viewModelStoreOwner, "");
            QESViewModel qESViewModel = (QESViewModel) new ViewModelProvider(viewModelStoreOwner).get(QESViewModel.class);
            int i3 = f17155d + 85;
            f17154b = i3 % 128;
            if (i3 % 2 != 0) {
                return qESViewModel;
            }
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void onViewCreated(boolean z2, Function1<? super QESResult, Unit> function1) throws Throwable {
        QESUiState value;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        MutableStateFlow<QESUiState> mutableStateFlow = this.f17152c;
        int i3 = f17147h + 37;
        f17148i = i3 % 128;
        int i4 = i3 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, QESUiState.copy$default(value, null, null, false, false, z2, false, null, null, null, null, 1007, null)));
        int i5 = f17148i + 59;
        f17147h = i5 % 128;
        int i6 = i5 % 2;
        setOnResult(function1);
        com.incode.welcome_sdk.data.remote.e.d dVar = com.incode.welcome_sdk.data.remote.e.d.f10134b;
        com.incode.welcome_sdk.data.remote.e.b bVarA = com.incode.welcome_sdk.data.remote.e.d.a();
        com.incode.welcome_sdk.data.remote.b bVar = com.incode.welcome_sdk.data.remote.b.f8977c;
        com.incode.welcome_sdk.data.remote.b.e(bVarA);
        d();
    }

    private final void d() {
        int i2 = 2 % 2;
        int i3 = f17147h + 77;
        f17148i = i3 % 128;
        int i4 = i3 % 2;
        b(QESScreenState.FetchingUnsignedDocuments.f17081c);
        b();
        int i5 = f17148i + 61;
        f17147h = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void onTermsAndConditionsIsChecked(boolean z2) {
        QESUiState value;
        int i2 = 2 % 2;
        int i3 = f17147h + 53;
        int i4 = i3 % 128;
        f17148i = i4;
        int i5 = i3 % 2;
        MutableStateFlow<QESUiState> mutableStateFlow = this.f17152c;
        int i6 = i4 + 41;
        f17147h = i6 % 128;
        int i7 = i6 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, QESUiState.copy$default(value, null, null, z2, false, false, false, null, null, null, null, 1019, null)));
    }

    public final void onSignGenerateCertificateIsChecked(boolean z2) {
        QESUiState value;
        int i2 = 2 % 2;
        int i3 = f17147h + 55;
        int i4 = i3 % 128;
        f17148i = i4;
        int i5 = i3 % 2;
        MutableStateFlow<QESUiState> mutableStateFlow = this.f17152c;
        int i6 = i4 + 81;
        f17147h = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 4 % 5;
        }
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, QESUiState.copy$default(value, null, null, false, z2, false, false, null, null, null, null, 1015, null)));
    }

    static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17191a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17192d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f17194c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f17191a + 85;
            f17192d = i3 % 128;
            int i4 = i3 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            QESViewModel.access$updateScreenState(QESViewModel.this, QESScreenState.SigningDocument.f17101a);
            QESViewModel qESViewModel = QESViewModel.this;
            QESViewModel.c(qESViewModel, qESViewModel.getUiState().getValue().getPdfDocuments(), QESViewModel.access$getLastSignedDocumentIndex(QESViewModel.this));
            Unit unit = Unit.INSTANCE;
            int i5 = f17192d + 111;
            f17191a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f17192d + 29;
            f17191a = i3 % 128;
            int i4 = i3 % 2;
            Object objD = d(coroutineScope, continuation);
            int i5 = f17191a + 81;
            f17192d = i5 % 128;
            if (i5 % 2 == 0) {
                return objD;
            }
            throw null;
        }

        private Object d(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f17191a + 1;
            f17192d = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f17192d + 21;
            f17191a = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            h hVar = QESViewModel.this.new h(continuation);
            int i3 = f17191a + 19;
            f17192d = i3 % 128;
            if (i3 % 2 == 0) {
                return hVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }
    }

    public final void onContinueButtonClicked() {
        int i2 = 2 % 2;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new h(null), 3, null);
        int i3 = f17147h + 113;
        f17148i = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onContinueAndFinishButtonClicked() {
        int i2 = 2 % 2;
        getOnResult().invoke(new QESResult(ResultCode.SUCCESS, true, false, 4, null));
        int i3 = f17147h + 53;
        f17148i = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onPDFSelected(Uri uri) {
        MutableStateFlow<QESUiState> mutableStateFlow;
        QESUiState value;
        int i2 = 2 % 2;
        int i3 = f17148i + 65;
        f17147h = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(uri, "");
            mutableStateFlow = this.f17152c;
            int i4 = 22 / 0;
        } else {
            Intrinsics.checkNotNullParameter(uri, "");
            mutableStateFlow = this.f17152c;
        }
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, QESUiState.copy$default(value, null, null, false, false, false, false, uri, null, null, null, 959, null)));
    }

    public final void onRemovePDFClicked() {
        QESUiState value;
        Uri uri;
        int i2 = 2 % 2;
        int i3 = f17148i + 19;
        int i4 = i3 % 128;
        f17147h = i4;
        int i5 = i3 % 2;
        MutableStateFlow<QESUiState> mutableStateFlow = this.f17152c;
        int i6 = i4 + 93;
        f17148i = i6 % 128;
        int i7 = i6 % 2;
        do {
            value = mutableStateFlow.getValue();
            uri = Uri.EMPTY;
            Intrinsics.checkNotNullExpressionValue(uri, "");
        } while (!mutableStateFlow.compareAndSet(value, QESUiState.copy$default(value, null, null, false, false, false, false, uri, null, null, null, 959, null)));
    }

    static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17195b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17196e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f17197a;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f17196e + 57;
            f17195b = i3 % 128;
            int i4 = i3 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            QESViewModel.access$updateScreenState(QESViewModel.this, QESScreenState.GeneratingUploadLink.f17086a);
            QESViewModel.access$getUploadUrl(QESViewModel.this);
            Unit unit = Unit.INSTANCE;
            int i5 = f17196e + 59;
            f17195b = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f17196e + 29;
            f17195b = i3 % 128;
            int i4 = i3 % 2;
            Object objB = b(coroutineScope, continuation);
            int i5 = f17196e + 63;
            f17195b = i5 % 128;
            if (i5 % 2 != 0) {
                return objB;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private Object b(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f17196e + 65;
            f17195b = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f17196e + 67;
            f17195b = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            i iVar = QESViewModel.this.new i(continuation);
            int i3 = f17195b + 89;
            f17196e = i3 % 128;
            int i4 = i3 % 2;
            return iVar;
        }

        i(Continuation<? super i> continuation) {
            super(2, continuation);
        }
    }

    public final void onQESUploadContinueBtnClicked() {
        int i2 = 2 % 2;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new i(null), 2, null);
        int i3 = f17148i + 53;
        f17147h = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public final void onUploadRequestBodyBuilt(RequestBody requestBody) {
        QESUiState value;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(requestBody, "");
        MutableStateFlow<QESUiState> mutableStateFlow = this.f17152c;
        int i3 = f17148i + 71;
        f17147h = i3 % 128;
        int i4 = i3 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, QESUiState.copy$default(value, null, null, false, false, false, false, null, null, null, requestBody, FrameMetricsAggregator.EVERY_DURATION, null)));
        int i5 = f17147h + 35;
        f17148i = i5 % 128;
        if (i5 % 2 != 0) {
            c(this.f17151b.getValue().getPresignedUploadUrl(), requestBody);
        } else {
            c(this.f17151b.getValue().getPresignedUploadUrl(), requestBody);
            int i6 = 8 / 0;
        }
    }

    public final void retryLastNetworkCall() {
        int i2 = 2 % 2;
        int i3 = f17147h + 83;
        f17148i = i3 % 128;
        int i4 = i3 % 2;
        QESScreenState qesScreenState = this.f17152c.getValue().getQesScreenState();
        QESScreenState.NoInternetConnection noInternetConnection = qesScreenState instanceof QESScreenState.NoInternetConnection ? (QESScreenState.NoInternetConnection) qesScreenState : null;
        if (noInternetConnection == null) {
            return;
        }
        LastAPICallState lastAPICall = noInternetConnection.getLastAPICall();
        if (Intrinsics.areEqual(lastAPICall, QESScreenState.FetchingUnsignedDocuments.f17081c)) {
            int i5 = f17147h + 49;
            f17148i = i5 % 128;
            if (i5 % 2 != 0) {
                b(QESScreenState.FetchingUnsignedDocuments.f17081c);
                b();
                return;
            } else {
                b(QESScreenState.FetchingUnsignedDocuments.f17081c);
                b();
                int i6 = 61 / 0;
                return;
            }
        }
        if (Intrinsics.areEqual(lastAPICall, QESScreenState.SigningDocument.f17101a)) {
            int i7 = f17148i + 87;
            f17147h = i7 % 128;
            if (i7 % 2 == 0) {
                b(QESScreenState.SigningDocument.f17101a);
                c(this, this.f17151b.getValue().getPdfDocuments(), ((Integer) c(-1880763330, s.g.e(), new Object[]{this}, s.g.e(), 1880763331, s.g.e(), s.g.e())).intValue());
                return;
            }
            b(QESScreenState.SigningDocument.f17101a);
            c(this, this.f17151b.getValue().getPdfDocuments(), ((Integer) c(-1880763330, s.g.e(), new Object[]{this}, s.g.e(), 1880763331, s.g.e(), s.g.e())).intValue());
            int i8 = 84 / 0;
        }
    }

    static final class o extends Lambda implements Function1<bm, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17228a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17229b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f17230c = new o();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17231d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17232e = 1;

        private static void d(bm bmVar) {
            int i2 = 2 % 2;
            int i3 = f17231d + 37;
            f17232e = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(bmVar, "");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(bmVar, "");
            int i4 = f17232e + 87;
            f17231d = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 39 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(bm bmVar) {
            int i2 = 2 % 2;
            int i3 = f17231d + 113;
            f17232e = i3 % 128;
            int i4 = i3 % 2;
            d(bmVar);
            Unit unit = Unit.INSTANCE;
            int i5 = f17231d + 91;
            f17232e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 26 / 0;
            }
            return unit;
        }

        static {
            int i2 = f17229b + 69;
            f17228a = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 93 / 0;
            }
        }

        o() {
            super(1);
        }
    }

    private static /* synthetic */ void b(QESViewModel qESViewModel, Function1 function1) {
        int i2 = 2 % 2;
        int i3 = f17147h + 79;
        f17148i = i3 % 128;
        int i4 = i3 % 2;
        qESViewModel.a(o.f17230c, function1);
        int i5 = f17147h + 57;
        f17148i = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17213e = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f17214j = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ QESViewModel f17215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function1<Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends T>>>, Object> f17216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Function1<bm, Unit> f17217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f17218d;

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.incode.welcome_sdk.ui.qes.QESViewModel$m for r5v1 'this'  java.lang.Object
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
                r4 = 2
                int r0 = r4 % r4
                int r0 = com.incode.welcome_sdk.ui.qes.QESViewModel.m.f17214j
                int r1 = r0 + 9
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.qes.QESViewModel.m.f17213e = r0
                int r1 = r1 % r4
                if (r1 != 0) goto L5c
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r5.f17218d
                r1 = 1
                if (r0 == 0) goto L21
                if (r0 == r1) goto L2f
                if (r0 != r4) goto L54
                kotlin.ResultKt.throwOnFailure(r6)
            L1e:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L21:
                kotlin.ResultKt.throwOnFailure(r6)
                kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends T>>>, java.lang.Object> r0 = r5.f17216b
                r5.f17218d = r1
                java.lang.Object r6 = r0.invoke(r5)
                if (r6 != r3) goto L3b
                return r3
            L2f:
                kotlin.ResultKt.throwOnFailure(r6)
                int r0 = com.incode.welcome_sdk.ui.qes.QESViewModel.m.f17213e
                int r1 = r0 + 97
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.qes.QESViewModel.m.f17214j = r0
                int r1 = r1 % r4
            L3b:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.incode.welcome_sdk.ui.qes.QESViewModel$m$1 r2 = new com.incode.welcome_sdk.ui.qes.QESViewModel$m$1
                kotlin.jvm.functions.Function1<com.incode.welcome_sdk.data.remote.beans.bm, kotlin.Unit> r1 = r5.f17217c
                com.incode.welcome_sdk.ui.qes.QESViewModel r0 = r5.f17215a
                r2.<init>()
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                r0 = r5
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r5.f17218d = r4
                java.lang.Object r0 = r6.collect(r2, r0)
                if (r0 != r3) goto L1e
                return r3
            L54:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L5c:
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.qes.QESViewModel.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f17213e + 9;
            f17214j = i3 % 128;
            Object obj = null;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i3 % 2 == 0) {
                e(coroutineScope2, continuation2);
                obj.hashCode();
                throw null;
            }
            Object objE = e(coroutineScope2, continuation2);
            int i4 = f17214j + 93;
            f17213e = i4 % 128;
            if (i4 % 2 == 0) {
                return objE;
            }
            throw null;
        }

        private Object e(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f17214j + 15;
            f17213e = i3 % 128;
            int i4 = i3 % 2;
            m mVar = (m) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return mVar.invokeSuspend(unit);
            }
            mVar.invokeSuspend(unit);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            m mVar = new m(this.f17216b, this.f17217c, this.f17215a, continuation);
            int i3 = f17213e + 51;
            f17214j = i3 % 128;
            if (i3 % 2 != 0) {
                return mVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(Function1<? super Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends T>>>, ? extends Object> function1, Function1<? super bm, Unit> function12, QESViewModel qESViewModel, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f17216b = function1;
            this.f17217c = function12;
            this.f17215a = qESViewModel;
        }
    }

    private final <T> void a(Function1<? super bm, Unit> function1, Function1<? super Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends T>>>, ? extends Object> function12) {
        int i2 = 2 % 2;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new m(function12, function1, this, null), 2, null);
        int i3 = f17147h + 77;
        f17148i = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17169a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17170e = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f17172d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f17172d;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                if (((QESUiState) QESViewModel.access$get_uiState$p(QESViewModel.this).getValue()).getDownloadDocument()) {
                    int i4 = f17170e + 65;
                    f17169a = i4 % 128;
                    if (i4 % 2 != 0) {
                        QESViewModel.access$updateScreenState(QESViewModel.this, QESScreenState.FetchingSignedDocuments.f17075c);
                        QESViewModel.access$getSignedDocuments(QESViewModel.this);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    QESViewModel.access$updateScreenState(QESViewModel.this, QESScreenState.FetchingSignedDocuments.f17075c);
                    QESViewModel.access$getSignedDocuments(QESViewModel.this);
                } else {
                    QESViewModel qESViewModel = QESViewModel.this;
                    this.f17172d = 1;
                    if (QESViewModel.access$invokeWithDelay(qESViewModel, qESViewModel.getOnResult(), new QESResult(ResultCode.SUCCESS, true, false, 4, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i5 = f17169a + 77;
            f17170e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 45 / 0;
            }
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f17170e + 97;
            f17169a = i3 % 128;
            int i4 = i3 % 2;
            Object objC = c(coroutineScope, continuation);
            int i5 = f17169a + 43;
            f17170e = i5 % 128;
            int i6 = i5 % 2;
            return objC;
        }

        private Object c(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f17170e + 15;
            f17169a = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f17169a + 15;
            f17170e = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            d dVar = QESViewModel.this.new d(continuation);
            int i3 = f17169a + 41;
            f17170e = i3 % 128;
            if (i3 % 2 != 0) {
                return dVar;
            }
            throw null;
        }

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }
    }

    private static /* synthetic */ Object e(Object[] objArr) {
        QESUiState value;
        QESUiState value2;
        QESScreenState.UnsignedDocumentsFetched unsignedDocumentsFetched;
        QESUiState value3;
        QESUiState qESUiState;
        ArrayList arrayList;
        boolean z2 = false;
        QESViewModel qESViewModel = (QESViewModel) objArr[0];
        Object obj = objArr[1];
        Continuation<? super Unit> continuation = (Continuation) objArr[2];
        int i2 = 2 % 2;
        Object obj2 = null;
        if (!(!(obj instanceof ae))) {
            int i3 = f17148i + 71;
            f17147h = i3 % 128;
            int i4 = i3 % 2;
            QESScreenState qesScreenState = qESViewModel.f17152c.getValue().getQesScreenState();
            if (!Intrinsics.areEqual(qesScreenState, QESScreenState.FetchingUnsignedDocuments.f17081c)) {
                unsignedDocumentsFetched = Intrinsics.areEqual(qesScreenState, QESScreenState.FetchingSignedDocuments.f17075c) ? QESScreenState.SignedDocumentsFetched.f17099c : QESScreenState.EmptyState.f17072d;
            } else {
                unsignedDocumentsFetched = QESScreenState.UnsignedDocumentsFetched.f17112e;
                int i5 = f17147h + 5;
                f17148i = i5 % 128;
                int i6 = i5 % 2;
            }
            ae aeVar = (ae) obj;
            if (aeVar.b().isEmpty()) {
                qESViewModel.b(QESScreenState.FetchingUnsignedDocumentsFailed.f17085e);
                Object objE = qESViewModel.e(qESViewModel.getOnResult(), new QESResult(ResultCode.ERROR, false, true, 2, null), continuation);
                return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : Unit.INSTANCE;
            }
            if (!Intrinsics.areEqual(unsignedDocumentsFetched, QESScreenState.EmptyState.f17072d)) {
                int i7 = f17148i + 43;
                f17147h = i7 % 128;
                int i8 = i7 % 2;
                MutableStateFlow<QESUiState> mutableStateFlow = qESViewModel.f17152c;
                do {
                    value3 = mutableStateFlow.getValue();
                    qESUiState = value3;
                    List<com.incode.welcome_sdk.data.remote.beans.i> listB = aeVar.b();
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listB, 10));
                    Iterator<T> it = listB.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new DocumentState((com.incode.welcome_sdk.data.remote.beans.i) it.next(), false, 2, null));
                    }
                } while (!mutableStateFlow.compareAndSet(value3, QESUiState.copy$default(qESUiState, unsignedDocumentsFetched, arrayList, false, false, false, false, null, null, null, null, PointerIconCompat.TYPE_GRAB, null)));
            }
        } else if (obj instanceof bm) {
            int i9 = f17148i + 27;
            f17147h = i9 % 128;
            int i10 = i9 % 2;
            bm bmVar = (bm) obj;
            qESViewModel.b(!bmVar.b() ? QESScreenState.SigningFailed.f17106d : QESScreenState.SigningSuccess.f17108d);
            if (bmVar.b()) {
                int i11 = f17147h + 107;
                f17148i = i11 % 128;
                if (i11 % 2 == 0) {
                    MutableStateFlow<QESUiState> mutableStateFlow2 = qESViewModel.f17152c;
                    obj2.hashCode();
                    throw null;
                }
                MutableStateFlow<QESUiState> mutableStateFlow3 = qESViewModel.f17152c;
                do {
                    value = mutableStateFlow3.getValue();
                } while (!mutableStateFlow3.compareAndSet(value, QESUiState.copy$default(value, null, null, false, false, false, false, null, bmVar.a(), null, null, 895, null)));
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(qESViewModel), null, null, qESViewModel.new d(null), 3, null);
            }
        } else {
            if (!(obj instanceof ag)) {
                qESViewModel.b(QESScreenState.EmptyState.f17072d);
                Object objE2 = qESViewModel.e(qESViewModel.getOnResult(), new QESResult(ResultCode.ERROR, false, false, 6, null), continuation);
                return objE2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE2 : Unit.INSTANCE;
            }
            ag agVar = (ag) obj;
            if (!StringsKt.isBlank(agVar.b())) {
                int i12 = f17147h + 37;
                f17148i = i12 % 128;
                int i13 = i12 % 2;
                z2 = true;
            }
            QESScreenState qESScreenState = z2 ? QESScreenState.GeneratingUploadLinkSuccess.f17092a : QESScreenState.GeneratingUploadLinkFailed.f17091e;
            if (z2) {
                MutableStateFlow<QESUiState> mutableStateFlow4 = qESViewModel.f17152c;
                do {
                    value2 = mutableStateFlow4.getValue();
                } while (!mutableStateFlow4.compareAndSet(value2, QESUiState.copy$default(value2, null, null, false, false, false, false, null, null, agVar.b(), null, 767, null)));
            }
            qESViewModel.b(qESScreenState);
            int i14 = f17148i + 77;
            f17147h = i14 % 128;
            int i15 = i14 % 2;
        }
        return Unit.INSTANCE;
    }

    static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f17203h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f17204i = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ Object f17205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f17206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f17207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f17208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f17209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ QESViewModel f17210f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ RequestBody f17211g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ String f17212j;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Ref.IntRef intRef;
            Ref.IntRef intRef2;
            Object objM8980constructorimpl;
            Response responseExecute;
            Response response;
            Object obj2;
            int i2 = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f17208d;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.f17205a;
                intRef = new Ref.IntRef();
                intRef2 = new Ref.IntRef();
                intRef2.element = 1;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                intRef2 = (Ref.IntRef) this.f17209e;
                intRef = (Ref.IntRef) this.f17206b;
                coroutineScope = (CoroutineScope) this.f17205a;
                ResultKt.throwOnFailure(obj);
            }
            while (intRef.element < 3) {
                String str = this.f17212j;
                RequestBody requestBody = this.f17211g;
                QESViewModel qESViewModel = this.f17210f;
                try {
                    Result.Companion companion = Result.Companion;
                    responseExecute = OkCallback.execute(QESViewModel.access$getOkHttpClient$p(qESViewModel).newCall(new Request.Builder().url(str).put(requestBody).build()));
                    try {
                        response = responseExecute;
                        obj2 = null;
                    } finally {
                    }
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
                }
                if (response.isSuccessful()) {
                    int i4 = f17204i + 41;
                    f17203h = i4 % 128;
                    if (i4 % 2 == 0) {
                        QESViewModel.access$updateScreenState(qESViewModel, QESScreenState.UploadingSuccess.f17123c);
                        QESViewModel.access$startDownloadingDocuments(qESViewModel);
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(responseExecute, null);
                        return unit;
                    }
                    QESViewModel.access$updateScreenState(qESViewModel, QESScreenState.UploadingSuccess.f17123c);
                    QESViewModel.access$startDownloadingDocuments(qESViewModel);
                    Unit unit2 = Unit.INSTANCE;
                    CloseableKt.closeFinally(responseExecute, null);
                    obj2.hashCode();
                    throw null;
                }
                QESViewModel.access$updateScreenState(qESViewModel, QESScreenState.UploadingFailed.f17120b);
                Timber.Forest.e("Failed to upload file: " + response.message(), new Object[0]);
                Unit unit3 = Unit.INSTANCE;
                CloseableKt.closeFinally(responseExecute, null);
                objM8980constructorimpl = Result.m8980constructorimpl(Unit.INSTANCE);
                QESViewModel qESViewModel2 = this.f17210f;
                Throwable thM8983exceptionOrNullimpl = Result.m8983exceptionOrNullimpl(objM8980constructorimpl);
                if (thM8983exceptionOrNullimpl != null) {
                    if (!(thM8983exceptionOrNullimpl instanceof SocketTimeoutException)) {
                        QESViewModel.access$updateScreenState(qESViewModel2, QESScreenState.UploadingFailed.f17120b);
                        Timber.Forest.e(thM8983exceptionOrNullimpl, "Exception during file upload", new Object[0]);
                        return Unit.INSTANCE;
                    }
                    Timber.Forest.e(thM8983exceptionOrNullimpl, "Timeout during file upload, attempt: " + intRef.element, new Object[0]);
                    intRef.element++;
                    int i5 = intRef.element;
                    int i6 = f17203h + 63;
                    f17204i = i6 % 128;
                    int i7 = i6 % 2;
                    for (int i8 = 1; i8 < i5; i8++) {
                        intRef2.element <<= 1;
                    }
                    long j2 = ((long) intRef2.element) * 1000;
                    this.f17205a = coroutineScope;
                    this.f17206b = intRef;
                    this.f17209e = intRef2;
                    this.f17207c = objM8980constructorimpl;
                    this.f17208d = 1;
                    if (DelayKt.delay(j2, this) == coroutine_suspended) {
                        int i9 = f17204i + 107;
                        f17203h = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 46 / 0;
                        }
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f17203h + 111;
            f17204i = i3 % 128;
            int i4 = i3 % 2;
            Object objD = d(coroutineScope, continuation);
            if (i4 == 0) {
                int i5 = 86 / 0;
            }
            int i6 = f17204i + 103;
            f17203h = i6 % 128;
            int i7 = i6 % 2;
            return objD;
        }

        private Object d(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f17203h + 113;
            f17204i = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f17203h + 41;
            f17204i = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 81 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            k kVar = new k(this.f17212j, this.f17211g, this.f17210f, continuation);
            kVar.f17205a = obj;
            k kVar2 = kVar;
            int i3 = f17204i + 7;
            f17203h = i3 % 128;
            if (i3 % 2 == 0) {
                return kVar2;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, RequestBody requestBody, QESViewModel qESViewModel, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f17212j = str;
            this.f17211g = requestBody;
            this.f17210f = qESViewModel;
        }
    }

    private final void c(String str, RequestBody requestBody) {
        int i2 = 2 % 2;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new k(str, requestBody, this, null), 2, null);
        int i3 = f17147h + 45;
        f17148i = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class a extends SuspendLambda implements Function1<Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ae>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17156a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17157b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f17158e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f17158e;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                com.incode.welcome_sdk.data.remote.b bVar = com.incode.welcome_sdk.data.remote.b.f8977c;
                com.incode.welcome_sdk.data.local.k kVar = com.incode.welcome_sdk.data.local.k.f8613e;
                String strE = com.incode.welcome_sdk.data.local.k.e();
                this.f17158e = 1;
                obj = com.incode.welcome_sdk.data.remote.b.c(strE);
                if (obj == coroutine_suspended) {
                    int i4 = f17157b + 95;
                    f17156a = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 17 / 0;
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            int i6 = f17156a + 117;
            f17157b = i6 % 128;
            int i7 = i6 % 2;
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ae>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f17157b + 29;
            f17156a = i3 % 128;
            Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ae>>> continuation2 = continuation;
            if (i3 % 2 != 0) {
                d(continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objD = d(continuation2);
            int i4 = f17156a + 87;
            f17157b = i4 % 128;
            int i5 = i4 % 2;
            return objD;
        }

        private Object d(Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<ae>>> continuation) {
            Object objInvokeSuspend;
            int i2 = 2 % 2;
            int i3 = f17157b + 25;
            f17156a = i3 % 128;
            int i4 = i3 % 2;
            a aVar = (a) create(continuation);
            if (i4 != 0) {
                objInvokeSuspend = aVar.invokeSuspend(Unit.INSTANCE);
                int i5 = 20 / 0;
            } else {
                objInvokeSuspend = aVar.invokeSuspend(Unit.INSTANCE);
            }
            int i6 = f17157b + 19;
            f17156a = i6 % 128;
            int i7 = i6 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i2 = 2 % 2;
            a aVar = new a(continuation);
            int i3 = f17156a + 111;
            f17157b = i3 % 128;
            int i4 = i3 % 2;
            return aVar;
        }

        a(Continuation<? super a> continuation) {
            super(1, continuation);
        }
    }

    private final void b() {
        int i2 = 2 % 2;
        b(this, new a(null));
        int i3 = f17147h + 105;
        f17148i = i3 % 128;
        int i4 = i3 % 2;
    }

    static /* synthetic */ void c(QESViewModel qESViewModel, List list, int i2) {
        int i3 = 2 % 2;
        int i4 = f17148i + 29;
        f17147h = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        qESViewModel.e((List<DocumentState>) list, i2, (bm) null);
        if (i5 != 0) {
            throw null;
        }
        int i6 = f17147h + 59;
        f17148i = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static final class f extends Lambda implements Function1<bm, Unit> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17176e = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f17177j = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ DocumentState f17178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ List<DocumentState> f17179b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ int f17181d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(bm bmVar) {
            int i2 = 2 % 2;
            int i3 = f17176e + 73;
            f17177j = i3 % 128;
            int i4 = i3 % 2;
            c(bmVar);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 46 / 0;
            }
            int i6 = f17176e + 95;
            f17177j = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.qes.QESViewModel$f$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f17182a = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f17183b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ QESViewModel f17184d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f17185e;

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
            
                if (r0 == 1) goto L7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
            
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
            
                if (r1 == 1) goto L7;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
            
                kotlin.ResultKt.throwOnFailure(r13);
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    r5 = 2
                    int r0 = r5 % r5
                    int r0 = com.incode.welcome_sdk.ui.qes.QESViewModel.f.AnonymousClass5.f17182a
                    int r1 = r0 + 5
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.qes.QESViewModel.f.AnonymousClass5.f17183b = r0
                    int r1 = r1 % r5
                    r4 = 1
                    if (r1 == 0) goto L2c
                    java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r12.f17185e
                    r0 = 21
                    int r0 = r0 / 0
                    if (r1 == 0) goto L37
                    if (r1 != r4) goto L57
                L1d:
                    kotlin.ResultKt.throwOnFailure(r13)
                L20:
                    kotlin.Unit r2 = kotlin.Unit.INSTANCE
                    int r0 = com.incode.welcome_sdk.ui.qes.QESViewModel.f.AnonymousClass5.f17183b
                    int r1 = r0 + 75
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.qes.QESViewModel.f.AnonymousClass5.f17182a = r0
                    int r1 = r1 % r5
                    return r2
                L2c:
                    java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r0 = r12.f17185e
                    if (r0 == 0) goto L37
                    if (r0 != r4) goto L57
                    goto L1d
                L37:
                    kotlin.ResultKt.throwOnFailure(r13)
                    com.incode.welcome_sdk.ui.qes.QESViewModel r2 = r12.f17184d
                    kotlin.jvm.functions.Function1 r1 = r2.getOnResult()
                    com.incode.welcome_sdk.results.QESResult r6 = new com.incode.welcome_sdk.results.QESResult
                    com.incode.welcome_sdk.results.ResultCode r7 = com.incode.welcome_sdk.results.ResultCode.ERROR
                    r10 = 4
                    r11 = 0
                    r8 = 0
                    r9 = 0
                    r6.<init>(r7, r8, r9, r10, r11)
                    r0 = r12
                    kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                    r12.f17185e = r4
                    java.lang.Object r0 = com.incode.welcome_sdk.ui.qes.QESViewModel.access$invokeWithDelay(r2, r1, r6, r0)
                    if (r0 != r3) goto L20
                    return r3
                L57:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.qes.QESViewModel.f.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f17183b + 121;
                f17182a = i3 % 128;
                int i4 = i3 % 2;
                Object objC = c(coroutineScope, continuation);
                if (i4 == 0) {
                    int i5 = 42 / 0;
                }
                int i6 = f17182a + 75;
                f17183b = i6 % 128;
                int i7 = i6 % 2;
                return objC;
            }

            private Object c(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f17182a + 15;
                f17183b = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i5 = f17183b + 15;
                f17182a = i5 % 128;
                if (i5 % 2 != 0) {
                    return objInvokeSuspend;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.f17184d, continuation);
                int i3 = f17183b + 63;
                f17182a = i3 % 128;
                int i4 = i3 % 2;
                return anonymousClass5;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(QESViewModel qESViewModel, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.f17184d = qESViewModel;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0069, code lost:
        
            if ((r2 % 2) != 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x006b, code lost:
        
            r2 = r22.f17180c;
            r1 = r22.f17179b;
            r0 = r22.f17181d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0071, code lost:
        
            com.incode.welcome_sdk.ui.qes.QESViewModel.access$signDocuments(r2, r1, r0, r23);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0074, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
        
            r2 = r22.f17180c;
            r1 = r22.f17179b;
            r0 = r22.f17181d + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
        
            if (r23.b() != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
        
            com.incode.welcome_sdk.ui.qes.QESViewModel.access$updateScreenState(r22.f17180c, com.incode.welcome_sdk.ui.qes.QESScreenState.SigningFailed.f17106d);
            r0 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope(r22.f17180c), kotlinx.coroutines.Dispatchers.getIO(), null, new com.incode.welcome_sdk.ui.qes.QESViewModel.f.AnonymousClass5(r22.f17180c, null), 2, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00ae, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
        
            if (r23.b() != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
        
            r6 = com.incode.welcome_sdk.ui.qes.QESViewModel.access$get_uiState$p(r22.f17180c);
            r5 = r22.f17181d;
            r4 = r22.f17178a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
        
            r2 = r6.getValue();
            r9 = (com.incode.welcome_sdk.ui.qes.QESUiState) r2;
            r11 = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) r9.getPdfDocuments());
            r11.set(r5, com.incode.welcome_sdk.ui.qes.DocumentState.copy$default(r4, null, true, 1, null));
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x005e, code lost:
        
            if (r6.compareAndSet(r2, com.incode.welcome_sdk.ui.qes.QESUiState.copy$default(r9, null, r11, false, false, false, false, null, null, null, null, 1021, null)) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0060, code lost:
        
            r2 = com.incode.welcome_sdk.ui.qes.QESViewModel.f.f17176e + 79;
            com.incode.welcome_sdk.ui.qes.QESViewModel.f.f17177j = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void c(com.incode.welcome_sdk.data.remote.beans.bm r23) {
            /*
                r22 = this;
                r0 = r22
                r8 = 2
                int r1 = r8 % r8
                int r1 = com.incode.welcome_sdk.ui.qes.QESViewModel.f.f17176e
                int r4 = r1 + 97
                int r1 = r4 % 128
                com.incode.welcome_sdk.ui.qes.QESViewModel.f.f17177j = r1
                int r4 = r4 % r8
                java.lang.String r2 = ""
                r1 = 0
                r3 = r23
                if (r4 != 0) goto L7e
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                boolean r4 = r3.b()
                r2 = 37
                int r2 = r2 / 0
                if (r4 == 0) goto L88
            L22:
                com.incode.welcome_sdk.ui.qes.QESViewModel r2 = com.incode.welcome_sdk.ui.qes.QESViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r6 = com.incode.welcome_sdk.ui.qes.QESViewModel.access$get_uiState$p(r2)
                int r5 = r0.f17181d
                com.incode.welcome_sdk.ui.qes.DocumentState r4 = r0.f17178a
            L2c:
                java.lang.Object r2 = r6.getValue()
                r9 = r2
                com.incode.welcome_sdk.ui.qes.QESUiState r9 = (com.incode.welcome_sdk.ui.qes.QESUiState) r9
                java.util.List r7 = r9.getPdfDocuments()
                java.util.Collection r7 = (java.util.Collection) r7
                java.util.List r11 = kotlin.collections.CollectionsKt.toMutableList(r7)
                r7 = 1
                com.incode.welcome_sdk.ui.qes.DocumentState r7 = com.incode.welcome_sdk.ui.qes.DocumentState.copy$default(r4, r1, r7, r7, r1)
                r11.set(r5, r7)
                r20 = 1021(0x3fd, float:1.431E-42)
                r21 = 0
                r10 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                com.incode.welcome_sdk.ui.qes.QESUiState r7 = com.incode.welcome_sdk.ui.qes.QESUiState.copy$default(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                boolean r2 = r6.compareAndSet(r2, r7)
                if (r2 == 0) goto L2c
                int r1 = com.incode.welcome_sdk.ui.qes.QESViewModel.f.f17176e
                int r2 = r1 + 79
                int r1 = r2 % 128
                com.incode.welcome_sdk.ui.qes.QESViewModel.f.f17177j = r1
                int r2 = r2 % r8
                if (r2 != 0) goto L75
                com.incode.welcome_sdk.ui.qes.QESViewModel r2 = com.incode.welcome_sdk.ui.qes.QESViewModel.this
                java.util.List<com.incode.welcome_sdk.ui.qes.DocumentState> r1 = r0.f17179b
                int r0 = r0.f17181d
            L71:
                com.incode.welcome_sdk.ui.qes.QESViewModel.access$signDocuments(r2, r1, r0, r3)
                return
            L75:
                com.incode.welcome_sdk.ui.qes.QESViewModel r2 = com.incode.welcome_sdk.ui.qes.QESViewModel.this
                java.util.List<com.incode.welcome_sdk.ui.qes.DocumentState> r1 = r0.f17179b
                int r0 = r0.f17181d
                int r0 = r0 + 1
                goto L71
            L7e:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                boolean r2 = r3.b()
                if (r2 == 0) goto L88
                goto L22
            L88:
                com.incode.welcome_sdk.ui.qes.QESViewModel r3 = com.incode.welcome_sdk.ui.qes.QESViewModel.this
                com.incode.welcome_sdk.ui.qes.QESScreenState$SigningFailed r2 = com.incode.welcome_sdk.ui.qes.QESScreenState.SigningFailed.f17106d
                com.incode.welcome_sdk.ui.qes.QESScreenState r2 = (com.incode.welcome_sdk.ui.qes.QESScreenState) r2
                com.incode.welcome_sdk.ui.qes.QESViewModel.access$updateScreenState(r3, r2)
                com.incode.welcome_sdk.ui.qes.QESViewModel r2 = com.incode.welcome_sdk.ui.qes.QESViewModel.this
                androidx.lifecycle.ViewModel r2 = (androidx.lifecycle.ViewModel) r2
                kotlinx.coroutines.CoroutineScope r2 = androidx.lifecycle.ViewModelKt.getViewModelScope(r2)
                kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
                kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
                com.incode.welcome_sdk.ui.qes.QESViewModel$f$5 r5 = new com.incode.welcome_sdk.ui.qes.QESViewModel$f$5
                com.incode.welcome_sdk.ui.qes.QESViewModel r0 = com.incode.welcome_sdk.ui.qes.QESViewModel.this
                r5.<init>(r0, r1)
                kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
                r6 = 2
                r7 = 0
                r4 = 0
                kotlinx.coroutines.BuildersKt.launch$default(r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.qes.QESViewModel.f.c(com.incode.welcome_sdk.data.remote.beans.bm):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(List<DocumentState> list, int i2, DocumentState documentState) {
            super(1);
            this.f17179b = list;
            this.f17181d = i2;
            this.f17178a = documentState;
        }
    }

    static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17186a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17187b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f17189d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ bm f17190e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f17189d;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f17189d = 1;
                if (QESViewModel.access$handleResponseData(QESViewModel.this, this.f17190e, this) == coroutine_suspended) {
                    int i4 = f17186a + 15;
                    f17187b = i4 % 128;
                    int i5 = i4 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i6 = f17187b + 75;
                f17186a = i6 % 128;
                int i7 = i6 % 2;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f17187b + 95;
            f17186a = i3 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i3 % 2 != 0) {
                e(coroutineScope2, continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objE = e(coroutineScope2, continuation2);
            int i4 = f17186a + 115;
            f17187b = i4 % 128;
            int i5 = i4 % 2;
            return objE;
        }

        private Object e(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f17186a + 35;
            f17187b = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f17186a + 59;
            f17187b = i5 % 128;
            if (i5 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            g gVar = QESViewModel.this.new g(this.f17190e, continuation);
            int i3 = f17186a + 115;
            f17187b = i3 % 128;
            int i4 = i3 % 2;
            return gVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(bm bmVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f17190e = bmVar;
        }
    }

    private final void e(List<DocumentState> list, int i2, bm bmVar) {
        int i3 = 2 % 2;
        int i4 = f17147h + 115;
        f17148i = i4 % 128;
        if (i4 % 2 != 0) {
            if (i2 < list.size()) {
                DocumentState documentState = list.get(i2);
                d(documentState.getDocument().e(), new f(list, i2, documentState));
                int i5 = f17147h + 1;
                f17148i = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new g(bmVar, null), 2, null);
            return;
        }
        list.size();
        throw null;
    }

    static final class j extends SuspendLambda implements Function1<Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends bm>>>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17199c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17200e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f17201a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ String f17202d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            int i2 = 2 % 2;
            int i3 = f17199c + 113;
            f17200e = i3 % 128;
            int i4 = i3 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.f17201a;
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("documentRef", this.f17202d);
                jSONObject.putOpt("userConsented", Boxing.boxBoolean(true));
                RequestBody.Companion companion = RequestBody.Companion;
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                RequestBody requestBodyCreate = companion.create(string, MediaType.Companion.get(Constants.WUP_CONTENT_TYPE));
                com.incode.welcome_sdk.data.remote.b bVar = com.incode.welcome_sdk.data.remote.b.f8977c;
                com.incode.welcome_sdk.data.local.k kVar = com.incode.welcome_sdk.data.local.k.f8613e;
                String strE = com.incode.welcome_sdk.data.local.k.e();
                this.f17201a = 1;
                obj = com.incode.welcome_sdk.data.remote.b.a(strE, requestBodyCreate);
                if (obj == coroutine_suspended) {
                    int i6 = f17200e + 33;
                    f17199c = i6 % 128;
                    if (i6 % 2 == 0) {
                        return coroutine_suspended;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = f17199c + 69;
                f17200e = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 % 4;
                }
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends bm>>> continuation) throws JSONException {
            int i2 = 2 % 2;
            int i3 = f17199c + 41;
            f17200e = i3 % 128;
            int i4 = i3 % 2;
            Object objD = d(continuation);
            int i5 = f17199c + 51;
            f17200e = i5 % 128;
            int i6 = i5 % 2;
            return objD;
        }

        private Object d(Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<bm>>> continuation) throws JSONException {
            int i2 = 2 % 2;
            int i3 = f17199c + 115;
            f17200e = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((j) create(continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f17199c + 23;
            f17200e = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i2 = 2 % 2;
            j jVar = new j(this.f17202d, continuation);
            int i3 = f17199c + 113;
            f17200e = i3 % 128;
            int i4 = i3 % 2;
            return jVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, Continuation<? super j> continuation) {
            super(1, continuation);
            this.f17202d = str;
        }
    }

    private final void d(String str, Function1<? super bm, Unit> function1) {
        int i2 = 2 % 2;
        a(function1, new j(str, null));
        int i3 = f17147h + 109;
        f17148i = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 96 / 0;
        }
    }

    static final class e extends SuspendLambda implements Function1<Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ae>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17173a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17174b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f17175d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f17175d;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                com.incode.welcome_sdk.data.remote.b bVar = com.incode.welcome_sdk.data.remote.b.f8977c;
                com.incode.welcome_sdk.data.local.k kVar = com.incode.welcome_sdk.data.local.k.f8613e;
                String strE = com.incode.welcome_sdk.data.local.k.e();
                this.f17175d = 1;
                obj = com.incode.welcome_sdk.data.remote.b.d(strE);
                if (obj == coroutine_suspended) {
                    int i4 = f17173a + 99;
                    f17174b = i4 % 128;
                    int i5 = i4 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            int i6 = f17174b + 73;
            f17173a = i6 % 128;
            int i7 = i6 % 2;
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ae>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f17173a + 21;
            f17174b = i3 % 128;
            int i4 = i3 % 2;
            Object objE = e(continuation);
            if (i4 == 0) {
                int i5 = 47 / 0;
            }
            return objE;
        }

        private Object e(Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<ae>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f17174b + 117;
            f17173a = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((e) create(continuation)).invokeSuspend(Unit.INSTANCE);
            if (i4 != 0) {
                int i5 = 65 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i2 = 2 % 2;
            e eVar = new e(continuation);
            int i3 = f17173a + 25;
            f17174b = i3 % 128;
            int i4 = i3 % 2;
            return eVar;
        }

        e(Continuation<? super e> continuation) {
            super(1, continuation);
        }
    }

    private final void e() {
        int i2 = 2 % 2;
        b(this, new e(null));
        int i3 = f17148i + 19;
        f17147h = i3 % 128;
        int i4 = i3 % 2;
    }

    static final class b extends SuspendLambda implements Function1<Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ag>>>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17159b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17160e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f17161a;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f17159b + 23;
            f17160e = i3 % 128;
            int i4 = i3 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.f17161a;
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                com.incode.welcome_sdk.data.remote.b bVar = com.incode.welcome_sdk.data.remote.b.f8977c;
                com.incode.welcome_sdk.data.local.k kVar = com.incode.welcome_sdk.data.local.k.f8613e;
                String strE = com.incode.welcome_sdk.data.local.k.e();
                this.f17161a = 1;
                obj = com.incode.welcome_sdk.data.remote.b.a(strE);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            int i6 = f17160e + 9;
            f17159b = i6 % 128;
            int i7 = i6 % 2;
            return obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<? extends ag>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f17160e + 49;
            f17159b = i3 % 128;
            int i4 = i3 % 2;
            Object objE = e(continuation);
            int i5 = f17160e + 13;
            f17159b = i5 % 128;
            int i6 = i5 % 2;
            return objE;
        }

        private Object e(Continuation<? super Flow<? extends com.incode.welcome_sdk.data.remote.c<ag>>> continuation) {
            int i2 = 2 % 2;
            int i3 = f17159b + 99;
            f17160e = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f17160e + 43;
            f17159b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 90 / 0;
            }
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            int i2 = 2 % 2;
            b bVar = new b(continuation);
            int i3 = f17159b + 99;
            f17160e = i3 % 128;
            if (i3 % 2 != 0) {
                return bVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        b(Continuation<? super b> continuation) {
            super(1, continuation);
        }
    }

    private final void c() {
        int i2 = 2 % 2;
        b(this, new b(null));
        int i3 = f17147h + 21;
        f17148i = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void b(QESScreenState qESScreenState) {
        MutableStateFlow<QESUiState> mutableStateFlow;
        QESUiState value;
        int i2 = 2 % 2;
        int i3 = f17148i + 113;
        f17147h = i3 % 128;
        if (i3 % 2 != 0) {
            mutableStateFlow = this.f17152c;
            int i4 = 62 / 0;
        } else {
            mutableStateFlow = this.f17152c;
        }
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, QESUiState.copy$default(value, qESScreenState, null, false, false, false, false, null, null, null, null, PhotoshopDirectory.TAG_QUICK_MASK_INFORMATION, null)));
        int i5 = f17148i + 79;
        f17147h = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(kotlin.jvm.functions.Function1<? super com.incode.welcome_sdk.results.QESResult, kotlin.Unit> r7, com.incode.welcome_sdk.results.QESResult r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.qes.QESViewModel.f17148i
            int r1 = r0 + 81
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.qes.QESViewModel.f17147h = r0
            int r1 = r1 % r5
            boolean r0 = r9 instanceof com.incode.welcome_sdk.ui.qes.QESViewModel.c
            if (r0 == 0) goto L6a
            r4 = r9
            com.incode.welcome_sdk.ui.qes.QESViewModel$c r4 = (com.incode.welcome_sdk.ui.qes.QESViewModel.c) r4
            int r0 = r4.f17165b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L6a
            int r0 = r4.f17165b
            int r0 = r0 - r1
            r4.f17165b = r0
            int r0 = com.incode.welcome_sdk.ui.qes.QESViewModel.f17148i
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.qes.QESViewModel.f17147h = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L2c
            r0 = 4
            int r0 = r0 % r5
        L2c:
            java.lang.Object r3 = r4.f17164a
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f17165b
            r0 = 1
            if (r1 == 0) goto L4a
            if (r1 != r0) goto L70
            java.lang.Object r8 = r4.f17168e
            com.incode.welcome_sdk.results.QESResult r8 = (com.incode.welcome_sdk.results.QESResult) r8
            java.lang.Object r7 = r4.f17167d
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            kotlin.ResultKt.throwOnFailure(r3)
        L44:
            r7.invoke(r8)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L4a:
            kotlin.ResultKt.throwOnFailure(r3)
            r4.f17167d = r7
            r4.f17168e = r8
            r4.f17165b = r0
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r4)
            if (r0 != r2) goto L44
            int r0 = com.incode.welcome_sdk.ui.qes.QESViewModel.f17147h
            int r1 = r0 + 71
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.qes.QESViewModel.f17148i = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L69
            r0 = 3
            int r0 = r0 / 0
        L69:
            return r2
        L6a:
            com.incode.welcome_sdk.ui.qes.QESViewModel$c r4 = new com.incode.welcome_sdk.ui.qes.QESViewModel$c
            r4.<init>(r9)
            goto L2c
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.qes.QESViewModel.e(kotlin.jvm.functions.Function1, com.incode.welcome_sdk.results.QESResult, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f17162g = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f17163i = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f17164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f17165b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f17167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f17168e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f17162g + 65;
            f17163i = i3 % 128;
            int i4 = i3 % 2;
            Object obj2 = null;
            this.f17164a = obj;
            this.f17165b |= Integer.MIN_VALUE;
            QESViewModel qESViewModel = QESViewModel.this;
            c cVar = this;
            if (i4 != 0) {
                return QESViewModel.access$invokeWithDelay(qESViewModel, null, null, cVar);
            }
            QESViewModel.access$invokeWithDelay(qESViewModel, null, null, cVar);
            obj2.hashCode();
            throw null;
        }

        c(Continuation<? super c> continuation) {
            super(continuation);
        }
    }

    static {
        int i2 = f17146f + 93;
        f17149j = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 24 / 0;
        }
    }

    private final int a() {
        int iE = s.g.e();
        int iE2 = s.g.e();
        return ((Integer) c(-1880763330, s.g.e(), new Object[]{this}, iE, 1880763331, iE2, s.g.e())).intValue();
    }

    private final <T> Object d(T t2, Continuation<? super Unit> continuation) {
        int iE = s.g.e();
        int iE2 = s.g.e();
        return c(-218769597, s.g.e(), new Object[]{this, t2, continuation}, iE, 218769597, iE2, s.g.e());
    }
}
