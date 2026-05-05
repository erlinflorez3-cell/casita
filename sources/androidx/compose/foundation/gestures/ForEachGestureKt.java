package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: ForEachGesture.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d̉=!,r\bDZc|İI\u0006>\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lkA0ZeP.hS2\u000fyڔ<$q$yCAV2\b0ޛgN\u0016f\u0017J\t\u000b\nƤ\u001e&\u0007kDI\u0004z\u0006\u0012=2\tĤ}ݯQoK<x\u0005D\u000682P:\"\u0005/\u001epϻNͯ~CY\u0011*iNvRR;O-\u001a@\nnE\u000f%t\tT5Xnm:]#\u0013qRT7a@|{\u000ft]7\u0011\u0007c4*nAc\u001dȏW\u0003\r]\"αAӭu=\u0013t?`9V\fWdZ(\u0014C/\u007f2ky>}\u000bPp\u000e7+}g[X\u001e.\b|\f\rj\u0006<\u000f7L>/0e6\u0018a|ɤW@V\r%ە>ѐe6%1ŗ79"}, d2 = {"/k[\u001db0Gb\u0019\f\tN7", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002", "/vP6g\bEZ\u0004\t~g;|\u0016=U\u000b", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7q@IGJV>\"\u001ewaFft,W\u0006\u0015EVY,29xG#\u0019^\u0017\u0018)\u0017\u0012cQ3rM7-Q\nS\u000bJl\n\u001c\u0012\u001d9ty\u0018\u001avLu&q\u000b0dO[)cDFE`9:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHta6Yv|.RX;cV{\u0007\u0012\u001cg\u0018^:\u0011\u000eYOmLN@.\f5Y}Jl\u000b\u0015kQ\u001colSRYNu\u001ew\u000b\u0013eKY]\t\u001d", "/vP6g\f:Q\u001c`zl;\r\u0016/", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHta6Yv|.RX;cV{\u0007\u0019#bWO;\u0016\u0003hE.wR\u0001\u007f\u00185G\u0011?r\nXkt;t\u007fIZ\u0019\u0011w\u001f\u0003K9wJb_\b\u0011\u001fOk9h\u0015o\u0019k>D-i5\u007f da*S\u0003O\u001at\u001ccdlG\u0017\n\u000e", "4na\u0012T*A5\u0019\r\nn9|", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ForEachGestureKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 */
    /* JADX INFO: compiled from: ForEachGesture.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUn\u0019\u001dp\u000e\u0011\u0017v\u0016%')'\u001b\u0002,", f = "\u0013;=\u000f*+/\r*7773%l)1", i = {0}, l = {86}, m = "0G2;G\u0015AB'GBHOAOQ4P", n = {"\u0013jjOe\u001aC^7CZ\u000bCF\u000f5\u001c%6\f$*{\u001b"}, s = {"xQ^"})
    static final class AnonymousClass3 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return ForEachGestureKt.awaitAllPointersUp((AwaitPointerEventScope) null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 */
    /* JADX INFO: compiled from: ForEachGesture.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUn\u0019\u001dp\u000e\u0011\u0017v\u0016%')'\u001b\u0002,", f = "\u0013;=\u000f*+/\r*7773%l)1", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {48, 51, 56}, m = "5?C\u001747=\u001d<KMOMA", n = {"\u0013jjOe\u001aHVH\u001fG-?!$9',4\f", "QbqI]", "RktXWdV*EHZ/ON", "\u0013jjOe\u001aHVH\u001fG-?!$9',4\f", "QbqI]", "RktXWdV*EHZ/ON", "\u0013jjOe\u001aHVH\u001fG-?!$9',4\f", "QbqI]", "RktXWdV*EHZ/ON"}, s = {"xQ^", "xQ_", "xQ`", "xQ^", "xQ_", "xQ`", "xQ^", "xQ_", "xQ`"})
    static final class AnonymousClass1 extends ContinuationImpl {
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
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return ForEachGestureKt.forEachGesture(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x007b -> B:58:0x0038). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0091 -> B:58:0x0038). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(message = "\u0018Y\u0001tr\f\u0016`l,)}X{1apa\u001b,Dq\u001ae\u000bKon\u001c4*uz1eEUCmLZ3E?Y\u001f\f|#f\b?wMDQ\u0011]\u0019R/\ns\u0004w \u0007<!Y=\u0003b5\u001c\u0011Z\u0015RH", replaceWith = @kotlin.ReplaceWith(expression = "awaitEachGesture(block)", imports = {}))
    @yg.InterfaceC1492Gx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object forEachGesture(androidx.compose.ui.input.pointer.PointerInputScope r8, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass1
            if (r0 == 0) goto L9c
            r7 = r10
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r7 = (androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L9c
            int r0 = r7.label
            int r0 = r0 - r1
            r7.label = r0
        L16:
            java.lang.Object r1 = r7.result
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r7.label
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L94
            if (r0 == r3) goto L60
            if (r0 == r4) goto L50
            if (r0 != r5) goto La6
            java.lang.Object r2 = r7.L$2
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            java.lang.Object r9 = r7.L$1
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            java.lang.Object r8 = r7.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r8 = (androidx.compose.ui.input.pointer.PointerInputScope) r8
            kotlin.ResultKt.throwOnFailure(r1)
        L38:
            boolean r0 = kotlinx.coroutines.JobKt.isActive(r2)
            if (r0 == 0) goto La3
            r7.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L4e
            r7.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L4e
            r7.L$2 = r2     // Catch: java.util.concurrent.CancellationException -> L4e
            r7.label = r3     // Catch: java.util.concurrent.CancellationException -> L4e
            java.lang.Object r0 = r9.invoke(r8, r7)     // Catch: java.util.concurrent.CancellationException -> L4e
            if (r0 != r6) goto L4d
            return r6
        L4d:
            goto L6f
        L4e:
            r1 = move-exception
            goto L7f
        L50:
            java.lang.Object r2 = r7.L$2
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            java.lang.Object r9 = r7.L$1
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            java.lang.Object r8 = r7.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r8 = (androidx.compose.ui.input.pointer.PointerInputScope) r8
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.util.concurrent.CancellationException -> L7e
            goto L38
        L60:
            java.lang.Object r2 = r7.L$2
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            java.lang.Object r9 = r7.L$1
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            java.lang.Object r8 = r7.L$0
            androidx.compose.ui.input.pointer.PointerInputScope r8 = (androidx.compose.ui.input.pointer.PointerInputScope) r8
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.util.concurrent.CancellationException -> L7e
        L6f:
            r7.L$0 = r8     // Catch: java.util.concurrent.CancellationException -> L7e
            r7.L$1 = r9     // Catch: java.util.concurrent.CancellationException -> L7e
            r7.L$2 = r2     // Catch: java.util.concurrent.CancellationException -> L7e
            r7.label = r4     // Catch: java.util.concurrent.CancellationException -> L7e
            java.lang.Object r0 = awaitAllPointersUp(r8, r7)     // Catch: java.util.concurrent.CancellationException -> L7e
            if (r0 != r6) goto L38
            return r6
        L7e:
            r1 = move-exception
        L7f:
            boolean r0 = kotlinx.coroutines.JobKt.isActive(r2)
            if (r0 == 0) goto Lae
            r7.L$0 = r8
            r7.L$1 = r9
            r7.L$2 = r2
            r7.label = r5
            java.lang.Object r0 = awaitAllPointersUp(r8, r7)
            if (r0 != r6) goto L38
            return r6
        L94:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.coroutines.CoroutineContext r2 = r7.getContext()
            goto L38
        L9c:
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r7 = new androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            r7.<init>(r10)
            goto L16
        La3:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        La6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lae:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.forEachGesture(androidx.compose.ui.input.pointer.PointerInputScope, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean allPointersUp(AwaitPointerEventScope awaitPointerEventScope) {
        List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
        int size = changes.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (changes.get(i2).getPressed()) {
                z2 = true;
                break;
            }
            i2++;
        }
        return !z2;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$2 */
    /* JADX INFO: compiled from: ForEachGesture.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUn\u0019\u001dp\u000e\u0011\u0017v\u0016%')'\u001b\u0002,\\\u001b2\u001d&2\u007f,-\u00122-3:,:<\u001f;o~", f = "\u0013;=\u000f*+/\r*7773%l)1", i = {}, l = {77}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ForEachGestureKt.awaitAllPointersUp((AwaitPointerEventScope) this.L$0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Object awaitAllPointersUp(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new AnonymousClass2(null), continuation);
        return objAwaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitPointerEventScope : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x005d, code lost:
    
        if (allPointersUp(r7) == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0050 -> B:40:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object awaitAllPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass3
            if (r0 == 0) goto L60
            r6 = r8
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r6 = (androidx.compose.foundation.gestures.ForEachGestureKt.AnonymousClass3) r6
            int r0 = r6.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L60
            int r0 = r6.label
            int r0 = r0 - r2
            r6.label = r0
        L19:
            java.lang.Object r1 = r6.result
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L56
            if (r0 != r4) goto L66
            java.lang.Object r7 = r6.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r7 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r7
            kotlin.ResultKt.throwOnFailure(r1)
        L2d:
            androidx.compose.ui.input.pointer.PointerEvent r1 = (androidx.compose.ui.input.pointer.PointerEvent) r1
            java.util.List r3 = r1.getChanges()
            int r2 = r3.size()
            r1 = 0
        L38:
            if (r1 >= r2) goto L6e
            java.lang.Object r0 = r3.get(r1)
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
            boolean r0 = r0.getPressed()
            if (r0 == 0) goto L53
        L46:
            androidx.compose.ui.input.pointer.PointerEventPass r0 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r6.L$0 = r7
            r6.label = r4
            java.lang.Object r1 = r7.awaitPointerEvent(r0, r6)
            if (r1 != r5) goto L2d
            return r5
        L53:
            int r1 = r1 + 1
            goto L38
        L56:
            kotlin.ResultKt.throwOnFailure(r1)
            boolean r0 = allPointersUp(r7)
            if (r0 != 0) goto L6e
            goto L46
        L60:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r6 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r6.<init>(r8)
            goto L19
        L66:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L6e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2 */
    /* JADX INFO: compiled from: ForEachGesture.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUn\u0019\u001dp\u000e\u0011\u0017v\u0016%')'\u001b\u0002,\\\u001b2\u001d&2\u0004!$*\n)8:<:.m|", f = "\u0013;=\u000f*+/\r*7773%l)1", i = {0, 1, 2}, l = {104, 107, PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aC^7CZ\u001aFC-:\u0018)\u0007\u001d\u0017%\u001b}y\n\u0017g", "\u0013jjOe\u001aC^7CZ\u001aFC-:\u0018)\u0007\u001d\u0017%\u001b}y\n\u0017g", "\u0013jjOe\u001aC^7CZ\u001aFC-:\u0018)\u0007\u001d\u0017%\u001b}y\n\u0017g"}, s = {"xQ^", "xQ^", "xQ^"})
    static final class C04582 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ CoroutineContext $currentContext;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04582(CoroutineContext coroutineContext, Function2<? super AwaitPointerEventScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C04582> continuation) {
            super(2, continuation);
            this.$currentContext = coroutineContext;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C04582 c04582 = new C04582(this.$currentContext, this.$block, continuation);
            c04582.L$0 = obj;
            return c04582;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C04582) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x004c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x004a -> B:47:0x0018). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0061 -> B:47:0x0018). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r7.label
                r5 = 3
                r4 = 2
                r3 = 1
                if (r0 == 0) goto L64
                if (r0 == r3) goto L38
                if (r0 == r4) goto L30
                if (r0 != r5) goto L6f
                java.lang.Object r2 = r7.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
                kotlin.ResultKt.throwOnFailure(r8)
            L18:
                kotlin.coroutines.CoroutineContext r0 = r7.$currentContext
                boolean r0 = kotlinx.coroutines.JobKt.isActive(r0)
                if (r0 == 0) goto L6c
                kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r7.$block     // Catch: java.util.concurrent.CancellationException -> L2e
                r7.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> L2e
                r7.label = r3     // Catch: java.util.concurrent.CancellationException -> L2e
                java.lang.Object r0 = r0.invoke(r2, r7)     // Catch: java.util.concurrent.CancellationException -> L2e
                if (r0 != r6) goto L2d
                return r6
            L2d:
                goto L3f
            L2e:
                r1 = move-exception
                goto L4e
            L30:
                java.lang.Object r2 = r7.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
                kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.util.concurrent.CancellationException -> L4d
                goto L18
            L38:
                java.lang.Object r2 = r7.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
                kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.util.concurrent.CancellationException -> L4d
            L3f:
                r0 = r7
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0     // Catch: java.util.concurrent.CancellationException -> L4d
                r7.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> L4d
                r7.label = r4     // Catch: java.util.concurrent.CancellationException -> L4d
                java.lang.Object r0 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L4d
                if (r0 != r6) goto L18
                return r6
            L4d:
                r1 = move-exception
            L4e:
                kotlin.coroutines.CoroutineContext r0 = r7.$currentContext
                boolean r0 = kotlinx.coroutines.JobKt.isActive(r0)
                if (r0 == 0) goto L77
                r0 = r7
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r7.L$0 = r2
                r7.label = r5
                java.lang.Object r0 = androidx.compose.foundation.gestures.ForEachGestureKt.awaitAllPointersUp(r2, r0)
                if (r0 != r6) goto L18
                return r6
            L64:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r2 = r7.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r2
                goto L18
            L6c:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L6f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L77:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.C04582.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object awaitEachGesture(PointerInputScope pointerInputScope, Function2<? super AwaitPointerEventScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C04582(continuation.getContext(), function2, null), continuation);
        return objAwaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitPointerEventScope : Unit.INSTANCE;
    }
}
