package org.apache.commons.codec.language.bm;

import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.regex.Pattern;
import org.apache.commons.codec.Resources;
import org.apache.commons.codec.language.bm.Languages;
import org.apache.commons.codec.language.bm.Rule;

/* JADX INFO: loaded from: classes6.dex */
public class Rule {
    public static final String ALL = "ALL";
    private static final String DOUBLE_QUOTE = "\"";
    private final RPattern lContext;
    private final String pattern;
    private final PhonemeExpr phoneme;
    private final RPattern rContext;
    public static final RPattern ALL_STRINGS_RMATCHER = new RPattern() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda11
        @Override // org.apache.commons.codec.language.bm.Rule.RPattern
        public final boolean isMatch(CharSequence charSequence) {
            return Rule.lambda$static$0(charSequence);
        }
    };
    private static final String HASH_INCLUDE = "#include";
    private static final int HASH_INCLUDE_LENGTH = HASH_INCLUDE.length();
    private static final Map<NameType, Map<RuleType, Map<String, Map<String, List<Rule>>>>> RULES = new EnumMap(NameType.class);

    public static final class Phoneme implements PhonemeExpr {
        public static final Comparator<Phoneme> COMPARATOR = new Comparator() { // from class: org.apache.commons.codec.language.bm.Rule$Phoneme$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Rule.Phoneme.lambda$static$0((Rule.Phoneme) obj, (Rule.Phoneme) obj2);
            }
        };
        private final Languages.LanguageSet languages;
        private final StringBuilder phonemeText;

        public Phoneme(CharSequence charSequence, Languages.LanguageSet languageSet) {
            this.phonemeText = new StringBuilder(charSequence);
            this.languages = languageSet;
        }

        public Phoneme(Phoneme phoneme, Phoneme phoneme2) {
            this(phoneme.phonemeText, phoneme.languages);
            this.phonemeText.append((CharSequence) phoneme2.phonemeText);
        }

        public Phoneme(Phoneme phoneme, Phoneme phoneme2, Languages.LanguageSet languageSet) {
            this(phoneme.phonemeText, languageSet);
            this.phonemeText.append((CharSequence) phoneme2.phonemeText);
        }

        static /* synthetic */ int lambda$static$0(Phoneme phoneme, Phoneme phoneme2) {
            int length = phoneme.phonemeText.length();
            int length2 = phoneme2.phonemeText.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (i2 >= length2) {
                    return 1;
                }
                int iCharAt = phoneme.phonemeText.charAt(i2) - phoneme2.phonemeText.charAt(i2);
                if (iCharAt != 0) {
                    return iCharAt;
                }
            }
            return length < length2 ? -1 : 0;
        }

        public Phoneme append(CharSequence charSequence) {
            this.phonemeText.append(charSequence);
            return this;
        }

        public Languages.LanguageSet getLanguages() {
            return this.languages;
        }

        public CharSequence getPhonemeText() {
            return this.phonemeText;
        }

        @Override // org.apache.commons.codec.language.bm.Rule.PhonemeExpr
        public Iterable<Phoneme> getPhonemes() {
            return Collections.singleton(this);
        }

        @Deprecated
        public Phoneme join(Phoneme phoneme) {
            return new Phoneme(this.phonemeText.toString() + phoneme.phonemeText.toString(), this.languages.restrictTo(phoneme.languages));
        }

        public Phoneme mergeWithLanguage(Languages.LanguageSet languageSet) {
            return new Phoneme(this.phonemeText.toString(), this.languages.merge(languageSet));
        }

        @Override // org.apache.commons.codec.language.bm.Rule.PhonemeExpr
        public int size() {
            return 1;
        }

        public String toString() {
            return this.phonemeText.toString() + "[" + this.languages + "]";
        }
    }

    public interface PhonemeExpr {
        Iterable<Phoneme> getPhonemes();

        default int size() {
            return (int) Math.min(getPhonemes().spliterator().getExactSizeIfKnown(), 2147483647L);
        }
    }

    public static final class PhonemeList implements PhonemeExpr {
        private final List<Phoneme> phonemeList;

        public PhonemeList(List<Phoneme> list) {
            this.phonemeList = list;
        }

        @Override // org.apache.commons.codec.language.bm.Rule.PhonemeExpr
        public List<Phoneme> getPhonemes() {
            return this.phonemeList;
        }

        @Override // org.apache.commons.codec.language.bm.Rule.PhonemeExpr
        public int size() {
            return this.phonemeList.size();
        }
    }

    public interface RPattern {
        boolean isMatch(CharSequence charSequence);
    }

    static {
        for (final NameType nameType : NameType.values()) {
            EnumMap enumMap = new EnumMap(RuleType.class);
            for (final RuleType ruleType : RuleType.values()) {
                final HashMap map = new HashMap();
                Languages.getInstance(nameType).getLanguages().forEach(new Consumer() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda1
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        Rule.lambda$static$1(nameType, ruleType, map, (String) obj);
                    }
                });
                if (!ruleType.equals(RuleType.RULES)) {
                    Scanner scannerCreateScanner = createScanner(nameType, ruleType, "common");
                    try {
                        map.put("common", parseRules(scannerCreateScanner, createResourceName(nameType, ruleType, "common")));
                        if (scannerCreateScanner != null) {
                            scannerCreateScanner.close();
                        }
                    } catch (Throwable th) {
                        if (scannerCreateScanner != null) {
                            try {
                                scannerCreateScanner.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                enumMap.put(ruleType, Collections.unmodifiableMap(map));
            }
            RULES.put(nameType, Collections.unmodifiableMap(enumMap));
        }
    }

    public Rule(String str, String str2, String str3, PhonemeExpr phonemeExpr) {
        this.pattern = str;
        this.lContext = pattern(str2 + "$");
        this.rContext = pattern("^" + str3);
        this.phoneme = phonemeExpr;
    }

    private static boolean contains(CharSequence charSequence, final char c2) {
        return charSequence.chars().anyMatch(new IntPredicate() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda10
            @Override // java.util.function.IntPredicate
            public final boolean test(int i2) {
                return Rule.lambda$contains$2(c2, i2);
            }
        });
    }

    private static String createResourceName(NameType nameType, RuleType ruleType, String str) {
        return String.format("/org/apache/commons/codec/language/bm/%s_%s_%s.txt", nameType.getName(), ruleType.getName(), str);
    }

    private static Scanner createScanner(String str) {
        return new Scanner(Resources.getInputStream(String.format("/org/apache/commons/codec/language/bm/%s.txt", str)), ResourceConstants.ENCODING);
    }

    private static Scanner createScanner(NameType nameType, RuleType ruleType, String str) {
        return new Scanner(Resources.getInputStream(createResourceName(nameType, ruleType, str)), ResourceConstants.ENCODING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean endsWith(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        int length2 = charSequence.length();
        if (length > length2) {
            return false;
        }
        int i2 = length2 - 1;
        for (int i3 = length - 1; i3 >= 0; i3--) {
            if (charSequence.charAt(i2) != charSequence2.charAt(i3)) {
                return false;
            }
            i2--;
        }
        return true;
    }

    public static List<Rule> getInstance(NameType nameType, RuleType ruleType, String str) {
        return getInstance(nameType, ruleType, Languages.LanguageSet.from(new HashSet(Arrays.asList(str))));
    }

    public static List<Rule> getInstance(NameType nameType, RuleType ruleType, Languages.LanguageSet languageSet) {
        Map<String, List<Rule>> instanceMap = getInstanceMap(nameType, ruleType, languageSet);
        final ArrayList arrayList = new ArrayList();
        instanceMap.values().forEach(new Consumer() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                arrayList.addAll((List) obj);
            }
        });
        return arrayList;
    }

    public static Map<String, List<Rule>> getInstanceMap(NameType nameType, RuleType ruleType, String str) {
        Map<String, List<Rule>> map = RULES.get(nameType).get(ruleType).get(str);
        if (map != null) {
            return map;
        }
        throw new IllegalArgumentException(String.format("No rules found for %s, %s, %s.", nameType.getName(), ruleType.getName(), str));
    }

    public static Map<String, List<Rule>> getInstanceMap(NameType nameType, RuleType ruleType, Languages.LanguageSet languageSet) {
        return languageSet.isSingleton() ? getInstanceMap(nameType, ruleType, languageSet.getAny()) : getInstanceMap(nameType, ruleType, Languages.ANY);
    }

    static /* synthetic */ boolean lambda$contains$2(char c2, int i2) {
        return i2 == c2;
    }

    static /* synthetic */ List lambda$parseRules$4(String str) {
        return new ArrayList();
    }

    static /* synthetic */ boolean lambda$pattern$10(String str, boolean z2, CharSequence charSequence) {
        return charSequence.length() > 0 && contains(str, charSequence.charAt(0)) == z2;
    }

    static /* synthetic */ boolean lambda$pattern$11(String str, boolean z2, CharSequence charSequence) {
        return charSequence.length() > 0 && contains(str, charSequence.charAt(charSequence.length() - 1)) == z2;
    }

    static /* synthetic */ boolean lambda$pattern$5(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    static /* synthetic */ boolean lambda$pattern$9(String str, boolean z2, CharSequence charSequence) {
        return charSequence.length() == 1 && contains(str, charSequence.charAt(0)) == z2;
    }

    static /* synthetic */ boolean lambda$static$0(CharSequence charSequence) {
        return true;
    }

    static /* synthetic */ void lambda$static$1(NameType nameType, RuleType ruleType, Map map, String str) {
        try {
            Scanner scannerCreateScanner = createScanner(nameType, ruleType, str);
            try {
                map.put(str, parseRules(scannerCreateScanner, createResourceName(nameType, ruleType, str)));
                if (scannerCreateScanner != null) {
                    scannerCreateScanner.close();
                }
            } finally {
            }
        } catch (IllegalStateException e2) {
            throw new IllegalStateException("Problem processing " + createResourceName(nameType, ruleType, str), e2);
        }
    }

    private static Phoneme parsePhoneme(String str) {
        int iIndexOf = str.indexOf("[");
        if (iIndexOf < 0) {
            return new Phoneme(str, Languages.ANY_LANGUAGE);
        }
        if (str.endsWith("]")) {
            return new Phoneme(str.substring(0, iIndexOf), Languages.LanguageSet.from(new HashSet(Arrays.asList(str.substring(iIndexOf + 1, str.length() - 1).split("[+]")))));
        }
        throw new IllegalArgumentException("Phoneme expression contains a '[' but does not end in ']'");
    }

    private static PhonemeExpr parsePhonemeExpr(String str) {
        if (!str.startsWith("(")) {
            return parsePhoneme(str);
        }
        if (!str.endsWith(")")) {
            throw new IllegalArgumentException("Phoneme starts with '(' so must end with ')'");
        }
        ArrayList arrayList = new ArrayList();
        String strSubstring = str.substring(1, str.length() - 1);
        for (String str2 : strSubstring.split("[|]")) {
            arrayList.add(parsePhoneme(str2));
        }
        if (strSubstring.startsWith("|") || strSubstring.endsWith("|")) {
            arrayList.add(new Phoneme("", Languages.ANY_LANGUAGE));
        }
        return new PhonemeList(arrayList);
    }

    private static Map<String, List<Rule>> parseRules(Scanner scanner, String str) {
        String strStripQuotes;
        String strStripQuotes2;
        String strStripQuotes3;
        HashMap map = new HashMap();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (scanner.hasNextLine()) {
            i3++;
            String strNextLine = scanner.nextLine();
            if (i4 != 0) {
                if (strNextLine.endsWith("*/")) {
                    i4 = i2;
                }
            } else if (strNextLine.startsWith("/*")) {
                i4 = 1;
            } else {
                int iIndexOf = strNextLine.indexOf("//");
                String strTrim = (iIndexOf >= 0 ? strNextLine.substring(i2, iIndexOf) : strNextLine).trim();
                if (strTrim.isEmpty()) {
                    continue;
                } else if (strTrim.startsWith(HASH_INCLUDE)) {
                    String strTrim2 = strTrim.substring(HASH_INCLUDE_LENGTH).trim();
                    if (strTrim2.contains(Global.BLANK)) {
                        throw new IllegalArgumentException("Malformed import statement '" + strNextLine + "' in " + str);
                    }
                    Scanner scannerCreateScanner = createScanner(strTrim2);
                    try {
                        map.putAll(parseRules(scannerCreateScanner, str + "->" + strTrim2));
                        if (scannerCreateScanner != null) {
                            scannerCreateScanner.close();
                        }
                    } catch (Throwable th) {
                        if (scannerCreateScanner != null) {
                            try {
                                scannerCreateScanner.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } else {
                    String[] strArrSplit = strTrim.split("\\s+");
                    if (strArrSplit.length != 4) {
                        throw new IllegalArgumentException("Malformed rule statement split into " + strArrSplit.length + " parts: " + strNextLine + " in " + str);
                    }
                    try {
                        strStripQuotes = stripQuotes(strArrSplit[i2]);
                        strStripQuotes2 = stripQuotes(strArrSplit[1]);
                        strStripQuotes3 = stripQuotes(strArrSplit[2]);
                    } catch (IllegalArgumentException e2) {
                        e = e2;
                    }
                    try {
                        Rule rule = new Rule(strStripQuotes, strStripQuotes2, strStripQuotes3, parsePhonemeExpr(stripQuotes(strArrSplit[3])), i3, str, strStripQuotes, strStripQuotes2, strStripQuotes3) { // from class: org.apache.commons.codec.language.bm.Rule.1
                            private final String loc;
                            private final int myLine;
                            final /* synthetic */ int val$cLine;
                            final /* synthetic */ String val$lCon;
                            final /* synthetic */ String val$location;
                            final /* synthetic */ String val$pat;
                            final /* synthetic */ String val$rCon;

                            {
                                this.val$cLine = i3;
                                this.val$location = str;
                                this.val$pat = strStripQuotes;
                                this.val$lCon = strStripQuotes2;
                                this.val$rCon = strStripQuotes3;
                                this.myLine = i3;
                                this.loc = str;
                            }

                            public String toString() {
                                StringBuilder sb = new StringBuilder("Rule{line=");
                                sb.append(this.myLine);
                                sb.append(", loc='").append(this.loc).append("', pat='");
                                sb.append(this.val$pat).append("', lcon='");
                                sb.append(this.val$lCon).append("', rcon='");
                                sb.append(this.val$rCon).append("'}");
                                return sb.toString();
                            }
                        };
                        i2 = 0;
                        ((List) map.computeIfAbsent(rule.pattern.substring(0, 1), new Function() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda2
                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return Rule.lambda$parseRules$4((String) obj);
                            }
                        })).add(rule);
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        throw new IllegalStateException("Problem parsing line '" + i3 + "' in " + str, e);
                    }
                }
            }
        }
        return map;
    }

    private static RPattern pattern(String str) {
        boolean zStartsWith = str.startsWith("^");
        boolean zEndsWith = str.endsWith("$");
        int length = str.length();
        if (zEndsWith) {
            length--;
        }
        final String strSubstring = str.substring(zStartsWith ? 1 : 0, length);
        if (strSubstring.contains("[")) {
            boolean zStartsWith2 = strSubstring.startsWith("[");
            boolean zEndsWith2 = strSubstring.endsWith("]");
            if (zStartsWith2 && zEndsWith2) {
                final String strSubstring2 = strSubstring.substring(1, strSubstring.length() - 1);
                if (!strSubstring2.contains("[")) {
                    boolean zStartsWith3 = strSubstring2.startsWith("^");
                    if (zStartsWith3) {
                        strSubstring2 = strSubstring2.substring(1);
                    }
                    final boolean z2 = !zStartsWith3;
                    if (zStartsWith && zEndsWith) {
                        return new RPattern() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda7
                            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                            public final boolean isMatch(CharSequence charSequence) {
                                return Rule.lambda$pattern$9(strSubstring2, z2, charSequence);
                            }
                        };
                    }
                    if (zStartsWith) {
                        return new RPattern() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda8
                            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                            public final boolean isMatch(CharSequence charSequence) {
                                return Rule.lambda$pattern$10(strSubstring2, z2, charSequence);
                            }
                        };
                    }
                    if (zEndsWith) {
                        return new RPattern() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda9
                            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                            public final boolean isMatch(CharSequence charSequence) {
                                return Rule.lambda$pattern$11(strSubstring2, z2, charSequence);
                            }
                        };
                    }
                }
            }
        } else {
            if (zStartsWith && zEndsWith) {
                return strSubstring.isEmpty() ? new RPattern() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda3
                    @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                    public final boolean isMatch(CharSequence charSequence) {
                        return Rule.lambda$pattern$5(charSequence);
                    }
                } : new RPattern() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda4
                    @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                    public final boolean isMatch(CharSequence charSequence) {
                        return charSequence.equals(strSubstring);
                    }
                };
            }
            if ((zStartsWith || zEndsWith) && strSubstring.isEmpty()) {
                return ALL_STRINGS_RMATCHER;
            }
            if (zStartsWith) {
                return new RPattern() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda5
                    @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                    public final boolean isMatch(CharSequence charSequence) {
                        return Rule.startsWith(charSequence, strSubstring);
                    }
                };
            }
            if (zEndsWith) {
                return new RPattern() { // from class: org.apache.commons.codec.language.bm.Rule$$ExternalSyntheticLambda6
                    @Override // org.apache.commons.codec.language.bm.Rule.RPattern
                    public final boolean isMatch(CharSequence charSequence) {
                        return Rule.endsWith(charSequence, strSubstring);
                    }
                };
            }
        }
        return new RPattern(str) { // from class: org.apache.commons.codec.language.bm.Rule.2
            final Pattern pattern;
            final /* synthetic */ String val$regex;

            {
                this.val$regex = str;
                this.pattern = Pattern.compile(str);
            }

            @Override // org.apache.commons.codec.language.bm.Rule.RPattern
            public boolean isMatch(CharSequence charSequence) {
                return this.pattern.matcher(charSequence).find();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean startsWith(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        for (int i2 = 0; i2 < charSequence2.length(); i2++) {
            if (charSequence.charAt(i2) != charSequence2.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    private static String stripQuotes(String str) {
        if (str.startsWith(DOUBLE_QUOTE)) {
            str = str.substring(1);
        }
        return str.endsWith(DOUBLE_QUOTE) ? str.substring(0, str.length() - 1) : str;
    }

    public RPattern getLContext() {
        return this.lContext;
    }

    public String getPattern() {
        return this.pattern;
    }

    public PhonemeExpr getPhoneme() {
        return this.phoneme;
    }

    public RPattern getRContext() {
        return this.rContext;
    }

    public boolean patternAndContextMatches(CharSequence charSequence, int i2) {
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Can not match pattern at negative indexes");
        }
        int length = this.pattern.length() + i2;
        if (length <= charSequence.length() && charSequence.subSequence(i2, length).equals(this.pattern) && this.rContext.isMatch(charSequence.subSequence(length, charSequence.length()))) {
            return this.lContext.isMatch(charSequence.subSequence(0, i2));
        }
        return false;
    }
}
