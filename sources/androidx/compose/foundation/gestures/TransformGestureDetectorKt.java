package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
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
/* JADX INFO: compiled from: TransformGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d̉=!,n\bDZc|\u0004G\u00078\u000bDB\u0007Ӭ4\u0012\u0006\u0010nj?5LeV.ZS@\u000fs{:$c$\bCCU0}*\tUS\u007f{|Ϻr\u000bq\u000e.\u0016'jrIȺwزܫ\u00134HpM5e\u0007K<xtd\u0005H2P<*\u000b\u0007\u001a8M(v)Iƚ\u0010\u0012>G\tL`\u0015e\u0005H\u0011.>N\u0005NbmNDM\u0005]h5;\u0010wKf'\u000e0%M;Jù+\r\u0005k63NBM\u0015SR+\u0007\u0001_W\u000bM}U\u0005\u0017&O+wwo3f\r,\u0015Y]5]!5\r\u000bW`\u001a7CO\u0012Q\u0001l6\t\u0013V\u001dM\u0014\u001d4'ρ27 y\u0018\u00149\t\u0003UFV(sR\u0011\u000bpd\u0017Ӿ\u0004=1L+lWuK\u001bT=\"\u001b\u001d/3\u0010\u001d ƟX\u0018f(+Z}eASFCne\u001ajM|2oĊ\u00064\nCW\u00065\u0010!0\u001d+]sI%1k0Vry=ݚ\u001fĈWi`aؚ\"s\u001e:0À(\tC\u0087\t\u0006"}, d2 = {"/mV9X", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "/mV9XsD\u001bg\u0006f)\u0014", "uI\u0018\u0013", "1`[0h3:b\u0019\\zg;\n\u00133d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", "CrT\u0010h9KS\"\u000e", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA}&hjH\\Xo3", "1`[0h3:b\u0019\\zg;\n\u00133dm,\u0011@", "1`[0h3:b\u0019ivg", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA}&hjH\\'\u0011", "1`[0h3:b\u0019k\u0005m(\f\r9n", "1`[0h3:b\u0019s\u0005h4", "2dc2V;-`\u0015\b\t_6\n\u0011\u0011e\u000e7\fM\u0001%", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL", ">`]'b6F:#|\u0001", "=m62f;N`\u0019", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1d]Ae6BR", ">`]", "Hn^:", "@nc.g0H\\", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHta6Yv|<3T6kYvF]\u0017k\u0016\u0018,\u001d\u000eWP(xMEhh<R\u007fJl\u000b\u0015dc\u001cpzQ]\u0014PC\u0013\u007fN3xU]hyU\u000b#l3s\u0010h-XI>.\u001dG\\\u0002mL?\u0006EZ\r{TCQdL\u0019xGy", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TransformGestureDetectorKt {
    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope pointerInputScope, boolean z2, Function4 function4, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return detectTransformGestures(pointerInputScope, z2, function4, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2, reason: invalid class name */
    /* JADX INFO: compiled from: TransformGestureDetector.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001I(*QR&u8'$hn\u0019\u0018c5]d%QWN\u0002"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU|\u001c\f\u001a \u0014\u001e\"\u001ex\u0018')+)\u001d|\u001f/! 2.2\f6f(*:,+=\u001e=-;A5?C?\u001a9HJLJ>M~\u000e", f = "!>,8<.682\u000b(5551#\u0001!/\u001f\u001c,&(b\u001f'", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {59, 61}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aC^7CZ\u000f8='\r\u0018*6\u001c$\u001c", "aevGf_QU", "ieqS", "_Wp", "_WuZFeWJ>-R9G", "cewIZINVF", "[eeQWZ6V&;T$FI,", "\u0013jjOe\u001aC^7CZ\u000f8='\r\u0018*6\u001c$\u001c", "aevGf_QU", "ieqS", "_Wp", "_WuZFeWJ>-R9G", "cewIZINVF", "[eeQWZ6V&;T$FI,"}, s = {"xQ^", "rQ^", "rQ_", "vQ^", "uQ^", "rQ`", "uQ_", "xQ^", "rQ^", "rQ_", "vQ^", "uQ^", "rQ`", "uQ_"})
    static final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function4<Offset, Offset, Float, Float, Unit> $onGesture;
        final /* synthetic */ boolean $panZoomLock;
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(boolean z2, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$panZoomLock = z2;
            this.$onGesture = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$panZoomLock, this.$onGesture, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x012b A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
        /* JADX WARN: Type inference failed for: r21v0 */
        /* JADX WARN: Type inference failed for: r21v1 */
        /* JADX WARN: Type inference failed for: r21v2 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0194 -> B:7:0x0029). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instruction units count: 418
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object detectTransformGestures(PointerInputScope pointerInputScope, boolean z2, Function4<? super Offset, ? super Offset, ? super Float, ? super Float, Unit> function4, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass2(z2, function4, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }

    public static final float calculateRotation(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i2 >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i2);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i4 = 0;
            }
            i3 += i4;
            i2++;
        }
        if (i3 < 2) {
            return 0.0f;
        }
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        long jCalculateCentroid2 = calculateCentroid(pointerEvent, false);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i5 = 0; i5 < size2; i5++) {
            PointerInputChange pointerInputChange2 = changes2.get(i5);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long jM5385getPositionF1C5BW0 = pointerInputChange2.m5385getPositionF1C5BW0();
                long jM3941minusMKHz9U = Offset.m3941minusMKHz9U(pointerInputChange2.m5386getPreviousPositionF1C5BW0(), jCalculateCentroid2);
                long jM3941minusMKHz9U2 = Offset.m3941minusMKHz9U(jM5385getPositionF1C5BW0, jCalculateCentroid);
                float fM845anglek4lQ0M = m845anglek4lQ0M(jM3941minusMKHz9U2) - m845anglek4lQ0M(jM3941minusMKHz9U);
                float fM3935getDistanceimpl = Offset.m3935getDistanceimpl(Offset.m3942plusMKHz9U(jM3941minusMKHz9U2, jM3941minusMKHz9U)) / 2.0f;
                if (fM845anglek4lQ0M > 180.0f) {
                    fM845anglek4lQ0M -= 360.0f;
                } else if (fM845anglek4lQ0M < -180.0f) {
                    fM845anglek4lQ0M += 360.0f;
                }
                f3 += fM845anglek4lQ0M * fM3935getDistanceimpl;
                f2 += fM3935getDistanceimpl;
            }
        }
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f3 / f2;
    }

    /* JADX INFO: renamed from: angle-k-4lQ0M, reason: not valid java name */
    private static final float m845anglek4lQ0M(long j2) {
        if (Offset.m3937getXimpl(j2) == 0.0f && Offset.m3938getYimpl(j2) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2)))) * 180.0f) / 3.1415927f;
    }

    public static final float calculateZoom(PointerEvent pointerEvent) {
        float fCalculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float fCalculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (fCalculateCentroidSize == 0.0f || fCalculateCentroidSize2 == 0.0f) {
            return 1.0f;
        }
        return fCalculateCentroidSize / fCalculateCentroidSize2;
    }

    public static final long calculatePan(PointerEvent pointerEvent) {
        long jCalculateCentroid = calculateCentroid(pointerEvent, true);
        if (Offset.m3934equalsimpl0(jCalculateCentroid, Offset.Companion.m3952getUnspecifiedF1C5BW0())) {
            return Offset.Companion.m3953getZeroF1C5BW0();
        }
        return Offset.m3941minusMKHz9U(jCalculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static /* synthetic */ float calculateCentroidSize$default(PointerEvent pointerEvent, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return calculateCentroidSize(pointerEvent, z2);
    }

    public static final float calculateCentroidSize(PointerEvent pointerEvent, boolean z2) {
        long jCalculateCentroid = calculateCentroid(pointerEvent, z2);
        float fM3935getDistanceimpl = 0.0f;
        if (Offset.m3934equalsimpl0(jCalculateCentroid, Offset.Companion.m3952getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            PointerInputChange pointerInputChange = changes.get(i3);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                fM3935getDistanceimpl += Offset.m3935getDistanceimpl(Offset.m3941minusMKHz9U(z2 ? pointerInputChange.m5385getPositionF1C5BW0() : pointerInputChange.m5386getPreviousPositionF1C5BW0(), jCalculateCentroid));
                i2++;
            }
        }
        return fM3935getDistanceimpl / i2;
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent pointerEvent, boolean z2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            z2 = true;
        }
        return calculateCentroid(pointerEvent, z2);
    }

    public static final long calculateCentroid(PointerEvent pointerEvent, boolean z2) {
        long jM3953getZeroF1C5BW0 = Offset.Companion.m3953getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            PointerInputChange pointerInputChange = changes.get(i3);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                jM3953getZeroF1C5BW0 = Offset.m3942plusMKHz9U(jM3953getZeroF1C5BW0, z2 ? pointerInputChange.m5385getPositionF1C5BW0() : pointerInputChange.m5386getPreviousPositionF1C5BW0());
                i2++;
            }
        }
        if (i2 == 0) {
            return Offset.Companion.m3952getUnspecifiedF1C5BW0();
        }
        return Offset.m3932divtuRUvjQ(jM3953getZeroF1C5BW0, i2);
    }
}
