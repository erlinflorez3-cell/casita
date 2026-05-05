package com.google.android.gms.internal.mlkit_vision_object_detection_custom;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
final class zzce implements ObjectEncoderContext {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;
    private static final ObjectEncoder zzd;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final ObjectEncoder zzh;
    private final zzci zzi = new zzci(this);

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("key");
        zzby zzbyVar = new zzby();
        zzbyVar.zza(1);
        zzb = builder.withProperty(zzbyVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("value");
        zzby zzbyVar2 = new zzby();
        zzbyVar2.zza(2);
        zzc = builder2.withProperty(zzbyVar2.zzb()).build();
        zzd = new ObjectEncoder() { // from class: com.google.android.gms.internal.mlkit_vision_object_detection_custom.zzcd
            @Override // com.google.firebase.encoders.Encoder
            public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
                zzce.zzg((Map.Entry) obj, objectEncoderContext);
            }
        };
    }

    zzce(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = objectEncoder;
    }

    static /* synthetic */ void zzg(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(zzb, entry.getKey());
        objectEncoderContext.add(zzc, entry.getValue());
    }

    private static int zzh(FieldDescriptor fieldDescriptor) {
        zzcc zzccVar = (zzcc) fieldDescriptor.getProperty(zzcc.class);
        if (zzccVar != null) {
            return zzccVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final long zzi(ObjectEncoder objectEncoder, Object obj) throws IOException {
        zzbz zzbzVar = new zzbz();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzbzVar;
            try {
                objectEncoder.encode(obj, this);
                this.zze = outputStream;
                long jZza = zzbzVar.zza();
                zzbzVar.close();
                return jZza;
            } catch (Throwable th) {
                this.zze = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                zzbzVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static zzcc zzj(FieldDescriptor fieldDescriptor) {
        zzcc zzccVar = (zzcc) fieldDescriptor.getProperty(zzcc.class);
        if (zzccVar != null) {
            return zzccVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final zzce zzk(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z2) throws IOException {
        long jZzi = zzi(objectEncoder, obj);
        if (z2 && jZzi == 0) {
            return this;
        }
        int iZzh = zzh(fieldDescriptor) << 3;
        zzn((iZzh + 2) - (iZzh & 2));
        zzo(jZzi);
        objectEncoder.encode(obj, this);
        return this;
    }

    private final zzce zzl(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z2) throws IOException {
        this.zzi.zza(fieldDescriptor, z2);
        valueEncoder.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i2) {
        return ByteBuffer.allocate(i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i2) throws IOException {
        while (true) {
            int i3 = i2 & 127;
            if (((-128) & i2) == 0) {
                this.zze.write(i3);
                return;
            } else {
                this.zze.write((-1) - (((-1) - i3) & ((-1) - 128)));
                i2 >>>= 7;
            }
        }
    }

    private final void zzo(long j2) throws IOException {
        while (true) {
            int i2 = ((int) j2) & 127;
            if (((-128) + j2) - ((-128) | j2) == 0) {
                this.zze.write(i2);
                return;
            } else {
                this.zze.write((-1) - (((-1) - i2) & ((-1) - 128)));
                j2 >>>= 7;
            }
        }
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d2) throws IOException {
        zza(fieldDescriptor, d2, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f2) throws IOException {
        zzb(fieldDescriptor, f2, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i2) throws IOException {
        zzd(fieldDescriptor, i2, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j2) throws IOException {
        zze(fieldDescriptor, j2, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) throws IOException {
        zzc(fieldDescriptor, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z2) throws IOException {
        zzd(fieldDescriptor, z2 ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, double d2) throws IOException {
        zza(FieldDescriptor.of(str), d2, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, int i2) throws IOException {
        zzd(FieldDescriptor.of(str), i2, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, long j2) throws IOException {
        zze(FieldDescriptor.of(str), j2, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, Object obj) throws IOException {
        zzc(FieldDescriptor.of(str), obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, boolean z2) throws IOException {
        zzd(FieldDescriptor.of(str), z2 ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext inline(Object obj) throws IOException {
        zzf(obj);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(String str) throws IOException {
        return nested(FieldDescriptor.of(str));
    }

    final ObjectEncoderContext zza(FieldDescriptor fieldDescriptor, double d2, boolean z2) throws IOException {
        if (z2 && d2 == 0.0d) {
            return this;
        }
        int iZzh = zzh(fieldDescriptor) << 3;
        zzn((iZzh + 1) - (iZzh & 1));
        this.zze.write(zzm(8).putDouble(d2).array());
        return this;
    }

    final ObjectEncoderContext zzb(FieldDescriptor fieldDescriptor, float f2, boolean z2) throws IOException {
        if (z2 && f2 == 0.0f) {
            return this;
        }
        zzn((-1) - (((-1) - (zzh(fieldDescriptor) << 3)) & ((-1) - 5)));
        this.zze.write(zzm(4).putFloat(f2).array());
        return this;
    }

    final ObjectEncoderContext zzc(FieldDescriptor fieldDescriptor, Object obj, boolean z2) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z2 || charSequence.length() != 0) {
                    zzn((-1) - (((-1) - (zzh(fieldDescriptor) << 3)) & ((-1) - 2)));
                    byte[] bytes = charSequence.toString().getBytes(zza);
                    zzn(bytes.length);
                    this.zze.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    zzc(fieldDescriptor, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    zzk(zzd, fieldDescriptor, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    zza(fieldDescriptor, ((Double) obj).doubleValue(), z2);
                    return this;
                }
                if (obj instanceof Float) {
                    zzb(fieldDescriptor, ((Float) obj).floatValue(), z2);
                    return this;
                }
                if (obj instanceof Number) {
                    zze(fieldDescriptor, ((Number) obj).longValue(), z2);
                    return this;
                }
                if (obj instanceof Boolean) {
                    zzd(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z2);
                    return this;
                }
                if (!(obj instanceof byte[])) {
                    ObjectEncoder objectEncoder = (ObjectEncoder) this.zzf.get(obj.getClass());
                    if (objectEncoder != null) {
                        zzk(objectEncoder, fieldDescriptor, obj, z2);
                        return this;
                    }
                    ValueEncoder valueEncoder = (ValueEncoder) this.zzg.get(obj.getClass());
                    if (valueEncoder != null) {
                        zzl(valueEncoder, fieldDescriptor, obj, z2);
                        return this;
                    }
                    if (obj instanceof zzca) {
                        zzd(fieldDescriptor, ((zzca) obj).zza(), true);
                        return this;
                    }
                    if (obj instanceof Enum) {
                        zzd(fieldDescriptor, ((Enum) obj).ordinal(), true);
                        return this;
                    }
                    zzk(this.zzh, fieldDescriptor, obj, z2);
                    return this;
                }
                byte[] bArr = (byte[]) obj;
                if (!z2 || bArr.length != 0) {
                    zzn((-1) - (((-1) - (zzh(fieldDescriptor) << 3)) & ((-1) - 2)));
                    zzn(bArr.length);
                    this.zze.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    final zzce zzd(FieldDescriptor fieldDescriptor, int i2, boolean z2) throws IOException {
        if (!z2 || i2 != 0) {
            zzcc zzccVarZzj = zzj(fieldDescriptor);
            int iOrdinal = zzccVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzccVarZzj.zza() << 3);
                zzn(i2);
            } else if (iOrdinal == 1) {
                zzn(zzccVarZzj.zza() << 3);
                zzn((i2 + i2) ^ (i2 >> 31));
            } else if (iOrdinal == 2) {
                zzn((zzccVarZzj.zza() << 3) | 5);
                this.zze.write(zzm(4).putInt(i2).array());
            }
        }
        return this;
    }

    final zzce zze(FieldDescriptor fieldDescriptor, long j2, boolean z2) throws IOException {
        if (!z2 || j2 != 0) {
            zzcc zzccVarZzj = zzj(fieldDescriptor);
            int iOrdinal = zzccVarZzj.zzb().ordinal();
            if (iOrdinal == 0) {
                zzn(zzccVarZzj.zza() << 3);
                zzo(j2);
            } else if (iOrdinal == 1) {
                zzn(zzccVarZzj.zza() << 3);
                zzo((j2 >> 63) ^ (j2 + j2));
            } else if (iOrdinal == 2) {
                zzn((zzccVarZzj.zza() << 3) | 1);
                this.zze.write(zzm(8).putLong(j2).array());
            }
        }
        return this;
    }

    final zzce zzf(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.zzf.get(obj.getClass());
        if (objectEncoder == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(String.valueOf(obj.getClass()))));
        }
        objectEncoder.encode(obj, this);
        return this;
    }
}
