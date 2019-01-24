package emailtest

class ValidController {

    def index() {

        sendMail {
            to "kapil@techcrumb.com"
            subject "This is a test mail"
            text "Hello, This is a test mail, how are you?"
        }
    }
}
