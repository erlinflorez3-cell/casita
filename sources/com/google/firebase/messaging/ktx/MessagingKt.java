package com.google.firebase.messaging.ktx;

import com.google.firebase.ktx.Firebase;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!4i\bDZc|\u0004G\u00078\u000bDB\u0007Ӭ4\u0012\u0006\u0013nʑA0ZeP.hS2\u000fy{<$q$yّS\u0003(\u0001:\t}R\u0018k|Or\u000bq\u00156-~l:Pm\nm\u0014\u001f2pxO5]okC\u000f|ȥ\t 8-~ю\u000b҈\u0019ݒh#\u0005ٙ[K:\u0011X@\u001f:\tQ̂\t\u001e*\bD!\u000f մgS>Krұj]\"ɮmN"}, d2 = {";db@T.B\\\u001b", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\t\u0017%Uk\u0010@\u007f'~:\u0002-7j\u0012<M+;yB\u001a\u0017lj;\\", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\u0007&*\u0011P\u0012Iv\"1g}u", "5dc\u001aX:LO\u001b\u0003\u0004`", "uKR<`u@]#\u0001\u0002^u}\r<e|$\n@J\u001d&Z9n@\u0004%2U\f \r1|,WK\u0005m>(\u0017oa\u0003\bg9Ns#UL\u00184\\`\u00019\u0016\u0016c\u0010\u0018\f\u0011\u0012Y> |D\u001f\u001f\u0016:E\u0004?q\u0003a", "@d\\<g,&S'\rv`,", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\t\u0017%Uk\u0010@\u007f'~F}(A|\u0016\u0016MQIg6\u001ej", "Bn", "", "7mXA", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\t\u0017%Uk\u0010@\u007f'~F}(A|\u0016\u0016MQIg6\u001eSEq=\u000eb,[L", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "1n\\zZ6HU ~C_0\n\t,a\u000e(CA\u0005$\u0017Dk\u001c<>-5g\f\u001c9q\u001f0"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MessagingKt {
    public static final FirebaseMessaging getMessaging(Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseMessaging, "getInstance()");
        return firebaseMessaging;
    }

    @Deprecated(message = "\u0010O\u0003Gr\t\u001a\u0017lVg\u0010c\u001akbdQH\u0012x`K3f/.p`\u00041&|Ti\u0002Z]qG\u0006+B>'bQSa`\\OuQ\u000e`ZM\u001dV x5\u0015wYvF+R\n\u0001+%\u0017\t\u0017\u0014N}T|)?W\u0002J\\ =\u0007/\n.M\u001er\f$\u001c\u001d:f\u001b/-\f", replaceWith = @ReplaceWith(expression = "", imports = {}))
    @InterfaceC1492Gx
    public static final RemoteMessage remoteMessage(String to, Function1<? super RemoteMessage.Builder, Unit> init) {
        Intrinsics.checkNotNullParameter(to, "to");
        Intrinsics.checkNotNullParameter(init, "init");
        RemoteMessage.Builder builder = new RemoteMessage.Builder(to);
        init.invoke(builder);
        RemoteMessage remoteMessageBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(remoteMessageBuild, "builder.build()");
        return remoteMessageBuild;
    }
}
