package com.incode.welcome_sdk.ui.camera.videostreaming;

import com.incode.welcome_sdk.c.b.d;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.b;
import com.opentok.android.OpentokError;
import com.opentok.android.Session;
import com.opentok.android.Stream;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class OpenTokEventListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f12721b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f12722d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f12723f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f12724g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<d> f12725a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IncodeWelcomeRepository f12726c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f12727e;

    public OpenTokEventListener(b bVar, IncodeWelcomeRepository incodeWelcomeRepository) {
        Intrinsics.checkNotNullParameter(bVar, "");
        Intrinsics.checkNotNullParameter(incodeWelcomeRepository, "");
        this.f12727e = bVar;
        this.f12726c = incodeWelcomeRepository;
        this.f12725a = new ArrayList();
    }

    public final b getModule() {
        int i2 = 2 % 2;
        int i3 = f12723f;
        int i4 = i3 + 115;
        f12724g = i4 % 128;
        int i5 = i4 % 2;
        b bVar = this.f12727e;
        int i6 = i3 + 77;
        f12724g = i6 % 128;
        if (i6 % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    public final IncodeWelcomeRepository getRepository() {
        IncodeWelcomeRepository incodeWelcomeRepository;
        int i2 = 2 % 2;
        int i3 = f12724g + 43;
        int i4 = i3 % 128;
        f12723f = i4;
        if (i3 % 2 != 0) {
            incodeWelcomeRepository = this.f12726c;
            int i5 = 93 / 0;
        } else {
            incodeWelcomeRepository = this.f12726c;
        }
        int i6 = i4 + 103;
        f12724g = i6 % 128;
        int i7 = i6 % 2;
        return incodeWelcomeRepository;
    }

    public final boolean strSessionDidConnect(Session session) {
        List<d> list = this.f12725a;
        String value = Event.STR_SESSION_DID_CONNECT.getValue();
        String strName = this.f12727e.name();
        String sessionId = session != null ? session.getSessionId() : null;
        if (sessionId == null) {
            sessionId = "null";
        }
        return list.add(new d(value, strName, null, MapsKt.mapOf(TuplesKt.to("sessionId", sessionId)), null, 20));
    }

    public final boolean strSessionDidDisconnect(Session session) {
        List<d> list = this.f12725a;
        String value = Event.STR_SESSION_DID_DISCONNECT.getValue();
        String strName = this.f12727e.name();
        String sessionId = session != null ? session.getSessionId() : null;
        if (sessionId == null) {
            sessionId = "null";
        }
        return list.add(new d(value, strName, null, MapsKt.mapOf(TuplesKt.to("sessionId", sessionId)), null, 20));
    }

    public final boolean strSessionDidFailWithError(Session session, OpentokError opentokError) {
        Intrinsics.checkNotNullParameter(opentokError, "");
        List<d> list = this.f12725a;
        String value = Event.STR_SESSION_DID_FAIL_WITH_ERROR.getValue();
        String strName = this.f12727e.name();
        Pair[] pairArr = new Pair[3];
        String sessionId = session != null ? session.getSessionId() : null;
        if (sessionId == null) {
            sessionId = "null";
        }
        pairArr[0] = TuplesKt.to("sessionId", sessionId);
        pairArr[1] = TuplesKt.to("errorCode", opentokError.getErrorCode());
        pairArr[2] = TuplesKt.to("errorMessage", opentokError.getMessage());
        return list.add(new d(value, strName, null, MapsKt.mapOf(pairArr), null, 20));
    }

    public final boolean strStreamPublisherCreated(Session session, Stream stream) {
        List<d> list = this.f12725a;
        String value = Event.STR_STREAM_PUBLISHER_CREATED.getValue();
        String strName = this.f12727e.name();
        Pair[] pairArr = new Pair[2];
        String sessionId = session != null ? session.getSessionId() : null;
        if (sessionId == null) {
            sessionId = "null";
        }
        pairArr[0] = TuplesKt.to("sessionId", sessionId);
        String streamId = stream != null ? stream.getStreamId() : null;
        pairArr[1] = TuplesKt.to("streamId", streamId != null ? streamId : "null");
        return list.add(new d(value, strName, null, MapsKt.mapOf(pairArr), null, 20));
    }

    public final boolean strStreamPublisherDestroyed(Stream stream) {
        List<d> list = this.f12725a;
        String value = Event.STR_STREAM_PUBLISHER_DESTROYED.getValue();
        String strName = this.f12727e.name();
        String streamId = stream != null ? stream.getStreamId() : null;
        if (streamId == null) {
            streamId = "null";
        }
        return list.add(new d(value, strName, null, MapsKt.mapOf(TuplesKt.to("streamId", streamId)), null, 20));
    }

    public final boolean strStreamPublisherDidFailWithError(Session session, Stream stream, OpentokError opentokError) {
        Intrinsics.checkNotNullParameter(opentokError, "");
        List<d> list = this.f12725a;
        String value = Event.STR_STREAM_PUBLISHER_DID_FAIL_WITH_ERROR.getValue();
        String strName = this.f12727e.name();
        Pair[] pairArr = new Pair[4];
        String sessionId = session != null ? session.getSessionId() : null;
        if (sessionId == null) {
            sessionId = "null";
        }
        pairArr[0] = TuplesKt.to("sessionId", sessionId);
        String streamId = stream != null ? stream.getStreamId() : null;
        pairArr[1] = TuplesKt.to("streamId", streamId != null ? streamId : "null");
        pairArr[2] = TuplesKt.to("errorCode", opentokError.getErrorCode());
        pairArr[3] = TuplesKt.to("errorMessage", opentokError.getMessage());
        return list.add(new d(value, strName, null, MapsKt.mapOf(pairArr), null, 20));
    }

    public final void sendEvents() {
        int i2 = 2 % 2;
        int i3 = f12723f + 19;
        f12724g = i3 % 128;
        if (i3 % 2 == 0) {
            EventUtils.INSTANCE.sendEvents(this.f12726c, CollectionsKt.toList(this.f12725a));
            this.f12725a.clear();
            int i4 = 85 / 0;
        } else {
            EventUtils.INSTANCE.sendEvents(this.f12726c, CollectionsKt.toList(this.f12725a));
            this.f12725a.clear();
        }
    }

    public static int b() {
        int i2 = f12722d;
        int i3 = i2 % 5870840;
        f12722d = i2 + 1;
        if (i3 != 0) {
            return f12721b;
        }
        int i4 = (int) Runtime.getRuntime().totalMemory();
        f12721b = i4;
        return i4;
    }
}
