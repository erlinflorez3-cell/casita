package androidx.room.util;

import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: compiled from: StringUtil.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d̉=!,x\bDRo|\u0004G\b8\u000b<B\u0007Ӭ4\u0012\u000e\u0007nʑA0RkP.XS2\u000fy\u001a<$a%\nWIY2}P\u000e\u007fRum\u0007J\t\u0012s\u0013\u0014\u001e\u0011jZRm\u000fk\u001c'4Xnm3}{KDx|F\u000702PA\u0010\u0004/&BL\u001e\u0004\u0013Cy\u0013*FN~RZ\u001dO\u0015\u001a@\u000fT\u001f/*\rm\\A`ns9]##\bP÷?g@\u0001]\u000f\\SU\r%`T/\u0017˂7չ)[\u000b\u0007`^O\u0005ErK\u0007ػ+6"}, d2 = {"\u0013L?!L&,B\u0006bc@&Xu\u001cAs", "", "", "5dc\u0012@\u0017-G\u0013liK\u0010ej)Al\u0015W4?\u0013 Py\u001d8\u0006)?b\f", "u(E", ")KY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}", "/o_2a+)Z\u0015|za6\u0004\b/r\u000e", "", "0tX9W,K", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "1nd;g", "", "8nX;<5M]\u0007\u000e\bb5~", "7m_Bg", "", "<df g9B\\\u001b[\u000bb3{\t<", "Ao[6g\u001bH7\"\u000eab:\f", "@n^: 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class StringUtil {
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    public static /* synthetic */ void getEMPTY_STRING_ARRAY$annotations() {
    }

    public static final StringBuilder newStringBuilder() {
        return new StringBuilder();
    }

    public static final void appendPlaceholders(StringBuilder builder, int i2) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        for (int i3 = 0; i3 < i2; i3++) {
            builder.append(Global.QUESTION);
            if (i3 < i2 - 1) {
                builder.append(",");
            }
        }
    }

    public static final List<Integer> splitToIntList(String str) {
        List listSplit$default;
        Integer numValueOf;
        if (str == null || (listSplit$default = StringsKt.split$default((CharSequence) str, new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, (Object) null)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) it.next()));
            } catch (NumberFormatException e2) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        return arrayList;
    }

    public static final String joinIntoString(List<Integer> list) {
        if (list != null) {
            return CollectionsKt.joinToString$default(list, ",", null, null, 0, null, null, 62, null);
        }
        return null;
    }
}
