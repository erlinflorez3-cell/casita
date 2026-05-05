package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.Velocity;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
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
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: compiled from: SheetDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d̉=!4i\bDRh|İI\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yCQU\"}(\tWNugvJ`\u000bK\u000f\u0014\u001f\u0001̓4Ikxe\u0012\u00154Z)M7eok>\u0011xD\u000b82P?*\t\u000f\"BH>\u007f+bY\u0016*KP\u0002Ja;Mŋ\u001e\u001c\fJ0\u0007$iwP<N\u0013kJ13\u0003\u0018Q|2&ܞ\u0015\r\u001bVl';}\u0012$1@EF-%\u0002\u00157da?\u0011R\nI\u0015j7'Y]\u0004YFX.&C6\u007f\u0013cr4q\u001dQ\u000f W1UcYf&(&\rB\fʀ\b\u000e\u0014>h@;Կ~\u000e\u001e5\u0005r\u0002@~\u00015ې\u0002ѐe6\u001fӛ A9:3f\u007fc\u0012ύPѼ\u007f\u0007\u0015\u001e1\u0004\u0382%s"}, d2 = {"\u0010ncAb4,V\u0019~\n:5\u0001\u0011+t\u00042\u0005.\f\u0017\u0015", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "", "\u0012qP4;(GR ~k^9\f\r-a\u0007\u0013w?\u007f\u001b I", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "\u0014", "\u0011n]@h4>A+\u0003\u0006^\u001e\u0001\u00182i\t\u0005\u0006O\u0010!\u001f5r\u000e<\u0006\u0002?i\u0007\u001fEV\u0016<\\C:Y2+\u001foh\u0017\u0011l5Nt6KVW", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3UT1PUN*kV|Fi", "AgT2g\u001aMO(~", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d(5Y\r\u000eFi%.#", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "=m59\\5@", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "Dd[<V0Mg", "", "@d\\2`)>`\u0007\u0002z^;j\u0018+t\u007f", "AjX=C(Kb\u001dz\u0002e@\\\u001c:a\t'{?", "", "1n]3\\9FD\u0015\u0006\u000b^\n\u007f\u00058g\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006d(5Y\r\u00113t&.#", "7mXA\\(ED\u0015\u0006\u000b^", "AjX=;0=R\u0019\bhm(\f\t", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu\u001ei\u001f-ZM?jGg\u0013riD\u0011q,\u0018~#VL[0XY@\u0007\u0002\u0015Z\u000e]\u001c\t\fiAyc+3(\u00079S\u0006:{J\n \u0016@t~B \u001dW\u0003$yI)2$cg\u0005QOEo\u007fHo#\u0004XC91\u001eu\u0018.2N8\u0012\u0007]\u001fr\u001c\u0002cvG&~4+\f7IIEod*\u0004#.KQ", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SheetDefaultsKt {
    private static final float DragHandleVerticalPadding = Dp.m6638constructorimpl(22);
    private static final AnimationSpec<Float> BottomSheetAnimationSpec = AnimationSpecKt.tween$default(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX INFO: renamed from: androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 */
    /* JADX INFO: compiled from: SheetDefaults.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я+\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\u000e6B\u0015\"4ߚ\u007f\u0007|jA0JlP.`X2\u000fq\u007f\\#Ӌ*yYП\u0006\u001a,!Qp\\g\u007fnx[;G\u001d\b.x\u0019-yY\u0007`*\u000f`C6Зq߲nމ˃dv<\t.7j`\b\u000b\u0019\u001aXO@z\tEc\f@7ptHU%M3!B\nL(\u0019\u001e\u000bp\u0015J֘kҗƠ3%\tsPYox>\te\rtUW\u0011\u0005d6+n8{խcھ\u0002ޗқ_A\tL\u007fKM\t56CI\"^f\\\u000e\u0017-+}\u0014\u000ev4d\u001dQ\u000f\u0015m?\u05cbb֟ח\u0012*}\u000b\n\u001e\u0005\u0015\u001c\u0018?H\\@Bf6\u0015yuɤWBV\u0016lWH\foH/%.FS9Ig\u0018bޅ\u001dP=\u0012\u0013\"f8\u000f\u00069[\u0003\u0015\t\u0015Ig>QƱP?عGݐ̆]={\u001c͒b\u000b2\u00076ϼ\u001c]z\u0019.\u001dDۄ_R"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\b$\u000b@\u000e\u001b\u0013N=W*y%5h\\ 8i&5\\Q!zr{\u001fqoI\u000fc\u001a`z2G>R;_V{\u001a\u001e!i\u0018V\u0019\u0010\u0005YP\u0001xT@\u001e\u0016\u0015I\u0010Jh\u007fy\u0014\u001b?qw `\u0019Py\u0013\u0005E3q\u0005%", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3UT1PUN*kV|Fi", "=m?<f;\u001fZ\u001d\b|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "1n]@h4>R", "/uP6_(;Z\u0019", "=m?<f;\u001fZ\u001d\b|&\u0019qU3Ap\u001c", "uI9\u0019^6MZ\u001d\bD\\6\n\u0013?t\u00041{NJt!P~\u0012E\u0007!D]\b)\r1|3IT75;\u001a\u001ej+#\u0004h,L\u0006|", "=m?<f;,Q&\t\u0002e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "And?V,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3Ud1WYL,2", "=m?<f;,Q&\t\u0002es[\u001e\u0019Qsrc", "uI9\u0016\u001c\u0011", "=m??X\rEW\"\u0001", "=m??X\rEW\"\u0001BJ\u001e\u0007\u0011zM\n", "uI;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007uzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "=m??X\u001a<`#\u0006\u0002", "=m??X\u001a<`#\u0006\u0002&\u0016\u0012gza].", "uI8u=", "Bn59b(M", "", "=eU@X;-]y\u0006\u0005Z;", "uI\u0018\u0013", "Dd[<V0Mg\b\t[e6x\u0018", "Bn>3Y:>b", "uE\u0018\u0017", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements NestedScrollConnection {
        final /* synthetic */ Function1<Float, Unit> $onFling;
        final /* synthetic */ Orientation $orientation;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super Float, Unit> function1, Orientation orientation) {
            function1 = function1;
            orientation = orientation;
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
        public long mo1094onPreScrollOzD1aCk(long j2, int i2) {
            float fOffsetToFloat = offsetToFloat(j2);
            return (fOffsetToFloat >= 0.0f || !NestedScrollSource.m5268equalsimpl0(i2, NestedScrollSource.Companion.m5280getUserInputWNlRxjI())) ? Offset.Companion.m3953getZeroF1C5BW0() : toOffset(sheetState.getAnchoredDraggableState$material3_release().dispatchRawDelta(fOffsetToFloat));
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
        public long mo820onPostScrollDzOQY0M(long j2, long j3, int i2) {
            return NestedScrollSource.m5268equalsimpl0(i2, NestedScrollSource.Companion.m5280getUserInputWNlRxjI()) ? toOffset(sheetState.getAnchoredDraggableState$material3_release().dispatchRawDelta(offsetToFloat(j3))) : Offset.Companion.m3953getZeroF1C5BW0();
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPreFling-QWom1Mo */
        public Object mo1093onPreFlingQWom1Mo(long j2, Continuation<? super Velocity> continuation) {
            float fVelocityToFloat = velocityToFloat(j2);
            float fRequireOffset = sheetState.requireOffset();
            float fMinAnchor = sheetState.getAnchoredDraggableState$material3_release().getAnchors().minAnchor();
            if (fVelocityToFloat >= 0.0f || fRequireOffset <= fMinAnchor) {
                j2 = Velocity.Companion.m6886getZero9UxMQ8M();
            } else {
                function1.invoke(Boxing.boxFloat(fVelocityToFloat));
            }
            return Velocity.m6866boximpl(j2);
        }

        @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
        /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
        public Object mo819onPostFlingRZ2iAVY(long j2, long j3, Continuation<? super Velocity> continuation) {
            function1.invoke(Boxing.boxFloat(velocityToFloat(j3)));
            return Velocity.m6866boximpl(j3);
        }

        private final long toOffset(float f2) {
            float f3 = orientation == Orientation.Horizontal ? f2 : 0.0f;
            if (orientation != Orientation.Vertical) {
                f2 = 0.0f;
            }
            return OffsetKt.Offset(f3, f2);
        }

        private final float velocityToFloat(long j2) {
            return orientation == Orientation.Horizontal ? Velocity.m6875getXimpl(j2) : Velocity.m6876getYimpl(j2);
        }

        private final float offsetToFloat(long j2) {
            return orientation == Orientation.Horizontal ? Offset.m3937getXimpl(j2) : Offset.m3938getYimpl(j2);
        }
    }

    public static final NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(SheetState sheetState, Orientation orientation, Function1<? super Float, Unit> function1) {
        return new NestedScrollConnection() { // from class: androidx.compose.material3.SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection.1
            final /* synthetic */ Function1<Float, Unit> $onFling;
            final /* synthetic */ Orientation $orientation;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function1<? super Float, Unit> function12, Orientation orientation2) {
                function1 = function12;
                orientation = orientation2;
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
            public long mo1094onPreScrollOzD1aCk(long j2, int i2) {
                float fOffsetToFloat = offsetToFloat(j2);
                return (fOffsetToFloat >= 0.0f || !NestedScrollSource.m5268equalsimpl0(i2, NestedScrollSource.Companion.m5280getUserInputWNlRxjI())) ? Offset.Companion.m3953getZeroF1C5BW0() : toOffset(sheetState.getAnchoredDraggableState$material3_release().dispatchRawDelta(fOffsetToFloat));
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
            public long mo820onPostScrollDzOQY0M(long j2, long j3, int i2) {
                return NestedScrollSource.m5268equalsimpl0(i2, NestedScrollSource.Companion.m5280getUserInputWNlRxjI()) ? toOffset(sheetState.getAnchoredDraggableState$material3_release().dispatchRawDelta(offsetToFloat(j3))) : Offset.Companion.m3953getZeroF1C5BW0();
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* JADX INFO: renamed from: onPreFling-QWom1Mo */
            public Object mo1093onPreFlingQWom1Mo(long j2, Continuation<? super Velocity> continuation) {
                float fVelocityToFloat = velocityToFloat(j2);
                float fRequireOffset = sheetState.requireOffset();
                float fMinAnchor = sheetState.getAnchoredDraggableState$material3_release().getAnchors().minAnchor();
                if (fVelocityToFloat >= 0.0f || fRequireOffset <= fMinAnchor) {
                    j2 = Velocity.Companion.m6886getZero9UxMQ8M();
                } else {
                    function1.invoke(Boxing.boxFloat(fVelocityToFloat));
                }
                return Velocity.m6866boximpl(j2);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
            public Object mo819onPostFlingRZ2iAVY(long j2, long j3, Continuation<? super Velocity> continuation) {
                function1.invoke(Boxing.boxFloat(velocityToFloat(j3)));
                return Velocity.m6866boximpl(j3);
            }

            private final long toOffset(float f2) {
                float f3 = orientation == Orientation.Horizontal ? f2 : 0.0f;
                if (orientation != Orientation.Vertical) {
                    f2 = 0.0f;
                }
                return OffsetKt.Offset(f3, f2);
            }

            private final float velocityToFloat(long j2) {
                return orientation == Orientation.Horizontal ? Velocity.m6875getXimpl(j2) : Velocity.m6876getYimpl(j2);
            }

            private final float offsetToFloat(long j2) {
                return orientation == Orientation.Horizontal ? Offset.m3937getXimpl(j2) : Offset.m3938getYimpl(j2);
            }
        };
    }

    /* JADX INFO: renamed from: androidx.compose.material3.SheetDefaultsKt$rememberSheetState$1 */
    /* JADX INFO: compiled from: SheetDefaults.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C06791 extends Lambda implements Function1<SheetValue, Boolean> {
        public static final C06791 INSTANCE = ;

        C06791() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(SheetValue sheetValue) {
            return true;
        }
    }

    public static final SheetState rememberSheetState(boolean z2, Function1<? super SheetValue, Boolean> function1, SheetValue sheetValue, boolean z3, Composer composer, int i2, int i3) {
        boolean z4 = z3;
        SheetValue sheetValue2 = sheetValue;
        C06791 c06791 = function1;
        boolean z5 = z2;
        ComposerKt.sourceInformationMarkerStart(composer, 1032784200, "C(rememberSheetState)P(3)408@15981L7,420@16374L180,409@16000L554:SheetDefaults.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            z5 = false;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            c06791 = C06791.INSTANCE;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            sheetValue2 = SheetValue.Hidden;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            z4 = false;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1032784200, i2, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:407)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Density density = (Density) objConsume;
        Object[] objArr = {Boolean.valueOf(z5), c06791, Boolean.valueOf(z4)};
        Saver<SheetState, SheetValue> Saver = SheetState.Companion.Saver(z5, c06791, density, z4);
        ComposerKt.sourceInformationMarkerStart(composer, -349419818, "CC(remember):SheetDefaults.kt#9igjgp");
        int i4 = (-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - ((((((-1) - (((-1) - i2) | ((-1) - 14))) ^ 6) <= 4 || !composer.changed(z5)) && (6 & i2) != 4) ? 0 : 1)) & ((-1) - (composer.changed(density) ? 1 : 0))))) & ((-1) - ((((((-1) - (((-1) - i2) | ((-1) - 896))) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) <= 256 || !composer.changed(sheetValue2)) && (i2 + BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) - (384 | i2) != 256) ? 0 : 1))))) & ((-1) - (((((112 & i2) ^ 48) <= 32 || !composer.changed(c06791)) && (i2 + 48) - (48 | i2) != 32) ? 0 : 1)));
        int i5 = (((((i2 + 7168) - (7168 | i2)) ^ 3072) > 2048 && composer.changed(z4)) || (i2 & 3072) == 2048) ? 1 : 0;
        int i6 = (i4 + i5) - (i4 & i5);
        Object objRememberedValue = composer.rememberedValue();
        if (i6 != 0 || objRememberedValue == Composer.Companion.getEmpty()) {
            final SheetValue sheetValue3 = sheetValue2;
            final Function1<? super SheetValue, Boolean> function12 = c06791;
            final boolean z6 = z4;
            final boolean z7 = z5;
            objRememberedValue = (Function0) new Function0<SheetState>() { // from class: androidx.compose.material3.SheetDefaultsKt$rememberSheetState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final SheetState invoke() {
                    return new SheetState(z7, density, sheetValue3, function12, z6);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        SheetState sheetState = (SheetState) RememberSaveableKt.m3764rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return sheetState;
    }
}
