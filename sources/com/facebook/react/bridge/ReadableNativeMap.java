package com.facebook.react.bridge;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.infer.annotation.Assertions;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReadableNativeMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яć\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*,\u0018w\u000ffx_8Dsl6Ra6\u0017k\né,[*rK;c)\u0006\"\u000fRVg}nRZ!C\u0017\u0006\u001czr,_U\u0001]\u0018\u0014:B\u0006?;Mu=A`\u0003?\r 8\"@y\u001b\u0001\"*N\u0010~zQO\u0014۵8@\u0007:Z҈U\u0005(\u0018\u000ē(\u0001,coN<Tt]P/+\u0003oCT<uܞ\u001b\u000e=F\u0003&=v\u0010\u001ec?wu$+U\u0013\r`\\W\u0005Upk\u0007ص+'9L<\fDs\u0018\u0014[Go\u0011cö4x\u001bP\u0011\u00105HgcyW>.\u0006\u0019\u0014\u000fR\u0003<\u000eWR<L2l\u0018\u0010Ct9onpHލHȸ~aD8m\u0011AMQ\u001b\u0015t\u0012A'rO}\u001b\fL+GͰ!$d\u001c\u0006-\u001djv\u007fW\u0002DKef\n\bD4\u00189p\u0010Q\u001c0u#_\u007f\u001fK/%eb\u007f7iy\u0010p\\g%.\u0011la\u0007jHn)5*\u007f8\u00176rD\u00130\u001cTbuD\u0011{#\u001b\u001bF\u0016!LtwjNU\u0014\\l\u0001i\u0019T$\u001em=teqn\u001a=\b=lPMQ\u0012\u0017(f?$Mlz\u0007nepͭ<^jE:2vqV\fDT\\=+4UpJ<\\5'y-H1%\tAE5m\f\u0001\u0012\u0015Sy@#m*ڏ\u0017\u001df[!su\u0016a,+gR7OpM\u001f6W2hz\u0019Q'E͡\u0006ěkLU~5&\u0004\t\u0014\",\u0019gX_A!,\u0017)`\tsY\u0015\u0001s\u0006e\u0012U\u0013-}\u001dX\u0001.\u0016\u000f1\u0005tnx\u007fgTE*'b\u0001@ d.\u0001(FCqq\n#[\u0005e\u0013\u0007_ߢ\\T\u0013\u0004O\"3\u001e\b\"+<]M5<.}$1%a$\u0006\u001eN@ʯ\u0015֑xe\u0012^,$}\u0019i]`^hMg\u001cV\"RsIV\u0011p\u0006?Z\tb:y\\\nv~\u000fPS\u001b1\u000ef53;|\u001dܭX݇s}B<(<\u0002|\u0016\u001anE5\u0011{[\u0016y4йz\u05c8N\u000f\u0018EDC|M4C0Xgb784\u007f^݀_ވf\u0005JClB:x \u000bqw\u001a\n\u001e\u0018\u0018F\u000e\u0016]F\u000byI\u0014&T'\u001b\u001d\\M\u0003S 9F\u0011\u0001\u001f3L\u007fE3\u0015mt\\]u\u001b\rc\u001f\u0019\u001b\u0019V\u000fh5+r\\\u0018.nlQ/Sa[[\u0012D\u0014S9o{o:?(~-BF#gW?d-\u00055ήW͇Rh\u000f\u0014l[\\,y\u001e\t\b&B\u001a\u0011\u001b\u0019}y\u001enc\r%ߚ̄Cױ\u0005!L+\r\u001b\u000bs^\u001d3\u0013C;\u000e~x%?\u0018gUK}6'0)\u0014tOd\u0006 O\u0016m\u001dJ\u0016 \u001dr\u0004\u0019\u0013~(bA\u00015I˙ڙ\b˩S\f;\u0004\u0019tg{\u0010#F;9\u0002VwY\u007f\u0011&snsn\u0004\u0012\u0013hAV(\u0007[b\u0006\u00157O>\u0013\u0007aJ\u0013c \u0007)^'KfuߑʏbЍ\u0014Ykjv\u0006]k%-5\u00058vʞ4\u0014"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7V\u0012=QT;S0)j", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW%r49j}\b3xk", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", "6xQ?\\+\u001dO(z", "\u001ab^:\"-:Q\u0019{\u0005h2F\u000e8iI\u000b\u0010=\u000e\u001b\u0016&k\u001d8L", "uKR<`u?O\u0017~wh6\u0003R4n\u0004q^T}$\u001bFN\nKrzxJ", "3mc?l\u0010MS&z\nh9", "", "", "", "", "5dc\u0012a;Kg|\u000ezk(\f\u0013<", "u(;7T=:\u001d)\u000e~eu`\u0018/r{7\u0006MV", "9dh@", "", "5dc\u0018X@L", "u(J\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "9dh@\u0017+>Z\u0019\u0001vm,", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", ":nR._\u0014:^", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", "5dc\u0019b*:Z\u0001z\u0006", "u(;7T=:\u001d)\u000e~eu_\u0005=hg$\u0007\u0016", ":nR._\u0014:^W}ze,~\u0005>e", ":nR._\u001bR^\u0019fvi", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7\\*9M\u0019", "5dc\u0019b*:Z\b\u0013\u0006^\u0014x\u0014", ":nR._\u001bR^\u0019fvij{\t6e\u0002$\u000b@", "1gT0^\u0010Ga(z\u0004\\,", "\"", "<`\\2", "7mbAT5<S", "Bx_2", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015R?Lg}%\u0011qc\u0003dj(\\\u0005|\u000b3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPy", "3pd._:", "", "=sW2e", "5dc\u000ee9:g", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "5dc\u000fb6ES\u0015\b", "5dc\u0011b<;Z\u0019", "", "5dc\u0011l5:[\u001d|", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001b\u000b.1a\u0002\u001e\r", "5dc\u0016a;", "", "5dc\u0019b5@", "", "5dc\u001aT7", "5dc\u001bh3EO\u0016\u0006zO(\u0004\u0019/", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u0013`y.ECY\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d", "5dc g9B\\\u001b", "5dc!l7>", "5dc#T3NS", "6`b\u0018X@", "6`b566=S", "7l_<e;$S-\r", "7l_<e;-g$~\t", "u(J\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "7l_<e;/O \u000fzl", "7r=B_3", "9dh X;\"b\u0019\fvm6\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u001293COY4-xwaF\u0003r6[L", "Bn7.f/&O$", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class ReadableNativeMap extends NativeMap implements ReadableMap {
    private static final Companion Companion = new Companion(null);
    private static int jniPassCounter = 0;
    private final Lazy keys$delegate;
    private final Lazy localMap$delegate;
    private final Lazy localTypeMap$delegate;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"2ߝx\u001d߿\u001b9^C&M4Rޚ.\u000fy{|*i'\nCiW`\u0003r\u0015]O\u007fg\u001dL1ŒOǇ\n\u0016\u0001̓\u0082MY"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7V\u0012=QT;S0)SFkA\u0012_5R\u00010\u001d", "", "u(E", "8mX\u001dT:L1#\u000f\u0004m,\n", "", "5dc\u0017A\u0010)O'\rXh<\u0006\u0018/r", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final int getJNIPassCounter() {
            return ReadableNativeMap.jniPassCounter;
        }
    }

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.bridge.ReadableNativeMap$keySetIterator$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я!\u001d̉=!4i\bӵLc\u0003\nI\u00066\u000e6B\r+4ߚ\u007f\u0007tvAӄld߉4Ziճ?k*3la2w[;\u0004!D6QU\\o\u007fnxcQW_\u001e$x\u0003,wVOع\u001eƤ6NwЀKOu?Gc\u00158\u000b$@'ة}\u000f"}, d2 = {"1n\\{Y(<S\u0016\t\u0005du\n\t+c\u000fqxM\u0005\u0016\u0019G9z<r$1V\u0005  i%2^C#g?\\\u001bhu'\u0007r\u0010]v4C[X9\u001b\u001e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u001293COY4-xwaF\u0003r6[L", "1ta?X5M7\"}zq", "", "5dc\u0010h9KS\"\u000e^g+|\u001c", "u(8", "Adc\u0010h9KS\"\u000e^g+|\u001c", "uH\u0018#", "6`b\u001bX?M9\u0019\u0013", "", "<dgA>,R", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements ReadableMapKeySetIterator {
        final /* synthetic */ String[] $iteratorKeys;
        private int currentIndex;

        AnonymousClass1(String[] strArr) {
            strArr = strArr;
        }

        public final int getCurrentIndex() {
            return this.currentIndex;
        }

        @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
        public boolean hasNextKey() {
            return this.currentIndex < strArr.length;
        }

        @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
        public String nextKey() {
            String[] strArr = strArr;
            int i2 = this.currentIndex;
            this.currentIndex = i2 + 1;
            return strArr[i2];
        }

        public final void setCurrentIndex(int i2) {
            this.currentIndex = i2;
        }
    }

    static {
        ReactBridge.staticInit();
    }

    protected ReadableNativeMap(HybridData hybridData) {
        super(hybridData);
        this.keys$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<String[]>() { // from class: com.facebook.react.bridge.ReadableNativeMap$keys$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String[] invoke() {
                String[] strArrImportKeys = this.this$0.importKeys();
                ReadableNativeMap.Companion unused = ReadableNativeMap.Companion;
                ReadableNativeMap.jniPassCounter++;
                return strArrImportKeys;
            }
        });
        this.localMap$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<HashMap<String, Object>>() { // from class: com.facebook.react.bridge.ReadableNativeMap$localMap$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final HashMap<String, Object> invoke() {
                int length = this.this$0.getKeys().length;
                HashMap<String, Object> map = new HashMap<>(length);
                Object[] objArrImportValues = this.this$0.importValues();
                ReadableNativeMap.Companion unused = ReadableNativeMap.Companion;
                ReadableNativeMap.jniPassCounter++;
                for (int i2 = 0; i2 < length; i2++) {
                    map.put(this.this$0.getKeys()[i2], objArrImportValues[i2]);
                }
                return map;
            }
        });
        this.localTypeMap$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<HashMap<String, ReadableType>>() { // from class: com.facebook.react.bridge.ReadableNativeMap$localTypeMap$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final HashMap<String, ReadableType> invoke() {
                int length = this.this$0.getKeys().length;
                HashMap<String, ReadableType> map = new HashMap<>(length);
                Object[] objArrImportTypes = this.this$0.importTypes();
                ReadableNativeMap.Companion unused = ReadableNativeMap.Companion;
                ReadableNativeMap.jniPassCounter++;
                for (int i2 = 0; i2 < length; i2++) {
                    String str = this.this$0.getKeys()[i2];
                    Object obj = objArrImportTypes[i2];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableType");
                    map.put(str, (ReadableType) obj);
                }
                return map;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final /* synthetic */ <T> T checkInstance(String str, Object obj, Class<T> cls) {
        Class<?> cls2;
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        if (obj != 0) {
            return obj;
        }
        String simpleName = (obj == 0 || (cls2 = obj.getClass()) == null) ? null : cls2.getSimpleName();
        if (simpleName == null) {
            simpleName = "NULL";
        }
        throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + simpleName + " to " + cls.getSimpleName());
    }

    @JvmStatic
    public static final int getJNIPassCounter() {
        return Companion.getJNIPassCounter();
    }

    public final String[] getKeys() {
        return (String[]) this.keys$delegate.getValue();
    }

    private final HashMap<String, Object> getLocalMap() {
        return (HashMap) this.localMap$delegate.getValue();
    }

    private final HashMap<String, ReadableType> getLocalTypeMap() {
        return (HashMap) this.localTypeMap$delegate.getValue();
    }

    private final Object getNullableValue(String str) {
        return getLocalMap().get(str);
    }

    private final /* synthetic */ <T> T getNullableValue(String str, Class<T> cls) {
        T t2 = (T) getNullableValue(str);
        if (t2 == null) {
            return null;
        }
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        if (t2 != null) {
            return t2;
        }
        Class<?> cls2 = t2.getClass();
        String simpleName = cls2 != null ? cls2.getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "NULL";
        } else {
            Intrinsics.checkNotNull(simpleName);
        }
        throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + simpleName + " to " + cls.getSimpleName());
    }

    private final Object getValue(String str) {
        if (!hasKey(str)) {
            throw new NoSuchKeyException(str);
        }
        Object objAssertNotNull = Assertions.assertNotNull(getLocalMap().get(str));
        Intrinsics.checkNotNullExpressionValue(objAssertNotNull, "assertNotNull(...)");
        return objAssertNotNull;
    }

    private final /* synthetic */ <T> T getValue(String str, Class<T> cls) {
        Class<?> cls2;
        T t2 = (T) getValue(str);
        Intrinsics.reifiedOperationMarker(2, ExifInterface.GPS_DIRECTION_TRUE);
        if (t2 != null) {
            return t2;
        }
        String simpleName = (t2 == null || (cls2 = t2.getClass()) == null) ? null : cls2.getSimpleName();
        if (simpleName == null) {
            simpleName = "NULL";
        } else {
            Intrinsics.checkNotNull(simpleName);
        }
        throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + simpleName + " to " + cls.getSimpleName());
    }

    public final native String[] importKeys();

    public final native Object[] importTypes();

    public final native Object[] importValues();

    public boolean equals(Object obj) {
        if (obj instanceof ReadableNativeMap) {
            return Intrinsics.areEqual(getLocalMap(), ((ReadableNativeMap) obj).getLocalMap());
        }
        return false;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableArray getArray(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object nullableValue = getNullableValue(name);
        if (nullableValue == null) {
            return null;
        }
        ReadableArray readableArray = (ReadableArray) (!(nullableValue instanceof ReadableArray) ? null : nullableValue);
        if (readableArray != null) {
            return readableArray;
        }
        Class<?> cls = nullableValue.getClass();
        String simpleName = cls != null ? cls.getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "NULL";
        } else {
            Intrinsics.checkNotNull(simpleName);
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + simpleName + " to ReadableArray");
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean getBoolean(String name) {
        Class<?> cls;
        Intrinsics.checkNotNullParameter(name, "name");
        Class cls2 = Boolean.TYPE;
        Object value = getValue(name);
        String simpleName = null;
        Boolean bool = (Boolean) (!(value instanceof Boolean) ? null : value);
        if (bool != null) {
            return bool.booleanValue();
        }
        if (value != null && (cls = value.getClass()) != null) {
            simpleName = cls.getSimpleName();
        }
        if (simpleName == null) {
            simpleName = "NULL";
        } else {
            Intrinsics.checkNotNull(simpleName);
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + simpleName + " to " + cls2.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public double getDouble(String name) {
        Class<?> cls;
        Intrinsics.checkNotNullParameter(name, "name");
        Class cls2 = Double.TYPE;
        Object value = getValue(name);
        String simpleName = null;
        Double d2 = (Double) (!(value instanceof Double) ? null : value);
        if (d2 != null) {
            return d2.doubleValue();
        }
        if (value != null && (cls = value.getClass()) != null) {
            simpleName = cls.getSimpleName();
        }
        if (simpleName == null) {
            simpleName = "NULL";
        } else {
            Intrinsics.checkNotNull(simpleName);
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + simpleName + " to " + cls2.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public Dynamic getDynamic(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        DynamicFromMap dynamicFromMapCreate = DynamicFromMap.create(this, name);
        Intrinsics.checkNotNullExpressionValue(dynamicFromMapCreate, "create(...)");
        return dynamicFromMapCreate;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public Iterator<Map.Entry<String, Object>> getEntryIterator() {
        ReadableNativeMap$entryIterator$1$1 readableNativeMap$entryIterator$1$1;
        synchronized (this) {
            String[] keys = getKeys();
            Object[] objArrImportValues = importValues();
            jniPassCounter++;
            readableNativeMap$entryIterator$1$1 = new ReadableNativeMap$entryIterator$1$1(keys, objArrImportValues);
        }
        return readableNativeMap$entryIterator$1$1;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public int getInt(String name) {
        Class<?> cls;
        Intrinsics.checkNotNullParameter(name, "name");
        Class cls2 = Double.TYPE;
        Object value = getValue(name);
        String simpleName = null;
        Double d2 = (Double) (!(value instanceof Double) ? null : value);
        if (d2 != null) {
            return (int) d2.doubleValue();
        }
        if (value != null && (cls = value.getClass()) != null) {
            simpleName = cls.getSimpleName();
        }
        if (simpleName == null) {
            simpleName = "NULL";
        } else {
            Intrinsics.checkNotNull(simpleName);
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + simpleName + " to " + cls2.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public long getLong(String name) {
        Class<?> cls;
        Intrinsics.checkNotNullParameter(name, "name");
        Class cls2 = Long.TYPE;
        Object value = getValue(name);
        String simpleName = null;
        Long l2 = (Long) (!(value instanceof Long) ? null : value);
        if (l2 != null) {
            return l2.longValue();
        }
        if (value != null && (cls = value.getClass()) != null) {
            simpleName = cls.getSimpleName();
        }
        if (simpleName == null) {
            simpleName = "NULL";
        } else {
            Intrinsics.checkNotNull(simpleName);
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + simpleName + " to " + cls2.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableNativeMap getMap(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object nullableValue = getNullableValue(name);
        if (nullableValue == null) {
            return null;
        }
        ReadableNativeMap readableNativeMap = (ReadableNativeMap) (!(nullableValue instanceof ReadableNativeMap) ? null : nullableValue);
        if (readableNativeMap != null) {
            return readableNativeMap;
        }
        Class<?> cls = nullableValue.getClass();
        String simpleName = cls != null ? cls.getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "NULL";
        } else {
            Intrinsics.checkNotNull(simpleName);
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + simpleName + " to ReadableNativeMap");
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public String getString(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Object nullableValue = getNullableValue(name);
        if (nullableValue == null) {
            return null;
        }
        String str = (String) (!(nullableValue instanceof String) ? null : nullableValue);
        if (str != null) {
            return str;
        }
        Class<?> cls = nullableValue.getClass();
        String simpleName = cls != null ? cls.getSimpleName() : null;
        if (simpleName == null) {
            simpleName = "NULL";
        } else {
            Intrinsics.checkNotNull(simpleName);
        }
        throw new UnexpectedNativeTypeException("Value for " + name + " cannot be cast from " + simpleName + " to " + String.class.getSimpleName());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableType getType(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ReadableType readableType = getLocalTypeMap().get(name);
        if (readableType != null) {
            return readableType;
        }
        throw new NoSuchKeyException(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean hasKey(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return getLocalMap().containsKey(name);
    }

    public int hashCode() {
        return getLocalMap().hashCode();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean isNull(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (getLocalMap().containsKey(name)) {
            return getLocalMap().get(name) == null;
        }
        throw new NoSuchKeyException(name);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableMapKeySetIterator keySetIterator() {
        return new ReadableMapKeySetIterator() { // from class: com.facebook.react.bridge.ReadableNativeMap.keySetIterator.1
            final /* synthetic */ String[] $iteratorKeys;
            private int currentIndex;

            AnonymousClass1(String[] strArr) {
                strArr = strArr;
            }

            public final int getCurrentIndex() {
                return this.currentIndex;
            }

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public boolean hasNextKey() {
                return this.currentIndex < strArr.length;
            }

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public String nextKey() {
                String[] strArr = strArr;
                int i2 = this.currentIndex;
                this.currentIndex = i2 + 1;
                return strArr[i2];
            }

            public final void setCurrentIndex(int i2) {
                this.currentIndex = i2;
            }
        };
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> map = new HashMap<>(getLocalMap());
        for (String str : map.keySet()) {
            Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
            String str2 = str;
            switch (WhenMappings.$EnumSwitchMapping$0[getType(str2).ordinal()]) {
                case 5:
                    map.put(str2, ((ReadableNativeMap) Assertions.assertNotNull(getMap(str2))).toHashMap());
                    break;
                case 6:
                    map.put(str2, ((ReadableArray) Assertions.assertNotNull(getArray(str2))).toArrayList());
                    break;
            }
        }
        return map;
    }
}
