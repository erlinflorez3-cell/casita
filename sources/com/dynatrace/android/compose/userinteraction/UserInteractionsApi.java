package com.dynatrace.android.compose.userinteraction;

import androidx.compose.ui.layout.LayoutInfo;
import com.dynatrace.android.compose.userinteraction.handler.TouchUserInteractionHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6Ȑ\u0007\":\u0012\u007fјnjO0LeN/ZS8\u0018sڔ<$iByCIa\"Ԃ(ߝOdʴ\u0018nxYKJ\u0015\u0006Ȁ|l2Icy& \u001d6Zom8}sK?xtd\ff7jF\b\r\u0019\u001aXM@z\tIc\f@7\u0007u\u0003|\u001bV\u001d\u001a@\u000bn$\u000f$tg|=xpkDG#1tr^5kH\t]\u0015VZ7\u000f\u0007aL9nDc\"kXS\u0013`]W\u0003mt\u0014ݞjҊ++Q֕ɷ:g"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~i\f Dq\u001f=MP7iC\"\u001fq+)\u0015c92\u007f6GYJ*kV|F\"me\u0012$", "", "\nh]6g\u0005", "u(E", "Bnd0[\u001cLS&b\u0004m,\n\u0005-t\u00042\u0005#| \u0016No\u001b", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+n~5\u0006D\u007f`\u0015Qw\u0019F\u0005%~i\f Dq\u001f=MP7iC\"\u001fq+<\u0003l+Uv4\u0011;X<ZUbK\u0014\u001f>\u0017]+\u001a\u0001WP(xM\u001a\u001b\u0011+P\u0002H>", "=m0Ag(<V", "", ":`h<h;\"\\\u001a\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u001bv\u00178#", "=m32g(<V", "=m=<W,\u001c]#\fyb5x\u00189rb,\u000b", "6`b\u0015\\;", "", "Ad`BX5MW\u0015\u0006eZ;\u007fo3s\u000f", "", "", "/fT;gtB\\'\u000e\bn4|\u0012>o\r\u0004f$I\u0015!Oz\u0018Jv\u001fBY\u0005 3{\u0016"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class UserInteractionsApi {
    public static final UserInteractionsApi INSTANCE = new UserInteractionsApi();
    private static final TouchUserInteractionHandler touchUserInteractionHandler = new TouchUserInteractionHandler();
    public static final int $stable = 8;

    private UserInteractionsApi() {
    }

    @JvmStatic
    public static final void onAttach(LayoutInfo layoutInfo) {
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        touchUserInteractionHandler.onAttach$agent_instrumentorAPI_compose_release(layoutInfo);
    }

    @JvmStatic
    public static final void onDetach(LayoutInfo layoutInfo) {
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        touchUserInteractionHandler.onDetach$agent_instrumentorAPI_compose_release(layoutInfo);
    }

    @JvmStatic
    public static final void onNodeCoordinatorHit(LayoutInfo layoutInfo, boolean z2, List<? extends List<String>> sequentialPathList) {
        Intrinsics.checkNotNullParameter(layoutInfo, "layoutInfo");
        Intrinsics.checkNotNullParameter(sequentialPathList, "sequentialPathList");
        touchUserInteractionHandler.onNodeCoordinatorHit$agent_instrumentorAPI_compose_release(layoutInfo, z2, sequentialPathList);
    }
}
