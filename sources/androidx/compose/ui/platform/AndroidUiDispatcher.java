package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.core.os.HandlerCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.hg;

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
/* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яc\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\tnj?1Le^.ZS0\u0010s{BřcҕyCI^\"}(\tWNu\u0007vJp\u000bK\u000f\f\u0016\u0001jBI]xs\u0012\u0017˰JoM3UڎE9vt>\u0005&4*8\b\f\t\u001a0N8u\u0003IP\"۵Ni!:\u0001\f\u0006\u0004CR\u001bD \u0011\"jgf6vmm>=%\u001bipQϮc0\u000bQU\\bA%v\u00109[DEQ-%\u0002 7Vi]\u001b? VK|o/9h\fYLW.-[+\u0018\u001bk\u0013>\\3l\u0011\u00105LgcyrT(@\u0001\n0T\u0004<!mHv@(\u000b \u000ea\u0010#WNu\u001a^p\u0015Aʨي\u001b%\u0006YsL)\u000eiai4~;\n*%\u001eQ\u00165ďƟX\u000ef=kc\u0006QIQn>˓R\u0010aƝ\u0006\u0006vg\u00100T>U\u0007G{?6m©9٦=%)k\u0010Q\u0015v\u0005\u000fxh\u0002tʐLF*Â.90\u0015\u001ag\u0015p\u0013mhT\u0007/g۶\u001eΤ\u000b}\u0010ʶph\u0006J9%>]&řkҷQ]\u0012ɘ\u007frEi\u0007k<h\u0010ӗ?̳Uc\u0018Р#\u0003\"QTb3i=̾_۱^\\0ί\u0003Zx#\u0010\u0002TP\u001c\u0013`T 0\u000bμ=Ǭ`\u0015PґnTO\u0013!ejj ~\u0003HR\u0017@ˈ\u0001֊\u0005Pdʙ@y\u0007`D\u0003p$=A\u007fNG>,ȫjط\u0001#\u000fѨ·\u0004q"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\u001eQ\"?y?\u001a$fd9\u00149", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00049g\t\u001cFk\u0019.Z\u0019", "1g^?X6@`\u0015\n}^9", "\u001a`]1e6BRb\u0010~^>Ff2o\r(\u0006B\u000e\u0013\"Jo\u001b\u0012", "6`]1_,K", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "uKP;W9HW\u0018H\fb,\u000fR\rh\n5{J\u0003$\u0013Rr\u000eIL\f1b|-Aq\u0015wWQ\u0005N0'\u0014oaF\\'\u001d", "5dc\u0010[6KS#\u0001\bZ7\u007f\t<", "u(;.a+K]\u001d}Do0|\u001bxC\u00032\t@\u000b\u0019$Cz\u0011<\u0004z", "2hb=T;<Vvz\u0002e)x\u00075", "/mS?b0=fb|\u0005f7\u0007\u0017//\u0010,EK\b\u0013&Hy\u001bD@\u0001>X\u000b*;l\u00062,GIv0-\u0013kaFEb0\\\u0002#VJQ\nXYy:\u0010\u0010`L\u001a", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\u001eQ\"?y?\u001a$fd9\u0014\"+R\u00052C[L/:NyD\u0011\u000eX\u0014\rvb", "4qP:X\nE]\u0017\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\u007f/Dc\u0007$5N#*UC\u0019r>\u001c\u001b>", "5dc\u0013e(FSv\u0006\u0005\\2", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006^/>c\r*@q\u0014\u000fZ?Ck\u0012%\u001ffg\u000f", ":nR8", "", "AbW2W<ES\u0018_\bZ4|g3s\u000b$\u000b>\u0004", "", "AbW2W<ES\u0018m\bZ4\b\u00136i\t(ZD\u000f\"\u0013Vm\u0011", "AoP?X\u001bH@)\bdg\r\n\u00057e", "", "\u001a`]1e6BRb\u0010~^>Ff2o\r(\u0006B\u000e\u0013\"Jo\u001bzW21a}}3t\u001d+IAAA", "BnABa\u0016G4&z\u0003^", "BnABa\u001bKO!\n\u0005e0\u0006\t.", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[N\u000eH\u0007%\u000b", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "2hb=T;<V", "", "1n]AX?M", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "0k^0^", "<dgAG(LY", ">da3b9F4&z\u0003^\u000b\u0001\u0017:a\u000f&~", "4qP:X\u001bB[\u0019gvg6\u000b", "", ">da3b9FB&z\u0003i6\u0004\r8e^,\nK|&\u0015J", ">nbA99:[\u0019\\ve3y\u0005-k", "1`[9U(<Y", ">nbA99:[\u0019\\ve3y\u0005-k>8\u007f:\u000e\u0017\u001eGk\u001c<", "@d\\<i,\u001f`\u0015\u0007z<(\u0004\u0010,a}.", "@d\\<i,\u001f`\u0015\u0007z<(\u0004\u0010,a}.:P\u0005\u0011$Gv\u000e8\u0005%", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidUiDispatcher extends CoroutineDispatcher {
    private final Choreographer choreographer;
    private final AndroidUiDispatcher$dispatchCallback$1 dispatchCallback;
    private final MonotonicFrameClock frameClock;
    private final Handler handler;
    private final Object lock;
    private boolean scheduledFrameDispatch;
    private boolean scheduledTrampolineDispatch;
    private List<Choreographer.FrameCallback> spareToRunOnFrame;
    private List<Choreographer.FrameCallback> toRunOnFrame;
    private final ArrayDeque<Runnable> toRunTrampolined;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Lazy<CoroutineContext> Main$delegate = LazyKt.lazy(new Function0<CoroutineContext>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2
        @Override // kotlin.jvm.functions.Function0
        public final CoroutineContext invoke() throws Throwable {
            DefaultConstructorMarker defaultConstructorMarker = null;
            Choreographer choreographer = AndroidUiDispatcher_androidKt.isMainThread() ? Choreographer.getInstance() : (Choreographer) BuildersKt.runBlocking(Dispatchers.getMain(), new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null));
            short sXd = (short) (Od.Xd() ^ (-13005));
            short sXd2 = (short) (Od.Xd() ^ (-11277));
            int[] iArr = new int["}\n~\f\b\u0001zC\u0004\u0007@]\u007f~~r~".length()];
            QB qb = new QB("}\n~\f\b\u0001zC\u0004\u0007@]\u007f~~r~");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(hg.Vd("xu\u0004[nuyVxwwkw", (short) (ZN.Xd() ^ 17265), (short) (ZN.Xd() ^ 27057)), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, HandlerCompat.createAsync((Looper) declaredMethod.invoke(null, objArr)), defaultConstructorMarker);
                return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    });
    private static final ThreadLocal<CoroutineContext> currentThread = new ThreadLocal<CoroutineContext>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$currentThread$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public CoroutineContext initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null) {
                AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, HandlerCompat.createAsync(looperMyLooper), null);
                return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
            }
            throw new IllegalStateException("no Looper on this thread".toString());
        }
    };

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    private AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new Object();
        this.toRunTrampolined = new ArrayDeque<>();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new AndroidUiDispatcher$dispatchCallback$1(this);
        this.frameClock = new AndroidUiFrameClock(choreographer, this);
    }

    private final Runnable nextTask() {
        Runnable runnableRemoveFirstOrNull;
        synchronized (this.lock) {
            runnableRemoveFirstOrNull = this.toRunTrampolined.removeFirstOrNull();
        }
        return runnableRemoveFirstOrNull;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performTrampolineDispatch() {
        boolean z2;
        do {
            Runnable runnableNextTask = nextTask();
            while (runnableNextTask != null) {
                runnableNextTask.run();
                runnableNextTask = nextTask();
            }
            synchronized (this.lock) {
                if (this.toRunTrampolined.isEmpty()) {
                    z2 = false;
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z2 = true;
                }
            }
        } while (z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performFrameDispatch(long j2) {
        synchronized (this.lock) {
            if (this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = false;
                List<Choreographer.FrameCallback> list = this.toRunOnFrame;
                this.toRunOnFrame = this.spareToRunOnFrame;
                this.spareToRunOnFrame = list;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.get(i2).doFrame(j2);
                }
                list.clear();
            }
        }
    }

    public final void postFrameCallback$ui_release(Choreographer.FrameCallback frameCallback) {
        synchronized (this.lock) {
            this.toRunOnFrame.add(frameCallback);
            if (!this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = true;
                this.choreographer.postFrameCallback(this.dispatchCallback);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void removeFrameCallback$ui_release(Choreographer.FrameCallback frameCallback) {
        synchronized (this.lock) {
            this.toRunOnFrame.remove(frameCallback);
        }
    }

    public final MonotonicFrameClock getFrameClock() {
        return this.frameClock;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo10550dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.lock) {
            this.toRunTrampolined.addLast(runnable);
            if (!this.scheduledTrampolineDispatch) {
                this.scheduledTrampolineDispatch = true;
                Handler handler = this.handler;
                AndroidUiDispatcher$dispatchCallback$1 androidUiDispatcher$dispatchCallback$1 = this.dispatchCallback;
                Class<?> cls = Class.forName(C1561oA.ud("IUJWSLF\u000fOR\f%=I>E=I", (short) (C1580rY.Xd() ^ (-20498))));
                Class<?>[] clsArr = new Class[1];
                short sXd = (short) (C1499aX.Xd() ^ (-1901));
                int[] iArr = new int[",\"6 k)\u001d)!f\n,$#\u0015\u0015\u001e\u0016".length()];
                QB qb = new QB(",\"6 k)\u001d)!f\n,$#\u0015\u0015\u001e\u0016");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                    i2++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i2));
                Object[] objArr = {androidUiDispatcher$dispatchCallback$1};
                short sXd2 = (short) (C1633zX.Xd() ^ (-4272));
                int[] iArr2 = new int["\u0003\u0003\b\n".length()];
                QB qb2 = new QB("\u0003\u0003\b\n");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                    i3++;
                }
                Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                    if (!this.scheduledFrameDispatch) {
                        this.scheduledFrameDispatch = true;
                        this.choreographer.postFrameCallback(this.dispatchCallback);
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005'4\u0012\u000e\u0007nʑ?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\fd(~:\t}P\u001e,ĔN^#E\u0015\t$|;EWZ\u0011]@\u0011h\u0007FЇݑMڱAChv<\f.:::\u007f\u000b\u000f\u001ezZ\u001e\u007f\u0013I[\u000e\"0nrh\\cˢ\u0007ܨ\u0016\u0006FĨӞ\"g"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\u001eQ\"?y?\u001a$fd9\u0014\"\nX~2CUR6e(", "", "u(E", "\u0011ta?X5MB\u001c\fzZ+", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "5dc\u0010h9KS\"\u000eia9|\u0005.", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "\u001b`X;", "5dc\u001aT0G", "\u001b`X;\u0017+>Z\u0019\u0001vm,", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "1ta?X5MB\u001c\fzZ+", "\u001aiPCTuEO\"\u0001DM/\n\t+df2y<\bl", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CoroutineContext getMain() {
            return (CoroutineContext) AndroidUiDispatcher.Main$delegate.getValue();
        }

        public final CoroutineContext getCurrentThread() {
            if (AndroidUiDispatcher_androidKt.isMainThread()) {
                return getMain();
            }
            CoroutineContext coroutineContext = (CoroutineContext) AndroidUiDispatcher.currentThread.get();
            if (coroutineContext != null) {
                return coroutineContext;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }
    }
}
