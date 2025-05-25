### Selenium Automation Using SwagLabs

Designed and developed an automated testing suite for the [SwagLabs Demo Website](https://www.saucedemo.com/v1/), covering essential e-commerce workflows such as login, product filtering, cart operations, and checkout process.

---

#### Project Overview

* Automated tests.LoginTest cases for user login (valid & invalid users), product sorting (by name and price), adding items to the cart, and performing the complete checkout flow.
* Focused on validating critical user interactions across the application using real-world tests.LoginTest scenarios.
* Applied tests.LoginTest automation best practices including modular tests.LoginTest design, code reusability, and clean assertions.

---

#### Technologies Used

* **Language**: Java
* **Test Framework**: TestNG
* **Automation Tool**: Selenium WebDriver
* **Build Tool**: Maven
* **Design Pattern**: Page Object Model (POM)
* **Browser**: Google Chrome

---
### Test Scenarios Covered
#### 1. Login with Invalid User
   * Enter credentials for a locked-out user
   
* Validate the error message is shown

#### 2. Login with Valid User
   * Log in with correct credentials

* Assert redirection to the inventory page

#### 3. Filter Products by Name & Price
* Sort by Name (Z to A) and Price (Low to High)

* Verify products are displayed in the correct order

#### 4. Add Items to Cart
* Add two or more products to the cart

* Confirm they appear correctly in the cart

#### 5. Perform Checkout
* Complete the full checkout process

* Fill out required forms

* Verify successful order confirmation