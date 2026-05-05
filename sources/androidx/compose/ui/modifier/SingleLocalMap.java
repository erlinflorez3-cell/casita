package androidx.compose.ui.modifier;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":ߚ\u007f\u0007lpA0RnP.XS2\u000fy{<$a+wّQ٥J}P\b\u0010]wo|Jr\u000fS\u000f\f\u0017'k߽MU\u0007_Z'@N\b?aZ EG`\r:\u0015 8#fzKР\u001aݵL\u0010|\t\f`\u001a!H@\u001fJ\u0003\u0013[\n2\u0014\u001c=N\u0005dձʄR6N}&^=5\u001bkXMmrP~SεTgW\u0017\u0005a61P9E\u0015kf1\b\u0019Ê?ƄCsC\u0019v<oUW\no6\u0007\u00104\u00171˽\u001bp#0j\u0005if\u001c);O*^~\u000fX{\t\u0001%<J!LκHͶ1\u001cl\u001f\u001cKE\u0003a@h\u0006nB\u0006{\u00107mӞ\u0002Ĵ/9#Ƙ\"\u000fI\u001ef9\u0012\u0004;\"S\u0007|$sV$_C\u001f\u000b8\u0010q(̸\u05cfHݳ\u000eiEo\nzp\rB\u00066M\u000e6\u001c\u00134\u001f3@٬=<"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n#]\u0007\">m|8K?BS0)j", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n\u001dc|$8q\u0016;4M9g;\u0006\u0011s7", "9dh", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n\u001dc|$8q\u0016;4M9g;s", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001f!Fs\u000f@v2~A\b\u001f;n\u001a.Z*Ei0%j,R", "\nrTA \u0006\u0017", "", "D`[BX", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc#T3NS", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "D`[BXj=S ~|Z;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "1n]AT0Ga", "", "1n]AT0GaW\u000f~X9|\u0010/a\u000e(", "4na0X\u001d:Z)~", "", "4na0X\u001d:Z)~9n0v\u0016/l\u007f$\n@", "5dc", "\"", "5dcph08`\u0019\u0006zZ:|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001f!Fs\u000f@v2~A\b\u001f;n\u001a.Z*Ei0%j,H>\u0003t(\u0018}#PN\u0018\u0016YWr;#g", "Adc", "Adcph08`\u0019\u0006zZ:|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001f!Fs\u000f@v2~A\b\u001f;n\u001a.Z*Ei0%jOf5\u0018_uUr0I\u00168)aRpLiUK", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SingleLocalMap extends ModifierLocalMap {
    public static final int $stable = 0;
    private final ModifierLocal<?> key;
    private final MutableState value$delegate;

    public SingleLocalMap(ModifierLocal<?> modifierLocal) {
        super(null);
        this.key = modifierLocal;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    private final Object getValue() {
        return this.value$delegate.getValue();
    }

    private final void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }

    public final void forceValue$ui_release(Object obj) {
        setValue(obj);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* JADX INFO: renamed from: set$ui_release */
    public <T> void mo5620set$ui_release(ModifierLocal<T> modifierLocal, T t2) {
        if (!(modifierLocal == this.key)) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        setValue(t2);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public <T> T get$ui_release(ModifierLocal<T> modifierLocal) {
        if (!(modifierLocal == this.key)) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        T t2 = (T) getValue();
        if (t2 == null) {
            return null;
        }
        return t2;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui_release(ModifierLocal<?> modifierLocal) {
        return modifierLocal == this.key;
    }
}
