package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
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
/* JADX INFO: compiled from: PlatformTextInputModifierNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d̉=!4i\bDZc|İI\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0Le^.ZS0\u000fs{B#c$\bCC٥\"}8\tWN}gvJp\u000bK\u000f\u0014ǝ\u0001jBI]xc\u0012\u00172XoG3SqU_nuN\u0005N4R<\b\b\u0019\u001aXL@\u0006\tHc\u0017\"2PphT;Sŋ\u001e\u0012\fEf\u0006ɉ`g\\>`&kCG#1sjNUj`\"[\u0019^u-\f\u0007c.+nEE\u001d5Y\u0013\tb[m\rm\u0001M\tx)=*w\u0004\u0006Cݼ\u0004\u0014\u001b<\u0016՜\u001cę*\\\u0013cxO5>gcyZ6(&\u000f,\u0013J\u0019&\b=G\\-J\f\u0016$K\u0016xRPR\u0012^p\u000e\u000biF\u001d5\u0002C+g%\u0015`q?)PMz3\u001dL0ъr!aeT֮SôXw_HqTKʰf\u0012iA}\u0006\u0007a0*2/\u001eČ1ɨ\u0015.\u001f¦ۄ_Q"}, d2 = {"\u001anR._\nAO\u001d\bz]\u0017\u0004\u0005>f\n5\u0004/\u0001*&+x\u0019L\u0006\t>h}-5m!=WP", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xI\u000169Xy\u001d>ms8UNEy8-\u0019rj \u0011a(UL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0013\\y$@m\u0015\u0019T?Jl>+\u001dWaL\u0016G5Y\u00076+U],iPrH#\u001cgc", "\u0017mc2e*>^(i\u0002Z;}\u0013<mn(\u000fOd \"W~", "", "7mc2e*>^(\t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n `y/8w#6<CNz\u0018' xp\u001d\u0010r,[t'R[X92", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~D\u0005\u001cFn ;U2;~C\u0002\u001esqHjl;N\u0004%GW]6i(YC\u001e!a\u0012Wt\u0012\u0016a\u000b%~M5.\f6R\u0010\u0005I\u0011\u0015\u0014\u001d9ty\u000f,vC\u0003\u0014\u0003K-gY#]\u0004OLOp*.\u0019o&k>B$]O##sZ<\n\t)t6C", "3rc.U3Ba\u001cmzq;`\u0012:u\u000f\u0016{N\u000f\u001b!P", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n `y/8w#6<CNz\u0018' xp!\u0011b0Oz'T5X+\\(", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n `y/8w#6<CNz\u0018' xp'\u0007q:R\u000105JX7\\(", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~D\u0005\u001cFn ;U2;~C\u0002\u001esqHnm+Rw+GY76[RH$\u001a\u001ci\u0015R4V\njImoT@\u001d\u00170S\u000bI2a\u001c\u001f\fDnzK#e.\u007f\u001f\u0005H-q\u0010Wi\u0007QQTf3d\u001a)zfCI(\u001d\u0002\u0015*lZ7_?:\u0016ncu1nC\"|\u0002\u000e;r[DTE", "7mc2e*>^(~yM,\u0010\u0018\u0013n\u000b8\u000b.\u0001%%Ky\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%B/", "1gP6a,=7\"\u000ezk*|\u0014>o\r", "Adb@\\6G", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW&\t.5fS\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zpRSJ;]\\\u007fE]o]\nR4\r\u0004DH }EA,\u0010\u001bI\u0015JL\n\u0017&\u001d\u0019s\u007fBc\u000eG\u0005$\u007fN~OLcn\u0001KJ\u000fg;lU`-e8I(\u001ez'dI`7\b\u000bW\u001b{\u001fONmQ(\u0002<-\bkeSO\u007fd@}'-\u0015Y\u0002\u001bA\\};p<\b>3\f(kPc):(\u007f\u00115^\u000b\u0011#;<\u0011N!", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PlatformTextInputModifierNodeKt {
    private static final ProvidableCompositionLocal<ChainedPlatformTextInputInterceptor> LocalChainedPlatformTextInputInterceptor = CompositionLocalKt.staticCompositionLocalOf(new Function0<ChainedPlatformTextInputInterceptor>() { // from class: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$LocalChainedPlatformTextInputInterceptor$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ChainedPlatformTextInputInterceptor invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$InterceptPlatformTextInput$1 */
    /* JADX INFO: compiled from: PlatformTextInputModifierNode.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super Composer, ? super Integer, Unit> function2, int i2) {
            super(2);
            function2 = function2;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i2) {
            PlatformTextInputModifierNodeKt.InterceptPlatformTextInput(platformTextInputInterceptor, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1 */
    /* JADX INFO: compiled from: PlatformTextInputModifierNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D\b\u0005z\u000f\u0002\f\u0010\fMp\u000e\u0004\u0018\u000b\u0015\u0019\u0015|\u000f# u\u001c\u001f%%~\"\u0018\u001e\u001c \u001d+\b* \"\t3", f = "\u001d8,>/793\u0019);6\n./31\t*\u001e\"\u001e \u001b'\u0002\"\u0016\u0016]\u001a\"", i = {}, l = {143}, m = "4CE35@>I?,>RO%KNTT4GVWNUU", n = {}, s = {})
    static final class C07751 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07751(Continuation<? super C07751> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return PlatformTextInputModifierNodeKt.establishTextInputSession(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 */
    /* JADX INFO: compiled from: PlatformTextInputModifierNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D\b\u0005z\u000f\u0002\f\u0010\fMp\u000e\u0004\u0018\u000b\u0015\u0019\u0015|\u000f# u\u001c\u001f%%~\"\u0018\u001e\u001c \u001d+\b* \"\t3", f = "\u001d8,>/793\u0019);6\n./31\t*\u001e\"\u001e \u001b'\u0002\"\u0016\u0016]\u001a\"", i = {}, l = {194, 196}, m = "8>E7E7:FK==.@TQ'MPVV6IXYPWW", n = {}, s = {})
    static final class C07761 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07761(Continuation<? super C07761> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return PlatformTextInputModifierNodeKt.interceptedTextInputSession(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object establishTextInputSession(androidx.compose.ui.platform.PlatformTextInputModifierNode r6, kotlin.jvm.functions.Function2<? super androidx.compose.ui.platform.PlatformTextInputSessionScope, ? super kotlin.coroutines.Continuation<?>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<?> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.C07751
            if (r0 == 0) goto L2b
            r5 = r8
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1 r5 = (androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.C07751) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L2b
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L16:
            java.lang.Object r1 = r5.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L31
            if (r0 == r3) goto L5f
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2b:
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1 r5 = new androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1
            r5.<init>(r8)
            goto L16
        L31:
            kotlin.ResultKt.throwOnFailure(r1)
            androidx.compose.ui.Modifier$Node r0 = r6.getNode()
            boolean r0 = r0.isAttached()
            if (r0 == 0) goto L68
            androidx.compose.ui.node.DelegatableNode r6 = (androidx.compose.ui.node.DelegatableNode) r6
            androidx.compose.ui.node.Owner r2 = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(r6)
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(r6)
            androidx.compose.runtime.CompositionLocalMap r1 = r0.getCompositionLocalMap()
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor> r0 = androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.LocalChainedPlatformTextInputInterceptor
            androidx.compose.runtime.CompositionLocal r0 = (androidx.compose.runtime.CompositionLocal) r0
            java.lang.Object r0 = r1.get(r0)
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r0 = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor) r0
            r5.label = r3
            java.lang.Object r0 = interceptedTextInputSession(r2, r0, r7, r5)
            if (r0 != r4) goto L62
            return r4
        L5f:
            kotlin.ResultKt.throwOnFailure(r1)
        L62:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L68:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "establishTextInputSession called from an unattached node"
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.establishTextInputSession(androidx.compose.ui.platform.PlatformTextInputModifierNode, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void InterceptPlatformTextInput(PlatformTextInputInterceptor platformTextInputInterceptor, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1315007550);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(InterceptPlatformTextInput)P(1)163@7651L7,168@8038L89,176@8348L135:PlatformTextInputModifierNode.kt#itgzvw");
        if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
            i3 = ((-1) - (((-1) - i2) | ((-1) - 8)) == 0 ? composerStartRestartGroup.changed(platformTextInputInterceptor) : composerStartRestartGroup.changedInstance(platformTextInputInterceptor) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(function2) ? 32 : 16)));
        }
        if ((i3 + 19) - (19 | i3) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1315007550, i3, -1, "androidx.compose.ui.platform.InterceptPlatformTextInput (PlatformTextInputModifierNode.kt:162)");
            }
            ProvidableCompositionLocal<ChainedPlatformTextInputInterceptor> providableCompositionLocal = LocalChainedPlatformTextInputInterceptor;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(providableCompositionLocal);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = (ChainedPlatformTextInputInterceptor) objConsume;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1708127741, "CC(remember):PlatformTextInputModifierNode.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(chainedPlatformTextInputInterceptor);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new ChainedPlatformTextInputInterceptor(platformTextInputInterceptor, chainedPlatformTextInputInterceptor);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor2 = (ChainedPlatformTextInputInterceptor) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            chainedPlatformTextInputInterceptor2.updateInterceptor(platformTextInputInterceptor);
            CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(chainedPlatformTextInputInterceptor2), function2, composerStartRestartGroup, ((-1) - (((-1) - i3) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION))) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.InterceptPlatformTextInput.1
                final /* synthetic */ int $$changed;
                final /* synthetic */ Function2<Composer, Integer, Unit> $content;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(Function2<? super Composer, ? super Integer, Unit> function22, int i22) {
                    super(2);
                    function2 = function22;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i22) {
                    PlatformTextInputModifierNodeKt.InterceptPlatformTextInput(platformTextInputInterceptor, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object interceptedTextInputSession(androidx.compose.ui.node.Owner r6, androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r7, kotlin.jvm.functions.Function2<? super androidx.compose.ui.platform.PlatformTextInputSessionScope, ? super kotlin.coroutines.Continuation<?>, ? extends java.lang.Object> r8, kotlin.coroutines.Continuation<?> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.C07761
            if (r0 == 0) goto L2b
            r5 = r9
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 r5 = (androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.C07761) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L2b
            int r0 = r5.label
            int r0 = r0 - r1
            r5.label = r0
        L13:
            java.lang.Object r4 = r5.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r5.label
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L31
            if (r2 == r0) goto L3f
            if (r2 == r1) goto L51
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2b:
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 r5 = new androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1
            r5.<init>(r9)
            goto L13
        L31:
            kotlin.ResultKt.throwOnFailure(r4)
            if (r7 != 0) goto L48
            r5.label = r0
            java.lang.Object r0 = r6.textInputSession(r8, r5)
            if (r0 != r3) goto L42
            return r3
        L3f:
            kotlin.ResultKt.throwOnFailure(r4)
        L42:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        L48:
            r5.label = r1
            java.lang.Object r0 = r7.textInputSession(r6, r8, r5)
            if (r0 != r3) goto L54
            return r3
        L51:
            kotlin.ResultKt.throwOnFailure(r4)
        L54:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.interceptedTextInputSession(androidx.compose.ui.node.Owner, androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
