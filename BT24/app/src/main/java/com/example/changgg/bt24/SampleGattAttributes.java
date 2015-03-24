/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.changgg.bt24;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";

    static {

        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information");
        attributes.put("00001803-0000-1000-8000-00805f9b34fb", "Link Loss");
        attributes.put("00001802-0000-1000-8000-00805f9b34fb", "Immediate Alert");
        attributes.put("00001804-0000-1000-8000-00805f9b34fb", "Tx Power");
        attributes.put("0000180f-0000-1000-8000-00805f9b34fb", "Battery Service");
        attributes.put("00002a19-0000-1000-8000-00805f9b34fb", "Battery Life");
        attributes.put("0000ffa0-0000-1000-8000-00805f9b34fb", "RealTag APIS");
        attributes.put("0000ffb0-0000-1000-8000-00805f9b34fb", "Pair Key");
        attributes.put("0000ffb1-0000-1000-8000-00805f9b34fb", "Major & Minor ID");
        attributes.put("0000ffb2-0000-1000-8000-00805f9b34fb", "iBeacon UUID");
        attributes.put("0000ffb3-0000-1000-8000-00805f9b34fb", "Advertising Interval");
        attributes.put("0000ffb4-0000-1000-8000-00805f9b34fb", "Device ID");
        attributes.put("0000ffb5-0000-1000-8000-00805f9b34fb", "Deployment mode");
        attributes.put("0000ffb6-0000-1000-8000-00805f9b34fb", "MPU6050 Sensor Data");
        attributes.put("0000ffb7-0000-1000-8000-00805f9b34fb", "BMP180 Sensor Data");
        attributes.put("0000ffb8-0000-1000-8000-00805f9b34fb", "Tx Power");

        // Sample Services.
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
