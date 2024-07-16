package com.alura.forohubSpring.domain.topic;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull(message = "ID OBLIGATORIO")
        Long id,
        String titulo,
        String mensaje,
        String fecha,
        String status,
        String autor,
        String curso
) {
}
