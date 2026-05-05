package com.google.zxing.integration.android;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.zxing.client.android.Intents;
import com.journeyapps.barcodescanner.CaptureActivity;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import yg.CX;

/* JADX INFO: loaded from: classes7.dex */
public class IntentIntegrator {
    public static final String CODE_128 = "CODE_128";
    public static final String CODE_39 = "CODE_39";
    public static final String CODE_93 = "CODE_93";
    public static final String DATA_MATRIX = "DATA_MATRIX";
    public static final String EAN_13 = "EAN_13";
    public static final String EAN_8 = "EAN_8";
    public static final String ITF = "ITF";
    public static final String PDF_417 = "PDF_417";
    public static final String QR_CODE = "QR_CODE";
    public static final int REQUEST_CODE = 49374;
    public static final String RSS_14 = "RSS_14";
    public static final String RSS_EXPANDED = "RSS_EXPANDED";
    private static final String TAG = "IntentIntegrator";
    public static final String UPC_A = "UPC_A";
    public static final String UPC_E = "UPC_E";
    private final Activity activity;
    private Class<?> captureActivity;
    private Collection<String> desiredBarcodeFormats;
    private Fragment fragment;
    private final Map<String, Object> moreExtras = new HashMap(3);
    private int requestCode = REQUEST_CODE;
    private androidx.fragment.app.Fragment supportFragment;
    public static final Collection<String> PRODUCT_CODE_TYPES = list("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14");
    public static final Collection<String> ONE_D_CODE_TYPES = list("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14", "CODE_39", "CODE_93", "CODE_128", "ITF", "RSS_14", "RSS_EXPANDED");
    public static final Collection<String> ALL_CODE_TYPES = null;

    public IntentIntegrator(Activity activity) {
        this.activity = activity;
    }

