package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzam extends zzxr implements zzzh {
    private static final zzyb zzd = new zzyb<Integer, zzaq>() { // from class: com.google.android.gms.internal.gtm.zzam.1
        @Override // com.google.android.gms.internal.gtm.zzyb
        /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
        public zzaq zzb(Integer num) {
            zzaq zzaqVarZzb = zzaq.zzb(num.intValue());
            return zzaqVarZzb == null ? zzaq.ESCAPE_HTML : zzaqVarZzb;
        }
    };
    private static final zzam zze;
    private int zzf;
    private long zzn;
    private boolean zzo;
    private boolean zzr;
    private byte zzs = 2;
    private int zzg = 1;
    private String zzh = "";
    private zzyd zzi = zzah();
    private zzyd zzj = zzah();
    private zzyd zzk = zzah();
    private String zzl = "";
    private String zzm = "";
    private zzyd zzp = zzah();
    private zzya zzq = zzag();

    static {
        zzam zzamVar = new zzam();
        zze = zzamVar;
        zzxv.zzan(zzam.class, zzamVar);
    }

    private zzam() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    static /* synthetic */ void zzA(zzam zzamVar, Iterable iterable) {
        zzamVar.zzat();
        List list = zzamVar.zzk;
        byte[] bArr = zzye.zzd;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size2);
                }
            } else {
                list.add(obj);
            }
        }
    }

    static /* synthetic */ void zzC(zzam zzamVar, String str) {
        str.getClass();
        zzamVar.zzf = (-1) - (((-1) - zzamVar.zzf) & ((-1) - 4));
        zzamVar.zzl = str;
    }

    static /* synthetic */ void zzD(zzam zzamVar, String str) {
        str.getClass();
        zzamVar.zzf |= 8;
        zzamVar.zzm = str;
    }

    static /* synthetic */ void zzE(zzam zzamVar, String str) {
        str.getClass();
        zzamVar.zzf = (-1) - (((-1) - zzamVar.zzf) & ((-1) - 2));
        zzamVar.zzh = str;
    }

    static /* synthetic */ void zzF(zzam zzamVar, long j2) {
        zzamVar.zzf |= 16;
        zzamVar.zzn = j2;
    }

    static /* synthetic */ void zzG(zzam zzamVar, boolean z2) {
        int i2 = zzamVar.zzf;
        zzamVar.zzf = (i2 + 32) - (i2 & 32);
        zzamVar.zzo = z2;
    }

    static /* synthetic */ void zzH(zzam zzamVar, zzam zzamVar2) {
        zzamVar2.getClass();
        zzyd zzydVar = zzamVar.zzp;
        if (!zzydVar.zzc()) {
            zzamVar.zzp = zzxv.zzai(zzydVar);
        }
        zzamVar.zzp.add(zzamVar2);
    }

    static /* synthetic */ void zzJ(zzam zzamVar, Iterable iterable) {
        zzya zzyaVar = zzamVar.zzq;
        if (!zzyaVar.zzc()) {
            int size = zzyaVar.size();
            zzamVar.zzq = zzyaVar.zzd(size == 0 ? 10 : size + size);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzamVar.zzq.zzh(((zzaq) it.next()).zza());
        }
    }

    static /* synthetic */ void zzL(zzam zzamVar, boolean z2) {
        int i2 = zzamVar.zzf;
        zzamVar.zzf = (i2 + 64) - (i2 & 64);
        zzamVar.zzr = z2;
    }

    static /* synthetic */ void zzM(zzam zzamVar, zzam zzamVar2) {
        zzamVar2.getClass();
        zzamVar.zzar();
        zzamVar.zzi.add(zzamVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    static /* synthetic */ void zzN(zzam zzamVar, Iterable iterable) {
        zzamVar.zzar();
        List list = zzamVar.zzi;
        byte[] bArr = zzye.zzd;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size2);
                }
            } else {
                list.add(obj);
            }
        }
    }

    private final void zzar() {
        zzyd zzydVar = this.zzi;
        if (zzydVar.zzc()) {
            return;
        }
        this.zzi = zzxv.zzai(zzydVar);
    }

    private final void zzas() {
        zzyd zzydVar = this.zzj;
        if (zzydVar.zzc()) {
            return;
        }
        this.zzj = zzxv.zzai(zzydVar);
    }

    private final void zzat() {
        zzyd zzydVar = this.zzk;
        if (zzydVar.zzc()) {
            return;
        }
        this.zzk = zzxv.zzai(zzydVar);
    }

    public static zzan zzg() {
        return (zzan) zze.zzY();
    }

    public static zzam zzj() {
        return zze;
    }

    static /* synthetic */ void zzu(zzam zzamVar, zzat zzatVar) {
        zzamVar.zzg = zzatVar.zza();
        int i2 = zzamVar.zzf;
        zzamVar.zzf = (i2 + 1) - (i2 & 1);
    }

    static /* synthetic */ void zzw(zzam zzamVar, zzam zzamVar2) {
        zzamVar2.getClass();
        zzamVar.zzas();
        zzamVar.zzj.add(zzamVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    static /* synthetic */ void zzx(zzam zzamVar, Iterable iterable) {
        zzamVar.zzas();
        List list = zzamVar.zzj;
        byte[] bArr = zzye.zzd;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                int size2 = list.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size2);
                }
            } else {
                list.add(obj);
            }
        }
    }

    static /* synthetic */ void zzz(zzam zzamVar, zzam zzamVar2) {
        zzamVar2.getClass();
        zzamVar.zzat();
        zzamVar.zzk.add(zzamVar2);
    }

    public final boolean zzO() {
        return this.zzo;
    }

    public final boolean zzP() {
        return this.zzr;
    }

    public final int zza() {
        return this.zzi.size();
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    protected final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.zzs);
        }
        if (i3 == 2) {
            return zzak(zze, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0005\u0005\u0001ᴌ\u0000\u0002ဈ\u0001\u0003Л\u0004Л\u0005Л\u0006ဈ\u0002\u0007ဈ\u0003\bဂ\u0004\tဇ\u0006\nࠞ\u000bЛ\fဇ\u0005", new Object[]{"zzf", "zzg", zzas.zza, "zzh", "zzi", zzam.class, "zzj", zzam.class, "zzk", zzam.class, "zzl", "zzm", "zzn", "zzr", "zzq", zzap.zza, "zzp", zzam.class, "zzo"});
        }
        if (i3 == 3) {
            return new zzam();
        }
        zzal zzalVar = null;
        if (i3 == 4) {
            return new zzan(zzalVar);
        }
        if (i3 == 5) {
            return zze;
        }
        this.zzs = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final int zzc() {
        return this.zzj.size();
    }

    public final int zzd() {
        return this.zzk.size();
    }

    public final int zze() {
        return this.zzp.size();
    }

    public final long zzf() {
        return this.zzn;
    }

    public final zzat zzh() {
        zzat zzatVarZzb = zzat.zzb(this.zzg);
        return zzatVarZzb == null ? zzat.STRING : zzatVarZzb;
    }

    public final zzam zzk(int i2) {
        return (zzam) this.zzi.get(i2);
    }

    public final zzam zzl(int i2) {
        return (zzam) this.zzj.get(i2);
    }

    public final zzam zzm(int i2) {
        return (zzam) this.zzk.get(i2);
    }

    public final zzam zzn(int i2) {
        return (zzam) this.zzp.get(i2);
    }

    public final String zzo() {
        return this.zzm;
    }

    public final String zzp() {
        return this.zzl;
    }

    public final String zzq() {
        return this.zzh;
    }

    public final List zzr() {
        return new zzyc(this.zzq, zzd);
    }

    public final List zzs() {
        return this.zzi;
    }

    public final List zzt() {
        return this.zzp;
    }
}
