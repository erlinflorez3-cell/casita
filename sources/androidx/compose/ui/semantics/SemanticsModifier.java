package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: SemanticsModifier.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4E\u0007\"B\u0012\u007f\u0007lk?\u0015Z͜x.\u0001Rz'y{L$\n%(\u0018\u0012ٽ\u001cԥ&\u0013_Pmi|Mr\rI\u0013\u0014\u001bIz:Omx\f\u0019e̗DņC7eqCAn}ɻ\u0004ړ݈\"<\u0002\u0007\u00079XGǞz\u0005ƐO\r"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ#u3\"\u0016laF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u0015`}(7v%\u0004", "7c", "", "5dc\u0016Wj:\\\"\t\nZ;\u0001\u00138s", "u(E", "5dc\u0016W", "u(8", "Ad\\.a;BQ'\\\u0005g-\u0001\u000b?r{7\u007fJ\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ\u0019u=\u001f\u0019jqF\u0003r0X\u007f|", "5dc X4:\\(\u0003xl\n\u0007\u00120i\u00028\t<\u0010\u001b!P", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`%Gw\nE\u0006)3gG\u000e7u\u00127\\G9y\u0012(\u001eie;\u0017p(]z1P\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface SemanticsModifier extends Modifier.Element {
    default int getId() {
        return -1;
    }

    SemanticsConfiguration getSemanticsConfiguration();

    /* JADX INFO: compiled from: SemanticsModifier.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        @Deprecated(message = "\u0016K\t6\u007f\t\u001eZk47~Y\u001b5Sn\u001a\u0012+Dq\u001f\u0012\u0005U\u0006*c\u00039ymP$C[`(AG1r<\u0017[Z95]\\zyMs\u0013KM\u001d\\ zs\u0018s\u0018\u0005<i\u000bo\u0001q4\u0011\u0001^\u0015~\u000fI3g:W/Ae+{;\fv;S%:g)\u001b\u001ax[ 33C8iH", replaceWith = @ReplaceWith(expression = "", imports = {}))
        @InterfaceC1492Gx
        public static /* synthetic */ void getId$annotations() {
        }

        @Deprecated
        public static boolean all(SemanticsModifier semanticsModifier, Function1<? super Modifier.Element, Boolean> function1) {
            return SemanticsModifier.super.all(function1);
        }

        @Deprecated
        public static boolean any(SemanticsModifier semanticsModifier, Function1<? super Modifier.Element, Boolean> function1) {
            return SemanticsModifier.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(SemanticsModifier semanticsModifier, R r2, Function2<? super R, ? super Modifier.Element, ? extends R> function2) {
            return (R) SemanticsModifier.super.foldIn(r2, function2);
        }

        @Deprecated
        public static <R> R foldOut(SemanticsModifier semanticsModifier, R r2, Function2<? super Modifier.Element, ? super R, ? extends R> function2) {
            return (R) SemanticsModifier.super.foldOut(r2, function2);
        }

        @Deprecated
        public static Modifier then(SemanticsModifier semanticsModifier, Modifier modifier) {
            return SemanticsModifier.super.then(modifier);
        }

        @Deprecated
        public static int getId(SemanticsModifier semanticsModifier) {
            return SemanticsModifier.super.getId();
        }
    }
}
