# OSS Library

## HTTP Client
- [OkHttp](http://square.github.io/okhttp/)  
An HTTP & HTTP/2 client for Android and Java applications

- [Retrofit](https://square.github.io/retrofit/)  
A type-safe HTTP client for Android and Java

## JSON Convert
- [google-gson](https://github.com/google/gson)  
A Java serialization/deserialization library that can convert Java Objects into JSON and back.

## Image
- [Picasso](http://square.github.io/picasso/)  
A powerful image downloading and caching library for Android

- [Glide](https://github.com/bumptech/glide)  
An image loading and caching library for Android focused on smooth scrolling

## DI
- [Dagger 2](https://github.com/google/dagger)  
A fast dependency injector for Android and Java.

## Log
- [Timber](https://github.com/JakeWharton/timber)  
A logger with a small, extensible API which provides utility on top of Android's normal Log class.
  - 引数にフォーマット文とObjectを渡すことができる
  - Logクラスのラッパーなのでライブラリが薄い
  
## MobileDataBase
- [Realm](https://realm.io/docs/java/latest/#getting-started)  
Realm Mobile Database is an alternative to SQLite and Core Data. 
- [ORMA](https://github.com/gfx/Android-Orma)  
Orma is an ORM (Object-Relation Mapper) for Android SQLiteDatabase, generating helper classes at compile time with annotation processing, inspired in ActiveAndroid, GreenDAO, and Realm.
- [ObectBox](https://github.com/greenrobot/ObjectBox)  
ObjectBox is a new superfast mobile database for objects.

## [PermissionDispatcher](https://github.com/hotchemi/PermissionsDispatcher)

Marshmallowのランタイムアクセス権を処理するためのアノテーションベースのAPIを提供してくれます。

## [AdapterToolbox](https://github.com/cattaka/AdapterToolbox)

RecyclerViewと従来のAdapterView（ListView、Spinnerなど）のユーティリティクラスです。

![](https://cloud.githubusercontent.com/assets/1239253/15986483/ed4f72d6-3043-11e6-81bb-4831991f727d.gif)

## [CatHandsGendroid](https://github.com/cattaka/CatHandsGendroid)
- [AndroidのSQLiteの面倒臭いを簡単にする](http://qiita.com/cattaka/items/1edd041c59cbcfeb6ff4)
- [AndroidのSQLiteの面倒臭いを簡単にする(2)](http://qiita.com/cattaka/items/e8d42f8d7388daf82cd2)
- [AndroidのSQLiteの面倒臭いを簡単にする(3)](http://qiita.com/cattaka/items/43ef5c9945437f9967d5)

## [SimpleCropView](https://github.com/IsseiAoki/SimpleCropView)
[【Android】画像の切り抜きをシンプルに実装できるライブラリを公開しました-SimpleCropView](http://qiita.com/issei_aoki/items/810f491da2e3d077b478)

![](https://camo.githubusercontent.com/4543749a82bbbcf158fe81e593c85aabeca4fe1b/68747470733a2f2f7261772e6769746875622e636f6d2f77696b692f4973736569416f6b692f53696d706c6543726f70566965772f696d616765732f312e312e302f64656d6f5f62617369635f75736167652e676966)

## [FlowLayout](https://github.com/blazsolar/FlowLayout)
![](https://raw.githubusercontent.com/blazsolar/FlowLayout/develop/images/framed_example_screenshot.png)

FlowLayoutは、サイズに応じて子を複数の行に表示するレイアウトで簡単にとうごうできます。タグなどを実装するときに便利ですね。

## [LicensesDialog](https://github.com/PSDev/LicensesDialog)
サードパーティライブラリのライセンスを表示するためのオープンソースライブラリです。

![](https://github.com/PSDev/LicensesDialog/raw/master/screenshot.png)

```
final String name = "LicensesDialog";
        final String url = "http://psdev.de";
        final String copyright = "Copyright 2013 Philip Schiffer <admin@psdev.de>";
        final License license = new ApacheSoftwareLicense20();
        final Notice notice = new Notice(name, url, copyright, license);
        new LicensesDialog.Builder(this)
            .setNotices(notice)
            .build()
            .show();
```

## [TresureDataAndroidSDK](https://docs.treasuredata.com/articles/android-sdk)
アプリの動作を追跡できるサービスのSDKですね。インフラストラクチャ全体を管理し、サポートしているので、データを管理するのではなく、データを分析して、自分が何をすべきかに集中することができる.

## [PhotoView](https://github.com/chrisbanes/PhotoView)
PhotoViewは、Zooming Android ImageViewを簡単に使用できるようにすることを目的としています。
