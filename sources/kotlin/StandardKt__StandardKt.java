package kotlin;

import com.dynatrace.android.agent.Global;
import kotlin.jvm.functions.Function0;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d̉=!,h\bӵLc\u0003\u0010Iي8\u000b<B\u0007Ӭ4\u0012\u0006\rnʑA0ZeP.XT2\u000f\u0002{<$a&yCQU\"}(\rWNupvJ`\u000b[\u0016\u0014ǝ\u0011jZH\u001cޔc*\u001e@ԏ\b?aL AG`\r63!xĺ>\u00126\u000f\u001cBH>y+GY\u0010*0nujb\u001bS\u001d&\"\bN /#li^6vo\fAuݒ\t\u07bcA÷ώ_6\u0005Q\u0013Ed'\u001bvyN9HO5[.s\u0005\rѸiH3I\u007fG\u001dn7);I:`dcFϴ\u001bܹNՕơr.d\u000bW_\u001c'9N\u0002Jח\u0012(\u0006\u0007\u0014VJ\u0011&\u0006mQN/ Ǒ\u0016\u001cSvxRNY2bP\u000f\u0013a|%U\u0015A5Q,vSq;_\\G}\u0015\rd,/uĲ_T\u0014p[ÙZʦPĸ҈@EPT\u0010XMm\u0012p\u0001\u0001ò\b0U\u0011G6\u001f@/%}iY%'ǽ\u0010Vlg=\u0013\u0011xasjTP$~\u0016}8\u0019\u000ejD\u0013\b\u001aW\u001bИ2ԃLȼ΄\u0007\u0006\u0010\u0019&[\b</$.Mћlix^uI3B~7 |\f\u0010]ުlA]Q*\u001e\u0012g\u0005\u001eWMr\u0007hf\ta\u001c\\l(P5vqݻ{{J^RƖ8Ǧpʉؼ,9!b\u001bG\u0013\u001eP@\u001b\bރ^h\u001e\u0010ls2\u0017\u0002$;\u0012!Rbʙ}u\u0019K2{n+UA\u0018CI6c,\u0001@\r%\u0017~:\u000eWi\\G\u0013uD|\u001cݰ&ۿ\u0019ߙ֚/E\u001b\u0015\u0005(B\u0002;DjqϯUM 8\u0013B\b\u0017Shtp(lvݚnxjQZ\u00160\u007f\u0007ri\u0016\u0015\u0015\bk^\fWed\u000b\"LYt\u0013Y\u0003Wf\u0004ġ#\u001e+\u00116ܺ\u0003߿,ξڲ\u001d\u001e\u007f\u001a5\u0014q]wnLxˏ\u0013&\u0003v\u001chq+\bdg\\xIXK_˚L0LlIPxz\u0006\u001eZ\u0015D\u000fCH\br\u0001XHM9F,mMԵ\u0013ÖUܪƨ\u0013w\u0006:4^:sQ|2]ǜ)\u0011[d\u007f*{ct\r`\u000eP\u0019\u001c3tܞ*KHV\u001ep9@\u0014\n0BQ=r\u0005\u0003\u001746<<6\"q[0к\u0016Ÿ~ʋܭ\u000f\u001f:Hy:f\u000ebwzU߃\t`Sqԣ*\u0006\u0007\u00129\u0382)c0ܳq_"}, d2 = {"\"N3\u001c", "", "@dP@b5", "", "@d_2T;", "", "Bh\\2f", "", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "@t]", Global.BLANK, "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "Ehc5", "\"", "@dR2\\=>`", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "/kb<", "/o_9l", ":dc", "B`Z2<-", ">qT1\\*:b\u0019", "", "B`Z2H5ES'\r", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{\u001f?+7,(8)\u000f7")
class StandardKt__StandardKt {
    private static final Void TODO() {
        throw new NotImplementedError(null, 1, null);
    }

    private static final Void TODO(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        throw new NotImplementedError("An operation is not implemented: " + reason);
    }

    private static final <T> T also(T t2, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(t2);
        return t2;
    }

    private static final <T> T apply(T t2, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(t2);
        return t2;
    }

    private static final <T, R> R let(T t2, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(t2);
    }

    private static final void repeat(int i2, Function1<? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i3 = 0; i3 < i2; i3++) {
            action.invoke(Integer.valueOf(i3));
        }
    }

    private static final <T, R> R run(T t2, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(t2);
    }

    private static final <R> R run(Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke();
    }

    private static final <T> T takeIf(T t2, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (predicate.invoke(t2).booleanValue()) {
            return t2;
        }
        return null;
    }

    private static final <T> T takeUnless(T t2, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (predicate.invoke(t2).booleanValue()) {
            return null;
        }
        return t2;
    }

    private static final <T, R> R with(T t2, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(t2);
    }
}
