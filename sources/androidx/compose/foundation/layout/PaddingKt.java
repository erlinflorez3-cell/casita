package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.react.uimanager.ViewProps;
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
/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\"\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\u00166B\u0015\"4\u0012}\u000bnjO0LeN6jk8ş\u0004{b#\f(\u007fCSUH~h\u000eӠMʴ̊rL`\rQ\u0012\u001e:\u0007̓DI\u0004w\u000e\u0018\u00152PsW3{pm?ftD\n82P9@\n҈\u0019ݒН\u0014x\u0001IY\u0013*hN\u0081RR;L5 \u0018\u0006L(\u0019\u001e\u000bh~<NlkCG#1jrT-_>\u0007e\rtUW\u0013|a,6X7c\u0016kXЁ\u0006ѸÜC\u0005E}K\u0012\u0001c59as\u0006E\u0001\u007fB$[U\u0013]\u00016t\u0005\u007fa<-1OqTh\u000eVx+\u0002\u0013<\u0012\u001f\u001e'v/] l\b\u001c>\rr\u0002A\u0017\u0007\u0081Aȕѐe8\u001d7\u000eFCP)ziai\u001av7*\u0004=\"1\u0016\u0007!\njTeڠ\u001fT\u0006hIhNU`N8Zem2o\u0013\u00068\u0019HG.EB\u0016ѧ\u001b%ErQ5/\u0005\u001aHrv\u001f\u0005\u000fw\u0004m`bX\"\u001d\u0015}/!(h]|\u0005\u001a_|XZ } b\u0007\u0016\bA!#|͌ طŎRQn\u0005xiu23H~7\b}\u0014\u000e\u0006H\u000f9;Qq\u0014yR%\u0015oBh\u0005fkZS:[#-Ш1ʋн\u0014y\u0002a\\*+nM\u000b44Z@A\\CW3$HA\u000b\u0011wZ\u0017\u0011/Z9$\u0011r<t7\u0002\u0001bvou\u0003a,+aR3GQC$>UPiz\u0002ʶ\u0006Ѩ\u0381\u0004ImkU_́\u0016z]~&ڨ6gPȦA3"}, d2 = {"\u001e`S1\\5@D\u0015\u0006\u000b^:", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u0001*LB?t6\u000f\u0011oq9\u00159", "/k[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u001e`S1\\5@D\u0015\u0006\u000b^:DS\u007f8J-u\u000f", "uE\u0018\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0002!'Pn\nKz/>#\u0005\u001cKw&=\u0017.7j3\"\u001ejR5\u000es,\\L", "6na6m6Gb\u0015\u0006", "DdaA\\*:Z", "\u001e`S1\\5@D\u0015\u0006\u000b^:D|1XQ\u0017\n\u001c", "uE5u?(GR&\t~]?F\u00079m\u000b2\n@J\u0018!Wx\r8\u0006)?bG'3\u0002 >\\\r&g3\u001d\u0019qc*\u0003j<N\u0005|", "AsP?g", "Bn_", "3mS", "0ncAb4", "\u001e`S1\\5@D\u0015\u0006\u000b^:D\u0005\u0003U\u0005\f\u000b\u000f", "uE5\u00139o%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`Hy\u001eEu!D]\b)\u0001t\u0012BWSJ5\u001f\u001a\u0014geB\tT(U\u0007'U\"", "/ab<_<MS\u0004zy]0\u0006\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", ":dUA", "@hV5g", "/ab<_<MS\u0004zy]0\u0006\u000bvq^\u0005\u0001Pma", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:^\u0001\u00181|*VBHu8\u001d(2_C\u000fn6\\vpWP\u0018\u0014fQv>\u0018\u0012gc", "1`[0h3:b\u0019^\u0004]\u0017x\b.i\t*", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\u0019IB:o= \u0006dhI\u0007q\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0015]\u000b4wHFhn(]\fKw_\u0010#\u000e3ytL_e\u000bZ", "1`[0h3:b\u0019l\nZ9\fs+d~,\u0005B", ">`S1\\5@", ">`S1\\5@D\u0015\u0006\u000b^:", ">`S1\\5@\u001bfZW_\u0015b\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:A\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zp/VM0]VrJi", ">`S1\\5@\u001b\n\nn,AeW", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:^c\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018\u0007+\u00114X+`Sv=!g", ">`S1\\5@\u001b%]Wc<iS", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PaddingKt {

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.PaddingKt$padding$1 */
    /* JADX INFO: compiled from: Padding.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<InspectorInfo, Unit> {
        final /* synthetic */ float $bottom;
        final /* synthetic */ float $end;
        final /* synthetic */ float $start;
        final /* synthetic */ float $top;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(float f2, float f3, float f4, float f5) {
            super(1);
            f = f2;
            f = f3;
            f = f4;
            f = f5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
            invoke2(inspectorInfo);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(InspectorInfo inspectorInfo) {
            inspectorInfo.setName(ViewProps.PADDING);
            inspectorInfo.getProperties().set(ViewProps.START, Dp.m6636boximpl(f));
            inspectorInfo.getProperties().set("top", Dp.m6636boximpl(f));
            inspectorInfo.getProperties().set(ViewProps.END, Dp.m6636boximpl(f));
            inspectorInfo.getProperties().set(ViewProps.BOTTOM, Dp.m6636boximpl(f));
        }
    }

    /* JADX INFO: renamed from: padding-qDBjuR0 */
    public static final Modifier m1021paddingqDBjuR0(Modifier modifier, float f2, float f3, float f4, float f5) {
        return modifier.then(new PaddingElement(f2, f3, f4, f5, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.1
            final /* synthetic */ float $bottom;
            final /* synthetic */ float $end;
            final /* synthetic */ float $start;
            final /* synthetic */ float $top;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(float f22, float f32, float f42, float f52) {
                super(1);
                f = f22;
                f = f32;
                f = f42;
                f = f52;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName(ViewProps.PADDING);
                inspectorInfo.getProperties().set(ViewProps.START, Dp.m6636boximpl(f));
                inspectorInfo.getProperties().set("top", Dp.m6636boximpl(f));
                inspectorInfo.getProperties().set(ViewProps.END, Dp.m6636boximpl(f));
                inspectorInfo.getProperties().set(ViewProps.BOTTOM, Dp.m6636boximpl(f));
            }
        }, null));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.PaddingKt$padding$2 */
    /* JADX INFO: compiled from: Padding.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function1<InspectorInfo, Unit> {
        final /* synthetic */ float $horizontal;
        final /* synthetic */ float $vertical;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(float f2, float f3) {
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
            inspectorInfo.setName(ViewProps.PADDING);
            inspectorInfo.getProperties().set("horizontal", Dp.m6636boximpl(f));
            inspectorInfo.getProperties().set("vertical", Dp.m6636boximpl(f));
        }
    }

    /* JADX INFO: renamed from: padding-VpY3zN4 */
    public static final Modifier m1019paddingVpY3zN4(Modifier modifier, float f2, float f3) {
        return modifier.then(new PaddingElement(f2, f3, f2, f3, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.2
            final /* synthetic */ float $horizontal;
            final /* synthetic */ float $vertical;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(float f22, float f32) {
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
                inspectorInfo.setName(ViewProps.PADDING);
                inspectorInfo.getProperties().set("horizontal", Dp.m6636boximpl(f));
                inspectorInfo.getProperties().set("vertical", Dp.m6636boximpl(f));
            }
        }, null));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.PaddingKt$padding$3 */
    /* JADX INFO: compiled from: Padding.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function1<InspectorInfo, Unit> {
        final /* synthetic */ float $all;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(float f2) {
            super(1);
            f = f2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
            invoke2(inspectorInfo);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(InspectorInfo inspectorInfo) {
            inspectorInfo.setName(ViewProps.PADDING);
            inspectorInfo.setValue(Dp.m6636boximpl(f));
        }
    }

    /* JADX INFO: renamed from: padding-3ABfNKs */
    public static final Modifier m1018padding3ABfNKs(Modifier modifier, float f2) {
        return modifier.then(new PaddingElement(f2, f2, f2, f2, true, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.3
            final /* synthetic */ float $all;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(float f22) {
                super(1);
                f = f22;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName(ViewProps.PADDING);
                inspectorInfo.setValue(Dp.m6636boximpl(f));
            }
        }, null));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.PaddingKt$padding$4 */
    /* JADX INFO: compiled from: Padding.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0019b\f+7k%8Z'Dl>s", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends Lambda implements Function1<InspectorInfo, Unit> {
        AnonymousClass4() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
            invoke2(inspectorInfo);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(InspectorInfo inspectorInfo) {
            inspectorInfo.setName(ViewProps.PADDING);
            inspectorInfo.getProperties().set("paddingValues", paddingValues);
        }
    }

    public static final Modifier padding(Modifier modifier, PaddingValues paddingValues) {
        return modifier.then(new PaddingValuesElement(paddingValues, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt.padding.4
            AnonymousClass4() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName(ViewProps.PADDING);
                inspectorInfo.getProperties().set("paddingValues", paddingValues);
            }
        }));
    }

    /* JADX INFO: renamed from: absolutePadding-qDBjuR0 */
    public static final Modifier m1016absolutePaddingqDBjuR0(Modifier modifier, final float f2, final float f3, final float f4, final float f5) {
        return modifier.then(new PaddingElement(f2, f3, f4, f5, false, new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.PaddingKt$absolutePadding$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("absolutePadding");
                inspectorInfo.getProperties().set("left", Dp.m6636boximpl(f2));
                inspectorInfo.getProperties().set("top", Dp.m6636boximpl(f3));
                inspectorInfo.getProperties().set(ViewProps.RIGHT, Dp.m6636boximpl(f4));
                inspectorInfo.getProperties().set(ViewProps.BOTTOM, Dp.m6636boximpl(f5));
            }
        }, null));
    }

    public static final float calculateStartPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo969calculateLeftPaddingu2uoSUM(layoutDirection) : paddingValues.mo970calculateRightPaddingu2uoSUM(layoutDirection);
    }

    public static final float calculateEndPadding(PaddingValues paddingValues, LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? paddingValues.mo970calculateRightPaddingu2uoSUM(layoutDirection) : paddingValues.mo969calculateLeftPaddingu2uoSUM(layoutDirection);
    }

    /* JADX INFO: renamed from: PaddingValues-0680j_4 */
    public static final PaddingValues m1011PaddingValues0680j_4(float f2) {
        return new PaddingValuesImpl(f2, f2, f2, f2, null);
    }

    /* JADX INFO: renamed from: PaddingValues-YgX7TsA */
    public static final PaddingValues m1012PaddingValuesYgX7TsA(float f2, float f3) {
        return new PaddingValuesImpl(f2, f3, f2, f3, null);
    }

    /* JADX INFO: renamed from: PaddingValues-a9UjIt4 */
    public static final PaddingValues m1014PaddingValuesa9UjIt4(float f2, float f3, float f4, float f5) {
        return new PaddingValuesImpl(f2, f3, f4, f5, null);
    }

    /* JADX INFO: renamed from: padding-qDBjuR0$default */
    public static /* synthetic */ Modifier m1022paddingqDBjuR0$default(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = Dp.m6638constructorimpl(0);
        }
        if ((2 & i2) != 0) {
            f3 = Dp.m6638constructorimpl(0);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            f4 = Dp.m6638constructorimpl(0);
        }
        if ((i2 & 8) != 0) {
            f5 = Dp.m6638constructorimpl(0);
        }
        return m1021paddingqDBjuR0(modifier, f2, f3, f4, f5);
    }

    /* JADX INFO: renamed from: padding-VpY3zN4$default */
    public static /* synthetic */ Modifier m1020paddingVpY3zN4$default(Modifier modifier, float f2, float f3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = Dp.m6638constructorimpl(0);
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            f3 = Dp.m6638constructorimpl(0);
        }
        return m1019paddingVpY3zN4(modifier, f2, f3);
    }

    /* JADX INFO: renamed from: absolutePadding-qDBjuR0$default */
    public static /* synthetic */ Modifier m1017absolutePaddingqDBjuR0$default(Modifier modifier, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = Dp.m6638constructorimpl(0);
        }
        if ((2 & i2) != 0) {
            f3 = Dp.m6638constructorimpl(0);
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            f4 = Dp.m6638constructorimpl(0);
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            f5 = Dp.m6638constructorimpl(0);
        }
        return m1016absolutePaddingqDBjuR0(modifier, f2, f3, f4, f5);
    }

    /* JADX INFO: renamed from: PaddingValues-YgX7TsA$default */
    public static /* synthetic */ PaddingValues m1013PaddingValuesYgX7TsA$default(float f2, float f3, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = Dp.m6638constructorimpl(0);
        }
        if ((i2 & 2) != 0) {
            f3 = Dp.m6638constructorimpl(0);
        }
        return m1012PaddingValuesYgX7TsA(f2, f3);
    }

    /* JADX INFO: renamed from: PaddingValues-a9UjIt4$default */
    public static /* synthetic */ PaddingValues m1015PaddingValuesa9UjIt4$default(float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            f2 = Dp.m6638constructorimpl(0);
        }
        if ((2 & i2) != 0) {
            f3 = Dp.m6638constructorimpl(0);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            f4 = Dp.m6638constructorimpl(0);
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            f5 = Dp.m6638constructorimpl(0);
        }
        return m1014PaddingValuesa9UjIt4(f2, f3, f4, f5);
    }
}
