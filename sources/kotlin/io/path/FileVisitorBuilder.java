package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4\u0012\u000e\u0007njO0LeN.ZS@\u000fsڔ<$q$yّCU0}*\tUPog\u0005JbŏI\u0005\u001cǝ)jZH\u001e9k\u0012'2ppoi[qUkp\u0006F\u0014N6ŕ<\u0004\u000b\u0006*0N\u0016\u0007|IQ2\u0019@S\u0001Kh\f{\rܨ\u0016\u0010D%\u0011$bm^8Nr\u0004C?%\u0013ipXUbv!\u0016KT_?\r%bN_N9ME5d\u0013\u0016\u0001_ύ\u0007IwB\u0015n--;Ky]\\_\u0010%%:}\u0019ǁv0b\naf\u0012-;QiQv\u001b8y\u000b{;F2\u0011LK\u0011l;(~\b<4%'aBh2nS\u0010\n\u0010:а)\n90I!lWq=\u001fT]\u000b\u0015\u001e.2/zĲ_^\u0014e%!Z}a3WFcU^\fi=\u001c\u000e\u001feHNLnU\u0010G{?/GYE]QS1|\u0012WrkЛ\tjnXyXNF2p\u001c=P\u0018\u001ckTs3sÏXb2\u0016]\"Z\r\u000e\n\u0019&\u0003\u0001L#5\u0010|Y\u0017l1qέ\t$@ϲ;k"}, d2 = {"\u001aj^A_0G\u001d\u001d\tDi(\f\fxF\u0004/{1\u0005%\u001bVy\u001b\u0019\u0007)<X}-\r", "", "=m?<f;/W'\u0003\n=0\n\t-t\n5\u0010", "", "4t]0g0H\\", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aiPCTuGW#H{b3|R\u001aa\u000f+Q", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "2ha2V;H`-", "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", "3wR2c;B]\"", "\u001aiPCTuGW#H{b3|R\u0010i\u0007(lD\u000f\u001b&4o\u001cL}4\u000b", "=m??X\u001dBa\u001d\u000eYb9|\u0007>o\r<", "\u001aiPCTuGW#H{b3|R+t\u000f5\u007f=\u0011&\u0017\u0011L\nJz#\u0016]\u0005 \u0013|%;Q@Kz4,j", "/sc?\\)Nb\u0019\r", "=mE6f0M4\u001d\u0006z", "4h[2", "=mE6f0M4\u001d\u0006z?(\u0001\u0010/d", "\u001aj^A_0G\u001d\u001d\tDi(\f\fxF\u0004/{1\u0005%\u001bVy\u001b\u0019\u0007)<X}-\u001bu!5#", "9nc9\\5\u0006a(}\u0002b)D\u000e.kQ"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public interface FileVisitorBuilder {
    void onPostVisitDirectory(Function2<? super Path, ? super IOException, ? extends FileVisitResult> function2);

    void onPreVisitDirectory(Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function2);

    void onVisitFile(Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function2);

    void onVisitFileFailed(Function2<? super Path, ? super IOException, ? extends FileVisitResult> function2);
}
