# Charter  

Charter-003 : Explore the option to add expenses to categories

# Areas  

## Coverage 

- Add expenses to categories. 
- Edit amounts spent in a category

## Test Environment  

Android (v.12)

# Start   

07/30/2022 10:10 AM

# Tester  

Yorhan Polanco

# Task Breakdown  

## Duration  

45 minutes

## Test Design and Execution  

30 minutes

## Bug investigation and reporting  

15 minutes

# Data files  

addExpenses.MP4

# Test Notes  

The mobile used is a Samsung galaxy S20 +.  
Add expenses to category.
1. Open app.
2. Click on a category.
3. Select payment method.
4. Insert note
5. Enter amount spent
6. Click on the add button 
7. verify that the amount was added to the category on the main screen

Edit amount spent added.
1. Click balance button.
2. Click on the balance category to edit.
3. Edit the first digit of the amount added.

# Bugs  

- Bug003 - The first digits of the amount spent can't be edited without deleting the subsequent digits.  

Steps to Reproduce:

1. Click balance button.
2. Click on the balance category to edit.
3. Try to edit the first digit of the added amount

Expected Results:  

The user must be able to edit the amount spent.

Actual Results:

The first digits of the amount spent can't be edited without deleting the subsequent digits

# Issues

- Issues003 - The user can't edit the amounts spent without deleting the subsequent digits. 