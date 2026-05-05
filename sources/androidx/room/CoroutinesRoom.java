package androidx.room;

import android.os.CancellationSignal;
import androidx.sqlite.db.SupportSQLiteCompat;
import com.dynatrace.android.agent.Global;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
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
/* JADX INFO: compiled from: CoroutinesRoom.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0005G\u000bFéLC/\"Z\u00110\u0006g+>6DͿL.`S֜\u0013m"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\ro\r2\fO\u0005 \u0017U\\\u0018F~z", "", "u(E", "\u0011n\\=T5B]\"", "@n^: 2Mf\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CoroutinesRoom {
    public static final Companion Companion = new Companion(null);

    @JvmStatic
    public static final <R> Flow<R> createFlow(RoomDatabase roomDatabase, boolean z2, String[] strArr, Callable<R> callable) {
        return Companion.createFlow(roomDatabase, z2, strArr, callable);
    }

    @JvmStatic
    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z2, CancellationSignal cancellationSignal, Callable<R> callable, Continuation<? super R> continuation) {
        return Companion.execute(roomDatabase, z2, cancellationSignal, callable, continuation);
    }

    @JvmStatic
    public static final <R> Object execute(RoomDatabase roomDatabase, boolean z2, Callable<R> callable, Continuation<? super R> continuation) {
        return Companion.execute(roomDatabase, z2, callable, continuation);
    }

    private CoroutinesRoom() {
    }

    /* JADX INFO: compiled from: CoroutinesRoom.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`\\2şs{B3c$\u007fOC٥\"}8\tWNmhvJp\u000bK\u000f\f\u0017~̚-_ǁ)]@\u000erGu?ݯQoK9)=D\u00068=2?\n\nG\u001dݵL\u0010|~qM,\u00146ϋ~=\u0003\u0011[\n2\u00124DP\u0005,c\u007fNdP\u001dgH8;\tyD^'\u000e;+W=Pb3%|q ;@}8C2\u001a\b\u07baV[M\u0011\b/K\u0014\u0001'm.iu]̬f\u0003D\u00199T%]!,\r\t_g$'YW\u0014Q^\u001e@y\u0011z;M4\u0018\u00143`4=\u001cv\bT6#\u007f\u001aû\u000fڕ]ۍȸ~aD)m3A:Q\u001b-T\u0002=\u001f\u05cbE~5\u0011,(\u0019nOa\u0005\u0012n\u001c3T&Ya[NI`T\u001a[MmJs\u0011\u000fpʾnѓ~\u07fcɨ\u0015.%8ڞ[;+!q\u0019үH{"}, d2 = {"\u001a`]1e6BR,H\bh6\u0005R\ro\r2\fO\u0005 \u0017U\\\u0018F~c\u0013c\u0006+3v\u001a8V\u0019", "", "u(E", "1qT.g,\u001fZ#\u0011", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EA\b!)\u0011P\u0015F\tz", Global.BLANK, "\u001aj^A_0G\u001d\u001e\u0010\u0003(\u0011\u000e\u0011\u001du\u000b3\t@\u000f%\tKv\r:r24gS", "2a", "\u001a`]1e6BR,H\bh6\u0005R\u001co\n0Z<\u0010\u0013\u0014C}\u000e\u0012", "7mC?T5LO\u0017\u000e~h5", "", "B`Q9X\u0015:[\u0019\r", "", "", "1`[9T)ES", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt\u0013Nv\n9}%\u000b", "uKP;W9HW\u0018\u0012Dk6\u0007\u0011xR\n2\u0004\u001f|&\u0013Dk\u001c<L\u001a+@\u0003\u001cHi_5IL=5\"-\"lj;\\J1J\b#\u0011\\]0c\u001cpG\u001d\u0010j\u001b[+\u0016\u0014#\u001f uK3\u001c\u000f,\u001fE\"n\u000b\u001b\u001d\u0012>}:@`\u001dQ\n$yJ)v\u0010Zf\u0004Y\u000b&i4va", "3wT0h;>", "1`]0X3EO(\u0003\u0005g\u001a\u0001\u000b8a\u0007", "\u001a`]1e6BRb\t\t(\nx\u0012-e\u0007/wO\u0005! 5s\u0010Er,\u000b", "uKP;W9HW\u0018\u0012Dk6\u0007\u0011xR\n2\u0004\u001f|&\u0013Dk\u001c<L\u001a\u001cU\u0007\u001fDw\u001a-\u0017MI5\u0012\u001a\u001efa@\u000e_;R\u000105PP5XYH$\u0019\u000ek\n\u0018;\u001c\t`\u000b\"xM5/\u00159I\u000bJ2^\b\u001d\u00151gwB,vM\u0004$|E22Dcl\u0004WPIk*rU='eI>-$m(\u001frY\u0004MbX\r\u0004NCncP\u001bD\"!CmYU\u001b", "uKP;W9HW\u0018\u0012Dk6\u0007\u0011xR\n2\u0004\u001f|&\u0013Dk\u001c<L\u001a\u001c^y137&=QJ\u0005i>'\u0013xnF\u0007l;\u0018T#NSJ)cRH$\u001a\u001ci\u0015R4V\u0003cN.~S;(\b:\u0013_Eq\u0010\u0010\u001f\u001e1ytL_e\u000b`\u001aqR%2MUh{\u0011+Bg*b\u001b5", "@n^: 2Mf\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final <R> Object execute(RoomDatabase roomDatabase, boolean z2, Callable<R> callable, Continuation<? super R> continuation) {
            CoroutineDispatcher transactionDispatcher;
            if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) continuation.getContext().get(TransactionElement.Key);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                transactionDispatcher = z2 ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            return BuildersKt.withContext(transactionDispatcher, new CoroutinesRoom$Companion$execute$2(callable, null), continuation);
        }

        @JvmStatic
        public final <R> Object execute(RoomDatabase roomDatabase, boolean z2, final CancellationSignal cancellationSignal, Callable<R> callable, Continuation<? super R> continuation) throws Throwable {
            CoroutineDispatcher transactionDispatcher;
            if (roomDatabase.isOpenInternal() && roomDatabase.inTransaction()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) continuation.getContext().get(TransactionElement.Key);
            if (transactionElement == null || (transactionDispatcher = transactionElement.getTransactionDispatcher$room_ktx_release()) == null) {
                transactionDispatcher = z2 ? CoroutinesRoomKt.getTransactionDispatcher(roomDatabase) : CoroutinesRoomKt.getQueryDispatcher(roomDatabase);
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            final Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, transactionDispatcher, null, new CoroutinesRoom$Companion$execute$4$job$1(callable, cancellableContinuationImpl2, null), 2, null);
            cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: androidx.room.CoroutinesRoom$Companion$execute$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    CancellationSignal cancellationSignal2 = cancellationSignal;
                    if (cancellationSignal2 != null) {
                        SupportSQLiteCompat.Api16Impl.cancel(cancellationSignal2);
                    }
                    Job.DefaultImpls.cancel$default(jobLaunch$default, (CancellationException) null, 1, (Object) null);
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }

        @JvmStatic
        public final <R> Flow<R> createFlow(RoomDatabase roomDatabase, boolean z2, String[] strArr, Callable<R> callable) {
            return FlowKt.flow(new CoroutinesRoom$Companion$createFlow$1(z2, roomDatabase, strArr, callable, null));
        }
    }
}
