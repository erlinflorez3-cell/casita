package org.koin.compose.scope;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.exifinterface.media.ExifInterface;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinExperimentalAPI;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.scope.Scope;
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
@Metadata(bv = {}, d1 = {"ЯB\u001d̉=!,i\bӵLc\u000b\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nʑA0ZeP.hS2\u000fq{<$iҕyّCU(\n*\teNogtJb\u000bY\u000f\u000e\u0016~mD\u0001cތu\u0012=1r\u0005M3e\u0001M;ptd\u00070428(\b/\u001bݵL\u0010|~sZ\u001a\u0017HK\u0001<b\r{\u0004H\u0018ĂB \u0007%#lߑ:HzeRk1Ʌ\u0002B|&\u007f8\u0003ձ\u001bOj&5v\u0010([HE@-)\u0002\u000foR:L3PwC\u0013m?2;K\u0004WdW.\u001aƦ/O\u0013d9̮b՝PӠВ++]qc\t\u001cߊ\u0010z*\fl\f\u001c\u0011?L\\9\u0003ff\u001bcx\u0001bXP0nr\u0011\u0001gD\u001c=\u000bC-I\u001b\u0015P\u0010AϭR7\u0002\fS̜)ҠmďƟX\u000en&3z\u0006cIQn<xR\u0018lUm2s\u0013\u00118\tHR\u00101\f\u0011\\\u0016S=٦=#'rHGזkv\u0013tèSnZKF̨\u001fD6Ґ\r!"}, d2 = {"\u0019nX;F*H^\u0019", "", "Ab^=X\u000b>T\u001d\b~m0\u0007\u0012", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ana4\"2HW\"Hxh9|R\u0015o\u00041Q", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u000e\u001c\u001f\u001d9rp\f4\u001aO\u0005\u001f\u0004A6>*\u001dP", "\"", "", "Ab^=X\u0010\u001d", "", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roq\u001bL", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0012iJ3rL7he6Q\rEv\u0001\u0019kqx[", "Ab^=X\u0018NO \u0003{b,\n", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011[\u001e8})6]}-\r", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bJ\u000e\u0019`My\u0012E@#?f}iC}\u00125QD?kAg\u0001x]@\u000bd0N\u0004|.RX;cV{\u0007\u0019#bWO;\u0016\u0003hE.wR\u0001\u007f\u00185G\u0011?r\nXkt1soO`\u0014F\r^sK1sPg_CTQNq.l\f)zfBE.\"q&pL\u0014\u001f", "\u001dm:<\\5,Q#\nz", "Ab^=X", "uK^?ZuD]\u001d\bD\\6\n\txs}2\u0007@J\u0005\u0015Qz\u000e\u0012]+?h\u0005$@7\u001b?U\r<{=\u001c$lkB\u0015-\r^\u007f%VPX5)(Y9\u001d\u0011g\u0018R* NWK,yNE\u001fQ9Y\u000bJl\t\f_k?r{Ld\u0010TOx92", "9nX; *H[$\t\t^"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class KoinScopeKt {
    @KoinExperimentalAPI
    public static final /* synthetic */ <T> void KoinScope(String scopeID, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(scopeID, "scopeID");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-242492906);
        Koin koin = KoinApplicationKt.getKoin(composer, 0);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
        Scope scopeOrNull = koin.getScopeRegistry().getScopeOrNull(scopeID);
        if (scopeOrNull == null) {
            scopeOrNull = Koin.createScope$default(koin, scopeID, typeQualifier, null, 4, null);
        }
        int i3 = i2 & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
        OnKoinScope(scopeOrNull, content, composer, (i3 + 8) - (i3 & 8));
        composer.endReplaceableGroup();
    }

    @KoinExperimentalAPI
    public static final void KoinScope(String scopeID, Qualifier scopeQualifier, Function2<? super Composer, ? super Integer, Unit> content, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(scopeID, "scopeID");
        Intrinsics.checkNotNullParameter(scopeQualifier, "scopeQualifier");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-1303721996);
        OnKoinScope(Koin.getOrCreateScope$default(KoinApplicationKt.getKoin(composer, 0), scopeID, scopeQualifier, null, 4, null), content, composer, (-1) - (((-1) - ((i2 >> 3) & PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) & ((-1) - 8)));
        composer.endReplaceableGroup();
    }

    @KoinExperimentalAPI
    public static final void KoinScope(final Function1<? super Koin, Scope> scopeDefinition, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(scopeDefinition, "scopeDefinition");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1329043944);
        if ((-1) - (((-1) - i2) | ((-1) - 14)) == 0) {
            i3 = (-1) - (((-1) - (composerStartRestartGroup.changedInstance(scopeDefinition) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((-1) - (((-1) - i2) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changedInstance(content) ? 32 : 16)));
        }
        if ((i3 + 91) - (91 | i3) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1329043944, i3, -1, "org.koin.compose.scope.KoinScope (KoinScope.kt:41)");
            }
            OnKoinScope(scopeDefinition.invoke(KoinApplicationKt.getKoin(composerStartRestartGroup, 0)), content, composerStartRestartGroup, (-1) - (((-1) - ((-1) - (((-1) - i3) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION)))) & ((-1) - 8)));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: org.koin.compose.scope.KoinScopeKt.KoinScope.1
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

                public final void invoke(Composer composer2, int i4) {
                    Function1<Koin, Scope> function1 = scopeDefinition;
                    Function2<Composer, Integer, Unit> function2 = content;
                    int i5 = i2;
                    KoinScopeKt.KoinScope(function1, function2, composer2, RecomposeScopeImplKt.updateChangedFlags((i5 + 1) - (i5 & 1)));
                }
            });
        }
    }

    @KoinExperimentalAPI
    public static final void OnKoinScope(final Scope scope, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i2) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1645165308);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1645165308, i2, -1, "org.koin.compose.scope.OnKoinScope (KoinScope.kt:89)");
        }
        composerStartRestartGroup.startReplaceableGroup(-424940701);
        Koin koin = KoinApplicationKt.getKoin(composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(278619594);
        boolean zChanged = composerStartRestartGroup.changed(scope);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new CompositionKoinScopeLoader(scope, koin);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ((CompositionKoinScopeLoader) objRememberedValue).getScope();
        composerStartRestartGroup.endReplaceableGroup();
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{KoinApplicationKt.getLocalKoinScope().provides(scope)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 147159492, true, new Function2<Composer, Integer, Unit>() { // from class: org.koin.compose.scope.KoinScopeKt.OnKoinScope.1
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
                if ((i3 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(147159492, i3, -1, "org.koin.compose.scope.OnKoinScope.<anonymous> (KoinScope.kt:94)");
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: org.koin.compose.scope.KoinScopeKt.OnKoinScope.2
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
                    KoinScopeKt.OnKoinScope(scope, content, composer2, RecomposeScopeImplKt.updateChangedFlags((-1) - (((-1) - i2) & ((-1) - 1))));
                }
            });
        }
    }
}
