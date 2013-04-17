Assignment Report for 1.4
------

以下に、課題の回答を記入してください。

Android の基礎知識
======

4. `adb`コマンドを使って、下記の項目を実行してください（課題のファイルに、実行したコマンドを記録しておいてください）。

#### 端末のSD カード領域に、ローカルにあるファイルを転送する
    $ cat > hoge.txt
    hoge
    fuga
    piyo
    $ adb push hoge.txt /sdcard/  
    0 KB/s (15 bytes in 0.376s)  
    $  

#### 端末のSD カード領域から、ローカルにファイルを転送する
    $ adb pull /sdcard/hoge.txt ./fuga.txt
    7 KB/s (15 bytes in 0.001s)
    $ cat fuga.txt
    hoge
    fuga
    piyo
    $

#### 課題用サンプルプロジェクトの apk ファイルをコマンド経由で端末にインストールする
    $ adb install ./apk/ProjectIntroduction.apk
    1010 KB/s (196080 bytes in 0.189s)
        pkg: /data/local/tmp/ProjectIntroduction.apk
    Success
    $

#### インストールしたアプリを、コマンド経由でアンインストールする
    $ adb uninstall jp.mixi.introduction
    Success
    $

#### 端末のSD カード領域から、ローカルにファイルを転送する
    $ adb pull /sdcard/hoge.txt ./fuga.txt
    7 KB/s (15 bytes in 0.001s)
    $ cat fuga.txt
    hoge
    fuga
    piyo
    $

#### 課題用サンプルプロジェクトの apk ファイルをコマンド経由で端末にインストールする
    $ adb install ./apk/ProjectIntroduction.apk
    1010 KB/s (196080 bytes in 0.189s)
        pkg: /data/local/tmp/ProjectIntroduction.apk
    Success
    $

#### インストールしたアプリを、コマンド経由でアンインストールする
    $ adb uninstall jp.mixi.introduction
    Success
    $
