package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: Toggleable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLш|\u0004O\u000f8é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2şs{J$c$\u007fCCU }*\teNogtMb\u000bY\u000f\u000eǝ~jBկ\u0006x\f\u0011OwRsM3eok:pzD\u00078487(\b\u0011 8L(x\u0011By\u0011\"4NvRR;N\u0015  \rV\"\u0017\u001d\u000bo^FVuuF?%\u0013ipO7a@|{\u0018t^ܮ\u0011vo*s\u000fEF-%\u0002\u000e7Vi?\u001b? >5n5)CK\nVd[0\u001a#/g\u000fsqTa5Un\u0012?+}d{V\u001c/\u0010|\u0012\fj\f>\u00165QF9*h\u0018\u000eau\u0003UPP0ip\nҦ`اа)\u007f9=\u0002%tdy;GY_{3!d7Q\u0004/hl\u0014p\u0017+T&\\__͘ANVˣq?s\u0013~rRB\u00129_\f?}!.E&G]I#Ov0R\u001bϜ\u0003ݶdh[֟#TN\"\u0007\u0016e+_ȴfֈh\u0005s¬ӼX1\u0019P\"Σ#,\u0007˟$q"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@35`}\u001eFq 7\u00172Em6%\u0015d^@\u0007L6Mv|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0003<]{&3j\u001d.6M:k\n", "D`[BX", "", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "7mS6V(MW#\bch+|i+c\u000f2\tT", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\t>X\u0002\u001e3|\u001a8V,Ej4~\u0011fpC\u0014w\u0002", "3mP/_,=", "@n[2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~F\b'7C", "=mE._<>1\u001cz\u0004`,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~]\u0007/7z\u0012,\\GEt}\u0006%w]6\u000ec\u0010W\u0006'THL;`\\{+\u001e\"g\fN\u0001s\u0001b@1xH62Q*S\nFr\u000f\f_\u000f?zyAR\u001fK\u0004\u001e?%2gJW[\tKKNK4c\f@\u0019ZID1(G\u000e\u0002dY-\u0017\u0006W\u0010\u0006\u001cwqoR#\t8mNq%TEwQE\u0004+\u001dYEd\u001c9XJ\u0012z7\u0013;.?.\n\\oa?n\u0002\u0013;`K04\u007f\u001d#HIryvGY>\u0006g\u0012\u001di9:bjvk\u0012\u0013\u0010l\u0017h>]fJ\u0016R\u0007:Yv$\u0005P\bPj\u0007%\u0007\u0016.zMEP!T\u000eo45", "-n]\u0010_0<Y", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "5dc,b5\u001cZ\u001d|\u0001", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "CoS.g,", "CoS.g,\u0006?.se_1\u0003", "/o_9l\b=R\u001d\u000e~h5x\u0010\u001de\b$\u0005O\u0005\u0015%", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class ToggleableNode extends ClickableNode {
    private final Function0<Unit> _onClick;
    private Function1<? super Boolean, Unit> onValueChange;
    private boolean value;

    public /* synthetic */ ToggleableNode(boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, Role role, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, mutableInteractionSource, indicationNodeFactory, z3, role, function1);
    }

    private ToggleableNode(final boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, Role role, final Function1<? super Boolean, Unit> function1) {
        super(mutableInteractionSource, indicationNodeFactory, z3, null, role, new Function0<Unit>() { // from class: androidx.compose.foundation.selection.ToggleableNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                function1.invoke(Boolean.valueOf(!z2));
            }
        }, null);
        this.value = z2;
        this.onValueChange = function1;
        this._onClick = new Function0<Unit>() { // from class: androidx.compose.foundation.selection.ToggleableNode$_onClick$1
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
                this.this$0.onValueChange.invoke(Boolean.valueOf(!this.this$0.value));
            }
        };
    }

    public final Function0<Unit> get_onClick() {
        return this._onClick;
    }

    /* JADX INFO: renamed from: update-QzZPfjk, reason: not valid java name */
    public final void m1282updateQzZPfjk(boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, Role role, Function1<? super Boolean, Unit> function1) {
        if (this.value != z2) {
            this.value = z2;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        this.onValueChange = function1;
        super.m614updateQzZPfjk(mutableInteractionSource, indicationNodeFactory, z3, (String) null, role, this._onClick);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, ToggleableStateKt.ToggleableState(this.value));
    }
}
