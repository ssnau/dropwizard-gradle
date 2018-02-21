Dropwizard Gradle Template
-----

### run

```
./gradlew run
```

### deploy

```
./gradlew shadowJar
java -jar build/libs/app-1.0.0-all.jar server config.yml.example
```

notice: the name `app` is determined by `settings.gradle`.
