package com.google.common.base;

import com.dynatrace.android.agent.Global;
import java.io.Serializable;
import javax.annotation.CheckForNull;
import org.apache.commons.codec.language.Soundex;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LOWER_UNDERSCORE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class CaseFormat {
    private static final /* synthetic */ CaseFormat[] $VALUES;
    public static final CaseFormat LOWER_CAMEL;
    public static final CaseFormat LOWER_HYPHEN = new CaseFormat("LOWER_HYPHEN", 0, CharMatcher.is(Soundex.SILENT_MARKER), Global.HYPHEN) { // from class: com.google.common.base.CaseFormat.1
        @Override // com.google.common.base.CaseFormat
        String convert(CaseFormat format, String s2) {
            return format == LOWER_UNDERSCORE ? s2.replace(Soundex.SILENT_MARKER, '_') : format == UPPER_UNDERSCORE ? Ascii.toUpperCase(s2.replace(Soundex.SILENT_MARKER, '_')) : super.convert(format, s2);
        }

        @Override // com.google.common.base.CaseFormat
        String normalizeWord(String word) {
            return Ascii.toLowerCase(word);
        }
    };
    public static final CaseFormat LOWER_UNDERSCORE;
    public static final CaseFormat UPPER_CAMEL;
    public static final CaseFormat UPPER_UNDERSCORE;
    private final CharMatcher wordBoundary;
    private final String wordSeparator;

    private static final class StringConverter extends Converter<String, String> implements Serializable {
        private static final long serialVersionUID = 0;
        private final CaseFormat sourceFormat;
        private final CaseFormat targetFormat;

        StringConverter(CaseFormat sourceFormat, CaseFormat targetFormat) {
            this.sourceFormat = (CaseFormat) Preconditions.checkNotNull(sourceFormat);
            this.targetFormat = (CaseFormat) Preconditions.checkNotNull(targetFormat);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public String doBackward(String s2) {
            return this.targetFormat.to(this.sourceFormat, s2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public String doForward(String s2) {
            return this.sourceFormat.to(this.targetFormat, s2);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@CheckForNull Object object) {
            if (!(object instanceof StringConverter)) {
                return false;
            }
            StringConverter stringConverter = (StringConverter) object;
            return this.sourceFormat.equals(stringConverter.sourceFormat) && this.targetFormat.equals(stringConverter.targetFormat);
        }

        public int hashCode() {
            return this.sourceFormat.hashCode() ^ this.targetFormat.hashCode();
        }

        public String toString() {
            return this.sourceFormat + ".converterTo(" + this.targetFormat + ")";
        }
    }

    private static /* synthetic */ CaseFormat[] $values() {
        return new CaseFormat[]{LOWER_HYPHEN, LOWER_UNDERSCORE, LOWER_CAMEL, UPPER_CAMEL, UPPER_UNDERSCORE};
    }

    static {
        CharMatcher charMatcherIs = CharMatcher.is('_');
        String str = Global.UNDERSCORE;
        LOWER_UNDERSCORE = new CaseFormat("LOWER_UNDERSCORE", 1, charMatcherIs, str) { // from class: com.google.common.base.CaseFormat.2
            @Override // com.google.common.base.CaseFormat
            String convert(CaseFormat format, String s2) {
                return format == LOWER_HYPHEN ? s2.replace('_', Soundex.SILENT_MARKER) : format == UPPER_UNDERSCORE ? Ascii.toUpperCase(s2) : super.convert(format, s2);
            }

            @Override // com.google.common.base.CaseFormat
            String normalizeWord(String word) {
                return Ascii.toLowerCase(word);
            }
        };
        String str2 = "";
        LOWER_CAMEL = new CaseFormat("LOWER_CAMEL", 2, CharMatcher.inRange('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.3
            @Override // com.google.common.base.CaseFormat
            String normalizeFirstWord(String word) {
                return Ascii.toLowerCase(word);
            }

            @Override // com.google.common.base.CaseFormat
            String normalizeWord(String word) {
                return CaseFormat.firstCharOnlyToUpper(word);
            }
        };
        UPPER_CAMEL = new CaseFormat("UPPER_CAMEL", 3, CharMatcher.inRange('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.4
            @Override // com.google.common.base.CaseFormat
            String normalizeWord(String word) {
                return CaseFormat.firstCharOnlyToUpper(word);
            }
        };
        UPPER_UNDERSCORE = new CaseFormat("UPPER_UNDERSCORE", 4, CharMatcher.is('_'), str) { // from class: com.google.common.base.CaseFormat.5
            @Override // com.google.common.base.CaseFormat
            String convert(CaseFormat format, String s2) {
                return format == LOWER_HYPHEN ? Ascii.toLowerCase(s2.replace('_', Soundex.SILENT_MARKER)) : format == LOWER_UNDERSCORE ? Ascii.toLowerCase(s2) : super.convert(format, s2);
            }

            @Override // com.google.common.base.CaseFormat
            String normalizeWord(String word) {
                return Ascii.toUpperCase(word);
            }
        };
        $VALUES = $values();
    }

    private CaseFormat(String $enum$name, int $enum$ordinal, CharMatcher wordBoundary, String wordSeparator) {
        this.wordBoundary = wordBoundary;
        this.wordSeparator = wordSeparator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String firstCharOnlyToUpper(String word) {
        return word.isEmpty() ? word : Ascii.toUpperCase(word.charAt(0)) + Ascii.toLowerCase(word.substring(1));
    }

    public static CaseFormat valueOf(String name) {
        return (CaseFormat) Enum.valueOf(CaseFormat.class, name);
    }

    public static CaseFormat[] values() {
        return (CaseFormat[]) $VALUES.clone();
    }

    String convert(CaseFormat format, String s2) {
        StringBuilder sb = null;
        int length = 0;
        int iIndexIn = -1;
        while (true) {
            iIndexIn = this.wordBoundary.indexIn(s2, iIndexIn + 1);
            if (iIndexIn == -1) {
                break;
            }
            if (length == 0) {
                sb = new StringBuilder(s2.length() + (format.wordSeparator.length() * 4));
                sb.append(format.normalizeFirstWord(s2.substring(length, iIndexIn)));
            } else {
                ((StringBuilder) java.util.Objects.requireNonNull(sb)).append(format.normalizeWord(s2.substring(length, iIndexIn)));
            }
            sb.append(format.wordSeparator);
            length = this.wordSeparator.length() + iIndexIn;
        }
        return length == 0 ? format.normalizeFirstWord(s2) : ((StringBuilder) java.util.Objects.requireNonNull(sb)).append(format.normalizeWord(s2.substring(length))).toString();
    }

    public Converter<String, String> converterTo(CaseFormat targetFormat) {
        return new StringConverter(this, targetFormat);
    }

    String normalizeFirstWord(String word) {
        return normalizeWord(word);
    }

    abstract String normalizeWord(String word);

    public final String to(CaseFormat format, String str) {
        Preconditions.checkNotNull(format);
        Preconditions.checkNotNull(str);
        return format == this ? str : convert(format, str);
    }
}
