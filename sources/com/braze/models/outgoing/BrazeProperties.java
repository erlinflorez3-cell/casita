package com.braze.models.outgoing;

import bo.app.bg;
import bo.app.cg;
import bo.app.dg;
import bo.app.eg;
import bo.app.fg;
import bo.app.hg;
import com.braze.Constants;
import com.braze.enums.BrazeDateFormat;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<K\u0007\"2\u0013\u007f\u0007tvAӄLeV\u008cZS0\u001bs{B*c$wFCU(\u0005*\tURog|lb\u000bI\u0012\f\u001b\u000f̓Jp\u0006~m\u0014\u001f2pom2\u0006neygzJӯ$4(Y\b'A)0\\ z\tDc\f@0Ϯt<X.[(Z+\fR0\u000f,\u0002\u007fXFJ|]h53\u0003oC|Kۢ4~S.Tzo,\u0005e6+n7e\u00193T\u001b\u0007\u0001[o\tEqK\b\u0001'U-\u0010sɱ:Z\u0006\u0018#0\u0018*k|>\\3ĩ\u0011\u001052gcyV>.\u0006\u0004\u0014\u000fR\u0003<\u000eόL03$t\u0013V@\u0003~kBf\u0001\rۍȸ~c<#3\r{@G)~Q\u0010=IRE\u0003\u001d\rL)GsĲ_V\u0014n#*\u001d\u000f_AiBSG|\u0012\nA{\u000b\tb00J5Ͻ\u00041\u0002!<(mOiK;#\u0002\u0001vL\u0018z\u0013g\u0001S\u0018X\u000f؟\"å\u001a90\u001b\u001ak\rq\u0013~hT\u0007,WaɟX\t\u0004\u001b!4-\fJ6=\u0010|O\u001fi)M4܆1çj;apq#eO/BCk{\u0010\u0010i-X͖@f\u001dZlZa%+k6=JH\u0019\u0012.@ΌR\u0010+4E\r*P|@'|-H1;x\u0007Ҵ\rcrj\u0016\u001dbRʝ\u0007\u0013"}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI2\fO\u0003!\u001bPqW\u0019\u0004!JYh-Ax\u0016;\\G;y\n", "\u001ab^:\")KO.~Df6{\t6sI\ffP\u0010z VyrJ\u0001.\u000b", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "8r^;B)CS\u0017\u000e", "", "2n:2l\u001d:Z\u001d}vm0\u0007\u0012", "1kT.a", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV\fZ.y\u001b>@*Cc\u0007i\u001c[\u007f\u00177@@k2-j", "", "9dh", "", "D`[BX", "/cS\u001de6IS&\u000e\u000f", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq4AEs}\u001b\"dv9Pk6Mv.U\u0016X<kT|A\u001d\u0014$j['\"\u0005DN.yDD.\f,WW", "1k^;X", "u(;0b4\bP&z\u0010^u\u0005\u0013.e\u00076EJ\u0011&\u0019Qs\u0017>@\u0002BU\u0013 \"z 9MPJo4,j", "1n]AT0Ga\u0004\f\u0005i,\n\u0018C", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?5", "@d\\<i,)`#\nzk;\u0011", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "5dc", "4na\u0017f6G>)\u000e", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", ">q^=X9MW\u0019\r_L\u0016er,j\u007f&\u000b", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "", "5dc \\A>", "u(8", "Ahi2", "7r8;i(EW\u0018", "u(I", "", "5dc\u000fl;>A\u001d\u0014z", "u(9", "0xc2F0SS", "\nh]6g\u0005", "u(E", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOVZ\b", "", ";`_", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)p", "\u0011n\\=T5B]\"", "0n\u001e.c7\bP\u001b", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public final class BrazeProperties implements IPutIntoJson<JSONObject> {
    public static final bg Companion = new bg();
    private JSONObject propertiesJSONObject;

    public BrazeProperties() {
        this.propertiesJSONObject = new JSONObject();
    }

    public BrazeProperties(Map<String, ?> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.propertiesJSONObject = new JSONObject();
        this.propertiesJSONObject = clean$default(this, new JSONObject(hg.a(map)), false, 2, null);
    }

    public BrazeProperties(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.propertiesJSONObject = new JSONObject();
        this.propertiesJSONObject = clean$default(this, jsonObject, false, 2, null);
    }

    private final JSONObject clean(JSONObject jSONObject, boolean z2) throws JSONException {
        ArrayList<String> arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Intrinsics.checkNotNullExpressionValue(next, "jsonObjectIterator.next()");
            arrayList.add(next);
        }
        for (String str : arrayList) {
            if (!z2 || Companion.a(str)) {
                Object obj = jSONObject.get(str);
                if (obj instanceof Date) {
                    jSONObject.put(str, DateTimeUtils.formatDate$default((Date) obj, BrazeDateFormat.LONG, null, 2, null));
                }
                if (obj instanceof JSONArray) {
                    jSONObject.put(str, hg.a((JSONArray) obj));
                }
                if (obj instanceof JSONObject) {
                    jSONObject.put(str, clean((JSONObject) obj, false));
                }
            } else {
                jSONObject.remove(str);
            }
        }
        return jSONObject;
    }

    public static /* synthetic */ JSONObject clean$default(BrazeProperties brazeProperties, JSONObject jSONObject, boolean z2, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = true;
        }
        return brazeProperties.clean(jSONObject, z2);
    }

    @JvmStatic
    public static final boolean isValidKey(String str) {
        return Companion.a(str);
    }

    public final BrazeProperties addProperty(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!Companion.a(key)) {
            return this;
        }
        try {
            if (obj instanceof Long) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ((Number) obj).intValue());
            } else if (obj instanceof Double) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ((Number) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ((Boolean) obj).booleanValue());
            } else if (obj instanceof Date) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), DateTimeUtils.formatDate$default((Date) obj, BrazeDateFormat.LONG, null, 2, null));
            } else if (obj instanceof String) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), ValidationUtils.ensureBrazeFieldLength((String) obj));
            } else if (obj instanceof JSONArray) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), hg.a((JSONArray) obj));
            } else if (obj instanceof JSONObject) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), clean$default(this, (JSONObject) obj, false, 2, null));
            } else if (obj instanceof Map) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), clean$default(this, new JSONObject(hg.a((Map) obj)), false, 2, null));
            } else if (obj == null) {
                this.propertiesJSONObject.put(ValidationUtils.ensureBrazeFieldLength(key), JSONObject.NULL);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new cg(key), 6, (Object) null);
            }
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) dg.f488a, 4, (Object) null);
        }
        return this;
    }

    public final BrazeProperties clone() {
        try {
            return new BrazeProperties(new JSONObject(forJsonPut().toString()));
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) eg.f572a, 4, (Object) null);
            return null;
        }
    }

    public final boolean containsProperty(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.propertiesJSONObject.has(key);
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        return this.propertiesJSONObject;
    }

    public final Object get(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return this.propertiesJSONObject.get(key);
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) fg.f670a, 4, (Object) null);
            return null;
        }
    }

    public final long getByteSize() {
        String string = this.propertiesJSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "propertiesJSONObject.toString()");
        return StringUtils.getByteSize(string);
    }

    public final int getSize() {
        return this.propertiesJSONObject.length();
    }

    public final boolean isInvalid() {
        return getByteSize() > Constants.EVENT_PROPERTIES_MAX_SIZE_BYTES;
    }

    public final Object removeProperty(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.propertiesJSONObject.remove(key);
    }
}
