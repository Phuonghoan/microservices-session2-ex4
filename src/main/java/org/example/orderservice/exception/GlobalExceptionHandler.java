package org.example.orderservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(
            ResourceNotFoundException.class
    )
    public ResponseEntity<ApiResponseError>
    handleNotFound(
            ResourceNotFoundException ex
    ){

        ApiResponseError error =

                ApiResponseError.builder()

                        .timestamp(
                                LocalDateTime.now()
                        )

                        .status(
                                HttpStatus.NOT_FOUND.value()
                        )

                        .error(
                                "Not Found"
                        )

                        .message(
                                ex.getMessage()
                        )

                        .build();

        return ResponseEntity

                .status(
                        HttpStatus.NOT_FOUND
                )

                .body(error);

    }
}
