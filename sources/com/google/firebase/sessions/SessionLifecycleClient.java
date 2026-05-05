package com.google.firebase.sessions;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.QB;
import yg.Wg;
import yg.Xu;

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
@Metadata(bv = {}, d1 = {"Я]\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0005<řc$wDCU(}*\tUNog\u0005JbŏK\u000f\u00145\u0001j2J]xk0\u0017˰JoM9UoC<htL\u0005(2(:\"\u0004\f ݒ^Ƶ\u0015\u001dsK:\u0011h@\u0012\\\u0013\u0018]\t(\u0012\u001e>N\u0002ɉ`g\\8\u0011pkGG#1w\u000bZ5nH|{\u001bvX5\u001d\u000faL<\tCC'=Y\u0013\tb[m\bm\u0005\u0004\u00051+5?as\u0006D!\u001e\"*CQ#\\!+\r\u000f_v$-;QsK~\u0013V\u000f+\u007f\u001bT\u001c\u000e4@\u000f.u(t\"&3#\u0001\u0004D^\u001dvB.\u007f(6_3\u000eOC9It\u0002eI6f7*\u001eS\u001ek\u0015|?sT<\u007fE%b\u000ei7aBMH|\u000f\bT4\u00059p\u0010J\u001c0u\u000e_\u007f\u001fI/%e`\u007f#qw\u0010H\\g%\u00067èUׂVHH̎?(E-!\u0012jFt\u0005\u001aU\u0003\\\u0003ҍOɟX\u0007\u0006ܱc.j}T#;\u000f|V?Ȍvܷa\n-Ä7Cgv\u0004\u000e\u0006B5ګAɄg\u0010i\u05ecG\"MFz\u0005\u0007q\u0019Ͱ\u000eȺ`**2Vvށ{\u001f"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u0015QD;iH\u001c\u001ch?@\u000bc5]L", "", "0`R8Z9Hc\"}Yb:\b\u0005>c\u0003(\t", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|kq>", "?tTBX+&S'\rv`,\u000b", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ}\u001bPu\u000e;S,?W\u0004$@ot.YS;A", "\u001a`]1e6BRb\t\t(\u0014|\u0017=a\u0002(Q", "AdaC\\*>", "\u001a`]1e6BRb\t\t(\u0014|\u0017=e\t*{MV", "AdaC\\*>0#\u000f\u0004]", "", "AdaC\\*>1#\b\u0004^*\f\r9n", "1n\\{Z6HU ~D_0\n\t,a\u000e(EN\u0001%%Ky\u0017J@\u00135g\f$Av|2NC9\u007f2%\u0015Fh=\u0007l;\r\u0005'T]R*\\0|F\u001d\u0012X\u001dR5\u0016C%", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u0015QD;iH\u001c\u001ch?@\u000bc5]55GY_0ZRPG\u001d\u001bZ\f]/\u0017\u000e\u0018\ry", "0`R8Z9Hc\"}z]", "", "0h]1G6,S&\u0010~\\,", "Adb@\\6G:\u001d\u007fz\\@z\u0010/S\u007f5\rD~\u0017sKx\r<\u0004", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u0015QD;iH\u001c\u001chO9\u0014t0Lv\u0004KUM,i(", "2qP6a\u0018NS)~", "", "4na2Z9Hc\"}z]", "5dc\u0019T;>a([\u000f<6{\t", ";db@T.>a", "", ";rV\u0010b+>", "", "?tTBX\u0014>a'z|^", ";rV", "Ad]1?0?S\u0017\u0013xe,\\\u001a/n\u000f", ";db@T.>1#}z", "Ad]1?0?S\u0017\u0013xe,\\\u001a/n\u000f6", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "Ad]1@,La\u0015\u0001zM6j\t<v\u007f5", "\u0011kX2a;.^\u0018z\n^\u000fx\u0012.l\u007f5", "\u0011n\\=T5B]\"", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SessionLifecycleClient {
    public static final Companion Companion = new Companion(null);
    private static final int MAX_QUEUED_MESSAGES = 20;
    public static final String TAG = "SessionLifecycleClient";
    private final CoroutineContext backgroundDispatcher;
    private final LinkedBlockingDeque<Message> queuedMessages;
    private Messenger service;
    private boolean serviceBound;
    private final SessionLifecycleClient$serviceConnection$1 serviceConnection;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0012\u007fјnjO0LeN.ZS8\u001bsڔ:řqҕ\"CiTZ\t2\r]N\u007fg\u001dKҼ\u000fC\u001d\b^\u0007x/aU'aB\u0013@G\b?aS6Q\u0002n\u0003=\u001d `&h}\u0013\t2*v\u0019=z\u0014W\u001a\u0012H@\u001f;)ҋOŋ\u001e\u0012\u000ēő\u0005("}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u0015QD;iH\u001c\u001ch?@\u000bc5]5\u0005NPN5kB}<\u0010!ZpJ4\f\fYNy", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "0`R8Z9Hc\"}Yb:\b\u0005>c\u0003(\t", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|kq>", "6`]1_,&S'\rv`,", "", ";rV", "\u001a`]1e6BRb\t\t(\u0014|\u0017=a\u0002(Q", "6`]1_,,S'\r~h5l\u0014.a\u000f(", "Adb@\\6G7\u0018", "", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ClientUpdateHandler extends Handler {
        private final CoroutineContext backgroundDispatcher;

        public ClientUpdateHandler(CoroutineContext coroutineContext) throws Throwable {
            Intrinsics.checkNotNullParameter(coroutineContext, Wg.Zd("Dm`Pzn[\fuSaoi\u0011rmKxe]", (short) (C1580rY.Xd() ^ (-17896)), (short) (C1580rY.Xd() ^ (-32539))));
            Class<?> cls = Class.forName(C1561oA.Xd(">LCRPKG\u0012TY\u00154XY[Q_", (short) (FB.Xd() ^ 30616)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1580rY.Xd() ^ (-22223));
            int[] iArr = new int["\u0011\u000e\u001cs\u0007\u000e\u0012n\u0011\u0010\u0010\u0004\u0010".length()];
            QB qb = new QB("\u0011\u000e\u001cs\u0007\u000e\u0012n\u0011\u0010\u0010\u0004\u0010");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
            try {
                declaredMethod.setAccessible(true);
                super((Looper) declaredMethod.invoke(null, objArr));
                this.backgroundDispatcher = coroutineContext;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        private final void handleSessionUpdate(String str) {
            String str2 = "Session update received: " + str;
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            String string;
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what != 3) {
                String str = "Received unexpected event from the SessionLifecycleService: " + msg;
                super.handleMessage(msg);
                return;
            }
            Bundle data = msg.getData();
            if (data == null || (string = data.getString(SessionLifecycleService.SESSION_UPDATE_EXTRA)) == null) {
                string = "";
            }
            handleSessionUpdate(string);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0007\":\u001e\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$BOIV2}P\u000b&ȡ:̊rJbŏ\u0014\u001b\u0014\u0019\u0011jZM,ޓ0ܫ\u00132JģЩ7R"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u000f\u0017%Us\u0018E\u0005n#Y\f.;w\u001f\u0015QD;iH\u001c\u001ch?@\u000bc5]5\u0005QTY(eV|Fi", "", "u(E", "\u001b@G,D\u001c\u001eCx]tF\fjv\u000bG_\u0016", "", "\"@6", "", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>35g\f$Av$"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Message> $messages;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<Message> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$messages = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SessionLifecycleClient.this.new AnonymousClass1(this.$messages, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = FirebaseSessionsDependencies.INSTANCE.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Map map = (Map) obj;
            if (!map.isEmpty()) {
                Collection collectionValues = map.values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((SessionSubscriber) it.next()).isDataCollectionEnabled()) {
                            List listSortedWith = CollectionsKt.sortedWith(CollectionsKt.filterNotNull(CollectionsKt.mutableListOf(SessionLifecycleClient.this.getLatestByCode(this.$messages, 2), SessionLifecycleClient.this.getLatestByCode(this.$messages, 1))), new Comparator() { // from class: com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t2, T t3) {
                                    return ComparisonsKt.compareValues(Long.valueOf(((Message) t2).getWhen()), Long.valueOf(((Message) t3).getWhen()));
                                }
                            });
                            SessionLifecycleClient sessionLifecycleClient = SessionLifecycleClient.this;
                            Iterator it2 = listSortedWith.iterator();
                            while (it2.hasNext()) {
                                sessionLifecycleClient.sendMessageToServer((Message) it2.next());
                            }
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1] */
    public SessionLifecycleClient(CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.backgroundDispatcher = backgroundDispatcher;
        this.queuedMessages = new LinkedBlockingDeque<>(20);
        this.serviceConnection = new ServiceConnection() { // from class: com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                String str = "Connected to SessionLifecycleService. Queue size " + this.this$0.queuedMessages.size();
                this.this$0.service = new Messenger(iBinder);
                this.this$0.serviceBound = true;
                SessionLifecycleClient sessionLifecycleClient = this.this$0;
                sessionLifecycleClient.sendLifecycleEvents(sessionLifecycleClient.drainQueue());
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                this.this$0.service = null;
                this.this$0.serviceBound = false;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Message> drainQueue() {
        ArrayList arrayList = new ArrayList();
        this.queuedMessages.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Message getLatestByCode(List<Message> list, int i2) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Message) obj).what == i2) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        return (Message) next;
    }

    private final void queueMessage(Message message) {
        if (this.queuedMessages.offer(message)) {
            String str = "Queued message " + message.what + ". Queue size " + this.queuedMessages.size();
        } else {
            String str2 = "Failed to enqueue message " + message.what + ". Dropping.";
        }
    }

    private final void sendLifecycleEvent(int i2) {
        List<Message> listDrainQueue = drainQueue();
        Message messageObtain = Message.obtain(null, i2, 0, 0);
        Intrinsics.checkNotNullExpressionValue(messageObtain, "obtain(null, messageCode, 0, 0)");
        listDrainQueue.add(messageObtain);
        sendLifecycleEvents(listDrainQueue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job sendLifecycleEvents(List<Message> list) {
        return BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new AnonymousClass1(list, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMessageToServer(Message message) {
        if (this.service == null) {
            queueMessage(message);
            return;
        }
        try {
            String str = "Sending lifecycle " + message.what + " to service";
            Messenger messenger = this.service;
            if (messenger != null) {
                messenger.send(message);
            }
        } catch (RemoteException e2) {
            String str2 = "Unable to deliver message: " + message.what;
            queueMessage(message);
        }
    }

    public final void backgrounded() {
        sendLifecycleEvent(2);
    }

    public final void bindToService(SessionLifecycleServiceBinder sessionLifecycleServiceBinder) {
        Intrinsics.checkNotNullParameter(sessionLifecycleServiceBinder, "sessionLifecycleServiceBinder");
        sessionLifecycleServiceBinder.bindToService(new Messenger(new ClientUpdateHandler(this.backgroundDispatcher)), this.serviceConnection);
    }

    public final void foregrounded() {
        sendLifecycleEvent(1);
    }
}
