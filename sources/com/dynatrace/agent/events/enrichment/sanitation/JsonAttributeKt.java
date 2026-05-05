package com.dynatrace.agent.events.enrichment.sanitation;

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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!4i\bӵLc\u0003\u0013I\u0006F\u000b6B\u0005\"D1\u0006ј~lO/rdp.\u0001RZ\u0019y{L*k&\u0002CiWH~hޛҊRguqУ^\u000f"}, d2 = {"/o_9l\u001a:\\\u001d\u000e~s,\n\u0017", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017Q7t8-\u0011weC\u0010-\u0011\\\u00010#[]9`O\u0003L\u0014g", "A`]6g0SS&\r", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0001(\u0017P~\u001c\u0006v.B]{#?m\u001f=\u0017Q7t8-\u0011weC\u0010-\b]\u00064KI^;\\@nF\u0018!^#N8b", "uKR<`u=g\"z\nk(z\txa\u0002(\u0005OJ\u0017(Gx\u001dJ@%>f\u0002\u001e:u\u00167\\\rIg=\"$dp=\u0011lu3\u00051P(];iVoM#\u00120\u00045)\u0017\r#@8w@F,\u0004*IK7j\u0001\u0015%W5{pKe\u001e\u0011y\u001e\u0003E'kNYh\t\u0011OAk.s\bn!fC\u0004\u007f#\u0001&\u001fe`=\niO\u001ava}|gTn>\u001f\"Hu%EYxQK\u0002#\u001dKEs\u00142a\u0004tt>\u0004=9D.\u0005Tt\u001c<a\u0001\u00155k\u000b5\"?@\";Zg\u007fu\brv)jc\u001dqB5\u0016utc\u001e", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 2, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class JsonAttributeKt {
    public static final JsonAttribute applySanitizers(JsonAttribute jsonAttribute, AttributeSanitizer[] sanitizers) {
        Intrinsics.checkNotNullParameter(jsonAttribute, "<this>");
        Intrinsics.checkNotNullParameter(sanitizers, "sanitizers");
        for (AttributeSanitizer attributeSanitizer : sanitizers) {
            jsonAttribute = attributeSanitizer.sanitize(jsonAttribute);
            if (jsonAttribute == null) {
                return null;
            }
        }
        return jsonAttribute;
    }
}
