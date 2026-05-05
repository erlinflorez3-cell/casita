package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: AccessibilityIterators.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u000bGيFé^B-!d\u0017x\tin>6K&K¯VS8\u000fӯ\u007f<"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\L", "", "u(E", "\u000fabAe(<b\b~\u000em\u001a|\u000b7e\t7_O\u0001$\u0013Vy\u001b", "\u0011gP?T*MS&mzq;j\t1m\u007f1\u000b$\u0010\u0017$C~\u0018I", "\u001ah]2G,Qb\u0007~|f,\u0006\u0018\u0013t\u007f5wO\u000b$", "\u001e`V2G,Qb\u0007~|f,\u0006\u0018\u0013t\u007f5wO\u000b$", "\u001e`a.Z9:^\u001cmzq;j\t1m\u007f1\u000b$\u0010\u0017$C~\u0018I", "\"dgAF,@[\u0019\b\nB;|\u0016+t\n5", "%na1G,Qb\u0007~|f,\u0006\u0018\u0013t\u007f5wO\u000b$", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AccessibilityIterators {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004O\u00198é6B\r(4\u0012}\u0007lOOӄtev-\u001bc8\u000f\u0004}J#\n%\"GIW2}P\f\u0016r0w|Nr\rY\u000e4\u0017)n:Kmx\f\u0015UVֈnЀݏMsE;f\u0014d\u0004ڼ6'ف}\u0004"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0016G_]\u001a\\Tz=\u001d!>\u001dN8\t\u0014cNy", "", "4n[9b>B\\\u001b", "", "1ta?X5M", "", ">qT0X+B\\\u001b", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface TextSegmentIterator {
        int[] following(int i2);

        int[] preceding(int i2);
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLcz\u0004I\u0006>\u001e6Ȑ\u0007\":\u001e\u007f\u0007lnA0RkP.XS2\u000fy{<řaI\bّkUH|b\fҊRgun\u0013r\u0019L'\b,w\u0019.yY\u0007g*\u000f`M CAY\b=gk;8M.@/Py3\u000fJ.V\u0013\u000fzqOR&\u0001L~;j\r{\u0007pŊ\b̧$\u0001&ձ8fDK\u0005]h3yɊ\u0016ŌR3gܞ\u0015O\u0013Kb--xg%9Hˣ9$"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0003DZ]9XP\u0002,\u0014%i{N-\u0015\u0005bP\b}DD\u001b\u00176VW", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0016G_]\u001a\\Tz=\u001d!>\u001dN8\t\u0014cNy", "u(E", "AdV:X5M", "", "BdgA", "", "5dc!X?M", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc!X?M", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u001fT5@S", "AsP?g", "", "3mS", "7mXA\\(EW.~", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static abstract class AbstractTextSegmentIterator implements TextSegmentIterator {
        public static final int $stable = 8;
        private final int[] segment = new int[2];
        protected String text;

        protected final String getText() {
            String str = this.text;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("text");
            return null;
        }

        protected final void setText(String str) {
            this.text = str;
        }

        public void initialize(String str) {
            setText(str);
        }

        protected final int[] getRange(int i2, int i3) {
            if (i2 >= 0 && i3 >= 0 && i2 != i3) {
                int[] iArr = this.segment;
                iArr[0] = i2;
                iArr[1] = i3;
                return iArr;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjGCL͜P.`Y2şs{B$cҕyCIa\"}(\u000bUc}˧\rY\u000b\u000bq\u000e>\u0015\b+9OU\ta \u000fJB\u001e@ݯQoK;)\u0005D\n8487(\u000b1\u001e8O(v)K\u0012 Z>NyRR;W5\u001e \u0011V /*#{\u0017DVyu:]-3mPN?_^}\u0014\r\u000fd5\u001b\u000fc4*n=e\u00193Z\u001b\u0007\u0001c\u0006\u0017\u0010}K\b\u0001'U/ ֘\u0004͏\\\u007f\u001cƃ۩S\u001d"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0005JH[(ZarJ\u0003\u0012m\u001d<+\u000f\rYJ3RS7,\u0004;S\u000f\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0003DZ]9XP\u0002,\u0014%i{N-\u0015\u0005bP\b}DD\u001b\u00176VW", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "uKY.i(\bc(\u0003\u0002(\u0013\u0007\u0007+l\u007f}?1", "7l_9", "\u001aiPCTuMS,\u000eD;9|\u00055I\u000f(\t<\u0010!$\u001d", "4n[9b>B\\\u001b", "", "1ta?X5M", "", "7mXA\\(EW.~", "", "BdgA", "", "=m;<V(ESv\u0002vg.|\b", ">qT0X+B\\\u001b", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {
        private static CharacterTextSegmentIterator instance = null;
        private BreakIterator impl;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ CharacterTextSegmentIterator(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
            this(locale);
        }

        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑ?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004a(\u0001:\t}P\u0018k|Nr\u000bq\u0014V$\u0007kDKkw\f\u0014e˳NņC3Uڎ\u07b2=f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0005JH[(ZarJ\u0003\u0012m\u001d<+\u000f\rYJ3RS7,\u0004;S\u000fyF\u000b\u0014!\n>nzK,", "", "u(E", "7mbAT5<S", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0005JH[(ZarJ\u0003\u0012m\u001d<+\u000f\rYJ3RS7,\u0004;S\u000f\u0011", "5dc\u0016a:MO\"|z", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final CharacterTextSegmentIterator getInstance(Locale locale) {
                if (CharacterTextSegmentIterator.instance == null) {
                    CharacterTextSegmentIterator.instance = new CharacterTextSegmentIterator(locale, null);
                }
                CharacterTextSegmentIterator characterTextSegmentIterator = CharacterTextSegmentIterator.instance;
                Intrinsics.checkNotNull(characterTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                return characterTextSegmentIterator;
            }
        }

        private CharacterTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i2) {
            int length = getText().length();
            if (length <= 0 || i2 >= length) {
                return null;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i2)) {
                    BreakIterator breakIterator2 = this.impl;
                    if (breakIterator2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator2 = null;
                    }
                    i2 = breakIterator2.following(i2);
                } else {
                    BreakIterator breakIterator3 = this.impl;
                    if (breakIterator3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator3 = null;
                    }
                    int iFollowing = breakIterator3.following(i2);
                    if (iFollowing == -1) {
                        return null;
                    }
                    return getRange(i2, iFollowing);
                }
            } while (i2 != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i2) {
            int length = getText().length();
            if (length <= 0 || i2 <= 0) {
                return null;
            }
            if (i2 > length) {
                i2 = length;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                if (!breakIterator.isBoundary(i2)) {
                    BreakIterator breakIterator2 = this.impl;
                    if (breakIterator2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator2 = null;
                    }
                    i2 = breakIterator2.preceding(i2);
                } else {
                    BreakIterator breakIterator3 = this.impl;
                    if (breakIterator3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("impl");
                        breakIterator3 = null;
                    }
                    int iPreceding = breakIterator3.preceding(i2);
                    if (iPreceding == -1) {
                        return null;
                    }
                    return getRange(iPreceding, i2);
                }
            } while (i2 != -1);
            return null;
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getCharacterInstance(locale);
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007fјnjGCL͜P.`Y2şs{B$cҕyCIa\"Ԃ*\t]WogtO`\u0010YƤ$*)jZH\u000ewqR\u001c8B\u007fCAM\b=gaҽ:\u0005.4jH\b\n\u0019\u001c@G>|+GY\u0013*0nx\u0001fU[\u0013#*\u0006l*1\"jrf6vx$Nw1\u0011vZNUm`\u0001[\u001c^TU\u0015=af9NGM\u0015Sa3\u000b`jW\u0003my\u0004\u0005155<as\u0006D\t\u0004\"$CO;e9&%\u0013_r$'YY\u0014O^\u000e@w)|S<L\u001e\u0014:`0C\u0019\u0015\u000e>7\u0003yk@~\n%VP\u0007o9/%.7\u0002ݐGƻUaCϊ״;\u0011"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0019QYM\u001b\\e\u0002+\u0014\u0014b\u000eW:p\u0014YN }NDt", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0003DZ]9XP\u0002,\u0014%i{N-\u0015\u0005bP\b}DD\u001b\u00176VW", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "uKY.i(\bc(\u0003\u0002(\u0013\u0007\u0007+l\u007f}?1", "7l_9", "\u001aiPCTuMS,\u000eD;9|\u00055I\u000f(\t<\u0010!$\u001d", "4n[9b>B\\\u001b", "", "1ta?X5M", "", "7mXA\\(EW.~", "", "BdgA", "", "7r4;W\tHc\"}vk@", "", "7mS2k", "7r;2g;>`\u0003\fYb.\u0001\u0018", "7rBAT9M0#\u000f\u0004](\n\u001d", "=m;<V(ESv\u0002vg.|\b", ">qT0X+B\\\u001b", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class WordTextSegmentIterator extends AbstractTextSegmentIterator {
        private static WordTextSegmentIterator instance = null;
        private BreakIterator impl;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ WordTextSegmentIterator(Locale locale, DefaultConstructorMarker defaultConstructorMarker) {
            this(locale);
        }

        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑ?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\u0004a(\u0001:\t}P\u0018k|Nr\u000bq\u0014V$\u0007kDKkw\f\u0014e˳NņC3Uڎ\u07b2=f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0019QYM\u001b\\e\u0002+\u0014\u0014b\u000eW:p\u0014YN }ND]e6Q\r7q\u0005\u0016\u001fc", "", "u(E", "7mbAT5<S", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0019QYM\u001b\\e\u0002+\u0014\u0014b\u000eW:p\u0014YN }NDt", "5dc\u0016a:MO\"|z", ":nR._,", "\u001aiPCTuNb\u001d\u0006DE6z\u00056eU", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final WordTextSegmentIterator getInstance(Locale locale) {
                if (WordTextSegmentIterator.instance == null) {
                    WordTextSegmentIterator.instance = new WordTextSegmentIterator(locale, null);
                }
                WordTextSegmentIterator wordTextSegmentIterator = WordTextSegmentIterator.instance;
                Intrinsics.checkNotNull(wordTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                return wordTextSegmentIterator;
            }
        }

        private WordTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getWordInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i2) {
            if (getText().length() <= 0 || i2 >= getText().length()) {
                return null;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            while (!isLetterOrDigit(i2) && !isStartBoundary(i2)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                i2 = breakIterator.following(i2);
                if (i2 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator2 = null;
            }
            int iFollowing = breakIterator2.following(i2);
            if (iFollowing == -1 || !isEndBoundary(iFollowing)) {
                return null;
            }
            return getRange(i2, iFollowing);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i2) {
            int length = getText().length();
            if (length <= 0 || i2 <= 0) {
                return null;
            }
            if (i2 > length) {
                i2 = length;
            }
            while (i2 > 0 && !isLetterOrDigit(i2 - 1) && !isEndBoundary(i2)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("impl");
                    breakIterator = null;
                }
                i2 = breakIterator.preceding(i2);
                if (i2 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("impl");
                breakIterator2 = null;
            }
            int iPreceding = breakIterator2.preceding(i2);
            if (iPreceding == -1 || !isStartBoundary(iPreceding)) {
                return null;
            }
            return getRange(iPreceding, i2);
        }

        private final boolean isStartBoundary(int i2) {
            return isLetterOrDigit(i2) && (i2 == 0 || !isLetterOrDigit(i2 - 1));
        }

        private final boolean isEndBoundary(int i2) {
            return i2 > 0 && isLetterOrDigit(i2 + (-1)) && (i2 == getText().length() || !isLetterOrDigit(i2));
        }

        private final boolean isLetterOrDigit(int i2) {
            if (i2 < 0 || i2 >= getText().length()) {
                return false;
            }
            return Character.isLetterOrDigit(getText().codePointAt(i2));
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLcz\u0004I\u0006>\u001e6Ȑ\u0007\":\u0018\u007fјnjG9LeN1XX@ş\n\u0006d$\n#*BE\u0016\u001f\u0004\"\u07beSNug7Zh\f[\u0011\u001c\u0015'l\\Mc{u\u0012=6\t\u0004\bA[tU9\u000fzf\t.9:8(\tG\u001arV\u001e~\u0013Cy\u0012B4NwRR;QK\u001aZ\u0016L)\u0019 rf|8xpk=G#1m\tbϴc;"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0012CYJ.iN}@\u0003\u0012m\u001d<+\u000f\rYJ3RS7,\u0004;S\u000f\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0003DZ]9XP\u0002,\u0014%i{N-\u0015\u0005bP\b}DD\u001b\u00176VW", "u(E", "4n[9b>B\\\u001b", "", "1ta?X5M", "", "7r4;W\tHc\"}vk@", "", "7mS2k", "7rBAT9M0#\u000f\u0004](\n\u001d", ">qT0X+B\\\u001b", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private static ParagraphTextSegmentIterator instance = null;

        public /* synthetic */ ParagraphTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{|(i'\nCiWj\f0\ngP}f\u001dL1ŒOǇ\n\u0016\u0001̓\u0082MY"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0012CYJ.iN}@\u0003\u0012m\u001d<+\u000f\rYJ3RS7,\u0004;S\u000fyF\u000b\u0014!\n>nzK,", "", "u(E", "7mbAT5<S", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0012CYJ.iN}@\u0003\u0012m\u001d<+\u000f\rYJ3RS7,\u0004;S\u000f\u0011", "5dc\u0016a:MO\"|z", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final ParagraphTextSegmentIterator getInstance() {
                if (ParagraphTextSegmentIterator.instance == null) {
                    ParagraphTextSegmentIterator.instance = new ParagraphTextSegmentIterator(null);
                }
                ParagraphTextSegmentIterator paragraphTextSegmentIterator = ParagraphTextSegmentIterator.instance;
                Intrinsics.checkNotNull(paragraphTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                return paragraphTextSegmentIterator;
            }
        }

        private ParagraphTextSegmentIterator() {
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i2) {
            int length = getText().length();
            if (length <= 0 || i2 >= length) {
                return null;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            while (i2 < length && getText().charAt(i2) == '\n' && !isStartBoundary(i2)) {
                i2++;
            }
            if (i2 >= length) {
                return null;
            }
            int i3 = i2 + 1;
            while (i3 < length && !isEndBoundary(i3)) {
                i3++;
            }
            return getRange(i2, i3);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i2) {
            int length = getText().length();
            if (length <= 0 || i2 <= 0) {
                return null;
            }
            if (i2 > length) {
                i2 = length;
            }
            while (i2 > 0 && getText().charAt(i2 - 1) == '\n' && !isEndBoundary(i2)) {
                i2--;
            }
            if (i2 <= 0) {
                return null;
            }
            int i3 = i2 - 1;
            while (i3 > 0 && !isStartBoundary(i3)) {
                i3--;
            }
            return getRange(i3, i2);
        }

        private final boolean isStartBoundary(int i2) {
            return getText().charAt(i2) != '\n' && (i2 == 0 || getText().charAt(i2 - 1) == '\n');
        }

        private final boolean isEndBoundary(int i2) {
            return i2 > 0 && getText().charAt(i2 + (-1)) != '\n' && (i2 == getText().length() || getText().charAt(i2) == '\n');
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\":%\u007fјnjG6LeN/ZS@\u000fsڔ<$i$yّCU(\n*\tUOml\u0005Ϻx\u001bs\u000f4\u00151i<\nZ~]ܫ\u00132Po\bC[rU;vsd\tP60=\u0012\u0005/ p\\X\r\tJc\f@6ptHZ%M3 B\nL)\u0019\u001e\u000bq\u00156\u0011\u0001kEG#1urR5lH|{\u001bvX5\u000e\u000faL-\tGC$=U\u0019\u0006\u0001_o\u0007MvU\u0005\u0017-m?\u001a\u007fe7p\u007fB\u0017\u0002̀9ǁv&dӤŒd\u001d"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u000eKUN\u001b\\e\u0002+\u0014\u0014b\u000eW:p\u0014YN }NDt", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0003DZ]9XP\u0002,\u0014%i{N-\u0015\u0005bP\b}DD\u001b\u00176VW", "u(E", ":`h<h;+S'\u000f\u0002m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "4n[9b>B\\\u001b", "", "1ta?X5M", "", "5dc\u0019\\5>3\u0018\u0001zB5{\tB", ":h]2A<FP\u0019\f", "2ha2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#j Ew\u001d?MB*kG-sln9\u0005r0X\u007f|", "7mXA\\(EW.~", "", "BdgA", "", ">qT0X+B\\\u001b", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class LineTextSegmentIterator extends AbstractTextSegmentIterator {
        private static LineTextSegmentIterator lineInstance = null;
        private TextLayoutResult layoutResult;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        public /* synthetic */ LineTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nj?0JͣIDɟ\u0004*=j<9*[ҸuCIUb\u00020\u000fgN\u0016l?Vh\f[\u000f4\u0018O̖.֒Yxe܈_>PrW3{q\u0014ʣbҽ:\u0005(݅rF\b\t\u0019\u001c@G>{QŒWë\u00160H\u0081ĖV\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u000eKUN\u001b\\e\u0002+\u0014\u0014b\u000eW:p\u0014YN }ND]e6Q\r7q\u0005\u0016\u001fc", "", "u(E", "\u0012ha2V;B]\"^\u0004]", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#j Ew\u001d?MB*kG-sln9\u0005r0X\u007f|", "\u0012ha2V;B]\"l\nZ9\f", ":h]2<5Lb\u0015\bx^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u000eKUN\u001b\\e\u0002+\u0014\u0014b\u000eW:p\u0014YN }NDt", "5dc\u0016a:MO\"|z", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final LineTextSegmentIterator getInstance() {
                if (LineTextSegmentIterator.lineInstance == null) {
                    LineTextSegmentIterator.lineInstance = new LineTextSegmentIterator(null);
                }
                LineTextSegmentIterator lineTextSegmentIterator = LineTextSegmentIterator.lineInstance;
                Intrinsics.checkNotNull(lineTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                return lineTextSegmentIterator;
            }
        }

        private LineTextSegmentIterator() {
        }

        public final void initialize(String str, TextLayoutResult textLayoutResult) {
            setText(str);
            this.layoutResult = textLayoutResult;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i2) {
            int lineForOffset;
            if (getText().length() <= 0 || i2 >= getText().length()) {
                return null;
            }
            if (i2 < 0) {
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult = null;
                }
                lineForOffset = textLayoutResult.getLineForOffset(0);
            } else {
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult2 = null;
                }
                lineForOffset = textLayoutResult2.getLineForOffset(i2);
                if (getLineEdgeIndex(lineForOffset, DirectionStart) != i2) {
                    lineForOffset++;
                }
            }
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult3 = null;
            }
            if (lineForOffset >= textLayoutResult3.getLineCount()) {
                return null;
            }
            return getRange(getLineEdgeIndex(lineForOffset, DirectionStart), getLineEdgeIndex(lineForOffset, DirectionEnd) + 1);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i2) {
            int lineForOffset;
            if (getText().length() <= 0 || i2 <= 0) {
                return null;
            }
            if (i2 > getText().length()) {
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult = null;
                }
                lineForOffset = textLayoutResult.getLineForOffset(getText().length());
            } else {
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult2 = null;
                }
                lineForOffset = textLayoutResult2.getLineForOffset(i2);
                if (getLineEdgeIndex(lineForOffset, DirectionEnd) + 1 != i2) {
                    lineForOffset--;
                }
            }
            if (lineForOffset < 0) {
                return null;
            }
            return getRange(getLineEdgeIndex(lineForOffset, DirectionStart), getLineEdgeIndex(lineForOffset, DirectionEnd) + 1);
        }

        private final int getLineEdgeIndex(int i2, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(i2);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult3 = null;
            }
            if (resolvedTextDirection != textLayoutResult3.getParagraphDirection(lineStart)) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(i2);
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.getLineEnd$default(textLayoutResult5, i2, false, 2, null) - 1;
        }
    }

    /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`f2şs{B*c$wDCU0}*ޛWNugvϺb\u000bQ\u001b\u000e\u0016~k2Nkތ{&?2pnw2a0B?`ҽ:\u0005.2jH\b\f\u0019\u001c@G>~+GY\u0015*0nz\u0001fUc\u0013%*\u0006l*1\"jsf6vv\u000e>=0\u001bip\\m_x\u0019[\u001c^TU\u001d'e,<X7c'UW\u0011\bj[m\u0005ouK\b\u0001'U/\u0012\u0004eIp\u0002*\u0014YW=a\u0001/t\u0005\u007fjR;{[qLh\u000eVyQԋ9ʀ\b\u000e\u000eΩ\u0019:;\u001d~\b<7KɄ\u007fĖT\u0002fۍP\u0007o;/%.9\u0002ݐ'ƻUaCϊ״;\u0011"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0012CNN\u001b\\e\u0002+\u0014\u0014b\u000eW:p\u0014YN }NDt", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0003DZ]9XP\u0002,\u0014%i{N-\u0015\u0005bP\b}DD\u001b\u00176VW", "u(E", ":`h<h;+S'\u000f\u0002m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ$u3\u001ej", "Bd\\=E,<b", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "4n[9b>B\\\u001b", "", "1ta?X5M", "", "5dc\u0019\\5>3\u0018\u0001zB5{\tB", ":h]2A<FP\u0019\f", "2ha2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#j Ew\u001d?MB*kG-sln9\u0005r0X\u007f|", "7mXA\\(EW.~", "", "BdgA", "", ">qT0X+B\\\u001b", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class PageTextSegmentIterator extends AbstractTextSegmentIterator {
        private static PageTextSegmentIterator pageInstance = null;
        private TextLayoutResult layoutResult;
        private SemanticsNode node;
        private Rect tempRect;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        public /* synthetic */ PageTextSegmentIterator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: compiled from: AccessibilityIterators.android.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nj?0JͣIDɟ\u0004*=j<9*[ҸuCIUb\u00020\u000fgN\u0016l?Vh\f[\u000f4\u0018O̖.֒Yxe܈_>PrW3{q\u0014ʣbҽ:\u0005(݅rF\b\t\u0019\u001c@G>{QŒWë\u00160H\u0081ĖV\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0012CNN\u001b\\e\u0002+\u0014\u0014b\u000eW:p\u0014YN }ND]e6Q\r7q\u0005\u0016\u001fc", "", "u(E", "\u0012ha2V;B]\"^\u0004]", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u001cK\u000b,5#j Ew\u001d?MB*kG-sln9\u0005r0X\u007f|", "\u0012ha2V;B]\"l\nZ9\f", ">`V2<5Lb\u0015\bx^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011W{ E{\u001a+QJ?zH\u0002$hn5\u0016m9\\5\u0012CNN\u001b\\e\u0002+\u0014\u0014b\u000eW:p\u0014YN }NDt", "5dc\u0016a:MO\"|z", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final PageTextSegmentIterator getInstance() {
                if (PageTextSegmentIterator.pageInstance == null) {
                    PageTextSegmentIterator.pageInstance = new PageTextSegmentIterator(null);
                }
                PageTextSegmentIterator pageTextSegmentIterator = PageTextSegmentIterator.pageInstance;
                Intrinsics.checkNotNull(pageTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                return pageTextSegmentIterator;
            }
        }

        private PageTextSegmentIterator() {
            this.tempRect = new Rect();
        }

        public final void initialize(String str, TextLayoutResult textLayoutResult, SemanticsNode semanticsNode) {
            setText(str);
            this.layoutResult = textLayoutResult;
            this.node = semanticsNode;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i2) {
            int lineCount;
            TextLayoutResult textLayoutResult = null;
            if (getText().length() <= 0 || i2 >= getText().length()) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("node");
                    semanticsNode = null;
                }
                int iRound = Math.round(semanticsNode.getBoundsInRoot().getHeight());
                int iCoerceAtLeast = RangesKt.coerceAtLeast(0, i2);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(iCoerceAtLeast);
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult3 = null;
                }
                float lineTop = textLayoutResult3.getLineTop(lineForOffset) + iRound;
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult4 = null;
                }
                TextLayoutResult textLayoutResult5 = this.layoutResult;
                if (textLayoutResult5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult5 = null;
                }
                if (lineTop < textLayoutResult4.getLineTop(textLayoutResult5.getLineCount() - 1)) {
                    TextLayoutResult textLayoutResult6 = this.layoutResult;
                    if (textLayoutResult6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult6;
                    }
                    lineCount = textLayoutResult.getLineForVerticalPosition(lineTop);
                } else {
                    TextLayoutResult textLayoutResult7 = this.layoutResult;
                    if (textLayoutResult7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult7;
                    }
                    lineCount = textLayoutResult.getLineCount();
                }
                return getRange(iCoerceAtLeast, getLineEdgeIndex(lineCount - 1, DirectionEnd) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i2) {
            int lineForVerticalPosition;
            TextLayoutResult textLayoutResult = null;
            if (getText().length() <= 0 || i2 <= 0) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("node");
                    semanticsNode = null;
                }
                int iRound = Math.round(semanticsNode.getBoundsInRoot().getHeight());
                int iCoerceAtMost = RangesKt.coerceAtMost(getText().length(), i2);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult2 = null;
                }
                int lineForOffset = textLayoutResult2.getLineForOffset(iCoerceAtMost);
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    textLayoutResult3 = null;
                }
                float lineTop = textLayoutResult3.getLineTop(lineForOffset) - iRound;
                if (lineTop > 0.0f) {
                    TextLayoutResult textLayoutResult4 = this.layoutResult;
                    if (textLayoutResult4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                    } else {
                        textLayoutResult = textLayoutResult4;
                    }
                    lineForVerticalPosition = textLayoutResult.getLineForVerticalPosition(lineTop);
                } else {
                    lineForVerticalPosition = 0;
                }
                if (iCoerceAtMost == getText().length() && lineForVerticalPosition < lineForOffset) {
                    lineForVerticalPosition++;
                }
                return getRange(getLineEdgeIndex(lineForVerticalPosition, DirectionStart), iCoerceAtMost);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        private final int getLineEdgeIndex(int i2, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(i2);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult3 = null;
            }
            if (resolvedTextDirection != textLayoutResult3.getParagraphDirection(lineStart)) {
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (textLayoutResult4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(i2);
            }
            TextLayoutResult textLayoutResult5 = this.layoutResult;
            if (textLayoutResult5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                textLayoutResult5 = null;
            }
            return TextLayoutResult.getLineEnd$default(textLayoutResult5, i2, false, 2, null) - 1;
        }
    }
}
