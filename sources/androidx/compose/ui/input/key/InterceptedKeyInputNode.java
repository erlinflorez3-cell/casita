package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: SoftwareKeyboardInterceptionModifier.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"B\u0012\u007f\u0007tsA0JrN.hݷZ\u000f\u001azd$\n$2rKg(~:\u0017_Pwg\u001dMj\rS\u000f4\u001a\u000fiZKe\u000bk\u0017'@RqO3{rM;ptd\t61P:ѩ\t\u0001(0\u0011(\u0005\b[K:\u0016`D~Hj\r{\b`&Ř=ĨӘ\"^m]DX5uH@;\u0003\u0018F~+m>\u0015M;I\u001b;͒uѭӿ/B=G#5$)\u0015SsM\u0013A\u0002=3k7);I\"[LW.\u0016kۇ[ոa~.ؘ\u001dSf\u001353oeQY\u001c2H!\n\u0012T\u0012\u001e\b7H\\0*h\u0018\u000eax\tRnRXސNȸ~m>Ѝ=\u000296G#\u0007SgG'Xќ{\n\u0015!)щ\u000bOZړ\u0012s"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~=\u0007/7z\u0014.XR;j\u001a\u001e)LjD\u0017r\u0015Xu'\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~G\b!FS\u0016BJM7x3\u0002\u001ewaF\u0005c7]z1P4X+`Sv=!zd\rN\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "=m4CX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\u0017~\u00167\\\u0019", "", "=m??X\fOS\"\u000e", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d]0Q?", "5dc\u001ca\fOS\"\u000e", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u001ca\fOS\"\u000e", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "5dc\u001ca\u0017KSx\u0010zg;", "Adc\u001ca\u0017KSx\u0010zg;", "=m8;g,KQ\u0019\n\nD,\u0011e/f\n5{.\u000b\u0018&-o\"9\u0001!BX", "3uT;g", "=m8;g,KQ\u0019\n\nD,\u0011e/f\n5{.\u000b\u0018&-o\"9\u0001!BXE\u0015?w\u001c\u001a`M", "uKP;W9HW\u0018H\fb,\u000fR\u0015e\u0014\b\r@\n&l\u000bd", "=m??X\u0010Gb\u0019\fx^7\fn/y\\(|J\u000e\u0017\u0005Qp\u001d\"v92cy-6", "=m??X\u0010Gb\u0019\fx^7\fn/y\\(|J\u000e\u0017\u0005Qp\u001d\"v92cy-65\u000b6WI'~>", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class InterceptedKeyInputNode extends Modifier.Node implements SoftKeyboardInterceptionModifierNode {
    private Function1<? super KeyEvent, Boolean> onEvent;
    private Function1<? super KeyEvent, Boolean> onPreEvent;

    public final Function1<KeyEvent, Boolean> getOnEvent() {
        return this.onEvent;
    }

    public final void setOnEvent(Function1<? super KeyEvent, Boolean> function1) {
        this.onEvent = function1;
    }

    public final Function1<KeyEvent, Boolean> getOnPreEvent() {
        return this.onPreEvent;
    }

    public final void setOnPreEvent(Function1<? super KeyEvent, Boolean> function1) {
        this.onPreEvent = function1;
    }

    public InterceptedKeyInputNode(Function1<? super KeyEvent, Boolean> function1, Function1<? super KeyEvent, Boolean> function12) {
        this.onEvent = function1;
        this.onPreEvent = function12;
    }

    @Override // androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
    /* JADX INFO: renamed from: onInterceptKeyBeforeSoftKeyboard-ZmokQxo, reason: not valid java name */
    public boolean mo4930onInterceptKeyBeforeSoftKeyboardZmokQxo(android.view.KeyEvent keyEvent) {
        Function1<? super KeyEvent, Boolean> function1 = this.onEvent;
        if (function1 != null) {
            return function1.invoke(KeyEvent.m5226boximpl(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
    /* JADX INFO: renamed from: onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo, reason: not valid java name */
    public boolean mo4931onPreInterceptKeyBeforeSoftKeyboardZmokQxo(android.view.KeyEvent keyEvent) {
        Function1<? super KeyEvent, Boolean> function1 = this.onPreEvent;
        if (function1 != null) {
            return function1.invoke(KeyEvent.m5226boximpl(keyEvent)).booleanValue();
        }
        return false;
    }
}
