package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
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
/* JADX INFO: compiled from: ContextMenuUi.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007njO0LeN.ZS8\u000fs{J$c$wHCU0}*\t]Zo˧vJp\u000bKƤ\u000e\u0016\u0007s4կ]xs\u0012\u00172HqE\u074ccڎm9\u000fsv\n&݅ŕ<y\u0013\u0001b?V\u001a\u000fzqS<\u0016>G\t:\u0001\u0011\u0014\u0004ܨ\u0016\bD+\u000f*%r\\C`l\fBu݊ɨmBT5(\u001b\u000b\\%F\u0003/=\u0006o.CKG7%%\u0002\u00155cÜC\u0003Ezm\u000bn'5>as\u0006J\t\u0006\u001a\u00159d%]!<\r-W`\u001a>Cqs\\`\u001dV\u0010ߡ\u007f\u0017B\t\u001e\f-N>/ l.'Cv\u0003SnX\u0018]p\u0003ѐe6\u001d.0=9S3lacK\u0019|?*\u0016ڟ\"#\u000f\nq\u000eb\u000fx;+v\bqAbPLvR̆]Gs\t\u0001h\b0\u00142M\u0006U\u0003!0'%ecg&\u074co\u0002NM\u0016x[\u009ejרmRP̷ؗr2"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r J|\u001e.VS\u0005I>'$htHnc5^d%QWN\u0002", "", "u(E", "1n\\=b::P ~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-\u0003w]H\u0007J0\\\u0006|", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r J|\u001e.VS\u0005I>'$htHnc5^T1NV[:2", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1n[<e:", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u0011n]AX5M", "\u0011n]AX5M\u0012\u001a\t\u000bg+x\u00183o\t\"\t@\b\u0017\u0013Uo", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn3c\u0007/7\u0001%6MLK5\u0012(\u001ewaL\u0016K,W\u0007\u0005QSX9j(Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ9Y\u000bJl\t\f_k?r{Ld\u0010TOx92", "1kT.e", "1kT.ej?])\byZ;\u0001\u00138_\r(\u0003@|%\u0017", "7sT:", ":`Q2_", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "3mP/_,=", "", ":dP1\\5@7\u0017\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "7b^;66E]&", "=m29\\*D", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJi\u0007A\u0014X:\u0014\tb\u000b)\u007fL\u0001 \u00185G\u0011?r\n\u001a_nEsnQZ\u001aPGj\\G3wM]hCLRM,+t\u0015],`DC2]R)$f_2\u0014\u0005\u001ef6C", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ContextMenuScope {
    public static final int $stable = 0;
    private final SnapshotStateList<Function3<ContextMenuColors, Composer, Integer, Unit>> composables = SnapshotStateKt.mutableStateListOf();

    public final void Content$foundation_release(final ContextMenuColors contextMenuColors, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1320309496);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Content)*234@8533L18:ContextMenuUi.android.kt#3xeu6s");
        if ((6 & i2) == 0) {
            int i4 = composerStartRestartGroup.changed(contextMenuColors) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(this) ? 32 : 16)));
        }
        if ((i3 + 19) - (19 | i3) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1320309496, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:233)");
            }
            SnapshotStateList<Function3<ContextMenuColors, Composer, Integer, Unit>> snapshotStateList = this.composables;
            int size = snapshotStateList.size();
            for (int i5 = 0; i5 < size; i5++) {
                snapshotStateList.get(i5).invoke(contextMenuColors, composerStartRestartGroup, Integer.valueOf((-1) - (((-1) - i3) | ((-1) - 14))));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuScope$Content$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    ContextMenuScope contextMenuScope = this.$tmp0_rcvr;
                    ContextMenuColors contextMenuColors2 = contextMenuColors;
                    int i7 = i2;
                    contextMenuScope.Content$foundation_release(contextMenuColors2, composer2, RecomposeScopeImplKt.updateChangedFlags((i7 + 1) - (i7 & 1)));
                }
            });
        }
    }

    public final void clear$foundation_release() {
        this.composables.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void item$default(ContextMenuScope contextMenuScope, Function2 function2, Modifier modifier, boolean z2, Function3 function3, Function0 function0, int i2, Object obj) {
        if ((2 & i2) != 0) {
            modifier = Modifier.Companion;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z2 = true;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            function3 = null;
        }
        contextMenuScope.item(function2, modifier, z2, function3, function0);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.contextmenu.ContextMenuScope$item$1 */
    /* JADX INFO: compiled from: ContextMenuUi.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f7ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "1n[<e:", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@#?b\r J|\u001e.VS\u0005I>'$htHnc5^T1NV[:2", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn3c\u0007/7\u0001%6MLK5\u0012(\u001ewaL\u0016K,W\u0007\u0005QSX9j(Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ9Y\u000bJl\t\f_k?r{Ld\u0010TOx92"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function3<ContextMenuColors, Composer, Integer, Unit> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Function2<Composer, Integer, String> $label;
        final /* synthetic */ Function3<Color, Composer, Integer, Unit> $leadingIcon;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super Composer, ? super Integer, String> function2, boolean z2, Modifier modifier, Function3<? super Color, ? super Composer, ? super Integer, Unit> function3, Function0<Unit> function0) {
            super(3);
            function2 = function2;
            z = z2;
            modifier = modifier;
            function3 = function3;
            function0 = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ContextMenuColors contextMenuColors, Composer composer, Integer num) {
            invoke(contextMenuColors, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ContextMenuColors contextMenuColors, Composer composer, int i2) {
            ComposerKt.sourceInformation(composer, "C275@10323L7,277@10419L251:ContextMenuUi.android.kt#3xeu6s");
            if ((6 & i2) == 0) {
                i2 |= composer.changed(contextMenuColors) ? 4 : 2;
            }
            if ((i2 + 19) - (19 | i2) != 18 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(262103052, i2, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.android.kt:275)");
                }
                String strInvoke = function2.invoke(composer, 0);
                if (StringsKt.isBlank(strInvoke)) {
                    throw new IllegalStateException("Label must not be blank".toString());
                }
                ContextMenuUi_androidKt.ContextMenuItem(strInvoke, z, contextMenuColors, modifier, function3, function0, composer, (-1) - (((-1) - (i2 << 6)) | ((-1) - 896)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    public final void item(Function2<? super Composer, ? super Integer, String> function2, Modifier modifier, boolean z2, Function3<? super Color, ? super Composer, ? super Integer, Unit> function3, Function0<Unit> function0) {
        this.composables.add(ComposableLambdaKt.composableLambdaInstance(262103052, true, new Function3<ContextMenuColors, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuScope.item.1
            final /* synthetic */ boolean $enabled;
            final /* synthetic */ Function2<Composer, Integer, String> $label;
            final /* synthetic */ Function3<Color, Composer, Integer, Unit> $leadingIcon;
            final /* synthetic */ Modifier $modifier;
            final /* synthetic */ Function0<Unit> $onClick;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function2<? super Composer, ? super Integer, String> function22, boolean z22, Modifier modifier2, Function3<? super Color, ? super Composer, ? super Integer, Unit> function32, Function0<Unit> function02) {
                super(3);
                function2 = function22;
                z = z22;
                modifier = modifier2;
                function3 = function32;
                function0 = function02;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ContextMenuColors contextMenuColors, Composer composer, Integer num) {
                invoke(contextMenuColors, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ContextMenuColors contextMenuColors, Composer composer, int i2) {
                ComposerKt.sourceInformation(composer, "C275@10323L7,277@10419L251:ContextMenuUi.android.kt#3xeu6s");
                if ((6 & i2) == 0) {
                    i2 |= composer.changed(contextMenuColors) ? 4 : 2;
                }
                if ((i2 + 19) - (19 | i2) != 18 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(262103052, i2, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.android.kt:275)");
                    }
                    String strInvoke = function2.invoke(composer, 0);
                    if (StringsKt.isBlank(strInvoke)) {
                        throw new IllegalStateException("Label must not be blank".toString());
                    }
                    ContextMenuUi_androidKt.ContextMenuItem(strInvoke, z, contextMenuColors, modifier, function3, function0, composer, (-1) - (((-1) - (i2 << 6)) | ((-1) - 896)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
    }
}
