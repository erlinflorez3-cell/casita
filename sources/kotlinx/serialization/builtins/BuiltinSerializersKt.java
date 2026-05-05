package kotlinx.serialization.builtins;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.time.Duration;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanArraySerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.ByteSerializer;
import kotlinx.serialization.internal.CharArraySerializer;
import kotlinx.serialization.internal.CharSerializer;
import kotlinx.serialization.internal.DoubleArraySerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.DurationSerializer;
import kotlinx.serialization.internal.FloatArraySerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntArraySerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.LongArraySerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.NothingSerializer;
import kotlinx.serialization.internal.NullableSerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.ReferenceArraySerializer;
import kotlinx.serialization.internal.ShortArraySerializer;
import kotlinx.serialization.internal.ShortSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import kotlinx.serialization.internal.UByteArraySerializer;
import kotlinx.serialization.internal.UByteSerializer;
import kotlinx.serialization.internal.UIntArraySerializer;
import kotlinx.serialization.internal.UIntSerializer;
import kotlinx.serialization.internal.ULongArraySerializer;
import kotlinx.serialization.internal.ULongSerializer;
import kotlinx.serialization.internal.UShortArraySerializer;
import kotlinx.serialization.internal.UShortSerializer;
import kotlinx.serialization.internal.UnitSerializer;
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
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:305)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яė\u0015D߬)\u001e\u007f\u007fL܀kt\u0012ǻ\u000e0\u00111J~0;\u001aw\rfr9FDmH4R[*\u001d\u0002\u0004é,[2\u0002KП]\u001a\f9\u0011ѧVgu\u007fRҙ\u0013C\u001d\u0018\u001eюr,Wh\u0001ز\u001a\u000f@`wЀ;M}QAś|6\u0013D:\">|\r\u0001(LPƵ~zQJ\u0014۵8@\u0007:Z҈U\u0005(2\u000ē(\u0001,qoޮ>H\u0003]B/)\bqBd'gܞ\u0005M#F\\܋\u0015vw\u001e3¨?5+%[Έ\u000fRiH\u000b?\b=\rؒ/'9L{WLX\b\u0014#5W\rsr.\\\u0013Uh\f=+WcYU\u0016(\u000ez\u0004\rJ\n\u0016\u0006=H6-(m\u0010\u000eItzSNX\n^X\u007f\u0003aD#-\u007fI+A\u001b|Qi;/N?{\u001b\r&#\u0017n)[j\u000eh\u00151T\u007fQGQH=^N\u0012YKm\f͏j\u0002@\u00048G\u0016/\u0004߾F[3=sE3){\bXFwvKh\u0017Z\u0018QhF(Â$7R\t:[dl\u000bj^\\\u0001.'LbT7\b\u0016\u001c8b\b>1%VN}r\u001at[h\"+?hGY5s<V\u007fcKp_i(mb~$ELd\u0015X-J\u0002\u0013\t[H*8ʋx\u0010\u000ezlN:\u0014RIw\u001bB4G\u0018\u0005\u0017^\u0002dBq\u0007\u0017jrn \u0001d3j\u000b\u0018#;կ\u0007hf~{\u007f~Y.\r`P:oPM#4c:nD~3\u0007-\u0003.F\u007fVU\\\u0005\u001c\u0006W\f D+gPGG!!\u0017/B\u0004=Ez\u0006\u0014Pe\u001c5\u000f\u0015\u007f\u001f=x.\u0016\u001d\u0019oDjx`gZ'$\u0007^!:6c\u0018\u001eo^\u0013Ss\\\u001baNK\u0003\u0003 <|Q+\u0004? +˚}\"-?;N?#&y$/[a\fh\b8\b|',\u0005g\u0014,\u00121\u001eai\u001c@WP[i\rN.4n\u0013B\u000f\t\b\nR\tz,aeoc\u0011X>ԇ\u0019M\u001eh\r+\u001b\u0010\u0007eH3\b\u0004D0o*:a,\u0013\u000fM32eYwo}K#*x\u000e\"I\nS\u0007$,K0bgd\u00190L\u0012(8Q;)$j,R3L>\u000eՁQr\n\b\u0016y\u000ee\u0010\u0019%RZyKX\u001eT?z\u0005G5jS\u000290\u0011\u0001\u001f3d\u0018c0\u001dyTxGiB\u0003c\u001d7@\u0019NEk=iRzQ-8f\u0011\u0017U_SIHT\u0014I9m2\u000f:_F{=D\u001eÇGo1a|/l*\u0006n\\\u0005\u000f\u0018vT^\"o\u001d){>F\u00180#\u001f_t\u007fbsk|vOg()/P9\u000f\u001c\u0003sH+-L5[fwi4)\u0002ߺa;.\u0012.+?\n\u0005#lWTf8\\3D$\u001c.h\u0012\u000b#PN/\\I\rK\u0018Z N_\u0016C\u0014#`ik>OP);lLq[j\t\n*\u001d\u0012\u001c\u0004\n#h7ؼ\b\u001dMR#\b5|N\u0015^ZHA\u0004*fB\u0018\u001a%(/6N\u0011W\u000f\u007fmv#\u0004Uk\u000f;/2Y\u00100`\\,17\u007f\u0006\u0006:TnEiUeMr=trRY\u001e^\u0019]\u0013sR.ڦ{ۈ`m\u001fILL\u0003 t/ePMZSLؕ\u0006ʗ]X4YIXO\u001dG29)VuW\b΅aߍ\u00189PC\u000b\u0006w.=F\u0003xH& )ߟcܞ>^StZ\u000e<\u0013\u001e\u0011]\u0018f\u001ff\\HZՀU3OX)\u000f#t\u001eu\u0017\u001bEj\u007f\u0014S))|/NW\b?(RyGt3/=2IV\u000f;Sx}Z5H\u001akZ\u0001]c\u0005S\u0010+q5sc\u0012cN<\"%4&\u0016uQFs0p*\u000e$Xd\u0002\u0014\u001c,:8~DQ\u0010\u001bw\u001c\nZ30\u0002r\u0018y:Q|$\u0019r\tX,\u0015\u0007s\u0019\u0001\b\u0019\u0001%K$9\u001f\u0006W\u007fE{8O \u000eCW\u0001\nGbm>#s2\t``^yu\u0010q;\u0014i*Zslzm\u007f0>7:\r;U،0ׯx\u0011nY0-[xV6\u000bK{@\u000b\u000bnbƔ]ܻZ\u001d\u0019B.4X\u0019\u0012}x5C\u0012[G\"\u0017ܠ\u0011͟\u00142+Ms+\u0016'wju\u0016\u0004p\u0001=g\u000bۇlԲpHs\u0019\u001d[1Mt+CX\u0019*VG\u0005\u0017Ϲ.X\u0014g]uVL\\~T*}0^\u000b~}\u0003C\f\\í\u001e\u07b7uFsۿJjG_t\u0013A6\u001en\u0001TC3~ߏ\u0011\u0010i\u0019A\fFYI43sS1lz>!ƖY\u0007}K\u0016\u0005oM91\fC=FٞlXm?\u001fnĊ\u0003h"}, d2 = {"<t[9T)ES", "\u001aj^A_0Gfb\rzk0x\u00103z{7\u007fJ\n`|5o\u001b@r,9n}-\r", "\"", "", "5dc\u001bh3EO\u0016\u0006z\u001d(\u0006\u00129t{7\u007fJ\n%", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `-]\u000eIz!<]\u0013 DCY\u001f", "5dc\u001bh3EO\u0016\u0006z", "uKZ<g3B\\,H\t^9\u0001\u00056i\u0015$\u000bD\u000b `-]\u000eIz!<]\u0013 DCY\u0015SMJr8'(2o9\u0014g(Uz<C[R6e\u001cX+\u0014\u001f^\nU/\"\u0005f\u0017", "\u000fqa.l\u001a>`\u001dz\u0002bA|\u0016", "", "\u0013", "9B[.f:", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "3kT:X5MA\u0019\f~Z3\u0001\u001e/r", "\u0010n^9X(G/&\fvr\u001a|\u00163a\u0007,\u0011@\u000e", "", "\u0010xc249KO-lzk0x\u00103z\u007f5", "", "\u0011gP?49KO-lzk0x\u00103z\u007f5", "", "\u0012nd/_,\u001a`&z\u000fL,\n\r+l\u0004={M", "", "\u0014k^.g\bK`\u0015\u0013h^9\u0001\u00056i\u0015(\t", "", "\u0017mc\u000ee9:g\u0007~\bb(\u0004\rDe\r", "", "\u001ahbAF,KW\u0015\u0006~s,\n", "", "\u001an]449KO-lzk0x\u00103z\u007f5", "", "\u001b`_\u0012a;Kg\u0007~\bb(\u0004\rDe\r", "", "\u0019", "$", "9dh X9BO \u0003\u0010^9", "D`[BX\u001a>`\u001dz\u0002bA|\u0016", "\u001b`_ X9BO \u0003\u0010^9", "", "\u001cnc5\\5@A\u0019\f~Z3\u0001\u001e/r", "", "\u001e`X?F,KW\u0015\u0006~s,\n", "\u001aj^A_0G\u001d\u0004z~k\u0002", "!dc X9BO \u0003\u0010^9", "", "!g^?g\bK`\u0015\u0013h^9\u0001\u00056i\u0015(\t", "", "\"qX=_,,S&\u0003ve0\u0012\t<", "\u001aj^A_0G\u001d\b\f~i3|^", "\u000f", "\u0010", "\u0011", "/RT?\\(EW.~\b", "0RT?\\(EW.~\b", "1RT?\\(EW.~\b", "#AhAX\bK`\u0015\u0013h^9\u0001\u00056i\u0015(\t", "\u001aj^A_0G\u001d\t[\u000fm,X\u0016<a\u0014}", "#H]A49KO-lzk0x\u00103z\u007f5", "\u001aj^A_0G\u001d\tb\u0004m\b\n\u0016+yU", "#K^;Z\bK`\u0015\u0013h^9\u0001\u00056i\u0015(\t", "\u001aj^A_0G\u001d\te\u0005g.X\u0016<a\u0014}", "#RW<e;\u001a`&z\u000fL,\n\r+l\u0004={M", "\u001aj^A_0G\u001d\tl}h9\fd<r{<Q", "Ada6T3Bh\u0019\f", "", "\u001aj^A_0G\u001du\t\u0005e,x\u0012mC\n0\u0007<\n\u001b!PE", "uKZ<g3B\\b\u0004\ffu\u0001\u0012>e\r1wGJs!Qv\u000e8\u007f\u0003?a\t\u001c@q 77@@k2-j,H?\u0011r3R\u007f:\u0011ZN9`NyA)\u000ei\u0012X4VjGA1r@>#\u001d,VW", "", "\u001aj^A_0G\u001du\u0013\n^jZ\u00137p{1\u007fJ\nl", "", "\u001aj^A_0G\u001dv\u0002vkjZ\u00137p{1\u007fJ\nl", "", "\u001aj^A_0G\u001dw\t\u000b[3|G\ro\b3wI\u0005! \u001d", "", "\u001aj^A_0G\u001dy\u0006\u0005Z;;f9m\u000b$\u0005D\u000b l", "", "\u001aj^A_0G\u001d|\b\n\u001d\n\u0007\u0011:a\t,\u0006IV", "", "\u001aj^A_0G\u001d\u007f\t\u0004`jZ\u00137p{1\u007fJ\nl", "", "\u001aj^A_0G\u001d\u0007\u0002\u0005k;;f9m\u000b$\u0005D\u000b l", "", "\u001aj^A_0G\u001d\u0007\u000e\bb5~G\ro\b3wI\u0005! \u001d", "\u001aj^A_0G\u001d\t[\u000fm,R", "\u001aj^A_0G\u001d\t[\u000fm,;f9m\u000b$\u0005D\u000b l", "\u001aj^A_0G\u001d\tb\u0004m\u0002", "\u001aj^A_0G\u001d\tb\u0004mjZ\u00137p{1\u007fJ\nl", "\u001aj^A_0G\u001d\te\u0005g.R", "\u001aj^A_0G\u001d\te\u0005g.;f9m\u000b$\u0005D\u000b l", "\u001aj^A_0G\u001d\tl}h9\f^", "\u001aj^A_0G\u001d\tl}h9\fG\ro\b3wI\u0005! \u001d", "", "uKZ<g3B\\bn\u0004b;RL\u0016k\n7\u0003D\n*`Uo\u001b@r,9ny/;w\u001fw31;x8\u001a\u001clv9\u00149", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006I?t!Oz\nEz/>/", "9nc9\\5Q\u001b'~\bb(\u0004\rDa\u000f,\u0006IH\u0015!To"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BuiltinSerializersKt {
    @ExperimentalSerializationApi
    public static final <T, E extends T> KSerializer<E[]> ArraySerializer(KClass<T> kClass, KSerializer<E> elementSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new ReferenceArraySerializer(kClass, elementSerializer);
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T, E extends T> KSerializer<E[]> ArraySerializer(KSerializer<E> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return ArraySerializer(Reflection.getOrCreateKotlinClass(Object.class), elementSerializer);
    }

    public static final KSerializer<boolean[]> BooleanArraySerializer() {
        return BooleanArraySerializer.INSTANCE;
    }

    public static final KSerializer<byte[]> ByteArraySerializer() {
        return ByteArraySerializer.INSTANCE;
    }

    public static final KSerializer<char[]> CharArraySerializer() {
        return CharArraySerializer.INSTANCE;
    }

    public static final KSerializer<double[]> DoubleArraySerializer() {
        return DoubleArraySerializer.INSTANCE;
    }

    public static final KSerializer<float[]> FloatArraySerializer() {
        return FloatArraySerializer.INSTANCE;
    }

    public static final KSerializer<int[]> IntArraySerializer() {
        return IntArraySerializer.INSTANCE;
    }

    public static final <T> KSerializer<List<T>> ListSerializer(KSerializer<T> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new ArrayListSerializer(elementSerializer);
    }

    public static final KSerializer<long[]> LongArraySerializer() {
        return LongArraySerializer.INSTANCE;
    }

    public static final <K, V> KSerializer<Map.Entry<K, V>> MapEntrySerializer(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new MapEntrySerializer(keySerializer, valueSerializer);
    }

    public static final <K, V> KSerializer<Map<K, V>> MapSerializer(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new LinkedHashMapSerializer(keySerializer, valueSerializer);
    }

    @ExperimentalSerializationApi
    public static final KSerializer NothingSerializer() {
        return NothingSerializer.INSTANCE;
    }

    public static final <K, V> KSerializer<Pair<K, V>> PairSerializer(KSerializer<K> keySerializer, KSerializer<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new PairSerializer(keySerializer, valueSerializer);
    }

    public static final <T> KSerializer<Set<T>> SetSerializer(KSerializer<T> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new LinkedHashSetSerializer(elementSerializer);
    }

    public static final KSerializer<short[]> ShortArraySerializer() {
        return ShortArraySerializer.INSTANCE;
    }

    public static final <A, B, C> KSerializer<Triple<A, B, C>> TripleSerializer(KSerializer<A> aSerializer, KSerializer<B> bSerializer, KSerializer<C> cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        return new TripleSerializer(aSerializer, bSerializer, cSerializer);
    }

    @ExperimentalSerializationApi
    public static final KSerializer<UByteArray> UByteArraySerializer() {
        return UByteArraySerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    public static final KSerializer<UIntArray> UIntArraySerializer() {
        return UIntArraySerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    public static final KSerializer<ULongArray> ULongArraySerializer() {
        return ULongArraySerializer.INSTANCE;
    }

    @ExperimentalSerializationApi
    public static final KSerializer<UShortArray> UShortArraySerializer() {
        return UShortArraySerializer.INSTANCE;
    }

    public static final <T> KSerializer<T> getNullable(KSerializer<T> kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "<this>");
        return kSerializer.getDescriptor().isNullable() ? kSerializer : new NullableSerializer(kSerializer);
    }

    public static /* synthetic */ void getNullable$annotations(KSerializer kSerializer) {
    }

    public static final KSerializer<UByte> serializer(UByte.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return UByteSerializer.INSTANCE;
    }

    public static final KSerializer<UInt> serializer(UInt.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return UIntSerializer.INSTANCE;
    }

    public static final KSerializer<ULong> serializer(ULong.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return ULongSerializer.INSTANCE;
    }

    public static final KSerializer<UShort> serializer(UShort.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return UShortSerializer.INSTANCE;
    }

    public static final KSerializer<Unit> serializer(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<this>");
        return UnitSerializer.INSTANCE;
    }

    public static final KSerializer<Boolean> serializer(BooleanCompanionObject booleanCompanionObject) {
        Intrinsics.checkNotNullParameter(booleanCompanionObject, "<this>");
        return BooleanSerializer.INSTANCE;
    }

    public static final KSerializer<Byte> serializer(ByteCompanionObject byteCompanionObject) {
        Intrinsics.checkNotNullParameter(byteCompanionObject, "<this>");
        return ByteSerializer.INSTANCE;
    }

    public static final KSerializer<Character> serializer(CharCompanionObject charCompanionObject) {
        Intrinsics.checkNotNullParameter(charCompanionObject, "<this>");
        return CharSerializer.INSTANCE;
    }

    public static final KSerializer<Double> serializer(DoubleCompanionObject doubleCompanionObject) {
        Intrinsics.checkNotNullParameter(doubleCompanionObject, "<this>");
        return DoubleSerializer.INSTANCE;
    }

    public static final KSerializer<Float> serializer(FloatCompanionObject floatCompanionObject) {
        Intrinsics.checkNotNullParameter(floatCompanionObject, "<this>");
        return FloatSerializer.INSTANCE;
    }

    public static final KSerializer<Integer> serializer(IntCompanionObject intCompanionObject) {
        Intrinsics.checkNotNullParameter(intCompanionObject, "<this>");
        return IntSerializer.INSTANCE;
    }

    public static final KSerializer<Long> serializer(LongCompanionObject longCompanionObject) {
        Intrinsics.checkNotNullParameter(longCompanionObject, "<this>");
        return LongSerializer.INSTANCE;
    }

    public static final KSerializer<Short> serializer(ShortCompanionObject shortCompanionObject) {
        Intrinsics.checkNotNullParameter(shortCompanionObject, "<this>");
        return ShortSerializer.INSTANCE;
    }

    public static final KSerializer<String> serializer(StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        return StringSerializer.INSTANCE;
    }

    public static final KSerializer<Duration> serializer(Duration.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return DurationSerializer.INSTANCE;
    }
}
