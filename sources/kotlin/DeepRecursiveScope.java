package kotlin;

import com.dynatrace.android.agent.Global;
import kotlin.coroutines.Continuation;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0006DLc\u0003İI\u00066\u000f6B\u0015\"4\u0012}\u0007njG/Le^.Zݷ0D\u0002ڔ\\&aҕ\u007fBcW |0\t\u007fN\u0016h/O`\rß\u0013\u0006$z3@WX\u0011]H\u000ebF}CKM&މ\u007fƂ3ȥ\t @'\u0001*\u0013\u00042*\u000f\u0016\u0017|IK\u001a\u0019PBv;`\u0013u\u0011*\u0014\u0016>f\b.^wN|N\u001bej31\u0007\u0002B\u0015.&݅;֔\u0011Fb0U\u0014o(C@e@=-c\u0003\rSk?\t@ E5n5+CK\nVdYFϴ\u0015ۃN\fiğ*i"}, d2 = {"\u001aj^A_0G\u001dw~zi\u0019|\u0007?r\u000e,\r@n\u0015!Roc", "\"", Global.BLANK, "", "u(E", "1`[9E,<c&\r~o,", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxW:\u00012?i\r$@m$w+MDz8'%dp=\u0011l\u0002\u0012],C]JucN{?]{W\u0013N)\u001cZ", "!", "#", "\u001aj^A_0G\u001dw~zi\u0019|\u0007?r\u000e,\r@a' E~\u0012F\u007fz", "uKZ<g3B\\b]z^7i\t-u\r6\u007fQ\u0001w'Pm\u001d@\u0001.\u000b@\u0003\u001cHi_5IL=5\u001e\u001b\u001ah_H\\J2X\u0006.KU\u0018*f_|M#\u0016c\u000e\\tj\u000fbP(wT3.\f6RW~O\u0006\b'\n~qlKXY1v\u001au?8>", "7me<^,", "", "\u001aj^A_0G\u001dw~zi\u0019|\u0007?r\u000e,\r@n\u0015!RoqD\u0002,\u000b", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public abstract class DeepRecursiveScope<T, R> {
    private DeepRecursiveScope() {
    }

    public /* synthetic */ DeepRecursiveScope(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Object callRecursive(T t2, Continuation<? super R> continuation);

    public abstract <U, S> Object callRecursive(DeepRecursiveFunction<U, S> deepRecursiveFunction, U u2, Continuation<? super S> continuation);

    @Deprecated(level = DeprecationLevel.ERROR, message = "iO\nK\u0001\u007f\u001a\u001e\u0018Z0\ne!0\u000ej[\u001df\u0007mKUwRzoR4*xwY$&Rax+K!HL%_b~\u0015[WKj\fs\u0007\u001fLS\u000b\u001ew@\u000ed\u0011rL.^\u0007\u0012bhG\u0010WOC\n\u0001@-4h\u0002N\\+|;)\u0004aX\u0018+>#\u001a\fI\u0012\u001b.2R<f~V5GzjePp\u001fPE>.8t4\u001b\u000bR", replaceWith = @ReplaceWith(expression = "this.callRecursive(value)", imports = {}))
    @InterfaceC1492Gx
    public final Void invoke(DeepRecursiveFunction<?, ?> deepRecursiveFunction, Object obj) {
        Intrinsics.checkNotNullParameter(deepRecursiveFunction, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }
}
