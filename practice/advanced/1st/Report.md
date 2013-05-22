Practice Report for 3.1
------

実習のレポートを下記に記述してください

デバッグ

1. (実習) 実習プロジェクト`DebugPractice`をビルド・インストールし、起動してから画面が立ち上がるまでのメソッドのプロファイリングを実行し、どのメソッドに時間がかかっているかレポートしてください。
添付の画像はAndroid Debug Monitorを立ちあげた状態でDebugPracticeプロジェクトを起動してから画面が表示されるまでの間プロファイルをしたものをExcl Cpu Time %の降順にしたものです
最も時間がかかっているメソッドは
android/text/StaticLayout.generate
です
これはテキストビューに文字を表示するためのレイアウト生成時に呼ばれているメソッドのようです
http://developer.android.com/reference/android/text/StaticLayout.html


自動ビルド

2. (実習) 適用したプロジェクトを ant でビルドし、ログを見て、ビルドに必要な手順をレポートしてください。

###ログ
    $ ant debug
    Buildfile: /Users/kenichi.umekita/Documents/workspace/helloworld/build.xml
    
    -set-mode-check:
    
    -set-debug-files:
    
    -check-env:
     [checkenv] Android SDK Tools Revision 22.0.0
     [checkenv] Installed at /Applications/adt-bundle-mac-x86_64-20130514/sdk
    
    -setup:
         [echo] Project Name: HelloWorld
      [gettype] Project Type: Application
    
    -set-debug-mode:
    
    -debug-obfuscation-check:
    
    -pre-build:
    
    -build-setup:
    [getbuildtools] Using latest Build Tools: 17.0.0
         [echo] Resolving Build Target for HelloWorld...
    [gettarget] Project Target:   Android 4.2.2
    [gettarget] API level:        17
         [echo] ----------
         [echo] Creating output directories if needed...
         [echo] ----------
         [echo] Resolving Dependencies for HelloWorld...
    [dependency] Library dependencies:
    [dependency] No Libraries
         [echo] ----------
         [echo] Building Libraries with 'debug'...
       [subant] No sub-builds to iterate on
    
    -code-gen:
    [mergemanifest] No changes in the AndroidManifest files.
         [echo] Handling aidl files...
         [aidl] No AIDL files to compile.
         [echo] ----------
         [echo] Handling RenderScript files...
    [renderscript] No RenderScript files to compile.
         [echo] ----------
         [echo] Handling Resources...
         [aapt] No changed resources. R.java and Manifest.java untouched.
         [echo] ----------
         [echo] Handling BuildConfig class...
    [buildconfig] No need to generate new BuildConfig.
    
    -pre-compile:
    
    -compile:
    
    -post-compile:
    
    -obfuscate:
    
    -dex:
          [dex] input: /Users/kenichi.umekita/Documents/workspace/helloworld/bin/classes
          [dex] input: /Users/kenichi.umekita/Documents/workspace/helloworld/libs/android-support-v4.jar
          [dex] Using Pre-Dexed android-support-v4-079837b63f19f9aab736189d3c5d43bb.jar <- /Users/kenichi.umekita/Documents/workspace/helloworld/libs/android-support-v4.jar
          [dex] No new compiled code. No need to convert bytecode to dalvik format.
    
    -crunch:
       [crunch] Crunching PNG Files in source dir: /Users/kenichi.umekita/Documents/workspace/helloworld/res
       [crunch] To destination dir: /Users/kenichi.umekita/Documents/workspace/helloworld/bin/res
       [crunch] Crunched 0 PNG files to update cache
    
    -package-resources:
         [aapt] No changed resources or assets. HelloWorld.ap_ remains untouched
    
    -package:
    [apkbuilder] No changes. No need to create apk.
    
    -post-package:
    
    -do-debug:
     [zipalign] Run cancelled: no changes to input file /Users/kenichi.umekita/Documents/workspace/helloworld/bin/HelloWorld-debug-unaligned.apk
         [echo] Debug Package: /Users/kenichi.umekita/Documents/workspace/helloworld/bin/HelloWorld-debug.apk
    [propertyfile] Updating property file: /Users/kenichi.umekita/Documents/workspace/helloworld/bin/build.prop
    [propertyfile] Updating property file: /Users/kenichi.umekita/Documents/workspace/helloworld/bin/build.prop
    [propertyfile] Updating property file: /Users/kenichi.umekita/Documents/workspace/helloworld/bin/build.prop
    [propertyfile] Updating property file: /Users/kenichi.umekita/Documents/workspace/helloworld/bin/build.prop
    
    -post-build:
    
    debug:
    
    BUILD SUCCESSFUL
    Total time: 1 second

###必要と思われる手順
* set-mode-check
* set-debug-files
* check-env
* setup
* set-debug-mode
* debug-obfuscation-check
* pre-build
* build-setup
* code-gen
* pre-compile
* compile
* post-compile
* obfuscate
* dex
* crunch
* package-resources
* package
* post-package
* do-debug
* post-build
