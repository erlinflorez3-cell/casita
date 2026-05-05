package org.koin.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.context.DefaultContextExtKt;
import org.koin.core.error.KoinAppAlreadyStartedException;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d̉=!4i\bDZc|\u0004G\u00078\u000bDB\u0007\"2\u0012\u007f\u0007tjAӄLe^.ZS@\u000fs{J$c$\bCC٥\"}8\tWN}gvJ`\u0017[J\u0014\u001c\u0011jZP\u0006\u0012k\u001a'GRqO3{yM;ptd\fN;\u000b8X\u0010в\u001e*N\u001c'\nQX$\u001d@B\u0001:\u0001\u0014{\u0013ܨ\u0016\u0006D/G#֔kNDX\u0005\u0006H@;\u0003\u0018I~-e0\u000b_%F\u0003'=\u0006o+CKG7%%\u0002\n5`ÜC\u0003E\u0001\u0004\nص+'9\\\f}Dl\u0018\u0014C2\u007f\u0011k\u0005>\\3[\u0011\u001b58gn[R\u001e(&\u0002*\u001bʀ\b\u000e\f6\u000f3ǉ\u001ef\u0016#K\u007f\u0001iXP0b\t\u0005ѐe6%<\u001899Q3f\u007fa\u0002\u0019fB\n\u001e%\u001eQ\u00015&ƟX\u000en/3_\u0006lIQnA\u000fS̆]={\u001b\tl\u0010F\u001c0u\u0007W{?.]%WpG\u05fa9q\u0012JTg%\u0005\u000fgרmXPؗ:p\u001c88\u000b,oRg\u001dq`Vh,?QJSΘ\u0002\u000e\u001b\u05fetyB&3\u0012˃S\u0006"}, d2 = {"\u001anR._\u0012HW\"Z\u0006i3\u0001\u0007+t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xI\u000169Xy\u001d>ms8UNEy8-\u0019rj \u0011a(UL", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041Q", "5dc\u0019b*:Z~\t~g\b\b\u00146i}$\u000bD\u000b ", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006a2?j\u0002\u001f3j\u001d.+MCv>,\u0019weC\u0010J6Lr.\u001d", "\u001anR._\u0012HW\"lxh7|", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "5dc\u0019b*:Z~\t~g\u001az\u0013:e", "\u0019nX;47IZ\u001d|vm0\u0007\u0012", "", "/o_9\\*:b\u001d\t\u0004", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041WK\f\u001e\u001bEk\u001d@\u0001.\u000b", "\u001ana4\"2HW\"Hyl3Fn9i\t\u0004\u0007K_\u0017\u0015Nk\u001b8\u0006)?bS", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u000e\u001c\u001f\u001d9rp\f4\u001aO\u0005\u001f\u0004A6>*\u001dP", "\u0019nX;66Gb\u0019\u0012\n", "1n]AX?M", "uK^?ZuD]\u001d\bD\\6\n\txK\n,\u0005\u0016g\u001d!Vv\u0012E@*FaG!Gv\u0014=QMDy}~%q_H\u000bm5\u001bL\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#N4wS;'\bu'\fCs\u000b\u001a\u0016\u001b\u000bNT\u0006G", "\u0019nX;<:HZ\u0015\u000ez]\n\u0007\u0012>e\u00137", "uK^?ZuD]\u001d\bD\\6\n\txK\n,\u0005\u001c\f\"\u001eKm\nKz/>/d&A|\u001d2V\r@|<g\u0016xj7\u0016g6W\u0005p(\\W*kV|F`gA\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005u\u0011\u0015%\u0012=j: `\u0018R\u0004#uN~L\nJ", "1ta?X5M9#\u0003\u0004L*\u0007\u0014/", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4MHm}$\u001flj\u0003\u0005m9N@5EVY,&@pG\u001f\u00120", "5dc\u0011X-:c \u000e`h0\u0006f9n\u000f(\u000fO", "5dc\u0018b0G", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCyq4MHm}$\u001flj\u0003\u0005m9N@\rQPW\u0002", "@d\\2`)>`v\u000f\bk,\u0006\u0018\u0015o\u00041i>\u000b\"\u0017", "E`a;A6\u001c]\"\u000ezq;", "9nX; *H[$\t\t^"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class KoinApplicationKt {
    private static final ProvidableCompositionLocal<Koin> LocalKoinApplication = CompositionLocalKt.compositionLocalOf$default(null, new Function0<Koin>() { // from class: org.koin.compose.KoinApplicationKt$LocalKoinApplication$1
        @Override // kotlin.jvm.functions.Function0
        public final Koin invoke() {
            Koin defaultKoinContext = KoinApplicationKt.getDefaultKoinContext();
            KoinApplicationKt.warnNoContext(defaultKoinContext);
            return defaultKoinContext;
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<Scope> LocalKoinScope = CompositionLocalKt.compositionLocalOf$default(null, new Function0<Scope>() { // from class: org.koin.compose.KoinApplicationKt$LocalKoinScope$1
        @Override // kotlin.jvm.functions.Function0
        public final Scope invoke() {
            Koin defaultKoinContext = KoinApplicationKt.getDefaultKoinContext();
            KoinApplicationKt.warnNoContext(defaultKoinContext);
            return defaultKoinContext.getScopeRegistry().getRootScope();
        }
    }, 1, null);

    public static final void KoinApplication(final Function1<? super KoinApplication, Unit> application, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i2) throws KoinAppAlreadyStartedException {
        int i3;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1360431358);
        if ((14 & i2) == 0) {
            int i4 = composerStartRestartGroup.changedInstance(application) ? 4 : 2;
            i3 = (i4 + i2) - (i4 & i2);
        } else {
            i3 = i2;
        }
        if ((112 & i2) == 0) {
            int i5 = composerStartRestartGroup.changedInstance(content) ? 32 : 16;
            i3 = (i3 + i5) - (i3 & i5);
        }
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1360431358, i3, -1, "org.koin.compose.KoinApplication (KoinApplication.kt:112)");
            }
            composerStartRestartGroup.startReplaceableGroup(848928288);
            boolean z2 = (i3 + 14) - (i3 | 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
                if (KoinPlatformTools.INSTANCE.defaultContext().getOrNull() != null) {
                    throw new KoinAppAlreadyStartedException("Trying to run new Koin Application whereas Koin is already started. Use 'KoinContext()' instead of check for any 'startKoin' usage. ");
                }
                objRememberedValue = DefaultContextExtKt.startKoin(application);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            KoinApplication koinApplication = (KoinApplication) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalKoinApplication.provides(koinApplication.getKoin()), LocalKoinScope.provides(koinApplication.getKoin().getScopeRegistry().getRootScope())}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1461545922, true, new Function2<Composer, Integer, Unit>() { // from class: org.koin.compose.KoinApplicationKt.KoinApplication.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1461545922, i6, -1, "org.koin.compose.KoinApplication.<anonymous> (KoinApplication.kt:125)");
                    }
                    content.invoke(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: org.koin.compose.KoinApplicationKt.KoinApplication.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws KoinAppAlreadyStartedException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) throws KoinAppAlreadyStartedException {
                    Function1<KoinApplication, Unit> function1 = application;
                    Function2<Composer, Integer, Unit> function2 = content;
                    int i7 = i2;
                    KoinApplicationKt.KoinApplication(function1, function2, composer2, RecomposeScopeImplKt.updateChangedFlags((i7 + 1) - (i7 & 1)));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void KoinContext(final org.koin.core.Koin r7, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r8, androidx.compose.runtime.Composer r9, final int r10, final int r11) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.koin.compose.KoinApplicationKt.KoinContext(org.koin.core.Koin, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void KoinIsolatedContext(final KoinApplication context, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1842654858);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1842654858, i2, -1, "org.koin.compose.KoinIsolatedContext (KoinApplication.kt:167)");
        }
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalKoinApplication.provides(context.getKoin()), LocalKoinScope.provides(context.getKoin().getScopeRegistry().getRootScope())}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2089047606, true, new Function2<Composer, Integer, Unit>() { // from class: org.koin.compose.KoinApplicationKt.KoinIsolatedContext.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((-1) - (((-1) - i3) | ((-1) - 11)) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2089047606, i3, -1, "org.koin.compose.KoinIsolatedContext.<anonymous> (KoinApplication.kt:172)");
                }
                content.invoke(composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: org.koin.compose.KoinApplicationKt.KoinIsolatedContext.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    KoinApplication koinApplication = context;
                    Function2<Composer, Integer, Unit> function2 = content;
                    int i4 = i2;
                    KoinApplicationKt.KoinIsolatedContext(koinApplication, function2, composer2, RecomposeScopeImplKt.updateChangedFlags((i4 + 1) - (i4 & 1)));
                }
            });
        }
    }

    public static final Scope currentKoinScope(Composer composer, int i2) {
        composer.startReplaceableGroup(1668867238);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1668867238, i2, -1, "org.koin.compose.currentKoinScope (KoinApplication.kt:74)");
        }
        ProvidableCompositionLocal<Scope> providableCompositionLocal = LocalKoinScope;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Scope scope = (Scope) objConsume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Koin getDefaultKoinContext() {
        return KoinPlatformTools.INSTANCE.defaultContext().get();
    }

    public static final Koin getKoin(Composer composer, int i2) {
        composer.startReplaceableGroup(523578110);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(523578110, i2, -1, "org.koin.compose.getKoin (KoinApplication.kt:63)");
        }
        ProvidableCompositionLocal<Koin> providableCompositionLocal = LocalKoinApplication;
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(providableCompositionLocal);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Koin koin = (Koin) objConsume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return koin;
    }

    public static final ProvidableCompositionLocal<Koin> getLocalKoinApplication() {
        return LocalKoinApplication;
    }

    public static final ProvidableCompositionLocal<Scope> getLocalKoinScope() {
        return LocalKoinScope;
    }

    public static final Scope rememberCurrentKoinScope(Composer composer, int i2) {
        composer.startReplaceableGroup(-939861293);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-939861293, i2, -1, "org.koin.compose.rememberCurrentKoinScope (KoinApplication.kt:86)");
        }
        composer.startReplaceableGroup(1554479354);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = (Scope) composer.consume(LocalKoinScope);
            composer.updateRememberedValue(objRememberedValue);
        }
        Scope scope = (Scope) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void warnNoContext(Koin koin) {
        koin.getLogger().info("[Warning] - No Koin context defined in Compose, fallback to default Koin context.\nUse KoinContext(), KoinAndroidContext() or KoinApplication() to setup or create Koin context with Compose and avoid such message.");
    }
}
