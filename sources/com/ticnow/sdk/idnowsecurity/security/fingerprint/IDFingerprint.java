package com.ticnow.sdk.idnowsecurity.security.fingerprint;

import android.os.Environment;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\":\u001e\u007fјnjO0LeN/ZS8\u000fs{J$c$wDQ٥J}P\b\bMt(qН^\u000bQ\u000fN\u001a\u0007kDI\u0004z& \u001d5Zom7}sK>xtd\u000bf7jF\b\f\u0019\u001aXL@z\tKc\f@4\u0007p\u0003b\u001bV\u001d\u001a@\u0010f /)\rk\\B`l\f9ǫ'\u0011"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bnCY{0Dq%B\u0017D?t6\u001e\"sn=\u0010ru2U\bKUP,i]\u007fA\u001d!0", "", "u(E", "3wc2e5:Z\u0001~\u0003h9\u0011d@a\u0004/w=\b\u0017", "", "5d]2e(MS|\b~m0x\u0010\u0010i\t*{Mk$\u001bP~nI\u0001-\u0014Y\u000f$5m", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "@t] [,EZvfY", "1lS9\\5>", "/o_2a+\u001eR\u001d\u000e", "", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8|A\u0001$l", "2`c.", "!sa6a.\u001c]!\nvk(\f\u0013<", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDFingerprint {

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u001a\u001d<K!&i\u0016DLc\u0003\u0010I\u00066\u000b6B\r(4\u0012}\blʔ;FǏ\u0016N>Tc*=k*3d^ҸuCIVb\u00140\u000bgN\u0016j\u001fNh\u000f[\u000f4\u0016)n:Nmx\f\u0012UFԸsE"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000f\u0017\u0015W|\u0012K\u000bnCY{0Dq%B\u0017D?t6\u001e\"sn=\u0010ru2U\bKUP,i]\u007fA\u001d!\u0019{]8\u0011\u000e[\u001f.vO3,\u0004;S\u000f\u0011", "\u001aiPCTuNb\u001d\u0006D<6\u0005\u0014+r{7\u0006MV", "", "uKR<`uMW\u0017\b\u0005pu\u000b\b5/\u0004'\u0005J\u0013%\u0017E\u007f\u001b@\u00069~g}\u001eGz\u001a=a\r<o= \u0015ulF\u000bl;\u0018Z\u0006(PW.\\_}J\u0018\u001bic\u0012\u001c", "1n\\=T9>", "", "/qV|", "/qV}", "\u0017C=<j\u001a>Q)\f~m@v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    private final class StringComparator implements Comparator<String> {
        public StringComparator() {
        }

        @Override // java.util.Comparator
        public int compare(String arg0, String arg1) {
            Intrinsics.checkParameterIsNotNull(arg0, "arg0");
            Intrinsics.checkParameterIsNotNull(arg1, "arg1");
            return arg0.compareTo(arg1);
        }
    }

    private final String runShellCMD(String str) throws IOException {
        int i2;
        Process process = Runtime.getRuntime().exec(str);
        Intrinsics.checkExpressionValueIsNotNull(process, "process");
        InputStream inputStream = process.getInputStream();
        SystemClock.sleep(2000L);
        byte[] bArr = new byte[4096];
        String str2 = "";
        while (inputStream.available() > 0 && (i2 = inputStream.read(bArr)) > 0) {
            str2 = str2 + new String(bArr, 0, i2, Charsets.UTF_8);
        }
        return str2 == "" ? "unknown" : str2;
    }

    public final void appendEdit(StringBuffer appendEdit, Object data) {
        Intrinsics.checkParameterIsNotNull(appendEdit, "$this$appendEdit");
        Intrinsics.checkParameterIsNotNull(data, "data");
        appendEdit.append(data);
    }

    public final boolean externalMemoryAvailable() {
        return Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted");
    }

    /* JADX WARN: Removed duplicated region for block: B:313:0x111f A[Catch: IOException -> 0x1204, TRY_ENTER, TryCatch #15 {IOException -> 0x1204, blocks: (B:298:0x10a3, B:300:0x10bf, B:302:0x10d0, B:303:0x10d8, B:305:0x10de, B:309:0x10f2, B:310:0x10fd, B:313:0x111f, B:315:0x1130, B:317:0x114b, B:319:0x115b, B:320:0x1163, B:322:0x1169, B:326:0x117d, B:327:0x1188, B:329:0x1193, B:331:0x11ac, B:333:0x11c3, B:334:0x11d1, B:336:0x11e8, B:337:0x11f4, B:338:0x11f9, B:325:0x1178, B:339:0x11fa, B:340:0x11fe, B:341:0x1203, B:308:0x10ed), top: B:447:0x10a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x11fe A[Catch: IOException -> 0x1204, TryCatch #15 {IOException -> 0x1204, blocks: (B:298:0x10a3, B:300:0x10bf, B:302:0x10d0, B:303:0x10d8, B:305:0x10de, B:309:0x10f2, B:310:0x10fd, B:313:0x111f, B:315:0x1130, B:317:0x114b, B:319:0x115b, B:320:0x1163, B:322:0x1169, B:326:0x117d, B:327:0x1188, B:329:0x1193, B:331:0x11ac, B:333:0x11c3, B:334:0x11d1, B:336:0x11e8, B:337:0x11f4, B:338:0x11f9, B:325:0x1178, B:339:0x11fa, B:340:0x11fe, B:341:0x1203, B:308:0x10ed), top: B:447:0x10a3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String generateInitialFingerPrintFromDevice(android.content.Context r23) {
        /*
            Method dump skipped, instruction units count: 5323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ticnow.sdk.idnowsecurity.security.fingerprint.IDFingerprint.generateInitialFingerPrintFromDevice(android.content.Context):java.lang.String");
    }
}
