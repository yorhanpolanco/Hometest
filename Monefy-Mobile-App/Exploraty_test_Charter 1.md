# Charter  

Charter-001 : Explore first screen loaded when opening the app for the first time.

# Areas  

## Coverage 

- Start application.  
- Close welcome message.  
- Navigate in welcome screen.  

## Test Environment  

Android (v.12)

# Start   

07/30/2022 9:00 AM

# Tester  

Yorhan Polanco

# Task Breakdown  

## Duration  

50 minutes

## Test Design and Execution  

30 minutes

## Bug investigation and reporting  

20 minutes

# Data files  

FirstScreen.MP4
PromoScreem.MP4

# Test Notes  

The mobile used is a Samsung galaxy S20 +.  
Open Monefy app.
1. Verify welcome screen
2. Click the Get Started button
3. verify right and left swipe
4. Verify screen
5. Click the Amazing Button
6. Verify screen
7. Click The I'm ready Button
8. Verify promo screen

# Bugs

- Bug001 - The app does not allow scrolling between splash screens.

Steps to Reproduce:

1. Verify welcome screen
2. Click the Get Started button
3. try scrolling between screens

Expected Results:  

User can scroll between splash screens

Actual Results:

User can't scroll between splash screens

- Bug002 - The privacy policy, the terms of use, and the restore button are hidden by the claim my offer button 

Steps to Reproduce:

1. Verify welcome screen
2. Click the Get Started button
3. verify right and left swipe
4. Verify screen
5. Click the Amazing Button
6. Verify screen
7. Click The I'm ready Button
8. Verify promo screen

Expected Results:  

The user can see the privacy policy, the terms of use and the restore button when loading the promo screen

Actual Results:

For the user to be able to see the privacy policy, the terms of use and the restore button must discover that the screen allows scrolling down

# Issues

- Issue001 - User can't scroll between splash screens
- Issue002 - Privacy policy, terms of use, and restore button are not visible unless the user finds that it can be scrolled down  
