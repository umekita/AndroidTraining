Practice Report for 2/8
------

実習のレポートを下記に記述してください

### Service

1. サンプルプロジェクト (ServiceSample) に、サービスのライフサイクルをログに出力する実装が格納されています。このプロジェクトをビルドし、ログがどのように表示されるかをレポートしてください。

#### Started ServiceControl(Start)
    05-15 13:57:55.874: V/StartedService(18125): onCreate
    05-15 13:57:55.884: V/StartedService(18125): onStartCommand

#### Started ServiceControl(Stop)
    05-15 13:58:09.094: V/StartedService(18125): onDestroy

#### Bound Service Control(Bind)
    05-15 13:58:59.924: V/BoundService(18125): onCreate
    05-15 13:58:59.934: V/MainActivity(18125): onServiceConnected

#### Bound Service Control(Unbind)
    05-15 13:59:03.644: V/BoundService(18125): onUnbind
    05-15 13:59:03.644: V/BoundService(18125): onDestroy

#### Intent Service Control
    05-15 13:59:32.554: V/MyIntentService(18125): onCreate
    05-15 13:59:32.554: V/MyIntentService(18125): onStartCommand
    05-15 13:59:32.564: V/MyIntentService(18125): onHandleIntent
    05-15 13:59:32.564: V/MyIntentService(18125): onDestroy

### Loader

1. サンプルプロジェクト (LoaderSample) に、AsyncTaskLoader のライフサイクルをログに出力する実装が格納されています。このプロジェクトをビルドし、ログがどのように出力されているかをレポートしてください。

#### Run
    05-15 14:10:27.324: I/ActivityManager(296): Starting activity: Intent { act=android.intent.action.MAIN cat=[android.intent.category.LAUNCHER] flg=0x10000000 cmp=jp.mixi.sample.loader/.MainActivity }
    05-15 14:10:27.394: V/MainActivity(18232): onCreateLoader
    05-15 14:10:27.404: V/MyAsyncTaskLoader(18232): onStartLoading
    05-15 14:10:27.404: V/MyAsyncTaskLoader(18232): loadInBackground
    05-15 14:10:28.414: V/MyAsyncTaskLoader(18232): deliverResult
    05-15 14:10:28.414: V/MainActivity(18232): onLoadFinished

#### 画面にhogehogeと表示される
    05-15 14:10:30.731: D/KEEPSCREEN IS(18062): [98] jp.mixi.sample.loader
    05-15 14:10:34.584: D/skia(395): purging 194K from font cache [18 entries]

#### 終了
    05-15 14:10:37.334: V/MyAsyncTaskLoader(18232): onStopLoading
    05-15 14:10:37.334: V/MainActivity(18232): onLoaderReset
    05-15 14:10:37.334: V/MyAsyncTaskLoader(18232): onReset
    05-15 14:10:37.334: V/MyAsyncTaskLoader(18232): onStopLoading

### AsyncTask

1. `AsyncTask#doInBackground()` で、TextView の文字を変更するような、UI の処理を実行するとどうなるかを、理由を添えてレポートしてください。

例外が発生して異常終了します
理由はUIをアップデートするにはdoInBackgroundではなくonPostExecuteを実装してそこでdoInBackgroundの処理結果を受け取って処理する必要があるからです
なぜならdoInBackgroundはプールされたバックグラウンドのスレッドで実行されるのに対して onPostExecuteはUIスレッドで実行されるからです

> To use it, you must subclass AsyncTask and implement the doInBackground() callback method, which runs in a pool of background threads. To update your UI, you should implement onPostExecute(), which delivers the result from doInBackground() and runs in the UI thread, so you can safely update your UI. You can then run the task by calling execute() from the UI thread.

http://developer.android.com/guide/components/processes-and-threads.htmlから 引用
