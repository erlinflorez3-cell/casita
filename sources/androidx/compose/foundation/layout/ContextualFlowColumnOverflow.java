package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: compiled from: FlowLayoutOverflow.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r(4\u0012}\u0007njO0Le^.ZS@\u000fs{:$c$\bCCU(}*\teNogtL`\u0010YƤ$&)jZH\u000ewmRƉ1HoO7[oU9\u000fuF\u000b&20:\u0012\u0005/\u001d:N\u0016v\tGc\f@3P\u001f@R\u001bR\u001dB\"\u0017N//%֔kX<P|c@83\u0005oHt1o=\rX\u001dHd';\u0003\u0010)ҋD7;\";R1\rb\nE\u0003M\u007fU-x87:wzɱ:b\u0006\u001c%1U\u0016mt,b+[p\u001976_e[P<4&\u0006ԫ\u0011<\n\u001b\u001c&v4ǉ\u001ef\u0016\u001d߀x\u0004"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8VR;~C.\u0011oB@\u0011u\nX}7OU8=\\_sD\u001e$0", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%wKJ\u0007p-U\u00019\u001d", "Bx_2", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%wKJ\u0007p-U\u00019\u00066_,iSyG&\u0001n\u0019N\u0001", ";h]\u0019\\5>a\b\tha6\u000ff9l\u0007$\u0007N\u0001", "", ";h]\u0010e6Lat\u0012~l\u001a\u0001\u001e/T\n\u0016~J\u0013t!Nv\nG\u0005%", "AdT\u001ab9>5\u0019\u000e\n^9", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%wKJ\u0007p-U\u000195[J;\\(", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "AsPAX", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "1n[9T7LSz~\nm,\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\u000fTMMR02\u001fxp#\u0018c9O}1Y\u000b8=\\_sD\u001e$I\"Y+bh=(*xS>#\u0011uN\u0013C2\u0002\u001c\u001f\fDnzKdY(\n\u001esP-rO%5`MKTi.mUd.d\u0004;4\u001do(\u001frY<S\\c\u001apa}qp\u0013n>)", "\u0011n\\=T5B]\"", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ContextualFlowColumnOverflow extends FlowLayoutOverflow {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ContextualFlowColumnOverflow Visible = new ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType.Visible, 0, 0, null, null, 30, null);
    private static final ContextualFlowColumnOverflow Clip = new ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType.Clip, 0, 0, null, null, 30, null);

    public /* synthetic */ ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3, Function1 function1, Function1 function12, DefaultConstructorMarker defaultConstructorMarker) {
        this(overflowType, i2, i3, function1, function12);
    }

    /* synthetic */ ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3, Function1 function1, Function1 function12, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(overflowType, (i4 + 2) - (2 | i4) != 0 ? 0 : i2, (i4 + 4) - (4 | i4) == 0 ? i3 : 0, (i4 + 8) - (8 | i4) != 0 ? null : function1, (-1) - (((-1) - i4) | ((-1) - 16)) == 0 ? function12 : null);
    }

    private ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3, Function1<? super FlowLayoutOverflowState, ? extends Function2<? super Composer, ? super Integer, Unit>> function1, Function1<? super FlowLayoutOverflowState, ? extends Function2<? super Composer, ? super Integer, Unit>> function12) {
        super(overflowType, i2, i3, function1, function12, null);
    }

    /* JADX INFO: compiled from: FlowLayoutOverflow.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005(4\u0012\u000e\u0007njO0LeV.ZS@\u000fs{J$c$wECU(\u0004*ޛWN}gvJ`\fIƫ\u0007,ю\u001b,wT9b\u0018\u000f̓FoM3\u0016\u0019KBxtd\u0007PL0B\u0012\u001b\u0011\u001c:H>\u0003\u000bE[\f@=n{ĐV\rS\u0013ܨ\u0016\u0006D/G#֔kNDX5>H@;\u0003\u0018D~Am9\u0015c\u001dHd';\u0003q ;@eBC0٨\u0007\u0007Xiύ\u0007?wL5\u000359C_\u0004YFX. %-_\r\f\u007fTgԇU`\u00125˦ScQ_>.}z\n T\u0004<\u001aWN4-({ \u000ea\u000b9XŬO\u061cެF\u0002\u0001xD/u\u001aA,Q\u001b\u0015S\u0018\u0001oד9߉\t\u0019&ŀ\u0011p'^b\u000ex\u0017!X\u0006V\u0002kNC`N8[s3Z͗d͆.\u00108Ϛ\u00101\u0002\u0018<\u0017=9aA1&Ȁ\u0002MLj|ݵ|\u0017R\u05c8Va"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8VR;~C.\u0011oB@\u0011u\nX}7OU8=\\_sD\u001e$\u0019kX3\u0018\u0001bE.w\u001a", "", "u(E", "\u0011kX=", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8VR;~C.\u0011oB@\u0011u\nX}7OU8=\\_sD\u001e$0", "5dc\u0010_0I\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc\u0010_0I", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w+MDz41$x]@gj6`T1N\\V5FcrJ\u0015\u0019d $", "$hb6U3>", "5dc#\\:BP ~9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "5dc#\\:BP ~", "3w_.a+\"\\\u0018\u0003xZ;\u0007\u0016", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8VR;~C.\u0011oB@\u0011u\nX}7OU8=\\_sD\u001e$H\fX6\rZ", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'Sc\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018w1WUM(kV|F]\u0019V\"X;\u001cN7K-}DJ.\u0018(PbBr\u0013i \u0015Ery,g\u0010Tz\u001c\u007fS~", "3w_.a+(`v\t\u0002e(\b\u0017/I\t'\u007f>|&!T", "1n[9T7LS|\byb*x\u00189r", ";h]\u0010b3N[\"\rih\u001a\u007f\u0013AC\n/\u0003<\f%\u0017", "", ";h]$\\+MV\b\tha6\u000ff9l\u0007$\u0007N\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "3w_.a+(`v\t\u0002e(\b\u0017/I\t'\u007f>|&!T7UA\u0006q7G\f", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d_0q/\u0012\t\u000eXN.rCJh\u00066Q\rEv\u0001U#\u001e>ytJVY%\u0004\u001d\u0001K7hS/C]\u000b(Ak)q\u0016c\u001co\u00048.\u001c|#)h\u001a/\u0014\f\\\u0010na}qp\u0011 vL.N|%$Oxd<\b6/G\u0003X\u0019<jR5{=\f=\u0014Gd\u0012Ln\"P4", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getClip$annotations() {
        }

        public static /* synthetic */ void getVisible$annotations() {
        }

        private Companion() {
        }

        public final ContextualFlowColumnOverflow getVisible() {
            return ContextualFlowColumnOverflow.Visible;
        }

        public final ContextualFlowColumnOverflow getClip() {
            return ContextualFlowColumnOverflow.Clip;
        }

        public final ContextualFlowColumnOverflow expandIndicator(final Function3<? super ContextualFlowColumnOverflowScope, ? super Composer, ? super Integer, Unit> function3) {
            return new ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType.ExpandIndicator, 0, 0, new Function1<FlowLayoutOverflowState, Function2<? super Composer, ? super Integer, ? extends Unit>>() { // from class: androidx.compose.foundation.layout.ContextualFlowColumnOverflow$Companion$expandIndicator$seeMoreGetter$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Function2<Composer, Integer, Unit> invoke(final FlowLayoutOverflowState flowLayoutOverflowState) {
                    final Function3<ContextualFlowColumnOverflowScope, Composer, Integer, Unit> function32 = function3;
                    return ComposableLambdaKt.composableLambdaInstance(317361705, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowColumnOverflow$Companion$expandIndicator$seeMoreGetter$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i2) {
                            ComposerKt.sourceInformation(composer, "C567@24522L9:FlowLayoutOverflow.kt#2w3rfo");
                            if ((i2 & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(317361705, i2, -1, "androidx.compose.foundation.layout.ContextualFlowColumnOverflow.Companion.expandIndicator.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:566)");
                            }
                            function32.invoke(new ContextualFlowColumnOverflowScopeImpl(flowLayoutOverflowState), composer, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                }
            }, null, 22, null);
        }

        /* JADX INFO: renamed from: expandOrCollapseIndicator--jt2gSs, reason: not valid java name */
        public final ContextualFlowColumnOverflow m934expandOrCollapseIndicatorjt2gSs(final Function3<? super ContextualFlowColumnOverflowScope, ? super Composer, ? super Integer, Unit> function3, final Function3<? super ContextualFlowColumnOverflowScope, ? super Composer, ? super Integer, Unit> function32, int i2, float f2, Composer composer, int i3, int i4) {
            float fM6638constructorimpl = f2;
            int i5 = i2;
            ComposerKt.sourceInformationMarkerStart(composer, -1875330022, "C(expandOrCollapseIndicator)P(1!,3:c#ui.unit.Dp)*609@26729L7,612@26824L1122:FlowLayoutOverflow.kt#2w3rfo");
            int i6 = 1;
            if ((-1) - (((-1) - i4) | ((-1) - 4)) != 0) {
                i5 = 1;
            }
            if ((i4 + 8) - (i4 | 8) != 0) {
                fM6638constructorimpl = Dp.m6638constructorimpl(0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1875330022, i3, -1, "androidx.compose.foundation.layout.ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator (FlowLayoutOverflow.kt:608)");
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer);
            int iMo704roundToPx0680j_4 = ((Density) objConsume).mo704roundToPx0680j_4(fM6638constructorimpl);
            ComposerKt.sourceInformationMarkerStart(composer, -1286152232, "CC(remember):FlowLayoutOverflow.kt#9igjgp");
            int i7 = ((((896 & i3) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composer.changed(i5)) && (384 & i3) != 256) ? 0 : 1;
            boolean zChanged = composer.changed(iMo704roundToPx0680j_4);
            int i8 = (-1) - (((-1) - ((i7 + (zChanged ? 1 : 0)) - (i7 & (zChanged ? 1 : 0)))) & ((-1) - ((((((i3 + 14) - (14 | i3)) ^ 6) <= 4 || !composer.changed(function3)) && (6 & i3) != 4) ? 0 : 1)));
            if ((((112 & i3) ^ 48) <= 32 || !composer.changed(function32)) && (-1) - (((-1) - i3) | ((-1) - 48)) != 32) {
                i6 = 0;
            }
            int i9 = (-1) - (((-1) - i8) & ((-1) - i6));
            Object objRememberedValue = composer.rememberedValue();
            if (i9 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new ContextualFlowColumnOverflow(FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator, i5, iMo704roundToPx0680j_4, new Function1<FlowLayoutOverflowState, Function2<? super Composer, ? super Integer, ? extends Unit>>() { // from class: androidx.compose.foundation.layout.ContextualFlowColumnOverflow$Companion$expandOrCollapseIndicator$1$seeMoreGetter$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Function2<Composer, Integer, Unit> invoke(final FlowLayoutOverflowState flowLayoutOverflowState) {
                        final Function3<ContextualFlowColumnOverflowScope, Composer, Integer, Unit> function33 = function3;
                        return ComposableLambdaKt.composableLambdaInstance(-1318130763, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowColumnOverflow$Companion$expandOrCollapseIndicator$1$seeMoreGetter$1.1
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

                            public final void invoke(Composer composer2, int i10) {
                                ComposerKt.sourceInformation(composer2, "C621@27218L17:FlowLayoutOverflow.kt#2w3rfo");
                                if ((-1) - (((-1) - i10) | ((-1) - 3)) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1318130763, i10, -1, "androidx.compose.foundation.layout.ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:620)");
                                }
                                function33.invoke(new ContextualFlowColumnOverflowScopeImpl(flowLayoutOverflowState), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    }
                }, new Function1<FlowLayoutOverflowState, Function2<? super Composer, ? super Integer, ? extends Unit>>() { // from class: androidx.compose.foundation.layout.ContextualFlowColumnOverflow$Companion$expandOrCollapseIndicator$1$collapseGetter$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Function2<Composer, Integer, Unit> invoke(final FlowLayoutOverflowState flowLayoutOverflowState) {
                        final Function3<ContextualFlowColumnOverflowScope, Composer, Integer, Unit> function33 = function32;
                        return ComposableLambdaKt.composableLambdaInstance(-2119675914, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.layout.ContextualFlowColumnOverflow$Companion$expandOrCollapseIndicator$1$collapseGetter$1.1
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

                            public final void invoke(Composer composer2, int i10) {
                                ComposerKt.sourceInformation(composer2, "C628@27495L19:FlowLayoutOverflow.kt#2w3rfo");
                                if ((-1) - (((-1) - i10) | ((-1) - 3)) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2119675914, i10, -1, "androidx.compose.foundation.layout.ContextualFlowColumnOverflow.Companion.expandOrCollapseIndicator.<anonymous>.<anonymous>.<anonymous> (FlowLayoutOverflow.kt:627)");
                                }
                                function33.invoke(new ContextualFlowColumnOverflowScopeImpl(flowLayoutOverflowState), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        });
                    }
                }, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            ContextualFlowColumnOverflow contextualFlowColumnOverflow = (ContextualFlowColumnOverflow) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return contextualFlowColumnOverflow;
        }
    }
}
