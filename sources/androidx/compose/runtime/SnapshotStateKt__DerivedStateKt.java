package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
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
/* JADX INFO: compiled from: DerivedState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d̉=!4i\bDZc|İI\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2şs{J$c$wDCU0}*\tUPog|Jb\u000bI\u000f\u000e\u0016\u000fj4I[yu\u001e\u001d3ZuO5]ok<\u000fv|ӌ8R0<\u0012\u000b\u0011\u001c:HV|)Hk\u000e\u0018ؓNvj\\\u001bT\u001d \"\bN G$\u000bo\u0015;`\u001bk>G)\u0013kRNme^\u0002m\u000fLÖ5\u0013'k,4X=E\u00175SI\r\u0001eo\rMxU\u000bx)7+\u0010y\u0006>\u001f\u0005,C9Z%]92|\u0007WӠ\u001a3[WqXh\u00128w\u0001|;J4\u0018\u00146`4=\u001cv\bT?#z\u001aöVؿbD\u0006\u000boG/H\u000eEC9IyqcAϊ\\C,\t\u001b2;\u0001\u001d$\f^\u001co-!dya1\u0018LkP\u0015ˤ_U\u0016\u0012\u0006z\u0002p\nPI\u0006\u07fc\n\u0017^'3FsE3#{\u0002vDwx\u0015`/Y\u0018h\u000fؚ(å\u001a90 \u001ardv\u0013ߘhZh.!MJT5|^ʹ\"Ϣ{<)ط0f]i\u0002v]e\u001a+?hGY\u001dn<Yg]\n̓SӒ\u0014aZΘ݆CU"}, d2 = {"1`[0h3:b\u001d\t\u0004;3\u0007\u00075N\u007f6\u000b@\u007f}\u0017Xo\u0015", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Er0C\\\b/&p#.IB\"u2\u001a\u001c>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u0012E\u0006%Bby'\u0001Q\u001f=:C<A", "2da6i,=A(z\n^\u0016y\u0017/r\u0011(\tN", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l<\u0004)FY|\u000eFi%.7@IkA/\u0015u7", "2da6i,=A(z\n^\u0016}", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\"", "1`[0h3:b\u001d\t\u0004", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ">n[6V@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Er0C\\\b/\u001f}%*\\GEt\u001f(\u001cl_M\\", "<nc6Y@(P'~\bo,\n\u0017", Global.BLANK, "2da6i,=A(z\n^", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9l<\u0004)FY|\u000eFi%.#", "0k^0^", "<nc6Y@(P'~\bo,\n\u0017mS\t$\u0007N\u0004!&5~\nKv\u000bDSw~7z\u001a?MB)z0-\u0015Np", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001bv29j}\u001f%|\u0012=M\u0019\"q>-\u001clj\u0003\ft4\u0018w7PJ]0f[\u0001\u0007t\"c\f]/\u0017\u000e$\u0017gUI30\u0004uP}DjJu\u0013\u00135h\u007f\u0018", "=ab2e=>2\u0019\f~o,{v>a\u000f(h@~\u0013\u001eE\u007f\u00158\u0006)?b\f", "", "=ab2e=>`", "Ehc56(EQ)\u0006vm0\u0007\u0012\u0018e\u000e7{?g\u0017(Gv", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "Ehc56(EQ)\u0006vm0\u0007\u0012\u0018e\u000e7{?g\u0017(GvL*\u007f!@g\u0001*F[%*\\C!z.\u0018shn=\u0018c+<\u0006#VL4;", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 5, mv = {1, 8, 0}, pn = "", xi = 48, xs = "4@5B>71Dy-85758)q46.3'*!i\r'\u0019')\u001d#'\u0005%\u0011#\u0013w ")
final /* synthetic */ class SnapshotStateKt__DerivedStateKt {
    private static final SnapshotThreadLocal<IntRef> calculationBlockNestedLevel = new SnapshotThreadLocal<>();
    private static final SnapshotThreadLocal<MutableVector<DerivedStateObserver>> derivedStateObservers = new SnapshotThreadLocal<>();

    private static final <T> T withCalculationNestedLevel$SnapshotStateKt__DerivedStateKt(Function1<? super IntRef, ? extends T> function1) {
        IntRef intRef = (IntRef) calculationBlockNestedLevel.get();
        if (intRef == null) {
            intRef = new IntRef(0);
            calculationBlockNestedLevel.set(intRef);
        }
        return function1.invoke(intRef);
    }

    public static final <T> State<T> derivedStateOf(Function0<? extends T> function0) {
        return new DerivedSnapshotState(function0, null);
    }

    public static final <T> State<T> derivedStateOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, Function0<? extends T> function0) {
        return new DerivedSnapshotState(function0, snapshotMutationPolicy);
    }

    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        SnapshotThreadLocal<MutableVector<DerivedStateObserver>> snapshotThreadLocal = derivedStateObservers;
        MutableVector<DerivedStateObserver> mutableVector = snapshotThreadLocal.get();
        if (mutableVector != null) {
            return mutableVector;
        }
        MutableVector<DerivedStateObserver> mutableVector2 = new MutableVector<>(new DerivedStateObserver[0], 0);
        snapshotThreadLocal.set(mutableVector2);
        return mutableVector2;
    }

    private static final <R> R notifyObservers$SnapshotStateKt__DerivedStateKt(DerivedState<?> derivedState, Function0<? extends R> function0) {
        MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
        int size = mutableVectorDerivedStateObservers.getSize();
        int i2 = 0;
        if (size > 0) {
            DerivedStateObserver[] content = mutableVectorDerivedStateObservers.getContent();
            int i3 = 0;
            do {
                content[i3].start(derivedState);
                i3++;
            } while (i3 < size);
        }
        try {
            R rInvoke = function0.invoke();
            InlineMarker.finallyStart(1);
            int size2 = mutableVectorDerivedStateObservers.getSize();
            if (size2 > 0) {
                DerivedStateObserver[] content2 = mutableVectorDerivedStateObservers.getContent();
                do {
                    content2[i2].done(derivedState);
                    i2++;
                } while (i2 < size2);
            }
            InlineMarker.finallyEnd(1);
            return rInvoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            int size3 = mutableVectorDerivedStateObservers.getSize();
            if (size3 > 0) {
                DerivedStateObserver[] content3 = mutableVectorDerivedStateObservers.getContent();
                do {
                    content3[i2].done(derivedState);
                    i2++;
                } while (i2 < size3);
            }
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    public static final <R> void observeDerivedStateRecalculations(DerivedStateObserver derivedStateObserver, Function0<? extends R> function0) {
        MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
        try {
            mutableVectorDerivedStateObservers.add(derivedStateObserver);
            function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
            InlineMarker.finallyEnd(1);
        }
    }
}
