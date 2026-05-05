package com.biocatch.android.commonsdk.logging;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r.4\u0012}\u000e|ʑW;tev-\u000bR5O\u000b\f82[<qq<e \f$!Qdf\u0016qZ`\u0019G'\b,w\u0019/֒Yxk\u0017_CPsW5cnk<žx<\rړJ$>\u007f\u0013\bj9V\u0010\u000fzqLë\u00166H\u0081RT\u0013U\u0013#b\u0017L\"\u0019 rf|9ՂpcBǂ;\u0005oL\\.ۨ4\t"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\"u6}\u001ewnM\\", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", ":de2_", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\u001bR> {hr9\u000e9", ";db@T.>", "", "1n]AX?M<\u0015\u0007z", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G'Ao\u00182VE\u0005K\u001b(\u0017OaJ\u0007j\u00025{#XH\u00183X[t\u0007\u0002!g\u0012W-bk^=5j\u000e>\u001b\u0011.\u0013oJu\u0005\u0015\u0018cx[", "5dc\u0010b5MS,\u000ecZ4|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0019X=>Z", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i>w\u00180QL=5\u0014\u0005\u001fjH9\u0018c3$", "5dc\u001aX:LO\u001b~", "\u0011n\\=T5B]\"", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class LogEntry extends JSONObject {
    public static final Companion Companion = new Companion(null);
    private static long id = 0;
    private final String contextName;
    private final ELogLevel level;
    private final String message;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨&ԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\u0005*9o\u001a7O\r\"u6}\u001ewnMEA6V\u0002#PPX52", "", "u(E", "7c", "", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LogEntry(ELogLevel level, String str, String str2) throws JSONException {
        Intrinsics.checkNotNullParameter(level, "level");
        this.level = level;
        this.message = str;
        this.contextName = str2;
        long j2 = id + 1;
        id = j2;
        put("sn", j2);
        put(NotificationCompat.CATEGORY_MESSAGE, str);
        put("url", str2);
        put("level", level.getSeverity());
    }

    public final String getContextName() {
        return this.contextName;
    }

    public final ELogLevel getLevel() {
        return this.level;
    }

    public final String getMessage() {
        return this.message;
    }
}
