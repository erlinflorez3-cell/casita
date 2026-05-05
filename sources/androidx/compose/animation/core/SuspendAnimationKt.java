package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.ui.MotionDurationScale;
import com.dynatrace.android.agent.Global;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
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
/* JADX INFO: compiled from: SuspendAnimation.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яj\u001d̉=!,n\bDZc|\u0004G\u00078\u000b<B\u0007\"2\u0012\u007f\u0007|jAӄLe^.ZS0\u0011s{J$cҕyCQU\"}8\tWNmkvJp\u000bKƤ\u000e\u0016\u000fj4կ]xs\u0012\u0017˰JoM:UoS9htL\u0005(288\u0002ڎ\t\u001a@H\u0018͌\u0003CY\u0015\u001a0F}Rļ\f[\b2\u00124B@\u0003$ձuSVNr\\H5K\u0003\u0018I~7m8\u0015Y\u001dHd'S{q ;@};C.\u0004\u0007\u0015\\s?ID\"A\u0013s?'qN$_<X\u000e --e\f$wVh\u000bQn\u0019?1_e[PT-&\t,AJ\u0013&67Y><`kڿ\u0012=z\u0004cFV\u0014nD\u0006\u0001\bI'6\u0010Bq>Ӹj[gL)T=\u000e\u0015\u000f$)'\u00031]d\u000e\u000f\u0019Id>ΊoҨD=Vc\"HKp\u001cp\u0011\u0006Z\b>Q\u0018/*\u0010^\u001b3Bs9Q \u001c\bNDu\u0003\u001d`\u0017R\u001a^N@0{.=:\u000b\u001cZrc3y\u0001\tf;)},e\u0017\r6\u0012ء`\u0002B25\u0016TaxkpS\u0004\u001d5@vF\bm«\u0012a?oC;Wu cX|:SLd\u0015X\u0015F\u0002\u001c!٩fϒ6Hx&\u0010XRe$\u0013`C\" B6I\u0019\u000b\u0014x\u0007,NY|7^\u000bl\u001e\fl3R\u001b\u001aX\u0003\u0018\u0019\u0001l\u0002\u007fv'Hض\u0001j(>QW;+6W(nZ\u00103\u0018\u000f\u0003.FѨPQR}&{[\u000e0\u0018 ?wCM\u0015\u001f~W60=\fɪ1ϯUM @\u0013n\b\u0012Sh\\k(lvݚnojUZ\u00160|\u0007rQ\u000f\r\f\ncVz\u000ehd\rk>\u0010x1sl^F\u0018\u001d+.'\u0011oh\u0002E/S'c\u001c&0_\u001bg]w\rFy\u0011-V\u0018k\u0004:r.\rr_m>K:YYEC2&|\u0003\tN\u0019\u0018\u0018D\u00194;7v`яtV>nQɁ<֨\u000b,\u001b\u0013nGH*\b}b2\u007f,yʕ\f\u0019~I+\u0010[Y\u0010m\u001cR\u0005\u0017Z\u0011\u001a\u000bB6~\u0014,=f\\\u0006|9:\u0014\u00010<Q=r\u0005\u0003\u000eRW\\B\u000e\u000bQx\u0002\u0006> 0ie\u000f%AZ\u0011Kd\u001e`\t^fHKeUb1*G\u0005=S.zE13qtsвg2\u0007tc͆Y˥S~tKC:b`3(\u0007\u0005+GcŝW\u0007V\nM({q\u0018\ff\u001f%)R\u001a+9\u0018\u0016ox@^Q[\u0013h\u0015z qjNh./\u0007\u0003\u000eJ\u0017'\u0011)Q\u0003o)2z\\(=I\u001a\u000f;\\)51-\u0007L\u001b;\u0015MJMWz 7}gS\u0002\u0003\u0018\"0'JzO|g\u0010v\n\f\u001fh5ޭ\u001ab\b*YЪ^ɯ2J\u0003\u001b\"\u0004\u0016_g\u0002y,3`_ŕ\u0006K`)1k\u0014Gkn~\nqr\fn\u0004\u0012+rAX\nnsU-\u000b7Mt\u0019\u0007vj0aKp,\u0010%%5MTʭf3\u0016`snv}_]\u00131U\u0018:cA0\u0019H,>@ǤBցX(#hn\u05ec=r7tlp[.`p۪ry,/\u001a{\rN\u0007\u0011A;n~.f?7_$k\u000fW`M\nsiV%?~W\u001beP;s6&)\u0003h\u0001%\u00108r!~\u0010i<-\rYM\u001c7Yjs\u0013\u001fV[SiZ\u0014<\u0013\u001e\u0011u_H\"N\\`\"ikcb' \u00192H\u0014\u007f\u0013)7zQ\u001a*:\u0003\r\u0001SE(Q{<\u00047!'].Θ\u001fWl\\k5}͝&\u001a4}J-Q\u0004X\u0015ʨ:NUK$xcF(\nM+L\u0012\u0006%\u0010EwM:al@\u001dy\u0006$V.D\u001b\\#u\u000b)w\u0018\u07bf\u0002\u0018\"c\fqBq\u0013 )FN*sq\u0017G]h@\u0011r)u$E@\u001e5C\u0019\r\u0010\u0016vP-Yr\u00145\u000bwl4\u0002\u0013ROqD\nSP[:\u0006s\u0017dezj4W\u000e0H\u0014\u001d\r2{_qϵ\u0004`#9mK\u000f\u0001D\u0010\u0011Mof+B\u0015ěl3b\u0012\u0011\u0005$4p\u00170\u0005rl%\u0015CG:FW\u0014f{g#?{U\u00163\u0019\u0003SOW\u0002X\u0004>C\r}J\u001f;\u0014vKǹAarƓ-\u007f\u0019*VG\u0005>Ph/ƚ\u0010ȭhL(F~E6oԐ4d"}, d2 = {"2ta.g0H\\\u0007|ve,", "", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "5dc\u0011h9:b\u001d\t\u0004L*x\u0010/", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|kq.", "/mX:T;>", "", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "Bx_266Gd\u0019\f\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "7mXA\\(ED\u0015\u0006\u000b^", "B`a4X;/O \u000fz", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "D`[BX", "Dd[<V0Mg", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&\u007f  IW\u0019u=/\u0015up9\u00149\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001s\nUR 8K3(\nu3~@h~\u001bkt:f\u0002> \u0017C\u0003\u0017?+&mFWnO.=Na7n\u0010^0&8D,\u001f{'\u001b2L7\u000e\u0004O v\\\u00031eQ&z\u0002\u007fGqcBTs_Eb2\u001fIQ^\u0018<g{/}v\tE2\u007fe\u0015Te'Bh\u0002#u=Q0$E@\u001dH\u00189\\rH\u001do#jQ\flB;)tilH\u001dP;!dDeh\u00113a\nHREX\u000eKzSWC\u001c\u0005\u0010&7OFH\u001bR\u0010o", "uE5\u0013?(GR&\t~]?F\u00079m\u000b2\n@J\u0013 Kw\nKz/>#{*Dm_\nVGCgC\"\u001fqOD\u0007a\u00025|1VSR5&W\u0004E]\u0013j\u0017L:\u0011\u000fbOmOT@\u001d\u00170S\u000b\b>g\u0012 \u001d<ny\fT\u001aT\u0004%\u0005E2hT#=\u0004PPIk:`\u001bc'e\u0010}\u000b\u0019m*\u00172W*\u0013}\u001dzoWyev\u001d", "/mX:T;>2\u0019|vr", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001>w\u0012=,C9gHy\u001eli5\u0016g6Wd2GJ$", "uE5\u0019T5=`#\u0003yquz\u00137p\n6{\n| \u001bOk\u001d@\u0001.~W\b-77v5W?JJ4\u001c\u0011|=B\u000bk(]z1P:Y,Z(YC\u001e!a\u0012Wt\u0012\u0016a\u000b%~M5.\f6R\u0010\u0005I\u0011\u0015\u0014\u001d9ty\u000f,vM\u0004$|E22Dcl\u0004WPIk*rU='eI>-$m(\u001frY\u0004MbX\r\u0004NCncP\u001bD\"!CmYU\u001b", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"-\u0011wa\u000f", "/mX:T;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\n", "AsP?g\u001bB[\u0019gvg6\u000b", "", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"\u001c\u001fsa\u000f", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\f$dp9\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018'\u0016\ta=3rN@h\u00066V\u0002\u0005D\n\u0010\u001e\nDnzK,t.\u007f\u001f\u0005H-q\u0010^p\u0002\u0011BUk(s\u0010i&j\u0004\u001b4\u001do(\u001frYy_bY\u001b\u0002Y}p1E#\bB4MqdFS93F}6#T\fs!6b}\u00018\u0014\t0;2.\fGp\u001a\bHu\u001a,ZP|", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~7k\u0012B)L?s0-\u0019rj'\u0012c*$", "Ad`BX5MW\u0015\u0006Vg0\u0005\u0005>i\n1", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\f$dp9\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018'\u0016\ta=3rN@h\u00066V\u0002\u0005G\u0001\n\u0012\"\u0011stJR\u001fK\u0004\u001ecL)f\u001cNF\u007fQPLf3.\u0011p%&;J-\u0012\u0001\u001d%q^wj\f\\\u000f\u0002V\u0004p3\u001d\u007f\u0001B3Eqd\u0010CybF\u00056#T{\u0006[\u0010b}:x6\u001409:n\u000e!+~CZ\n\u0011uc=0(\u007f&\u0010DKa\u0005B", "/mX:T;>B#", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\f$dp9\\J1J\b#\u0011SJ5^\u001c\\:\u0019\u0012X\u001d$\u0012\t\u000eXN.rCJh\u00066Q\rEv\u0001U\u0012\u00179rlQZ\u001aPC\u0013\u007fN)2\"bc\u0002CPIl3R\u0017_\u001b2/!*\u001e\u0001 \u001fq\u001a3\u001b\u0004\u001d\u0012\u0003[wvkQ\"\t\u0002\u0005NvYUIy^\bJ\u000e%U\u000b~\u0016;\"r5\u00027\u0014C.?d\u0013\u0015E\"Gm|\u001e<XP+0?\u0012V&P_\u0007h\b\u0015d(cQw_:1\u0017t;", "1`[9J0MVy\fvf,e\u00058o\u000e", Global.BLANK, "=m5?T4>", "4qP:X\u001bB[\u0019gvg6\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=s{nkH\u000eg5\u0018{8O\u0016O<eP\u0002A\u001e\u001bhW/;\u0016\u0003hE.w\u0010\r\u0006\u000e6X\t?qJ\n \u001b?z\u007fF_\u0010UCr\u007fJ8lOi[\tKKN8mK\u0011[.X\u0004A \u001dsb\u0005eU.\b\u000b)", "2n0;\\4:b\u001d\t\u0004?9x\u0011/", ">kPFG0FS\u0002z\u0004h:", "/mX:", "AsPAX", "2n0;\\4:b\u001d\t\u0004?9x\u0011/W\u00047~.~\u0013\u001eG", "CoS.g,,b\u0015\u000ez", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SuspendAnimationKt {

    /* JADX INFO: renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$4 */
    /* JADX INFO: compiled from: SuspendAnimation.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAu\u0004\u007f\u0005y\u000e\u0004\u000b\u000bK\u0002\u000f\u0013\u0007Pv\u001a\u0019\u0017\r\u0017\u000ek\u001a\u0016\u001b\u0010$\u001a!!~)", f = " A>:.6+\u00073-0#5).,j'/", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {239, 278}, m = "0>:?4H:", n = {"\u0013jjOe\u001aCU?GG><", "PdkSSjKVD", "QbqI]", "[WvK;dK[)=U:<", "\u0013jjOe\u001aCU?GG><", "PdkSSjKVD", "QbqI]", "[WvK;dK[)=U:<"}, s = {"xQ^", "xQ_", "xQ`", "xQa", "xQ^", "xQ_", "xQ`", "xQa"})
    static final class AnonymousClass4<T, V extends AnimationVector> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
            return SuspendAnimationKt.animate(null, null, 0L, null, this);
        }
    }

    public static /* synthetic */ Object animate$default(float f2, float f3, float f4, AnimationSpec animationSpec, Function2 function2, Continuation continuation, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            f4 = 0.0f;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(f2, f3, f4, animationSpec, function2, continuation);
    }

    public static final Object animate(float f2, float f3, float f4, AnimationSpec<Float> animationSpec, Function2<? super Float, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object objAnimate = animate(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Boxing.boxFloat(f2), Boxing.boxFloat(f3), Boxing.boxFloat(f4), animationSpec, function2, continuation);
        return objAnimate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimate : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SuspendAnimationKt$animateDecay$2 */
    /* JADX INFO: compiled from: SuspendAnimation.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDZc|\u0004O\u000b8\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015ia<TgX.\u0001T:\u0011{{b&\n$8KтY\u001a\u0004%"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"\u001c\u001fsa\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
        final /* synthetic */ Function2<Float, Float, Unit> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super Float, ? super Float, Unit> function2) {
            super(1);
            function2 = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
            invoke2(animationScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
            function2.invoke(animationScope.getValue(), Float.valueOf(((AnimationVector1D) animationScope.getVelocityVector()).getValue()));
        }
    }

    public static final Object animateDecay(float f2, float f3, FloatDecayAnimationSpec floatDecayAnimationSpec, Function2<? super Float, ? super Float, Unit> function2, Continuation<? super Unit> continuation) {
        Object objAnimate$default = animate$default(AnimationStateKt.AnimationState$default(f2, f3, 0L, 0L, false, 28, null), AnimationKt.DecayAnimation(floatDecayAnimationSpec, f2, f3), 0L, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animateDecay.2
            final /* synthetic */ Function2<Float, Float, Unit> $block;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Function2<? super Float, ? super Float, Unit> function22) {
                super(1);
                function2 = function22;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                invoke2(animationScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                function2.invoke(animationScope.getValue(), Float.valueOf(((AnimationVector1D) animationScope.getVelocityVector()).getValue()));
            }
        }, continuation, 2, null);
        return objAnimate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimate$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animate$default(TwoWayConverter twoWayConverter, Object obj, Object obj2, Object obj3, AnimationSpec animationSpec, Function2 function2, Continuation continuation, int i2, Object obj4) {
        if ((i2 + 8) - (8 | i2) != 0) {
            obj3 = null;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return animate(twoWayConverter, obj, obj2, obj3, animationSpec, function2, continuation);
    }

    public static final <T, V extends AnimationVector> Object animate(TwoWayConverter<T, V> twoWayConverter, T t2, T t3, T t4, AnimationSpec<T> animationSpec, Function2<? super T, ? super T, Unit> function2, Continuation<? super Unit> continuation) {
        V vNewInstance;
        if (t4 == null || (vNewInstance = twoWayConverter.getConvertToVector().invoke(t4)) == null) {
            vNewInstance = AnimationVectorsKt.newInstance(twoWayConverter.getConvertToVector().invoke(t2));
        }
        Object objAnimate$default = animate$default(new AnimationState(twoWayConverter, t2, vNewInstance, 0L, 0L, false, 56, null), new TargetBasedAnimation(animationSpec, twoWayConverter, t2, t3, vNewInstance), 0L, new Function1<AnimationScope<T, V>, Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animate.3
            final /* synthetic */ Function2<T, T, Unit> $block;
            final /* synthetic */ TwoWayConverter<T, V> $typeConverter;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(Function2<? super T, ? super T, Unit> function22, TwoWayConverter<T, V> twoWayConverter2) {
                super(1);
                function2 = function22;
                twoWayConverter = twoWayConverter2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((AnimationScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(AnimationScope<T, V> animationScope) {
                function2.invoke(animationScope.getValue(), twoWayConverter.getConvertFromVector().invoke(animationScope.getVelocityVector()));
            }
        }, continuation, 2, null);
        return objAnimate$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimate$default : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$3 */
    /* JADX INFO: compiled from: SuspendAnimation.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDJc|\u0004W\u00068\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015iY2J͜V.rY0\u000ey|\\$\n&\u001aOKW*}h\t_Pwg5K\t\u000e\n\u0017و\u001axp0"}, d2 = {"\n`]<a@F])\rS", "", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"\u001c\u001fsa\u000f", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3<T, V> extends Lambda implements Function1<AnimationScope<T, V>, Unit> {
        final /* synthetic */ Function2<T, T, Unit> $block;
        final /* synthetic */ TwoWayConverter<T, V> $typeConverter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(Function2<? super T, ? super T, Unit> function22, TwoWayConverter<T, V> twoWayConverter2) {
            super(1);
            function2 = function22;
            twoWayConverter = twoWayConverter2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((AnimationScope) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(AnimationScope<T, V> animationScope) {
            function2.invoke(animationScope.getValue(), twoWayConverter.getConvertFromVector().invoke(animationScope.getVelocityVector()));
        }
    }

    public static /* synthetic */ Object animateTo$default(AnimationState animationState, Object obj, AnimationSpec animationSpec, boolean z2, Function1 function1, Continuation continuation, int i2, Object obj2) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            z2 = false;
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            function1 = C04132.INSTANCE;
        }
        return animateTo(animationState, obj, animationSpec, z2, function1, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SuspendAnimationKt$animateTo$2 */
    /* JADX INFO: compiled from: SuspendAnimation.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDJc|\u0004W\u00068\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015iY2J͜V.rY0\u000ey|\\$\n&\u001aOKW*}h\t_Pwg5K\t\u000e\n\u0017و\u001axp0"}, d2 = {"\n`]<a@F])\rS", "", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"\u001c\u001fsa\u000f", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class C04132<T, V> extends Lambda implements Function1<AnimationScope<T, V>, Unit> {
        public static final C04132 INSTANCE = ;

        C04132() {
        }

        public final void invoke(AnimationScope<T, V> animationScope) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((AnimationScope) obj);
            return Unit.INSTANCE;
        }
    }

    public static final <T, V extends AnimationVector> Object animateTo(AnimationState<T, V> animationState, T t2, AnimationSpec<T> animationSpec, boolean z2, Function1<? super AnimationScope<T, V>, Unit> function1, Continuation<? super Unit> continuation) {
        Object objAnimate = animate(animationState, new TargetBasedAnimation(animationSpec, animationState.getTypeConverter(), animationState.getValue(), t2, animationState.getVelocityVector()), z2 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, continuation);
        return objAnimate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimate : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SuspendAnimationKt$animateDecay$4 */
    /* JADX INFO: compiled from: SuspendAnimation.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDJc|\u0004W\u00068\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015iY2J͜V.rY0\u000ey|\\$\n&\u001aOKW*}h\t_Pwg5K\t\u000e\n\u0017و\u001axp0"}, d2 = {"\n`]<a@F])\rS", "", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"\u001c\u001fsa\u000f", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class C04124<T, V> extends Lambda implements Function1<AnimationScope<T, V>, Unit> {
        public static final C04124 INSTANCE = ;

        C04124() {
        }

        public final void invoke(AnimationScope<T, V> animationScope) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((AnimationScope) obj);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object animateDecay$default(AnimationState animationState, DecayAnimationSpec decayAnimationSpec, boolean z2, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((2 & i2) != 0) {
            z2 = false;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            function1 = C04124.INSTANCE;
        }
        return animateDecay(animationState, decayAnimationSpec, z2, function1, (Continuation<? super Unit>) continuation);
    }

    public static final <T, V extends AnimationVector> Object animateDecay(AnimationState<T, V> animationState, DecayAnimationSpec<T> decayAnimationSpec, boolean z2, Function1<? super AnimationScope<T, V>, Unit> function1, Continuation<? super Unit> continuation) {
        Object objAnimate = animate(animationState, new DecayAnimation((DecayAnimationSpec) decayAnimationSpec, (TwoWayConverter<T, AnimationVector>) animationState.getTypeConverter(), (Object) animationState.getValue(), animationState.getVelocityVector()), z2 ? animationState.getLastFrameTimeNanos() : Long.MIN_VALUE, function1, continuation);
        return objAnimate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimate : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de A[Catch: CancellationException -> 0x010a, TryCatch #1 {CancellationException -> 0x010a, blocks: (B:69:0x005a, B:78:0x00d1, B:80:0x00de), top: B:101:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0128  */
    /* JADX WARN: Type inference failed for: r10v0, types: [T, androidx.compose.animation.core.AnimationScope] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x00d1 -> B:78:0x00d1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T, V extends androidx.compose.animation.core.AnimationVector> java.lang.Object animate(androidx.compose.animation.core.AnimationState<T, V> r17, androidx.compose.animation.core.Animation<T, V> r18, long r19, kotlin.jvm.functions.Function1<? super androidx.compose.animation.core.AnimationScope<T, V>, kotlin.Unit> r21, kotlin.coroutines.Continuation<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SuspendAnimationKt.animate(androidx.compose.animation.core.AnimationState, androidx.compose.animation.core.Animation, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$5 */
    /* JADX INFO: compiled from: SuspendAnimation.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDJc|\u0004W\u00068\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015iY2J͜V.rY0\u000ey|\\$\n&\u001aOKW*}h\t_Pwg5K\t\u000e\n\u0017و\u001axp0"}, d2 = {"\n`]<a@F])\rS", "", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"\u001c\u001fsa\u000f", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass5<T, V> extends Lambda implements Function1<AnimationScope<T, V>, Unit> {
        public static final AnonymousClass5 INSTANCE = ;

        AnonymousClass5() {
        }

        public final void invoke(AnimationScope<T, V> animationScope) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((AnimationScope) obj);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ Object animate$default(AnimationState animationState, Animation animation, long j2, Function1 function1, Continuation continuation, int i2, Object obj) {
        if ((2 & i2) != 0) {
            j2 = Long.MIN_VALUE;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            function1 = AnonymousClass5.INSTANCE;
        }
        return animate(animationState, animation, j2, function1, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$6 */
    /* JADX INFO: compiled from: SuspendAnimation.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bDJc|\u0004W\u00068é6B\r)4ߚ\u0006ј~jg/dgN\u008c`SJ\u0015qzB%\u0004$ EkY(\u0001:\t}R.oĔNZ\u0011H"}, d2 = {"\n`]<a@F])\rS", "", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "7s", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass6 extends Lambda implements Function1<Long, Unit> {
        final /* synthetic */ Animation<T, V> $animation;
        final /* synthetic */ Function1<AnimationScope<T, V>, Unit> $block;
        final /* synthetic */ float $durationScale;
        final /* synthetic */ T $initialValue;
        final /* synthetic */ AnimationVector $initialVelocityVector;
        final /* synthetic */ AnimationState<T, V> $this_animate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass6(Object obj, Animation animation, AnimationVector animationVector, AnimationState animationState, float f2, Function1 function1) {
            super(1);
            obj = obj;
            animation = animation;
            animationVector = animationVector;
            animationState = animationState;
            f = f2;
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
            invoke(l2.longValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r6v0, types: [T, androidx.compose.animation.core.AnimationScope] */
        public final void invoke(long j2) {
            Ref.ObjectRef<AnimationScope<T, V>> objectRef = objectRef;
            ?? animationScope = new AnimationScope(obj, animation.getTypeConverter(), animationVector, j2, animation.getTargetValue(), j2, true, new Function0<Unit>() { // from class: androidx.compose.animation.core.SuspendAnimationKt.animate.6.1
                final /* synthetic */ AnimationState<T, V> $this_animate;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AnimationState<T, V> animationState) {
                    super(0);
                    animationState = animationState;
                }

                /* JADX INFO: renamed from: invoke */
                public final void invoke2() {
                    animationState.setRunning$animation_core_release(false);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            });
            SuspendAnimationKt.doAnimationFrameWithScale(animationScope, j2, f, animation, animationState, function1);
            objectRef.element = animationScope;
        }

        /* JADX INFO: renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$6$1 */
        /* JADX INFO: compiled from: SuspendAnimation.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bDJc|\u0004W\u00068é<Ȑ\u0017\"Z\u0011\u0018\tlʑG0dkN-`TR\u000f\u001a}z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
            final /* synthetic */ AnimationState<T, V> $this_animate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AnimationState<T, V> animationState) {
                super(0);
                animationState = animationState;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                animationState.setRunning$animation_core_release(false);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$7 */
    /* JADX INFO: compiled from: SuspendAnimation.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bDJc|\u0004W\u00068é<Ȑ\u0017\"Z\u0011\u0018\tlʑG0dkN-`TR\u000f\u001a}z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass7 extends Lambda implements Function0<Unit> {
        final /* synthetic */ AnimationState<T, V> $this_animate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass7(AnimationState<T, V> animationState) {
            super(0);
            animationState = animationState;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            animationState.setRunning$animation_core_release(false);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SuspendAnimationKt$animate$9 */
    /* JADX INFO: compiled from: SuspendAnimation.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d̉=!,i\bDJc|\u0004W\u00068é6B\r)4ߚ\u0006ј~jg/dgN\u008c`SJ\u0015qzB%\u0004$ EkY(\u0001:\t}R.oĔNZ\u0011H"}, d2 = {"\n`]<a@F])\rS", "", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "7s", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass9 extends Lambda implements Function1<Long, Unit> {
        final /* synthetic */ Animation<T, V> $animation;
        final /* synthetic */ Function1<AnimationScope<T, V>, Unit> $block;
        final /* synthetic */ float $durationScale;
        final /* synthetic */ Ref.ObjectRef<AnimationScope<T, V>> $lateInitScope;
        final /* synthetic */ AnimationState<T, V> $this_animate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass9(Ref.ObjectRef<AnimationScope<T, V>> objectRef, float f2, Animation<T, V> animation, AnimationState<T, V> animationState, Function1<? super AnimationScope<T, V>, Unit> function1) {
            super(1);
            objectRef = objectRef;
            f = f2;
            animation = animation;
            animationState = animationState;
            function1 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
            invoke(l2.longValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(long j2) {
            T t2 = objectRef.element;
            Intrinsics.checkNotNull(t2);
            SuspendAnimationKt.doAnimationFrameWithScale((AnimationScope) t2, j2, f, animation, animationState, function1);
        }
    }

    public static final <R, T, V extends AnimationVector> Object callWithFrameNanos(Animation<T, V> animation, Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        if (animation.isInfinite()) {
            return InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(function1, continuation);
        }
        return MonotonicFrameClockKt.withFrameNanos(new Function1<Long, R>() { // from class: androidx.compose.animation.core.SuspendAnimationKt.callWithFrameNanos.2
            final /* synthetic */ Function1<Long, R> $onFrame;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C04142(Function1<? super Long, ? extends R> function12) {
                super(1);
                function1 = function12;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Long l2) {
                return invoke(l2.longValue());
            }

            public final R invoke(long j2) {
                return function1.invoke(Long.valueOf(j2));
            }
        }, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.SuspendAnimationKt$callWithFrameNanos$2 */
    /* JADX INFO: compiled from: SuspendAnimation.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<;#&i\u0016DLш|\u0004O\r8\u000b4B\rӬD\u0012>\u0006\u0007l?ӄRdh0XR8\u000f\f\u0002:$i%\u001aCiWJ\u00020\fgN\u0016k5RҼ\u000fE\u0015\u000b$~"}, d2 = {"\n`]<a@F])\rS", Global.BLANK, "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "7s", "", "7me<^,", "uI\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04142<R> extends Lambda implements Function1<Long, R> {
        final /* synthetic */ Function1<Long, R> $onFrame;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04142(Function1<? super Long, ? extends R> function12) {
            super(1);
            function1 = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Long l2) {
            return invoke(l2.longValue());
        }

        public final R invoke(long j2) {
            return function1.invoke(Long.valueOf(j2));
        }
    }

    public static final float getDurationScale(CoroutineContext coroutineContext) {
        MotionDurationScale motionDurationScale = (MotionDurationScale) coroutineContext.get(MotionDurationScale.Key);
        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
        if (!(scaleFactor >= 0.0f)) {
            PreconditionsKt.throwIllegalStateException("negative scale factor");
        }
        return scaleFactor;
    }

    public static final <T, V extends AnimationVector> void updateState(AnimationScope<T, V> animationScope, AnimationState<T, V> animationState) {
        animationState.setValue$animation_core_release(animationScope.getValue());
        AnimationVectorsKt.copyFrom(animationState.getVelocityVector(), animationScope.getVelocityVector());
        animationState.setFinishedTimeNanos$animation_core_release(animationScope.getFinishedTimeNanos());
        animationState.setLastFrameTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
        animationState.setRunning$animation_core_release(animationScope.isRunning());
    }

    public static final <T, V extends AnimationVector> void doAnimationFrameWithScale(AnimationScope<T, V> animationScope, long j2, float f2, Animation<T, V> animation, AnimationState<T, V> animationState, Function1<? super AnimationScope<T, V>, Unit> function1) {
        long startTimeNanos;
        if (f2 == 0.0f) {
            startTimeNanos = animation.getDurationNanos();
        } else {
            startTimeNanos = (long) ((j2 - animationScope.getStartTimeNanos()) / f2);
        }
        doAnimationFrame(animationScope, j2, startTimeNanos, animation, animationState, function1);
    }

    private static final <T, V extends AnimationVector> void doAnimationFrame(AnimationScope<T, V> animationScope, long j2, long j3, Animation<T, V> animation, AnimationState<T, V> animationState, Function1<? super AnimationScope<T, V>, Unit> function1) {
        animationScope.setLastFrameTimeNanos$animation_core_release(j2);
        animationScope.setValue$animation_core_release(animation.getValueFromNanos(j3));
        animationScope.setVelocityVector$animation_core_release(animation.getVelocityVectorFromNanos(j3));
        if (animation.isFinishedFromNanos(j3)) {
            animationScope.setFinishedTimeNanos$animation_core_release(animationScope.getLastFrameTimeNanos());
            animationScope.setRunning$animation_core_release(false);
        }
        updateState(animationScope, animationState);
        function1.invoke(animationScope);
    }
}