    private void attachMoreExtras(Intent intent) {
        for (Map.Entry<String, Object> entry : this.moreExtras.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                intent.putExtra(key, (Integer) value);
            } else if (value instanceof Long) {
                intent.putExtra(key, (Long) value);
            } else if (value instanceof Boolean) {
                intent.putExtra(key, (Boolean) value);
            } else if (value instanceof Double) {
                intent.putExtra(key, (Double) value);
            } else if (value instanceof Float) {
                intent.putExtra(key, (Float) value);
            } else if (value instanceof Bundle) {
                intent.putExtra(key, (Bundle) value);
            } else if (value instanceof int[]) {
                intent.putExtra(key, (int[]) value);
            } else if (value instanceof long[]) {
                intent.putExtra(key, (long[]) value);
            } else if (value instanceof boolean[]) {
                intent.putExtra(key, (boolean[]) value);
            } else if (value instanceof double[]) {
                intent.putExtra(key, (double[]) value);
            } else if (value instanceof float[]) {
                intent.putExtra(key, (float[]) value);
            } else if (value instanceof String[]) {
                intent.putExtra(key, (String[]) value);
            } else {
                intent.putExtra(key, value.toString());
            }
        }
    }

    public static IntentIntegrator forFragment(Fragment fragment) {
        IntentIntegrator intentIntegrator = new IntentIntegrator(fragment.getActivity());
        intentIntegrator.fragment = fragment;
        return intentIntegrator;
    }

    public static IntentIntegrator forSupportFragment(androidx.fragment.app.Fragment fragment) {
        IntentIntegrator intentIntegrator = new IntentIntegrator(fragment.getActivity());
        intentIntegrator.supportFragment = fragment;
        return intentIntegrator;
    }

    private static List<String> list(String... strArr) {
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    public static IntentResult parseActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 49374) {
            return parseActivityResult(i3, intent);
        }
        return null;
    }

    public static IntentResult parseActivityResult(int i2, Intent intent) {
        if (i2 != -1) {
            return new IntentResult(intent);
        }
        String stringExtra = intent.getStringExtra(Intents.Scan.RESULT);
        String stringExtra2 = intent.getStringExtra(Intents.Scan.RESULT_FORMAT);
        byte[] byteArrayExtra = intent.getByteArrayExtra(Intents.Scan.RESULT_BYTES);
        int intExtra = intent.getIntExtra(Intents.Scan.RESULT_ORIENTATION, Integer.MIN_VALUE);
        return new IntentResult(stringExtra, stringExtra2, byteArrayExtra, intExtra == Integer.MIN_VALUE ? null : Integer.valueOf(intExtra), intent.getStringExtra(Intents.Scan.RESULT_ERROR_CORRECTION_LEVEL), intent.getStringExtra(Intents.Scan.RESULT_BARCODE_IMAGE_PATH), intent);
    }

    public final IntentIntegrator addExtra(String str, Object obj) {
        this.moreExtras.put(str, obj);
        return this;
    }

    public Intent createScanIntent() {
        Intent intent = new Intent(this.activity, getCaptureActivity());
        intent.setAction(Intents.Scan.ACTION);
        if (this.desiredBarcodeFormats != null) {
            StringBuilder sb = new StringBuilder();
            for (String str : this.desiredBarcodeFormats) {
                if (sb.length() > 0) {
                    sb.append(AbstractJsonLexerKt.COMMA);
                }
                sb.append(str);
            }
            intent.putExtra(Intents.Scan.FORMATS, sb.toString());
        }
        intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        intent.addFlags(524288);
        attachMoreExtras(intent);
        return intent;
    }

    public Class<?> getCaptureActivity() {
        if (this.captureActivity == null) {
            this.captureActivity = getDefaultCaptureActivity();
        }
        return this.captureActivity;
    }

    protected Class<?> getDefaultCaptureActivity() {
        return CaptureActivity.class;
    }

    public Map<String, ?> getMoreExtras() {
        return this.moreExtras;
    }

    public final void initiateScan() throws Exception {
        Intent intentCreateScanIntent = createScanIntent();
        int i2 = this.requestCode;
        CX.ud();
        startActivityForResult(intentCreateScanIntent, i2);
    }

    public final void initiateScan(Collection<String> collection) throws Exception {
        setDesiredBarcodeFormats(collection);
        initiateScan();
    }

    public IntentIntegrator setBarcodeImageEnabled(boolean z2) {
        addExtra(Intents.Scan.BARCODE_IMAGE_ENABLED, Boolean.valueOf(z2));
        return this;
    }

    public IntentIntegrator setBeepEnabled(boolean z2) {
        addExtra(Intents.Scan.BEEP_ENABLED, Boolean.valueOf(z2));
        return this;
    }

    public IntentIntegrator setCameraId(int i2) {
        if (i2 >= 0) {
            addExtra(Intents.Scan.CAMERA_ID, Integer.valueOf(i2));
        }
        return this;
    }

    public IntentIntegrator setCaptureActivity(Class<?> cls) {
        this.captureActivity = cls;
        return this;
    }

    public IntentIntegrator setDesiredBarcodeFormats(Collection<String> collection) {
        this.desiredBarcodeFormats = collection;
        return this;
    }

    public IntentIntegrator setDesiredBarcodeFormats(String... strArr) {
        this.desiredBarcodeFormats = Arrays.asList(strArr);
        return this;
    }

    public IntentIntegrator setOrientationLocked(boolean z2) {
        addExtra(Intents.Scan.ORIENTATION_LOCKED, Boolean.valueOf(z2));
        return this;
    }

    public final IntentIntegrator setPrompt(String str) {
        if (str != null) {
            addExtra(Intents.Scan.PROMPT_MESSAGE, str);
        }
        return this;
    }

    public IntentIntegrator setRequestCode(int i2) {
        if (i2 <= 0 || i2 > 65535) {
            throw new IllegalArgumentException("requestCode out of range");
        }
        this.requestCode = i2;
        return this;
    }

    public IntentIntegrator setTimeout(long j2) {
        addExtra("TIMEOUT", Long.valueOf(j2));
        return this;
    }

    public IntentIntegrator setTorchEnabled(boolean z2) {
        addExtra(Intents.Scan.TORCH_ENABLED, Boolean.valueOf(z2));
        return this;
    }

    protected void startActivity(Intent intent) throws Exception {
        Fragment fragment = this.fragment;
        if (fragment != null) {
            CX.ud();
            fragment.startActivity(intent);
            return;
        }
        androidx.fragment.app.Fragment fragment2 = this.supportFragment;
        if (fragment2 != null) {
            CX.ud();
            fragment2.startActivity(intent);
        } else {
            Activity activity = this.activity;
            CX.ud();
            activity.startActivity(intent);
        }
    }

    protected void startActivityForResult(Intent intent, int i2) throws Exception {
        Fragment fragment = this.fragment;
        if (fragment != null) {
            CX.ud();
            fragment.startActivityForResult(intent, i2);
            return;
        }
        androidx.fragment.app.Fragment fragment2 = this.supportFragment;
        if (fragment2 != null) {
            CX.ud();
            fragment2.startActivityForResult(intent, i2);
        } else {
            Activity activity = this.activity;
            CX.ud();
            activity.startActivityForResult(intent, i2);
        }
    }
}
