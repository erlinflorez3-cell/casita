package androidx.compose.ui.autofill;

import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: Autofill.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O$8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.`_2\u000fy{<$a*yCI[\"}(\fWNupvJ`\rI\u0014\u001cǝ\u0017\u0005\\I\u0004w\u0016\u0011)rw\u007fK9M}=Qf\u00058\u0015 `$fz\u0015\t *V\u0013\u000f|YJ:\u0016@R~?j\u001b]\u0007*\u00124E0\u0003.\\\u0016VLG\u001bcƠ3#\u0011r\u000b_5uH|{$vZ5%\u000fc4*n6{խ%\u001c\t\u0015ks?1P8QU}5'CO\u0004YFX.\u0016C,̠\u0011cz̦t\u0007Wj\u001a2{iqNh\u0010>v)\u007fcɤ\u0010؝\n3P͓E\u001cl\u0014\u001c@\u0015tYN^\u0011/Q\u000e\u000by6E6ő71Aӕ~SgM'a\b\u0019\u0013\u001261\u0011p1[\u0003\u0015p\u0017+T&YGPnC˓R\u0010aƝ\u0006\u0006vv\u0010?˟4b"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0011i\r*8q\u001d56M:k\n", "", "/tc<Y0EZ\b\u0013\u0006^:", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0011i\r*8q\u001d5<WFk\n", "0nd;W0GUu\t\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "=m56_3", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f$\u0005?\u000e!\u001bF\u0003W:\u0001-@c\f \u0001}\u001awOCEs4-\"|+&\u0007a;$]-Q[U0e\u001cwN\u001c[[\u001eW)\u001c\tcJ28%G(\u0006;M\fD4VO\u0007", "5dc\u000eh;HT\u001d\u0006\u0002M@\b\t=", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u000fb<GR\u001d\b|;6\u0010", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#j 5|k", "Adc\u000fb<GR\u001d\b|;6\u0010", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~F}\u001eFCY\u001f", "7c", "", "5dc\u0016W", "u(8", "5dc\u001ca\rBZ ", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "3pd._:", "", "=sW2e", "6`b566=S", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AutofillNode {
    private static int previousId = 0;
    private final List<AutofillType> autofillTypes;
    private Rect boundingBox;
    private final int id;
    private final Function1<String, Unit> onFill;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public AutofillNode(List<? extends AutofillType> list, Rect rect, Function1<? super String, Unit> function1) {
        this.autofillTypes = list;
        this.boundingBox = rect;
        this.onFill = function1;
        this.id = Companion.generateId();
    }

    public /* synthetic */ AutofillNode(List list, Rect rect, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? CollectionsKt.emptyList() : list, (i2 + 2) - (i2 | 2) != 0 ? null : rect, function1);
    }

    public final List<AutofillType> getAutofillTypes() {
        return this.autofillTypes;
    }

    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final void setBoundingBox(Rect rect) {
        this.boundingBox = rect;
    }

    public final Function1<String, Unit> getOnFill() {
        return this.onFill;
    }

    /* JADX INFO: compiled from: Autofill.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"2ߛx\u001d߿\u001b9^C&M4Rޚ.\u000fy{|*i'\nCiW`}r\u0015]O\u007fg\u001dL1ŒOǇ\n\u0016\u0001̓\u0082MY"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0011i\r*8q\u001d56M:kr{\u001fpl5\u0010g6WL", "", "u(E", ">qTC\\6Na|}", "", "5d]2e(MS|}", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int generateId() {
            int i2;
            synchronized (this) {
                Companion companion = AutofillNode.Companion;
                AutofillNode.previousId++;
                i2 = AutofillNode.previousId;
            }
            return i2;
        }
    }

    public final int getId() {
        return this.id;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillNode)) {
            return false;
        }
        AutofillNode autofillNode = (AutofillNode) obj;
        return Intrinsics.areEqual(this.autofillTypes, autofillNode.autofillTypes) && Intrinsics.areEqual(this.boundingBox, autofillNode.boundingBox) && this.onFill == autofillNode.onFill;
    }

    public int hashCode() {
        int iHashCode = this.autofillTypes.hashCode() * 31;
        Rect rect = this.boundingBox;
        int iHashCode2 = (iHashCode + (rect != null ? rect.hashCode() : 0)) * 31;
        Function1<String, Unit> function1 = this.onFill;
        return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
    }
}
