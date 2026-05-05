package com.ts.coresdk.logger.a;

import android.content.Context;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.logger.db.TSLogEntity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.hg;

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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r.4ߚ\u007f\u0007tjA0JeP.`T2\u000fq}<$i-yCAU\"}0\u000fWNmjvJhŏIǥ\u0006,ю\u001b,wk9d\u0018\u000f̓FqEG[\u0005\u0006\\nzN\u0005N7R<\b\u0005\u0019\u001aXG@z\tEc\f@1ptHV%M3\u001dŪ\n@&\u0007,c0{DR\u0005]h4S\u0007wBf'\u000e/-Q\u001bHl';w\u0012\"9DO5C(\u0004\t\u0015[sA\u0019> Eݾl)-5W~ Yf\f,\u0015YT=a\u0001&t\u0005\u007f_<+9Q{K~\u000fX{\t\u007f%<2\u0011Ν+J49(mP\u001bA\u0003\u000bSn]H^۰\u0004|gD%4H`9C3f\u007ffk\u001d\\7\u0014\u0005;\u001dS\u0005|#sT<pE\u001fb{i1\u007fAmL\\\u0013q=\u001c\u00077b͆.\u00066Q\u000e@D4<)=7\n>S%y\u0002`D\u0016u5dvU\u0002RvARr$;B\t:]ֈh\u0007qbb_t4[/l\u0007,\rC$jwT!S\u000f~Svk\u0003M\f\u000bU3t;qn\u001a\u0011Ć=`9H_j"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxl\n*}@\u000e`\u0013\u0011kc", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">/", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxIn\u0016cJ\u007f'\u001eGS\u0017=\u0001z", ">0", "", ">1", "", "4", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D\b(", "", ">2", RemoteSettings.FORWARD_SLASH_STRING, "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~h\fi5w#.[BA5\u0018\r\u0003Pk8\u0017j,2\u007f(Q\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D+<\u001b\u0019(\u0013\t7q\u0003U\u0005\u0011Bt\u0003>S\u0017GOXf", "8", "", ">", "u(I", "", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEq#t/=#\r.\u0001k ;MQ:q}\u0002\u0004VIC\u0006s3NZ0HV$\u0013aN\u00049]\u0019V\u0017Ptz\u0014fE-p\u001az\u0010", "5", "6", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class a {
    public static final a INSTANCE = new a();

    private a() {
    }

    private final void a(Context context, int i2, ITSModuleInfo iTSModuleInfo, String str) throws Throwable {
        if (iTSModuleInfo.isLoggerEnabled(context)) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[5];
            Object[] objArr = new Object[0];
            Method method = Class.forName(hg.Vd("\r\u0003\u0017\u0001L\n}\n\u0002Gk\fwx\u007fg\u0005rstSyqxow|", (short) (OY.Xd() ^ 28146), (short) (OY.Xd() ^ 17715))).getMethod(C1561oA.ud("\u0018\u0015#p\u0019\r\u001e\u001dv\t\u0014\u000b", (short) (OY.Xd() ^ 19755)), new Class[0]);
            try {
                method.setAccessible(true);
                String str2 = (String) method.invoke(stackTraceElement, objArr);
                StackTraceElement stackTraceElement2 = Thread.currentThread().getStackTrace()[5];
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(C1561oA.yd("\u0006}\u0014\u007fE\u0005z\t\u000bRx\u001b\u0001\u0004\rv\u001e\u000e\u0011\u0014l\u0015\u000f\u0018\u0019#*", (short) (OY.Xd() ^ 5004))).getMethod(C1561oA.Yd("#\"2\f%5*2(\u0013'4-", (short) (Od.Xd() ^ (-14256))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str3 = (String) method2.invoke(stackTraceElement2, objArr2);
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    Intrinsics.checkNotNullExpressionValue(str3, "");
                    String strA = b.a(str, 300);
                    short sXd = (short) (FB.Xd() ^ 9485);
                    short sXd2 = (short) (FB.Xd() ^ 9650);
                    int[] iArr = new int["\u001e,#20+'q(55<.8?y\u0010==D6JG".length()];
                    QB qb = new QB("\u001e,#20+'q(55<.8?y\u0010==D6JG");
                    int i3 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
                        i3++;
                    }
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(new String(iArr, 0, i3)).getMethod(Jg.Wd("\u001cPe\u0016&P\u000f&.~tyfa", (short) (C1607wl.Xd() ^ 21759), (short) (C1607wl.Xd() ^ 2127)), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        String str4 = (String) method3.invoke(context, objArr3);
                        Intrinsics.checkNotNullExpressionValue(str4, "");
                        com.ts.coresdk.logger.b.a.f18281a.e(context).a(iTSModuleInfo, new TSLogEntity(i2, str2, str3, strA, str4, iTSModuleInfo.subSystemName(), System.currentTimeMillis()));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
    }

    private final boolean p() {
        Boolean bool = com.ts.coresdk.a.f18244b;
        Intrinsics.checkNotNullExpressionValue(bool, "");
        return bool.booleanValue();
    }

    public final void a(Context context, ITSModuleInfo iTSModuleInfo, String str, Throwable th) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (p()) {
                iTSModuleInfo.subSystemName();
                String str2 = str + ". " + (th != null ? th : "");
            }
            a(context, 5, iTSModuleInfo, str + ". " + (th != null ? th : ""));
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    public final void f(Context context, ITSModuleInfo iTSModuleInfo, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (p()) {
                iTSModuleInfo.subSystemName();
            }
            a(context, 1, iTSModuleInfo, str);
        } catch (Throwable th) {
            th.toString();
        }
    }

    public final void g(Context context, ITSModuleInfo iTSModuleInfo, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (p()) {
                iTSModuleInfo.subSystemName();
            }
            a(context, 2, iTSModuleInfo, str);
        } catch (Throwable th) {
            th.toString();
        }
    }

    public final void h(Context context, ITSModuleInfo iTSModuleInfo, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (p()) {
                iTSModuleInfo.subSystemName();
            }
            a(context, 4, iTSModuleInfo, str);
        } catch (Throwable th) {
            th.toString();
        }
    }

    public final void j(Context context, ITSModuleInfo iTSModuleInfo, String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            if (p()) {
                iTSModuleInfo.subSystemName();
            }
            a(context, 3, iTSModuleInfo, str);
        } catch (Throwable th) {
            th.toString();
        }
    }
}
