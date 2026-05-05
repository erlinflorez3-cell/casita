package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
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
/* JADX INFO: compiled from: MovableContent.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d̉=!,o\bӵLc\u000b\u0004I\u0006>\u000b6B\u0015\"4\u0012}\u0007njO0LeN.ZS@\u000fs{:%c$\bCCU }*\teNogtLb\u000bY\u000f\u000eǝ\u0011\u0012:Im\u0004m\u0014\u001f2pqm4ޜs=?c%E\u0013$J-H{\u0015\u0001H,v\u0011ͯ~CQ\u000fܘ4@~?jF[\u00052#\u0016@0\u0001dcwPFH\u001b_h5ݭ\u0007iHQGa6ŧ[\u0014vi5\u0011\u000fr.-P7{\u001c5U\u0013\u0007\u0001]m\tӭu=\u000bkҊ++W{o\u0002f\u007f,,;Q\u001d]90l\u0007a`R2;QsK~\u0010V\u0001ߡ\u007f\rB\u0007.\b-Ξ<7:h\u000e\rA\u007f#nNT\u001auR\u0002\u000ba|!5\u0002C+\u007f&vSq;GPe\u0005˿\u0011\u001e)\u0004ͼ%[b\u001axr)T\u0010nASP=\u000fX\u001a[MmJ{r\u0004:\u0004vU\u00101\f\u0011\\\u0019SD٦=#'n\"JJϙ\u0005\u000f\u0001jYh`S`$t\u0016E89-hH|\"{RdXr\u001b]\u001ed\u0007D\u0013#\"lw\u0003/5\u0012^O\u0017k\u0019Zύ\u000e%5iƠ]ny\u001do)l3Mts\u0012qR=\u001eO>r\u0005\u001fqRU\u001cZ#624XjV\t\fF^\fA4m\u0002ʬ8,7\u001c|\u0017Nґ,La~\u000f^hs0\u0001Z32\u0011\n&z\n\u000fa\r\u0018}k\u0011l<~p\"sKa7)&\u001c-x6\r#M\r\u0004\u0002Wg\u0013X\\n&u\u0004}N&׀=Q5@т\u0013~7D\u001apS_\u000b{aO\"'A\u0011\n\u0011Kh\\i6pҔ0`pMׅX\u0017(\f~t)Ψr\u0014*{T~_yd\rk>\u0010\u0007\u0013[LNf~3%Ǫ)\u0001u%Ŀ9-I<ޗ\u001aw\"7-7k|\bJ\nd\u001f&;y\u0014.s\u00166ia_B;fK\b\bй&$r\u0006\u074cLj}\u001db\u000b:ؿA\\afvUFT;O\fj\u001fH\u001drf[\u0001'\u007f\u007fD.&1\u0004E\u000e\u0014\rES\u001aߠWgspљ`\u000bP$ϻ\u000f{?z*\u0004K3nyr\u000b@\u0006:,FCKbKF\u0019&D,\u0003\u0013\u001bEdi4\u0012)\rʮc\u000f\u001d5¡w;\\#tzbƇV\u0019\u0001Gf 8\u000b\u001f\u00119\u001e\u0007@a+{JlQs4\u0011Sc\u001d+l_~-/;Fd9a3h\u0003\u001bE\fEw\u000f\u0530\bG/pÃs\f>-Ԡ!B&*QK\u001fr\u000fXn\red\u0015x\u0007\u0014vR\u0015,9\u0001\u000b|TG\u001a\u0011\u001b\u0019\u0016\u0001\u007fd=L|yeSױ\u0005\u0017J,ܰ\u0010|i[;/\fז;Qil\u001a&\nas=\u0004\b.+G\u0006z\"je>\u0013\u0018a3b&s&bH\u001d#R0\u0004tT\u0005t\u001a.NA_\u0004C\u0002Ylim\b!n)Y|ތFKn{Ơgli\u0004ό\u000f\u0003tCv\u0006|߲h\u001d7&$ܙe͠^:\u0019֦ޙ\\'"}, d2 = {";ne.U3>1#\b\n^5\fn/y", "", ";ne.U3>1#\b\n^5\fr0", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "1n]AX5M", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b'c", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001e", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'Sc\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b(c", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001e0", "\u001e1", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>(Sc\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b)c", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001e2", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>)Sc\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b*c", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "\u001e3", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>*Sc\u001es =TGD59/\u001d2bI\u0010a;R\u00010U\u0016/<eP\u0002A\u001e\u001b+c", ";ne.U3>1#\b\n^5\fz3t\u0003\u0015{>\u0001\u001b(G|w=", Global.BLANK, "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MovableContentKt {
    public static final int movableContentKey = 126665345;

    public static final Function2<Composer, Integer, Unit> movableContentOf(final Function2<? super Composer, ? super Integer, Unit> function2) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-1079330685, true, new Function3<Unit, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Unit unit, Composer composer, Integer num) {
                invoke(unit, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Unit unit, Composer composer, int i2) {
                ComposerKt.sourceInformation(composer, "C37@1498L9:MovableContent.kt#9igjgp");
                if ((i2 + 17) - (17 | i2) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1079330685, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:37)");
                }
                function2.invoke(composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-642339857, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i2) {
                ComposerKt.sourceInformation(composer, "C:MovableContent.kt#9igjgp");
                if ((i2 + 3) - (3 | i2) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-642339857, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:39)");
                }
                composer.insertMovableContent(movableContent, Unit.INSTANCE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <P> Function3<P, Composer, Integer, Unit> movableContentOf(Function3<? super P, ? super Composer, ? super Integer, Unit> function3) {
        final MovableContent movableContent = new MovableContent(function3);
        return ComposableLambdaKt.composableLambdaInstance(-434707029, true, new Function3<P, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
                invoke(obj, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(P p2, Composer composer, int i2) {
                ComposerKt.sourceInformation(composer, "C:MovableContent.kt#9igjgp");
                if ((i2 + 6) - (6 | i2) == 0) {
                    i2 = (-1) - (((-1) - i2) & ((-1) - ((-1) - (((-1) - i2) | ((-1) - 8)) == 0 ? composer.changed(p2) : composer.changedInstance(p2) ? 4 : 2)));
                }
                if ((-1) - (((-1) - i2) | ((-1) - 19)) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-434707029, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:64)");
                }
                composer.insertMovableContent(movableContent, p2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <P1, P2> Function4<P1, P2, Composer, Integer, Unit> movableContentOf(final Function4<? super P1, ? super P2, ? super Composer, ? super Integer, Unit> function4) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(1849814513, true, new Function3<Pair<? extends P1, ? extends P2>, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Pair<? extends P1, ? extends P2> pair, Composer composer, int i2) {
                ComposerKt.sourceInformation(composer, "C87@3417L28:MovableContent.kt#9igjgp");
                if ((6 & i2) == 0) {
                    int i3 = (8 & i2) == 0 ? composer.changed(pair) : composer.changedInstance(pair) ? 4 : 2;
                    i2 = (i2 + i3) - (i2 & i3);
                }
                if ((-1) - (((-1) - i2) | ((-1) - 19)) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1849814513, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:87)");
                }
                function4.invoke(pair.getFirst(), pair.getSecond(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1200019734, true, new Function4<P1, P2, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Composer composer, Integer num) {
                invoke(obj, obj2, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(P1 p1, P2 p2, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C:MovableContent.kt#9igjgp");
                if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
                    i3 = ((8 & i2) == 0 ? composer.changed(p1) : composer.changedInstance(p1) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
                    i3 |= (i2 + 64) - (i2 | 64) == 0 ? composer.changed(p2) : composer.changedInstance(p2) ? 32 : 16;
                }
                if ((i3 & 147) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1200019734, i3, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:89)");
                }
                composer.insertMovableContent(movableContent, TuplesKt.to(p1, p2));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <P1, P2, P3> Function5<P1, P2, P3, Composer, Integer, Unit> movableContentOf(final Function5<? super P1, ? super P2, ? super P3, ? super Composer, ? super Integer, Unit> function5) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-284417101, true, new Function3<Pair<? extends Pair<? extends P1, ? extends P2>, ? extends P3>, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Pair<? extends Pair<? extends P1, ? extends P2>, ? extends P3> pair, Composer composer, int i2) {
                ComposerKt.sourceInformation(composer, "C115@4463L51:MovableContent.kt#9igjgp");
                if ((6 & i2) == 0) {
                    i2 |= (8 & i2) == 0 ? composer.changed(pair) : composer.changedInstance(pair) ? 4 : 2;
                }
                if ((-1) - (((-1) - i2) | ((-1) - 19)) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-284417101, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:115)");
                }
                function5.invoke(pair.getFirst().getFirst(), pair.getFirst().getSecond(), pair.getSecond(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1083870185, true, new Function5<P1, P2, P3, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
                invoke(obj, obj2, obj3, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(P1 p1, P2 p2, P3 p3, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C:MovableContent.kt#9igjgp");
                if ((6 & i2) == 0) {
                    i3 = ((i2 + 8) - (8 | i2) == 0 ? composer.changed(p1) : composer.changedInstance(p1) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
                    i3 = (-1) - (((-1) - i3) & ((-1) - ((-1) - (((-1) - i2) | ((-1) - 64)) == 0 ? composer.changed(p2) : composer.changedInstance(p2) ? 32 : 16)));
                }
                if ((384 & i2) == 0) {
                    i3 |= (-1) - (((-1) - i2) | ((-1) - 512)) == 0 ? composer.changed(p3) : composer.changedInstance(p3) ? 256 : 128;
                }
                if ((i3 + 1171) - (1171 | i3) == 1170 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1083870185, i3, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:118)");
                }
                composer.insertMovableContent(movableContent, TuplesKt.to(TuplesKt.to(p1, p2), p3));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <P1, P2, P3, P4> Function6<P1, P2, P3, P4, Composer, Integer, Unit> movableContentOf(final Function6<? super P1, ? super P2, ? super P3, ? super P4, ? super Composer, ? super Integer, Unit> function6) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(1876318581, true, new Function3<Pair<? extends Pair<? extends P1, ? extends P2>, ? extends Pair<? extends P3, ? extends P4>>, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentOf$movableContent$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Pair<? extends Pair<? extends P1, ? extends P2>, ? extends Pair<? extends P3, ? extends P4>> pair, Composer composer, int i2) {
                ComposerKt.sourceInformation(composer, "C144@5570L75:MovableContent.kt#9igjgp");
                if ((i2 + 6) - (6 | i2) == 0) {
                    i2 = (-1) - (((-1) - i2) & ((-1) - ((i2 + 8) - (8 | i2) == 0 ? composer.changed(pair) : composer.changedInstance(pair) ? 4 : 2)));
                }
                if ((i2 + 19) - (19 | i2) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1876318581, i2, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:144)");
                }
                function6.invoke(pair.getFirst().getFirst(), pair.getFirst().getSecond(), pair.getSecond().getFirst(), pair.getSecond().getSecond(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(-1741877681, true, new Function6<P1, P2, P3, P4, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentOf.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, Integer num) {
                invoke(obj, obj2, obj3, obj4, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(P1 p1, P2 p2, P3 p3, P4 p4, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C:MovableContent.kt#9igjgp");
                if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
                    int i4 = (-1) - (((-1) - i2) | ((-1) - 8)) == 0 ? composer.changed(p1) : composer.changedInstance(p1) ? 4 : 2;
                    i3 = (i4 + i2) - (i4 & i2);
                } else {
                    i3 = i2;
                }
                if ((48 & i2) == 0) {
                    i3 |= (64 & i2) == 0 ? composer.changed(p2) : composer.changedInstance(p2) ? 32 : 16;
                }
                if ((384 & i2) == 0) {
                    int i5 = (-1) - (((-1) - i2) | ((-1) - 512)) == 0 ? composer.changed(p3) : composer.changedInstance(p3) ? 256 : 128;
                    i3 = (i3 + i5) - (i3 & i5);
                }
                if ((i2 + 3072) - (3072 | i2) == 0) {
                    int i6 = (i2 & 4096) == 0 ? composer.changed(p4) : composer.changedInstance(p4) ? 2048 : 1024;
                    i3 = (i3 + i6) - (i3 & i6);
                }
                if ((i3 + 9363) - (9363 | i3) == 9362 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1741877681, i3, -1, "androidx.compose.runtime.movableContentOf.<anonymous> (MovableContent.kt:147)");
                }
                composer.insertMovableContent(movableContent, TuplesKt.to(TuplesKt.to(p1, p2), TuplesKt.to(p3, p4)));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <R> Function3<R, Composer, Integer, Unit> movableContentWithReceiverOf(final Function3<? super R, ? super Composer, ? super Integer, Unit> function3) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(250838178, true, new Function3<R, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
                invoke(obj, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(R r2, Composer composer, int i2) {
                ComposerKt.sourceInformation(composer, "C170@6662L9:MovableContent.kt#9igjgp");
                if ((6 & i2) == 0) {
                    i2 = (-1) - (((-1) - i2) & ((-1) - ((i2 + 8) - (8 | i2) == 0 ? composer.changed(r2) : composer.changedInstance(r2) ? 4 : 2)));
                }
                if ((i2 + 19) - (19 | i2) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(250838178, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:170)");
                }
                function3.invoke(r2, composer, Integer.valueOf(i2 & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(506997506, true, new Function3<R, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
                invoke(obj, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(R r2, Composer composer, int i2) {
                ComposerKt.sourceInformation(composer, "C:MovableContent.kt#9igjgp");
                if ((i2 + 6) - (6 | i2) == 0) {
                    int i3 = (-1) - (((-1) - i2) | ((-1) - 8)) == 0 ? composer.changed(r2) : composer.changedInstance(r2) ? 4 : 2;
                    i2 = (i2 + i3) - (i2 & i3);
                }
                if ((-1) - (((-1) - i2) | ((-1) - 19)) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(506997506, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:172)");
                }
                composer.insertMovableContent(movableContent, r2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <R, P> Function4<R, P, Composer, Integer, Unit> movableContentWithReceiverOf(final Function4<? super R, ? super P, ? super Composer, ? super Integer, Unit> function4) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(812082854, true, new Function3<Pair<? extends R, ? extends P>, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Pair<? extends R, ? extends P> pair, Composer composer, int i2) {
                ComposerKt.sourceInformation(composer, "C197@7673L18:MovableContent.kt#9igjgp");
                if ((i2 + 6) - (6 | i2) == 0) {
                    int i3 = (i2 + 8) - (8 | i2) == 0 ? composer.changed(pair) : composer.changedInstance(pair) ? 4 : 2;
                    i2 = (i2 + i3) - (i2 & i3);
                }
                if ((i2 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(812082854, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:197)");
                }
                function4.invoke(pair.getFirst(), pair.getSecond(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(627354118, true, new Function4<R, P, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Composer composer, Integer num) {
                invoke(obj, obj2, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(R r2, P p2, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C:MovableContent.kt#9igjgp");
                if ((6 & i2) == 0) {
                    i3 = ((8 & i2) == 0 ? composer.changed(r2) : composer.changedInstance(r2) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((-1) - (((-1) - i2) | ((-1) - 48)) == 0) {
                    i3 = (-1) - (((-1) - i3) & ((-1) - ((-1) - (((-1) - i2) | ((-1) - 64)) == 0 ? composer.changed(p2) : composer.changedInstance(p2) ? 32 : 16)));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 147)) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(627354118, i3, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:199)");
                }
                composer.insertMovableContent(movableContent, TuplesKt.to(r2, p2));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <R, P1, P2> Function5<R, P1, P2, Composer, Integer, Unit> movableContentWithReceiverOf(final Function5<? super R, ? super P1, ? super P2, ? super Composer, ? super Integer, Unit> function5) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(-1322148760, true, new Function3<Pair<? extends Pair<? extends R, ? extends P1>, ? extends P2>, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Pair<? extends Pair<? extends R, ? extends P1>, ? extends P2> pair, Composer composer, int i2) {
                ComposerKt.sourceInformation(composer, "C225@8739L35:MovableContent.kt#9igjgp");
                if ((-1) - (((-1) - i2) | ((-1) - 6)) == 0) {
                    i2 = (-1) - (((-1) - i2) & ((-1) - ((i2 + 8) - (8 | i2) == 0 ? composer.changed(pair) : composer.changedInstance(pair) ? 4 : 2)));
                }
                if ((-1) - (((-1) - i2) | ((-1) - 19)) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1322148760, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:225)");
                }
                function5.invoke(pair.getFirst().getFirst(), pair.getFirst().getSecond(), pair.getSecond(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(583402949, true, new Function5<R, P1, P2, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(5);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
                invoke(obj, obj2, obj3, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(R r2, P1 p1, P2 p2, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C:MovableContent.kt#9igjgp");
                if ((i2 + 6) - (6 | i2) == 0) {
                    i3 = ((-1) - (((-1) - i2) | ((-1) - 8)) == 0 ? composer.changed(r2) : composer.changedInstance(r2) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((48 & i2) == 0) {
                    i3 = (-1) - (((-1) - i3) & ((-1) - ((64 & i2) == 0 ? composer.changed(p1) : composer.changedInstance(p1) ? 32 : 16)));
                }
                if ((384 & i2) == 0) {
                    i3 = (-1) - (((-1) - i3) & ((-1) - ((i2 & 512) == 0 ? composer.changed(p2) : composer.changedInstance(p2) ? 256 : 128)));
                }
                if ((-1) - (((-1) - i3) | ((-1) - 1171)) == 1170 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(583402949, i3, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:228)");
                }
                composer.insertMovableContent(movableContent, TuplesKt.to(TuplesKt.to(r2, p1), p2));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    public static final <R, P1, P2, P3> Function6<R, P1, P2, P3, Composer, Integer, Unit> movableContentWithReceiverOf(final Function6<? super R, ? super P1, ? super P2, ? super P3, ? super Composer, ? super Integer, Unit> function6) {
        final MovableContent movableContent = new MovableContent(ComposableLambdaKt.composableLambdaInstance(838586922, true, new Function3<Pair<? extends Pair<? extends R, ? extends P1>, ? extends Pair<? extends P2, ? extends P3>>, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt$movableContentWithReceiverOf$movableContent$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Composer composer, Integer num) {
                invoke((Pair) obj, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Pair<? extends Pair<? extends R, ? extends P1>, ? extends Pair<? extends P2, ? extends P3>> pair, Composer composer, int i2) {
                ComposerKt.sourceInformation(composer, "C254@9865L59:MovableContent.kt#9igjgp");
                if ((i2 + 6) - (6 | i2) == 0) {
                    i2 |= (8 & i2) == 0 ? composer.changed(pair) : composer.changedInstance(pair) ? 4 : 2;
                }
                if ((-1) - (((-1) - i2) | ((-1) - 19)) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(838586922, i2, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:254)");
                }
                function6.invoke(pair.getFirst().getFirst(), pair.getFirst().getSecond(), pair.getSecond().getFirst(), pair.getSecond().getSecond(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return ComposableLambdaKt.composableLambdaInstance(1468683306, true, new Function6<R, P1, P2, P3, Composer, Integer, Unit>() { // from class: androidx.compose.runtime.MovableContentKt.movableContentWithReceiverOf.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(6);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function6
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, Integer num) {
                invoke(obj, obj2, obj3, obj4, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(R r2, P1 p1, P2 p2, P3 p3, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C:MovableContent.kt#9igjgp");
                if ((i2 + 6) - (6 | i2) == 0) {
                    i3 = (-1) - (((-1) - ((i2 + 8) - (8 | i2) == 0 ? composer.changed(r2) : composer.changedInstance(r2) ? 4 : 2)) & ((-1) - i2));
                } else {
                    i3 = i2;
                }
                if ((48 & i2) == 0) {
                    i3 = (-1) - (((-1) - i3) & ((-1) - ((i2 + 64) - (64 | i2) == 0 ? composer.changed(p1) : composer.changedInstance(p1) ? 32 : 16)));
                }
                if ((384 & i2) == 0) {
                    i3 = (-1) - (((-1) - i3) & ((-1) - ((i2 + 512) - (512 | i2) == 0 ? composer.changed(p2) : composer.changedInstance(p2) ? 256 : 128)));
                }
                if ((-1) - (((-1) - i2) | ((-1) - 3072)) == 0) {
                    i3 = (-1) - (((-1) - i3) & ((-1) - ((i2 & 4096) == 0 ? composer.changed(p3) : composer.changedInstance(p3) ? 2048 : 1024)));
                }
                if ((i3 & 9363) == 9362 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1468683306, i3, -1, "androidx.compose.runtime.movableContentWithReceiverOf.<anonymous> (MovableContent.kt:257)");
                }
                composer.insertMovableContent(movableContent, TuplesKt.to(TuplesKt.to(r2, p1), TuplesKt.to(p2, p3)));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }
}
