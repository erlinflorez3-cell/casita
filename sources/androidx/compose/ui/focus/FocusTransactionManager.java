package androidx.compose.ui.focus;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
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
/* JADX INFO: compiled from: FocusTransactionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u0006\u0007nʑA0RnP\u008cZS@\u000fs{J$c$\bCCU \f(ޛeȞ\u0018g\u001dI\u001b\u000eß\u0013\u0006$x32Wf\u0011]@\u0013xB8EA_\b=gd;6M&@5Py3\u0005`*\u0011B\u0005\u000f[KR'PBví`\"}\u0013 \u001a\u0014T8\t.^wNdL\u0003\\h2S\rwYf-o2\rMS[\u0003*Sǿgӿ/@EM]Wa\u001c\u001fR\"T#Awܵ\u0013}W51Q\u0002mN`\u0010\u0016%+}\u0011sqT_5[n#?1_e[PT=&}BȥBǬ\u0012\u00065`~E(g \u001aC|\u0003YPR\u0012^p\u0004)dd\u0019{ı5ڢ=\u001bnϟ2G'SO{3\u0013tŃ\rͼ%[\\ו1-)[\u0010]ASP=vW\u001a[Mm2z\u0011\n\u0001ʹ2Ͻ\u0004/\u0004߾~A3Cs;9 \u001a\fpD\u0016\u007f5fv^\u0002T^?PxL{hMbɵP\u0081\tuhV^9\u001f[<V\r\r\u0016#ا`\u0012"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egl-3v$*KR?u=\u0006\u0011q];\u0007p\u0002", "", "u(E", "1`]0X3EO(\u0003\u0005g\u0013\u0001\u0017>e\t(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "=mV<\\5@B&z\u0004l(z\u00183o\t", "", "AsPAX:", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<d#1h\r DU\u00129#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egl\u001cDo\u0016=6M:k\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egk/3|\u0016\u0012UNBA", "D`[BX", "CmR<`4Bb(~y?6z\u0019=S\u000f$\u000b@", "5dc\"a*H[!\u0003\nm,{i9c\u00106iO|&\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\u000f3z\u0018.\\,Ej4sXO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^WO5\u000b\u0015g\u000b\u0005xBG-u;E\u0011;L\t\u0017\u001dc", "Adc\"a*H[!\u0003\nm,{i9c\u00106iO|&\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\u000f3z\u0018.\\,Ej4s{dj8\u0014m0M\npEVV7f`r\u0007$\u0016$\u000fX)\u001d\u0013#\".lTE\r\u0017(X\u0002\u001fp\f\u0013kQ&", "0dV6a\u001bKO\"\rv\\;\u0001\u00138", "1`]0X3-`\u0015\b\tZ*\f\r9n", "1n\\:\\;-`\u0015\b\tZ*\f\r9n", "Ehc58?Ba(\u0003\u0004`\u001b\n\u00058s{&\u000bD\u000b ", "\"", "=m2.a*>Z ~y", "0k^0^", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d\\0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "Ehc5A,PB&z\u0004l(z\u00183o\t", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FocusTransactionManager {
    public static final int $stable = 8;
    private boolean ongoingTransaction;
    private final MutableScatterMap<FocusTargetNode, FocusStateImpl> states = ScatterMapKt.mutableScatterMapOf();
    private final MutableVector<Function0<Unit>> cancellationListener = new MutableVector<>(new Function0[16], 0);

    public static /* synthetic */ Object withNewTransaction$default(FocusTransactionManager focusTransactionManager, Function0 function0, Function0 function02, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            function0 = null;
        }
        try {
            if (focusTransactionManager.ongoingTransaction) {
                focusTransactionManager.cancelTransaction();
            }
            focusTransactionManager.beginTransaction();
            if (function0 != null) {
                focusTransactionManager.cancellationListener.add(function0);
            }
            return function02.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            focusTransactionManager.commitTransaction();
            InlineMarker.finallyEnd(1);
        }
    }

    public final <T> T withNewTransaction(Function0<Unit> function0, Function0<? extends T> function02) {
        try {
            if (this.ongoingTransaction) {
                cancelTransaction();
            }
            beginTransaction();
            if (function0 != null) {
                this.cancellationListener.add(function0);
            }
            return function02.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            commitTransaction();
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ Object withExistingTransaction$default(FocusTransactionManager focusTransactionManager, Function0 function0, Function0 function02, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            function0 = null;
        }
        if (function0 != null) {
            focusTransactionManager.cancellationListener.add(function0);
        }
        if (focusTransactionManager.ongoingTransaction) {
            return function02.invoke();
        }
        try {
            focusTransactionManager.beginTransaction();
            return function02.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            focusTransactionManager.commitTransaction();
            InlineMarker.finallyEnd(1);
        }
    }

    public final <T> T withExistingTransaction(Function0<Unit> function0, Function0<? extends T> function02) {
        if (function0 != null) {
            this.cancellationListener.add(function0);
        }
        if (this.ongoingTransaction) {
            return function02.invoke();
        }
        try {
            beginTransaction();
            return function02.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            commitTransaction();
            InlineMarker.finallyEnd(1);
        }
    }

    public final FocusStateImpl getUncommittedFocusState(FocusTargetNode focusTargetNode) {
        return this.states.get(focusTargetNode);
    }

    public final void setUncommittedFocusState(FocusTargetNode focusTargetNode, FocusStateImpl focusStateImpl) {
        MutableScatterMap<FocusTargetNode, FocusStateImpl> mutableScatterMap = this.states;
        if (focusStateImpl != null) {
            mutableScatterMap.set(focusTargetNode, focusStateImpl);
        } else {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("requires a non-null focus state");
            throw new KotlinNothingValueException();
        }
    }

    public final void beginTransaction() {
        this.ongoingTransaction = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void commitTransaction() {
        /*
            r16 = this;
            r10 = r16
            androidx.collection.MutableScatterMap<androidx.compose.ui.focus.FocusTargetNode, androidx.compose.ui.focus.FocusStateImpl> r0 = r10.states
            androidx.collection.ScatterMap r0 = (androidx.collection.ScatterMap) r0
            java.lang.Object[] r11 = r0.keys
            long[] r9 = r0.metadata
            int r0 = r9.length
            int r8 = r0 + (-2)
            r7 = 0
            if (r8 < 0) goto L52
            r6 = r7
        L11:
            r4 = r9[r6]
            long r0 = ~r4
            r2 = 7
            long r0 = r0 << r2
            long r0 = r0 & r4
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = -1
            long r2 = r12 - r0
            long r0 = r12 - r14
            long r2 = r2 | r0
            long r12 = r12 - r2
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L4d
            int r0 = r6 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r13 = 8
            int r12 = 8 - r0
            r3 = r7
        L32:
            if (r3 >= r12) goto L4b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r4
            r1 = 128(0x80, double:6.3E-322)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto L47
            int r0 = r6 << 3
            int r0 = r0 + r3
            r0 = r11[r0]
            androidx.compose.ui.focus.FocusTargetNode r0 = (androidx.compose.ui.focus.FocusTargetNode) r0
            r0.commitFocusState$ui_release()
        L47:
            long r4 = r4 >> r13
            int r3 = r3 + 1
            goto L32
        L4b:
            if (r12 != r13) goto L52
        L4d:
            if (r6 == r8) goto L52
            int r6 = r6 + 1
            goto L11
        L52:
            androidx.collection.MutableScatterMap<androidx.compose.ui.focus.FocusTargetNode, androidx.compose.ui.focus.FocusStateImpl> r0 = r10.states
            r0.clear()
            r10.ongoingTransaction = r7
            androidx.compose.runtime.collection.MutableVector<kotlin.jvm.functions.Function0<kotlin.Unit>> r0 = r10.cancellationListener
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTransactionManager.commitTransaction():void");
    }

    public final void cancelTransaction() {
        this.states.clear();
        int i2 = 0;
        this.ongoingTransaction = false;
        MutableVector<Function0<Unit>> mutableVector = this.cancellationListener;
        int size = mutableVector.getSize();
        if (size > 0) {
            Function0<Unit>[] content = mutableVector.getContent();
            do {
                content[i2].invoke();
                i2++;
            } while (i2 < size);
        }
        this.cancellationListener.clear();
    }
}
