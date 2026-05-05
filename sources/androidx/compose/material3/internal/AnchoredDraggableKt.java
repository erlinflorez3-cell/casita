package androidx.compose.material3.internal;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import com.drew.metadata.iptc.IptcDirectory;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
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
/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0001\u001d̉=!4i\bӵLc\u0003İIي8\u000bDB\u0007\"B\u0012\u007f\u0007tjA0ZeP\u008cZS@\u000fs{:%c$\bCC٥\"}8\tWN}gvJ`\u000bK\u000f\u001c\u0016\u0001̓4Ikxe܈\u00172XoG\u074cUoKBht<\u0005(288\u0002\u0005\u0007\u001b2H\u001e{\u0003CQ\r\u001a0VpBR#M\r\u001a\u0018\u0006F \u0017\u001edɡV6^le:5$\u001b\u001fP÷?e@~]\r\rTU\f\u0017g$ѨN7]\u0015ST3\"`]W\u001aOyM\u000bx)7+\u0010s\u0006:h\u0002$\u0015YT;`ę*\\\u000bW'ϯ?=]jcV\u001e*\bzB\rj\f.\b-Ξ<-`f RA}\u000bSnU\"`Hȕ\tkf!3\u000bK1I\u001dvQ(EGZg\u001c\u0013\u001a6?\u0007m1]d\u000e'\u001f+\\\bWASP=vS8hMq\u0014rx\u0001X\u0005^UF߿: 2\u00173Gs\u007f12\u0004\u0002vV\bx\u000b\u009bvS\u0012RvRRx$JB\u000f\u001c\\TdKk~h\t0\u001fb4T5\u00148\u0019&\\\u0006S9%>f\u007fnoj[v\"%]~gatk\u001cqQ`I4\u007f~VРj%\"[Tb3]\u0007DYێh\\P(BJz\u0010>{rb<\u0017@\\\n\u001cz,a\u001fb\u0015V!6Bo\u001cOݡ\u0019ӳ\u0014~bS<swE\r\t/b|ruΟ\u0007IT|\u000f4]K_H1,e$x4C#5\u0013$\u0004U|dGz\u0003F<c\u001e8X*Ja>k6ä\u000338&=KR\u0018uSS\u0018M!\r\u000b\u001fJ\u0017UԹ\ftvPppPtd\u0019(|\u0005\u001b3\u001ct\u0012\niV\u0001Wed\u000b\">wq\u0013[LN~|3HL3Gǻ:!CW['K\u001b\u0018\u00165֒o]\u0012u>{r\u000flt\u0014\u0018\\g$\rzQ$2\u0002Ͱ\b˕\u0003>0Oр\u0007n"}, d2 = {"\u0012qP4Z(;Z\u0019Z\u0004\\/\u0007\u0016=", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\rZ?=m0\u001b\u001ch=B\u0005f6[\u0005|", "\"", "", "0tX9W,K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\rZ?=m0\u001b\u001ch=B\u0005f6[\u0005\u0005QUO0^(", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "3l_Al\u000bKO\u001b\u0001v[3|d8c\u00032\tN", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0016IN\u001ax0 \u0017d^@\u0007?5Ly1TZ$", "@dbAT9MO\u0016\u0006z", "\u0017", "7m_Bg:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0tT5\u001c\f]JmlND)\u0018;M\u000b;vJi \u0017DnyRR\u001fK\u0004\u001eK\u0005\u0010mBj[CN=NdsN\td\u001dZI\u0010", "/mR5b9>Rw\fv`.x\u00066e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\nVA>uA\u001e\u0014Gn5\te(K}'5[J;\\(", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "3mP/_,=", "", "@de2e:>2\u001d\fz\\;\u0001\u00138", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "/mX:T;>B#", "B`a4X;/O \u000fz", "Dd[<V0Mg", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@)>h}-@i\u001dw)L9n>+\u0015g@F\u0003e.Js.G:](kRH$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u0002*hAr\u0010\u0013\u001a\u0017~hzO` V}\u001euOrFPbn}PQAq.n\u00155`C?65\u0010; \u0017qRwsxX\u0011paO", "2qP4Z(;Z\u0019Z\u0004\\/\u0007\u0016=", "/mR5b9L", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "1n]@g9:W\"\u000e\t", "\u001aj^A_0G\u001d\u0004z~k\u0002", "AmP=G6", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@)>h}-@i\u001dw)L9n>+\u0015g@F\u0003e.Js.G:](kRH$\u0019\u000ek\n\u00182\t\u000e[\u000b\u000ekI7\u001d\u0017\u00020\bEw\b\u0010\u001fW3t}Lf\u001fK\u0003\u0015\u0004\u000b\u0007rOhc\u0003W=Tf4ma#\u0004a6K ]x\u0015$j\u001a\u0018\u0007\u0001S\u000f\u0002(", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnchoredDraggableKt {

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\b\u000e\u0015\u0007\u0015\u0012\u0006\u0012Th\u0017\r\u0013\u001b\u001f\u0013\u0013s#\u0013\u001a\u001b\u0016\u0018#\u001d\u0004.", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {IptcDirectory.TAG_OBJECT_PREVIEW_FILE_FORMAT_VERSION}, m = "A5DF4FI79D>", n = {}, s = {})
    static final class C07171<I> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07171(Continuation<? super C07171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return AnchoredDraggableKt.restartable(null, null, this);
        }
    }

    public static final <T> DraggableAnchors<T> DraggableAnchors(Function1<? super DraggableAnchorsConfig<T>, Unit> function1) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        function1.invoke(draggableAnchorsConfig);
        return new MapDraggableAnchors(draggableAnchorsConfig.getAnchors$material3_release());
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z2, boolean z3, MutableInteractionSource mutableInteractionSource, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            z2 = true;
        }
        if ((i2 + 8) - (8 | i2) != 0) {
            z3 = false;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            mutableInteractionSource = null;
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z2, z3, mutableInteractionSource);
    }

    public static final <T> Modifier anchoredDraggable(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, boolean z2, boolean z3, MutableInteractionSource mutableInteractionSource) {
        return DraggableKt.draggable$default(modifier, anchoredDraggableState.getDraggableState$material3_release(), orientation, z2, mutableInteractionSource, anchoredDraggableState.isAnimationRunning(), null, new AnonymousClass1(anchoredDraggableState, null), z3, 32, null);
    }

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1 */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000b<G\rӬD\u0012&\u0006\u0007l?ӄRep.\u0001TZ\u0013y}L$\n'8ٜy"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "Dd[<V0Mg", ""}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\b\u000e\u0015\u0007\u0015\u0012\u0006\u0012Th\u0017\r\u0013\u001b\u001f\u0013\u0013s#\u0013\u001a\u001b\u0016\u0018#\u001d\u0004.^\u001d+!'/3''\b7'./*,71p~", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnchoredDraggableState<T> $state;
        /* synthetic */ float F$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.$state = anchoredDraggableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f2, Continuation<? super Unit> continuation) {
            return invoke(coroutineScope, f2.floatValue(), continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, float f2, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, continuation);
            anonymousClass1.L$0 = coroutineScope;
            anonymousClass1.F$0 = f2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1 */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fjg1\u000bͧ\u0007"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\b\u000e\u0015\u0007\u0015\u0012\u0006\u0012Th\u0017\r\u0013\u001b\u001f\u0013\u0013s#\u0013\u001a\u001b\u0016\u0018#\u001d\u0004.^\u001d+!'/3''\b7'./*,71p~r\u0001", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {177}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class C01051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ AnchoredDraggableState<T> $state;
            final /* synthetic */ float $velocity;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01051(AnchoredDraggableState<T> anchoredDraggableState, float f2, Continuation<? super C01051> continuation) {
                super(2, continuation);
                this.$state = anchoredDraggableState;
                this.$velocity = f2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01051(this.$state, this.$velocity, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.$state.settle(this.$velocity, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new C01051(this.$state, this.F$0, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$snapTo$2 */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015iY2J͜V.zSX\u0010\u001c\u0006B&s*\u0002EKU`}P\f\u007fRuk\u0007J!\u000b\nƯD"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\nVA>uA\u001e\u0014Gn5\tQ*X\u0002'\u001d", "/mR5b9L", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\rZ?=m0\u001b\u001ch=B\u0005f6[\u0005|", ":`c2f;-O&\u0001zm"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\b\u000e\u0015\u0007\u0015\u0012\u0006\u0012Th\u0017\r\u0013\u001b\u001f\u0013\u0013s#\u0013\u001a\u001b\u0016\u0018#\u001d\u0004.^/+\u001f/\u00140et", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C07192<T> extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        C07192(Continuation<? super C07192> continuation) {
            super(4, continuation);
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t2, Continuation<? super Unit> continuation) {
            C07192 c07192 = new C07192(continuation);
            c07192.L$0 = anchoredDragScope;
            c07192.L$1 = draggableAnchors;
            c07192.L$2 = t2;
            return c07192.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            float fPositionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
            if (!Float.isNaN(fPositionOf)) {
                AnchoredDragScope.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final <T> Object snapTo(AnchoredDraggableState<T> anchoredDraggableState, T t2, Continuation<? super Unit> continuation) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t2, null, new C07192(null), continuation, 2, null);
        return objAnchoredDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnchoredDrag$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f2, Continuation continuation, int i2, Object obj2) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            f2 = anchoredDraggableState.getLastVelocity();
        }
        return animateTo(anchoredDraggableState, obj, f2, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2 */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015iY2J͜V.zSX\u0010\u001c\u0006B&s*\u0002EKU`}P\f\u007fRuk\u0007J!\u000b\nƯD"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\nVA>uA\u001e\u0014Gn5\tQ*X\u0002'\u001d", "/mR5b9L", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\rZ?=m0\u001b\u001ch=B\u0005f6[\u0005|", ":`c2f;-O&\u0001zm"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\b\u000e\u0015\u0007\u0015\u0012\u0006\u0012Th\u0017\r\u0013\u001b\u001f\u0013\u0013s#\u0013\u001a\u001b\u0016\u0018#\u001d\u0004.^\u001d+',!5'\u00173hw", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {685}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2<T> extends SuspendLambda implements Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AnchoredDraggableState<T> anchoredDraggableState, float f2, Continuation<? super AnonymousClass2> continuation) {
            super(4, continuation);
            this.$this_animateTo = anchoredDraggableState;
            this.$velocity = f2;
        }

        @Override // kotlin.jvm.functions.Function4
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t2, Continuation<? super Unit> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_animateTo, this.$velocity, continuation);
            anonymousClass2.L$0 = anchoredDragScope;
            anonymousClass2.L$1 = draggableAnchors;
            anonymousClass2.L$2 = t2;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                float fPositionOf = ((DraggableAnchors) this.L$1).positionOf(this.L$2);
                if (!Float.isNaN(fPositionOf)) {
                    Ref.FloatRef floatRef = new Ref.FloatRef();
                    floatRef.element = Float.isNaN(this.$this_animateTo.getOffset()) ? 0.0f : this.$this_animateTo.getOffset();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (SuspendAnimationKt.animate(floatRef.element, fPositionOf, this.$velocity, this.$this_animateTo.getAnimationSpec(), new Function2<Float, Float, Unit>() { // from class: androidx.compose.material3.internal.AnchoredDraggableKt.animateTo.2.1
                        final /* synthetic */ Ref.FloatRef $prev;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(Ref.FloatRef floatRef2) {
                            super(2);
                            floatRef = floatRef2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Float f2, Float f3) {
                            invoke(f2.floatValue(), f3.floatValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(float f2, float f3) {
                            anchoredDragScope.dragTo(f2, f3);
                            floatRef.element = f2;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2$1 */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,i\bDJc|\u0004O\u000b8\u000b4B\rӬD\u0012&\u0006\u0007l?ӄRex2`TB\u000f\u001a}d(i'\nCiW`\u0006̀\rOTk"}, d2 = {"\n`]<a@F])\rS", "", "\"", "D`[BX", "", "Dd[<V0Mg", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends Lambda implements Function2<Float, Float, Unit> {
            final /* synthetic */ Ref.FloatRef $prev;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Ref.FloatRef floatRef2) {
                super(2);
                floatRef = floatRef2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Float f2, Float f3) {
                invoke(f2.floatValue(), f3.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f2, float f3) {
                anchoredDragScope.dragTo(f2, f3);
                floatRef.element = f2;
            }
        }
    }

    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, T t2, float f2, Continuation<? super Unit> continuation) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t2, null, new AnonymousClass2(anchoredDraggableState, f2, null), continuation, 2, null);
        return objAnchoredDrag$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnchoredDrag$default : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <I> java.lang.Object restartable(kotlin.jvm.functions.Function0<? extends I> r5, kotlin.jvm.functions.Function2<? super I, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof androidx.compose.material3.internal.AnchoredDraggableKt.C07171
            if (r0 == 0) goto L21
            r4 = r7
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 r4 = (androidx.compose.material3.internal.AnchoredDraggableKt.C07171) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L21
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L13:
            java.lang.Object r1 = r4.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L33
            if (r0 != r2) goto L2b
            goto L27
        L21:
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1 r4 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$1
            r4.<init>(r7)
            goto L13
        L27:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L47
            goto L47
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            kotlin.ResultKt.throwOnFailure(r1)
            androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2 r1 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L47
            r0 = 0
            r1.<init>(r5, r6, r0)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L47
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L47
            r4.label = r2     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L47
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r1, r4)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L47
            if (r0 != r3) goto L47
            return r3
        L47:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableKt.restartable(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2 */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fjg1\u000bͧ\u0007"}, d2 = {"\n`]<a@F])\rS", "", "\u0017", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\b\u000e\u0015\u0007\u0015\u0012\u0006\u0012Th\u0017\r\u0013\u001b\u001f\u0013\u0013s#\u0013\u001a\u001b\u0016\u0018#\u001d\u0004.^.\"13!36$&1+jy", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {715}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C07182 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Function0<I> $inputs;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C07182(Function0<? extends I> function0, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C07182> continuation) {
            super(2, continuation);
            this.$inputs = function0;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C07182 c07182 = new C07182(this.$inputs, this.$block, continuation);
            c07182.L$0 = obj;
            return c07182;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C07182) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                this.label = 1;
                if (SnapshotStateKt.snapshotFlow(this.$inputs).collect(new AnonymousClass1(objectRef, coroutineScope, this.$block), this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1 */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJe\u0003İY\u0006^\nND\u0005Ӭ:\u0012(\u000btkQ0\u000be\u000f\u0097\u0011ޚ.\u0011q}B'"}, d2 = {"\n`]<a@F])\rS", "", "\u0017", ":`c2f;\"\\$\u000f\nl", "3lXA", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
            final /* synthetic */ Ref.ObjectRef<Job> $previousDrag;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Ref.ObjectRef<Job> objectRef, CoroutineScope coroutineScope, Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2) {
                this.$previousDrag = objectRef;
                this.$$this$coroutineScope = coroutineScope;
                this.$block = function2;
            }

            /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(I r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1
                    if (r0 == 0) goto L77
                    r4 = r12
                    androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1 r4 = (androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1) r4
                    int r0 = r4.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    int r1 = (-1) - r0
                    int r0 = (-1) - r2
                    r1 = r1 | r0
                    int r0 = (-1) - r1
                    if (r0 == 0) goto L77
                    int r0 = r4.label
                    int r0 = r0 - r2
                    r4.label = r0
                L19:
                    java.lang.Object r1 = r4.result
                    java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r0 = r4.label
                    r2 = 1
                    if (r0 == 0) goto L51
                    if (r0 != r2) goto L7d
                    java.lang.Object r0 = r4.L$2
                    kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                    java.lang.Object r11 = r4.L$1
                    java.lang.Object r0 = r4.L$0
                    androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1 r0 = (androidx.compose.material3.internal.AnchoredDraggableKt.C07182.AnonymousClass1) r0
                    kotlin.ResultKt.throwOnFailure(r1)
                L33:
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.Job> r3 = r0.$previousDrag
                    kotlinx.coroutines.CoroutineScope r4 = r0.$$this$coroutineScope
                    kotlinx.coroutines.CoroutineStart r6 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                    androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2 r7 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2
                    kotlin.jvm.functions.Function2<I, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r2 = r0.$block
                    kotlinx.coroutines.CoroutineScope r1 = r0.$$this$coroutineScope
                    r0 = 0
                    r7.<init>(r2, r11, r1, r0)
                    kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
                    r8 = 1
                    r9 = 0
                    r5 = 0
                    kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
                    r3.element = r0
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L51:
                    kotlin.ResultKt.throwOnFailure(r1)
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.Job> r0 = r10.$previousDrag
                    T r1 = r0.element
                    kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
                    if (r1 == 0) goto L75
                    androidx.compose.material3.internal.AnchoredDragFinishedSignal r0 = new androidx.compose.material3.internal.AnchoredDragFinishedSignal
                    r0.<init>()
                    java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
                    r1.cancel(r0)
                    r4.L$0 = r10
                    r4.L$1 = r11
                    r4.L$2 = r1
                    r4.label = r2
                    java.lang.Object r0 = r1.join(r4)
                    if (r0 != r3) goto L75
                    return r3
                L75:
                    r0 = r10
                    goto L33
                L77:
                    androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1 r4 = new androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$emit$1
                    r4.<init>(r10, r12)
                    goto L19
                L7d:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableKt.C07182.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }

            /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableKt$restartable$2$1$2 */
            /* JADX INFO: compiled from: AnchoredDraggable.kt */
            @InterfaceC1492Gx
            @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fjg1\u000bͧ\u0007"}, d2 = {"\n`]<a@F])\rS", "", "\u0017", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
            @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\b\u000e\u0015\u0007\u0015\u0012\u0006\u0012Th\u0017\r\u0013\u001b\u001f\u0013\u0013s#\u0013\u001a\u001b\u0016\u0018#\u001d\u0004.^.\"13!36$&1+jylzn}", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {722}, m = "8>GA>9(KJH>H?", n = {}, s = {})
            static final class C01062 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ Function2<I, Continuation<? super Unit>, Object> $block;
                final /* synthetic */ I $latestInputs;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C01062(Function2<? super I, ? super Continuation<? super Unit>, ? extends Object> function2, I i2, CoroutineScope coroutineScope, Continuation<? super C01062> continuation) {
                    super(2, continuation);
                    this.$block = function2;
                    this.$latestInputs = i2;
                    this.$$this$coroutineScope = coroutineScope;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C01062(this.$block, this.$latestInputs, this.$$this$coroutineScope, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C01062) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Function2<I, Continuation<? super Unit>, Object> function2 = this.$block;
                        I i3 = this.$latestInputs;
                        this.label = 1;
                        if (function2.invoke(i3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    CoroutineScopeKt.cancel(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                    return Unit.INSTANCE;
                }
            }
        }
    }

    public static final <T> MapDraggableAnchors<T> emptyDraggableAnchors() {
        return new MapDraggableAnchors<>(MapsKt.emptyMap());
    }

    public static final <T> Modifier draggableAnchors(Modifier modifier, AnchoredDraggableState<T> anchoredDraggableState, Orientation orientation, Function2<? super IntSize, ? super Constraints, ? extends Pair<? extends DraggableAnchors<T>, ? extends T>> function2) {
        return modifier.then(new DraggableAnchorsElement(anchoredDraggableState, function2, orientation));
    }
}
