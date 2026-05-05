package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007tsA0JgP.hS2şs{J$cҕyCQU\"Ԃ*\teNo˧vJh\u000bK\u000f\f\u0016\u0001jBI]ތe\u0012%2JoE5UoS9ht<\u00126݅R8(\u00049\u001cQp9!;TQ!\"8FpHR%O\u001b\u0019@\u0007̧$\u0001,^(kFNz]R19\u0002\u0018C^3m3\u0015U\u001dHd';{w\u001dYD˝9\u00153YK\u0015`lW\u0003m\u0004m\tv:?+w}\u001e;!\u0016\"&CO;o#*j\u0019i`:<[Sq^h\u000eV\u0002A\u0001UO\u0012$\u001e'vE]\u001et\u001b&3#|\u001a?г\u0006^H\u0018CgD0=\u007fa=\u007f /_oU1Ne\u000e5\u0011,>\u0019nOw\u001b\u0013)#)q\u0010Q_cpAVi\"Yk\nJu+\b8\fHG.4B\u0016v\u001d3Us9Q32\u0003\u0011Ju\u0016\u001d`\u0017e0W\u0011N0\u000f.7X\u001b<^R\u007f\u001dk~p\u001f-Y[*u\u001f}6%P`\u0006W9%>j\u0016i2x[\u007f\"%]xg]|\u000f&Wgjy:\u001aq\u001e\u0006jvBQlf\u0013}~B\u0002\u0011!]p(@n\u0003\u0010&\u000e\u000bN\\\u001f@F\n\u001cb1\bǌhČL\u0003&Փ\u0012\u000b\u0017_rj&}\u00034zѳk˨x\t\tˆ-|}o\u0011IZ\u00027ø9ۮU5!ğ&0v=\u0015%\u001d}\"\n\u001eшXܤPl\u001e߯&\n.!2;g.k\u001feȲ5ɨ\u0006-MɣCs_Z*)\u0011{(\u001d\u0012ß:Թ\fjxݚ1|X^l\u001d2xnrQ\u0012\u0013\u0010PӖHیKc\\ެ,RWu\u001baLPH|3$4$/sxğ7ԩG'%ȶ߹\u0018Z"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qeI]\u0013\u0015MZ\u001b<\u000535X\\$Ex\u0012=KF;x\n", "", "4`[9U(<Y\u0003\bWZ*\u0003s<e\u000e6{?", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "uKY.i(\bZ\u0015\b|(\u0019\r\u00128a|/{\u0016D\b", "=m7.f\fGO\u0016\u0006z]\nx\u00106b{&\u0002N^\u001a\u0013Pq\u000e;", "\u001a`]1e6BR,Hxh9|R?t\u0004/E\u001e\u000b %Ww\u000eIL", "", "uKY.i(\bZ\u0015\b|(\u0019\r\u00128a|/{\u0016g\u0013 F|\u0018@u8~W\b-77&=QJ\u0005I>'#xi9\u00149o?", "0`R8<5O]\u001f~y<(\u0004\u0010,a}.h@\u0003\u001b%Vo\u001b<u", "6`b\u0012a(;Z\u0019}XZ3\u0004\u0006+c\u00066", "7m??b.KS'\rXZ3\u0004\u0006+c\u0006", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qeI]\u0013\u0015MZ\u001b<\u000535X[\u001c>t\u0013*KI\u0011", "7me<^,=2\u001d\r\u0006Z;z\f/r", "\u001a`]1e6BRb\u0011~g+\u0007\u001bxO\t\u0005w>\u0007z Xy\u0014<u\u00049g\t\u001cFk\u0019.Z\u0019", "=m1.V2\"\\*\t\u0001^+Z\u00056l|$yF", "\u001a`]1e6BRb\u0011~g+\u0007\u001bxO\t\u0005w>\u0007z Xy\u0014<u\u00031`\u0005\u001d3k\u001c\u0004", "=m1.V2)`\u0019\r\t^+Z\u00056l|$yF\u000f", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[N\u000eH\u0007%\u000b", "/cS\u0010T3EP\u0015|\u0001", "", "=m1.V2)`\u0019\r\t^+Z\u00056l|$yF", "=v]2e", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "/cS\u0010T5<S \u0006v[3|f+l\u0007%w>\u0007", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qY<\n\u0015\u0017Nv\n9}%\u000b", "/cS\u0010T5<S \u0006v[3|f+l\u0007%w>\u0007U\u0013E~\u0012Mz4IS\u000b >m\u0012<M", "2hb=T;<V\u0003\bWZ*\u0003f+n}(\u0003G\u0001\u0016", "2hb=T;<V\u0003\bWZ*\u0003s<o\u00025{N\u000f\u0017\u0016", "0`R88=>\\(", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qX<~\u001dvXo\u0017KT/=dy/\r", "2hb=T;<V\u0003\bWZ*\u0003v>a\r7{?", "=m1.V2\u001cO\"|ze3|\b", "=m1.V2)`\u0019\r\t^+", "=m1.V2)`#\u0001\b^:\u000b\t.", "=m1.V2,b\u0015\f\n^+", "Adc\u001ca\t:Q\u001fb\u0004o6\u0003\t.D\u00046\u0007<\u0010\u0015\u001aG|", "7me<^,K", "CoS.g,\u001bO\u0017\u0005^g=\u0007\u000f/d]$\u0003G}\u0013\u0015M]\u001d8\u0006%", "Ag^B_+\u001bS\u0006~|b:\f\t<e~", "CoS.g,\u001e\\\u0015{\u0002^+Z\u00056l|$yF\u000f", "\u000foX\u007f&\u0010F^ ", "\u000foX\u007f'\u0010F^ ", "\u001ahU2V@<Z\u0019h\u0004;(z\u000f\u001ar\u007f6\n@\u007ft\u0013Pm\u000eC}!2`}", "\u001dm1.V2)`\u0019\r\t^+Z\u00058c\u007f/\u0003<}\u001e\u0017", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class OnBackPressedDispatcher {
    private boolean backInvokedCallbackRegistered;
    private final Runnable fallbackOnBackPressed;
    private boolean hasEnabledCallbacks;
    private OnBackPressedCallback inProgressCallback;
    private OnBackInvokedDispatcher invokedDispatcher;
    private OnBackInvokedCallback onBackInvokedCallback;
    private final ArrayDeque<OnBackPressedCallback> onBackPressedCallbacks;
    private final Consumer<Boolean> onHasEnabledCallbacksChanged;

    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public OnBackPressedDispatcher(Runnable runnable, Consumer<Boolean> consumer) {
        OnBackInvokedCallback onBackInvokedCallbackCreateOnBackInvokedCallback;
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = consumer;
        this.onBackPressedCallbacks = new ArrayDeque<>();
        if (Build.VERSION.SDK_INT >= 33) {
            if (Build.VERSION.SDK_INT >= 34) {
                onBackInvokedCallbackCreateOnBackInvokedCallback = Api34Impl.INSTANCE.createOnBackAnimationCallback(new Function1<BackEventCompat, Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(BackEventCompat backEventCompat) {
                        invoke2(backEventCompat);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(BackEventCompat backEvent) {
                        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                        OnBackPressedDispatcher.this.onBackStarted(backEvent);
                    }
                }, new Function1<BackEventCompat, Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(BackEventCompat backEventCompat) {
                        invoke2(backEventCompat);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(BackEventCompat backEvent) {
                        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                        OnBackPressedDispatcher.this.onBackProgressed(backEvent);
                    }
                }, new Function0<Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.3
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        OnBackPressedDispatcher.this.onBackPressed();
                    }
                }, new Function0<Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.4
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        OnBackPressedDispatcher.this.onBackCancelled();
                    }
                });
            } else {
                onBackInvokedCallbackCreateOnBackInvokedCallback = Api33Impl.INSTANCE.createOnBackInvokedCallback(new Function0<Unit>() { // from class: androidx.activity.OnBackPressedDispatcher.5
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        OnBackPressedDispatcher.this.onBackPressed();
                    }
                });
            }
            this.onBackInvokedCallback = onBackInvokedCallbackCreateOnBackInvokedCallback;
        }
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? null : runnable);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }

    public final void setOnBackInvokedDispatcher(OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.invokedDispatcher = invoker;
        updateBackInvokedCallbackState(this.hasEnabledCallbacks);
    }

    private final void updateBackInvokedCallbackState(boolean z2) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (z2 && !this.backInvokedCallbackRegistered) {
                Api33Impl.INSTANCE.registerOnBackInvokedCallback(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.backInvokedCallbackRegistered = true;
            } else if (!z2 && this.backInvokedCallbackRegistered) {
                Api33Impl.INSTANCE.unregisterOnBackInvokedCallback(onBackInvokedDispatcher, onBackInvokedCallback);
                this.backInvokedCallbackRegistered = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateEnabledCallbacks() {
        boolean z2 = this.hasEnabledCallbacks;
        ArrayDeque<OnBackPressedCallback> arrayDeque = this.onBackPressedCallbacks;
        boolean z3 = false;
        if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
            Iterator<OnBackPressedCallback> it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().isEnabled()) {
                    z3 = true;
                    break;
                }
            }
        }
        this.hasEnabledCallbacks = z3;
        if (z3 != z2) {
            Consumer<Boolean> consumer = this.onHasEnabledCallbacksChanged;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z3));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                updateBackInvokedCallbackState(z3);
            }
        }
    }

    public final void addCallback(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        addCancellableCallback$activity_release(onBackPressedCallback);
    }

    public final Cancellable addCancellableCallback$activity_release(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.add(onBackPressedCallback);
        OnBackPressedCancellable onBackPressedCancellable = new OnBackPressedCancellable(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(onBackPressedCancellable);
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCancellableCallback$1(this));
        return onBackPressedCancellable;
    }

    public final void addCallback(LifecycleOwner owner, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new C03671(this));
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$addCallback$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    /* synthetic */ class C03671 extends FunctionReferenceImpl implements Function0<Unit> {
        C03671(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((OnBackPressedDispatcher) this.receiver).updateEnabledCallbacks();
        }
    }

    public final boolean hasEnabledCallbacks() {
        return this.hasEnabledCallbacks;
    }

    public final void dispatchOnBackStarted(BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        onBackStarted(backEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackStarted(BackEventCompat backEventCompat) {
        OnBackPressedCallback onBackPressedCallbackPrevious;
        ArrayDeque<OnBackPressedCallback> arrayDeque = this.onBackPressedCallbacks;
        ListIterator<OnBackPressedCallback> listIterator = arrayDeque.listIterator(arrayDeque.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                onBackPressedCallbackPrevious = null;
                break;
            } else {
                onBackPressedCallbackPrevious = listIterator.previous();
                if (onBackPressedCallbackPrevious.isEnabled()) {
                    break;
                }
            }
        }
        OnBackPressedCallback onBackPressedCallback = onBackPressedCallbackPrevious;
        this.inProgressCallback = onBackPressedCallback;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackStarted(backEventCompat);
        }
    }

    public final void dispatchOnBackProgressed(BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        onBackProgressed(backEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackProgressed(BackEventCompat backEventCompat) {
        OnBackPressedCallback onBackPressedCallbackPrevious;
        OnBackPressedCallback onBackPressedCallback = this.inProgressCallback;
        if (onBackPressedCallback == null) {
            ArrayDeque<OnBackPressedCallback> arrayDeque = this.onBackPressedCallbacks;
            ListIterator<OnBackPressedCallback> listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallbackPrevious = null;
                    break;
                } else {
                    onBackPressedCallbackPrevious = listIterator.previous();
                    if (onBackPressedCallbackPrevious.isEnabled()) {
                        break;
                    }
                }
            }
            onBackPressedCallback = onBackPressedCallbackPrevious;
        }
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackProgressed(backEventCompat);
        }
    }

    public final void onBackPressed() {
        OnBackPressedCallback onBackPressedCallbackPrevious;
        OnBackPressedCallback onBackPressedCallback = this.inProgressCallback;
        if (onBackPressedCallback == null) {
            ArrayDeque<OnBackPressedCallback> arrayDeque = this.onBackPressedCallbacks;
            ListIterator<OnBackPressedCallback> listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallbackPrevious = null;
                    break;
                } else {
                    onBackPressedCallbackPrevious = listIterator.previous();
                    if (onBackPressedCallbackPrevious.isEnabled()) {
                        break;
                    }
                }
            }
            onBackPressedCallback = onBackPressedCallbackPrevious;
        }
        this.inProgressCallback = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void dispatchOnBackCancelled() {
        onBackCancelled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBackCancelled() {
        OnBackPressedCallback onBackPressedCallbackPrevious;
        OnBackPressedCallback onBackPressedCallback = this.inProgressCallback;
        if (onBackPressedCallback == null) {
            ArrayDeque<OnBackPressedCallback> arrayDeque = this.onBackPressedCallbacks;
            ListIterator<OnBackPressedCallback> listIterator = arrayDeque.listIterator(arrayDeque.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallbackPrevious = null;
                    break;
                } else {
                    onBackPressedCallbackPrevious = listIterator.previous();
                    if (onBackPressedCallbackPrevious.isEnabled()) {
                        break;
                    }
                }
            }
            onBackPressedCallback = onBackPressedCallbackPrevious;
        }
        this.inProgressCallback = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackCancelled();
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0012\u007fјlʔ;FǏ\u0016H\\Q\u00145\u001fo\n4<[Rrٴ?U(\u007fj\u000f]Q\u007fg\u001dN!\u001f\u0014\u001b\u0014\u0016\u0011jZJ,ޏ_ܫ\u00132JģЩ7R"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qeI]\u0013\u0015MZ\u001b<\u000535X\\$Ex\u0012=KF;xr\b\u001eE]7\rN9N\u00055GK,(ePrD\u001b\u000eW\u0015N\u0001", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qY<\n\u0015\u0017Nv\n9}%\u000b", "=m1.V2)`\u0019\r\t^+Z\u00056l|$yF", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qeI]\u0013\u0015MZ\u001b<\u000535X[\u001c>t\u0013*KI\u0011", "uKP;W9HW\u0018\u0012DZ*\f\r@i\u000f<E*\ns\u0013EuxIv3CY|~;{!*\\A>kAs{dj8\u0014m0M\npCJ]0mV\u0002Q]{cjJ)\u0013ofA2|D6|\u00043P~7f\u0007aY~", "1`]0X3", "", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class OnBackPressedCancellable implements Cancellable {
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public OnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.this$0.onBackPressedCallbacks.remove(this.onBackPressedCallback);
            if (Intrinsics.areEqual(this.this$0.inProgressCallback, this.onBackPressedCallback)) {
                this.onBackPressedCallback.handleOnBackCancelled();
                this.this$0.inProgressCallback = null;
            }
            this.onBackPressedCallback.removeCancellable(this);
            Function0<Unit> enabledChangedCallback$activity_release = this.onBackPressedCallback.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?1LeV.ZS0\u000fs{J$cҕyCQU\"Ԃ(ޞQdʴ\u0018nxY;C=\u0006V\fz0WV\u0011]@\u0011BF}BKM\u001eA˃dtD\nh80?\u0012\u0005/\"p\\X\r\tLc\f@8ptH\\%M3%B\nL,\u0019\u001e\u000bt\u0015J\u0019zk@G%\u0019hpN}ۂ<ƊQ\rNÖw\u0019\u0005b6+n9\fՙ'٨\u0007\u0007Z¹\u0010\u000fMtU\u0005\u0017+}ǥKָ[6`ÜЕ\u00199"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qeI]\u0013\u0015MZ\u001b<\u000535X\\$Ex\u0012=KF;xr\u0005\u0019ia7\u001ba3N`0$HL2G_rK\"\u0012YkJ4\u000b\u0005`H kK7t", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u0005FY\u0007/!j$.ZT;x\n", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qY<\n\u0015\u0017Nv\n9}%\u000b", ":hU2V@<Z\u0019", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvz", "=m1.V2)`\u0019\r\t^+Z\u00056l|$yF", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qeI]\u0013\u0015MZ\u001b<\u000535X[\u001c>t\u0013*KI\u0011", "uKP;W9HW\u0018\u0012DZ*\f\r@i\u000f<E*\ns\u0013EuxIv3CY|~;{!*\\A>kAs{dj8\u0014m0M\npNPO,ZfpD\u0014[A\u0012O+\u000b\u0019WH$D+3(\u00079S\u0006:{J\b\u0014\u001d9{tQjY1\u0003qq?/SSYm\bG@#^1k\t[\u001bb\u0010}\u0015", "1ta?X5M1\u0015\bx^3\u0004\u0005,l\u007f", "1`]0X3", "", "=mBAT;>1\u001cz\u0004`,{", "And?V,", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "3uT;g", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc\u0015j})FC", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {
        private Cancellable currentCancellable;
        private final Lifecycle lifecycle;
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.currentCancellable = this.this$0.addCancellableCallback$activity_release(this.onBackPressedCallback);
                return;
            }
            if (event == Lifecycle.Event.ON_STOP) {
                Cancellable cancellable = this.currentCancellable;
                if (cancellable != null) {
                    cancellable.cancel();
                    return;
                }
                return;
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.lifecycle.removeObserver(this);
            this.onBackPressedCallback.removeCancellable(this);
            Cancellable cancellable = this.currentCancellable;
            if (cancellable != null) {
                cancellable.cancel();
            }
            this.currentCancellable = null;
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007tjA0JfP.`Y2\u000fq|:ƛ[:ڎs;\u0004\u0019>'\u000fOɁkg|J#\u001fQ\u0010\u001e\u0016'l\\Sc{u\u0018\u001f4Rom8{s\u0004>)\u0013D\u000b82P=*\t\u000f!BH>u+GY\u0014*0nyjV\u001bW\u001d\u001a@\u0005\u0005%I4jrf6vq\u000e>=*\u001bipMWc>\u0007e\rtSm\u0012ȡe*"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qeI]\u0013\u0015MZ\u001b<\u000535X\\$Ex\u0012=KF;xry l/\u0007jk7UL", "", "u(E", "1qT.g,(\\uzxd\u0010\u0006\u001a9k\u007f'Y<\b\u001e\u0014Cm\u0014", "\u001a`]1e6BRb\u0011~g+\u0007\u001bxO\t\u0005w>\u0007z Xy\u0014<u\u00031`\u0005\u001d3k\u001c\u0004", "=m1.V2\"\\*\t\u0001^+", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "@dV6f;>`\u0003\bWZ*\u0003l8v\n.{?^\u0013\u001eNl\n:|", "2hb=T;<V\u0019\f", ">qX<e0Mg", "", "1`[9U(<Y", "Cma2Z0Lb\u0019\fdg\tx\u00075I\t9\u0006F\u0001\u0016tCv\u00159r#;", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        public final void registerOnBackInvokedCallback(Object dispatcher, int i2, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i2, (OnBackInvokedCallback) callback);
        }

        public final void unregisterOnBackInvokedCallback(Object dispatcher, Object callback) {
            Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createOnBackInvokedCallback$lambda$0(Function0 onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        public final OnBackInvokedCallback createOnBackInvokedCallback(final Function0<Unit> onBackInvoked) {
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.OnBackPressedDispatcher$Api33Impl$$ExternalSyntheticLambda0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.Api33Impl.createOnBackInvokedCallback$lambda$0(onBackInvoked);
                }
            };
        }
    }

    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007|jA0ZeP.XS2\u000fy{<$a$yCQU\"}(\tUɠg}ñzZ9BO\u000b\u001cx̶0Icx&z\u001d3Zom5}\u000fK<x\u0010F\u00160AP=ѩ\t\u000b 0X\u0016|\u0002SM\u0012\u0018VH\u0001<b\r{\u000eH\u00166].\u000b6ww_FW\u001bbƠ3-\toRT-f@~S\u0013l\\7\u000f\u0007aL4n;e\u001f3^\u001b\rb]O\u0003mzk\u0011\u0019158ayg8h\u007fB\u001eY[Sbğ*j"}, d2 = {"\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qeI]\u0013\u0015MZ\u001b<\u000535X\\$Ex\u0012=KF;xry l/\bjk7UL", "", "u(E", "1qT.g,(\\uzxd\b\u0006\r7a\u000f,\u0006I^\u0013\u001eNl\n:|", "\u001a`]1e6BRb\u0011~g+\u0007\u001bxO\t\u0005w>\u0007z Xy\u0014<u\u00031`\u0005\u001d3k\u001c\u0004", "=m1.V2,b\u0015\f\n^+", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hv\\;\u0001\u001a3t\u0014qX<~\u001dvXo\u0017KT/=dy/\r", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "0`R88=>\\(", "", "=m1.V2)`#\u0001\b^:\u000b\t.", "=m1.V2\"\\*\t\u0001^+", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "=m1.V2\u001cO\"|ze3|\b", "/bc6i0Mg\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public final OnBackInvokedCallback createOnBackAnimationCallback(final Function1<? super BackEventCompat, Unit> onBackStarted, final Function1<? super BackEventCompat, Unit> onBackProgressed, final Function0<Unit> onBackInvoked, final Function0<Unit> onBackCancelled) {
            Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
            Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
            Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
            Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
            return new OnBackAnimationCallback() { // from class: androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1
                @Override // android.window.OnBackAnimationCallback
                public void onBackStarted(BackEvent backEvent) {
                    Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                    onBackStarted.invoke(new BackEventCompat(backEvent));
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackProgressed(BackEvent backEvent) {
                    Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                    onBackProgressed.invoke(new BackEventCompat(backEvent));
                }

                @Override // android.window.OnBackInvokedCallback
                public void onBackInvoked() {
                    onBackInvoked.invoke();
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackCancelled() {
                    onBackCancelled.invoke();
                }
            };
        }
    }
}
