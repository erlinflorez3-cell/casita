package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d̉=!4i\bDZc|\u0004O\u00068\u000bDB\u0007\"2\u0013\u007f\u0007tsA0JiP.hS2\u000fq~LWi.\nTKW*}P\t_Pwg\u001dK\t\nß\u0013\u0006\u001cz\u001bCOW\u0007h* BD\u007f?aM\u007f?I`#73\u001fݨ&8\u007f\u0007Gɤ0`O\u0005\u0007[K:\u001fX@\u001fG\u0003$S\u000b( \u001eO0\u0003.\\\u0016NFJ|]h0Q\u0002ݦFN-a`\u0012[\u001c^e7\u000f\u0007aL8P9E\u0015S`1\u0006қ_?\tA8ܽ\u000b\u0001R5;as\u0006C\u0001\u007fB\"[d\u001bk\u000b7l\u0007a`:';QsK~\u000fVvߡ\u007f\rB\u0006>\n5YF-HsN\rS\u0015\u0001ԟXa\u0012`R\u007f)aF\u00195\u007fa,g\u001aƻUaA\u001b\u05ee;\u0002\rټ6%\u0007q/_t&n\u001a3T&W\bҌLףLZ\u0012ԯUo\nup\tJ\u00066O\u000e8ɮ\u0015@"}, d2 = {"\u001cn8;f7>Q(\t\bB5}\u0013", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc\u001bb\u0010Ga$~xm6\nl8f\n", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "7r32U<@7\"\r\u0006^*\f\u0013<I\t)\u0006 \n\u0013\u0014No\r", "", "u(I", "Adc\u0011X)NU|\b\ti,z\u00189rc1|J` \u0013Dv\u000e;", "uY\u0018#", "2dQBZ\u0010Ga$~xm6\nl8f\n", "2dU6a0MW#\b\t", "7mb=X*MO\u0016\u0006z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "7mb=X*M]&b\u0004_6", "4`RAb9R", "7mb=X*MO\u0016\u0006zP9x\u0014:e\r", "EqP=c,=", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InspectableValueKt {
    private static final Function1<InspectorInfo, Unit> NoInspectorInfo = new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.platform.InspectableValueKt$NoInspectorInfo$1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InspectorInfo inspectorInfo) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
            invoke2(inspectorInfo);
            return Unit.INSTANCE;
        }
    };
    private static boolean isDebugInspectorInfoEnabled = false;

    public static final Function1<InspectorInfo, Unit> getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z2) {
        isDebugInspectorInfoEnabled = z2;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.InspectableValueKt$debugInspectorInfo$1 */
    /* JADX INFO: compiled from: InspectableValue.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 176, xs = "")
    public static final class AnonymousClass1 extends Lambda implements Function1<InspectorInfo, Unit> {
        final /* synthetic */ Function1<InspectorInfo, Unit> $definitions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function1<? super InspectorInfo, Unit> function1) {
            super(1);
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
            invoke2(inspectorInfo);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(InspectorInfo inspectorInfo) {
            function1.invoke(inspectorInfo);
        }
    }

    public static final Function1<InspectorInfo, Unit> debugInspectorInfo(Function1<? super InspectorInfo, Unit> function1) {
        return isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.ui.platform.InspectableValueKt.debugInspectorInfo.1
            final /* synthetic */ Function1<InspectorInfo, Unit> $definitions;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Function1<? super InspectorInfo, Unit> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(InspectorInfo inspectorInfo) {
                function1.invoke(inspectorInfo);
            }
        } : getNoInspectorInfo();
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "\u0017N\u0005H1U\u0005@\u0018^1\u0007\\T/`aM\u001d,Du\u001bd{\u0006wxdu0olMxK\\j{xU$rS!k^9/gLDkG9$K[\u001cE)6B\u0007u\u0011\u0003J\u001d]\u0017G\u001d5\u0017;Q$\u0006\u000e\u0001C;6\u0013xN\u0013 w\u000f#\u00057V\u0011-\u0004\u001fbJ\"_\",$K<s\u000f 4HzjePp%]LBs(t4\u001a\f\nsAs{\u001dVk`\u000f2a\b=\u0011\\\fz\u0004-7:U\u007fNhf7\u0011\u0001V\u001bn\u001d\u0013tSoyvo\u000e%Z&]!_g1eHF\u0019N6VP'_\u000b:4_/UjqI{1T{:9eB\u0015}/\u0014$D67>\u0007\u001cC\rX>u8\u0004$-Zo\u0010\u0005Oz\u000b\u0018B11:\u0015Y==Q!`i\u001f{\u001d.%~t\t\u0012/]G>.")
    @InterfaceC1492Gx
    public static final Modifier inspectable(Modifier modifier, Function1<? super InspectorInfo, Unit> function1, Function1<? super Modifier, ? extends Modifier> function12) {
        return inspectableWrapper(modifier, function1, function12.invoke(Modifier.Companion));
    }

    public static final Modifier inspectableWrapper(Modifier modifier, Function1<? super InspectorInfo, Unit> function1, Modifier modifier2) {
        InspectableModifier inspectableModifier = new InspectableModifier(function1);
        return modifier.then(inspectableModifier).then(modifier2).then(inspectableModifier.getEnd());
    }
}
