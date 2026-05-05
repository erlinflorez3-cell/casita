package androidx.compose.ui.autofill;

import androidx.autofill.HintConstants;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: ContentType.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\":2\u007f\u0007ln?ӄZ͜f7\u0003SX\u000e$z=dh*\u0006S?c\u001a\u0016\"7PɁkg|L\u001b\u001eI\u000f\u0016 \u0007mDOezm\u0012=3psУ7M}B\u0002t\u0003<\u001d `Ĳh}\u0013\b2*vƵ=ٚCƚ\u0010\u00126HAL`\u0010e\u000b*\u0014\u0016>N\u0002L`>ޱ8Ղp]Bǂݳ\u0007s"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0013c\u0007/7v%\u001daN;A", "", "1n]AX5M6\u001d\b\n", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "1n]AX5M6\u001d\b\nl", "", "uKY.i(\bc(\u0003\u0002(\u001a|\u0018\u0005)p", ">kd@", "=sW2e", ">kd@\u0017<BM&~\u0002^(\u000b\t", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ContentType {
    private final Set<String> contentHints;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final ContentType Username = new ContentType("username");
    private static final ContentType Password = new ContentType(HintConstants.AUTOFILL_HINT_PASSWORD);
    private static final ContentType EmailAddress = new ContentType(HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS);
    private static final ContentType NewUsername = new ContentType(HintConstants.AUTOFILL_HINT_NEW_USERNAME);
    private static final ContentType NewPassword = new ContentType(HintConstants.AUTOFILL_HINT_NEW_PASSWORD);
    private static final ContentType PostalAddress = new ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS);
    private static final ContentType PostalCode = new ContentType(HintConstants.AUTOFILL_HINT_POSTAL_CODE);
    private static final ContentType CreditCardNumber = new ContentType(HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER);
    private static final ContentType CreditCardSecurityCode = new ContentType(HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE);
    private static final ContentType CreditCardExpirationDate = new ContentType(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE);
    private static final ContentType CreditCardExpirationMonth = new ContentType(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH);
    private static final ContentType CreditCardExpirationYear = new ContentType(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR);
    private static final ContentType CreditCardExpirationDay = new ContentType(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY);
    private static final ContentType AddressCountry = new ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_COUNTRY);
    private static final ContentType AddressRegion = new ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_REGION);
    private static final ContentType AddressLocality = new ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_LOCALITY);
    private static final ContentType AddressStreet = new ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS);
    private static final ContentType AddressAuxiliaryDetails = new ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_ADDRESS);
    private static final ContentType PostalCodeExtended = new ContentType(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_POSTAL_CODE);
    private static final ContentType PersonFullName = new ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME);
    private static final ContentType PersonFirstName = new ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME_GIVEN);
    private static final ContentType PersonLastName = new ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME_FAMILY);
    private static final ContentType PersonMiddleName = new ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE);
    private static final ContentType PersonMiddleInitial = new ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE_INITIAL);
    private static final ContentType PersonNamePrefix = new ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME_PREFIX);
    private static final ContentType PersonNameSuffix = new ContentType(HintConstants.AUTOFILL_HINT_PERSON_NAME_SUFFIX);
    private static final ContentType PhoneNumber = new ContentType(HintConstants.AUTOFILL_HINT_PHONE_NUMBER);
    private static final ContentType PhoneNumberDevice = new ContentType(HintConstants.AUTOFILL_HINT_PHONE_NUMBER_DEVICE);
    private static final ContentType PhoneCountryCode = new ContentType(HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE);
    private static final ContentType PhoneNumberNational = new ContentType(HintConstants.AUTOFILL_HINT_PHONE_NATIONAL);
    private static final ContentType Gender = new ContentType(HintConstants.AUTOFILL_HINT_GENDER);
    private static final ContentType BirthDateFull = new ContentType(HintConstants.AUTOFILL_HINT_BIRTH_DATE_FULL);
    private static final ContentType BirthDateDay = new ContentType(HintConstants.AUTOFILL_HINT_BIRTH_DATE_DAY);
    private static final ContentType BirthDateMonth = new ContentType(HintConstants.AUTOFILL_HINT_BIRTH_DATE_MONTH);
    private static final ContentType BirthDateYear = new ContentType(HintConstants.AUTOFILL_HINT_BIRTH_DATE_YEAR);
    private static final ContentType SmsOtpCode = new ContentType(HintConstants.AUTOFILL_HINT_SMS_OTP);

    private ContentType(Set<String> set) {
        this.contentHints = set;
    }

    public ContentType(String str) {
        this((Set<String>) SetsKt.setOf(str));
    }

    /* JADX INFO: compiled from: ContentType.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005j4\u0012\u0006\u0013nj?0J͝IDɟ\u0004*=j<9*[ҸuCIUb\u00110TgN\u0016i\u001fNhW[\u000f4c?߽̓MU~,b\u001e@C\b?aOڱA?hҚN\u0007&50<J\u0014\u000f\u001fBH>xټGQ\u0014۵HBv@`\u0011\u001e\u0014(\u0019\u001e>N\u0003ɉ`mVȤ`ncB='SxPW?_^~֔\u0011L\\܋%xg(9D\bD#0k\u00035TÜC\tGмU\u0007n35/\u001a\u0003eCp\u007fB\u0017ۣS\u0013eö>^\u000b_n\u0010w:]rcP<*Þ~\u0002\u0015ɝ\u001c\u0010\f7V2})t\u0019&3#tՂDV\nމZ\u0002\u0001sD\u001bu\u000fA>Q\u001b\u0015Sň?\u001fVљ\u0014\u0007\u001321\u0005?0ii&`C\u001dƻ{W9҅X?Nd\u0018]\u000e|\u0012\bz\u0002X\u0006ΥK\u00067Ʌ)0\u001d=E_\n2/\u0005\u001aHriЛ\tfpׅ\u0002TNZ0rfF8$$ZrfʰoV\\АD\u0013S8b\u000bN\u0017!=twj#ٚ\u0014TWŖ\u0002lS{\u0018)\u007fuEx\u0007k<Yߍb9=ȡ{\u0012gr\u0005\u0018\u0010Kp&pfpU۱^b0ίJJp2\u0006\u007f\u0015]\u001a6J? \u001eٜ07!¢-J\tBPEM\u0018m\u007f\u0001\u0010-Vտ(\tq˅\r\u000b\u0007vjt@v\u0007pD|\u000f$έEW=ӧ>W(\u0011B\u0001s\u0016\r\u001d\u0018G\u0016NܤPr\u001e߯m}&@(=\">K>'~W4ī1KTǩ}SS>5~M\t\u001dh\u0001.\u0016\nϡt2hʄbQZE0z/\u000217|\u007f(câ~MkҺ#]Dy\u0001\u0007*K\\i\u0015\u0005M ݵ\u0005u*ĜM/IY+\u001aH#=Hy]\u0018qЦ}h\u0017ծ\rg\n`q\u001a@q_\u0013J;fK˕\u0003D*غ\u0005\u0005H~x{XQ\u0017k%3vCяt\\@ԇ#1\u0004\u001f\u00150]\u007fd\u0015R\u0013\u001e\u007fӑ2e2ϒ[\u007f\u001a\u0019Q)a\\a#\u0006my^\u05c8N\u0015\u0012Κ\u00143tN*Apee !04u͛:GCؠ\u001d>\u000fbB0\r\u0017\u0019\u0003li4\u0012Ģ\u0004Lgʕ/4H4IZ^c\u0007\u001enH3b҇d'2܀\u0017\u00119`\u00079\u0002\u0014{\nl/\u00124ݏW#\u0011ƅ\u0003Q\u0005+3/\u0015cG`@X/\r\u0558aIQ\u0379N\u0006Mo{o@\u001bF_\u0015\u001dp\u001aê=W\u0019٣\u000f2dSch\u001fs\u0005[~R|$Ĺ\u0003\u0001\u0005ɚT\f\u0015U'Sμs2"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0013c\u0007/7v%\u001daN;*\u0012(\u001ds]B\u000bm5$", "", "u(E", "\u000fcS?X:L/)\u0012~e0x\u0016CD\u007f7wD\b%", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0013c\u0007/7v%\u001daN;A", "5dc\u000eW+KS'\rVn?\u0001\u00103a\r<Z@\u0010\u0013\u001bN}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0013W~\u0018=z,<#[*@|\u00167\\2Ov4s", "\u000fcS?X:L1#\u000f\u0004m9\u0011", "5dc\u000eW+KS'\rXh<\u0006\u0018<y", "\u000fcS?X:L:#|ve0\f\u001d", "5dc\u000eW+KS'\rah*x\u00103t\u0014", "\u000fcS?X:L@\u0019\u0001~h5", "5dc\u000eW+KS'\rg^.\u0001\u00138", "\u000fcS?X:LA(\fz^;", "5dc\u000eW+KS'\rhm9|\t>", "\u0010haA[\u000b:b\u0019]vr", "5dc\u000f\\9MVwz\n^\u000bx\u001d", "\u0010haA[\u000b:b\u0019_\u000be3", "5dc\u000f\\9MVwz\n^\r\r\u00106", "\u0010haA[\u000b:b\u0019f\u0005g;\u007f", "5dc\u000f\\9MVwz\n^\u0014\u0007\u0012>h", "\u0010haA[\u000b:b\u0019rzZ9", "5dc\u000f\\9MVwz\n^ |\u0005<", "\u0011qT1\\;\u001cO&}Zq7\u0001\u0016+t\u00042\u0005\u001f|&\u0017", "5dc\u0010e,=W(\\vk+\\\u001c:i\r$\u000bD\u000b uC~\u000e", "\u0011qT1\\;\u001cO&}Zq7\u0001\u0016+t\u00042\u0005\u001f|+", "5dc\u0010e,=W(\\vk+\\\u001c:i\r$\u000bD\u000b uC\u0004", "\u0011qT1\\;\u001cO&}Zq7\u0001\u0016+t\u00042\u0005(\u000b &J", "5dc\u0010e,=W(\\vk+\\\u001c:i\r$\u000bD\u000b ~Qx\u001d?", "\u0011qT1\\;\u001cO&}Zq7\u0001\u0016+t\u00042\u00054\u0001\u0013$", "5dc\u0010e,=W(\\vk+\\\u001c:i\r$\u000bD\u000b \u000bGk\u001b", "\u0011qT1\\;\u001cO&}cn4y\t<", "5dc\u0010e,=W(\\vk+e\u00197b\u007f5", "\u0011qT1\\;\u001cO&}h^*\r\u00163t\u0014\u0006\u0006?\u0001", "5dc\u0010e,=W(\\vk+j\t-u\r,\u000bT^!\u0016G", "\u0013lP6_\b=R&~\tl", "5dc\u0012`(BZt}yk,\u000b\u0017", "\u0015d]1X9", "5dc\u0014X5=S&", "\u001cdf\u001dT:Le#\fy", "5dc\u001bX>)O'\r\rh9{", "\u001cdf\"f,K\\\u0015\u0007z", "5dc\u001bX>.a\u0019\f\u0004Z4|", "\u001e`b@j6KR", "5dc\u001dT:Le#\fy", "\u001eda@b5\u001fW&\r\nG(\u0005\t", "5dc\u001dX9L]\"_~k:\fq+m\u007f", "\u001eda@b5\u001fc \u0006cZ4|", "5dc\u001dX9L]\"_\u000be3e\u00057e", "\u001eda@b5%O'\u000ecZ4|", "5dc\u001dX9L]\"evl;e\u00057e", "\u001eda@b5&W\u0018}\u0002^\u0010\u0006\r>i{/", "5dc\u001dX9L]\"f~]+\u0004\t\u0013n\u00047\u007f<\b", "\u001eda@b5&W\u0018}\u0002^\u0015x\u0011/", "5dc\u001dX9L]\"f~]+\u0004\t\u0018a\b(", "\u001eda@b5'O!~ek,}\rB", "5dc\u001dX9L]\"gvf,g\u0016/f\u0004;", "\u001eda@b5'O!~hn-}\rB", "5dc\u001dX9L]\"gvf,j\u00190f\u0004;", "\u001eg^;X\nHc\"\u000e\br\n\u0007\b/", "5dc\u001d[6GSv\t\u000bg;\n\u001d\ro~(", "\u001eg^;X\u0015N[\u0016~\b", "5dc\u001d[6GS\u0002\u000f\u0003[,\n", "\u001eg^;X\u0015N[\u0016~\b=,\u000e\r-e", "5dc\u001d[6GS\u0002\u000f\u0003[,\ng/v\u0004&{", "\u001eg^;X\u0015N[\u0016~\bG(\f\r9n{/", "5dc\u001d[6GS\u0002\u000f\u0003[,\nq+t\u00042\u0005<\b", "\u001enbAT3\u001aR\u0018\fzl:", "5dc\u001db:MO Zy]9|\u0017=", "\u001enbAT3\u001c]\u0018~", "5dc\u001db:MO \\\u0005],", "\u001enbAT3\u001c]\u0018~Zq;|\u0012.e~", "5dc\u001db:MO \\\u0005],\\\u001c>e\t'{?", "!lb\u001cg7\u001c]\u0018~", "5dc `:(b$\\\u0005],", "#rT?a(FS", "5dc\"f,K\\\u0015\u0007z", "4q^:", "D`[BX", "", "4q^:\u0017<BM&~\u0002^(\u000b\t", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContentType getUsername() {
            return ContentType.Username;
        }

        public final ContentType getPassword() {
            return ContentType.Password;
        }

        public final ContentType getEmailAddress() {
            return ContentType.EmailAddress;
        }

        public final ContentType getNewUsername() {
            return ContentType.NewUsername;
        }

        public final ContentType getNewPassword() {
            return ContentType.NewPassword;
        }

        public final ContentType getPostalAddress() {
            return ContentType.PostalAddress;
        }

        public final ContentType getPostalCode() {
            return ContentType.PostalCode;
        }

        public final ContentType getCreditCardNumber() {
            return ContentType.CreditCardNumber;
        }

        public final ContentType getCreditCardSecurityCode() {
            return ContentType.CreditCardSecurityCode;
        }

        public final ContentType getCreditCardExpirationDate() {
            return ContentType.CreditCardExpirationDate;
        }

        public final ContentType getCreditCardExpirationMonth() {
            return ContentType.CreditCardExpirationMonth;
        }

        public final ContentType getCreditCardExpirationYear() {
            return ContentType.CreditCardExpirationYear;
        }

        public final ContentType getCreditCardExpirationDay() {
            return ContentType.CreditCardExpirationDay;
        }

        public final ContentType getAddressCountry() {
            return ContentType.AddressCountry;
        }

        public final ContentType getAddressRegion() {
            return ContentType.AddressRegion;
        }

        public final ContentType getAddressLocality() {
            return ContentType.AddressLocality;
        }

        public final ContentType getAddressStreet() {
            return ContentType.AddressStreet;
        }

        public final ContentType getAddressAuxiliaryDetails() {
            return ContentType.AddressAuxiliaryDetails;
        }

        public final ContentType getPostalCodeExtended() {
            return ContentType.PostalCodeExtended;
        }

        public final ContentType getPersonFullName() {
            return ContentType.PersonFullName;
        }

        public final ContentType getPersonFirstName() {
            return ContentType.PersonFirstName;
        }

        public final ContentType getPersonLastName() {
            return ContentType.PersonLastName;
        }

        public final ContentType getPersonMiddleName() {
            return ContentType.PersonMiddleName;
        }

        public final ContentType getPersonMiddleInitial() {
            return ContentType.PersonMiddleInitial;
        }

        public final ContentType getPersonNamePrefix() {
            return ContentType.PersonNamePrefix;
        }

        public final ContentType getPersonNameSuffix() {
            return ContentType.PersonNameSuffix;
        }

        public final ContentType getPhoneNumber() {
            return ContentType.PhoneNumber;
        }

        public final ContentType getPhoneNumberDevice() {
            return ContentType.PhoneNumberDevice;
        }

        public final ContentType getPhoneCountryCode() {
            return ContentType.PhoneCountryCode;
        }

        public final ContentType getPhoneNumberNational() {
            return ContentType.PhoneNumberNational;
        }

        public final ContentType getGender() {
            return ContentType.Gender;
        }

        public final ContentType getBirthDateFull() {
            return ContentType.BirthDateFull;
        }

        public final ContentType getBirthDateDay() {
            return ContentType.BirthDateDay;
        }

        public final ContentType getBirthDateMonth() {
            return ContentType.BirthDateMonth;
        }

        public final ContentType getBirthDateYear() {
            return ContentType.BirthDateYear;
        }

        public final ContentType getSmsOtpCode() {
            return ContentType.SmsOtpCode;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final ContentType from$ui_release(String str) {
            switch (str.hashCode()) {
                case -1844815832:
                    if (str.equals(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH)) {
                        return getCreditCardExpirationMonth();
                    }
                    break;
                case -1821235109:
                    if (str.equals(HintConstants.AUTOFILL_HINT_NEW_PASSWORD)) {
                        return getNewPassword();
                    }
                    break;
                case -1757573738:
                    if (str.equals(HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE)) {
                        return getCreditCardSecurityCode();
                    }
                    break;
                case -1682373820:
                    if (str.equals(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY)) {
                        return getCreditCardExpirationDay();
                    }
                    break;
                case -1492157798:
                    if (str.equals(HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE_INITIAL)) {
                        return getPersonMiddleInitial();
                    }
                    break;
                case -1327425451:
                    if (str.equals(HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE)) {
                        return getPhoneCountryCode();
                    }
                    break;
                case -1249512767:
                    if (str.equals(HintConstants.AUTOFILL_HINT_GENDER)) {
                        return getGender();
                    }
                    break;
                case -1192969641:
                    if (str.equals(HintConstants.AUTOFILL_HINT_PHONE_NUMBER)) {
                        return getPhoneNumber();
                    }
                    break;
                case -1151034798:
                    if (str.equals(HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER)) {
                        return getCreditCardNumber();
                    }
                    break;
                case -1070931784:
                    if (str.equals(HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS)) {
                        return getEmailAddress();
                    }
                    break;
                case -782964728:
                    if (str.equals(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_REGION)) {
                        return getAddressRegion();
                    }
                    break;
                case -742913724:
                    if (str.equals(HintConstants.AUTOFILL_HINT_PERSON_NAME_FAMILY)) {
                        return getPersonLastName();
                    }
                    break;
                case -724274829:
                    if (str.equals(HintConstants.AUTOFILL_HINT_BIRTH_DATE_MONTH)) {
                        return getBirthDateMonth();
                    }
                    break;
                case -613980922:
                    if (str.equals(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE)) {
                        return getCreditCardExpirationDate();
                    }
                    break;
                case -613352043:
                    if (str.equals(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR)) {
                        return getCreditCardExpirationYear();
                    }
                    break;
                case -398527665:
                    if (str.equals(HintConstants.AUTOFILL_HINT_BIRTH_DATE_DAY)) {
                        return getBirthDateDay();
                    }
                    break;
                case -265713450:
                    if (str.equals("username")) {
                        return getUsername();
                    }
                    break;
                case -50595520:
                    if (str.equals(HintConstants.AUTOFILL_HINT_PHONE_NATIONAL)) {
                        return getPhoneNumberNational();
                    }
                    break;
                case 289393:
                    if (str.equals(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS)) {
                        return getAddressStreet();
                    }
                    break;
                case 146220155:
                    if (str.equals(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_ADDRESS)) {
                        return getAddressAuxiliaryDetails();
                    }
                    break;
                case 530622780:
                    if (str.equals(HintConstants.AUTOFILL_HINT_BIRTH_DATE_FULL)) {
                        return getBirthDateFull();
                    }
                    break;
                case 531173098:
                    if (str.equals(HintConstants.AUTOFILL_HINT_BIRTH_DATE_YEAR)) {
                        return getBirthDateYear();
                    }
                    break;
                case 678483840:
                    if (str.equals(HintConstants.AUTOFILL_HINT_PERSON_NAME)) {
                        return getPersonFullName();
                    }
                    break;
                case 956262285:
                    if (str.equals(HintConstants.AUTOFILL_HINT_PHONE_NUMBER_DEVICE)) {
                        return getPhoneNumberDevice();
                    }
                    break;
                case 991032982:
                    if (str.equals(HintConstants.AUTOFILL_HINT_NEW_USERNAME)) {
                        return getNewUsername();
                    }
                    break;
                case 1216985755:
                    if (str.equals(HintConstants.AUTOFILL_HINT_PASSWORD)) {
                        return getPassword();
                    }
                    break;
                case 1369618690:
                    if (str.equals(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_COUNTRY)) {
                        return getAddressCountry();
                    }
                    break;
                case 1617991537:
                    if (str.equals(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_POSTAL_CODE)) {
                        return getPostalCodeExtended();
                    }
                    break;
                case 1662667945:
                    if (str.equals(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS)) {
                        return getPostalAddress();
                    }
                    break;
                case 1781320055:
                    if (str.equals(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_LOCALITY)) {
                        return getAddressLocality();
                    }
                    break;
                case 1834963923:
                    if (str.equals(HintConstants.AUTOFILL_HINT_PERSON_NAME_GIVEN)) {
                        return getPersonFirstName();
                    }
                    break;
                case 1865618463:
                    if (str.equals(HintConstants.AUTOFILL_HINT_SMS_OTP)) {
                        return getSmsOtpCode();
                    }
                    break;
                case 1917507122:
                    if (str.equals(HintConstants.AUTOFILL_HINT_PERSON_NAME_PREFIX)) {
                        return getPersonNamePrefix();
                    }
                    break;
                case 1935279861:
                    if (str.equals(HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE)) {
                        return getPersonMiddleName();
                    }
                    break;
                case 2006194929:
                    if (str.equals(HintConstants.AUTOFILL_HINT_PERSON_NAME_SUFFIX)) {
                        return getPersonNameSuffix();
                    }
                    break;
                case 2011152728:
                    if (str.equals(HintConstants.AUTOFILL_HINT_POSTAL_CODE)) {
                        return getPostalCode();
                    }
                    break;
            }
            return new ContentType(str);
        }
    }

    public final ContentType plus$ui_release(ContentType contentType) {
        return new ContentType((Set<String>) SetsKt.plus((Set) this.contentHints, (Iterable) contentType.contentHints));
    }
}
