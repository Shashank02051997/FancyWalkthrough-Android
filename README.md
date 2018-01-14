# FancyWalkthrough-Android
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=19)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![](https://jitpack.io/v/Shashank02051997/FancyWalkthrough-Android.svg)](https://jitpack.io/#Shashank02051997/FancyWalkthrough-Android)

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	compile 'com.github.Shashank02051997:FancyWalkthrough-Android:2.1'
}
```
# Fancy Walkthrough
Fancy Walkthrough library for android with Image or Solid color backgrounds.

<img src="https://github.com/Shashank02051997/FancyWalkthrough-Android/blob/master/Screenshots/20180114_133325.gif">

## How to use

**First of all, you will have to extend your activity like this**

```java
public class YourActivity extends FancyWalkthroughActivity {
// setContentView(View)
```

**Then, Create `FancyWalkthroughCard` and configure it accordingly**

```java
FancyWalkthroughCard fancywalkthroughCard1 = new FancyWalkthroughCard("Title", "Description", R.drawable.icon1);
ahoyOnboarderCard1.setBackgroundColor(R.color.white);
ahoyOnboarderCard1.setTitleColor(R.color.black);
ahoyOnboarderCard1.setDescriptionColor(R.color.black);
//ahoyOnboarderCard1.setTitleTextSize(dpToPixels(10, this));
//ahoyOnboarderCard1.setDescriptionTextSize(dpToPixels(8, this));
//ahoyOnboarderCard1.setIconLayoutParams(iconWidth, iconHeight, marginTop, marginLeft, marginRight, marginBottom);
```

**After that, Create a list of cards and set them using**

```java
List<FancyWalkthroughCard> pages = new ArrayList<>();
pages.add(ahoyOnboarderCard1);
pages.add(ahoyOnboarderCard2);
pages.add(ahoyOnboarderCard3);
...

setOnboardPages(pages);
```

- **Image Background**
```java
setImageBackground(R.drawable.image);
```

<img src="https://github.com/Shashank02051997/FancyWalkthrough-Android/blob/master/Screenshots/Screenshot_2018-01-14-13-31-13.png" height="420" width="240" hspace="20"><img src="https://github.com/Shashank02051997/FancyWalkthrough-Android/blob/master/Screenshots/Screenshot_2018-01-14-13-31-19.png" height="420" width="240" hspace="20">
<img src="https://github.com/Shashank02051997/FancyWalkthrough-Android/blob/master/Screenshots/Screenshot_2018-01-14-13-32-18.png" height="420" width="240">


- **Solid Background**

```java
List<Integer> colorList = new ArrayList<>();
colorList.add(R.color.solid_one);
colorList.add(R.color.solid_two);
colorList.add(R.color.solid_three);
setColorBackground(colorList);

                //or

setColorBackground(R.color.solid_one);
```

<img src="https://github.com/Shashank02051997/FancyWalkthrough-Android/blob/master/Screenshots/Screenshot_2018-01-14-14-23-36.png" height="420" width="240" hspace="20"><img src="https://github.com/Shashank02051997/FancyWalkthrough-Android/blob/master/Screenshots/Screenshot_2018-01-14-14-23-39.png" height="420" width="240" hspace="20">
<img src="https://github.com/Shashank02051997/FancyWalkthrough-Android/blob/master/Screenshots/Screenshot_2018-01-14-14-23-47.png" height="420" width="240">

<img src="https://github.com/Shashank02051997/FancyWalkthrough-Android/blob/master/Screenshots/Screenshot_2018-01-14-14-23-51.png" height="420" width="240">

### Other properties
```java

//Show/Hide navigation controls
showNavigationControls(false);

//Set pager indicator colors
setInactiveIndicatorColor(R.color.grey);
setActiveIndicatorColor(R.color.white);

//Set finish button text
setFinishButtonTitle("Get Started");

//Set the finish button style
setFinishButtonDrawableStyle(ContextCompat.getDrawable(this, R.drawable.rounded_button));
```


## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/Shashank02051997/FancyWalkthrough-Android/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

### Contact - Let's become friend
- [Twitter](https://twitter.com/shashank020597)
- [Github](https://github.com/Shashank02051997)
- [Linkedin](https://www.linkedin.com/in/shashank-singhal-a87729b5/)
- [Facebook](https://www.facebook.com/shashanksinghal02)

## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2018 Shashank Singhal

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
