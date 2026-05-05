package com.incode.recogkitandroid;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class startCamera {
    private DataInputStream CameraConstants;
    private Map IncodeCamera;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private Map f3658e1;
    private Map getAvailableCameraInternals = new HashMap();

    public startCamera(InputStream inputStream, Map map, Map map2) {
        this.CameraConstants = new DataInputStream(inputStream);
        this.f3658e1 = map;
        this.IncodeCamera = map2;
    }

    private Object ProcessCameraProviderExtensionsKt(int i2, Class cls) throws IOException {
        Object utf;
        int i3 = 0;
        if (Map.class.isAssignableFrom(cls)) {
            Map map = (Map) cls.newInstance();
            this.getAvailableCameraInternals.put(Integer.valueOf(i2), map);
            int i4 = this.CameraConstants.readInt();
            while (i3 < i4) {
                map.put(getContext(), getContext());
                i3++;
            }
            return map;
        }
        if (List.class.isAssignableFrom(cls)) {
            List list = (List) cls.newInstance();
            this.getAvailableCameraInternals.put(Integer.valueOf(i2), list);
            int i5 = this.CameraConstants.readInt();
            while (i3 < i5) {
                list.add(getContext());
                i3++;
            }
            return list;
        }
        if (Set.class.isAssignableFrom(cls)) {
            Set set = (Set) cls.newInstance();
            this.getAvailableCameraInternals.put(Integer.valueOf(i2), set);
            int i6 = this.CameraConstants.readInt();
            while (i3 < i6) {
                set.add(getContext());
                i3++;
            }
            return set;
        }
        if (cls == Boolean.class) {
            utf = Boolean.valueOf(CameraConstants());
        } else if (cls == Byte.class) {
            utf = Byte.valueOf(ProcessCameraProviderExtensionsKt());
        } else if (cls == Character.class) {
            utf = Character.valueOf(IncodeCamera());
        } else if (cls == Short.class) {
            utf = Short.valueOf(e1());
        } else if (cls == Integer.class) {
            utf = Integer.valueOf(getAvailableCameraInternals());
        } else if (cls == Long.class) {
            utf = Long.valueOf(getFrameAnalyzerWrapper());
        } else if (cls == Float.class) {
            utf = Float.valueOf(setConfig());
        } else if (cls == Double.class) {
            utf = Double.valueOf(getConfig());
        } else if (cls == BigDecimal.class) {
            utf = new BigDecimal(this.CameraConstants.readUTF());
        } else if (cls == BigInteger.class) {
            utf = new BigInteger(this.CameraConstants.readUTF());
        } else {
            if (cls != String.class) {
                throw new IllegalArgumentException("Unsupported class:".concat(String.valueOf(cls)));
            }
            utf = this.CameraConstants.readUTF();
        }
        this.getAvailableCameraInternals.put(Integer.valueOf(i2), utf);
        return utf;
    }

    public boolean CameraConstants() {
        return this.CameraConstants.readBoolean();
    }

    public char IncodeCamera() {
        return this.CameraConstants.readChar();
    }

    public byte ProcessCameraProviderExtensionsKt() {
        return this.CameraConstants.readByte();
    }

    public Object e1(Class cls) throws IOException {
        Object context;
        Class<?> componentType = cls.getComponentType();
        int i2 = this.CameraConstants.readInt();
        if (i2 == -1) {
            return null;
        }
        Object objNewInstance = Array.newInstance(componentType, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            if (componentType.isArray()) {
                context = e1(componentType);
            } else {
                if (componentType == Boolean.TYPE) {
                    Array.setBoolean(objNewInstance, i3, CameraConstants());
                } else if (componentType == Byte.TYPE) {
                    Array.setByte(objNewInstance, i3, ProcessCameraProviderExtensionsKt());
                } else if (componentType == Character.TYPE) {
                    Array.setChar(objNewInstance, i3, IncodeCamera());
                } else if (componentType == Short.TYPE) {
                    Array.setShort(objNewInstance, i3, e1());
                } else if (componentType == Integer.TYPE) {
                    Array.setInt(objNewInstance, i3, getAvailableCameraInternals());
                } else if (componentType == Long.TYPE) {
                    Array.setLong(objNewInstance, i3, getFrameAnalyzerWrapper());
                } else if (componentType == Float.TYPE) {
                    Array.setFloat(objNewInstance, i3, setConfig());
                } else if (componentType == Double.TYPE) {
                    Array.setDouble(objNewInstance, i3, getConfig());
                } else {
                    context = getContext();
                }
            }
            Array.set(objNewInstance, i3, context);
        }
        return objNewInstance;
    }

    public short e1() {
        return this.CameraConstants.readShort();
    }

    public int getAvailableCameraInternals() {
        return this.CameraConstants.readInt();
    }

    public double getConfig() {
        return this.CameraConstants.readDouble();
    }

    public Object getContext() throws IOException {
        try {
            int i2 = this.CameraConstants.readInt();
            Object obj = this.getAvailableCameraInternals.get(Integer.valueOf(i2));
            if (i2 == 0 || obj != null) {
                return obj;
            }
            int i3 = this.CameraConstants.readInt();
            Class cls = (Class) this.f3658e1.get(Integer.valueOf(i3));
            if (cls == null) {
                return ProcessCameraProviderExtensionsKt(i2, (Class) this.IncodeCamera.get(Integer.valueOf(i3)));
            }
            Object objNewInstance = cls.newInstance();
            this.getAvailableCameraInternals.put(Integer.valueOf(i2), objNewInstance);
            ((isVideoLivenessRecordingSupported) objNewInstance).CameraConstants(this);
            return objNewInstance;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public long getFrameAnalyzerWrapper() {
        return this.CameraConstants.readLong();
    }

    public float setConfig() {
        return this.CameraConstants.readFloat();
    }
}
