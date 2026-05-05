package com.squareup.wire.internal;

import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яp\u001d<K!&˛\bDZc|İI\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000f\u0002{<$a$yCI^\"Ԃ*\teNogtMb\u000bY\u000f\u000e\u0016~k4Ic\u0005e\u0012\u00157JoM9UoC>htL\u0005(20\u0600\u0002\u0005\u000f\u001a2Ϻ\u0018v\u0011CS\f\u00180HpPR\u0015M\u000b,(ß\\b)0bɡ\\5pxm<?#IhRP7_v}{\rnf-\f\u0005bF7P9E\u0015kR\u0013\tb[\u0006\u0004msm\u0011x)7+\u0010rg8h\u007fZ\u0016YRE\\5f$\u000bĩp\u00105/gcyU\u001e2\u0006\u0001\u0014\u0013L\u0006\u001e\u0006]Ξ\\4*j\u0016\u0016Kt!\\PZ\u0010hZ\u0006\u000bcF\u0017[~a2I\u001ft\\y;GZG\u0004\u000b\r,0\u0019p7Z\u0003\u001c\u05ce\u0019\u001dZ\u0007_A\u001anK~f\u001ei?}\u0004'a\u0012.\u00142]~]%!0'%e\u0006gKQs\u0010R\\k\u0007\u0005fi\u0002p\u0003LN&\u0007\u0016e/O\f#lr<\u0004^dZ<\u0011\u0004\u001bd\u000b\u000e\n)\u001f\u000b!jMU\u0018\\Y\u0001mzMc\u000bS6\u0017;gr\u0004\u000e\u0006>%3}sqHy`\u0007\u0016O<\u0019ڳhjRU\"Y\u000bQP^xt\u001e}\u0014J^\u000e#2uڤJ;r1aw#\u0002\u001b\u001epk-\rm\u0015\u0001\u00105Sc(\u0011#<t7*\u0017pʼsg\u0007\u0005t\u001an^EA\u007f_I*c\\\u000143\"7\u0005\u00029_ibFz\u0016\\\nʀ\u007f $U\u0002g=z+\u0011\u0015(`+]IZ1}Q\u0004ȼmϬ|ɍ\u0013;vm0\u001dx1Db\u0001I}}G&\u0005\u0019\u000b#>cF\u000eӶJzU%%\u0017iFar1b\u0013ҁ:٫\t\u001f&ݒQ\u00020\bM-q3sɍyӄ3\u001biӠ\u0002q4\u000bp!v\u0003s\u0011De,n\u0011_4Щ=ΒMY\u0007Жr6z\u0016ZH\u0019\f^Ɏ\u000bΌ\u00119PШ|r\\M[!\u007f\u0010t\u001eD\r\u001fn2Ƽ\u0015̭\u0002:6ɾBuI\u0017\"x\u00147\u001fhkg\u001c\u0006\"ţ\rΊ\u0013\u0010\u0013֊Ip\u00188K:'ip&H\u0006\"0\rפ=ك\tB\u0011ӗL.B&\u0019]%{\u0014/\u0013\u007ft\u007feĶ4¡wA^ՕlzbwV'1QnDB\u0001-'\nͫz\u00985\u0005uۮ%;qV\u0019SK!q˅Qǎj%3ל%K)Mp\u00019Q4ŴKΜ:\nOӣ\u0006mu2F*M=P?3Ma\u0013ovf]\u001bYtPzu@\u0010bP2)-%+6\u0013\u0000\u0011Ո\u001dOzŷ3GZy\u0010ES\u001c\u0011\u0017z(\u0017\u0010\re\\\u001a[/cY\u0014ƙl͂+{_ė\f\u0018\u0016M85\u0014v1\\\u000eʪv\u000em\u001dP\u0015 ?\u0011._ޓRܣ\b.RƓC <6NS\u00123\b\u0014\r\t\"Lw͏)߿p\nZMn)\u0018\u0015=y|\b#\u0007v1\\z\u001d\\\u0007q_߇Oܻ\u0017\\r<\u0017\u0007.\na\u0012\"I>\u001fd\u0014\u0019}f˭e\u05cftog]\u0013_=}zs?ej\u001e,+0JZյVӲ\u0019?nOD\u001a\u0017nוF\u001b"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006W)5`||;v\u00152VE\u0011", "\u001b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "\u0010", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013IoL\u0019\u0007)<X}-\r", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006W)5`|\nDW\u001f.7D\u0018o=\u001d\u0019qc\u000f", "Eha290>Z\u0018", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017wKo\u0015;L", ";db@T.>B-\nz", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", ";db@T.>4\u001d~\u0002]", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fq\\D\u0001\u001e\u0016\u001d", "0tX9W,KB-\nz", "EqXAX\u0010=S\"\u000e~m@m\u00056u\u007f6", "", "1kP@f\u0013HO\u0018~\b", "\u001aiPCTuEO\"\u0001D<3x\u0017=L\n$z@\u000el", "\nh]6g\u0005", "uKR<`uL_)z\b^<\bRAi\r(E2\u0005$\u0017(s\u000eCuz\u001c^y137\u001d*VE\u0005I;\u001a#v7 \f_=J@.CUPuiRsD\u0014\u0010iW//\r\fX\u0017\u000bs@H\u001bQ3E\u000b=2^\u0013\u0012\u001cC@e)[\fXu^|=2j\u00107fuUO,l&c\flr +", "5dc$e0MS|}zg;\u0001\u0018CV{/\f@\u000f", "u(I", ":`Q2_", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017wKo\u0015;5\f1V}'\r", "5dc\u0019T)>Z", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nr\u001b$GP\u0012<}$s@y\u001d7tk", "<`\\2", "", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Eha290>Z\u0018c\th5e\u00057e", "5dc$\\9>4\u001d~\u0002]\u0011\u000b\u00138N{0{", "2dR9T9>R\u0002z\u0003^", "5dc\u0011X*EO&~yG(\u0005\t", "B`V", "", "5dc!T.", "u(8", "9dh\u000eW(Ib\u0019\fhm9\u0001\u00121", "/cP=g,KA(\f~g.", "@dS.V;>R", "5dc\u001fX+:Q(~y", "0tX9W,KA\u0019\u000e\n^9", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "", "", "0tX9W,K5\u0019\u000e\n^9", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "7mbAT5<Sz~\nm,\n", "9dh\u000eW(Ib\u0019\f", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "5dc\u0018X@\u001aR\u0015\n\n^9", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nk$!Vyi;r0DY\u000bu", "Ah]4_,\u001aR\u0015\n\n^9", "5dc \\5@Z\u0019ZyZ7\f\t<", "7r<.c", "7r<2f::U\u0019", "5dc\u000fh0ER\u0019\fh^;\f\t<", "5dc\u000fh0ER\u0019\f\\^;\f\t<", "5dc\u0016a:MO\"|z@,\f\u0018/r", "D`[BX", "0tX9W,K", "uKR<`uL_)z\b^<\bRAi\r(E(\u0001%%Cq\u000ezS59`| DC|3IT75;\u001a\u001ej+#\u0004h,L\u0006|\u000b=", "Adc", "5dc", ";db@T.>", "uKR<`uL_)z\b^<\bRAi\r(E(\u0001%%Cq\u000e\u0012:\f:U\u000f\u001c\u0001t\u00127O\r%h9\u001e\u0013w7", "5dc\u0013e6F0)\u0003\u0002],\n", "uKR<`uL_)z\b^<\bRAi\r(E(\u0001%%Cq\u000ezS59`| DCY\u0015R?Lg}%\u0011qc\u0003p`1Nt6\u001d", "\u0011n\\=T5B]\"", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class FieldBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> extends FieldOrOneOfBinding<M, B> {
    public static final Companion Companion = new Companion(null);
    private static final Regex IS_GETTER_FIELD_NAME_REGEX = new Regex("^is[^a-z].*$");
    private final String adapterString;
    private final Function1<B, Object> builderGetter;
    private final Function2<B, Object, Unit> builderSetter;
    private final ClassLoader classLoader;
    private final String declaredName;
    private final Function1<M, Object> instanceGetter;
    private final String keyAdapterString;
    private final WireField.Label label;
    private final Field messageField;
    private final String name;
    private final boolean redacted;
    private final int tag;
    private final String wireFieldJsonName;
    private final boolean writeIdentityValues;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0005I\u0006F\u000b6Ȑ\u0005ӳ-(Մ7f\u00198pKkH¯VU0\u000fy|\u00050i&\nCiXpԅ$\u07beSNo˧ĚN^"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006W)5`||;v\u00152VEyI>& dj=\u0011l\u0002", "", "\nh]6g\u0005", "u(E", "\u0017RN\u00148\u001b-3\u0006x[B\fcg)N[\u0010[:mvx'b", "\u001aj^A_0G\u001d(~\u000emui\t1e\u0013}", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FieldBinding(WireField wireField, Class<M> messageType, Field messageField, Class<B> builderType, boolean z2, ClassLoader classLoader) {
        String strDeclaredName;
        Intrinsics.checkNotNullParameter(wireField, "wireField");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(messageField, "messageField");
        Intrinsics.checkNotNullParameter(builderType, "builderType");
        this.messageField = messageField;
        this.writeIdentityValues = z2;
        this.classLoader = classLoader;
        this.label = wireField.label();
        String name = messageField.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        this.name = name;
        this.wireFieldJsonName = wireField.jsonName();
        if (wireField.declaredName().length() == 0) {
            strDeclaredName = messageField.getName();
            Intrinsics.checkNotNullExpressionValue(strDeclaredName, "getName(...)");
        } else {
            strDeclaredName = wireField.declaredName();
        }
        this.declaredName = strDeclaredName;
        this.tag = wireField.tag();
        this.keyAdapterString = wireField.keyAdapter();
        this.adapterString = wireField.adapter();
        this.redacted = wireField.redacted();
        this.builderSetter = getBuilderSetter(builderType, wireField);
        this.builderGetter = getBuilderGetter(builderType, wireField);
        this.instanceGetter = getInstanceGetter(messageType);
    }

    public /* synthetic */ FieldBinding(WireField wireField, Class cls, Field field, Class cls2, boolean z2, ClassLoader classLoader, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireField, cls, field, cls2, z2, (i2 + 32) - (i2 | 32) != 0 ? cls.getClassLoader() : classLoader);
    }

    private final Function1<B, Object> getBuilderGetter(Class<?> cls, final WireField wireField) {
        if (cls.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new Function1() { // from class: com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FieldBinding.getBuilderGetter$lambda$3(wireField, (Message.Builder) obj);
                }
            };
        }
        try {
            final Field field = cls.getField(getName());
            return new Function1() { // from class: com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FieldBinding.getBuilderGetter$lambda$4(field, (Message.Builder) obj);
                }
            };
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("No builder field " + cls.getName() + '.' + getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getBuilderGetter$lambda$3(WireField wireField, Message.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((KotlinConstructorBuilder) builder).get(wireField);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getBuilderGetter$lambda$4(Field field, Message.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return field.get(builder);
    }

    private final Function2<B, Object, Unit> getBuilderSetter(Class<?> cls, final WireField wireField) {
        if (cls.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new Function2() { // from class: com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FieldBinding.getBuilderSetter$lambda$0(wireField, (Message.Builder) obj, obj2);
                }
            };
        }
        if (!wireField.label().isOneOf()) {
            try {
                final Field field = cls.getField(getName());
                return new Function2() { // from class: com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FieldBinding.getBuilderSetter$lambda$2(field, (Message.Builder) obj, obj2);
                    }
                };
            } catch (NoSuchFieldException unused) {
                throw new AssertionError("No builder field " + cls.getName() + '.' + getName());
            }
        }
        Class<?> type = this.messageField.getType();
        try {
            final Method method = cls.getMethod(getName(), type);
            return new Function2() { // from class: com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FieldBinding.getBuilderSetter$lambda$1(method, (Message.Builder) obj, obj2);
                }
            };
        } catch (NoSuchMethodException unused2) {
            throw new AssertionError("No builder method " + cls.getName() + '.' + getName() + '(' + type.getName() + ')');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBuilderSetter$lambda$0(WireField wireField, Message.Builder builder, Object obj) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        ((KotlinConstructorBuilder) builder).set(wireField, obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBuilderSetter$lambda$1(Method method, Message.Builder builder, Object obj) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(builder, "builder");
        method.invoke(builder, obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBuilderSetter$lambda$2(Field field, Message.Builder builder, Object obj) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(builder, "builder");
        field.set(builder, obj);
        return Unit.INSTANCE;
    }

    private final Function1<M, Object> getInstanceGetter(Class<M> cls) throws NoSuchMethodException {
        if (!Modifier.isPrivate(this.messageField.getModifiers())) {
            return new Function1() { // from class: com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FieldBinding.getInstanceGetter$lambda$7(this.f$0, (Message) obj);
                }
            };
        }
        String name = this.messageField.getName();
        Regex regex = IS_GETTER_FIELD_NAME_REGEX;
        Intrinsics.checkNotNull(name);
        String str = name;
        if (!regex.matches(str)) {
            StringBuilder sb = new StringBuilder("get");
            if (str.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                String strValueOf = String.valueOf(name.charAt(0));
                Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                StringBuilder sbAppend = sb2.append((Object) upperCase);
                String strSubstring = name.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                name = sbAppend.append(strSubstring).toString();
            }
            name = sb.append(name).toString();
        }
        final Method method = cls.getMethod(name, new Class[0]);
        return new Function1() { // from class: com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FieldBinding.getInstanceGetter$lambda$6(method, (Message) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getInstanceGetter$lambda$6(Method method, Message instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        return method.invoke(instance, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getInstanceGetter$lambda$7(FieldBinding fieldBinding, Message instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        return fieldBinding.messageField.get(instance);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object get(M message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return this.instanceGetter.invoke(message);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getDeclaredName() {
        return this.declaredName;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object getFromBuilder(B builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return this.builderGetter.invoke(builder);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public ProtoAdapter<?> getKeyAdapter() {
        return ProtoAdapter.Companion.get(this.keyAdapterString, this.classLoader);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public WireField.Label getLabel() {
        return this.label;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getName() {
        return this.name;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getRedacted() {
        return this.redacted;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public ProtoAdapter<?> getSingleAdapter() {
        return ProtoAdapter.Companion.get(this.adapterString, this.classLoader);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public int getTag() {
        return this.tag;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getWireFieldJsonName() {
        return this.wireFieldJsonName;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getWriteIdentityValues() {
        return this.writeIdentityValues;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMap() {
        return this.keyAdapterString.length() > 0;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMessage() {
        KClass<?> type = getSingleAdapter().getType();
        Class javaObjectType = type != null ? JvmClassMappingKt.getJavaObjectType(type) : null;
        Intrinsics.checkNotNull(javaObjectType);
        return Message.class.isAssignableFrom(javaObjectType);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void set(B builder, Object obj) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.builderSetter.invoke(builder, obj);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void value(B builder, Object value) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (getLabel().isRepeated()) {
            Object fromBuilder = getFromBuilder((Message.Builder) builder);
            if (TypeIntrinsics.isMutableList(fromBuilder)) {
                Intrinsics.checkNotNull(fromBuilder, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any>");
                TypeIntrinsics.asMutableList(fromBuilder).add(value);
                return;
            } else {
                if (!(fromBuilder instanceof List)) {
                    throw new ClassCastException("Expected a list type, got " + (fromBuilder != null ? fromBuilder.getClass() : null) + '.');
                }
                List mutableList = CollectionsKt.toMutableList((Collection) fromBuilder);
                mutableList.add(value);
                set((Message.Builder) builder, (Object) mutableList);
                return;
            }
        }
        if (this.keyAdapterString.length() <= 0) {
            set((Message.Builder) builder, value);
            return;
        }
        Object fromBuilder2 = getFromBuilder((Message.Builder) builder);
        if (TypeIntrinsics.isMutableMap(fromBuilder2)) {
            ((Map) fromBuilder2).putAll((Map) value);
        } else {
            if (!(fromBuilder2 instanceof Map)) {
                throw new ClassCastException("Expected a map type, got " + (fromBuilder2 != null ? fromBuilder2.getClass() : null) + '.');
            }
            Map mutableMap = MapsKt.toMutableMap((Map) fromBuilder2);
            mutableMap.putAll((Map) value);
            set((Message.Builder) builder, (Object) mutableMap);
        }
    }
}
