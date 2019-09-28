package valkyrie.lsp

//@Serializable
data class ResponseMessage<T>(
    val code: Int,
    val message: String,
    val data: T,
)