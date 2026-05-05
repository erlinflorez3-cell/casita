package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
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
/* JADX INFO: compiled from: Offset.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d̉=!4i\bӵLc\u000b\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007nʑA0ZeP.XVB0yڔL$\n#\u001aCiTJ\u00130\tg_wi~J\t\rS\u0011\u0016\u0016'mZJǤ|]\u0018\u0013Jj}ЀKM\u001e<a`#55&8\"F~\u001d\u0001H0x\u0016|zQR$\u0012^F7?ƞ\f˟ŋ\u001e\u0014\fF.\n6}uNNH\u001b\\b/Q\u0002\u001aW\\'wA\rO\u001dF\u0003)\u001dxq\u001eYCe6չ)S\t\u000bj\u0004M\u0003Wqk\u0004\u0011'U*yy]6f\u0005,\u0015YU=cx&j\fi`:-qTԣJִˎ,y\u0001\u0006\u001bEǌ\u000e\u000b/K4ǈ6\u0015\u0007ԭ7\u007f"}, d2 = {"/ab<_<MS\u0003\u007f{l,\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "=eU@X;", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "F", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "G", "/ab<_<MS\u0003\u007f{l,\fP psu\u0011)O", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:^c\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!g", "=eU@X;\u0006D$rHs\u0015K", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class OffsetKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.OffsetKt$offset$1 */
    /* JADX INFO: compiled from: Offset.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04811 extends Lambda implements Function1<InspectorInfo, Unit> {
        final /* synthetic */ float $x;
        final /* synthetic */ float $y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04811(float f2, float f3) {
            super(1);
            f = f2;
            f = f3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
            invoke2(inspectorInfo);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(InspectorInfo inspectorInfo) {
            inspectorInfo.setName(TypedValues.CycleType.S_WAVE_OFFSET);
            inspectorInfo.getProperties().set("x", Dp.m6636boximpl(f));
            inspectorInfo.getProperties().set("y", Dp.m6636boximpl(f));
        }
    }

    /* JADX INFO: renamed from: offset-VpY3zN4 */
    public static final Modifier m978offsetVpY3zN4(Modifier modifier, float f2, float f3) {
        return modifier.then(new OffsetElement(f2, f3, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.OffsetKt.offset.1
            final /* synthetic */ float $x;
            final /* synthetic */ float $y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04811(float f22, float f32) {
                super(1);
                f = f22;
                f = f32;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName(TypedValues.CycleType.S_WAVE_OFFSET);
                inspectorInfo.getProperties().set("x", Dp.m6636boximpl(f));
                inspectorInfo.getProperties().set("y", Dp.m6636boximpl(f));
            }
        }, null));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.OffsetKt$absoluteOffset$1 */
    /* JADX INFO: compiled from: Offset.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<InspectorInfo, Unit> {
        final /* synthetic */ float $x;
        final /* synthetic */ float $y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(float f2, float f3) {
            super(1);
            f = f2;
            f = f3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
            invoke2(inspectorInfo);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("absoluteOffset");
            inspectorInfo.getProperties().set("x", Dp.m6636boximpl(f));
            inspectorInfo.getProperties().set("y", Dp.m6636boximpl(f));
        }
    }

    /* JADX INFO: renamed from: absoluteOffset-VpY3zN4 */
    public static final Modifier m976absoluteOffsetVpY3zN4(Modifier modifier, float f2, float f3) {
        return modifier.then(new OffsetElement(f2, f3, false, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.OffsetKt.absoluteOffset.1
            final /* synthetic */ float $x;
            final /* synthetic */ float $y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(float f22, float f32) {
                super(1);
                f = f22;
                f = f32;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("absoluteOffset");
                inspectorInfo.getProperties().set("x", Dp.m6636boximpl(f));
                inspectorInfo.getProperties().set("y", Dp.m6636boximpl(f));
            }
        }, null));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.OffsetKt$offset$2 */
    /* JADX INFO: compiled from: Offset.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04822 extends Lambda implements Function1<InspectorInfo, Unit> {
        final /* synthetic */ Function1<Density, IntOffset> $offset;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04822(Function1<? super Density, IntOffset> function1) {
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
            inspectorInfo.setName(TypedValues.CycleType.S_WAVE_OFFSET);
            inspectorInfo.getProperties().set(TypedValues.CycleType.S_WAVE_OFFSET, function1);
        }
    }

    public static final Modifier offset(Modifier modifier, Function1<? super Density, IntOffset> function1) {
        return modifier.then(new OffsetPxElement(function1, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.OffsetKt.offset.2
            final /* synthetic */ Function1<Density, IntOffset> $offset;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C04822(Function1<? super Density, IntOffset> function12) {
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
                inspectorInfo.setName(TypedValues.CycleType.S_WAVE_OFFSET);
                inspectorInfo.getProperties().set(TypedValues.CycleType.S_WAVE_OFFSET, function1);
            }
        }));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.OffsetKt$absoluteOffset$2 */
    /* JADX INFO: compiled from: Offset.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function1<InspectorInfo, Unit> {
        final /* synthetic */ Function1<Density, IntOffset> $offset;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super Density, IntOffset> function1) {
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
            inspectorInfo.setName("absoluteOffset");
            inspectorInfo.getProperties().set(TypedValues.CycleType.S_WAVE_OFFSET, function1);
        }
    }

    public static final Modifier absoluteOffset(Modifier modifier, Function1<? super Density, IntOffset> function1) {
        return modifier.then(new OffsetPxElement(function1, false, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.OffsetKt.absoluteOffset.2
            final /* synthetic */ Function1<Density, IntOffset> $offset;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Function1<? super Density, IntOffset> function12) {
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
                inspectorInfo.setName("absoluteOffset");
                inspectorInfo.getProperties().set(TypedValues.CycleType.S_WAVE_OFFSET, function1);
            }
        }));
    }

    /* JADX INFO: renamed from: offset-VpY3zN4$default */
    public static /* synthetic */ Modifier m979offsetVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = Dp.m6638constructorimpl(0);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = Dp.m6638constructorimpl(0);
        }
        return m978offsetVpY3zN4(modifier, f2, f3);
    }

    /* JADX INFO: renamed from: absoluteOffset-VpY3zN4$default */
    public static /* synthetic */ Modifier m977absoluteOffsetVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = Dp.m6638constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m6638constructorimpl(0);
        }
        return m976absoluteOffsetVpY3zN4(modifier, f2, f3);
    }
}
