package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яh\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<N\u0007\"2\u0012\u007f\u0007|jA0JeP.`s2\u000fq{<$q$yCAZ\"}0\u0012WȞog|UbŏK\u000f\u001c\u0016\u0001̓4Ic~e܈\u00172XoG3StE9vt>\u0005&3*8\b#\t\u001a0K\u0018v\tŏS\f\u00181V\u0081X\u0001=Q3\u0019z\u0006\u001d 9\u001e\u000b\u0017\u000fCN\u0001m>=$\u001bipPϮc0\u000bPM[Z;\u001dzo\u001fC@e7%)a\u0007\u001fR\nDƄCqK\u000b)B-?Ywe7p\u007fB\u0017;Y\u001bd\u000b,l\u0007a`:,YWӍOP\u001c18\b\u0002\fL\b\u001c\u0010?H\\8բj\b\u001c?=~aRh\u0002\rU0~oJ/%.HsQ)|icQ\u0018|N,\t\u001b2;\u0001\u001d6\fZ\u0014`#3lw\u007fJ\u001a\\Kbf\u0010i?}\u0004\u001fy0E44U\u0014G{?CG+=[G;9k0a\r\u007f\u0005!xjih\u0001_p&|*O*7!\u000bHr\"\u0004P\u0003qr\u0016\u0016*b%\u0016\n)\u001f\u000b\u000fl%3$fO\u0017~3\\k)=/\u0015J\nry\"o9\rH{ȨeXw`\u0017,?ju5\\tVk\f\tqX&@e\u0003\u0010&\u0015\u000bST3@`\n\u001cb.a\u001dj)`\u0003LWq\r\u0017\u0002rt \u0001d3R\u001ay&\u0005\t/e\u000b\u00148{\u0007jD|\u000f$]E_I1&\u00047\u00198\u000bG\u001f~\"\u0002\u0010{ZldlDw\u0006\u007f.*29\u007fDm\u0017\u001d#A20/\u000eh\u0001\fiS\")\u000b|(\u0011i\u0010^k\u0016~\t,\u000f\u007fzUZ\u00170\u001fvrQ!-\u001e\b\u000b^\u0001Wed\u000b\n@w\u000e3]JbP|34N+\u0007o0%M-q@c\u001b@\u0018=?y]\u0018zv\u007fp:>t\u0014\u0006rw^up}u2ie\u0010YOR01\u0005\u000bRJzw6G\u001f3;;\u001fЫpވZ8Uߒ\u007f\nt\u0011D\r\u001fa2ƨ\u0015̭\u000246ɾz\tQ\u0005,dS'!M\u0002l\u001cu\u0002!\u05c8N\u0013\"\r\u0002?|!lL.Wob72<8͛:ESd\u000bL\u00175Ҳ0l"}, d2 = {"\u001aj^A_0G\u001d(~\u000emui\t1e\u0013}", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "\u001aj^A_0G\u001d\u001d\tDL,\n\r+l\u0004=w=\b\u0017l", ">`cAX9G", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "=oc6b5", "\u001aj^A_0G\u001d(~\u000emui\t1e\u0013\u0012\u0007O\u0005! \u001d", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bF\u000b&\u001eKxWKv8D#j 9m)\u0018XR?u=sXY", "=oc6b5L", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011\u007f\u001d@}n#Y\ruz^", "<`c6i,)O(\u000ezk5", "\u001aiPCTuNb\u001d\u0006Dk,~\tB/j$\u000bO\u0001$ \u001d", "uKY.i(\bc(\u0003\u0002(9|\u000b/xI\u0013wO\u0010\u0017$PEQ-", "-n_A\\6Ga", "5dc\u001cc;B]\"\r", "u(;7T=:\u001d)\u000e~euj\t>;", "5dc\u001dT;MS&\b", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n]AT0Ga\u0001z\n\\/`\u0012", "", "7m_Bg", "", "4h]1", "\u001aj^A_0G\u001d(~\u000emud\u0005>c\u0003\u0015{N\u0011\u001e&\u001d", "AsP?g\u0010GR\u0019\u0012", "", "4h]143E", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", ";`c0[\bM", "7mS2k", ";`c0[\fGb\u001d\fz", ";`c0[,L", ";`c0[,L/(", "@d_9T*>", "BqP;f-H`!", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "@d_9T*>[\u0019\b\n", "@d_9T*>4\u001d\f\tm", "Ao[6g", "", ":h\\6g", "Ao[6g\u001bHA\u0019\u000b\u000b^5z\t", "Bn?.g;>`\"", "BnBAe0GU", "EqXAX\u0019>^ zx^", "", "\u0011n\\=T5B]\"", "!da6T3Bh\u0019}", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Regex implements Serializable {
    public static final Companion Companion = new Companion(null);
    private Set<? extends RegexOption> _options;
    private final Pattern nativePattern;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"4\u0012\u0006\u0013nj?1Le^.Zݷ0Ŧl\u0012éT[Rp\u0004@[\u001aԥ&\t]N0u|Kr\u000bq\u00116\u001a\u0007mDI\u0004z$\u0012W>PsW3{tm=nzN\u0005N7jD\b\f\u0019\u001aXM@z\tIc\f@5\t|HZ%M3#B\nL&\u0019\u001e\u000blߗ:R"}, d2 = {"\u001aj^A_0G\u001d(~\u000emui\t1e\u0013fYJ\t\"\u0013Ps\u0018EL", "", "u(E", "3mbBe,.\\\u001d|\u0005],Z\u0005=e", "", "4kP4f", "3rR.c,", "", ":hc2e(E", "3rR.c,+S$\u0006v\\,\u0005\t8t", "4q^:?0MS&z\u0002", "\u001aj^A_0G\u001d(~\u000emui\t1e\u0013}", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int ensureUnicodeCase(int i2) {
            return (2 & i2) != 0 ? (-1) - (((-1) - i2) & ((-1) - 64)) : i2;
        }

        public final String escape(String literal) {
            Intrinsics.checkNotNullParameter(literal, "literal");
            String strQuote = Pattern.quote(literal);
            Intrinsics.checkNotNullExpressionValue(strQuote, "quote(...)");
            return strQuote;
        }

        public final String escapeReplacement(String literal) {
            Intrinsics.checkNotNullParameter(literal, "literal");
            String strQuoteReplacement = Matcher.quoteReplacement(literal);
            Intrinsics.checkNotNullExpressionValue(strQuoteReplacement, "quoteReplacement(...)");
            return strQuoteReplacement;
        }

        public final Regex fromLiteral(String literal) {
            Intrinsics.checkNotNullParameter(literal, "literal");
            return new Regex(literal, RegexOption.LITERAL);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<N\u0007Ӭ4\u0012\u0006\rnj?4LeV\u008cZS0\u000fq{Jřy0\"GiT\u0003}\u0001\t\bMs(\u0002Z^\u0019D'\u0006Dzz0WX\u0011]@\u0013̓FoM8\u0016uKCxtd\u0010f2rG\b\b\u0019\u001aXLǘz\u0001Kŷ$\u00146F~A#\u001c[\u00062\u00124@ŋ\u0005$dɡf8NtkCǫ'\u0010"}, d2 = {"\u001aj^A_0G\u001d(~\u000emui\t1e\u0013fi@\u000e\u001b\u0013Ns#<uz", "\u001aiPCTuB]blzk0x\u00103z{%\u0003@V", "\u001aj^A_0G\u001d\u001d\tDL,\n\r+l\u0004=w=\b\u0017l", ">`cAX9G", "", "4kP4f", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "5dc\u0013_(@a", "u(8", "5dc\u001dT;MS&\b", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "@dP1E,L] \u0010z", "", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Serialized implements Serializable {
        public static final Companion Companion = new Companion(null);
        private static final long serialVersionUID = 0;
        private final int flags;
        private final String pattern;

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001aj^A_0G\u001d(~\u000emui\t1e\u0013fi@\u000e\u001b\u0013Ns#<uc\u0013c\u0006+3v\u001a8V\u0019", "", "u(E", "Ada6T3/S&\r~h5ll\u000e", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Serialized(String pattern, int i2) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            this.pattern = pattern;
            this.flags = i2;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.pattern, this.flags);
            Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
            return new Regex(patternCompile);
        }

        public final int getFlags() {
            return this.flags;
        }

        public final String getPattern() {
            return this.pattern;
        }
    }

    /* JADX INFO: renamed from: kotlin.text.Regex$findAll$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!4i\bӵRш\r\u0006W\u0005^\ntJ֜&,\u0018w"}, d2 = {"\n`]<a@F])\rS", "\u001aj^A_0G\u001d(~\u000emud\u0005>c\u0003\u0015{N\u0011\u001e&\u001d", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<MatchResult> {
        final /* synthetic */ CharSequence $input;
        final /* synthetic */ int $startIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CharSequence charSequence, int i2) {
            super(0);
            charSequence = charSequence;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final MatchResult invoke() {
            return Regex.this.find(charSequence, i);
        }
    }

    /* JADX INFO: renamed from: kotlin.text.Regex$findAll$2 */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<MatchResult, MatchResult> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final MatchResult invoke(MatchResult p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return p02.next();
        }
    }

    /* JADX INFO: renamed from: kotlin.text.Regex$splitToSequence$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bDZc|\u0004O\u0012>éFB-!T\u0018\b\tvjg1re\u000f\u0097\u0011"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eo{:\u000105/", ""}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C13801 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super String>, Continuation<? super Unit>, Object> {
        final /* synthetic */ CharSequence $input;
        final /* synthetic */ int $limit;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13801(CharSequence charSequence, int i2, Continuation<? super C13801> continuation) {
            super(2, continuation);
            this.$input = charSequence;
            this.$limit = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13801 c13801 = Regex.this.new C13801(this.$input, this.$limit, continuation);
            c13801.L$0 = obj;
            return c13801;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super String> sequenceScope, Continuation<? super Unit> continuation) {
            return ((C13801) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x0067 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00a3 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0065 -> B:56:0x0075). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r10.label
                r5 = 3
                r8 = 2
                r2 = 1
                if (r0 == 0) goto L17
                if (r0 == r2) goto Lac
                if (r0 == r8) goto L68
                if (r0 != r5) goto La4
                kotlin.ResultKt.throwOnFailure(r11)
            L14:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L17:
                kotlin.ResultKt.throwOnFailure(r11)
                java.lang.Object r4 = r10.L$0
                kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
                kotlin.text.Regex r0 = kotlin.text.Regex.this
                java.util.regex.Pattern r1 = kotlin.text.Regex.access$getNativePattern$p(r0)
                java.lang.CharSequence r0 = r10.$input
                java.util.regex.Matcher r6 = r1.matcher(r0)
                int r0 = r10.$limit
                if (r0 == r2) goto L34
                boolean r0 = r6.find()
                if (r0 != 0) goto L46
            L34:
                java.lang.CharSequence r0 = r10.$input
                java.lang.String r1 = r0.toString()
                r0 = r10
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r10.label = r2
                java.lang.Object r0 = r4.yield(r1, r0)
                if (r0 != r3) goto Laf
                return r3
            L46:
                r9 = 0
                r7 = r9
            L48:
                java.lang.CharSequence r1 = r10.$input
                int r0 = r6.start()
                java.lang.CharSequence r0 = r1.subSequence(r9, r0)
                java.lang.String r1 = r0.toString()
                r0 = r10
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r10.L$0 = r4
                r10.L$1 = r6
                r10.I$0 = r7
                r10.label = r8
                java.lang.Object r0 = r4.yield(r1, r0)
                if (r0 != r3) goto L75
                return r3
            L68:
                int r7 = r10.I$0
                java.lang.Object r6 = r10.L$1
                java.util.regex.Matcher r6 = (java.util.regex.Matcher) r6
                java.lang.Object r4 = r10.L$0
                kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
                kotlin.ResultKt.throwOnFailure(r11)
            L75:
                int r9 = r6.end()
                int r7 = r7 + r2
                int r0 = r10.$limit
                int r0 = r0 - r2
                if (r7 == r0) goto L85
                boolean r0 = r6.find()
                if (r0 != 0) goto L48
            L85:
                java.lang.CharSequence r1 = r10.$input
                int r0 = r1.length()
                java.lang.CharSequence r0 = r1.subSequence(r9, r0)
                java.lang.String r2 = r0.toString()
                r1 = r10
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                r0 = 0
                r10.L$0 = r0
                r10.L$1 = r0
                r10.label = r5
                java.lang.Object r0 = r4.yield(r2, r1)
                if (r0 != r3) goto L14
                return r3
            La4:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            Lac:
                kotlin.ResultKt.throwOnFailure(r11)
            Laf:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.C13801.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String pattern, Set<? extends RegexOption> options) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(options, "options");
        Pattern patternCompile = Pattern.compile(pattern, Companion.ensureUnicodeCase(RegexKt.toInt(options)));
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(String pattern, RegexOption option) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(option, "option");
        Pattern patternCompile = Pattern.compile(pattern, Companion.ensureUnicodeCase(option.getValue()));
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }

    public Regex(Pattern nativePattern) {
        Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
        this.nativePattern = nativePattern;
    }

    public static /* synthetic */ MatchResult find$default(Regex regex, CharSequence charSequence, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return regex.find(charSequence, i2);
    }

    public static /* synthetic */ Sequence findAll$default(Regex regex, CharSequence charSequence, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return regex.findAll(charSequence, i2);
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i2 = 0;
        }
        return regex.split(charSequence, i2);
    }

    public static /* synthetic */ Sequence splitToSequence$default(Regex regex, CharSequence charSequence, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return regex.splitToSequence(charSequence, i2);
    }

    private final Object writeReplace() {
        String strPattern = this.nativePattern.pattern();
        Intrinsics.checkNotNullExpressionValue(strPattern, "pattern(...)");
        return new Serialized(strPattern, this.nativePattern.flags());
    }

    public final boolean containsMatchIn(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.nativePattern.matcher(input).find();
    }

    public final MatchResult find(CharSequence input, int i2) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return RegexKt.findNext(matcher, i2, input);
    }

    public final Sequence<MatchResult> findAll(CharSequence input, int i2) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (i2 < 0 || i2 > input.length()) {
            throw new IndexOutOfBoundsException("Start index out of bounds: " + i2 + ", input length: " + input.length());
        }
        return SequencesKt.generateSequence((Function0) new Function0<MatchResult>() { // from class: kotlin.text.Regex.findAll.1
            final /* synthetic */ CharSequence $input;
            final /* synthetic */ int $startIndex;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CharSequence input2, int i22) {
                super(0);
                charSequence = input2;
                i = i22;
            }

            @Override // kotlin.jvm.functions.Function0
            public final MatchResult invoke() {
                return Regex.this.find(charSequence, i);
            }
        }, (Function1) AnonymousClass2.INSTANCE);
    }

    public final Set<RegexOption> getOptions() {
        Set set = this._options;
        if (set != null) {
            return set;
        }
        final int iFlags = this.nativePattern.flags();
        EnumSet enumSetAllOf = EnumSet.allOf(RegexOption.class);
        Intrinsics.checkNotNull(enumSetAllOf);
        CollectionsKt.retainAll(enumSetAllOf, new Function1<RegexOption, Boolean>() { // from class: kotlin.text.Regex$special$$inlined$fromInt$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(RegexOption regexOption) {
                int i2 = iFlags;
                RegexOption regexOption2 = regexOption;
                int mask = regexOption2.getMask();
                return Boolean.valueOf((i2 + mask) - (i2 | mask) == regexOption2.getValue());
            }
        });
        Set<RegexOption> setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        this._options = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    public final String getPattern() {
        String strPattern = this.nativePattern.pattern();
        Intrinsics.checkNotNullExpressionValue(strPattern, "pattern(...)");
        return strPattern;
    }

    public final MatchResult matchAt(CharSequence input, int i2) {
        MatcherMatchResult matcherMatchResult;
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcherRegion = this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i2, input.length());
        if (matcherRegion.lookingAt()) {
            Intrinsics.checkNotNull(matcherRegion);
            matcherMatchResult = new MatcherMatchResult(matcherRegion, input);
        } else {
            matcherMatchResult = null;
        }
        return matcherMatchResult;
    }

    public final MatchResult matchEntire(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return RegexKt.matchEntire(matcher, input);
    }

    public final boolean matches(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.nativePattern.matcher(input).matches();
    }

    public final boolean matchesAt(CharSequence input, int i2) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.nativePattern.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i2, input.length()).lookingAt();
    }

    public final String replace(CharSequence input, String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String strReplaceAll = this.nativePattern.matcher(input).replaceAll(replacement);
        Intrinsics.checkNotNullExpressionValue(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String replace(CharSequence input, Function1<? super MatchResult, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iIntValue = 0;
        MatchResult matchResultFind$default = find$default(this, input, 0, 2, null);
        if (matchResultFind$default == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(input, iIntValue, matchResultFind$default.getRange().getStart().intValue());
            sb.append(transform.invoke(matchResultFind$default));
            iIntValue = matchResultFind$default.getRange().getEndInclusive().intValue() + 1;
            matchResultFind$default = matchResultFind$default.next();
            if (iIntValue >= length) {
                break;
            }
        } while (matchResultFind$default != null);
        if (iIntValue < length) {
            sb.append(input, iIntValue, length);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final String replaceFirst(CharSequence input, String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String strReplaceFirst = this.nativePattern.matcher(input).replaceFirst(replacement);
        Intrinsics.checkNotNullExpressionValue(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    public final List<String> split(CharSequence input, int i2) {
        Intrinsics.checkNotNullParameter(input, "input");
        StringsKt.requireNonNegativeLimit(i2);
        Matcher matcher = this.nativePattern.matcher(input);
        if (i2 == 1 || !matcher.find()) {
            return CollectionsKt.listOf(input.toString());
        }
        ArrayList arrayList = new ArrayList(i2 > 0 ? RangesKt.coerceAtMost(i2, 10) : 10);
        int i3 = i2 - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i3 >= 0 && arrayList.size() == i3) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public final Sequence<String> splitToSequence(CharSequence input, int i2) {
        Intrinsics.checkNotNullParameter(input, "input");
        StringsKt.requireNonNegativeLimit(i2);
        return SequencesKt.sequence(new C13801(input, i2, null));
    }

    public final Pattern toPattern() {
        return this.nativePattern;
    }

    public String toString() {
        String string = this.nativePattern.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
