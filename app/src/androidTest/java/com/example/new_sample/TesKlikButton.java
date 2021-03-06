package com.example.new_sample;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TesKlikButton {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void tesKlikButtonSatu(){
        //cari id button1 terus di klik
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("1")));
    }

    @Test
    public void tesKlikButtonDua(){

        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
    }

    @Test
    public void tesKlikButtonTiga(){

        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
    }

    @Test
    public void tesKlikButtonEmpat(){

        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("4")));
    }

    @Test
    public void tesKlikButtonLima(){

        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
    }

    @Test
    public void tesKlikButtonEnam(){

        onView(withId(R.id.button6)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("6")));
    }

    @Test
    public void tesKlikButtonTujuh(){

        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("7")));
    }

    @Test
    public void tesKlikButtonDelapan(){

        onView(withId(R.id.button8)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("8")));
    }

    @Test
    public void tesKlikButtonSembilan(){

        onView(withId(R.id.button9)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("9")));
    }

    @Test
    public void tesKlikButtonAC(){

        onView(withId(R.id.button_clear)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("")));
    }

    @Test
    public void tesKlikButtonNol(){

        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0")));
    }

    @Test
    public void tesKlikButtonPara1(){

        onView(withId(R.id.button_para1)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("%")));
    }

    @Test
    public void tesKlikButtonPara2(){

        onView(withId(R.id.button_para2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("Error")));
    }

    @Test
    public void tesKlikButtonTambah(){

        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("+")));
    }

    @Test
    public void tesKlikButtonKurang(){

        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("-")));
    }
    @Test
    public void tesKlikButtonSamaDengan(){

        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("=")));
    }

    @Test
    public void tesKlikButtontesPara1(){
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button_para1)).perform(click());
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("0.49")));
    }

    @Test
    public void tesKlikButtontesPara2(){
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button_para2)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("+")));
    }

    @Test
    public void tesKlikButtontesTambah(){
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("14")));
    }

    @Test
    public void tesKliktambahkurang(){
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("10")));
    }

    @Test
    public void tesKliktambahkali(){
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("28")));
    }

    @Test
    public void tesKliktambahbagi(){
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("10.5")));
    }

    @Test
    public void tesKliktambahpersen(){
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.button_para1)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("7.14")));
    }
}
