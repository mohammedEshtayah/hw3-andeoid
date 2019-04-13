<?xml version="1.0" encoding="UTF-8"?>
<root>
  <item name="android.net.ConnectivityManager android.net.LinkProperties getLinkProperties(android.net.Network)">
    <annotation name="androidx.annotation.RequiresPermission">
      <val name="value" val="&quot;android.permission.ACCESS_NETWORK_STATE&quot;" />
    </annotation>
  </item>
  <item name="android.net.ConnectivityManager android.net.Network getActiveNetwork()">
    <annotation name="androidx.annotation.RequiresPermission">
      <val name="value" val="&quot;android.permission.ACCESS_NETWORK_STATE&quot;" />
    </annotation>
  </item>
  <item name="android.net.ConnectivityManager android.net.NetworkCapabilities getNetworkCapabilities(android.net.Network)">
    <annotation name="androidx.annotation.RequiresPermission">
      <val name="value" val="&quot;android.permission.ACCESS_NETWORK_STATE&quot;" />
    </annotation>
  </item>
  <item name="android.net.ConnectivityManager android.net.NetworkInfo getActiveNetworkInfo()">
    <annotation name="androidx.annotation.RequiresPermission">
      <val name="value" val="&quot;android.permission.ACCESS_NETWORK_STATE&quot;" />
    </annotation>
  </item>
  <item name="android.net.ConnectivityManager android.net.NetworkInfo getNetworkInfo(android.net.Network)">
    <annotation name="androidx.annotation.RequiresPermission">
      <val name="value" val="&quot;android.permission.ACCESS_NETWORK_STATE&quot;" />
    </annotation>
  </item>
  <item name="android.net.ConnectivityManager android.net.NetworkInfo getNetworkInfo(int)">
    <annotation name="androidx.annotation.RequiresPermission">
      <val name="value" val="&quot;android.permission.ACCESS_NETWORK_STATE&quot;" />
    </annotation>
  </item>
  <item name="android.net.ConnectivityManager android.net.NetworkInfo[] getAllNetworkInfo()">
    <annotation name="androidx.annotation.RequiresPermission">
      <val name="value" val="&quot;android.permission.ACCESS_NETWORK_STATE&quot;" />
    </annotation>
  </item>
  <item name="android.net.ConnectivityManager android.net.Network[] getAllNetworks()">
    <annotation name="androidx.annotation.RequiresPermission">
      <val name="value" val="&quot;android.permission.ACCESS_NETWORK_STATE&quot;" />
    </annotation>
  </item>
  <item name="android.net.ConnectivityManager boolean isActiveNetworkMetered()">
    <annotation name="androidx.annotation.RequiresPermission">
      <val name="value" val="&quot;android.permission.ACCESS_NETWORK_STATE&quot;" />
    </annotation>
  </item>
  <item name="android.net.ConnectivityManager int getMultipathPreference(android.net.Network)">
    <annotation name="androidx.annotation.RequiresPermission">
      <val name="value" val="&quot;android.permission.ACCESS_NETWORK_STATE&quot;" />
    </annotation>
    <annotation name="androidx.annotation.IntDef">
      <val name="flag" val="true" />
      <val name="value" val="{android.net.ConnectivityManager.MULTIPATH_PREFERENCE_HANDOVER, android.net.ConnectivityManager.MULTIPATH_PREFERENCE_RELIABILITY, android.net.ConnectivityManager.MULTIPATH_PREFERENCE_PERFORMANCE}" />
    </annotation>
  </item>
  <item name="android.net.ConnectivityManager int getNetworkPreference()">
    <annotation name="androidx.annotation.RequiresPermission">
      <val name="value" val="&quot;android.permission.ACCESS_NETWORK_STATE&quot;" />
    </annotation>
  </item>
  <item name="android.net.ConnectivityManager int getRestrictBackgroundStatus()">
    <annotation name="androidx.annotation.IntDef">
      <val name="flag" val="false" />
      <val name="value" val="{android.net.ConnectivityManager.RESTRICT_BACKGROUND_STATUS_DISABLED, android.net.ConnectivityManager.RESTRICT_BACKGROUND_STATUS_WHITELISTED, android.net.ConnectivityManager.RESTRICT_BACKGROUND_STATUS_ENABLED}" />
    </annotation>
  </item>
  <item name="android.net.ConnectivityManager void registerDefaultNetworkCallback(android.net.ConnectivityManager.NetworkCallback)">
    <annotation name="androidx.annotation.RequiresPermission">
      <val name="value" val="&quot;android.permission.ACCESS_NETWORK_STATE&quot;" />
    </annotation>
  </item>
  <item name="android.net.ConnectivityManager void registerDefaultNetworkCallback(android.net.ConnectivityManager.NetworkCallback, android.os.Handler)">
    <annotation name="androidx.annotation.RequiresPermission">
      <val name="value" val="&quot;android.permission.ACCESS_NETWORK_STATE&quot;" />
    </annotation>
  </item>
  <item name="android.net.ConnectivityManager void registerNetworkCallback(android.net.NetworkRequest, android.app.PendingIntent)">
    <annotation name="androidx.annotation.RequiresPermission">
      <val name="value" val="&quot;android.permission.ACCESS_NETWORK_STATE&quot;" />
    </annotation>
  </item>
  <item name="android.net.ConnectivityManager void registerNetworkCallback(android.net.NetworkRequest, android.net.ConnectivityManager.NetworkCallback)">
    <annotation name="androidx.annotation.RequiresPermission">
      <val name="value" val="&quot;android.permission.ACCESS_NETWORK_STATE&quot;" />
    </annotation>
  </item>
  <item name="android.net.ConnectivityManager void registerNetworkCallback(android.net.NetworkRequest, android.net.ConnectivityManager.NetworkCallback, android.os.Handler)">
    <annotation name="androidx.ann