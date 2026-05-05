package org.koin.core.parameter;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.koin.core.error.DefinitionParameterException;
import org.koin.core.error.NoParameterFoundException;
import org.koin.core.module.KoinDslMarker;
import org.koin.ext.KClassExtKt;
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
/* JADX INFO: loaded from: classes2.dex */
@KoinDslMarker
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u000eӵLш|\u0004O%8é6B\r+4\u0012}\u000bnjG6LeN4ZS8-s{:/c$\bCCU \u0004*\t]NogtPb\u000bQ\u001b\u000eǝ~\u007fBկ\u0006x\f\u0011OSR}E3[oUApxF\u000761P7(\u0006\u0011\"0H\u001ex\u0013Ea\u000b@3Ϯt:`\u0011\u0016\u0011('\u001e>NҵN`udNH\u001b\\\u0003C1\u001a\u0002B\u0015?\u007f4\u0003ձ\u001b^j&Sǿiӿ/@EN]9a\u001d\u001fR\"W#Cwܵ\u0013\u0001=&qɥ{ɱ:X\u000e-]?](urlt%Ufϯ5Ceb\u0012ֻ\u0016߭{z\n&\u0005\u0018\u001c\"?HtE:j\u000eԄA\r\tR\u0007З\nެF\u007f\tz~+3\u001dK+\u007f3\u0007Ugݢ'fMzKڃ&ţ\u0005n/t\u001d3n33T>iQSF׀Vf:]K\r\u001cp\u0011\fZ\f>g\u00183\f\u00114\u0018SX\"M؝%k\u0010j\r\u007f\u0005(xh\u001a\u0002rPF̎|.M)1\f\tC+ʔqÏXX:*\u00166b*\u0016\bY8|yBƙ3(~Sv\t\u0003M\f\u0014kËfƠ]ny2 XlXMSy\u000f(j\u0017\u0016Eֺp\u001d\tnPs$^l((3v\fVwԞHN\u001a9z^\u007fCL.G\u0018#-h\u0005$ՓO\u00159gh\t(\u0003d3*\u0004\u0018E;\tɹT\\~\u00160\u0013WT\u0015b8,\biU!,Ş0\u0001J{K\u0007-rFÿm֙KLz/>t\nH.\u001cOPuU3\u0011\u0005ǻ@\u001a]MZ\u0013}U]\u0012-{+\u001bUOÿ2g\u0016\u001192n\u0014bO\u0003Ahu'\u000713|\u007f(ӓv~Ull\u000b\nHyv\u0011oTNf{M#,Q\u0019oP\u007f}1QT5\u0016&\u0017w4o\f\u0002o\\$\u0003\u0011,۩s\u001c\\g$\u000fzQ\f<k<W\t\u0017>h<к\u0007BV\u001b@\fP:L\raR\nj~\tPM9bDzWN\u001bpncJ\u0017\u007f\u007fJ-\u000e)\"D4ж5ƻ'ݱQ_oƚ}Mb\u0010X\u0015\"\r\u00028|\u001alU._ob7:\\֓$ݠEGjŝT\u000b*?:H(\rIaw\u0014`\u000e\u000eHw\u0011-1pvŌZ\u0016\\xjg`\u0007fTn1z\u0018\r!K&\t9A\u0007\u0004E\u0003.\u0012E7\u0018\u009b\r\u001f\u0003Q\u0005z33\u0605Xm"}, d2 = {"\u001ana4\"2HW\"Hxh9|R:a\r$\u0004@\u0010\u0017$\u0011Z\nIr-5h}-EP 5LCHA", "", "-uP9h,L", "", "CrT\u0016a+>f\u0019}kZ3\r\t=", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f-wQ|`\u001eCx\u0010\u0006S/?`}\u001c@CY\u001f", "5dc,i(Ec\u0019\r9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "u(E", "5dc,i(Ec\u0019\r", "u(;7T=:\u001d)\u000e~euc\r=tU", "7mS2k", "", "5dc\u0016a+>f", "u(8", "Adc\u0016a+>f", "uH\u0018#", "5dc\"f,\"\\\u0018~\u000e^+m\u00056u\u007f6", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016", "\u001aiPCTuEO\"\u0001D;6\u0007\u0010/a\t}", "D`[BX:", "", "5dc#T3NS'", "/cS", "D`[BX", "1n\\=b5>\\(J", "\"", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "3kT:X5M/(", "7", "1kPGm", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "uH;8b;EW\"H\b^-\u0004\t-tI\u000eYG|%%\u001d3tAr61#\u0005\u001c@o_\u0018JH;iCs", "5dc", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "5dc\u0013\\9Lb\nz\u0002n,", "uKZ<g3B\\b\fz_3|\u0007>/e\u0006\u0003<\u000f%l\u000bV\u00138\b!~`y)97\u007f+RC9z\n", "5dc\u0016a+>f\u0019}kZ3\r\t", "5dc\u001ce\u0015NZ ", "7mR?X(LS|\by^?", "", "7mb2e;", "7r4:c;R", "7r=<g\fF^(\u0013", "Adc", "B", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", "Ahi2", "BnBAe0GU", "", "9nX; *H`\u0019"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class ParametersHolder {
    private final List<Object> _values;
    private int index;
    private final Boolean useIndexedValues;

    public ParametersHolder() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public ParametersHolder(List<Object> _values, Boolean bool) {
        Intrinsics.checkNotNullParameter(_values, "_values");
        this._values = _values;
        this.useIndexedValues = bool;
    }

    public /* synthetic */ ParametersHolder(ArrayList arrayList, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((1 & i2) != 0 ? new ArrayList() : arrayList, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : bool);
    }

    private final <T> T getFirstValue(KClass<?> kClass) {
        T next;
        Iterator<T> it = this._values.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kClass.isInstance(next)) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        return null;
    }

    private final <T> T getIndexedValue(KClass<?> kClass) {
        Object obj = this._values.get(this.index);
        T t2 = null;
        if (!kClass.isInstance(obj)) {
            obj = null;
        }
        if (obj != null) {
            t2 = (T) obj;
        }
        if (t2 != null) {
            increaseIndex();
        }
        return t2;
    }

    public static /* synthetic */ void get_values$annotations() {
    }

    public final ParametersHolder add(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._values.add(value);
        return this;
    }

    public final /* synthetic */ <T> T component1() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) elementAt(0, Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final /* synthetic */ <T> T component2() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) elementAt(1, Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final /* synthetic */ <T> T component3() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) elementAt(2, Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final /* synthetic */ <T> T component4() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) elementAt(3, Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final /* synthetic */ <T> T component5() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) elementAt(4, Reflection.getOrCreateKotlinClass(Object.class));
    }

    public <T> T elementAt(int i2, KClass<?> clazz) throws NoParameterFoundException {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (this._values.size() > i2) {
            return (T) this._values.get(i2);
        }
        throw new NoParameterFoundException("Can't get injected parameter #" + i2 + " from " + this + " for type '" + KClassExtKt.getFullName(clazz) + '\'');
    }

    public final /* synthetic */ <T> T get() throws DefinitionParameterException {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        T t2 = (T) getOrNull(Reflection.getOrCreateKotlinClass(Object.class));
        if (t2 != null) {
            return t2;
        }
        StringBuilder sb = new StringBuilder("No value found for type '");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        throw new DefinitionParameterException(sb.append(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(Object.class))).append('\'').toString());
    }

    public final <T> T get(int i2) {
        return (T) this._values.get(i2);
    }

    public final int getIndex() {
        return this.index;
    }

    public final /* synthetic */ <T> T getOrNull() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) getOrNull(Reflection.getOrCreateKotlinClass(Object.class));
    }

    public <T> T getOrNull(KClass<?> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (this._values.isEmpty()) {
            return null;
        }
        Boolean bool = this.useIndexedValues;
        if (bool != null) {
            return Intrinsics.areEqual((Object) bool, (Object) true) ? (T) getIndexedValue(clazz) : (T) getFirstValue(clazz);
        }
        T t2 = (T) getIndexedValue(clazz);
        return t2 == null ? (T) getFirstValue(clazz) : t2;
    }

    public final Boolean getUseIndexedValues() {
        return this.useIndexedValues;
    }

    public final List<Object> getValues() {
        return this._values;
    }

    public final List<Object> get_values() {
        return this._values;
    }

    public final void increaseIndex() {
        if (this.index < CollectionsKt.getLastIndex(this._values)) {
            this.index++;
        }
    }

    public final ParametersHolder insert(int i2, Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._values.add(i2, value);
        return this;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final <T> void set(int i2, T t2) {
        List<Object> list = this._values;
        Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type kotlin.Any");
        list.set(i2, t2);
    }

    public final void setIndex(int i2) {
        this.index = i2;
    }

    public final int size() {
        return this._values.size();
    }

    public String toString() {
        return "DefinitionParameters" + CollectionsKt.toList(this._values);
    }
}
