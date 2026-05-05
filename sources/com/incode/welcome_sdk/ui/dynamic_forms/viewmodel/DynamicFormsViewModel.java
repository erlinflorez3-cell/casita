package com.incode.welcome_sdk.ui.dynamic_forms.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.b;
import com.incode.welcome_sdk.commons.extensions.h;
import com.incode.welcome_sdk.commons.utils.al;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.local.a;
import com.incode.welcome_sdk.data.remote.beans.ResponseSuccess;
import com.incode.welcome_sdk.modules.DynamicForms;
import com.incode.welcome_sdk.results.DynamicFormQuestionnaireModel;
import com.incode.welcome_sdk.results.DynamicFormsResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseViewModel;
import com.incode.welcome_sdk.ui.combined_consent.view.components.MarkdownCheckBoxKt;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsContainerUiState;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsPhoneInputUiState;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsSelectInputUiState;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsYesNoUiState;
import com.incode.welcome_sdk.ui.dynamic_forms.state.TextInputType;
import com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class DynamicFormsViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f14049l = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static int f14050q = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f14051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DynamicForms f14052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PhoneNumberUtil f14053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<a> f14054d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IncodeWelcomeRepository f14055e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CoroutineDispatcher f14056f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CoroutineDispatcher f14057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f14058h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<FormsContainerUiState> f14059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f14060j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Throwable f14061k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final MutableStateFlow<FormsContainerUiState> f14062m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<DynamicFormQuestionnaireModel> f14063n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final StateFlow<FormsContainerUiState> f14064o;

    public static /* synthetic */ Object e(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = (~((~i5) | i4)) | (~(i4 | i2));
        int i9 = (~i4) | (~i2);
        int i10 = i8 | (~(i9 | i5));
        int i11 = (~i9) | i5;
        int i12 = ~(i2 | i5);
        int i13 = i5 + i4 + i6 + ((-417414852) * i7) + (1247522396 * i3);
        int i14 = i13 * i13;
        int i15 = (i5 * (-1219797419)) + 1526988800 + ((-1219797419) * i4) + (825712212 * i10) + ((-1651424424) * i11) + ((-825712212) * i12) + ((-2045509632) * i6) + ((-2135949312) * i7) + ((-953155584) * i3) + ((-430374912) * i14);
        int i16 = ((i5 * 184508743) - 476012450) + (i4 * 184508743) + (i10 * (-996)) + (i11 * 1992) + (i12 * 996) + (i6 * 184509739) + (i7 * (-953474796)) + (i3 * (-288057996)) + (i14 * (-839712768));
        if (i15 + (i16 * i16 * 1709113344) != 1) {
            DynamicFormsViewModel dynamicFormsViewModel = (DynamicFormsViewModel) objArr[0];
            DynamicFormsResult dynamicFormsResult = (DynamicFormsResult) objArr[1];
            int i17 = 2 % 2;
            int i18 = f14050q + 15;
            f14049l = i18 % 128;
            int i19 = i18 % 2;
            dynamicFormsViewModel.publishResult(IncodeWelcome.Companion.getInstance().getDynamicFormsBus(), dynamicFormsResult);
            int i20 = f14050q + 31;
            f14049l = i20 % 128;
            int i21 = i20 % 2;
            return null;
        }
        int i22 = 2 % 2;
        List<a> list = ((DynamicFormsViewModel) objArr[0]).f14054d;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i23 = f14050q + 1;
        f14049l = i23 % 128;
        int i24 = i23 % 2;
        for (a aVar : list) {
            arrayList.add(new FormsCountrySelectorUiState.CountryUiState(aVar.b(), aVar.e(), aVar.d()));
        }
        ArrayList arrayList2 = arrayList;
        int i25 = f14049l + 85;
        f14050q = i25 % 128;
        int i26 = i25 % 2;
        return arrayList2;
    }

    public static final /* synthetic */ b access$getActivityActionsHandler$p(DynamicFormsViewModel dynamicFormsViewModel) {
        int i2 = 2 % 2;
        int i3 = f14050q + 101;
        f14049l = i3 % 128;
        int i4 = i3 % 2;
        b bVar = dynamicFormsViewModel.f14051a;
        if (i4 != 0) {
            int i5 = 96 / 0;
        }
        return bVar;
    }

    public static final /* synthetic */ String access$getAnswerApiRequestFormatted(DynamicFormsViewModel dynamicFormsViewModel, FormsInputUiState formsInputUiState) {
        int i2 = 2 % 2;
        int i3 = f14049l + 73;
        f14050q = i3 % 128;
        int i4 = i3 % 2;
        String strC = c((FormsInputUiState<?>) formsInputUiState);
        if (i4 == 0) {
            int i5 = 1 / 0;
        }
        int i6 = f14049l + 7;
        f14050q = i6 % 128;
        int i7 = i6 % 2;
        return strC;
    }

    public static final /* synthetic */ int access$getCurrentPage$p(DynamicFormsViewModel dynamicFormsViewModel) {
        int i2 = 2 % 2;
        int i3 = f14049l + 81;
        int i4 = i3 % 128;
        f14050q = i4;
        int i5 = i3 % 2;
        int i6 = dynamicFormsViewModel.f14058h;
        int i7 = i4 + 83;
        f14049l = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 2 / 0;
        }
        return i6;
    }

    public static final /* synthetic */ CoroutineDispatcher access$getDispatcherMain$p(DynamicFormsViewModel dynamicFormsViewModel) {
        int i2 = 2 % 2;
        int i3 = f14050q + 101;
        int i4 = i3 % 128;
        f14049l = i4;
        int i5 = i3 % 2;
        CoroutineDispatcher coroutineDispatcher = dynamicFormsViewModel.f14056f;
        int i6 = i4 + 21;
        f14050q = i6 % 128;
        int i7 = i6 % 2;
        return coroutineDispatcher;
    }

    public static final /* synthetic */ Throwable access$getError$p(DynamicFormsViewModel dynamicFormsViewModel) {
        int i2 = 2 % 2;
        int i3 = f14049l + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f14050q = i3 % 128;
        int i4 = i3 % 2;
        Throwable th = dynamicFormsViewModel.f14061k;
        if (i4 != 0) {
            return th;
        }
        throw null;
    }

    public static final /* synthetic */ List access$getFormAnswers$p(DynamicFormsViewModel dynamicFormsViewModel) {
        int i2 = 2 % 2;
        int i3 = f14050q;
        int i4 = i3 + 27;
        f14049l = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        List<DynamicFormQuestionnaireModel> list = dynamicFormsViewModel.f14063n;
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 69;
        f14049l = i6 % 128;
        if (i6 % 2 == 0) {
            return list;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ List access$getPages$p(DynamicFormsViewModel dynamicFormsViewModel) {
        int i2 = 2 % 2;
        int i3 = f14050q;
        int i4 = i3 + 41;
        f14049l = i4 % 128;
        int i5 = i4 % 2;
        List<FormsContainerUiState> list = dynamicFormsViewModel.f14059i;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 93;
        f14049l = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    public static final /* synthetic */ IncodeWelcomeRepository access$getRepo$p(DynamicFormsViewModel dynamicFormsViewModel) {
        int i2 = 2 % 2;
        int i3 = f14049l + 79;
        f14050q = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = dynamicFormsViewModel.f14055e;
        if (i4 != 0) {
            return incodeWelcomeRepository;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ MutableStateFlow access$get_state$p(DynamicFormsViewModel dynamicFormsViewModel) {
        int i2 = 2 % 2;
        int i3 = f14049l;
        int i4 = i3 + 71;
        f14050q = i4 % 128;
        int i5 = i4 % 2;
        MutableStateFlow<FormsContainerUiState> mutableStateFlow = dynamicFormsViewModel.f14062m;
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i3 + 83;
        f14050q = i6 % 128;
        int i7 = i6 % 2;
        return mutableStateFlow;
    }

    public static final /* synthetic */ void access$publishResult(DynamicFormsViewModel dynamicFormsViewModel, DynamicFormsResult dynamicFormsResult) {
        int i2 = 2 % 2;
        int i3 = f14049l + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f14050q = i3 % 128;
        if (i3 % 2 != 0) {
            int iC = MarkdownCheckBoxKt.c();
            e(iC, MarkdownCheckBoxKt.c(), -1321456914, new Object[]{dynamicFormsViewModel, dynamicFormsResult}, 1321456914, MarkdownCheckBoxKt.c(), MarkdownCheckBoxKt.c());
            return;
        }
        int iC2 = MarkdownCheckBoxKt.c();
        e(iC2, MarkdownCheckBoxKt.c(), -1321456914, new Object[]{dynamicFormsViewModel, dynamicFormsResult}, 1321456914, MarkdownCheckBoxKt.c(), MarkdownCheckBoxKt.c());
        throw null;
    }

    public static final /* synthetic */ void access$setCurrentPage$p(DynamicFormsViewModel dynamicFormsViewModel, int i2) {
        int i3 = 2 % 2;
        int i4 = f14050q + 41;
        int i5 = i4 % 128;
        f14049l = i5;
        int i6 = i4 % 2;
        dynamicFormsViewModel.f14058h = i2;
        if (i6 != 0) {
            throw null;
        }
        int i7 = i5 + 15;
        f14050q = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 0 / 0;
        }
    }

    public static final /* synthetic */ void access$setError$p(DynamicFormsViewModel dynamicFormsViewModel, Throwable th) {
        int i2 = 2 % 2;
        int i3 = f14049l;
        int i4 = i3 + 11;
        f14050q = i4 % 128;
        int i5 = i4 % 2;
        dynamicFormsViewModel.f14061k = th;
        int i6 = i3 + 43;
        f14050q = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ DynamicFormsViewModel(b bVar, DynamicForms dynamicForms, IncodeWelcomeRepository incodeWelcomeRepository, List list, PhoneNumberUtil phoneNumberUtil, String str, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, dynamicForms, incodeWelcomeRepository, list, phoneNumberUtil, str, (i2 & 64) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i2 & 128) != 0 ? Dispatchers.getMain() : coroutineDispatcher2);
    }

    public DynamicFormsViewModel(b bVar, DynamicForms dynamicForms, IncodeWelcomeRepository incodeWelcomeRepository, List<a> list, PhoneNumberUtil phoneNumberUtil, String str, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
        Intrinsics.checkNotNullParameter(bVar, "");
        Intrinsics.checkNotNullParameter(dynamicForms, "");
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(phoneNumberUtil, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        this.f14051a = bVar;
        this.f14052b = dynamicForms;
        this.f14055e = incodeWelcomeRepository;
        this.f14054d = list;
        this.f14053c = phoneNumberUtil;
        this.f14060j = str;
        this.f14057g = coroutineDispatcher;
        this.f14056f = coroutineDispatcher2;
        this.f14063n = new ArrayList();
        b();
        List<FormsContainerUiState> list2 = this.f14059i;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            list2 = null;
        }
        MutableStateFlow<FormsContainerUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.first((List) list2));
        this.f14062m = MutableStateFlow;
        this.f14064o = MutableStateFlow;
    }

    public final StateFlow<FormsContainerUiState> getState() {
        int i2 = 2 % 2;
        int i3 = f14050q + 93;
        int i4 = i3 % 128;
        f14049l = i4;
        int i5 = i3 % 2;
        StateFlow<FormsContainerUiState> stateFlow = this.f14064o;
        int i6 = i4 + 91;
        f14050q = i6 % 128;
        if (i6 % 2 != 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void b() {
        FormsInputUiState formsSelectInputUiState;
        TextInputType textInputType;
        List<DynamicForms.Screen> screens = this.f14052b.getScreens();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(screens, 10));
        int i2 = 0;
        for (Object obj : screens) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DynamicForms.Screen screen = (DynamicForms.Screen) obj;
            List<DynamicForms.Screen.Question> questions = screen.getQuestions();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(questions, 10));
            for (DynamicForms.Screen.Question question : questions) {
                DynamicForms.InputType inputType = question.getInputType();
                switch (WhenMappings.f14067d[inputType.ordinal()]) {
                    case 1:
                        formsSelectInputUiState = new FormsTextInputUiState(question.getId(), question.getQuestionText(), null, inputType, false, TextInputType.f13398d, 20, null);
                        break;
                    case 2:
                        formsSelectInputUiState = new FormsTextInputUiState(question.getId(), question.getQuestionText(), null, inputType, false, TextInputType.f13399e, 20, null);
                        break;
                    case 3:
                        String id = question.getId();
                        String questionText = question.getQuestionText();
                        if (question.getPredefinedQuestionType().isName()) {
                            textInputType = TextInputType.f13396b;
                        } else {
                            textInputType = TextInputType.f13397c;
                        }
                        formsSelectInputUiState = new FormsTextInputUiState(id, questionText, null, inputType, false, textInputType, 20, null);
                        break;
                    case 4:
                        formsSelectInputUiState = new FormsTextInputUiState(question.getId(), question.getQuestionText(), null, inputType, false, TextInputType.f13395a, 20, null);
                        break;
                    case 5:
                        formsSelectInputUiState = new FormsPhoneInputUiState(question.getId(), question.getQuestionText(), c(), null, false, null, 56, null);
                        break;
                    case 6:
                        formsSelectInputUiState = new FormsDateInputUiState(question.getId(), question.getQuestionText(), null, null, false, false, 60, null);
                        break;
                    case 7:
                        formsSelectInputUiState = new FormsYesNoUiState(question.getId(), question.getQuestionText(), null, null, false, 28, null);
                        break;
                    case 8:
                        formsSelectInputUiState = new FormsCountrySelectorUiState(question.getId(), question.getQuestionText(), null, inputType, false, null, (List) e(MarkdownCheckBoxKt.c(), MarkdownCheckBoxKt.c(), 442996923, new Object[]{this}, -442996922, MarkdownCheckBoxKt.c(), MarkdownCheckBoxKt.c()), null, false, 436, null);
                        break;
                    case 9:
                        formsSelectInputUiState = new FormsSelectInputUiState(question.getOptions(), question.getId(), question.getQuestionText(), null, null, false, 56, null);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                arrayList2.add(formsSelectInputUiState);
            }
            arrayList.add(new FormsContainerUiState(arrayList2, !screen.getHideTitle() ? screen.getTitle() : null, CollectionsKt.getLastIndex(this.f14052b.getScreens()) == i2, false, false, 24, null));
            i2 = i3;
        }
        this.f14059i = arrayList;
    }

    static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f14069a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14070e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ DynamicFormsViewModel f14071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f14072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ List<FormsInputUiState<?>> f14073d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f14070e + 79;
            f14069a = i3 % 128;
            int i4 = i3 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.f14072c;
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                List<FormsInputUiState<?>> list = this.f14073d;
                DynamicFormsViewModel dynamicFormsViewModel = this.f14071b;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    FormsInputUiState formsInputUiState = (FormsInputUiState) it.next();
                    String strAccess$getAnswerApiRequestFormatted = DynamicFormsViewModel.access$getAnswerApiRequestFormatted(dynamicFormsViewModel, formsInputUiState);
                    Single<ResponseSuccess> singleSubmitDynamicForm = DynamicFormsViewModel.access$getRepo$p(dynamicFormsViewModel).submitDynamicForm(formsInputUiState.getId(), strAccess$getAnswerApiRequestFormatted);
                    final c cVar = new c(dynamicFormsViewModel);
                    singleSubmitDynamicForm.onErrorResumeNext(new Function() { // from class: com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel$d$$ExternalSyntheticLambda0
                        @Override // io.reactivex.functions.Function
                        public final Object apply(Object obj2) {
                            return DynamicFormsViewModel.d.a(cVar, obj2);
                        }
                    }).blockingGet();
                    DynamicFormsViewModel.access$getFormAnswers$p(dynamicFormsViewModel).add(new DynamicFormQuestionnaireModel(DynamicFormsViewModel.access$getRepo$p(dynamicFormsViewModel).getInterviewId(), formsInputUiState.getId(), formsInputUiState.getQuestionText(), formsInputUiState.getFormInputType(), new DynamicFormQuestionnaireModel.AnswerModel(strAccess$getAnswerApiRequestFormatted)));
                }
                this.f14072c = 1;
                if (BuildersKt.withContext(DynamicFormsViewModel.access$getDispatcherMain$p(this.f14071b), new AnonymousClass4(this.f14071b, null), this) == coroutine_suspended) {
                    int i6 = f14070e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                    f14069a = i6 % 128;
                    if (i6 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    throw null;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        static final class c extends Lambda implements Function1<Throwable, SingleSource<? extends ResponseSuccess>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f14078b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f14079c = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private /* synthetic */ DynamicFormsViewModel f14080e;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ SingleSource<? extends ResponseSuccess> invoke(Throwable th) {
                int i2 = 2 % 2;
                int i3 = f14079c + 27;
                f14078b = i3 % 128;
                int i4 = i3 % 2;
                SingleSource<? extends ResponseSuccess> singleSourceD = d(th);
                int i5 = f14078b + 35;
                f14079c = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 33 / 0;
                }
                return singleSourceD;
            }

            private SingleSource<? extends ResponseSuccess> d(Throwable th) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(th, "");
                Timber.Forest.w(th);
                DynamicFormsViewModel.access$setError$p(this.f14080e, th);
                Single singleJust = Single.just(new ResponseSuccess(false));
                int i3 = f14079c + 75;
                f14078b = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 34 / 0;
                }
                return singleJust;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(DynamicFormsViewModel dynamicFormsViewModel) {
                super(1);
                this.f14080e = dynamicFormsViewModel;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SingleSource a(Function1 function1, Object obj) {
            int i2 = 2 % 2;
            int i3 = f14070e + 17;
            f14069a = i3 % 128;
            int i4 = i3 % 2;
            SingleSource singleSource = (SingleSource) function1.invoke(obj);
            int i5 = f14069a + 53;
            f14070e = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 6 / 0;
            }
            return singleSource;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel$d$4, reason: invalid class name */
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f14074a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f14075d = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f14076b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ DynamicFormsViewModel f14077c;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ResultCode resultCode;
                int i2 = 2 % 2;
                int i3 = f14075d + 19;
                f14074a = i3 % 128;
                int i4 = i3 % 2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                int iAccess$getCurrentPage$p = DynamicFormsViewModel.access$getCurrentPage$p(this.f14077c);
                List listAccess$getPages$p = DynamicFormsViewModel.access$getPages$p(this.f14077c);
                List list = null;
                if (listAccess$getPages$p == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i5 = f14074a + 75;
                    f14075d = i5 % 128;
                    int i6 = i5 % 2;
                    listAccess$getPages$p = null;
                }
                if (iAccess$getCurrentPage$p != CollectionsKt.getLastIndex(listAccess$getPages$p)) {
                    DynamicFormsViewModel dynamicFormsViewModel = this.f14077c;
                    DynamicFormsViewModel.access$setCurrentPage$p(dynamicFormsViewModel, DynamicFormsViewModel.access$getCurrentPage$p(dynamicFormsViewModel) + 1);
                    MutableStateFlow mutableStateFlowAccess$get_state$p = DynamicFormsViewModel.access$get_state$p(this.f14077c);
                    List listAccess$getPages$p2 = DynamicFormsViewModel.access$getPages$p(this.f14077c);
                    if (listAccess$getPages$p2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        list = listAccess$getPages$p2;
                    }
                    mutableStateFlowAccess$get_state$p.setValue(list.get(DynamicFormsViewModel.access$getCurrentPage$p(this.f14077c)));
                    Unit unit = Unit.INSTANCE;
                    int i7 = f14075d + 51;
                    f14074a = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 28 / 0;
                    }
                    return unit;
                }
                int i9 = f14074a + 53;
                f14075d = i9 % 128;
                int i10 = i9 % 2;
                DynamicFormsViewModel.access$getActivityActionsHandler$p(this.f14077c).getCloseScreenAction().invoke();
                if (DynamicFormsViewModel.access$getError$p(this.f14077c) == null) {
                    int i11 = f14074a + 107;
                    f14075d = i11 % 128;
                    if (i11 % 2 != 0) {
                        resultCode = ResultCode.SUCCESS;
                        int i12 = 35 / 0;
                    } else {
                        resultCode = ResultCode.SUCCESS;
                    }
                } else {
                    resultCode = ResultCode.ERROR;
                }
                DynamicFormsViewModel dynamicFormsViewModel2 = this.f14077c;
                DynamicFormsViewModel.access$publishResult(dynamicFormsViewModel2, new DynamicFormsResult(resultCode, DynamicFormsViewModel.access$getError$p(this.f14077c), false, DynamicFormsViewModel.access$getFormAnswers$p(dynamicFormsViewModel2), 4, null));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f14074a + 23;
                f14075d = i3 % 128;
                int i4 = i3 % 2;
                Object objC = c(coroutineScope, continuation);
                int i5 = f14074a + 41;
                f14075d = i5 % 128;
                int i6 = i5 % 2;
                return objC;
            }

            private Object c(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i2 = 2 % 2;
                int i3 = f14074a + 111;
                f14075d = i3 % 128;
                int i4 = i3 % 2;
                Object objInvokeSuspend = ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i5 = f14075d + 81;
                f14074a = i5 % 128;
                int i6 = i5 % 2;
                return objInvokeSuspend;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i2 = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.f14077c, continuation);
                int i3 = f14075d + 59;
                f14074a = i3 % 128;
                if (i3 % 2 != 0) {
                    return anonymousClass4;
                }
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(DynamicFormsViewModel dynamicFormsViewModel, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.f14077c = dynamicFormsViewModel;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f14070e + 55;
            f14069a = i3 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i3 % 2 == 0) {
                b(coroutineScope2, continuation2);
                throw null;
            }
            Object objB = b(coroutineScope2, continuation2);
            int i4 = f14069a + 41;
            f14070e = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 0 / 0;
            }
            return objB;
        }

        private Object b(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f14070e + 33;
            f14069a = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i4 == 0) {
                int i5 = 22 / 0;
            }
            int i6 = f14070e + 15;
            f14069a = i6 % 128;
            int i7 = i6 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            d dVar = new d(this.f14073d, this.f14071b, continuation);
            int i3 = f14069a + 19;
            f14070e = i3 % 128;
            if (i3 % 2 == 0) {
                return dVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<? extends FormsInputUiState<?>> list, DynamicFormsViewModel dynamicFormsViewModel, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f14073d = list;
            this.f14071b = dynamicFormsViewModel;
        }
    }

    public final void onButtonClicked(List<? extends FormsInputUiState<?>> list) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        e();
        if (!this.f14062m.getValue().isFormValid()) {
            int i3 = f14049l + 5;
            f14050q = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        MutableStateFlow<FormsContainerUiState> mutableStateFlow = this.f14062m;
        mutableStateFlow.setValue(FormsContainerUiState.copy$default(mutableStateFlow.getValue(), null, null, false, true, false, 23, null));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.f14057g, null, new d(list, this, null), 2, null);
        int i4 = f14050q + 61;
        f14049l = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onUserCancelled() {
        int i2 = 2 % 2;
        IncodeWelcome.Companion.getInstance().getDynamicFormsBus().onNext(new DynamicFormsResult(ResultCode.USER_CANCELLED, null, false, null, 14, null));
        int i3 = f14049l + 91;
        f14050q = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[PHI: r1
  0x0028: PHI (r1v13 com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState$CountryUiState) = 
  (r1v10 com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState$CountryUiState)
  (r1v14 com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState$CountryUiState)
 binds: [B:15:0x0040, B:9:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String c(com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState<?> r5) {
        /*
            r4 = 2
            int r0 = r4 % r4
            int r3 = com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14049l
            int r0 = r3 + 115
            int r2 = r0 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14050q = r2
            int r0 = r0 % r4
            r1 = 0
            if (r0 == 0) goto Laf
            boolean r0 = r5 instanceof com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState
            if (r0 == 0) goto L44
            int r1 = r3 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14050q = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L3a
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState r5 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState) r5
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState$CountryUiState r1 = r5.getAnswer()
            r0 = 67
            int r0 = r0 / 0
            if (r1 == 0) goto L2e
        L28:
            java.lang.String r0 = r1.getCode()
            if (r0 != 0) goto L43
        L2e:
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14050q
            int r1 = r0 + 81
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14049l = r0
            int r1 = r1 % r4
            java.lang.String r0 = ""
            return r0
        L3a:
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState r5 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState) r5
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState$CountryUiState r1 = r5.getAnswer()
            if (r1 == 0) goto L2e
            goto L28
        L43:
            return r0
        L44:
            boolean r0 = r5 instanceof com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState
            if (r0 == 0) goto L5d
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState r5 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState) r5
            java.util.Date r0 = r5.getAnswer2()
            if (r0 == 0) goto L58
            long r0 = r0.getTime()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L58:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            return r0
        L5d:
            boolean r0 = r5 instanceof com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState
            r1 = 1
            if (r0 == 0) goto L6f
            int r2 = r2 + r1
            int r0 = r2 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14049l = r0
            int r2 = r2 % r4
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState r5 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState) r5
            java.lang.String r0 = r5.getAnswer2()
            return r0
        L6f:
            boolean r0 = r5 instanceof com.incode.welcome_sdk.ui.dynamic_forms.state.FormsPhoneInputUiState
            if (r0 == 0) goto L81
            int r1 = r3 + 49
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14050q = r0
            int r1 = r1 % r4
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsPhoneInputUiState r5 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsPhoneInputUiState) r5
            java.lang.String r0 = r5.getAnswer2()
            return r0
        L81:
            boolean r0 = r5 instanceof com.incode.welcome_sdk.ui.dynamic_forms.state.FormsYesNoUiState
            if (r0 == r1) goto L96
            boolean r0 = r5 instanceof com.incode.welcome_sdk.ui.dynamic_forms.state.FormsSelectInputUiState
            if (r0 == 0) goto L90
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsSelectInputUiState r5 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsSelectInputUiState) r5
            java.lang.String r0 = r5.getAnswer2()
            return r0
        L90:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L96:
            int r1 = r2 + 75
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14049l = r0
            int r1 = r1 % r4
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsYesNoUiState r5 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsYesNoUiState) r5
            java.lang.Boolean r0 = r5.getAnswer()
            boolean r0 = com.incode.welcome_sdk.commons.extensions.e.c(r0)
            if (r0 == 0) goto Lac
            java.lang.String r0 = "YES"
            return r0
        Lac:
            java.lang.String r0 = "NO"
            return r0
        Laf:
            boolean r0 = r5 instanceof com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState
            r1.hashCode()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.c(com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d() {
        /*
            r10 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14050q
            int r1 = r0 + 21
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14049l = r0
            int r1 = r1 % r5
            kotlinx.coroutines.flow.MutableStateFlow<com.incode.welcome_sdk.ui.dynamic_forms.state.FormsContainerUiState> r0 = r10.f14062m
            java.lang.Object r0 = r0.getValue()
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsContainerUiState r0 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsContainerUiState) r0
            java.util.List r1 = r0.getQuestions()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r0 = r1 instanceof java.util.Collection
            r7 = 1
            if (r0 == 0) goto L28
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L32
        L28:
            java.util.Iterator r4 = r1.iterator()
        L2c:
            boolean r0 = r4.hasNext()
            if (r0 == r7) goto L49
        L32:
            kotlinx.coroutines.flow.MutableStateFlow<com.incode.welcome_sdk.ui.dynamic_forms.state.FormsContainerUiState> r1 = r10.f14062m
            java.lang.Object r2 = r1.getValue()
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsContainerUiState r2 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsContainerUiState) r2
            r8 = 15
            r9 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsContainerUiState r0 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsContainerUiState.copy$default(r2, r3, r4, r5, r6, r7, r8, r9)
            r1.setValue(r0)
            return
        L49:
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14049l
            int r1 = r0 + 87
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14050q = r0
            int r1 = r1 % r5
            java.lang.Object r2 = r4.next()
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState r2 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState) r2
            boolean r0 = r2.hasAnswer()
            r3 = 0
            if (r0 == 0) goto L8c
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14050q
            int r1 = r0 + 121
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14049l = r0
            int r1 = r1 % r5
            boolean r0 = r2.isValid()
            if (r0 == 0) goto L8c
            int r2 = com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14049l
            int r1 = r2 + 49
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14050q = r0
            int r1 = r1 % r5
            int r1 = r2 + 69
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14050q = r0
            int r1 = r1 % r5
            r0 = r7
        L7f:
            if (r0 == r7) goto L2c
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14050q
            int r1 = r0 + 121
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14049l = r0
            int r1 = r1 % r5
            r7 = r3
            goto L32
        L8c:
            r0 = r3
            goto L7f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.d():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        return (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState) r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState<?> e(java.lang.String r6) {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14049l
            int r1 = r0 + 35
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14050q = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L4b
            kotlinx.coroutines.flow.MutableStateFlow<com.incode.welcome_sdk.ui.dynamic_forms.state.FormsContainerUiState> r0 = r5.f14062m
            java.lang.Object r0 = r0.getValue()
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsContainerUiState r0 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsContainerUiState) r0
            java.util.List r0 = r0.getQuestions()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
            r0 = 39
            int r0 = r0 / 0
        L24:
            boolean r0 = r1.hasNext()
            r3 = 0
            if (r0 == 0) goto L48
            java.lang.Object r2 = r1.next()
            r0 = r2
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState r0 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState) r0
            java.lang.String r0 = r0.getId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r0 == 0) goto L24
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14050q
            int r1 = r0 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14049l = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L5e
            r3 = r2
        L48:
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState r3 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState) r3
            return r3
        L4b:
            kotlinx.coroutines.flow.MutableStateFlow<com.incode.welcome_sdk.ui.dynamic_forms.state.FormsContainerUiState> r0 = r5.f14062m
            java.lang.Object r0 = r0.getValue()
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsContainerUiState r0 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsContainerUiState) r0
            java.util.List r0 = r0.getQuestions()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
            goto L24
        L5e:
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.e(java.lang.String):com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState");
    }

    private final void a(FormsInputUiState<?> formsInputUiState, FormsInputUiState<?> formsInputUiState2) {
        int i2 = 2 % 2;
        int i3 = f14050q + 67;
        f14049l = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<FormsContainerUiState> mutableStateFlow = this.f14062m;
        mutableStateFlow.setValue(FormsContainerUiState.copy$default(mutableStateFlow.getValue(), h.c(this.f14062m.getValue().getQuestions(), formsInputUiState, formsInputUiState2), null, false, false, false, 30, null));
        d();
        int i5 = f14050q + 17;
        f14049l = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onFieldFocusChanged(String str) {
        int i2 = 2 % 2;
        int i3 = f14050q + 23;
        f14049l = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            d(str);
            int i4 = 15 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            d(str);
        }
        int i5 = f14050q + 103;
        f14049l = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void d(String str) {
        int i2 = 2 % 2;
        int i3 = f14049l + 89;
        f14050q = i3 % 128;
        int i4 = i3 % 2;
        FormsInputUiState<?> formsInputUiStateE = e(str);
        if (formsInputUiStateE instanceof FormsTextInputUiState) {
            c((FormsTextInputUiState) formsInputUiStateE);
        } else if (formsInputUiStateE instanceof FormsPhoneInputUiState) {
            d((FormsPhoneInputUiState) formsInputUiStateE);
            int i5 = f14049l + 47;
            f14050q = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private final void e() {
        int i2 = 2 % 2;
        int i3 = f14049l + 3;
        f14050q = i3 % 128;
        if (i3 % 2 != 0) {
            Iterator<T> it = this.f14062m.getValue().getQuestions().iterator();
            while (it.hasNext()) {
                int i4 = f14049l + 83;
                f14050q = i4 % 128;
                if (i4 % 2 == 0) {
                    d(((FormsInputUiState) it.next()).getId());
                    int i5 = 72 / 0;
                } else {
                    d(((FormsInputUiState) it.next()).getId());
                }
            }
            return;
        }
        this.f14062m.getValue().getQuestions().iterator();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void c(FormsTextInputUiState formsTextInputUiState) {
        boolean zF;
        int i2 = 2 % 2;
        int i3 = f14050q + 9;
        f14049l = i3 % 128;
        int i4 = i3 % 2;
        int i5 = WhenMappings.f14068e[formsTextInputUiState.getTextInputType().ordinal()];
        if (i5 == 1) {
            al alVar = al.f6409c;
            zF = al.f(formsTextInputUiState.getAnswer2());
        } else {
            if (i5 != 2) {
                return;
            }
            al alVar2 = al.f6409c;
            zF = al.d(formsTextInputUiState.getAnswer2());
        }
        if (formsTextInputUiState.isValid() != zF) {
            a(formsTextInputUiState, FormsTextInputUiState.copy$default(formsTextInputUiState, null, null, null, null, zF, null, 47, null));
            int i6 = f14050q + 11;
            f14049l = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    public final void onCountrySelectorItemSelected(String str, FormsCountrySelectorUiState.CountryUiState countryUiState) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(countryUiState, "");
        FormsInputUiState<?> formsInputUiStateE = e(str);
        FormsCountrySelectorUiState formsCountrySelectorUiState = null;
        if (formsInputUiStateE instanceof FormsCountrySelectorUiState) {
            int i3 = f14049l + 25;
            f14050q = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            formsCountrySelectorUiState = (FormsCountrySelectorUiState) formsInputUiStateE;
        }
        if (formsCountrySelectorUiState != null) {
            a(formsCountrySelectorUiState, FormsCountrySelectorUiState.copy$default(formsCountrySelectorUiState, null, null, countryUiState, null, false, countryUiState.getName(), null, null, false, 219, null));
        } else {
            int i4 = f14049l + 57;
            f14050q = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final void onCountrySelectorSearchTextChanged(String str, String str2) {
        FormsCountrySelectorUiState formsCountrySelectorUiState;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        FormsInputUiState<?> formsInputUiStateE = e(str);
        if (formsInputUiStateE instanceof FormsCountrySelectorUiState) {
            int i3 = f14050q + 123;
            f14049l = i3 % 128;
            int i4 = i3 % 2;
            formsCountrySelectorUiState = (FormsCountrySelectorUiState) formsInputUiStateE;
        } else {
            formsCountrySelectorUiState = null;
        }
        if (formsCountrySelectorUiState == null) {
            int i5 = f14050q + 89;
            f14049l = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            return;
        }
        List<FormsCountrySelectorUiState.CountryUiState> allOptions = formsCountrySelectorUiState.getAllOptions();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allOptions) {
            String lowerCase = ((FormsCountrySelectorUiState.CountryUiState) obj).getName().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) lowerCase2, false, 2, (Object) null)) {
                int i6 = f14050q + 89;
                f14049l = i6 % 128;
                if (i6 % 2 != 0) {
                    arrayList.add(obj);
                    throw null;
                }
                arrayList.add(obj);
            }
        }
        a(formsCountrySelectorUiState, FormsCountrySelectorUiState.copy$default(formsCountrySelectorUiState, null, null, null, null, false, str2, null, arrayList, false, 351, null));
    }

    public final void onCountrySelectorClearButtonClicked(String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        FormsInputUiState<?> formsInputUiStateE = e(str);
        FormsCountrySelectorUiState formsCountrySelectorUiState = null;
        if (formsInputUiStateE instanceof FormsCountrySelectorUiState) {
            int i3 = f14050q + 47;
            f14049l = i3 % 128;
            if (i3 % 2 != 0) {
                formsCountrySelectorUiState.hashCode();
                throw null;
            }
            formsCountrySelectorUiState = (FormsCountrySelectorUiState) formsInputUiStateE;
        } else {
            int i4 = f14049l + 23;
            f14050q = i4 % 128;
            int i5 = i4 % 2;
        }
        if (formsCountrySelectorUiState == null) {
            return;
        }
        a(formsCountrySelectorUiState, FormsCountrySelectorUiState.copy$default(formsCountrySelectorUiState, null, null, null, null, false, "", null, null, false, 475, null));
    }

    public final void showCountrySelectorDialog(String str) {
        FormsCountrySelectorUiState formsCountrySelectorUiState;
        int i2 = 2 % 2;
        int i3 = f14050q + 125;
        f14049l = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        FormsInputUiState<?> formsInputUiStateE = e(str);
        if (!(formsInputUiStateE instanceof FormsCountrySelectorUiState)) {
            formsCountrySelectorUiState = null;
        } else {
            int i5 = f14049l + 105;
            f14050q = i5 % 128;
            int i6 = i5 % 2;
            formsCountrySelectorUiState = (FormsCountrySelectorUiState) formsInputUiStateE;
        }
        if (formsCountrySelectorUiState != null) {
            a(formsCountrySelectorUiState, FormsCountrySelectorUiState.copy$default(formsCountrySelectorUiState, null, null, null, null, false, null, null, null, true, 255, null));
        } else {
            int i7 = f14050q + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f14049l = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    public final void hideCountrySelectorDialog(String str) {
        FormsCountrySelectorUiState formsCountrySelectorUiState;
        int i2 = 2 % 2;
        int i3 = f14050q + 109;
        f14049l = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        FormsInputUiState<?> formsInputUiStateE = e(str);
        if (formsInputUiStateE instanceof FormsCountrySelectorUiState) {
            int i5 = f14049l + 71;
            f14050q = i5 % 128;
            if (i5 % 2 == 0) {
                formsCountrySelectorUiState = (FormsCountrySelectorUiState) formsInputUiStateE;
                int i6 = 77 / 0;
            } else {
                formsCountrySelectorUiState = (FormsCountrySelectorUiState) formsInputUiStateE;
            }
        } else {
            formsCountrySelectorUiState = null;
        }
        if (formsCountrySelectorUiState == null) {
            return;
        }
        a(formsCountrySelectorUiState, FormsCountrySelectorUiState.copy$default(formsCountrySelectorUiState, null, null, null, null, false, null, null, null, false, 255, null));
    }

    public final void onTextInputTextChanged(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f14050q + 61;
        f14049l = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        FormsInputUiState<?> formsInputUiStateE = e(str);
        FormsTextInputUiState formsTextInputUiState = !(formsInputUiStateE instanceof FormsTextInputUiState) ? null : (FormsTextInputUiState) formsInputUiStateE;
        if (formsTextInputUiState != null) {
            a(formsTextInputUiState, FormsTextInputUiState.copy$default(formsTextInputUiState, null, null, str2, null, true, null, 43, null));
            return;
        }
        int i5 = f14050q + 77;
        f14049l = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onPhoneInputTextChanged(String str, String str2) {
        String str3;
        FormsPhoneInputUiState formsPhoneInputUiState;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str2.length() == 0) {
            int i3 = f14050q + 123;
            f14049l = i3 % 128;
            int i4 = i3 % 2;
            str3 = "+";
        } else {
            str3 = str2;
        }
        FormsInputUiState<?> formsInputUiStateE = e(str);
        if (formsInputUiStateE instanceof FormsPhoneInputUiState) {
            int i5 = f14049l + 67;
            f14050q = i5 % 128;
            int i6 = i5 % 2;
            formsPhoneInputUiState = (FormsPhoneInputUiState) formsInputUiStateE;
        } else {
            formsPhoneInputUiState = null;
        }
        if (formsPhoneInputUiState != null) {
            a(formsPhoneInputUiState, FormsPhoneInputUiState.copy$default(formsPhoneInputUiState, null, null, str3, null, true, b(str2), 11, null));
        } else {
            int i7 = f14049l + 79;
            f14050q = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private final void d(FormsPhoneInputUiState formsPhoneInputUiState) {
        int i2 = 2 % 2;
        int i3 = f14050q + 5;
        f14049l = i3 % 128;
        int i4 = i3 % 2;
        try {
            a(formsPhoneInputUiState, FormsPhoneInputUiState.copy$default(formsPhoneInputUiState, null, null, null, null, this.f14053c.isValidNumber(this.f14053c.parse(formsPhoneInputUiState.getAnswer2(), this.f14060j)), null, 47, null));
            int i5 = f14049l + 37;
            f14050q = i5 % 128;
            int i6 = i5 % 2;
        } catch (NumberParseException e2) {
            Timber.Forest.d("NumberParseException was thrown: " + e2, new Object[0]);
            a(formsPhoneInputUiState, FormsPhoneInputUiState.copy$default(formsPhoneInputUiState, null, null, null, null, false, null, 47, null));
        }
    }

    private final String c() {
        int i2 = 2 % 2;
        int i3 = f14050q + 55;
        f14049l = i3 % 128;
        int i4 = i3 % 2;
        String str = "+" + this.f14053c.getCountryCodeForRegion(this.f14060j);
        int i5 = f14050q + 113;
        f14049l = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 56 / 0;
        }
        return str;
    }

    private final String a(String str) {
        int i2 = 2 % 2;
        int i3 = f14049l + 9;
        f14050q = i3 % 128;
        Object obj = null;
        try {
            if (i3 % 2 != 0) {
                return this.f14053c.getRegionCodeForCountryCode(this.f14053c.parse(str, this.f14060j).getCountryCode());
            }
            this.f14053c.getRegionCodeForCountryCode(this.f14053c.parse(str, this.f14060j).getCountryCode());
            obj.hashCode();
            throw null;
        } catch (NumberParseException e2) {
            Timber.Forest.d("NumberParseException was thrown: " + e2, new Object[0]);
            return null;
        }
    }

    private final String b(String str) {
        Iterator it;
        Object next;
        int i2 = 2 % 2;
        int i3 = f14049l + 93;
        f14050q = i3 % 128;
        if (i3 % 2 == 0) {
            a(str);
            throw null;
        }
        String strA = a(str);
        if (strA != null) {
            int i4 = f14049l + 25;
            f14050q = i4 % 128;
            if (i4 % 2 == 0) {
                it = this.f14054d.iterator();
                int i5 = 24 / 0;
            } else {
                it = this.f14054d.iterator();
            }
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.areEqual(((a) next).d(), strA)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            a aVar = (a) next;
            if (aVar != null) {
                String strE = aVar.e();
                int i6 = f14050q + 15;
                f14049l = i6 % 128;
                int i7 = i6 % 2;
                return strE;
            }
        }
        return null;
    }

    public final void onYesNoAnswerSelected(String str, boolean z2) {
        FormsYesNoUiState formsYesNoUiState;
        int i2 = 2 % 2;
        int i3 = f14049l + 23;
        f14050q = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        FormsInputUiState<?> formsInputUiStateE = e(str);
        Object obj = null;
        if (formsInputUiStateE instanceof FormsYesNoUiState) {
            int i5 = f14050q + 49;
            f14049l = i5 % 128;
            if (i5 % 2 != 0) {
                formsYesNoUiState = (FormsYesNoUiState) formsInputUiStateE;
                int i6 = 8 / 0;
            } else {
                formsYesNoUiState = (FormsYesNoUiState) formsInputUiStateE;
            }
        } else {
            formsYesNoUiState = null;
        }
        if (formsYesNoUiState != null) {
            a(formsYesNoUiState, FormsYesNoUiState.copy$default(formsYesNoUiState, null, null, Boolean.valueOf(z2), null, false, 27, null));
            return;
        }
        int i7 = f14050q;
        int i8 = i7 + 75;
        f14049l = i8 % 128;
        if (i8 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i9 = i7 + 103;
        f14049l = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038 A[PHI: r3
  0x0038: PHI (r3v1 com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState<?>) = 
  (r3v0 com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState<?>)
  (r3v6 com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState<?>)
 binds: [B:10:0x0036, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDateInputLableClicked(java.lang.String r13) {
        /*
            r12 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14049l
            int r1 = r0 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14050q = r0
            int r1 = r1 % r2
            java.lang.String r0 = ""
            if (r1 != 0) goto L2d
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState r3 = r12.e(r13)
            boolean r1 = r3 instanceof com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState
            r0 = 59
            int r0 = r0 / 0
            r0 = 1
            if (r1 == r0) goto L38
        L20:
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14049l
            int r1 = r0 + 75
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14050q = r0
            int r1 = r1 % r2
            r3 = 0
        L2a:
            if (r3 != 0) goto L44
            return
        L2d:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState r3 = r12.e(r13)
            boolean r0 = r3 instanceof com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState
            if (r0 == 0) goto L20
        L38:
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14049l
            int r1 = r0 + 85
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14050q = r0
            int r1 = r1 % r2
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState r3 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState) r3
            goto L2a
        L44:
            r10 = 31
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 1
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState r0 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState r3 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState) r3
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState r0 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState) r0
            r12.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.onDateInputLableClicked(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d A[PHI: r3
  0x003d: PHI (r3v1 com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState<?>) = 
  (r3v0 com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState<?>)
  (r3v6 com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState<?>)
 binds: [B:13:0x003b, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDatePickerOkButtonClicked(java.lang.String r13, java.lang.Long r14) {
        /*
            r12 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14050q
            int r1 = r0 + 59
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14049l = r0
            int r1 = r1 % r2
            java.lang.String r0 = ""
            if (r1 == 0) goto L32
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState r3 = r12.e(r13)
            boolean r1 = r3 instanceof com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState
            r0 = 7
            int r0 = r0 / 0
            r0 = 1
            if (r1 == r0) goto L3d
        L1f:
            r3 = 0
        L20:
            if (r3 != 0) goto L40
            int r0 = com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14049l
            int r1 = r0 + 7
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.f14050q = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L31
            r0 = 42
            int r0 = r0 / 0
        L31:
            return
        L32:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState r3 = r12.e(r13)
            boolean r0 = r3 instanceof com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState
            if (r0 == 0) goto L1f
        L3d:
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState r3 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState) r3
            goto L20
        L40:
            if (r14 == 0) goto L5b
            java.lang.Number r14 = (java.lang.Number) r14
            long r0 = r14.longValue()
            java.util.Date r6 = new java.util.Date
            r6.<init>(r0)
            r10 = 27
            r11 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState r0 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 != 0) goto L6b
        L5b:
            r0 = r12
            com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel r0 = (com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel) r0
            r10 = 31
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState r0 = com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L6b:
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState r3 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState) r3
            com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState r0 = (com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState) r0
            r12.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel.onDatePickerOkButtonClicked(java.lang.String, java.lang.Long):void");
    }

    public final void onDatePickerDismiss(String str) {
        int i2 = 2 % 2;
        int i3 = f14050q + 71;
        f14049l = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        FormsInputUiState<?> formsInputUiStateE = e(str);
        FormsDateInputUiState formsDateInputUiState = null;
        if (formsInputUiStateE instanceof FormsDateInputUiState) {
            int i5 = f14050q + 67;
            f14049l = i5 % 128;
            if (i5 % 2 != 0) {
                formsDateInputUiState.hashCode();
                throw null;
            }
            formsDateInputUiState = (FormsDateInputUiState) formsInputUiStateE;
        }
        if (formsDateInputUiState == null) {
            return;
        }
        a(formsDateInputUiState, FormsDateInputUiState.copy$default(formsDateInputUiState, null, null, null, null, false, false, 31, null));
    }

    public final void onAnswerSelected(String str, String str2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        FormsInputUiState<?> formsInputUiStateE = e(str);
        FormsSelectInputUiState formsSelectInputUiState = formsInputUiStateE instanceof FormsSelectInputUiState ? (FormsSelectInputUiState) formsInputUiStateE : null;
        if (formsSelectInputUiState == null) {
            int i3 = f14049l + 97;
            f14050q = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        a(formsSelectInputUiState, FormsSelectInputUiState.copy$default(formsSelectInputUiState, null, null, null, str2, null, false, 55, null));
        int i4 = f14049l + 121;
        f14050q = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f14065a = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14066c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f14067d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f14068e;

        static {
            int[] iArr = new int[DynamicForms.InputType.values().length];
            try {
                iArr[DynamicForms.InputType.CPF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DynamicForms.InputType.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DynamicForms.InputType.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DynamicForms.InputType.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DynamicForms.InputType.PHONE.ordinal()] = 5;
                int i2 = f14066c + 91;
                f14065a = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 2 % 2;
                }
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DynamicForms.InputType.DATE.ordinal()] = 6;
                int i4 = f14065a + 23;
                f14066c = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 % 2;
                } else {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DynamicForms.InputType.YESNO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[DynamicForms.InputType.COUNTRY.ordinal()] = 8;
                int i7 = f14065a + 113;
                f14066c = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 % 2;
                }
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[DynamicForms.InputType.SELECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f14067d = iArr;
            int[] iArr2 = new int[TextInputType.values().length];
            try {
                iArr2[TextInputType.f13398d.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[TextInputType.f13399e.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            f14068e = iArr2;
        }
    }

    private final List<FormsCountrySelectorUiState.CountryUiState> a() {
        int iC = MarkdownCheckBoxKt.c();
        int iC2 = MarkdownCheckBoxKt.c();
        int iC3 = MarkdownCheckBoxKt.c();
        return (List) e(iC, MarkdownCheckBoxKt.c(), 442996923, new Object[]{this}, -442996922, iC2, iC3);
    }

    private final void b(DynamicFormsResult dynamicFormsResult) {
        int iC = MarkdownCheckBoxKt.c();
        int iC2 = MarkdownCheckBoxKt.c();
        int iC3 = MarkdownCheckBoxKt.c();
        e(iC, MarkdownCheckBoxKt.c(), -1321456914, new Object[]{this, dynamicFormsResult}, 1321456914, iC2, iC3);
    }
}
