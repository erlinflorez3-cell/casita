package org.koin.core.component;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d̉=!4i\bӵLc\u000b\u0004Iي8\u000b<Ȑ\u0007\"2\u0012\u007f\u0007|jA0JeP.`_2\u000fq{<$q$yCAX2!0ޛgN\u0016f\u000fP`ŏQ\u000f.\u0016'kTI\u001cx\u000e\u001a\u00152PqW5cnk<žx6\u0013$J?F~\u001d\u0007*,X\u0010%yqQ,\u00186ϋ~:z\r{\u0006B\u0012L>ŋ\u0005\u001ejnfMVtu:],#oH÷5_X|{\u0010nTm\rțe\u001e9JOL#0k\u00035^{E\tӊ\u007f=-hU*SI:W͏\\\u007f\"\"Ch\u001bk\u000b(r\u0004\u007f_,-1ՒqKx\u000eVx#{S<Ǭ\u0012\u00065WFJ(v \u0014Cv\u0003SnO0db\u0006\u0001ʨD\u0017M\u007fa,a\u001b-Qň?\u0019\\>ߏ\t\u001e"}, d2 = {"1qT.g,,Q#\nz", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "\"", "\u001ana4\"2HW\"Hxh9|R-o\b3\u0006I\u0001 &\u0011U\u0018@\u007f\u00133c\t \u0015w\u001e9WL;tCs", "And?V,", "", "uK^?ZuD]\u001d\bD\\6\n\txc\n0\u0007J\n\u0017 V9sFz.#W\b+7K 6XMDk=-jOf5\u0018_uUr0I\u00168)aRpLiUA\u0018[-V\u000bcE-8BA,\buW\u007fEs\u0001U\u0004\f?up\u0018", "5dc\u001ce\nKS\u0015\u000ezL*\u0007\u0014/", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "uK^?ZuD]\u001d\bD\\6\n\txc\n0\u0007J\n\u0017 V9sFz.#W\b+7K 6XMDk=-j,H?\u0011r3R\u007fp.Hc@2", "5dc V6IS|}", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004", "5dc V6IS\u0002z\u0003^", "\u001ana4\"2HW\"Hxh9|R;u{/\u007fA\u0005\u0017$\u0011^\"Gv\u0011EU\u0005$8q\u0016;#", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u000b$\u0019\u0011u\u0018@\u007fn3c\u000b \u0001y&*TG<o4+^WuD\u0007O<J}+HPN92", "5dc V6IS\u0003\fcn3\u0004", "uK^?ZuD]\u001d\bD\\6\n\txc\n0\u0007J\n\u0017 V9sFz.#W\b+7K 6XMDk=-j,HC\u0014euT\u0001+P\u0016L6iR<K\u0012\u001ce\u000e\u0018\u0019\u000b\u000fdAy", "<df V6IS", "9nX; *H`\u0019"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class KoinScopeComponentKt {

    /* JADX INFO: renamed from: org.koin.core.component.KoinScopeComponentKt$getOrCreateScope$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!4i\bӵLc\u000b\u0004Iي>éFB-!L\u0018}јtja0rf\u000f6ʂW*\u0015m"}, d2 = {"\n`]<a@F])\rS", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "\"", "\u001ana4\"2HW\"Hxh9|R-o\b3\u0006I\u0001 &\u0011U\u0018@\u007f\u00133c\t \u0015w\u001e9WL;tCs", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<Scope> {
        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Scope invoke() {
            Scope scopeOrNull = KoinScopeComponentKt.getScopeOrNull(koinScopeComponent);
            return scopeOrNull == null ? KoinScopeComponentKt.createScope$default(koinScopeComponent, null, 1, null) : scopeOrNull;
        }
    }

    /* JADX INFO: renamed from: org.koin.core.component.KoinScopeComponentKt$newScope$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!4i\bӵLc\u000b\u0004Iي>éFB-!L\u0018}јtja0rf\u000f6ʂW*\u0015m"}, d2 = {"\n`]<a@F])\rS", "\u001ana4\"2HW\"Hxh9|R=c\n3{\nn\u0015!Roc", "\"", "\u001ana4\"2HW\"Hxh9|R-o\b3\u0006I\u0001 &\u0011U\u0018@\u007f\u00133c\t \u0015w\u001e9WL;tCs", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class C14821 extends Lambda implements Function0<Scope> {
        C14821() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Scope invoke() {
            return KoinScopeComponentKt.createScope$default(koinScopeComponent, null, 1, null);
        }
    }

    public static final <T extends KoinScopeComponent> Scope createScope(T t2, Object obj) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        return t2.getKoin().createScope(getScopeId(t2), getScopeName(t2), obj);
    }

    public static /* synthetic */ Scope createScope$default(KoinScopeComponent koinScopeComponent, Object obj, int i2, Object obj2) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            obj = null;
        }
        return createScope(koinScopeComponent, obj);
    }

    public static final <T extends KoinScopeComponent> Lazy<Scope> getOrCreateScope(T t2) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        return LazyKt.lazy(new Function0<Scope>() { // from class: org.koin.core.component.KoinScopeComponentKt.getOrCreateScope.1
            AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Scope invoke() {
                Scope scopeOrNull = KoinScopeComponentKt.getScopeOrNull(koinScopeComponent);
                return scopeOrNull == null ? KoinScopeComponentKt.createScope$default(koinScopeComponent, null, 1, null) : scopeOrNull;
            }
        });
    }

    public static final <T> String getScopeId(T t2) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        return KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(t2.getClass())) + '@' + t2.hashCode();
    }

    public static final <T> TypeQualifier getScopeName(T t2) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        return new TypeQualifier(Reflection.getOrCreateKotlinClass(t2.getClass()));
    }

    public static final <T extends KoinScopeComponent> Scope getScopeOrNull(T t2) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        return t2.getKoin().getScopeOrNull(getScopeId(t2));
    }

    public static final <T extends KoinScopeComponent> Lazy<Scope> newScope(T t2) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        return LazyKt.lazy(new Function0<Scope>() { // from class: org.koin.core.component.KoinScopeComponentKt.newScope.1
            C14821() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Scope invoke() {
                return KoinScopeComponentKt.createScope$default(koinScopeComponent, null, 1, null);
            }
        });
    }
}
