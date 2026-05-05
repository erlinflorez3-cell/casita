package androidx.compose.material3;

import androidx.collection.IntList;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.snapshots.Snapshot;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLcz\u0005I\u0006F\u000b6B\r'4\u0012\u000e\u0007nʑA0ZeP.XW2\u000fy\u0002<$a)yCI^\"}(\u0011WN}gvϺb\u000bY\u000f\u000e\u0016~m4Icxe\u0012\u0015?HģU\u074c}ok8!\u007fF\t.2:8(\u0004в\u001e*V\u0011?\u0007Qs$\u0012^i7ô\u0011ҫQ\u0005(<NL.,6\\\u0016RfLz\nR/Q\u00070B\u0017-m]\u0015M;\\\u001b'U\u0005oLC@e9E)a2\u001fR\nCI?:I\u0013\u0019?'Yr:ɕtݼ\u0004\u0014#U\u0018+k$>\\3z\u0011\u00105ZgcyT>.}z\n?T\u0004<\u001cmΥlǉ\u001ef\u0016A{z\u0001\bXP0\b\t\u007fCkDL=\u007fa/a\u001b\u0015U(;aXE2\u001d\rL1)nO_\u001b\u000e)\u001f)\f\u0010Q__h=vRPY\u000e\u0006\u0012rz\u000e:\u0006@G.3\f\u0013>\u0017S<\n<yܬwɘLDoϸUovY\u0002RvGX3ގ;.!\u000e`Lr\u000e<_bbD\u0011{ \u000bKą\f\u00178^}G/1`p]w\u0002j{k:)=sOY\u001dyD,w3\ņ]Ӓ\u0014kjx\u001aOJs%ZlTa\u001f+h66JH\u0019\u0014NӾP«\u0010\u0013:ŭB2BAI\u0019\u000b+\u001fҨ+նE\u0007!a`}\u001e\u0016t5*\u001bw=E\u001f\u000fjtp\u001e}O̹9ʬd,ECWO'=u$nO\u000b<W!\u0002\u001c_gzU|p$\u0003m{N$P\u000e\u0010\u0004\u0014ж\u001bɒ-<\u001a/Ki\u0001vqO\u0018E\t\u0010J\u001bI\bFg6nGݝlʧNO\\ϟr\u0003l\u0013;\b\u0013!PӖHیKc\\ެ,ZW\u0015\u001bYjq\u000fٟ\u0012ʍ\u001dݒ͓n!Ŀ97[)#:\u0006%O\u0017g\u0003w\u0003~\tp\u000f>t\u0014\u0003Нg\u001cw̥i_8aFpʵ~G*'rù^vi\u007f\bH(Β\u0011k"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006R.1`\b\"&q\u001e.8G9q4+\u0003w]H\u00079", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e)=Yh$5s\u0016;;R7z4s", "AsPAX", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@\u00149a}\u000b;k\u001c.Z1JgC\u001ej,R", "/mX:", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\?8r4s", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "1k^0^\r:Q\u0019ove<|\u0017", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &.s\u001cKL", "5dc\u0010_6<Yyzx^\u001dx\u0010?e\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u00106e}7\u007fJ\n`zP~t@\u00054\u000b", "1ta?X5M/\"\u0001\u0002^", "5dc\u0010h9KS\"\u000eVg.\u0004\t", "u(5", "D`[BX", "", "6nd?", "5dc\u0015b<K", "u(8", "Adc\u0015b<K", "uH\u0018#", "6nd?45@Z\u0019", "7r!\u0001[6N`", "", "u(I", "Adc~'/Hc&", "uY\u0018#", "7r03g,K\\#\t\u0004", "Adc\u000eY;>`\"\t\u0005g", ";h]Bg,", "5dc\u001a\\5Nb\u0019", "Adc\u001a\\5Nb\u0019", ";h]Bg,\u001a\\\u001b\u0006z", ";tc2k", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\rEhy/Az}>\\CNA", "Ad[2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e)=Yh$5s\u0016;;CBk2-\u0019rj!\u0011b,$", "5dc X3>Q(\u0003\u0005gs\u0011\t-R\u000f\u0005_", "Adc X3>Q(\u0003\u0005gsM\u0003\u0002sP\u0007g", "5dc g(MS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn$]\u0006 \"q\u00144MP)z0-\u0015>", "/mX:T;>B#\\\u000bk9|\u0012>", "", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "3mS#T3NSy\t\b:5\u0001\u0011+t\u00042\u0005", "<df", "7rD=W(MS\u0018", "=eU@X;\u001a\\\u001b\u0006z", "/mV9X", "=m62f;N`\u0019^\u0004]", "@nc.g,-]", "/mX:T;>", "uEI\u0019^6MZ\u001d\bD\\6\n\u0013?t\u00041{NJt!P~\u0012E\u0007!D]\b)\r1|3IT75;\u001a\u001ej+#\u0004h,L\u0006|", "CoS.g,\u001bO'~hm(\f\t\u0017i\t8\u000b@", "<na:T3Bh\u0019", "Bn7<h9", "Bn<6a<MS", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnalogTimePickerState implements TimePickerState {
    public static final int $stable = 8;
    private Animatable<Float, AnimationVector1D> anim;
    private float hourAngle;
    private float minuteAngle;
    private final MutatorMutex mutex = new MutatorMutex();
    private final TimePickerState state;

    private final float normalize(float f2) {
        double d2 = ((double) f2) % 6.283185307179586d;
        if (d2 < 0.0d) {
            d2 += 6.283185307179586d;
        }
        return (float) d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float offsetAngle(float f2) {
        float f3 = f2 + 1.5707964f;
        return f3 < 0.0f ? f3 + 6.2831855f : f3;
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: getSelection-yecRtBI, reason: not valid java name */
    public int mo1776getSelectionyecRtBI() {
        return this.state.mo1776getSelectionyecRtBI();
    }

    @Override // androidx.compose.material3.TimePickerState
    public boolean is24hour() {
        return this.state.is24hour();
    }

    @Override // androidx.compose.material3.TimePickerState
    public boolean isAfternoon() {
        return this.state.isAfternoon();
    }

    @Override // androidx.compose.material3.TimePickerState
    public void set24hour(boolean z2) {
        this.state.set24hour(z2);
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setAfternoon(boolean z2) {
        this.state.setAfternoon(z2);
    }

    @Override // androidx.compose.material3.TimePickerState
    /* JADX INFO: renamed from: setSelection-6_8s6DQ, reason: not valid java name */
    public void mo1777setSelection6_8s6DQ(int i2) {
        this.state.mo1777setSelection6_8s6DQ(i2);
    }

    public AnalogTimePickerState(TimePickerState timePickerState) {
        this.state = timePickerState;
        this.hourAngle = ((timePickerState.getHour() % 12) * 0.5235988f) - 1.5707964f;
        this.minuteAngle = (timePickerState.getMinute() * 0.10471976f) - 1.5707964f;
        this.anim = AnimatableKt.Animatable$default(this.hourAngle, 0.0f, 2, null);
    }

    public final TimePickerState getState() {
        return this.state;
    }

    public final float getCurrentAngle() {
        return this.anim.getValue().floatValue();
    }

    public final Object animateToCurrent(Continuation<? super Unit> continuation) {
        float fEndValueForAnimation;
        if (!isUpdated()) {
            return Unit.INSTANCE;
        }
        if (TimePickerSelectionMode.m2765equalsimpl0(mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2769getHouryecRtBI())) {
            fEndValueForAnimation = endValueForAnimation(this.hourAngle);
        } else {
            fEndValueForAnimation = endValueForAnimation(this.minuteAngle);
        }
        Object objMutate = this.mutex.mutate(MutatePriority.PreventUserInput, new AnonymousClass2(fEndValueForAnimation, null), continuation);
        return objMutate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.material3.AnalogTimePickerState$animateToCurrent$2, reason: invalid class name */
    /* JADX INFO: compiled from: TimePicker.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!4i\bDRh|\u0004W\u0006>éFN\u000f$<\u0012&\u0007vlI0rfv-\u0019ނh"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt!\u001e#xhH\\", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK_\u000e\u0002\u000e\u0012\u000bx\u000f\u0014\rx\u0013\u000e\u0017\u0012 \u0002$\u0012&\u0018W\u0016$ %\u001a. \u0010,\u0001423'18hw", f = "!58/\u00191*1*6p-5", i = {}, l = {738}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super AnimationResult<Float, AnimationVector1D>>, Object> {
        final /* synthetic */ float $end;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(float f2, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$end = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AnalogTimePickerState.this.new AnonymousClass2(this.$end, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = Animatable.animateTo$default(AnalogTimePickerState.this.anim, Boxing.boxFloat(this.$end), AnimationSpecKt.spring$default(1.0f, 700.0f, null, 4, null), null, null, this, 12, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    private final boolean isUpdated() {
        if (TimePickerSelectionMode.m2765equalsimpl0(mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2769getHouryecRtBI()) && normalize(this.anim.getTargetValue().floatValue()) == normalize(this.hourAngle)) {
            return false;
        }
        return (TimePickerSelectionMode.m2765equalsimpl0(mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI()) && normalize(this.anim.getTargetValue().floatValue()) == normalize(this.minuteAngle)) ? false : true;
    }

    public final IntList getClockFaceValues() {
        return TimePickerSelectionMode.m2765equalsimpl0(mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI()) ? TimePickerKt.Minutes : TimePickerKt.Hours;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float endValueForAnimation(float f2) {
        float fFloatValue = this.anim.getValue().floatValue() - f2;
        while (fFloatValue > 3.1415927f) {
            fFloatValue -= 6.2831855f;
        }
        while (fFloatValue <= -3.1415927f) {
            fFloatValue += 6.2831855f;
        }
        return this.anim.getValue().floatValue() - fFloatValue;
    }

    public final Object onGestureEnd(Continuation<? super Unit> continuation) {
        float f2;
        if (TimePickerSelectionMode.m2765equalsimpl0(mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2769getHouryecRtBI())) {
            f2 = this.hourAngle;
        } else {
            f2 = this.minuteAngle;
        }
        Object objMutate = this.mutex.mutate(MutatePriority.PreventUserInput, new C05912(endValueForAnimation(f2), null), continuation);
        return objMutate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.material3.AnalogTimePickerState$onGestureEnd$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TimePicker.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!4i\bDRh|\u0004W\u0006>éFN\u000f$<\u0012&\u0007vlI0rfv-\u0019ނh"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt!\u001e#xhH\\", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK_\u000e\u0002\u000e\u0012\u000bx\u000f\u0014\rx\u0013\u000e\u0017\u0012 \u0002$\u0012&\u0018W$$}\u001d,.0.\"\u0003-$ds", f = "!58/\u00191*1*6p-5", i = {}, l = {789}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C05912 extends SuspendLambda implements Function1<Continuation<? super AnimationResult<Float, AnimationVector1D>>, Object> {
        final /* synthetic */ float $end;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05912(float f2, Continuation<? super C05912> continuation) {
            super(1, continuation);
            this.$end = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AnalogTimePickerState.this.new C05912(this.$end, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super AnimationResult<Float, AnimationVector1D>> continuation) {
            return ((C05912) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = Animatable.animateTo$default(AnalogTimePickerState.this.anim, Boxing.boxFloat(this.$end), AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), null, null, this, 12, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.AnalogTimePickerState$rotateTo$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TimePicker.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,˛\u000eӵ\\c#\u0003\bٕn"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK_\u000e\u0002\u000e\u0012\u000bx\u000f\u0014\rx\u0013\u000e\u0017\u0012 \u0002$\u0012&\u0018W'%+\u0019-\u001f\u000f+`o", f = "!58/\u00191*1*6p-5", i = {}, l = {LeicaMakernoteDirectory.TAG_WB_GREEN_LEVEL, 806}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C05922 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
        final /* synthetic */ float $angle;
        final /* synthetic */ boolean $animate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C05922(float f2, boolean z2, Continuation<? super C05922> continuation) {
            super(1, continuation);
            this.$angle = f2;
            this.$animate = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return AnalogTimePickerState.this.new C05922(this.$angle, this.$animate, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Object> continuation) {
            return invoke2((Continuation<Object>) continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<Object> continuation) {
            return ((C05922) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (TimePickerSelectionMode.m2765equalsimpl0(AnalogTimePickerState.this.mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2769getHouryecRtBI())) {
                    AnalogTimePickerState.this.hourAngle = (r2.toHour(this.$angle) % 12) * 0.5235988f;
                    TimePickerState state = AnalogTimePickerState.this.getState();
                    AnalogTimePickerState analogTimePickerState = AnalogTimePickerState.this;
                    state.setHour((analogTimePickerState.toHour(analogTimePickerState.hourAngle) % 12) + (AnalogTimePickerState.this.isAfternoon() ? 12 : 0));
                } else {
                    AnalogTimePickerState.this.minuteAngle = r2.toMinute(this.$angle) * 0.10471976f;
                    TimePickerState state2 = AnalogTimePickerState.this.getState();
                    AnalogTimePickerState analogTimePickerState2 = AnalogTimePickerState.this;
                    state2.setMinute(analogTimePickerState2.toMinute(analogTimePickerState2.minuteAngle));
                }
                if (this.$animate) {
                    AnalogTimePickerState analogTimePickerState3 = AnalogTimePickerState.this;
                    float fEndValueForAnimation = analogTimePickerState3.endValueForAnimation(analogTimePickerState3.offsetAngle(this.$angle));
                    this.label = 2;
                    Object objAnimateTo$default = Animatable.animateTo$default(AnalogTimePickerState.this.anim, Boxing.boxFloat(fEndValueForAnimation), AnimationSpecKt.spring$default(1.0f, 700.0f, null, 4, null), null, null, this, 12, null);
                    return objAnimateTo$default == coroutine_suspended ? coroutine_suspended : objAnimateTo$default;
                }
                this.label = 1;
                if (AnalogTimePickerState.this.anim.snapTo(Boxing.boxFloat(AnalogTimePickerState.this.offsetAngle(this.$angle)), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object rotateTo$default(AnalogTimePickerState analogTimePickerState, float f2, boolean z2, Continuation continuation, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        return analogTimePickerState.rotateTo(f2, z2, continuation);
    }

    public final Object rotateTo(float f2, boolean z2, Continuation<? super Unit> continuation) {
        Object objMutate = this.mutex.mutate(MutatePriority.UserInput, new C05922(f2, z2, null), continuation);
        return objMutate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate : Unit.INSTANCE;
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getMinute() {
        return this.state.getMinute();
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setMinute(int i2) {
        this.minuteAngle = (i2 * 0.10471976f) - 1.5707964f;
        this.state.setMinute(i2);
        if (TimePickerSelectionMode.m2765equalsimpl0(mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2770getMinuteyecRtBI())) {
            this.anim = AnimatableKt.Animatable$default(this.minuteAngle, 0.0f, 2, null);
        }
        updateBaseStateMinute();
    }

    private final void updateBaseStateMinute() {
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            this.state.setMinute(getMinute());
            Unit unit = Unit.INSTANCE;
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    @Override // androidx.compose.material3.TimePickerState
    public int getHour() {
        return this.state.getHour();
    }

    @Override // androidx.compose.material3.TimePickerState
    public void setHour(int i2) {
        this.hourAngle = ((i2 % 12) * 0.5235988f) - 1.5707964f;
        this.state.setHour(i2);
        if (TimePickerSelectionMode.m2765equalsimpl0(mo1776getSelectionyecRtBI(), TimePickerSelectionMode.Companion.m2769getHouryecRtBI())) {
            this.anim = AnimatableKt.Animatable$default(this.hourAngle, 0.0f, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toHour(float f2) {
        return ((int) ((((double) f2) + (((double) 0.2617994f) + 1.5707963267948966d)) / ((double) 0.5235988f))) % 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int toMinute(float f2) {
        return ((int) ((((double) f2) + (((double) 0.05235988f) + 1.5707963267948966d)) / ((double) 0.10471976f))) % 60;
    }
}
