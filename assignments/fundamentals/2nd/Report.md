Assignment Report for 2.2
------

以下に、課題の回答を記入してください。

Activity と Fragment
======

### Activity

3. ライフサイクルのコールバックメソッドの呼び出し順
*version 2.2.1*

####起動時
1.onCreate
2.onStart
3.onResume

####メニューをタップ
1.onCreateOptionsMenu

####ホームをタップ
1.onPause
2.onStop
3.(再度開く)
4.onRestart
5.onStart
6.onResume

####縦から横に変えた時
1.onPause
2.onStop
3.onCreate
4.onStart (onRestartにならない)
5.onResume

####終了時
1.onPause
2.onStop
3.onDestroy

