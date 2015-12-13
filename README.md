# Plaid-network-error

Vector establishment vector diagram, with xml show no network prompt (with 
animation).This idea source from the awesome project [Plaid](https://github.com/nickbutcher/plaid) .

## Introduction
You can see the detail on my pages [JungleTian](http://jungletian.github.io/2015/12/09/%E4%BD%BF%E7%94%A8Vector%E6%A0%87%E7%AD%BE%E7%BB%98%E5%88%B6%E5%9B%BE%E7%89%87/)
. The core code is the ```xml <vector ...>``` tag.

## ScreenShots

<img src="/screenshot/plaidnonet.gif" alt="screenshot" title="screenshot" 
width="270" height="486" /> 
<img src="/screenshot/plaidnonet-1.png" alt="screenshot" title="screenshot" 
width="270" height="486" /> 
<img src="/screenshot/plaidnonet-2.png" alt="screenshot" title="screenshot" 
width="270" height="486" /> 

## Use
Gradle：
```gradle
    compile 'com.github.jungletian.plaidnonet:plaidnonet:1.0.0'
```

layout:
```xml
<com.github.jungletian.plaidnonet.Plaidnonet
  android:id="@+id/stub_no_connection"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  android:layout_centerInParent="true"
  android:layout_gravity="center"/>    
```
activity:
```java
findViewById(R.id.restart).setOnClickListener(new View.OnClickListener() {
  @Override
  public void onClick(View v) {
    ((Plaidnonet) findViewById(R.id.stub_no_connection)).start();
    }
  });
```

## SourceCode
drawable
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
        android:width="56dp"
        android:height="213dp"
        android:viewportWidth="56"
        android:viewportHeight="213">

    <path
        android:name="cloud"
        android:pathData="M45.15,14.0933333 C43.5633333,6.04333333 36.4933333,0 28,0 C21.2566667,0 15.4,3.82666667 12.4833333,9.42666667 C5.46,10.1733333 0,16.1233333 0,23.3333333 C0,31.0566667 6.27666667,37.3333333 14,37.3333333 L44.3333333,37.3333333 C50.7733333,37.3333333 56,32.1066667 56,25.6666667 C56,19.5066667 51.2166667,14.5133333 45.15,14.0933333 L45.15,14.0933333 Z"
        android:fillColor="#888888"/>

    <group
        android:name="connection">

        <clip-path
            android:name="connection_mask"
            android:pathData="@string/connection_line_mask_hidden" />

        <path
            android:strokeColor="#888888"
            android:pathData="M28,67 L28,75"
            android:strokeWidth="4"/>

        <path
            android:strokeColor="#888888"
            android:pathData="M28,79 L28,87"
            android:strokeWidth="4"/>

        <path
            android:strokeColor="#888888"
            android:pathData="M28,91 L28,99"
            android:strokeWidth="4"/>

        <path
            android:strokeColor="#888888"
            android:pathData="M28,103 L28,111"
            android:strokeWidth="4"/>

        <path
            android:strokeColor="#888888"
            android:pathData="M28,115 L28,123"
            android:strokeWidth="4"/>

        <path
            android:strokeColor="#888888"
            android:pathData="M28,127 L28,135"
            android:strokeWidth="4"/>

        <path
            android:strokeColor="#888888"
            android:pathData="M28,139 L28,147"
            android:strokeWidth="4"/>

        <path
            android:strokeColor="#888888"
            android:pathData="M28,151 L28,159"
            android:strokeWidth="4"/>

    </group>

    <group
        android:name="cross_group"
        android:pivotX="28"
        android:pivotY="58.65"
        android:scaleX="0"
        android:scaleY="0">

        <path
            android:name="cross"
            android:pathData="M27.6568542,58.6568542 L22,53 L27.6568542,58.6568542 L33.3137085,53 L27.6568542,58.6568542 Z M27.6568542,58.6568542 L33.3137085,64.3137085 L27.6568542,58.6568542 L22,64.3137085 L27.6568542,58.6568542 Z"
            android:strokeWidth="4"
            android:strokeColor="#888888"/>

    </group>

    <!--<path
        android:name="phone"
        android:pathData="M37.6666667,161 L19,161 C15.1266667,161 12,164.126667 12,168 L12,205.333333 C12,209.206667 15.1266667,212.333333 19,212.333333 L37.6666667,212.333333 C41.54,212.333333 44.6666667,209.206667 44.6666667,205.333333 L44.6666667,168 C44.6666667,164.126667 41.54,161 37.6666667,161 L37.6666667,161 Z M33,207.666667 L23.6666667,207.666667 L23.6666667,205.333333 L33,205.333333 L33,207.666667 L33,207.666667 Z M40.5833333,200.666667 L16.0833333,200.666667 L16.0833333,168 L40.5833333,168 L40.5833333,200.666667 L40.5833333,200.666667 Z"
        android:fillColor="#888888"/>-->

    <path
        android:name="phone"
        android:pathData="M37.6666667,161 L19,161 C15.1266667,161 12,164.126667 12,168 L12,205.333333 C12,209.206667 15.1266667,212.333333 19,212.333333 L37.6666667,212.333333 C41.54,212.333333 44.6666667,209.206667 44.6666667,205.333333 L44.6666667,168 C44.6666667,164.126667 41.54,161 37.6666667,161 L37.6666667,161 Z M40.5833333,200.666667 L16.0833333,200.666667 L16.0833333,168 L40.5833333,168 L40.5833333,200.666667 L40.5833333,200.666667 Z"
        android:fillColor="#888888"/>

    <path
        android:name="button"
        android:pathData="@string/phone_button"
        android:strokeWidth="4"
        android:strokeLineCap="round"
        android:strokeColor="@color/background_dark"/>

</vector>
```

## About me

tjsummery@hotmail.com

<img src="/screenshot/wechat.png" alt="screenshot" title="screenshot" 
width="150" height="150" /> 

