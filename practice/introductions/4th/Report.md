Practice Report for 1.4
------

実習のレポートを下記に記述してください

1.(実習)Android SDK 内の、下記の 2 つのディレクトリにあるコマンドを列挙してください。

####sdk/tools/

* android
* apkbuilder
* ddms
* dmtracedump
* draw9patch
* emulator
* emulator-arm
* emulator-mips
* emulator-x86
* emulator64-arm
* emulator64-mips
* emulator64-x86
* hprof-conv
* etc1tool
* hierarchyviewer
* jobb
* lint
* mksdcard
* monitor
* monkeyrunner
* sqlite3
* traceview
* uiautomatorviewer
* zipalign

#### sdk/platform-tools/

* aapt
* adb
* aidl
* dexdump
* dx
* fastboot
* llvm-rs-cc

2.(実習)上記のディレクトリにパスを通し、下記のコマンドを実行してください。

#### adb devices

    $ adb devices
    List of devices attached
    SSHEV073187 device

#### adb shell
    $ adb shell
    $

3.(実習)adb shellコマンドを使って、Android 内のファイルシステムにアクセスし、下記の項目を確認してください。

#### /data/data以下のディレクトリでlsコマンドを打っても、拒否されること

    $ adb shell
    $ ls /data/data/
    opendir failed, Permission denied 

#### /sdcard/Android/data以下のディレクトリの中身を自由に読むことができること

    $ ls /sdcard/Android/data
    com.google.android.apps.maps
    org.mozilla.firefox
    jp.mixi
    com.google.android.youtube
    com.deploygate
    ...

