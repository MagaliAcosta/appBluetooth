package com.approbot.myapplication.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.approbot.myapplication.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}