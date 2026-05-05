package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u000enjG9L͜P.`S2şs{B)cҕyCQU\"Ԃ*\teNo˧vJh\u0011K\u000f\f\u0016~jBկ\u0006x\f\u0011OMRsM3eok:pxD\u000782P;\n\t\u000f\u001eBH>yټGK\u001a\u0017xL~Ej\r{\bJ\u0016\u0014J8\u0001Li0rDV\u0005]h>S\u0007wNf'\u000e=-Q\u001bVl';\b\u0012\"9RO5C8\u0004\u0007\u0015fs?1T:I\u0013~?'Y`$[Dp\u0018\u0014C< \u001ckv>\\3Tԃ\u0010-3Ւ{MV\u00146~K\u000b\u001b>\u001c\u000e4*ρ23\"Ǒ \u00109|\u0001Z\u0011_\u0010^Z\u007f)bي\u001b+\bđC;!o_kދ\u001dg"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006c!>[}\u000e>q\u0015.Z*Em8\u001cj", "", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006c!>[}\u000e>q\u0015.Z1JgC\u001ej", "AsP?g\u0010Gb\u0019\fv\\;\u0001\u00138S\n8\t>\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "3mS\u0016a;>`\u0015|\nb6\u0006v9u\r&{", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00121b\u007f %t\u001a-MP)z0-\u0015>H5\u0010b9Xz&Z\u0016L6d]|K\u0014[[\u0018^4\f\u0001hE.w\u000e;(\u0017,V}9w\u0005\u0016\u001fW\u001dz\u007f>S\u0017G]\u001e\u0005A6dDhc\u0004P/Or7b\f5\u0004XC91\u001eu\u0018.2N8\u0012\u0007]\u001fr\u001czqwP\u0018vG(Hv%JN~UIp%.O\u0006\u0001[\u001ah\u0004'q4\u0004\u00183Ed\u0012Ge'Bh\u0002\u00036lN%&\f\u007f\u0004", "5dc\u0012a+\"\\(~\bZ*\f\r9nm2\fM~\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~]\u0007/7z\u0012,\\GEt}\u0006%w]6\u000ec\u0010W\u0006'THL;`\\{+\u001e\"g\fN\u0001", "5dc g(Kb|\b\n^9x\u0007>i\n1iJ\u0011$\u0015G", "5dc g(MS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn\"U\u0007\"7[\u001d2LCHYC\u001a$h7", "/bc6i,\"\\(~\bZ*\f\r9n", "2qP4Z0GU\u0007\u000evk;", "", "1`_Ah9>B\u001c\u000f\u0003[", "", ">nb%", "", "7mc2e(<b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005O=-\u0015u]7\u0016g6WL", "Ab^=X", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "1n\\=T9>=\u001a\u007f\t^;\u000b", "", "3uT;g\u001f", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class RangeSliderLogic {
    private final MutableInteractionSource endInteractionSource;
    private final MutableInteractionSource startInteractionSource;
    private final RangeSliderState state;

    public RangeSliderLogic(RangeSliderState rangeSliderState, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2) {
        this.state = rangeSliderState;
        this.startInteractionSource = mutableInteractionSource;
        this.endInteractionSource = mutableInteractionSource2;
    }

    public final RangeSliderState getState() {
        return this.state;
    }

    public final MutableInteractionSource getStartInteractionSource() {
        return this.startInteractionSource;
    }

    public final MutableInteractionSource getEndInteractionSource() {
        return this.endInteractionSource;
    }

    public final MutableInteractionSource activeInteraction(boolean z2) {
        return z2 ? this.startInteractionSource : this.endInteractionSource;
    }

    public final int compareOffsets(float f2) {
        return Float.compare(Math.abs(this.state.getRawOffsetStart$material3_release() - f2), Math.abs(this.state.getRawOffsetEnd$material3_release() - f2));
    }

    public final void captureThumb(boolean z2, float f2, Interaction interaction, CoroutineScope coroutineScope) {
        RangeSliderState rangeSliderState = this.state;
        rangeSliderState.onDrag$material3_release(z2, f2 - (z2 ? rangeSliderState.getRawOffsetStart$material3_release() : rangeSliderState.getRawOffsetEnd$material3_release()));
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(z2, interaction, null), 3, null);
    }

    /* JADX INFO: renamed from: androidx.compose.material3.RangeSliderLogic$captureThumb$1, reason: invalid class name */
    /* JADX INFO: compiled from: Slider.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOKp\u0001\u000f\t\bv\u0011\u000f\u000b\r\u001bu\u001a\u0013\u0016\u0011R\u0013\u0012\"')'\u001b\u000b .'\u001d_m", f = " 84..:t19", i = {}, l = {1739}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $draggingStart;
        final /* synthetic */ Interaction $interaction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z2, Interaction interaction, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$draggingStart = z2;
            this.$interaction = interaction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RangeSliderLogic.this.new AnonymousClass1(this.$draggingStart, this.$interaction, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (RangeSliderLogic.this.activeInteraction(this.$draggingStart).emit(this.$interaction, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
