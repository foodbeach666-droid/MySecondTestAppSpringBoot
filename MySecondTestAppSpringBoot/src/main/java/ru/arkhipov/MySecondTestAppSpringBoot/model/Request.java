package ru.arkhipov.MySecondTestAppSpringBoot.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.*;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @NotBlank(message = "uid не может быть пустым")
    @Size(max = 32, message = "uid не должен превышать 32 символа")
    private String uid;

    @NotBlank(message = "operationUid не может быть пустым")
    @Size(max = 32, message = "operationUid не должен превышать 32 символа")
    private String operationUid;

    private String systemName;
    @NotBlank(message = "systemTime не может быть пустым")
    private String systemTime;
    private String source;
    @Min(value = 1, message = "communicationId должен быть >= 1")
    @Max(value = 100000, message = "communicationId должен быть <= 100000")
    private int communicationId;

    private int templateId;
    private int productCode;
    private int smsCode;
}
