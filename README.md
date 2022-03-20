# infoteks-aqa-testjob
Инструкция  
  Для запуска автотестов:  
    1. Склонировать репозиторий  
    2. Открыть проект в Intellij Idea  
    3. Перейти в test/java/resources  
    4. Запустить любой из 3х xml (Suite - запускает все, AuthTest - только тесты по авторизации, BooksTest - только тесты по книгам)  
  Или прописать в терминале в директории проекта команду:  
   mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/AuthTests.xml  
     
  Для сборки отчета:  
  Воспользоваться инструкцией https://docs.qameta.io/allure/ по установке allure-commandline  
  В терминале в директории проекта прописать команду
  allure serve ./allure-result
