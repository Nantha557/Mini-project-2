# Student Mark Management — Workspace README

This workspace contains two small projects used for learning and demos:

1. train1 — a React front-end demo
2. Training_4 — a Spring Boot (Java/Maven) backend demo

---

## train1 (React)

Location: `train1/`

Purpose: UI components and examples (create-react-app structure).

Prerequisites
- Node.js (14+ recommended)
- npm (or yarn)

Common commands (Windows `cmd.exe`):
- Install dependencies: `cd train1 && npm install`
- Start dev server: `cd train1 && npm start`
- Run tests: `cd train1 && npm test`
- Build production bundle: `cd train1 && npm run build`

Notes: The React app source is in `train1/src/` and components are under `train1/src/Component/`.

---

## Training_4 (Spring Boot)

Location: `Training_4/`

Purpose: Java Spring Boot application (Maven project). The compiled JAR is in `Training_4/target/`.

Prerequisites
- Java JDK 11+ (JAVA_HOME configured)
- Maven (optional; a wrapper `mvnw.cmd` is included)

Common commands (Windows `cmd.exe`):
- Run with Maven wrapper: `cd Training_4 && mvnw.cmd spring-boot:run`
- Or with installed Maven: `cd Training_4 && mvn spring-boot:run`
- Run tests: `cd Training_4 && mvnw.cmd test`
- Run packaged JAR: `cd Training_4\target && java -jar Training_4-0.0.1-SNAPSHOT.jar`

Notes: Java sources are in `Training_4/src/main/java/com/example/Training_4/` and resources in `Training_4/src/main/resources/`.

---

## Repository notes
- Use the included scripts/wrappers on Windows (`mvnw.cmd`) where available.
- Adjust Node and Java versions as needed for your environment.

If you want a more detailed README (badges, contribution guide, API docs, examples), tell me what to add and which project to expand.
