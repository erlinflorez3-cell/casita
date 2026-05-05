package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.internal.ThreadContextKt;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d̉=!4i\bDZc|\u0004G\u00078\u000b<K\u0007\"2\u0017\u007f\u0007tʑAӄLe^.ZS0\u0010s{J$c$wCCU0}*\tUNog\u0005JbŏK\u000f\u0014\"\u0001j2Km\u000bk܈'2png3{om=nuN\u0005N1h=\u0012\u0017\u000fɝBH>u#Cy\u000bB4NrRR;LK\u001f*\u0010L#\u0019\u001e\u000bkv6vk$:GA\u0011nZNU^`\u0001[\u0013^TU\f'e,2X7c\u0014UW\u0011\u000fj[m\u0007\u0006qU7v0?+\u0010}w8^Ü\"\u001f[S\u001b^\u000b&\u000b\u0004\u0002f\u001a2CQyJ~\u001aX\u0002\t\t%B\u0014\u0010\u0016'\u000f8[(-ڝ\u0014\u07baxraOh8lR\u0018z(@7'\u0006đ9CKn_rS\u001d^7\u0002\u0006;0S\u0007|,sV$_C'\u0005\u0002_>iFMJ^\n G\u001c\u00127è\bò\b0U\u0013G\"\u001fB/+G[?$7j0]lk\u0007\u0005fi\u0002{\u0003LN#\u0007\u0016e)9\u0012hZ|\u0007\u0002O\u0003drҊe-b\u001e\u0016\u000e# bxR S%vO\u0017\u00021ܕk*==\u007fO[\u0005j<qa^a4\b\"fСTλ\u0018CTd\u000bst^s\u0018hy@\"`bAݛJԞHN\u0014Ǝ՞C\u0010"}, d2 = {"<df\u0010b9Hc(\u0003\u0004^\n\u0007\u0012>e\u00137", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "1n]AX?M", "/cS2W\nH\\(~\u000em", "6`b\u0010b7RO\u0016\u0006z>3|\u0011/n\u000f6", "", "4n[166IW\u0019\r", "=qX4\\5:Zv\t\u0004m,\u0010\u0018", "/o_2a+\u001c]\"\u000ezq;", "7r=2j\nH`#\u000f\nb5|", "Ehc566K])\u000e~g,Z\u00138t\u007f;\u000b", "\"", "1nd;g\u0016K3 ~\u0003^5\f", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|k\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d3T6kYvF]\u0017k\u0016\u0018,\u001d\u000eWP(xMEhh<R\u007fJl\u000b\u0015`cxQu>g\f\u0011\u0001\u0011~CrRC^_wV\u0017", "Ehc566Gb\u001d\b\u000bZ;\u0001\u00138C\n1\u000b@\u0014&", "1n]A\\5NO(\u0003\u0005g", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bS\u0007<i'*\u0017J7t6g~ef9\u0005r\u00025|1VSR5&W\u0004E]\u0013j\u0017L:\u0011\u000fbOmOT@\u001d\u00170S\u000b\u0006>Dr\u001b\nFf:IR\u0019IC~rF)fU/", "CoS.g,.\\\u0018\u0003\ti(\f\u00072e~\u0006\u0006H\f\u001e\u0017Vs\u0018E", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E0\n\u0016\u001bUz\nKt(5X[*Dw&=QL;A", "=kS#T3NS", "CmS6f7:b\u0017\u0002z]\n\u0007\u0011:l\u007f7\u007fJ\n", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eq\u0001Q\t`\u001bP~\u000eI\u007f!<#[*Dw&=QL;YC\u001a\u0013nBF\u0003k,$", "1na<h;B\\\u0019gvf,", "", "5dc\u0010b9Hc(\u0003\u0004^\u0015x\u0011/", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|kq4H7|0g\u001cdj;PQ;[z0I\"", "\u0012D1\":&-6\u0006^V=&ed\u0017Ey\u0016[+\\\u0004r6Yz", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class CoroutineContextKt {
    private static final String DEBUG_THREAD_NAME_SEPARATOR = " @";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
    private static final CoroutineContext foldCopies(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z2) {
        boolean zHasCopyableElements = hasCopyableElements(coroutineContext);
        boolean zHasCopyableElements2 = hasCopyableElements(coroutineContext2);
        if (!zHasCopyableElements && !zHasCopyableElements2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(EmptyCoroutineContext.INSTANCE, new Function2() { // from class: kotlinx.coroutines.CoroutineContextKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CoroutineContextKt.foldCopies$lambda$1(objectRef, z2, (CoroutineContext) obj, (CoroutineContext.Element) obj2);
            }
        });
        if (zHasCopyableElements2) {
            objectRef.element = ((CoroutineContext) objectRef.element).fold(EmptyCoroutineContext.INSTANCE, new Function2() { // from class: kotlinx.coroutines.CoroutineContextKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CoroutineContextKt.foldCopies$lambda$2((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, kotlin.coroutines.CoroutineContext] */
    public static final CoroutineContext foldCopies$lambda$1(Ref.ObjectRef objectRef, boolean z2, CoroutineContext coroutineContext, CoroutineContext.Element element) {
        if (!(element instanceof CopyableThreadContextElement)) {
            return coroutineContext.plus(element);
        }
        CoroutineContext.Element element2 = ((CoroutineContext) objectRef.element).get(element.getKey());
        if (element2 == null) {
            return coroutineContext.plus(z2 ? ((CopyableThreadContextElement) element).copyForChild() : (CopyableThreadContextElement) element);
        }
        objectRef.element = ((CoroutineContext) objectRef.element).minusKey(element.getKey());
        return coroutineContext.plus(((CopyableThreadContextElement) element).mergeForChild(element2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext foldCopies$lambda$2(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        return element instanceof CopyableThreadContextElement ? coroutineContext.plus(((CopyableThreadContextElement) element).copyForChild()) : coroutineContext.plus(element);
    }

    public static final String getCoroutineName(CoroutineContext coroutineContext) {
        CoroutineId coroutineId;
        String name;
        if (!DebugKt.getDEBUG() || (coroutineId = (CoroutineId) coroutineContext.get(CoroutineId.Key)) == null) {
            return null;
        }
        CoroutineName coroutineName = (CoroutineName) coroutineContext.get(CoroutineName.Key);
        if (coroutineName == null || (name = coroutineName.getName()) == null) {
            name = "coroutine";
        }
        return name + '#' + coroutineId.getId();
    }

    private static final boolean hasCopyableElements(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(false, new Function2() { // from class: kotlinx.coroutines.CoroutineContextKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(CoroutineContextKt.hasCopyableElements$lambda$0(((Boolean) obj).booleanValue(), (CoroutineContext.Element) obj2));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasCopyableElements$lambda$0(boolean z2, CoroutineContext.Element element) {
        return z2 || (element instanceof CopyableThreadContextElement);
    }

    public static final CoroutineContext newCoroutineContext(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        return !hasCopyableElements(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : foldCopies(coroutineContext, coroutineContext2, false);
    }

    public static final CoroutineContext newCoroutineContext(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextFoldCopies = foldCopies(coroutineScope.getCoroutineContext(), coroutineContext, true);
        CoroutineContext coroutineContextPlus = DebugKt.getDEBUG() ? coroutineContextFoldCopies.plus(new CoroutineId(DebugKt.getCOROUTINE_ID().incrementAndGet())) : coroutineContextFoldCopies;
        return (coroutineContextFoldCopies == Dispatchers.getDefault() || coroutineContextFoldCopies.get(ContinuationInterceptor.Key) != null) ? coroutineContextPlus : coroutineContextPlus.plus(Dispatchers.getDefault());
    }

    public static final UndispatchedCoroutine<?> undispatchedCompletion(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof DispatchedCoroutine) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof UndispatchedCoroutine) {
                return (UndispatchedCoroutine) coroutineStackFrame;
            }
        }
        return null;
    }

    public static final UndispatchedCoroutine<?> updateUndispatchedCompletion(Continuation<?> continuation, CoroutineContext coroutineContext, Object obj) {
        if (!(continuation instanceof CoroutineStackFrame) || coroutineContext.get(UndispatchedMarker.INSTANCE) == null) {
            return null;
        }
        UndispatchedCoroutine<?> undispatchedCoroutineUndispatchedCompletion = undispatchedCompletion((CoroutineStackFrame) continuation);
        if (undispatchedCoroutineUndispatchedCompletion != null) {
            undispatchedCoroutineUndispatchedCompletion.saveThreadContext(coroutineContext, obj);
        }
        return undispatchedCoroutineUndispatchedCompletion;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> T withContinuationContext(kotlin.coroutines.Continuation<?> r5, java.lang.Object r6, kotlin.jvm.functions.Function0<? extends T> r7) {
        /*
            kotlin.coroutines.CoroutineContext r4 = r5.getContext()
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r6)
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            if (r3 == r0) goto L12
            kotlinx.coroutines.UndispatchedCoroutine r0 = updateUndispatchedCompletion(r5, r4, r3)
        L10:
            r2 = 1
            goto L14
        L12:
            r0 = 0
            goto L10
        L14:
            java.lang.Object r1 = r7.invoke()     // Catch: java.lang.Throwable -> L2a
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            if (r0 == 0) goto L23
            boolean r0 = r0.clearThreadContext()
            if (r0 == 0) goto L26
        L23:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)
        L26:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            return r1
        L2a:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            if (r0 == 0) goto L36
            boolean r0 = r0.clearThreadContext()
            if (r0 == 0) goto L39
        L36:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)
        L39:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.CoroutineContextKt.withContinuationContext(kotlin.coroutines.Continuation, java.lang.Object, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    public static final <T> T withCoroutineContext(CoroutineContext coroutineContext, Object obj, Function0<? extends T> function0) {
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(coroutineContext, obj);
        try {
            return function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            ThreadContextKt.restoreThreadContext(coroutineContext, objUpdateThreadContext);
            InlineMarker.finallyEnd(1);
        }
    }
}
