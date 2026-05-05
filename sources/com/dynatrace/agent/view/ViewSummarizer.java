package com.dynatrace.agent.view;

import com.dynatrace.agent.communication.network.response.JsonExtensionKt;
import com.dynatrace.agent.events.enrichment.EventKeys;
import com.dynatrace.agent.util.HexGenerator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
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
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6Ȑ\u0007\":\u0019\u007fјnjG6LeN2ZS8\u0018sڔ<$q$yّCU(}*\tUNog|Vb\u000bI\u0012\u000e\u0016\u000fj4I[xc܈%˰rom2\u000etެ=bz6\u0013!z&F\u000b\u001d\u0001H<\u00110\u0005\u000e[K:$`F~Nj\u000fc\u0004H'6D.\u00176^}Md]\u001daH3;\u0003\u0018G\u0017;mC\u0015M;X\u0005+\u001b\u0006y\u001eYPg9#)k\u00035W$E\u0011V\n?\u001bgU*sU\u0002oNX.&E/]&urTlM]n&?+}~{T\u001cD\u0010z*\u0012\r\u0012\u001c\b?JD,Hi^ԇ?ϢvSHАRjP\u0004\u0013ad\u001c{ı?ڢ=\u001bnϟ2G'TO{3\u0014tŃ\rͼ%[\\ו1!)\\\u0010Q_X\u0017׃Tݳ\u000eYEЧT|p\u000bB\u0004^NV߿\b 2\u0017-ڛ,E1+\u0004\u0002vK>ϻ\u0011¾lSqɭ\u0019L0y.7X\u0010bɱP\u0081\tkXӹ)8\u001fY4T5\u0005^ʹ,Ϣ{<)ط`Z]u\u0002j{k`ɛ;Ϭ;Yv\u0088^eGmK7gb>q)Λ ͖@b\r֚ڑFp"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0012\u001b\u0017Y9~@v7#i\u0006(3z\u001aCMP\u0011", "", "\nh]6g\u0005", "u(E", "DhTD66Gb\u0019\u0012\n", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0012\u001b\u0017Y9~@v7\u0013c\u0007/7\u0001%\u0004", "1qT.g0H\\\b\u0003\u0003^\u0014\u000b", "", "3qa<e\nHc\"\u000e", "", "3qa<e\fQQ\u0019\n\nb6\u0006f9u\t7", "3qa<e\u000fMb$M\u000eq\n\u0007\u00198t", "3qa<e\u000fMb$N\u000eq\n\u0007\u00198t", "3qa<e\u000fMb$h\na,\nf9u\t7", "3qa<e\u0019>_)~\tm\u0016\f\f/r]2\fI\u0010", "6`b\u0010e(LV", "", "4hT9W:", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "@db2g\u001dBS+l\u000bf4x\u0016C", "", "=oT;I0>e\u0007\u000f\u0003f(\n\u001d", "DhTDA(FS", "", "2dc2V;>R\u0002z\u0003^", "=ac.\\5/W\u0019\u0011Xh5\f\tBt", "7mR<e7H`\u0015\u000ez>=|\u0012>", "8r^;8=>\\(", "5d]2e(MS\n\u0003zp\u001a\r\u00117a\r<", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0012\u001b\u0017Y9~@v7#i\u0006(3z*\u0004", "3mS!\\4>;'", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ViewSummarizer {
    private long creationTimeMs;
    private int errorCount;
    private int errorExceptionCount;
    private int errorHttp4xxCount;
    private int errorHttp5xxCount;
    private int errorHttpOtherCount;
    private int errorRequestOtherCount;
    private JSONObject fields;
    private boolean hasCrash;
    private ViewContext viewContext;

    public final ViewSummary generateViewSummary(long j2) {
        long j3 = this.creationTimeMs;
        return new ViewSummary(j3, j2 - j3, this.errorCount, this.errorExceptionCount, this.errorHttp4xxCount, this.errorHttp5xxCount, this.errorHttpOtherCount, this.errorRequestOtherCount, this.hasCrash, this.fields);
    }

    public final void incorporateEvent(JSONObject jsonEvent) {
        Intrinsics.checkNotNullParameter(jsonEvent, "jsonEvent");
        boolean zOptBoolean = jsonEvent.optBoolean(EventKeys.Characteristics.HAS_REQUEST);
        boolean zOptBoolean2 = jsonEvent.optBoolean(EventKeys.Characteristics.HAS_ERROR);
        boolean zOptBoolean3 = jsonEvent.optBoolean(EventKeys.Characteristics.HAS_EXCEPTION);
        boolean zOptBoolean4 = jsonEvent.optBoolean(EventKeys.Characteristics.HAS_FAILED_REQUEST);
        int iOptInt = jsonEvent.optInt("http.response.status_code", -1);
        this.hasCrash = this.hasCrash || jsonEvent.optBoolean(EventKeys.Characteristics.HAS_CRASH);
        if (zOptBoolean3) {
            this.errorExceptionCount++;
        }
        if (zOptBoolean2) {
            this.errorCount++;
        }
        if (zOptBoolean) {
            if (400 <= iOptInt && iOptInt < 500) {
                this.errorHttp4xxCount++;
                return;
            }
            if (500 <= iOptInt && iOptInt < 600) {
                this.errorHttp5xxCount++;
                return;
            }
            if ((iOptInt >= 0 && iOptInt < 100) || (600 <= iOptInt && iOptInt <= Integer.MAX_VALUE)) {
                this.errorHttpOtherCount++;
            } else if (zOptBoolean4 || zOptBoolean3) {
                this.errorRequestOtherCount++;
            }
        }
    }

    public final ViewContext obtainViewContext() {
        return this.viewContext;
    }

    public final void openViewSummary(String str, String str2, long j2) {
        this.creationTimeMs = j2;
        this.viewContext = new ViewContext(HexGenerator.generateRandomHex(8), str, str2);
    }

    public final void openViewSummary(JSONObject fields, long j2) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.creationTimeMs = j2;
        this.fields = fields;
        this.viewContext = new ViewContext(HexGenerator.generateRandomHex(8), JsonExtensionKt.getStringOrNull(fields, EventKeys.VIEW.NAME), JsonExtensionKt.getStringOrNull(fields, EventKeys.VIEW.DETECTED_NAME));
    }

    public final void resetViewSummary() {
        this.viewContext = null;
        this.fields = null;
        this.creationTimeMs = 0L;
        this.errorCount = 0;
        this.errorExceptionCount = 0;
        this.errorHttp4xxCount = 0;
        this.errorHttp5xxCount = 0;
        this.errorHttpOtherCount = 0;
        this.errorRequestOtherCount = 0;
        this.hasCrash = false;
    }
}
