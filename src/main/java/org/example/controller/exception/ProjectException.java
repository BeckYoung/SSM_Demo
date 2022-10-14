package org.example.controller.exception;

import org.example.controller.ResponseResult;
import org.example.controller.StatusCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 使用Spring的异常处理
 */
@RestControllerAdvice
public class ProjectException {

    @ExceptionHandler(Exception.class)
    public ResponseResult doException(Exception ex){
        // 拦截到所有异常发生
        System.out.println("doException:" + ex);
        return new ResponseResult(StatusCode.CODE_UNKNOWN_ERR, null, "system busyness, please retry later");
    }
}
