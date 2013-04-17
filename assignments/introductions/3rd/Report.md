Assignment Report for 1.3
------

以下に、課題の回答を記入してください。

署名済みアプリの作成
======

3.作成した apk ファイルの中にあるファイル・ディレクトリを列挙してください。

* res/layout/activity_main.xml
* res/menu/main.xml
* AndroidManifest.xml
* resources.arsc
* res/drawable-hdpi/ic_launcher.png
* res/drawable-mdpi/ic_launcher.png
* res/drawable-xhdpi/ic_launcher.png
* res/drawable-xxhdpi/ic_launcher.png
* classes.dex
* META-INF/MANIFEST.MF
* META-INF/CERT.SF
* META-INF/CERT.DSA

4.上記で列挙したファイル・ディレクトリについて、どのような役割を持っているか説明してください。

以下引用
>META-INF/ディレクトリですが、パッケージに署名をしている場合にこのディレクトリが作成されて、署名に関係するファイルが入っています。res/ディレクトリ内のファイルとresources.arscは、アプリケーションで使用している画像やレイアウト、文字列などのリソースファイルがバイナリ形式になったものです。
AndroidManifest.xmlは、実装を行っているときに編集していたAndroidManifest.xmlがバイナリ化されたものです。
classes.dexはアプリケーションの実体、Dalvik VM上で動作するようにコンパイルされたDalvikバイトコードです。

http://itpro.nikkeibp.co.jp/article/COLUMN/20120810/415587/?ST=develop
