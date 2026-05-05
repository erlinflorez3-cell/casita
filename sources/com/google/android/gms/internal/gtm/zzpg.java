package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.dynatrace.android.agent.AdkSettings;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.protocol.Device;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public final class zzpg extends zzjy {
    private static final String zza = zza.UNIVERSAL_ANALYTICS.toString();
    private static final List zzb = Arrays.asList(ProductAction.ACTION_DETAIL, ProductAction.ACTION_CHECKOUT, ProductAction.ACTION_CHECKOUT_OPTION, "click", ProductAction.ACTION_ADD, ProductAction.ACTION_REMOVE, "purchase", "refund");
    private static final Pattern zzc = Pattern.compile("dimension(\\d+)");
    private static final Pattern zzd = Pattern.compile("metric(\\d+)");
    private static final zzsx zze = zzsx.zzi("", AdkSettings.PLATFORM_TYPE_MOBILE, Constants.CASEFIRST_FALSE);
    private static final zzsw zzf = zzsw.zzc("transactionId", "&ti", "transactionAffiliation", "&ta", "transactionTax", "&tt", "transactionShipping", "&ts", "transactionTotal", "&tr", "transactionCurrency", "&cu");
    private static final zzsw zzg = zzsw.zzc("name", "&in", "sku", "&ic", "category", "&iv", FirebaseAnalytics.Param.PRICE, "&ip", "quantity", "&iq", FirebaseAnalytics.Param.CURRENCY, "&cu");
    private final zzjs zzh;
    private final zzib zzi;
    private Map zzj;

    public zzpg(Context context, zzib zzibVar) {
        zzjs zzjsVar = new zzjs(context);
        this.zzi = zzibVar;
        this.zzh = zzjsVar;
    }

    private static final Map zzb(zzqz zzqzVar) {
        Preconditions.checkNotNull(zzqzVar);
        Preconditions.checkArgument(zzqzVar instanceof zzrh);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zzrl.zze(zzqzVar);
        Object objZzg = zzrl.zzg(zzqzVar);
        Preconditions.checkState(objZzg instanceof Map);
        for (Map.Entry entry : ((Map) objZzg).entrySet()) {
            linkedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    private static final Double zzc(Object obj) {
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj);
            } catch (NumberFormatException e2) {
                throw new RuntimeException("Cannot convert the object to Double: ".concat(String.valueOf(e2.getMessage())));
            }
        }
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (obj instanceof Double) {
            return (Double) obj;
        }
        throw new RuntimeException("Cannot convert the object to Double: ".concat(String.valueOf(obj.toString())));
    }

    private static final Integer zze(Object obj) {
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj);
            } catch (NumberFormatException e2) {
                throw new RuntimeException("Cannot convert the object to Integer: ".concat(String.valueOf(e2.getMessage())));
            }
        }
        if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        throw new RuntimeException("Cannot convert the object to Integer: ".concat(String.valueOf(obj.toString())));
    }

    private static final Map zzf(zzqz zzqzVar) {
        Map mapZzb = zzb(zzqzVar);
        String str = (String) mapZzb.get("&aip");
        if (str != null && zze.contains(str.toLowerCase())) {
            mapZzb.remove("&aip");
        }
        return mapZzb;
    }

    private static final Product zzg(Map map) {
        Product product = new Product();
        Object obj = map.get("id");
        if (obj != null) {
            product.setId(obj.toString());
        }
        Object obj2 = map.get("name");
        if (obj2 != null) {
            product.setName(obj2.toString());
        }
        Object obj3 = map.get(Device.JsonKeys.BRAND);
        if (obj3 != null) {
            product.setBrand(obj3.toString());
        }
        Object obj4 = map.get("category");
        if (obj4 != null) {
            product.setCategory(obj4.toString());
        }
        Object obj5 = map.get(Constants.SENSITIVITY_VARIANT);
        if (obj5 != null) {
            product.setVariant(obj5.toString());
        }
        Object obj6 = map.get(FirebaseAnalytics.Param.COUPON);
        if (obj6 != null) {
            product.setCouponCode(obj6.toString());
        }
        Object obj7 = map.get(ViewProps.POSITION);
        if (obj7 != null) {
            product.setPosition(zze(obj7).intValue());
        }
        Object obj8 = map.get(FirebaseAnalytics.Param.PRICE);
        if (obj8 != null) {
            product.setPrice(zzc(obj8).doubleValue());
        }
        Object obj9 = map.get("quantity");
        if (obj9 != null) {
            product.setQuantity(zze(obj9).intValue());
        }
        for (String str : map.keySet()) {
            Matcher matcher = zzc.matcher(str);
            if (matcher.matches()) {
                try {
                    product.setCustomDimension(Integer.parseInt(matcher.group(1)), String.valueOf(map.get(str)));
                } catch (NumberFormatException unused) {
                    zzho.zze("illegal number in custom dimension value: ".concat(String.valueOf(str)));
                }
            } else {
                Matcher matcher2 = zzd.matcher(str);
                if (matcher2.matches()) {
                    try {
                        product.setCustomMetric(Integer.parseInt(matcher2.group(1)), zze(map.get(str)).intValue());
                    } catch (NumberFormatException unused2) {
                        zzho.zze("illegal number in custom metric value: ".concat(String.valueOf(str)));
                    }
                }
            }
        }
        return product;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01ff, code lost:
    
        r5 = (java.util.Map) r11.get(r8);
        r0 = (java.util.List) r5.get("products");
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x020d, code lost:
    
        if (r0 == null) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x020f, code lost:
    
        r9 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0217, code lost:
    
        if (r9.hasNext() == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x021f, code lost:
    
        r3.addProduct(zzg((java.util.Map) r9.next()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0227, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0228, code lost:
    
        com.google.android.gms.internal.gtm.zzho.zza("Failed to extract a product from event data. ".concat(java.lang.String.valueOf(r0.getMessage())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x023c, code lost:
    
        if (r5.containsKey("actionField") == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x023e, code lost:
    
        r5 = (java.util.Map) r5.get("actionField");
        r4 = new com.google.android.gms.analytics.ecommerce.ProductAction(r8);
        r0 = r5.get("id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x024d, code lost:
    
        if (r0 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x024f, code lost:
    
        r4.setTransactionId(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0256, code lost:
    
        r0 = r5.get(com.google.firebase.analytics.FirebaseAnalytics.Param.AFFILIATION);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x025c, code lost:
    
        if (r0 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x025e, code lost:
    
        r4.setTransactionAffiliation(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0265, code lost:
    
        r0 = r5.get(com.google.firebase.analytics.FirebaseAnalytics.Param.COUPON);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x026b, code lost:
    
        if (r0 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x026d, code lost:
    
        r4.setTransactionCouponCode(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0274, code lost:
    
        r0 = r5.get("list");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0278, code lost:
    
        if (r0 == null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x027a, code lost:
    
        r4.setProductActionList(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0281, code lost:
    
        r0 = r5.get("option");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0287, code lost:
    
        if (r0 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0289, code lost:
    
        r4.setCheckoutOptions(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0290, code lost:
    
        r0 = r5.get("revenue");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0296, code lost:
    
        if (r0 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0298, code lost:
    
        r4.setTransactionRevenue(zzc(r0).doubleValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02a3, code lost:
    
        r0 = r5.get(com.google.firebase.analytics.FirebaseAnalytics.Param.TAX);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02a9, code lost:
    
        if (r0 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02ab, code lost:
    
        r4.setTransactionTax(zzc(r0).doubleValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02b6, code lost:
    
        r0 = r5.get(com.google.firebase.analytics.FirebaseAnalytics.Param.SHIPPING);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02bc, code lost:
    
        if (r0 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02be, code lost:
    
        r4.setTransactionShipping(zzc(r0).doubleValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02c9, code lost:
    
        r0 = r5.get("step");
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02cf, code lost:
    
        if (r0 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02d1, code lost:
    
        r4.setCheckoutStep(zze(r0).intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02dc, code lost:
    
        r3.setProductAction(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02e0, code lost:
    
        r4 = new com.google.android.gms.analytics.ecommerce.ProductAction(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02e6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02e7, code lost:
    
        com.google.android.gms.internal.gtm.zzho.zza("Failed to extract a product action from event data. ".concat(java.lang.String.valueOf(r0.getMessage())));
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f3 A[Catch: all -> 0x043d, TryCatch #5 {all -> 0x043d, blocks: (B:7:0x0021, B:9:0x0035, B:13:0x0044, B:17:0x004f, B:21:0x0057, B:25:0x005f, B:29:0x006a, B:33:0x0075, B:39:0x0085, B:40:0x0087, B:42:0x0092, B:47:0x009a, B:49:0x00a1, B:54:0x00a9, B:56:0x00b0, B:61:0x00b8, B:64:0x00d2, B:66:0x00e4, B:67:0x00ec, B:69:0x00f0, B:71:0x00fa, B:74:0x010d, B:75:0x0110, B:78:0x011e, B:79:0x0124, B:81:0x012a, B:82:0x0130, B:84:0x013f, B:85:0x014f, B:88:0x0157, B:95:0x017c, B:96:0x0180, B:98:0x0186, B:99:0x018c, B:101:0x0199, B:102:0x019c, B:104:0x01a4, B:105:0x01a7, B:107:0x01b1, B:108:0x01b4, B:110:0x01be, B:111:0x01c1, B:113:0x01c6, B:114:0x01d8, B:118:0x01e2, B:166:0x02f9, B:119:0x01e7, B:120:0x01ed, B:122:0x01f3, B:124:0x01ff, B:126:0x020f, B:127:0x0213, B:129:0x0219, B:130:0x021f, B:132:0x0228, B:133:0x0238, B:135:0x023e, B:137:0x024f, B:138:0x0256, B:140:0x025e, B:141:0x0265, B:143:0x026d, B:144:0x0274, B:146:0x027a, B:147:0x0281, B:149:0x0289, B:150:0x0290, B:152:0x0298, B:153:0x02a3, B:155:0x02ab, B:156:0x02b6, B:158:0x02be, B:159:0x02c9, B:161:0x02d1, B:162:0x02dc, B:163:0x02e0, B:165:0x02e7, B:89:0x0164, B:91:0x016a, B:167:0x02fe, B:72:0x0103, B:168:0x0307, B:170:0x030d, B:171:0x0316, B:173:0x031c, B:175:0x0328, B:176:0x032f, B:177:0x0334, B:179:0x0343, B:180:0x0345, B:181:0x034d, B:183:0x0353, B:185:0x0367, B:187:0x0376, B:202:0x03a8, B:203:0x03ac, B:205:0x03b2, B:207:0x03be, B:208:0x03c4, B:210:0x03d8, B:211:0x03da, B:212:0x03e2, B:214:0x03e8, B:216:0x03f8, B:218:0x040b, B:217:0x0406, B:219:0x040f, B:220:0x0413, B:222:0x0419, B:190:0x0384, B:192:0x0388, B:193:0x038e, B:195:0x0394, B:198:0x039d, B:199:0x03a4, B:223:0x0423, B:224:0x042a, B:186:0x0371, B:226:0x042c, B:227:0x0432, B:38:0x007f, B:34:0x0078, B:30:0x006d, B:26:0x0062, B:22:0x005a, B:18:0x0052, B:14:0x0047, B:10:0x0038), top: B:243:0x0021, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0419 A[Catch: IllegalArgumentException -> 0x042b, all -> 0x043d, LOOP:7: B:220:0x0413->B:222:0x0419, LOOP_END, TryCatch #4 {IllegalArgumentException -> 0x042b, blocks: (B:177:0x0334, B:179:0x0343, B:180:0x0345, B:181:0x034d, B:183:0x0353, B:185:0x0367, B:187:0x0376, B:202:0x03a8, B:203:0x03ac, B:205:0x03b2, B:207:0x03be, B:208:0x03c4, B:210:0x03d8, B:211:0x03da, B:212:0x03e2, B:214:0x03e8, B:216:0x03f8, B:218:0x040b, B:217:0x0406, B:219:0x040f, B:220:0x0413, B:222:0x0419, B:190:0x0384, B:192:0x0388, B:193:0x038e, B:195:0x0394, B:198:0x039d, B:199:0x03a4, B:223:0x0423, B:224:0x042a, B:186:0x0371), top: B:242:0x0334, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02fe A[EDGE_INSN: B:253:0x02fe->B:167:0x02fe BREAK  A[LOOP:2: B:120:0x01ed->B:255:?], SYNTHETIC] */
    @Override // com.google.android.gms.internal.gtm.zzjy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.google.android.gms.internal.gtm.zzqz zza(com.google.android.gms.internal.gtm.zzie r19, com.google.android.gms.internal.gtm.zzqz... r20) {
        /*
            Method dump skipped, instruction units count: 1090
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzpg.zza(com.google.android.gms.internal.gtm.zzie, com.google.android.gms.internal.gtm.zzqz[]):com.google.android.gms.internal.gtm.zzqz");
    }
}
