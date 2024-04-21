package io.nimbly.translator.engine

data class Lang(val code: String, val name: String) {

    override fun toString(): String {
        return name
    }

    fun isAuto() = code == "auto"

    companion object {
        var DEFAULT = Lang("en", "English")
        var AUTO = Lang("auto", "Auto")
    }
}