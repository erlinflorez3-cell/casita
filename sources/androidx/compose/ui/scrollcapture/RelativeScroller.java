package androidx.compose.ui.scrollcapture;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\u0015\"4\u0012\u0006\fnjO0LeN5ZS8\u000fs{:*a$\bّkUH|b8_Rug\u0007J\t\fS/\u0014\u0018\u0011\u00072Hezm\u0012=6RwO9]qM9\u000fxd\n062:\u0010\u0004/\u0019XKǘzzQQT\u001e>L\t:\u0001\u000e}\t(\u001f\u001e>N\u0002f`u\\NH\u001bl\u0003C1\u0005\u0002B|6\u00104\u000b]%F\u0003+Sǻ ӿ/@EF]Aa\u0015\u001fR\nN3C\u007fP\u001dhU([M\u0002kNX.\u0015[ۇ\u000eոar4qMen\"?+}r{T\u001c5\u0010z*\u0011\u0003ǐLΝ+H<>j\u0003\u0016\u0016Kt!WpT\u0010eZ\u007f)etW{ĵ?ڢ=!nϟy=\u001fWE\u0006U7,%\u0019\u000b'Zd\u0010p\u0015IX\bYAWP?XN8]kr\u0014tr\u0004@\u0003^F.2R\u00800ϲ)9c91,<\u000eVD\u007fv3a?\u05c8kʐL@*Âޔ;A"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0015$Qv\u0015:r0Di\u000b \u0001Z\u00165IR?|4\f\u0013uk@\u000ec9$", "", "DhTDc6Kb\u0007\u0003\u0010^", "", "Aba<_3\u001bg", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "uH;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJuz^", "\nrTA \u0006\u0017", "Aba<_3\u001a[#\u000f\u0004m", "5dc V9HZ Z\u0003h<\u0006\u0018", "u(5", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0002/", ";`_\u001cY-LS(m\u0005O0|\u001b:o\r7", "=eU@X;", "@db2g", "", "2d[AT", "uE;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007uzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "Aba<_3+O\"\u0001zB5\f\u0013 i\u007f:", ";h]", ";`g", "uH8\u0019^6MZ\u001d\bD\\6\n\u0013?t\u00041{NJt!P~\u0012E\u0007!D]\b)\r1|3IT75;\u001a\u001ej+#\u0004h,L\u0006|", "Aba<_3-]", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class RelativeScroller {
    private float scrollAmount;
    private final Function2<Float, Continuation<? super Float>, Object> scrollBy;
    private final int viewportSize;

    /* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1, reason: invalid class name */
    /* JADX INFO: compiled from: ComposeScrollCaptureCallback.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D\u000b{\f\n\b\t\u0001\u007f\u0010\u0015\u0017\u0015\tRw\f\u0014\n\u001e\u0014\"\u0012\u0001\u0012\" \u001e\u001f\u0019'", f = "\u0010;8:8;,\u0019(62.-\u0003 .11-\u001f{\u0019#\"\u0017\u0015\u0016\u001d^\u0011\u001d\u0012\u001f\u001b\u0014\u000eV\u0013\u001b", i = {0}, l = {306}, m = "B3CA?@\u0017O", n = {"c^kY"}, s = {"xQ^"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeScroller.this.scrollBy(0.0f, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RelativeScroller(int i2, Function2<? super Float, ? super Continuation<? super Float>, ? extends Object> function2) {
        this.viewportSize = i2;
        this.scrollBy = function2;
    }

    public final float getScrollAmount() {
        return this.scrollAmount;
    }

    public final void reset() {
        this.scrollAmount = 0.0f;
    }

    public final Object scrollRangeIntoView(int i2, int i3, Continuation<? super Unit> continuation) {
        if (i2 > i3) {
            throw new IllegalArgumentException(("Expected min=" + i2 + " ≤ max=" + i3).toString());
        }
        int i4 = i3 - i2;
        int i5 = this.viewportSize;
        if (i4 > i5) {
            throw new IllegalArgumentException(("Expected range (" + i4 + ") to be ≤ viewportSize=" + this.viewportSize).toString());
        }
        float f2 = i2;
        float f3 = this.scrollAmount;
        if (f2 >= f3 && i3 <= i5 + f3) {
            return Unit.INSTANCE;
        }
        if (f2 >= f3) {
            i2 = i3 - i5;
        }
        Object objScrollTo = scrollTo(i2, continuation);
        return objScrollTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScrollTo : Unit.INSTANCE;
    }

    public final int mapOffsetToViewport(int i2) {
        return RangesKt.coerceIn(i2 - MathKt.roundToInt(this.scrollAmount), 0, this.viewportSize);
    }

    public final Object scrollTo(float f2, Continuation<? super Unit> continuation) {
        Object objScrollBy = scrollBy(f2 - this.scrollAmount, continuation);
        return objScrollBy == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScrollBy : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object scrollBy(float r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.scrollcapture.RelativeScroller.AnonymousClass1
            if (r0 == 0) goto L4e
            r4 = r7
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r4 = (androidx.compose.ui.scrollcapture.RelativeScroller.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L4e
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L16:
            java.lang.Object r1 = r4.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L38
            if (r0 != r2) goto L54
            java.lang.Object r2 = r4.L$0
            androidx.compose.ui.scrollcapture.RelativeScroller r2 = (androidx.compose.ui.scrollcapture.RelativeScroller) r2
            kotlin.ResultKt.throwOnFailure(r1)
        L2a:
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r0 = r2.scrollAmount
            float r0 = r0 + r1
            r2.scrollAmount = r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L38:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.jvm.functions.Function2<java.lang.Float, kotlin.coroutines.Continuation<? super java.lang.Float>, java.lang.Object> r1 = r5.scrollBy
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r6)
            r4.L$0 = r5
            r4.label = r2
            java.lang.Object r1 = r1.invoke(r0, r4)
            if (r1 != r3) goto L4c
            return r3
        L4c:
            r2 = r5
            goto L2a
        L4e:
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r4 = new androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1
            r4.<init>(r7)
            goto L16
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.RelativeScroller.scrollBy(float, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
