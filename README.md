# Android Tips

## TOC
- [Architecture](#architecture)
- [Security](#security)
- [OSS Library](#oss-library)


## Architecture
```
|-java/com/watanabear/sample  
| |-📁 domain  
| | |-📁 model  
| | |-📁 repository  
| | |-📁 usecase   
| | |-📁 exception   
| | |-📃 DomainModule.java
| |-📁 infra  
| | |-📁 repository    
| | |-📃 InfraModule.java
| |-📁 presentation  
| | |-📁 activity  
| | |-📁 fragment  
| | |-📁 presenter  
| | |-📁 view　  
| | |  |-📁 adapter  
| | |  |-📁 dialog  
| | |  |-📃 CustomButton.java  
| | |-📃 PresentationComponent.java
| |-📃 AppComponent.java
| |-📃 AppModule.java
| |-📃 MyApplication.java  
|-📁 res  
  |-📁 values  
    |-📃 dimens.xml  
```
## Security

## OSS Library

HTTP Client
- [OkHttp](http://square.github.io/okhttp/)  
An HTTP & HTTP/2 client for Android and Java applications

- [Retrofit](https://square.github.io/retrofit/)  
A type-safe HTTP client for Android and Java

JSON Convert
- [google-gson](https://github.com/google/gson)  
A Java serialization/deserialization library that can convert Java Objects into JSON and back.

Image
- [Picasso](http://square.github.io/picasso/)  
A powerful image downloading and caching library for Android

- [Glide](https://github.com/bumptech/glide)  
An image loading and caching library for Android focused on smooth scrolling

DI
- [Dagger 2](https://github.com/google/dagger)  
A fast dependency injector for Android and Java.

Log
- [Timber](https://github.com/JakeWharton/timber)  
A logger with a small, extensible API which provides utility on top of Android's normal Log class.
  - 引数にフォーマット文とObjectを渡すことができる
  - Logクラスのラッパーなのでライブラリが薄い
  
MobileDataBase
- [Realm](https://realm.io/docs/java/latest/#getting-started)  
Realm Mobile Database is an alternative to SQLite and Core Data. 
- [ORMA](https://github.com/gfx/Android-Orma)  
Orma is an ORM (Object-Relation Mapper) for Android SQLiteDatabase, generating helper classes at compile time with annotation processing, inspired in ActiveAndroid, GreenDAO, and Realm.
- [ObectBox](https://github.com/greenrobot/ObjectBox)  
ObjectBox is a new superfast mobile database for objects.
