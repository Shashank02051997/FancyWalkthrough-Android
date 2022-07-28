package com.shashank.sony.fancywalkthroughlibrary;

import android.os.Bundle;
import android.widget.Toast;

import com.shashank.sony.fancywalkthroughlib.FancyWalkthroughActivity;
import com.shashank.sony.fancywalkthroughlib.FancyWalkthroughCard;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FancyWalkthroughActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FancyWalkthroughCard fancywalkthroughCard1 = new FancyWalkthroughCard("Find Restaurant", "Find the best restaurant in your neighborhood.", R.drawable.find_restaurant1);
        FancyWalkthroughCard fancywalkthroughCard2 = new FancyWalkthroughCard("Pick the best", "Pick the right place using trusted ratings and reviews.", R.drawable.pickthebest);
        FancyWalkthroughCard fancywalkthroughCard3 = new FancyWalkthroughCard("Choose your meal", "Easily find the type of food you're craving.", R.drawable.chooseurmeal);
        FancyWalkthroughCard fancywalkthroughCard4 = new FancyWalkthroughCard("Meal is on the way", "Get ready and comfortable while our biker bring your meal at your door.", R.drawable.mealisonway);

        fancywalkthroughCard1.setBackgroundColor(R.color.white);
        fancywalkthroughCard1.setIconLayoutParams(800, 800, 0, 0, 0, 0);
        fancywalkthroughCard1.setDisplaySkip(true);
        fancywalkthroughCard2.setBackgroundColor(R.color.white);
        fancywalkthroughCard2.setIconLayoutParams(800, 800, 0, 0, 0, 0);
        fancywalkthroughCard2.setDisplaySkip(true);
        fancywalkthroughCard3.setBackgroundColor(R.color.white);
        fancywalkthroughCard3.setIconLayoutParams(800, 800, 0, 0, 0, 0);
        fancywalkthroughCard3.setDisplaySkip(true);
        fancywalkthroughCard4.setBackgroundColor(R.color.white);
        fancywalkthroughCard4.setIconLayoutParams(800, 800, 0, 0, 0, 0);
        fancywalkthroughCard4.setDisplaySkip(true);
        List<FancyWalkthroughCard> pages = new ArrayList<>();

        pages.add(fancywalkthroughCard1);
        pages.add(fancywalkthroughCard2);
        pages.add(fancywalkthroughCard3);
        pages.add(fancywalkthroughCard4);

        for (FancyWalkthroughCard page : pages) {
            page.setTitleColor(R.color.black);
            page.setDescriptionColor(R.color.black);
        }
        setFinishButtonTitle("Get Started");
        showNavigationControls(true);
        setColorBackground(R.color.colorGreen);
        //setImageBackground(R.drawable.restaurant);
        setInactiveIndicatorColor(R.color.grey_600);
        setActiveIndicatorColor(R.color.colorGreen);
        setOnboardPages(pages);

    }

    @Override
    public void onFinishButtonPressed() {
        Toast.makeText(this, "Finish Pressed", Toast.LENGTH_SHORT).show();

    }
}
