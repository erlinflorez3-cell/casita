package com.ts.coresdk.b.a;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Wg;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLcz\u0005I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`S2\u000f\u0002{<$a&yCI٥ Չ\"\u001fѧ~g\u0016}\u000ba\u0011CǇ\n\u0018~w:W\u001e.k\u0014'2px_9SڎKD\ttd\u000fP60<\u0012\u0005/\u001dZR\u001e|\u0013I[\u000e\"0v\u0081hW=S\u0013\"*\bT\u001f/%֔kP<Jzi\u000bA1\u0005\u0002B|&\u00160Sյ\u000fТX+\u0015xg\u001e9A"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxbI$E<V", "\u001a`]1e6BR,H\rh9\u0003R\ro\t6\u000bM|\u001b V}c", "1O", "\u001a`]1e6BR,H\rh9\u0003R\ro\t6\u000bM|\u001b V}c", RemoteSettings.FORWARD_SLASH_STRING, "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">/", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", ">0", "\u001a`]1e6BR,H\rh9\u0003R\u000ea\u000f$Q", ">1", "", "\u001a`]1e6BR,H\rh9\u0003R!o\r.{MV", "\"", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtAr61#\u0005\u001c@o_\fT?Iy\n\u0005\u0011q`F\u0011g+a@9QYTu;N\u00029iUK", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class a {
    public static final a INSTANCE = new a();
    private static final Constraints cP;

    static {
        Constraints constraintsBuild = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        Intrinsics.checkNotNullExpressionValue(constraintsBuild, "");
        cP = constraintsBuild;
    }

    private a() {
    }

    public final <T extends Worker> void a(Context context, Class<T> cls, Data data) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(cls, "");
        OneTimeWorkRequest.Builder constraints = new OneTimeWorkRequest.Builder(cls).setConstraints(cP);
        if (data != null) {
            constraints.setInputData(data);
        }
        OneTimeWorkRequest oneTimeWorkRequestBuild = constraints.build();
        Intrinsics.checkNotNullExpressionValue(oneTimeWorkRequestBuild, "");
        OneTimeWorkRequest oneTimeWorkRequest = oneTimeWorkRequestBuild;
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("\"t\u0019R\u007f1^M3\u001bHy\u001be\u0016n<,q\u0018B\u0014;", (short) (FB.Xd() ^ 13754), (short) (FB.Xd() ^ 16351))).getMethod(C1561oA.Xd("HGW%UVSQLK_U\\\\2__fXli", (short) (FB.Xd() ^ 5594)), new Class[0]);
        try {
            method.setAccessible(true);
            WorkManager.getInstance((Context) method.invoke(context, objArr)).enqueue(oneTimeWorkRequest);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
