package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
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
/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.TYPE})
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000e]Lш|\u0004O\f8é6B\r54\u0012}\u0007njG?LeV:ZS0\"qڜ4:ӋTqq:\u0016t\u000e(\u000fO\\g\u007fnx[\u001bI\u0015\u0006$z\u0003,wX\tc\u0018\u000f@F\b?aP\u007fI?`\u0003;\u001d&B$Hy3\bH0X\u001c|zQS$\u0018@B\u0001:\u0001\u0014{\u000b*\u0018\f>.\n6\\\u0016UFNr]H9;\u0003\u0018I^-e0\u000bX%F\u0003(]\ro\"C@e8kǴUΫ\u000b\\kA\tK\u007fJ\u001dj-59XDlD]\u0018\u001a%-_\r\fyTb;Vԃ\u0010+CQi[^\u001fx\r\t\u0004%B\u0014\u0010\u0016'v5[ \u001d\rԧ7x\u000bUFb\u0010o\u0013\u0016\tlN\u0017S\u0001\nڇ;Ӹj[q=\u001faE\t\u001d\u000f$7\u000f\u0004qjb\u0017x\u0015I[.VśUDUJT gT>\u0013~b\u001a*21}\u0005\u009e\u007f\u0015F\u0019+OiNs0y\u0004`D\u0016y;eĈWmjJF;|%\b@\u0017\u0016rD\u0013\fB´Vг0\u001b]\u001eZ!\f\u0015+\"b\u0013J8٠\u0014j"}, d2 = {"\u001aj^A_0G\u001d\u0001~\nZ+x\u0018+;", "", "9h]1", "", ";dc.W(MO\n~\bl0\u0007\u0012", "", "0xc2V6=S\n~\bl0\u0007\u0012", "2`c.$", "", "", "2`c.%", "3wc?T\u001aM`\u001d\b|", ">`R8T.><\u0015\u0007z", "3wc?T\u0010Gb", "0u\u0013.a5Hb\u0015\u000e~h5\u000b", "u(E", "0u", "u(J\u0016", "20", "u(J\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "21", "Fh\u0013.a5Hb\u0015\u000e~h5\u000b", "Fh", "u(8", "Fr", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "9", ";u", ">m\u0013.a5Hb\u0015\u000e~h5\u000b", ">m", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
public @interface Metadata {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        @Deprecated(level = DeprecationLevel.WARNING, message = "\u0005_\u0010:t\u0004\u0019\\\u0018]-\rc\u001e;\\\u001cT\n+Dv\u001b\u0012\nOuxWz-iiZx\u0002bomxO,r%!jX\u00030\u0018U@y?8\u0013 HSE)zs\u000b\u0007K\u0007@(W=}ba\u001a\u0001U\u001fU\u007fEm1?\u0013pzY1\u0003\u00112zaZ\u00158\u0012$$\u0019\u0007")
        @InterfaceC1492Gx
        public static /* synthetic */ void bv$annotations() {
        }

        public static /* synthetic */ void pn$annotations() {
        }

        public static /* synthetic */ void xi$annotations() {
        }
    }

    int[] bv() default {1, 0, 3};

    String[] d1() default {};

    String[] d2() default {};

    int k() default 1;

    int[] mv() default {};

    String pn() default "";

    int xi() default 0;

    String xs() default "";
}
