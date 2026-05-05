package androidx.datastore.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: DataMigrationInitializer.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0010\u001d<K!&˛\bDRш|\u0004G\u00076éDȐ\u001d$T\u0014}јtii0re\u0001-T\u0014-Ƃo{B%Ӵ(t"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011N\nKr\r9[\u000b\u001cFq 71L?z8\u001a\u001clv9\u00149", "\"", "", "u(E", "\u0011n\\=T5B]\"", "2`c.f;H`\u0019Fxh9|"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
public final class DataMigrationInitializer<T> {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: DataMigrationInitializer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2\u000fy{<řc$\u007faCU0}*\tUPmˮo`ҙ;C=\u0005V}p,֒Yxk\u0012W\nPpWdSnMPp\nF\u000702h<(\bв\u001e4N\u0015\u0007\u0001IQ\u001c\u00146F\u0017Ab\u0015]\u000b*\u0014\u0016>N\nLdwRFJ\u0003\\h.Q\u0005\nDT&m4-]\u001bPl3\u001d~q$;BG5[)\u0002\u000f5]Ĳ>šӭu=\u0013uo^9W\fWda \u0016\u001b*]\u0011\u000e\u00034f\u001d]p\u001471_e[PT,&\u0007*\u0018l\u000e\u001c\r?N>/*fN\u0012aw9Ԣ~҉\u0001މ۰\u0004zoEА%\u0002;+?2ǁUq"}, d2 = {"\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011N\nKr\r9[\u000b\u001cFq 71L?z8\u001a\u001clv9\u0014\"\nX~2CUR6e(", "", "u(E", "5dc\u0016a0MW\u0015\u0006~s,\n", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011S\u0017@\u0006)1`\u000257zq9Q\u0019", "\"", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "/oX", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", ";hV?T;B]\"\r", "", "\u001a`]1e6BR,HyZ;x\u0017>o\r(E>\u000b$\u0017\u0011N\nKr\r9[\u000b\u001cFq 7#", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u000f\u0002J\u0010\u001e\u001bP9\u0013M~n6i\u0007\u001eFq 7[\r\u001c{=\u001c$lkBS9", "@t]\u001a\\.KO(\u0003\u0005g:", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f$\u0005?\u000e!\u001bF\u0003W;r41g\r*Dm_,WP;5\u0018'\u0019we5\u000egAN\u0004\u0003RP$\u0013b\\\u0002D\u0018\u001b$\fX8\u0017\u0015hE-nR\u0001|\u00125X\u0006Dx|\u001b\u001a\u0018>@4)[\fXu^|=2j\u0010C\\~G?T8", "2`c.f;H`\u0019Fxh9|"}, k = 1, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> Function2<InitializerApi<T>, Continuation<? super Unit>, Object> getInitializer(List<? extends DataMigration<T>> migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            return new DataMigrationInitializer$Companion$getInitializer$1(migrations, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
        /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0077 -> B:26:0x0079). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0092 -> B:26:0x0079). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final <T> java.lang.Object runMigrations(java.util.List<? extends androidx.datastore.core.DataMigration<T>> r8, androidx.datastore.core.InitializerApi<T> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r10 instanceof androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                if (r0 == 0) goto L2f
                r4 = r10
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r4 = (androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                int r0 = r2 + r1
                r2 = r2 | r1
                int r0 = r0 - r2
                if (r0 == 0) goto L2f
                int r0 = r4.label
                int r0 = r0 - r1
                r4.label = r0
            L16:
                java.lang.Object r1 = r4.result
                java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r4.label
                r3 = 2
                r6 = 1
                if (r0 == 0) goto L41
                if (r0 == r6) goto L5f
                if (r0 != r3) goto L39
                java.lang.Object r2 = r4.L$1
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r6 = r4.L$0
                kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref.ObjectRef) r6
                goto L35
            L2f:
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r4 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                r4.<init>(r7, r10)
                goto L16
            L35:
                kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Throwable -> L72
                goto L79
            L39:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L41:
                kotlin.ResultKt.throwOnFailure(r1)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.List r2 = (java.util.List) r2
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 r1 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2
                r0 = 0
                r1.<init>(r8, r2, r0)
                kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
                r4.L$0 = r2
                r4.label = r6
                java.lang.Object r0 = r9.updateData(r1, r4)
                if (r0 != r5) goto L5e
                return r5
            L5e:
                goto L66
            L5f:
                java.lang.Object r2 = r4.L$0
                java.util.List r2 = (java.util.List) r2
                kotlin.ResultKt.throwOnFailure(r1)
            L66:
                kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
                r6.<init>()
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.Iterator r2 = r2.iterator()
                goto L79
            L72:
                r1 = move-exception
                T r0 = r6.element
                if (r0 != 0) goto L92
                r6.element = r1
            L79:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L9f
                java.lang.Object r0 = r2.next()
                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                r4.L$0 = r6     // Catch: java.lang.Throwable -> L72
                r4.L$1 = r2     // Catch: java.lang.Throwable -> L72
                r4.label = r3     // Catch: java.lang.Throwable -> L72
                java.lang.Object r0 = r0.invoke(r4)     // Catch: java.lang.Throwable -> L72
                if (r0 != r5) goto L79
                return r5
            L92:
                T r0 = r6.element
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                T r0 = r6.element
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.ExceptionsKt.addSuppressed(r0, r1)
                goto L79
            L9f:
                T r0 = r6.element
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 != 0) goto La8
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            La8:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer.Companion.runMigrations(java.util.List, androidx.datastore.core.InitializerApi, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }
}
