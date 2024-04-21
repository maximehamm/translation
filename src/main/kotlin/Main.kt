package io.nimbly.translator

import io.nimbly.translator.engine.IEngine
import io.nimbly.translator.engine.deepl.DeepLEngine
import io.nimbly.translator.engine.google.GoogleEngineFree

fun main() {

    // Google
    var engine: IEngine = GoogleEngineFree()
    var translation = engine.translate(
        sourceLanguage = engine.language("fr"),
        targetLanguage = engine.language("en"),
        textToTranslate = "Il fait beau aujourd'hui"
    )
    println(translation?.translated)

    // DeepL
    engine = DeepLEngine()
    engine.setApiKey(System.getProperty("DeeplToken"))

    translation = engine.translate(
        sourceLanguage = engine.language("fr"),
        targetLanguage = engine.language("de"),
        textToTranslate = "Je pense aller à la plage du coup !"
    )
    println(translation?.translated)
}