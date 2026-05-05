package androidx.compose.ui.modifier;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: ModifierLocalModifierNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007f\u0007lnA0ReP.XT2\u000f\u0002{<$q$yCQU\"}8\tWȞm\u001d\u0005Ϻ\u000b\u000bq\u000eF\u001b~l߽MU\u0007]Z'@C\b?aO EGc\r:\u0015 8#f}Kа\u001aݵL\u0010|\u007f\fo\u001a\u0018HB\u00079\u0019\u0014m\u0007 Ň\u0014EP\u000b,_\u007fTFJ|]\u00016Q\u00070ŊNϮc2\u0003U\u001bO\u001dQ\u001b\u0001y\u001eYKW7\u001bǬa\n7\\iB\u001bE\u0002?\u0015hm.YM$[Dd\u0018\u0014[2\u0016ն]ę*^\u000b^n\u001aʯ*Qr[a ߳{\u000e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n\u001dc|$8q\u0016;4M9g;\u0006\u0011s7", "", "u(E", "1n]AT0Ga", "", "9dh", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n\u001dc|$8q\u0016;4M9g;s", "1n]AT0GaW\u000f~X9|\u0010/a\u000e(", "5dc", "\"", "5dcph08`\u0019\u0006zZ:|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001f!Fs\u000f@v2~A\b\u001f;n\u001a.Z*Ei0%j,H>\u0003t(\u0018}#PN\u0018\u0016YWr;#g", "Adc", "", "D`[BX", "Adcph08`\u0019\u0006zZ:|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001f!Fs\u000f@v2~A\b\u001f;n\u001a.Z*Ei0%jOf5\u0018_uUr0I\u00168)aRpLiUK", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n\u0012U{&Ii#-[!Es?\u001a$Ok7\u0003j\u0014J\u0002|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n\u0015a\t/KU\u00129#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n\u001di\u0005/;T ,IJ#g?s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n#]\u0007\">m|8K?BS0)j", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class ModifierLocalMap {
    public static final int $stable = 0;

    public /* synthetic */ ModifierLocalMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean contains$ui_release(ModifierLocal<?> modifierLocal);

    public abstract <T> T get$ui_release(ModifierLocal<T> modifierLocal);

    /* JADX INFO: renamed from: set$ui_release */
    public abstract <T> void mo5620set$ui_release(ModifierLocal<T> modifierLocal, T t2);

    private ModifierLocalMap() {
    }
}
