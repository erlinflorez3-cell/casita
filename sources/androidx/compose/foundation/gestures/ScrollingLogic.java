package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import com.drew.metadata.exif.makernotes.LeicaMakernoteDirectory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯĊ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmHDR[ճ\u0017k\n=,Ӌ,qY;]\u001a\u0004\"\u0011OdgonPZ\u0013C\u0015\u0007\u001ex\u0001,Qǁ\u0001](\u000f:B\u0006?;Mu?A`\u000b6\r 8%@y\u0013\u0001\"*N\u0015~zYK\u0014۵8@\u0007:Z\rc\u0005\"\u0012\u001c>(\u00014\\oN<Pt]H4+\u0003oOv&p6ŧcεvTU\f7\u0017./N7M\u0015ST\u0013\r`]W\u0005Upk\bx+5/as\u0006;h\u0004\"\u001bCO;d\u0003*j\ri`:0;SqUh\u000eV\u0003ߡ\u007f\rJ\u0010V\u001f5cF-H\u00038\u0012A\u0012\u000bSnlHސ\u0001ʎyʨي\u001b'\u0006Q9Xcj_\u0002S\u0019|@D\u001e\u001b?;\u0001\u001dC\fX\u001c\u0004-\u001b\u0003\u0014\u0018Ŀ\u0010ή<ʰݳ\u000e[C\u0012\u0012\u0010+\u00188)HG.F,\u0015<==7\nPٳ ǽɘLFm\u001e\u0013\t1\u0013wx`@P\u0011F=0\t\u001a\u0004\\d3\u0016\u0001yfW)n\"S\u0017\u007f\u0018\u0013N\n\bD1+ P_h\u0018\r{\f\u001a)?hMX\u001dj<\u0004ߍb3;\u0001*ߋ ؏z\u0014Ml+\tf\u0018ZS:c%^0d`j>\u0001,H\\\f+2mrL8:71\\CO3$PC\u0015\u000buY\u0017\u0013/XA,\u001biR}9\u0005^`\to\u0016}y0\u000bj:-o\\}=4\t:hb\u0014K\u0007-\b0Ku\u0001_L\u001b-&Y\nU.\u001ag_u=Ҙ\u000eȯȞ6\u00043{Z*.c[J?z+\u00117;\u0017E֏\u0007ξҔ0bp\u0004]|_*\u0005\u0017\u000b#6\u001f(y\u0010\u0001CYq\u0010#[l`\u001b\u0003\bSӷ7وġ# +=}JEI;\u0001?\u001dD\u0014</C}$iݩ-Ӡˏ\u0013(z$\u0012T,(}\"i]`u`I\b\u0016ҏ!غк\u0007DN+\u0006I\u000b\u001dBLKHo\u001f\u0019VfiQ/·e߿Ր\u0011r\\\u001eHT8\u0013Bqw*\"Z&\u0014\r}Ӓ\u0010LтfƚߑO^\u0011\u000f\u001dOS\u0018?!*\u001ck<~W\u0011%`\n\u0002^NAi\u001dK<˸#҉ʙ@\n\u0011\u000bb2V\u001c\t\u0004^_=\u001c\t\u0081\u007fŌZ\u000e\\ۿ-jV\u0012xE\u000f/\u0001܃\u000bݩ2ͨئ40ܭqH\\/qAQ_+\u00133j}\n=ފ7\u05ffX9#ι)\u000f\u0019UuCw\u0013\rߧIԆqmw\fF*M)P\u001e39\u007f\u00186ھ<Ϳ\u000fUl̯5\u0003 yjNP=UҖ\tɽ@\n\u0017ԥi]\u0001qz/bM&:\u001aב\rӢH)\u000fљM{T0E\u0012E/MI\u0019+7}gSi\u001566vٷ\u0006ȯ%\\_ʪ7\u0016k#R\u0016 \u001f9ղ\u0015\u07b3T \f˸\u001b\u0001\u0001\nF\bdPXֲ\u000eեbYsլqR5C\u0005\u0006pT\u001f9`ɫn̼rY#\u0005lJd\u0014Ҫ-Y%\f-ӯJAWb:\u0017rޙ\\Z"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0019qc \u0011e0LL", "", "Aba<_3:P ~hm(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0011eh9tr(]v|", "=uT?f*K] \u0006Z_-|\u0007>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u000fFY\u000b.5z 5T#<l4\u001c$>", "4kX;Z\t>V\u0015\u0010~h9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w.J?t6z\u0015k]J\u000bm9$", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "@de2e:>2\u001d\fz\\;\u0001\u00138", "", "<dbAX+,Q&\t\u0002e\u000b\u0001\u0017:a\u000f&~@\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3UU+UWJ;ZUrJi", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u001719x>%\u001cd^@\u0007Q;J\u0006'\u001d3J5[_|A\u0013%$\fX3\u0018\u000fgAmoNG(\u0007(X\u0006EqJu'\u000eBxnO`\u0017NY\u0016vA'w\u001c@[\u0003FNOf)wU]'dED2\u0014;\u001a%xY-\u0006\u000bW\u001b{\u001c{guV)\b82\bNbJNq2<w#0O\u0006\u0005g\u0019T}*\u00027\b3=\u007fb\u000fSr\"L^B\u00166lJ&\"E@\u001dH\u0015euzM\u001eu\u001foQwo91\"tarL\u0019\u00103\fB1j^\u000eAV\u0005Q\u0013m\u001f/Q\tP[C%\rP(vpYRd]\u0001(\u007fD!m\u000f\u0010\rm\u001fe\u0017\u0016Kh\u000fg\u0018]DW\u001a\u0010G<\u001a\u0007UR\u0013sH\u001dC\u000fc", ":`c2f;,Q&\t\u0002e\u001a\u0007\u0019<c\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WEv3DY|.5z 5T\r$kB-\u0015gO7\u0014m3Ud1WYL,2", "\u0017", "<dbAX+,Q&\t\u0002e\u001az\u0013:e", "/mS?b0=fb|\u0005f7\u0007\u0017//\u00012\fI\u007f\u0013&Ky\u0017\u0006x%Ch\u000e-7{_\u001cKPEr;\"\u001ejHC\tg*\r\u007f'U[N+JP\u007fG\u001b\u0019H\fX6\rC%", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0019qc \u0011e0L50GZ],[@pJ\u001e\u0019a{L5\u0018\u0005\u0018\ry", "=tc2e\u001aMO(~h\\6\b\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079", ">da3b9FA\u0017\f\u0005e3]\u0013<O\u0011(\tN~$!Nv", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "Ag^B_+\u001dW'\nvm*\u007fr@e\r6yM\u000b\u001e\u001e", "5dc [6NZ\u0018]~l7x\u0018-hi9{M\u000f\u0015$Qv\u0015", "u(I", "2n59\\5@/\"\u0003\u0003Z;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9~<}/3]\r4\r", "/uP6_(;Z\u0019", "2n59\\5@/\"\u0003\u0003Z;\u0001\u00138-k\u001a\u0006HL~!", "uI;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007uzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "7rE2e;BQ\u0015\u0006", "=m3?T.,b#\n\u0006^+", "", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "=m3?T.,b#\n\u0006^+D\u0017\u0010-}o\u000b0", ">da3b9F@\u0015\u0011h\\9\u0007\u00106", "Aba<_3", ">da3b9F@\u0015\u0011h\\9\u0007\u00106-g\u000eC#\u0016j\u0007", "uI\u0018\u0017", "Aba<_3)`\u001d\t\bb;\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\rEhy/7X#2WP?zHs", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w6CIz4\u001d\u0003fnC\u000ej\u001aL\u00012G\"", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn\u001di\r\u001cFm\u0001;QMHoC2jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0004tn2S\u0011Bl\nU\u0014\u0018Bt\u0001QZ\u0019G\b^SK2wJbouVEOk\u007f(rd\u0019m6\u0004+\u0010z\u001bdRM3\nybf", "Ag^B_+,Q&\t\u0002e\u0010\u0005\u0011/d\u0004$\u000b@\b+", "CoS.g,", ">da3b9FA\u0017\f\u0005e3", "2d[AT", "And?V,", ">da3b9FA\u0017\f\u0005e3DV/A[+o\u001c", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u001719x>%\u001cV_C\u0012c\u00023Zj,", "@de2e:>7\u001agz^+|\b", "@de2e:>7\u001agz^+|\bvMeo^UT\u0007", "", "Ah]4_,\u001af\u001d\rd_-\u000b\t>", "Ah]4_,\u001af\u001d\rd_-\u000b\t>-g\u000eC#\u0016j\u0007", "Ah]4_,\u001af\u001d\rk^3\u0007\u00073t\u0014", "Ah]4_,\u001af\u001d\rk^3\u0007\u00073t\u0014oW#Mci)m", "Bn59b(M", "Bn59b(M\u001b\u001fFIe\u0018Gp", "uI\u0018\u0013", "Bn59b(M\u001b\baF::XS", "Bn>3Y:>b", "Bn>3Y:>b`\u000e\u000bK\u001c\u000e\u000e\u001b", "uE\u0018\u0017", "<df#T3NS", "CoS.g,\u0006?\u000b\t\u0003*\u0014\u0007", "uI5u=", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ScrollingLogic {
    public static final int $stable = 8;
    private FlingBehavior flingBehavior;
    private NestedScrollDispatcher nestedScrollDispatcher;
    private Orientation orientation;
    private OverscrollEffect overscrollEffect;
    private boolean reverseDirection;
    private ScrollableState scrollableState;
    private int latestScrollSource = NestedScrollSource.Companion.m5280getUserInputWNlRxjI();
    private ScrollScope outerStateScope = ScrollableKt.NoOpScrollScope;
    private final ScrollingLogic$nestedScrollScope$1 nestedScrollScope = new NestedScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1
        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        /* JADX INFO: renamed from: scrollBy-OzD1aCk */
        public long mo791scrollByOzD1aCk(long j2, int i2) {
            return this.this$0.m826performScroll3eAAhYA(this.this$0.outerStateScope, j2, i2);
        }

        @Override // androidx.compose.foundation.gestures.NestedScrollScope
        /* JADX INFO: renamed from: scrollByWithOverscroll-OzD1aCk */
        public long mo792scrollByWithOverscrollOzD1aCk(long j2, int i2) {
            this.this$0.latestScrollSource = i2;
            OverscrollEffect overscrollEffect = this.this$0.overscrollEffect;
            if (overscrollEffect == null || !this.this$0.getShouldDispatchOverscroll()) {
                return this.this$0.m826performScroll3eAAhYA(this.this$0.outerStateScope, j2, i2);
            }
            return overscrollEffect.mo555applyToScrollRhakbz0(j2, this.this$0.latestScrollSource, this.this$0.performScrollForOverscroll);
        }
    };
    private final Function1<Offset, Offset> performScrollForOverscroll = new Function1<Offset, Offset>() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$performScrollForOverscroll$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Offset invoke(Offset offset) {
            return Offset.m3926boximpl(m838invokeMKHz9U(offset.m3947unboximpl()));
        }

        /* JADX INFO: renamed from: invoke-MK-Hz9U, reason: not valid java name */
        public final long m838invokeMKHz9U(long j2) {
            ScrollScope scrollScope = this.this$0.outerStateScope;
            ScrollingLogic scrollingLogic = this.this$0;
            return scrollingLogic.m826performScroll3eAAhYA(scrollScope, j2, scrollingLogic.latestScrollSource);
        }
    };

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.foundation.gestures.ScrollingLogic$nestedScrollScope$1] */
    public ScrollingLogic(ScrollableState scrollableState, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, Orientation orientation, boolean z2, NestedScrollDispatcher nestedScrollDispatcher) {
        this.scrollableState = scrollableState;
        this.overscrollEffect = overscrollEffect;
        this.flingBehavior = flingBehavior;
        this.orientation = orientation;
        this.reverseDirection = z2;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
    }

    /* JADX INFO: renamed from: toOffset-tuRUvjQ */
    public final long m836toOffsettuRUvjQ(float f2) {
        if (f2 == 0.0f) {
            return Offset.Companion.m3953getZeroF1C5BW0();
        }
        return this.orientation == Orientation.Horizontal ? OffsetKt.Offset(f2, 0.0f) : OffsetKt.Offset(0.0f, f2);
    }

    /* JADX INFO: renamed from: singleAxisOffset-MK-Hz9U */
    public final long m834singleAxisOffsetMKHz9U(long j2) {
        return this.orientation == Orientation.Horizontal ? Offset.m3931copydBAh8RU$default(j2, 0.0f, 0.0f, 1, null) : Offset.m3931copydBAh8RU$default(j2, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: toFloat-k-4lQ0M */
    public final float m835toFloatk4lQ0M(long j2) {
        return this.orientation == Orientation.Horizontal ? Offset.m3937getXimpl(j2) : Offset.m3938getYimpl(j2);
    }

    /* JADX INFO: renamed from: toFloat-TH1AsA0 */
    public final float m828toFloatTH1AsA0(long j2) {
        return this.orientation == Orientation.Horizontal ? Velocity.m6875getXimpl(j2) : Velocity.m6876getYimpl(j2);
    }

    /* JADX INFO: renamed from: singleAxisVelocity-AH228Gc */
    private final long m827singleAxisVelocityAH228Gc(long j2) {
        return this.orientation == Orientation.Horizontal ? Velocity.m6871copyOhffZ5M$default(j2, 0.0f, 0.0f, 1, null) : Velocity.m6871copyOhffZ5M$default(j2, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: renamed from: update-QWom1Mo */
    public final long m829updateQWom1Mo(long j2, float f2) {
        return this.orientation == Orientation.Horizontal ? Velocity.m6871copyOhffZ5M$default(j2, f2, 0.0f, 2, null) : Velocity.m6871copyOhffZ5M$default(j2, 0.0f, f2, 1, null);
    }

    public final float reverseIfNeeded(float f2) {
        return this.reverseDirection ? f2 * (-1) : f2;
    }

    /* JADX INFO: renamed from: reverseIfNeeded-MK-Hz9U */
    public final long m833reverseIfNeededMKHz9U(long j2) {
        return this.reverseDirection ? Offset.m3944timestuRUvjQ(j2, -1.0f) : j2;
    }

    /* JADX INFO: renamed from: performScroll-3eAAhYA */
    public final long m826performScroll3eAAhYA(ScrollScope scrollScope, long j2, int i2) {
        long jM5264dispatchPreScrollOzD1aCk = this.nestedScrollDispatcher.m5264dispatchPreScrollOzD1aCk(j2, i2);
        long jM3941minusMKHz9U = Offset.m3941minusMKHz9U(j2, jM5264dispatchPreScrollOzD1aCk);
        long jM833reverseIfNeededMKHz9U = m833reverseIfNeededMKHz9U(m836toOffsettuRUvjQ(scrollScope.scrollBy(m835toFloatk4lQ0M(m833reverseIfNeededMKHz9U(m834singleAxisOffsetMKHz9U(jM3941minusMKHz9U))))));
        return Offset.m3942plusMKHz9U(Offset.m3942plusMKHz9U(jM5264dispatchPreScrollOzD1aCk, jM833reverseIfNeededMKHz9U), this.nestedScrollDispatcher.m5262dispatchPostScrollDzOQY0M(jM833reverseIfNeededMKHz9U, Offset.m3941minusMKHz9U(jM3941minusMKHz9U, jM833reverseIfNeededMKHz9U), i2));
    }

    public final boolean getShouldDispatchOverscroll() {
        return this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward();
    }

    /* JADX INFO: renamed from: performRawScroll-MK-Hz9U */
    public final long m832performRawScrollMKHz9U(long j2) {
        if (this.scrollableState.isScrollInProgress()) {
            return Offset.Companion.m3953getZeroF1C5BW0();
        }
        return m836toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m835toFloatk4lQ0M(j2)))));
    }

    /* JADX INFO: renamed from: onDragStopped-sF-c-tU */
    public final Object m831onDragStoppedsFctU(long j2, Continuation<? super Unit> continuation) {
        long jM827singleAxisVelocityAH228Gc = m827singleAxisVelocityAH228Gc(j2);
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this, null);
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        if (overscrollEffect != null && getShouldDispatchOverscroll()) {
            Object objMo554applyToFlingBMRW4eQ = overscrollEffect.mo554applyToFlingBMRW4eQ(jM827singleAxisVelocityAH228Gc, scrollingLogic$onDragStopped$performFling$1, continuation);
            return objMo554applyToFlingBMRW4eQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo554applyToFlingBMRW4eQ : Unit.INSTANCE;
        }
        Object objInvoke = scrollingLogic$onDragStopped$performFling$1.invoke(Velocity.m6866boximpl(jM827singleAxisVelocityAH228Gc), continuation);
        return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /* JADX INFO: renamed from: doFlingAnimation-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m830doFlingAnimationQWom1Mo(long r12, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L53
            r4 = r14
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r4 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r2 + r1
            r2 = r2 | r1
            int r0 = r0 - r2
            if (r0 == 0) goto L53
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L16:
            java.lang.Object r3 = r4.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L59
            java.lang.Object r7 = r4.L$0
            kotlin.jvm.internal.Ref$LongRef r7 = (kotlin.jvm.internal.Ref.LongRef) r7
            kotlin.ResultKt.throwOnFailure(r3)
        L2a:
            long r0 = r7.element
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m6866boximpl(r0)
            return r0
        L31:
            kotlin.ResultKt.throwOnFailure(r3)
            kotlin.jvm.internal.Ref$LongRef r7 = new kotlin.jvm.internal.Ref$LongRef
            r7.<init>()
            r8 = r12
            r7.element = r8
            androidx.compose.foundation.MutatePriority r0 = androidx.compose.foundation.MutatePriority.Default
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r5 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r10 = 0
            r6 = r11
            r5.<init>(r6, r7, r8, r10)
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r4.L$0 = r7
            r4.label = r1
            java.lang.Object r0 = r11.scroll(r0, r5, r4)
            if (r0 != r2) goto L52
            return r2
        L52:
            goto L2a
        L53:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r4 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r4.<init>(r11, r14)
            goto L16
        L59:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m830doFlingAnimationQWom1Mo(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean shouldScrollImmediately() {
        if (!this.scrollableState.isScrollInProgress()) {
            OverscrollEffect overscrollEffect = this.overscrollEffect;
            if (!(overscrollEffect != null ? overscrollEffect.isInProgress() : false)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ Object scroll$default(ScrollingLogic scrollingLogic, MutatePriority mutatePriority, Function2 function2, Continuation continuation, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return scrollingLogic.scroll(mutatePriority, function2, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ScrollingLogic$scroll$2 */
    /* JADX INFO: compiled from: Scrollable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU{\r\u001d\u001b\u0019\u001a\u0018\u001e\u0018}\"\u001b\u001e\u0019Z+\u001c,*()ap", f = " /=954((1)p-5", i = {}, l = {LeicaMakernoteDirectory.TAG_WB_BLUE_LEVEL}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<NestedScrollScope, Continuation<? super Unit>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super NestedScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = ScrollingLogic.this.new AnonymousClass2(this.$block, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                ScrollingLogic.this.outerStateScope = (ScrollScope) this.L$0;
                Function2<NestedScrollScope, Continuation<? super Unit>, Object> function2 = this.$block;
                ScrollingLogic$nestedScrollScope$1 scrollingLogic$nestedScrollScope$1 = ScrollingLogic.this.nestedScrollScope;
                this.label = 1;
                if (function2.invoke(scrollingLogic$nestedScrollScope$1, this) == coroutine_suspended) {
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

    public final Object scroll(MutatePriority mutatePriority, Function2<? super NestedScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objScroll = this.scrollableState.scroll(mutatePriority, new AnonymousClass2(function2, null), continuation);
        return objScroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }

    public final boolean update(ScrollableState scrollableState, Orientation orientation, OverscrollEffect overscrollEffect, boolean z2, FlingBehavior flingBehavior, NestedScrollDispatcher nestedScrollDispatcher) {
        boolean z3;
        boolean z4 = true;
        if (!Intrinsics.areEqual(this.scrollableState, scrollableState)) {
            this.scrollableState = scrollableState;
            z3 = true;
        } else {
            z3 = false;
        }
        this.overscrollEffect = overscrollEffect;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            z3 = true;
        }
        if (this.reverseDirection != z2) {
            this.reverseDirection = z2;
        } else {
            z4 = z3;
        }
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        return z4;
    }

    public final boolean isVertical() {
        return this.orientation == Orientation.Vertical;
    }
}
