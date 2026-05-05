package com.google.firebase.crashlytics.ktx;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
/* JADX INFO: loaded from: classes7.dex */
@Deprecated(message = "\u0018Y\u0001tqw$d&N7\nW!1\u001cbU\u001b,\u0007i\u001fWDI\u0001ka|0\u007f|UgU\u001bGmR<\u001f?O\u00178a\u0003.\\MMe}:$\u001bTSX#{s\u000fs\u0015}v)Z\u0002\u0011i'U")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\":\u0012\u007f\u0007tvAӄLeV7ZS8\u0013s{B)c$\u007fICU(\u0005*ޛUS}˧\u001fJ\t\n\u0004\u001a\u0016\u001a\u0007jDI\u0004yٕ\u0016\u000f@D8UAP\b=gd%:\u0013#J\"f~5\u0005(0`\u0010%\u0002\nPT(>C\t:\u0001\u0011}\t(\u0015\u001e>N\u0006N`uTNH\u001be\u00014k\u0019wEf'\u000e4-Q\u001bIl';{\u0012\"9FO5C.\u001a\bOhiB\u001b? A5l5*CI\"\\f\\\u000e\u001a-+}\u0017$wnr\u0013Tx\fU/\u007fgYS&(&\u007f,\u0011J\n&\u0006USt2b|\u0016\u0011Kt!WpT\u0010aZ\u007f)ff\u001b3\u0006K+g -V2G'NO{3\u000etŃ\u0003ͼ%[\\וה\u0019'"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n~$\u0013Ur\u0015P\u0006)3gG&F\u0001_\u0014MW,g;.\u0015Eq=\u000eb,[L", "", "1qP@[3Rb\u001d|\t", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n~$\u0013Ur\u0015P\u0006)3gG\u0001;z\u0016+IQ;IA\u001a#khM\u0016g*\\L", "uKR<`u@]#\u0001\u0002^u}\r<e|$\n@J\u0015$C}\u0011C\u000b49W\fi\u0018q#.J?Ik\u0012+\u0011vd@\u001br0L\u0005|\u000b=", "9dh", "", "", "D`[BX", "", "", "", "", "", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>#BU\f#>\u0002%2KQ"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class KeyValueBuilder {
    private final FirebaseCrashlytics crashlytics;

    public KeyValueBuilder(FirebaseCrashlytics crashlytics) {
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.crashlytics = crashlytics;
    }

    @Deprecated(message = "\u0018Y\u0001tqw$d&N7\nW!1\u001cbU\u001b,\u0007i\u001fWDI\u0001ka|0\u007f|UgU\u001bGmR<\u001f?O\u00178a\u0003.\\MM3I9+SR\u0019]f6J\u0003~!t\u007f\u001c\u000b\u0004\u000el/G\u0010P\u0015~\bB76p`~?h(sI", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @InterfaceC1492Gx
    public final void key(String key, double d2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, d2);
    }

    @Deprecated(message = "\u0018Y\u0001tqw$d&N7\nW!1\u001cbU\u001b,\u0007i\u001fWDI\u0001ka|0\u007f|UgU\u001bGmR<\u001f?O\u00178a\u0003.\\MM3I9+SR\u0019]f6J\u0003~!t\u007f\u001c\u000b\u0004\u000el/G\u0010P\u0015~\bB76p`~?h(sI", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @InterfaceC1492Gx
    public final void key(String key, float f2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, f2);
    }

    @Deprecated(message = "\u0018Y\u0001tqw$d&N7\nW!1\u001cbU\u001b,\u0007i\u001fWDI\u0001ka|0\u007f|UgU\u001bGmR<\u001f?O\u00178a\u0003.\\MM3I9+SR\u0019]f6J\u0003~!t\u007f\u001c\u000b\u0004\u000el/G\u0010P\u0015~\bB76p`~?h(sI", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @InterfaceC1492Gx
    public final void key(String key, int i2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, i2);
    }

    @Deprecated(message = "\u0018Y\u0001tqw$d&N7\nW!1\u001cbU\u001b,\u0007i\u001fWDI\u0001ka|0\u007f|UgU\u001bGmR<\u001f?O\u00178a\u0003.\\MM3I9+SR\u0019]f6J\u0003~!t\u007f\u001c\u000b\u0004\u000el/G\u0010P\u0015~\bB76p`~?h(sI", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @InterfaceC1492Gx
    public final void key(String key, long j2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, j2);
    }

    @Deprecated(message = "\u0018Y\u0001tqw$d&N7\nW!1\u001cbU\u001b,\u0007i\u001fWDI\u0001ka|0\u007f|UgU\u001bGmR<\u001f?O\u00178a\u0003.\\MM3I9+SR\u0019]f6J\u0003~!t\u007f\u001c\u000b\u0004\u000el/G\u0010P\u0015~\bB76p`~?h(sI", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @InterfaceC1492Gx
    public final void key(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.crashlytics.setCustomKey(key, value);
    }

    @Deprecated(message = "\u0018Y\u0001tqw$d&N7\nW!1\u001cbU\u001b,\u0007i\u001fWDI\u0001ka|0\u007f|UgU\u001bGmR<\u001f?O\u00178a\u0003.\\MM3I9+SR\u0019]f6J\u0003~!t\u007f\u001c\u000b\u0004\u000el/G\u0010P\u0015~\bB76p`~?h(sI", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @InterfaceC1492Gx
    public final void key(String key, boolean z2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.crashlytics.setCustomKey(key, z2);
    }
}
