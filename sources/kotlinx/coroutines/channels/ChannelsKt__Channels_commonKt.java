package kotlinx.coroutines.channels;

import com.dynatrace.android.agent.Global;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.selects.SelectClause1;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!,u\bDJc|\u0004Oي8\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JfP.hS2\u000f\u0002{<$a$yCIU\"}(\nWNu\u0006vJ`\u000bK\u000f\u0014\u0017\u0001̓Dkcxu\u0014%1\tp_9SڎK:\ttd\u0007H82:\n\u0005G\u001bXKV͔9ŲO\f 4X\u0013HW%U\u0015\u001e\"\bT\u001fG\u001f\u000bmn<NǍk;W#1kjT7a@|\u0014\u000etWm\u0012\u000f0,2X7{\u001dEU\tޗ`\\_\u0005EpK\r\u0011-7-Ys\u001e7\u0007\u0003D09X%t\u0003.l\u000bab\u001c'qP\u0012N`\u00108wA\u0004;FǬ\u0012\u0006-Stƭ ǔ\b\u0016;zxRPP\u0010]`~ѐe6%1\u0018c9F3f\u007fo[\u001bTљ\n\u00065$3\u0003~!\"U<cE+b\u0007i=aBMH\u0015\u000bi?}\u0004\u001fp04JΉ\u000eĬ3{\u001f>/GElQ)1m\u0012H\u000bh%\u0017\u0001jY֟`Ih(~\u0018G*O\r\tG+ʔ*ÏXX:\u0015e4b\u001a\u0016\bA.\u0005{L!+\u0011|R\u0019oxau\f;.\u0015L m\f\u001aeުv3cP:߅4؏z\u0014GֺО\tn"}, d2 = {"\u0012D5\u000eH\u0013-MvedL\fvp\u000fSm\u0004] ", "", "@dR2\\=>=&g\u000be3", "\u0013", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00125W}$Hms1ILDk;s", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\"Y{ ;~\u0016\fP?Dt4%jOgC\u0016j0W@%QYX<kV{=\"[8\u0018W:\u0011\u000ei=3rN@tK\u0013N}LdJ\u0013\u0012\u001774Z?[\u0010E\tj", "=mA2V,Bd\u0019h\bG<\u0004\u0010", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6EN\u0001\u001e\u0017E~\u001c\u0006d%<Y{/\u0015t\u0012>[C\u0007A", "1n]@h4>", Global.BLANK, "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\"Y{ ;~\u0016\fP?Dt4%jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0003tK\u0013N}LdJ\u0013\u0012\u001774Z?[\u0010E\tj", "1n]@h4>3\u0015|}", "", "/bc6b5", "uKZ<g3B\\,Hxh9\u0007\u0019>i\t(\n\n~\u001a\u0013Px\u000eC\u0005n\"Y{ ;~\u0016\fP?Dt4%jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0003tn2S\u0011Bl\nU\u0014\u0018Bt\u0001QZ\u0019G\b^SK2wJbouVEOk\u007f(rd\u0019m6\u0004+\u0010z\u001bdRM3\nybf", "Bn;6f;", "", "1`]0X3\u001c]\"\r\u000bf,{", "1`d@X", "", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 5, mv = {2, 0, 0}, pn = "", xi = 48, xs = ">AE<8<Ez.9;7<:.2(5o#'\u001f+* &,fy\u001e\u0016\"!\u0017\u001d#y\"")
final /* synthetic */ class ChannelsKt__Channels_commonKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 176, xs = "")
    static final class AnonymousClass1<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelsKt__Channels_commonKt.consumeEach(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    static final class C13881<E> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C13881(Continuation<? super C13881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return ChannelsKt.toList(null, this);
        }
    }

    public static final void cancelConsumed(ReceiveChannel<?> receiveChannel, Throwable th) {
        if (th != null) {
            CancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            if (CancellationException == null) {
                CancellationException = ExceptionsKt.CancellationException("Channel was consumed, consumer had failed", th);
            }
        }
        receiveChannel.cancel(CancellationException);
    }

    public static final <E, R> R consume(ReceiveChannel<? extends E> receiveChannel, Function1<? super ReceiveChannel<? extends E>, ? extends R> function1) {
        try {
            R rInvoke = function1.invoke(receiveChannel);
            InlineMarker.finallyStart(1);
            ChannelsKt.cancelConsumed(receiveChannel, null);
            InlineMarker.finallyEnd(1);
            return rInvoke;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0064 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:61:0x0059, B:62:0x005c, B:64:0x0064, B:57:0x0049, B:66:0x006d), top: B:76:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006d A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #0 {all -> 0x007b, blocks: (B:61:0x0059, B:62:0x005c, B:64:0x0064, B:57:0x0049, B:66:0x006d), top: B:76:0x0059 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0058 -> B:62:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r6, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.AnonymousClass1
            if (r0 == 0) goto L34
            r5 = r8
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 r5 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.AnonymousClass1) r5
            int r0 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L34
            int r0 = r5.label
            int r0 = r0 - r2
            r5.label = r0
        L19:
            java.lang.Object r0 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r3 = 0
            r2 = 1
            if (r1 == 0) goto L42
            if (r1 != r2) goto L3a
            java.lang.Object r1 = r5.L$2
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r6 = r5.L$1
            kotlinx.coroutines.channels.ReceiveChannel r6 = (kotlinx.coroutines.channels.ReceiveChannel) r6
            java.lang.Object r7 = r5.L$0
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            goto L59
        L34:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 r5 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1
            r5.<init>(r8)
            goto L19
        L3a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L42:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.channels.ChannelIterator r1 = r6.iterator()     // Catch: java.lang.Throwable -> L7d
        L49:
            r5.L$0 = r7     // Catch: java.lang.Throwable -> L7b
            r5.L$1 = r6     // Catch: java.lang.Throwable -> L7b
            r5.L$2 = r1     // Catch: java.lang.Throwable -> L7b
            r5.label = r2     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r1.hasNext(r5)     // Catch: java.lang.Throwable -> L7b
            if (r0 != r4) goto L58
            goto L6c
        L58:
            goto L5c
        L59:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L7b
        L5c:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L7b
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L7b
            r7.invoke(r0)     // Catch: java.lang.Throwable -> L7b
            goto L49
        L6c:
            return r4
        L6d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7b
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r3)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L7b:
            r1 = move-exception
            goto L7e
        L7d:
            r1 = move-exception
        L7e:
            throw r1     // Catch: java.lang.Throwable -> L7f
        L7f:
            r0 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r6, r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.consumeEach(kotlinx.coroutines.channels.ReceiveChannel, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final <E> Object consumeEach$$forInline(ReceiveChannel<? extends E> receiveChannel, Function1<? super E, Unit> function1, Continuation<? super Unit> continuation) {
        try {
            ChannelIterator<? extends E> it = receiveChannel.iterator();
            while (true) {
                InlineMarker.mark(3);
                InlineMarker.mark(0);
                Object objHasNext = it.hasNext(null);
                InlineMarker.mark(1);
                if (!((Boolean) objHasNext).booleanValue()) {
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                    ChannelsKt.cancelConsumed(receiveChannel, null);
                    InlineMarker.finallyEnd(1);
                    return Unit.INSTANCE;
                }
                function1.invoke(it.next());
            }
        } finally {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0007K\fGvw\u0016k]Kg\u0004^T@Va\f\u000f(\u001bw!d6Ut*\u0015\u00042XmOiKcaK:Z!;C ]\u0013")
    @InterfaceC1492Gx
    public static final /* synthetic */ SelectClause1 onReceiveOrNull(ReceiveChannel receiveChannel) {
        Intrinsics.checkNotNull(receiveChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.onReceiveOrNull?>");
        return receiveChannel.getOnReceiveOrNull();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0007K\fGvw\u0016k]Kg\u0004^T@Va\f\u000f(\u001bw!d6Ut*\u0015\u0007)imUzG0]|<N'AAX", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @InterfaceC1492Gx
    public static final /* synthetic */ Object receiveOrNull(ReceiveChannel receiveChannel, Continuation continuation) {
        Intrinsics.checkNotNull(receiveChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.receiveOrNull?>");
        return receiveChannel.receiveOrNull(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006c A[Catch: all -> 0x007e, TryCatch #3 {all -> 0x007e, blocks: (B:64:0x0061, B:65:0x0064, B:67:0x006c, B:68:0x0074), top: B:86:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0074 A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #3 {all -> 0x007e, blocks: (B:64:0x0061, B:65:0x0064, B:67:0x006c, B:68:0x0074), top: B:86:0x0061 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0060 -> B:65:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <E> java.lang.Object toList(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r8, kotlin.coroutines.Continuation<? super java.util.List<? extends E>> r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.C13881
            if (r0 == 0) goto L35
            r7 = r9
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 r7 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.C13881) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L35
            int r0 = r7.label
            int r0 = r0 - r1
            r7.label = r0
        L16:
            java.lang.Object r0 = r7.result
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r5 = 0
            r4 = 1
            if (r1 == 0) goto L43
            if (r1 != r4) goto L3b
            java.lang.Object r3 = r7.L$3
            kotlinx.coroutines.channels.ChannelIterator r3 = (kotlinx.coroutines.channels.ChannelIterator) r3
            java.lang.Object r8 = r7.L$2
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r2 = r7.L$1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r7.L$0
            java.util.List r1 = (java.util.List) r1
            goto L61
        L35:
            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 r7 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1
            r7.<init>(r9)
            goto L16
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L43:
            kotlin.ResultKt.throwOnFailure(r0)
            java.util.List r2 = kotlin.collections.CollectionsKt.createListBuilder()
            kotlinx.coroutines.channels.ChannelIterator r3 = r8.iterator()     // Catch: java.lang.Throwable -> L82
            r1 = r2
        L4f:
            r7.L$0 = r1     // Catch: java.lang.Throwable -> L80
            r7.L$1 = r2     // Catch: java.lang.Throwable -> L80
            r7.L$2 = r8     // Catch: java.lang.Throwable -> L80
            r7.L$3 = r3     // Catch: java.lang.Throwable -> L80
            r7.label = r4     // Catch: java.lang.Throwable -> L80
            java.lang.Object r0 = r3.hasNext(r7)     // Catch: java.lang.Throwable -> L80
            if (r0 != r6) goto L60
            return r6
        L60:
            goto L64
        L61:
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L7e
        L64:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L7e
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L74
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L7e
            r2.add(r0)     // Catch: java.lang.Throwable -> L7e
            goto L4f
        L74:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7e
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r5)
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r1)
            return r0
        L7e:
            r1 = move-exception
            goto L83
        L80:
            r1 = move-exception
            goto L83
        L82:
            r1 = move-exception
        L83:
            throw r1     // Catch: java.lang.Throwable -> L84
        L84:
            r0 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.toList(kotlinx.coroutines.channels.ReceiveChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
