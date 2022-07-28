# FancyWalkthrough-Android
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=19)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![](https://jitpack.io/v/Shashank02051997/FancyWalkthrough-Android.svg)](https://jitpack.io/#Shashank02051997/FancyWalkthrough-Android)
[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-FancyWalkthrough-green.svg?style=flat )]( https://android-arsenal.com/details/1/6686 )

<a href="https://play.google.com/store/apps/details?id=com.shashank.sony.fancylibrarybyshashank">
    <img alt="Get it on Google Play"
        height="80"
        src="https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png" />
</a>

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
	implementation 'com.github.Shashank02051997:FancyWalkthrough-Android:2.3'
}
```
# Fancy Walkthrough
Fancy Walkthrough library for android with Image or Solid color backgrounds.

<img src="https://github.com/Shashank02051997/FancyWalkthrough-Android/blob/master/Screenshots/20180114_133325.gif" height="420" width="240">

## How to use

**First of all, you will have to extend your activity like this**

```java
public class YourActivity extends FancyWalkthroughActivity {
// setContentView(R.layout.activity_main);
       
```

**Then, Create `FancyWalkthroughCard` and configure it accordingly**

```java
FancyWalkthroughCard fancywalkthroughCard1 = new FancyWalkthroughCard("Title", "Description", R.drawable.icon1);
fancywalkthroughCard1.setBackgroundColor(R.color.white);
fancywalkthroughCard1.setTitleColor(R.color.black);
fancywalkthroughCard1.setDescriptionColor(R.color.black);
//fancywalkthroughCard1.setDisplaySkip(false);
//fancywalkthroughCard1.setTitleTextSize(dpToPixels(10, this));
//fancywalkthroughCard1.setDescriptionTextSize(dpToPixels(8, this));
//fancywalkthroughCard1.setIconLayoutParams(iconWidth, iconHeight, marginTop, marginLeft, marginRight, marginBottom);
```

**After that, Create a list of cards and set them using**

```java
List<FancyWalkthroughCard> pages = new ArrayList<>();
pages.add(fancywalkthroughCard1);
pages.add(fancywalkthroughCard2);
pages.add(fancywalkthroughCard3);
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
<img src="https://github.com/Shashank02051997/FancyWalkthrough-Android/blob/master/Screenshots/Screenshot_2018-01-14-14-23-47.png" height="420" width="240" hspace="20">

<img src="https://github.com/Shashank02051997/FancyWalkthrough-Android/blob/master/Screenshots/Screenshot_2018-01-14-14-23-51.png" height="420" width="240" hspace="20">

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
### Sample Code
```java
FancyWalkthroughCard fancywalkthroughCard1 = new FancyWalkthroughCard("Find Restaurant", "Find the best restaurant in your neighborhood.",R.drawable.find_restaurant1);
        FancyWalkthroughCard fancywalkthroughCard2 = new FancyWalkthroughCard("Pick the best", "Pick the right place using trusted ratings and reviews.",R.drawable.pickthebest);
        FancyWalkthroughCard fancywalkthroughCard3 = new FancyWalkthroughCard("Choose your meal", "Easily find the type of food you're craving.",R.drawable.chooseurmeal);
        FancyWalkthroughCard fancywalkthroughCard4 = new FancyWalkthroughCard("Meal is on the way", "Get ready and comfortable while our biker bring your meal at your door.",R.drawable.mealisonway);

        fancywalkthroughCard1.setBackgroundColor(R.color.white);
        fancywalkthroughCard1.setIconLayoutParams(300,300,0,0,0,0);
        fancywalkthroughCard2.setBackgroundColor(R.color.white);
        fancywalkthroughCard2.setIconLayoutParams(300,300,0,0,0,0);
        fancywalkthroughCard3.setBackgroundColor(R.color.white);
        fancywalkthroughCard3.setIconLayoutParams(300,300,0,0,0,0);
        fancywalkthroughCard4.setBackgroundColor(R.color.white);
        List<FancyWalkthroughCard> pages = new ArrayList<>();

        pages.add(fancywalkthroughCard1);
        pages.add(fancywalkthroughCard2);
        pages.add(fancywalkthroughCard3);
        pages.add(fancywalkthroughCard4);

        for (FancyWalkthroughCard page : pages) {
            page.setTitleColor(R.color.black);
        fancywalkthroughCard4.setBackgroundColor(R.color.white);
            page.setDescriptionColor(R.color.black);
        }
        setFinishButtonTitle("Get Started");
        showNavigationControls(true);
        setColorBackground(R.color.colorGreen);
        //setImageBackground(R.drawable.restaurant);
        setInactiveIndicatorColor(R.color.grey_600);
        setActiveIndicatorColor(R.color.colorGreen);
        setOnboardPages(pages);
```


## Dependencies

This project use this libraries ~ Thanks to them.

  [KenBurnsView](https://github.com/flavioarfaria/KenBurnsView)

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

## Donation
If this project help you reduce time to develop, you can give me a cup of coffee :) 

<a href="https://www.buymeacoffee.com/mXUuDW7" target="_blank"><img src="https://bmc-cdn.nyc3.digitaloceanspaces.com/BMC-button-images/custom_images/orange_img.png" alt="Buy Me A Coffee" style="height: auto !important;width: auto !important;" ></a>

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
