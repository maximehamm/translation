package io.nimbly.translator.engine

data class EEngine(val type: String)

object TranslationEngineFactory {

    private val engines = mutableSetOf<IEngine>();

    fun register(engine: IEngine)
        = engines.add(engine)

    fun engines()
        = engines

    fun engine(id: EEngine)
        = engines.find { it.type == id } ?: engines.first()
}

data class Translation(
    override var translated: String,
    override val sourceLanguageIndentified: Lang) : ITranslation

class TranslationException(msg: String) : Exception(msg)
