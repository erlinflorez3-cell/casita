package com.google.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final Strategy strategy;
    private final CharMatcher trimmer;

    /* JADX INFO: renamed from: com.google.common.base.Splitter$1 */
    class AnonymousClass1 implements Strategy {

        /* JADX INFO: renamed from: com.google.common.base.Splitter$1$1 */
        class C01861 extends SplittingIterator {
            C01861(Splitter splitter, CharSequence toSplit) {
                super(splitter, toSplit);
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            int separatorEnd(int separatorPosition) {
                return separatorPosition + 1;
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            int separatorStart(int start) {
                return val$separatorMatcher.indexIn(this.toSplit, start);
            }
        }

        AnonymousClass1() {
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(Splitter splitter, final CharSequence toSplit) {
            return new SplittingIterator(splitter, toSplit) { // from class: com.google.common.base.Splitter.1.1
                C01861(Splitter splitter2, final CharSequence toSplit2) {
                    super(splitter2, toSplit2);
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                int separatorEnd(int separatorPosition) {
                    return separatorPosition + 1;
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                int separatorStart(int start) {
                    return val$separatorMatcher.indexIn(this.toSplit, start);
                }
            };
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.Splitter$2 */
    class AnonymousClass2 implements Strategy {
        final /* synthetic */ String val$separator;

        /* JADX INFO: renamed from: com.google.common.base.Splitter$2$1 */
        class AnonymousClass1 extends SplittingIterator {
            AnonymousClass1(Splitter splitter, CharSequence toSplit) {
                super(splitter, toSplit);
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int separatorPosition) {
                return separatorPosition + val$separator.length();
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0026, code lost:
            
                r6 = r6 + 1;
             */
            @Override // com.google.common.base.Splitter.SplittingIterator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public int separatorStart(int r6) {
                /*
                    r5 = this;
                    com.google.common.base.Splitter$2 r0 = com.google.common.base.Splitter.AnonymousClass2.this
                    java.lang.String r0 = r1
                    int r4 = r0.length()
                    java.lang.CharSequence r0 = r5.toSplit
                    int r3 = r0.length()
                    int r3 = r3 - r4
                Lf:
                    if (r6 > r3) goto L2d
                    r2 = 0
                L12:
                    if (r2 >= r4) goto L2c
                    java.lang.CharSequence r1 = r5.toSplit
                    int r0 = r2 + r6
                    char r1 = r1.charAt(r0)
                    com.google.common.base.Splitter$2 r0 = com.google.common.base.Splitter.AnonymousClass2.this
                    java.lang.String r0 = r1
                    char r0 = r0.charAt(r2)
                    if (r1 == r0) goto L29
                    int r6 = r6 + 1
                    goto Lf
                L29:
                    int r2 = r2 + 1
                    goto L12
                L2c:
                    return r6
                L2d:
                    r0 = -1
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Splitter.AnonymousClass2.AnonymousClass1.separatorStart(int):int");
            }
        }

        AnonymousClass2(final String val$separator) {
            val$separator = val$separator;
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(Splitter splitter, CharSequence toSplit) {
            return new SplittingIterator(splitter, toSplit) { // from class: com.google.common.base.Splitter.2.1
                AnonymousClass1(Splitter splitter2, CharSequence toSplit2) {
                    super(splitter2, toSplit2);
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorEnd(int separatorPosition) {
                    return separatorPosition + val$separator.length();
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorStart(int v2) {
                    /*
                        this = this;
                        com.google.common.base.Splitter$2 r0 = com.google.common.base.Splitter.AnonymousClass2.this
                        java.lang.String r0 = r1
                        int r4 = r0.length()
                        java.lang.CharSequence r0 = r5.toSplit
                        int r3 = r0.length()
                        int r3 = r3 - r4
                    Lf:
                        if (r6 > r3) goto L2d
                        r2 = 0
                    L12:
                        if (r2 >= r4) goto L2c
                        java.lang.CharSequence r1 = r5.toSplit
                        int r0 = r2 + r6
                        char r1 = r1.charAt(r0)
                        com.google.common.base.Splitter$2 r0 = com.google.common.base.Splitter.AnonymousClass2.this
                        java.lang.String r0 = r1
                        char r0 = r0.charAt(r2)
                        if (r1 == r0) goto L29
                        int r6 = r6 + 1
                        goto Lf
                    L29:
                        int r2 = r2 + 1
                        goto L12
                    L2c:
                        return r6
                    L2d:
                        r0 = -1
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Splitter.AnonymousClass2.AnonymousClass1.separatorStart(int):int");
                }
            };
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.Splitter$3 */
    class AnonymousClass3 implements Strategy {

        /* JADX INFO: renamed from: com.google.common.base.Splitter$3$1 */
        class AnonymousClass1 extends SplittingIterator {
            final /* synthetic */ CommonMatcher val$matcher;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(final AnonymousClass3 this$0, Splitter splitter, CharSequence toSplit, final CommonMatcher val$matcher) {
                super(splitter, toSplit);
                val$matcher = val$matcher;
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int separatorPosition) {
                return val$matcher.end();
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorStart(int start) {
                if (val$matcher.find(start)) {
                    return val$matcher.start();
                }
                return -1;
            }
        }

        AnonymousClass3() {
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(final Splitter splitter, CharSequence toSplit) {
            return new SplittingIterator(this, splitter, toSplit) { // from class: com.google.common.base.Splitter.3.1
                final /* synthetic */ CommonMatcher val$matcher;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AnonymousClass3 this, final Splitter splitter2, CharSequence toSplit2, final CommonMatcher val$matcher) {
                    super(splitter2, toSplit2);
                    val$matcher = val$matcher;
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorEnd(int separatorPosition) {
                    return val$matcher.end();
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorStart(int start) {
                    if (val$matcher.find(start)) {
                        return val$matcher.start();
                    }
                    return -1;
                }
            };
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.Splitter$4 */
    class AnonymousClass4 implements Strategy {
        final /* synthetic */ int val$length;

        /* JADX INFO: renamed from: com.google.common.base.Splitter$4$1 */
        class AnonymousClass1 extends SplittingIterator {
            AnonymousClass1(Splitter splitter, CharSequence toSplit) {
                super(splitter, toSplit);
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int separatorPosition) {
                return separatorPosition;
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorStart(int start) {
                int i2 = start + val$length;
                if (i2 < this.toSplit.length()) {
                    return i2;
                }
                return -1;
            }
        }

        AnonymousClass4(final int val$length) {
            val$length = val$length;
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(final Splitter splitter, CharSequence toSplit) {
            return new SplittingIterator(splitter, toSplit) { // from class: com.google.common.base.Splitter.4.1
                AnonymousClass1(final Splitter splitter2, CharSequence toSplit2) {
                    super(splitter2, toSplit2);
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorEnd(int separatorPosition) {
                    return separatorPosition;
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorStart(int start) {
                    int i2 = start + val$length;
                    if (i2 < this.toSplit.length()) {
                        return i2;
                    }
                    return -1;
                }
            };
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.Splitter$5 */
    class AnonymousClass5 implements Iterable<String> {
        final /* synthetic */ CharSequence val$sequence;

        AnonymousClass5(final CharSequence val$sequence) {
            val$sequence = val$sequence;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return Splitter.this.splittingIterator(val$sequence);
        }

        public String toString() {
            return Joiner.on(", ").appendTo(new StringBuilder().append(AbstractJsonLexerKt.BEGIN_LIST), (Iterable<? extends Object>) this).append(AbstractJsonLexerKt.END_LIST).toString();
        }
    }

    public static final class MapSplitter {
        private static final String INVALID_ENTRY_MESSAGE = "Chunk [%s] is not a valid entry";
        private final Splitter entrySplitter;
        private final Splitter outerSplitter;

        private MapSplitter(Splitter outerSplitter, Splitter entrySplitter) {
            this.outerSplitter = outerSplitter;
            this.entrySplitter = (Splitter) Preconditions.checkNotNull(entrySplitter);
        }

        /* synthetic */ MapSplitter(Splitter splitter, Splitter splitter2, AnonymousClass1 anonymousClass1) {
            this(splitter, splitter2);
        }

        public Map<String, String> split(CharSequence sequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.outerSplitter.split(sequence)) {
                Iterator itSplittingIterator = this.entrySplitter.splittingIterator(str);
                Preconditions.checkArgument(itSplittingIterator.hasNext(), INVALID_ENTRY_MESSAGE, str);
                String str2 = (String) itSplittingIterator.next();
                Preconditions.checkArgument(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                Preconditions.checkArgument(itSplittingIterator.hasNext(), INVALID_ENTRY_MESSAGE, str);
                linkedHashMap.put(str2, (String) itSplittingIterator.next());
                Preconditions.checkArgument(!itSplittingIterator.hasNext(), INVALID_ENTRY_MESSAGE, str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }
    }

    private static abstract class SplittingIterator extends AbstractIterator<String> {
        int limit;
        int offset = 0;
        final boolean omitEmptyStrings;
        final CharSequence toSplit;
        final CharMatcher trimmer;

        protected SplittingIterator(Splitter splitter, CharSequence toSplit) {
            this.trimmer = splitter.trimmer;
            this.omitEmptyStrings = splitter.omitEmptyStrings;
            this.limit = splitter.limit;
            this.toSplit = toSplit;
        }

        /* JADX WARN: Code restructure failed: missing block: B:81:0x0060, code lost:
        
            r1 = r6.limit;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0063, code lost:
        
            if (r1 != 1) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0065, code lost:
        
            r4 = r6.toSplit.length();
            r6.offset = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x006d, code lost:
        
            if (r4 <= r3) goto L108;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x007d, code lost:
        
            if (r6.trimmer.matches(r6.toSplit.charAt(r4 - 1)) == false) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x007f, code lost:
        
            r4 = r4 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0082, code lost:
        
            r6.limit = r1 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x008f, code lost:
        
            return r6.toSplit.subSequence(r3, r4).toString();
         */
        @Override // com.google.common.base.AbstractIterator
        @javax.annotation.CheckForNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String computeNext() {
            /*
                r6 = this;
                int r3 = r6.offset
            L2:
                int r0 = r6.offset
                r5 = -1
                if (r0 == r5) goto L90
                int r4 = r6.separatorStart(r0)
                if (r4 != r5) goto L59
                java.lang.CharSequence r0 = r6.toSplit
                int r4 = r0.length()
                r6.offset = r5
            L15:
                int r0 = r6.offset
                if (r0 != r3) goto L28
                int r1 = r0 + 1
                r6.offset = r1
                java.lang.CharSequence r0 = r6.toSplit
                int r0 = r0.length()
                if (r1 <= r0) goto L2
                r6.offset = r5
                goto L2
            L28:
                if (r3 >= r4) goto L3b
                com.google.common.base.CharMatcher r1 = r6.trimmer
                java.lang.CharSequence r0 = r6.toSplit
                char r0 = r0.charAt(r3)
                boolean r0 = r1.matches(r0)
                if (r0 == 0) goto L3b
                int r3 = r3 + 1
                goto L28
            L3b:
                if (r4 <= r3) goto L50
                com.google.common.base.CharMatcher r2 = r6.trimmer
                java.lang.CharSequence r1 = r6.toSplit
                int r0 = r4 + (-1)
                char r0 = r1.charAt(r0)
                boolean r0 = r2.matches(r0)
                if (r0 == 0) goto L50
                int r4 = r4 + (-1)
                goto L3b
            L50:
                boolean r0 = r6.omitEmptyStrings
                if (r0 == 0) goto L60
                if (r3 != r4) goto L60
                int r3 = r6.offset
                goto L2
            L59:
                int r0 = r6.separatorEnd(r4)
                r6.offset = r0
                goto L15
            L60:
                int r1 = r6.limit
                r0 = 1
                if (r1 != r0) goto L82
                java.lang.CharSequence r0 = r6.toSplit
                int r4 = r0.length()
                r6.offset = r5
            L6d:
                if (r4 <= r3) goto L85
                com.google.common.base.CharMatcher r2 = r6.trimmer
                java.lang.CharSequence r1 = r6.toSplit
                int r0 = r4 + (-1)
                char r0 = r1.charAt(r0)
                boolean r0 = r2.matches(r0)
                if (r0 == 0) goto L85
                int r4 = r4 + (-1)
                goto L6d
            L82:
                int r1 = r1 - r0
                r6.limit = r1
            L85:
                java.lang.CharSequence r0 = r6.toSplit
                java.lang.CharSequence r0 = r0.subSequence(r3, r4)
                java.lang.String r0 = r0.toString()
                return r0
            L90:
                java.lang.Object r0 = r6.endOfData()
                java.lang.String r0 = (java.lang.String) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Splitter.SplittingIterator.computeNext():java.lang.String");
        }

        abstract int separatorEnd(int separatorPosition);

        abstract int separatorStart(int start);
    }

    private interface Strategy {
        Iterator<String> iterator(Splitter splitter, CharSequence toSplit);
    }

    private Splitter(Strategy strategy) {
        this(strategy, false, CharMatcher.none(), Integer.MAX_VALUE);
    }

    private Splitter(Strategy strategy, boolean omitEmptyStrings, CharMatcher trimmer, int limit) {
        this.strategy = strategy;
        this.omitEmptyStrings = omitEmptyStrings;
        this.trimmer = trimmer;
        this.limit = limit;
    }

    public static Splitter fixedLength(final int length) {
        Preconditions.checkArgument(length > 0, "The length may not be less than 1");
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.4
            final /* synthetic */ int val$length;

            /* JADX INFO: renamed from: com.google.common.base.Splitter$4$1 */
            class AnonymousClass1 extends SplittingIterator {
                AnonymousClass1(final Splitter splitter2, CharSequence toSplit2) {
                    super(splitter2, toSplit2);
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorEnd(int separatorPosition) {
                    return separatorPosition;
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorStart(int start) {
                    int i2 = start + val$length;
                    if (i2 < this.toSplit.length()) {
                        return i2;
                    }
                    return -1;
                }
            }

            AnonymousClass4(final int length2) {
                val$length = length2;
            }

            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(final Splitter splitter2, CharSequence toSplit2) {
                return new SplittingIterator(splitter2, toSplit2) { // from class: com.google.common.base.Splitter.4.1
                    AnonymousClass1(final Splitter splitter22, CharSequence toSplit22) {
                        super(splitter22, toSplit22);
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int separatorPosition) {
                        return separatorPosition;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int start) {
                        int i2 = start + val$length;
                        if (i2 < this.toSplit.length()) {
                            return i2;
                        }
                        return -1;
                    }
                };
            }
        });
    }

    public static Splitter on(char separator) {
        return on(CharMatcher.is(separator));
    }

    public static Splitter on(final CharMatcher separatorMatcher) {
        Preconditions.checkNotNull(separatorMatcher);
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.1

            /* JADX INFO: renamed from: com.google.common.base.Splitter$1$1 */
            class C01861 extends SplittingIterator {
                C01861(Splitter splitter2, final CharSequence toSplit2) {
                    super(splitter2, toSplit2);
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                int separatorEnd(int separatorPosition) {
                    return separatorPosition + 1;
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                int separatorStart(int start) {
                    return val$separatorMatcher.indexIn(this.toSplit, start);
                }
            }

            AnonymousClass1() {
            }

            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter2, final CharSequence toSplit2) {
                return new SplittingIterator(splitter2, toSplit2) { // from class: com.google.common.base.Splitter.1.1
                    C01861(Splitter splitter22, final CharSequence toSplit22) {
                        super(splitter22, toSplit22);
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    int separatorEnd(int separatorPosition) {
                        return separatorPosition + 1;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    int separatorStart(int start) {
                        return val$separatorMatcher.indexIn(this.toSplit, start);
                    }
                };
            }
        });
    }

    public static Splitter on(final String separator) {
        Preconditions.checkArgument(separator.length() != 0, "The separator may not be the empty string.");
        return separator.length() == 1 ? on(separator.charAt(0)) : new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.2
            final /* synthetic */ String val$separator;

            /* JADX INFO: renamed from: com.google.common.base.Splitter$2$1 */
            class AnonymousClass1 extends SplittingIterator {
                AnonymousClass1(Splitter splitter2, CharSequence toSplit2) {
                    super(splitter2, toSplit2);
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorEnd(int separatorPosition) {
                    return separatorPosition + val$separator.length();
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorStart(int v2) {
                    /*
                        this = this;
                        com.google.common.base.Splitter$2 r0 = com.google.common.base.Splitter.AnonymousClass2.this
                        java.lang.String r0 = r1
                        int r4 = r0.length()
                        java.lang.CharSequence r0 = r5.toSplit
                        int r3 = r0.length()
                        int r3 = r3 - r4
                    Lf:
                        if (r6 > r3) goto L2d
                        r2 = 0
                    L12:
                        if (r2 >= r4) goto L2c
                        java.lang.CharSequence r1 = r5.toSplit
                        int r0 = r2 + r6
                        char r1 = r1.charAt(r0)
                        com.google.common.base.Splitter$2 r0 = com.google.common.base.Splitter.AnonymousClass2.this
                        java.lang.String r0 = r1
                        char r0 = r0.charAt(r2)
                        if (r1 == r0) goto L29
                        int r6 = r6 + 1
                        goto Lf
                    L29:
                        int r2 = r2 + 1
                        goto L12
                    L2c:
                        return r6
                    L2d:
                        r0 = -1
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Splitter.AnonymousClass2.AnonymousClass1.separatorStart(int):int");
                }
            }

            AnonymousClass2(final String separator2) {
                val$separator = separator2;
            }

            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter2, CharSequence toSplit2) {
                return new SplittingIterator(splitter2, toSplit2) { // from class: com.google.common.base.Splitter.2.1
                    AnonymousClass1(Splitter splitter22, CharSequence toSplit22) {
                        super(splitter22, toSplit22);
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int separatorPosition) {
                        return separatorPosition + val$separator.length();
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int v2) {
                        /*
                            this = this;
                            com.google.common.base.Splitter$2 r0 = com.google.common.base.Splitter.AnonymousClass2.this
                            java.lang.String r0 = r1
                            int r4 = r0.length()
                            java.lang.CharSequence r0 = r5.toSplit
                            int r3 = r0.length()
                            int r3 = r3 - r4
                        Lf:
                            if (r6 > r3) goto L2d
                            r2 = 0
                        L12:
                            if (r2 >= r4) goto L2c
                            java.lang.CharSequence r1 = r5.toSplit
                            int r0 = r2 + r6
                            char r1 = r1.charAt(r0)
                            com.google.common.base.Splitter$2 r0 = com.google.common.base.Splitter.AnonymousClass2.this
                            java.lang.String r0 = r1
                            char r0 = r0.charAt(r2)
                            if (r1 == r0) goto L29
                            int r6 = r6 + 1
                            goto Lf
                        L29:
                            int r2 = r2 + 1
                            goto L12
                        L2c:
                            return r6
                        L2d:
                            r0 = -1
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Splitter.AnonymousClass2.AnonymousClass1.separatorStart(int):int");
                    }
                };
            }
        });
    }

    public static Splitter on(Pattern separatorPattern) {
        return onPatternInternal(new JdkPattern(separatorPattern));
    }

    public static Splitter onPattern(String separatorPattern) {
        return onPatternInternal(Platform.compilePattern(separatorPattern));
    }

    static Splitter onPatternInternal(final CommonPattern separatorPattern) {
        Preconditions.checkArgument(!separatorPattern.matcher("").matches(), "The pattern may not match the empty string: %s", separatorPattern);
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.3

            /* JADX INFO: renamed from: com.google.common.base.Splitter$3$1 */
            class AnonymousClass1 extends SplittingIterator {
                final /* synthetic */ CommonMatcher val$matcher;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AnonymousClass3 this, final Splitter splitter2, CharSequence toSplit2, final CommonMatcher val$matcher) {
                    super(splitter2, toSplit2);
                    val$matcher = val$matcher;
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorEnd(int separatorPosition) {
                    return val$matcher.end();
                }

                @Override // com.google.common.base.Splitter.SplittingIterator
                public int separatorStart(int start) {
                    if (val$matcher.find(start)) {
                        return val$matcher.start();
                    }
                    return -1;
                }
            }

            AnonymousClass3() {
            }

            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(final Splitter splitter2, CharSequence toSplit2) {
                return new SplittingIterator(this, splitter2, toSplit2) { // from class: com.google.common.base.Splitter.3.1
                    final /* synthetic */ CommonMatcher val$matcher;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(AnonymousClass3 this, final Splitter splitter22, CharSequence toSplit22, final CommonMatcher val$matcher) {
                        super(splitter22, toSplit22);
                        val$matcher = val$matcher;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int separatorPosition) {
                        return val$matcher.end();
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int start) {
                        if (val$matcher.find(start)) {
                            return val$matcher.start();
                        }
                        return -1;
                    }
                };
            }
        });
    }

    public Iterator<String> splittingIterator(CharSequence sequence) {
        return this.strategy.iterator(this, sequence);
    }

    public Splitter limit(int maxItems) {
        Preconditions.checkArgument(maxItems > 0, "must be greater than zero: %s", maxItems);
        return new Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, maxItems);
    }

    public Splitter omitEmptyStrings() {
        return new Splitter(this.strategy, true, this.trimmer, this.limit);
    }

    public Iterable<String> split(final CharSequence sequence) {
        Preconditions.checkNotNull(sequence);
        return new Iterable<String>() { // from class: com.google.common.base.Splitter.5
            final /* synthetic */ CharSequence val$sequence;

            AnonymousClass5(final CharSequence sequence2) {
                val$sequence = sequence2;
            }

            @Override // java.lang.Iterable
            public Iterator<String> iterator() {
                return Splitter.this.splittingIterator(val$sequence);
            }

            public String toString() {
                return Joiner.on(", ").appendTo(new StringBuilder().append(AbstractJsonLexerKt.BEGIN_LIST), (Iterable<? extends Object>) this).append(AbstractJsonLexerKt.END_LIST).toString();
            }
        };
    }

    public List<String> splitToList(CharSequence sequence) {
        Preconditions.checkNotNull(sequence);
        Iterator<String> itSplittingIterator = splittingIterator(sequence);
        ArrayList arrayList = new ArrayList();
        while (itSplittingIterator.hasNext()) {
            arrayList.add(itSplittingIterator.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Splitter trimResults() {
        return trimResults(CharMatcher.whitespace());
    }

    public Splitter trimResults(CharMatcher trimmer) {
        Preconditions.checkNotNull(trimmer);
        return new Splitter(this.strategy, this.omitEmptyStrings, trimmer, this.limit);
    }

    public MapSplitter withKeyValueSeparator(char separator) {
        return withKeyValueSeparator(on(separator));
    }

    public MapSplitter withKeyValueSeparator(Splitter keyValueSplitter) {
        return new MapSplitter(keyValueSplitter);
    }

    public MapSplitter withKeyValueSeparator(String separator) {
        return withKeyValueSeparator(on(separator));
    }
}
