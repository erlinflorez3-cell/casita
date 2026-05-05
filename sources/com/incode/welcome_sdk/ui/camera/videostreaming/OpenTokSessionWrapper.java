package com.incode.welcome_sdk.ui.camera.videostreaming;

import com.incode.welcome_sdk.data.b;
import com.opentok.android.OpentokError;
import com.opentok.android.Session;
import com.opentok.android.Stream;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.subjects.BehaviorSubject;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class OpenTokSessionWrapper implements Session.ReconnectionListener, Session.SessionListener {

    /* JADX INFO: renamed from: f */
    private static int f12728f = 0;

    /* JADX INFO: renamed from: j */
    private static int f12729j = 1;

    /* JADX INFO: renamed from: a */
    private final b f12730a;

    /* JADX INFO: renamed from: b */
    private PublisherWrapper f12731b;

    /* JADX INFO: renamed from: c */
    private Session f12732c;

    /* JADX INFO: renamed from: d */
    private String f12733d;

    /* JADX INFO: renamed from: e */
    private final OpenTokEventListener f12734e;

    /* JADX INFO: renamed from: g */
    private boolean f12735g;

    /* JADX INFO: renamed from: h */
    private boolean f12736h;

    /* JADX INFO: renamed from: i */
    private BehaviorSubject<Unit> f12737i;

    public OpenTokSessionWrapper(b bVar, OpenTokEventListener openTokEventListener) {
        Intrinsics.checkNotNullParameter(bVar, "");
        Intrinsics.checkNotNullParameter(openTokEventListener, "");
        this.f12730a = bVar;
        this.f12734e = openTokEventListener;
        this.f12733d = "";
        BehaviorSubject<Unit> behaviorSubjectCreate = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreate, "");
        this.f12737i = behaviorSubjectCreate;
    }

    public final b getModule() {
        int i2 = 2 % 2;
        int i3 = f12729j + 11;
        int i4 = i3 % 128;
        f12728f = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        b bVar = this.f12730a;
        int i5 = i4 + 121;
        f12729j = i5 % 128;
        int i6 = i5 % 2;
        return bVar;
    }

    public final OpenTokEventListener getOpenTokEventListener() {
        int i2 = 2 % 2;
        int i3 = f12728f + 91;
        int i4 = i3 % 128;
        f12729j = i4;
        int i5 = i3 % 2;
        OpenTokEventListener openTokEventListener = this.f12734e;
        int i6 = i4 + 69;
        f12728f = i6 % 128;
        int i7 = i6 % 2;
        return openTokEventListener;
    }

    public final Session getSession() {
        int i2 = 2 % 2;
        int i3 = f12729j + 45;
        int i4 = i3 % 128;
        f12728f = i4;
        int i5 = i3 % 2;
        Session session = this.f12732c;
        int i6 = i4 + 9;
        f12729j = i6 % 128;
        int i7 = i6 % 2;
        return session;
    }

    public final PublisherWrapper getPublisherWrapper() {
        int i2 = 2 % 2;
        int i3 = f12728f;
        int i4 = i3 + 13;
        f12729j = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            throw null;
        }
        PublisherWrapper publisherWrapper = this.f12731b;
        int i5 = i3 + 61;
        f12729j = i5 % 128;
        if (i5 % 2 != 0) {
            return publisherWrapper;
        }
        obj.hashCode();
        throw null;
    }

    public final String getVideoRecordingId() {
        int i2 = 2 % 2;
        int i3 = f12729j + 9;
        int i4 = i3 % 128;
        f12728f = i4;
        int i5 = i3 % 2;
        String str = this.f12733d;
        int i6 = i4 + 109;
        f12729j = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isConnected() {
        int i2 = 2 % 2;
        int i3 = f12728f + 69;
        int i4 = i3 % 128;
        f12729j = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f12736h;
        int i6 = i4 + 33;
        f12728f = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final Completable getSessionConnectedCompletable() {
        int i2 = 2 % 2;
        int i3 = f12728f + 27;
        f12729j = i3 % 128;
        int i4 = i3 % 2;
        Completable completableIgnoreElements = this.f12737i.hide().ignoreElements();
        Intrinsics.checkNotNullExpressionValue(completableIgnoreElements, "");
        int i5 = f12729j + 85;
        f12728f = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
        return completableIgnoreElements;
    }

    public final void bind(Session session, String str) {
        int i2 = 2 % 2;
        int i3 = f12728f + 69;
        f12729j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(session, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.f12732c = session;
        this.f12733d = str;
        session.setSessionListener(this);
        int i5 = f12728f + 27;
        f12729j = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 93 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0030, code lost:
    
        if (r7.f12735g == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0032, code lost:
    
        r2 = r7.f12731b;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0035, code lost:
    
        if (r2 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0037, code lost:
    
        r1 = r3 + 83;
        com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.f12728f = r1 % 128;
        r1 = r1 % 2;
        r1 = r2.getPublisher();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0042, code lost:
    
        r0 = r7.f12732c;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
        r0.unpublish((com.opentok.android.PublisherKit) r1);
        r3 = timber.log.Timber.Forest;
        r0 = r7.f12732c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0050, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0052, code lost:
    
        r5 = r0.getSessionId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0056, code lost:
    
        r3.d("Disconnect session called " + r5 + ", for module: " + r7.f12730a, new java.lang.Object[0]);
        r0 = r7.f12732c;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r0);
        r0.disconnect();
        r7.f12735g = true;
        r1 = com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.f12728f + 109;
        com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.f12729j = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        r1 = com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.f12728f + 71;
        com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.f12729j = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        if (r7.f12735g == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void disconnect() {
        /*
            r7 = this;
            r6 = 2
            int r0 = r6 % r6
            timber.log.Timber$Forest r3 = timber.log.Timber.Forest
            com.incode.welcome_sdk.data.b r2 = r7.f12730a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Trying to disconnect session for module: "
            r1.<init>(r0)
            java.lang.StringBuilder r0 = r1.append(r2)
            java.lang.String r1 = r0.toString()
            r4 = 0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r3.d(r1, r0)
            com.opentok.android.Session r0 = r7.f12732c
            if (r0 == 0) goto L9c
            int r3 = com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.f12729j
            int r1 = r3 + 37
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.f12728f = r0
            int r1 = r1 % r6
            if (r1 == 0) goto L97
            boolean r1 = r7.f12735g
            r0 = 94
            int r0 = r0 / r4
            if (r1 != 0) goto L9c
        L32:
            com.incode.welcome_sdk.ui.camera.videostreaming.PublisherWrapper r2 = r7.f12731b
            r5 = 0
            if (r2 == 0) goto L95
            int r1 = r3 + 83
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.f12728f = r0
            int r1 = r1 % r6
            com.opentok.android.Publisher r1 = r2.getPublisher()
        L42:
            com.opentok.android.Session r0 = r7.f12732c
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            com.opentok.android.PublisherKit r1 = (com.opentok.android.PublisherKit) r1
            r0.unpublish(r1)
            timber.log.Timber$Forest r3 = timber.log.Timber.Forest
            com.opentok.android.Session r0 = r7.f12732c
            if (r0 == 0) goto L8b
            java.lang.String r5 = r0.getSessionId()
        L56:
            com.incode.welcome_sdk.data.b r2 = r7.f12730a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Disconnect session called "
            r1.<init>(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r0 = ", for module: "
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r3.d(r1, r0)
            com.opentok.android.Session r0 = r7.f12732c
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r0.disconnect()
            r0 = 1
            r7.f12735g = r0
            int r0 = com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.f12728f
            int r1 = r0 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.f12729j = r0
            int r1 = r1 % r6
            return
        L8b:
            int r0 = com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.f12728f
            int r1 = r0 + 71
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.f12729j = r0
            int r1 = r1 % r6
            goto L56
        L95:
            r1 = r5
            goto L42
        L97:
            boolean r0 = r7.f12735g
            if (r0 != 0) goto L9c
            goto L32
        L9c:
            io.reactivex.subjects.BehaviorSubject<kotlin.Unit> r0 = r7.f12737i
            r0.onComplete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.disconnect():void");
    }

    public static final CompletableSource d(OpenTokSessionWrapper openTokSessionWrapper) {
        Completable stopStreamApiCalledCompletable;
        int i2 = 2 % 2;
        int i3 = f12729j + 5;
        f12728f = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(openTokSessionWrapper, "");
            PublisherWrapper publisherWrapper = openTokSessionWrapper.f12731b;
            throw null;
        }
        Intrinsics.checkNotNullParameter(openTokSessionWrapper, "");
        PublisherWrapper publisherWrapper2 = openTokSessionWrapper.f12731b;
        if (publisherWrapper2 == null || (stopStreamApiCalledCompletable = publisherWrapper2.getStopStreamApiCalledCompletable()) == null) {
            return Completable.complete();
        }
        int i4 = f12729j + 103;
        int i5 = i4 % 128;
        f12728f = i5;
        int i6 = i4 % 2;
        Completable completable = stopStreamApiCalledCompletable;
        int i7 = i5 + 3;
        f12729j = i7 % 128;
        int i8 = i7 % 2;
        return completable;
    }

    public final Completable awaitStreamSuccessfullyClosedEvent() {
        int i2 = 2 % 2;
        int i3 = f12729j + 115;
        f12728f = i3 % 128;
        if (i3 % 2 != 0) {
            Completable completableDefer = Completable.defer(new Callable() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return OpenTokSessionWrapper.d(this.f$0);
                }
            });
            Intrinsics.checkNotNullExpressionValue(completableDefer, "");
            int i4 = 55 / 0;
            return completableDefer;
        }
        Completable completableDefer2 = Completable.defer(new Callable() { // from class: com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return OpenTokSessionWrapper.d(this.f$0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDefer2, "");
        return completableDefer2;
    }

    public final void onConnected(Session session) {
        int i2 = 2 % 2;
        int i3 = f12728f + 7;
        f12729j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(session, "");
        this.f12736h = true;
        Timber.Forest.d("Connected to session " + session.getSessionId(), new Object[0]);
        this.f12734e.strSessionDidConnect(session);
        this.f12737i.onNext(Unit.INSTANCE);
        this.f12737i.onComplete();
        int i5 = f12729j + 111;
        f12728f = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onDisconnected(Session session) {
        int i2 = 2 % 2;
        int i3 = f12729j + 53;
        f12728f = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(session, "");
        Timber.Forest.d("Disconnected from session " + session.getSessionId(), new Object[0]);
        this.f12734e.strSessionDidDisconnect(session);
        d();
        int i5 = f12728f + 45;
        f12729j = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void onReconnecting(Session session) {
        int i2 = 2 % 2;
        int i3 = f12728f + 27;
        f12729j = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onReconnected(Session session) {
        int i2 = 2 % 2;
        int i3 = f12729j + 15;
        f12728f = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onError(Session session, OpentokError opentokError) {
        int i2 = 2 % 2;
        int i3 = f12728f + 115;
        f12729j = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(session, "");
        Intrinsics.checkNotNullParameter(opentokError, "");
        Timber.Forest.e("Error called from OpenTok with error code " + opentokError.getErrorCode(), new Object[0]);
        this.f12734e.strSessionDidFailWithError(session, opentokError);
        d();
        int i5 = f12729j + 15;
        f12728f = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final void onStreamReceived(Session session, Stream stream) {
        int i2 = 2 % 2;
        int i3 = f12728f + 101;
        f12729j = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(session, "");
            Intrinsics.checkNotNullParameter(stream, "");
            Timber.Forest.d("New stream " + stream.getStreamId() + " in session " + session.getSessionId(), new Object[0]);
        } else {
            Intrinsics.checkNotNullParameter(session, "");
            Intrinsics.checkNotNullParameter(stream, "");
            Timber.Forest.d("New stream " + stream.getStreamId() + " in session " + session.getSessionId(), new Object[0]);
        }
        int i4 = f12728f + 99;
        f12729j = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onStreamDropped(Session session, Stream stream) {
        int i2 = 2 % 2;
        int i3 = f12729j + 5;
        f12728f = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(session, "");
        Intrinsics.checkNotNullParameter(stream, "");
        Timber.Forest.d("Stream " + stream.getStreamId() + " dropped from session " + session.getSessionId(), new Object[0]);
        int i5 = f12728f + 41;
        f12729j = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void publishToStream(PublisherWrapper publisherWrapper) {
        int i2 = 2 % 2;
        int i3 = f12728f + 115;
        f12729j = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(publisherWrapper, "");
            this.f12731b = publisherWrapper;
            throw null;
        }
        Intrinsics.checkNotNullParameter(publisherWrapper, "");
        this.f12731b = publisherWrapper;
        Session session = this.f12732c;
        if (session != null) {
            int i4 = f12728f + 17;
            f12729j = i4 % 128;
            int i5 = i4 % 2;
            session.publish(publisherWrapper.getPublisher());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0016 A[PHI: r0
  0x0016: PHI (r0v12 com.opentok.android.Session) = (r0v3 com.opentok.android.Session), (r0v13 com.opentok.android.Session) binds: [B:31:0x0048, B:22:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d() {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.f12728f
            int r3 = r0 + 123
            int r0 = r3 % 128
            com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.f12729j = r0
            int r3 = r3 % r4
            r2 = 0
            r1 = 0
            if (r3 != 0) goto L44
            r5.f12736h = r1
            com.opentok.android.Session r0 = r5.f12732c
            if (r0 == 0) goto L19
        L16:
            r0.setSessionListener(r2)
        L19:
            r5.f12732c = r2
            r5.f12735g = r1
            io.reactivex.subjects.BehaviorSubject<kotlin.Unit> r0 = r5.f12737i
            boolean r0 = r0.hasComplete()
            if (r0 != 0) goto L33
            int r0 = com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.f12728f
            int r1 = r0 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.f12729j = r0
            int r1 = r1 % r4
            io.reactivex.subjects.BehaviorSubject<kotlin.Unit> r0 = r5.f12737i
            r0.onComplete()
        L33:
            com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokEventListener r0 = r5.f12734e
            r0.sendEvents()
            int r0 = com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.f12729j
            int r1 = r0 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.f12728f = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L4b
            return
        L44:
            r5.f12736h = r1
            com.opentok.android.Session r0 = r5.f12732c
            if (r0 == 0) goto L19
            goto L16
        L4b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.videostreaming.OpenTokSessionWrapper.d():void");
    }
}
