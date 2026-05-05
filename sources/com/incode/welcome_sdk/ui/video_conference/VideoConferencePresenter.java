package com.incode.welcome_sdk.ui.video_conference;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.opengl.GLSurfaceView;
import android.os.Process;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.c.a.e.e;
import com.c.a.n;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.exceptions.MissingVideoStreamingDependencyException;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.l;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.EventValues;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.aq;
import com.incode.welcome_sdk.data.remote.beans.at;
import com.incode.welcome_sdk.data.remote.beans.au;
import com.incode.welcome_sdk.data.remote.beans.y;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.results.VideoConferenceResult;
import com.incode.welcome_sdk.ui.BaseModulePresenter;
import com.incode.welcome_sdk.ui.camera.video_selfie.DaggerVideoSelfieComponent;
import com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract;
import com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter;
import com.opentok.android.Connection;
import com.opentok.android.OpentokError;
import com.opentok.android.Publisher;
import com.opentok.android.PublisherKit;
import com.opentok.android.Session;
import com.opentok.android.Stream;
import com.opentok.android.Subscriber;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class VideoConferencePresenter extends BaseModulePresenter implements VideoConferenceContract.Presenter {
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10 = 0;
    private static int $11 = 0;

    /* JADX INFO: renamed from: n */
    private static int f18107n = 0;

    /* JADX INFO: renamed from: o */
    private static int f18108o = 0;

    /* JADX INFO: renamed from: r */
    private static int f18109r = 0;

    /* JADX INFO: renamed from: a */
    final IncodeWelcomeRepository f18110a;

    /* JADX INFO: renamed from: b */
    final VideoConferenceContract.View f18111b;

    /* JADX INFO: renamed from: c */
    Session f18112c;

    /* JADX INFO: renamed from: d */
    Publisher f18113d;

    /* JADX INFO: renamed from: e */
    Subscriber f18114e;

    /* JADX INFO: renamed from: f */
    boolean f18115f;

    /* JADX INFO: renamed from: g */
    private int f18116g;

    /* JADX INFO: renamed from: h */
    private boolean f18117h;

    /* JADX INFO: renamed from: i */
    private int f18118i;

    /* JADX INFO: renamed from: j */
    private CompositeDisposable f18119j;

    /* JADX INFO: renamed from: k */
    private List<VideoConferenceChatMessage> f18120k;

    /* JADX INFO: renamed from: l */
    private PublishSubject<Boolean> f18121l;

    /* JADX INFO: renamed from: m */
    private PublishSubject<VideoConferenceChatMessage> f18122m;

    /* JADX WARN: Removed duplicated region for block: B:20:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0023 -> B:17:0x0011). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(int r6, short r7, int r8) {
        /*
            int r8 = r8 + 4
            int r7 = r7 + 69
            int r0 = r6 * 4
            int r6 = 1 - r0
            byte[] r5 = com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.$$c
            byte[] r4 = new byte[r6]
            r3 = 0
            if (r5 != 0) goto L26
            r0 = r6
            r2 = r3
        L11:
            int r0 = -r0
            int r7 = r7 + r0
            r1 = r2
        L14:
            int r2 = r1 + 1
            byte r0 = (byte) r7
            int r8 = r8 + 1
            r4[r1] = r0
            if (r2 != r6) goto L23
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3)
            return r0
        L23:
            r0 = r5[r8]
            goto L11
        L26:
            r1 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.$$e(int, short, int):java.lang.String");
    }

    public static /* synthetic */ Object b(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~(i2 | i5);
        int i9 = i4 | i8;
        int i10 = (~(i5 | (~i4))) | i2;
        int i11 = i2 + i4 + i6 + ((-1932811043) * i3) + (1521317780 * i7);
        int i12 = i11 * i11;
        int i13 = ((i2 * (-919556932)) - 154402816) + ((-919556932) * i4) + ((-1121407813) * i8) + (i9 * 1121407813) + (1121407813 * i10) + (201850880 * i6) + ((-2098724864) * i3) + ((-1398800384) * i7) + ((-1444151296) * i12);
        int i14 = (i2 * 1794637580) + 2133191799 + (i4 * 1794637580) + (i8 * (-161)) + (i9 * 161) + (i10 * 161) + (i6 * 1794637741) + (i3 * (-1844343719)) + (i7 * (-1188939004)) + (i12 * (-394526720));
        int i15 = i13 + (i14 * i14 * 821297152);
        if (i15 == 1) {
            VideoConferencePresenter videoConferencePresenter = (VideoConferencePresenter) objArr[0];
            int i16 = 2 % 2;
            int i17 = f18109r + 25;
            int i18 = i17 % 128;
            f18107n = i18;
            int i19 = i17 % 2;
            videoConferencePresenter.f18116g = 0;
            int i20 = i18 + 61;
            f18109r = i20 % 128;
            int i21 = i20 % 2;
            return null;
        }
        if (i15 != 2) {
            return d(objArr);
        }
        VideoConferencePresenter videoConferencePresenter2 = (VideoConferencePresenter) objArr[0];
        VideoConferenceData videoConferenceData = (VideoConferenceData) objArr[1];
        int i22 = 2 % 2;
        int i23 = f18107n + 73;
        f18109r = i23 % 128;
        int i24 = i23 % 2;
        EventUtils.sendScreenClosed(videoConferencePresenter2.f18110a, ScreenName.CONFERENCE_WAIT, Modules.CONFERENCE);
        videoConferencePresenter2.f18111b.enterVideoConference(videoConferenceData);
        int i25 = f18109r + 47;
        f18107n = i25 % 128;
        int i26 = i25 % 2;
        return null;
    }

    static void init$0() {
        $$c = new byte[]{85, 48, 73, -84};
        $$d = 204;
    }

    @Inject
    public VideoConferencePresenter(IncodeWelcomeRepository incodeWelcomeRepository, VideoConferenceContract.View view) {
        super(view);
        this.f18117h = true;
        this.f18115f = false;
        this.f18118i = -1;
        this.f18120k = new LinkedList();
        this.f18122m = PublishSubject.create();
        this.f18121l = PublishSubject.create();
        this.f18110a = incodeWelcomeRepository;
        this.f18111b = view;
        this.f18119j = new CompositeDisposable();
    }

    public static /* synthetic */ ObservableSource e(Observable observable) throws Exception {
        int i2 = 2 % 2;
        int i3 = f18109r + 21;
        f18107n = i3 % 128;
        if (i3 % 2 != 0) {
            observable.delay(3L, TimeUnit.SECONDS);
            throw null;
        }
        Observable observableDelay = observable.delay(3L, TimeUnit.SECONDS);
        int i4 = f18109r + 117;
        f18107n = i4 % 128;
        int i5 = i4 % 2;
        return observableDelay;
    }

    public /* synthetic */ boolean a(aq aqVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f18109r + 61;
        f18107n = i3 % 128;
        int i4 = i3 % 2;
        if (aqVar.a() || this.f18116g == 7) {
            return true;
        }
        int i5 = f18107n + 47;
        f18109r = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public /* synthetic */ boolean e(aq aqVar) throws Exception {
        int i2 = 2 % 2;
        this.f18116g++;
        if (!aqVar.a()) {
            int i3 = f18107n + 61;
            f18109r = i3 % 128;
            if (i3 % 2 == 0) {
                if (this.f18116g != 113) {
                    return false;
                }
            } else if (this.f18116g != 7) {
                return false;
            }
        }
        int i4 = f18109r + 103;
        f18107n = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public /* synthetic */ ObservableSource d(aq aqVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f18107n + 21;
        f18109r = i3 % 128;
        int i4 = i3 % 2;
        Observable<y> observableAddCustomerToInterviewQueue = this.f18110a.addCustomerToInterviewQueue(IncodeWelcome.getInstance().getInternalConfig().queueName);
        int i5 = f18107n + 85;
        f18109r = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 74 / 0;
        }
        return observableAddCustomerToInterviewQueue;
    }

    public static /* synthetic */ y b(y yVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f18109r + 31;
        f18107n = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcome.getInstance().getVideoConferenceEstimatedWaitingTimeBus().onNext(Integer.valueOf(yVar.e()));
        int i5 = f18107n + 105;
        f18109r = i5 % 128;
        if (i5 % 2 != 0) {
            return yVar;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ObservableSource d(y yVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f18109r + 73;
        f18107n = i3 % 128;
        int i4 = i3 % 2;
        Observable<au> observableDoOnNext = this.f18110a.getCustomerInterviewPosition(IncodeWelcome.getInstance().getInternalConfig().queueName).repeatWhen(new Function() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$$ExternalSyntheticLambda0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return VideoConferencePresenter.c((Observable) obj);
            }
        }).takeUntil(new Predicate() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$$ExternalSyntheticLambda9
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return VideoConferencePresenter.d((au) obj);
            }
        }).filter(new Predicate() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$$ExternalSyntheticLambda10
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return this.f$0.a((au) obj);
            }
        }).doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$$ExternalSyntheticLambda11
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.c((au) obj);
            }
        });
        int i5 = f18107n + 43;
        f18109r = i5 % 128;
        if (i5 % 2 != 0) {
            return observableDoOnNext;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ ObservableSource c(Observable observable) throws Exception {
        int i2 = 2 % 2;
        int i3 = f18109r + 111;
        f18107n = i3 % 128;
        if (i3 % 2 != 0) {
            observable.delay(5L, TimeUnit.SECONDS);
            throw null;
        }
        Observable observableDelay = observable.delay(5L, TimeUnit.SECONDS);
        int i4 = f18109r + 95;
        f18107n = i4 % 128;
        int i5 = i4 % 2;
        return observableDelay;
    }

    public static /* synthetic */ boolean d(au auVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f18109r + 27;
        f18107n = i3 % 128;
        if (i3 % 2 != 0) {
            auVar.b();
            throw null;
        }
        if (auVar.b() != 0 && auVar.b() != -1) {
            return false;
        }
        int i4 = f18107n + 3;
        f18109r = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public /* synthetic */ boolean a(au auVar) throws Exception {
        int i2 = 2 % 2;
        if (this.f18118i != auVar.b()) {
            IncodeWelcome.getInstance().getVideoConferenceQueuePositionChangedBus().onNext(Integer.valueOf(auVar.b()));
            int iB = auVar.b();
            this.f18118i = iB;
            if (iB == 1) {
                HashMap map = new HashMap();
                map.put(EventValues.SCREEN_NAME.getValue(), this.f18110a.getCurrentScreenName().name());
                EventUtils.sendEvent(this.f18110a, Event.CONFERENCE_USER_FIRST_IN_QUEUE, Modules.CONFERENCE, (HashMap<String, Object>) map);
                int i3 = f18109r + 85;
                f18107n = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 4 % 4;
                }
            }
        }
        if (auVar.b() != 0) {
            int i5 = f18109r + 61;
            f18107n = i5 % 128;
            int i6 = i5 % 2;
            if (auVar.b() != -1) {
                return false;
            }
        }
        return true;
    }

    private static void p(String str, int i2, int i3, boolean z2, int i4, Object[] objArr) throws Throwable {
        Object charArray;
        String str2 = str;
        int i5 = 2 % 2;
        int i6 = $10 + 83;
        int i7 = i6 % 128;
        $11 = i7;
        int i8 = i6 % 2;
        if (str2 != null) {
            int i9 = i7 + 101;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = (char[]) charArray;
        n nVar = new n();
        char[] cArr2 = new char[i3];
        nVar.f2781b = 0;
        int i11 = $11 + 3;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        while (nVar.f2781b < i3) {
            nVar.f2782c = cArr[nVar.f2781b];
            cArr2[nVar.f2781b] = (char) (i4 + nVar.f2782c);
            int i13 = nVar.f2781b;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i13]), Integer.valueOf(f18108o)};
                Object objC = e.c(2056116162);
                if (objC == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objC = e.e((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19, Gravity.getAbsoluteGravity(0, 0) + TypedValues.Custom.TYPE_COLOR, 2048382395, false, $$e(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i13] = ((Character) ((Method) objC).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {nVar, nVar};
                Object objC2 = e.c(1507983255);
                if (objC2 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 1);
                    objC2 = e.e((char) KeyEvent.normalizeMetaState(0), 19 - ExpandableListView.getPackedPositionType(0L), 279 - ImageFormat.getBitsPerPixel(0), 1501298158, false, $$e(b4, b5, (byte) (-b5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objC2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            nVar.f2780a = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - nVar.f2780a, nVar.f2780a);
            System.arraycopy(cArr3, nVar.f2780a, cArr2, 0, i3 - nVar.f2780a);
        }
        if (z2) {
            int i14 = $11 + 113;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr4 = new char[i3];
            nVar.f2781b = 0;
            while (nVar.f2781b < i3) {
                int i16 = $11 + 37;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                cArr4[nVar.f2781b] = cArr2[(i3 - nVar.f2781b) - 1];
                Object[] objArr4 = {nVar, nVar};
                Object objC3 = e.c(1507983255);
                if (objC3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = (byte) (b6 + 1);
                    objC3 = e.e((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 19 - (ViewConfiguration.getTapTimeout() >> 16), MotionEvent.axisFromString("") + 281, 1501298158, false, $$e(b6, b7, (byte) (-b7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objC3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public /* synthetic */ void c(au auVar) throws Exception {
        int i2 = 2 % 2;
        if (this.f18118i != auVar.b()) {
            int i3 = f18107n + 35;
            f18109r = i3 % 128;
            int i4 = i3 % 2;
            IncodeWelcome.getInstance().getVideoConferenceQueuePositionChangedBus().onNext(Integer.valueOf(auVar.b()));
            this.f18118i = auVar.b();
        }
        Timber.d("responseGetCustomerQueuePosition: %s", auVar);
        if (auVar.b() != 0) {
            throw new RuntimeException("Queue is invalid");
        }
        int i5 = f18107n + 9;
        f18109r = i5 % 128;
        int i6 = i5 % 2;
    }

    public /* synthetic */ ObservableSource b(au auVar) throws Exception {
        int i2 = 2 % 2;
        int i3 = f18107n + 107;
        f18109r = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            ObservableSource map = this.f18110a.getInterviewerInfo().map(new Function() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$$ExternalSyntheticLambda12
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj2) {
                    return this.f$0.e((at) obj2);
                }
            });
            int i4 = f18109r + 89;
            f18107n = i4 % 128;
            if (i4 % 2 == 0) {
                return map;
            }
            throw null;
        }
        this.f18110a.getInterviewerInfo().map(new Function() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$$ExternalSyntheticLambda12
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj2) {
                return this.f$0.e((at) obj2);
            }
        });
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ VideoConferenceData e(at atVar) throws Exception {
        int i2 = 2 % 2;
        VideoConferenceData videoConferenceData = new VideoConferenceData(atVar.b(), atVar.d(), atVar.a(), atVar.e());
        int i3 = f18109r + 35;
        f18107n = i3 % 128;
        int i4 = i3 % 2;
        return videoConferenceData;
    }

    public static /* synthetic */ void b(VideoConferenceData videoConferenceData) throws Exception {
        int i2 = 2 % 2;
        int i3 = f18109r + 89;
        f18107n = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        VideoConferencePresenter videoConferencePresenter = (VideoConferencePresenter) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i2 = 2 % 2;
        int i3 = f18109r + 41;
        f18107n = i3 % 128;
        int i4 = i3 % 2;
        EventUtils.sendScreenClosed(videoConferencePresenter.f18110a, ScreenName.CONFERENCE_WAIT, Modules.CONFERENCE);
        Timber.e(th, "Couldn't start video conf", new Object[0]);
        videoConferencePresenter.f18111b.onVideoConferenceError(th);
        int i5 = f18109r + 111;
        f18107n = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.Presenter
    public void waitForMyTurn() {
        int i2 = 2 % 2;
        int i3 = f18107n + 77;
        f18109r = i3 % 128;
        int i4 = i3 % 2;
        EventUtils.sendScreenOpened(this.f18110a, ScreenName.CONFERENCE_WAIT, Modules.CONFERENCE);
        this.f18111b.showLoadingSpinner();
        this.f18119j.add(this.f18110a.isManualCorrectionFinished().subscribeOn(Schedulers.io()).repeatWhen(new Function() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$$ExternalSyntheticLambda15
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return VideoConferencePresenter.e((Observable) obj);
            }
        }).takeUntil(new Predicate() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$$ExternalSyntheticLambda17
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return this.f$0.a((aq) obj);
            }
        }).filter(new Predicate() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$$ExternalSyntheticLambda1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return this.f$0.e((aq) obj);
            }
        }).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$$ExternalSyntheticLambda2
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.d((aq) obj);
            }
        }).map(new Function() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$$ExternalSyntheticLambda3
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return VideoConferencePresenter.b((y) obj);
            }
        }).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$$ExternalSyntheticLambda4
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.d((y) obj);
            }
        }).flatMap(new Function() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$$ExternalSyntheticLambda5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.f$0.b((au) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).doOnTerminate(new Action() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$$ExternalSyntheticLambda6
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.f$0.e();
            }
        }).doOnNext(new Consumer() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$$ExternalSyntheticLambda7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.c((VideoConferencePresenter.VideoConferenceData) obj);
            }
        }).subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$$ExternalSyntheticLambda8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                VideoConferencePresenter.b((VideoConferencePresenter.VideoConferenceData) obj);
            }
        }, new Consumer() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$$ExternalSyntheticLambda16
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.f$0.a((Throwable) obj);
            }
        }));
        int i5 = f18107n + 37;
        f18109r = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$2 */
    final class AnonymousClass2 implements Session.SessionListener {

        /* JADX INFO: renamed from: b */
        private static int f18123b = 1;

        /* JADX INFO: renamed from: e */
        private static int f18124e = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Context f18126c;

        AnonymousClass2(Context context) {
            context = context;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$2$5 */
        final class AnonymousClass5 implements PublisherKit.PublisherListener {

            /* JADX INFO: renamed from: d */
            private static int f18127d = 0;

            /* JADX INFO: renamed from: e */
            private static int f18128e = 1;

            AnonymousClass5() {
            }

            public final void onStreamCreated(PublisherKit publisherKit, Stream stream) {
                int i2 = 2 % 2;
                Timber.d("onStreamCreated called", new Object[0]);
                HashMap map = new HashMap();
                map.put(EventValues.SCREEN_NAME.getValue(), VideoConferencePresenter.this.f18110a.getCurrentScreenName().name());
                EventUtils.sendEvent(VideoConferencePresenter.this.f18110a, Event.CONFERENCE_USER_STREAM_SHOWN, Modules.CONFERENCE, (HashMap<String, Object>) map);
                int i3 = f18127d + 27;
                f18128e = i3 % 128;
                int i4 = i3 % 2;
            }

            public final void onStreamDestroyed(PublisherKit publisherKit, Stream stream) {
                int i2 = 2 % 2;
                int i3 = f18127d + 25;
                f18128e = i3 % 128;
                int i4 = i3 % 2;
                Timber.d("onStreamDestroyed called", new Object[0]);
                int i5 = f18127d + 3;
                f18128e = i5 % 128;
                int i6 = i5 % 2;
            }

            public final void onError(PublisherKit publisherKit, OpentokError opentokError) {
                int i2 = 2 % 2;
                Timber.e("onPublisherError called, opentokError: %s", opentokError.getMessage());
                VideoConferencePresenter.this.f18111b.onVideoConferenceEnded(new VideoConferenceResult(ResultCode.ERROR, opentokError.getException()));
                int i3 = f18128e + 125;
                f18127d = i3 % 128;
                if (i3 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public final void onConnected(Session session) {
            int i2 = 2 % 2;
            Timber.d("onConnected called", new Object[0]);
            VideoConferencePresenter.this.f18113d = new Publisher.Builder(context).build();
            VideoConferencePresenter.this.f18112c.publish(VideoConferencePresenter.this.f18113d);
            VideoConferencePresenter.this.f18113d.setPublisherListener(new PublisherKit.PublisherListener() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.2.5

                /* JADX INFO: renamed from: d */
                private static int f18127d = 0;

                /* JADX INFO: renamed from: e */
                private static int f18128e = 1;

                AnonymousClass5() {
                }

                public final void onStreamCreated(PublisherKit publisherKit, Stream stream) {
                    int i22 = 2 % 2;
                    Timber.d("onStreamCreated called", new Object[0]);
                    HashMap map = new HashMap();
                    map.put(EventValues.SCREEN_NAME.getValue(), VideoConferencePresenter.this.f18110a.getCurrentScreenName().name());
                    EventUtils.sendEvent(VideoConferencePresenter.this.f18110a, Event.CONFERENCE_USER_STREAM_SHOWN, Modules.CONFERENCE, (HashMap<String, Object>) map);
                    int i3 = f18127d + 27;
                    f18128e = i3 % 128;
                    int i4 = i3 % 2;
                }

                public final void onStreamDestroyed(PublisherKit publisherKit, Stream stream) {
                    int i22 = 2 % 2;
                    int i3 = f18127d + 25;
                    f18128e = i3 % 128;
                    int i4 = i3 % 2;
                    Timber.d("onStreamDestroyed called", new Object[0]);
                    int i5 = f18127d + 3;
                    f18128e = i5 % 128;
                    int i6 = i5 % 2;
                }

                public final void onError(PublisherKit publisherKit, OpentokError opentokError) {
                    int i22 = 2 % 2;
                    Timber.e("onPublisherError called, opentokError: %s", opentokError.getMessage());
                    VideoConferencePresenter.this.f18111b.onVideoConferenceEnded(new VideoConferenceResult(ResultCode.ERROR, opentokError.getException()));
                    int i3 = f18128e + 125;
                    f18127d = i3 % 128;
                    if (i3 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
            VideoConferencePresenter.this.f18112c.sendSignal("connect", (String) null);
            int i3 = f18123b + 77;
            f18124e = i3 % 128;
            int i4 = i3 % 2;
        }

        public final void onDisconnected(Session session) {
            int i2 = 2 % 2;
            int i3 = f18123b + 39;
            f18124e = i3 % 128;
            int i4 = i3 % 2;
            Timber.d("onDisconnected called", new Object[0]);
            int i5 = f18124e + 23;
            f18123b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 95 / 0;
            }
        }

        public final void onStreamReceived(Session session, Stream stream) {
            int i2 = 2 % 2;
            int i3 = f18124e + 83;
            f18123b = i3 % 128;
            int i4 = i3 % 2;
            Timber.d("onStreamReceived called", new Object[0]);
            VideoConferencePresenter.this.f18115f = true;
            VideoConferencePresenter.this.f18111b.hideLoadingSpinner();
            if (VideoConferencePresenter.this.f18113d != null) {
                View view = VideoConferencePresenter.this.f18113d.getView();
                VideoConferencePresenter.this.f18113d.getRenderer().setStyle("STYLE_VIDEO_SCALE", "STYLE_VIDEO_FILL");
                if (view instanceof GLSurfaceView) {
                    ((GLSurfaceView) view).setZOrderOnTop(true);
                }
                VideoConferencePresenter.this.f18111b.showMyVideo(view);
                int i5 = f18124e + 101;
                f18123b = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 3 % 2;
                }
            }
            if (VideoConferencePresenter.this.f18114e == null) {
                VideoConferencePresenter.this.f18114e = new Subscriber.Builder(context, stream).build();
                View view2 = VideoConferencePresenter.this.f18114e.getView();
                VideoConferencePresenter.this.f18114e.getRenderer().setStyle("STYLE_VIDEO_SCALE", "STYLE_VIDEO_FILL");
                VideoConferencePresenter.this.f18111b.showInterviewerVideo(view2);
                VideoConferencePresenter.this.f18112c.subscribe(VideoConferencePresenter.this.f18114e);
                HashMap map = new HashMap();
                map.put(EventValues.SCREEN_NAME.getValue(), VideoConferencePresenter.this.f18110a.getCurrentScreenName().name());
                EventUtils.sendEvent(VideoConferencePresenter.this.f18110a, Event.CONFERENCE_EXECUTIVE_STREAM_SHOWN, Modules.CONFERENCE, (HashMap<String, Object>) map);
                int i7 = f18124e + 25;
                f18123b = i7 % 128;
                int i8 = i7 % 2;
            }
            VideoConferencePresenter.this.f18111b.onVideoConferenceSet();
            int i9 = f18124e + 113;
            f18123b = i9 % 128;
            int i10 = i9 % 2;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0020 A[PHI: r3
  0x0020: PHI (r3v3 com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract$View) = 
  (r3v0 com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract$View)
  (r3v4 com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract$View)
 binds: [B:27:0x0045, B:20:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0048 A[PHI: r3
  0x0048: PHI (r3v1 com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract$View) = 
  (r3v0 com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract$View)
  (r3v4 com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract$View)
 binds: [B:27:0x0045, B:20:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onStreamDropped(com.opentok.android.Session r7, com.opentok.android.Stream r8) {
            /*
                r6 = this;
                r5 = 2
                int r0 = r5 % r5
                int r0 = com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.AnonymousClass2.f18123b
                int r1 = r0 + 7
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.AnonymousClass2.f18124e = r0
                int r1 = r1 % r5
                r0 = 0
                java.lang.String r4 = "onStreamDropped called, interview ended"
                if (r1 == 0) goto L38
                java.lang.Object[] r0 = new java.lang.Object[r0]
                timber.log.Timber.d(r4, r0)
                com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter r0 = com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.this
                com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract$View r3 = r0.f18111b
                com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter r0 = com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.this
                boolean r0 = r0.f18115f
                if (r0 == 0) goto L48
            L20:
                com.incode.welcome_sdk.results.VideoConferenceResult r2 = new com.incode.welcome_sdk.results.VideoConferenceResult
                com.incode.welcome_sdk.results.ResultCode r0 = com.incode.welcome_sdk.results.ResultCode.SUCCESS
                r2.<init>(r0)
                int r0 = com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.AnonymousClass2.f18124e
                int r1 = r0 + 29
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.AnonymousClass2.f18123b = r0
                int r1 = r1 % r5
                if (r1 != 0) goto L34
                r0 = 5
                int r0 = r0 % r5
            L34:
                r3.onVideoConferenceEnded(r2)
                return
            L38:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                timber.log.Timber.d(r4, r0)
                com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter r0 = com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.this
                com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract$View r3 = r0.f18111b
                com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter r0 = com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.this
                boolean r0 = r0.f18115f
                if (r0 == 0) goto L48
                goto L20
            L48:
                com.incode.welcome_sdk.results.VideoConferenceResult r2 = new com.incode.welcome_sdk.results.VideoConferenceResult
                com.incode.welcome_sdk.results.ResultCode r1 = com.incode.welcome_sdk.results.ResultCode.ERROR
                com.incode.welcome_sdk.commons.exceptions.IncodeGenericError r0 = new com.incode.welcome_sdk.commons.exceptions.IncodeGenericError
                r0.<init>(r4)
                r2.<init>(r1, r0)
                goto L34
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.AnonymousClass2.onStreamDropped(com.opentok.android.Session, com.opentok.android.Stream):void");
        }

        public final void onError(Session session, OpentokError opentokError) {
            int i2 = 2 % 2;
            Timber.e("onError called, opentokError: %s", opentokError.getMessage());
            VideoConferencePresenter.this.f18111b.onVideoConferenceEnded(new VideoConferenceResult(ResultCode.ERROR, opentokError.getException()));
            int i3 = f18124e + 77;
            f18123b = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public /* synthetic */ void d(VideoConferenceChatMessage videoConferenceChatMessage) throws Exception {
        int i2 = 2 % 2;
        int i3 = f18107n + 15;
        f18109r = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[0];
            objArr[0] = videoConferenceChatMessage.toMessage();
            Timber.d("New message published, %s", objArr);
        } else {
            Timber.d("New message published, %s", videoConferenceChatMessage.toMessage());
        }
        this.f18112c.sendSignal(NotificationCompat.CATEGORY_MESSAGE, videoConferenceChatMessage.toMessage());
    }

    public /* synthetic */ void e(Session session, String str, String str2, Connection connection) {
        int i2 = 2 % 2;
        int i3 = f18109r + 111;
        f18107n = i3 % 128;
        if (i3 % 2 != 0) {
            NotificationCompat.CATEGORY_MESSAGE.equalsIgnoreCase(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (NotificationCompat.CATEGORY_MESSAGE.equalsIgnoreCase(str)) {
            Timber.d("New signal %s", str2);
            EventUtils.sendScreenOpened(this.f18110a, ScreenName.CONFERENCE_MESSAGE_CHAT, Modules.CONFERENCE);
            VideoConferenceChatMessage videoConferenceChatMessageFromMessage = VideoConferenceChatMessage.fromMessage(str2);
            if (videoConferenceChatMessageFromMessage != null) {
                int i4 = f18107n + 69;
                f18109r = i4 % 128;
                int i5 = i4 % 2;
                this.f18120k.add(videoConferenceChatMessageFromMessage);
                this.f18121l.onNext(Boolean.TRUE);
                if (VideoConferenceChatMessageAuthor.interviewer.equals(videoConferenceChatMessageFromMessage.f18097b)) {
                    this.f18111b.updateNewChatMessageIndicator();
                }
                EventUtils.sendScreenClosed(this.f18110a, ScreenName.CONFERENCE_MESSAGE_CHAT, Modules.CONFERENCE);
                int i6 = f18109r + 21;
                f18107n = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 4;
                }
            }
        }
        int i8 = f18107n + 115;
        f18109r = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 24 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.Presenter
    public void enterVideoConference(Context context, VideoConferenceData videoConferenceData) {
        int i2 = 2 % 2;
        try {
            Session sessionBuild = new Session.Builder(context, videoConferenceData.f18136e, videoConferenceData.getSessionId()).build();
            this.f18112c = sessionBuild;
            int i3 = f18107n + 9;
            f18109r = i3 % 128;
            int i4 = i3 % 2;
            sessionBuild.setSessionListener(new Session.SessionListener() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.2

                /* JADX INFO: renamed from: b */
                private static int f18123b = 1;

                /* JADX INFO: renamed from: e */
                private static int f18124e = 0;

                /* JADX INFO: renamed from: c */
                private /* synthetic */ Context f18126c;

                AnonymousClass2(Context context2) {
                    context = context2;
                }

                /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$2$5 */
                final class AnonymousClass5 implements PublisherKit.PublisherListener {

                    /* JADX INFO: renamed from: d */
                    private static int f18127d = 0;

                    /* JADX INFO: renamed from: e */
                    private static int f18128e = 1;

                    AnonymousClass5() {
                    }

                    public final void onStreamCreated(PublisherKit publisherKit, Stream stream) {
                        int i22 = 2 % 2;
                        Timber.d("onStreamCreated called", new Object[0]);
                        HashMap map = new HashMap();
                        map.put(EventValues.SCREEN_NAME.getValue(), VideoConferencePresenter.this.f18110a.getCurrentScreenName().name());
                        EventUtils.sendEvent(VideoConferencePresenter.this.f18110a, Event.CONFERENCE_USER_STREAM_SHOWN, Modules.CONFERENCE, (HashMap<String, Object>) map);
                        int i3 = f18127d + 27;
                        f18128e = i3 % 128;
                        int i4 = i3 % 2;
                    }

                    public final void onStreamDestroyed(PublisherKit publisherKit, Stream stream) {
                        int i22 = 2 % 2;
                        int i3 = f18127d + 25;
                        f18128e = i3 % 128;
                        int i4 = i3 % 2;
                        Timber.d("onStreamDestroyed called", new Object[0]);
                        int i5 = f18127d + 3;
                        f18128e = i5 % 128;
                        int i6 = i5 % 2;
                    }

                    public final void onError(PublisherKit publisherKit, OpentokError opentokError) {
                        int i22 = 2 % 2;
                        Timber.e("onPublisherError called, opentokError: %s", opentokError.getMessage());
                        VideoConferencePresenter.this.f18111b.onVideoConferenceEnded(new VideoConferenceResult(ResultCode.ERROR, opentokError.getException()));
                        int i3 = f18128e + 125;
                        f18127d = i3 % 128;
                        if (i3 % 2 == 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }

                public final void onConnected(Session session) {
                    int i22 = 2 % 2;
                    Timber.d("onConnected called", new Object[0]);
                    VideoConferencePresenter.this.f18113d = new Publisher.Builder(context).build();
                    VideoConferencePresenter.this.f18112c.publish(VideoConferencePresenter.this.f18113d);
                    VideoConferencePresenter.this.f18113d.setPublisherListener(new PublisherKit.PublisherListener() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.2.5

                        /* JADX INFO: renamed from: d */
                        private static int f18127d = 0;

                        /* JADX INFO: renamed from: e */
                        private static int f18128e = 1;

                        AnonymousClass5() {
                        }

                        public final void onStreamCreated(PublisherKit publisherKit, Stream stream) {
                            int i222 = 2 % 2;
                            Timber.d("onStreamCreated called", new Object[0]);
                            HashMap map = new HashMap();
                            map.put(EventValues.SCREEN_NAME.getValue(), VideoConferencePresenter.this.f18110a.getCurrentScreenName().name());
                            EventUtils.sendEvent(VideoConferencePresenter.this.f18110a, Event.CONFERENCE_USER_STREAM_SHOWN, Modules.CONFERENCE, (HashMap<String, Object>) map);
                            int i32 = f18127d + 27;
                            f18128e = i32 % 128;
                            int i42 = i32 % 2;
                        }

                        public final void onStreamDestroyed(PublisherKit publisherKit, Stream stream) {
                            int i222 = 2 % 2;
                            int i32 = f18127d + 25;
                            f18128e = i32 % 128;
                            int i42 = i32 % 2;
                            Timber.d("onStreamDestroyed called", new Object[0]);
                            int i5 = f18127d + 3;
                            f18128e = i5 % 128;
                            int i6 = i5 % 2;
                        }

                        public final void onError(PublisherKit publisherKit, OpentokError opentokError) {
                            int i222 = 2 % 2;
                            Timber.e("onPublisherError called, opentokError: %s", opentokError.getMessage());
                            VideoConferencePresenter.this.f18111b.onVideoConferenceEnded(new VideoConferenceResult(ResultCode.ERROR, opentokError.getException()));
                            int i32 = f18128e + 125;
                            f18127d = i32 % 128;
                            if (i32 % 2 == 0) {
                                return;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    });
                    VideoConferencePresenter.this.f18112c.sendSignal("connect", (String) null);
                    int i32 = f18123b + 77;
                    f18124e = i32 % 128;
                    int i42 = i32 % 2;
                }

                public final void onDisconnected(Session session) {
                    int i22 = 2 % 2;
                    int i32 = f18123b + 39;
                    f18124e = i32 % 128;
                    int i42 = i32 % 2;
                    Timber.d("onDisconnected called", new Object[0]);
                    int i5 = f18124e + 23;
                    f18123b = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 95 / 0;
                    }
                }

                public final void onStreamReceived(Session session, Stream stream) {
                    int i22 = 2 % 2;
                    int i32 = f18124e + 83;
                    f18123b = i32 % 128;
                    int i42 = i32 % 2;
                    Timber.d("onStreamReceived called", new Object[0]);
                    VideoConferencePresenter.this.f18115f = true;
                    VideoConferencePresenter.this.f18111b.hideLoadingSpinner();
                    if (VideoConferencePresenter.this.f18113d != null) {
                        View view = VideoConferencePresenter.this.f18113d.getView();
                        VideoConferencePresenter.this.f18113d.getRenderer().setStyle("STYLE_VIDEO_SCALE", "STYLE_VIDEO_FILL");
                        if (view instanceof GLSurfaceView) {
                            ((GLSurfaceView) view).setZOrderOnTop(true);
                        }
                        VideoConferencePresenter.this.f18111b.showMyVideo(view);
                        int i5 = f18124e + 101;
                        f18123b = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 3 % 2;
                        }
                    }
                    if (VideoConferencePresenter.this.f18114e == null) {
                        VideoConferencePresenter.this.f18114e = new Subscriber.Builder(context, stream).build();
                        View view2 = VideoConferencePresenter.this.f18114e.getView();
                        VideoConferencePresenter.this.f18114e.getRenderer().setStyle("STYLE_VIDEO_SCALE", "STYLE_VIDEO_FILL");
                        VideoConferencePresenter.this.f18111b.showInterviewerVideo(view2);
                        VideoConferencePresenter.this.f18112c.subscribe(VideoConferencePresenter.this.f18114e);
                        HashMap map = new HashMap();
                        map.put(EventValues.SCREEN_NAME.getValue(), VideoConferencePresenter.this.f18110a.getCurrentScreenName().name());
                        EventUtils.sendEvent(VideoConferencePresenter.this.f18110a, Event.CONFERENCE_EXECUTIVE_STREAM_SHOWN, Modules.CONFERENCE, (HashMap<String, Object>) map);
                        int i7 = f18124e + 25;
                        f18123b = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    VideoConferencePresenter.this.f18111b.onVideoConferenceSet();
                    int i9 = f18124e + 113;
                    f18123b = i9 % 128;
                    int i10 = i9 % 2;
                }

                public final void onStreamDropped(Session v2, Stream v3) {
                    /*
                        this = this;
                        r5 = 2
                        int r0 = r5 % r5
                        int r0 = com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.AnonymousClass2.f18123b
                        int r1 = r0 + 7
                        int r0 = r1 % 128
                        com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.AnonymousClass2.f18124e = r0
                        int r1 = r1 % r5
                        r0 = 0
                        java.lang.String r4 = "onStreamDropped called, interview ended"
                        if (r1 == 0) goto L38
                        java.lang.Object[] r0 = new java.lang.Object[r0]
                        timber.log.Timber.d(r4, r0)
                        com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter r0 = com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.this
                        com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract$View r3 = r0.f18111b
                        com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter r0 = com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.this
                        boolean r0 = r0.f18115f
                        if (r0 == 0) goto L48
                    L20:
                        com.incode.welcome_sdk.results.VideoConferenceResult r2 = new com.incode.welcome_sdk.results.VideoConferenceResult
                        com.incode.welcome_sdk.results.ResultCode r0 = com.incode.welcome_sdk.results.ResultCode.SUCCESS
                        r2.<init>(r0)
                        int r0 = com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.AnonymousClass2.f18124e
                        int r1 = r0 + 29
                        int r0 = r1 % 128
                        com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.AnonymousClass2.f18123b = r0
                        int r1 = r1 % r5
                        if (r1 != 0) goto L34
                        r0 = 5
                        int r0 = r0 % r5
                    L34:
                        r3.onVideoConferenceEnded(r2)
                        return
                    L38:
                        java.lang.Object[] r0 = new java.lang.Object[r0]
                        timber.log.Timber.d(r4, r0)
                        com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter r0 = com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.this
                        com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract$View r3 = r0.f18111b
                        com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter r0 = com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.this
                        boolean r0 = r0.f18115f
                        if (r0 == 0) goto L48
                        goto L20
                    L48:
                        com.incode.welcome_sdk.results.VideoConferenceResult r2 = new com.incode.welcome_sdk.results.VideoConferenceResult
                        com.incode.welcome_sdk.results.ResultCode r1 = com.incode.welcome_sdk.results.ResultCode.ERROR
                        com.incode.welcome_sdk.commons.exceptions.IncodeGenericError r0 = new com.incode.welcome_sdk.commons.exceptions.IncodeGenericError
                        r0.<init>(r4)
                        r2.<init>(r1, r0)
                        goto L34
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.AnonymousClass2.onStreamDropped(com.opentok.android.Session, com.opentok.android.Stream):void");
                }

                public final void onError(Session session, OpentokError opentokError) {
                    int i22 = 2 % 2;
                    Timber.e("onError called, opentokError: %s", opentokError.getMessage());
                    VideoConferencePresenter.this.f18111b.onVideoConferenceEnded(new VideoConferenceResult(ResultCode.ERROR, opentokError.getException()));
                    int i32 = f18124e + 77;
                    f18123b = i32 % 128;
                    if (i32 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            });
            this.f18119j.add(this.f18122m.subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$$ExternalSyntheticLambda13
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.f$0.d((VideoConferenceChatMessage) obj);
                }
            }));
            this.f18112c.setSignalListener(new Session.SignalListener() { // from class: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter$$ExternalSyntheticLambda14
                public final void onSignalReceived(Session session, String str, String str2, Connection connection) {
                    this.f$0.e(session, str, str2, connection);
                }
            });
            this.f18112c.connect(videoConferenceData.getInterviewId());
        } catch (NoClassDefFoundError unused) {
            MissingVideoStreamingDependencyException missingVideoStreamingDependencyException = new MissingVideoStreamingDependencyException();
            Timber.e(missingVideoStreamingDependencyException);
            throw missingVideoStreamingDependencyException;
        }
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.Presenter
    public void toggleMute(ImageButton imageButton) {
        boolean z2;
        int i2 = 2 % 2;
        Publisher publisher = this.f18113d;
        if (publisher != null) {
            int i3 = f18107n + 99;
            int i4 = i3 % 128;
            f18109r = i4;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z3 = true;
            if (this.f18117h) {
                z2 = false;
            } else {
                int i5 = i4 + 13;
                f18107n = i5 % 128;
                int i6 = i5 % 2;
                z2 = true;
            }
            this.f18117h = z2;
            publisher.setPublishAudio(z2);
            if (this.f18117h) {
                z3 = false;
            } else {
                int i7 = f18109r + 79;
                f18107n = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 5;
                }
            }
            imageButton.setSelected(z3);
        }
    }

    private void a() {
        int i2 = 2 % 2;
        int i3 = f18109r;
        int i4 = i3 + 61;
        f18107n = i4 % 128;
        int i5 = i4 % 2;
        Session session = this.f18112c;
        if (session == null) {
            return;
        }
        int i6 = i3 + 75;
        f18107n = i6 % 128;
        if (i6 % 2 != 0) {
            session.disconnect();
            int i7 = 51 / 0;
        } else {
            session.disconnect();
        }
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.Presenter
    public void hangUp() {
        int i2 = 2 % 2;
        Session session = this.f18112c;
        if (session != null) {
            int i3 = f18109r + 99;
            f18107n = i3 % 128;
            int i4 = i3 % 2;
            session.sendSignal("user-disconnected", (String) null);
            int i5 = f18107n + 107;
            f18109r = i5 % 128;
            int i6 = i5 % 2;
        }
        this.f18111b.onVideoConferenceEnded(new VideoConferenceResult(ResultCode.USER_CANCELLED));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0016  */
    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.Presenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.f18109r
            int r1 = r0 + 113
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.f18107n = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L2e
            com.opentok.android.Session r1 = r3.f18112c
            r0 = 96
            int r0 = r0 / 0
            if (r1 == 0) goto L1b
        L16:
            com.opentok.android.Session r0 = r3.f18112c
            r0.onResume()
        L1b:
            com.opentok.android.Publisher r1 = r3.f18113d
            if (r1 == 0) goto L2d
            boolean r0 = r3.f18117h
            r1.setPublishAudio(r0)
            int r0 = com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.f18107n
            int r1 = r0 + 87
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.f18109r = r0
            int r1 = r1 % r2
        L2d:
            return
        L2e:
            com.opentok.android.Session r0 = r3.f18112c
            if (r0 == 0) goto L1b
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.video_conference.VideoConferencePresenter.onResume():void");
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.Presenter
    public void onPause() {
        int i2 = 2 % 2;
        int i3 = f18107n + 63;
        f18109r = i3 % 128;
        int i4 = i3 % 2;
        Session session = this.f18112c;
        if (session != null) {
            session.onPause();
        }
        Publisher publisher = this.f18113d;
        if (publisher != null) {
            int i5 = f18107n + 9;
            f18109r = i5 % 128;
            int i6 = i5 % 2;
            publisher.setPublishAudio(false);
        }
        int i7 = f18109r + 7;
        f18107n = i7 % 128;
        int i8 = i7 % 2;
    }

    public class VideoConferenceData {

        /* JADX INFO: renamed from: a */
        public static int f18130a = 0;

        /* JADX INFO: renamed from: b */
        public static int f18131b = 0;

        /* JADX INFO: renamed from: h */
        private static int f18132h = 1;

        /* JADX INFO: renamed from: j */
        private static int f18133j = 0;

        /* JADX INFO: renamed from: c */
        private String f18134c;

        /* JADX INFO: renamed from: d */
        private String f18135d;

        /* JADX INFO: renamed from: e */
        String f18136e;

        /* JADX INFO: renamed from: i */
        private String f18138i;

        public VideoConferenceData(String str, String str2, String str3, String str4) {
            this.f18135d = str;
            this.f18134c = str2;
            this.f18138i = str3;
            this.f18136e = str4;
        }

        public String getSessionId() {
            int i2 = 2 % 2;
            int i3 = f18133j;
            int i4 = i3 + 39;
            f18132h = i4 % 128;
            int i5 = i4 % 2;
            String str = this.f18135d;
            int i6 = i3 + 105;
            f18132h = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public void setSessionId(String str) {
            int i2 = 2 % 2;
            int i3 = f18132h + 77;
            int i4 = i3 % 128;
            f18133j = i4;
            if (i3 % 2 == 0) {
                this.f18135d = str;
                int i5 = i4 + 89;
                f18132h = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            this.f18135d = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String getInterviewId() {
            int i2 = 2 % 2;
            int i3 = f18133j;
            int i4 = i3 + 1;
            f18132h = i4 % 128;
            int i5 = i4 % 2;
            String str = this.f18134c;
            int i6 = i3 + 37;
            f18132h = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public void setInterviewId(String str) {
            int i2 = 2 % 2;
            int i3 = f18133j;
            int i4 = i3 + 7;
            f18132h = i4 % 128;
            int i5 = i4 % 2;
            this.f18134c = str;
            int i6 = i3 + 47;
            f18132h = i6 % 128;
            int i7 = i6 % 2;
        }

        public String getInterviewerName() {
            int i2 = 2 % 2;
            int i3 = f18133j + 95;
            f18132h = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f18138i;
            }
            throw null;
        }

        public void setInterviewerName(String str) {
            int i2 = 2 % 2;
            int i3 = f18132h + 5;
            int i4 = i3 % 128;
            f18133j = i4;
            int i5 = i3 % 2;
            this.f18138i = str;
            int i6 = i4 + 53;
            f18132h = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String getOpenTokApiKey() {
            int i2 = 2 % 2;
            int i3 = f18132h;
            int i4 = i3 + 47;
            f18133j = i4 % 128;
            int i5 = i4 % 2;
            String str = this.f18136e;
            int i6 = i3 + 103;
            f18133j = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public static int e() {
            int i2 = f18130a;
            int i3 = i2 % 6843870;
            f18130a = i2 + 1;
            if (i3 != 0) {
                return f18131b;
            }
            int iNextInt = new Random().nextInt(1346660186);
            f18131b = iNextInt;
            return iNextInt;
        }
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.Presenter
    public void onDestroy() {
        int i2 = 2 % 2;
        int i3 = f18109r + 103;
        f18107n = i3 % 128;
        int i4 = i3 % 2;
        this.f18119j.clear();
        a();
        int i5 = f18107n + 83;
        f18109r = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.Presenter
    public PublishSubject<VideoConferenceChatMessage> getUserChatPublishSubject() {
        PublishSubject<VideoConferenceChatMessage> publishSubject;
        int i2 = 2 % 2;
        int i3 = f18107n;
        int i4 = i3 + 39;
        f18109r = i4 % 128;
        if (i4 % 2 == 0) {
            publishSubject = this.f18122m;
            int i5 = 23 / 0;
        } else {
            publishSubject = this.f18122m;
        }
        int i6 = i3 + 81;
        f18109r = i6 % 128;
        if (i6 % 2 != 0) {
            return publishSubject;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.Presenter
    public PublishSubject<Boolean> getNewChatMessagePublishSubject() {
        int i2 = 2 % 2;
        int i3 = f18109r;
        int i4 = i3 + 107;
        f18107n = i4 % 128;
        int i5 = i4 % 2;
        PublishSubject<Boolean> publishSubject = this.f18121l;
        int i6 = i3 + 97;
        f18107n = i6 % 128;
        int i7 = i6 % 2;
        return publishSubject;
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.Presenter
    public List<VideoConferenceChatMessage> getChatMessages() {
        int i2 = 2 % 2;
        int i3 = f18109r + 31;
        int i4 = i3 % 128;
        f18107n = i4;
        int i5 = i3 % 2;
        List<VideoConferenceChatMessage> list = this.f18120k;
        int i6 = i4 + 25;
        f18109r = i6 % 128;
        if (i6 % 2 != 0) {
            return list;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.Presenter
    public File getSelfieFile() throws Throwable {
        File imagesDirectory;
        Object obj;
        int i2 = 2 % 2;
        int i3 = f18107n + 13;
        f18109r = i3 % 128;
        if (i3 % 2 == 0) {
            imagesDirectory = this.f18110a.getImagesDirectory();
            Object[] objArr = new Object[1];
            p("\u0000�\u0003￼\n￼", 3 >>> (Process.myTid() + 1), 126 / (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)), false, 12762 >> Color.blue(1), objArr);
            obj = objArr[0];
        } else {
            imagesDirectory = this.f18110a.getImagesDirectory();
            Object[] objArr2 = new Object[1];
            p("\u0000�\u0003￼\n￼", (Process.myTid() >> 22) + 5, 7 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), true, Color.blue(0) + 277, objArr2);
            obj = objArr2[0];
        }
        return l.b(imagesDirectory, ((String) obj).intern());
    }

    @Override // com.incode.welcome_sdk.ui.video_conference.VideoConferenceContract.Presenter
    public void publishResult(VideoConferenceResult videoConferenceResult) {
        int i2 = 2 % 2;
        int i3 = f18107n + 115;
        f18109r = i3 % 128;
        if (i3 % 2 == 0) {
            publishResult(IncodeWelcome.getInstance().getVideoConferenceBus(), videoConferenceResult);
            int i4 = 17 / 0;
        } else {
            publishResult(IncodeWelcome.getInstance().getVideoConferenceBus(), videoConferenceResult);
        }
        int i5 = f18109r + 115;
        f18107n = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f18107n = 0;
        f18109r = 1;
        f18108o = 1994499088;
    }

    public /* synthetic */ void e() throws Exception {
        b(1029495823, new Object[]{this}, DaggerVideoSelfieComponent.b.b(), -1029495822, DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b());
    }

    public /* synthetic */ void c(VideoConferenceData videoConferenceData) throws Exception {
        b(-546806802, new Object[]{this, videoConferenceData}, DaggerVideoSelfieComponent.b.b(), 546806804, DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b());
    }

    public /* synthetic */ void a(Throwable th) throws Exception {
        b(1124991697, new Object[]{this, th}, DaggerVideoSelfieComponent.b.b(), -1124991697, DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b());
    }
}
