package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&˛\bDRш|İI\u0006F\u000b6B\u0005%4\u0012\u0006\u0010nj?2LeV4ZS0\u0010s{B$cҕyCQU\"}8\tWNmlvJp\u000bK\u000f\u001c\u0016\u0001j2L]xk\u001e\u00172HrEݔ\f\u0006މabzȂ\u0013\u001fb\"fyE\u000e*.V\u0011\u000fzqMë\u00162FsHVUe\u0013!*\u0006l(1$jpf8^k\f:uޡ\u0004ݦFP-i>\b\u0016\u001bT`?\r%ndҿ?˝9\u0017+a\u0011\u0016\u001b\u007fM\u0013Wqk\u0016\u0019<5=a\u0005g8h\u007fJƃ;Q\u001d]!7\u000b\u0018Ōd\f-?յgMV#6\u000eC \u001bS\u001c\u000e48xC;,~\u0019\u001e5\u0005r\nó`\u0004nB.\f\u0010Iа)\u007f9?ݰ\u001fhWyI/\u0017~\n\u001e%\u001eQ\u0012\u000f#aS\u001czE\u001fb\u0013i1\u0018Zmr\\\u001cqc}\u0006\u0001b8Ï\u0014AW\u000fu\u0016 2!+Tk?)?{\u0004NJ\u000e\u0012\u0015bxS\u0018cv\\̱r\u0016=>Á\u0010\\J\u0004\u0013\f\u0019\u001bfE)MJe7\u0002\u0016.8\\&IQQ\u0016T]z\u0002\u0011]_\u001a%eωGj~z<dߍb=;ns\u0016gp\u0007\u0016EB\t hhRS:k\u000bDϒ6Hp$>ԂJ«\u0010\u00158^\u007f=|:?;t\u0015v&d֪@Ҵ\ra`\r\u001e$\u001dz2)\u0002$#\u001a!Rbo}\u0002)M:\u0018x\"s[\u0002_'8mHx6\r#=Ѩ\u0004\u0011Wv\u0013aƥp {r\f&\u001c8IS5C9*\u000f+B\u0002[Vz\u000fϯUM\u0018;ϸ\u0001{\u0015bvN0Nx\u0017D`\u0019[\u007fX%=\u000f^!08\u0011\u0006\u007foX\u0013msV\u001b[tδ\u0003\u0014iK|E٫\t)$B\u0011u(\u001bE/I-C1\b\u0016?\u0015\u0010n\u0018\fЦ}b\u0015:;Ј\nНg\u0018u\n_~\u0003OFJq~l$ZЗYܫJܖ{\u000eJކD\u000f9MOjݮU9Ԛ\n/,h§05"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9}Gu!DY\u000bu", "\"", "", "1n\\=b:>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\r", "1n]@g9NQ(\t\b&0\u0005\u00146", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCY\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011Y^5kVz=]od\u0016Y5\u001b\u0005f\u0017", "5dc\u0010b4I]'~\b\u001d(\u0006\u00129t{7\u007fJ\n%", "u(E", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DC|3IT75;\u001a\u001ej+#\u0004h,L\u0006|\u000bA", "6`b566=S", "", "6`b566=S`\u0003\u0003i3", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCY\u0012", "7mXA", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "7mXA 0F^ ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DC|4WRBo=g\u001ayi\u0003\bs5L\u0006+QU\\u=b{;#\u0016d\u0017\u001a\u0001Pu", "@dR<a*BZ\u0019", "@dR<a*BZ\u0019F~f7\u0004", "Adc", "$", "D`[BX", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "Adcy\\4IZ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DC|3IT75;\u001a\u001ej+#\u0004h,L\u0006|.RX;cV{\u0007\u0019#bWO;\u0016\u0003hE.wR\u0001\u007f\u00185G\u0011?r\nXkQ&", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCy\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WwbHJ", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DCY\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d", "CoS.g,", "CoS.g,\u0006W!\n\u0002", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class Updater<T> {
    private final Composer composer;

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ Updater m3670boximpl(Composer composer) {
        return new Updater(composer);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static <T> Composer m3671constructorimpl(Composer composer) {
        return composer;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m3672equalsimpl(Composer composer, Object obj) {
        return (obj instanceof Updater) && Intrinsics.areEqual(composer, ((Updater) obj).m3682unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m3673equalsimpl0(Composer composer, Composer composer2) {
        return Intrinsics.areEqual(composer, composer2);
    }

    public static /* synthetic */ void getComposer$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m3674hashCodeimpl(Composer composer) {
        return composer.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m3679toStringimpl(Composer composer) {
        return "Updater(composer=" + composer + ')';
    }

    public boolean equals(Object obj) {
        return m3672equalsimpl(this.composer, obj);
    }

    public int hashCode() {
        return m3674hashCodeimpl(this.composer);
    }

    public String toString() {
        return m3679toStringimpl(this.composer);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ Composer m3682unboximpl() {
        return this.composer;
    }

    private /* synthetic */ Updater(Composer composer) {
        this.composer = composer;
    }

    /* JADX INFO: renamed from: set-impl */
    public static final void m3677setimpl(Composer composer, int i2, Function2<? super T, ? super Integer, Unit> function2) {
        if (composer.getInserting() || !Intrinsics.areEqual(composer.rememberedValue(), Integer.valueOf(i2))) {
            composer.updateRememberedValue(Integer.valueOf(i2));
            composer.apply(Integer.valueOf(i2), function2);
        }
    }

    /* JADX INFO: renamed from: set-impl */
    public static final <V> void m3678setimpl(Composer composer, V v2, Function2<? super T, ? super V, Unit> function2) {
        if (composer.getInserting() || !Intrinsics.areEqual(composer.rememberedValue(), v2)) {
            composer.updateRememberedValue(v2);
            composer.apply(v2, function2);
        }
    }

    /* JADX INFO: renamed from: update-impl */
    public static final void m3680updateimpl(Composer composer, int i2, Function2<? super T, ? super Integer, Unit> function2) {
        boolean inserting = composer.getInserting();
        if (inserting || !Intrinsics.areEqual(composer.rememberedValue(), Integer.valueOf(i2))) {
            composer.updateRememberedValue(Integer.valueOf(i2));
            if (inserting) {
                return;
            }
            composer.apply(Integer.valueOf(i2), function2);
        }
    }

    /* JADX INFO: renamed from: update-impl */
    public static final <V> void m3681updateimpl(Composer composer, V v2, Function2<? super T, ? super V, Unit> function2) {
        boolean inserting = composer.getInserting();
        if (inserting || !Intrinsics.areEqual(composer.rememberedValue(), v2)) {
            composer.updateRememberedValue(v2);
            if (inserting) {
                return;
            }
            composer.apply(v2, function2);
        }
    }

    /* JADX INFO: renamed from: init-impl */
    public static final void m3675initimpl(Composer composer, final Function1<? super T, Unit> function1) {
        if (composer.getInserting()) {
            composer.apply(Unit.INSTANCE, new Function2<T, Unit, Unit>() { // from class: androidx.compose.runtime.Updater$init$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Object obj, Unit unit) {
                    invoke2(obj, unit);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(T t2, Unit unit) {
                    function1.invoke(t2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: reconcile-impl */
    public static final void m3676reconcileimpl(Composer composer, final Function1<? super T, Unit> function1) {
        composer.apply(Unit.INSTANCE, new Function2<T, Unit, Unit>() { // from class: androidx.compose.runtime.Updater$reconcile$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Unit unit) {
                invoke2(obj, unit);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t2, Unit unit) {
                function1.invoke(t2);
            }
        });
    }
}
