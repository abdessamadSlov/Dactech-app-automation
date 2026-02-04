# DK-app-automation
Projet d'automatisation Appium

# TechniciensDApp – Mobile Automation Framework

## 📱 **TechniciensDApp** est une application Android/Ios utilisée par les techniciens terrain pour gérer les ordres de travail (OT) quotidiens.  

L'application permet de :
- Authentification du technicien
- Affichage des OT du jour
- Consultation du détail d’un OT
- Remplissage du formulaire OT (texte, checklist)
- Capture photo et audio si nécessaire
- Signature du client
- Envoi des OT au manager
L'application est disponible  sur **Android** et **Iphone** pour les techniciens.

## 🛠️ Stack technique
- **Langage :** Java 11
- **Automatisation Mobile :** Appium (UiAutomator2 & XCUITest)
- **BDD / Scénarios Métier :** Cucumber
- **Gestion des tests :** TestNG 
- **Multi-device / Cloud :** BrowserStack (d'abord emulators + real devices..)
- **CI/CD :** GitLab CI
- **Conteneurisation :** Docker
- **IDE :**  IntelliJ


## 🧩 Méthodologie et organisation
- **Pattern POM** pour les écrans et interactions
- **BDD Cucumber** pour la lisibilité métier des tests
- **Tests parallèles** via TestNG et suites XML multi-devices
- **Configurations externalisées** (devices.properties) 



