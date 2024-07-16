package com.alura.forohubSpring.domain.topic;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopico(
		@NotBlank(message = "ID OBLIGATORIO")
		String usuario,
		@NotBlank(message = "TITULO OBLIGATORIO")
		String titulo,
		@NotBlank(message = "MENSAJE OBLIGATORIO")
		String mensaje,
		@NotBlank(message = "FECHA OBLIGATORIO")
		String fecha,
		@NotBlank(message = "STATUS OBLIGATORIO")
		String status,
		@NotBlank(message = "AUTOR OBLIGATORIO")
		String autor,
		@NotBlank(message = "CURSO OBLIGATORIO")
		String curso
) {
}
