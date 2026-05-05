package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: Draggable2D.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯX\u001d̉=!4i\bDZc|\u0004W\u00068\u000b4B\u0007\":\u0012\u007fјnjO0Le^.ZS@\u000fs{Břc$\bCCU }*\teNogtKb\u000bY\u000f\u000e\u0016~l4Ikxe\u0012\u00152JoM<UڎE9vt>\u0005&6:R\b\u0015\u0019\u001aXY@\u0007\tUc\u0018\"2PphR\u001dO\u0015\u001a@\nl\u001fG#t\u0007\\I`l\fK_3\u0011{ZZ7a@|{\rVV7\r%eL*\u0007<߱\u0019%a\u0017\u001fҁZM\u0018Wqk\u001b\u0011'UAyweMp\u007fB&[U\u0013]\u0001>t\u0005\u007fy</1Oqeh\u0010>v)\u0017=B\n\u000e\u0014C`.[3\u0017)\u00143\u0003\u0010k[`\u0013nQ.zˋ:!+\u0001C1?\u001dvSgA?QG}\u0015\rL'/mQ|Z\u000en33o\bbA`nJ˓R\u0014_>}\nvd\u0012,\n6m\u000e?}!.E)eZi)'k\u0010g\\g%\u001e'mkףQVU:nDMR\t:pth\u0013\u0003hT\u0007=AS\"T\u0015\u0016 \u0013Nu(D'%\u001ehgj\u007fi{x:+5fEu\u0007k<pi\u001b95_\u0001(\u0018Xu$ALb3_vSc\u001b\t\\͈&<Nk }\u0002F^\u000e\u00198et,<<7)^%H1\"pI\r\ro\\~\u000f-]a*ғm$z\u00131\rbp}\u0006\u0011\u007f2{p$=A\u007f<)7e1\u0017Ač'\u0011\u0005t\u0010MmNWNr\u001c\u001cc\f(& IS?=A\u0013-1B\u0006=Gbq\u0014Z{\u0018ؠ~|\u007f\u0019kn4g\u0016\n\t,\u000f\u0004\u0011Tݚ\u001b\"\u0005~\u0013J\u0016ۭ\u0018\u0015qW\u000bV\u0012Tߏ_HOs\u0013_BPH~\u000b%D(\u0011q2|c1q&sȹyӄ3\u0015iӠ\n4<~zE,su\u0006<cDvrbmAi8ա]\tD#4r\tDXl}\u000eh\fD\u0015CNQf\u0001VfQ97\u000ej\u0017.#o\u0005dh\u0019̭\u000244i\u0001ϕE\u0382\u0018`K%\u001fXs\u000f{ycw\u001b[\u001f\u00199\tϥr\u001c\">0\\]d\u00192\fy>DQ=r\u0005j\rR3\u0003ч\nդGTqв0?\u000eUwE\u001d1RuKV<[\tmfW3m҇d+0\u0002\u000f\u00159 \t77\u000b\u0014Td7s8\u0011U-\tIn}\u0007v);Fj8I1\u0007\u0007խI]ISXԐ\u0006ھ-oso\u001aC·\u0001>"}, d2 = {"\u001cn>=B5\u001d`\u0015\u0001hm(\n\u0018", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "AsP?g,=>#\r~m0\u0007\u0012", "", "\u001cn>=B5\u001d`\u0015\u0001hm(\n\u0018/d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u001aj^A_0G\u001d\u001e\u0010\u0003(-\r\u0012-t\u00042\u0005NJw'Pm\u001d@\u0001.\u0003/", "\u001cn>=B5\u001d`\u0015\u0001hm6\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "Dd[<V0Mg", "\u001cn>=B5\u001d`\u0015\u0001hm6\b\u0014/d", "\u0012qP4Z(;Z\u0019KYL;x\u0018/", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0006eQ;J\u0006'\u001d", "=m32_;:", "@d\\2`)>`w\fv`.x\u00066eL\u0007iO|&\u0017", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001pH@=-mQA#\u0007?\u0013\u007fEp\f\u0016$\u000e~kzR_\u000fC\t\u0019\u007fJrjFgn\nTAS,\tq\ba\u001fX7A$`P\u0007*d_._", "2qP4Z(;Z\u0019KY", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "AsPAX", "3mP/_,=", "", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "AsP?g\u000bKO\u001bb\u0003f,{\r+t\u007f/\u0010", "=m3?T.,b\u0015\f\n^+", "=m3?T.,b#\n\u0006^+", "@de2e:>2\u001d\fz\\;\u0001\u00138", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pd6^\u007f&C[R6e\u001ct=\"!j\u001bN9Vcf=&p@4&\bx(oJd\u0010\fk\u0003\u001cfyAc\u001aKx(??3pQcmy\u0011BOr3c\bn!fC\u0004(\u001d\u0001\u0019(dN=\u000e\u0006\\ZZb\tcdN\u0019^A3>zWDTs_Eb1/Xywg'?z5\u00044\b=s;u\r\u0015h(G\\\b\u00196eOp\u0007FE\u0011NOm~:\u0014tn)p\u000f\u0012k~6*m/dX\u0018\u0005l\u001be>o)aG[\u0004MMy\u001et\u001cs\u0006Bu\u001e\b\u0014.qd\\\r\u0019^\t%zR\")!\u0007LN\"\u001b2\u0017AY\u001c>", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Draggable2DKt {
    private static final Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> NoOpOnDragStarted = new Draggable2DKt$NoOpOnDragStarted$1(null);
    private static final Function1<Offset, Unit> NoOpOnDragStart = new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$NoOpOnDragStart$1
        /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m771invokek4lQ0M(long j2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
            m771invokek4lQ0M(offset.m3947unboximpl());
            return Unit.INSTANCE;
        }
    };
    private static final Function3<CoroutineScope, Velocity, Continuation<? super Unit>, Object> NoOpOnDragStopped = new Draggable2DKt$NoOpOnDragStopped$1(null);
    private static final Function1<Velocity, Unit> NoOpOnDragStop = new Function1<Velocity, Unit>() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$NoOpOnDragStop$1
        /* JADX INFO: renamed from: invoke-TH1AsA0, reason: not valid java name */
        public final void m773invokeTH1AsA0(long j2) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Velocity velocity) {
            m773invokeTH1AsA0(velocity.m6884unboximpl());
            return Unit.INSTANCE;
        }
    };

    public static final Draggable2DState Draggable2DState(Function1<? super Offset, Unit> function1) {
        return new DefaultDraggable2DState(function1);
    }

    public static final Draggable2DState rememberDraggable2DState(Function1<? super Offset, Unit> function1, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1150277615, "C(rememberDraggable2DState)121@4913L29,122@4954L63:Draggable2D.kt#8bwon0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1150277615, i2, -1, "androidx.compose.foundation.gestures.rememberDraggable2DState (Draggable2D.kt:120)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function1, composer, (i2 + 14) - (i2 | 14));
        ComposerKt.sourceInformationMarkerStart(composer, -428493944, "CC(remember):Draggable2D.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = Draggable2DState(new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$rememberDraggable2DState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                    m775invokek4lQ0M(offset.m3947unboximpl());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m775invokek4lQ0M(long j2) {
                    stateRememberUpdatedState.getValue().invoke(Offset.m3926boximpl(j2));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        Draggable2DState draggable2DState = (Draggable2DState) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return draggable2DState;
    }

    public static /* synthetic */ Modifier draggable2D$default(Modifier modifier, Draggable2DState draggable2DState, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function1 function1, Function1 function12, boolean z4, int i2, Object obj) {
        boolean z5 = z2;
        Function1 function13 = function12;
        boolean z6 = z3;
        Function1 function14 = function1;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z5 = true;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            mutableInteractionSource2 = null;
        }
        if ((i2 & 8) != 0) {
            z6 = false;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            function14 = NoOpOnDragStart;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 32)) != 0) {
            function13 = NoOpOnDragStop;
        }
        return draggable2D(modifier, draggable2DState, z5, mutableInteractionSource2, z6, (Function1<? super Offset, Unit>) function14, (Function1<? super Velocity, Unit>) function13, (i2 & 64) == 0 ? z4 : false);
    }

    public static final Modifier draggable2D(Modifier modifier, Draggable2DState draggable2DState, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function1<? super Offset, Unit> function1, Function1<? super Velocity, Unit> function12, boolean z4) {
        return modifier.then(new Draggable2DElement(draggable2DState, z2, mutableInteractionSource, z3, function1, function12, z4));
    }

    public static /* synthetic */ Modifier draggable2D$default(Modifier modifier, Draggable2DState draggable2DState, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function3 function3, Function3 function32, boolean z4, int i2, Object obj) {
        Function3 function33 = function3;
        boolean z5 = z3;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        Function3 function34 = function32;
        boolean z6 = z2;
        if ((i2 + 2) - (i2 | 2) != 0) {
            z6 = true;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            mutableInteractionSource2 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            z5 = false;
        }
        if ((i2 & 16) != 0) {
            function33 = NoOpOnDragStarted;
        }
        if ((i2 & 32) != 0) {
            function34 = NoOpOnDragStopped;
        }
        return draggable2D(modifier, draggable2DState, z6, mutableInteractionSource2, z5, function33, function34, (i2 + 64) - (i2 | 64) == 0 ? z4 : false);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0013R\u00016\u0005yTlkLg\nf\u001a>ZkM\rf\u001cq Z\u0006[\u0003*b|)&{awRRjlxU,\u0017L\u0013]?\u000e#j\\@i}C oY\u0015K\u000e\u000bC\u0012\u0003\u0011sv\u001dY\u0002;`#\u0014\bJ\u0011B\u0006T")
    @InterfaceC1492Gx
    public static final /* synthetic */ Modifier draggable2D(Modifier modifier, Draggable2DState draggable2DState, boolean z2, MutableInteractionSource mutableInteractionSource, boolean z3, Function3 function3, Function3 function32, boolean z4) {
        return modifier.then(new Draggable2DCompatElement(draggable2DState, z2, mutableInteractionSource, z3, function3, function32, z4));
    }
}
