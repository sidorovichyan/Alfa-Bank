# Тестовое задание Junior Java Developer Alfa-Bank. Yan Sidorovich

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
