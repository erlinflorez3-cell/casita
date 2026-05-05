package androidx.compose.ui.modifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SpreadBuilder;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: ModifierLocalModifierNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я&\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\u000b6B\r14\u0012}\nnjO0LeV\u008cZS0\u0013\u0004\u007fBřs$ BS\u0013(Ԃ:\t}M\u0018o|Jr\u000fS\u000f\f\u0017'k\\Qczu\u0016\u001f2Hpm4}\bK<x\u0001F\r&12<\n\u0005\u0007\u001bXI>z\u001bG[\f\u00181nqĐV\r[\n2*\u0014̄8\u0001L[\bP<ԟzcj91\n\u0002H^)o0CS;GlN\u001bǸy\u001eY?gM#(k\u000f\u0017Za>\u0013C\u0002=\u000biU(YM\u0014[FX\u0006\u0015C,\u0016\u0012ǁv&j\ri \u001aʬCO\u0012J\u0001>6\u0001\u0013\u0014\u001dP\n\r\u00167X4=\u001ev\b\u00144#scB`\u0002\rM.\u0005\u0010:75\u00109;=+fWbi\u001a^9\f\u0005;)Q\u000b5&ƟX\u000en!3B\u0006\u0383IQn<xb\u0018fU}\u0014vr\u0006:\u00046H.0\f\u0013>\u0017SB\nCS5y\u0010`Tw|\u0015dxSoSvA2p&7X\u0014:dt\u0015\u0013thlh@\u0017L,d\u0017\u0004\u0018\u00170\\}=O& P_h\u0018u{g8)OvG_~o\u001eW?_a6ae a\u0001\u0002BIםf\u0005fuZw\u001aȗt(P1hl\u0016Ǯ\nJ~\"!BW\u0004,<<7)^%HI$pB\r\u000boZ/\u0016-^օ(\u0014"}, d2 = {";nS6Y0>`\u007f\txZ3d\u0005:O\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n\u001dc|$8q\u0016;4M9g;\u0006\u0011s7", "9dh}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n\u001dc|$8q\u0016;4M9g;s", "9dh~", "9dh@", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001f!Fs\u000f@v2~A\b\u001f;n\u001a.Z*Ei0%jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^WV5\f\tZE${\u000e\u001f)\u00070J\u0006;ug\u0016\u0014\n<@f)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,:hUg'[>;(\u0014~b\u0003rO2\u000b\u007fS\u001eY\\wcn\u001d\\a4-=zeJD\u0003\u001f:~/*U\nw[B\\>3~,\b5.6qN3q\u0017B_|\u00159CK%\"=$\u000fJ!", "\"", "9dh", "uZ;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001fQn\u0012=z%B#e*6q\u00172MP\"u2\u001a\u001c>% \u0003l+[\u0001+F_\u0018*fZ}G\"\u0012$\u001eRt\u0015\u000fXE%rDDho6H\u0006<l\u0001\u0019|\u00183fw*R\u001b\u001d", "3mc?\\,L", "\u001aj^A_0G\u001d\u0004z~k\u0002", "", "uZ;8b;EW\"HeZ0\n^rL{1zM\u000b\u001b\u0016Z9\fF~0?g}iGq_6WB?l8\u001e\"2IC\u0006g-Rv4.VL(c:nHi", "3mc?lw", "3mc?lx", "uKZ<g3B\\bivb9Ro5o\u000f/\u007fIJ\u0002\u0013K|c2]+?h\u0005$@7\u0001*QP\u0011/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u001ad\rR,\u0011\u0005f\u000b\fxC; \f,VhEf|\u0013}\n@@", "3mc?l", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ModifierLocalModifierNodeKt {
    public static final ModifierLocalMap modifierLocalMapOf() {
        return EmptyMap.INSTANCE;
    }

    public static final <T> ModifierLocalMap modifierLocalMapOf(ModifierLocal<T> modifierLocal) {
        return new SingleLocalMap(modifierLocal);
    }

    public static final <T> ModifierLocalMap modifierLocalMapOf(Pair<? extends ModifierLocal<T>, ? extends T> pair) {
        SingleLocalMap singleLocalMap = new SingleLocalMap(pair.getFirst());
        singleLocalMap.mo5620set$ui_release(pair.getFirst(), pair.getSecond());
        return singleLocalMap;
    }

    public static final ModifierLocalMap modifierLocalMapOf(ModifierLocal<?> modifierLocal, ModifierLocal<?> modifierLocal2, ModifierLocal<?>... modifierLocalArr) {
        Pair pair = TuplesKt.to(modifierLocal, null);
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(TuplesKt.to(modifierLocal2, null));
        ArrayList arrayList = new ArrayList(modifierLocalArr.length);
        for (ModifierLocal<?> modifierLocal3 : modifierLocalArr) {
            arrayList.add(TuplesKt.to(modifierLocal3, null));
        }
        spreadBuilder.addSpread(arrayList.toArray(new Pair[0]));
        return new MultiLocalMap(pair, (Pair[]) spreadBuilder.toArray(new Pair[spreadBuilder.size()]));
    }

    public static final ModifierLocalMap modifierLocalMapOf(Pair<? extends ModifierLocal<?>, ? extends Object> pair, Pair<? extends ModifierLocal<?>, ? extends Object> pair2, Pair<? extends ModifierLocal<?>, ? extends Object>... pairArr) {
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(pair2);
        spreadBuilder.addSpread(pairArr);
        return new MultiLocalMap(pair, (Pair[]) spreadBuilder.toArray(new Pair[spreadBuilder.size()]));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0018Y\u0001tr4\u0019`^M-\rU#@\u000ekb\u000e9\u0011w\rV{J.\u0001S\u00077owZ$QS\u001c|AO1r@'dO\u000e+gV")
    @InterfaceC1492Gx
    public static final /* synthetic */ ModifierLocalMap modifierLocalMapOf(ModifierLocal... modifierLocalArr) {
        int length = modifierLocalArr.length;
        if (length == 0) {
            return EmptyMap.INSTANCE;
        }
        if (length == 1) {
            return new SingleLocalMap((ModifierLocal) ArraysKt.first(modifierLocalArr));
        }
        Pair pair = TuplesKt.to(ArraysKt.first(modifierLocalArr), null);
        List listDrop = ArraysKt.drop(modifierLocalArr, 1);
        ArrayList arrayList = new ArrayList(listDrop.size());
        int size = listDrop.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(TuplesKt.to((ModifierLocal) listDrop.get(i2), null));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        return new MultiLocalMap(pair, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0018Y\u0001tr4\u0019`^M-\rU#@\u000ekb\u000e9\u0011w\rV{J.\u0001S\u00077owZ$QS\u001c|AO1r@'dO\u000e+gV")
    @InterfaceC1492Gx
    public static final /* synthetic */ ModifierLocalMap modifierLocalMapOf(Pair... pairArr) {
        int length = pairArr.length;
        if (length == 0) {
            return EmptyMap.INSTANCE;
        }
        if (length == 1) {
            return new MultiLocalMap((Pair) ArraysKt.first(pairArr), new Pair[0]);
        }
        Pair pair = (Pair) ArraysKt.first(pairArr);
        Pair[] pairArr2 = (Pair[]) ArraysKt.drop(pairArr, 1).toArray(new Pair[0]);
        return new MultiLocalMap(pair, (Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
    }
}
