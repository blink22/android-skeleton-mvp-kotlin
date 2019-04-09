# Android Kotlin MVP Template

This repository contains a detailed sample app that implements MVP architecture in Kotlin using Dagger2, Retrofit, RxJava, Constraint-Layout, Leak Canary, Firebase, Fastlane and CircleCI
# Architecture Blueprint
![Blueprint](https://janishar.github.io/images/mvp-app-pics/mvp-interactor-arch.png)
<br>

# Read the below listed articles to be familiar with MVP concepts and understand Template structure.
1. [MVP: Part 1](https://blog.mindorks.com/essential-guide-for-designing-your-android-app-architecture-mvp-part-1-74efaf1cda40#.lkml1yggq)
2. [MVP: Part 2](https://blog.mindorks.com/essential-guide-for-designing-your-android-app-architecture-mvp-part-2-b2ac6f3f9637#.dge0wl8rl)
3. [MVP: Part 3](https://blog.mindorks.com/essential-guide-for-designing-your-android-app-architecture-mvp-part-3-dialog-viewpager-and-7bdfab86aabb)
4. [Extension with Interactors and Repositories](https://blog.mindorks.com/android-mvp-architecture-extension-with-interactors-and-repositories-bd4b51972339)

#### The app has following packages:
1. **data**: It contains all the data accessing and manipulating components such as database, netorkw APIs, prefernces,... etc.
2. **di**: Dependency providing classes using Dagger2.
3. **ui**: View classes along with their corresponding Presenters.
4. **utils**: Utility classes.

#### Classes have been designed in such a way that it could be inherited and maximize the code reuse.

### Library reference resources:
1. RxJava2: https://github.com/amitshekhariitbhu/RxJava2-Android-Samples
2. Dagger2: https://github.com/MindorksOpenSource/android-dagger2-example
3. Retrofit: https://github.com/square/retrofit
4. LeakCanary: https://github.com/square/leakcanary
5. Fabric Crashlytics: https://github.com/plastiv/CrashlyticsDemo
6. RxFirebase: https://github.com/kunny/RxFirebase
7. GSON: https://github.com/google/gson
8. Kotlin Linter: https://github.com/pinterest/ktlint
9. AutoFitTextView: https://github.com/grantland/android-autofittextview
10. Alerter: https://github.com/Tapadoo/Alerter
11. Espresso UI Testing: https://developer.android.com/training/testing/espresso
12. Mockito Testing: https://github.com/mockito/mockito

### Concept reference resources:
1. [Introduction to Dagger 2: Part 1](https://blog.mindorks.com/introduction-to-dagger-2-using-dependency-injection-in-android-part-1-223289c2a01b#.ki6nt86l6)
2. [Introduction to Dagger 2: Part 2](https://blog.mindorks.com/introduction-to-dagger-2-using-dependency-injection-in-android-part-2-b55857911bcd#.mkpzyk8sa)
3. [Android Dagger2: Critical things to know before you implement](https://blog.mindorks.com/android-dagger2-critical-things-to-know-before-you-implement-275663aecc3e#.bskiz1879)
4. [Android Continuous Integration using Fastlane and CircleCI 2.0 — Part I](https://medium.com/pink-room-club/android-continuous-integration-using-fastlane-and-circleci-2-0-part-i-7204e2e7b8b)
5. [Android Continuous Integration using Fastlane and CircleCI 2.0 — Part II](https://medium.com/pink-room-club/android-continuous-integration-using-fastlane-and-circleci-2-0-part-ii-7f8dd7265659)
6. [Android Continuous Integration using Fastlane and CircleCI 2.0 — Part III](https://medium.com/pink-room-club/android-continuous-integration-using-fastlane-and-circleci-2-0-part-iii-ccdf5b83d8f5)

### Installation:
#### Fabric Crashlytics integration:
Add your Fabric ApiKey in `AndroidManifest.xml`
```kotlin
<meta-data
    android:name="io.fabric.ApiKey"
    android:value="<YOUR_API_KEY_GOES_HERE>"/>
```
#### CircleCI integration:
To avoid having private data info hardcoded in the code, we modify lane file to use environment variables.
You need to set the following variables in the [CircleCI](https://circleci.com/) environment variables:
- **STORE_PASSWORD**: Your keystore password.
- **KEY_ALIAS**: Key alias of your generated keystore.
- **KEY_PASSWORD**: Key password of your generated keystore.
- **RELEASE_KEY_STORE**: Your keystore. You firstly need to convert your `keystore.jks` to base64. To do that, simply run ```sh base64 keystore.jks```.
- **GOOGLE_SERVICES**: Firebase configurations. You firstly need to convert your `google-services.json` to base64. To do that, simply run ```sh base64 keystore.jks```.
- **CRASHLYTICS_API_TOKEN**: Fabric ApiKey.
- **CRASHLYTICS_BUILD_SECRET**: Fabric Build Secret.

#### Firebase integration:
Add the Firebase Android configuration file to the project:
- download google-services.json to obtain your [Firebase Android config file](https://support.google.com/firebase/answer/7015592) (`google-services.json`)
- Move your config file into the module (app-level) directory of the project.

If you don't need firebase services, you have to do the following:
- remove `apply plugin: 'com.google.gms.google-services'` from `app/build.gradle`
- remove `decode_google_services` from `.circleci/config.yml`

### License
```
   Copyright (C) 2019 Blink22
```

### Contributers
[Ahmed El-Sayed Mahmoud](https://github.com/Ahmed-elsayed-mahmoud)
