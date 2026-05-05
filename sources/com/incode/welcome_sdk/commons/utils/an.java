package com.incode.welcome_sdk.commons.utils;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import android.os.Build;
import android.os.FileObserver;
import com.biocatch.android.commonsdk.configuration.ConfigurationDefaultValue;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.incode.welcome_sdk.commons.exceptions.video_selfie.VideoSelfieException;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.b;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Single;
import io.reactivex.functions.Cancellable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class an {

    /* JADX INFO: renamed from: a */
    private static int f6427a = 0;

    /* JADX INFO: renamed from: b */
    private static int f6428b = 0;

    /* JADX INFO: renamed from: c */
    public static final an f6429c = new an();

    /* JADX INFO: renamed from: d */
    private static int f6430d = 1;

    /* JADX INFO: renamed from: e */
    private static int f6431e = 1;

    public static /* synthetic */ Object b(int i2, int i3, Object[] objArr, int i4, int i5, int i6, int i7) {
        int i8 = ~i7;
        int i9 = ~i4;
        int i10 = ~(i8 | i9);
        int i11 = ~(i3 | i4);
        int i12 = i10 | i11;
        int i13 = ~i3;
        int i14 = i10 | (~(i13 | i7)) | i11;
        int i15 = (~(i4 | i3 | i7)) | (~(i8 | i13 | i9));
        int i16 = i3 + i7 + i2 + (1322235619 * i5) + (440487356 * i6);
        int i17 = i16 * i16;
        int i18 = (((-1102165783) * i3) - 2100690944) + ((-281430247) * i7) + ((-820735536) * i12) + (i14 * 410367768) + (410367768 * i15) + ((-691798016) * i2) + ((-942931968) * i5) + ((-1410334720) * i6) + (1251606528 * i17);
        int i19 = (i3 * 157034417) + 1376579869 + (i7 * 157036385) + (i12 * (-1968)) + (i14 * 984) + (i15 * 984) + (i2 * 157035401) + (i5 * (-982187909)) + (i6 * (-1869533796)) + (i17 * (-899022848));
        int i20 = i18 + (i19 * i19 * (-511311872));
        if (i20 == 1) {
            return e(objArr);
        }
        if (i20 == 2) {
            return a(objArr);
        }
        final File file = (File) objArr[0];
        int i21 = 2 % 2;
        final int i22 = 8;
        Completable completableAndThen = Observable.create(new ObservableOnSubscribe() { // from class: com.incode.welcome_sdk.commons.utils.an$$ExternalSyntheticLambda0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                an.a(file, observableEmitter);
            }
        }).timeout(ConfigurationDefaultValue.MotionPaddingAroundTouchMSec, TimeUnit.MILLISECONDS).filter(new Predicate() { // from class: com.incode.welcome_sdk.commons.utils.an$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return an.a(i22, obj);
            }
        }).firstOrError().ignoreElement().andThen(c(file, 102400));
        final b bVar = new b(file, 102400);
        Completable completableOnErrorResumeNext = completableAndThen.onErrorResumeNext(new Function() { // from class: com.incode.welcome_sdk.commons.utils.an$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return an.a(bVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableOnErrorResumeNext, "");
        int i23 = f6428b + 49;
        f6430d = i23 % 128;
        int i24 = i23 % 2;
        return completableOnErrorResumeNext;
    }

    private an() {
    }

    public static final /* synthetic */ Completable a(File file, int i2) {
        int i3 = 2 % 2;
        int i4 = f6430d + 123;
        f6428b = i4 % 128;
        int i5 = i4 % 2;
        Completable completableC = c(file, i2);
        if (i5 != 0) {
            int i6 = 30 / 0;
        }
        return completableC;
    }

    public static long c(File file) throws IOException {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(file, "");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        long jLongValue = -1;
        Object obj = null;
        try {
            try {
                mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                if (strExtractMetadata != null) {
                    int i3 = f6430d + 51;
                    f6428b = i3 % 128;
                    int i4 = i3 % 2;
                    Long longOrNull = StringsKt.toLongOrNull(strExtractMetadata);
                    if (longOrNull != null) {
                        int i5 = f6430d + 73;
                        f6428b = i5 % 128;
                        if (i5 % 2 != 0) {
                            longOrNull.longValue();
                            throw null;
                        }
                        jLongValue = longOrNull.longValue();
                    }
                }
                mediaMetadataRetriever.release();
                int i6 = f6430d + 67;
                f6428b = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 / 4;
                }
            } catch (Exception e2) {
                Timber.Forest.e(e2);
                mediaMetadataRetriever.release();
            }
            int i8 = f6430d + 13;
            f6428b = i8 % 128;
            if (i8 % 2 == 0) {
                return jLongValue;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x005a A[Catch: Exception -> 0x0070, all -> 0x007c, Merged into TryCatch #1 {all -> 0x007c, Exception -> 0x0070, blocks: (B:46:0x0011, B:48:0x0020, B:53:0x003e, B:62:0x005a, B:63:0x005d, B:64:0x005e, B:56:0x0045, B:72:0x0071), top: B:79:0x0011 }, TRY_ENTER] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005e A[Catch: Exception -> 0x0070, all -> 0x007c, Merged into TryCatch #1 {all -> 0x007c, Exception -> 0x0070, blocks: (B:46:0x0011, B:48:0x0020, B:53:0x003e, B:62:0x005a, B:63:0x005d, B:64:0x005e, B:56:0x0045, B:72:0x0071), top: B:79:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.io.File r15) {
        /*
            java.lang.String r14 = "UNKNOWN"
            java.lang.String r8 = "mime"
            r7 = 2
            int r0 = r7 % r7
            java.lang.String r11 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r11)
            android.media.MediaExtractor r4 = new android.media.MediaExtractor
            r4.<init>()
            java.lang.String r0 = r15.getAbsolutePath()     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L7c
            r4.setDataSource(r0)     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L7c
            int r12 = r4.getTrackCount()     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L7c
            r10 = 0
            r9 = r10
        L1e:
            if (r9 >= r12) goto L6a
            android.media.MediaFormat r6 = r4.getTrackFormat(r9)     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L7c
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r11)     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L7c
            java.lang.String r13 = r6.getString(r8)     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L7c
            if (r13 == 0) goto L57
            int r0 = com.incode.welcome_sdk.commons.utils.an.f6430d
            int r5 = r0 + 69
            int r0 = r5 % 128
            com.incode.welcome_sdk.commons.utils.an.f6428b = r0
            int r5 = r5 % r7
            java.lang.String r3 = "video"
            r2 = 0
            r1 = 1
            if (r5 == 0) goto L45
            r0 = 3
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r13, r3, r10, r0, r2)     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L7c
            if (r0 != r1) goto L57
            goto L4b
        L45:
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r13, r3, r10, r7, r2)     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L7c
            if (r0 != r1) goto L57
        L4b:
            int r0 = com.incode.welcome_sdk.commons.utils.an.f6430d
            int r1 = r0 + 29
            int r0 = r1 % 128
            com.incode.welcome_sdk.commons.utils.an.f6428b = r0
            int r1 = r1 % r7
            if (r1 != 0) goto L5a
            goto L5e
        L57:
            int r9 = r9 + 1
            goto L1e
        L5a:
            r6.getString(r8)     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L7c
            throw r2     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L7c
        L5e:
            java.lang.String r0 = r6.getString(r8)     // Catch: java.lang.Exception -> L70 java.lang.Throwable -> L7c
            if (r0 != 0) goto L68
        L64:
            r4.release()
            return r14
        L68:
            r14 = r0
            goto L64
        L6a:
            r4.release()
            java.lang.String r0 = "NO VIDEO"
            return r0
        L70:
            r1 = move-exception
            timber.log.Timber$Forest r0 = timber.log.Timber.Forest     // Catch: java.lang.Throwable -> L7c
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> L7c
            r0.e(r1)     // Catch: java.lang.Throwable -> L7c
            r4.release()
            return r14
        L7c:
            r0 = move-exception
            r4.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.an.b(java.io.File):java.lang.String");
    }

    /* JADX WARN: Finally extract failed */
    private static /* synthetic */ Object e(Object[] objArr) {
        File file = (File) objArr[0];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(file, "");
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            try {
                mediaExtractor.setDataSource(file.getAbsolutePath());
                int trackCount = mediaExtractor.getTrackCount();
                int i3 = f6430d + 87;
                f6428b = i3 % 128;
                int i4 = i3 % 2;
                for (int i5 = 0; i5 < trackCount; i5++) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i5);
                    Intrinsics.checkNotNullExpressionValue(trackFormat, "");
                    String string = trackFormat.getString("mime");
                    if (string != null && StringsKt.startsWith$default(string, "audio", false, 2, (Object) null)) {
                        int i6 = f6430d + 5;
                        int i7 = i6 % 128;
                        f6428b = i7;
                        int i8 = i6 % 2;
                        int i9 = i7 + 121;
                        f6430d = i9 % 128;
                        int i10 = i9 % 2;
                        mediaExtractor.release();
                        return true;
                    }
                }
            } catch (Exception e2) {
                Timber.Forest.e(e2);
            }
            mediaExtractor.release();
            return false;
        } catch (Throwable th) {
            mediaExtractor.release();
            throw th;
        }
    }

    @JvmStatic
    public static final Completable e(File file) {
        int i2 = 2 % 2;
        int i3 = f6428b + 23;
        f6430d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(file, "");
        int iC = b.d.e.c();
        Completable completable = (Completable) b(b.d.e.c(), 572371603, new Object[]{file}, iC, b.d.e.c(), b.d.e.c(), -572371603);
        int i5 = f6430d + 1;
        f6428b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
        return completable;
    }

    public static final class c extends FileObserver {

        /* JADX INFO: renamed from: d */
        private static int f6436d = 0;

        /* JADX INFO: renamed from: e */
        private static int f6437e = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ ObservableEmitter<Integer> f6438b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ObservableEmitter<Integer> observableEmitter, String str) {
            super(str, 4095);
            this.f6438b = observableEmitter;
        }

        @Override // android.os.FileObserver
        public final void onEvent(int i2, String str) {
            int i3 = 2 % 2;
            int i4 = f6437e + 97;
            f6436d = i4 % 128;
            int i5 = i4 % 2;
            this.f6438b.onNext(Integer.valueOf(i2));
            int i6 = f6436d + 101;
            f6437e = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 29 / 0;
            }
        }
    }

    public static final void a(c cVar) {
        int i2 = 2 % 2;
        int i3 = f6430d + 107;
        f6428b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(cVar, "");
        cVar.stopWatching();
        int i5 = f6430d + 125;
        f6428b = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
    }

    public static final void a(File file, ObservableEmitter observableEmitter) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(observableEmitter, "");
        final c cVar = new c(observableEmitter, file.getAbsolutePath());
        cVar.startWatching();
        observableEmitter.setCancellable(new Cancellable() { // from class: com.incode.welcome_sdk.commons.utils.an$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Cancellable
            public final void cancel() {
                an.a(cVar);
            }
        });
        int i3 = f6430d + 113;
        f6428b = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean a(int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f6428b + 73;
        f6430d = i4 % 128;
        int i5 = i4 % 2;
        boolean zEquals = Integer.valueOf(i2).equals(obj);
        int i6 = f6430d + 87;
        f6428b = i6 % 128;
        if (i6 % 2 == 0) {
            return zEquals;
        }
        throw null;
    }

    static final class b extends Lambda implements Function1<Throwable, CompletableSource> {

        /* JADX INFO: renamed from: a */
        private static int f6432a = 0;

        /* JADX INFO: renamed from: e */
        private static int f6433e = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ File f6434b;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ int f6435d = 102400;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CompletableSource invoke(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f6433e + 21;
            f6432a = i3 % 128;
            int i4 = i3 % 2;
            CompletableSource completableSourceA = a(th);
            int i5 = f6432a + 13;
            f6433e = i5 % 128;
            int i6 = i5 % 2;
            return completableSourceA;
        }

        private CompletableSource a(Throwable th) {
            int i2 = 2 % 2;
            int i3 = f6433e + 103;
            f6432a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(th, "");
            if (!(th instanceof TimeoutException)) {
                return Completable.error(th);
            }
            int i5 = f6432a + 31;
            f6433e = i5 % 128;
            if (i5 % 2 != 0) {
                an anVar = an.f6429c;
                return an.a(this.f6434b, this.f6435d);
            }
            an anVar2 = an.f6429c;
            an.a(this.f6434b, this.f6435d);
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, int i2) {
            super(1);
            this.f6434b = file;
        }
    }

    public static final CompletableSource a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f6430d + 53;
        f6428b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return (CompletableSource) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(obj, "");
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static Completable c(File file, int i2) {
        Completable completableError;
        int i3 = 2 % 2;
        if (!file.exists()) {
            Completable completableError2 = Completable.error(new VideoSelfieException("File " + file.getName() + " not found"));
            Intrinsics.checkNotNull(completableError2);
            return completableError2;
        }
        if (file.length() > i2) {
            completableError = Completable.complete();
            int i4 = f6428b + 27;
            f6430d = i4 % 128;
            int i5 = i4 % 2;
        } else if (file.length() > 0) {
            completableError = Completable.error(new VideoSelfieException("File " + file.getName() + " is smaller than " + (i2 / 1024.0f) + " KB"));
        } else {
            completableError = Completable.error(new VideoSelfieException("File " + file.getName() + " is empty"));
            int i6 = f6428b + 11;
            f6430d = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 3 / 4;
            }
        }
        Intrinsics.checkNotNull(completableError);
        return completableError;
    }

    @JvmStatic
    public static final Single<File> c(final IncodeWelcomeRepository incodeWelcomeRepository) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        Single<File> singleAndThen = e(new File(incodeWelcomeRepository.getVideoSelfieTempPath() + ".mp4")).delay(1000L, TimeUnit.MILLISECONDS).andThen(Single.fromCallable(new Callable() { // from class: com.incode.welcome_sdk.commons.utils.an$$ExternalSyntheticLambda4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return an.a(incodeWelcomeRepository);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(singleAndThen, "");
        int i3 = f6428b + 33;
        f6430d = i3 % 128;
        if (i3 % 2 != 0) {
            return singleAndThen;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final File a(IncodeWelcomeRepository incodeWelcomeRepository) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        String videoSelfieTempPath = incodeWelcomeRepository.getVideoSelfieTempPath();
        Intrinsics.checkNotNullExpressionValue(videoSelfieTempPath, "");
        int iC = b.d.e.c();
        List list = (List) b(b.d.e.c(), 820742508, new Object[]{videoSelfieTempPath}, iC, b.d.e.c(), b.d.e.c(), -820742506);
        String path = incodeWelcomeRepository.getImagesDirectory().getPath();
        Intrinsics.checkNotNullExpressionValue(path, "");
        List<File> listE = e(path);
        File file = new File(incodeWelcomeRepository.getVideoSelfiePath());
        c((List<? extends File>) CollectionsKt.plus((Collection) list, (Iterable) listE), file);
        int i3 = f6428b + 35;
        f6430d = i3 % 128;
        if (i3 % 2 != 0) {
            return file;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        int i2 = 2 % 2;
        List listListOf = CollectionsKt.listOf(new File(((String) objArr[0]) + ".mp4"));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((File) obj).exists()) {
                arrayList.add(obj);
                int i3 = f6428b + 43;
                f6430d = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        ArrayList arrayList2 = arrayList;
        int i5 = f6428b + 47;
        f6430d = i5 % 128;
        if (i5 % 2 != 0) {
            return arrayList2;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static List<File> e(String str) {
        int i2 = 2 % 2;
        IntRange intRange = new IntRange(0, 7);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it = intRange.iterator();
        while (it.hasNext()) {
            arrayList.add(str + RemoteSettings.FORWARD_SLASH_STRING + ((IntIterator) it).nextInt() + ".mp4");
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new File((String) it2.next()));
            int i3 = f6430d + 67;
            f6428b = i3 % 128;
            int i4 = i3 % 2;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            int i5 = f6428b + 103;
            f6430d = i5 % 128;
            int i6 = i5 % 2;
            if (!(!((File) obj).exists())) {
                int i7 = f6430d + 25;
                f6428b = i7 % 128;
                int i8 = i7 % 2;
                arrayList4.add(obj);
                int i9 = f6430d + 103;
                f6428b = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        ArrayList arrayList5 = arrayList4;
        int i11 = f6428b + 93;
        f6430d = i11 % 128;
        if (i11 % 2 != 0) {
            return arrayList5;
        }
        throw null;
    }

    public static boolean b(String str, String str2, long j2, long j3, String str3) {
        int iAddTrack;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        boolean zContentEquals = str3.contentEquals("audio");
        boolean zContentEquals2 = str3.contentEquals(RRWebVideoEvent.EVENT_TAG);
        if (!zContentEquals && !zContentEquals2) {
            int i3 = f6430d + 3;
            f6428b = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.w("Cannot trimVideoFileTrack for track: " + str3, new Object[0]);
            return false;
        }
        MediaExtractor mediaExtractor = new MediaExtractor();
        MediaMuxer mediaMuxer = new MediaMuxer(str2, 0);
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            int i5 = 0;
            while (true) {
                if (i5 >= trackCount) {
                    iAddTrack = -1;
                    i5 = -1;
                    break;
                }
                int i6 = f6430d + 123;
                f6428b = i6 % 128;
                if (i6 % 2 != 0) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i5);
                    Intrinsics.checkNotNullExpressionValue(trackFormat, "");
                    trackFormat.getString("mime");
                    throw null;
                }
                MediaFormat trackFormat2 = mediaExtractor.getTrackFormat(i5);
                Intrinsics.checkNotNullExpressionValue(trackFormat2, "");
                String string = trackFormat2.getString("mime");
                if (string == null || !StringsKt.startsWith$default(string, str3, false, 2, (Object) null)) {
                    i5++;
                } else {
                    if (zContentEquals2) {
                        int i7 = f6430d + 89;
                        f6428b = i7 % 128;
                        if (i7 % 2 != 0) {
                            if (Build.VERSION.SDK_INT >= 81) {
                                mediaMuxer.setOrientationHint(trackFormat2.getInteger("rotation-degrees", 0));
                            }
                        } else if (Build.VERSION.SDK_INT >= 29) {
                            mediaMuxer.setOrientationHint(trackFormat2.getInteger("rotation-degrees", 0));
                        }
                    }
                    iAddTrack = mediaMuxer.addTrack(trackFormat2);
                    int i8 = f6428b + 75;
                    f6430d = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
            if (i5 == -1) {
                return false;
            }
            mediaMuxer.start();
            mediaExtractor.selectTrack(i5);
            mediaExtractor.seekTo(j2 * 1000, zContentEquals2 ? 0 : 2);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            while (true) {
                bufferInfo.offset = 0;
                bufferInfo.size = mediaExtractor.readSampleData(byteBufferAllocate, 0);
                if (bufferInfo.size >= 0) {
                    bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                    int i10 = f6428b + 111;
                    f6430d = i10 % 128;
                    int i11 = i10 % 2;
                    bufferInfo.flags = ((mediaExtractor.getSampleFlags() & 4) << 1) | (mediaExtractor.getSampleFlags() & 3);
                    if (bufferInfo.presentationTimeUs > j3 * 1000) {
                        break;
                    }
                    mediaMuxer.writeSampleData(iAddTrack, byteBufferAllocate, bufferInfo);
                    mediaExtractor.advance();
                } else {
                    int i12 = f6430d + 57;
                    f6428b = i12 % 128;
                    int i13 = i12 % 2;
                    bufferInfo.size = 0;
                    break;
                }
            }
            mediaMuxer.stop();
            return true;
        } catch (Exception e2) {
            Timber.Forest.e(e2);
            return false;
        } finally {
            mediaMuxer.release();
            mediaExtractor.release();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(java.util.List<? extends java.io.File> r22, java.io.File r23) throws com.incode.welcome_sdk.commons.exceptions.video_selfie.VideoSelfieException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.commons.utils.an.c(java.util.List, java.io.File):void");
    }

    static {
        int i2 = f6427a + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f6431e = i2 % 128;
        int i3 = i2 % 2;
    }

    private static List<File> d(String str) {
        int iC = b.d.e.c();
        return (List) b(b.d.e.c(), 820742508, new Object[]{str}, iC, b.d.e.c(), b.d.e.c(), -820742506);
    }

    private static Completable d(File file) {
        int iC = b.d.e.c();
        return (Completable) b(b.d.e.c(), 572371603, new Object[]{file}, iC, b.d.e.c(), b.d.e.c(), -572371603);
    }

    public static boolean a(File file) {
        int iC = b.d.e.c();
        return ((Boolean) b(b.d.e.c(), 35330034, new Object[]{file}, iC, b.d.e.c(), b.d.e.c(), -35330033)).booleanValue();
    }
}
