# Lesson-3
3. Selenide #1. Алексей Виноградов
1. Лайвкодинг - тесты для GitHub 
2. DOM для начинающих
3. Основные функции библиотеки Selenide (справочник-шпаргалка)

# Домашнее задание #1

1. Есть ли разница между $("h1 div"); и $("h1").$("div"); - может ли привести к тому что, поиск найдёт разные элементы?
Если может - приведите пример, когда.

2. Разработайте следующий автотест:

 - Откройте страницу Selenide в Github

 - Перейдите в раздел Wiki проекта

 - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions

 - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5



3. (опциональное) Запрограммируйте Drag&Drop с помощью Selenide.actions()

 - Откройте https://the-internet.herokuapp.com/drag_and_drop

 - Перенесите прямоугольник А на место В

 - Проверьте, что прямоугольники действительно поменялись

P.S. В Selenide есть команда $(element).dragAndDrop($(to-element)), проверьте работает ли тест, если использовать её вместо actions()

     https://github.com/AlexseyProhin/Lesson-3/tree/main/src/test/java/homework

(раньше не работала из-за ошибки в ChromeDriver, но может быть уже починили? :-)).

Если работает - сообщите в группе курса.
