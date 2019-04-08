package main.page

// The abstract base for all the page
abstract class AbstractPage {

    // Abstract URL
    var baseUrl = System.getProperty("URL") ?: "https://distillery.com/"

    // Abstracts classes are for set up timeouts better than internal
    // The abstract base for page that take a few seconds to load.
    abstract class InstantPage: AbstractPage() {
        private val SHORT_TIMEOUT_SECONDS: Long = 1000
    }

    // The abstract base for page that take a lot of time to load.
    abstract class LoadedPage: AbstractPage() {
        private val LONG_TIMEOUT_SECONDS: Long = 5000

    }

    abstract fun navigate()

}
