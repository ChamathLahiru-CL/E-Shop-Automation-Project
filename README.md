# E-Shop Automation Testing Project

[![Java](https://img.shields.io/badge/Java-23-orange.svg)](https://www.oracle.com/java/)
[![Selenium](https://img.shields.io/badge/Selenium-4.38.0-green.svg)](https://www.selenium.dev/)
[![TestNG](https://img.shields.io/badge/TestNG-7.10.2-red.svg)](https://testng.org/)
[![Maven](https://img.shields.io/badge/Maven-Build-blue.svg)](https://maven.apache.org/)

## 📋 Overview

This project is a comprehensive **Selenium-based test automation framework** for the [Automation Exercise](https://automationexercise.com) e-commerce website. It implements end-to-end testing scenarios using industry-standard tools and design patterns, demonstrating professional automation testing practices.

The framework validates critical user journeys including user registration, authentication, product browsing, cart management, and checkout processes.

## ✨ Key Features

- ✅ **Page Object Model (POM)** design pattern for maintainable test code
- ✅ **TestNG** framework for test organization and execution
- ✅ **WebDriverManager** for automatic browser driver management
- ✅ **Modular architecture** with separate page objects and test classes
- ✅ **Data-driven testing** capabilities with Apache POI
- ✅ **Extent Reports** integration for comprehensive test reporting
- ✅ **Explicit waits** for robust element interactions

## 🧪 Test Coverage

### Authentication & User Management
- User signup with complete profile creation
- Direct login functionality
- Account deletion

### E-Commerce Features
- Product browsing by categories (Women, Men, Kids)
- Product filtering by brands (Polo, Biba, Babyhug, Madame)
- Add products to cart
- Cart management
- Checkout process
- Payment processing with multiple card types
- Invoice download
- Complete happy path flow (login → add to cart → checkout → payment)

## 🛠️ Technology Stack

| Technology | Version | Purpose |
|-----------|---------|---------|
| **Java** | 23 | Programming Language |
| **Selenium WebDriver** | 4.38.0 | Browser Automation |
| **TestNG** | 7.10.2 | Testing Framework |
| **WebDriverManager** | 5.9.2 | Browser Driver Management |
| **Apache POI** | 5.4.1 | Excel Data Handling |
| **Extent Reports** | 5.1.2 | Test Reporting |
| **Maven** | - | Build & Dependency Management |

## 📁 Project Structure

```
E-ShopAutomationPR/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── org/
│   │           └── Methods/
│   │               ├── DashBoard/
│   │               │   ├── cartPage.java
│   │               │   ├── homePage.java
│   │               │   └── addAccountDelete.java
│   │               └── Login/
│   │                   ├── signUpPage.java
│   │                   └── directLoginPage.java
│   └── test/
│       └── java/
│           └── org/
│               └── Methods/
│                   └── testCases/
│                       ├── BaseTest.java
│                       ├── signUpPage_Test.java
│                       ├── directLogin_Test.java
│                       ├── dashboard_Test.java
│                       └── happyPath.java
├── pom.xml
└── README.md
```

### Package Description

- **`org.Methods.Login`**: Page objects for authentication (signup, login)
- **`org.Methods.DashBoard`**: Page objects for e-commerce features (home, cart, account)
- **`org.Methods.testCases`**: Test classes and base configuration

## 🚀 Getting Started

### Prerequisites

Before running this project, ensure you have the following installed:

1. **Java Development Kit (JDK) 23** or higher
   ```bash
   java -version
   ```

2. **Maven** (for dependency management)
   ```bash
   mvn -version
   ```

3. **Chrome Browser** (latest version recommended)

4. **IDE** (IntelliJ IDEA, Eclipse, or VS Code with Java extensions)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/ChamathLahiru-CL/E-Shop-Automation-Project.git
   cd E-Shop-Automation-Project
   ```

2. **Install dependencies**
   ```bash
   mvn clean install
   ```

3. **Configure WebDriver path** (if needed)
   - Update the ChromeDriver path in `BaseTest.java`:
   ```java
   System.setProperty("webdriver.chrome.driver", "YOUR_CHROMEDRIVER_PATH");
   ```
   - Or remove this line to use WebDriverManager's automatic driver management

## ⚙️ Configuration

### Update ChromeDriver Path

Edit `src/test/java/org/Methods/testCases/BaseTest.java`:

```java
@BeforeTest
public void beforeTest(){
    // Option 1: Specify your ChromeDriver path
    System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
    
    // Option 2: Use WebDriverManager (recommended)
    // WebDriverManager.chromedriver().setup();
    
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    driver.manage().window().maximize();
    driver.get("https://automationexercise.com");
    
    // Initialize page objects
    signUpPage = new signUpPage(driver);
    directLoginPage = new directLoginPage(driver);
    homePage = new homePage(driver);
    cartPage = new cartPage(driver);
}
```

### Update Test Data

Modify test credentials in test classes as needed:
- `happyPath.java`: Update email and password for existing account
- `signUpPage_Test.java`: Update signup details for new account creation

## 🧪 Running Tests

### Run All Tests
```bash
mvn test
```

### Run Specific Test Class
```bash
mvn test -Dtest=happyPath
mvn test -Dtest=signUpPage_Test
mvn test -Dtest=directLogin_Test
```

### Run from IDE
1. Right-click on any test class
2. Select "Run as TestNG Test"

### Run Happy Path (End-to-End Test)
```bash
mvn test -Dtest=happyPath
```

## 📊 Test Reports

After test execution, reports are generated using Extent Reports. Check the output directory for:
- HTML test reports with detailed execution logs
- Screenshots (if configured)
- Test execution summaries

## 🧩 Test Scenarios

### 1. User Signup Test (`signUpPage_Test.java`)
- Navigate to signup page
- Fill registration form with user details
- Submit account creation
- Verify account creation success

### 2. Direct Login Test (`directLogin_Test.java`)
- Navigate to login page
- Enter credentials
- Verify successful authentication
- Access user dashboard

### 3. Happy Path Test (`happyPath.java`)
Complete e-commerce flow:
1. Login with existing credentials
2. Add multiple products to cart
3. View cart
4. Proceed to checkout
5. Enter shipping details
6. Complete payment with card details
7. Download invoice
8. Return to home page

### 4. Dashboard Tests (`dashboard_Test.java`)
- Product category navigation
- Brand filtering
- Cart operations
- Account management

## 🔧 Page Object Model Implementation

The framework follows **Page Object Model (POM)** design pattern:

- **Separation of Concerns**: Page objects contain only element locators and actions
- **Reusability**: Methods can be used across multiple test scenarios
- **Maintainability**: UI changes require updates in only one place
- **Readability**: Tests read like user stories

Example:
```java
// Page Object
public class signUpPage {
    private By userName = By.cssSelector("input[data-qa='signup-name']");
    
    public void signUp(String name, String email){
        driver.findElement(userName).sendKeys(name);
        // ... more actions
    }
}

// Test Class
public class signUpPage_Test extends BaseTest {
    @Test
    public void testSignUp(){
        signUpPage.openSignLogin();
        signUpPage.signUp("John Doe", "john@example.com");
        // ... more test steps
    }
}
```

## 🤝 Contributing

Contributions are welcome! To contribute:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Code Style Guidelines
- Follow Java naming conventions
- Use meaningful variable and method names
- Add comments for complex logic
- Maintain Page Object Model structure
- Write atomic, independent tests

## 📝 Best Practices Implemented

- ✅ **Implicit and Explicit Waits**: Proper synchronization strategies
- ✅ **WebDriverManager**: Automatic driver version management
- ✅ **TestNG Annotations**: Organized test lifecycle management
- ✅ **Independent Tests**: Each test can run standalone
- ✅ **Clean Code**: Well-structured and readable code
- ✅ **Modular Design**: Reusable components

## 🐛 Troubleshooting

### Common Issues

**Issue**: ChromeDriver version mismatch
```
Solution: Update ChromeDriver or use WebDriverManager for automatic version management
```

**Issue**: Element not found exceptions
```
Solution: Increase implicit wait time in BaseTest.java or add explicit waits
```

**Issue**: Tests fail on different environments
```
Solution: Remove hardcoded ChromeDriver path, use WebDriverManager instead
```

## 📄 License

This project is created for educational and demonstration purposes. Feel free to use it as a reference for your automation projects.

## 👨‍💻 Author

**Chamath Lahiru**
- GitHub: [@ChamathLahiru-CL](https://github.com/ChamathLahiru-CL)

## 🙏 Acknowledgments

- [Automation Exercise](https://automationexercise.com) - Practice website for automation testing
- [Selenium](https://www.selenium.dev/) - Browser automation framework
- [TestNG](https://testng.org/) - Testing framework
- WebDriverManager - Browser driver management tool

---

**Note**: This is a demonstration project for learning test automation. Update test credentials and configuration according to your environment before running tests.

For questions or support, please open an issue in the repository.
