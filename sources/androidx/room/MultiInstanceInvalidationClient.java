package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.InvalidationTracker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: compiled from: MultiInstanceInvalidationClient.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a&yCQU\"}(\nWNumvJ`\u0014K\u000f\u001c\u0016\u0001j2L]xs\u0012\u00172HpG3coE9fw>\u000562*8\u007f\b\t\u001a@H\u0018v\u0001DS\f 0H\u0081@ĥ#˟5\u001a@\u0005~K\u0011\"jgf6vmm>=%\u001bipQ7c>\u0001e\rtY7\u0011\u0005g6+n>E\u00193[\u001b\u0007\u0001dύ\u0007?\u007fGMl5^CI\"\u0010\u0007l\u000e\u001f-3m\u0019\u0006t<[3R\u000f\r}ˆQӍOP\u0016ߊH\n\n\u001aT\u0004<\u0014όL45Կ~\n\u0014B\u0003\u0003$X^\u0013vB.\r8خ#Ӿ\u0004?3ݍ3hWtI-n9\u0002\u001a\u001b4s\u0010|)sT<iڠ\u001fZ\u007f\u0383ISFTVfZhKs\u001cp\u0011\tò\b6OĉG}\u0017G%?\bjG%9k0Kזk|\r\u009b\u0001UomV\\r\u0007$TB\t:x\u001bߦ1\u07fbT``\u008c)O\"s\u0015\u001e(\u0015&}\u0006^q4\u001eqgh\u0018\u000fܷa\u0010-Ä~9_\u0014y4(SlZMSy\u000f\u0010zMܤKםf\u0011`٨ZU\u0012\u0004jRB4N\u0016\u001e$LS\\9+2m ʬ829ǉt\u0017N2,r\u0012\f\u0017\u0011rh>#Ձ7*\u000bǭ<v\u000f3^\u0003A~u,a,+\u0015Ę1GYځ1([Wvjē'@"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u0017u\u00077\u007f$\n%&Cx\f<Z.FU\u0005$6i%2WL\u0019r8\u001e\u001ew7", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "<`\\2", "", "AdaC\\*>7\"\u000ezg;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "7me._0=O(\u0003\u0005g\u001b\n\u0005-k\u007f5", "\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017+\u0004!3_}-\r", "3wT0h;H`", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\u001c\\P?t6s{dj8\u0014m0M@%QU],ea<!\u001d!Z\u0017]\u0001s\u0001b@1xH62Q9S\fC2d\u0015'\n<no>e\u0014Q\u0003\u0004\u0003='nFf5`L=V^st\u001bc$&8D-\u0012\u0002&(hY=S[f\u0011pb\tqt\u001d\\k", "/o_\u0010b5MS,\u000e", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "1`[9U(<Y", "\u001a`]1e6BR,H\bh6\u0005R\u0013M\u0010/\u000bDd %Vk\u0017:v\t>jy';l\u0012=QMDI0%\u001ce]7\r9", "5dc\u0010T3EP\u0015|\u0001", "u(;.a+K]\u001d}\u000e(9\u0007\u00137/c\u0010\fG\u0010\u001bzP}\u001d8\u007f#5=\u000713t\u001a-IR?u={\u0011oh6\u0003a2$", "1kX2a;\"R", "", "5dc\u0010_0>\\(by", "u(8", "Adc\u0010_0>\\(by", "uH\u0018#", "5dc\u0012k,<c(\t\b", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`'\u0003\u000e:\u00074?fS", "5dc\u0016a=:Z\u001d}vm0\u0007\u0012\u001er{&\u0002@\u000e", "u(;.a+K]\u001d}\u000e(9\u0007\u00137/c1\r<\b\u001b\u0016C~\u0012F\u007f\u0014BU{&7zk", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "=ab2e=>`", "\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017+\u0004!3_}-uW\u0013<MPLkAs", "5dc\u001cU:>`*~\b", "u(;.a+K]\u001d}\u000e(9\u0007\u00137/c1\r<\b\u001b\u0016C~\u0012F\u007f\u0014BU{&7zT\u0018JQ;xE\u001e\">", "Adc\u001cU:>`*~\b", "uKP;W9HW\u0018\u0012Dk6\u0007\u0011xI\t9wG\u0005\u0016\u0013Vs\u0018Ee21W\u0004 D,\u007f+[CH|4+j,R", "@d\\<i,(P'~\bo,\nu?n\t$xG\u0001", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "5dc\u001fX4Hd\u0019hwl,\n\u001a/rl8\u0005I|\u0014\u001eG", "u(;7T=:\u001d z\u0004`ui\u00198n{%\u0003@V", "AdaC\\*>", "\u001a`]1e6BR,H\bh6\u0005R\u0013M\u0010/\u000bDd %Vk\u0017:v\t>jy';l\u0012=QMDY4+&l_9\\", "5dc X9OW\u0017~", "u(;.a+K]\u001d}\u000e(9\u0007\u00137/c\u0010\fG\u0010\u001bzP}\u001d8\u007f#5=\u000713t\u001a-IR?u=\f\u0015ur=\u0005c\u0002", "Adc X9OW\u0017~", "uKP;W9HW\u0018\u0012Dk6\u0007\u0011xIg8\u0003O\u0005z U~\nEt%\u0019b\u000f\u001c>q\u0015*\\GEt\"\u001e\"ye7\u00079o?", "AdaC\\*>1#\b\u0004^*\f\r9n", "\u001a`]1e6BRb|\u0005g;|\u0012>/m(\tQ\u0005\u0015\u0017%y\u0017Ev#D]\b)\r", "5dc X9OW\u0017~Xh5\u0006\t-t\u00042\u0005", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqi@\u000e(\u001bEokF\u007f.5W\r$Avk", "Adc\"c\u0019N\\\"zwe,", "5dc X;.^\u0006\u000f\u0004g(y\u0010/", "As^=c,=", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "5dc g6I^\u0019}", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`C~\u0018Dz#~5\r*?q\u0014\u000bWMBk0'j", "As^=", "", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MultiInstanceInvalidationClient {
    private final Context appContext;
    private final IMultiInstanceInvalidationCallback callback;
    private int clientId;
    private final Executor executor;
    private final InvalidationTracker invalidationTracker;
    private final String name;
    public InvalidationTracker.Observer observer;
    private final Runnable removeObserverRunnable;
    private IMultiInstanceInvalidationService service;
    private final ServiceConnection serviceConnection;
    private final Runnable setUpRunnable;
    private final AtomicBoolean stopped;

    public MultiInstanceInvalidationClient(Context context, String str, Intent intent, InvalidationTracker invalidationTracker, Executor executor) throws Throwable {
        Intrinsics.checkNotNullParameter(context, Jg.Wd("<}K(i;&", (short) (OY.Xd() ^ 19748), (short) (OY.Xd() ^ 25758)));
        Intrinsics.checkNotNullParameter(str, ZO.xd("\u0015G[m", (short) (C1607wl.Xd() ^ 31630), (short) (C1607wl.Xd() ^ 27939)));
        Intrinsics.checkNotNullParameter(intent, C1626yg.Ud("\u0001l8\u0003cYU3\u0006\u0007\u001e;W", (short) (C1580rY.Xd() ^ (-14463)), (short) (C1580rY.Xd() ^ (-10568))));
        short sXd = (short) (ZN.Xd() ^ 9682);
        int[] iArr = new int["B\u001am;Sr\u0014O\u0007jpSi{\u0005gJ$w".length()];
        QB qb = new QB("B\u001am;Sr\u0014O\u0007jpSi{\u0005gJ$w");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Intrinsics.checkNotNullParameter(invalidationTracker, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(executor, EO.Od("\u0016xy\u0011\u0006B\u001b\u007f", (short) (C1633zX.Xd() ^ (-17198))));
        this.name = str;
        this.invalidationTracker = invalidationTracker;
        this.executor = executor;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("\u0005\u0011\u0006\u0013\u000f\b\u0002J~\n\b\r|\u0005\nBV\u0002\u007f\u0005t\u0007\u0002", (short) (C1607wl.Xd() ^ 30113))).getMethod(C1593ug.zd("0/?\r=>;943G=DD\u001aGGN@TQ", (short) (ZN.Xd() ^ 13485), (short) (ZN.Xd() ^ 10974)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            this.appContext = context2;
            this.callback = new MultiInstanceInvalidationClient$callback$1(this);
            this.stopped = new AtomicBoolean(false);
            ServiceConnection serviceConnection = new ServiceConnection() { // from class: androidx.room.MultiInstanceInvalidationClient$serviceConnection$1
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName name, IBinder service) {
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(service, "service");
                    this.this$0.setService(IMultiInstanceInvalidationService.Stub.asInterface(service));
                    this.this$0.getExecutor().execute(this.this$0.getSetUpRunnable());
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName name) {
                    Intrinsics.checkNotNullParameter(name, "name");
                    this.this$0.getExecutor().execute(this.this$0.getRemoveObserverRunnable());
                    this.this$0.setService(null);
                }
            };
            this.serviceConnection = serviceConnection;
            this.setUpRunnable = new Runnable() { // from class: androidx.room.MultiInstanceInvalidationClient$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    MultiInstanceInvalidationClient.setUpRunnable$lambda$1(this.f$0);
                }
            };
            this.removeObserverRunnable = new Runnable() { // from class: androidx.room.MultiInstanceInvalidationClient$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    MultiInstanceInvalidationClient.removeObserverRunnable$lambda$2(this.f$0);
                }
            };
            setObserver(new InvalidationTracker.Observer((String[]) invalidationTracker.getTableIdLookup$room_runtime_release().keySet().toArray(new String[0])) { // from class: androidx.room.MultiInstanceInvalidationClient.1
                @Override // androidx.room.InvalidationTracker.Observer
                public boolean isRemote$room_runtime_release() {
                    return true;
                }

                AnonymousClass1(String[] strArr) {
                    super(strArr);
                }

                @Override // androidx.room.InvalidationTracker.Observer
                public void onInvalidated(Set<String> tables) {
                    Intrinsics.checkNotNullParameter(tables, "tables");
                    if (MultiInstanceInvalidationClient.this.getStopped().get()) {
                        return;
                    }
                    try {
                        IMultiInstanceInvalidationService service = MultiInstanceInvalidationClient.this.getService();
                        if (service != null) {
                            service.broadcastInvalidation(MultiInstanceInvalidationClient.this.getClientId(), (String[]) tables.toArray(new String[0]));
                        }
                    } catch (RemoteException e2) {
                    }
                }
            });
            Class<?> cls = Class.forName(C1561oA.od("&2'40)#k +).\u001e&+cw#!&\u0016(#", (short) (OY.Xd() ^ 16802)));
            Class<?>[] clsArr = new Class[3];
            short sXd2 = (short) (FB.Xd() ^ 17491);
            int[] iArr2 = new int["P^Udb]Y$Zggn`jq,Hnugqx".length()];
            QB qb2 = new QB("P^Udb]Y$Zggn`jq,Hnugqx");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd2 + sXd2) + i3));
                i3++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i3));
            clsArr[1] = Class.forName(Wg.Zd("\t]c>K\u001d\u001c.\u0004\u001cZt>O!j \u0007\u001cgvA?t9<\u0005\u0014]~DNe", (short) (C1633zX.Xd() ^ (-6640)), (short) (C1633zX.Xd() ^ (-19079))));
            clsArr[2] = Integer.TYPE;
            Object[] objArr2 = {intent, serviceConnection, 1};
            Method method2 = cls.getMethod(C1561oA.Xd("?GMD4GUZNIL", (short) (Od.Xd() ^ (-15899))), clsArr);
            try {
                method2.setAccessible(true);
                method2.invoke(context2, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final String getName() {
        return this.name;
    }

    public final InvalidationTracker getInvalidationTracker() {
        return this.invalidationTracker;
    }

    public final Executor getExecutor() {
        return this.executor;
    }

    public final int getClientId() {
        return this.clientId;
    }

    public final void setClientId(int i2) {
        this.clientId = i2;
    }

    public final InvalidationTracker.Observer getObserver() {
        InvalidationTracker.Observer observer = this.observer;
        if (observer != null) {
            return observer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("observer");
        return null;
    }

    public final void setObserver(InvalidationTracker.Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "<set-?>");
        this.observer = observer;
    }

    public final IMultiInstanceInvalidationService getService() {
        return this.service;
    }

    public final void setService(IMultiInstanceInvalidationService iMultiInstanceInvalidationService) {
        this.service = iMultiInstanceInvalidationService;
    }

    public final IMultiInstanceInvalidationCallback getCallback() {
        return this.callback;
    }

    public final AtomicBoolean getStopped() {
        return this.stopped;
    }

    public final ServiceConnection getServiceConnection() {
        return this.serviceConnection;
    }

    public final Runnable getSetUpRunnable() {
        return this.setUpRunnable;
    }

    public static final void setUpRunnable$lambda$1(MultiInstanceInvalidationClient this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this$0.service;
            if (iMultiInstanceInvalidationService != null) {
                this$0.clientId = iMultiInstanceInvalidationService.registerCallback(this$0.callback, this$0.name);
                this$0.invalidationTracker.addObserver(this$0.getObserver());
            }
        } catch (RemoteException e2) {
        }
    }

    public static final void removeObserverRunnable$lambda$2(MultiInstanceInvalidationClient this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.invalidationTracker.removeObserver(this$0.getObserver());
    }

    public final Runnable getRemoveObserverRunnable() {
        return this.removeObserverRunnable;
    }

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationClient$1 */
    /* JADX INFO: compiled from: MultiInstanceInvalidationClient.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я%\u001d̉=!4i\bӵLc\u0003\rI\u00066\f6B\r\"4ߚ\u007f\u0007t\u000bA0RqP\u008czRճ\u0015s\u0012éT[Rp\fOc\u001e\u0016\"7T~qutb`\u001bE\u001f\u0006D\u0001\u00193\u0010iIo \u000fJB\u001e@i\u001cFޚ;žx:\u001d\"8$F|ڷ\u0005#"}, d2 = {"/mS?b0=fb\f\u0005h4Fp?l\u000f,_I\u000f&\u0013Pm\u000e \u007f61`\u0002\u001f3|\u001a8V!Bo4'$'-", "\u001a`]1e6BR,H\bh6\u0005R\u0013n\u0011$\u0003D\u007f\u0013&Ky\u0017+\u0004!3_}-uW\u0013<MPLkAs", "7rA2`6MS", "", "7rA2`6MSW\f\u0005h4v\u0016?n\u000f,\u0004@z$\u0017No\nJv", "u(I", "=m8;i(EW\u0018z\n^+", "", "B`Q9X:", "", "", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends InvalidationTracker.Observer {
        @Override // androidx.room.InvalidationTracker.Observer
        public boolean isRemote$room_runtime_release() {
            return true;
        }

        AnonymousClass1(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.InvalidationTracker.Observer
        public void onInvalidated(Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            if (MultiInstanceInvalidationClient.this.getStopped().get()) {
                return;
            }
            try {
                IMultiInstanceInvalidationService service = MultiInstanceInvalidationClient.this.getService();
                if (service != null) {
                    service.broadcastInvalidation(MultiInstanceInvalidationClient.this.getClientId(), (String[]) tables.toArray(new String[0]));
                }
            } catch (RemoteException e2) {
            }
        }
    }

    public final void stop() throws Throwable {
        if (this.stopped.compareAndSet(false, true)) {
            this.invalidationTracker.removeObserver(getObserver());
            try {
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.service;
                if (iMultiInstanceInvalidationService != null) {
                    iMultiInstanceInvalidationService.unregisterCallback(this.callback, this.clientId);
                }
            } catch (RemoteException e2) {
                Wg.vd("\u001a9CDJPxO=B25<GE79g2;7@2v(.02$2$'V!#,\u001c(\"\u001e\u0010$\u0016\u001d!S\u0014\u0013\u0013\u0014\u0007\u0007\u000e\u0017", (short) (C1580rY.Xd() ^ (-1564)));
                short sXd = (short) (Od.Xd() ^ (-10485));
                short sXd2 = (short) (Od.Xd() ^ (-22910));
                int[] iArr = new int["*&%\"".length()];
                QB qb = new QB("*&%\"");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                    i2++;
                }
                new String(iArr, 0, i2);
            }
            Context context = this.appContext;
            Object[] objArr = {this.serviceConnection};
            Method method = Class.forName(hg.Vd("4@5B>71y.97<,49q\u00061/4$61", (short) (Od.Xd() ^ (-20112)), (short) (Od.Xd() ^ (-29217)))).getMethod(C1561oA.yd("f`U]cZJ]kpd_b", (short) (C1633zX.Xd() ^ (-13301))), Class.forName(C1561oA.ud("WcXeaZT\u001dQ\\Z_OW\\\u00159JVYKDE\"MKJ@=MAFD", (short) (FB.Xd() ^ 21927))));
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }
}
