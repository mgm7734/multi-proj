package ecb

import pir.domain.GreetService

class HelloController {
    GreetService greetService

    def index() {
        render "I say:  ${greetService.greet()}"
    }
}
