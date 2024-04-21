package io.nimbly.translator.engine

interface IEngine {

    val type: EEngine

    /**
     * Translate
     *
     * @param targetLanguage    the target language
     * @param sourceLanguage    the source language
     * @param textToTranslate the source translation
     * @return the string
     */
    fun translate(
        targetLanguage: Lang,
        sourceLanguage: Lang,
        textToTranslate: String): ITranslation?

    fun label(): String

    fun needApiKey() : Boolean

    fun setApiKey(key: String) { }

    fun documentation(): String

    fun languages(): Map<String, Lang>

    fun language(code: String): Lang
        = languages().get(code)!!
}

interface ITranslation {
    var translated: String
    val sourceLanguageIndentified: Lang
}