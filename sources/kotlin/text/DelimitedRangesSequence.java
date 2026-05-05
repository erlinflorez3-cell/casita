package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
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
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:299)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<M\u0007Ӭ4\u0012\u0006\rnj?0Le^.ZS@\u000fs{:$c$\bCCU0}*\tUNog|pbŏI\u000f\u001cǝ)p<Kex\f\u0012=1\u0003GO7[pU9\u000fvF\t.5:8(\t\u0011\u001e8M(v)G[D 6X%JT\u001dM3\u001c\"\u0017N//\"֔kX<P|c@83\u0005oHt1o@\r[\u001dHd';zq ;@e9+$\u0002\u000e5YÜC\u0003E}ݘ\th54sV\u0002eN^\u0010\u0016%+}\r\f\u0002lد\u0005\"!\u001a-C\u0004sM`\u000eVy\u000b\r\u001dK2\u0012Ν+R45*l\u000e\u0017CvxYfZ\u0012nR\u000e\u000bcF\u0017S\u0004C-I\u001b\u0015Uw:GYe\u0003˿\u0011\u001e)\rEĒ]ڍ\u0012`\u001dÑ%\u0004_2i@kJ%˦[ǀq\u0004xçR6\u00125_\u007f]\u007fgч\u0019É;[A\u05faqw\u0010K\\g%\t7èUׂVHH̎ë\u001aG"}, d2 = {"\u001aj^A_0G\u001d(~\u000emu[\t6i\b,\u000b@\u007f\u0004\u0013Pq\u000eJd%Ai})5mk", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "7m_Bg", "", "AsP?g\u0010GR\u0019\u0012", "", ":h\\6g", "5dc\u001bX?M;\u0015\u000exa", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1ta?X5M7\"}zq", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKY.i(\bZ\u0015\b|(\n\u007f\u0005<S\u007f4\f@\n\u0015\u0017\u001dSq#|/D`\u0002)\u0001r'6\u0017DKt2-\u0019rjGPD<Wt6KVWx2\u0016c", "7sT?T;H`", "", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
final class DelimitedRangesSequence implements Sequence<IntRange> {
    private final Function2<CharSequence, Integer, Pair<Integer, Integer>> getNextMatch;
    private final CharSequence input;
    private final int limit;
    private final int startIndex;

    /* JADX INFO: renamed from: kotlin.text.DelimitedRangesSequence$iterator$1, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я'\u001d̉=!,\u0010\bDZc|İI\u0006>\u00116B\u000534\u0012\u0006\u0007nʑA0RnP.XSR\u000eӆ\u0002<:ӋTwS=e\u001a,\"7N\u0017mu\u0004bZ9YU\u0006^\u007fxCaU'uXƘ2\u000bvMLeok9'ұ6U8@#Py3\u0003pݙTǘz\u0007Kŷ$\u00146C~>r\u000fS\n(\u0018VV.\b6\\\u0016P\rԦxҺ>;+Ʌ\u0002DT/m4\u001dO\u0013Ob-]\u0011o(CBM4C%*Ώ\u0013қ_K\u000bӊ\n?\u000bs53KKydDfP,#:g\r\ft|؟\u0011Ōd\u0018/˃geQ`\u001c,\u0018|\u0002\u001eJ\n^\u001e5ZF-Hh^ԋ?Ϣv_HА\u001a`H\u0013\teV\u0019+\u0014A1ݶ\u001f\u0001"}, d2 = {"9nc9\\5\bb\u0019\u0012\n(\u000b|\u00103m\u00047{?m\u0013 Io\u001c*v1EY\u0007\u001e7,\u001a=MP7z>+S4", "", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u0013n\u000f\u0015wI\u0003\u0017l", "1nd;g,K", "", "5dc\u0010b<Gb\u0019\f", "u(8", "Adc\u0010b<Gb\u0019\f", "uH\u0018#", "1ta?X5MA(z\bm\u0010\u0006\b/x", "5dc\u0010h9KS\"\u000ehm(\n\u0018\u0013n~(\u000f", "Adc\u0010h9KS\"\u000ehm(\n\u0018\u0013n~(\u000f", "<dgA<;>[", "5dc\u001bX?M7(~\u0003", "u(;8b;EW\"H\bZ5~\t=/c1\u000b-| \u0019GE", "Adc\u001bX?M7(~\u0003", "uKZ<g3B\\b\fvg.|\u0017xI\t7h<\n\u0019\u0017\u001d3~", "<dgAF,:`\u0017\u0002^g+|\u001c", "5dc\u001bX?MA\u0019z\b\\/`\u0012.e\u0013", "Adc\u001bX?MA\u0019z\b\\/`\u0012.e\u0013", "<dgAF;:b\u0019", "5dc\u001bX?MA(z\n^", "Adc\u001bX?MA(z\n^", "1`[0A,Qb", "", "6`b\u001bX?M", "", "<dgA", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Iterator<IntRange>, KMappedMarker {
        private int counter;
        private int currentStartIndex;
        private IntRange nextItem;
        private int nextSearchIndex;
        private int nextState = -1;

        AnonymousClass1() {
            int iCoerceIn = RangesKt.coerceIn(DelimitedRangesSequence.this.startIndex, 0, DelimitedRangesSequence.this.input.length());
            this.currentStartIndex = iCoerceIn;
            this.nextSearchIndex = iCoerceIn;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void calcNext() {
            /*
                r6 = this;
                int r0 = r6.nextSearchIndex
                r4 = 0
                if (r0 >= 0) goto Lb
                r6.nextState = r4
                r0 = 0
                r6.nextItem = r0
            La:
                return
            Lb:
                kotlin.text.DelimitedRangesSequence r0 = kotlin.text.DelimitedRangesSequence.this
                int r0 = kotlin.text.DelimitedRangesSequence.access$getLimit$p(r0)
                r5 = -1
                r3 = 1
                if (r0 <= 0) goto L22
                int r1 = r6.counter
                int r1 = r1 + r3
                r6.counter = r1
                kotlin.text.DelimitedRangesSequence r0 = kotlin.text.DelimitedRangesSequence.this
                int r0 = kotlin.text.DelimitedRangesSequence.access$getLimit$p(r0)
                if (r1 >= r0) goto L30
            L22:
                int r1 = r6.nextSearchIndex
                kotlin.text.DelimitedRangesSequence r0 = kotlin.text.DelimitedRangesSequence.this
                java.lang.CharSequence r0 = kotlin.text.DelimitedRangesSequence.access$getInput$p(r0)
                int r0 = r0.length()
                if (r1 <= r0) goto L48
            L30:
                kotlin.ranges.IntRange r2 = new kotlin.ranges.IntRange
                int r1 = r6.currentStartIndex
                kotlin.text.DelimitedRangesSequence r0 = kotlin.text.DelimitedRangesSequence.this
                java.lang.CharSequence r0 = kotlin.text.DelimitedRangesSequence.access$getInput$p(r0)
                int r0 = kotlin.text.StringsKt.getLastIndex(r0)
                r2.<init>(r1, r0)
                r6.nextItem = r2
                r6.nextSearchIndex = r5
            L45:
                r6.nextState = r3
                goto La
            L48:
                kotlin.text.DelimitedRangesSequence r0 = kotlin.text.DelimitedRangesSequence.this
                kotlin.jvm.functions.Function2 r2 = kotlin.text.DelimitedRangesSequence.access$getGetNextMatch$p(r0)
                kotlin.text.DelimitedRangesSequence r0 = kotlin.text.DelimitedRangesSequence.this
                java.lang.CharSequence r1 = kotlin.text.DelimitedRangesSequence.access$getInput$p(r0)
                int r0 = r6.nextSearchIndex
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object r1 = r2.invoke(r1, r0)
                kotlin.Pair r1 = (kotlin.Pair) r1
                if (r1 != 0) goto L78
                kotlin.ranges.IntRange r2 = new kotlin.ranges.IntRange
                int r1 = r6.currentStartIndex
                kotlin.text.DelimitedRangesSequence r0 = kotlin.text.DelimitedRangesSequence.this
                java.lang.CharSequence r0 = kotlin.text.DelimitedRangesSequence.access$getInput$p(r0)
                int r0 = kotlin.text.StringsKt.getLastIndex(r0)
                r2.<init>(r1, r0)
                r6.nextItem = r2
                r6.nextSearchIndex = r5
                goto L45
            L78:
                java.lang.Object r0 = r1.component1()
                java.lang.Number r0 = (java.lang.Number) r0
                int r2 = r0.intValue()
                java.lang.Object r0 = r1.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r1 = r0.intValue()
                int r0 = r6.currentStartIndex
                kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r0, r2)
                r6.nextItem = r0
                int r2 = r2 + r1
                r6.currentStartIndex = r2
                if (r1 != 0) goto L9a
                r4 = r3
            L9a:
                int r2 = r2 + r4
                r6.nextSearchIndex = r2
                goto L45
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.DelimitedRangesSequence.AnonymousClass1.calcNext():void");
        }

        public final int getCounter() {
            return this.counter;
        }

        public final int getCurrentStartIndex() {
            return this.currentStartIndex;
        }

        public final IntRange getNextItem() {
            return this.nextItem;
        }

        public final int getNextSearchIndex() {
            return this.nextSearchIndex;
        }

        public final int getNextState() {
            return this.nextState;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState == -1) {
                calcNext();
            }
            return this.nextState == 1;
        }

        @Override // java.util.Iterator
        public IntRange next() {
            if (this.nextState == -1) {
                calcNext();
            }
            if (this.nextState == 0) {
                throw new NoSuchElementException();
            }
            IntRange intRange = this.nextItem;
            Intrinsics.checkNotNull(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.nextItem = null;
            this.nextState = -1;
            return intRange;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCounter(int i2) {
            this.counter = i2;
        }

        public final void setCurrentStartIndex(int i2) {
            this.currentStartIndex = i2;
        }

        public final void setNextItem(IntRange intRange) {
            this.nextItem = intRange;
        }

        public final void setNextSearchIndex(int i2) {
            this.nextSearchIndex = i2;
        }

        public final void setNextState(int i2) {
            this.nextState = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DelimitedRangesSequence(CharSequence input, int i2, int i3, Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.input = input;
        this.startIndex = i2;
        this.limit = i3;
        this.getNextMatch = getNextMatch;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<IntRange> iterator() {
        return new AnonymousClass1();
    }
}
