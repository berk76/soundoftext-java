# soundoftext-java

A Java library for the [SoundOfText API](https://soundoftext.com/docs).

## How to build

Build with mvn:

```
mvn clean package
```

Library uses following dependency:

```xml
<dependency>
        <groupId>org.json</groupId>
        <artifactId>json</artifactId>
        <version>20131018</version>
</dependency>
```

## Usage

Here is an example of usage:

```java
try {
        Mp3Creator.createMp3("Hello World!", "en-GB", "c:\\hello_world.mp3");
} catch (Mp3CreatorException ex) {
        System.out.println("Error: Cannot download pronunciation.");
        ex.printStackTrace();
}
```

## FAQ

**What voices does this support?**

You can find a list of language codes in the [documentation for Sound of Text](https://soundoftext.com/docs#voices).  

You could also use another package of mine called [google-tts-langauges](https://github.com/ncpierson/google-tts-languages)
that is another JS library that exports all the language codes.
  