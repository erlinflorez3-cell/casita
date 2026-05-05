package com.squareup.wire.internal;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&˛\bDRш|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lkA0ZeP\u008cZS81s{B*c$\bCCU ~*\t]]ogtLb\u000bQ-\u000e\u0016\u0007v4I[\u0004e\u0012\u001d2JģG3coEʠhtL\u0005(2(:\u0002\u0005\u000f#2H\u0016z\u0003Ca\f\u001a0FuBR#M\r\u001a\u0018\u0007TĨ\u001f\\\u0005mTȤVk\u0006:]#+oHM5`X|{\rvZ7\u000f\u0007ad*n9m\u0014c\u0014\u001c\u0017biB\u001bK\u0002?\u0015h]ݐ;K\u0004WlW.\u0018Ʀ/Q\u0013b\u0001,%\u000e_~$'aNӍOP\u001cG@\u000e\n-T\u0004<\u0011WL<N2f>Ԅy\tɤW@^$']\u000e\u001ey6EI079^3f\u007f\bk\u001d\\X\u0014\u0005C̔i\u0015ͼ%[b5)0)w\u0010Q_upAVs\"Yk\u00164tp#B\u0004fϚFCɨ\u0015.%N\u007fnGM9k8҆tk\u0005&xh\n֟\u0019\\غ&n$br\u001a\u001a\u0007\\d3\u0019\u0001ZfZ)O2S5}Nˍ %}JP=\u0010|Z/}3`k:=/\u0015M\nry/o9\u0015ڨ{eӒ\u0014a`(\\RJ\u0015\u001dX\u001d̻\u0004\u0010h\u0010@\"`|1$ȑ\u007fD\\A[\u0006M(44ZU9^\u001bH\u0011UrG\u000bAw\\~\u000f5Ԟc.\u0011#<z\u0019\u0003`\\7'\u0016\u000ey2\u000b\u001b:/WP{PVs0$L\u00173\t\u000fs.]wPWN\u0003\u0015$U\f\"&\u001a\u007f\t??#\u000f-M`>βIL\u0001#\"e *\u0013\t\n\u0011KhdԖ\u0018l\u0001,\u0017ixS+Ϣ$Ցbr+Ψ5\u0014\bh^\u0003WgZެk>\u007fͿ1a\u0013ҁ:٫\t\u001f&ݒQ\u00170\u0006MES)-\u0016&\u001f?#qiyq>y\u0019χ6vu\u0004bbD{\u0011[Є6A@Ծq\u0001D/2zSeVy\u0010\u001aR\u0017D\u0019CJQd'މHO\u001b/4e58;\u0001Æ_B\u001bo\fGFa0\u0005Q\u0010dsQ9)Sci}myr9_؝\u000e\u0011\u0004ς\u0007\u0014\"T.n(y\u0017I\u001e{(:Q=x\u0004j\u001fRIʙ@\u000e\u0013͏lk\f*\t\u0018\u0017z\u001d2JB\"Q~\u0016dxbWX\u0005fF\u000f-`E϶\u001376z;M\u0013\u000bܗXn"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006c5>h\u0002(7U\u0016<[?=k\u0010\u001d\u0011sp9\u00149", "\u001b", "", "\u0010", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "0h]1\\5@", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006^%Cgy\"7J\u001a7LGDm\n", "\nh]6g\u0005", "uKR<`uL_)z\b^<\bRAi\r(ED\n&\u0017Tx\nC@\r5g\f\u001c9mr2VB?t6sXY", ";db@T.>B-\nz", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "4hT9W:", "", "", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006W)5`|\nDW\u001f.7D\u0018o=\u001d\u0019qc\u000f", "5dc\u0013\\,ER'", "u(;7T=:\u001d)\u000e~eud\u0005:;", "4hT9W\tB\\\u0018\u0003\u0004`:X\u0016<a\u0014", "", "5dc\u0013\\,ERu\u0003\u0004]0\u0006\u000b=A\r5wT", "u(J\u0019V6F\u001d'\u000b\u000bZ9|\u0019:/\u0012,\t@J\u001b Vo\u001bEr,~:\u0002 >l\u007f;7L;U5z\u0019q`=\u0010e\u0002", ")KR<`uL_)z\b^<\bRAi\r(ED\n&\u0017Tx\nC@\u00069Y\u0005\u001f!z\u007f7M-<H8'\u0014lj;\\", "8r^;A(FS'", "", "", "5dc\u0017f6G<\u0015\u0007zl", "u(;7T=:\u001d)\u000e~euc\r=tU", "8r^;43MS&\bvm,e\u00057e\u000e", "5dc\u0017f6G/ \u000ezk5x\u0018/N{0{N", "8r^;A(FS", "5dc\u0017f6G<\u0015\u0007z", "uKR<`uL_)z\b^<\bRAi\r(ED\n&\u0017Tx\nC@\u00069Y\u0005\u001f!z\u007f7M-<H8'\u0014lj;\\'\u0013Sr8C\u0016U(eT<+#\u001f^\u0017P\u0001", "<df\u000fh0ER\u0019\f", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "3mR<W,=A\u001d\u0014z", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "3mR<W,", "", "EqXAX9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!9|\u0012Kv2\u000b", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&Qa\u001b@\u0006%B/d%3~\u0012wT?Dm}\b\u0012ma7\u00169o?", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqh@\u0012\u0017$UoxI\u00014?K\u000b$Fm#\u0004", "uKR<`uL_)z\b^<\bRAi\r(E-\u0001(\u0017T}\u000e'\u0004/Dco-;|\u0016;#*@gE\u001a^o]B\t-\u0016K{'E[$oM", "@dS.V;", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004", "2dR<W,", "@dP1X9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u000b", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&Q\\\u000e8u%B/A\u0007<i'*\u0017J7t6g~ef9\u0005r\u0002", "EqXAX\bEZy\u0003ze+\u000b", "\u000f", ";db@T.>", "8r^;4+:^(~\bl", "@dS.V;>Ry\u0003ze+\u000bd.a\u000b7{M", "3mR<W,/O \u000fz", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011\u007f\u001d@}n\u001c]\f/\rT\u001b*^?\u0005r0'\u00172K6\fc*]L\u000eMV]3`[<B%\u001a$\u000f^4\u000b\u0014]K-|\u000e\u0018/\u0011*X\u0006EqNaY~", "\u0011n\\=T5B]\"", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class RuntimeMessageAdapter<M, B> extends ProtoAdapter<M> {
    public static final Companion Companion = new Companion(null);
    private static final String REDACTED = "██";
    private final MessageBinding<M, B> binding;
    private final FieldOrOneOfBinding<M, B>[] fieldBindingsArray;
    private final Map<Integer, FieldOrOneOfBinding<M, B>> fields;
    private final List<String> jsonAlternateNames;
    private final List<String> jsonNames;
    private final KClass<? super M> messageType;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pKkH¯VU0\u000fy|\u00050i&\nCiXpԅt\u07beSNo˧ĚN^"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\u007fI\u0010\u0017$Pk\u0015\u0006c5>h\u0002(7U\u0016<[?=k\u0010\u001d\u0011sp9\u0014\"\nX~2CUR6e(", "", "\nh]6g\u0005", "u(E", " D3\u000e6\u001b\u001e2", "", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuntimeMessageAdapter(MessageBinding<M, B> binding) {
        String strCamelCase$default;
        super(FieldEncoding.LENGTH_DELIMITED, binding.getMessageType(), binding.getTypeUrl(), binding.getSyntax(), null, null, 48, null);
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.messageType = binding.getMessageType();
        Map<Integer, FieldOrOneOfBinding<M, B>> fields = binding.getFields();
        this.fields = fields;
        FieldOrOneOfBinding<M, B>[] fieldOrOneOfBindingArr = (FieldOrOneOfBinding[]) fields.values().toArray(new FieldOrOneOfBinding[0]);
        this.fieldBindingsArray = fieldOrOneOfBindingArr;
        ArrayList arrayList = new ArrayList(fieldOrOneOfBindingArr.length);
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : fieldOrOneOfBindingArr) {
            arrayList.add(getJsonName(fieldOrOneOfBinding));
        }
        this.jsonNames = arrayList;
        FieldOrOneOfBinding<M, B>[] fieldOrOneOfBindingArr2 = this.fieldBindingsArray;
        ArrayList arrayList2 = new ArrayList(fieldOrOneOfBindingArr2.length);
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding2 : fieldOrOneOfBindingArr2) {
            arrayList2.add(getJsonName(fieldOrOneOfBinding2));
        }
        ArrayList arrayList3 = arrayList2;
        FieldOrOneOfBinding<M, B>[] fieldOrOneOfBindingArr3 = this.fieldBindingsArray;
        ArrayList arrayList4 = new ArrayList(fieldOrOneOfBindingArr3.length);
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding3 : fieldOrOneOfBindingArr3) {
            if (!Intrinsics.areEqual(getJsonName(fieldOrOneOfBinding3), fieldOrOneOfBinding3.getDeclaredName())) {
                strCamelCase$default = fieldOrOneOfBinding3.getDeclaredName();
            } else if (Intrinsics.areEqual(getJsonName(fieldOrOneOfBinding3), fieldOrOneOfBinding3.getName())) {
                strCamelCase$default = _PlatformKt.camelCase$default(fieldOrOneOfBinding3.getDeclaredName(), false, 2, null);
                if (Intrinsics.areEqual(getJsonName(fieldOrOneOfBinding3), strCamelCase$default) || arrayList3.contains(strCamelCase$default)) {
                    strCamelCase$default = null;
                }
            } else {
                strCamelCase$default = fieldOrOneOfBinding3.getName();
            }
            arrayList4.add(strCamelCase$default);
        }
        this.jsonAlternateNames = arrayList4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M decode(ProtoReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        B bNewBuilder = newBuilder();
        long jBeginMessage = reader.beginMessage();
        while (true) {
            int iNextTag = reader.nextTag();
            if (iNextTag == -1) {
                reader.endMessageAndGetUnknownFields(jBeginMessage);
                return this.binding.build(bNewBuilder);
            }
            FieldOrOneOfBinding<M, B> fieldOrOneOfBinding = this.fields.get(Integer.valueOf(iNextTag));
            if (fieldOrOneOfBinding != null) {
                try {
                    Object objDecode = (fieldOrOneOfBinding.isMap() ? fieldOrOneOfBinding.getAdapter() : fieldOrOneOfBinding.getSingleAdapter()).decode(reader);
                    Intrinsics.checkNotNull(objDecode);
                    fieldOrOneOfBinding.value(bNewBuilder, objDecode);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    this.binding.addUnknownField(bNewBuilder, iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else {
                FieldEncoding fieldEncodingPeekFieldEncoding = reader.peekFieldEncoding();
                Intrinsics.checkNotNull(fieldEncodingPeekFieldEncoding);
                this.binding.addUnknownField(bNewBuilder, iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(reader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, M value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : this.fields.values()) {
            Object obj = fieldOrOneOfBinding.get(value);
            if (obj != null) {
                fieldOrOneOfBinding.getAdapter().encodeWithTag(writer, fieldOrOneOfBinding.getTag(), obj);
            }
        }
        writer.writeBytes(this.binding.unknownFields(value));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, M value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.writeBytes(this.binding.unknownFields(value));
        for (int length = this.fieldBindingsArray.length - 1; -1 < length; length--) {
            FieldOrOneOfBinding<M, B> fieldOrOneOfBinding = this.fieldBindingsArray[length];
            Object obj = fieldOrOneOfBinding.get(value);
            if (obj != null) {
                fieldOrOneOfBinding.getAdapter().encodeWithTag(writer, fieldOrOneOfBinding.getTag(), obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(M value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int cachedSerializedSize = this.binding.getCachedSerializedSize(value);
        if (cachedSerializedSize != 0) {
            return cachedSerializedSize;
        }
        int iEncodedSizeWithTag = 0;
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : this.fields.values()) {
            Object obj = fieldOrOneOfBinding.get(value);
            if (obj != null) {
                iEncodedSizeWithTag += fieldOrOneOfBinding.getAdapter().encodedSizeWithTag(fieldOrOneOfBinding.getTag(), obj);
            }
        }
        int size = iEncodedSizeWithTag + this.binding.unknownFields(value).size();
        this.binding.setCachedSerializedSize(value, size);
        return size;
    }

    public boolean equals(Object obj) {
        return (obj instanceof RuntimeMessageAdapter) && Intrinsics.areEqual(((RuntimeMessageAdapter) obj).messageType, this.messageType);
    }

    public final FieldOrOneOfBinding<M, B>[] getFieldBindingsArray() {
        return this.fieldBindingsArray;
    }

    public final Map<Integer, FieldOrOneOfBinding<M, B>> getFields() {
        return this.fields;
    }

    public final List<String> getJsonAlternateNames() {
        return this.jsonAlternateNames;
    }

    public final String getJsonName(FieldOrOneOfBinding<?, ?> fieldOrOneOfBinding) {
        Intrinsics.checkNotNullParameter(fieldOrOneOfBinding, "<this>");
        return fieldOrOneOfBinding.getWireFieldJsonName().length() == 0 ? fieldOrOneOfBinding.getDeclaredName() : fieldOrOneOfBinding.getWireFieldJsonName();
    }

    public final List<String> getJsonNames() {
        return this.jsonNames;
    }

    public int hashCode() {
        return this.messageType.hashCode();
    }

    public final B newBuilder() {
        return this.binding.newBuilder();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public M redact(M value) {
        Intrinsics.checkNotNullParameter(value, "value");
        B bNewBuilder = this.binding.newBuilder();
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : this.fields.values()) {
            if (fieldOrOneOfBinding.getRedacted() && fieldOrOneOfBinding.getLabel() == WireField.Label.REQUIRED) {
                throw new UnsupportedOperationException("Field '" + fieldOrOneOfBinding.getName() + "' in " + getType() + " is required and cannot be redacted.");
            }
            boolean zIsMessage = fieldOrOneOfBinding.isMessage();
            if (fieldOrOneOfBinding.getRedacted() || (zIsMessage && !fieldOrOneOfBinding.getLabel().isRepeated())) {
                Object fromBuilder = fieldOrOneOfBinding.getFromBuilder(bNewBuilder);
                if (fromBuilder != null) {
                    fieldOrOneOfBinding.set(bNewBuilder, fieldOrOneOfBinding.getAdapter().redact(fromBuilder));
                }
            } else if (zIsMessage && fieldOrOneOfBinding.getLabel().isRepeated()) {
                Object fromBuilder2 = fieldOrOneOfBinding.getFromBuilder(bNewBuilder);
                Intrinsics.checkNotNull(fromBuilder2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                ProtoAdapter<?> singleAdapter = fieldOrOneOfBinding.getSingleAdapter();
                Intrinsics.checkNotNull(singleAdapter, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                fieldOrOneOfBinding.set(bNewBuilder, Internal.m8724redactElements((List) fromBuilder2, singleAdapter));
            }
        }
        this.binding.clearUnknownFields(bNewBuilder);
        return this.binding.build(bNewBuilder);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public String toString(M value) {
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sb = new StringBuilder();
        sb.append(this.messageType.getSimpleName());
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z2 = true;
        for (FieldOrOneOfBinding<M, B> fieldOrOneOfBinding : this.fields.values()) {
            Object obj = fieldOrOneOfBinding.get(value);
            if (obj != null) {
                if (!z2) {
                    sb.append(", ");
                }
                sb.append(fieldOrOneOfBinding.getName());
                sb.append('=');
                if (fieldOrOneOfBinding.getRedacted()) {
                    obj = REDACTED;
                }
                sb.append(obj);
                z2 = false;
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final <A> void writeAllFields(M m2, List<? extends A> jsonAdapters, A a2, Function3<? super String, Object, ? super A, Unit> encodeValue) {
        Intrinsics.checkNotNullParameter(jsonAdapters, "jsonAdapters");
        Intrinsics.checkNotNullParameter(encodeValue, "encodeValue");
        int length = this.fieldBindingsArray.length;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < length; i2++) {
            FieldOrOneOfBinding<M, B> fieldOrOneOfBinding = this.fieldBindingsArray[i2];
            Intrinsics.checkNotNull(m2);
            Object obj = fieldOrOneOfBinding.get(m2);
            if (!fieldOrOneOfBinding.omitFromJson(getSyntax(), obj)) {
                if (!fieldOrOneOfBinding.getRedacted() || a2 == null || obj == null) {
                    encodeValue.invoke(this.jsonNames.get(i2), obj, jsonAdapters.get(i2));
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(this.jsonNames.get(i2));
                }
            }
        }
        if (arrayList == null || !(!arrayList.isEmpty())) {
            return;
        }
        Intrinsics.checkNotNull(a2);
        encodeValue.invoke("__redacted_fields", arrayList, a2);
    }
}
