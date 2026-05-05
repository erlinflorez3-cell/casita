package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.Xg;
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
/* JADX INFO: compiled from: AutoCloser.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&i\u000eӵLш|\u0004O\r8é6B\u0015\"4ߚ\u007f\u0007|jA0JfP.hS2şs{J$c$wFCU0}*\tUSog\u0005JbŏK\u000f\u0014\u001f\u0001j2U]xk\u0018\u00172HtG3[oE9fv>\u000562*8\u007f\n\u0007ɝ@Ϻ.4+Cy\u000bJ/}1Ub\u0011[\u00052\u00124?0\u0005,^\u007fNdK|aH3;\u0003\u0018GĚ+_>\u0003\u0016\u0011T\u0006?\r%\u0014f/NjM\u0015S\u0006K*`\u0010W\u0003\u0006']\u0007nѧ5`y\u0004elp\f$\u0017;O;h\u0003(l\u0005\u0018\u0016:^˦ScY\tV,\u00064\u0014\rj\u000fV\u00125\u0003F-H\u00198\u0012A\u0005\u000bSnaJjP;\u0013adIU\u0004AgQ\u001b\u0015Z2G'UO{3\u000etŃ\rͼ%[\\ו1!)\\\u0010Q_Z\u0017׃Jݳ\u000eYEЧT\u000fp\fB\u0006FF.:2߾lϏ{ڝgޠ'-sȵ`Fm\u0003\u0013m\tUo`VOr\u0007$GB\t:k\u001bߦ1\u07fbT``\u008c)O\"f\u0015\u0011(\u0015&p\u0006Qq1\u001edgh\u0018s$έ\fɻ3f?ժ?w\u001cnQ^a:(Ҳ\u0012уVv\u001c̳\rn\u0013p~B\u0002%1٥*ϒ6HrݘH\u000bRh$\u0013`Z(`ٜ051^\u001bb\u0011:\u0013]\u000b&wZ\u0017\u00115ԞqɴYǯ0ڲ\r\rXʔ\tqm\u0017WK\u001db(MOr\u0006%4w:hb{yȗ\u0001\u0381\u0004Goն\u0018Xz9\u000eU*;l֠Eֺ3=\u001bÁOC@&EGbq\u0014Z$Ƚ3ϸ\u0001\u0006\u0017\u0090\u00010m-x\u0017Lbpq]|g>\u0005\b\u000b#6\u000f6ט ¿Qôoӝ\u000fgFδ\u000b\u0005_g\\d\u001d\u0007%K3/@4\u000bdECUGL7j٭\u0017˸am\b0\u007f\u0013\u001dRܒiB"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u000bu\u000f2YG\u000b%\u0017TE", "", "/tc<63Ha\u0019m~f,\u0007\u0019>A\b2\fI\u0010", "", "/tc<63Ha\u0019m~f,l\u00123t", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0006\u001bOo}Ez4\u000b", "/tc<63Ha\u0019^\u000e^*\r\u00189r", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012\u000b", "uI;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`6s\u0016<f.9hS\u0007<i'*\u0017SJo;g\u0013rj7\u0017p9N\u007f6\u0011,a,Zb\u0002G!g\u001e~", "/tc<63Ha\u0019m~f,\u0007\u0019>I\t\u0010\n", "/tc<63Ha\u0019\f", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "2d[2Z(MSwz\nZ)x\u0017/", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}~3|\u0012+IQ;A", "5dc\u0011X3>U\u0015\u000ez=(\f\u0005,a\u000e(:M\u000b!\u001fA|\u001eE\u0006)=Yw-7t\u0016*[C", "u(;.a+K]\u001d}\u000e(:\t\u00103t\u007fqz=J\u0005'Rz\u0018I\u0006\u0013!@\u0002/7L\u0012=I@7y4s", "Adc\u0011X3>U\u0015\u000ez=(\f\u0005,a\u000e(:M\u000b!\u001fA|\u001eE\u0006)=Yw-7t\u0016*[C", "uKP;W9HW\u0018\u0012Dl8\u0004\r>eI'x\nn'\"Ry\u001bKd\u0011\u001c]\r \u0016i%*J?Ik\na\u0006", "2d[2Z(MS\u0003\nzg\u000f|\u0010:e\r", "\u001a`]1e6BR,H\tj3\u0001\u0018//~%E.\u0011\"\"Q|\u001d*b\f9h}\nBm\u001f\u0011MJFkAs", "5dc\u0011X3>U\u0015\u000ezH7|\u0012\u0012e\u00073{M", "u(;.a+K]\u001d}\u000e(:\t\u00103t\u007fqz=J\u0005'Rz\u0018I\u0006\u0013!@\u0002/7W!.V&;r?\u001e\">", "Adc\u0011X3>U\u0015\u000ezH7|\u0012\u0012e\u00073{M", "uKP;W9HW\u0018\u0012Dl8\u0004\r>eI'x\nn'\"Ry\u001bKd\u0011\u001c]\r !x\u001670CBv4+j,R", "3wT0h;>/)\u000e\u0005<3\u0007\u0017/r", "3wT0h;H`", "6`]1_,K", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "7r00g0OS", "", "u(I", ":`bA7,<`\u0019\u0007zg;i\t0C\n8\u0005Oo\u001b\u001fG]\u001d8~0", "5dc\u0019T:M2\u0019|\b^4|\u0012>R\u007f)YJ\u0011 &6s\u0016<d41a\t^Dw 6GPKtC\"\u001dh[F\u0007j,J\u0005'", "u(9", "Adc\u0019T:M2\u0019|\b^4|\u0012>R\u007f)YJ\u0011 &6s\u0016<d41a\t^Dw 6GPKtC\"\u001dh[F\u0007j,J\u0005'", "uI\u0018#", ":nR8", ";`]BT3Egv\u0006\u0005l,{", "=m0Bg6\u001cZ#\rz<(\u0004\u0010,a}.", "5dc\u001ca\bNb#\\\u0002h:|f+l\u0007%w>\u0007U$Qy\u00166\u00045>h\u0002(7g#.TC7y4", "u(;7T=:\u001d z\u0004`ui\u00198n{%\u0003@V", "Adc\u001ca\bNb#\\\u0002h:|f+l\u0007%w>\u0007U$Qy\u00166\u00045>h\u0002(7g#.TC7y4", "uKY.i(\bZ\u0015\b|(\u0019\r\u00128a|/{\u0016D\b", "@dU\u0010b<Gb", "", "5dc\u001fX-\u001c])\b\n\u001d9\u0007\u00137_\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "u(8", "Adc\u001fX-\u001c])\b\n\u001d9\u0007\u00137_\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "uH\u0018#", "@dU\u0010b<Gby\t\bM,\u000b\u0018", "5dc\u001fX-\u001c])\b\n?6\nw/s\u000ff\tJ\u000b\u001f\u0011T\u007f\u0017Kz-5S\u000b >m\u0012<M", "1k^@X\u000b:b\u0015{vl,`\n\u0019p\u007f1", "", "2dR?X4>\\(\\\u0005n5\fd8dm&~@\u007f'\u001eGM\u0015F\u0005%", "3wT0h;>@\u0019\u007fXh<\u0006\u00183n\u0002\t\fI~&\u001bQx", "$", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "7mR?X4>\\(\\\u0005n5\fd8d_1\nP\u000e\u0017uDS\u001c&\u0002%>", "7mXA", "Adc\u000eh;H1 \t\t^\nx\u00106b{&\u0002", "=m0Bg6\u001cZ#\rz", "\u0011n\\=T5B]\"", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AutoCloser {
    public static final Companion Companion = new Companion(null);
    public static final String autoCloseBug = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";
    private long autoCloseTimeoutInMs;
    private final Runnable autoCloser;
    private SupportSQLiteDatabase delegateDatabase;
    public SupportSQLiteOpenHelper delegateOpenHelper;
    private final Runnable executeAutoCloser;
    private final Executor executor;
    private final Handler handler;
    private long lastDecrementRefCountTimeStamp;
    private final Object lock;
    private boolean manuallyClosed;
    private Runnable onAutoCloseCallback;
    private int refCount;

    public AutoCloser(long j2, TimeUnit timeUnit, Executor executor) throws Throwable {
        Intrinsics.checkNotNullParameter(timeUnit, C1561oA.Xd("Ncc_4^bgZJ`e^Oieq", (short) (ZN.Xd() ^ 17183)));
        Intrinsics.checkNotNullParameter(executor, Wg.vd("^sso<fjoZ;o]Tggc_", (short) (FB.Xd() ^ 4144)));
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Qg.kd("IUJWSLF\u000fOR\f)KJJ>J", (short) (ZN.Xd() ^ 27660), (short) (ZN.Xd() ^ 13571))).getDeclaredMethod(hg.Vd("nkyQdkoLnmmam", (short) (Od.Xd() ^ (-338)), (short) (Od.Xd() ^ (-6764))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.lock = new Object();
            this.autoCloseTimeoutInMs = timeUnit.toMillis(j2);
            this.executor = executor;
            this.lastDecrementRefCountTimeStamp = SystemClock.uptimeMillis();
            this.executeAutoCloser = new Runnable() { // from class: androidx.room.AutoCloser$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AutoCloser.executeAutoCloser$lambda$0(this.f$0);
                }
            };
            this.autoCloser = new Runnable() { // from class: androidx.room.AutoCloser$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AutoCloser.autoCloser$lambda$3(this.f$0);
                }
            };
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final SupportSQLiteOpenHelper getDelegateOpenHelper() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.delegateOpenHelper;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        Intrinsics.throwUninitializedPropertyAccessException("delegateOpenHelper");
        return null;
    }

    public final void setDelegateOpenHelper(SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper, "<set-?>");
        this.delegateOpenHelper = supportSQLiteOpenHelper;
    }

    public final Runnable getOnAutoCloseCallback$room_runtime_release() {
        return this.onAutoCloseCallback;
    }

    public final void setOnAutoCloseCallback$room_runtime_release(Runnable runnable) {
        this.onAutoCloseCallback = runnable;
    }

    public final int getRefCount$room_runtime_release() {
        return this.refCount;
    }

    public final void setRefCount$room_runtime_release(int i2) {
        this.refCount = i2;
    }

    public final long getLastDecrementRefCountTimeStamp$room_runtime_release() {
        return this.lastDecrementRefCountTimeStamp;
    }

    public final void setLastDecrementRefCountTimeStamp$room_runtime_release(long j2) {
        this.lastDecrementRefCountTimeStamp = j2;
    }

    public final SupportSQLiteDatabase getDelegateDatabase$room_runtime_release() {
        return this.delegateDatabase;
    }

    public final void setDelegateDatabase$room_runtime_release(SupportSQLiteDatabase supportSQLiteDatabase) {
        this.delegateDatabase = supportSQLiteDatabase;
    }

    public static final void executeAutoCloser$lambda$0(AutoCloser this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.executor.execute(this$0.autoCloser);
    }

    public static final void autoCloser$lambda$3(AutoCloser this$0) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.lock) {
            if (SystemClock.uptimeMillis() - this$0.lastDecrementRefCountTimeStamp < this$0.autoCloseTimeoutInMs) {
                return;
            }
            if (this$0.refCount != 0) {
                return;
            }
            Runnable runnable = this$0.onAutoCloseCallback;
            if (runnable != null) {
                runnable.run();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
            }
            SupportSQLiteDatabase supportSQLiteDatabase = this$0.delegateDatabase;
            if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                supportSQLiteDatabase.close();
            }
            this$0.delegateDatabase = null;
            Unit unit2 = Unit.INSTANCE;
        }
    }

    public final void init(SupportSQLiteOpenHelper delegateOpenHelper) {
        Intrinsics.checkNotNullParameter(delegateOpenHelper, "delegateOpenHelper");
        setDelegateOpenHelper(delegateOpenHelper);
    }

    public final <V> V executeRefCountingFunction(Function1<? super SupportSQLiteDatabase, ? extends V> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke(incrementCountAndEnsureDbIsOpen());
        } finally {
            decrementCountAndScheduleClose();
        }
    }

    public final SupportSQLiteDatabase incrementCountAndEnsureDbIsOpen() {
        synchronized (this.lock) {
            this.handler.removeCallbacks(this.executeAutoCloser);
            this.refCount++;
            if (this.manuallyClosed) {
                throw new IllegalStateException("Attempting to open already closed database.".toString());
            }
            SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
            if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                return supportSQLiteDatabase;
            }
            SupportSQLiteDatabase writableDatabase = getDelegateOpenHelper().getWritableDatabase();
            this.delegateDatabase = writableDatabase;
            return writableDatabase;
        }
    }

    public final void decrementCountAndScheduleClose() {
        synchronized (this.lock) {
            int i2 = this.refCount;
            if (i2 <= 0) {
                throw new IllegalStateException(Xg.qd("\u0013\u0007\tC\b\u0015\u001c\u0016\u001dI\u0014\u001fL]N\u001f#Q\u001f#,\u001b)W\u001b//[4#e2&a69566;..j@<m354D8A:DK", (short) (FB.Xd() ^ 16247), (short) (FB.Xd() ^ 12724)).toString());
            }
            int i3 = i2 - 1;
            this.refCount = i3;
            if (i3 == 0) {
                if (this.delegateDatabase == null) {
                    return;
                }
                Handler handler = this.handler;
                Runnable runnable = this.executeAutoCloser;
                long j2 = this.autoCloseTimeoutInMs;
                Class<?> cls = Class.forName(C1561oA.ud("_k`mib\\%eh\";S_T[S_", (short) (C1580rY.Xd() ^ (-24437))));
                Class<?>[] clsArr = {Class.forName(C1561oA.yd("F>T@\u0006E;IK\u00138\\NOCE82", (short) (C1633zX.Xd() ^ (-1825)))), Long.TYPE};
                Object[] objArr = {runnable, Long.valueOf(j2)};
                Method method = cls.getMethod(C1561oA.Yd("\\\\ac4V^TmZZ", (short) (C1499aX.Xd() ^ (-15627))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void closeDatabaseIfOpen() throws IOException {
        synchronized (this.lock) {
            this.manuallyClosed = true;
            SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
            if (supportSQLiteDatabase != null) {
                supportSQLiteDatabase.close();
            }
            this.delegateDatabase = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean isActive() {
        return !this.manuallyClosed;
    }

    public final int getRefCountForTest$room_runtime_release() {
        int i2;
        synchronized (this.lock) {
            i2 = this.refCount;
        }
        return i2;
    }

    public final void setAutoCloseCallback(Runnable onAutoClose) {
        Intrinsics.checkNotNullParameter(onAutoClose, "onAutoClose");
        this.onAutoCloseCallback = onAutoClose;
    }

    /* JADX INFO: compiled from: AutoCloser.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\u000bu\u000f2YG\u000b%\u0017T.kF~01b\u0002*@C", "", "u(E", "/tc<63Ha\u0019[\u000b`", "", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
