package nexus.language.symbol


interface ContextProvider {
    fun resolveSymbols(symbols: List<ValkyrieSymbolTemplate>): List<ValkyrieSymbolTemplate>
}