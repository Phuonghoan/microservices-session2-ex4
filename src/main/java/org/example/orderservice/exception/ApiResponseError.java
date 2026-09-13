package org.example.orderservice.exception;

import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiResponseError {

    private LocalDateTime timestamp;

    private int status;

    private String error;

    private String message;

}
