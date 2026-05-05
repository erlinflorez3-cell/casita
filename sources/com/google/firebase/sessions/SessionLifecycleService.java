package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nʑA0ZeP.XS2\u000f\u0002{<řc$\bCC٥\"}0\tWNmitϺpŏa 6\u0016'idIf\u000b\u001e\u0015Ƥ6B}?{]}FQb\u000b53(b&F\u0004\u001d\u0001H5\u000f\u0010?\rQW$\u0014F?\u001fG\u0003\u0013[\u000f2\u0014\u001c=N\fdp0TDV\u0005]h>i\u00172H\\7w0+\\SZ%9\u001bwy\u001eYB\u000eߏ\u0017ȏW\t\u000fѸsA\tB\u007fAUv5,CK\nVd^Vϯ!ۣS\reövj\u0013Xx\u000e=*}k\"ַ\u001a߭{z\u0004Ȟʆ\b!"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u0015QD;iH\u001c\u001chO9\u0014t0Lv|", "\u001a`]1e6BRbz\u0006iuj\t<v\u0004&{\u0016", "u(E", "6`]1_,KB\u001c\fzZ+", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5jC\u000e\u0017\u0013FE", "5dc\u0015T5=Z\u0019\fia9|\u0005.$}2\u0004:\u0003!!Iv\u000e6w)BYz\u001cEm\u0010/QP;h0,\u0015bo9\u0015q0X\u007f5", "u(;.a+K]\u001d}Dh:Fk+n~/{Mo\u001a$Gk\r\u0012", ";db@T.>6\u0015\bye,\n", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u0015QD;iH\u001c\u001chO9\u0014t0Lve/L\\:XTr \u0010\u001bY\u0015N8b", ";db@X5@S&", "\u001a`]1e6BRb\t\t(\u0014|\u0017=e\t*{MV", "5dc\u0010_0>\\(\\ve3y\u0005-k", "7mc2a;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "=m16a+", "\u001a`]1e6BRb\t\t(\u0010Y\r8d\u007f5Q", "=m2?X(MS", "", "=m32f;K]-", "\u0011n\\=T5B]\"", "\u001bdb@T.>6\u0015\bye,\n", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SessionLifecycleService extends Service {
    public static final int BACKGROUNDED = 2;
    private static final int CLIENT_BOUND = 4;
    public static final String CLIENT_CALLBACK_MESSENGER = "ClientCallbackMessenger";
    public static final Companion Companion = new Companion(null);
    public static final int FOREGROUNDED = 1;
    public static final int SESSION_UPDATED = 3;
    public static final String SESSION_UPDATE_EXTRA = "SessionUpdateExtra";
    public static final String TAG = "SessionLifecycleService";
    private final HandlerThread handlerThread = new HandlerThread("FirebaseSessions_HandlerThread");
    private MessageHandler messageHandler;
    private Messenger messenger;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"4\u0012\u0006\u0013nj?3J͝IDɟ\u0004*=j<9*[ҸuCIUj\n0\ngN\u0016iEЁ-ŲG\u000f\u000eǝIv:Lmx\f\u0014e˳\u0015ņC3Uڎ\u000eEnxN\u0005N7x؇Lڱ\u0005\u001a2Ϻ`\u0003\tIc\f@2\u0017\u0088\rň\u0011M\r܅b\u0012L'\u0019\u001e\u000bi%ȫ\u001bǰa:7݊SuPV?_^\u0002$μ\u0019ù+\r~ѭn7N@M\u0015SXYޞ%ÜC\u0003Gмݞ\tr"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u0015QD;iH\u001c\u001chO9\u0014t0Lve%VV7X[vG\u001dg", "", "u(E", "\u0010@2\u0018:\u0019(C\u0002]Z=", "", "\u0011K8\u0012A\u001b80\u0003nc=", "\u0011K8\u0012A\u001b81tea;\bZn)M_\u0016i ixv4", "", "\u0014NA\u0012:\u0019(C\u0002]Z=", "!DB <\u0016'M\tiY:\u001b\\g", "!DB <\u0016'M\tiY:\u001b\\\u0003\u000fXn\u0015W", "\"@6", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007|jA0ZeP\u008cZS8\u0018sڔ<$i+yّCU(}*\tUNog\u0005Jb\u000bI\u0017\u000e\u0016\u0007v4կ[ތs܈?2pn\u007f>]sK9xtd\u0006ڶ6\"F{M\u0007(5`\u0010%\u0007\nKT >M\t:\u0001\u0019}\t( \u001e>N\u0010d\\0\\DX\u0005]h;S\u0007wPf'\u000e?CMUTb8%v\u0010*[DEC-%\u0002\u0012MR$M\u0011Q\n=3tW+9W\fWdgF(]9] urTd5Un ?+}m\u0012PV6\u0006\u0010\u0014\rj\u0010>\n5^F-HkN\u000e{z\u0001jXP0j\t\u007fCwD/=\u007fa7i\u001ftgy;GSg\u007f\u0013&6#/\tg[%*n\u00183d\bSAQnBvRr_Mo\u0014p\u0011\u0007\t\n\u0007ϝ\u0002\u009e\u007f\u00116ϏuCi@;!\u001a\n\u001fֶsЛ\t`pׅ:^VI:nDA\u0001¡\u0018ʑHd\rߘÕXs"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u0015QD;iH\u001c\u001chO9\u0014t0Lve/L\\:XTr \u0010\u001bY\u0015N8b", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", ":n^=X9", "\u001a`]1e6BRb\t\t(\u0013\u0007\u0013:e\r}", "uKP;W9HW\u0018H\u0005luc\u00139p\u007f5Q\u0004q", "0nd;W\nEW\u0019\b\nl", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001a`]1e6BRb\t\t(\u0014|\u0017=e\t*{MV", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "6`b\u0013b9>U&\t\u000bg+|\b", "", ":`bA@:@B\u001d\u0007zF:", "", "0q^.W*:a(lzl:\u0001\u00138", "", "6`]1_,\u001bO\u0017\u0005|k6\r\u0012.i\t*", ";rV", "\u001a`]1e6BRb\t\t(\u0014|\u0017=a\u0002(Q", "6`]1_,\u001cZ\u001d~\u0004m\t\u0007\u00198d", "6`]1_,\u001f]&~|k6\r\u0012.i\t*", "6`]1_,&S'\rv`,", "7rB2f:B]\"kzl;x\u0016>", "4na2Z9Hc\"}ib4|p=", ";`h/X\u001a>\\\u0018lzl:\u0001\u00138T\n\u0006\u0003D\u0001 &", "1kX2a;", "<df X:LW#\b", "Ad]1F,La\u001d\t\u0004M6Z\u00103e\t7", "Adb@\\6G7\u0018", "", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class MessageHandler extends Handler {
        private final ArrayList<Messenger> boundClients;
        private boolean hasForegrounded;
        private long lastMsgTimeMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessageHandler(Looper looper) {
            super(looper);
            Intrinsics.checkNotNullParameter(looper, "looper");
            this.boundClients = new ArrayList<>();
        }

        private final void broadcastSession() {
            String str = "Broadcasting new session: " + SessionGenerator.Companion.getInstance().getCurrentSession();
            SessionFirelogPublisher.Companion.getInstance().logSession(SessionGenerator.Companion.getInstance().getCurrentSession());
            for (Messenger it : new ArrayList(this.boundClients)) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                maybeSendSessionToClient(it);
            }
        }

        private final void handleBackgrounding(Message message) {
            String str = "Activity backgrounding at " + message.getWhen();
            this.lastMsgTimeMs = message.getWhen();
        }

        private final void handleClientBound(Message message) {
            this.boundClients.add(message.replyTo);
            Messenger messenger = message.replyTo;
            Intrinsics.checkNotNullExpressionValue(messenger, "msg.replyTo");
            maybeSendSessionToClient(messenger);
            String str = "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.boundClients.size();
        }

        private final void handleForegrounding(Message message) {
            String str = "Activity foregrounding at " + message.getWhen() + '.';
            if (!this.hasForegrounded) {
                this.hasForegrounded = true;
                newSession();
            } else if (isSessionRestart(message.getWhen())) {
                newSession();
            }
            this.lastMsgTimeMs = message.getWhen();
        }

        private final boolean isSessionRestart(long j2) {
            return j2 - this.lastMsgTimeMs > Duration.m10324getInWholeMillisecondsimpl(SessionsSettings.Companion.getInstance().m7780getSessionRestartTimeoutUwyO8pc());
        }

        private final void maybeSendSessionToClient(Messenger messenger) {
            if (this.hasForegrounded) {
                sendSessionToClient(messenger, SessionGenerator.Companion.getInstance().getCurrentSession().getSessionId());
                return;
            }
            String currentSessionId = SessionDatastore.Companion.getInstance().getCurrentSessionId();
            String str = "App has not yet foregrounded. Using previously stored session: " + currentSessionId;
            if (currentSessionId != null) {
                sendSessionToClient(messenger, currentSessionId);
            }
        }

        private final void newSession() {
            SessionGenerator.Companion.getInstance().generateNewSession();
            String str = "Generated new session " + SessionGenerator.Companion.getInstance().getCurrentSession().getSessionId();
            broadcastSession();
            SessionDatastore.Companion.getInstance().updateSessionId(SessionGenerator.Companion.getInstance().getCurrentSession().getSessionId());
        }

        private final void sendSessionToClient(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString(SessionLifecycleService.SESSION_UPDATE_EXTRA, str);
                Message messageObtain = Message.obtain(null, 3, 0, 0);
                messageObtain.setData(bundle);
                messenger.send(messageObtain);
            } catch (DeadObjectException unused) {
                String str2 = "Removing dead client from list: " + messenger;
                this.boundClients.remove(messenger);
            } catch (Exception e2) {
                String str3 = "Unable to push new session to " + messenger + '.';
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (this.lastMsgTimeMs > msg.getWhen()) {
                String str = "Ignoring old message from " + msg.getWhen() + " which is older than " + this.lastMsgTimeMs + '.';
                return;
            }
            int i2 = msg.what;
            if (i2 == 1) {
                handleForegrounding(msg);
                return;
            }
            if (i2 == 2) {
                handleBackgrounding(msg);
            } else if (i2 == 4) {
                handleClientBound(msg);
            } else {
                String str2 = "Received unexpected event from the SessionLifecycleClient: " + msg;
                super.handleMessage(msg);
            }
        }
    }

    private final Messenger getClientCallback(Intent intent) {
        return Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra(CLIENT_CALLBACK_MESSENGER, Messenger.class) : (Messenger) intent.getParcelableExtra(CLIENT_CALLBACK_MESSENGER);
    }

    public final HandlerThread getHandlerThread$com_google_firebase_firebase_sessions() {
        return this.handlerThread;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            return null;
        }
        String str = "Service bound to new client on process " + intent.getAction();
        Messenger clientCallback = getClientCallback(intent);
        if (clientCallback != null) {
            Message messageObtain = Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = clientCallback;
            MessageHandler messageHandler = this.messageHandler;
            if (messageHandler != null) {
                messageHandler.sendMessage(messageObtain);
            }
        }
        Messenger messenger = this.messenger;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.handlerThread.start();
        Looper looper = this.handlerThread.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "handlerThread.looper");
        this.messageHandler = new MessageHandler(looper);
        this.messenger = new Messenger(this.messageHandler);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.handlerThread.quit();
    }
}
