# Translation multi engines

Main developper : Maxime HAMM<br/>
_maxime.hamm@nimbly-consulting.com_

This is a library to allow you to translate texts using several "engines"

## The available engines

### Google Translate 
Use of simple HTTP query. So far no restrictions.<br/>Google can block requests in case of excessive use.

### DeepL
Free for developpers. 500 000 character limit / month.<br/>
Subscribe <a href='https://www.deepl.com/en/pro#developer'>here</a> and receive an API key !

## How to use it

Here is an example using Google Translate :

    IEngine engine = new GoogleEngineFree();
    Translation translation = engine.translate(
            engine.language("fr"), 
            engine.language("en"), 
            "Il fait beau aujourd'hui");
    System.out.println(translation.getTranslated());

Here is an example using DeepL :

    IEngine engine = new DeepLEngine();
    engine.setApiKey("644b8afa-9e3e-4b15-be23"-fa6cd9bf9822:fx")
    Translation translation = engine.translate(
            engine.language("fr"), 
            engine.language("en"), 
            "Il fait beau aujourd'hui");
    System.out.println(translation.getTranslated());

*You are welcome to join this project and add more translation engines!*
