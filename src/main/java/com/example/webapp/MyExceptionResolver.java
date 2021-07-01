package com.example.webapp;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//Один из способов обработки ошибок. Я так и не понял, как он работает и что с ним, вообще, делать. Но есть обработчик получше.

/*@Component
public class MyExceptionResolver extends AbstractHandlerExceptionResolver {
    @Override
    protected ModelAndView doResolveException(
            HttpServletRequest request,
            HttpServletResponse response,
            Object handler,
            Exception ex) {
        try {
            if (ex instanceof IllegalArgumentException) {
                return new ModelAndView("IllegalArgumentException. Мои поздравления, говнюк!");
            }
            else {
                return new ModelAndView("Ну и что ты наделал? Что это, вообще?");
            }
        } catch (Exception handlerException) {
            logger.warn("Handling of [" + ex.getClass().getName() + "]resulted in Exception", handlerException);
        }
        return null;
    }
}*/
