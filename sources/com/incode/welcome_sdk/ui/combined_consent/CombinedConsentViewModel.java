package com.incode.welcome_sdk.ui.combined_consent;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.dynatrace.android.agent.Global;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.c;
import com.incode.welcome_sdk.commons.b;
import com.incode.welcome_sdk.commons.exceptions.IncodeGenericError;
import com.incode.welcome_sdk.commons.n;
import com.incode.welcome_sdk.commons.utils.aa;
import com.incode.welcome_sdk.data.CombinedConsentData;
import com.incode.welcome_sdk.data.ConsentData;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.Consent;
import com.incode.welcome_sdk.data.remote.beans.ResponseCombinedConsent;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.data.remote.beans.bn;
import com.incode.welcome_sdk.data.remote.beans.bq;
import com.incode.welcome_sdk.modules.CombinedConsent;
import com.incode.welcome_sdk.results.CombinedConsentResult;
import com.incode.welcome_sdk.results.ResultCode;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class CombinedConsentViewModel extends ViewModel {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f12902k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f12903l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f12904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CombinedConsent f12905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f12906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IncodeWelcomeRepository f12907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final aa f12908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f12909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f12910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CoroutineDispatcher f12911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final StateFlow<CombinedConsentUiState> f12912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final MutableStateFlow<CombinedConsentUiState> f12913j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.incode.welcome_sdk.c f12914n;

    public static final /* synthetic */ String access$getHtmlContent$p(CombinedConsentViewModel combinedConsentViewModel) {
        int i2 = 2 % 2;
        int i3 = f12902k;
        int i4 = i3 + 17;
        f12903l = i4 % 128;
        int i5 = i4 % 2;
        String str = combinedConsentViewModel.f12909f;
        int i6 = i3 + 81;
        f12903l = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final /* synthetic */ aa access$getMarkdownHtmlHelper$p(CombinedConsentViewModel combinedConsentViewModel) {
        int i2 = 2 % 2;
        int i3 = f12903l + 19;
        int i4 = i3 % 128;
        f12902k = i4;
        int i5 = i3 % 2;
        aa aaVar = combinedConsentViewModel.f12908e;
        int i6 = i4 + 9;
        f12903l = i6 % 128;
        int i7 = i6 % 2;
        return aaVar;
    }

    public static final /* synthetic */ IncodeWelcomeRepository access$getRepository$p(CombinedConsentViewModel combinedConsentViewModel) {
        int i2 = 2 % 2;
        int i3 = f12903l + 37;
        f12902k = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = combinedConsentViewModel.f12907d;
        if (i4 != 0) {
            return incodeWelcomeRepository;
        }
        throw null;
    }

    public static final /* synthetic */ MutableStateFlow access$get_state$p(CombinedConsentViewModel combinedConsentViewModel) {
        int i2 = 2 % 2;
        int i3 = f12902k + 95;
        int i4 = i3 % 128;
        f12903l = i4;
        int i5 = i3 % 2;
        MutableStateFlow<CombinedConsentUiState> mutableStateFlow = combinedConsentViewModel.f12913j;
        int i6 = i4 + 125;
        f12902k = i6 % 128;
        int i7 = i6 % 2;
        return mutableStateFlow;
    }

    public /* synthetic */ CombinedConsentViewModel(CombinedConsent combinedConsent, n nVar, b bVar, IncodeWelcomeRepository incodeWelcomeRepository, aa aaVar, CoroutineDispatcher coroutineDispatcher, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(combinedConsent, nVar, bVar, incodeWelcomeRepository, aaVar, (i2 & 32) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public CombinedConsentViewModel(CombinedConsent combinedConsent, n nVar, b bVar, IncodeWelcomeRepository incodeWelcomeRepository, aa aaVar, CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(combinedConsent, "");
        Intrinsics.checkNotNullParameter(nVar, "");
        Intrinsics.checkNotNullParameter(bVar, "");
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(aaVar, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.f12905b = combinedConsent;
        this.f12904a = nVar;
        this.f12906c = bVar;
        this.f12907d = incodeWelcomeRepository;
        this.f12908e = aaVar;
        this.f12911h = coroutineDispatcher;
        MutableStateFlow<CombinedConsentUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new CombinedConsentUiState(null, null, null, null, false, 31, null));
        this.f12913j = MutableStateFlow;
        this.f12912i = MutableStateFlow;
        this.f12910g = IncodeWelcome.Companion.getInstance().isDelayedMode();
        c.b bVar2 = com.incode.welcome_sdk.c.f4426a;
        this.f12914n = c.b.d();
        nVar.e(ScreenName.COMBINED_CONSENT);
        c();
        d();
    }

    public final StateFlow<CombinedConsentUiState> getState() {
        int i2 = 2 % 2;
        int i3 = f12903l;
        int i4 = i3 + 31;
        f12902k = i4 % 128;
        int i5 = i4 % 2;
        StateFlow<CombinedConsentUiState> stateFlow = this.f12912i;
        int i6 = i3 + 13;
        f12902k = i6 % 128;
        int i7 = i6 % 2;
        return stateFlow;
    }

    private final void c() {
        int i2 = 2 % 2;
        int i3 = f12903l + 33;
        f12902k = i3 % 128;
        if (i3 % 2 != 0) {
            this.f12909f = this.f12908e.a();
        } else {
            this.f12909f = this.f12908e.a();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f A[PHI: r14
  0x007f: PHI (r14v4 com.incode.welcome_sdk.ui.combined_consent.CheckboxState) = 
  (r14v2 com.incode.welcome_sdk.ui.combined_consent.CheckboxState)
  (r14v7 com.incode.welcome_sdk.ui.combined_consent.CheckboxState)
 binds: [B:16:0x00a0, B:12:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void updateCheckboxState(java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.combined_consent.CombinedConsentViewModel.updateCheckboxState(java.lang.String, boolean):void");
    }

    public final void updatePageLoadedState(boolean z2) {
        CombinedConsentUiState value;
        int i2 = 2 % 2;
        int i3 = f12903l + 1;
        f12902k = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<CombinedConsentUiState> mutableStateFlow = this.f12913j;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, CombinedConsentUiState.copy$default(value, null, null, null, null, z2, 15, null)));
        int i5 = f12902k + 7;
        f12903l = i5 % 128;
        int i6 = i5 % 2;
    }

    static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12915e = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f12916i = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ String f12919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ String f12920d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objAwait = obj;
            int i2 = 2 % 2;
            int i3 = f12916i + 53;
            f12915e = i3 % 128;
            String str = null;
            if (i3 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                str.hashCode();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f12918b;
            try {
                if (i4 == 0) {
                    ResultKt.throwOnFailure(objAwait);
                    Single<ResponseCombinedConsent> combinedConsent = CombinedConsentViewModel.access$getRepository$p(CombinedConsentViewModel.this).getCombinedConsent(this.f12920d, this.f12919c);
                    Intrinsics.checkNotNullExpressionValue(combinedConsent, "");
                    this.f12918b = 1;
                    objAwait = RxAwaitKt.await(combinedConsent, this);
                    if (objAwait == coroutine_suspended) {
                        int i5 = f12915e + 41;
                        f12916i = i5 % 128;
                        if (i5 % 2 != 0) {
                            return coroutine_suspended;
                        }
                        throw null;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objAwait);
                }
                ResponseCombinedConsent responseCombinedConsent = (ResponseCombinedConsent) objAwait;
                MutableStateFlow mutableStateFlowAccess$get_state$p = CombinedConsentViewModel.access$get_state$p(CombinedConsentViewModel.this);
                String languageConsentId = responseCombinedConsent.getLanguageConsentId();
                String title = responseCombinedConsent.getTitle();
                CombinedConsentViewModel.access$getMarkdownHtmlHelper$p(CombinedConsentViewModel.this);
                String strAccess$getHtmlContent$p = CombinedConsentViewModel.access$getHtmlContent$p(CombinedConsentViewModel.this);
                if (strAccess$getHtmlContent$p == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    str = strAccess$getHtmlContent$p;
                }
                String strE = aa.e(str, responseCombinedConsent.getTerms());
                List<Consent> consents = responseCombinedConsent.getConsents();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(consents, 10));
                int i6 = f12916i + 13;
                f12915e = i6 % 128;
                int i7 = i6 % 2;
                for (Consent consent : consents) {
                    arrayList.add(new CheckboxState(consent.getCheckboxId(), false, consent.getConsentText(), consent.getOptional()));
                }
                mutableStateFlowAccess$get_state$p.setValue(new CombinedConsentUiState(languageConsentId, title, strE, arrayList, false, 16, null));
            } catch (Exception e2) {
                Exception exc = e2;
                Timber.Forest.e(exc, "Error occurred while fetching consents", new Object[0]);
                CombinedConsentViewModel.this.publishResult(new CombinedConsentResult(ResultCode.ERROR, exc, false, 4, null));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f12915e + 57;
            f12916i = i3 % 128;
            int i4 = i3 % 2;
            Object objA = a(coroutineScope, continuation);
            if (i4 == 0) {
                int i5 = 42 / 0;
            }
            return objA;
        }

        private Object a(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f12915e + 115;
            f12916i = i3 % 128;
            int i4 = i3 % 2;
            c cVar = (c) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return cVar.invokeSuspend(unit);
            }
            cVar.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            c cVar = CombinedConsentViewModel.this.new c(this.f12920d, this.f12919c, continuation);
            int i3 = f12915e + 91;
            f12916i = i3 % 128;
            int i4 = i3 % 2;
            return cVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f12920d = str;
            this.f12919c = str2;
        }
    }

    private final void d() {
        int i2 = 2 % 2;
        boolean z2 = false;
        String str = null;
        if (!this.f12910g) {
            String combinedConsentsId = this.f12905b.getCombinedConsentsId();
            String str2 = combinedConsentsId;
            if (str2 == null || str2.length() == 0) {
                publishResult(new CombinedConsentResult(ResultCode.ERROR, new IncodeGenericError("Combined consent ID was not provided."), false, 4, null));
                return;
            }
            String localizationLanguage = this.f12907d.getPersistedCommonConfig().getLocalizationLanguage();
            if (localizationLanguage.length() == 0) {
                int i3 = f12903l + 73;
                f12902k = i3 % 128;
                if (i3 % 2 != 0) {
                    z2 = true;
                }
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.f12911h, null, new c(combinedConsentsId, z2 ? Locale.getDefault().getLanguage() + Global.HYPHEN + Locale.getDefault().getCountry() : StringsKt.replace$default(localizationLanguage, Global.UNDERSCORE, Global.HYPHEN, false, 4, (Object) null), null), 2, null);
            return;
        }
        CombinedConsentData offlineConsent = this.f12905b.getOfflineConsent();
        if (offlineConsent == null) {
            publishResult(new CombinedConsentResult(ResultCode.ERROR, new IncodeGenericError("Offline combined consent data was not provided."), false, 4, null));
            int i4 = f12902k + 103;
            f12903l = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        MutableStateFlow<CombinedConsentUiState> mutableStateFlow = this.f12913j;
        String languageConsentId = offlineConsent.getLanguageConsentId();
        String title = offlineConsent.getTitle();
        String str3 = this.f12909f;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            str = str3;
        }
        String strE = aa.e(str, offlineConsent.getTerms());
        List<ConsentData> consents = offlineConsent.getConsents();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(consents, 10));
        for (ConsentData consentData : consents) {
            arrayList.add(new CheckboxState(consentData.getCheckboxId(), false, consentData.getConsentText(), consentData.getOptional()));
        }
        mutableStateFlow.setValue(new CombinedConsentUiState(languageConsentId, title, strE, arrayList, false, 16, null));
    }

    static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12921a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12922e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12923b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ bn f12925d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i2 = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.f12923b;
            try {
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Single<ResponseSuccess> singleSignCombinedConsent = CombinedConsentViewModel.access$getRepository$p(CombinedConsentViewModel.this).signCombinedConsent(this.f12925d);
                    Intrinsics.checkNotNullExpressionValue(singleSignCombinedConsent, "");
                    this.f12923b = 1;
                    obj = RxAwaitKt.await(singleSignCombinedConsent, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i4 = f12921a + 81;
                    f12922e = i4 % 128;
                    int i5 = i4 % 2;
                }
                if (((ResponseSuccess) obj).isSuccess()) {
                    CombinedConsentViewModel.this.publishResult(new CombinedConsentResult(ResultCode.SUCCESS, null, true));
                } else {
                    CombinedConsentViewModel.this.publishResult(new CombinedConsentResult(ResultCode.ERROR, new IncodeGenericError("Exception occurred while signing consents"), false, 4, null));
                    int i6 = f12922e + 103;
                    f12921a = i6 % 128;
                    int i7 = i6 % 2;
                }
            } catch (Exception e2) {
                Exception exc = e2;
                Timber.Forest.e(exc, "Exception occurred while signing consents", new Object[0]);
                CombinedConsentViewModel.this.publishResult(new CombinedConsentResult(ResultCode.ERROR, exc, false, 4, null));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f12922e + 75;
            f12921a = i3 % 128;
            int i4 = i3 % 2;
            Object objC = c(coroutineScope, continuation);
            int i5 = f12922e + 61;
            f12921a = i5 % 128;
            if (i5 % 2 != 0) {
                return objC;
            }
            throw null;
        }

        private Object c(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            int i2 = 2 % 2;
            int i3 = f12922e + 45;
            f12921a = i3 % 128;
            int i4 = i3 % 2;
            d dVar = (d) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return dVar.invokeSuspend(unit);
            }
            dVar.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            d dVar = CombinedConsentViewModel.this.new d(this.f12925d, continuation);
            int i3 = f12921a + 73;
            f12922e = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 36 / 0;
            }
            return dVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(bn bnVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f12925d = bnVar;
        }
    }

    public final void sendCombinedConsent() {
        int i2 = 2 % 2;
        List<CheckboxState> consents = this.f12912i.getValue().getConsents();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(consents, 10)), 16));
        int i3 = f12903l + 121;
        f12902k = i3 % 128;
        int i4 = i3 % 2;
        for (CheckboxState checkboxState : consents) {
            int i5 = f12902k + 21;
            f12903l = i5 % 128;
            int i6 = i5 % 2;
            Pair pair = TuplesKt.to(checkboxState.getCheckboxId(), Boolean.valueOf(checkboxState.isChecked()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        bn bnVar = new bn(this.f12912i.getValue().getLanguageConsentId(), linkedHashMap);
        if (!this.f12910g) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.f12911h, null, new d(bnVar, null), 2, null);
            return;
        }
        this.f12914n.d(bq.a(bnVar));
        publishResult(new CombinedConsentResult(ResultCode.SUCCESS, null, true));
    }

    public final void publishResult(CombinedConsentResult combinedConsentResult) {
        int i2 = 2 % 2;
        int i3 = f12903l + 111;
        f12902k = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(combinedConsentResult, "");
        com.incode.welcome_sdk.b.publish(combinedConsentResult);
        this.f12906c.getCloseScreenAction().invoke();
        int i5 = f12903l + 121;
        f12902k = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
