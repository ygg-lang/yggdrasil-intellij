package valkyrie.lsp

import org.junit.Test
import java.net.URI
import java.net.http.HttpClient

class LanguageClient {
    companion object {
        val client: HttpClient = HttpClient.newHttpClient()
        var host: URI = URI.create("http://127.0.0.1:9600/");
        val language: String = "en"
        val libraryPath: String = "F:\\Python\\vk-intellij\\src\\design";

        inline fun <reified I, O> send(endpoint: String, input: I): O {
//            val httpRequest = HttpRequest.newBuilder()
//                .uri(host.addPathSuffix(endpoint))
//                .header("Content-Type", "application/json")
//                .POST(HttpRequest.BodyPublishers.ofString(Json.encodeToString(input)))
//                .build()
//            val response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString())
//            val body = Json.decodeFromString<ResponseMessage<O>>(response.body());
//            if (body.code != 200) {
//                throw Exception(body.message)
//            }
//            return body.data
            throw Exception()
        }

    }

    @Test
    fun startServer() {
        Runtime.getRuntime().exec("git status")
    }
}
