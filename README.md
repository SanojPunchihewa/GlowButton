[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/SanojPunchihewa/GlowButton/blob/master/LICENSE)

<h1 align="center">Glow Button</h1>
<p align="center">Android Library to beautify your layouts with glowing buttons</p>

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
    implementation 'com.github.SanojPunchihewa:GlowButton:1.0.0'
}
```

### Step 3: Use it in your layout
Glow button have the following attributes in addition to the default button attributes
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
