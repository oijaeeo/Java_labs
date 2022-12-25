# Тема

Визначення типу поверхні другого порядку. На відміну від основних завдань, для даного завдання студент має побудувати веб-інтерфейс, що дозволяє задавати поверхні другого порядку та відображати результати для попередньо оцінених поверхонь. У користувача має бути можливість переглянути список вже визначених поверхонь. Коли користувач обирає детальний перегляд результатів, система має відображати пояснення, на основі який фактів було прийняте рішення про той чи інший тип поверхні

[Методичка з описом типів поверхонь другого порядку](https://maimo.elit.sumdu.edu.ua/images/stories/docs/poverh2.pdf)

## Запуск програми

The project is a standard Maven project written with [Vaadin Framework for UI components](https://vaadin.com/docs/latest/guide/step-by-step/importing). To run it from the command line,
type `mvnw` (Windows), or `./mvnw` (Mac & Linux), then open
http://localhost:8080 in your browser.

You can also import the project to your IDE of choice as you would with any
Maven project. Read more on [how to import Vaadin projects to different
IDEs](https://vaadin.com/docs/latest/guide/step-by-step/importing) (Eclipse, IntelliJ IDEA, NetBeans, and VS Code).

## Структура проекту

- `src/main/java/com/example/application/models/main/Surface.java` описує різні поверхні другого порядку
- `src/main/java/com/example/application/models/main/Equation.java` є конейнером для рівняння поверхні
- `src/main/java/com/example/application/models/main/SurfaceFactory.java` містить в собі логіку, яка використовується для визначення типу поверхні за заданим рівнянням
- `src/test/java/com/example/application/models/main/SurfaceFactoryTest.java` містить в собі тестові сценарії для кожної поверхні
- `src/main/java/com/example/application/views/main/MainView.java` головний компонент веб-інтерфейсу

## Документація фреймворка

- Read the documentation at [vaadin.com/docs](https://vaadin.com/docs).
- Follow the tutorials at [vaadin.com/tutorials](https://vaadin.com/tutorials).
- Watch training videos and get certified at [vaadin.com/learn/training](https://vaadin.com/learn/training).
- Create new projects at [start.vaadin.com](https://start.vaadin.com/).
- Search UI components and their usage examples at [vaadin.com/components](https://vaadin.com/components).
- View use case applications that demonstrate Vaadin capabilities at [vaadin.com/examples-and-demos](https://vaadin.com/examples-and-demos).
- Build any UI without custom CSS by discovering Vaadin's set of [CSS utility classes](https://vaadin.com/docs/styling/lumo/utility-classes).
- Find a collection of solutions to common use cases at [cookbook.vaadin.com](https://cookbook.vaadin.com/).
- Find add-ons at [vaadin.com/directory](https://vaadin.com/directory).
- Ask questions on [Stack Overflow](https://stackoverflow.com/questions/tagged/vaadin) or join our [Discord channel](https://discord.gg/MYFq5RTbBn).
- Report issues, create pull requests in [GitHub](https://github.com/vaadin).
