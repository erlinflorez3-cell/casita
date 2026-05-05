package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
    public static final GoogleSignInOptions DEFAULT_SIGN_IN;
    public static final Scope zaa = new Scope(Scopes.PROFILE);
    public static final Scope zab = new Scope("email");
    public static final Scope zac = new Scope(Scopes.OPEN_ID);
    public static final Scope zad;
    public static final Scope zae;
    private static final Comparator zag;
    final int zaf;
    private final ArrayList zah;
    private Account zai;
    private boolean zaj;
    private final boolean zak;
    private final boolean zal;
    private String zam;
    private String zan;
    private ArrayList zao;
    private String zap;
    private Map zaq;

    public static final class Builder {
        private Set zaa;
        private boolean zab;
        private boolean zac;
        private boolean zad;
        private String zae;
        private Account zaf;
        private String zag;
        private Map zah;
        private String zai;

        public Builder() {
            this.zaa = new HashSet();
            this.zah = new HashMap();
        }

        public Builder(GoogleSignInOptions googleSignInOptions) {
            this.zaa = new HashSet();
            this.zah = new HashMap();
            Preconditions.checkNotNull(googleSignInOptions);
            this.zaa = new HashSet(googleSignInOptions.zah);
            this.zab = googleSignInOptions.zak;
            this.zac = googleSignInOptions.zal;
            this.zad = googleSignInOptions.zaj;
            this.zae = googleSignInOptions.zam;
            this.zaf = googleSignInOptions.zai;
            this.zag = googleSignInOptions.zan;
            this.zah = GoogleSignInOptions.zam(googleSignInOptions.zao);
            this.zai = googleSignInOptions.zap;
        }

        private final String zaa(String str) {
            Preconditions.checkNotEmpty(str);
            String str2 = this.zae;
            boolean z2 = true;
            if (str2 != null && !str2.equals(str)) {
                z2 = false;
            }
            Preconditions.checkArgument(z2, "two different server client ids provided");
            return str;
        }

        public Builder addExtension(GoogleSignInOptionsExtension googleSignInOptionsExtension) {
            if (this.zah.containsKey(Integer.valueOf(googleSignInOptionsExtension.getExtensionType()))) {
                throw new IllegalStateException("Only one extension per type may be added");
            }
            List<Scope> impliedScopes = googleSignInOptionsExtension.getImpliedScopes();
            if (impliedScopes != null) {
                this.zaa.addAll(impliedScopes);
            }
            this.zah.put(Integer.valueOf(googleSignInOptionsExtension.getExtensionType()), new GoogleSignInOptionsExtensionParcelable(googleSignInOptionsExtension));
            return this;
        }

        public GoogleSignInOptions build() {
            if (this.zaa.contains(GoogleSignInOptions.zae) && this.zaa.contains(GoogleSignInOptions.zad)) {
                this.zaa.remove(GoogleSignInOptions.zad);
            }
            if (this.zad && (this.zaf == null || !this.zaa.isEmpty())) {
                requestId();
            }
            return new GoogleSignInOptions(new ArrayList(this.zaa), this.zaf, this.zad, this.zab, this.zac, this.zae, this.zag, this.zah, this.zai);
        }

        public Builder requestEmail() {
            this.zaa.add(GoogleSignInOptions.zab);
            return this;
        }

        public Builder requestId() {
            this.zaa.add(GoogleSignInOptions.zac);
            return this;
        }

        public Builder requestIdToken(String str) {
            this.zad = true;
            zaa(str);
            this.zae = str;
            return this;
        }

        public Builder requestProfile() {
            this.zaa.add(GoogleSignInOptions.zaa);
            return this;
        }

        public Builder requestScopes(Scope scope, Scope... scopeArr) {
            this.zaa.add(scope);
            this.zaa.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public Builder requestServerAuthCode(String str) {
            requestServerAuthCode(str, false);
            return this;
        }

        public Builder requestServerAuthCode(String str, boolean z2) {
            this.zab = true;
            zaa(str);
            this.zae = str;
            this.zac = z2;
            return this;
        }

        public Builder setAccountName(String str) {
            this.zaf = new Account(Preconditions.checkNotEmpty(str), "com.google");
            return this;
        }

        public Builder setHostedDomain(String str) {
            this.zag = Preconditions.checkNotEmpty(str);
            return this;
        }

        public Builder setLogSessionId(String str) {
            this.zai = str;
            return this;
        }
    }

    static {
        Scope scope = new Scope(Scopes.GAMES_LITE);
        zad = scope;
        zae = new Scope(Scopes.GAMES);
        Builder builder = new Builder();
        builder.requestId();
        builder.requestProfile();
        DEFAULT_SIGN_IN = builder.build();
        Builder builder2 = new Builder();
        builder2.requestScopes(scope, new Scope[0]);
        DEFAULT_GAMES_SIGN_IN = builder2.build();
        CREATOR = new zae();
        zag = new zac();
    }

    GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z2, boolean z3, boolean z4, String str, String str2, ArrayList arrayList2, String str3) {
        this(i2, arrayList, account, z2, z3, z4, str, str2, zam(arrayList2), str3);
    }

    private GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z2, boolean z3, boolean z4, String str, String str2, Map map, String str3) {
        this.zaf = i2;
        this.zah = arrayList;
        this.zai = account;
        this.zaj = z2;
        this.zak = z3;
        this.zal = z4;
        this.zam = str;
        this.zan = str2;
        this.zao = new ArrayList(map.values());
        this.zaq = map;
        this.zap = str3;
    }

    /* synthetic */ GoogleSignInOptions(int i2, ArrayList arrayList, Account account, boolean z2, boolean z3, boolean z4, String str, String str2, Map map, String str3, zad zadVar) {
        this(3, arrayList, account, z2, z3, z4, str, str2, map, str3);
    }

    public static GoogleSignInOptions zab(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            hashSet.add(new Scope(jSONArray.getString(i2)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    public static Map zam(List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
                map.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.getType()), googleSignInOptionsExtensionParcelable);
            }
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0046 A[Catch: ClassCastException -> 0x008f, TryCatch #0 {ClassCastException -> 0x008f, blocks: (B:48:0x0004, B:50:0x000e, B:53:0x0017, B:55:0x0027, B:58:0x0034, B:60:0x0038, B:62:0x003e, B:64:0x0046, B:66:0x0050, B:68:0x0058, B:70:0x0060, B:72:0x0068, B:73:0x0073, B:76:0x0080), top: B:84:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0050 A[Catch: ClassCastException -> 0x008f, TryCatch #0 {ClassCastException -> 0x008f, blocks: (B:48:0x0004, B:50:0x000e, B:53:0x0017, B:55:0x0027, B:58:0x0034, B:60:0x0038, B:62:0x003e, B:64:0x0046, B:66:0x0050, B:68:0x0058, B:70:0x0060, B:72:0x0068, B:73:0x0073, B:76:0x0080), top: B:84:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0073 A[Catch: ClassCastException -> 0x008f, TryCatch #0 {ClassCastException -> 0x008f, blocks: (B:48:0x0004, B:50:0x000e, B:53:0x0017, B:55:0x0027, B:58:0x0034, B:60:0x0038, B:62:0x003e, B:64:0x0046, B:66:0x0050, B:68:0x0058, B:70:0x0060, B:72:0x0068, B:73:0x0073, B:76:0x0080), top: B:84:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 != 0) goto L4
            return r2
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L8f
            java.util.ArrayList r0 = r3.zao     // Catch: java.lang.ClassCastException -> L8f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.ClassCastException -> L8f
            if (r0 == 0) goto L8f
            java.util.ArrayList r0 = r4.zao     // Catch: java.lang.ClassCastException -> L8f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.ClassCastException -> L8f
            if (r0 != 0) goto L17
            goto L8f
        L17:
            java.util.ArrayList r0 = r3.zah     // Catch: java.lang.ClassCastException -> L8f
            int r1 = r0.size()     // Catch: java.lang.ClassCastException -> L8f
            java.util.ArrayList r0 = r4.getScopes()     // Catch: java.lang.ClassCastException -> L8f
            int r0 = r0.size()     // Catch: java.lang.ClassCastException -> L8f
            if (r1 != r0) goto L8f
            java.util.ArrayList r1 = r3.zah     // Catch: java.lang.ClassCastException -> L8f
            java.util.ArrayList r0 = r4.getScopes()     // Catch: java.lang.ClassCastException -> L8f
            boolean r0 = r1.containsAll(r0)     // Catch: java.lang.ClassCastException -> L8f
            if (r0 != 0) goto L34
            goto L8f
        L34:
            android.accounts.Account r1 = r3.zai     // Catch: java.lang.ClassCastException -> L8f
            if (r1 != 0) goto L80
            android.accounts.Account r0 = r4.getAccount()     // Catch: java.lang.ClassCastException -> L8f
            if (r0 != 0) goto L8f
        L3e:
            java.lang.String r0 = r3.zam     // Catch: java.lang.ClassCastException -> L8f
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.ClassCastException -> L8f
            if (r0 == 0) goto L73
            java.lang.String r0 = r4.getServerClientId()     // Catch: java.lang.ClassCastException -> L8f
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.ClassCastException -> L8f
            if (r0 == 0) goto L8f
        L50:
            boolean r1 = r3.zal     // Catch: java.lang.ClassCastException -> L8f
            boolean r0 = r4.isForceCodeForRefreshToken()     // Catch: java.lang.ClassCastException -> L8f
            if (r1 != r0) goto L8f
            boolean r1 = r3.zaj     // Catch: java.lang.ClassCastException -> L8f
            boolean r0 = r4.isIdTokenRequested()     // Catch: java.lang.ClassCastException -> L8f
            if (r1 != r0) goto L8f
            boolean r1 = r3.zak     // Catch: java.lang.ClassCastException -> L8f
            boolean r0 = r4.isServerAuthCodeRequested()     // Catch: java.lang.ClassCastException -> L8f
            if (r1 != r0) goto L8f
            java.lang.String r1 = r3.zap     // Catch: java.lang.ClassCastException -> L8f
            java.lang.String r0 = r4.getLogSessionId()     // Catch: java.lang.ClassCastException -> L8f
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch: java.lang.ClassCastException -> L8f
            goto L8b
        L73:
            java.lang.String r1 = r3.zam     // Catch: java.lang.ClassCastException -> L8f
            java.lang.String r0 = r4.getServerClientId()     // Catch: java.lang.ClassCastException -> L8f
            boolean r0 = r1.equals(r0)     // Catch: java.lang.ClassCastException -> L8f
            if (r0 != 0) goto L50
            goto L8f
        L80:
            android.accounts.Account r0 = r4.getAccount()     // Catch: java.lang.ClassCastException -> L8f
            boolean r0 = r1.equals(r0)     // Catch: java.lang.ClassCastException -> L8f
            if (r0 == 0) goto L8f
            goto L3e
        L8b:
            if (r0 == 0) goto L8f
            r0 = 1
            return r0
        L8f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public Account getAccount() {
        return this.zai;
    }

    public ArrayList<GoogleSignInOptionsExtensionParcelable> getExtensions() {
        return this.zao;
    }

    public String getLogSessionId() {
        return this.zap;
    }

    public Scope[] getScopeArray() {
        return (Scope[]) this.zah.toArray(new Scope[this.zah.size()]);
    }

    public ArrayList<Scope> getScopes() {
        return new ArrayList<>(this.zah);
    }

    public String getServerClientId() {
        return this.zam;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.zah;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((Scope) arrayList2.get(i2)).getScopeUri());
        }
        Collections.sort(arrayList);
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.addObject(arrayList);
        hashAccumulator.addObject(this.zai);
        hashAccumulator.addObject(this.zam);
        hashAccumulator.zaa(this.zal);
        hashAccumulator.zaa(this.zaj);
        hashAccumulator.zaa(this.zak);
        hashAccumulator.addObject(this.zap);
        return hashAccumulator.hash();
    }

    public boolean isForceCodeForRefreshToken() {
        return this.zal;
    }

    public boolean isIdTokenRequested() {
        return this.zaj;
    }

    public boolean isServerAuthCodeRequested() {
        return this.zak;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.zaf;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i3);
        SafeParcelWriter.writeTypedList(parcel, 2, getScopes(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getAccount(), i2, false);
        SafeParcelWriter.writeBoolean(parcel, 4, isIdTokenRequested());
        SafeParcelWriter.writeBoolean(parcel, 5, isServerAuthCodeRequested());
        SafeParcelWriter.writeBoolean(parcel, 6, isForceCodeForRefreshToken());
        SafeParcelWriter.writeString(parcel, 7, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 8, this.zan, false);
        SafeParcelWriter.writeTypedList(parcel, 9, getExtensions(), false);
        SafeParcelWriter.writeString(parcel, 10, getLogSessionId(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zaf() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.zah, zag);
            Iterator it = this.zah.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).getScopeUri());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.zai;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.zaj);
            jSONObject.put("forceCodeForRefreshToken", this.zal);
            jSONObject.put("serverAuthRequested", this.zak);
            if (!TextUtils.isEmpty(this.zam)) {
                jSONObject.put("serverClientId", this.zam);
            }
            if (!TextUtils.isEmpty(this.zan)) {
                jSONObject.put("hostedDomain", this.zan);
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }
}
