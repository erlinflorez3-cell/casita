package com.ticnow.sdk.idnowsecurity.http.nodes;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u000574\u0012\u000e\u0007nj?3Le^.ZS09\u0002ڔd$\n#2FтY\u001a\f\"Yg\\h\u007fnx\\aÃ\u001bو\u001a\u0005rߚaW~` \u0013RDuDAS@UGg\r63\"\tĹDѩ\t\r\"ݒ`\u0012|\u0003QO,\u00146I~@#%[\u000f2\u00124@vҼ*֔kZ>ԟ\u0005_@:1\u0007\nDT3m6Me\u001bSl';x8ӣ7Ë;A\u001dǬk\u0005\r`iC#AwL\u0013nw?9Y\fWdZVϳ!ۣS\u0019eö>^\u000bbn\u0010G-UuYV^@\u0006\u000e\u0014\rj\u0006d\u03813ρ29\"Ǒ \u00109\t\u0001W`R\bsP\u0006KyD-=\u007fa-\u0010ӜrЂeG!\u05cbO}\u000b$,'!p'sb\u00141-)m\u0010Q_k\u0017ׇtݳ\u000eeEЧ\u001crh\u001d8 PI\u0006L\n/~/3Vs9QABȼtזk\u0003\r\u009b\u0001UosVbBp\u001cZ8-\\rR\n\u001dk~V/\u0093\u001dܖ `\u000fâ \u0015&\u0003\u0006@A'\u0016u]n:\u0003[\u0006\"%]h\u000eձz«\u0012cAӔK7W\r\u001eerx\u001aiJhUptmk\f\t^~ζ>ʮn\u001c\u007fӻ\\P\u0012?@C\u0012\u001e:Y?\u001f--V16Bo~_ݧfӳ\u0014\u000b\\՜<\u0005oS\u0003\r!Rb!}mIa:.x\"[C(ڈ%łY.pؔ\u0015%\r1\u0002\u0004giRzZrf\u000ec08\u0016H;(ȄIт\u0013\u000b1Ʌ\u001a/K\u0002\u0001iqO\u0018]\t\u0003J'I Fg6lGݡlʧN[\\ϟ:xd+1\f\u0005\u0002\u007f\u001bT\u0001\u0018{bEs>wtYʢHҡ<\t\rȔ6'\u0007+0\u0001U/Ic+\u001cH,=Ry]\u0018q\u0005ӧnϪ*\u0001mֽDe\u001c.pU}4AwW_OV0d\u0005\u0003pJA̲\u0014ɚ\r@\u0015Ή`Cj2d<m\r5@t\r|%~\u001as:AqTҵ:ʡ.\u007fK͟,`Ii\u001fQsis3Yb[b\u001dP#{_phΙI֕Zcj־H\by_DE[d\u000b\u0005\u0017*\u0005DJQ#C\u0003k\\ؒ\u0007ķJk\u0017ğJDy\u0006d\u0012tzb\"V\u000bޣI-"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005[B\u001e\">", "", "u(E", "0haA[\u000b:b\u0019", "", "5dc\u000f\\9MVwz\n^", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000f\\9MVwz\n^", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "1`a1A<FP\u0019\f", "5dc\u0010T9=<)\u0007w^9", "Adc\u0010T9=<)\u0007w^9", "2mX\u0015T:)]\u001d\b\nl", "5dc\u0011a0!O'i\u0005b5\f\u0017", "Adc\u0011a0!O'i\u0005b5\f\u0017", "2nRB`,Gb|}zg;\u0001\n3e\r", "5dc\u0011b*N[\u0019\b\nB+|\u0012>i\u0001,{M", "Adc\u0011b*N[\u0019\b\nB+|\u0012>i\u0001,{M", "3lP6_", "5dc\u0012`(BZ", "Adc\u0012`(BZ", "3ma<_3FS\"\u000eYZ;|", "5dc\u0012a9HZ \u0007zg;[\u0005>e", "Adc\u0012a9HZ \u0007zg;[\u0005>e", "7c", "5dc\u0016W", "Adc\u0016W", "7mbA\\;Nb\u001d\t\u0004", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005O=,$lpI\u0016g6WL", "5dc\u0016a:MW(\u000f\nb6\u0006", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_7WB;y}\u0002\u001evp=\u0016s;R\u00010\u001d", "Adc\u0016a:MW(\u000f\nb6\u0006", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7\u001f8LCI5\u0018'#weH\u0017r0X\u007f|\u000b=", "7mbA\\;Nb\u001d\t\u0004L,~\u0011/n\u000f", "\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bn8h\r+\u0001v -MQ\u0005O=,$lpI\u0016g6Wd'ITN5k(", "5dc\u0016a:MW(\u000f\nb6\u0006v/g\b(\u0005O", "u(;0b4\bb\u001d|\u0004h>F\u0017.kI,zI\u000b)%Gm\u001eIz4I#\u0001/Fx_7WB;y}\u0002\u001evp=\u0016s;R\u000105LP4\\[\u0002\u0013", "Adc\u0016a:MW(\u000f\nb6\u0006v/g\b(\u0005O", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~\\\r/B7\u001f8LCI5\u0018'#weH\u0017r0X\u007f\u0015GNV,eaH\u0001\u0005", ":`bA4*<S'\r", "5dc\u0019T:M/\u0017|zl:", "Adc\u0019T:M/\u0017|zl:", ":`bA4*<S'\rXa(\u0006\u0012/l", "5dc\u0019T:M/\u0017|zl:Z\f+n\t(\u0003", "Adc\u0019T:M/\u0017|zl:Z\f+n\t(\u0003", ":dV._\u0010GR\u001d|vm6\n", "5dc\u0019X.:Z|\byb*x\u00189r", "Adc\u0019X.:Z|\byb*x\u00189r", ";h]6`(E3\"\f\u0005e3j\u00079r\u00041}", "5dc\u001a\\5B[\u0015\u0006Zg9\u0007\u00106S}2\tD\n\u0019", "Adc\u001a\\5B[\u0015\u0006Zg9\u0007\u00106S}2\tD\n\u0019", ";h]6`(EB&z\u0004l(z\u00183o\t\u0016yJ\u000e\u001b I", "5dc\u001a\\5B[\u0015\u0006ik(\u0006\u0017+c\u000f,\u0006In\u0015!Ts\u0017>", "Adc\u001a\\5B[\u0015\u0006ik(\u0006\u0017+c\u000f,\u0006In\u0015!Ts\u0017>", "<`c6b5:Z\u001d\u000e\u000f", "5dc\u001bT;B]\"z\u0002b;\u0011", "Adc\u001bT;B]\"z\u0002b;\u0011", "@dV6f;>`\u0019}bh)\u0001\u0010/N\u00100x@\u000e", "5dc\u001fX.Ba(~\b^+d\u0013,i\u0007(dP\t\u0014\u0017T", "Adc\u001fX.Ba(~\b^+d\u0013,i\u0007(dP\t\u0014\u0017T", "Adg", "5dc X?", "Adc X?", "Ar]", "5dc f5", "Adc f5", "AsPAh:", "5dc g(Mc'", "Adc g(Mc'", "CrT?<+", "5dc\"f,K7\u0018", "Adc\"f,K7\u0018", "CrT?C,Ka#\bjn0{", "5dc\"f,K>\u0019\f\th5l\u00193d", "Adc\"f,K>\u0019\f\th5l\u00193d", "CrT?G@IS", "5dc\"f,KB-\nz", "Adc\"f,KB-\nz", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class User {
    public Institution institution;
    public InstitutionSegment institutionSegment;
    private String birthDate = "";
    private String cardNumber = "";
    private String dniHasPoints = "";
    private String documentIdentifier = "";
    private String email = "";
    private String enrollmentDate = "";
    private String id = "";
    private String lastAccess = "";
    private String lastAccessChannel = "";
    private String legalIndicator = "";
    private String minimalEnrollScoring = "";
    private String minimalTransactionScoring = "";
    private String nationality = "";
    private String registeredMobileNumber = "";
    private String sex = "";
    private String ssn = "";
    private String status = "";
    private String userId = "";
    private String userPersonUuid = "";
    private String userType = "";

    public final String getBirthDate() {
        return this.birthDate;
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final String getDniHasPoints() {
        return this.dniHasPoints;
    }

    public final String getDocumentIdentifier() {
        return this.documentIdentifier;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getEnrollmentDate() {
        return this.enrollmentDate;
    }

    public final String getId() {
        return this.id;
    }

    public final Institution getInstitution() {
        Institution institution = this.institution;
        if (institution == null) {
            Intrinsics.throwUninitializedPropertyAccessException("institution");
        }
        return institution;
    }

    public final InstitutionSegment getInstitutionSegment() {
        InstitutionSegment institutionSegment = this.institutionSegment;
        if (institutionSegment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("institutionSegment");
        }
        return institutionSegment;
    }

    public final String getLastAccess() {
        return this.lastAccess;
    }

    public final String getLastAccessChannel() {
        return this.lastAccessChannel;
    }

    public final String getLegalIndicator() {
        return this.legalIndicator;
    }

    public final String getMinimalEnrollScoring() {
        return this.minimalEnrollScoring;
    }

    public final String getMinimalTransactionScoring() {
        return this.minimalTransactionScoring;
    }

    public final String getNationality() {
        return this.nationality;
    }

    public final String getRegisteredMobileNumber() {
        return this.registeredMobileNumber;
    }

    public final String getSex() {
        return this.sex;
    }

    public final String getSsn() {
        return this.ssn;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserPersonUuid() {
        return this.userPersonUuid;
    }

    public final String getUserType() {
        return this.userType;
    }

    public final void setBirthDate(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.birthDate = str;
    }

    public final void setCardNumber(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.cardNumber = str;
    }

    public final void setDniHasPoints(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.dniHasPoints = str;
    }

    public final void setDocumentIdentifier(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.documentIdentifier = str;
    }

    public final void setEmail(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.email = str;
    }

    public final void setEnrollmentDate(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.enrollmentDate = str;
    }

    public final void setId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.id = str;
    }

    public final void setInstitution(Institution institution) {
        Intrinsics.checkParameterIsNotNull(institution, "<set-?>");
        this.institution = institution;
    }

    public final void setInstitutionSegment(InstitutionSegment institutionSegment) {
        Intrinsics.checkParameterIsNotNull(institutionSegment, "<set-?>");
        this.institutionSegment = institutionSegment;
    }

    public final void setLastAccess(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.lastAccess = str;
    }

    public final void setLastAccessChannel(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.lastAccessChannel = str;
    }

    public final void setLegalIndicator(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.legalIndicator = str;
    }

    public final void setMinimalEnrollScoring(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.minimalEnrollScoring = str;
    }

    public final void setMinimalTransactionScoring(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.minimalTransactionScoring = str;
    }

    public final void setNationality(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.nationality = str;
    }

    public final void setRegisteredMobileNumber(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.registeredMobileNumber = str;
    }

    public final void setSex(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.sex = str;
    }

    public final void setSsn(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.ssn = str;
    }

    public final void setStatus(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.status = str;
    }

    public final void setUserId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.userId = str;
    }

    public final void setUserPersonUuid(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.userPersonUuid = str;
    }

    public final void setUserType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.userType = str;
    }
}
