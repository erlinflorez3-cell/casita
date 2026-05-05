package androidx.compose.ui.autofill;

import kotlin.Metadata;
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
/* JADX INFO: compiled from: AutofillType.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz(Gْ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001\u000b\tURPgtOC\u000bI\u0015n\u0016~q\u0015I[\u0001F\u0012\u0015;+oE=6oCDIt<\u0011\t2(Eb\u0005\u0007(\u0013H\u0016\u0006cCQ\u001cz0F\u0002#R\u0013_m\u001a\u0018\u0019' \u00072EgTK1lcP\u0018#\t\u0001+N-w\u0019|S&/T-'_a$F)7;1\u000eS\t$;[E!(qC$Q'-K2s]WA\u007f\u001a7\u0014O\u0013\u0001[&b)Œd1"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0011i\r*8q\u001d5<WFk\n", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0013lP6_\b=R&~\tl", "#rT?a(FS", "\u001e`b@j6KR", "\u001cdf\"f,K\\\u0015\u0007z", "\u001cdf\u001dT:Le#\fy", "\u001enbAT3\u001aR\u0018\fzl:", "\u001enbAT3\u001c]\u0018~", "\u0011qT1\\;\u001cO&}cn4y\t<", "\u0011qT1\\;\u001cO&}h^*\r\u00163t\u0014\u0006\u0006?\u0001", "\u0011qT1\\;\u001cO&}Zq7\u0001\u0016+t\u00042\u0005\u001f|&\u0017", "\u0011qT1\\;\u001cO&}Zq7\u0001\u0016+t\u00042\u0005(\u000b &J", "\u0011qT1\\;\u001cO&}Zq7\u0001\u0016+t\u00042\u00054\u0001\u0013$", "\u0011qT1\\;\u001cO&}Zq7\u0001\u0016+t\u00042\u0005\u001f|+", "\u000fcS?X:L1#\u000f\u0004m9\u0011", "\u000fcS?X:L@\u0019\u0001~h5", "\u000fcS?X:L:#|ve0\f\u001d", "\u000fcS?X:LA(\fz^;", "\u000fcS?X:L/)\u0012~e0x\u0016CD\u007f7wD\b%", "\u001enbAT3\u001c]\u0018~Zq;|\u0012.e~", "\u001eda@b5\u001fc \u0006cZ4|", "\u001eda@b5\u001fW&\r\nG(\u0005\t", "\u001eda@b5%O'\u000ecZ4|", "\u001eda@b5&W\u0018}\u0002^\u0015x\u0011/", "\u001eda@b5&W\u0018}\u0002^\u0010\u0006\r>i{/", "\u001eda@b5'O!~ek,}\rB", "\u001eda@b5'O!~hn-}\rB", "\u001eg^;X\u0015N[\u0016~\b", "\u001eg^;X\u0015N[\u0016~\b=,\u000e\r-e", "\u001eg^;X\nHc\"\u000e\br\n\u0007\b/", "\u001eg^;X\u0015N[\u0016~\bG(\f\r9n{/", "\u0015d]1X9", "\u0010haA[\u000b:b\u0019_\u000be3", "\u0010haA[\u000b:b\u0019]vr", "\u0010haA[\u000b:b\u0019f\u0005g;\u007f", "\u0010haA[\u000b:b\u0019rzZ9", "!lb\u001cg7\u001c]\u0018~", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public enum AutofillType {
    EmailAddress,
    Username,
    Password,
    NewUsername,
    NewPassword,
    PostalAddress,
    PostalCode,
    CreditCardNumber,
    CreditCardSecurityCode,
    CreditCardExpirationDate,
    CreditCardExpirationMonth,
    CreditCardExpirationYear,
    CreditCardExpirationDay,
    AddressCountry,
    AddressRegion,
    AddressLocality,
    AddressStreet,
    AddressAuxiliaryDetails,
    PostalCodeExtended,
    PersonFullName,
    PersonFirstName,
    PersonLastName,
    PersonMiddleName,
    PersonMiddleInitial,
    PersonNamePrefix,
    PersonNameSuffix,
    PhoneNumber,
    PhoneNumberDevice,
    PhoneCountryCode,
    PhoneNumberNational,
    Gender,
    BirthDateFull,
    BirthDateDay,
    BirthDateMonth,
    BirthDateYear,
    SmsOtpCode
}
