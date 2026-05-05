package com.ts.coresdk.c;

import android.content.Context;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Od;
import yg.Xg;

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
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&˛\bDZc|\u0004G\u00068\u000b<N\u0007Ӭ4\u0012\u0006\u0007nj?1LeV7ZS0\u0010s{B)c$wCCU(\u0004*ޛWNunvJ`\u0013K\u000f\u0014ǝ~̓Bկsw\u000e\u0012=Ozn>s\\u=Id\u0003:\u001d `\"أ}\u0007\u000758dX\n\tIc\f@5ptHV%M3\u001dŪ\n@&\u0007,c0qDS\u0005]h8S\u0007wFf'\u000e3-Q\u001bNl';y\u0012\"9JO5C.٨\u0007\tXfM\u000f\b\u0015K\u0013\u0001'U8ywe:p\u007fB\u0018[S\u001be\u000b&\u000b\b\u0002d\u001a1CO\u0012Xח\u0012*}\t\n\u001c\u0005'\u001c\u0014?H\\=Jj\u0016\u0012Kt!VpT\u0010fZ\u007f)df\u001b3\nK+g+ƻUcA'\\HD(\u001b);\u0001\u001d3\fX\u001cd-\u001b\u0003z\u00025_HUH|\r\nA{\u000e\tb0<˙4I\u0006:\n$v@3Es;9 \u001a\u0005xHuz\u001d`\u0017V\u001aVVH:nD:Z\u000f\u001ad\\f\u001bj~W\u001f1ҭQ\u001eZ\u0015\f\u001c[Cj\u0006T!S\u0015~Svm\u0003M\f\rU3t?qn\u001a\u0011\b=l=MQ\u0012\u0019уVx\u001aMJwM{tAk\f\taX&@L\u0003\u0010&~tR\u001a\u001bJ? \u001fd0?#t\u0015v\u0010ٿFC\u0003\bmp13\rSK$1nTx\u0017\u0005h\\\u001fr\u0018|W4\u0015`P0qUC#>UPxط\u0001%\r}\u0002\u0017\u0010\u000bZUdlDz\u0006\u007f.\u001a29\u007f2m\u0017\u001d\u0007A200uP\u0001oiM@9ϸ\u0001{\u0015IvF0+xoD`\u0019O\u007fX%&\u000f^!&8h\u000e\u0002yF)J\u0014X\u0019eVI!\u0006ʾ@P>{\u00138f@\u000fn:|c2s++\u001a\u0010\u0014]\u0018\u0012awwFy\u0011\u0012֑xg\n+q0@x_\\J?`I\b~l\"ZlYܬJܖ{\fJ\u000b:\u000eAJ"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxcI$Q", RemoteSettings.FORWARD_SLASH_STRING, "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1P", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "", ">/", "", "8", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", ">0", "", ">1", "1", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok#\u00118", "", AdkSettings.PLATFORM_TYPE_MOBILE, "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u000f\u0011$", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0012\u0011'", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0013\u0011(", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d\u001051Xcn\u0007\u001b\u000ec\u0010\u0018\u0019\u001c\u0012]J&D", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok#\u00114", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u000f\u00114", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0012\u00114", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0013\u00114", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d\u0010?", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq>", "\nh]6g\u0005", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0315a f18248a = new C0315a(null);
    private static volatile a cR = null;
    private final Context cQ;

    /* JADX INFO: renamed from: com.ts.coresdk.c.a$a, reason: collision with other inner class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u0016DLcz\u0005I\u0006F\u000b6B\u0005%4\u0012\u0006јlʘ:FǏ\u0016H\\[\u00141\u0015kڷ8&a+\u007fK\u0004j(\u0003:\t}M\u0018k|Nr\u000bq\u0012L\u001bѱn.OZ\u0007cb%@D\bAIL\u001e<o`36[ڗ>ŕ<}\r\u0003 *V\u0011"}, d2 = {"\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxcI$:<V", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxcI$Q", "1Q", "\u001ab^:\";L\u001d\u0017\t\b^:{\u000fxcI$Q", RemoteSettings.FORWARD_SLASH_STRING, "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">/", "5", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ#t/=#\r.\u0001k ;MQ:q}\u001c^d7", "\nh]6g\u0005", "u(E", ""}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public static final class C0315a {
        private C0315a() {
        }

        public /* synthetic */ C0315a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final a g(Context context) {
            a aVar;
            Intrinsics.checkNotNullParameter(context, "");
            if (a.cR != null) {
                a aVar2 = a.cR;
                Intrinsics.checkNotNull(aVar2);
                return aVar2;
            }
            synchronized (this) {
                if (a.cR == null) {
                    C0315a c0315a = a.f18248a;
                    a.cR = new a(context, null);
                }
                aVar = a.cR;
                Intrinsics.checkNotNull(aVar);
            }
            return aVar;
        }
    }

    private a(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("We\\kid`+annugqx3Ivv}o\u0004\u0001", (short) (FB.Xd() ^ 27182))).getMethod(Xg.qd("ML\\*Z[XVQPdZaa7ddk]qn", (short) (Od.Xd() ^ (-16478)), (short) (Od.Xd() ^ (-21697))), new Class[0]);
        try {
            method.setAccessible(true);
            this.cQ = (Context) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public /* synthetic */ a(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    @JvmStatic
    public static final a f(Context context) {
        return f18248a.g(context);
    }

    public final void a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            synchronized (this) {
                com.ts.coresdk.c.a.a aVar = com.ts.coresdk.c.a.a.INSTANCE;
                Context context = this.cQ;
                Intrinsics.checkNotNullExpressionValue(context, "");
                aVar.a(context, str).l(str2);
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(String str, String str2, float f2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        com.ts.coresdk.c.a.a aVar = com.ts.coresdk.c.a.a.INSTANCE;
        Context context = this.cQ;
        Intrinsics.checkNotNullExpressionValue(context, "");
        aVar.a(context, str).a(str2, f2);
    }

    public final void a(String str, String str2, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        com.ts.coresdk.c.a.a aVar = com.ts.coresdk.c.a.a.INSTANCE;
        Context context = this.cQ;
        Intrinsics.checkNotNullExpressionValue(context, "");
        aVar.a(context, str).c(str2, i2);
    }

    public final void a(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        com.ts.coresdk.c.a.a aVar = com.ts.coresdk.c.a.a.INSTANCE;
        Context context = this.cQ;
        Intrinsics.checkNotNullExpressionValue(context, "");
        aVar.a(context, str).b(str2, str3);
    }

    public final float b(String str, String str2, float f2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        com.ts.coresdk.c.a.a aVar = com.ts.coresdk.c.a.a.INSTANCE;
        Context context = this.cQ;
        Intrinsics.checkNotNullExpressionValue(context, "");
        return aVar.a(context, str).b(str2, f2);
    }

    public final int b(String str, String str2, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        com.ts.coresdk.c.a.a aVar = com.ts.coresdk.c.a.a.INSTANCE;
        Context context = this.cQ;
        Intrinsics.checkNotNullExpressionValue(context, "");
        return aVar.a(context, str).d(str2, i2);
    }

    public final String b(String str, String str2, String str3) {
        String strC;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        synchronized (this) {
            try {
                com.ts.coresdk.c.a.a aVar = com.ts.coresdk.c.a.a.INSTANCE;
                Context context = this.cQ;
                Intrinsics.checkNotNullExpressionValue(context, "");
                strC = aVar.a(context, str).c(str2, str3);
            } catch (Throwable unused) {
                strC = null;
            }
        }
        return strC;
    }

    public final void b(String str, String str2, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        com.ts.coresdk.c.a.a aVar = com.ts.coresdk.c.a.a.INSTANCE;
        Context context = this.cQ;
        Intrinsics.checkNotNullExpressionValue(context, "");
        aVar.a(context, str).a(str2, j2);
    }

    public final void b(String str, String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        com.ts.coresdk.c.a.a aVar = com.ts.coresdk.c.a.a.INSTANCE;
        Context context = this.cQ;
        Intrinsics.checkNotNullExpressionValue(context, "");
        aVar.a(context, str).a(str2, z2);
    }

    public final long c(String str, String str2, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        com.ts.coresdk.c.a.a aVar = com.ts.coresdk.c.a.a.INSTANCE;
        Context context = this.cQ;
        Intrinsics.checkNotNullExpressionValue(context, "");
        return aVar.a(context, str).b(str2, j2);
    }

    public final boolean c(String str, String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        com.ts.coresdk.c.a.a aVar = com.ts.coresdk.c.a.a.INSTANCE;
        Context context = this.cQ;
        Intrinsics.checkNotNullExpressionValue(context, "");
        return aVar.a(context, str).b(str2, z2);
    }

    public final void j(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            synchronized (this) {
                com.ts.coresdk.c.a.a.INSTANCE.k(str);
                Unit unit = Unit.INSTANCE;
            }
        } catch (Throwable unused) {
        }
    }
}
