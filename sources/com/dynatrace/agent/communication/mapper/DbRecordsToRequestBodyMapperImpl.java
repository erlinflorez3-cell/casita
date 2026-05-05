package com.dynatrace.agent.communication.mapper;

import com.dynatrace.agent.communication.protocol.EventRequestEnvelope;
import com.dynatrace.agent.storage.db.EventRecord;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4E\u0007\":\u001e\u007fјnjGNLe^.Zݷ0ş\u0002ڔd$\n#2PKY(}:\t}O˗kpP\\\u0019FW\u001a$~\u0003,w\\)g \u0017JH\u007fACM\u001eGgi;JU2@\"Py3\u0002pݩJǘz\u0001Kŷ$\u00146D~?Ŏ\u0011X"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001u\u00129XCH5\u0013\u001b\u0002h_C\u0014b:=\u0001\u0014GX^,jaOG\u0013&B\nY6\r\u0012=I/u\u001a", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n~!\u001fO\u007f\u0017@t!D]\b)\u0001u\u00129XCH5\u0013\u001b\u0002h_C\u0014b:=\u0001\u0014GX^,jaOG\u0013&B\nY6\r\u0012/", "2`c.I,Ka\u001d\t\u0004", "", "\nh]6g\u0005", "uH\u0018#", "5dc\u0011T;:D\u0019\f\tb6\u0006", "u(8", ";`_", "", "7m_Bg", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u000f&!Tk\u0010<@$2#]17v%\u001bMAEx3s", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class DbRecordsToRequestBodyMapperImpl implements DbRecordsToRequestBodyMapper {
    private final int dataVersion;

    public DbRecordsToRequestBodyMapperImpl(int i2) {
        this.dataVersion = i2;
    }

    @Override // com.dynatrace.agent.communication.mapper.DbRecordsToRequestBodyMapper
    public int getDataVersion() {
        return this.dataVersion;
    }

    @Override // com.dynatrace.agent.common.Mapper
    public /* bridge */ /* synthetic */ String map(List<? extends EventRecord> list) {
        return map2((List<EventRecord>) list);
    }

    /* JADX INFO: renamed from: map, reason: avoid collision after fix types in other method */
    public String map2(List<EventRecord> input) {
        Intrinsics.checkNotNullParameter(input, "input");
        StringBuilder sb = new StringBuilder(EventRequestEnvelope.INSTANCE.buildEnvelopeHeader$com_dynatrace_agent_release(getDataVersion()));
        Iterator<T> it = input.iterator();
        while (it.hasNext()) {
            sb.append(((EventRecord) it.next()).getEvent() + AbstractJsonLexerKt.COMMA);
        }
        if (!input.isEmpty()) {
            Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(StringsKt.getLastIndex(sb)), "deleteCharAt(...)");
        }
        sb.append(EventRequestEnvelope.INSTANCE.getEnvelopeSuffix$com_dynatrace_agent_release());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
