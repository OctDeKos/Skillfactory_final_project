# Общая структура проекта:

pages: Этот пакет содержит PageObject-модели для каждой страницы сайта. 
Каждая модель представляет отдельную страницу и содержит методы для взаимодействия с элементами на странице.

utils: В этом пакете вспомогательные классы, например, WebDriverFactory, который создает экземпляр веб-драйвера.

tests: Здесь находятся тесты, разделенные по страницам или функциональности.

resources: В этой директории хранятся дополнительные ресурсы, такие как драйверы для браузера и 
файлы с тестовыми данными (в случае необходимости).

# Описание тестовых сценариев:
 

CareerCenterPageTests: Проверка заголовка страницы. Проверки переходов на другие страницы. 4шт
ContactPageTests: Проверка заголовка страницы. Проверки переходов на другие страницы. 4шт
FreeEventsPageTests: Проверка заголовка страницы. Проверки переходов на другие страницы.4шт
HomePageTests: Проверка заголовка страницы. Проверки переходов на другие страницы.5шт
TestCoursePageTests: Проверка заголовка страницы. Проверки переходов на другие страницы.4шт

Общее количество: 21 автотест.


# Тестирование сайта онлайн-курсов по обучению в сфере IT

Данный репозиторий содержит автотесты для проверки функциональности сайта онлайн-курсов.

## Настройка проекта

1. Установите Java, JUnit и Maven на вашем компьютере.
2. Клонируйте данный репозиторий.
3. Откройте проект в вашей любимой интегрированной среде разработки (IDE).

P.S. Используйте Chrome 116 версии. 

## Запуск тестов

Для запуска автотестов используйте среду разработки IDEA. Выберите необходимый класс, к примеру HomePageTests.
Нажмите Ctrl + Shift + F10