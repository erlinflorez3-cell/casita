package defpackage;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import okio.ByteString;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я;\u001d̉=!4i\bDZc|İI\u0006>-6B\r(4\u0012\u000e\u0007nj?8LeV.Zݷ2\u000f\u0002{<$q$yCAU\"}8\tWNmg\u0017Iҙ\u0011K%إF~z.YU']@\u000ezP}KKM\u001e@id\u0003C\u001d `\"~\u000eM\u0017(8`\u0010%\nsO\u001a\"H@\u001fK\u0003\u0011[\u00122\u00124>f\u0015fru\\NH\u001blj31\u0013\u0002B|9\u00104\u000bZ%F\u0003'S\u000b*,9SO5C%\u0004\u0007\u0015fs?1T8QMv5=CI\"Wf\\\u000e!-+}\r$\u0007v\b\u0013Rx\u001e79_o[R\u001e(&}\f\u000fL\u0004<\nUJ\\,P'^ԇޜtɤWJX\u0004dI\u000e\u0003y8\u001d*\u000e9{d)oisK'^C\f\u0007\u001d\u001eQ\u0004~#kT<dC\u001d\u0003v\bq(̸ׅHݳ\u000ecEo\n{p\nB\u00066Q\u000e5ɮ\u0015E"}, d2 = {"\"n\\/f;H\\\u0019=Xh4\b\u00058i\n1:\u001c_r\u00026OzzB", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u001aS^:U:M]\"~P", "Bga2T+L/\u0018z\u0006m,\n", "", "", "\u001aSW?X(=)", "5dc![9>O\u0018\rV](\b\u0018/r", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nk$!Vyi;r0DY\u000bu", "Bga2T+L/\u0018z\u0006m,\nG.e\u0007(}<\u0010\u0017", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "5tT@g&MV&~v]:X\b+p\u000f(\t", "5dc\u0014h,Lb\u0013\u000e}k,x\b=A~$\u0007O\u0001$", "5tT@g&MV&~v]:X\b+p\u000f(\t~\u007f\u0017\u001eGq\nKv", "3mR<W,=A\u001d\u0014z", "D`[BX", "3mR<W,", "", "EqXAX9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!9|\u0012Kv2\u000b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqh@\u0012\u0017$UoxI\u00014?K\u000b$Fm#\u0004", "2dR<W,", "@dP1X9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u000b", "@dS.V;", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class Tombstone$Companion$ADAPTER$1 extends ProtoAdapter<Tombstone> {
    private final Lazy guest_threadsAdapter$delegate;
    private final Lazy threadsAdapter$delegate;

    Tombstone$Companion$ADAPTER$1(FieldEncoding fieldEncoding, KClass<Tombstone> kClass, Syntax syntax) {
        super(fieldEncoding, kClass, "type.googleapis.com/Tombstone", syntax, (Object) null, "tombstone.proto");
        this.threadsAdapter$delegate = LazyKt.lazy(new Function0() { // from class: Tombstone$Companion$ADAPTER$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Tombstone$Companion$ADAPTER$1.threadsAdapter_delegate$lambda$0();
            }
        });
        this.guest_threadsAdapter$delegate = LazyKt.lazy(new Function0() { // from class: Tombstone$Companion$ADAPTER$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Tombstone$Companion$ADAPTER$1.guest_threadsAdapter_delegate$lambda$1();
            }
        });
    }

    private final ProtoAdapter<Map<Integer, Thread>> getGuest_threadsAdapter() {
        return (ProtoAdapter) this.guest_threadsAdapter$delegate.getValue();
    }

    private final ProtoAdapter<Map<Integer, Thread>> getThreadsAdapter() {
        return (ProtoAdapter) this.threadsAdapter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter guest_threadsAdapter_delegate$lambda$1() {
        return ProtoAdapter.Companion.newMapAdapter(ProtoAdapter.UINT32, Thread.ADAPTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter threadsAdapter_delegate$lambda$0() {
        return ProtoAdapter.Companion.newMapAdapter(ProtoAdapter.UINT32, Thread.ADAPTER);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public Tombstone decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Architecture architectureDecode = Architecture.ARM32;
        Architecture architectureDecode2 = Architecture.ARM32;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long jBeginMessage = reader.beginMessage();
        String strDecode = "";
        int iIntValue = 0;
        Signal signalDecode = null;
        String strDecode2 = "";
        String strDecode3 = strDecode2;
        String strDecode4 = strDecode3;
        int iIntValue2 = 0;
        int iIntValue3 = 0;
        int iIntValue4 = 0;
        int iIntValue5 = 0;
        boolean zBooleanValue = false;
        StackHistoryBuffer stackHistoryBufferDecode = null;
        String strDecode5 = strDecode4;
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                return new Tombstone(architectureDecode, architectureDecode2, strDecode5, strDecode4, strDecode, iIntValue, iIntValue2, iIntValue3, strDecode2, arrayList, iIntValue4, signalDecode, strDecode3, arrayList2, arrayList3, linkedHashMap, linkedHashMap2, arrayList4, arrayList5, arrayList6, iIntValue5, zBooleanValue, stackHistoryBufferDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            switch (iNextTag) {
                case 1:
                    try {
                        architectureDecode = Architecture.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                    }
                    break;
                case 2:
                    strDecode5 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 3:
                    strDecode4 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 4:
                    strDecode = ProtoAdapter.STRING.decode(reader);
                    break;
                case 5:
                    iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                    break;
                case 6:
                    iIntValue2 = ProtoAdapter.UINT32.decode(reader).intValue();
                    break;
                case 7:
                    iIntValue3 = ProtoAdapter.UINT32.decode(reader).intValue();
                    break;
                case 8:
                    strDecode2 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 9:
                    arrayList.add(ProtoAdapter.STRING.decode(reader));
                    break;
                case 10:
                    signalDecode = Signal.ADAPTER.decode(reader);
                    break;
                case 11:
                case 12:
                case 13:
                default:
                    reader.readUnknownField(iNextTag);
                    break;
                case 14:
                    strDecode3 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 15:
                    arrayList3.add(Cause.ADAPTER.decode(reader));
                    break;
                case 16:
                    linkedHashMap.putAll(getThreadsAdapter().decode(reader));
                    break;
                case 17:
                    arrayList4.add(MemoryMapping.ADAPTER.decode(reader));
                    break;
                case 18:
                    arrayList5.add(LogBuffer.ADAPTER.decode(reader));
                    break;
                case 19:
                    arrayList6.add(FD.ADAPTER.decode(reader));
                    break;
                case 20:
                    iIntValue4 = ProtoAdapter.UINT32.decode(reader).intValue();
                    break;
                case 21:
                    arrayList2.add(CrashDetail.ADAPTER.decode(reader));
                    break;
                case 22:
                    iIntValue5 = ProtoAdapter.UINT32.decode(reader).intValue();
                    break;
                case 23:
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    break;
                case 24:
                    try {
                        architectureDecode2 = Architecture.ADAPTER.decode(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                    }
                    break;
                case 25:
                    linkedHashMap2.putAll(getGuest_threadsAdapter().decode(reader));
                    break;
                case 26:
                    stackHistoryBufferDecode = StackHistoryBuffer.ADAPTER.decode(reader);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, Tombstone value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.getArch() != Architecture.ARM32) {
            Architecture.ADAPTER.encodeWithTag(writer, 1, value.getArch());
        }
        if (value.getGuest_arch() != Architecture.ARM32) {
            Architecture.ADAPTER.encodeWithTag(writer, 24, value.getGuest_arch());
        }
        if (!Intrinsics.areEqual(value.getBuild_fingerprint(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getBuild_fingerprint());
        }
        if (!Intrinsics.areEqual(value.getRevision(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getRevision());
        }
        if (!Intrinsics.areEqual(value.getTimestamp(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getTimestamp());
        }
        if (value.getPid() != 0) {
            ProtoAdapter.UINT32.encodeWithTag(writer, 5, Integer.valueOf(value.getPid()));
        }
        if (value.getTid() != 0) {
            ProtoAdapter.UINT32.encodeWithTag(writer, 6, Integer.valueOf(value.getTid()));
        }
        if (value.getUid() != 0) {
            ProtoAdapter.UINT32.encodeWithTag(writer, 7, Integer.valueOf(value.getUid()));
        }
        if (!Intrinsics.areEqual(value.getSelinux_label(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 8, value.getSelinux_label());
        }
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 9, value.getCommand_line());
        if (value.getProcess_uptime() != 0) {
            ProtoAdapter.UINT32.encodeWithTag(writer, 20, Integer.valueOf(value.getProcess_uptime()));
        }
        if (value.getSignal_info() != null) {
            Signal.ADAPTER.encodeWithTag(writer, 10, value.getSignal_info());
        }
        if (!Intrinsics.areEqual(value.getAbort_message(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 14, value.getAbort_message());
        }
        CrashDetail.ADAPTER.asRepeated().encodeWithTag(writer, 21, value.getCrash_details());
        Cause.ADAPTER.asRepeated().encodeWithTag(writer, 15, value.getCauses());
        getThreadsAdapter().encodeWithTag(writer, 16, value.getThreads());
        getGuest_threadsAdapter().encodeWithTag(writer, 25, value.getGuest_threads());
        MemoryMapping.ADAPTER.asRepeated().encodeWithTag(writer, 17, value.getMemory_mappings());
        LogBuffer.ADAPTER.asRepeated().encodeWithTag(writer, 18, value.getLog_buffers());
        FD.ADAPTER.asRepeated().encodeWithTag(writer, 19, value.getOpen_fds());
        if (value.getPage_size() != 0) {
            ProtoAdapter.UINT32.encodeWithTag(writer, 22, Integer.valueOf(value.getPage_size()));
        }
        if (value.getHas_been_16kb_mode()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 23, Boolean.valueOf(value.getHas_been_16kb_mode()));
        }
        if (value.getStack_history_buffer() != null) {
            StackHistoryBuffer.ADAPTER.encodeWithTag(writer, 26, value.getStack_history_buffer());
        }
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, Tombstone value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(value.unknownFields());
        if (value.getStack_history_buffer() != null) {
            StackHistoryBuffer.ADAPTER.encodeWithTag(writer, 26, value.getStack_history_buffer());
        }
        if (value.getHas_been_16kb_mode()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 23, Boolean.valueOf(value.getHas_been_16kb_mode()));
        }
        if (value.getPage_size() != 0) {
            ProtoAdapter.UINT32.encodeWithTag(writer, 22, Integer.valueOf(value.getPage_size()));
        }
        FD.ADAPTER.asRepeated().encodeWithTag(writer, 19, value.getOpen_fds());
        LogBuffer.ADAPTER.asRepeated().encodeWithTag(writer, 18, value.getLog_buffers());
        MemoryMapping.ADAPTER.asRepeated().encodeWithTag(writer, 17, value.getMemory_mappings());
        getGuest_threadsAdapter().encodeWithTag(writer, 25, value.getGuest_threads());
        getThreadsAdapter().encodeWithTag(writer, 16, value.getThreads());
        Cause.ADAPTER.asRepeated().encodeWithTag(writer, 15, value.getCauses());
        CrashDetail.ADAPTER.asRepeated().encodeWithTag(writer, 21, value.getCrash_details());
        if (!Intrinsics.areEqual(value.getAbort_message(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 14, value.getAbort_message());
        }
        if (value.getSignal_info() != null) {
            Signal.ADAPTER.encodeWithTag(writer, 10, value.getSignal_info());
        }
        if (value.getProcess_uptime() != 0) {
            ProtoAdapter.UINT32.encodeWithTag(writer, 20, Integer.valueOf(value.getProcess_uptime()));
        }
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 9, value.getCommand_line());
        if (!Intrinsics.areEqual(value.getSelinux_label(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 8, value.getSelinux_label());
        }
        if (value.getUid() != 0) {
            ProtoAdapter.UINT32.encodeWithTag(writer, 7, Integer.valueOf(value.getUid()));
        }
        if (value.getTid() != 0) {
            ProtoAdapter.UINT32.encodeWithTag(writer, 6, Integer.valueOf(value.getTid()));
        }
        if (value.getPid() != 0) {
            ProtoAdapter.UINT32.encodeWithTag(writer, 5, Integer.valueOf(value.getPid()));
        }
        if (!Intrinsics.areEqual(value.getTimestamp(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getTimestamp());
        }
        if (!Intrinsics.areEqual(value.getRevision(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getRevision());
        }
        if (!Intrinsics.areEqual(value.getBuild_fingerprint(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getBuild_fingerprint());
        }
        if (value.getGuest_arch() != Architecture.ARM32) {
            Architecture.ADAPTER.encodeWithTag(writer, 24, value.getGuest_arch());
        }
        if (value.getArch() != Architecture.ARM32) {
            Architecture.ADAPTER.encodeWithTag(writer, 1, value.getArch());
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(Tombstone value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.unknownFields().size();
        if (value.getArch() != Architecture.ARM32) {
            size += Architecture.ADAPTER.encodedSizeWithTag(1, value.getArch());
        }
        if (value.getGuest_arch() != Architecture.ARM32) {
            size += Architecture.ADAPTER.encodedSizeWithTag(24, value.getGuest_arch());
        }
        if (!Intrinsics.areEqual(value.getBuild_fingerprint(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getBuild_fingerprint());
        }
        if (!Intrinsics.areEqual(value.getRevision(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getRevision());
        }
        if (!Intrinsics.areEqual(value.getTimestamp(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getTimestamp());
        }
        if (value.getPid() != 0) {
            size += ProtoAdapter.UINT32.encodedSizeWithTag(5, Integer.valueOf(value.getPid()));
        }
        if (value.getTid() != 0) {
            size += ProtoAdapter.UINT32.encodedSizeWithTag(6, Integer.valueOf(value.getTid()));
        }
        if (value.getUid() != 0) {
            size += ProtoAdapter.UINT32.encodedSizeWithTag(7, Integer.valueOf(value.getUid()));
        }
        if (!Intrinsics.areEqual(value.getSelinux_label(), "")) {
            size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getSelinux_label());
        }
        int iEncodedSizeWithTag = size + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(9, value.getCommand_line());
        if (value.getProcess_uptime() != 0) {
            iEncodedSizeWithTag += ProtoAdapter.UINT32.encodedSizeWithTag(20, Integer.valueOf(value.getProcess_uptime()));
        }
        if (value.getSignal_info() != null) {
            iEncodedSizeWithTag += Signal.ADAPTER.encodedSizeWithTag(10, value.getSignal_info());
        }
        if (!Intrinsics.areEqual(value.getAbort_message(), "")) {
            iEncodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getAbort_message());
        }
        int iEncodedSizeWithTag2 = iEncodedSizeWithTag + CrashDetail.ADAPTER.asRepeated().encodedSizeWithTag(21, value.getCrash_details()) + Cause.ADAPTER.asRepeated().encodedSizeWithTag(15, value.getCauses()) + getThreadsAdapter().encodedSizeWithTag(16, value.getThreads()) + getGuest_threadsAdapter().encodedSizeWithTag(25, value.getGuest_threads()) + MemoryMapping.ADAPTER.asRepeated().encodedSizeWithTag(17, value.getMemory_mappings()) + LogBuffer.ADAPTER.asRepeated().encodedSizeWithTag(18, value.getLog_buffers()) + FD.ADAPTER.asRepeated().encodedSizeWithTag(19, value.getOpen_fds());
        if (value.getPage_size() != 0) {
            iEncodedSizeWithTag2 += ProtoAdapter.UINT32.encodedSizeWithTag(22, Integer.valueOf(value.getPage_size()));
        }
        if (value.getHas_been_16kb_mode()) {
            iEncodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(23, Boolean.valueOf(value.getHas_been_16kb_mode()));
        }
        return value.getStack_history_buffer() != null ? iEncodedSizeWithTag2 + StackHistoryBuffer.ADAPTER.encodedSizeWithTag(26, value.getStack_history_buffer()) : iEncodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public Tombstone redact(Tombstone value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Signal signal_info = value.getSignal_info();
        Signal signalRedact = signal_info != null ? Signal.ADAPTER.redact(signal_info) : null;
        List listM8724redactElements = Internal.m8724redactElements(value.getCrash_details(), CrashDetail.ADAPTER);
        List listM8724redactElements2 = Internal.m8724redactElements(value.getCauses(), Cause.ADAPTER);
        Map mapM8725redactElements = Internal.m8725redactElements(value.getThreads(), Thread.ADAPTER);
        Map mapM8725redactElements2 = Internal.m8725redactElements(value.getGuest_threads(), Thread.ADAPTER);
        List listM8724redactElements3 = Internal.m8724redactElements(value.getMemory_mappings(), MemoryMapping.ADAPTER);
        List listM8724redactElements4 = Internal.m8724redactElements(value.getLog_buffers(), LogBuffer.ADAPTER);
        List listM8724redactElements5 = Internal.m8724redactElements(value.getOpen_fds(), FD.ADAPTER);
        StackHistoryBuffer stack_history_buffer = value.getStack_history_buffer();
        return Tombstone.copy$default(value, null, null, null, null, null, 0, 0, 0, null, null, 0, signalRedact, null, listM8724redactElements, listM8724redactElements2, mapM8725redactElements, mapM8725redactElements2, listM8724redactElements3, listM8724redactElements4, listM8724redactElements5, 0, false, stack_history_buffer != null ? StackHistoryBuffer.ADAPTER.redact(stack_history_buffer) : null, ByteString.EMPTY, 3151871, null);
    }
}
