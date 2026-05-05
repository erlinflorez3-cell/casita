package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: TopicsManager.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lk?TZ͜f4\u0003SX\u000e$z:d`*ڎٴ?U(}j ]O\u007fg\u001dL\u000b\u000fQ\u0012\u001e\u0016'nr֗\u0014\u0084\\܈Ƥ6B}DݏMqE9f\fȫ\t'"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rJu?\"\u0013v+(\u0011n0L\u0005\u000fCUJ.\\_H", "", "u(E", "5dc!b7BQ'", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rJu?\"\u0013v+\u001b\u0007r\u001bX\u0002+EZ;,j]|F\"\u00120", "@d`BX:M", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rJu?\"\u0013v+\u001b\u0007r\u001bX\u0002+EZ;,hbrK#g", "uKP;W9HW\u0018\u0012Di9\u0001\u001a+c\u00146wI\u007f\u0014!Z9\n;\u0005n1X\f D~\u001a,MQ\u0005z>)\u0019fo\u0003hc;=\u00012KJ\\\u0019\\^\u0003=\"!0tT5\u001c\f]JmlND)\u0018;M\u000b;vJi \u0017DnyRR\u001fK\u0004\u001eK\u0005\u0010mBj[CN=NdsN\td\u001dZI\u0010", "\u0011n\\=T5B]\"", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class TopicsManager {
    public static final Companion Companion = new Companion(null);

    @JvmStatic
    public static final TopicsManager obtain(Context context) {
        return Companion.obtain(context);
    }

    public abstract Object getTopics(GetTopicsRequest getTopicsRequest, Continuation<? super GetTopicsResponse> continuation);

    /* JADX INFO: compiled from: TopicsManager.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:SIV2\u007f8\b}P\u0018k|Mr\u000bq\u0013L\u001bѷn1"}, d2 = {"\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rJu?\"\u0013v+(\u0011n0L\u0005\u000fCUJ.\\_1\u001b\u001e\u001ae\nW/\u0017\u000e/", "", "u(E", "=ac.\\5", "\u001a`]1e6BR,H\u0006k0\u000e\u0005-y\u000e$\u0005?}!*\u0011k\rJ@!4g}-Hq\u0014.[\rJu?\"\u0013v+(\u0011n0L\u0005\u000fCUJ.\\_H", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/cbyT+LS&\u0010~\\,\u000b\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TopicsManager obtain(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (AdServicesInfo.INSTANCE.version() >= 5) {
                return new TopicsManagerApi33Ext5Impl(context);
            }
            if (AdServicesInfo.INSTANCE.version() == 4) {
                return new TopicsManagerApi33Ext4Impl(context);
            }
            return null;
        }
    }
}
