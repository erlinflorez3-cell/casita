package androidx.compose.runtime.saveable;

import kotlin.Metadata;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:299)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
/* JADX INFO: compiled from: Saver.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!4i\bDRш|\u0004G\b8\u000bDB\u0007\"B\u0012\u007f\u0007|jA0JeP.hS2şs{J$c$wDSK(~:\u0015_Pwg5Lj\rS\u000fL\u0019'iLK[ތk\u0014/8HnM6uok9\u0011!D\t8Z2:\n\u0005/ :Y \u0006AEƚ\u0010\u001c6G\u0001@X\u0015]\u0007 \u0018,G0\u0005.^}M|K\u001bbƠ3#\tsro5jH\u001a]\u001eVcm\u0010țe(1GG;\u001b-c\u0005\rX\u0002H\u0013C\u0002?\u001bgm)YU\fmDe\u0018 %-_\r$\u00016^\u0015Q\u000f\fU*oeQִ\u001c6\u0018\u0015\nȞT\u0012\u001e\n7JD,Hf\u0018\u0010Ct!SnOXތDȸ~a>ЍԄ\u0004B"}, d2 = {"\u000ftc<F(OS&", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "", "!`e2e", "\u001dqX4\\5:Z", "!`e2T)ES", "A`e2", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP)i>)\u0015>", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "D`[BX", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "@dbAb9>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "/tc<F(OS&", "\"", "@t]A\\4>\u001b'z\f^(y\u0010/_\r(\u0003@|%\u0017"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SaverKt {
    private static final Saver<Object, Object> AutoSaver = Saver(new Function2<SaverScope, Object, Object>() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SaverScope saverScope, Object obj) {
            return obj;
        }
    }, new Function1<Object, Object>() { // from class: androidx.compose.runtime.saveable.SaverKt$AutoSaver$2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    });

    /* JADX INFO: renamed from: androidx.compose.runtime.saveable.SaverKt$Saver$1 */
    /* JADX INFO: compiled from: Saver.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0017\u001d̉=!4i\bDJe|\u0004W\u00068\u000b4B'!ܥ\u0018\u007f\u001d߿\u001bE@FuHdɟc,\u001fk23RZl\u0007Q;m\u001c\u0014!?ѧ~kuobZABU\u001aȀ|j:K\u001e\u0012k\u0015'4Xnu2uok=\u0011xD\u000682X\u0600@\u0019в\u001e*V\u0015͵~I"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\r8\u0005O\u0005\u001f\u0017\u0011}\nMv!2`}i%i'.Z)J*\"\u001a&hnwR", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "@dbAb9>", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "A`e2", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP)i>)\u0015>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoWJr65Uz'77\u0004*^CHY2( h7 \f_=J@.CUPuFOw=\u0012!0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "@t]A\\4>\u001b'z\f^(y\u0010/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1<Original, Saveable> implements Saver<Original, Saveable> {
        final /* synthetic */ Function1<Saveable, Original> $restore;
        final /* synthetic */ Function2<SaverScope, Original, Saveable> $save;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super SaverScope, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
            function2 = function2;
            function1 = function1;
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public Saveable save(SaverScope saverScope, Original original) {
            return function2.invoke(saverScope, original);
        }

        @Override // androidx.compose.runtime.saveable.Saver
        public Original restore(Saveable saveable) {
            return function1.invoke(saveable);
        }
    }

    public static final <Original, Saveable> Saver<Original, Saveable> Saver(Function2<? super SaverScope, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
        return new Saver<Original, Saveable>() { // from class: androidx.compose.runtime.saveable.SaverKt.Saver.1
            final /* synthetic */ Function1<Saveable, Original> $restore;
            final /* synthetic */ Function2<SaverScope, Original, Saveable> $save;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function2<? super SaverScope, ? super Original, ? extends Saveable> function22, Function1<? super Saveable, ? extends Original> function12) {
                function2 = function22;
                function1 = function12;
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Saveable save(SaverScope saverScope, Original original) {
                return function2.invoke(saverScope, original);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Original restore(Saveable saveable) {
                return function1.invoke(saveable);
            }
        };
    }

    public static final <T> Saver<T, Object> autoSaver() {
        Saver<T, Object> saver = (Saver<T, Object>) AutoSaver;
        Intrinsics.checkNotNull(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return saver;
    }
}
