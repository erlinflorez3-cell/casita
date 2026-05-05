package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.selects.SelectClause0;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\f6B\r.4\u0012}\nnjG9LeN4ZS8\u000fs{:$c$\bCCU \u007f*\teNog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4կ]xs\u0012\u00172XoG3[pE9vt>\u0005&9*8\u0010\u0005\t\u001a0J\u0018v\u0011CSÈ\u001a0VpBR\u0013M\u000b\u074c\u0012\u001c̄P\u0001L[\u0018NdH-d@/ݭ\u0007kHO5ax\u0003[\u001e^TU\u0017=vf7NIM\u0015SfIޯ\u0011ÜC\u0003M\u0006\u0006\u0014vA?/w\u0010@67\u001bZ*ۣS\rk\u0010n\u0011\u0013ox\fUJ\u007f\tYp&I\b\u000e\f\u001eR\u0003<)όL83>v\u000e\u0014X\u0005tYFv(nD\u0010z\u0010IEGh3\nZa{Ђe;'u\u007f@\u0013+6#/\u000eQ_b6x\u0015I^(U?zX=vX:~K\u000e\u001c\u0012r\u0015:\u0015FF.Rɨ\u00158\u001dIGa?H1m\bNj\u000e\u0007\u0007ph\u0002|\u0001j)\"M7}?Á\u0010ZR\u000fM\u0007^\u007fp,?`L`\u0015$ \u001b6[&X\n'&M.\u00040\u007fܷa\n3[/Gg\u001a\u0004\u000e\u0006C\u000f9Cw{\u0012wQ%7\u0006Q+\u0013f\u0019ZS:\u000e\r,0f`j>-BY\u0017\u0012!hWqJ8rEih#K\u001b\u001epESȄ2˖l\u0010\u0007Ԟ\u0004>\u0011n<v\u001f\u007f~\\'D>ֆKض\u0001j2/GWC\u001b>W(oB\u0005s\u001f\r|\u0018G\u0016V}!C\u05cdwʀ\u007f*&\u001c?\\=?+\u0011\u00052@\u000e}]Z\u007f}Q{\u001c]OSɂ\u0011³l8w\np~:b\u0003LUa%.Gv\u00012 d.\u0004\u0018\u001bQĊeӝ\u000feNKx\u0013g>f:\u0003\u0014-*u\u0019}7\u00155[Y]qlߨ\u0016ڏ\u0019kmkuE\bd'(z}\u0012E44}\u0010icB=HI\b~lPZAY݁Jܖ{\u0012R\u000b:<AJYfv\u0007F~\u07fb35"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E)\u000b tCx\f<},1V\u0005 \r", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqW=\u000f&$Cm\u001d\u001a\u00012?i\r$@ms8VR;~C}\u001chi9\u0010r\u0002", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E%\u000b\u0014l", "\nh]6g\u0005", "u(E", ";db@T.>", "", ">`a2a;", "5dc\u001dT9>\\(=vg5\u0007\u0018+t\u00042\u0005N", "5dc\u001dT9>\\(", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ{!DE", "7r00g0OS", "", "7r00g0OSWz\u0004g6\f\u0005>i\n1\n", "u(I", "7r2<`7ES(~y", "7r2<`7ES(~y\u001d(\u0006\u00129t{7\u007fJ\n%", "7r2.a*>Z ~y", "7r2.a*>Z ~y\u001d(\u0006\u00129t{7\u007fJ\n%", "AsP?g", "8nX;", "", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "=m9<\\5", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0006A", "5dc\u001ca\u0011HW\"=vg5\u0007\u0018+t\u00042\u0005N", "5dc\u001ca\u0011HW\"", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJ%\u0017No\fK\u0005n#Y\u0005 5|s5ISIk~s", "5dc\u0010T5<S \u0006vm0\u0007\u0012\u000fx}(\u0007O\u0005! ", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e| \u0015Gv\u00158\u0006)?b]35m!=QMDA", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt\u0013Pm\u000eC}!D]\b)\u0017\u0001\u0014.XR?u=s", "u(;7T=:\u001d)\u000e~euz\u00138c\u00105\t@\n&`%k\u0017:v,<U\r$AvuAKCFz8(\u001e>", "7me<^,(\\v\t\u0003i3|\u00183o\t", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001f\u0005%\"Q}\n9}%\u0018U\u0007\u001f>mk", "6`]1_,K", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b\u001f\"No\u001d@\u0001.\u0018U\u0007\u001f>m#\u0004", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1`d@X", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc\u001es =TGD~}\u001c\u001fukI\u0016g5N\u0005p&P\\7f`n:\u001b\u0012=\nW*\u0014\u0005/", "=m2.a*>Z \u0003\u0004`", "7me<^,\"[!~yb(\f\t6y", "uYI\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1|4WRBo=1^fkF\u0011s;R\u007f'U\u0016-0j]|K\u0010\u000fa\u000e1'\u0016\u0004`Ay", "1`]0X3", "uKY.i(\bc(\u0003\u0002(*\u0007\u0012-u\r5{I\u0010`tCx\f<},1h\u0002*@M),MNJo>'j,R", "1gX9W9>\\", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "5dc\u0010[0ER&~\u0004\u001d(\u0006\u00129t{7\u007fJ\n%", "5dc\u0010[0ER&~\u0004", "u(;8b;EW\"H\t^8\r\t8c\u007f6E.\u0001#'Gx\f<L", "/sc.V/\u001cV\u001d\u0006y", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u0004\u001b\u001eFR\nEu,5/", "1gX9W", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u0004\u001b\u001eFT\u00189L", "BnBAe0GU", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class NonCancellable extends AbstractCoroutineContextElement implements Job {
    public static final NonCancellable INSTANCE = new NonCancellable();
    private static final String message = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    private NonCancellable() {
        super(Job.Key);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0011U\n\u0018r\u0003\u0018\\dS)|\\\u001akQ]ZH)\n(!e{J.y\\\u0001=&i_$C[\u001ciKM3@? j\f\u007f1j\b\u0002|GH\u001anV\"X \u000fHH>Ks@.P\u0001\u0010\u001d7\u001b|O\u0015R:P4g:g\u0003z4\fW;!\b'\u0004 8\u000e#\u001e\rBf\u0017$")
    @InterfaceC1492Gx
    public static /* synthetic */ void getChildren$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0011U\n\u0018r\u0003\u0018\\dS)|\\\u001akQ]ZH)\n(!e{J.y\\\u0001=&i_$C[\u001ciKM3@? j\f\u007f1j\b\u0002|GH\u001anV\"X \u000fHH>Ks@.P\u0001\u0010\u001d7\u001b|O\u0015R:P4g:g\u0003z4\fW;!\b'\u0004 8\u000e#\u001e\rBf\u0017$")
    @InterfaceC1492Gx
    public static /* synthetic */ void getOnJoin$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0011U\n\u0018r\u0003\u0018\\dS)|\\\u001akQ]ZH)\n(!e{J.y\\\u0001=&i_$C[\u001ciKM3@? j\f\u007f1j\b\u0002|GH\u001anV\"X \u000fHH>Ks@.P\u0001\u0010\u001d7\u001b|O\u0015R:P4g:g\u0003z4\fW;!\b'\u0004 8\u000e#\u001e\rBf\u0017$")
    @InterfaceC1492Gx
    public static /* synthetic */ void getParent$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0011U\n\u0018r\u0003\u0018\\dS)|\\\u001akQ]ZH)\n(!e{J.y\\\u0001=&i_$C[\u001ciKM3@? j\f\u007f1j\b\u0002|GH\u001anV\"X \u000fHH>Ks@.P\u0001\u0010\u001d7\u001b|O\u0015R:P4g:g\u0003z4\fW;!\b'\u0004 8\u000e#\u001e\rBf\u0017$")
    @InterfaceC1492Gx
    public static /* synthetic */ void isActive$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0011U\n\u0018r\u0003\u0018\\dS)|\\\u001akQ]ZH)\n(!e{J.y\\\u0001=&i_$C[\u001ciKM3@? j\f\u007f1j\b\u0002|GH\u001anV\"X \u000fHH>Ks@.P\u0001\u0010\u001d7\u001b|O\u0015R:P4g:g\u0003z4\fW;!\b'\u0004 8\u000e#\u001e\rBf\u0017$")
    @InterfaceC1492Gx
    public static /* synthetic */ void isCancelled$annotations() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0011U\n\u0018r\u0003\u0018\\dS)|\\\u001akQ]ZH)\n(!e{J.y\\\u0001=&i_$C[\u001ciKM3@? j\f\u007f1j\b\u0002|GH\u001anV\"X \u000fHH>Ks@.P\u0001\u0010\u001d7\u001b|O\u0015R:P4g:g\u0003z4\fW;!\b'\u0004 8\u000e#\u001e\rBf\u0017$")
    @InterfaceC1492Gx
    public static /* synthetic */ void isCompleted$annotations() {
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0011U\n\u0018r\u0003\u0018\\dS)|\\\u001akQ]ZH)\n(!e{J.y\\\u0001=&i_$C[\u001ciKM3@? j\f\u007f1j\b\u0002|GH\u001anV\"X \u000fHH>Ks@.P\u0001\u0010\u001d7\u001b|O\u0015R:P4g:g\u0003z4\fW;!\b'\u0004 8\u000e#\u001e\rBf\u0017$")
    @InterfaceC1492Gx
    public ChildHandle attachChild(ChildJob childJob) {
        return NonDisposableHandle.INSTANCE;
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016O\n8v4e%*\u0015wF\u0010\u00175\\]^\"f\bw\u0019bwZwlW\u0001-z\u0002\f{Kad(OK0FC!d_9}5\b\f3\u000f\u0002*")
    @InterfaceC1492Gx
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0011U\n\u0018r\u0003\u0018\\dS)|\\\u001akQ]ZH)\n(!e{J.y\\\u0001=&i_$C[\u001ciKM3@? j\f\u007f1j\b\u0002|GH\u001anV\"X \u000fHH>Ks@.P\u0001\u0010\u001d7\u001b|O\u0015R:P4g:g\u0003z4\fW;!\b'\u0004 8\u000e#\u001e\rBf\u0017$")
    @InterfaceC1492Gx
    public void cancel(CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0016O\n8v4e%*\u0015wF\u0010\u00175\\]^\"f\bw\u0019bwZwlW\u0001-z\u0002\f{Kad(OK0FC!d_9}5\b\f3\u000f\u0002*")
    @InterfaceC1492Gx
    public /* synthetic */ boolean cancel(Throwable th) {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0011U\n\u0018r\u0003\u0018\\dS)|\\\u001akQ]ZH)\n(!e{J.y\\\u0001=&i_$C[\u001ciKM3@? j\f\u007f1j\b\u0002|GH\u001anV\"X \u000fHH>Ks@.P\u0001\u0010\u001d7\u001b|O\u0015R:P4g:g\u0003z4\fW;!\b'\u0004 8\u000e#\u001e\rBf\u0017$")
    @InterfaceC1492Gx
    public CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public Sequence<Job> getChildren() {
        return SequencesKt.emptySequence();
    }

    @Override // kotlinx.coroutines.Job
    public SelectClause0 getOnJoin() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    public Job getParent() {
        return null;
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0011U\n\u0018r\u0003\u0018\\dS)|\\\u001akQ]ZH)\n(!e{J.y\\\u0001=&i_$C[\u001ciKM3@? j\f\u007f1j\b\u0002|GH\u001anV\"X \u000fHH>Ks@.P\u0001\u0010\u001d7\u001b|O\u0015R:P4g:g\u0003z4\fW;!\b'\u0004 8\u000e#\u001e\rBf\u0017$")
    @InterfaceC1492Gx
    public DisposableHandle invokeOnCompletion(Function1<? super Throwable, Unit> function1) {
        return NonDisposableHandle.INSTANCE;
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0011U\n\u0018r\u0003\u0018\\dS)|\\\u001akQ]ZH)\n(!e{J.y\\\u0001=&i_$C[\u001ciKM3@? j\f\u007f1j\b\u0002|GH\u001anV\"X \u000fHH>Ks@.P\u0001\u0010\u001d7\u001b|O\u0015R:P4g:g\u0003z4\fW;!\b'\u0004 8\u000e#\u001e\rBf\u0017$")
    @InterfaceC1492Gx
    public DisposableHandle invokeOnCompletion(boolean z2, boolean z3, Function1<? super Throwable, Unit> function1) {
        return NonDisposableHandle.INSTANCE;
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCompleted() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0011U\n\u0018r\u0003\u0018\\dS)|\\\u001akQ]ZH)\n(!e{J.y\\\u0001=&i_$C[\u001ciKM3@? j\f\u007f1j\b\u0002|GH\u001anV\"X \u000fHH>Ks@.P\u0001\u0010\u001d7\u001b|O\u0015R:P4g:g\u0003z4\fW;!\b'\u0004 8\u000e#\u001e\rBf\u0017$")
    @InterfaceC1492Gx
    public Object join(Continuation<? super Unit> continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0012V\u0001Gr\t$i\u0018\u000erA\u0010$:\u000epc\u0018fnw\u000e\u0012\u0006HxoQ\t7&q_$OR]vBT%??%i\u001a9\fgJznQs\u0013KJ#V*\fH\u000b\u0001\u0011/:+Y\u0012\u0001u6G\u0001T\u0015L\u007fOBg2aszSfn;)\taEO9\u0004/a\u001eN_Q//CIf\u000f&8\u0001Aeo\u000b4+aHG\u0003.n8W\u0003\u0014\u0012Ci\u0004,W%\u0017}'':B\fV<\u000bS]=\u0003m0\\hg6 .w\u0012*\u0018xh\u000el\n{o\u000e.LvU\u001a]-2 Y?\u0011\u0001;WNaoS%nY%\u000f{\"Em1S:&\u0002")
    @InterfaceC1492Gx
    public Job plus(Job job) {
        return Job.DefaultImpls.plus((Job) this, job);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0011U\n\u0018r\u0003\u0018\\dS)|\\\u001akQ]ZH)\n(!e{J.y\\\u0001=&i_$C[\u001ciKM3@? j\f\u007f1j\b\u0002|GH\u001anV\"X \u000fHH>Ks@.P\u0001\u0010\u001d7\u001b|O\u0015R:P4g:g\u0003z4\fW;!\b'\u0004 8\u000e#\u001e\rBf\u0017$")
    @InterfaceC1492Gx
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }
}
