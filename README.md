[![Build Status](https://travis-ci.com/SanojPunchihewa/GlowButton.svg?branch=master)](https://travis-ci.com/SanojPunchihewa/GlowButton)
[![](https://jitpack.io/v/SanojPunchihewa/GlowButton.svg)](https://jitpack.io/#SanojPunchihewa/GlowButton)
[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-Glow%20Button-green.svg?style=flat )]( https://android-arsenal.com/details/1/7866 )
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/SanojPunchihewa/GlowButton/blob/master/LICENSE)

<div align="center">
    <img src="/images/logo.png" width="200"/>
</div>

<p align="center">Android Library to beautify your layouts with glowing buttons</p>

<img src="/images/screen_shot_1.png" width="220">

## :pencil2: Usage

### Step 1: Add it in your root build.gradle
```Gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
### Step 2: Add the dependency
```Gradle
dependencies {
    implementation 'com.github.SanojPunchihewa:GlowButton:1.0.1'
}
```

### Step 3: Use it in your layout
Glow button have the following attributes in addition to the default button attributes. Please see the [demo app](https://github.com/SanojPunchihewa/GlowButton/blob/master/app/src/main/res/layout/activity_main.xml)
```xml
    <com.sanojpunchihewa.glowbutton.GlowButton
        ...
        app:buttonColor="@color/background_color_red"
        app:unpressedGlowSize="20dp"
        app:pressedGlowSize="25dp"
        app:glowColor="@color/glow_color_red"
        app:cornerRadius="50dp"
        ...
        />
```
## :wrench: Customizable attributes

|  Attribute    |   default value   | xml           | 
|---------------|-------------------|---------------|
| button color  |      #8800FF      | buttonColor   |
| glow color |      #885BFC      | glowColor |
| unpressed glow size  |  10dp   | unpressedGlowSize   |
| pressed glow size |        12dp        | pressedGlowSize  |
| corner radius |        50dp        | cornerRadius  |

## :open_hands: Contributions
Any contributions are welcome!

## :page_facing_up: License
```
MIT License

Copyright (c) 2019 Sanoj Punchihewa

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
