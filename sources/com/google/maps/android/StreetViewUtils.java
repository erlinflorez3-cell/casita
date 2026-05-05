package com.google.maps.android;

import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0005WيN\f^B-!d\u0011xGiʴ=0Re߲2T"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(4x\u0014=/{1zM\u000b\u001b\u0016\u0011]\u001dIv%DJ\u0002 I]%2TQ\u0011", "", "u(E", "\u0011n\\=T5B]\"", ":hQ?T9RM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class StreetViewUtils {
    public static final Companion Companion = new Companion(null);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007fјnjO0L͜P.hS2\u000fq{<$q$yCAU ԉ#\u001fѧ~g\u0016m\u000b_\u0011CǇ\n\u0016\u0007jtWcyu\u0012=4rsM6eok='t~..7:8(\u000b1\u001e8O(v)K{\u0010 9XphV=S\u000b\u001a \u0010V /)#ɨ\rʝGǍҺ>/1\u000f݆BP/_6\u0014֚\u0011S"}, d2 = {"\u001ab^:\".H]\u001b\u0006z(4x\u0014=/{1zM\u000b\u001b\u0016\u0011]\u001dIv%DJ\u0002 I]%2TQyI>& dj=\u0011l\u0002", "", "u(E", "2db2e0:Z\u001d\u0014zK,\u000b\u00149n\u000e(", "\u001ab^:\".H]\u001b\u0006z(4x\u0014=/{1zM\u000b\u001b\u0016\u0011\\\u000eJ\u0002/>g}\u000eFz\u0016.\\4?kFs", "@db=b5LS\u0007\u000e\bb5~", "", "4dc0[\u001aM`\u0019~\nO0|\u001b\u000ea\u000f$", "\u001ab^:\".H]\u001b\u0006z(4x\u0014=/{1zM\u000b\u001b\u0016\u0011]\u001d8\u00065C/", ":`c\u0019a.", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Ok\u0019J@-?X}'\u0001T\u0012=4L=A", "/oX\u0018X@", "And?V,", "\u001ab^:\".H]\u001b\u0006z(4x\u0014=/{1zM\u000b\u001b\u0016\u0011]\u0018L\u0004#5/", "uKR<`u@]#\u0001\u0002^ux\u0012.r\n,z\n\u0003\u001f%\u0011w\nG\u0005n=c| >7|*\\*Dm\n\u0005\u001adr5Pj(Wxp5[[0eTH$\u0012\u001cbWP5\u0017\u0007`Amv@B-Q(R\u0001Hr\u0005\u000b_{?z}@Ve.\u007f\u001f\u0005H-q\u0010Wi\u0007QQTf3d\u001a)zfCI(\u001d\u0002\u0015*lZ7_?:\u0016ncu1nC\"|\u0002\u000e;r[DTE", ":hQ?T9RM&~\u0002^(\u000b\t"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ResponseStreetView deserializeResponse(String str) {
            String statusString = new JSONObject(str).optString("status");
            Intrinsics.checkNotNullExpressionValue(statusString, "statusString");
            return new ResponseStreetView(Status.valueOf(statusString));
        }

        public static /* synthetic */ Object fetchStreetViewData$default(Companion companion, LatLng latLng, String str, Source source, Continuation continuation, int i2, Object obj) {
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                source = Source.DEFAULT;
            }
            return companion.fetchStreetViewData(latLng, str, source, continuation);
        }

        public final Object fetchStreetViewData(LatLng latLng, String str, Source source, Continuation<? super Status> continuation) {
            StringBuilder sb = new StringBuilder("https://maps.googleapis.com/maps/api/streetview/metadata");
            sb.append("?location=" + latLng.latitude + AbstractJsonLexerKt.COMMA + latLng.longitude);
            sb.append("&key=" + str);
            sb.append("&source=" + source.getValue());
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return BuildersKt.withContext(Dispatchers.getIO(), new StreetViewUtils$Companion$fetchStreetViewData$2(string, null), continuation);
        }
    }
}
