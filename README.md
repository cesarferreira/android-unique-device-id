# Unique Device Id Provider

> It's quite complex to have a way to get an unique identifier on android that's compatible with all android versions as you can see [here](https://stackoverflow.com/questions/2785485/is-there-a-unique-android-device-id) 


### Notice
- This approach doesn't need any android permissions
- if you wipe the app data it will generate a new unique ID

## Usage

```kotlin

// create it or provide it with a DI framework
val idProvider = UniqueDeviceIdProvider(context) 

// retrieve the unique key
idProvider.getUniqueId() // ca705d9b-0598-4f75-b71a-973934160055
```

## Install
<!-- 
Latest version = [![Download](https://api.bintray.com/packages/cesarferreira/maven/tempo/images/download.svg) ](https://bintray.com/cesarferreira/maven/tempo/_latestVersion) -->

```groovy
dependencies {
  implementation 'com.github.cesarferreira:android-unique-device-id:0.0.3'
}
```

## Licence

```
Copyright 2019 Cesar Ferreira

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```