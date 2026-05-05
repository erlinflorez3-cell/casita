package androidx.compose.ui.focus;

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
/* JADX INFO: compiled from: FocusProperties.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4E\u0007\"B\u0012\u007f\u0007lpA0ZeP.hS2\u000fq\u0018:\tqҕ\"CiTj\u00140\tgN\u0016hEСfŲG\u0019\u001e\u0018~l:Luzc\u0016\u001d7\u0013\u0012M;eok@\u0011xD\u000b82P?0Y?n\u0001Б\u001cͯ~Mc\u000e\u00189NzZT\u0013X\u0013&b(L-\u0019\u001e\u000bn~:Vru:]*9>\u0001#}ۖ<ƊQ\u0017^V-\u001b\u0005k>-FFC!u\u0014\u0011\u0019jgO\u0005Oqk\u0016x)7+wz\u0006F\t\u0010\"\u001bC[\u001d_\u0003&\u000b\u0016ab\u001c'YV\u0012[\u0007cfMQԠ\u0019ʀ\b\u001e\u0016)NA;.~\n\u0014H\u0003\tsBV\u0019lZP;oO/1\u00105;9IwacK\u0019|>*\u0015=.1\u0007\u0007-kV\u001e`C,dya1\u007fGkX\u0005_\u0018\u0013Dզ|Ċ\u0006:\u00142M\u001a=\u0010)0\u001d@EqY%'\b\u0010`\u0015\n\u0005\"xh\u0002p\u0003LN(\u0007\u0016e1?`\u0019\u0019;ʤwÏXbD\u0013S:b\u0011\u001e\n\u0019?j\u0004\rC30fO\u0017p\u001bQk\u0010=/\u0015>\u0010C*b.߁jۋ9[{\u0012gs\u0005\u001e_>h'fr\u0013u\u001a}t(P9xn\u001e}\u0014D|\u0013I\u0007}Frِ8֞\u001df-J\tBPK\u001d\u000be\u007fv\u001cOvAJ\u001biR{9\u0005^b\to\u0016\u007f\u007f\u0001;5xΡMپ9#>W(\u0010B\u0007C\t\u0005\u001c\u000eS8nUu\u0005\u0016$\\,$$ QQ]DIc=}\tğ9։P|}SS<5\u0005\u001d{\u0015fv:8*x\u001dD`\u0019Q\u007fX%(\u000f^!*>9>N8Ö\u0007ĕg^#]Dv\u0001\ry>Tf\u000b\u0011ʍ\u001dݒ˝o&\u000573bU\u001cɟ{Cڭ\u0019`"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egh-Ax\u0016;\\G;y\n", "", "1`]\u0013b*Na", "", "5dc\u0010T5\u001f]\u0017\u000f\t", "u(I", "Adc\u0010T5\u001f]\u0017\u000f\t", "uY\u0018#", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzKo", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egj C}\u0016<\\CHA", "2nf;", "5dc\u0011b>G", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0018Qm\u001eJ@\u0006?W\u000e.$m\">MQJkAs", "Adc\u0011b>G", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\r7y&.[R;x\na\u0006", "3mS", "5dc\u0012a+", "Adc\u0012a+", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Eg\\$Dm\u0014=QMDA", "3mc2e", "5dc\u0012a;>`Wz\u0004g6\f\u0005>i\n1\n", "u(E", "5dc\u0012a;>`", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u0012a;>`", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "3wXA", "5dc\u0012k0M\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc\u0012k0M", "Adc\u0012k0M", ":dUA", "5dc\u0019X-M", "Adc\u0019X-M", "<dgA", "5dc\u001bX?M", "Adc\u001bX?M", ">qTC\\6Na", "5dc\u001de,OW#\u000f\t", "Adc\u001de,OW#\u000f\t", "@hV5g", "5dc\u001f\\.Ab", "Adc\u001f\\.Ab", "AsP?g", "5dc g(Kb", "Adc g(Kb", "Co", "5dc\"c", "Adc\"c", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface FocusProperties {
    static /* synthetic */ void getEnter$annotations() {
    }

    static /* synthetic */ void getExit$annotations() {
    }

    boolean getCanFocus();

    void setCanFocus(boolean z2);

    default void setDown(FocusRequester focusRequester) {
    }

    default void setEnd(FocusRequester focusRequester) {
    }

    default void setEnter(Function1<? super FocusDirection, FocusRequester> function1) {
    }

    default void setExit(Function1<? super FocusDirection, FocusRequester> function1) {
    }

    default void setLeft(FocusRequester focusRequester) {
    }

    default void setNext(FocusRequester focusRequester) {
    }

    default void setPrevious(FocusRequester focusRequester) {
    }

    default void setRight(FocusRequester focusRequester) {
    }

    default void setStart(FocusRequester focusRequester) {
    }

    default void setUp(FocusRequester focusRequester) {
    }

    default FocusRequester getNext() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getPrevious() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getUp() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getDown() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getLeft() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getRight() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getStart() {
        return FocusRequester.Companion.getDefault();
    }

    default FocusRequester getEnd() {
        return FocusRequester.Companion.getDefault();
    }

    default Function1<FocusDirection, FocusRequester> getEnter() {
        return new Function1<FocusDirection, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusProperties$enter$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
                return m3876invoke3ESFkO8(focusDirection.m3852unboximpl());
            }

            /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m3876invoke3ESFkO8(int i2) {
                return FocusRequester.Companion.getDefault();
            }
        };
    }

    default Function1<FocusDirection, FocusRequester> getExit() {
        return new Function1<FocusDirection, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusProperties$exit$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
                return m3877invoke3ESFkO8(focusDirection.m3852unboximpl());
            }

            /* JADX INFO: renamed from: invoke-3ESFkO8, reason: not valid java name */
            public final FocusRequester m3877invoke3ESFkO8(int i2) {
                return FocusRequester.Companion.getDefault();
            }
        };
    }
}
