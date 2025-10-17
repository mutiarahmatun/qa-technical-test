# Mobile UI Automation (Appium 3.1.0)

### Requirements
- Java 11+
- Maven 3+
- Android Studio + SDK
- Appium Server 3.1.0
- Emulator or real Android device

### Setup
1. Download the app:
   [Sauce Labs Demo App v1.0.13](https://github.com/saucelabs/my-demo-app-android/releases/download/1.0.13/mda-1.0.13-15.apk)
   and place it in `/app` folder.
2. Start Appium server:
   ```bash
   appium --allow-cors
   ```
3. Run tests:
   ```bash
   mvn test
   ```

### Reports
Generated under `target/cucumber-report.html`
