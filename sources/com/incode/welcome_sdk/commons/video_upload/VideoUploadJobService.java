package com.incode.welcome_sdk.commons.video_upload;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.Configuration;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.k;
import com.incode.welcome_sdk.commons.m;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.ah;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.aw;
import com.incode.welcome_sdk.modules.g;
import com.incode.welcome_sdk.ui.dynamic_forms.view.FormsDateInputScreenKt;
import io.reactivex.Completable;
import io.reactivex.CompletableEmitter;
import io.reactivex.CompletableOnSubscribe;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.TimeSource;
import okhttp3.ResponseBody;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoUploadJobService extends JobService {

    /* JADX INFO: renamed from: c */
    public static final d f6702c = new d((byte) 0);

    /* JADX INFO: renamed from: f */
    private static int f6703f = 0;

    /* JADX INFO: renamed from: g */
    private static int f6704g = 1;

    /* JADX INFO: renamed from: h */
    private static com.incode.welcome_sdk.commons.video_upload.a f6705h = null;

    /* JADX INFO: renamed from: i */
    private static int f6706i = 0;

    /* JADX INFO: renamed from: j */
    private static int f6707j = 1;

    /* JADX INFO: renamed from: a */
    private IncodeWelcomeRepository f6708a;

    /* JADX INFO: renamed from: b */
    private Disposable f6709b;

    /* JADX INFO: renamed from: d */
    private TimeSource.Monotonic.ValueTimeMark f6710d;

    /* JADX INFO: renamed from: e */
    private final TimeSource.Monotonic f6711e;

    public static /* synthetic */ Object b(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = i9 | i7;
        int i12 = (~((~i7) | i6)) | (~i11);
        int i13 = (~(i4 | i8 | i7)) | (~(i11 | i6));
        int i14 = i7 + i6 + i5 + (528639218 * i2) + ((-532493036) * i3);
        int i15 = i14 * i14;
        int i16 = ((i7 * 873666089) - 1460666368) + (873666089 * i6) + ((-875965520) * i10) + (437982760 * i12) + ((-437982760) * i13) + (435683328 * i5) + (1819279360 * i2) + ((-1621098496) * i3) + (586088448 * i15);
        int i17 = (i7 * (-1573143961)) + 2078511484 + (i6 * (-1573143961)) + (i10 * 1872) + (i12 * (-936)) + (i13 * 936) + (i5 * (-1573143025)) + (i2 * 123045422) + (i3 * (-1548035028)) + (i15 * 1845559296);
        int i18 = i16 + (i17 * i17 * 1848705024);
        if (i18 == 1) {
            Function1 function1 = (Function1) objArr[0];
            Object obj = objArr[1];
            int i19 = 2 % 2;
            int i20 = f6707j + 107;
            f6706i = i20 % 128;
            int i21 = i20 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            SingleSource singleSource = (SingleSource) function1.invoke(obj);
            int i22 = f6706i + 103;
            f6707j = i22 % 128;
            int i23 = i22 % 2;
            return singleSource;
        }
        if (i18 == 2) {
            return d(objArr);
        }
        if (i18 != 3) {
            Function1 function12 = (Function1) objArr[0];
            Object obj2 = objArr[1];
            int i24 = 2 % 2;
            int i25 = f6707j + 79;
            f6706i = i25 % 128;
            int i26 = i25 % 2;
            Intrinsics.checkNotNullParameter(function12, "");
            function12.invoke(obj2);
            int i27 = f6706i + 89;
            f6707j = i27 % 128;
            int i28 = i27 % 2;
            return null;
        }
        VideoUploadJobService videoUploadJobService = (VideoUploadJobService) objArr[0];
        JobParameters jobParameters = (JobParameters) objArr[1];
        int i29 = 2 % 2;
        int i30 = f6707j + 39;
        f6706i = i30 % 128;
        if (i30 % 2 != 0) {
            Intrinsics.checkNotNullParameter(videoUploadJobService, "");
            Intrinsics.checkNotNullParameter(jobParameters, "");
            videoUploadJobService.jobFinished(jobParameters, true);
        } else {
            Intrinsics.checkNotNullParameter(videoUploadJobService, "");
            Intrinsics.checkNotNullParameter(jobParameters, "");
            videoUploadJobService.jobFinished(jobParameters, false);
        }
        int i31 = f6707j + 13;
        f6706i = i31 % 128;
        int i32 = i31 % 2;
        return null;
    }

    public VideoUploadJobService() {
        new Configuration.Builder().setJobSchedulerJobIdRange(1000, 50000).build();
        this.f6711e = TimeSource.Monotonic.INSTANCE;
    }

    public static final /* synthetic */ TimeSource.Monotonic.ValueTimeMark a(VideoUploadJobService videoUploadJobService) {
        int i2 = 2 % 2;
        int i3 = f6707j + 111;
        int i4 = i3 % 128;
        f6706i = i4;
        int i5 = i3 % 2;
        TimeSource.Monotonic.ValueTimeMark valueTimeMark = videoUploadJobService.f6710d;
        int i6 = i4 + 97;
        f6707j = i6 % 128;
        if (i6 % 2 != 0) {
            return valueTimeMark;
        }
        throw null;
    }

    public static final /* synthetic */ void a(VideoUploadJobService videoUploadJobService, TimeSource.Monotonic.ValueTimeMark valueTimeMark) {
        int i2 = 2 % 2;
        int i3 = f6706i + 121;
        f6707j = i3 % 128;
        int i4 = i3 % 2;
        videoUploadJobService.f6710d = valueTimeMark;
        if (i4 == 0) {
            int i5 = 99 / 0;
        }
    }

    public static final /* synthetic */ void b(VideoUploadJobService videoUploadJobService, String str, Event event) {
        int i2 = 2 % 2;
        int i3 = f6707j + 101;
        f6706i = i3 % 128;
        int i4 = i3 % 2;
        videoUploadJobService.b(str, event);
        if (i4 != 0) {
            throw null;
        }
        int i5 = f6707j + 121;
        f6706i = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ TimeSource.Monotonic d(VideoUploadJobService videoUploadJobService) {
        int i2 = 2 % 2;
        int i3 = f6706i + 85;
        int i4 = i3 % 128;
        f6707j = i4;
        int i5 = i3 % 2;
        TimeSource.Monotonic monotonic = videoUploadJobService.f6711e;
        int i6 = i4 + 117;
        f6706i = i6 % 128;
        int i7 = i6 % 2;
        return monotonic;
    }

    public static final /* synthetic */ com.incode.welcome_sdk.commons.video_upload.a e() {
        int i2 = 2 % 2;
        int i3 = f6706i + 121;
        f6707j = i3 % 128;
        if (i3 % 2 != 0) {
            return f6705h;
        }
        throw null;
    }

    public static final /* synthetic */ void e(com.incode.welcome_sdk.commons.video_upload.a aVar) {
        int i2 = 2 % 2;
        int i3 = f6707j;
        int i4 = i3 + 113;
        f6706i = i4 % 128;
        int i5 = i4 % 2;
        f6705h = aVar;
        int i6 = i3 + 49;
        f6706i = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 2 / 0;
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        Disposable disposableD;
        VideoUploadJobService videoUploadJobService = (VideoUploadJobService) objArr[0];
        JobParameters jobParameters = (JobParameters) objArr[1];
        int i2 = 2 % 2;
        int i3 = f6706i + 7;
        f6707j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(jobParameters, "");
        if (!IncodeWelcome.Companion.isInitialized()) {
            Timber.Forest.w("IncodeWelcome not initialized - cannot start job", new Object[0]);
            videoUploadJobService.jobFinished(jobParameters, false);
            return false;
        }
        try {
            videoUploadJobService.f6708a = IncodeWelcome.Companion.getInstance().getIncodeWelcomeRepositoryComponent().getIncodeRepository();
            String string = jobParameters.getExtras().getString("jobType");
            if (!(!Intrinsics.areEqual(string, "upload"))) {
                disposableD = videoUploadJobService.b(jobParameters);
            } else {
                if (!Intrinsics.areEqual(string, "cleanup")) {
                    throw new IllegalStateException(string + " not recognized. Please use one of the available schedule* methods to launch this service.");
                }
                int i5 = f6706i + 95;
                f6707j = i5 % 128;
                if (i5 % 2 == 0) {
                    disposableD = videoUploadJobService.d(jobParameters);
                    int i6 = 56 / 0;
                } else {
                    disposableD = videoUploadJobService.d(jobParameters);
                }
            }
            videoUploadJobService.f6709b = disposableD;
            return true;
        } catch (Exception e2) {
            Timber.Forest.e(e2, "Error initializing repository", new Object[0]);
            videoUploadJobService.jobFinished(jobParameters, false);
            return false;
        }
    }

    public static final void b(VideoUploadJobService videoUploadJobService, JobParameters jobParameters, CompletableEmitter completableEmitter) {
        int i2 = 2 % 2;
        int i3 = f6706i + 37;
        f6707j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(videoUploadJobService, "");
        Intrinsics.checkNotNullParameter(jobParameters, "");
        Intrinsics.checkNotNullParameter(completableEmitter, "");
        IncodeWelcomeRepository incodeWelcomeRepository = videoUploadJobService.f6708a;
        Unit unit = null;
        g gVarValueOf = null;
        if (incodeWelcomeRepository != null) {
            String string = jobParameters.getExtras().getString("sessionType");
            if (string != null) {
                int i5 = f6707j + 115;
                f6706i = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.checkNotNull(string);
                gVarValueOf = g.valueOf(string);
            }
            if (gVarValueOf == null) {
                g.b bVar = g.f10683c;
                g.b.a(incodeWelcomeRepository);
            } else {
                gVarValueOf.c(incodeWelcomeRepository);
            }
            completableEmitter.onComplete();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            int i7 = f6706i + 43;
            f6707j = i7 % 128;
            if (i7 % 2 == 0) {
                Timber.Forest.w("Repo is null — skipping cleanup job", new Object[1]);
            } else {
                Timber.Forest.w("Repo is null — skipping cleanup job", new Object[0]);
            }
            completableEmitter.onComplete();
        }
    }

    static final class e extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f6730a = 0;

        /* JADX INFO: renamed from: b */
        public static final e f6731b = new e();

        /* JADX INFO: renamed from: c */
        private static int f6732c = 1;

        /* JADX INFO: renamed from: d */
        private static int f6733d = 0;

        /* JADX INFO: renamed from: e */
        private static int f6734e = 1;

        private static void d(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f6733d + 123;
            f6734e = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.e(th, "Couldn't perform cleanup", new Object[0]);
            int i5 = f6734e + 41;
            f6733d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 83 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f6734e + 81;
            f6733d = i3 % 128;
            int i4 = i3 % 2;
            d(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f6734e + 57;
            f6733d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static {
            int i2 = f6730a + 59;
            f6732c = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 17 / 0;
            }
        }

        e() {
            super(1);
        }
    }

    private final Disposable d(final JobParameters jobParameters) {
        int i2 = 2 % 2;
        int i3 = f6707j + 9;
        f6706i = i3 % 128;
        int i4 = i3 % 2;
        Completable completableDoFinally = Completable.create(new CompletableOnSubscribe() { // from class: com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService$$ExternalSyntheticLambda0
            @Override // io.reactivex.CompletableOnSubscribe
            public final void subscribe(CompletableEmitter completableEmitter) {
                VideoUploadJobService.b(this.f$0, jobParameters, completableEmitter);
            }
        }).subscribeOn(Schedulers.io()).doFinally(new Action() { // from class: com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Action
            public final void run() {
                VideoUploadJobService.d(this.f$0, jobParameters);
            }
        });
        Action action = ah.f6384b;
        final e eVar = e.f6731b;
        Disposable disposableSubscribe = completableDoFinally.subscribe(action, new Consumer() { // from class: com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoUploadJobService.a(eVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "");
        int i5 = f6707j + 97;
        f6706i = i5 % 128;
        int i6 = i5 % 2;
        return disposableSubscribe;
    }

    static final class c extends Lambda implements Function1<aw, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f6723a = 1;

        /* JADX INFO: renamed from: d */
        private static int f6724d = 0;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ String f6725b;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ g f6727e;

        private void d() {
            int i2 = 2 % 2;
            int i3 = f6724d + 25;
            f6723a = i3 % 128;
            int i4 = i3 % 2;
            VideoUploadJobService videoUploadJobService = VideoUploadJobService.this;
            String str = this.f6725b;
            g.b bVar = g.f10683c;
            VideoUploadJobService.b(videoUploadJobService, str, g.b.c(this.f6727e));
            int i5 = f6724d + 11;
            f6723a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 42 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(aw awVar) {
            int i2 = 2 % 2;
            int i3 = f6723a + 125;
            f6724d = i3 % 128;
            int i4 = i3 % 2;
            d();
            Unit unit = Unit.INSTANCE;
            int i5 = f6724d + 99;
            f6723a = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, g gVar) {
            super(1);
            this.f6725b = str;
            this.f6727e = gVar;
        }
    }

    public static final void b(g gVar) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(gVar, "");
        m.b(new k.d(gVar));
        int i3 = f6706i + 25;
        f6707j = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    static final class b extends Lambda implements Function1<aw, SingleSource<? extends ResponseBody>> {

        /* JADX INFO: renamed from: a */
        private static int f6717a = 0;

        /* JADX INFO: renamed from: f */
        private static int f6718f = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ IncodeWelcomeRepository f6719b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Ref.ObjectRef<String> f6720c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ VideoUploadJobService f6721d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ g f6722e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ SingleSource<? extends ResponseBody> invoke(aw awVar) {
            int i2 = 2 % 2;
            int i3 = f6718f + 85;
            f6717a = i3 % 128;
            int i4 = i3 % 2;
            SingleSource<? extends ResponseBody> singleSourceD = d(awVar);
            int i5 = f6717a + 45;
            f6718f = i5 % 128;
            int i6 = i5 % 2;
            return singleSourceD;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.String] */
        private SingleSource<? extends ResponseBody> d(aw awVar) {
            int i2 = 2 % 2;
            int i3 = f6717a + 3;
            f6718f = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(awVar, "");
            this.f6720c.element = awVar.d();
            File fileD = this.f6722e.d(this.f6719b);
            this.f6722e.a(this.f6719b);
            VideoUploadJobService videoUploadJobService = this.f6721d;
            VideoUploadJobService.a(videoUploadJobService, TimeSource.Monotonic.ValueTimeMark.m10446boximpl(VideoUploadJobService.d(videoUploadJobService).m10445markNowz9LOYto()));
            Single<ResponseBody> singleUploadVideo = this.f6719b.uploadVideo(awVar.a(), fileD);
            int i5 = f6718f + 11;
            f6717a = i5 % 128;
            int i6 = i5 % 2;
            return singleUploadVideo;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Ref.ObjectRef<String> objectRef, g gVar, IncodeWelcomeRepository incodeWelcomeRepository, VideoUploadJobService videoUploadJobService) {
            super(1);
            this.f6720c = objectRef;
            this.f6722e = gVar;
            this.f6719b = incodeWelcomeRepository;
            this.f6721d = videoUploadJobService;
        }
    }

    public static final void c(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f6707j + 53;
        f6706i = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i5 = f6706i + 43;
        f6707j = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static final class h extends Lambda implements Function1<ResponseBody, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f6739a = 0;

        /* JADX INFO: renamed from: i */
        private static int f6740i = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ g f6741b;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ String f6743d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ Ref.ObjectRef<String> f6744e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseBody responseBody) {
            int i2 = 2 % 2;
            int i3 = f6739a + 43;
            f6740i = i3 % 128;
            int i4 = i3 % 2;
            e();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = f6739a + 73;
            f6740i = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e() {
            String str;
            int i2 = 2 % 2;
            long jM10445markNowz9LOYto = VideoUploadJobService.d(VideoUploadJobService.this).m10445markNowz9LOYto();
            TimeSource.Monotonic.ValueTimeMark valueTimeMarkA = VideoUploadJobService.a(VideoUploadJobService.this);
            Intrinsics.checkNotNull(valueTimeMarkA);
            long jM10456minus6eNON_k = TimeSource.Monotonic.ValueTimeMark.m10456minus6eNON_k(jM10445markNowz9LOYto, valueTimeMarkA.m10463unboximpl());
            Timber.Forest forest = Timber.Forest;
            String str2 = null;
            if (this.f6744e.element == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                str = null;
            } else {
                str = this.f6744e.element;
            }
            forest.d("Upload time for video " + str + ": " + Duration.m10355toStringimpl(jM10456minus6eNON_k), new Object[0]);
            VideoUploadJobService videoUploadJobService = VideoUploadJobService.this;
            String str3 = this.f6743d;
            g.b bVar = g.f10683c;
            VideoUploadJobService.b(videoUploadJobService, str3, g.b.d(this.f6741b));
            d dVar = VideoUploadJobService.f6702c;
            com.incode.welcome_sdk.commons.video_upload.a aVarC = d.c();
            if (aVarC != null) {
                int i3 = f6739a + 77;
                f6740i = i3 % 128;
                if (i3 % 2 == 0) {
                    String str4 = this.f6744e.element;
                    throw null;
                }
                if (this.f6744e.element == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    str2 = this.f6744e.element;
                    int i4 = f6739a + 115;
                    f6740i = i4 % 128;
                    int i5 = i4 % 2;
                }
                aVarC.onVideoUploadComplete(str2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Ref.ObjectRef<String> objectRef, String str, g gVar) {
            super(1);
            this.f6744e = objectRef;
            this.f6743d = str;
            this.f6741b = gVar;
        }
    }

    public static final void e(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f6707j + 49;
        f6706i = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i4 = 51 / 0;
        }
    }

    static final class f extends Lambda implements Function1<ResponseBody, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f6735a = 1;

        /* JADX INFO: renamed from: d */
        private static int f6736d = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ IncodeWelcomeRepository f6737c;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ g f6738e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ResponseBody responseBody) {
            int i2 = 2 % 2;
            int i3 = f6735a + 89;
            f6736d = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void c() {
            int i2 = 2 % 2;
            int i3 = f6735a + 57;
            f6736d = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                this.f6738e.c(this.f6737c);
                throw null;
            }
            this.f6738e.c(this.f6737c);
            int i4 = f6735a + 49;
            f6736d = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(g gVar, IncodeWelcomeRepository incodeWelcomeRepository) {
            super(1);
            this.f6738e = gVar;
            this.f6737c = incodeWelcomeRepository;
        }
    }

    static final class j extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: f */
        private static int f6745f = 1;

        /* JADX INFO: renamed from: i */
        private static int f6746i = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ IncodeWelcomeRepository f6747a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ g f6748b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Ref.BooleanRef f6749c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ Ref.IntRef f6750d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ JobParameters f6751e;

        /* JADX INFO: renamed from: h */
        private /* synthetic */ VideoUploadJobService f6752h;

        /* JADX INFO: renamed from: j */
        private /* synthetic */ String f6753j;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f6745f + 107;
            f6746i = i3 % 128;
            int i4 = i3 % 2;
            b(th);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                throw null;
            }
            int i5 = f6746i + 13;
            f6745f = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private void b(Throwable th) {
            boolean z2;
            int i2 = 2 % 2;
            Ref.BooleanRef booleanRef = this.f6749c;
            if (this.f6750d.element >= 3) {
                this.f6748b.c(this.f6747a);
                d dVar = VideoUploadJobService.f6702c;
                com.incode.welcome_sdk.commons.video_upload.a aVarC = d.c();
                if (aVarC != null) {
                    int i3 = f6746i + 93;
                    f6745f = i3 % 128;
                    if (i3 % 2 == 0) {
                        aVarC.onVideoUploadFailed();
                        int i4 = 49 / 0;
                    } else {
                        aVarC.onVideoUploadFailed();
                    }
                }
            } else {
                int i5 = f6746i + 57;
                f6745f = i5 % 128;
                if (i5 % 2 != 0) {
                    z2 = true;
                }
                booleanRef.element = z2;
                PersistableBundle extras = this.f6751e.getExtras();
                this.f6750d.element++;
                extras.putInt("retryCount", this.f6750d.element);
                Timber.Forest.e(th, "Couldn't upload the capture session video recording", new Object[0]);
                VideoUploadJobService.b(this.f6752h, this.f6753j, Event.SCREEN_RECORD_VIDEO_UPLOAD_ERROR);
            }
            z2 = false;
            booleanRef.element = z2;
            PersistableBundle extras2 = this.f6751e.getExtras();
            this.f6750d.element++;
            extras2.putInt("retryCount", this.f6750d.element);
            Timber.Forest.e(th, "Couldn't upload the capture session video recording", new Object[0]);
            VideoUploadJobService.b(this.f6752h, this.f6753j, Event.SCREEN_RECORD_VIDEO_UPLOAD_ERROR);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Ref.BooleanRef booleanRef, Ref.IntRef intRef, g gVar, IncodeWelcomeRepository incodeWelcomeRepository, JobParameters jobParameters, VideoUploadJobService videoUploadJobService, String str) {
            super(1);
            this.f6749c = booleanRef;
            this.f6750d = intRef;
            this.f6748b = gVar;
            this.f6747a = incodeWelcomeRepository;
            this.f6751e = jobParameters;
            this.f6752h = videoUploadJobService;
            this.f6753j = str;
        }
    }

    public static final void b(VideoUploadJobService videoUploadJobService, JobParameters jobParameters, Ref.BooleanRef booleanRef) {
        int i2 = 2 % 2;
        int i3 = f6707j + 77;
        f6706i = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(videoUploadJobService, "");
            Intrinsics.checkNotNullParameter(jobParameters, "");
            Intrinsics.checkNotNullParameter(booleanRef, "");
            videoUploadJobService.jobFinished(jobParameters, booleanRef.element);
            f6705h = null;
            throw null;
        }
        Intrinsics.checkNotNullParameter(videoUploadJobService, "");
        Intrinsics.checkNotNullParameter(jobParameters, "");
        Intrinsics.checkNotNullParameter(booleanRef, "");
        videoUploadJobService.jobFinished(jobParameters, booleanRef.element);
        f6705h = null;
        int i4 = f6707j + 107;
        f6706i = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void b(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f6706i + 77;
        f6707j = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f6706i + 23;
        f6707j = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void i(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f6706i + 67;
        f6707j = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            int i4 = 2 / 0;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
        }
        int i5 = f6707j + 75;
        f6706i = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
    }

    private final Disposable b(final JobParameters jobParameters) {
        int i2 = 2 % 2;
        String string = jobParameters.getExtras().getString("sessionType");
        Intrinsics.checkNotNull(string);
        final g gVarValueOf = g.valueOf(string);
        String string2 = jobParameters.getExtras().getString("sessionToken");
        Intrinsics.checkNotNull(string2);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = jobParameters.getExtras().getInt("retryCount", 0);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        IncodeWelcomeRepository incodeWelcomeRepository = this.f6708a;
        if (incodeWelcomeRepository == null) {
            Timber.Forest.w("Repository is null — skipping upload job", new Object[0]);
            jobFinished(jobParameters, false);
            Disposable disposableEmpty = Disposables.empty();
            Intrinsics.checkNotNullExpressionValue(disposableEmpty, "");
            int i3 = f6706i + 77;
            f6707j = i3 % 128;
            int i4 = i3 % 2;
            return disposableEmpty;
        }
        Single<aw> singleDoFinally = incodeWelcomeRepository.generateSessionRecordingUploadUrl(string2, gVarValueOf.a()).doFinally(new Action() { // from class: com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Action
            public final void run() {
                VideoUploadJobService.b(gVarValueOf);
            }
        });
        final c cVar = new c(string2, gVarValueOf);
        Single<aw> singleDoOnSuccess = singleDoFinally.doOnSuccess(new Consumer() { // from class: com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoUploadJobService.c(cVar, obj);
            }
        });
        final b bVar = new b(objectRef, gVarValueOf, incodeWelcomeRepository, this);
        Single<R> singleFlatMap = singleDoOnSuccess.flatMap(new Function() { // from class: com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return VideoUploadJobService.d(bVar, obj);
            }
        });
        final h hVar = new h(objectRef, string2, gVarValueOf);
        Single singleDoFinally2 = singleFlatMap.doOnSuccess(new Consumer() { // from class: com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoUploadJobService.e(hVar, obj);
            }
        }).subscribeOn(Schedulers.io()).doFinally(new Action() { // from class: com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Action
            public final void run() {
                VideoUploadJobService.b(this.f$0, jobParameters, booleanRef);
            }
        });
        final f fVar = new f(gVarValueOf, incodeWelcomeRepository);
        Consumer consumer = new Consumer() { // from class: com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService$$ExternalSyntheticLambda8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoUploadJobService.b(fVar, obj);
            }
        };
        final j jVar = new j(booleanRef, intRef, gVarValueOf, incodeWelcomeRepository, jobParameters, this, string2);
        Disposable disposableSubscribe = singleDoFinally2.subscribe(consumer, new Consumer() { // from class: com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService$$ExternalSyntheticLambda9
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                VideoUploadJobService.i(jVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "");
        return disposableSubscribe;
    }

    static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a */
        private static int f6712a = 1;

        /* JADX INFO: renamed from: b */
        public static final a f6713b = new a();

        /* JADX INFO: renamed from: c */
        private static int f6714c = 0;

        /* JADX INFO: renamed from: d */
        private static int f6715d = 0;

        /* JADX INFO: renamed from: e */
        private static int f6716e = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f6712a + 93;
            f6715d = i3 % 128;
            int i4 = i3 % 2;
            d();
            Unit unit = Unit.INSTANCE;
            int i5 = f6712a + 57;
            f6715d = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private static void d() {
            int i2 = 2 % 2;
            int i3 = f6715d + 35;
            f6712a = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.w("Repository is null — skipping sendEvent() call", new Object[0]);
            int i5 = f6712a + 3;
            f6715d = i5 % 128;
            int i6 = i5 % 2;
        }

        static {
            int i2 = f6714c + 67;
            f6716e = i2 % 128;
            int i3 = i2 % 2;
        }

        a() {
            super(0);
        }
    }

    private final void b(String str, Event event) {
        String strName;
        int i2 = 2 % 2;
        IncodeWelcomeRepository incodeWelcomeRepository = this.f6708a;
        if (incodeWelcomeRepository == null) {
            a aVar = a.f6713b;
            return;
        }
        ScreenName currentScreenName = incodeWelcomeRepository.getCurrentScreenName();
        if (currentScreenName != null) {
            int i3 = f6707j + 121;
            f6706i = i3 % 128;
            if (i3 % 2 != 0) {
                currentScreenName.name();
                map.hashCode();
                throw null;
            }
            strName = currentScreenName.name();
            int i4 = f6707j + 45;
            f6706i = i4 % 128;
            int i5 = i4 % 2;
        } else {
            int i6 = f6707j + 41;
            f6706i = i6 % 128;
            int i7 = i6 % 2;
            strName = null;
        }
        EventUtils.INSTANCE.sendEventUsingCustomToken(str, incodeWelcomeRepository, event, null, strName != null ? MapsKt.hashMapOf(TuplesKt.to(EventValues.SCREEN_NAME.getValue(), strName)) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x002a  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStopJob(android.app.job.JobParameters r7) {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            io.reactivex.disposables.Disposable r2 = r6.f6709b
            r4 = 1
            if (r2 == 0) goto L4d
            int r0 = com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.f6707j
            int r1 = r0 + 79
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.f6706i = r0
            int r1 = r1 % r5
            boolean r0 = r2.isDisposed()
            if (r0 != r4) goto L56
            int r0 = com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.f6707j
            int r1 = r0 + 23
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.f6706i = r0
            int r1 = r1 % r5
            r4 = 0
        L26:
            io.reactivex.disposables.Disposable r3 = r6.f6709b
            if (r3 == 0) goto L41
            boolean r0 = r3.isDisposed()
            r2 = 0
            if (r0 != 0) goto L42
            int r0 = com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.f6706i
            int r1 = r0 + 113
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.f6707j = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L60
        L3c:
            if (r3 == 0) goto L41
            r3.dispose()
        L41:
            return r4
        L42:
            int r0 = com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.f6707j
            int r1 = r0 + 69
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.f6706i = r0
            int r1 = r1 % r5
            r3 = r2
            goto L3c
        L4d:
            int r0 = com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.f6706i
            int r1 = r0 + 125
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.f6707j = r0
            int r1 = r1 % r5
        L56:
            int r0 = com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.f6706i
            int r1 = r0 + 117
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.f6707j = r0
            int r1 = r1 % r5
            goto L26
        L60:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.video_upload.VideoUploadJobService.onStopJob(android.app.job.JobParameters):boolean");
    }

    public static final class d {

        /* JADX INFO: renamed from: a */
        private static int f6728a = 1;

        /* JADX INFO: renamed from: b */
        private static int f6729b = 0;

        private d() {
        }

        public static com.incode.welcome_sdk.commons.video_upload.a c() {
            com.incode.welcome_sdk.commons.video_upload.a aVarE;
            int i2 = 2 % 2;
            int i3 = f6729b + 105;
            f6728a = i3 % 128;
            if (i3 % 2 == 0) {
                aVarE = VideoUploadJobService.e();
                int i4 = 67 / 0;
            } else {
                aVarE = VideoUploadJobService.e();
            }
            int i5 = f6728a + 95;
            f6729b = i5 % 128;
            int i6 = i5 % 2;
            return aVarE;
        }

        public static void d(com.incode.welcome_sdk.commons.video_upload.a aVar) {
            int i2 = 2 % 2;
            int i3 = f6728a + 73;
            f6729b = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            VideoUploadJobService.e(aVar);
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = f6729b + 75;
            f6728a = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        @JvmStatic
        public static void c(Context context, g gVar, String str) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(gVar, "");
            Intrinsics.checkNotNullParameter(str, "");
            ComponentName componentName = new ComponentName(context, (Class<?>) VideoUploadJobService.class);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("sessionType", gVar.name());
            persistableBundle.putString("sessionToken", str);
            persistableBundle.putString("jobType", "upload");
            JobInfo jobInfoBuild = new JobInfo.Builder(gVar.ordinal(), componentName).setRequiredNetworkType(1).setExtras(persistableBundle).build();
            Object systemService = context.getSystemService("jobscheduler");
            Intrinsics.checkNotNull(systemService, "");
            ((JobScheduler) systemService).schedule(jobInfoBuild);
            int i3 = f6729b + 43;
            f6728a = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        public static /* synthetic */ void a(Context context) {
            int i2 = 2 % 2;
            int i3 = f6729b + 77;
            f6728a = i3 % 128;
            int i4 = i3 % 2;
            c(context, null);
            int i5 = f6729b + 109;
            f6728a = i5 % 128;
            int i6 = i5 % 2;
        }

        @JvmStatic
        public static void c(Context context, g gVar) {
            String strName;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            ComponentName componentName = new ComponentName(context, (Class<?>) VideoUploadJobService.class);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("jobType", "cleanup");
            if (gVar != null) {
                int i3 = f6728a + 73;
                f6729b = i3 % 128;
                int i4 = i3 % 2;
                strName = gVar.name();
            } else {
                int i5 = f6728a + 115;
                f6729b = i5 % 128;
                int i6 = i5 % 2;
                strName = null;
            }
            persistableBundle.putString("sessionType", strName);
            JobInfo jobInfoBuild = new JobInfo.Builder(g.values().length + 1, componentName).setRequiredNetworkType(1).setExtras(persistableBundle).build();
            Object systemService = context.getSystemService("jobscheduler");
            Intrinsics.checkNotNull(systemService, "");
            ((JobScheduler) systemService).schedule(jobInfoBuild);
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    static {
        int i2 = f6704g + 105;
        f6703f = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 88 / 0;
        }
    }

    @JvmStatic
    public static final void d(Context context, g gVar, String str) {
        int i2 = 2 % 2;
        int i3 = f6706i + 115;
        f6707j = i3 % 128;
        int i4 = i3 % 2;
        d.c(context, gVar, str);
        if (i4 == 0) {
            int i5 = 38 / 0;
        }
    }

    public static final void c(com.incode.welcome_sdk.commons.video_upload.a aVar) {
        int i2 = 2 % 2;
        int i3 = f6707j + 27;
        f6706i = i3 % 128;
        int i4 = i3 % 2;
        d.d(aVar);
        if (i4 != 0) {
            throw null;
        }
        int i5 = f6707j + 81;
        f6706i = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final SingleSource d(Function1 function1, Object obj) {
        int iB = FormsDateInputScreenKt.a.b();
        int iB2 = FormsDateInputScreenKt.a.b();
        return (SingleSource) b(FormsDateInputScreenKt.a.b(), FormsDateInputScreenKt.a.b(), iB, new Object[]{function1, obj}, iB2, -1945576149, 1945576150);
    }

    public static final void a(Function1 function1, Object obj) {
        int iB = FormsDateInputScreenKt.a.b();
        int iB2 = FormsDateInputScreenKt.a.b();
        b(FormsDateInputScreenKt.a.b(), FormsDateInputScreenKt.a.b(), iB, new Object[]{function1, obj}, iB2, 1937550593, -1937550593);
    }

    public static final void d(VideoUploadJobService videoUploadJobService, JobParameters jobParameters) {
        int iB = FormsDateInputScreenKt.a.b();
        int iB2 = FormsDateInputScreenKt.a.b();
        b(FormsDateInputScreenKt.a.b(), FormsDateInputScreenKt.a.b(), iB, new Object[]{videoUploadJobService, jobParameters}, iB2, -804533330, 804533333);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        int iB = FormsDateInputScreenKt.a.b();
        int iB2 = FormsDateInputScreenKt.a.b();
        return ((Boolean) b(FormsDateInputScreenKt.a.b(), FormsDateInputScreenKt.a.b(), iB, new Object[]{this, jobParameters}, iB2, 222256317, -222256315)).booleanValue();
    }
}
