# Android Tips

## TOC
- [Architecture](#architecture)
- [Security](#security)
- [OSS Library](#oss-library)


## Architecture（MVP)
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
## gitignore

http://qiita.com/kgmyshin/items/5d92915b3d0b8c69cfd4

```
# Built application files
/*/build/

# Crashlytics configuations
com_crashlytics_export_strings.xml

# Local configuration file (sdk path, etc)
local.properties

# Gradle generated files
.gradle/

# Signing files
.signing/

# User-specific configurations
.idea/libraries/
.idea/workspace.xml
.idea/tasks.xml
.idea/.name
.idea/compiler.xml
.idea/copyright/profiles_settings.xml
.idea/encodings.xml
.idea/misc.xml
.idea/modules.xml
.idea/scopes/scope_settings.xml
.idea/vcs.xml
*.iml

# OS-specific files
.DS_Store
.DS_Store?
._*
.Spotlight-V100
.Trashes
ehthumbs.db
Thumbs.db
```

## Security










