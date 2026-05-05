package kotlin.jvm.internal;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d̉=!,x\bDRш|\u0004G\u00068\u000b<H\u0007\"2\u0012\u007f\u0007t\u0007A0JiP.hS2şs{J$cҕyCQU\"}(\tgouk\u0007Rj\u000fS\u0011\u001c\u0015'jZH\u0006\u0001k\u0017'6RoE4{u\u0004>žx8\u000b'@*P-\u0013\u000522X\u0014\u0007|YJ:\u0012^?!B`\u0012e\t*\u0012\f?N\u0007NjuWNR|aJ19\u0002\u0018Bd&\u000e/CRϘJV-\u0014\u0005k6(NBM\u001d5W\u0013\thZm\u0003mpm\rv,?/Ys]7\u0007\u0006D'9[%k\u00030l\rad\u001c)AN\u0012K~\rV\u0005+\u0014\u001bJ\u001c\"\u0016)X.[\u001dv\u0012\u001e;\u0005vcBf\u0001\rB.y\u0010EGK\u000eCC[+paiK\u001d^9\u0012\u0004;\u001eQ\u007f~#kT<c%%d\u007fa5aBSG|\n\b<\u001c\u00157ê\bò\b0U\u0012O\u0012\u001fф/-G_I%7j0HrfMݖbĈWkZHN#\u000f\"E,!\f\tG;ʐ>ÏXX4Ҋܜ g"}, d2 = {"\u0013L?!L", "", "", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "\u001b@G,F\u001033", "", "1n[9X*MW#\bih\b\n\u0016+y", "1n[9X*MW#\b", "", "Bn0?e(R", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nlZ=V\u00138\b!~`y)97\u007f+RC9z\n", RemoteSettings.FORWARD_SLASH_STRING, "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nl\r.t\nMrn<U\u0007\"\u0001W\u00133MAJAw\u0014{m]J\u0003-3J\u007f)\u00116K1\\P\u0002\u0013", "Bn0?e(R7!\n\u0002", "3l_Al", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "/k[<V", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "BqX:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "uKY.i(\bc(\u0003\u0002(\n\u0007\u00106e}7\u007fJ\nl}My\u001dCz.~^\u000f(\u0001n&7KR?u=,^IqB\u0005r0X\u007fq\u001d3T6kYvF]\u0017k\u0016\u0018,\u001d\u000eWP(xMEhh<R\u007fJl\u000b\u0015ac\u001cpzQ]\u0014PC\u001a\u0007IriVb]\tKKNpsE\u001ch\u001bk>D-`G\\\u0011OU*\u001bw\u001d\u0018n[{1QD\u001ez63\u0014", "9nc9\\5\u0006a(}\u0002b)"}, k = 2, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CollectionToArray {
    private static final Object[] EMPTY = new Object[0];
    private static final int MAX_SIZE = 2147483645;

    @Deprecated(message = "\u0017N\u0005H1z*e[[1\n^TCWhXH)\n(\u0019SzK.s\\\t)xvMp\u0002Vj(:\u0006$HN'hQ94]T@fQ9")
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "", hiddenSince = "", warningSince = "\u000bcD")
    public static final Object[] toArray(Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    objArrCopyOf[i2] = it.next();
                    if (i3 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = MAX_SIZE;
                            if (i3 >= MAX_SIZE) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i2 = i3;
                }
            }
        }
        return EMPTY;
    }

    @Deprecated(message = "\u0017N\u0005H1z*e[[1\n^TCWhXH)\n(\u0019SzK.s\\\t)xvMp\u0002Vj(:\u0006$HN'hQ94]T@fQ9")
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "", hiddenSince = "", warningSince = "\u000bcD")
    public static final Object[] toArray(Collection<?> collection, Object[] objArr) {
        Object[] objArrCopyOf;
        Intrinsics.checkNotNullParameter(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = MAX_SIZE;
                    if (i3 >= MAX_SIZE) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i3] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    private static final Object[] toArrayImpl(Collection<?> collection, Function0<Object[]> function0, Function1<? super Integer, Object[]> function1, Function2<? super Object[], ? super Integer, Object[]> function2) {
        int size = collection.size();
        if (size == 0) {
            return function0.invoke();
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return function0.invoke();
        }
        int i2 = 0;
        ?? CopyOf = function1.invoke(Integer.valueOf(size));
        while (true) {
            int i3 = i2 + 1;
            CopyOf[i2] = it.next();
            if (i3 >= CopyOf.length) {
                if (!it.hasNext()) {
                    return CopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = MAX_SIZE;
                    if (i3 >= MAX_SIZE) {
                        throw new OutOfMemoryError();
                    }
                }
                CopyOf = Arrays.copyOf((Object[]) CopyOf, i4);
                Intrinsics.checkNotNullExpressionValue(CopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                return function2.invoke(CopyOf, Integer.valueOf(i3));
            }
            i2 = i3;
            CopyOf = CopyOf;
        }
    }
}
