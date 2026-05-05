package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
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
/* JADX INFO: compiled from: AutofillUtils.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG9L͜P.hS2\u000fq}<$i$yّCU(\r*\t]ZogtLb\u000bQ\u0015\u000e\u0016~k4Ic\u0004e܈\u0015̲B\u0006ЀcM\u001e<yez6ӯ$208B\u0015\u000f\u001bBJ&u)E{\u0010 3XphVSRM( \u000bV /$\rk\\=`l\fBu(KwPW?_^\u0003}\u0011T[?\r%id0\tEC\u001f=S1\r\u0003_M\nWqk\r/,o9W~o6\u0007\u0006D\u00199V%]!.#\n\u001a\u0002\u001a3CO\u0012X\u0001\u00126z\u0013{;@4\u0018\u00145`4=\u001cv\b<C#\u0002\u001aEг\u0006^P\u0011C\u007fD)=\u007fa8i\u001ftTy;GRg\u007f\u0013 6#/pQ_b\"x\u0015Ii>VygNS`N8fmq\u0012sz\u0002X\b`K\u000eF\u0014\u0011\\,k<$G19\u0004\u0002v]\u0018z\u0013g\u0001S\u0018Z\u000fE̷r0"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0011i\r*8q\u001d5)N?8\u0005\u0001\u0015ol9\u00149", "", "u(E", "5dc\u000eh;HT\u001d\u0006\u0002B+", "\u001a`]1e6BRb\u0010~^>F\u0005?t\n)\u007fG\b`rW~\u0018=z,<=|u", "AsaBV;N`\u0019", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0016\u000bM\u0011\u0015&W|\u000e\u0012", "7r3.g,", "", "D`[BX", "\u001a`]1e6BRb\u0010~^>F\u0005?t\n)\u007fG\b`rW~\u0018=z,<Jy'Gmk", "7r;6f;", "7rC2k;", "7rC<Z.ES", "Adc\u000eh;HT\u001d\u0006\u0002A0\u0006\u0018=", "", "6h]Af", "", "", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:iO\u000e'\u0015V\u007f\u001b<L\u001b\u001c^y137\u001d*VE\u0005YC+\u0019qc\u000fJT", "Adc\u000eh;HT\u001d\u0006\u0002B+", ">`a2a;", "DhaAh(E7\u0018", "", "Adc\u000eh;HT\u001d\u0006\u0002M@\b\t", "Bx_2", "BdgAI(Ec\u0019", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AutofillApi26Helper {
    public static final int $stable = 0;
    public static final AutofillApi26Helper INSTANCE = new AutofillApi26Helper();

    private AutofillApi26Helper() {
    }

    public final void setAutofillId(ViewStructure viewStructure, AutofillId autofillId, int i2) {
        viewStructure.setAutofillId(autofillId, i2);
    }

    public final AutofillId getAutofillId(ViewStructure viewStructure) {
        return viewStructure.getAutofillId();
    }

    public final void setAutofillType(ViewStructure viewStructure, int i2) {
        viewStructure.setAutofillType(i2);
    }

    public final void setAutofillHints(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public final boolean isText(AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    public final boolean isDate(AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    public final boolean isList(AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    public final boolean isToggle(AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    public final CharSequence textValue(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }
}
