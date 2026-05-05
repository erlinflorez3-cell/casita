package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.ViewRootForInspector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: AndroidView.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\\\u001d<K!&˛\bDZc|\u0004W\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yّCU(\u0004*ޛWN}gvJ`\fK\u000f\u001c\u0016\u0001j2K]xk\u0012\u00172HuG3coE9fv>\u0005.>*8\u007f\r\u0007ɝ@Ϻ8|\u0001ŏY\u000b:0npjR;N5\u001a@\b~g\u00072lk\\9`l\f>?3\u0011nZZ7a@|{\u0011VV7\r-ѭL1P?;\u00153Z\u001b\thZm\u000bOwK\u000e\u0001)=*w}g:f\u000b,\u0015Y[\u001da\u00013t\u0005\u007fnВ++]r\f\u0016\u0014(\b~\n\u0010T\u0004<\n7P4-(m \u0010Is![PT\u0010nZ\u007f1ʨF\u001d+\u007fA<Q\u001b\u0015cqA'WO}\u001b\fL-\u0011r/fl\u000e\u000f!+X\u0006^IQnK˓R\ngP6\n~\u0010\u001a*2G\u000e\u007fw\u0002\u001f\\/%er\u007f#qw\u0010S\\g%\u00117èUׂVHH̎?%E;!\f\tV\u0081\tqXӹp.\u0017a*iW8\u0016+8h\b>1%Fʚ_jyj{t8+_vEo\u0007w\u001eYI^i̐ae a\u0001\u000eBEz'[֡r͞W\u0018b٢@$8ax*\u0018}Ji\u001a/\u0003y\u007f9L8A\u001bl\u0015~ґ.DQ|7v\tn@\u000fbI<\u000fy&\u0005\t7ˆlr\u007fg'`Z\u0003\u001ff\u0004ے]ڤ\u001d2]Ȩ\u00016\u0003A\u0015\u0019\u0014\u0002M\u0007Zc\u001d\r$\u0017m}6\u0015HY\u00025K)'\u0001?10M\u0004\rIϏ]̊\u0016-\u0003۠\u001a\u0011A\u000b<\u000bXv~Pxjxt+Ϣ$Ցbr+Ψ5\u000e\bj^|]b\u0003\u00152ůK\u03a2\u0007YDѾ\t\u000b\u0013/6%7ǻxğ7ԩG)%\u0016\u0006:\u007fOo\u0005\u0002{>{r\u000f\\۩u\u0006<cD\u0007\u0011W\u000eBINae\u000f@2$#×RJzw6Y7:Kw\u001fЯpވZDUߒG\u007fl/:'\u0011Xac!\fNF<\nBsq}J3\u001aѰ\u0013ߠWk\u0006oQ\b\u0019vأ\u000e:"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0012\u001b\u0017Ys\u0017Kv2?dG\u0011;m(\u000fIAJuA2wrh8\u0007p\u0002", "\"", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0012\u001b\u0017Ys\u0017Kv2?dG{@l#8QB,o40wrh8\u0007p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2$w =.MHO=, h_H\u0011p\u0002", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "4`RAb9R", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", ">`a2a;\u001c]\"\u000ezq;", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "A`e2F;:b\u0019kz`0\u000b\u0018<y", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\f$dp9sc.R\u00056T`$", "1n\\=b:Bb\u0019dzr\u000fx\u00172", "", "=v]2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%B/", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtB\u00014<]\u0007i<~\u001ewNSDiC\"\u001fqo\u0003gs5L\u0006+QU\u001a\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001,\u00185X\u0006ChJi \u0016@t~Fe\u0014Q\u0003r\u007fJ8hYh5`CJDo4h\u000brfZDB/\u001e\u007f\u0019du`7\u0019\u007f[\u0011<`uxgC\u0016\u00028m,ilFAl\\<b6\u001bZ{d\u00124\\\u0003:\u0002AY\u0018\u00112m\u0004Xq\u001c=qB\u00136dL146\u0006#C\u0015l\u007fk>WR1j\b\u001b8x\"", "Bx_2W\u001dBS+", "2hb=T;<V\u0019\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3UU+UWJ;ZUrJi", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001fJ7\u00148UNEy4g\"xjH\u000bk,\u0018T1OWX:`avG\u001dod\u0017]+ \u0014/( wCD)\f+\u0013\u0013?h\u0013U\u0007\u00125|F)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUc&gJIm\u001dq'*hO<\b\t]\u0018y\u001cbguV\u0019y&\"KwbM$scGp6\u001dN{\u0005g\u0019T}*\u00027\b3=\u007fb\u000fSr\"L^B\"<eP+.6\u0006!;\\cqiE\u000e2\r]\u0019\u000e^28\u0019St_W\u000fs]\u0019_Cpl\u0015\r6l:Rn\"1J}U%w\u001f\u0011\u0012.{e\u0013S\u001f\u001e\n$oDkI#\f\u0003sm_\u001f", "5dc\u0011\\:IO(|}^9", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@.5g\r 6{\u0014;WJB5\u001d\u001e#wa8ta9X}.&P\\7Xap@\u0014\u001f0", "D`[BX", "", "@d[2T:>0 \txd", "5dc\u001fX3>O'~We6z\u000f", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u001fX3>O'~We6z\u000f", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "@db2g\tE]\u0017\u0005", "5dc\u001fX:>bu\u0006\u0005\\2", "Adc\u001fX:>bu\u0006\u0005\\2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?M?8r4\f$dp9sc.R\u00056T`\r\fea\u007fQi", "A`e.U3>@\u0019\u0001~l;\n\u001d\u000fn\u000f5\u0010", "Adc T=:P ~g^.\u0001\u0017>r\u0014\b\u0005O\u000e+", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJr65Uz'77\u0004*^C7h;\u001e\u0003w]H\u0007P,Pz5VYbj<[\u0002J(g\u001e~", "A`e2F;:b\u0019dzr", "", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "CoS.g,\u001bZ#|\u0001", "5dc\"c+:b\u0019[\u0002h*\u0003", "Adc\"c+:b\u0019[\u0002h*\u0003", "DhTDE6Hb", "5dc#\\,P@#\t\n", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "@dV6f;>`\u0007z\f^\u001a\f\u0005>ej5\u0006Q\u0005\u0016\u0017T", "Cma2Z0Lb\u0019\fhZ=|v>a\u000f(fM\u000b(\u001bFo\u001b", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements ViewRootForInspector {
    public static final int $stable = 8;
    private final int compositeKeyHash;
    private final NestedScrollDispatcher dispatcher;
    private Function1<? super T, Unit> releaseBlock;
    private Function1<? super T, Unit> resetBlock;
    private SaveableStateRegistry.Entry savableRegistryEntry;
    private final String saveStateKey;
    private final SaveableStateRegistry saveStateRegistry;
    private final T typedView;
    private Function1<? super T, Unit> updateBlock;

    /* synthetic */ ViewFactoryHolder(Context context, CompositionContext compositionContext, View view, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, int i2, Owner owner, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (-1) - (((-1) - i3) | ((-1) - 2)) != 0 ? null : compositionContext, view, (i3 + 8) - (i3 | 8) != 0 ? new NestedScrollDispatcher() : nestedScrollDispatcher, saveableStateRegistry, i2, owner);
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    private ViewFactoryHolder(Context context, CompositionContext compositionContext, T t2, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, int i2, Owner owner) {
        super(context, compositionContext, i2, nestedScrollDispatcher, t2, owner);
        this.typedView = t2;
        this.dispatcher = nestedScrollDispatcher;
        this.saveStateRegistry = saveableStateRegistry;
        this.compositeKeyHash = i2;
        setClipChildren(false);
        String strValueOf = String.valueOf(i2);
        this.saveStateKey = strValueOf;
        Object objConsumeRestored = saveableStateRegistry != null ? saveableStateRegistry.consumeRestored(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objConsumeRestored instanceof SparseArray ? (SparseArray) objConsumeRestored : null;
        if (sparseArray != null) {
            t2.restoreHierarchyState(sparseArray);
        }
        registerSaveStateProvider();
        this.updateBlock = AndroidView_androidKt.getNoOpUpdate();
        this.resetBlock = AndroidView_androidKt.getNoOpUpdate();
        this.releaseBlock = AndroidView_androidKt.getNoOpUpdate();
    }

    public /* synthetic */ ViewFactoryHolder(Context context, Function1 function1, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i2, Owner owner, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, function1, (-1) - (((-1) - i3) | ((-1) - 4)) != 0 ? null : compositionContext, saveableStateRegistry, i2, owner);
    }

    public ViewFactoryHolder(Context context, Function1<? super Context, ? extends T> function1, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i2, Owner owner) {
        this(context, compositionContext, function1.invoke(context), null, saveableStateRegistry, i2, owner, 8, null);
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public View getViewRoot() {
        return this;
    }

    private final void setSavableRegistryEntry(SaveableStateRegistry.Entry entry) {
        SaveableStateRegistry.Entry entry2 = this.savableRegistryEntry;
        if (entry2 != null) {
            entry2.unregister();
        }
        this.savableRegistryEntry = entry;
    }

    public final Function1<T, Unit> getUpdateBlock() {
        return this.updateBlock;
    }

    public final void setUpdateBlock(Function1<? super T, Unit> function1) {
        this.updateBlock = function1;
        setUpdate(new Function0<Unit>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.getUpdateBlock().invoke(((ViewFactoryHolder) this.this$0).typedView);
            }
        });
    }

    public final Function1<T, Unit> getResetBlock() {
        return this.resetBlock;
    }

    public final void setResetBlock(Function1<? super T, Unit> function1) {
        this.resetBlock = function1;
        setReset(new Function0<Unit>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$resetBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.getResetBlock().invoke(((ViewFactoryHolder) this.this$0).typedView);
            }
        });
    }

    public final Function1<T, Unit> getReleaseBlock() {
        return this.releaseBlock;
    }

    public final void setReleaseBlock(Function1<? super T, Unit> function1) {
        this.releaseBlock = function1;
        setRelease(new Function0<Unit>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$releaseBlock$1
            final /* synthetic */ ViewFactoryHolder<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.getReleaseBlock().invoke(((ViewFactoryHolder) this.this$0).typedView);
                this.this$0.unregisterSaveStateProvider();
            }
        });
    }

    private final void registerSaveStateProvider() {
        SaveableStateRegistry saveableStateRegistry = this.saveStateRegistry;
        if (saveableStateRegistry != null) {
            setSavableRegistryEntry(saveableStateRegistry.registerProvider(this.saveStateKey, new Function0<Object>(this) { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder.registerSaveStateProvider.1
                final /* synthetic */ ViewFactoryHolder<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ViewFactoryHolder<T> this) {
                    super(0);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                    ((ViewFactoryHolder) this.this$0).typedView.saveHierarchyState(sparseArray);
                    return sparseArray;
                }
            }));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder$registerSaveStateProvider$1 */
    /* JADX INFO: compiled from: AndroidView.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,˛\bӵLc\u000b\u0004Iي>éFD\u0015!Z\u0011\u0018\rlʑG0lev/\u0019[֖\u0013k\u00026"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<Object> {
        final /* synthetic */ ViewFactoryHolder<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ViewFactoryHolder<T> this) {
            super(0);
            this.this$0 = this;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            ((ViewFactoryHolder) this.this$0).typedView.saveHierarchyState(sparseArray);
            return sparseArray;
        }
    }

    public final void unregisterSaveStateProvider() {
        setSavableRegistryEntry(null);
    }
}
