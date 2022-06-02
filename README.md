# Тестовое задание на позицию Junior Java Developer в Альфа-Банк

<h5>Автор - Ян Сидорович</h5>
<h6 >hh.ru - https://hh.ru/resume/4d180e8cff07234f830039ed1f367776593347</h6>
<h6>LinkedIn - https://by.linkedin.com/in/yan-sidorovich-820b68221</h6>
<h6>Telegram - @ysidorovich21</h6>
<h6>Email - yansidorovich@bk.ru</h6>
<h6>Дата: 02.06.2022</h6>

## Задача

Создать сервис, который обращается к сервису курсов валют, и отображает gif:
если курс по отношению к USD за сегодня стал выше вчерашнего, то отдаем рандомную отсюда https://giphy.com/search/rich
если ниже - отсюда https://giphy.com/search/broke
Ссылки:
 REST API курсов валют - https://docs.openexchangerates.org/
 REST API гифок - https://developers.giphy.com/docs/api#quick-start-guide
Must Have
 <li> Сервис на Spring Boot 2 + Java / Kotlin </li> 
 <li> Запросы приходят на HTTP endpoint (должен быть написан в соответствии с rest conventions), туда передается код валюты по отношению с которой сравнивается USD </li>
 <li> Для взаимодействия с внешними сервисами используется Feign </li>
 <li> Все параметры (валюта по отношению к которой смотрится курс, адреса внешних сервисов и т.д.) вынесены в настройки </li>
 <li> На сервис написаны тесты (для мока внешних сервисов можно использовать @mockbean или WireMock) </li>
 <li> Для сборки должен использоваться Gradle </li>
 <li> Результатом выполнения должен быть репо на GitHub с инструкцией по запуску </li>
 
## Запуск
