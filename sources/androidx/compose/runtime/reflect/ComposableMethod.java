package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: ComposableMethod.jvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG6LeN/ZS8\u001es{J$c$wDCU0}*\tUPog|Sb\u000bI\u0011\u000e\u0016\u000fj4I[zc\u0017%˰rom2\u000e\u0005CʠpxD\u000582P9\n\t\u000f\u001cBH>yټGK\u001a\u0016xD~Lj\r{\u0006b#\u0014Q8\u0001Lp\u0018TD]\u0005_P.Q\u00020ŀNoe>\u0013e\rtZm!?\u001a,BX9K\u0014SR3\u000b`sW\u0003m\u000bm\u000bvA?-_r\u00065\t\u0014\"0CY\u001dcx%l\u0007g_:&YY\u0004Mf\rVvAԏ\rʀ\b\u000e\u0014C\u0019:;\u001c~\b<6KɄUĖT\u0002fۍP\u0007o6/%.4\u0002ݐ\u001dƻUaCϊ\u001fF\n\n%\u001eQ\u0007%eƟX\u0012x\u0017![\u0006Y\u0002jNF`X\u001a_Mq\u0014ph\u0003X\u000f^Q6sɨ\u00152/'=gG0q\u0001\u0010V\\m\u0007\u0007ph\u0002x\u0001Rvfå\u001a;B\u000b\u0012jRuʶom"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001b<w,5W\ri\u0015w\u001e9WQ7h;\u001e|hp<\u0011b\u0002", "", ";dc5b+", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqc@\u0010\u001a!FE", "1n\\=b::P ~^g-\u0007", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001b<w,5W\ri\u0015w\u001e9WQ7h;\u001exqbC\\", "uKY.i(\bZ\u0015\b|(9|\n6e}7E(\u0001&\u001aQnc#r.4f\b$6\u0001_,WKFuB\u001e^uqB\u0016g4N@4GMU,Za<\u001b\u001e\u001ae\u0018\\'\n\fY%-oN\rbx", ">`a.`,MS&\\\u0005n5\f", "", "5dc\u001dT9:[\u0019\u000ezk\n\u0007\u00198t", "u(8", ">`a.`,MS&m\u000fi,\u000b", "", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "5dc\u001dT9:[\u0019\u000ezk\u001b\u0011\u0014/s", "u(J\u0019](OOb\u0006vg.Ff6a\u000e6Q", ">`a.`,MS&\r", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqf<\u000e\u0013\u001fG~\u000eIL", "5dc\u001dT9:[\u0019\u000ezk:", "u(J\u0019](OOb\u0006vg.F\u0016/f\u0007(yOJ\u0002\u0013Tk\u0016<\u0006%B/", "/r<2g/HR", "3pd._:", "", "=sW2e", "6`b566=S", "7me<^,", "1n\\=b:>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\r", "7mbAT5<S", "/qV@", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DC|3IT75;\u001a\u001ej+#\u0004h,L\u0006|=3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPy2+<\u001b\u0019(\u0013\t7q\u0003U\u007f\u000b:jnQ,", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ComposableMethod {
    public static final int $stable = 8;
    private final ComposableInfo composableInfo;
    private final Method method;

    public ComposableMethod(Method method, ComposableInfo composableInfo) {
        this.method = method;
        this.composableInfo = composableInfo;
    }

    public final Method asMethod() {
        return this.method;
    }

    public final int getParameterCount() {
        return this.composableInfo.getRealParamsCount();
    }

    public final Parameter[] getParameters() {
        return (Parameter[]) ArraysKt.copyOfRange(this.method.getParameters(), 0, this.composableInfo.getRealParamsCount());
    }

    public final Class<?>[] getParameterTypes() {
        return (Class[]) ArraysKt.copyOfRange(this.method.getParameterTypes(), 0, this.composableInfo.getRealParamsCount());
    }

    public final Object invoke(Composer composer, Object obj, Object... objArr) {
        Object defaultValue;
        ComposableInfo composableInfo = this.composableInfo;
        int iComponent2 = composableInfo.component2();
        int iComponent3 = composableInfo.component3();
        int iComponent4 = composableInfo.component4();
        int length = this.method.getParameterTypes().length;
        int i2 = iComponent2 + 1;
        int i3 = iComponent3 + i2;
        Object[] objArr2 = new Integer[iComponent4];
        int i4 = 0;
        for (int i5 = 0; i5 < iComponent4; i5++) {
            int i6 = i5 * 31;
            IntRange intRangeUntil = RangesKt.until(i6, Math.min(i6 + 31, iComponent2));
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                arrayList.add(Integer.valueOf((iNextInt >= objArr.length || objArr[iNextInt] == null) ? 1 : 0));
            }
            int iIntValue = 0;
            int i7 = 0;
            for (Object obj2 : arrayList) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                iIntValue |= ((Number) obj2).intValue() << i7;
                i7 = i8;
            }
            objArr2[i5] = Integer.valueOf(iIntValue);
        }
        Object[] objArr3 = new Object[length];
        while (i4 < length) {
            if (i4 >= 0 && i4 < iComponent2) {
                defaultValue = (i4 < 0 || i4 > ArraysKt.getLastIndex(objArr)) ? ComposableMethodKt.getDefaultValue(this.method.getParameterTypes()[i4]) : objArr[i4];
            } else if (i4 == iComponent2) {
                defaultValue = composer;
            } else if (i4 == i2 || (iComponent2 + 2 <= i4 && i4 < i3)) {
                defaultValue = 0;
            } else if (i3 <= i4 && i4 < length) {
                defaultValue = objArr2[i4 - i3];
            } else {
                throw new IllegalStateException("Unexpected index".toString());
            }
            objArr3[i4] = defaultValue;
            i4++;
        }
        return this.method.invoke(obj, Arrays.copyOf(objArr3, length));
    }

    public boolean equals(Object obj) {
        if (obj instanceof ComposableMethod) {
            return Intrinsics.areEqual(this.method, ((ComposableMethod) obj).method);
        }
        return false;
    }

    public int hashCode() {
        return this.method.hashCode();
    }
}
